// Generated with g9.

package com.th.DkmsBrowser.dataObjects;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Version;

@Entity(name="TSSUKDS2")
public class Tssukds2 implements Serializable {

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Column(name="KMG_KEY_LABEL_1", nullable=false, length=255)
    private String kmgKeyLabel1;
    @Column(name="KMG_KEY_LABEL_2", nullable=false, length=255)
    private String kmgKeyLabel2;
    @Column(name="KMG_KEY_LABEL_3", nullable=false, length=255)
    private String kmgKeyLabel3;
    @Column(name="KMG_KEY_LABEL_4", nullable=false, length=255)
    private String kmgKeyLabel4;
    @Column(name="KMG_KEY_LABEL_5", nullable=false, length=255)
    private String kmgKeyLabel5;
    @Column(name="KMG_HASHED_KEY_ID", nullable=false, length=255)
    private String kmgHashedKeyId;
    @Column(name="KMG_RECORD_TYPE", length=255)
    private String kmgRecordType;
    @Column(name="KMG_UPDATE_DATE", nullable=false, length=10)
    private String kmgUpdateDate;
    @Column(name="KMG_UPDATE_TIME", nullable=false, length=16)
    private String kmgUpdateTime;
    @Column(name="KMG_CREATE_DATE", nullable=false, length=10)
    private String kmgCreateDate;
    @Column(name="KMG_CREATE_TIME", nullable=false, length=16)
    private String kmgCreateTime;
    @Column(name="KMG_DELETE_DATE", nullable=false, length=10)
    private String kmgDeleteDate;
    @Column(name="KMG_DELETE_TIME", nullable=false, length=16)
    private String kmgDeleteTime;
    @Column(name="KMG_KEY_TYPE", nullable=false, length=255)
    private String kmgKeyType;
    @Column(name="KMG_KEY_STATUS", nullable=false, length=255)
    private String kmgKeyStatus;
    @Column(name="KMG_KEK_LABEL", nullable=false, length=255)
    private String kmgKekLabel;
    @Column(name="KMG_ACTIVE_DATE", nullable=false, length=10)
    private String kmgActiveDate;
    @Column(name="KMG_SHORTKEY_IDENT", nullable=false, length=255)
    private String kmgShortkeyIdent;
    @Column(name="KMG_KEY_SEQ_NO", nullable=false, length=255)
    private String kmgKeySeqNo;
    @Column(name="KMG_KEYTEST_USED", nullable=false, length=255)
    private String kmgKeytestUsed;
    @Column(name="KMG_APPL_NAME_USED", nullable=false, length=255)
    private String kmgApplNameUsed;
    @Column(name="KMG_APPL_NAME", nullable=false, length=255)
    private String kmgApplName;
    @Column(name="KMG_NSP_NAME_COUNT", nullable=false, precision=5)
    private short kmgNspNameCount;
    @Column(name="KMG_NSP_NAME_LIST", nullable=false, length=255)
    private String kmgNspNameList;
    @Column(name="KMG_LAST_USER_ID", nullable=false, length=255)
    private String kmgLastUserId;
    @Column(name="KMG_VIDATA", nullable=false, length=255)
    private String kmgVidata;
    @Column(name="KMG_COMMENT", nullable=false, length=255)
    private String kmgComment;
    @Column(name="KMG_DEACTDATE", nullable=false, length=10)
    private String kmgDeactdate;
    @Column(name="KMG_KNO", nullable=false, length=255)
    private String kmgKno;
    @Column(name="KMG_KNO_VER", nullable=false, length=255)
    private String kmgKnoVer;
    @Column(name="KMG_ORIGIN", nullable=false, length=255)
    private String kmgOrigin;
    @Column(name="KMG_ORIGINGROUP", nullable=false, length=255)
    private String kmgOrigingroup;
    @Column(name="KMG_GROUPS", nullable=false, length=255)
    private String kmgGroups;
    @Column(name="KMG_TERM_KEY", nullable=false, length=255)
    private String kmgTermKey;
    @Column(name="KMG_TERM_NO", nullable=false, length=255)
    private String kmgTermNo;
    @Column(name="KMG_TERM_TYPE", nullable=false, length=255)
    private String kmgTermType;
    @Column(name="KMG_TERM_VERS", nullable=false, length=255)
    private String kmgTermVers;
    @Column(name="KMG_TMK_SEQ_NO", nullable=false, length=255)
    private String kmgTmkSeqNo;
    @Column(name="KMG_KEK_SEQ_NO", nullable=false, length=255)
    private String kmgKekSeqNo;
    @Column(name="KMG_SES_SEQ_NO", nullable=false, length=255)
    private String kmgSesSeqNo;
    @Column(name="KMG_EXT_STATUS", nullable=false, length=255)
    private String kmgExtStatus;
    @Column(name="KMG_EXT_DATE", nullable=false, length=10)
    private String kmgExtDate;
    @Column(name="KMG_EXT_TIME", nullable=false, length=16)
    private String kmgExtTime;
    @Column(name="KMG_EXT_USERID", nullable=false, length=255)
    private String kmgExtUserid;
    @Column(name="KMG_CKDS_USE", nullable=false, length=255)
    private String kmgCkdsUse;
    @Column(name="KMG_CKDS_LAB", nullable=false, length=255)
    private String kmgCkdsLab;
    @Column(name="KMG_USER_APPL", nullable=false, length=255)
    private String kmgUserAppl;
    @Column(name="KMG_INST_ID", nullable=false, length=255)
    private String kmgInstId;
    @Column(name="KMG_COUNTRY", nullable=false, length=255)
    private String kmgCountry;
    @Column(name="KMG_KEY_SEQNO", nullable=false, length=255)
    private String kmgKeySeqno;
    @Column(name="KMG_EXTKEYLAB", nullable=false, length=255)
    private String kmgExtkeylab;
    @Column(name="KMG_EXTKEKLAB", nullable=false, length=255)
    private String kmgExtkeklab;
    @Column(name="KMG_PKCSAPPL", nullable=false, length=255)
    private String kmgPkcsappl;
    @Column(name="KMG_PKCSID", nullable=false, length=255)
    private String kmgPkcsid;
    @Column(name="KMG_CUDATA_TP", nullable=false, length=255)
    private String kmgCudataTp;
    @Column(name="ID", nullable=false, length=255)
    private int id;
    
