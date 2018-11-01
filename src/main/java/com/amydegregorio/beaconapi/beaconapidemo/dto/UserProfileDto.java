/**
 * 
 */
package com.amydegregorio.beaconapi.beaconapidemo.dto;

/**
 * Represents a user profile object.
 * 
 * @author AMD
 *
 */
public class UserProfileDto {
   private Long id;
   private String username;
   private String firstName;
   private String lastName;
   private String title;
   private String emailAddress;
   private String phoneNumber;
   private String aboutMe;
   
   /**
    * Gets id.
    * @return the id
    */
   public Long getId() {
      return id;
   }
   
   /**
    * Sets id.
    * @param id the id to set
    */
   public void setId(Long id) {
      this.id = id;
   }
   
   /**
    * Gets username.
    * @return the username
    */
   public String getUsername() {
      return username;
   }
   
   /**
    * Sets username.
    * @param username the username to set
    */
   public void setUsername(String username) {
      this.username = username;
   }
   
   /**
    * Gets firstName.
    * @return the firstName
    */
   public String getFirstName() {
      return firstName;
   }
   
   /**
    * Sets firstName.
    * @param firstName the firstName to set
    */
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   
   /**
    * Gets lastName.
    * @return the lastName
    */
   public String getLastName() {
      return lastName;
   }
   
   /**
    * Sets lastName.
    * @param lastName the lastName to set
    */
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   
   /**
    * Gets title.
    * @return the title
    */
   public String getTitle() {
      return title;
   }
   
   /**
    * Sets title.
    * @param title the title to set
    */
   public void setTitle(String title) {
      this.title = title;
   }
   
   /**
    * Gets emailAddress.
    * @return the emailAddress
    */
   public String getEmailAddress() {
      return emailAddress;
   }
   
   /**
    * Sets emailAddress.
    * @param emailAddress the emailAddress to set
    */
   public void setEmailAddress(String emailAddress) {
      this.emailAddress = emailAddress;
   }
   
   /**
    * Gets phoneNumber.
    * @return the phoneNumber
    */
   public String getPhoneNumber() {
      return phoneNumber;
   }
   
   /**
    * Sets phoneNumber.
    * @param phoneNumber the phoneNumber to set
    */
   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }
   
   /**
    * Gets aboutMe.
    * @return the aboutMe
    */
   public String getAboutMe() {
      return aboutMe;
   }
   
   /**
    * Sets aboutMe.
    * @param aboutMe the aboutMe to set
    */
   public void setAboutMe(String aboutMe) {
      this.aboutMe = aboutMe;
   }

   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString() {
      return "UserProfileDto [id=" + id + ", username=" + username + ", firstName=" + firstName + ", lastName="
               + lastName + ", title=" + title + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber
               + ", aboutMe=" + aboutMe + "]";
   }

}
