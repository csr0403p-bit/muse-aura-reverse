package X;

import kotlin.Unit;

/* renamed from: X.Htc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC10561Htc implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioStateManager$teardownAudioStateForRtcAndWait$2$1$1";
    public final /* synthetic */ GSV A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Hm1<Unit> A02;
    public final /* synthetic */ C3UX A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: Incorrect types in method signature: (LX/Hm1<-Lkotlin/Unit;>;LX/3UX;LX/GSV;Ljava/lang/String;Z)V */
    public RunnableC10561Htc(GSV gsv, String str, Hm1 hm1, C3UX c3ux, boolean z) {
        this.A02 = hm1;
        this.A03 = c3ux;
        this.A00 = gsv;
        this.A01 = str;
        this.A04 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objA0s;
        Hm1<Unit> hm1 = this.A02;
        try {
            GSV.A02(this.A00, this.A01, this.A04);
            objA0s = Unit.INSTANCE;
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        hm1.resumeWith(objA0s);
    }
}
