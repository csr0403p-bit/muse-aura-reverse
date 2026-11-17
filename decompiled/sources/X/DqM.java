package X;

/* loaded from: classes5.dex */
public final class DqM extends C06G {
    public final float A00;
    public final float A01;
    public final C5845Dqb A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DqM) {
                DqM dqM = (DqM) obj;
                if (Float.compare(this.A00, dqM.A00) != 0 || Float.compare(this.A01, dqM.A01) != 0 || !C7384Etj.areEqual(this.A02, dqM.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A02(Float.floatToIntBits(this.A00) * 31, this.A01));
    }

    public DqM(C5845Dqb c5845Dqb, float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = c5845Dqb;
    }
}
