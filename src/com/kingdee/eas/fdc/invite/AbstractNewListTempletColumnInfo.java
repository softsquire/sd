package com.kingdee.eas.fdc.invite;

import java.io.Serializable;
import com.kingdee.bos.dao.AbstractObjectValue;
import java.util.Locale;
import com.kingdee.util.TypeConversionUtils;
import com.kingdee.bos.util.BOSObjectType;


public class AbstractNewListTempletColumnInfo extends com.kingdee.eas.framework.TreeBaseInfo implements Serializable 
{
    public AbstractNewListTempletColumnInfo()
    {
        this("id");
    }
    protected AbstractNewListTempletColumnInfo(String pkField)
    {
        super(pkField);
    }
    /**
     * Object: �嵥ģ��ҳǩ 's ��ͷ property 
     */
    public com.kingdee.eas.fdc.invite.HeadColumnInfo getHeadColumn()
    {
        return (com.kingdee.eas.fdc.invite.HeadColumnInfo)get("headColumn");
    }
    public void setHeadColumn(com.kingdee.eas.fdc.invite.HeadColumnInfo item)
    {
        put("headColumn", item);
    }
    /**
     * Object: �嵥ģ��ҳǩ 's ҳǩͷ property 
     */
    public com.kingdee.eas.fdc.invite.NewListTempletPageInfo getPage()
    {
        return (com.kingdee.eas.fdc.invite.NewListTempletPageInfo)get("page");
    }
    public void setPage(com.kingdee.eas.fdc.invite.NewListTempletPageInfo item)
    {
        put("page", item);
    }
    /**
     * Object:�嵥ģ��ҳǩ's ����property 
     */
    public int getSeq()
    {
        return getInt("seq");
    }
    public void setSeq(int item)
    {
        setInt("seq", item);
    }
    /**
     * Object:�嵥ģ��ҳǩ's �Ƿ񱨼���property 
     */
    public boolean isIsQuoting()
    {
        return getBoolean("isQuoting");
    }
    public void setIsQuoting(boolean item)
    {
        setBoolean("isQuoting", item);
    }
    public BOSObjectType getBOSType()
    {
        return new BOSObjectType("A2976F63");
    }
}