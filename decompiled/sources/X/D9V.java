package X;

/* loaded from: classes5.dex */
public final class D9V implements InterfaceC3288C9m {
    public static final D9V A00 = new D9V();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;
    public static final C2580BeF A04;
    public static final C2580BeF A05;
    public static final C2580BeF A06;

    static {
        Cx8 cx8A06 = Cx8.A06("maxMs");
        EnumC4486CxF enumC4486CxF = EnumC4486CxF.DEFAULT;
        A01 = Cx8.A0F(enumC4486CxF, cx8A06);
        A02 = Cx8.A0H(enumC4486CxF, "minMs");
        A03 = Cx8.A0I(enumC4486CxF, "avgMs");
        A04 = Cx8.A0J(enumC4486CxF, "firstQuartileMs");
        A05 = Cx8.A0K(enumC4486CxF, "medianMs");
        A06 = Cx8.A0L(enumC4486CxF, "thirdQuartileMs");
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        D9X d9x = (D9X) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, d9x.A00);
        interfaceC3892CgV2.A3F(A02, d9x.A01);
        interfaceC3892CgV2.A3F(A03, d9x.A02);
        interfaceC3892CgV2.A3F(A04, d9x.A03);
        interfaceC3892CgV2.A3F(A05, d9x.A04);
        interfaceC3892CgV2.A3F(A06, d9x.A05);
    }
}
