package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.Dfu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5311Dfu<K, V> extends Dg2<K, V> implements Iterator<Map.Entry<K, V>> {
    public C5307Dfq<K, V> A00;
    public boolean A01 = true;
    public final /* synthetic */ C5304Dfn A02;

    public C5311Dfu(C5304Dfn c5304Dfn) {
        this.A02 = c5304Dfn;
    }

    @Override // X.Dg2
    public final void A00(C5307Dfq<K, V> c5307Dfq) {
        C5307Dfq<K, V> c5307Dfq2 = this.A00;
        if (c5307Dfq == c5307Dfq2) {
            C5307Dfq<K, V> c5307Dfq3 = c5307Dfq2.A01;
            this.A00 = c5307Dfq3;
            this.A01 = AnonymousClass002.A1Y(c5307Dfq3);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C5307Dfq<K, V> c5307Dfq;
        if (!this.A01) {
            C5307Dfq<K, V> c5307Dfq2 = this.A00;
            if (c5307Dfq2 != null) {
                c5307Dfq = c5307Dfq2.A00;
            }
        }
        c5307Dfq = this.A02.A02;
        return c5307Dfq != null;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C5307Dfq<K, V> c5307Dfq;
        if (this.A01) {
            this.A01 = false;
            c5307Dfq = this.A02.A02;
        } else {
            C5307Dfq<K, V> c5307Dfq2 = this.A00;
            c5307Dfq = c5307Dfq2 != null ? c5307Dfq2.A00 : null;
        }
        this.A00 = c5307Dfq;
        return c5307Dfq;
    }
}
