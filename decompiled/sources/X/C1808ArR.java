package X;

/* renamed from: X.ArR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1808ArR {
    public final int A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C1808ArR) && this.A00 == ((C1808ArR) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        int i = this.A00;
        return i == 0 ? "LineHeightStyle.Mode.Fixed" : i == 1 ? "LineHeightStyle.Mode.Minimum" : i == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
