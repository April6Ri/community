package life.majiang.community.dto;

import lombok.Data;

/**
 * created by codedrinker on 2019/8/28
 */

@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
