package com.gq.ged.account.controller.res.v2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;

/**
 * Created by zhaozb on 2018/3/19.
 */
@ApiModel
@JsonIgnoreProperties(ignoreUnknown = true)
public class CapitalResForm implements Serializable {
  private String mchn;// 系统代码（子商户）
  private String seq_no;// 交易流水号(商户唯一标识)
  private String trade_type;// 交易类型
  private String data;// 数据域
  private String resp_code;// 返回码
  private String resp_msg;// 返回消息内容
  private String signature;// 签名


  public String getMchn() {
    return mchn;
  }

  public void setMchn(String mchn) {
    this.mchn = mchn;
  }

  public String getSeq_no() {
    return seq_no;
  }

  public void setSeq_no(String seq_no) {
    this.seq_no = seq_no;
  }

  public String getTrade_type() {
    return trade_type;
  }

  public void setTrade_type(String trade_type) {
    this.trade_type = trade_type;
  }


  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getResp_code() {
    return resp_code;
  }

  public void setResp_code(String resp_code) {
    this.resp_code = resp_code;
  }

  public String getResp_msg() {
    return resp_msg;
  }

  public void setResp_msg(String resp_msg) {
    this.resp_msg = resp_msg;
  }

  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

    public CapitalResForm(String mchn, String seq_no, String trade_type, String data, String resp_code, String resp_msg, String signature) {
        this.mchn = mchn;
        this.seq_no = seq_no;
        this.trade_type = trade_type;
        this.data = data;
        this.resp_code = resp_code;
        this.resp_msg = resp_msg;
        this.signature = signature;
    }

  public CapitalResForm() {
  }
}
