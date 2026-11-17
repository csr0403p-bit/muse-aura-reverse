package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.Cfs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3863Cfs implements InterfaceC3288C9m<Ch9> {
    public static final C3863Cfs A00 = new C3863Cfs();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;
    public static final C2580BeF A04;
    public static final C2580BeF A05;
    public static final C2580BeF A06;
    public static final C2580BeF A07;

    static {
        Map map = Collections.EMPTY_MAP;
        A06 = C2580BeF.A00("requestTimeMs", map);
        A07 = C2580BeF.A00("requestUptimeMs", map);
        A01 = C2580BeF.A00("clientInfo", map);
        A04 = C2580BeF.A00("logSource", map);
        A03 = C2580BeF.A00("logSourceName", map);
        A02 = C2580BeF.A00("logEvent", map);
        A05 = C2580BeF.A00("qosTier", map);
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        C3862Cfr c3862Cfr = (C3862Cfr) ((Ch9) obj);
        interfaceC3892CgV2.A3E(A06, c3862Cfr.A00);
        interfaceC3892CgV2.A3E(A07, c3862Cfr.A01);
        interfaceC3892CgV2.A3F(A01, c3862Cfr.A02);
        interfaceC3892CgV2.A3F(A04, c3862Cfr.A04);
        interfaceC3892CgV2.A3F(A03, c3862Cfr.A05);
        interfaceC3892CgV2.A3F(A02, c3862Cfr.A06);
        interfaceC3892CgV2.A3F(A05, c3862Cfr.A03);
    }
}
