package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.AbstractC9986Gn8;
import X.AnonymousClass002;
import X.C10119Gpk;
import X.C3cG;
import X.C6xC;
import X.C8j3;
import X.EnumC10062Goj;
import X.EnumC9834GiY;
import X.InterfaceC10017Gnp;
import X.InterfaceC10165Gqa;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.EnumSet;

/* loaded from: classes6.dex */
public class EnumSetDeserializer extends StdDeserializer<EnumSet<?>> implements InterfaceC9830GiT {
    public static final long serialVersionUID = 2;
    public JsonDeserializer<Enum<?>> _enumDeserializer;
    public final AbstractC9870GjI _enumType;
    public final InterfaceC10165Gqa _nullProvider;
    public final boolean _skipNullValues;
    public final Boolean _unwrapSingle;
    public final AbstractC9986Gn8 _valueTypeDeserializer;

    public EnumSetDeserializer(AbstractC9870GjI abstractC9870GjI, AbstractC9986Gn8 abstractC9986Gn8) {
        super((Class<?>) EnumSet.class);
        this._enumType = abstractC9870GjI;
        if (!abstractC9870GjI.A0S()) {
            throw C8j3.A0w(" not Java Enum type", C3cG.A0f(abstractC9870GjI, "Type "));
        }
        this._enumDeserializer = null;
        this._valueTypeDeserializer = abstractC9986Gn8;
        this._unwrapSingle = null;
        this._nullProvider = null;
        this._skipNullValues = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final EnumSet<?> A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        EnumSet<?> enumSetNoneOf = EnumSet.noneOf(this._enumType._class);
        if (abstractC9916Gl7.A1x()) {
            A01(abstractC9916Gl7, abstractC9904Gkk, this, enumSetNoneOf);
            return enumSetNoneOf;
        }
        A02(abstractC9916Gl7, abstractC9904Gkk, this, enumSetNoneOf);
        return enumSetNoneOf;
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/Gl7;LX/Gkk;Ljava/util/EnumSet;)Ljava/util/EnumSet<*>; */
    public static final void A01(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, EnumSetDeserializer enumSetDeserializer, EnumSet enumSet) {
        Enum<?> enumA0i;
        AbstractC9986Gn8 abstractC9986Gn8 = enumSetDeserializer._valueTypeDeserializer;
        while (true) {
            try {
                EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
                if (enumC9834GiYA1P == EnumC9834GiY.END_ARRAY) {
                    return;
                }
                if (enumC9834GiYA1P != EnumC9834GiY.VALUE_NULL) {
                    JsonDeserializer<Enum<?>> jsonDeserializer = enumSetDeserializer._enumDeserializer;
                    enumA0i = abstractC9986Gn8 == null ? jsonDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk) : (Enum) jsonDeserializer.A0j(abstractC9916Gl7, abstractC9904Gkk, abstractC9986Gn8);
                } else if (!enumSetDeserializer._skipNullValues) {
                    enumA0i = (Enum) enumSetDeserializer._nullProvider.AIA(abstractC9904Gkk);
                }
                if (enumA0i != null) {
                    enumSet.add(enumA0i);
                }
            } catch (Exception e) {
                throw JsonMappingException.A03(enumSet, e, enumSet.size());
            }
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/Gl7;LX/Gkk;Ljava/util/EnumSet;)Ljava/util/EnumSet<*>; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.AbstractC9916Gl7 r2, X.AbstractC9904Gkk r3, com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer r4, java.util.EnumSet r5) {
        /*
            java.lang.Boolean r1 = r4._unwrapSingle
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r1 == r0) goto L14
            if (r1 != 0) goto L24
            X.Gmd r0 = X.EnumC9965Gmd.A04
            int r1 = r3._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L24
        L14:
            boolean r0 = X.AbstractC7607F5u.A1W(r2)
            if (r0 == 0) goto L2a
            X.GjI r0 = r4._enumType
            r3.A0V(r2, r0)
        L1f:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L24:
            java.lang.Class<java.util.EnumSet> r0 = java.util.EnumSet.class
            r3.A0X(r2, r0)
            goto L1f
        L2a:
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Enum<?>> r0 = r4._enumDeserializer     // Catch: java.lang.Exception -> L38
            java.lang.Object r0 = r0.A0i(r2, r3)     // Catch: java.lang.Exception -> L38
            java.lang.Enum r0 = (java.lang.Enum) r0     // Catch: java.lang.Exception -> L38
            if (r0 == 0) goto L37
            r5.add(r0)     // Catch: java.lang.Exception -> L38
        L37:
            return
        L38:
            r1 = move-exception
            int r0 = r5.size()
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.A03(r5, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer.A02(X.Gl7, X.Gkk, com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer, java.util.EnumSet):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        Boolean boolA10 = A10(EnumC10062Goj.A01, interfaceC10017Gnp, abstractC9904Gkk, EnumSet.class);
        JsonDeserializer<Enum<?>> jsonDeserializer = this._enumDeserializer;
        AbstractC9870GjI abstractC9870GjI = this._enumType;
        JsonDeserializer<Enum<?>> jsonDeserializerA0G = jsonDeserializer == null ? abstractC9904Gkk.A0G(interfaceC10017Gnp, abstractC9870GjI) : abstractC9904Gkk.A0I(interfaceC10017Gnp, abstractC9870GjI, jsonDeserializer);
        AbstractC9986Gn8 abstractC9986Gn8A03 = this._valueTypeDeserializer;
        if (abstractC9986Gn8A03 != null) {
            abstractC9986Gn8A03 = abstractC9986Gn8A03.A03(interfaceC10017Gnp);
        }
        return (C6xC.A00(this._unwrapSingle, boolA10) && this._enumDeserializer == jsonDeserializerA0G && this._valueTypeDeserializer == abstractC9986Gn8A03 && this._nullProvider == jsonDeserializerA0G) ? this : new EnumSetDeserializer(jsonDeserializerA0G, A0y(interfaceC10017Gnp, abstractC9904Gkk, jsonDeserializerA0G), this, boolA10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnumSetDeserializer(EnumSetDeserializer enumSetDeserializer, JsonDeserializer<?> jsonDeserializer, InterfaceC10165Gqa interfaceC10165Gqa, Boolean bool) {
        super((StdDeserializer<?>) interfaceC10165Gqa);
        this._enumType = interfaceC10165Gqa._enumType;
        this._enumDeserializer = enumSetDeserializer;
        this._valueTypeDeserializer = interfaceC10165Gqa._valueTypeDeserializer;
        this._nullProvider = jsonDeserializer;
        this._skipNullValues = AnonymousClass002.A1Z(jsonDeserializer, C10119Gpk.A01);
        this._unwrapSingle = bool;
    }
}
