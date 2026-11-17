package X;

import com.google.common.collect.MapMakerInternalMap;

/* renamed from: X.DUs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5077DUs<K, V> extends C5080DUv<K, V> {
    public final C5080DUv<K, V> A00;

    @Override // X.DUf, X.DUZ
    public final /* bridge */ /* synthetic */ DUZ AHz() {
        return this.A00;
    }

    /* JADX WARN: Incorrect types in method signature: (TK;ILX/DUv<TK;TV;>;)V */
    public C5077DUs(C5080DUv key, Object hash, int next) {
        super(hash, next);
        ((C5080DUv) this).A00 = MapMakerInternalMap.A07;
        this.A00 = key;
    }
}