    /** Default constructor. */
    public Tssukds2() {
        super();
    }

    /**
     * Access method for kmgKeyLabel1.
     *
     * @return the current value of kmgKeyLabel1
     */
    public String getkmgKeyLabel1() {
        return kmgKeyLabel1;
    }

    /**
     * Setter method for kmgKeyLabel1.
     *
     * @param akmgKeyLabel1 the new value for kmgKeyLabel1
     */
    public void setkmgKeyLabel1(String akmgKeyLabel1) {
        kmgKeyLabel1 = akmgKeyLabel1;
    }

    /**
     * Access method for kmgKeyLabel2.
     *
     * @return the current value of kmgKeyLabel2
     */
    public String getkmgKeyLabel2() {
        return kmgKeyLabel2;
    }

    /**
     * Setter method for kmgKeyLabel2.
     *
     * @param akmgKeyLabel2 the new value for kmgKeyLabel2
     */
    public void setkmgKeyLabel2(String akmgKeyLabel2) {
        kmgKeyLabel2 = akmgKeyLabel2;
    }

    /**
     * Access method for kmgKeyLabel3.
     *
     * @return the current value of kmgKeyLabel3
     */
    public String getkmgKeyLabel3() {
        return kmgKeyLabel3;
    }

    /**
     * Setter method for kmgKeyLabel3.
     *
     * @param akmgKeyLabel3 the new value for kmgKeyLabel3
     */
    public void setkmgKeyLabel3(String akmgKeyLabel3) {
        kmgKeyLabel3 = akmgKeyLabel3;
    }

