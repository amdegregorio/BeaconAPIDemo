/**
 * 
 */
package com.amydegregorio.beaconapi.beaconapidemo.dto;

/**
 * Represents Info Beacon data.
 * 
 * @author AMD
 */
public class BeaconDto {
   private String browser;
   private String os;
   private String lang;
   private String time;
   private String action;
   
   /**
    * Gets browser.
    * @return the browser
    */
   public String getBrowser() {
      return browser;
   }
   
   /**
    * Sets browser.
    * @param browser the browser to set
    */
   public void setBrowser(String browser) {
      this.browser = browser;
   }
   
   /**
    * Gets os.
    * @return the os
    */
   public String getOs() {
      return os;
   }
   
   /**
    * Sets os.
    * @param os the os to set
    */
   public void setOs(String os) {
      this.os = os;
   }
   
   /**
    * Gets lang.
    * @return the lang
    */
   public String getLang() {
      return lang;
   }
   
   /**
    * Sets lang.
    * @param lang the lang to set
    */
   public void setLang(String lang) {
      this.lang = lang;
   }
   
   /**
    * Gets time.
    * @return the time
    */
   public String getTime() {
      return time;
   }
   
   /**
    * Sets time.
    * @param time the time to set
    */
   public void setTime(String time) {
      this.time = time;
   }
   
   /**
    * Gets action.
    * @return the action
    */
   public String getAction() {
      return action;
   }
   
   /**
    * Sets action.
    * @param action the action to set
    */
   public void setAction(String action) {
      this.action = action;
   }

   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString() {
      return "BeaconDto [browser=" + browser + ", os=" + os + ", lang=" + lang + ", time=" + time + ", action=" + action
               + "]";
   }
}
