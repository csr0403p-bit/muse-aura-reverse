package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9tT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9tT<K, V> extends C9tW<K, V, Map<K, ? extends V>, HashMap<K, V>> {
    public final C9iZ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9tT(C9hr<K> c9hr, C9hr<V> c9hr2) {
        super(c9hr, c9hr2);
        boolean zA1Y = C60P.A1Y(c9hr, c9hr2);
        C9iZ descriptor = c9hr.getDescriptor();
        C9iZ descriptor2 = c9hr2.getDescriptor();
        C7384Etj.A0Y(descriptor, 0);
        C7384Etj.A0Y(descriptor2, zA1Y ? 1 : 0);
        this.A00 = new C9tU("kotlin.collections.HashMap", descriptor, descriptor2);
    }
}
