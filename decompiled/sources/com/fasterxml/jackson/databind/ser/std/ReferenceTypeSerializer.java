package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC10109Gpa;
import X.AbstractC10187Gqy;
import X.AbstractC9842Gii;
import X.AbstractC9870GjI;
import X.AbstractC9996GnP;
import X.C10110Gpb;
import X.C9871GjJ;
import X.EnumC10065Gom;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.datatype.guava.ser.GuavaOptionalSerializer;

/* loaded from: classes6.dex */
public abstract class ReferenceTypeSerializer<T> extends StdSerializer<T> implements InterfaceC9833GiW {
    public static final Object A01 = EnumC10065Gom.NON_EMPTY;
    public static final long serialVersionUID = 1;
    public transient AbstractC10109Gpa A00;
    public final InterfaceC10017Gnp _property;
    public final AbstractC9870GjI _referredType;
    public final boolean _suppressNulls;
    public final Object _suppressableValue;
    public final AbstractC10187Gqy _unwrapper;
    public final JsonSerializer<Object> _valueSerializer;
    public final AbstractC9996GnP _valueTypeSerializer;

    public final ReferenceTypeSerializer<T> A0I(Object obj, boolean z) {
        boolean z2 = this instanceof GuavaOptionalSerializer;
        InterfaceC10017Gnp interfaceC10017Gnp = this._property;
        AbstractC9996GnP abstractC9996GnP = this._valueTypeSerializer;
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        AbstractC10187Gqy abstractC10187Gqy = this._unwrapper;
        return z2 ? new GuavaOptionalSerializer(interfaceC10017Gnp, jsonSerializer, abstractC9996GnP, this, abstractC10187Gqy, obj, z) : new AtomicReferenceSerializer(interfaceC10017Gnp, jsonSerializer, abstractC9996GnP, this, abstractC10187Gqy, obj, z);
    }

    public static final JsonSerializer A00(AbstractC9842Gii abstractC9842Gii, ReferenceTypeSerializer referenceTypeSerializer, Class cls) {
        JsonSerializer jsonSerializerA0M;
        JsonSerializer<Object> jsonSerializerA00 = referenceTypeSerializer.A00.A00(cls);
        if (jsonSerializerA00 != null) {
            return jsonSerializerA00;
        }
        AbstractC9870GjI abstractC9870GjI = referenceTypeSerializer._referredType;
        if (abstractC9870GjI.A0N()) {
            jsonSerializerA0M = abstractC9842Gii.A0J(referenceTypeSerializer._property, abstractC9842Gii.A0G(abstractC9870GjI, cls));
        } else {
            jsonSerializerA0M = abstractC9842Gii.A0M(referenceTypeSerializer._property, cls);
        }
        AbstractC10187Gqy abstractC10187Gqy = referenceTypeSerializer._unwrapper;
        if (abstractC10187Gqy != null) {
            jsonSerializerA0M = jsonSerializerA0M.A0A(abstractC10187Gqy);
        }
        referenceTypeSerializer.A00 = referenceTypeSerializer.A00.A01(jsonSerializerA0M, cls);
        return jsonSerializerA0M;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/GlE;LX/Gii;LX/GnP;)V */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(X.AbstractC9919GlE r3, X.AbstractC9842Gii r4, X.AbstractC9996GnP r5, java.lang.Object r6) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            r2 = this;
            boolean r0 = r2 instanceof com.fasterxml.jackson.datatype.guava.ser.GuavaOptionalSerializer
            if (r0 == 0) goto L2a
            com.google.common.base.Optional r6 = (com.google.common.base.Optional) r6
            boolean r0 = r6.isPresent()
            if (r0 == 0) goto L22
            java.lang.Object r1 = r6.get()
        L10:
            if (r1 == 0) goto L22
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r0 = r2._valueSerializer
            if (r0 != 0) goto L1e
            java.lang.Class r0 = r1.getClass()
            com.fasterxml.jackson.databind.JsonSerializer r0 = A00(r4, r2, r0)
        L1e:
            r0.A0B(r3, r4, r5, r1)
        L21:
            return
        L22:
            X.Gqy r0 = r2._unwrapper
            if (r0 != 0) goto L21
            r4.A0U(r3)
            return
        L2a:
            java.util.concurrent.atomic.AtomicReference r6 = (java.util.concurrent.atomic.AtomicReference) r6
            java.lang.Object r1 = r6.get()
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer.A0B(X.GlE, X.Gii, X.GnP, java.lang.Object):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gnp;LX/GnP;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;LX/Gqy;)Lcom/fasterxml/jackson/databind/ser/std/ReferenceTypeSerializer<TT;>; */
    public final ReferenceTypeSerializer A0H(InterfaceC10017Gnp interfaceC10017Gnp, JsonSerializer jsonSerializer, AbstractC9996GnP abstractC9996GnP, AbstractC10187Gqy abstractC10187Gqy) {
        return this instanceof GuavaOptionalSerializer ? (this._property == interfaceC10017Gnp && this._valueTypeSerializer == abstractC9996GnP && this._valueSerializer == jsonSerializer && this._unwrapper == abstractC10187Gqy) ? this : new GuavaOptionalSerializer(interfaceC10017Gnp, jsonSerializer, abstractC9996GnP, this, abstractC10187Gqy, this._suppressableValue, this._suppressNulls) : new AtomicReferenceSerializer(interfaceC10017Gnp, jsonSerializer, abstractC9996GnP, this, abstractC10187Gqy, this._suppressableValue, this._suppressNulls);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    @Override // X.InterfaceC9833GiW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer A7f(X.InterfaceC10017Gnp r7, X.AbstractC9842Gii r8) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer.A7f(X.Gnp, X.Gii):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public ReferenceTypeSerializer(JsonSerializer jsonSerializer, AbstractC9996GnP abstractC9996GnP, C9871GjJ c9871GjJ) {
        super(c9871GjJ);
        this._referredType = c9871GjJ._referencedType;
        this._property = null;
        this._valueTypeSerializer = abstractC9996GnP;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = null;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this.A00 = C10110Gpb.A00;
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/fasterxml/jackson/databind/ser/std/ReferenceTypeSerializer<*>;LX/Gnp;LX/GnP;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;LX/Gqy;Ljava/lang/Object;Z)V */
    public ReferenceTypeSerializer(InterfaceC10017Gnp interfaceC10017Gnp, JsonSerializer jsonSerializer, AbstractC9996GnP abstractC9996GnP, ReferenceTypeSerializer referenceTypeSerializer, AbstractC10187Gqy abstractC10187Gqy, Object obj, boolean z) {
        super(referenceTypeSerializer);
        this._referredType = referenceTypeSerializer._referredType;
        this.A00 = C10110Gpb.A00;
        this._property = interfaceC10017Gnp;
        this._valueTypeSerializer = abstractC9996GnP;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = abstractC10187Gqy;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }
}
