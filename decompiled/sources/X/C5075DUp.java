package X;

import com.google.common.collect.MapMakerInternalMap;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.DUp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5075DUp<K, V> extends C5079DUu<K, V> {
    public final C5079DUu<K, V> A00;

    @Override // X.DUe, X.DUZ
    public final /* bridge */ /* synthetic */ DUZ AHz() {
        return this.A00;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/ref/ReferenceQueue<TK;>;TK;ILX/DUu<TK;TV;>;)V */
    public C5075DUp(C5079DUu queue, Object key, ReferenceQueue hash, int next) {
        super(key, hash, next);
        ((C5079DUu) this).A00 = MapMakerInternalMap.A07;
        this.A00 = queue;
    }
}
