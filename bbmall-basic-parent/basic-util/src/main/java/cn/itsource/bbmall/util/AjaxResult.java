package cn.itsource.bbmall.util;

/**
 * @author yh
 * @version V1.0
 * @className AjaxResult
 * @date 2019/5/12
 */

public class AjaxResult {
    private boolean success = true;
    private String message;


    public boolean isSuccess() {
        return success;
    }


    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public static AjaxResult me(){
        return new AjaxResult();
    }


}
