package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AJ1<K, V> extends AbstractC0891AGs<Map.Entry<? extends K, ? extends V>> implements BQI<Map.Entry<? extends K, ? extends V>> {
    public final C0953AJg<K, V> A00;

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return AbstractC0931AIi.A00(C8j4.A15(obj), this.A00);
        }
        return false;
    }

    @Override // X.AbstractC0890AGr, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C0963AJq(this.A00);
    }

    public AJ1(C0953AJg<K, V> c0953AJg) {
        this.A00 = c0953AJg;
    }
}
