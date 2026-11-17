package X;

/* renamed from: X.Cwz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4477Cwz implements InterfaceC3288C9m {
    public static final C4477Cwz A00 = new C4477Cwz();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;
    public static final C2580BeF A04;

    static {
        Cx8 cx8A06 = Cx8.A06("imageFormat");
        EnumC4486CxF enumC4486CxF = EnumC4486CxF.DEFAULT;
        A01 = Cx8.A0F(enumC4486CxF, cx8A06);
        A02 = Cx8.A0H(enumC4486CxF, "originalImageSize");
        A03 = Cx8.A0I(enumC4486CxF, "compressedImageSize");
        A04 = Cx8.A0J(enumC4486CxF, "isOdmlImage");
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        Cc2 cc2 = (Cc2) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, cc2.A00);
        interfaceC3892CgV2.A3F(A02, cc2.A01);
        interfaceC3892CgV2.A3F(A03, null);
        interfaceC3892CgV2.A3F(A04, null);
    }
}
