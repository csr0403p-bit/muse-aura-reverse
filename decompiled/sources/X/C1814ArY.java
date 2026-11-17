package X;

/* renamed from: X.ArY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1814ArY {
    public final int A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C1814ArY) && this.A00 == ((C1814ArY) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        int i = this.A00;
        return i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == 0 ? "Hyphens.Unspecified" : "Invalid";
    }
}
