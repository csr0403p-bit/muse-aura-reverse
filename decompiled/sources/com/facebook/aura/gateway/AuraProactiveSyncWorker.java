package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.C066677k;
import X.C77S;
import X.C77i;
import X.CFK;
import X.FGI;
import X.HtJ;
import X.HzP;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AuraProactiveSyncWorker extends AuraBackgroundCoroutineWorker {
    public static final int $stable = 8;

    @DebugMetadata(c = "com.facebook.aura.gateway.AuraProactiveSyncWorker", f = "AuraProactiveSyncWorker.kt", l = {87, 111}, m = "doBackgroundWork", v = 2)
    /* renamed from: com.facebook.aura.gateway.AuraProactiveSyncWorker$doBackgroundWork$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraProactiveSyncWorker.this.doBackgroundWork(this);
        }
    }

    private final C77S retryOrGiveUp() {
        int i = this.mWorkerParams.A00 + 1;
        if (i < 3) {
            return new C066677k();
        }
        CFK.A06(AuraProactiveSyncWorkerKt.TAG, FGI.A0I("Giving up after ", i, " attempts to avoid backoff lockout"));
        return new C77i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0131, code lost:
    
        if ((r11 instanceof com.facebook.aura.nodes.core.NodeHitlResult.Denied) != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017b  */
    @Override // com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doBackgroundWork(X.HtJ<? super X.C77S> r20) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.AuraProactiveSyncWorker.doBackgroundWork(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraProactiveSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass003.A0u(context, workerParameters);
    }
}
