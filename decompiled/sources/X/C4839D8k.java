package X;

/* renamed from: X.D8k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4839D8k implements InterfaceC3288C9m {
    public static final C4839D8k A00 = new C4839D8k();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;
    public static final C2580BeF A04;
    public static final C2580BeF A05;
    public static final C2580BeF A06;
    public static final C2580BeF A07;
    public static final C2580BeF A08;
    public static final C2580BeF A09;
    public static final C2580BeF A0A;

    static {
        Cx8 cx8A02 = Cx8.A02();
        EnumC4486CxF enumC4486CxF = EnumC4486CxF.DEFAULT;
        A01 = Cx8.A0F(enumC4486CxF, cx8A02);
        A02 = Cx8.A0H(enumC4486CxF, "errorCode");
        A03 = Cx8.A0I(enumC4486CxF, "isColdCall");
        A04 = Cx8.A0J(enumC4486CxF, "autoManageModelOnBackground");
        A05 = Cx8.A0K(enumC4486CxF, "autoManageModelOnLowMemory");
        A06 = Cx8.A0L(enumC4486CxF, "isNnApiEnabled");
        A07 = Cx8.A0M(enumC4486CxF, "eventsCount");
        A08 = Cx8.A0G(enumC4486CxF, Cx8.A06("otherErrors"), 8);
        A09 = Cx8.A0G(enumC4486CxF, Cx8.A06("remoteConfigValueForAcceleration"), 9);
        A0A = Cx8.A0G(enumC4486CxF, Cx8.A06("isAccelerated"), 10);
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        C4841D8m c4841D8m = (C4841D8m) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, c4841D8m.A04);
        interfaceC3892CgV2.A3F(A02, c4841D8m.A00);
        interfaceC3892CgV2.A3F(A03, c4841D8m.A01);
        interfaceC3892CgV2.A3F(A04, c4841D8m.A02);
        interfaceC3892CgV2.A3F(A05, c4841D8m.A03);
        interfaceC3892CgV2.A3F(A06, null);
        interfaceC3892CgV2.A3F(A07, null);
        interfaceC3892CgV2.A3F(A08, null);
        interfaceC3892CgV2.A3F(A09, null);
        interfaceC3892CgV2.A3F(A0A, null);
    }
}
