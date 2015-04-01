package com.kingdee.eas.fdc.tenancy;

import java.io.Serializable;
import com.kingdee.bos.dao.AbstractObjectValue;
import java.util.Locale;
import com.kingdee.util.TypeConversionUtils;
import com.kingdee.bos.util.BOSObjectType;


public class AbstractOtherBillInfo extends com.kingdee.eas.fdc.tenancy.TenBillBaseInfo implements Serializable 
{
    public AbstractOtherBillInfo()
    {
        this("id");
    }
    protected AbstractOtherBillInfo(String pkField)
    {
        super(pkField);
        put("payEntry", new com.kingdee.eas.fdc.tenancy.TenBillOtherPayCollection());
        put("entry", new com.kingdee.eas.fdc.tenancy.OtherBillEntryCollection());
    }
    /**
     * Object: ������ͬ 's ���޺�ͬ property 
     */
    public com.kingdee.eas.fdc.tenancy.TenancyBillInfo getTenancyBill()
    {
        return (com.kingdee.eas.fdc.tenancy.TenancyBillInfo)get("tenancyBill");
    }
    public void setTenancyBill(com.kingdee.eas.fdc.tenancy.TenancyBillInfo item)
    {
        put("tenancyBill", item);
    }
    /**
     * Object: ������ͬ 's ������ϸ property 
     */
    public com.kingdee.eas.fdc.tenancy.OtherBillEntryCollection getEntry()
    {
        return (com.kingdee.eas.fdc.tenancy.OtherBillEntryCollection)get("entry");
    }
    /**
     * Object: ������ͬ 's ������ͬӦ����ϸ property 
     */
    public com.kingdee.eas.fdc.tenancy.TenBillOtherPayCollection getPayEntry()
    {
        return (com.kingdee.eas.fdc.tenancy.TenBillOtherPayCollection)get("payEntry");
    }
    /**
     * Object:������ͬ's ��ȡ����property 
     */
    public int getLeaseTime()
    {
        return getInt("leaseTime");
    }
    public void setLeaseTime(int item)
    {
        setInt("leaseTime", item);
    }
    /**
     * Object:������ͬ's ��ʼ����property 
     */
    public java.util.Date getStartDate()
    {
        return getDate("startDate");
    }
    public void setStartDate(java.util.Date item)
    {
        setDate("startDate", item);
    }
    /**
     * Object:������ͬ's ��������property 
     */
    public java.util.Date getEndDate()
    {
        return getDate("endDate");
    }
    public void setEndDate(java.util.Date item)
    {
        setDate("endDate", item);
    }
    public BOSObjectType getBOSType()
    {
        return new BOSObjectType("73402BAE");
    }
}