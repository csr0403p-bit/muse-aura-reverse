package X;

/* renamed from: X.CFz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3350CFz implements C8ee<C7526EzK> {
    public static final C3349CFv A01 = new C3349CFv(null);
    public final DFX A00;

    public C3350CFz(DFX dfx) {
        C7384Etj.A0Y(dfx, 0);
        this.A00 = dfx;
    }

    @Override // X.C8ee
    public final Eu1<?> acquireEvent(String str) {
        C7384Etj.A0Y(str, 0);
        return acquireEvent(C7526EzK.A01, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/EzK;)LX/Eu1<*>; */
    @Override // X.C8ee
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C3348CFu acquireEvent(C7526EzK c7526EzK, String str) {
        AnonymousClass003.A0u(str, c7526EzK);
        DFW dfwA01 = DFX.A01(this.A00, C79.A00, null, str, AnonymousClass002.A1Z(c7526EzK.A00, C79.A01));
        C7384Etj.A0U(dfwA01);
        return dfwA01.A0A() ? new C3348CFu(dfwA01) : A01;
    }
}