    /**
     * Access method for kmgKeyLabel4.
     *
     * @return the current value of kmgKeyLabel4
     */
    public String getkmgKeyLabel4() {
        return kmgKeyLabel4;
    }

    /**
     * Setter method for kmgKeyLabel4.
     *
     * @param akmgKeyLabel4 the new value for kmgKeyLabel4
     */
    public void setkmgKeyLabel4(String akmgKeyLabel4) {
        kmgKeyLabel4 = akmgKeyLabel4;
    }

    /**
     * Access method for kmgKeyLabel5.
     *
     * @return the current value of kmgKeyLabel5
     */
    public String getkmgKeyLabel5() {
        return kmgKeyLabel5;
    }

    /**
     * Setter method for kmgKeyLabel5.
     *
     * @param akmgKeyLabel5 the new value for kmgKeyLabel5
     */
    public void setkmgKeyLabel5(String akmgKeyLabel5) {
        kmgKeyLabel5 = akmgKeyLabel5;
    }

    /**
     * Access method for kmgHashedKeyId.
     *
     * @return the current value of kmgHashedKeyId
     */
    public String getkmgHashedKeyId() {
        return kmgHashedKeyId;
    }

    /**
     * Setter method for kmgHashedKeyId.
     *
     * @param akmgHashedKeyId the new value for kmgHashedKeyId
     */
    public void setkmgHashedKeyId(String akmgHashedKeyId) {
        kmgHashedKeyId = akmgHashedKeyId;
    }

    /**
     * Access method for kmgRecordType.
     *
     * @return the current value of kmgRecordType
     */
    public String getkmgRecordType() {
        return kmgRecordType;
    }

    /**
     * Setter method for kmgRecordType.
     *
     * @param akmgRecordType the new value for kmgRecordType
     */
    public void setkmgRecordType(String akmgRecordType) {
        kmgRecordType = akmgRecordType;
    }

    /**
     * Access method for kmgUpdateDate.
     *
     * @return the current value of kmgUpdateDate
     */
    public String getkmgUpdateDate() {
        return kmgUpdateDate;
    }

    /**
     * Setter method for kmgUpdateDate.
     *
     * @param akmgUpdateDate the new value for kmgUpdateDate
     */
    public void setkmgUpdateDate(String akmgUpdateDate) {
        kmgUpdateDate = akmgUpdateDate;
    }

    /**
     * Access method for kmgUpdateTime.
     *
     * @return the current value of kmgUpdateTime
     */
    public String getkmgUpdateTime() {
        return kmgUpdateTime;
    }

    /**
     * Setter method for kmgUpdateTime.
     *
     * @param akmgUpdateTime the new value for kmgUpdateTime
     */
    public void setkmgUpdateTime(String akmgUpdateTime) {
        kmgUpdateTime = akmgUpdateTime;
    }

    /**
     * Access method for kmgCreateDate.
     *
     * @return the current value of kmgCreateDate
     */
    public String getkmgCreateDate() {
        return kmgCreateDate;
    }

    /**
     * Setter method for kmgCreateDate.
     *
     * @param akmgCreateDate the new value for kmgCreateDate
     */
    public void setkmgCreateDate(String akmgCreateDate) {
        kmgCreateDate = akmgCreateDate;
    }

    /**
     * Access method for kmgCreateTime.
     *
     * @return the current value of kmgCreateTime
     */
    public String getkmgCreateTime() {
        return kmgCreateTime;
    }

    /**
     * Setter method for kmgCreateTime.
     *
     * @param akmgCreateTime the new value for kmgCreateTime
     */
    public void setkmgCreateTime(String akmgCreateTime) {
        kmgCreateTime = akmgCreateTime;
    }

