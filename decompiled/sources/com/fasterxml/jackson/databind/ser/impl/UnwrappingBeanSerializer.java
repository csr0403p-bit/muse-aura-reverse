package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC10187Gqy;
import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.C10060Goh;
import X.C9911Gku;
import X.EnumC9975Gmp;
import X.F60;
import X.FGI;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import java.io.Serializable;
import java.util.Set;

/* loaded from: classes6.dex */
public class UnwrappingBeanSerializer extends BeanSerializerBase implements Serializable {
    public static final long serialVersionUID = 1;
    public final AbstractC10187Gqy _nameTransformer;

    /* JADX WARN: Illegal instructions before constructor call */
    public UnwrappingBeanSerializer(BeanSerializerBase beanSerializerBase, AbstractC10187Gqy abstractC10187Gqy) {
        int length;
        int length2;
        C9911Gku[] c9911GkuArr = beanSerializerBase._props;
        if (c9911GkuArr != null && (length2 = c9911GkuArr.length) != 0 && abstractC10187Gqy != null && abstractC10187Gqy != AbstractC10187Gqy.A00) {
            C9911Gku[] c9911GkuArr2 = new C9911Gku[length2];
            int i = 0;
            do {
                C9911Gku c9911Gku = c9911GkuArr[i];
                if (c9911Gku != null) {
                    c9911GkuArr2[i] = c9911Gku.A02(abstractC10187Gqy);
                }
                i++;
            } while (i < length2);
            c9911GkuArr = c9911GkuArr2;
        }
        C9911Gku[] c9911GkuArr3 = beanSerializerBase._filteredProps;
        if (c9911GkuArr3 != null && (length = c9911GkuArr3.length) != 0 && abstractC10187Gqy != null && abstractC10187Gqy != AbstractC10187Gqy.A00) {
            C9911Gku[] c9911GkuArr4 = new C9911Gku[length];
            int i2 = 0;
            do {
                C9911Gku c9911Gku2 = c9911GkuArr3[i2];
                if (c9911Gku2 != null) {
                    c9911GkuArr4[i2] = c9911Gku2.A02(abstractC10187Gqy);
                }
                i2++;
            } while (i2 < length);
            c9911GkuArr3 = c9911GkuArr4;
        }
        super(beanSerializerBase, c9911GkuArr, c9911GkuArr3);
        this._nameTransformer = abstractC10187Gqy;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public final void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws InvalidDefinitionException {
        if (abstractC9842Gii._config.A0E(EnumC9975Gmp.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            abstractC9842Gii.A0F("Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`", this._handledType);
        } else {
            abstractC9919GlE.A0i(obj);
            if (this._objectIdWriter != null) {
                A0J(abstractC9919GlE, abstractC9842Gii, abstractC9996GnP, obj);
                return;
            }
            Object obj2 = this._propertyFilterId;
            if (obj2 == null) {
                A0K(abstractC9919GlE, abstractC9842Gii, obj);
                return;
            }
            A0G(abstractC9842Gii, obj2);
        }
        throw F60.createAndThrow();
    }

    public final String toString() {
        return FGI.A0M("UnwrappingBeanSerializer for ", this._handledType.getName());
    }

    public UnwrappingBeanSerializer(C10060Goh c10060Goh, UnwrappingBeanSerializer unwrappingBeanSerializer, Object obj) {
        super(c10060Goh, unwrappingBeanSerializer, obj);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, Set<String> set, Set<String> set2) {
        super(unwrappingBeanSerializer, set, set2);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    public UnwrappingBeanSerializer(C10060Goh c10060Goh, UnwrappingBeanSerializer unwrappingBeanSerializer) {
        super(c10060Goh, unwrappingBeanSerializer, unwrappingBeanSerializer._propertyFilterId);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, C9911Gku[] c9911GkuArr, C9911Gku[] c9911GkuArr2) {
        super(unwrappingBeanSerializer, c9911GkuArr, c9911GkuArr2);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }
}
