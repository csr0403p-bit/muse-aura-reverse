package X;

import java.util.ConcurrentModificationException;

/* renamed from: X.AIe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0927AIe<K, V> {
    public int A00;
    public int A01 = -1;
    public int A02;
    public final C0924AIa<K, V> A03;

    public final void A00() {
        C0924AIa<K, V> c0924AIa = this.A03;
        C0924AIa c0924AIa2 = C0924AIa.A00;
        if (c0924AIa.modCount != this.A02) {
            throw new ConcurrentModificationException();
        }
    }

    public final void A01() {
        while (true) {
            int i = this.A00;
            C0924AIa<K, V> c0924AIa = this.A03;
            C0924AIa c0924AIa2 = C0924AIa.A00;
            if (i >= c0924AIa.length || c0924AIa.presenceArray[i] >= 0) {
                return;
            } else {
                this.A00 = i + 1;
            }
        }
    }

    public final boolean hasNext() {
        int i = this.A00;
        C0924AIa<K, V> c0924AIa = this.A03;
        C0924AIa c0924AIa2 = C0924AIa.A00;
        return i < c0924AIa.length;
    }

    public AbstractC0927AIe(C0924AIa<K, V> c0924AIa) {
        this.A03 = c0924AIa;
        C0924AIa c0924AIa2 = C0924AIa.A00;
        this.A02 = c0924AIa.modCount;
        A01();
    }

    public final void remove() {
        A00();
        if (this.A01 == -1) {
            throw C3cG.A0Q("Call next() before removing element from the iterator.");
        }
        C0924AIa<K, V> c0924AIa = this.A03;
        c0924AIa.A06();
        C0924AIa.A03(c0924AIa, this.A01);
        this.A01 = -1;
        this.A02 = c0924AIa.modCount;
    }
}
