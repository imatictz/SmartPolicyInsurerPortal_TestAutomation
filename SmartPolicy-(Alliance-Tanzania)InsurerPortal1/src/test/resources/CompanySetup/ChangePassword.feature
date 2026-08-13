@All @Regression @PasswordValidation
Feature: Password Validation

  Background:
    When user navigate on setup dropdown menu
    When user navigate on company setup
    Then user click on password change option

  @MinLength
  Scenario: Verify password should be minimum 8 characters
    When user enter current password
    When user enter "Ab1@cd" as new password
    When user enter "Ab1@cd" as retype new password
    And user click on change button
    Then system should display error "Passworld should be of minimum 8 characters in length."

  @SpecialCharacter
  Scenario: Verify password must contain at least one special character
    When user enter current password
    When user enter "Abc12345" as new password
    When user enter "Abc12345" as retype new password
    And user click on change button
    Then system should display error "Password is required to have atleast one special character."

  @NumericAndAlphabet
  Scenario: Verify password must contain both numbers and characters
    When user enter current password
    When user enter "Abcdef@#" as new password
    When user enter "Abcdef@#" as retype new password
    And user click on change button
    Then system should display error "Password is required to have atleast one numeric character."

  @UpperLowerCase
  Scenario: Verify password must contain both uppercase and lowercase characters
    When user enter current password
    When user enter "abc123@#" as new password
    When user enter "abc123@#" as retype new password
    And user click on change button
    Then system should display error "Password should be a combination of both upper case and lower case characters."

  @NoUsername
  Scenario: Verify password should not contain username
    When user enter current password
    When user enter "Auto-1" as new password
    When user enter "Auto-1" as retype new password
    And user click on change button
    Then system should display error "Password should not contain username"

  @InvalidCurrentPassword
  Scenario: Verify error when user enters incorrect current password
    When user enter current password "Wrong@123"
    When user enter "abc123@#" as new password
    When user enter "abc123@#" as retype new password
    And user click on change button
    Then system should display error "2007-Your current password is wrong.,"
    
    @misMatchPassword
  Scenario: Verify error when user enters incorrect current password
    When user enter current password "Wrong@123"
    When user enter "abc123@#" as new password
    When user enter "abc123@" as retype new password
    And user click on change button
    Then system should display error "2005-Password Mis-match."
  