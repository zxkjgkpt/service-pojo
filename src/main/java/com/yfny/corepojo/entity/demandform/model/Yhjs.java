package com.yfny.corepojo.entity.demandform.model;

public class Yhjs {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NWIDP.IMP_XQD_YHJS.INFOID
     *
     * @mbggenerated
     */
    private String infoid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NWIDP.IMP_XQD_YHJS.YHBS
     *
     * @mbggenerated
     */
    private String yhbs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NWIDP.IMP_XQD_YHJS.JSBS
     *
     * @mbggenerated
     */
    private String jsbs;

    public Yhjs(String infoid, String yhbs, String jsbs) {
        this.infoid = infoid;
        this.yhbs = yhbs;
        this.jsbs = jsbs;
    }

    public Yhjs() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NWIDP.IMP_XQD_YHJS.INFOID
     *
     * @return the value of NWIDP.IMP_XQD_YHJS.INFOID
     *
     * @mbggenerated
     */
    public String getInfoid() {
        return infoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NWIDP.IMP_XQD_YHJS.INFOID
     *
     * @param infoid the value for NWIDP.IMP_XQD_YHJS.INFOID
     *
     * @mbggenerated
     */
    public void setInfoid(String infoid) {
        this.infoid = infoid == null ? null : infoid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NWIDP.IMP_XQD_YHJS.YHBS
     *
     * @return the value of NWIDP.IMP_XQD_YHJS.YHBS
     *
     * @mbggenerated
     */
    public String getYhbs() {
        return yhbs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NWIDP.IMP_XQD_YHJS.YHBS
     *
     * @param yhbs the value for NWIDP.IMP_XQD_YHJS.YHBS
     *
     * @mbggenerated
     */
    public void setYhbs(String yhbs) {
        this.yhbs = yhbs == null ? null : yhbs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NWIDP.IMP_XQD_YHJS.JSBS
     *
     * @return the value of NWIDP.IMP_XQD_YHJS.JSBS
     *
     * @mbggenerated
     */
    public String getJsbs() {
        return jsbs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NWIDP.IMP_XQD_YHJS.JSBS
     *
     * @param jsbs the value for NWIDP.IMP_XQD_YHJS.JSBS
     *
     * @mbggenerated
     */
    public void setJsbs(String jsbs) {
        this.jsbs = jsbs == null ? null : jsbs.trim();
    }
}