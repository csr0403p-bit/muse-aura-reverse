package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC10109Gpa;
import X.AbstractC9842Gii;
import X.AbstractC9870GjI;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.C10091GpF;
import X.C10110Gpb;
import X.EnumC9834GiY;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class AsArraySerializerBase<T> extends ContainerSerializer<T> implements InterfaceC9833GiW {
    public AbstractC10109Gpa _dynamicSerializers;
    public final JsonSerializer<Object> _elementSerializer;
    public final AbstractC9870GjI _elementType;
    public final InterfaceC10017Gnp _property;
    public final boolean _staticTyping;
    public final Boolean _unwrapSingle;
    public final AbstractC9996GnP _valueTypeSerializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/GjI;ZLX/GnP;Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>;)V */
    public AsArraySerializerBase(AbstractC9870GjI abstractC9870GjI, JsonSerializer jsonSerializer, AbstractC9996GnP abstractC9996GnP, Class cls, boolean z) {
        super(cls, false);
        boolean z2 = false;
        this._elementType = abstractC9870GjI;
        if (z || (abstractC9870GjI != null && JsonSerializer.A08(abstractC9870GjI))) {
            z2 = true;
        }
        this._staticTyping = z2;
        this._valueTypeSerializer = abstractC9996GnP;
        this._property = null;
        this._elementSerializer = jsonSerializer;
        this._dynamicSerializers = C10110Gpb.A00;
        this._unwrapSingle = null;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/GlE;LX/Gii;LX/GnP;)V */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws Throwable {
        C10091GpF c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.START_ARRAY, abstractC9996GnP, obj);
        abstractC9919GlE.A0i(obj);
        if (this instanceof IterableSerializer) {
            IterableSerializer.A00(abstractC9919GlE, abstractC9842Gii, (IterableSerializer) this, (Iterable) obj);
        } else if (this instanceof EnumSetSerializer) {
            EnumSetSerializer.A00(abstractC9919GlE, abstractC9842Gii, (EnumSetSerializer) this, (EnumSet) obj);
        } else if (this instanceof CollectionSerializer) {
            CollectionSerializer.A00(abstractC9919GlE, abstractC9842Gii, (CollectionSerializer) this, (Collection) obj);
        } else if (this instanceof IteratorSerializer) {
            IteratorSerializer.A00(abstractC9919GlE, abstractC9842Gii, (IteratorSerializer) this, (Iterator) obj);
        } else {
            IndexedListSerializer.A00(abstractC9919GlE, abstractC9842Gii, (IndexedListSerializer) this, (List) obj);
        }
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    @Override // X.InterfaceC9833GiW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer A7f(X.InterfaceC10017Gnp r7, X.AbstractC9842Gii r8) {
        /*
            r6 = this;
            X.GnP r5 = r6._valueTypeSerializer
            r3 = r7
            if (r5 == 0) goto L9
            X.GnP r5 = r5.A05(r7)
        L9:
            r7 = 0
            if (r3 == 0) goto L63
            X.Gks r0 = X.AbstractC9849Git.A03(r8)
            X.Gmj r1 = r3.AHe()
            if (r1 == 0) goto L63
            java.lang.Object r0 = r0.A0T(r1)
            if (r0 == 0) goto L63
            com.fasterxml.jackson.databind.JsonSerializer r2 = r8.A0Q(r1, r0)
        L20:
            java.lang.Class<T> r0 = r6._handledType
            X.GkV r1 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A02(r3, r8, r0)
            if (r1 == 0) goto L2e
            X.Goj r0 = X.EnumC10062Goj.A04
            java.lang.Boolean r7 = r1.A01(r0)
        L2e:
            if (r2 != 0) goto L32
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r2 = r6._elementSerializer
        L32:
            com.fasterxml.jackson.databind.JsonSerializer r4 = r6.A0F(r3, r2, r8)
            if (r4 != 0) goto L4e
            X.GjI r2 = r6._elementType
            if (r2 == 0) goto L4e
            boolean r0 = r6._staticTyping
            if (r0 == 0) goto L4e
            java.lang.Class<?> r1 = r2._class
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = X.AnonymousClass002.A1Z(r1, r0)
            if (r0 != 0) goto L4e
            com.fasterxml.jackson.databind.JsonSerializer r4 = r8.A0H(r3, r2)
        L4e:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r0 = r6._elementSerializer
            if (r4 != r0) goto L65
            X.Gnp r0 = r6._property
            if (r3 != r0) goto L65
            X.GnP r0 = r6._valueTypeSerializer
            if (r0 != r5) goto L65
            java.lang.Boolean r0 = r6._unwrapSingle
            boolean r0 = X.C6xC.A00(r0, r7)
            if (r0 == 0) goto L65
            return r6
        L63:
            r2 = r7
            goto L20
        L65:
            boolean r0 = r6 instanceof com.fasterxml.jackson.databind.ser.std.IterableSerializer
            if (r0 == 0) goto L6f
            com.fasterxml.jackson.databind.ser.std.IterableSerializer r2 = new com.fasterxml.jackson.databind.ser.std.IterableSerializer
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L6f:
            boolean r0 = r6 instanceof com.fasterxml.jackson.databind.ser.std.EnumSetSerializer
            if (r0 == 0) goto L79
            com.fasterxml.jackson.databind.ser.std.EnumSetSerializer r2 = new com.fasterxml.jackson.databind.ser.std.EnumSetSerializer
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L79:
            boolean r0 = r6 instanceof com.fasterxml.jackson.databind.ser.std.CollectionSerializer
            if (r0 == 0) goto L83
            com.fasterxml.jackson.databind.ser.std.CollectionSerializer r2 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L83:
            boolean r0 = r6 instanceof com.fasterxml.jackson.databind.ser.impl.IteratorSerializer
            if (r0 == 0) goto L8d
            com.fasterxml.jackson.databind.ser.impl.IteratorSerializer r2 = new com.fasterxml.jackson.databind.ser.impl.IteratorSerializer
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L8d:
            com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer r2 = new com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase.A7f(X.Gnp, X.Gii):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/fasterxml/jackson/databind/ser/std/AsArraySerializerBase<*>;LX/Gnp;LX/GnP;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;Ljava/lang/Boolean;)V */
    public AsArraySerializerBase(InterfaceC10017Gnp interfaceC10017Gnp, JsonSerializer jsonSerializer, AbstractC9996GnP abstractC9996GnP, AsArraySerializerBase asArraySerializerBase, Boolean bool) {
        super(asArraySerializerBase._handledType, false);
        this._elementType = asArraySerializerBase._elementType;
        this._staticTyping = asArraySerializerBase._staticTyping;
        this._valueTypeSerializer = abstractC9996GnP;
        this._property = interfaceC10017Gnp;
        this._elementSerializer = jsonSerializer;
        this._dynamicSerializers = C10110Gpb.A00;
        this._unwrapSingle = bool;
    }
}
