package X;

/* renamed from: X.D0p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4636D0p implements InterfaceC3288C9m {
    public static final C4636D0p A00 = new C4636D0p();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;

    static {
        Cx8 cx8A06 = Cx8.A06("maxLabels");
        EnumC4487CxG enumC4487CxG = EnumC4487CxG.DEFAULT;
        A01 = Cx8.A0N(enumC4487CxG, cx8A06);
        A02 = Cx8.A0P(enumC4487CxG, "confidenceThreshold");
        A03 = Cx8.A0Q(enumC4487CxG, "customLocalModelOptions");
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, null);
        interfaceC3892CgV2.A3F(A02, ((CcE) obj).A00);
        interfaceC3892CgV2.A3F(A03, null);
    }
}
