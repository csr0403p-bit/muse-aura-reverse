package X;

import android.text.TextUtils;
import java.util.concurrent.Executor;

/* renamed from: X.EWf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC6702EWf implements Runnable {
    public static final String __redex_internal_original_name = "PttRequestImpl$4$1";
    public final /* synthetic */ EWI A00;
    public final /* synthetic */ C6708EWn A01;
    public final /* synthetic */ C6703EWg A02;
    public final /* synthetic */ Object A03;
    public final /* synthetic */ Executor A04;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (TextUtils.isEmpty(null)) {
                EWe.A03(this.A00, this.A01.A01, this.A03, null, this.A04);
            } else {
                try {
                    C7384Etj.A0Y(null, 0);
                    throw F60.createAndThrow();
                } finally {
                }
            }
        } catch (IllegalArgumentException e) {
            EWe.A03(this.A00, this.A01.A01, this.A03, e, this.A04);
        } catch (Throwable th) {
            EWe.A03(this.A00, this.A01.A01, this.A03, null, this.A04);
            throw th;
        }
    }

    public RunnableC6702EWf(EWI ewi, C6708EWn c6708EWn, C6703EWg c6703EWg, Object obj, Executor executor) {
        this.A02 = c6703EWg;
        this.A03 = obj;
        this.A00 = ewi;
        this.A04 = executor;
        this.A01 = c6708EWn;
    }
}
