package X;

/* renamed from: X.CqN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4215CqN implements InterfaceC3288C9m {
    public static final C4215CqN A00 = new C4215CqN();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;
    public static final C2580BeF A04;
    public static final C2580BeF A05;
    public static final C2580BeF A06;

    static {
        Cx8 cx8A01 = Cx8.A01();
        EnumC4486CxF enumC4486CxF = EnumC4486CxF.DEFAULT;
        A01 = Cx8.A0F(enumC4486CxF, cx8A01);
        A02 = Cx8.A0H(enumC4486CxF, "isColdCall");
        A03 = Cx8.A0I(enumC4486CxF, "imageInfo");
        A04 = Cx8.A0J(enumC4486CxF, "detectorOptions");
        A05 = Cx8.A0K(enumC4486CxF, "contourDetectedFaces");
        A06 = Cx8.A0L(enumC4486CxF, "nonContourDetectedFaces");
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        C3826CfE c3826CfE = (C3826CfE) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, c3826CfE.A01);
        interfaceC3892CgV2.A3F(A02, c3826CfE.A02);
        interfaceC3892CgV2.A3F(A03, null);
        interfaceC3892CgV2.A3F(A04, c3826CfE.A00);
        interfaceC3892CgV2.A3F(A05, c3826CfE.A03);
        interfaceC3892CgV2.A3F(A06, c3826CfE.A04);
    }
}
