package X;

/* loaded from: classes5.dex */
public final class D9W implements InterfaceC3288C9m {
    public static final D9W A00 = new D9W();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;
    public static final C2580BeF A04;
    public static final C2580BeF A05;
    public static final C2580BeF A06;

    static {
        Cx8 cx8A06 = Cx8.A06("maxMs");
        EnumC4487CxG enumC4487CxG = EnumC4487CxG.DEFAULT;
        A01 = Cx8.A0N(enumC4487CxG, cx8A06);
        A02 = Cx8.A0P(enumC4487CxG, "minMs");
        A03 = Cx8.A0Q(enumC4487CxG, "avgMs");
        A04 = Cx8.A0R(enumC4487CxG, "firstQuartileMs");
        A05 = Cx8.A0S(enumC4487CxG, "medianMs");
        A06 = Cx8.A0T(enumC4487CxG, "thirdQuartileMs");
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        D9Y d9y = (D9Y) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, d9y.A00);
        interfaceC3892CgV2.A3F(A02, d9y.A01);
        interfaceC3892CgV2.A3F(A03, d9y.A02);
        interfaceC3892CgV2.A3F(A04, d9y.A03);
        interfaceC3892CgV2.A3F(A05, d9y.A04);
        interfaceC3892CgV2.A3F(A06, d9y.A05);
    }
}
