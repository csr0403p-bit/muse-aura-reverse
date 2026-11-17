package X;

/* renamed from: X.CqP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4217CqP implements InterfaceC3288C9m {
    public static final C4217CqP A00 = new C4217CqP();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;
    public static final C2580BeF A04;

    static {
        Cx8 cx8A01 = Cx8.A01();
        EnumC4487CxG enumC4487CxG = EnumC4487CxG.DEFAULT;
        A01 = Cx8.A0N(enumC4487CxG, cx8A01);
        A02 = Cx8.A0P(enumC4487CxG, "isColdCall");
        A03 = Cx8.A0Q(enumC4487CxG, "imageInfo");
        A04 = Cx8.A0R(enumC4487CxG, "detectorOptions");
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        C3659CcC c3659CcC = (C3659CcC) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, c3659CcC.A00);
        interfaceC3892CgV2.A3F(A02, c3659CcC.A02);
        interfaceC3892CgV2.A3F(A03, null);
        interfaceC3892CgV2.A3F(A04, c3659CcC.A01);
    }
}
