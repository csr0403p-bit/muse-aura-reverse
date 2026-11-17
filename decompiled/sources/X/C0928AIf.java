package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.AIf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0928AIf extends AbstractC0927AIe implements Iterator, BOA {
    @Override // java.util.Iterator
    public final V next() {
        A00();
        int i = this.A00;
        C0924AIa<K, V> c0924AIa = this.A03;
        C0924AIa c0924AIa2 = C0924AIa.A00;
        if (i >= c0924AIa.length) {
            throw new NoSuchElementException();
        }
        this.A00 = i + 1;
        this.A01 = i;
        V[] vArr = c0924AIa.valuesArray;
        C7384Etj.A0X(vArr);
        V v = vArr[this.A01];
        A01();
        return v;
    }
}
