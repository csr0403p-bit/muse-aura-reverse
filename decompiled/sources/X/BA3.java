package X;

/* loaded from: classes4.dex */
public final class BA3 {
    public final Integer A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BA3);
    }

    public final int hashCode() {
        int iIntValue = this.A00.intValue();
        return C0KA.A00(((iIntValue != 0 ? "SecureOn" : "Inherit").hashCode() + iIntValue) * 31, this.A01);
    }

    public BA3(Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
    }

    public BA3() {
        this(C79.A00, true);
    }
}
