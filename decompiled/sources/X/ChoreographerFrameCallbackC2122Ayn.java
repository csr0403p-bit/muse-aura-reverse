package X;

import android.view.Choreographer;

/* renamed from: X.Ayn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ChoreographerFrameCallbackC2122Ayn implements Choreographer.FrameCallback {
    public final /* synthetic */ C2121Aym A00;
    public final /* synthetic */ G0U<Long, R> A01;
    public final /* synthetic */ Hm1<R> A02;

    /* JADX WARN: Incorrect types in method signature: (LX/Hm1<-TR;>;LX/Aym;LX/G0U<-Ljava/lang/Long;+TR;>;)V */
    public ChoreographerFrameCallbackC2122Ayn(C2121Aym c2121Aym, G0U g0u, Hm1 hm1) {
        this.A02 = hm1;
        this.A00 = c2121Aym;
        this.A01 = g0u;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object c10571Hud;
        HtJ htJ = this.A02;
        try {
            c10571Hud = this.A01.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            c10571Hud = new C10571Hud(th);
        }
        htJ.resumeWith(c10571Hud);
    }
}
