package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.DQc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5040DQc<K, V> extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ DQd A00;

    public C5040DQc(DQd dQd) {
        this.A00 = dQd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C5039DQb(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }
}
