package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.modules.SerializerAlreadyRegisteredException;

/* renamed from: X.9py, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9py {
    public boolean A00;
    public final Map<C9uG<?>, C9q2> A01 = new HashMap();
    public final Map<C9uG<?>, Map<C9uG<?>, C9hr<?>>> A05 = new HashMap();
    public final Map<C9uG<?>, G0U<?, C9hv<?>>> A03 = new HashMap();
    public final Map<C9uG<?>, Map<String, C9hr<?>>> A04 = new HashMap();
    public final Map<C9uG<?>, G0U<String, C9jG<?>>> A02 = new HashMap();

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9uG<TT;>;LX/9q2;Z)V */
    public static final void A01(C9uG c9uG, C9q2 c9q2, C9py c9py) {
        Map<C9uG<?>, C9q2> map = c9py.A01;
        C9q2 c9q22 = map.get(c9uG);
        if (c9q22 != null && !c9q22.equals(c9q2)) {
            throw new SerializerAlreadyRegisteredException(AnonymousClass001.A0v(" already registered in this module", C3cG.A0f(c9uG, "Contextual serializer or serializer provider for ")));
        }
        map.put(c9uG, c9q2);
        if (C9uT.A01(c9uG).isInterface()) {
            c9py.A00 = true;
        }
    }

    public final C07959pz A02() {
        return new C07959pz(this.A01, this.A05, this.A03, this.A04, this.A02, this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A03(C07959pz c07959pz) {
        C9q2 c9q0;
        Iterator itA0n = AnonymousClass002.A0n(c07959pz.A00);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            C9uG c9uG = (C9uG) entry.getKey();
            C9q2 c9q2 = (C9q2) entry.getValue();
            if (c9q2 instanceof C9q1) {
                C7384Etj.A0Z(c9uG, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                C9hr<?> c9hr = ((C9q1) c9q2).A00;
                C7384Etj.A0Z(c9hr, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                c9q0 = new C9q1(c9hr);
            } else {
                if (!(c9q2 instanceof C9q0)) {
                    throw C3cG.A0q();
                }
                G0U<List<? extends C9hr<?>>, C9hr<?>> g0u = ((C9q0) c9q2).A00;
                C7384Etj.A0Y(c9uG, 0);
                C7384Etj.A0Y(g0u, 1);
                c9q0 = new C9q0(g0u);
            }
            A01(c9uG, c9q0, this);
        }
        Iterator itA0n2 = AnonymousClass002.A0n(c07959pz.A04);
        while (itA0n2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itA0n2.next();
            C9uG c9uG2 = (C9uG) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                C9uG c9uG3 = (C9uG) entry3.getKey();
                C9hr c9hr2 = (C9hr) entry3.getValue();
                C7384Etj.A0Z(c9uG2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                C7384Etj.A0Z(c9uG3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                C7384Etj.A0Z(c9hr2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                A00(c9uG2, c9uG3, c9hr2, this);
            }
        }
        Iterator itA0n3 = AnonymousClass002.A0n(c07959pz.A02);
        while (itA0n3.hasNext()) {
            Map.Entry entry4 = (Map.Entry) itA0n3.next();
            Object key = entry4.getKey();
            Object value = entry4.getValue();
            C7384Etj.A0Z(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            C7384Etj.A0Z(value, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            C0862A6j.A02(value, 1);
            Map<C9uG<?>, G0U<?, C9hv<?>>> map = this.A03;
            Object obj = map.get(key);
            if (obj != null && !obj.equals(value)) {
                throw C60O.A0i(AnonymousClass006.A0y(obj, " is already registered: ", C3cG.A0f(key, "Default serializers provider for ")));
            }
            map.put(key, value);
        }
        Iterator itA0n4 = AnonymousClass002.A0n(c07959pz.A01);
        while (itA0n4.hasNext()) {
            Map.Entry entry5 = (Map.Entry) itA0n4.next();
            Object key2 = entry5.getKey();
            Object value2 = entry5.getValue();
            C7384Etj.A0Z(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            C7384Etj.A0Z(value2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            C0862A6j.A02(value2, 1);
            Map<C9uG<?>, G0U<String, C9jG<?>>> map2 = this.A02;
            Object obj2 = map2.get(key2);
            if (obj2 != null && !obj2.equals(value2)) {
                throw C60O.A0i(AnonymousClass006.A0y(obj2, " is already registered: ", C3cG.A0f(key2, "Default deserializers provider for ")));
            }
            map2.put(key2, value2);
        }
    }

    /* JADX WARN: Incorrect types in method signature: <Base:Ljava/lang/Object;Sub::TBase;>(LX/9uG<TBase;>;LX/9uG<TSub;>;LX/9hr<TSub;>;Z)V */
    public static final void A00(C9uG c9uG, C9uG c9uG2, C9hr c9hr, C9py c9py) {
        Object next;
        Object key;
        String strAKP = c9hr.getDescriptor().AKP();
        Map<C9uG<?>, Map<C9uG<?>, C9hr<?>>> map = c9py.A05;
        Map<C9uG<?>, C9hr<?>> map2 = map.get(c9uG);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(c9uG, map2);
        }
        Map<C9uG<?>, C9hr<?>> map3 = map2;
        Map<C9uG<?>, Map<String, C9hr<?>>> map4 = c9py.A04;
        Map<String, C9hr<?>> map5 = map4.get(c9uG);
        if (map5 == null) {
            map5 = new HashMap<>();
            map4.put(c9uG, map5);
        }
        Map<String, C9hr<?>> map6 = map5;
        C9hr<?> c9hr2 = map3.get(c9uG2);
        if (c9hr2 != null && !c9hr2.equals(c9hr)) {
            throw new SerializerAlreadyRegisteredException(AnonymousClass006.A0y(c9uG, " already registered in the scope of ", C3cG.A0f(c9uG2, "Serializer for ")));
        }
        C9hr<?> c9hr3 = map6.get(strAKP);
        if (c9hr3 == null || c9hr3.equals(c9hr)) {
            map3.put(c9uG2, c9hr);
            map6.put(strAKP, c9hr);
            return;
        }
        Iterator it = AbstractC0878AGe.A06(map3.entrySet()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Map.Entry) next).getValue() == c9hr3) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (key = entry.getKey()) == null) {
            throw C3cG.A0Q(FGI.A0U("Name ", strAKP, " is registered in the module but no Kotlin class is associated with it."));
        }
        StringBuilder sbA0f = C3cG.A0f(c9uG, "Multiple polymorphic serializers in a scope of '");
        sbA0f.append("' have the same serial name '");
        sbA0f.append(strAKP);
        sbA0f.append("': ");
        sbA0f.append(c9hr);
        sbA0f.append(" for '");
        sbA0f.append(c9uG2);
        sbA0f.append("' and ");
        sbA0f.append(c9hr3);
        sbA0f.append(" for '");
        sbA0f.append(key);
        throw C60O.A0i(C8j3.A16(sbA0f, '\''));
    }
}
