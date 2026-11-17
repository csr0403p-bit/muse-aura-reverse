package com.fasterxml.jackson.datatype.guava.deser.cache;

import X.AbstractC9870GjI;
import X.AbstractC9877Gjl;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.AbstractC9986Gn8;
import X.AnonymousClass002;
import X.C10119Gpk;
import X.C9868GjG;
import X.HsZ;
import X.InterfaceC10017Gnp;
import X.InterfaceC10165Gqa;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.datatype.guava.SimpleCacheDeserializer;

/* loaded from: classes6.dex */
public abstract class GuavaCacheDeserializer<T extends HsZ<Object, Object>> extends StdDeserializer<T> implements InterfaceC9830GiT {
    public static final long serialVersionUID = 1;
    public final JsonDeserializer<?> elementDeserializer;
    public final AbstractC9986Gn8 elementTypeDeserializer;
    public final AbstractC9877Gjl keyDeserializer;
    public final InterfaceC10165Gqa nullProvider;
    public final boolean skipNullValues;
    public final C9868GjG type;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r9.A1P() == r4) goto L12;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0060 -> B:10:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006b -> B:10:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0071 -> B:10:0x0040). Please report as a decompilation issue!!! */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T A0i(X.AbstractC9916Gl7 r9, X.AbstractC9904Gkk r10) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r8 = this;
            X.E8Q r0 = new X.E8Q
            r0.<init>()
            X.E8W r3 = r0.A00()
            r6 = r9
            X.GiY r1 = r9.A1N()
            X.GiY r4 = X.EnumC9834GiY.FIELD_NAME
            if (r1 == r4) goto L46
            X.GiY r0 = X.EnumC9834GiY.END_OBJECT
            if (r1 == r0) goto La0
            X.GiY r1 = X.EnumC9834GiY.START_OBJECT
            X.GiY r0 = r9.A1O()
            if (r0 == r1) goto L40
            java.lang.String r0 = "Expecting "
            java.lang.StringBuilder r1 = X.C3cG.A0f(r1, r0)
            java.lang.String r0 = " to start `Cache` value, found "
            r1.append(r0)
            X.GiY r0 = r9.A1N()
            java.lang.String r3 = X.C8j3.A14(r0, r1)
            X.GMj r2 = r9.A1I()
            r1 = 0
            com.fasterxml.jackson.databind.JsonMappingException r0 = new com.fasterxml.jackson.databind.JsonMappingException
            r0.<init>(r3, r1)
            r0._location = r2
            r0.A00 = r9
            throw r0
        L40:
            X.GiY r0 = r9.A1P()
            if (r0 != r4) goto La0
        L46:
            X.Gjl r1 = r8.keyDeserializer
            r5 = r10
            if (r1 == 0) goto L87
            java.lang.String r0 = r9.A1a()
            java.lang.Object r2 = r1.A00(r10, r0)
        L53:
            r9.A1P()
            X.GiY r0 = r9.A1N()
            X.GiY r7 = X.EnumC9834GiY.VALUE_NULL
            if (r0 != r7) goto L77
            boolean r0 = r8.skipNullValues
            if (r0 != 0) goto L40
            X.Gqa r0 = r8.nullProvider
            java.lang.Object r1 = r0.AIA(r10)
        L68:
            if (r1 != 0) goto L71
            r1 = 0
            X.E8S<K, V> r0 = r3.localCache     // Catch: java.lang.NullPointerException -> L8c
            r0.put(r2, r1)     // Catch: java.lang.NullPointerException -> L8c
            goto L40
        L71:
            X.E8S<K, V> r0 = r3.localCache
            r0.put(r2, r1)
            goto L40
        L77:
            X.Gn8 r1 = r8.elementTypeDeserializer
            com.fasterxml.jackson.databind.JsonDeserializer<?> r0 = r8.elementDeserializer
            if (r1 == 0) goto L82
            java.lang.Object r1 = r0.A0j(r9, r10, r1)
            goto L68
        L82:
            java.lang.Object r1 = r0.A0i(r9, r10)
            goto L68
        L87:
            java.lang.String r2 = r9.A1a()
            goto L53
        L8c:
            X.GjI r8 = r8._valueType
            java.lang.String r0 = X.AbstractC9855Gj3.A07(r3)
            java.lang.Object[] r10 = new java.lang.Object[]{r0}
            java.lang.String r9 = "Guava `Cache` of type %s does not accept `null` values"
            r5.A0U(r6, r7, r8, r9, r10)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        La0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.deser.cache.GuavaCacheDeserializer.A0i(X.Gl7, X.Gkk):X.E8W");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        AbstractC9877Gjl abstractC9877GjlA0L = this.keyDeserializer;
        if (abstractC9877GjlA0L == null) {
            abstractC9877GjlA0L = abstractC9904Gkk.A0L(this.type._keyType);
        }
        JsonDeserializer<?> jsonDeserializer = this.elementDeserializer;
        AbstractC9870GjI abstractC9870GjI = this.type._valueType;
        JsonDeserializer jsonDeserializerA0G = jsonDeserializer == null ? abstractC9904Gkk.A0G(interfaceC10017Gnp, abstractC9870GjI) : abstractC9904Gkk.A0I(interfaceC10017Gnp, abstractC9870GjI, jsonDeserializer);
        AbstractC9986Gn8 abstractC9986Gn8A03 = this.elementTypeDeserializer;
        if (abstractC9986Gn8A03 != null) {
            abstractC9986Gn8A03 = abstractC9986Gn8A03.A03(interfaceC10017Gnp);
        }
        return new SimpleCacheDeserializer(jsonDeserializerA0G, abstractC9877GjlA0L, A0y(interfaceC10017Gnp, abstractC9904Gkk, jsonDeserializerA0G), abstractC9986Gn8A03, this.type);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GjG;LX/Gjl;LX/Gn8;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;LX/Gqa;)V */
    public GuavaCacheDeserializer(JsonDeserializer jsonDeserializer, AbstractC9877Gjl abstractC9877Gjl, InterfaceC10165Gqa interfaceC10165Gqa, AbstractC9986Gn8 abstractC9986Gn8, C9868GjG c9868GjG) {
        super(c9868GjG);
        this.type = c9868GjG;
        this.keyDeserializer = abstractC9877Gjl;
        this.elementTypeDeserializer = abstractC9986Gn8;
        this.elementDeserializer = jsonDeserializer;
        this.nullProvider = interfaceC10165Gqa;
        this.skipNullValues = interfaceC10165Gqa == null ? false : AnonymousClass002.A1Z(interfaceC10165Gqa, C10119Gpk.A01);
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/Gl7;LX/Gkk;)TT; */
    private final void A01(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws JsonMappingException {
        A0i(abstractC9916Gl7, abstractC9904Gkk);
    }
}
