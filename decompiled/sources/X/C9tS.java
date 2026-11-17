package X;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9tS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9tS<K, V> extends C9tW<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    public final C9iZ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9tS(C9hr<K> c9hr, C9hr<V> c9hr2) {
        super(c9hr, c9hr2);
        C7384Etj.A0Y(c9hr, 0);
        C7384Etj.A0Y(c9hr2, 1);
        C9iZ descriptor = c9hr.getDescriptor();
        C9iZ descriptor2 = c9hr2.getDescriptor();
        C7384Etj.A0Y(descriptor, 0);
        C7384Etj.A0Y(descriptor2, 1);
        this.A00 = new C9tV("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
    }

    @Override // X.C9tY
    public final /* bridge */ /* synthetic */ Object A04(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return obj;
    }

    @Override // X.C9tY
    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        AbstractMap abstractMap = (AbstractMap) obj;
        C7384Etj.A0Y(abstractMap, 0);
        return abstractMap.size() * 2;
    }

    @Override // X.C9tY
    public final /* bridge */ /* synthetic */ int A02(Object obj) {
        Map map = (Map) obj;
        C7384Etj.A0Y(map, 0);
        return map.size();
    }

    @Override // X.C9tY
    public final /* bridge */ /* synthetic */ Object A03() {
        return new LinkedHashMap();
    }

    @Override // X.C9tY
    public final /* bridge */ /* synthetic */ Iterator A06(Object obj) {
        Map map = (Map) obj;
        C7384Etj.A0Y(map, 0);
        return map.entrySet().iterator();
    }

    @Override // X.C9tW, X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return this.A00;
    }
}
