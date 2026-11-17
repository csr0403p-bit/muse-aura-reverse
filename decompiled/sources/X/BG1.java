package X;

/* loaded from: classes4.dex */
public final class BG1 {
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BG1) && C1DG.A08(10.0f, 10.0f) && C1DG.A08(40.0f, 40.0f));
    }

    public final long A00(AXN axn) {
        int iAbr = axn.Abr(10.0f);
        return ((axn.Abr(40.0f) & 32767) << 15) | ((iAbr & 32767) << 0) | ((axn.Abr(10.0f) & 32767) << 30) | ((axn.Abr(40.0f) & 32767) << 45) | Long.MIN_VALUE;
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(10.0f);
        int iFloatToIntBits2 = Float.floatToIntBits(40.0f);
        return (((((((iFloatToIntBits * 31) + iFloatToIntBits2) * 31) + iFloatToIntBits) * 31) + iFloatToIntBits2) * 31) + 1231;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("DpTouchBoundsExpansion(start=");
        C1DG.A07(sbA0x, 10.0f);
        sbA0x.append(", top=");
        C1DG.A07(sbA0x, 40.0f);
        sbA0x.append(", end=");
        C1DG.A07(sbA0x, 10.0f);
        sbA0x.append(", bottom=");
        C1DG.A07(sbA0x, 40.0f);
        sbA0x.append(", isLayoutDirectionAware=");
        sbA0x.append(true);
        return AnonymousClass006.A0z(sbA0x);
    }
}
