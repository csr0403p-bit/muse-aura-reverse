package X;

/* renamed from: X.CqJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4211CqJ implements InterfaceC3288C9m {
    public static final C4211CqJ A00 = new C4211CqJ();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;
    public static final C2580BeF A04;
    public static final C2580BeF A05;
    public static final C2580BeF A06;

    static {
        Cx8 cx8A06 = Cx8.A06("landmarkMode");
        EnumC4486CxF enumC4486CxF = EnumC4486CxF.DEFAULT;
        A01 = Cx8.A0F(enumC4486CxF, cx8A06);
        A02 = Cx8.A0H(enumC4486CxF, "classificationMode");
        A03 = Cx8.A0I(enumC4486CxF, "performanceMode");
        A04 = Cx8.A0J(enumC4486CxF, "contourMode");
        A05 = Cx8.A0K(enumC4486CxF, "isTrackingEnabled");
        A06 = Cx8.A0L(enumC4486CxF, "minFaceSize");
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        Cbx cbx = (Cbx) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, cbx.A02);
        interfaceC3892CgV2.A3F(A02, cbx.A00);
        interfaceC3892CgV2.A3F(A03, cbx.A03);
        interfaceC3892CgV2.A3F(A04, cbx.A01);
        interfaceC3892CgV2.A3F(A05, cbx.A04);
        interfaceC3892CgV2.A3F(A06, cbx.A05);
    }
}
