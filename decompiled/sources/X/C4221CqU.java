package X;

/* renamed from: X.CqU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4221CqU implements InterfaceC3288C9m<C4006Cjd> {
    public static final C4221CqU A00 = new C4221CqU();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;
    public static final C2580BeF A04;

    static {
        Cx8 cx8A06 = Cx8.A06("window");
        CxD cxD = CxD.DEFAULT;
        A04 = Cx7.A00(cx8A06, cxD, 1);
        A03 = Cx7.A00(Cx8.A06("logSourceMetrics"), cxD, 2);
        A02 = Cx7.A00(Cx8.A06("globalMetrics"), cxD, 3);
        A01 = Cx7.A00(Cx8.A06("appNamespace"), cxD, 4);
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        C4006Cjd c4006Cjd = (C4006Cjd) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A04, c4006Cjd.A01);
        interfaceC3892CgV2.A3F(A03, c4006Cjd.A03);
        interfaceC3892CgV2.A3F(A02, c4006Cjd.A00);
        interfaceC3892CgV2.A3F(A01, c4006Cjd.A02);
    }
}
