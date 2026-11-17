package X;

import java.util.Map;

/* loaded from: classes4.dex */
public final class AJS<K, V> extends AJV<K, V, Map.Entry<K, V>> {
    public final AJQ<K, V> A00;

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A01 + 2;
        this.A01 = i;
        AJQ<K, V> ajq = this.A00;
        Object[] objArr = this.A02;
        return new AJR(ajq, objArr[i - 2], objArr[i - 1]);
    }

    public AJS(AJQ<K, V> ajq) {
        this.A00 = ajq;
    }
}
