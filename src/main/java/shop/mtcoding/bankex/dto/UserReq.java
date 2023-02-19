package shop.mtcoding.bankex.dto;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.bankex.model.user.User;

public class UserReq {

    @Setter
    @Getter
    public class JoinReqDto {
        private String username;
        private String password;
        private String fullname;

        public User toModel() {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setFullname(fullname);
            return user;
        }
    }

    @Setter
    @Getter
    public class LoginReqDto {
        private String username;
        private String password;
        private String fullname;
    }

}
