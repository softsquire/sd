package com.kingdee.eas.fdc.invite.supplier;

import java.io.Serializable;
import com.kingdee.bos.dao.AbstractObjectValue;
import java.util.Locale;
import com.kingdee.util.TypeConversionUtils;
import com.kingdee.bos.util.BOSObjectType;


public class AbstractFDCSplQualificationAuditEntryInfo extends com.kingdee.eas.framework.CoreBaseInfo implements Serializable 
{
    public AbstractFDCSplQualificationAuditEntryInfo()
    {
        this("id");
    }
    protected AbstractFDCSplQualificationAuditEntryInfo(String pkField)
    {
        super(pkField);
    }
    /**
     * Object:�ʸ񿼲���۷�¼'s �Ƿ���뿼��property 
     */
    public boolean isIsAudit()
    {
        return getBoolean("isAudit");
    }
    public void setIsAudit(boolean item)
    {
        setBoolean("isAudit", item);
    }
    /**
     * Object:�ʸ񿼲���۷�¼'s ����ǰ״̬property 
     */
    public String getBeforeState()
    {
        return getString("beforeState");
    }
    public void setBeforeState(String item)
    {
        setString("beforeState", item);
    }
    /**
     * Object:�ʸ񿼲���۷�¼'s ����÷�property 
     */
    public java.math.BigDecimal getScore()
    {
        return getBigDecimal("score");
    }
    public void setScore(java.math.BigDecimal item)
    {
        setBigDecimal("score", item);
    }
    /**
     * Object:�ʸ񿼲���۷�¼'s ��Ӧ�̵ȼ�property 
     */
    public String getGrade()
    {
        return getString("grade");
    }
    public void setGrade(String item)
    {
        setString("grade", item);
    }
    /**
     * Object: �ʸ񿼲���۷�¼ 's ���쵥�� property 
     */
    public com.kingdee.eas.fdc.invite.supplier.FDCSplQualificationAuditBillInfo getAuditBill()
    {
        return (com.kingdee.eas.fdc.invite.supplier.FDCSplQualificationAuditBillInfo)get("auditBill");
    }
    public void setAuditBill(com.kingdee.eas.fdc.invite.supplier.FDCSplQualificationAuditBillInfo item)
    {
        put("auditBill", item);
    }
    /**
     * Object: �ʸ񿼲���۷�¼ 's ��Ӧ������ property 
     */
    public com.kingdee.eas.fdc.invite.supplier.FDCSplServiceTypeInfo getSupplierType()
    {
        return (com.kingdee.eas.fdc.invite.supplier.FDCSplServiceTypeInfo)get("supplierType");
    }
    public void setSupplierType(com.kingdee.eas.fdc.invite.supplier.FDCSplServiceTypeInfo item)
    {
        put("supplierType", item);
    }
    public BOSObjectType getBOSType()
    {
        return new BOSObjectType("A1029E04");
    }
}