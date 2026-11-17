package X;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class ERJ<K, V> extends ERD<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>> {
    public final /* synthetic */ ERF A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ERJ(ERF erf) {
        super(erf.A00);
        this.A00 = erf;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        ERE<K, V> ere = this.A02;
        ERD erd = this.A03;
        if (ere == erd.header) {
            throw C8j3.A1D();
        }
        if (erd.modCount != this.A00) {
            throw new ConcurrentModificationException();
        }
        this.A02 = ere.A02;
        this.A01 = ere;
        return ere;
    }
}
