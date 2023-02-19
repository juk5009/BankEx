package shop.mtcoding.bankex.dto;

import lombok.Getter;
import lombok.Setter;

public class UserReq {

    @Setter
    @Getter
    public class LoginReqDto {
        private String username;
        private String password;
        private String fullname;
    }

    @Setter
    @Getter
    public class JoinReqDto {
        private String username;
        private String password;
        private String fullname;
    }

}