    /**
     * Access method for kmgDeleteDate.
     *
     * @return the current value of kmgDeleteDate
     */
    public String getkmgDeleteDate() {
        return kmgDeleteDate;
    }

    /**
     * Setter method for kmgDeleteDate.
     *
     * @param akmgDeleteDate the new value for kmgDeleteDate
     */
    public void setkmgDeleteDate(String akmgDeleteDate) {
        kmgDeleteDate = akmgDeleteDate;
    }

    /**
     * Access method for kmgDeleteTime.
     *
     * @return the current value of kmgDeleteTime
     */
    public String getkmgDeleteTime() {
        return kmgDeleteTime;
    }

    /**
     * Setter method for kmgDeleteTime.
     *
     * @param akmgDeleteTime the new value for kmgDeleteTime
     */
    public void setkmgDeleteTime(String akmgDeleteTime) {
        kmgDeleteTime = akmgDeleteTime;
    }

    /**
     * Access method for kmgKeyType.
     *
     * @return the current value of kmgKeyType
     */
    public String getkmgKeyType() {
        return kmgKeyType;
    }

    /**
     * Setter method for kmgKeyType.
     *
     * @param akmgKeyType the new value for kmgKeyType
     */
    public void setkmgKeyType(String akmgKeyType) {
        kmgKeyType = akmgKeyType;
    }

    /**
     * Access method for kmgKeyStatus.
     *
     * @return the current value of kmgKeyStatus
     */
    public String getkmgKeyStatus() {
        return kmgKeyStatus;
    }

    /**
     * Setter method for kmgKeyStatus.
     *
     * @param akmgKeyStatus the new value for kmgKeyStatus
     */
    public void setkmgKeyStatus(String akmgKeyStatus) {
        kmgKeyStatus = akmgKeyStatus;
    }

    /**
     * Access method for kmgKekLabel.
     *
     * @return the current value of kmgKekLabel
     */
    public String getkmgKekLabel() {
        return kmgKekLabel;
    }

    /**
     * Setter method for kmgKekLabel.
     *
     * @param akmgKekLabel the new value for kmgKekLabel
     */
    public void setkmgKekLabel(String akmgKekLabel) {
        kmgKekLabel = akmgKekLabel;
    }

    /**
     * Access method for kmgActiveDate.
     *
     * @return the current value of kmgActiveDate
     */
    public String getkmgActiveDate() {
        return kmgActiveDate;
    }

    /**
     * Setter method for kmgActiveDate.
     *
     * @param akmgActiveDate the new value for kmgActiveDate
     */
    public void setkmgActiveDate(String akmgActiveDate) {
        kmgActiveDate = akmgActiveDate;
    }

    /**
     * Access method for kmgShortkeyIdent.
     *
     * @return the current value of kmgShortkeyIdent
     */
    public String getkmgShortkeyIdent() {
        return kmgShortkeyIdent;
    }

    /**
     * Setter method for kmgShortkeyIdent.
     *
     * @param akmgShortkeyIdent the new value for kmgShortkeyIdent
     */
    public void setkmgShortkeyIdent(String akmgShortkeyIdent) {
        kmgShortkeyIdent = akmgShortkeyIdent;
    }

    /**
     * Access method for kmgKeySeqNo.
     *
     * @return the current value of kmgKeySeqNo
     */
    public String getkmgKeySeqNo() {
        return kmgKeySeqNo;
    }

    /**
     * Setter method for kmgKeySeqNo.
     *
     * @param akmgKeySeqNo the new value for kmgKeySeqNo
     */
    public void setkmgKeySeqNo(String akmgKeySeqNo) {
        kmgKeySeqNo = akmgKeySeqNo;
    }

    /**
     * Access method for kmgKeytestUsed.
     *
     * @return the current value of kmgKeytestUsed
     */
    public String getkmgKeytestUsed() {
        return kmgKeytestUsed;
    }

