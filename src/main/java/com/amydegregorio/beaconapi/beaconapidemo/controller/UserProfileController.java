/**
 * 
 */
package com.amydegregorio.beaconapi.beaconapidemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amydegregorio.beaconapi.beaconapidemo.dto.UserProfileDto;

/**
 * Controller class for actions involving a user profile.
 * 
 * @author AMD
 */
@Controller
public class UserProfileController {

   /**
    * Shows a blank profile page.
    * 
    * @param dto
    * @param model
    * @return path to the entry template
    */
   @RequestMapping("/")
   public String showEmptyProfile(UserProfileDto dto, Model model) {
      return "userProfile/entry";
   }
   
   /**
    * Logs the "saved" profile and goes back to the profile page.
    * 
    * @param dto
    * @param model
    * @return path to the entry template
    */
   @RequestMapping(value="/save", method=RequestMethod.POST)
   public String save(UserProfileDto dto, Model model) {
      model.addAttribute("userProfileDto", dto);
      System.out.println("submitted: " + dto.toString());
      return "userProfile/entry";
   }
   
   /**
    * Exposes a collection of titles to populate a dropdown.
    * @return
    */
   @ModelAttribute("titles")
   public List<String> getTitles() {
      List<String> titles = new ArrayList<String>();
      titles.add("Mrs.");
      titles.add("Mr.");
      titles.add("Ms.");
      titles.add("Miss");
      titles.add("Dr.");
      
      return titles;
   }
}
