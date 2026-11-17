package X;

/* loaded from: classes6.dex */
public final class GKU extends GKQ {
    public final GKZ A00;

    public final boolean equals(Object o) {
        if (!(o instanceof GKU)) {
            return false;
        }
        GKZ gkz = ((GKU) o).A00;
        GJL gjl = this.A00.A00;
        GKP gkpA0F = gjl.A0F();
        GJL gjl2 = gkz.A00;
        if (gkpA0F.equals(gjl2.A0F()) && gjl.typeUrl_.equals(gjl2.typeUrl_)) {
            return BV7.A1X(gjl.value_, gjl2.value_, false);
        }
        return false;
    }

    public final int hashCode() {
        GKZ gkz = this.A00;
        return BV7.A0D(gkz.A00, gkz.A01);
    }

    public final String toString() {
        GJL gjl = this.A00.A00;
        String str = gjl.typeUrl_;
        int iOrdinal = gjl.A0F().ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str, iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }

    public GKU(GKZ serialization) {
        this.A00 = serialization;
    }
}
