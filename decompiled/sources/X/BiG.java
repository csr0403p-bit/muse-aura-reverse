package X;

/* loaded from: classes5.dex */
public final class BiG extends AbstractC2813Blq {
    public final C2771Bkn A00;
    public final AbstractC2866BnZ<byte[]> A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2813Blq) {
                BiG biG = (BiG) ((AbstractC2813Blq) obj);
                if (!this.A01.equals(biG.A01) || !this.A00.equals(biG.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A09(this.A00, BV8.A0A(this.A01));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("In{packet=");
        sbA0x.append(this.A01);
        sbA0x.append(", outputFileOptions=");
        return BV8.A0v(this.A00, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BnZ<[B>;LX/Bkn;)V */
    public BiG(C2771Bkn c2771Bkn, AbstractC2866BnZ abstractC2866BnZ) {
        if (abstractC2866BnZ == null) {
            throw BV4.A0a("Null packet");
        }
        this.A01 = abstractC2866BnZ;
        this.A00 = c2771Bkn;
    }
}
