package X;

/* loaded from: classes6.dex */
public enum G4h implements GIT {
    A01("STATUS_UNKNOWN"),
    A02("PURCHASE_EXTRACTION_SUCCESS"),
    A03("JSON_PARSE_ERROR"),
    A04("BUNDLE_NULL"),
    A05("DATA_NULL"),
    A06("SIGNATURE_NULL"),
    A07("PURCHASE_LIST_EMPTY"),
    A08("PURCHASE_LIST_NULL");

    public final int a;

    @Override // X.GIT
    public final int A2f() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("<");
        AbstractC7611F5y.A0o(G4h.class, this, sbA0x);
        AbstractC7611F5y.A0p(this, sbA0x, this.a);
        return sbA0x.toString();
    }

    G4h(String str) {
        this.a = i;
    }

    public static G4h A00(int i) {
        switch (i) {
            case 0:
                return A01;
            case 1:
                return A02;
            case 2:
                return A03;
            case 3:
                return A04;
            case 4:
                return A05;
            case 5:
                return A06;
            case 6:
                return A07;
            case 7:
                return A08;
            default:
                return null;
        }
    }
}
