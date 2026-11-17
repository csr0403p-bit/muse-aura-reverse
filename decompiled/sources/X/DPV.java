package X;

import com.google.common.base.Objects;
import com.google.common.collect.LinkedHashMultimap;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class DPV<K, V> extends AbstractC5014DOf<V> implements DPY<K, V> {
    public LinkedHashMultimap.ValueEntry<K, V>[] A04;
    public final K A05;
    public final /* synthetic */ LinkedHashMultimap A06;
    public int A01 = 0;
    public int A00 = 0;
    public DPY<K, V> A02 = this;
    public DPY<K, V> A03 = this;

    public DPV(final LinkedHashMultimap this$0, K key, int expectedValues) {
        this.A06 = this$0;
        this.A05 = key;
        this.A04 = new LinkedHashMultimap.ValueEntry[DNI.A00(1.0d, expectedValues)];
    }

    @Override // X.DPY
    public final DPY<K, V> ALG() {
        return this.A02;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Arrays.fill(this.A04, (Object) null);
        this.A01 = 0;
        for (DPY<K, V> dpyALG = this.A02; dpyALG != this; dpyALG = dpyALG.ALG()) {
            LinkedHashMultimap.ValueEntry valueEntry = (LinkedHashMultimap.ValueEntry) dpyALG;
            LinkedHashMultimap.ValueEntry<K, V> valueEntry2 = valueEntry.predecessorInMultimap;
            valueEntry2.getClass();
            LinkedHashMultimap.ValueEntry<K, V> valueEntry3 = valueEntry.successorInMultimap;
            valueEntry3.getClass();
            valueEntry2.successorInMultimap = valueEntry3;
            valueEntry3.predecessorInMultimap = valueEntry2;
        }
        this.A02 = this;
        this.A03 = this;
        this.A00++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<V> iterator() {
        return new DPW(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A01;
    }

    @Override // X.DPY
    public final void AeA(DPY<K, V> entry) {
        this.A03 = entry;
    }

    @Override // X.DPY
    public final void Aes(DPY<K, V> entry) {
        this.A02 = entry;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(V v) {
        int iA01 = DNI.A01(AnonymousClass006.A0D(v));
        int length = (r1.length - 1) & iA01;
        LinkedHashMultimap.ValueEntry<K, V> valueEntry = this.A04[length];
        for (LinkedHashMultimap.ValueEntry<K, V> valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
            if (valueEntry2.smearedValueHash == iA01 && Objects.equal(valueEntry2.getValue(), v)) {
                return false;
            }
        }
        LinkedHashMultimap.ValueEntry<K, V> valueEntry3 = new LinkedHashMultimap.ValueEntry<>(valueEntry, this.A05, v, iA01);
        DPY<K, V> dpy = this.A03;
        dpy.Aes(valueEntry3);
        valueEntry3.predecessorInValueSet = dpy;
        valueEntry3.successorInValueSet = this;
        this.A03 = valueEntry3;
        LinkedHashMultimap linkedHashMultimap = this.A06;
        LinkedHashMultimap.ValueEntry<K, V> valueEntry4 = linkedHashMultimap.A01.predecessorInMultimap;
        valueEntry4.getClass();
        valueEntry4.successorInMultimap = valueEntry3;
        valueEntry3.predecessorInMultimap = valueEntry4;
        LinkedHashMultimap.ValueEntry<K, V> valueEntry5 = linkedHashMultimap.A01;
        valueEntry3.successorInMultimap = valueEntry5;
        valueEntry5.predecessorInMultimap = valueEntry3;
        LinkedHashMultimap.ValueEntry<K, V>[] valueEntryArr = this.A04;
        valueEntryArr[length] = valueEntry3;
        int i = this.A01 + 1;
        this.A01 = i;
        this.A00++;
        int length2 = valueEntryArr.length;
        if (i <= 1.0d * length2 || length2 >= 1073741824) {
            return true;
        }
        int i2 = length2 * 2;
        LinkedHashMultimap.ValueEntry<K, V>[] valueEntryArr2 = new LinkedHashMultimap.ValueEntry[i2];
        this.A04 = valueEntryArr2;
        int i3 = i2 - 1;
        for (DPY<K, V> dpyALG = this.A02; dpyALG != this; dpyALG = dpyALG.ALG()) {
            LinkedHashMultimap.ValueEntry<K, V> valueEntry6 = (LinkedHashMultimap.ValueEntry) dpyALG;
            int i4 = valueEntry6.smearedValueHash & i3;
            valueEntry6.nextInValueBucket = valueEntryArr2[i4];
            valueEntryArr2[i4] = valueEntry6;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object o) {
        int iA01 = DNI.A01(AnonymousClass006.A0D(o));
        for (LinkedHashMultimap.ValueEntry<K, V> valueEntry = this.A04[(r1.length - 1) & iA01]; valueEntry != null; valueEntry = valueEntry.nextInValueBucket) {
            if (valueEntry.smearedValueHash == iA01 && Objects.equal(valueEntry.getValue(), o)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        int iA01 = DNI.A01(AnonymousClass006.A0D(o));
        int length = (r1.length - 1) & iA01;
        LinkedHashMultimap.ValueEntry<K, V> valueEntry = null;
        for (LinkedHashMultimap.ValueEntry<K, V> valueEntry2 = this.A04[length]; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
            if (valueEntry2.smearedValueHash == iA01 && Objects.equal(valueEntry2.getValue(), o)) {
                if (valueEntry == null) {
                    this.A04[length] = valueEntry2.nextInValueBucket;
                } else {
                    valueEntry.nextInValueBucket = valueEntry2.nextInValueBucket;
                }
                DPY<K, V> dpy = valueEntry2.predecessorInValueSet;
                dpy.getClass();
                DPY<K, V> dpy2 = valueEntry2.successorInValueSet;
                dpy2.getClass();
                dpy.Aes(dpy2);
                dpy2.AeA(dpy);
                LinkedHashMultimap.ValueEntry<K, V> valueEntry3 = valueEntry2.predecessorInMultimap;
                valueEntry3.getClass();
                LinkedHashMultimap.ValueEntry<K, V> valueEntry4 = valueEntry2.successorInMultimap;
                valueEntry4.getClass();
                valueEntry3.successorInMultimap = valueEntry4;
                valueEntry4.predecessorInMultimap = valueEntry3;
                this.A01--;
                this.A00++;
                return true;
            }
            valueEntry = valueEntry2;
        }
        return false;
    }
}
