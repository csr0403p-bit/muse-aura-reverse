package X;

/* renamed from: X.AjD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1444AjD implements AkZ {
    public static Boolean A00;
    public static final C1444AjD A01 = new C1444AjD();

    @Override // X.AkZ
    public final /* synthetic */ void AdT(AaC aaC) {
    }

    @Override // X.AkZ
    public final /* synthetic */ void Ads(G0U g0u) {
    }

    @Override // X.AkZ
    public final /* synthetic */ void Adu(G0U g0u) {
    }

    @Override // X.AkZ
    public final boolean ADM() {
        Boolean bool = A00;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw C3cG.A0Q("canFocus is read before it is written");
    }

    @Override // X.AkZ
    public final void Ad0(boolean z) {
        A00 = Boolean.valueOf(z);
    }
}
