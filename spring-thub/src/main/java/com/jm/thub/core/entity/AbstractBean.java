package com.jm.thub.core.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

public abstract class AbstractBean implements Serializable, Cloneable  {

    /**
     * 序列化的时候的版本号码
     */
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)//MyBatis plus默认为雪花算法,ID改为数据库自增
    private Long id;

    /**
     * 创建人名称
     */
    private String crna;

    /**
     * 创建人编码
     */
    private String crco;

    /**
     * 创建时间
     */
    private Long crdt;

    /**
     * 最后一次修改人
     */
    private String upna;

    /**
     * 修改人编码
     */
    private String upco;

    /**
     * 最后一次修改时间
     */
    private Long updt;

    /**
     * 备注
     */
    private String rema;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCrna() {
        return crna;
    }

    public void setCrna(String crna) {
        this.crna = crna;
    }

    public String getCrco() {
        return crco;
    }

    public void setCrco(String crco) {
        this.crco = crco;
    }

    public Long getCrdt() {
        return crdt;
    }

    public void setCrdt(Long crdt) {
        this.crdt = crdt;
    }

    public String getUpna() {
        return upna;
    }

    public void setUpna(String upna) {
        this.upna = upna;
    }

    public String getUpco() {
        return upco;
    }

    public void setUpco(String upco) {
        this.upco = upco;
    }

    public Long getUpdt() {
        return updt;
    }

    public void setUpdt(Long updt) {
        this.updt = updt;
    }

    public String getRema() {
        return rema;
    }

    public void setRema(String rema) {
        this.rema = rema;
    }
}
