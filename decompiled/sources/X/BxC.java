package X;

import android.content.Context;

/* loaded from: classes5.dex */
public final class BxC implements Dg5 {
    public final EnumC10573Huf A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.Dg5
    public final void onCreate(C1HY c1hy) {
        C7384Etj.A0Y(c1hy, 0);
        if (this.A00.A00(EnumC10573Huf.A02)) {
            return;
        }
        AbstractC3107ByW.A01((Context) c1hy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.Dg5
    public final void onDestroy(C1HY c1hy) {
        C7384Etj.A0Y(c1hy, 0);
        Context context = (Context) c1hy;
        AbstractC3107ByW.A02(context);
        c1hy.getLifecycle().A05(this);
        synchronized (AbstractC3107ByW.A01) {
            AbstractC3107ByW.A03.remove(context);
        }
    }

    public BxC(EnumC10573Huf enumC10573Huf) {
        this.A00 = enumC10573Huf;
    }

    @Override // X.Dg5
    public final /* synthetic */ void onPause(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final /* synthetic */ void onResume(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final /* synthetic */ void onStart(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final /* synthetic */ void onStop(C1HY c1hy) {
    }
}
