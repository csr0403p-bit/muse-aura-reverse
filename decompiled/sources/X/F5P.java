package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableEntry;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.TreeMultiset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class F5P implements Iterator {
    public final int $t;
    public Object A00;
    public Object A01;
    public Object A02;

    public F5P(final LinkedHashMultimap this$0) {
        this.$t = 1;
        this.A01 = this$0;
        ImmutableEntry immutableEntry = this$0.A01.successorInMultimap;
        immutableEntry.getClass();
        this.A00 = immutableEntry;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            r4 = this;
            int r0 = r4.$t
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L1e;
                case 2: goto L2b;
                default: goto L5;
            }
        L5:
            java.lang.Object r2 = r4.A00
            X.DQF r2 = (X.DQF) r2
            r3 = 0
            if (r2 == 0) goto L1d
            java.lang.Object r0 = r4.A02
            com.google.common.collect.TreeMultiset r0 = (com.google.common.collect.TreeMultiset) r0
            com.google.common.collect.GeneralRange<E> r1 = r0.A00
            E r0 = r2.A08
            boolean r0 = r1.A03(r0)
        L18:
            if (r0 == 0) goto L29
            r0 = 0
            r4.A00 = r0
        L1d:
            return r3
        L1e:
            java.lang.Object r1 = r4.A00
            java.lang.Object r0 = r4.A01
            com.google.common.collect.LinkedHashMultimap r0 = (com.google.common.collect.LinkedHashMultimap) r0
            com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V> r0 = r0.A01
            r3 = 0
            if (r1 == r0) goto L1d
        L29:
            r3 = 1
            return r3
        L2b:
            java.lang.Object r2 = r4.A00
            X.DQF r2 = (X.DQF) r2
            r3 = 0
            if (r2 == 0) goto L1d
            java.lang.Object r0 = r4.A02
            com.google.common.collect.TreeMultiset r0 = (com.google.common.collect.TreeMultiset) r0
            com.google.common.collect.GeneralRange<E> r1 = r0.A00
            E r0 = r2.A08
            boolean r0 = r1.A02(r0)
            goto L18
        L3f:
            java.lang.Object r0 = r4.A02
            java.util.Iterator r0 = (java.util.Iterator) r0
            boolean r3 = r0.hasNext()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F5P.hasNext():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [K, java.lang.Object] */
    @Override // java.util.Iterator
    public final K next() {
        Object obj;
        Object obj2;
        K k;
        Object obj3;
        switch (this.$t) {
            case 0:
                Map.Entry entryA0l = C3cH.A0l((Iterator) this.A02);
                this.A00 = entryA0l;
                return entryA0l.getKey();
            case 1:
                if (!hasNext()) {
                    throw C8j3.A1D();
                }
                LinkedHashMultimap.ValueEntry valueEntry = (LinkedHashMultimap.ValueEntry) this.A00;
                this.A02 = valueEntry;
                obj = valueEntry.successorInMultimap;
                obj3 = valueEntry;
                obj.getClass();
                k = obj3;
                this.A00 = obj;
                return k;
            case 2:
                if (!hasNext()) {
                    throw C8j3.A1D();
                }
                TreeMultiset treeMultiset = (TreeMultiset) this.A02;
                DQF dqf = (DQF) this.A00;
                dqf.getClass();
                Object dqj = new DQJ(dqf, treeMultiset);
                this.A01 = dqj;
                Object obj4 = ((DQF) this.A00).A07;
                obj4.getClass();
                obj2 = dqj;
                if (obj4 != treeMultiset.A01) {
                    obj = ((DQF) this.A00).A07;
                    obj3 = dqj;
                    obj.getClass();
                    k = obj3;
                    this.A00 = obj;
                    return k;
                }
                obj = null;
                k = obj2;
                this.A00 = obj;
                return k;
            default:
                if (!hasNext()) {
                    throw C8j3.A1D();
                }
                this.A00.getClass();
                TreeMultiset treeMultiset2 = (TreeMultiset) this.A02;
                DQF dqf2 = (DQF) this.A00;
                Object dqj2 = new DQJ(dqf2, treeMultiset2);
                this.A01 = dqj2;
                Object obj5 = dqf2.A05;
                obj5.getClass();
                obj2 = dqj2;
                if (obj5 != treeMultiset2.A01) {
                    obj = ((DQF) this.A00).A05;
                    obj3 = dqj2;
                    obj.getClass();
                    k = obj3;
                    this.A00 = obj;
                    return k;
                }
                obj = null;
                k = obj2;
                this.A00 = obj;
                return k;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$t) {
            case 0:
                Preconditions.checkState(AnonymousClass002.A1X(this.A00), "no calls to next() since the last call to remove()");
                Collection collection = (Collection) ((Map.Entry) this.A00).getValue();
                ((Iterator) this.A02).remove();
                ((DOh) this.A01).A00.A00 -= collection.size();
                collection.clear();
                this.A00 = null;
                break;
            case 1:
                Preconditions.checkState(AnonymousClass002.A1X(this.A02), "no calls to next() since the last call to remove()");
                AbstractC5024DOu abstractC5024DOu = (AbstractC5024DOu) this.A01;
                DPA dpa = (DPA) this.A02;
                Object key = dpa.getKey();
                Object value = dpa.getValue();
                Collection collection2 = (Collection) abstractC5024DOu.A4n().get(key);
                if (collection2 != null) {
                    collection2.remove(value);
                }
                this.A02 = null;
                break;
            default:
                Preconditions.checkState(AnonymousClass002.A1X(this.A01), "no calls to next() since the last call to remove()");
                TreeMultiset treeMultiset = (TreeMultiset) this.A02;
                Object objA01 = ((DPD) this.A01).A01();
                if (treeMultiset.A00.A01(objA01)) {
                    DQK<DQF<E>> dqk = treeMultiset.A02;
                    DQF dqf = (DQF) dqk.A00;
                    if (dqf != null) {
                        dqk.A00(dqf, dqf.A0B(objA01, treeMultiset.comparator, new int[1]));
                    }
                }
                this.A01 = null;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public F5P(com.google.common.collect.TreeMultiset r7, int r8) {
        /*
            r6 = this;
            r6.$t = r8
            r6.A02 = r7
            r6.<init>()
            X.DQK<X.DQF<E>> r0 = r7.A02
            T r1 = r0.A00
            X.DQF r1 = (X.DQF) r1
            r5 = 0
            int r8 = 2 - r8
            if (r8 == 0) goto L4e
            if (r1 == 0) goto L45
            com.google.common.collect.GeneralRange<E> r4 = r7.A00
            boolean r0 = r4.hasUpperBound
            if (r0 == 0) goto L4b
            T r3 = r4.upperEndpoint
            java.util.Comparator<? super E> r0 = r7.comparator
            X.DQF r2 = X.DQF.A05(r1, r3, r0)
            if (r2 == 0) goto L45
            com.google.common.collect.BoundType r1 = r4.upperBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L39
            java.util.Comparator<? super E> r1 = r7.comparator
            E r0 = r2.A08
            int r0 = r1.compare(r3, r0)
            if (r0 != 0) goto L39
        L34:
            X.DQF<E> r2 = r2.A05
            r2.getClass()
        L39:
            X.DQF<E> r0 = r7.A01
            if (r2 == r0) goto L45
            E r0 = r2.A08
            boolean r0 = r4.A01(r0)
            if (r0 != 0) goto L46
        L45:
            r2 = r5
        L46:
            r6.A00 = r2
            r6.A01 = r5
            return
        L4b:
            X.DQF<E> r2 = r7.A01
            goto L34
        L4e:
            if (r1 == 0) goto L81
            com.google.common.collect.GeneralRange<E> r4 = r7.A00
            boolean r0 = r4.hasLowerBound
            if (r0 == 0) goto L85
            T r3 = r4.lowerEndpoint
            java.util.Comparator<? super E> r0 = r7.comparator
            X.DQF r2 = X.DQF.A04(r1, r3, r0)
            if (r2 == 0) goto L81
            com.google.common.collect.BoundType r1 = r4.lowerBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L75
            java.util.Comparator<? super E> r1 = r7.comparator
            E r0 = r2.A08
            int r0 = r1.compare(r3, r0)
            if (r0 != 0) goto L75
        L70:
            X.DQF<E> r2 = r2.A07
            r2.getClass()
        L75:
            X.DQF<E> r0 = r7.A01
            if (r2 == r0) goto L81
            E r0 = r2.A08
            boolean r0 = r4.A01(r0)
            if (r0 != 0) goto L82
        L81:
            r2 = r5
        L82:
            r6.A00 = r2
            return
        L85:
            X.DQF<E> r2 = r7.A01
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F5P.<init>(com.google.common.collect.TreeMultiset, int):void");
    }

    public F5P(final DOh this$1, final Iterator val$entryIterator) {
        this.$t = 0;
        this.A02 = val$entryIterator;
        this.A01 = this$1;
    }
}
