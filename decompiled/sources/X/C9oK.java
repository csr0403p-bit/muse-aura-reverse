package X;

/* renamed from: X.9oK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9oK implements C9hr<Short> {
    public static final C9oK A00 = new C9oK();
    public static final C9iZ A01 = new C07709if("kotlin.Short", C9oL.A00);

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        return Short.valueOf(interfaceC07829iw.A8c());
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        C7384Etj.A0Y(interfaceC07789is, 0);
        interfaceC07789is.AAS(sShortValue);
    }
}
