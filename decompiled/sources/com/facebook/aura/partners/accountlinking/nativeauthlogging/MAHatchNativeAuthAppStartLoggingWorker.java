package com.facebook.aura.partners.accountlinking.nativeauthlogging;

import X.AnonymousClass003;
import X.HtJ;
import X.HzP;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class MAHatchNativeAuthAppStartLoggingWorker extends AuraBackgroundCoroutineWorker {

    @DebugMetadata(c = "com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggingWorker", f = "MAHatchNativeAuthAppStartLogger.kt", l = {109}, m = "doBackgroundWork", v = 2)
    /* renamed from: com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggingWorker$doBackgroundWork$1, reason: invalid class name */
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
            return MAHatchNativeAuthAppStartLoggingWorker.this.doBackgroundWork(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @Override // com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doBackgroundWork(X.HtJ<? super X.C77S> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggingWorker.AnonymousClass1
            if (r0 == 0) goto L39
            r4 = r6
            com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggingWorker$doBackgroundWork$1 r4 = (com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggingWorker.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L26
            if (r0 != r2) goto L3f
            X.Hwg.A00(r1)
        L20:
            X.77i r3 = new X.77i
            r3.<init>()
            return r3
        L26:
            X.Hwg.A00(r1)
            com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger r1 = com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger.INSTANCE
            android.content.Context r0 = r5.mAppContext
            X.C7384Etj.A0U(r0)
            r4.label = r2
            java.lang.Object r0 = r1.logAppStartData$fbandroid_express_aura_java_com_facebook_aura_partners_accountlinking_nativeauthlogging_nativeauthlogging(r0, r4)
            if (r0 != r3) goto L20
            return r3
        L39:
            com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggingWorker$doBackgroundWork$1 r4 = new com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggingWorker$doBackgroundWork$1
            r4.<init>(r6)
            goto L12
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggingWorker.doBackgroundWork(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAHatchNativeAuthAppStartLoggingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass003.A0u(context, workerParameters);
    }
}
