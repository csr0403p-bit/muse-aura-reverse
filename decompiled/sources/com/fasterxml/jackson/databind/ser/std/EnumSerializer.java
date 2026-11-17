package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.AbstractC9855Gj3;
import X.AbstractC9910Gks;
import X.BV5;
import X.C10026Go0;
import X.C10104GpS;
import X.C60Q;
import X.C6xC;
import X.C9894GkV;
import X.C9897Gkd;
import X.C9909Gkr;
import X.C9914Gl4;
import X.C9963Gma;
import X.EnumC10046GoQ;
import X.EnumC9825GiJ;
import X.InterfaceC10017Gnp;
import X.InterfaceC10180Gqq;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class EnumSerializer extends StdScalarSerializer<Enum<?>> implements InterfaceC9833GiW {
    public static final long serialVersionUID = 1;
    public final Boolean _serializeAsIndex;
    public final C9897Gkd _values;
    public final C9897Gkd _valuesByEnumNaming;
    public final C9897Gkd _valuesByToString;

    public EnumSerializer(C9897Gkd c9897Gkd, C9897Gkd c9897Gkd2, C9897Gkd c9897Gkd3, Boolean bool) {
        super(c9897Gkd._enumClass);
        this._values = c9897Gkd;
        this._serializeAsIndex = bool;
        this._valuesByEnumNaming = c9897Gkd2;
        this._valuesByToString = c9897Gkd3;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/Gma;LX/Gl4;LX/GkV;)Lcom/fasterxml/jackson/databind/ser/std/EnumSerializer; */
    public static EnumSerializer A00(C9894GkV c9894GkV, C9963Gma c9963Gma, C9914Gl4 c9914Gl4, Class cls) {
        C9909Gkr c9909Gkr = c9914Gl4.A07;
        C9897Gkd c9897GkdA00 = C9897Gkd.A00(c9963Gma, c9909Gkr);
        AbstractC9910Gks.A04(c9963Gma, c9909Gkr);
        AbstractC9910Gks abstractC9910GksA02 = c9963Gma.A02();
        boolean zA00 = c9963Gma._datatypeFeatures.A00(EnumC9825GiJ.WRITE_ENUMS_TO_LOWERCASE);
        Class<?> cls2 = c9909Gkr.A05;
        Class<?> superclass = cls2;
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        if (cls2.getSuperclass() != Enum.class) {
            superclass = cls2.getSuperclass();
        }
        Enum[] enumArr = (Enum[]) superclass.getEnumConstants();
        if (enumArr == null) {
            throw C60Q.A0U("No enum constants for class ", cls2.getName());
        }
        int length = enumArr.length;
        String[] strArr = new String[length];
        if (abstractC9910GksA02 != null) {
            abstractC9910GksA02.A0d(c9909Gkr, enumArr, strArr);
        }
        InterfaceC10180Gqq[] interfaceC10180GqqArr = new InterfaceC10180Gqq[length];
        for (int i = 0; i < length; i++) {
            String string = enumArr[i].toString();
            if (string == null) {
                string = "";
            }
            String lowerCase = strArr[i];
            if (lowerCase == null) {
                lowerCase = zA00 ? string.toLowerCase() : string;
            }
            interfaceC10180GqqArr[i] = new C10026Go0(lowerCase);
        }
        return new EnumSerializer(c9897GkdA00, null, new C9897Gkd(cls2, interfaceC10180GqqArr), A01(c9894GkV, null, cls, true));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/GkV;ZLjava/lang/Boolean;)Ljava/lang/Boolean; */
    public static Boolean A01(C9894GkV c9894GkV, Boolean bool, Class cls, boolean z) {
        EnumC10046GoQ enumC10046GoQ = c9894GkV._shape;
        if (enumC10046GoQ == null || enumC10046GoQ == EnumC10046GoQ.ANY || enumC10046GoQ == EnumC10046GoQ.SCALAR) {
            return bool;
        }
        if (enumC10046GoQ == EnumC10046GoQ.STRING || enumC10046GoQ == EnumC10046GoQ.NATURAL) {
            return Boolean.FALSE;
        }
        if (enumC10046GoQ.A00() || enumC10046GoQ == EnumC10046GoQ.ARRAY) {
            return Boolean.TRUE;
        }
        throw BV5.A0T("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", new Object[]{enumC10046GoQ, cls.getName(), z ? "class" : "property"});
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    @Override // X.InterfaceC9833GiW
    public final JsonSerializer A7f(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9842Gii abstractC9842Gii) {
        C9894GkV c9894GkVA02 = StdSerializer.A02(interfaceC10017Gnp, abstractC9842Gii, this._handledType);
        if (c9894GkVA02 != null) {
            Class<T> cls = this._handledType;
            Boolean bool = this._serializeAsIndex;
            Boolean boolA01 = A01(c9894GkVA02, bool, cls, false);
            if (!C6xC.A00(boolA01, bool)) {
                return new EnumSerializer(this._values, this._valuesByEnumNaming, this._valuesByToString, boolA01);
            }
        }
        return this;
    }
}
