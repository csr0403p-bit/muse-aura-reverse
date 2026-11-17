package X;

/* loaded from: classes6.dex */
public final class GKW {
    public static final InterfaceC9469GKl A07 = new InterfaceC9469GKl() { // from class: X.GKj
    };
    public final int A00;
    public final AbstractC9465GKh A01;
    public final C9461GKd A02;
    public final GJC A03;
    public final boolean A04;
    public final boolean A05;
    public final InterfaceC9469GKl A06;

    public GKW(AbstractC9465GKh key, InterfaceC9469GKl keyStatusType, GJC id, int isPrimary, boolean keyParsingFailed, boolean keyExportLogger) {
        this.A01 = key;
        this.A03 = id;
        int iOrdinal = id.ordinal();
        this.A02 = iOrdinal != 1 ? iOrdinal != 3 ? C9461GKd.A02 : C9461GKd.A01 : C9461GKd.A03;
        this.A00 = isPrimary;
        this.A04 = keyParsingFailed;
        this.A05 = keyExportLogger;
        this.A06 = keyStatusType;
    }
}
