package X;

/* renamed from: X.1Xk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04811Xk {
    public final int A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C04811Xk) && this.A00 == ((C04811Xk) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        int i = this.A00;
        return i == 0 ? "Picker" : i == 1 ? "Input" : "Unknown";
    }
}
