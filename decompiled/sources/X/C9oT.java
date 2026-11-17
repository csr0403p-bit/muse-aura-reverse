package X;

/* renamed from: X.9oT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9oT implements C9hr<C9oU> {
    public static final C9oT A00 = new C9oT();
    public static final C9iZ A01 = C9iY.A05("ErrorCode", C07719ih.A00);

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        int iA8T = interfaceC07829iw.A8T();
        for (C9oU c9oU : C9oU.values()) {
            if (c9oU.code == iA8T) {
                return c9oU;
            }
        }
        return C9oU.A04;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        C9oU c9oU = (C9oU) obj;
        AnonymousClass003.A0u(interfaceC07789is, c9oU);
        interfaceC07789is.AAJ(c9oU.code);
    }
}
