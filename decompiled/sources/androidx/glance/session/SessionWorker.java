package androidx.glance.session;

import X.AbstractC7429Evm;
import X.AbstractC9266GBt;
import X.AnonymousClass774;
import X.C066277e;
import X.C06H;
import X.C3cG;
import X.C77H;
import X.GBK;
import X.HoC;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

/* loaded from: classes3.dex */
public final class SessionWorker extends CoroutineWorker {
    public HoC A00;
    public final C77H A01;
    public final C066277e A02;
    public final String A03;
    public final WorkerParameters A04;
    public final GBK A05;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:33:0x0086, B:37:0x00a2, B:40:0x00a7, B:44:0x00c4, B:43:0x00c1, B:36:0x009f), top: B:72:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007f -> B:30:0x0080). Please report as a decompilation issue!!! */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(X.HtJ<? super X.C77S> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionWorker.doWork(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, AnonymousClass774.A00, null, 0 == true ? 1 : 0, 24, 0 == true ? 1 : 0);
    }

    @Override // androidx.work.CoroutineWorker
    public final GBK getCoroutineContext() {
        return this.A05;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SessionWorker(Context context, WorkerParameters workerParameters, C77H c77h, C066277e c066277e, GBK gbk, int i, C06H c06h) {
        c77h = (i & 4) != 0 ? AnonymousClass774.A00 : c77h;
        c066277e = (i & 8) != 0 ? new C066277e() : c066277e;
        if ((i & 16) != 0) {
            GBK gbk2 = AbstractC9266GBt.A00;
            gbk = AbstractC7429Evm.A00;
        }
        this(context, workerParameters, c77h, c066277e, gbk);
    }

    public SessionWorker(Context context, WorkerParameters workerParameters, C77H c77h, C066277e c066277e, GBK gbk) {
        super(context, workerParameters);
        this.A04 = workerParameters;
        this.A01 = c77h;
        this.A02 = c066277e;
        this.A05 = gbk;
        String strA01 = this.mWorkerParams.A01.A01("KEY");
        if (strA01 != null) {
            this.A03 = strA01;
            return;
        }
        throw C3cG.A0Q("SessionWorker must be started with a key");
    }
}
