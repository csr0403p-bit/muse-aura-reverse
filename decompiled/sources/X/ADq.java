package X;

/* loaded from: classes4.dex */
public final class ADq extends C0968AJv implements AT1 {
    public static final ADq A00 = new ADq(1, 0);

    public ADq(int i, int i2) {
        super(i, i2, 1);
    }

    public final boolean A00(int i) {
        return this.A00 <= i && i <= this.A01;
    }

    @Override // X.AT1
    public final /* bridge */ /* synthetic */ Comparable AF8() {
        return Integer.valueOf(this.A01);
    }

    @Override // X.AT1
    public final /* bridge */ /* synthetic */ Comparable AKt() {
        return Integer.valueOf(this.A00);
    }

    @Override // X.C0968AJv
    public final boolean equals(Object obj) {
        if (!(obj instanceof ADq)) {
            return false;
        }
        if (isEmpty() && ((C0968AJv) obj).isEmpty()) {
            return true;
        }
        C0968AJv c0968AJv = (C0968AJv) obj;
        return this.A00 == c0968AJv.A00 && this.A01 == c0968AJv.A01;
    }

    @Override // X.C0968AJv
    public final String toString() {
        return FGI.A07(this.A00, this.A01, "..");
    }

    @Override // X.C0968AJv
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.A00 * 31) + this.A01;
    }
}
