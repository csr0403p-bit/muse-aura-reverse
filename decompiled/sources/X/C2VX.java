package X;

/* renamed from: X.2VX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2VX implements ARL {
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C2VX) && Float.compare(1.0f, 1.0f) == 0);
    }

    @Override // X.ARL
    public final long A6j(long j, long j2) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(1.0f);
        return (jFloatToRawIntBits << 32) | (4294967295L & jFloatToRawIntBits);
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f);
    }

    public final String toString() {
        return FGI.A0F("FixedScale(value=", ')', 1.0f);
    }
}
