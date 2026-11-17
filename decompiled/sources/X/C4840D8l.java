package X;

/* renamed from: X.D8l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4840D8l implements InterfaceC3288C9m {
    public static final C4840D8l A00 = new C4840D8l();
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
        EnumC4487CxG enumC4487CxG = EnumC4487CxG.DEFAULT;
        A01 = Cx8.A0N(enumC4487CxG, cx8A02);
        A02 = Cx8.A0P(enumC4487CxG, "errorCode");
        A03 = Cx8.A0Q(enumC4487CxG, "isColdCall");
        A04 = Cx8.A0R(enumC4487CxG, "autoManageModelOnBackground");
        A05 = Cx8.A0S(enumC4487CxG, "autoManageModelOnLowMemory");
        A06 = Cx8.A0T(enumC4487CxG, "isNnApiEnabled");
        A07 = Cx8.A0U(enumC4487CxG, "eventsCount");
        A08 = Cx8.A0O(enumC4487CxG, Cx8.A06("otherErrors"), 8);
        A09 = Cx8.A0O(enumC4487CxG, Cx8.A06("remoteConfigValueForAcceleration"), 9);
        A0A = Cx8.A0O(enumC4487CxG, Cx8.A06("isAccelerated"), 10);
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        C4842D8n c4842D8n = (C4842D8n) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, c4842D8n.A04);
        interfaceC3892CgV2.A3F(A02, c4842D8n.A00);
        interfaceC3892CgV2.A3F(A03, c4842D8n.A01);
        interfaceC3892CgV2.A3F(A04, c4842D8n.A02);
        interfaceC3892CgV2.A3F(A05, c4842D8n.A03);
        interfaceC3892CgV2.A3F(A06, null);
        interfaceC3892CgV2.A3F(A07, null);
        interfaceC3892CgV2.A3F(A08, null);
        interfaceC3892CgV2.A3F(A09, null);
        interfaceC3892CgV2.A3F(A0A, null);
    }
}
