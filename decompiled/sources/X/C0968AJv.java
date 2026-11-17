package X;

import java.util.Iterator;

/* renamed from: X.AJv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C0968AJv implements Iterable<Integer>, BOA {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof C0968AJv)) {
            return false;
        }
        if (isEmpty() && ((C0968AJv) obj).isEmpty()) {
            return true;
        }
        C0968AJv c0968AJv = (C0968AJv) obj;
        return this.A00 == c0968AJv.A00 && this.A01 == c0968AJv.A01 && this.A02 == c0968AJv.A02;
    }

    public final boolean isEmpty() {
        if (this instanceof ADq) {
            return C8j4.A1V(this.A00, this.A01);
        }
        int i = this.A02;
        int i2 = this.A00;
        int i3 = this.A01;
        return i > 0 ? i2 > i3 : i2 < i3;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Integer> iterator() {
        return new AK9(this.A00, this.A01, this.A02);
    }

    public String toString() {
        int i = this.A02;
        int i2 = this.A00;
        StringBuilder sbA0w = C60O.A0w();
        if (i > 0) {
            sbA0w.append(i2);
            sbA0w.append("..");
            sbA0w.append(this.A01);
            sbA0w.append(" step ");
        } else {
            sbA0w.append(i2);
            sbA0w.append(" downTo ");
            sbA0w.append(this.A01);
            sbA0w.append(" step ");
            i = -i;
        }
        sbA0w.append(i);
        return sbA0w.toString();
    }

    public C0968AJv(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.A00 = i;
        this.A01 = AKD.A00(i, i2, i3);
        this.A02 = i3;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.A00 * 31) + this.A01) * 31) + this.A02;
    }
}
