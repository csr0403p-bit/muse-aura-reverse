package X;

/* renamed from: X.FLe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7932FLe implements FOP {
    public final /* synthetic */ G0U<FBB, Boolean> A00;

    @Override // X.FOP
    public final boolean ARu(InterfaceC7992FOj interfaceC7992FOj) {
        C7930FLc c7930FLc;
        FBB fbbACs;
        C7384Etj.A0Y(interfaceC7992FOj, 0);
        try {
            if (!(interfaceC7992FOj instanceof C7930FLc) || (c7930FLc = (C7930FLc) interfaceC7992FOj) == null || (fbbACs = c7930FLc.A04.ACs()) == null) {
                return false;
            }
            return AnonymousClass003.A1X(fbbACs, this.A00);
        } catch (Exception e) {
            FFI.A04(e);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7932FLe(G0U<? super FBB, Boolean> g0u) {
        this.A00 = g0u;
    }
}