    /**
     * Setter method for kmgKeytestUsed.
     *
     * @param akmgKeytestUsed the new value for kmgKeytestUsed
     */
    public void setkmgKeytestUsed(String akmgKeytestUsed) {
        kmgKeytestUsed = akmgKeytestUsed;
    }

    /**
     * Access method for kmgApplNameUsed.
     *
     * @return the current value of kmgApplNameUsed
     */
    public String getkmgApplNameUsed() {
        return kmgApplNameUsed;
    }

    /**
     * Setter method for kmgApplNameUsed.
     *
     * @param akmgApplNameUsed the new value for kmgApplNameUsed
     */
    public void setkmgApplNameUsed(String akmgApplNameUsed) {
        kmgApplNameUsed = akmgApplNameUsed;
    }

    /**
     * Access method for kmgApplName.
     *
     * @return the current value of kmgApplName
     */
    public String getkmgApplName() {
        return kmgApplName;
    }

    /**
     * Setter method for kmgApplName.
     *
     * @param akmgApplName the new value for kmgApplName
     */
    public void setkmgApplName(String akmgApplName) {
        kmgApplName = akmgApplName;
    }

    /**
     * Access method for kmgNspNameCount.
     *
     * @return the current value of kmgNspNameCount
     */
    public short getkmgNspNameCount() {
        return kmgNspNameCount;
    }

    /**
     * Setter method for kmgNspNameCount.
     *
     * @param akmgNspNameCount the new value for kmgNspNameCount
     */
    public void setkmgNspNameCount(short akmgNspNameCount) {
        kmgNspNameCount = akmgNspNameCount;
    }

    /**
     * Access method for kmgNspNameList.
     *
     * @return the current value of kmgNspNameList
     */
    public String getkmgNspNameList() {
        return kmgNspNameList;
    }

    /**
     * Setter method for kmgNspNameList.
     *
     * @param akmgNspNameList the new value for kmgNspNameList
     */
    public void setkmgNspNameList(String akmgNspNameList) {
        kmgNspNameList = akmgNspNameList;
    }

    /**
     * Access method for kmgLastUserId.
     *
     * @return the current value of kmgLastUserId
     */
    public String getkmgLastUserId() {
        return kmgLastUserId;
    }

    /**
     * Setter method for kmgLastUserId.
     *
     * @param akmgLastUserId the new value for kmgLastUserId
     */
    public void setkmgLastUserId(String akmgLastUserId) {
        kmgLastUserId = akmgLastUserId;
    }

    /**
     * Access method for kmgVidata.
     *
     * @return the current value of kmgVidata
     */
    public String getkmgVidata() {
        return kmgVidata;
    }

    /**
     * Setter method for kmgVidata.
     *
     * @param akmgVidata the new value for kmgVidata
     */
    public void setkmgVidata(String akmgVidata) {
        kmgVidata = akmgVidata;
    }

    /**
     * Access method for kmgComment.
     *
     * @return the current value of kmgComment
     */
    public String getkmgComment() {
        return kmgComment;
    }

    /**
     * Setter method for kmgComment.
     *
     * @param akmgComment the new value for kmgComment
     */
    public void setkmgComment(String akmgComment) {
        kmgComment = akmgComment;
    }

    /**
     * Access method for kmgDeactdate.
     *
     * @return the current value of kmgDeactdate
     */
    public String getkmgDeactdate() {
        return kmgDeactdate;
    }

    /**
     * Setter method for kmgDeactdate.
     *
     * @param akmgDeactdate the new value for kmgDeactdate
     */
    public void setkmgDeactdate(String akmgDeactdate) {
        kmgDeactdate = akmgDeactdate;
    }

    /**
     * Access method for kmgKno.
     *
     * @return the current value of kmgKno
     */
    public String getkmgKno() {
        return kmgKno;
    }

