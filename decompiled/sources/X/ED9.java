package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class ED9 implements EDT, EE6, C9v, EDC {
    public Executor A00;
    public Executor A01;
    public Executor A02;
    public final Context A03;
    public final SharedPreferences A04;

    @Override // X.C9v
    public final boolean deletePath(File file) {
        C7384Etj.A0Y(file, 0);
        return EDB.A00(file);
    }

    @Override // X.EDT
    public final synchronized Executor getExecutor(BYM bym) {
        Executor executorA00;
        int iA0E = AnonymousClass001.A0E(bym, 0);
        if (iA0E == 0) {
            executorA00 = this.A00;
            if (executorA00 == null) {
                executorA00 = A00(bym);
                this.A00 = executorA00;
            }
            if (executorA00 == null) {
                throw BV4.A0U();
            }
        } else if (iA0E == 1) {
            executorA00 = this.A02;
            if (executorA00 == null) {
                executorA00 = A00(bym);
                this.A02 = executorA00;
            }
            if (executorA00 == null) {
                throw BV4.A0U();
            }
        } else {
            if (iA0E != 2) {
                throw C3cG.A0q();
            }
            executorA00 = this.A01;
            if (executorA00 == null) {
                executorA00 = A00(bym);
                this.A01 = executorA00;
            }
            if (executorA00 == null) {
                throw BV4.A0U();
            }
        }
        return executorA00;
    }

    public ED9(Context context) {
        this.A03 = AnonymousClass001.A0I(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("BLOKS_STORAGE", 0);
        C7384Etj.A0U(sharedPreferences);
        this.A04 = sharedPreferences;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.concurrent.ExecutorService A00(X.BYM r4) {
        /*
            X.CVL r3 = new X.CVL
            r3.<init>(r4)
            int r2 = r4.ordinal()
            r0 = 0
            java.lang.String r1 = "Required value was null."
            if (r2 == r0) goto L24
            r0 = 1
            if (r2 == r0) goto L19
            r0 = 2
            if (r2 == r0) goto L24
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L19:
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r3)
            if (r0 != 0) goto L2f
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r1)
            throw r0
        L24:
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool(r3)
            if (r0 != 0) goto L2f
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r1)
            throw r0
        L2f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ED9.A00(X.BYM):java.util.concurrent.ExecutorService");
    }

    @Override // X.EE6
    public final ED8 getStore(String str) {
        return new ED7(this.A04, str);
    }
}
