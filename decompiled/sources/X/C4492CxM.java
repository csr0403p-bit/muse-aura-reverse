package X;

/* renamed from: X.CxM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4492CxM implements InterfaceC3288C9m {
    public static final C4492CxM A00 = new C4492CxM();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;
    public static final C2580BeF A04;
    public static final C2580BeF A05;

    static {
        Cx8 cx8A04 = Cx8.A04();
        EnumC4487CxG enumC4487CxG = EnumC4487CxG.DEFAULT;
        A01 = Cx8.A0N(enumC4487CxG, cx8A04);
        A02 = Cx8.A0P(enumC4487CxG, "errorCodes");
        A03 = Cx8.A0Q(enumC4487CxG, "totalInitializationMs");
        A04 = Cx8.A0R(enumC4487CxG, "loggingInitializationMs");
        A05 = Cx8.A0S(enumC4487CxG, "otherErrors");
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        C3661CcH c3661CcH = (C3661CcH) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, c3661CcH.A01);
        interfaceC3892CgV2.A3F(A02, c3661CcH.A00);
        interfaceC3892CgV2.A3F(A03, null);
        interfaceC3892CgV2.A3F(A04, null);
        interfaceC3892CgV2.A3F(A05, null);
    }
}
