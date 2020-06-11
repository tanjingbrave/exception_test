package cn.mainfunc.test.exception;

import cn.mainfunc.test.model.JsonResult;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;


@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    private static final String logExceptionFormat = "Capture Exception By GlobalExceptionHandler: Code: %s Detail: %s";

    //运行时异常
    @ExceptionHandler(RuntimeException.class)
    public JSONObject runtimeExceptionHandler(RuntimeException ex) {
        return resultFormat(1, ex);
    }

    //空指针异常
    @ExceptionHandler(NullPointerException.class)
    public JSONObject nullPointerExceptionHandler(NullPointerException ex) {
        System.err.println("NullPointerException:");
        return resultFormat(2, ex);
    }

    //类型转换异常
    @ExceptionHandler(ClassCastException.class)
    public JSONObject classCastExceptionHandler(ClassCastException ex) {
        return resultFormat(3, ex);
    }

    //IO异常
    @ExceptionHandler(IOException.class)
    public JSONObject iOExceptionHandler(IOException ex) {
        return resultFormat(4, ex);
    }

    //未知方法异常
    @ExceptionHandler(NoSuchMethodException.class)
    public JSONObject noSuchMethodExceptionHandler(NoSuchMethodException ex) {
        return resultFormat(5, ex);
    }

    //数组越界异常
    @ExceptionHandler(IndexOutOfBoundsException.class)
    public JSONObject indexOutOfBoundsExceptionHandler(IndexOutOfBoundsException ex) {
        return resultFormat(6, ex);
    }

    //400错误
    @ExceptionHandler({HttpMessageNotReadableException.class})
    public JSONObject requestNotReadable(HttpMessageNotReadableException ex) {

        return resultFormat(7, ex);
    }

    //400错误
    @ExceptionHandler({TypeMismatchException.class})
    public JSONObject requestTypeMismatch(TypeMismatchException ex) {
        return resultFormat(8, ex);
    }

    //400错误
    @ExceptionHandler({MissingServletRequestParameterException.class})
    public JSONObject requestMissingServletRequest(MissingServletRequestParameterException ex) {
        return resultFormat(9, ex);
    }

    //405错误
    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    public JSONObject request405(HttpRequestMethodNotSupportedException ex) {
        return resultFormat(10, ex);
    }

    //406错误
    @ExceptionHandler({HttpMediaTypeNotAcceptableException.class})
    public JSONObject request406(HttpMediaTypeNotAcceptableException ex) {

        return resultFormat(11, ex);
    }

    //500错误
    @ExceptionHandler({ConversionNotSupportedException.class, HttpMessageNotWritableException.class})
    public JSONObject server500(RuntimeException ex) {
        return resultFormat(12, ex);
    }

    //栈溢出
    @ExceptionHandler({StackOverflowError.class})
    public JSONObject requestStackOverflow(StackOverflowError ex) {
        return resultFormat(13, ex);
    }

    //除数不能为0
    @ExceptionHandler({ArithmeticException.class})
    public JSONObject arithmeticException(ArithmeticException ex) {
        return resultFormat(13, ex);
    }

    //数据库重复
    @ExceptionHandler({ DuplicateKeyException.class})
    public JSONObject duplicateKeyException(DuplicateKeyException ex) {
        return resultFormat(18, ex);
    }

    //其他错误
    @ExceptionHandler({Exception.class})
    public JSONObject exception(Exception ex) {
        return resultFormat(14, ex);
    }

    private <T extends Throwable> JSONObject resultFormat(Integer code, T ex) {
        LOGGER.error(String.format(logExceptionFormat, code, ex.getMessage()));
        return JsonResult.failed(code, ex.getCause().toString());
    }

}