    /**
     * Setter method for kmgKno.
     *
     * @param akmgKno the new value for kmgKno
     */
    public void setkmgKno(String akmgKno) {
        kmgKno = akmgKno;
    }

    /**
     * Access method for kmgKnoVer.
     *
     * @return the current value of kmgKnoVer
     */
    public String getkmgKnoVer() {
        return kmgKnoVer;
    }

    /**
     * Setter method for kmgKnoVer.
     *
     * @param akmgKnoVer the new value for kmgKnoVer
     */
    public void setkmgKnoVer(String akmgKnoVer) {
        kmgKnoVer = akmgKnoVer;
    }

    /**
     * Access method for kmgOrigin.
     *
     * @return the current value of kmgOrigin
     */
    public String getkmgOrigin() {
        return kmgOrigin;
    }

    /**
     * Setter method for kmgOrigin.
     *
     * @param akmgOrigin the new value for kmgOrigin
     */
    public void setkmgOrigin(String akmgOrigin) {
        kmgOrigin = akmgOrigin;
    }

    /**
     * Access method for kmgOrigingroup.
     *
     * @return the current value of kmgOrigingroup
     */
    public String getkmgOrigingroup() {
        return kmgOrigingroup;
    }

    /**
     * Setter method for kmgOrigingroup.
     *
     * @param akmgOrigingroup the new value for kmgOrigingroup
     */
    public void setkmgOrigingroup(String akmgOrigingroup) {
        kmgOrigingroup = akmgOrigingroup;
    }

    /**
     * Access method for kmgGroups.
     *
     * @return the current value of kmgGroups
     */
    public String getkmgGroups() {
        return kmgGroups;
    }

    /**
     * Setter method for kmgGroups.
     *
     * @param akmgGroups the new value for kmgGroups
     */
    public void setkmgGroups(String akmgGroups) {
        kmgGroups = akmgGroups;
    }

    /**
     * Access method for kmgTermKey.
     *
     * @return the current value of kmgTermKey
     */
    public String getkmgTermKey() {
        return kmgTermKey;
    }

    /**
     * Setter method for kmgTermKey.
     *
     * @param akmgTermKey the new value for kmgTermKey
     */
    public void setkmgTermKey(String akmgTermKey) {
        kmgTermKey = akmgTermKey;
    }

    /**
     * Access method for kmgTermNo.
     *
     * @return the current value of kmgTermNo
     */
    public String getkmgTermNo() {
        return kmgTermNo;
    }

    /**
     * Setter method for kmgTermNo.
     *
     * @param akmgTermNo the new value for kmgTermNo
     */
    public void setkmgTermNo(String akmgTermNo) {
        kmgTermNo = akmgTermNo;
    }

    /**
     * Access method for kmgTermType.
     *
     * @return the current value of kmgTermType
     */
    public String getkmgTermType() {
        return kmgTermType;
    }

    /**
     * Setter method for kmgTermType.
     *
     * @param akmgTermType the new value for kmgTermType
     */
    public void setkmgTermType(String akmgTermType) {
        kmgTermType = akmgTermType;
    }

    /**
     * Access method for kmgTermVers.
     *
     * @return the current value of kmgTermVers
     */
    public String getkmgTermVers() {
        return kmgTermVers;
    }

    /**
     * Setter method for kmgTermVers.
     *
     * @param akmgTermVers the new value for kmgTermVers
     */
    public void setkmgTermVers(String akmgTermVers) {
        kmgTermVers = akmgTermVers;
    }

    /**
     * Access method for kmgTmkSeqNo.
     *
     * @return the current value of kmgTmkSeqNo
     */
    public String getkmgTmkSeqNo() {
        return kmgTmkSeqNo;
    }

    /**
     * Setter method for kmgTmkSeqNo.
     *
     * @param akmgTmkSeqNo the new value for kmgTmkSeqNo
     */
    public void setkmgTmkSeqNo(String akmgTmkSeqNo) {
        kmgTmkSeqNo = akmgTmkSeqNo;
    }

