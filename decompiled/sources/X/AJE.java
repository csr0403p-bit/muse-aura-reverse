package X;

import java.util.Map;

/* loaded from: classes4.dex */
public final class AJE<K, V> extends AJH<K, V, Map.Entry<K, V>> {
    public final AJC<K, V> A00;

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A01 + 2;
        this.A01 = i;
        AJC<K, V> ajc = this.A00;
        Object[] objArr = this.A02;
        return new AJD(objArr[i - 2], objArr[i - 1], ajc);
    }

    public AJE(AJC<K, V> ajc) {
        this.A00 = ajc;
    }
}
