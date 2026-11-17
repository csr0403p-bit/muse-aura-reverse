package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.7Gt, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7Gt {
    public static final Executor A00 = new Executor() { // from class: X.7Gu
        public final Handler A00 = C60O.A02();

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C7384Etj.A0Y(runnable, 0);
            this.A00.post(runnable);
        }
    };
}
