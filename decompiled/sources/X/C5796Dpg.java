package X;

/* renamed from: X.Dpg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5796Dpg {
    public int A00;
    public final C5817Dq1 A01;

    public final void A00(EnumC5706Dno enumC5706Dno) {
        if (enumC5706Dno != null) {
            C5817Dq1 c5817Dq1 = this.A01;
            if (c5817Dq1.useNetworkQuality) {
                int iOrdinal = enumC5706Dno.ordinal();
                this.A00 = iOrdinal != 4 ? iOrdinal != 3 ? iOrdinal != 2 ? iOrdinal != 1 ? iOrdinal != 0 ? c5817Dq1.defaultValue : c5817Dq1.degradedValue : c5817Dq1.poorValue : c5817Dq1.moderateValue : c5817Dq1.goodValue : c5817Dq1.excellentValue;
            }
        }
    }

    public C5796Dpg(C5817Dq1 c5817Dq1) {
        this.A01 = c5817Dq1;
        this.A00 = c5817Dq1.defaultValue;
    }
}