    /**
     * Access method for kmgKekSeqNo.
     *
     * @return the current value of kmgKekSeqNo
     */
    public String getkmgKekSeqNo() {
        return kmgKekSeqNo;
    }

    /**
     * Setter method for kmgKekSeqNo.
     *
     * @param akmgKekSeqNo the new value for kmgKekSeqNo
     */
    public void setkmgKekSeqNo(String akmgKekSeqNo) {
        kmgKekSeqNo = akmgKekSeqNo;
    }

    /**
     * Access method for kmgSesSeqNo.
     *
     * @return the current value of kmgSesSeqNo
     */
    public String getkmgSesSeqNo() {
        return kmgSesSeqNo;
    }

    /**
     * Setter method for kmgSesSeqNo.
     *
     * @param akmgSesSeqNo the new value for kmgSesSeqNo
     */
    public void setkmgSesSeqNo(String akmgSesSeqNo) {
        kmgSesSeqNo = akmgSesSeqNo;
    }

    /**
     * Access method for kmgExtStatus.
     *
     * @return the current value of kmgExtStatus
     */
    public String getkmgExtStatus() {
        return kmgExtStatus;
    }

    /**
     * Setter method for kmgExtStatus.
     *
     * @param akmgExtStatus the new value for kmgExtStatus
     */
    public void setkmgExtStatus(String akmgExtStatus) {
        kmgExtStatus = akmgExtStatus;
    }

    /**
     * Access method for kmgExtDate.
     *
     * @return the current value of kmgExtDate
     */
    public String getkmgExtDate() {
        return kmgExtDate;
    }

    /**
     * Setter method for kmgExtDate.
     *
     * @param akmgExtDate the new value for kmgExtDate
     */
    public void setkmgExtDate(String akmgExtDate) {
        kmgExtDate = akmgExtDate;
    }

    /**
     * Access method for kmgExtTime.
     *
     * @return the current value of kmgExtTime
     */
    public String getkmgExtTime() {
        return kmgExtTime;
    }

    /**
     * Setter method for kmgExtTime.
     *
     * @param akmgExtTime the new value for kmgExtTime
     */
    public void setkmgExtTime(String akmgExtTime) {
        kmgExtTime = akmgExtTime;
    }

    /**
     * Access method for kmgExtUserid.
     *
     * @return the current value of kmgExtUserid
     */
    public String getkmgExtUserid() {
        return kmgExtUserid;
    }

    /**
     * Setter method for kmgExtUserid.
     *
     * @param akmgExtUserid the new value for kmgExtUserid
     */
    public void setkmgExtUserid(String akmgExtUserid) {
        kmgExtUserid = akmgExtUserid;
    }

    /**
     * Access method for kmgCkdsUse.
     *
     * @return the current value of kmgCkdsUse
     */
    public String getkmgCkdsUse() {
        return kmgCkdsUse;
    }

    /**
     * Setter method for kmgCkdsUse.
     *
     * @param akmgCkdsUse the new value for kmgCkdsUse
     */
    public void setkmgCkdsUse(String akmgCkdsUse) {
        kmgCkdsUse = akmgCkdsUse;
    }

    /**
     * Access method for kmgCkdsLab.
     *
     * @return the current value of kmgCkdsLab
     */
    public String getkmgCkdsLab() {
        return kmgCkdsLab;
    }

    /**
     * Setter method for kmgCkdsLab.
     *
     * @param akmgCkdsLab the new value for kmgCkdsLab
     */
    public void setkmgCkdsLab(String akmgCkdsLab) {
        kmgCkdsLab = akmgCkdsLab;
    }

    /**
     * Access method for kmgUserAppl.
     *
     * @return the current value of kmgUserAppl
     */
    public String getkmgUserAppl() {
        return kmgUserAppl;
    }

