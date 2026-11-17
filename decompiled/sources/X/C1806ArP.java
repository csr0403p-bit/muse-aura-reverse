package X;

/* renamed from: X.ArP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1806ArP {
    public final float A00;

    public static String A00(float f) {
        return f == 0.0f ? "LineHeightStyle.Alignment.Top" : f == 0.5f ? "LineHeightStyle.Alignment.Center" : f == -1.0f ? "LineHeightStyle.Alignment.Proportional" : f == 1.0f ? "LineHeightStyle.Alignment.Bottom" : FGI.A0F("LineHeightStyle.Alignment(topPercentage = ", ')', f);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1806ArP) && Float.compare(this.A00, ((C1806ArP) obj).A00) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return A00(this.A00);
    }

    public /* synthetic */ C1806ArP(float f) {
        this.A00 = f;
    }
}
