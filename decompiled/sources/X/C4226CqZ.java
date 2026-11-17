package X;

/* renamed from: X.CqZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4226CqZ implements InterfaceC3288C9m<C3919Cgy> {
    public static final C4226CqZ A00 = new C4226CqZ();
    public static final C2580BeF A01;
    public static final C2580BeF A02;

    static {
        Cx8 cx8A06 = Cx8.A06("currentCacheSizeBytes");
        CxD cxD = CxD.DEFAULT;
        A01 = Cx7.A00(cx8A06, cxD, 1);
        A02 = Cx7.A00(Cx8.A06("maxCacheSizeBytes"), cxD, 2);
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        C3919Cgy c3919Cgy = (C3919Cgy) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3E(A01, c3919Cgy.A00);
        interfaceC3892CgV2.A3E(A02, c3919Cgy.A01);
    }
}
