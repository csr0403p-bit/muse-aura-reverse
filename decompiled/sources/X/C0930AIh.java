package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.AIh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0930AIh extends AbstractC0927AIe implements Iterator, BOA {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        A00();
        int i = this.A00;
        C0924AIa<K, V> c0924AIa = this.A03;
        C0924AIa c0924AIa2 = C0924AIa.A00;
        if (i >= c0924AIa.length) {
            throw new NoSuchElementException();
        }
        this.A00 = i + 1;
        this.A01 = i;
        AId aId = new AId(c0924AIa, i);
        A01();
        return aId;
    }
}
