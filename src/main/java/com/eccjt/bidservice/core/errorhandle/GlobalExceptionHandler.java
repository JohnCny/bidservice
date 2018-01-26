package com.eccjt.bidservice.core.errorhandle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = BidErrorException.class)
    @ResponseBody
    public ErrorMessage<String> jsonErrorHandler(HttpServletRequest req, BidErrorException e) throws Exception {
        ErrorMessage<String> r = new ErrorMessage<>();
        r.setMessage(e.getMessage());
        r.setCode(ErrorMessage.FAILED);
        r.setData("Error");
        r.setUrl(req.getRequestURL().toString());
        return r;
    }
}
