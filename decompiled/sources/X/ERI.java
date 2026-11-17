package X;

import java.util.ConcurrentModificationException;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes5.dex */
public final class ERI<K> extends ERD<K, V>.LinkedTreeMapIterator<K> {
    public final /* synthetic */ ERH A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ERI(ERH erh) {
        super(erh.A00);
        this.A00 = erh;
    }

    public final K next() {
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
        return ere.A07;
    }
}
