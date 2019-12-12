package yt.lan.commons.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class ResponseDto<T> implements Serializable {

    private boolean success;
    private String reason;
    private T data;

    public static <T> ResponseDto<T> ok(T data) {
        ResponseDto<T> responseDto = new ResponseDto<>();
        responseDto.setData(data);
        responseDto.setSuccess(true);

        return responseDto;
    }

    public static ResponseDto error(String error) {
        ResponseDto responseDto = new ResponseDto<>();
        responseDto.setSuccess(false);
        responseDto.setReason(error);

        return responseDto;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
            "success=" + success +
            ", reason='" + reason + '\'' +
            ", data=" + data +
            '}';
    }
}
