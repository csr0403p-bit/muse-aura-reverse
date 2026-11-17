package X;

import java.util.Locale;

/* renamed from: X.Dyb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6233Dyb {
    public static final C6233Dyb A03 = new C6233Dyb(1.0f, 1.0f);
    public final float A00;
    public final float A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C6233Dyb c6233Dyb = (C6233Dyb) obj;
                if (this.A01 != c6233Dyb.A01 || this.A00 != c6233Dyb.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.A01)) * 31) + Float.floatToRawIntBits(this.A00);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.A01), Float.valueOf(this.A00));
    }

    public C6233Dyb(float f, float f2) {
        C1G.A07(AnonymousClass002.A1N((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
        C1G.A07(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = Math.round(f * 1000.0f);
    }
}
