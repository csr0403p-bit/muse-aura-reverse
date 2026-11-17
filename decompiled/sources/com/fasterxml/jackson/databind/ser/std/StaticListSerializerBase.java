package com.fasterxml.jackson.databind.ser.std;

import X.InterfaceC9833GiW;
import java.util.Collection;

/* loaded from: classes6.dex */
public abstract class StaticListSerializerBase<T extends Collection<?>> extends StdSerializer<T> implements InterfaceC9833GiW {
    public final Boolean _unwrapSingle;

    public StaticListSerializerBase(Class<?> cls) {
        super(cls, false);
        this._unwrapSingle = null;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    @Override // X.InterfaceC9833GiW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer A7f(X.InterfaceC10017Gnp r5, X.AbstractC9842Gii r6) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L42
            X.Gks r0 = X.AbstractC9849Git.A03(r6)
            X.Gmj r1 = r5.AHe()
            if (r1 == 0) goto L42
            java.lang.Object r0 = r0.A0T(r1)
            if (r0 == 0) goto L42
            com.fasterxml.jackson.databind.JsonSerializer r2 = r6.A0Q(r1, r0)
        L17:
            java.lang.Class<T> r0 = r4._handledType
            X.GkV r1 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A02(r5, r6, r0)
            if (r1 == 0) goto L40
            X.Goj r0 = X.EnumC10062Goj.A04
            java.lang.Boolean r1 = r1.A01(r0)
        L25:
            com.fasterxml.jackson.databind.JsonSerializer r2 = r4.A0F(r5, r2, r6)
            if (r2 != 0) goto L31
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            com.fasterxml.jackson.databind.JsonSerializer r2 = r6.A0L(r5, r0)
        L31:
            boolean r0 = X.AbstractC9855Gj3.A0K(r2)
            if (r0 == 0) goto L54
            java.lang.Boolean r0 = r4._unwrapSingle
            boolean r0 = X.C6xC.A00(r1, r0)
            if (r0 == 0) goto L44
            return r4
        L40:
            r1 = r3
            goto L25
        L42:
            r2 = r3
            goto L17
        L44:
            boolean r0 = r4 instanceof com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer
            if (r0 == 0) goto L4e
            com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer r0 = new com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer
            r0.<init>(r4, r1)
            return r0
        L4e:
            com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer r0 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer
            r0.<init>(r4, r1)
            return r0
        L54:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            X.Gj8 r0 = r6.A0B()
            X.GjI r1 = r0.A09(r1)
            r5 = 1
            java.lang.Class<java.util.Collection> r4 = java.util.Collection.class
            com.fasterxml.jackson.databind.ser.std.CollectionSerializer r0 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase.A7f(X.Gnp, X.Gii):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public StaticListSerializerBase(StaticListSerializerBase<?> staticListSerializerBase, Boolean bool) {
        super(staticListSerializerBase);
        this._unwrapSingle = bool;
    }
}
