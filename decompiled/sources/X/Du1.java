package X;

/* loaded from: classes5.dex */
public final class Du1 {
    public final float A00;
    public final long A01;
    public final long A02;

    public Du1(long j, long j2, float f) {
        this.A02 = j2;
        this.A00 = f;
        this.A01 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Du1) {
                Du1 du1 = (Du1) obj;
                if (this.A02 != du1.A02 || this.A00 != du1.A00 || this.A01 != du1.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0E(Long.valueOf(this.A02), Float.valueOf(this.A00), Long.valueOf(this.A01));
    }
}
