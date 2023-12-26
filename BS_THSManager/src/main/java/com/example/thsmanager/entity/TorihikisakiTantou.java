package com.example.thsmanager.entity;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class TorihikisakiTantou {
	@Override
	public String toString() {
	    return "TorihikisakiTantou{" +
	            "tantouId=" + tantouId +
	            ", torihikiId='" + torihikiId + '\'' +
	            ", firstName='" + firstName + '\'' +
	            '}';
	}
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column torihikisaki_tantou.TANTOU_ID
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    private Integer tantouId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column torihikisaki_tantou.TORIHIKI_ID
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    private Integer torihikiId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column torihikisaki_tantou.FIRST_NAME
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column torihikisaki_tantou.LAST_NAME
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    private String lastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column torihikisaki_tantou.SYOZOKU
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    private String syozoku;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column torihikisaki_tantou.YAKUSYOKU
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    private String yakusyoku;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column torihikisaki_tantou.MAIL
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    private String mail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column torihikisaki_tantou.TEL
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column torihikisaki_tantou.JIMU_MAIL
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    private Integer jimuMail;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column torihikisaki_tantou.TANTOU_ID
     *
     * @return the value of torihikisaki_tantou.TANTOU_ID
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public Integer getTantouId() {
        return tantouId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column torihikisaki_tantou.TANTOU_ID
     *
     * @param tantouId the value for torihikisaki_tantou.TANTOU_ID
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public void setTantouId(Integer tantouId) {
        this.tantouId = tantouId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column torihikisaki_tantou.TORIHIKI_ID
     *
     * @return the value of torihikisaki_tantou.TORIHIKI_ID
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public Integer getTorihikiId() {
        return torihikiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column torihikisaki_tantou.TORIHIKI_ID
     *
     * @param torihikiId the value for torihikisaki_tantou.TORIHIKI_ID
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public void setTorihikiId(Integer torihikiId) {
        this.torihikiId = torihikiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column torihikisaki_tantou.FIRST_NAME
     *
     * @return the value of torihikisaki_tantou.FIRST_NAME
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column torihikisaki_tantou.FIRST_NAME
     *
     * @param firstName the value for torihikisaki_tantou.FIRST_NAME
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column torihikisaki_tantou.LAST_NAME
     *
     * @return the value of torihikisaki_tantou.LAST_NAME
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column torihikisaki_tantou.LAST_NAME
     *
     * @param lastName the value for torihikisaki_tantou.LAST_NAME
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column torihikisaki_tantou.SYOZOKU
     *
     * @return the value of torihikisaki_tantou.SYOZOKU
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public String getSyozoku() {
        return syozoku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column torihikisaki_tantou.SYOZOKU
     *
     * @param syozoku the value for torihikisaki_tantou.SYOZOKU
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public void setSyozoku(String syozoku) {
        this.syozoku = syozoku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column torihikisaki_tantou.YAKUSYOKU
     *
     * @return the value of torihikisaki_tantou.YAKUSYOKU
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public String getYakusyoku() {
        return yakusyoku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column torihikisaki_tantou.YAKUSYOKU
     *
     * @param yakusyoku the value for torihikisaki_tantou.YAKUSYOKU
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public void setYakusyoku(String yakusyoku) {
        this.yakusyoku = yakusyoku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column torihikisaki_tantou.MAIL
     *
     * @return the value of torihikisaki_tantou.MAIL
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public String getMail() {
        return mail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column torihikisaki_tantou.MAIL
     *
     * @param mail the value for torihikisaki_tantou.MAIL
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column torihikisaki_tantou.TEL
     *
     * @return the value of torihikisaki_tantou.TEL
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column torihikisaki_tantou.TEL
     *
     * @param tel the value for torihikisaki_tantou.TEL
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column torihikisaki_tantou.JIMU_MAIL
     *
     * @return the value of torihikisaki_tantou.JIMU_MAIL
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public Integer getJimuMail() {
        return jimuMail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column torihikisaki_tantou.JIMU_MAIL
     *
     * @param jimuMail the value for torihikisaki_tantou.JIMU_MAIL
     *
     * @mbg.generated Tue Dec 26 11:49:01 KST 2023
     */
    public void setJimuMail(Integer jimuMail) {
        this.jimuMail = jimuMail;
    }
}