    /**
     * Setter method for kmgUserAppl.
     *
     * @param akmgUserAppl the new value for kmgUserAppl
     */
    public void setkmgUserAppl(String akmgUserAppl) {
        kmgUserAppl = akmgUserAppl;
    }

    /**
     * Access method for kmgInstId.
     *
     * @return the current value of kmgInstId
     */
    public String getkmgInstId() {
        return kmgInstId;
    }

    /**
     * Setter method for kmgInstId.
     *
     * @param akmgInstId the new value for kmgInstId
     */
    public void setkmgInstId(String akmgInstId) {
        kmgInstId = akmgInstId;
    }

    /**
     * Access method for kmgCountry.
     *
     * @return the current value of kmgCountry
     */
    public String getkmgCountry() {
        return kmgCountry;
    }

    /**
     * Setter method for kmgCountry.
     *
     * @param akmgCountry the new value for kmgCountry
     */
    public void setkmgCountry(String akmgCountry) {
        kmgCountry = akmgCountry;
    }

    /**
     * Access method for kmgKeySeqno.
     *
     * @return the current value of kmgKeySeqno
     */
    public String getkmgKeySeqno() {
        return kmgKeySeqno;
    }

    /**
     * Setter method for kmgKeySeqno.
     *
     * @param akmgKeySeqno the new value for kmgKeySeqno
     */
    public void setkmgKeySeqno(String akmgKeySeqno) {
        kmgKeySeqno = akmgKeySeqno;
    }

    /**
     * Access method for kmgExtkeylab.
     *
     * @return the current value of kmgExtkeylab
     */
    public String getkmgExtkeylab() {
        return kmgExtkeylab;
    }

    /**
     * Setter method for kmgExtkeylab.
     *
     * @param akmgExtkeylab the new value for kmgExtkeylab
     */
    public void setkmgExtkeylab(String akmgExtkeylab) {
        kmgExtkeylab = akmgExtkeylab;
    }

    /**
     * Access method for kmgExtkeklab.
     *
     * @return the current value of kmgExtkeklab
     */
    public String getkmgExtkeklab() {
        return kmgExtkeklab;
    }

    /**
     * Setter method for kmgExtkeklab.
     *
     * @param akmgExtkeklab the new value for kmgExtkeklab
     */
    public void setkmgExtkeklab(String akmgExtkeklab) {
        kmgExtkeklab = akmgExtkeklab;
    }

    /**
     * Access method for kmgPkcsappl.
     *
     * @return the current value of kmgPkcsappl
     */
    public String getkmgPkcsappl() {
        return kmgPkcsappl;
    }

    /**
     * Setter method for kmgPkcsappl.
     *
     * @param akmgPkcsappl the new value for kmgPkcsappl
     */
    public void setkmgPkcsappl(String akmgPkcsappl) {
        kmgPkcsappl = akmgPkcsappl;
    }

    /**
     * Access method for kmgPkcsid.
     *
     * @return the current value of kmgPkcsid
     */
    public String getkmgPkcsid() {
        return kmgPkcsid;
    }
    
    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getid() {
        return id;
    }

    /**
     * Setter method for kmgPkcsid.
     *
     * @param akmgPkcsid the new value for kmgPkcsid
     */
    public void setkmgPkcsid(String akmgPkcsid) {
        kmgPkcsid = akmgPkcsid;
    }
    
    /**
     * Setter method for id.
     *
     * @param id the new value for id
     */
    public void setid(int id) {
        id = id;
    }
    
    /**
     * Access method for kmgCudataTp.
     *
     * @return the current value of kmgCudataTp
     */
    public String getkmgCudataTp() {
        return kmgCudataTp;
    }

    /**
     * Setter method for kmgCudataTp.
     *
     * @param akmgCudataTp the new value for kmgCudataTp
     */
    public void setkmgCudataTp(String akmgCudataTp) {
        kmgCudataTp = akmgCudataTp;
    }

}
