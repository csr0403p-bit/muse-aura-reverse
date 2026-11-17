package X;

import java.util.Map;

/* loaded from: classes4.dex */
public final class AJW<K, V> extends AJV<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A01 + 2;
        this.A01 = i;
        Object[] objArr = this.A02;
        return new AFP(objArr[i - 2], objArr[i - 1]);
    }
}
