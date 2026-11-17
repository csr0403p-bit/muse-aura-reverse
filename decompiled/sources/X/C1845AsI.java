package X;

/* renamed from: X.AsI, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1845AsI {
    public final int A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C1845AsI) && this.A00 == ((C1845AsI) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        int i = this.A00;
        return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
    }
}
