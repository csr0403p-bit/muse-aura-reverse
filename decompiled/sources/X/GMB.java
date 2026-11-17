package X;

/* loaded from: classes6.dex */
public final class GMB extends GLK {
    public final GLK A00;
    public final GMQ A01;
    public final String A02;
    public final GMN A03;

    public final boolean equals(Object o) {
        if (!(o instanceof GMB)) {
            return false;
        }
        GMB gmb = (GMB) o;
        if (gmb.A03.equals(this.A03) && gmb.A00.equals(this.A00) && gmb.A02.equals(this.A02)) {
            return BV7.A1X(gmb.A01, this.A01, false);
        }
        return false;
    }

    public final int hashCode() {
        return BV7.A0F(GMB.class, this.A02, this.A03, this.A00, this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sbA0x.append(this.A02);
        sbA0x.append(", dekParsingStrategy: ");
        sbA0x.append(this.A03);
        sbA0x.append(", dekParametersForNewKeys: ");
        sbA0x.append(this.A00);
        sbA0x.append(", variant: ");
        sbA0x.append(this.A01);
        return BV7.A10(sbA0x);
    }

    public GMB(GLK variant, GMN kekUri, GMQ dekParsingStrategy, String dekParametersForNewKeys) {
        this.A01 = dekParsingStrategy;
        this.A02 = dekParametersForNewKeys;
        this.A03 = kekUri;
        this.A00 = variant;
    }
}
