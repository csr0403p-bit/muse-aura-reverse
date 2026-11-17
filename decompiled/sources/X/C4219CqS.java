package X;

/* renamed from: X.CqS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4219CqS implements InterfaceC3288C9m {
    public static final C4219CqS A00 = new C4219CqS();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;

    static {
        Cx8 cx8A03 = Cx8.A03();
        EnumC4486CxF enumC4486CxF = EnumC4486CxF.DEFAULT;
        A01 = Cx8.A0F(enumC4486CxF, cx8A03);
        A02 = Cx8.A0H(enumC4486CxF, "eventCount");
        A03 = Cx8.A0I(enumC4486CxF, "inferenceDurationStats");
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        C3726CdP c3726CdP = (C3726CdP) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, c3726CdP.A00);
        interfaceC3892CgV2.A3F(A02, c3726CdP.A02);
        interfaceC3892CgV2.A3F(A03, c3726CdP.A01);
    }
}
