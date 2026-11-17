package X;

/* renamed from: X.9o7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9o7 implements C9hr<Byte> {
    public static final C9o7 A00 = new C9o7();
    public static final C9iZ A01 = new C07709if("kotlin.Byte", C9o8.A00);

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        return Byte.valueOf(interfaceC07829iw.A8H());
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        byte bByteValue = ((Number) obj).byteValue();
        C7384Etj.A0Y(interfaceC07789is, 0);
        interfaceC07789is.AA8(bByteValue);
    }
}
