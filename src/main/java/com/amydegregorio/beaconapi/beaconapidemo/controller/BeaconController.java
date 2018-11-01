/**
 * 
 */
package com.amydegregorio.beaconapi.beaconapidemo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amydegregorio.beaconapi.beaconapidemo.dto.BeaconDto;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Controller for receiving information from the browser's Beacon API calls.
 * 
 * @author AMD
 */
@RestController
@RequestMapping("/beacon")
public class BeaconController {

   /**
    * Receives a simple beacon sent with a data query string parameter.
    * @param data a line of text
    * @return an empty string, since a beacon is never expecting to get anything back.
    */
   @RequestMapping(value = "/", method=RequestMethod.POST)
   public String receiveSimpleBeacon(@RequestParam("data") String data) {
      System.out.println("-- Incoming Simple Beacon --");
      System.out.println("      Data: " + data);
      return "";
   }
   
   /**
    * Receives a more elaborate beacon, with a JSON string in the body.
    * Parses the string into a dto and displays it.
    * 
    * @param request the incoming request
    * @return an empty string, since a beacon is never expecting to get anything back.
    */
   @RequestMapping(value= "/info", method=RequestMethod.POST)
   public String receiveInfoBeacon(HttpServletRequest request) {
      String line = null;
      ObjectMapper objectMapper = new ObjectMapper();      
      
      {
         try {
            line = request.getReader().readLine();
            if (line != null) {
               //Once we have a line, use Jackson to convert the JSON string to an object
               BeaconDto beacon = objectMapper.readValue(line, BeaconDto.class);
               System.out.println("-- Incoming Beacon --");
               System.out.println("      Browser: " + beacon.getBrowser());
               System.out.println("      OS: " + beacon.getOs());
               System.out.println("      Language: " + beacon.getLang());
               System.out.println("      Time: " + beacon.getTime());
               System.out.println("      Action: " + beacon.getAction());
            }
         } catch (IOException e) {
            e.printStackTrace();
         }
      } while (line !=null);
      return "";
   }
}
