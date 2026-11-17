package com.facebook.traffic.nts.providers.background;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BzB;
import X.C06H;
import X.C10543Hqv;
import X.C3UX;
import X.C7384Etj;
import X.C77S;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerPeriodicJobSafeHandling;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public class ConfigurablePeriodicBackgroundJobCoroutine extends CoroutineWorker {
    public static final Companion Companion = new Companion();
    public static final String TAG = "TNTSConfigurablePeriodicBackgroundJobCoroutine";

    @DebugMetadata(c = "com.facebook.traffic.nts.providers.background.ConfigurablePeriodicBackgroundJobCoroutine", f = "BackgroundV2TaskSchedulerDoNotChangeDoNotDeleteCode.kt", l = {103}, m = "doWork$suspendImpl", v = 2)
    /* renamed from: com.facebook.traffic.nts.providers.background.ConfigurablePeriodicBackgroundJobCoroutine$doWork$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigurablePeriodicBackgroundJobCoroutine.doWork$suspendImpl(ConfigurablePeriodicBackgroundJobCoroutine.this, this);
        }
    }

    @DebugMetadata(c = "com.facebook.traffic.nts.providers.background.ConfigurablePeriodicBackgroundJobCoroutine$doWork$2", f = "BackgroundV2TaskSchedulerDoNotChangeDoNotDeleteCode.kt", l = {105}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.traffic.nts.providers.background.ConfigurablePeriodicBackgroundJobCoroutine$doWork$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C10543Hqv<JobResult> $backgroundResult;
        public Object L$0;
        public int label;
        public final /* synthetic */ ConfigurablePeriodicBackgroundJobCoroutine this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C10543Hqv<JobResult> c10543Hqv, ConfigurablePeriodicBackgroundJobCoroutine configurablePeriodicBackgroundJobCoroutine, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$backgroundResult = c10543Hqv;
            this.this$0 = configurablePeriodicBackgroundJobCoroutine;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$backgroundResult, this.this$0, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C10543Hqv<JobResult> c10543Hqv;
            T t;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                c10543Hqv = this.$backgroundResult;
                BackgroundV2TaskSchedulerPeriodicJobSafeHandling.Companion companion = BackgroundV2TaskSchedulerPeriodicJobSafeHandling.Companion;
                Context context = this.this$0.mAppContext;
                C7384Etj.A0U(context);
                BzB bzB = this.this$0.mWorkerParams.A01;
                C7384Etj.A0U(bzB);
                UUID uuid = this.this$0.mWorkerParams.A08;
                C7384Etj.A0U(uuid);
                BackgroundV2TaskSchedulerEarlyNTSConfigChecker backgroundV2TaskSchedulerEarlyNTSConfigChecker = new BackgroundV2TaskSchedulerEarlyNTSConfigChecker();
                this.L$0 = c10543Hqv;
                this.label = 1;
                Object objHandleInvocation = companion.handleInvocation(context, bzB, uuid, backgroundV2TaskSchedulerEarlyNTSConfigChecker, this);
                t = objHandleInvocation;
                if (objHandleInvocation == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                c10543Hqv = (C10543Hqv) this.L$0;
                Hwg.A00(obj);
                t = obj;
            }
            c10543Hqv.element = t;
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, com.facebook.traffic.nts.providers.background.JobResult] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object doWork$suspendImpl(com.facebook.traffic.nts.providers.background.ConfigurablePeriodicBackgroundJobCoroutine r4, X.HtJ<? super X.C77S> r5) {
        /*
            boolean r0 = r5 instanceof com.facebook.traffic.nts.providers.background.ConfigurablePeriodicBackgroundJobCoroutine.AnonymousClass1
            if (r0 == 0) goto L22
            r3 = r5
            com.facebook.traffic.nts.providers.background.ConfigurablePeriodicBackgroundJobCoroutine$doWork$1 r3 = (com.facebook.traffic.nts.providers.background.ConfigurablePeriodicBackgroundJobCoroutine.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r2 = r3.result
            int r1 = r3.label
            java.lang.String r4 = "TNTSConfigurablePeriodicBackgroundJobCoroutine"
            r0 = 1
            if (r1 == 0) goto L2d
            if (r1 != r0) goto L28
            java.lang.Object r3 = r3.L$2
            X.Hqv r3 = (X.C10543Hqv) r3
            goto L47
        L22:
            com.facebook.traffic.nts.providers.background.ConfigurablePeriodicBackgroundJobCoroutine$doWork$1 r3 = new com.facebook.traffic.nts.providers.background.ConfigurablePeriodicBackgroundJobCoroutine$doWork$1
            r3.<init>(r5)
            goto L12
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r2)
            java.util.UUID r0 = X.AbstractC7535F0i.A00()     // Catch: java.lang.Exception -> L53
            r0.toString()     // Catch: java.lang.Exception -> L53
            X.Hqv r3 = X.C3cG.A0z()     // Catch: java.lang.Exception -> L53
            com.facebook.traffic.nts.providers.background.JobResult$ResultCategory r2 = com.facebook.traffic.nts.providers.background.JobResult.ResultCategory.CONFIGURATION_ERROR     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "No dispatcher provided"
            com.facebook.traffic.nts.providers.background.JobResult r0 = new com.facebook.traffic.nts.providers.background.JobResult     // Catch: java.lang.Exception -> L53
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> L53
            r3.element = r0     // Catch: java.lang.Exception -> L53
            goto L4a
        L47:
            X.Hwg.A00(r2)     // Catch: java.lang.Exception -> L53
        L4a:
            T r0 = r3.element     // Catch: java.lang.Exception -> L53
            com.facebook.traffic.nts.providers.background.JobResult r0 = (com.facebook.traffic.nts.providers.background.JobResult) r0     // Catch: java.lang.Exception -> L53
            X.77S r0 = r0.getWorkerResult()     // Catch: java.lang.Exception -> L53
            return r0
        L53:
            r1 = move-exception
            java.lang.String r0 = "Traffic NTS background job failed unexpectedly"
            X.CFK.A08(r4, r0, r1)
            com.facebook.traffic.nts.providers.background.JobResult$ResultCategory r2 = com.facebook.traffic.nts.providers.background.JobResult.ResultCategory.UNHANDLED_EXCEPTION
            java.lang.String r1 = r1.toString()
            com.facebook.traffic.nts.providers.background.JobResult r0 = new com.facebook.traffic.nts.providers.background.JobResult
            r0.<init>(r2, r1)
            X.77S r0 = r0.getWorkerResult()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.traffic.nts.providers.background.ConfigurablePeriodicBackgroundJobCoroutine.doWork$suspendImpl(com.facebook.traffic.nts.providers.background.ConfigurablePeriodicBackgroundJobCoroutine, X.HtJ):java.lang.Object");
    }

    public C78T getCoroutineContext() {
        return null;
    }

    public BackgroundV2TaskSchedulerEarlyNTSConfigChecker getNTSConfigChecker() {
        return new BackgroundV2TaskSchedulerEarlyNTSConfigChecker();
    }

    public void logOnBackgroundWorkerStarted(String str) {
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigurablePeriodicBackgroundJobCoroutine(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass003.A0u(context, workerParameters);
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(HtJ<? super C77S> htJ) {
        return doWork$suspendImpl(this, htJ);
    }

    public void logOnBackgroundWorkerCompleted(String str, JobResult jobResult) {
    }
}
