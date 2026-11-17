package X;

/* loaded from: classes5.dex */
public final class Cx0 implements InterfaceC3288C9m {
    public static final Cx0 A00 = new Cx0();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;
    public static final C2580BeF A04;

    static {
        Cx8 cx8A06 = Cx8.A06("imageFormat");
        EnumC4487CxG enumC4487CxG = EnumC4487CxG.DEFAULT;
        A01 = Cx8.A0N(enumC4487CxG, cx8A06);
        A02 = Cx8.A0P(enumC4487CxG, "originalImageSize");
        A03 = Cx8.A0Q(enumC4487CxG, "compressedImageSize");
        A04 = Cx8.A0R(enumC4487CxG, "isOdmlImage");
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        C3660CcD c3660CcD = (C3660CcD) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, c3660CcD.A00);
        interfaceC3892CgV2.A3F(A02, c3660CcD.A01);
        interfaceC3892CgV2.A3F(A03, null);
        interfaceC3892CgV2.A3F(A04, null);
    }
}
