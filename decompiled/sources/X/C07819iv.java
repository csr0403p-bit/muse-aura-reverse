package X;

/* renamed from: X.9iv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07819iv implements C9hr<Float> {
    public static final C07819iv A00 = new C07819iv();
    public static final C9iZ A01 = new C07709if("kotlin.Float", C9j0.A00);

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        return Float.valueOf(interfaceC07829iw.A8P());
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        float fA02 = AnonymousClass001.A02(obj);
        C7384Etj.A0Y(interfaceC07789is, 0);
        interfaceC07789is.AAF(fA02);
    }
}
