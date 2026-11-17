package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.C10091GpF;
import X.EnumC9834GiY;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;

/* loaded from: classes6.dex */
public abstract class ArraySerializerBase<T> extends ContainerSerializer<T> implements InterfaceC9833GiW {
    public final InterfaceC10017Gnp _property;
    public final Boolean _unwrapSingle;

    /* JADX WARN: Incorrect types in method signature: (TT;LX/GlE;LX/Gii;LX/GnP;)V */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws Throwable {
        C10091GpF c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.START_ARRAY, abstractC9996GnP, obj);
        abstractC9919GlE.A0i(obj);
        if (this instanceof StdArraySerializers$IntArraySerializer) {
            for (int i : (int[]) obj) {
                abstractC9919GlE.A0X(i);
            }
        } else if (this instanceof StdArraySerializers$ShortArraySerializer) {
            for (short s : (short[]) obj) {
                abstractC9919GlE.A0X(s);
            }
        } else if (this instanceof StdArraySerializers$LongArraySerializer) {
            for (long j : (long[]) obj) {
                abstractC9919GlE.A0Y(j);
            }
        } else if (this instanceof StdArraySerializers$FloatArraySerializer) {
            for (float f : (float[]) obj) {
                abstractC9919GlE.A0W(f);
            }
        } else if (this instanceof StdArraySerializers$DoubleArraySerializer) {
            for (double d : (double[]) obj) {
                abstractC9919GlE.A0V(d);
            }
        } else if (this instanceof StdArraySerializers$BooleanArraySerializer) {
            for (boolean z : (boolean[]) obj) {
                abstractC9919GlE.A0w(z);
            }
        } else if (this instanceof ObjectArraySerializer) {
            ObjectArraySerializer.A00(abstractC9919GlE, abstractC9842Gii, (ObjectArraySerializer) this, (Object[]) obj);
        } else {
            StringArraySerializer.A00(abstractC9919GlE, abstractC9842Gii, (StringArraySerializer) this, (String[]) obj);
        }
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    @Override // X.InterfaceC9833GiW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer A7f(X.InterfaceC10017Gnp r10, X.AbstractC9842Gii r11) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ArraySerializerBase.A7f(X.Gnp, X.Gii):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public ArraySerializerBase(Class<T> cls) {
        super(cls);
        this._property = null;
        this._unwrapSingle = null;
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/fasterxml/jackson/databind/ser/std/ArraySerializerBase<*>;LX/Gnp;Ljava/lang/Boolean;)V */
    public ArraySerializerBase(InterfaceC10017Gnp interfaceC10017Gnp, ArraySerializerBase arraySerializerBase, Boolean bool) {
        super(arraySerializerBase._handledType, false);
        this._property = interfaceC10017Gnp;
        this._unwrapSingle = bool;
    }
}
