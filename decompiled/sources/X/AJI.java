package X;

import java.util.Map;

/* loaded from: classes4.dex */
public final class AJI<K, V> extends AJH<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A01 + 2;
        this.A01 = i;
        Object[] objArr = this.A02;
        return new AFQ(objArr[i - 2], objArr[i - 1]);
    }
}
