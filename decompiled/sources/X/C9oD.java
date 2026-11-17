package X;

/* renamed from: X.9oD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9oD implements C9hr<C9oE> {
    public static final C9oD A01 = new C9oD();
    public static final C9iZ A00 = C9e4.A00("X.9oE", C9oK.A00);

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        return new C9oE(interfaceC07829iw.A8R(A00).A8c());
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A00;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        short s = ((C9oE) obj).A00;
        C7384Etj.A0Y(interfaceC07789is, 0);
        interfaceC07789is.AAH(A00).AAS(s);
    }
}
