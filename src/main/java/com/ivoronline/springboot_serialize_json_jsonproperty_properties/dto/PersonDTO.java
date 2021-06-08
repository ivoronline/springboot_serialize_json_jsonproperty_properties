package com.ivoronline.springboot_serialize_json_jsonproperty_properties.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonDTO {

  //PROPERTIES
  @JsonProperty("ID"         ) public Integer id;     //Uppercase ID
  @JsonProperty("Person Name") public String  name;   //Completely different name (and with space)
  @JsonProperty("Age"        ) public Integer age;    //Uppercase A

}
