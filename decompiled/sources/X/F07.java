package X;

/* loaded from: classes5.dex */
public final class F07 implements Ejq {
    public final Ejq A00;
    public final Ejq A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.facebook.fresco.vito.source.IncreasingQualityImageSource");
                F07 f07 = (F07) obj;
                if (!this.A01.equals(f07.A01) || !this.A00.equals(f07.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ejq
    public final String ADg() {
        return "IncreasingQualityImageSource";
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        Ejq ejq = this.A01;
        Ejq ejq2 = this.A00;
        StringBuilder sbA0f = C3cG.A0f(ejq, "IncreasingQualityImageSource(lowResSource=");
        sbA0f.append(", highResSource=");
        sbA0f.append(ejq2);
        return C3cJ.A0L(null, ", extras=", sbA0f);
    }

    public F07(Ejq ejq, Ejq ejq2) {
        this.A01 = ejq;
        this.A00 = ejq2;
    }
}
