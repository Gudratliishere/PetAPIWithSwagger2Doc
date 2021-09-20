package com.company.petapiwithswagger2doc.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO
{
    private String successMessage;
    private String errorMessage;
    private Integer errorCode;
    private Object object;

    public static ResponseDTO of (Object object, String successMessage)
    {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setObject(object);
        responseDTO.setSuccessMessage(successMessage);
        return responseDTO;
    }

    public static ResponseDTO of (Object object, String errorMessage, Integer errorCode)
    {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setObject(object);
        responseDTO.setErrorMessage(errorMessage);
        responseDTO.setErrorCode(errorCode);
        return responseDTO;
    }
}
