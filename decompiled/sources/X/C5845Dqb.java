package X;

/* renamed from: X.Dqb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5845Dqb extends C06G {
    public final float A00;
    public final boolean A01;

    public C5845Dqb() {
        this(0.0f, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5845Dqb) {
                C5845Dqb c5845Dqb = (C5845Dqb) obj;
                if (Float.compare(0.0f, 0.0f) != 0 || this.A01 != c5845Dqb.A01 || Float.compare(this.A00, c5845Dqb.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A01(AnonymousClass005.A02(38347, 0.0f), this.A01) + Float.floatToIntBits(this.A00);
    }

    public C5845Dqb(float f, boolean z) {
        this.A01 = z;
        this.A00 = f;
    }
}
