package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC10100GpO;
import X.AbstractC9842Gii;
import X.AbstractC9849Git;
import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9919GlE;
import X.AbstractC9970Gmj;
import X.AbstractC9996GnP;
import X.C10009Gnh;
import X.C10010Gni;
import X.C10060Goh;
import X.C10091GpF;
import X.C10104GpS;
import X.C60O;
import X.C60Q;
import X.C9911Gku;
import X.C9914Gl4;
import X.EnumC10046GoQ;
import X.EnumC9834GiY;
import X.F60;
import X.Gp4;
import X.InterfaceC9833GiW;
import X.InterfaceC9844Gim;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class BeanSerializerBase extends StdSerializer implements InterfaceC9833GiW, InterfaceC9844Gim {
    public static final C9911Gku[] A00;
    public final Gp4 _anyGetterWriter;
    public final AbstractC9870GjI _beanType;
    public final C9911Gku[] _filteredProps;
    public final C10060Goh _objectIdWriter;
    public final Object _propertyFilterId;
    public final C9911Gku[] _props;
    public final EnumC10046GoQ _serializationShape;
    public final AbstractC9970Gmj _typeId;

    public BeanSerializerBase(AbstractC9870GjI abstractC9870GjI, AbstractC9970Gmj abstractC9970Gmj, C9914Gl4 c9914Gl4, Gp4 gp4, C10060Goh c10060Goh, Object obj, C9911Gku[] c9911GkuArr, C9911Gku[] c9911GkuArr2) {
        super(abstractC9870GjI);
        this._beanType = abstractC9870GjI;
        this._props = c9911GkuArr;
        this._filteredProps = c9911GkuArr2;
        this._typeId = abstractC9970Gmj;
        this._anyGetterWriter = gp4;
        this._propertyFilterId = obj;
        this._objectIdWriter = c10060Goh;
        this._serializationShape = c9914Gl4.A02()._shape;
    }

    static {
        C10009Gnh c10009Gnh = C10009Gnh.A00;
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        A00 = new C9911Gku[0];
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, Set<String> set, Set<String> set2) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        C9911Gku[] c9911GkuArr = beanSerializerBase._props;
        C9911Gku[] c9911GkuArr2 = beanSerializerBase._filteredProps;
        int length = c9911GkuArr.length;
        ArrayList arrayListA11 = C60O.A11(length);
        ArrayList arrayListA112 = c9911GkuArr2 == null ? null : C60O.A11(length);
        for (int i = 0; i < length; i++) {
            C9911Gku c9911Gku = c9911GkuArr[i];
            if (!AbstractC10100GpO.A01(c9911Gku._name._value, set, set2)) {
                arrayListA11.add(c9911Gku);
                if (c9911GkuArr2 != null) {
                    arrayListA112.add(c9911GkuArr2[i]);
                }
            }
        }
        this._props = (C9911Gku[]) arrayListA11.toArray(new C9911Gku[arrayListA11.size()]);
        this._filteredProps = arrayListA112 != null ? (C9911Gku[]) arrayListA112.toArray(new C9911Gku[arrayListA112.size()]) : null;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    private final BeanSerializerBase A0I(C10060Goh c10060Goh) {
        return this instanceof UnwrappingBeanSerializer ? new UnwrappingBeanSerializer(c10060Goh, (UnwrappingBeanSerializer) this) : this instanceof BeanAsArraySerializer ? ((BeanAsArraySerializer) this)._defaultSerializer.A0I(c10060Goh) : new BeanSerializer(c10060Goh, this, this._propertyFilterId);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws InvalidDefinitionException, JsonGenerationException {
        if (this._objectIdWriter != null) {
            A0J(abstractC9919GlE, abstractC9842Gii, abstractC9996GnP, obj);
            return;
        }
        C10091GpF c10091GpFA0H = A0H(EnumC9834GiY.START_OBJECT, abstractC9996GnP, obj);
        abstractC9996GnP.A02(abstractC9919GlE, c10091GpFA0H);
        abstractC9919GlE.A0i(obj);
        Object obj2 = this._propertyFilterId;
        if (obj2 != null) {
            A0G(abstractC9842Gii, obj2);
            throw F60.createAndThrow();
        }
        A0K(abstractC9919GlE, abstractC9842Gii, obj);
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA0H);
    }

    public final C10091GpF A0H(EnumC9834GiY enumC9834GiY, AbstractC9996GnP abstractC9996GnP, Object obj) {
        AbstractC9970Gmj abstractC9970Gmj = this._typeId;
        if (abstractC9970Gmj == null) {
            return abstractC9996GnP.A04(enumC9834GiY, obj);
        }
        Object objA0D = abstractC9970Gmj.A0D(obj);
        if (objA0D == null) {
            objA0D = "";
        }
        C10091GpF c10091GpFA04 = abstractC9996GnP.A04(enumC9834GiY, obj);
        c10091GpFA04.A04 = objA0D;
        return c10091GpFA04;
    }

    public final void A0J(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) {
        C10060Goh c10060Goh = this._objectIdWriter;
        C10010Gni c10010GniA0T = abstractC9842Gii.A0T(c10060Goh.A00, obj);
        if (c10010GniA0T.A01(abstractC9919GlE, abstractC9842Gii, c10060Goh)) {
            return;
        }
        Object objA00 = c10010GniA0T.A00;
        if (objA00 == null) {
            objA00 = c10010GniA0T.A02.A00(obj);
            c10010GniA0T.A00 = objA00;
        }
        if (c10060Goh.A04) {
            c10060Goh.A03.A0C(abstractC9919GlE, abstractC9842Gii, objA00);
            return;
        }
        C10060Goh c10060Goh2 = this._objectIdWriter;
        C10091GpF c10091GpFA0H = A0H(EnumC9834GiY.START_OBJECT, abstractC9996GnP, obj);
        abstractC9996GnP.A02(abstractC9919GlE, c10091GpFA0H);
        abstractC9919GlE.A0i(obj);
        c10010GniA0T.A00(abstractC9919GlE, abstractC9842Gii, c10060Goh2);
        Object obj2 = this._propertyFilterId;
        if (obj2 != null) {
            A0G(abstractC9842Gii, obj2);
            throw F60.createAndThrow();
        }
        A0K(abstractC9919GlE, abstractC9842Gii, obj);
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA0H);
    }

    public final void A0K(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, Object obj) {
        AbstractC9970Gmj abstractC9970Gmj;
        Object objA0D;
        C9911Gku[] c9911GkuArr = this._filteredProps;
        if (c9911GkuArr == null || abstractC9842Gii._serializationView == null) {
            c9911GkuArr = this._props;
        }
        try {
            for (C9911Gku c9911Gku : c9911GkuArr) {
                if (c9911Gku != null) {
                    c9911Gku.A04(abstractC9919GlE, abstractC9842Gii, obj);
                }
            }
            Gp4 gp4 = this._anyGetterWriter;
            if (gp4 == null || (objA0D = (abstractC9970Gmj = gp4.A03).A0D(obj)) == null) {
                return;
            }
            if (!(objA0D instanceof Map)) {
                AbstractC9849Git.A07(abstractC9842Gii, gp4.A02.AM9(), "Value returned by 'any-getter' %s() not java.util.Map but %s", new Object[]{abstractC9970Gmj.A09(), C60Q.A0e(objA0D)});
                throw F60.createAndThrow();
            }
            MapSerializer mapSerializer = gp4.A01;
            if (mapSerializer != null) {
                mapSerializer.A0H(abstractC9919GlE, abstractC9842Gii, (Map) objA0D);
            } else {
                gp4.A00.A0C(abstractC9919GlE, abstractC9842Gii, objA0D);
            }
        } catch (Exception e) {
            StdSerializer.A03(abstractC9842Gii, obj, 0 != c9911GkuArr.length ? c9911GkuArr[0]._name._value : "[anySetter]", e);
            throw F60.createAndThrow();
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException(abstractC9919GlE, "Infinite recursion (StackOverflowError)", e2);
            jsonMappingException.A06(obj, 0 != c9911GkuArr.length ? c9911GkuArr[0]._name._value : "[anySetter]");
            throw jsonMappingException;
        }
    }

    public final void A0L(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, Object obj, boolean z) throws IOException {
        C10060Goh c10060Goh = this._objectIdWriter;
        C10010Gni c10010GniA0T = abstractC9842Gii.A0T(c10060Goh.A00, obj);
        if (c10010GniA0T.A01(abstractC9919GlE, abstractC9842Gii, c10060Goh)) {
            return;
        }
        Object objA00 = c10010GniA0T.A00;
        if (objA00 == null) {
            objA00 = c10010GniA0T.A02.A00(obj);
            c10010GniA0T.A00 = objA00;
        }
        if (c10060Goh.A04) {
            c10060Goh.A03.A0C(abstractC9919GlE, abstractC9842Gii, objA00);
            return;
        }
        if (z) {
            abstractC9919GlE.A0m(obj);
        }
        c10010GniA0T.A00(abstractC9919GlE, abstractC9842Gii, c10060Goh);
        Object obj2 = this._propertyFilterId;
        if (obj2 != null) {
            A0G(abstractC9842Gii, obj2);
            throw F60.createAndThrow();
        }
        A0K(abstractC9919GlE, abstractC9842Gii, obj);
        if (z) {
            abstractC9919GlE.A0Q();
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0237 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0136  */
    /* JADX WARN: Type inference failed for: r9v21, types: [com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer] */
    /* JADX WARN: Type inference failed for: r9v25, types: [com.fasterxml.jackson.databind.ser.std.EnumSerializer] */
    @Override // X.InterfaceC9833GiW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer A7f(X.InterfaceC10017Gnp r19, X.AbstractC9842Gii r20) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.A7f(X.Gnp, X.Gii):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a4 A[PHI: r14
  0x01a4: PHI (r14v12 com.fasterxml.jackson.databind.JsonSerializer) = 
  (r14v20 com.fasterxml.jackson.databind.JsonSerializer)
  (r14v21 com.fasterxml.jackson.databind.JsonSerializer)
  (r14v22 com.fasterxml.jackson.databind.JsonSerializer)
  (r14v23 com.fasterxml.jackson.databind.JsonSerializer)
  (r14v24 com.fasterxml.jackson.databind.JsonSerializer)
  (r14v25 com.fasterxml.jackson.databind.JsonSerializer)
  (r14v26 com.fasterxml.jackson.databind.JsonSerializer)
 binds: [B:68:0x010e, B:70:0x0112, B:72:0x0116, B:74:0x011a, B:79:0x0130, B:87:0x0166, B:65:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC9844Gim
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AbW(X.AbstractC9842Gii r18) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.AbW(X.Gii):void");
    }

    public BeanSerializerBase(C10060Goh c10060Goh, BeanSerializerBase beanSerializerBase, Object obj) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = beanSerializerBase._props;
        this._filteredProps = beanSerializerBase._filteredProps;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = c10060Goh;
        this._propertyFilterId = obj;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, C9911Gku[] c9911GkuArr, C9911Gku[] c9911GkuArr2) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = c9911GkuArr;
        this._filteredProps = c9911GkuArr2;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }
}
