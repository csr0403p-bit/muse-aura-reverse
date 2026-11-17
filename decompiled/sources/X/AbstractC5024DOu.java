package X;

import com.google.common.collect.LinkedListMultimap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.DOu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5024DOu<K, V> implements InterfaceC5023DOs<K, V> {
    public transient Collection<V> A00;
    public transient Collection<Map.Entry<K, V>> A01;
    public transient Map<K, Collection<V>> A02;
    public transient Set<K> A03;

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a A[PHI: r1
  0x003a: PHI (r1v3 java.util.Map<K, java.util.Collection<V>>) = (r1v2 java.util.Map<K, java.util.Collection<V>>), (r1v5 java.util.Map<K, java.util.Collection<V>>) binds: [B:20:0x0037, B:17:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC5023DOs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<K, java.util.Collection<V>> A4n() {
        /*
            r3 = this;
            java.util.Map<K, java.util.Collection<V>> r1 = r3.A02
            if (r1 != 0) goto L10
            boolean r0 = r3 instanceof com.google.common.collect.LinkedListMultimap
            if (r0 == 0) goto L11
            X.DOr r0 = new X.DOr
            r0.<init>(r3)
            r1 = r0
        Le:
            r3.A02 = r0
        L10:
            return r1
        L11:
            r2 = r3
            com.google.common.collect.AbstractMapBasedMultimap r2 = (com.google.common.collect.AbstractMapBasedMultimap) r2
            boolean r0 = r2 instanceof com.google.common.collect.TreeMultimap
            if (r0 == 0) goto L33
            java.util.Map<K, java.util.Collection<V>> r1 = r2.A01
        L1a:
            boolean r0 = r1 instanceof java.util.NavigableMap
            if (r0 == 0) goto L27
            java.util.NavigableMap r1 = (java.util.NavigableMap) r1
            X.DOj r0 = new X.DOj
            r0.<init>(r2, r1)
        L25:
            r1 = r0
            goto Le
        L27:
            boolean r0 = r1 instanceof java.util.SortedMap
            if (r0 == 0) goto L3a
            java.util.SortedMap r1 = (java.util.SortedMap) r1
            X.DOo r0 = new X.DOo
            r0.<init>(r2, r1)
            goto L25
        L33:
            boolean r0 = r2 instanceof com.google.common.collect.Multimaps$CustomListMultimap
            java.util.Map<K, java.util.Collection<V>> r1 = r2.A01
            if (r0 == 0) goto L3a
            goto L1a
        L3a:
            X.DOk r0 = new X.DOk
            r0.<init>(r2, r1)
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC5024DOu.A4n():java.util.Map");
    }

    @Override // X.InterfaceC5023DOs
    public Collection<Map.Entry<K, V>> AAn() {
        Collection<Map.Entry<K, V>> dpm = this.A01;
        if (dpm == null) {
            dpm = this instanceof LinkedListMultimap ? new DPM<>((LinkedListMultimap) this) : this instanceof InterfaceC5009DNu ? new DOK<>(this) : new C5025DOz<>(this);
            this.A01 = dpm;
        }
        return dpm;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof InterfaceC5023DOs) {
            return A4n().equals(((InterfaceC5023DOs) object).A4n());
        }
        return false;
    }

    @Override // X.InterfaceC5023DOs
    public final boolean isEmpty() {
        return this instanceof LinkedListMultimap ? AnonymousClass002.A1Y(((LinkedListMultimap) this).A02) : AnonymousClass002.A1M(size());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003d A[PHI: r1
  0x003d: PHI (r1v3 java.util.Map<K, java.util.Collection<V>>) = (r1v2 java.util.Map<K, java.util.Collection<V>>), (r1v5 java.util.Map<K, java.util.Collection<V>>) binds: [B:20:0x003a, B:17:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC5023DOs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Set<K> keySet() {
        /*
            r3 = this;
            java.util.Set<K> r1 = r3.A03
            if (r1 != 0) goto L13
            boolean r0 = r3 instanceof com.google.common.collect.LinkedListMultimap
            if (r0 == 0) goto L14
            r1 = r3
            com.google.common.collect.LinkedListMultimap r1 = (com.google.common.collect.LinkedListMultimap) r1
            X.DPR r0 = new X.DPR
            r0.<init>(r1)
            r1 = r0
        L11:
            r3.A03 = r0
        L13:
            return r1
        L14:
            r2 = r3
            com.google.common.collect.AbstractMapBasedMultimap r2 = (com.google.common.collect.AbstractMapBasedMultimap) r2
            boolean r0 = r2 instanceof com.google.common.collect.Multimaps$CustomListMultimap
            if (r0 == 0) goto L36
            java.util.Map<K, java.util.Collection<V>> r1 = r2.A01
        L1d:
            boolean r0 = r1 instanceof java.util.NavigableMap
            if (r0 == 0) goto L2a
            java.util.NavigableMap r1 = (java.util.NavigableMap) r1
            X.DOl r0 = new X.DOl
            r0.<init>(r2, r1)
        L28:
            r1 = r0
            goto L11
        L2a:
            boolean r0 = r1 instanceof java.util.SortedMap
            if (r0 == 0) goto L3d
            java.util.SortedMap r1 = (java.util.SortedMap) r1
            X.DOp r0 = new X.DOp
            r0.<init>(r2, r1)
            goto L28
        L36:
            boolean r0 = r2 instanceof com.google.common.collect.AbstractSortedKeySortedSetMultimap
            java.util.Map<K, java.util.Collection<V>> r1 = r2.A01
            if (r0 == 0) goto L3d
            goto L1d
        L3d:
            X.DOh r0 = new X.DOh
            r0.<init>(r2, r1)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC5024DOu.keySet():java.util.Set");
    }

    public final int hashCode() {
        return A4n().hashCode();
    }

    public final String toString() {
        return A4n().toString();
    }
}
