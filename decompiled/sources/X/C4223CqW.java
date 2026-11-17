package X;

/* renamed from: X.CqW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4223CqW implements InterfaceC3288C9m<C3883CgK> {
    public static final C4223CqW A00 = new C4223CqW();
    public static final C2580BeF A01;
    public static final C2580BeF A02;

    static {
        Cx8 cx8A06 = Cx8.A06("logSource");
        CxD cxD = CxD.DEFAULT;
        A02 = Cx7.A00(cx8A06, cxD, 1);
        A01 = Cx7.A00(Cx8.A06("logEventDropped"), cxD, 2);
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        C3883CgK c3883CgK = (C3883CgK) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A02, c3883CgK.A00);
        interfaceC3892CgV2.A3F(A01, c3883CgK.A01);
    }
}
