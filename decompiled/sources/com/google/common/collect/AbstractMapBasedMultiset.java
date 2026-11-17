package com.google.common.collect;

import X.AbstractC3830CfJ;
import X.C5034DPt;
import X.DPC;
import X.DPE;
import X.DPj;
import X.DQ3;
import X.DX6;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class AbstractMapBasedMultiset<E> extends DPj<E> implements Serializable {
    public static final long serialVersionUID = 0;
    public transient long A00;
    public transient C5034DPt<E> A01;

    public final C5034DPt A03() {
        if (this instanceof LinkedHashMultiset) {
            DQ3 dq3 = new DQ3();
            dq3.A09(3, 1.0f);
            return dq3;
        }
        C5034DPt c5034DPt = new C5034DPt();
        c5034DPt.A09(3, 1.0f);
        return c5034DPt;
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

    @Override // X.InterfaceC5026DPa
    public final boolean AdC(E element, int oldCount, int newCount) {
        long j;
        long j2;
        AbstractC3830CfJ.A00(oldCount, "oldCount");
        AbstractC3830CfJ.A00(newCount, "newCount");
        int iA04 = this.A01.A04(element);
        if (iA04 == -1) {
            if (oldCount == 0) {
                if (newCount > 0) {
                    this.A01.A05(element, newCount);
                    j = this.A00;
                    j2 = j + newCount;
                }
                return true;
            }
            return false;
        }
        C5034DPt<E> c5034DPt = this.A01;
        Preconditions.checkElementIndex(iA04, c5034DPt.A02);
        if (c5034DPt.A05[iA04] == oldCount) {
            C5034DPt<E> c5034DPt2 = this.A01;
            if (newCount == 0) {
                c5034DPt2.A03(iA04);
                j2 = this.A00 - oldCount;
            } else {
                Preconditions.checkElementIndex(iA04, c5034DPt2.A02);
                c5034DPt2.A05[iA04] = newCount;
                j = this.A00;
                newCount -= oldCount;
                j2 = j + newCount;
            }
        }
        return false;
        this.A00 = j2;
        return true;
    }

    @Override // X.DPj, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A01.A06();
        this.A00 = 0L;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC5026DPa
    public final int size() {
        return DX6.A01(this.A00);
    }

    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        int i = stream.readInt();
        this.A01 = A03();
        for (int i2 = 0; i2 < i; i2++) {
            A02(stream.readObject(), stream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        DPC.A02(this, stream);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new DPE(this, entrySet().iterator());
    }
}
