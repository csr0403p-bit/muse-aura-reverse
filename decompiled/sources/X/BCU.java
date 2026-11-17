package X;

/* loaded from: classes4.dex */
public final class BCU {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BCU) && this.A00.equals(((BCU) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C8j4.A0x("OpaqueKey(key=", this.A00);
    }

    public BCU(String str) {
        this.A00 = str;
    }
}
