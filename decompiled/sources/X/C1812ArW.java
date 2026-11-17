package X;

/* renamed from: X.ArW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1812ArW {
    public final int A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C1812ArW) && this.A00 == ((C1812ArW) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        int i = this.A00;
        return i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
