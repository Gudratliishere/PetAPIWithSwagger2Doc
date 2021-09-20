package com.company.petapiwithswagger2doc.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "My Pet model", description = "This is model for pets")
public class Pet
{
    @ApiModelProperty("Unique Id for pets")
    private int Id;

    @ApiModelProperty("Name of pet")
    private String name;

    @ApiModelProperty("Age of pet")
    private int age;
}
