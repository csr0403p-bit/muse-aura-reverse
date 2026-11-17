package X;

/* renamed from: X.CqT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4220CqT implements InterfaceC3288C9m {
    public static final C4220CqT A00 = new C4220CqT();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;

    static {
        Cx8 cx8A03 = Cx8.A03();
        EnumC4487CxG enumC4487CxG = EnumC4487CxG.DEFAULT;
        A01 = Cx8.A0N(enumC4487CxG, cx8A03);
        A02 = Cx8.A0P(enumC4487CxG, "eventCount");
        A03 = Cx8.A0Q(enumC4487CxG, "inferenceDurationStats");
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        C3728CdR c3728CdR = (C3728CdR) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, c3728CdR.A00);
        interfaceC3892CgV2.A3F(A02, c3728CdR.A02);
        interfaceC3892CgV2.A3F(A03, c3728CdR.A01);
    }
}
