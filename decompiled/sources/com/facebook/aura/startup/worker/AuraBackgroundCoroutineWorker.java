package com.facebook.aura.startup.worker;

import X.AnonymousClass003;
import X.C77S;
import X.HtJ;
import X.HzP;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public abstract class AuraBackgroundCoroutineWorker extends CoroutineWorker {

    @DebugMetadata(c = "com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker", f = "AuraBackgroundCoroutineWorker.kt", l = {32, 36}, m = "doWork", v = 2)
    /* renamed from: com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker$doWork$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraBackgroundCoroutineWorker.this.doWork(this);
        }
    }

    public abstract Object doBackgroundWork(HtJ<? super C77S> htJ);

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(X.HtJ<? super X.C77S> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker.AnonymousClass1
            if (r0 == 0) goto L53
            r5 = r7
            com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker$doWork$1 r5 = (com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r2 = r5.label
            r3 = 2
            r1 = 1
            if (r2 == 0) goto L24
            if (r2 == r1) goto L34
            if (r2 != r3) goto L59
            X.Hwg.A00(r0)
        L23:
            return r0
        L24:
            X.Hwg.A00(r0)
            com.facebook.aura.startup.readiness.BackgroundReadyState r2 = com.facebook.aura.startup.readiness.BackgroundReadyState.INSTANCE
            r5.label = r1
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r0 = r2.awaitReadyOrTimeout(r0, r5)
            if (r0 != r4) goto L37
            return r4
        L34:
            X.Hwg.A00(r0)
        L37:
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 != 0) goto L4a
            java.lang.String r1 = "AuraBgCoroutineWorker"
            java.lang.String r0 = "BackgroundReadyState not ready within timeout; returning Result.retry()"
            X.CFK.A06(r1, r0)
            X.77k r0 = new X.77k
            r0.<init>()
            return r0
        L4a:
            r5.label = r3
            java.lang.Object r0 = r6.doBackgroundWork(r5)
            if (r0 != r4) goto L23
            return r4
        L53:
            com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker$doWork$1 r5 = new com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker$doWork$1
            r5.<init>(r7)
            goto L12
        L59:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker.doWork(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBackgroundCoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass003.A0u(context, workerParameters);
    }
}
