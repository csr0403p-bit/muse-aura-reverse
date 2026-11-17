package X;

/* renamed from: X.9iy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07849iy implements C9hr<C9314GDq> {
    public static final C07849iy A01 = new C07849iy();
    public static final C9iZ A00 = C9e4.A00("X.GDq", C9j1.A00);

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        return new C9314GDq(interfaceC07829iw.A8R(A00).A8W());
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A00;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        long j = ((C9314GDq) obj).A00;
        C7384Etj.A0Y(interfaceC07789is, 0);
        interfaceC07789is.AAH(A00).AAM(j);
    }
}
