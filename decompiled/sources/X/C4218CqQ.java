package X;

/* renamed from: X.CqQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4218CqQ implements InterfaceC3288C9m {
    public static final C4218CqQ A00 = new C4218CqQ();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;
    public static final C2580BeF A04;
    public static final C2580BeF A05;

    static {
        Cx8 cx8A05 = Cx8.A05();
        EnumC4487CxG enumC4487CxG = EnumC4487CxG.DEFAULT;
        A01 = Cx8.A0N(enumC4487CxG, cx8A05);
        A02 = Cx8.A0P(enumC4487CxG, "options");
        A03 = Cx8.A0Q(enumC4487CxG, "imageInfo");
        A04 = Cx8.A0R(enumC4487CxG, "labelCount");
        A05 = Cx8.A0S(enumC4487CxG, "highestConfidence");
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        CcG ccG = (CcG) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, ccG.A01);
        interfaceC3892CgV2.A3F(A02, ccG.A02);
        interfaceC3892CgV2.A3F(A03, ccG.A00);
        interfaceC3892CgV2.A3F(A04, null);
        interfaceC3892CgV2.A3F(A05, null);
    }
}
