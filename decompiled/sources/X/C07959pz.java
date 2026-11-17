package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.9pz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07959pz {
    public final Map<C9uG<?>, C9q2> A00;
    public final Map<C9uG<?>, G0U<String, C9jG<?>>> A01;
    public final Map<C9uG<?>, G0U<?, C9hv<?>>> A02;
    public final Map<C9uG<?>, Map<String, C9hr<?>>> A03;
    public final Map<C9uG<?>, Map<C9uG<?>, C9hr<?>>> A04;
    public final boolean A05;

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9uG<TT;>;Ljava/util/List<+LX/9hr<*>;>;)LX/9hr<TT;>; */
    public final C9hr A00(List list, C9uG c9uG) {
        C7384Etj.A0Y(c9uG, 0);
        C9q2 c9q2 = this.A00.get(c9uG);
        if (c9q2 != null) {
            C9hr<?> c9hrInvoke = c9q2 instanceof C9q0 ? ((C9q0) c9q2).A00.invoke(list) : ((C9q1) c9q2).A00;
            if (c9hrInvoke != null) {
                return c9hrInvoke;
            }
        }
        return null;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9uG<-TT;>;TT;)LX/9hv<TT;>; */
    public final C9hv A01(Object obj, C9uG c9uG) {
        G0U<?, C9hv<?>> g0u;
        C9hr<?> c9hr;
        C7384Etj.A0Y(c9uG, 0);
        if (c9uG.AOZ(obj)) {
            Map<C9uG<?>, C9hr<?>> map = this.A04.get(c9uG);
            if (map != null && (c9hr = map.get(C3cG.A0x(obj.getClass()))) != null) {
                return c9hr;
            }
            G0U<?, C9hv<?>> g0u2 = this.A02.get(c9uG);
            if (C0862A6j.A04(1, g0u2) && (g0u = g0u2) != null) {
                return g0u.invoke(obj);
            }
        }
        return null;
    }

    public C07959pz() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C07959pz(Map<C9uG<?>, ? extends C9q2> map, Map<C9uG<?>, ? extends Map<C9uG<?>, ? extends C9hr<?>>> map2, Map<C9uG<?>, ? extends G0U<?, ? extends C9hv<?>>> map3, Map<C9uG<?>, ? extends Map<String, ? extends C9hr<?>>> map4, Map<C9uG<?>, ? extends G0U<? super String, ? extends C9jG<?>>> map5, boolean z) {
        this.A00 = map;
        this.A04 = map2;
        this.A02 = map3;
        this.A03 = map4;
        this.A01 = map5;
        this.A05 = z;
    }
}
