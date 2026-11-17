package X;

/* renamed from: X.CqY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4225CqY implements InterfaceC3288C9m<C3918Cgx> {
    public static final C4225CqY A00 = new C4225CqY();
    public static final C2580BeF A01;
    public static final C2580BeF A02;

    static {
        Cx8 cx8A06 = Cx8.A06("startMs");
        CxD cxD = CxD.DEFAULT;
        A02 = Cx7.A00(cx8A06, cxD, 1);
        A01 = Cx7.A00(Cx8.A06("endMs"), cxD, 2);
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        C3918Cgx c3918Cgx = (C3918Cgx) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3E(A02, c3918Cgx.A01);
        interfaceC3892CgV2.A3E(A01, c3918Cgx.A00);
    }
}
