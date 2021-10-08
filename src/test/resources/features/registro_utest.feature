# Autor: Jonathan Rios Gómez
Feature: Enter Utest.com

  @Scenario1
  Scenario Outline: Create a new user
    Given A user enters utest.com
    When Fill out the registration form
    | first_name   | last_name   | email   | month   | day   | year   | city   | postal_code   | country   | computer   | version   | language   | mobile   | model   | operating_system   | password   | confirm_password   |
    | <first_name> | <last_name> | <email> | <month> | <day> | <year> | <city> | <postal_code> | <country> | <computer> | <version> | <language> | <mobile> | <model> | <operating_system> | <password> | <confirm_password> |
    Then User is created successfully
      | mensaje_registro    |
      | <mensaje_registro>  |
    Examples:
      | first_name   | last_name   | email                | month     | day   | year   | city     | postal_code   | country   | computer   | version    | language   | mobile   | model    | operating_system   | password      | confirm_password   | mensaje_registro                                                        |
      | Candidato    | Correa      | usuario0@hotmail.com | September | 20    | 1990   | Medellín | 05660         | Colombia  | Windows    | 10         | Spanish    | Apple    | iPhone 4 | iOS 6.1            | Kmzwayw1aalol | Kmzwayw1aalol      | Welcome to the world's largest community of freelance software testers! |