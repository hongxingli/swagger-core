package models.composition;

import com.wordnik.swagger.annotations.ApiModel;

@ApiModel(description = "I am an Abstract Base Model without any declared fields and with Sub-Types",
             subTypes = {Thing3.class})
public abstract class AbstractBaseModelWithoutFields {
}
