package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.AbstractC9944Glx;
import X.InterfaceC10165Gqa;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

@JacksonStdImpl
/* loaded from: classes6.dex */
public final class StringCollectionDeserializer extends ContainerDeserializerBase<Collection<String>> implements InterfaceC9830GiT {
    public static final long serialVersionUID = 1;
    public final JsonDeserializer<Object> _delegateDeserializer;
    public final JsonDeserializer<String> _valueDeserializer;
    public final AbstractC9944Glx _valueInstantiator;

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // X.InterfaceC9830GiT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonDeserializer A7e(X.InterfaceC10017Gnp r11, X.AbstractC9904Gkk r12) {
        /*
            r10 = this;
            r4 = r10
            X.Glx r3 = r10._valueInstantiator
            r7 = 0
            if (r3 == 0) goto L63
            boolean r2 = r3 instanceof X.C9921GlI
            if (r2 == 0) goto L58
            r1 = r3
            X.GlI r1 = (X.C9921GlI) r1
            X.Gnx r0 = r1._arrayDelegateCreator
            if (r0 == 0) goto L58
            X.GjI r0 = r1._arrayDelegateType
        L13:
            com.fasterxml.jackson.databind.JsonDeserializer r6 = r12.A0G(r11, r0)
        L17:
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> r1 = r10._valueDeserializer
            X.GjI r0 = r10._containerType
            X.GjI r0 = r0.A07()
            if (r1 != 0) goto L53
            com.fasterxml.jackson.databind.JsonDeserializer r2 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A07(r11, r12, r1)
            if (r2 != 0) goto L2b
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r12.A0G(r11, r0)
        L2b:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            X.Goj r0 = X.EnumC10062Goj.A01
            java.lang.Boolean r10 = r10.A10(r0, r11, r12, r1)
            X.Gqa r8 = r4.A0y(r11, r12, r2)
            boolean r0 = X.AbstractC9855Gj3.A0K(r2)
            if (r0 != 0) goto L3e
            r7 = r2
        L3e:
            java.lang.Boolean r0 = r4._unwrapSingle
            boolean r0 = X.C6xC.A00(r0, r10)
            if (r0 == 0) goto L65
            X.Gqa r0 = r4._nullProvider
            if (r0 != r8) goto L65
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> r0 = r4._valueDeserializer
            if (r0 != r7) goto L65
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r4._delegateDeserializer
            if (r0 != r6) goto L65
            return r4
        L53:
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r12.A0I(r11, r0, r1)
            goto L2b
        L58:
            if (r2 == 0) goto L63
            X.GlI r3 = (X.C9921GlI) r3
            X.Gnx r0 = r3._delegateCreator
            if (r0 == 0) goto L63
            X.GjI r0 = r3._delegateType
            goto L13
        L63:
            r6 = r7
            goto L17
        L65:
            X.GjI r5 = r4._containerType
            X.Glx r9 = r4._valueInstantiator
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer r4 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.A7e(X.Gnp, X.Gkk):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Collection<String> A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        AbstractC9944Glx abstractC9944Glx = this._valueInstantiator;
        return jsonDeserializer != null ? A02(abstractC9944Glx.A05(abstractC9904Gkk, jsonDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk))) : A01(abstractC9916Gl7, abstractC9904Gkk, this, A02(abstractC9944Glx.A0D(abstractC9904Gkk)));
    }

    public static Collection<String> A02(Object obj) {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (cls == ArrayList.class) {
                return (ArrayList) obj;
            }
            if (cls == HashSet.class) {
                return (HashSet) obj;
            }
        }
        return (Collection) obj;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;LX/Glx;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;LX/Gqa;Ljava/lang/Boolean;)V */
    public StringCollectionDeserializer(AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2, InterfaceC10165Gqa interfaceC10165Gqa, AbstractC9944Glx abstractC9944Glx, Boolean bool) {
        super(abstractC9870GjI, interfaceC10165Gqa, bool);
        this._valueDeserializer = jsonDeserializer2;
        this._valueInstantiator = abstractC9944Glx;
        this._delegateDeserializer = jsonDeserializer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (X.AbstractC7609F5w.A1U(X.EnumC9965Gmd.A04._mask, r5._featureFlags) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Collection A01(X.AbstractC9916Gl7 r4, X.AbstractC9904Gkk r5, com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer r6, java.util.Collection r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.A01(X.Gl7, X.Gkk, com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer, java.util.Collection):java.util.Collection");
    }
}
