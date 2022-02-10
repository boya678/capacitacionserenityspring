Feature: as a user i want an api to create customer

  @test1
  Scenario: create customer
    Then the user should see the same data in db
      | id | nombre  | apellido  | direccion            | telefono   |
      | 1  | Eduardo | [Blank] | Avenida siempre viva | 3224920775 |

  @test2
  Scenario: insert customer
    When the user insert the data in db
      | id | nombre | apellido | direccion     | telefono  |
      | 2  | Pedro  | Velez    | Avenida  viva | 324920775 |
      | 3  | Oscar  | Babysor  | siempre viva  | 322492075 |
