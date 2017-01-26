package com.common.response;

import java.io.Serializable;

/**
 * Created by liyanjie on 2017/1/25.
 */
public class ProductResponseModel implements Serializable {

    private static final long serialVersionUID = 2192111172964979851L;
    private String req_sn;

    public String getReq_sn() {
        return req_sn;
    }

    public void setReq_sn(String req_sn) {
        this.req_sn = req_sn;
    }
}
