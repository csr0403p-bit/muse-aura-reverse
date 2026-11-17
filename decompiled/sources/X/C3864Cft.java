package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.Cft, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3864Cft implements InterfaceC3288C9m<AbstractC3928ChA> {
    public static final C3864Cft A00 = new C3864Cft();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;
    public static final C2580BeF A04;
    public static final C2580BeF A05;
    public static final C2580BeF A06;
    public static final C2580BeF A07;

    static {
        Map map = Collections.EMPTY_MAP;
        A02 = C2580BeF.A00("eventTimeMs", map);
        A01 = C2580BeF.A00("eventCode", map);
        A03 = C2580BeF.A00("eventUptimeMs", map);
        A06 = C2580BeF.A00("sourceExtension", map);
        A05 = C2580BeF.A00("sourceExtensionJsonProto3", map);
        A07 = C2580BeF.A00("timezoneOffsetSeconds", map);
        A04 = C2580BeF.A00("networkConnectionInfo", map);
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        C3865Cfu c3865Cfu = (C3865Cfu) ((AbstractC3928ChA) obj);
        interfaceC3892CgV2.A3E(A02, c3865Cfu.A00);
        interfaceC3892CgV2.A3F(A01, c3865Cfu.A04);
        interfaceC3892CgV2.A3E(A03, c3865Cfu.A01);
        interfaceC3892CgV2.A3F(A06, c3865Cfu.A06);
        interfaceC3892CgV2.A3F(A05, c3865Cfu.A05);
        interfaceC3892CgV2.A3E(A07, c3865Cfu.A02);
        interfaceC3892CgV2.A3F(A04, c3865Cfu.A03);
    }
}
