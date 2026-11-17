package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC7609F5w;
import X.AbstractC9849Git;
import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.AbstractC9944Glx;
import X.AbstractC9986Gn8;
import X.BV5;
import X.C10087GpB;
import X.C60Q;
import X.C6xC;
import X.C9921GlI;
import X.C9974Gmn;
import X.EnumC10062Goj;
import X.EnumC9834GiY;
import X.EnumC9965Gmd;
import X.F60;
import X.InterfaceC10017Gnp;
import X.InterfaceC10165Gqa;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.Collection;
import java.util.List;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class CollectionDeserializer extends ContainerDeserializerBase<Collection<Object>> implements InterfaceC9830GiT {
    public static final long serialVersionUID = -1;
    public final JsonDeserializer<Object> _delegateDeserializer;
    public final JsonDeserializer<Object> _valueDeserializer;
    public final AbstractC9944Glx _valueInstantiator;
    public final AbstractC9986Gn8 _valueTypeDeserializer;

    @Override // X.InterfaceC9830GiT
    public final /* bridge */ /* synthetic */ JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        JsonDeserializer<Object> jsonDeserializerA0G;
        AbstractC9870GjI abstractC9870GjI;
        Object[] objArr;
        String str;
        AbstractC9870GjI abstractC9870GjI2;
        AbstractC9944Glx abstractC9944Glx = this._valueInstantiator;
        if (abstractC9944Glx == null) {
            jsonDeserializerA0G = null;
        } else if (abstractC9944Glx.A0A()) {
            if (!(abstractC9944Glx instanceof C9921GlI) || (abstractC9870GjI2 = ((C9921GlI) abstractC9944Glx)._delegateType) == null) {
                abstractC9870GjI = this._containerType;
                objArr = new Object[]{abstractC9870GjI, C60Q.A0e(abstractC9944Glx)};
                str = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'";
                AbstractC9849Git.A07(abstractC9904Gkk, abstractC9870GjI, str, objArr);
                throw F60.createAndThrow();
            }
            jsonDeserializerA0G = abstractC9904Gkk.A0G(interfaceC10017Gnp, abstractC9870GjI2);
        } else {
            if (abstractC9944Glx.A08()) {
                if (!(abstractC9944Glx instanceof C9921GlI) || (abstractC9870GjI2 = ((C9921GlI) abstractC9944Glx)._arrayDelegateType) == null) {
                    abstractC9870GjI = this._containerType;
                    objArr = new Object[]{abstractC9870GjI, C60Q.A0e(abstractC9944Glx)};
                    str = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
                    AbstractC9849Git.A07(abstractC9904Gkk, abstractC9870GjI, str, objArr);
                    throw F60.createAndThrow();
                }
                jsonDeserializerA0G = abstractC9904Gkk.A0G(interfaceC10017Gnp, abstractC9870GjI2);
            }
            jsonDeserializerA0G = null;
        }
        Boolean boolA10 = A10(EnumC10062Goj.A01, interfaceC10017Gnp, abstractC9904Gkk, Collection.class);
        JsonDeserializer<Object> jsonDeserializerA0J = JsonDeserializer.A0J(interfaceC10017Gnp, abstractC9904Gkk, StdDeserializer.A07(interfaceC10017Gnp, abstractC9904Gkk, this._valueDeserializer), this);
        AbstractC9986Gn8 abstractC9986Gn8A03 = this._valueTypeDeserializer;
        if (abstractC9986Gn8A03 != null) {
            abstractC9986Gn8A03 = abstractC9986Gn8A03.A03(interfaceC10017Gnp);
        }
        InterfaceC10165Gqa interfaceC10165GqaA0y = A0y(interfaceC10017Gnp, abstractC9904Gkk, jsonDeserializerA0J);
        if (C6xC.A00(boolA10, this._unwrapSingle) && interfaceC10165GqaA0y == this._nullProvider && jsonDeserializerA0G == this._delegateDeserializer && jsonDeserializerA0J == this._valueDeserializer && abstractC9986Gn8A03 == this._valueTypeDeserializer) {
            return this;
        }
        boolean z = this instanceof ArrayBlockingQueueDeserializer;
        AbstractC9870GjI abstractC9870GjI3 = this._containerType;
        AbstractC9944Glx abstractC9944Glx2 = this._valueInstantiator;
        return z ? new ArrayBlockingQueueDeserializer(abstractC9870GjI3, jsonDeserializerA0J, jsonDeserializerA0G, interfaceC10165GqaA0y, abstractC9944Glx2, abstractC9986Gn8A03, boolA10) : new CollectionDeserializer(abstractC9870GjI3, jsonDeserializerA0J, jsonDeserializerA0G, interfaceC10165GqaA0y, abstractC9944Glx2, abstractC9986Gn8A03, boolA10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection<java.lang.Object> A0i(X.AbstractC9916Gl7 r4, X.AbstractC9904Gkk r5) throws com.fasterxml.jackson.databind.exc.InvalidFormatException {
        /*
            r3 = this;
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r3._delegateDeserializer
            if (r0 == 0) goto L11
            X.Glx r1 = r3._valueInstantiator
            java.lang.Object r0 = r0.A0i(r4, r5)
            java.lang.Object r0 = r1.A05(r5, r0)
        Le:
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
        L11:
            boolean r0 = r4.A1x()
            if (r0 == 0) goto L2a
            boolean r0 = r3 instanceof com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer
            if (r0 == 0) goto L21
            r0 = 0
        L1c:
            java.util.Collection r0 = r3.A1K(r4, r5, r0)
            return r0
        L21:
            X.Glx r0 = r3._valueInstantiator
            java.lang.Object r0 = r0.A0D(r5)
            java.util.Collection r0 = (java.util.Collection) r0
            goto L1c
        L2a:
            X.GiY r0 = X.EnumC9834GiY.VALUE_STRING
            boolean r0 = r4.A22(r0)
            if (r0 == 0) goto L62
            java.lang.String r1 = r4.A1c()
            java.lang.Class r2 = r3.A0h()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L53
            X.GnW r1 = X.EnumC10000GnW.Collection
            java.lang.Integer r0 = X.C79.A0c
            X.Got r0 = r5.A0O(r1, r2, r0)
            if (r0 == 0) goto L62
            X.Got r1 = X.EnumC10072Got.Fail
        L4c:
            if (r0 == r1) goto L62
            java.lang.Object r0 = r3.A18(r5, r0, r2)
            goto Le
        L53:
            boolean r0 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0F(r1)
            if (r0 == 0) goto L62
            X.GnW r0 = X.EnumC10000GnW.Collection
            X.Got r1 = X.EnumC10072Got.Fail
            X.Got r0 = r5.A0N(r1, r0, r2)
            goto L4c
        L62:
            boolean r0 = r3 instanceof com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer
            if (r0 == 0) goto L6b
            r0 = 0
        L67:
            A01(r4, r5, r3, r0)
            return r0
        L6b:
            X.Glx r0 = r3._valueInstantiator
            java.lang.Object r0 = r0.A0D(r5)
            java.util.Collection r0 = (java.util.Collection) r0
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.A0i(X.Gl7, X.Gkk):java.util.Collection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (X.AbstractC7609F5w.A1U(X.EnumC9965Gmd.A04._mask, r4._featureFlags) != false) goto L7;
     */
    /* JADX WARN: Incorrect return type in method signature: (LX/Gl7;LX/Gkk;Ljava/util/Collection<Ljava/lang/Object;>;)Ljava/util/Collection<Ljava/lang/Object;>; */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.AbstractC9916Gl7 r3, X.AbstractC9904Gkk r4, com.fasterxml.jackson.databind.deser.std.CollectionDeserializer r5, java.util.Collection r6) {
        /*
            java.lang.Boolean r1 = r5._unwrapSingle
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r1 == r0) goto L14
            if (r1 != 0) goto L57
            X.Gmd r0 = X.EnumC9965Gmd.A04
            int r1 = r4._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L57
        L14:
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r2 = r5._valueDeserializer
            X.Gn8 r1 = r5._valueTypeDeserializer
            boolean r0 = X.AbstractC7607F5u.A1W(r3)     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L27
            boolean r0 = r5._skipNullValues     // Catch: java.lang.Exception -> L3c
            if (r0 != 0) goto L3b
            java.lang.Object r0 = com.fasterxml.jackson.databind.JsonDeserializer.A0R(r4, r5)     // Catch: java.lang.Exception -> L3c
            goto L32
        L27:
            if (r1 != 0) goto L2e
            java.lang.Object r0 = r2.A0i(r3, r4)     // Catch: java.lang.Exception -> L3c
            goto L32
        L2e:
            java.lang.Object r0 = r2.A0j(r3, r4, r1)     // Catch: java.lang.Exception -> L3c
        L32:
            if (r0 != 0) goto L38
            r5.A02(r3, r4, r6)     // Catch: java.lang.Exception -> L3c
            return
        L38:
            r6.add(r0)
        L3b:
            return
        L3c:
            r2 = move-exception
            X.Gmd r0 = X.EnumC9965Gmd.A0R
            int r1 = r4._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 != 0) goto L4c
            X.AbstractC9855Gj3.A0F(r2)
        L4c:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            int r0 = r6.size()
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.A03(r1, r2, r0)
            throw r0
        L57:
            X.GjI r0 = r5._containerType
            r4.A0V(r3, r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.A01(X.Gl7, X.Gkk, com.fasterxml.jackson.databind.deser.std.CollectionDeserializer, java.util.Collection):void");
    }

    private final void A02(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, Collection<?> collection) throws MismatchedInputException {
        if (this._skipNullValues) {
            return;
        }
        try {
            collection.add(null);
        } catch (NullPointerException unused) {
            abstractC9904Gkk.A0U(abstractC9916Gl7, EnumC9834GiY.VALUE_NULL, this._valueType, "`java.util.Collection` of type %s does not accept `null` values", AbstractC9855Gj3.A04(A0u(abstractC9904Gkk)));
            throw F60.createAndThrow();
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;Lcom/fasterxml/jackson/databind/JsonDeserializer<Ljava/lang/Object;>;LX/Gn8;LX/Glx;Lcom/fasterxml/jackson/databind/JsonDeserializer<Ljava/lang/Object;>;LX/Gqa;Ljava/lang/Boolean;)V */
    public CollectionDeserializer(AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2, InterfaceC10165Gqa interfaceC10165Gqa, AbstractC9944Glx abstractC9944Glx, AbstractC9986Gn8 abstractC9986Gn8, Boolean bool) {
        super(abstractC9870GjI, interfaceC10165Gqa, bool);
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = abstractC9986Gn8;
        this._valueInstantiator = abstractC9944Glx;
        this._delegateDeserializer = jsonDeserializer2;
    }

    public Collection<Object> A1K(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, Collection<Object> collection) throws JsonMappingException {
        Object objA0i;
        Object objA0i2;
        abstractC9916Gl7.A1o(collection);
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        try {
            if (jsonDeserializer.A0d() == null) {
                AbstractC9986Gn8 abstractC9986Gn8 = this._valueTypeDeserializer;
                while (true) {
                    EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
                    if (enumC9834GiYA1P == EnumC9834GiY.END_ARRAY) {
                        break;
                    }
                    if (enumC9834GiYA1P != EnumC9834GiY.VALUE_NULL) {
                        objA0i = abstractC9986Gn8 == null ? jsonDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk) : jsonDeserializer.A0j(abstractC9916Gl7, abstractC9904Gkk, abstractC9986Gn8);
                    } else if (!this._skipNullValues) {
                        objA0i = JsonDeserializer.A0R(abstractC9904Gkk, this);
                    }
                    if (objA0i == null) {
                        A02(abstractC9916Gl7, abstractC9904Gkk, collection);
                    } else {
                        collection.add(objA0i);
                    }
                }
            } else if (abstractC9916Gl7.A1x()) {
                abstractC9916Gl7.A1o(collection);
                AbstractC9986Gn8 abstractC9986Gn82 = this._valueTypeDeserializer;
                C10087GpB c10087GpB = new C10087GpB(collection);
                while (true) {
                    EnumC9834GiY enumC9834GiYA1P2 = abstractC9916Gl7.A1P();
                    if (enumC9834GiYA1P2 == EnumC9834GiY.END_ARRAY) {
                        break;
                    }
                    try {
                    } catch (UnresolvedForwardReference e) {
                        C9974Gmn c9974Gmn = new C9974Gmn(e, c10087GpB);
                        c10087GpB.A00.add(c9974Gmn);
                        e._roid.A00(c9974Gmn);
                    }
                    if (enumC9834GiYA1P2 != EnumC9834GiY.VALUE_NULL) {
                        objA0i2 = abstractC9986Gn82 == null ? jsonDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk) : jsonDeserializer.A0j(abstractC9916Gl7, abstractC9904Gkk, abstractC9986Gn82);
                    } else if (!this._skipNullValues) {
                        objA0i2 = JsonDeserializer.A0R(abstractC9904Gkk, this);
                    }
                    if (objA0i2 != null || !this._skipNullValues) {
                        List<C9974Gmn> list = c10087GpB.A00;
                        if (list.isEmpty()) {
                            c10087GpB.A01.add(objA0i2);
                        } else {
                            ((C9974Gmn) BV5.A0e(list)).A01.add(objA0i2);
                        }
                    }
                }
            } else {
                A01(abstractC9916Gl7, abstractC9904Gkk, this, collection);
            }
            return collection;
        } catch (Exception e2) {
            if (abstractC9904Gkk != null) {
                if (!AbstractC7609F5w.A1U(EnumC9965Gmd.A0R._mask, abstractC9904Gkk._featureFlags)) {
                    AbstractC9855Gj3.A0F(e2);
                }
            }
            throw JsonMappingException.A03(collection, e2, collection.size());
        }
    }
}
