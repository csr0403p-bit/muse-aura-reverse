package X;

/* loaded from: classes5.dex */
public final class D1N implements InterfaceC3288C9m {
    public static final D1N A00 = new D1N();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;
    public static final C2580BeF A04;
    public static final C2580BeF A05;
    public static final C2580BeF A06;
    public static final C2580BeF A07;

    static {
        Cx8 cx8A02 = Cx8.A02();
        EnumC4485CxE enumC4485CxE = EnumC4485CxE.DEFAULT;
        A01 = Cx8.A07(enumC4485CxE, cx8A02);
        A02 = Cx8.A09(enumC4485CxE, "imageSource");
        A03 = Cx8.A0A(enumC4485CxE, "imageFormat");
        A04 = Cx8.A0B(enumC4485CxE, "imageByteSize");
        A05 = Cx8.A0C(enumC4485CxE, "imageWidth");
        A06 = Cx8.A0D(enumC4485CxE, "imageHeight");
        A07 = Cx8.A0E(enumC4485CxE, "rotationDegrees");
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        C4691D2s c4691D2s = (C4691D2s) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, c4691D2s.A06);
        interfaceC3892CgV2.A3F(A02, c4691D2s.A01);
        interfaceC3892CgV2.A3F(A03, c4691D2s.A00);
        interfaceC3892CgV2.A3F(A04, c4691D2s.A02);
        interfaceC3892CgV2.A3F(A05, c4691D2s.A03);
        interfaceC3892CgV2.A3F(A06, c4691D2s.A04);
        interfaceC3892CgV2.A3F(A07, c4691D2s.A05);
    }
}
