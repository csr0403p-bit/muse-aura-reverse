package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.C10060Goh;
import X.C10091GpF;
import X.C9911Gku;
import X.EnumC9834GiY;
import X.F60;
import X.FGI;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.Set;

/* loaded from: classes6.dex */
public class BeanAsArraySerializer extends BeanSerializerBase {
    public static final long serialVersionUID = 1;
    public final BeanSerializerBase _defaultSerializer;

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase) {
        super((C10060Goh) null, beanSerializerBase, beanSerializerBase._propertyFilterId);
        this._defaultSerializer = beanSerializerBase;
    }

    public static final void A00(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, BeanAsArraySerializer beanAsArraySerializer, Object obj) throws Throwable {
        C9911Gku[] c9911GkuArr = beanAsArraySerializer._filteredProps;
        if (c9911GkuArr == null || abstractC9842Gii._serializationView == null) {
            c9911GkuArr = beanAsArraySerializer._props;
        }
        int i = 0;
        try {
            int length = c9911GkuArr.length;
            while (i < length) {
                C9911Gku c9911Gku = c9911GkuArr[i];
                if (c9911Gku == null) {
                    abstractC9919GlE.A0R();
                } else {
                    c9911Gku.A03(abstractC9919GlE, abstractC9842Gii, obj);
                }
                i++;
            }
        } catch (Exception e) {
            StdSerializer.A03(abstractC9842Gii, obj, c9911GkuArr[i]._name._value, e);
            throw F60.createAndThrow();
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException(abstractC9919GlE, "Infinite recursion (StackOverflowError)", e2);
            jsonMappingException.A06(obj, c9911GkuArr[i]._name._value);
            throw jsonMappingException;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public final void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws Throwable {
        if (this._objectIdWriter != null) {
            A0J(abstractC9919GlE, abstractC9842Gii, abstractC9996GnP, obj);
            return;
        }
        C10091GpF c10091GpFA0H = A0H(EnumC9834GiY.START_ARRAY, abstractC9996GnP, obj);
        abstractC9996GnP.A02(abstractC9919GlE, c10091GpFA0H);
        abstractC9919GlE.A0i(obj);
        A00(abstractC9919GlE, abstractC9842Gii, this, obj);
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA0H);
    }

    public final String toString() {
        return FGI.A0M("BeanAsArraySerializer for ", this._handledType.getName());
    }

    public BeanAsArraySerializer(C10060Goh c10060Goh, BeanSerializerBase beanSerializerBase, Object obj) {
        super(c10060Goh, beanSerializerBase, obj);
        this._defaultSerializer = beanSerializerBase;
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, Set<String> set, Set<String> set2) {
        super(beanSerializerBase, set, set2);
        this._defaultSerializer = beanSerializerBase;
    }
}
