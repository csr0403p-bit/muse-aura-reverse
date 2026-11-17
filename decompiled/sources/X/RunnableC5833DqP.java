package X;

import android.view.View;

/* renamed from: X.DqP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5833DqP implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerImpl$tryAutoResumeAfterFocusLoss$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ C5627DmA A01;

    public RunnableC5833DqP(View view, C5627DmA c5627DmA) {
        this.A00 = view;
        this.A01 = c5627DmA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00.isShown()) {
            C5627DmA c5627DmA = this.A01;
            BV4.A09(c5627DmA.A0G).post(new RunnableC5834DqQ(c5627DmA));
        }
    }
}
