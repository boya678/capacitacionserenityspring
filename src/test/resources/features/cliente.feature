Feature: as a user i want an api to create customer

  Scenario: create customer
    Then the user should see the same data in db
      | id | nombre  | apellido  | direccion            | telefono   |
      | 1  | Eduardo | Benavides | Avenida siempre viva | 3224920775 |
