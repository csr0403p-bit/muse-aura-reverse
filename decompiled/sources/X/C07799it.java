package X;

/* renamed from: X.9it, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07799it implements C9hr<Double> {
    public static final C07799it A00 = new C07799it();
    public static final C9iZ A01 = new C07709if("kotlin.Double", C07809iu.A00);

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        return Double.valueOf(interfaceC07829iw.A8L());
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        C7384Etj.A0Y(interfaceC07789is, 0);
        interfaceC07789is.AAC(dDoubleValue);
    }
}
