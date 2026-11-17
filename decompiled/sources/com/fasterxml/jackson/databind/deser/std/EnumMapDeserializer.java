package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9849Git;
import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9877Gjl;
import X.AbstractC9904Gkk;
import X.AbstractC9944Glx;
import X.AbstractC9986Gn8;
import X.BV4;
import X.C10104GpS;
import X.C60Q;
import X.C9921GlI;
import X.C9931GlS;
import X.EnumC9951GmA;
import X.F60;
import X.InterfaceC10017Gnp;
import X.InterfaceC10165Gqa;
import X.InterfaceC10183Gqt;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.util.EnumMap;

/* loaded from: classes6.dex */
public class EnumMapDeserializer extends ContainerDeserializerBase<EnumMap<?, ?>> implements InterfaceC9830GiT, InterfaceC10183Gqt {
    public static final long serialVersionUID = 1;
    public JsonDeserializer<Object> _delegateDeserializer;
    public final Class<?> _enumClass;
    public AbstractC9877Gjl _keyDeserializer;
    public C9931GlS _propertyBasedCreator;
    public JsonDeserializer<Object> _valueDeserializer;
    public final AbstractC9944Glx _valueInstantiator;
    public final AbstractC9986Gn8 _valueTypeDeserializer;

    public EnumMapDeserializer(AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer, AbstractC9944Glx abstractC9944Glx, AbstractC9986Gn8 abstractC9986Gn8) {
        super(abstractC9870GjI, (InterfaceC10165Gqa) null, (Boolean) null);
        this._enumClass = abstractC9870GjI.A08()._class;
        this._keyDeserializer = null;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = abstractC9986Gn8;
        this._valueInstantiator = abstractC9944Glx;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        AbstractC9877Gjl abstractC9877GjlA0L = this._keyDeserializer;
        if (abstractC9877GjlA0L == null) {
            abstractC9877GjlA0L = abstractC9904Gkk.A0L(this._containerType.A08());
        }
        JsonDeserializer<Object> jsonDeserializerA0J = JsonDeserializer.A0J(interfaceC10017Gnp, abstractC9904Gkk, this._valueDeserializer, this);
        AbstractC9986Gn8 abstractC9986Gn8A03 = this._valueTypeDeserializer;
        if (abstractC9986Gn8A03 != null) {
            abstractC9986Gn8A03 = abstractC9986Gn8A03.A03(interfaceC10017Gnp);
        }
        InterfaceC10165Gqa interfaceC10165GqaA0y = A0y(interfaceC10017Gnp, abstractC9904Gkk, jsonDeserializerA0J);
        return (abstractC9877GjlA0L == this._keyDeserializer && interfaceC10165GqaA0y == this._nullProvider && jsonDeserializerA0J == this._valueDeserializer && abstractC9986Gn8A03 == this._valueTypeDeserializer) ? this : new EnumMapDeserializer(jsonDeserializerA0J, abstractC9877GjlA0L, interfaceC10165GqaA0y, this, abstractC9986Gn8A03);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cb A[Catch: Exception -> 0x00d2, TryCatch #0 {Exception -> 0x00d2, blocks: (B:53:0x00c4, B:41:0x0099, B:43:0x009d, B:45:0x00a1, B:46:0x00a6, B:49:0x00ac, B:50:0x00b1, B:54:0x00cb), top: B:62:0x0099 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00be -> B:9:0x001b). Please report as a decompilation issue!!! */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.EnumMap<?, ?> A0i(X.AbstractC9916Gl7 r8, X.AbstractC9904Gkk r9) throws java.io.IOException {
        /*
            r7 = this;
            X.GlS r4 = r7._propertyBasedCreator
            if (r4 == 0) goto L36
            r2 = 0
            X.Gli r3 = r4.A01(r8, r9, r2)
            boolean r0 = r8.A1y()
            if (r0 != 0) goto Lbe
            X.GiY r0 = X.EnumC9834GiY.FIELD_NAME
            boolean r0 = r8.A22(r0)
            if (r0 == 0) goto L1b
            java.lang.String r2 = r8.A1a()
        L1b:
            if (r2 == 0) goto Lcb
            X.GiY r6 = r8.A1P()
            X.Gl5 r1 = com.fasterxml.jackson.databind.JsonDeserializer.A0M(r4, r2)
            if (r1 == 0) goto L68
            java.lang.Object r0 = r1.A0C(r8, r9)
            boolean r0 = r3.A03(r1, r0)
            if (r0 == 0) goto Lbe
            r8.A1P()
            goto Lc4
        L36:
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r7._delegateDeserializer
            if (r0 == 0) goto L47
            X.Glx r1 = r7._valueInstantiator
            java.lang.Object r0 = r0.A0i(r8, r9)
            java.lang.Object r0 = r1.A05(r9, r0)
        L44:
            java.util.EnumMap r0 = (java.util.EnumMap) r0
            return r0
        L47:
            int r1 = r8.A1B()
            r0 = 1
            if (r1 == r0) goto Ldf
            r0 = 2
            if (r1 == r0) goto Ldf
            r0 = 3
            if (r1 == r0) goto L63
            r0 = 5
            if (r1 == r0) goto Ldf
            r0 = 6
            if (r1 == r0) goto L5e
            com.fasterxml.jackson.databind.JsonDeserializer.A0S(r8, r9, r7)
            goto L8d
        L5e:
            java.lang.Object r0 = r7.A17(r8, r9)
            goto L44
        L63:
            java.lang.Object r0 = r7.A16(r8, r9)
            goto L44
        L68:
            X.Gjl r0 = r7._keyDeserializer
            java.lang.Object r5 = r0.A00(r9, r2)
            if (r5 != 0) goto L99
            X.Gmd r0 = X.EnumC9965Gmd.A0J
            int r1 = r9._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 != 0) goto L92
            java.lang.Class<?> r3 = r7._enumClass
            X.GjI r0 = r7._containerType
            X.GjI r0 = r0.A08()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "value not one of declared Enum instance names for %s"
            r9.A0k(r3, r2, r0, r1)
        L8d:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L92:
            r8.A1P()
            r8.A1j()
            goto Lbe
        L99:
            X.GiY r0 = X.EnumC9834GiY.VALUE_NULL     // Catch: java.lang.Exception -> Ld2
            if (r6 != r0) goto La6
            boolean r0 = r7._skipNullValues     // Catch: java.lang.Exception -> Ld2
            if (r0 != 0) goto Lbe
            java.lang.Object r2 = com.fasterxml.jackson.databind.JsonDeserializer.A0R(r9, r7)     // Catch: java.lang.Exception -> Ld2
            goto Lb5
        La6:
            X.Gn8 r1 = r7._valueTypeDeserializer     // Catch: java.lang.Exception -> Ld2
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r7._valueDeserializer
            if (r1 != 0) goto Lb1
            java.lang.Object r2 = r0.A0i(r8, r9)     // Catch: java.lang.Exception -> Ld2
            goto Lb5
        Lb1:
            java.lang.Object r2 = r0.A0j(r8, r9, r1)     // Catch: java.lang.Exception -> Ld2
        Lb5:
            X.GpX r1 = r3.A03
            X.GqF r0 = new X.GqF
            r0.<init>(r1, r2, r5)
            r3.A03 = r0
        Lbe:
            java.lang.String r2 = r8.A1d()
            goto L1b
        Lc4:
            java.lang.Object r0 = r4.A02(r9, r3)     // Catch: java.lang.Exception -> Ld2
            java.util.EnumMap r0 = (java.util.EnumMap) r0     // Catch: java.lang.Exception -> Ld2
            goto Le3
        Lcb:
            java.lang.Object r0 = r4.A02(r9, r3)     // Catch: java.lang.Exception -> Ld2
            java.util.EnumMap r0 = (java.util.EnumMap) r0     // Catch: java.lang.Exception -> Ld2
            return r0
        Ld2:
            r1 = move-exception
            X.GjI r0 = r7._containerType
            java.lang.Class<?> r0 = r0._class
            com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase.A05(r9, r0, r2, r1)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        Ldf:
            java.util.EnumMap r0 = A01(r9, r7)
        Le3:
            A02(r8, r9, r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer.A0i(X.Gl7, X.Gkk):java.util.EnumMap");
    }

    public static final EnumMap A01(AbstractC9904Gkk abstractC9904Gkk, EnumMapDeserializer enumMapDeserializer) throws IOException {
        AbstractC9944Glx abstractC9944Glx = enumMapDeserializer._valueInstantiator;
        if (abstractC9944Glx == null) {
            return new EnumMap(enumMapDeserializer._enumClass);
        }
        try {
            if (abstractC9944Glx.A09()) {
                return (EnumMap) abstractC9944Glx.A0D(abstractC9904Gkk);
            }
            abstractC9904Gkk.A0d(abstractC9944Glx, enumMapDeserializer.A0h(), "no default constructor found", BV4.A1W());
            throw F60.createAndThrow();
        } catch (IOException e) {
            C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
            if (e instanceof JsonMappingException) {
                throw e;
            }
            JsonMappingException jsonMappingException = new JsonMappingException(abstractC9904Gkk == null ? null : abstractC9904Gkk.A00, e.getMessage());
            jsonMappingException.initCause(e);
            throw jsonMappingException;
        }
    }

    @Override // X.InterfaceC10183Gqt
    public final void AbV(AbstractC9904Gkk abstractC9904Gkk) {
        AbstractC9870GjI abstractC9870GjI;
        Object[] objArr;
        String str;
        AbstractC9870GjI abstractC9870GjI2;
        AbstractC9944Glx abstractC9944Glx = this._valueInstantiator;
        if (abstractC9944Glx != null) {
            if (abstractC9944Glx.A0A()) {
                if (!(abstractC9944Glx instanceof C9921GlI) || (abstractC9870GjI2 = ((C9921GlI) abstractC9944Glx)._delegateType) == null) {
                    abstractC9870GjI = this._containerType;
                    objArr = new Object[]{abstractC9870GjI, C60Q.A0e(abstractC9944Glx)};
                    str = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'";
                    AbstractC9849Git.A07(abstractC9904Gkk, abstractC9870GjI, str, objArr);
                    throw F60.createAndThrow();
                }
                this._delegateDeserializer = abstractC9904Gkk.A0G(null, abstractC9870GjI2);
            }
            if (!abstractC9944Glx.A08()) {
                if (abstractC9944Glx.A06()) {
                    this._propertyBasedCreator = C9931GlS.A00(abstractC9904Gkk, this._valueInstantiator, abstractC9944Glx.A0C(abstractC9904Gkk._config), abstractC9904Gkk._config.A09(EnumC9951GmA.A02));
                    return;
                }
                return;
            }
            if (!(abstractC9944Glx instanceof C9921GlI) || (abstractC9870GjI2 = ((C9921GlI) abstractC9944Glx)._arrayDelegateType) == null) {
                abstractC9870GjI = this._containerType;
                objArr = new Object[]{abstractC9870GjI, C60Q.A0e(abstractC9944Glx)};
                str = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
                AbstractC9849Git.A07(abstractC9904Gkk, abstractC9870GjI, str, objArr);
                throw F60.createAndThrow();
            }
            this._delegateDeserializer = abstractC9904Gkk.A0G(null, abstractC9870GjI2);
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/Gl7;LX/Gkk;Ljava/util/EnumMap;)Ljava/util/EnumMap<**>; */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002a -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.AbstractC9916Gl7 r6, X.AbstractC9904Gkk r7, com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer r8, java.util.EnumMap r9) {
        /*
            r6.A1o(r9)
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r5 = r8._valueDeserializer
            X.Gn8 r4 = r8._valueTypeDeserializer
            boolean r0 = r6.A1y()
            r3 = 0
            if (r0 != 0) goto L2a
            X.GiY r1 = r6.A1N()
            X.GiY r2 = X.EnumC9834GiY.FIELD_NAME
            if (r1 == r2) goto L25
            X.GiY r0 = X.EnumC9834GiY.END_OBJECT
            if (r1 == r0) goto L85
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r7.A0Z(r2, r8, r1, r0)
        L20:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L25:
            java.lang.String r3 = r6.A1a()
            goto L2e
        L2a:
            java.lang.String r3 = r6.A1d()
        L2e:
            if (r3 == 0) goto L85
            X.Gjl r0 = r8._keyDeserializer
            java.lang.Object r2 = r0.A00(r7, r3)
            java.lang.Enum r2 = (java.lang.Enum) r2
            X.GiY r1 = r6.A1P()
            if (r2 != 0) goto L60
            X.Gmd r0 = X.EnumC9965Gmd.A0J
            int r1 = r7._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 != 0) goto L5c
            java.lang.Class<?> r2 = r8._enumClass
            X.GjI r0 = r8._containerType
            X.GjI r0 = r0.A08()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "value not one of declared Enum instance names for %s"
            r7.A0k(r2, r3, r0, r1)
            goto L20
        L5c:
            r6.A1j()
            goto L2a
        L60:
            X.GiY r0 = X.EnumC9834GiY.VALUE_NULL     // Catch: java.lang.Exception -> L7c
            if (r1 != r0) goto L6d
            boolean r0 = r8._skipNullValues     // Catch: java.lang.Exception -> L7c
            if (r0 != 0) goto L2a
            java.lang.Object r0 = com.fasterxml.jackson.databind.JsonDeserializer.A0R(r7, r8)     // Catch: java.lang.Exception -> L7c
            goto L78
        L6d:
            if (r4 != 0) goto L74
            java.lang.Object r0 = r5.A0i(r6, r7)     // Catch: java.lang.Exception -> L7c
            goto L78
        L74:
            java.lang.Object r0 = r5.A0j(r6, r7, r4)     // Catch: java.lang.Exception -> L7c
        L78:
            r9.put(r2, r0)
            goto L2a
        L7c:
            r0 = move-exception
            com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase.A05(r7, r9, r3, r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer.A02(X.Gl7, X.Gkk, com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer, java.util.EnumMap):void");
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/fasterxml/jackson/databind/deser/std/EnumMapDeserializer;LX/Gjl;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;LX/Gn8;LX/Gqa;)V */
    public EnumMapDeserializer(JsonDeserializer jsonDeserializer, AbstractC9877Gjl abstractC9877Gjl, InterfaceC10165Gqa interfaceC10165Gqa, EnumMapDeserializer enumMapDeserializer, AbstractC9986Gn8 abstractC9986Gn8) {
        super((ContainerDeserializerBase<?>) interfaceC10165Gqa, enumMapDeserializer, enumMapDeserializer._unwrapSingle);
        this._enumClass = enumMapDeserializer._enumClass;
        this._keyDeserializer = abstractC9877Gjl;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = abstractC9986Gn8;
        this._valueInstantiator = enumMapDeserializer._valueInstantiator;
        this._delegateDeserializer = enumMapDeserializer._delegateDeserializer;
        this._propertyBasedCreator = enumMapDeserializer._propertyBasedCreator;
    }
}
