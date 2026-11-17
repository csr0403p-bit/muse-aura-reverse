package X;

import android.content.Context;

/* renamed from: X.Cd1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3703Cd1 implements InterfaceC3745Cdi {
    public CUK A00;
    public final AbstractC3744Cdh A01;
    public final CUK A02;

    public C3703Cd1(Context context, AbstractC3744Cdh abstractC3744Cdh) {
        this.A01 = abstractC3744Cdh;
        CfH cfH = CfH.A01;
        C3847Cfc.A01(context);
        final C3846Cfb c3846CfbA02 = C3847Cfc.A00().A02(cfH);
        if (CfH.A03.contains(new Ce6("json"))) {
            this.A00 = new CUJ(new CUK() { // from class: X.CgA
                @Override // X.CUK
                public final Object get() {
                    return c3846CfbA02.AM1(new Ce6("json"), new C3921Ch0(), "FIREBASE_ML_SDK");
                }
            });
        }
        this.A02 = new CUJ(new CUK() { // from class: X.CgB
            @Override // X.CUK
            public final Object get() {
                return c3846CfbA02.AM1(new Ce6("proto"), new C3920Cgz(), "FIREBASE_ML_SDK");
            }
        });
    }
}
