package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.DUq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5076DUq<K, V> extends DV1<K, V> {
    public final DV1<K, V> A00;

    @Override // X.DUe, X.DUZ
    public final /* bridge */ /* synthetic */ DUZ AHz() {
        return this.A00;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/ref/ReferenceQueue<TK;>;TK;ILX/DV1<TK;TV;>;)V */
    public C5076DUq(DV1 queue, Object key, ReferenceQueue hash, int next) {
        super(key, hash, next);
        ((DV1) this).A00 = null;
        this.A00 = queue;
    }
}
