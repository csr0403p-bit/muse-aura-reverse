package X;

/* loaded from: classes6.dex */
public final class GKX extends GKQ {
    public final GKP A00;
    public final String A01;

    public final String toString() {
        String str = this.A01;
        int iOrdinal = this.A00.ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str, iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }

    public GKX(GKP typeUrl, String outputPrefixType) {
        this.A01 = outputPrefixType;
        this.A00 = typeUrl;
    }
}
