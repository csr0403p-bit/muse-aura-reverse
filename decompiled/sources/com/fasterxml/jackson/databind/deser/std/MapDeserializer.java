package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC10100GpO;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC9849Git;
import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9877Gjl;
import X.AbstractC9904Gkk;
import X.AbstractC9910Gks;
import X.AbstractC9916Gl7;
import X.AbstractC9944Glx;
import X.AbstractC9970Gmj;
import X.AbstractC9986Gn8;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.BV4;
import X.BV5;
import X.BV6;
import X.C10029Go4;
import X.C10088GpC;
import X.C10126Gpr;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C9921GlI;
import X.C9931GlS;
import X.C9973Gmm;
import X.EnumC10051GoV;
import X.EnumC9834GiY;
import X.EnumC9951GmA;
import X.F60;
import X.InterfaceC10017Gnp;
import X.InterfaceC10165Gqa;
import X.InterfaceC10183Gqt;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class MapDeserializer extends ContainerDeserializerBase<Map<Object, Object>> implements InterfaceC9830GiT, InterfaceC10183Gqt {
    public static final long serialVersionUID = 1;
    public boolean _checkDupSquash;
    public JsonDeserializer<Object> _delegateDeserializer;
    public final boolean _hasDefaultCreator;
    public Set<String> _ignorableProperties;
    public Set<String> _includableProperties;
    public C10126Gpr _inclusionChecker;
    public final AbstractC9877Gjl _keyDeserializer;
    public C9931GlS _propertyBasedCreator;
    public boolean _standardStringKey;
    public final JsonDeserializer<Object> _valueDeserializer;
    public final AbstractC9944Glx _valueInstantiator;
    public final AbstractC9986Gn8 _valueTypeDeserializer;

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;LX/Glx;LX/Gjl;Lcom/fasterxml/jackson/databind/JsonDeserializer<Ljava/lang/Object;>;LX/Gn8;)V */
    public MapDeserializer(AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer, AbstractC9877Gjl abstractC9877Gjl, AbstractC9944Glx abstractC9944Glx, AbstractC9986Gn8 abstractC9986Gn8) {
        super(abstractC9870GjI, (InterfaceC10165Gqa) null, (Boolean) null);
        this._keyDeserializer = abstractC9877Gjl;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = abstractC9986Gn8;
        this._valueInstantiator = abstractC9944Glx;
        this._hasDefaultCreator = abstractC9944Glx.A09();
        this._delegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._standardStringKey = A04(abstractC9870GjI, abstractC9877Gjl);
        this._inclusionChecker = null;
        this._checkDupSquash = AnonymousClass002.A1Z(abstractC9870GjI.A07()._class, Object.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[Catch: Exception -> 0x0176, TryCatch #1 {Exception -> 0x0176, blocks: (B:31:0x0076, B:22:0x0054, B:24:0x0058, B:26:0x005c, B:28:0x0063, B:29:0x0068, B:32:0x007e), top: B:104:0x0054 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:9:0x0022). Please report as a decompilation issue!!! */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Object, java.lang.Object> A0i(X.AbstractC9916Gl7 r14, X.AbstractC9904Gkk r15) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer.A0i(X.Gl7, X.Gkk):java.util.Map");
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/Gl7;LX/Gkk;Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;)Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>; */
    private final void A01(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, Map map) {
        C10088GpC c10088GpC;
        String strA1a;
        Object objA0i;
        AbstractC9877Gjl abstractC9877Gjl = this._keyDeserializer;
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        AbstractC9986Gn8 abstractC9986Gn8 = this._valueTypeDeserializer;
        boolean zA1X = AnonymousClass002.A1X(jsonDeserializer.A0d());
        if (zA1X) {
            c10088GpC = new C10088GpC();
            c10088GpC.A00 = C3cG.A0h();
            c10088GpC.A01 = map;
        } else {
            c10088GpC = null;
        }
        if (abstractC9916Gl7.A1y()) {
            strA1a = abstractC9916Gl7.A1d();
        } else {
            EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
            EnumC9834GiY enumC9834GiY = EnumC9834GiY.FIELD_NAME;
            if (enumC9834GiYA1N != enumC9834GiY) {
                if (enumC9834GiYA1N != EnumC9834GiY.END_OBJECT) {
                    abstractC9904Gkk.A0Z(enumC9834GiY, this, null, new Object[0]);
                    throw F60.createAndThrow();
                }
                return;
            }
            strA1a = abstractC9916Gl7.A1a();
        }
        while (strA1a != null) {
            Object objA00 = abstractC9877Gjl.A00(abstractC9904Gkk, strA1a);
            EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
            C10126Gpr c10126Gpr = this._inclusionChecker;
            if (c10126Gpr == null || !c10126Gpr.A00(strA1a)) {
                try {
                    if (enumC9834GiYA1P != EnumC9834GiY.VALUE_NULL) {
                        objA0i = abstractC9986Gn8 == null ? jsonDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk) : jsonDeserializer.A0j(abstractC9916Gl7, abstractC9904Gkk, abstractC9986Gn8);
                    } else if (!this._skipNullValues) {
                        objA0i = JsonDeserializer.A0R(abstractC9904Gkk, this);
                    }
                    if (zA1X) {
                        List<C9973Gmm> list = c10088GpC.A00;
                        (list.isEmpty() ? c10088GpC.A01 : ((C9973Gmm) BV5.A0e(list)).A02).put(objA00, objA0i);
                    } else {
                        Object objPut = map.put(objA00, objA0i);
                        if (objPut != null) {
                            A03(abstractC9904Gkk, objA00, objPut, objA0i, map);
                        }
                    }
                } catch (UnresolvedForwardReference e) {
                    A02(abstractC9904Gkk, e, c10088GpC, objA00);
                } catch (Exception e2) {
                    ContainerDeserializerBase.A05(abstractC9904Gkk, map, strA1a, e2);
                    throw F60.createAndThrow();
                }
            } else {
                abstractC9916Gl7.A1j();
            }
            strA1a = abstractC9916Gl7.A1d();
        }
    }

    public static final boolean A04(AbstractC9870GjI abstractC9870GjI, AbstractC9877Gjl abstractC9877Gjl) {
        AbstractC9870GjI abstractC9870GjIA08;
        Class<?> cls;
        return abstractC9877Gjl == null || (abstractC9870GjIA08 = abstractC9870GjI.A08()) == null || (((cls = abstractC9870GjIA08._class) == String.class || cls == Object.class) && AbstractC9855Gj3.A0K(abstractC9877Gjl));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.Collection, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.AbstractCollection, java.util.HashSet] */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        AbstractC9877Gjl abstractC9877GjlA0L = this._keyDeserializer;
        if (abstractC9877GjlA0L == null) {
            abstractC9877GjlA0L = abstractC9904Gkk.A0L(this._containerType.A08());
        }
        JsonDeserializer<Object> jsonDeserializerA07 = this._valueDeserializer;
        if (interfaceC10017Gnp != null) {
            jsonDeserializerA07 = StdDeserializer.A07(interfaceC10017Gnp, abstractC9904Gkk, jsonDeserializerA07);
        }
        JsonDeserializer<Object> jsonDeserializerA0J = JsonDeserializer.A0J(interfaceC10017Gnp, abstractC9904Gkk, jsonDeserializerA07, this);
        AbstractC9986Gn8 abstractC9986Gn8A03 = this._valueTypeDeserializer;
        if (abstractC9986Gn8A03 != null) {
            abstractC9986Gn8A03 = abstractC9986Gn8A03.A03(interfaceC10017Gnp);
        }
        ?? A15 = this._ignorableProperties;
        Set<String> hashSet = this._includableProperties;
        AbstractC9910Gks abstractC9910GksA02 = AbstractC9849Git.A02(abstractC9904Gkk);
        Set<String> set = A15;
        set = A15;
        if (abstractC9910GksA02 != null && interfaceC10017Gnp != null) {
            AbstractC9970Gmj abstractC9970GmjAHe = interfaceC10017Gnp.AHe();
            set = A15;
            if (abstractC9970GmjAHe != null) {
                C10029Go4 c10029Go4A09 = abstractC9910GksA02.A09(abstractC9970GmjAHe);
                Set<String> set2 = c10029Go4A09._allowSetters ? Collections.EMPTY_SET : c10029Go4A09._ignored;
                if (!set2.isEmpty()) {
                    A15 = AbstractC7610F5x.A15(A15);
                    Iterator<String> it = set2.iterator();
                    while (it.hasNext()) {
                        BV6.A1S(A15, it);
                    }
                }
                Set<String> set3 = abstractC9910GksA02.A0B(abstractC9970GmjAHe)._included;
                set = A15;
                if (set3 != null) {
                    HashSet hashSetA13 = C60O.A13();
                    if (hashSet == null) {
                        hashSet = new HashSet<>(set3);
                        set = A15;
                    } else {
                        Iterator<String> it2 = set3.iterator();
                        while (it2.hasNext()) {
                            AbstractC7610F5x.A1R(hashSetA13, it2, hashSet);
                        }
                        hashSet = hashSetA13;
                        set = A15;
                    }
                }
            }
        }
        InterfaceC10165Gqa interfaceC10165GqaA0y = A0y(interfaceC10017Gnp, abstractC9904Gkk, jsonDeserializerA0J);
        return (this._keyDeserializer == abstractC9877GjlA0L && this._valueDeserializer == jsonDeserializerA0J && this._valueTypeDeserializer == abstractC9986Gn8A03 && this._nullProvider == interfaceC10165GqaA0y && this._ignorableProperties == set && this._includableProperties == hashSet) ? this : new MapDeserializer(jsonDeserializerA0J, abstractC9877GjlA0L, interfaceC10165GqaA0y, this, abstractC9986Gn8A03, set, hashSet);
    }

    private void A02(AbstractC9904Gkk abstractC9904Gkk, UnresolvedForwardReference unresolvedForwardReference, C10088GpC c10088GpC, Object obj) {
        if (c10088GpC == null) {
            abstractC9904Gkk.A0c(this, AnonymousClass007.A0a("Unresolved forward reference but no identity info: ", unresolvedForwardReference), BV4.A1W());
            throw F60.createAndThrow();
        }
        C9973Gmm c9973Gmm = new C9973Gmm(unresolvedForwardReference, c10088GpC, obj);
        c10088GpC.A00.add(c9973Gmm);
        unresolvedForwardReference._roid.A00(c9973Gmm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A03(AbstractC9904Gkk abstractC9904Gkk, Map<Object, Object> map, Object obj, Object obj2, Object obj3) {
        if (this._checkDupSquash) {
            if (AbstractC7609F5w.A1U(EnumC10051GoV.DUPLICATE_PROPERTIES._mask, abstractC9904Gkk._readCapabilities._enabled)) {
                if (obj instanceof List) {
                    ((List) obj).add(obj2);
                    obj3.put(map, obj);
                } else {
                    ArrayList arrayListA0u = BV5.A0u(obj);
                    arrayListA0u.add(obj2);
                    obj3.put(map, arrayListA0u);
                }
            }
        }
    }

    @Override // X.InterfaceC10183Gqt
    public final void AbV(AbstractC9904Gkk abstractC9904Gkk) {
        AbstractC9870GjI abstractC9870GjI;
        Object[] objArr;
        String str;
        AbstractC9870GjI abstractC9870GjI2;
        AbstractC9944Glx abstractC9944Glx = this._valueInstantiator;
        if (abstractC9944Glx.A0A()) {
            if (!(abstractC9944Glx instanceof C9921GlI) || (abstractC9870GjI2 = ((C9921GlI) abstractC9944Glx)._delegateType) == null) {
                abstractC9870GjI = this._containerType;
                objArr = new Object[]{abstractC9870GjI, C60Q.A0e(abstractC9944Glx)};
                str = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'";
                AbstractC9849Git.A07(abstractC9904Gkk, abstractC9870GjI, str, objArr);
                throw F60.createAndThrow();
            }
            this._delegateDeserializer = abstractC9904Gkk.A0G(null, abstractC9870GjI2);
        } else if (abstractC9944Glx.A08()) {
            if (!(abstractC9944Glx instanceof C9921GlI) || (abstractC9870GjI2 = ((C9921GlI) abstractC9944Glx)._arrayDelegateType) == null) {
                abstractC9870GjI = this._containerType;
                objArr = new Object[]{abstractC9870GjI, C60Q.A0e(abstractC9944Glx)};
                str = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
                AbstractC9849Git.A07(abstractC9904Gkk, abstractC9870GjI, str, objArr);
                throw F60.createAndThrow();
            }
            this._delegateDeserializer = abstractC9904Gkk.A0G(null, abstractC9870GjI2);
        }
        AbstractC9944Glx abstractC9944Glx2 = this._valueInstantiator;
        if (abstractC9944Glx2.A06()) {
            this._propertyBasedCreator = C9931GlS.A00(abstractC9904Gkk, this._valueInstantiator, abstractC9944Glx2.A0C(abstractC9904Gkk._config), abstractC9904Gkk._config.A09(EnumC9951GmA.A02));
        }
        this._standardStringKey = A04(this._containerType, this._keyDeserializer);
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/fasterxml/jackson/databind/deser/std/MapDeserializer;LX/Gjl;Lcom/fasterxml/jackson/databind/JsonDeserializer<Ljava/lang/Object;>;LX/Gn8;LX/Gqa;Ljava/util/Set<Ljava/lang/String;>;Ljava/util/Set<Ljava/lang/String;>;)V */
    public MapDeserializer(JsonDeserializer jsonDeserializer, AbstractC9877Gjl abstractC9877Gjl, InterfaceC10165Gqa interfaceC10165Gqa, MapDeserializer mapDeserializer, AbstractC9986Gn8 abstractC9986Gn8, Set set, Set set2) {
        super((ContainerDeserializerBase<?>) interfaceC10165Gqa, mapDeserializer, mapDeserializer._unwrapSingle);
        this._keyDeserializer = abstractC9877Gjl;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = abstractC9986Gn8;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = set;
        this._includableProperties = set2;
        this._inclusionChecker = AbstractC10100GpO.A00(set, set2);
        this._standardStringKey = A04(this._containerType, abstractC9877Gjl);
        this._checkDupSquash = mapDeserializer._checkDupSquash;
    }
}
