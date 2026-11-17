package X;

/* renamed from: X.CqV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4222CqV implements InterfaceC3288C9m<C3900Cge> {
    public static final C4222CqV A00 = new C4222CqV();
    public static final C2580BeF A01;
    public static final C2580BeF A02;

    static {
        Cx8 cx8A06 = Cx8.A06("eventsDroppedCount");
        CxD cxD = CxD.DEFAULT;
        A01 = Cx7.A00(cx8A06, cxD, 1);
        A02 = Cx7.A00(Cx8.A06("reason"), cxD, 3);
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        C3900Cge c3900Cge = (C3900Cge) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3E(A01, c3900Cge.A00);
        interfaceC3892CgV2.A3F(A02, c3900Cge.A01);
    }
}
