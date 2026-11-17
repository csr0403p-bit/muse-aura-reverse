package com.google.common.collect;

import X.C5029DPn;
import X.C5034DPt;
import X.DPD;
import X.DX6;
import X.InterfaceC5026DPa;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Set;

/* loaded from: classes5.dex */
public class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    public static final RegularImmutableMultiset<Object> A03 = new RegularImmutableMultiset<>(new C5034DPt());
    public transient ImmutableSet<E> A00;
    public final transient C5034DPt<E> A01;
    public final transient int A02;

    public final class ElementSet extends IndexedImmutableSet<E> {
        public ElementSet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object object) {
            return RegularImmutableMultiset.this.contains(object);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return RegularImmutableMultiset.this.A01.A02;
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final int[] counts;
        public final Object[] elements;

        public Object readResolve() {
            int length = this.elements.length;
            C5029DPn c5029DPn = new C5029DPn();
            c5029DPn.A01 = false;
            C5034DPt<E> c5034DPt = new C5034DPt<>();
            c5034DPt.A09(length, 1.0f);
            c5029DPn.A00 = c5034DPt;
            int i = 0;
            while (true) {
                Object[] objArr = this.elements;
                if (i >= objArr.length) {
                    return c5029DPn.build();
                }
                c5029DPn.A02(objArr[i], this.counts[i]);
                i++;
            }
        }

        public SerializedForm(InterfaceC5026DPa<? extends Object> interfaceC5026DPa) {
            int size = interfaceC5026DPa.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (DPD dpd : interfaceC5026DPa.entrySet()) {
                this.elements[i] = dpd.A01();
                this.counts[i] = dpd.A00();
                i++;
            }
        }
    }

    @Override // X.InterfaceC5026DPa
    public final int A7Q(Object element) {
        C5034DPt<E> c5034DPt = this.A01;
        int iA04 = c5034DPt.A04(element);
        if (iA04 == -1) {
            return 0;
        }
        return c5034DPt.A05[iA04];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC5026DPa
    public final int size() {
        return this.A02;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public RegularImmutableMultiset(C5034DPt<E> contents) {
        this.A01 = contents;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = contents.A02;
            if (i >= i2) {
                this.A02 = DX6.A01(j);
                return;
            } else {
                Preconditions.checkElementIndex(i, i2);
                j += contents.A05[i];
                i++;
            }
        }
    }

    @Override // X.InterfaceC5026DPa
    public final /* bridge */ /* synthetic */ Set A9t() {
        return A0B();
    }
}
