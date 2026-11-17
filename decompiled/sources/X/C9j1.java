package X;

/* renamed from: X.9j1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9j1 implements C9hr<Long> {
    public static final C9j1 A00 = new C9j1();
    public static final C9iZ A01 = new C07709if("kotlin.Long", C9j2.A00);

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        return Long.valueOf(interfaceC07829iw.A8W());
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        long jA05 = C3cG.A05(obj);
        C7384Etj.A0Y(interfaceC07789is, 0);
        interfaceC07789is.AAM(jA05);
    }
}
