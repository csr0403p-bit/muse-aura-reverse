package com.facebook.traffic.nts.providers.background;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C06H;
import X.C0851A5x;
import X.C3UX;
import X.C7384Etj;
import X.C7yx;
import X.F04;
import X.F24;
import X.F60;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public abstract class BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic implements BackgroundV2TaskSchedulerAppLayerUpcalls {
    public static final String TAG = "TNTSBackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic";
    public static final String TNTS_UNIQUE_WORK_NAME = "TNTSPeriodicScheduledCoroutineJob";
    public final Context appContext;
    public final BackgroundV2TaskSchedulerConfig backgroundTaskSchedulerConfig;
    public static final Companion Companion = new Companion();
    public static final F04<BackgroundV2TaskSchedulerAppLayer> _backgroundTaskSchedulerImplFuture = new F04<>();

    public final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object awaitOnBackgroundTaskSchedulerImplFutureValue(X.HtJ<? super com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayer> r6) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r6 instanceof com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic$Companion$awaitOnBackgroundTaskSchedulerImplFutureValue$1
                if (r0 == 0) goto L35
                r4 = r6
                com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic$Companion$awaitOnBackgroundTaskSchedulerImplFutureValue$1 r4 = (com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic$Companion$awaitOnBackgroundTaskSchedulerImplFutureValue$1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L35
                int r2 = r2 - r1
                r4.label = r2
            L12:
                java.lang.Object r3 = r4.result
                X.Hji r2 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r1 = 1
                if (r0 == 0) goto L24
                if (r0 != r1) goto L3b
                X.Hwg.A00(r3)
            L20:
                X.C7384Etj.A0W(r3)
                return r3
            L24:
                X.Hwg.A00(r3)
                X.F04<com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayer> r0 = com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic._backgroundTaskSchedulerImplFuture
                X.C7384Etj.A0U(r0)
                r4.label = r1
                java.lang.Object r3 = X.Br8.A00(r0, r4)
                if (r3 != r2) goto L20
                return r2
            L35:
                com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic$Companion$awaitOnBackgroundTaskSchedulerImplFutureValue$1 r4 = new com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic$Companion$awaitOnBackgroundTaskSchedulerImplFutureValue$1
                r4.<init>(r5, r6)
                goto L12
            L3b:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic.Companion.awaitOnBackgroundTaskSchedulerImplFutureValue(X.HtJ):java.lang.Object");
        }

        /* renamed from: getBackgroundTaskSchedulerImplFutureValue-LRDsOJo, reason: not valid java name */
        public final BackgroundV2TaskSchedulerAppLayer m3221getBackgroundTaskSchedulerImplFutureValueLRDsOJo(long j) throws InterruptedException, TimeoutException {
            BackgroundV2TaskSchedulerAppLayer backgroundV2TaskSchedulerAppLayer = BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic._backgroundTaskSchedulerImplFuture.get(C0851A5x.A04(F24.A07, j), TimeUnit.SECONDS);
            C7384Etj.A0U(backgroundV2TaskSchedulerAppLayer);
            return backgroundV2TaskSchedulerAppLayer;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic$scheduleJob$1", f = "BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic.kt", l = {164}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic$scheduleJob$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C7yx $request;
        public final /* synthetic */ String $uuid;
        public int label;

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return null.new AnonymousClass1(this.$request, this.$uuid, htJ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C7yx c7yx, String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$request = c7yx;
            this.$uuid = str;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }
            Hwg.A00(obj);
            this.label = 1;
            Companion companion = BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic.Companion;
            throw new NullPointerException("updatePeriodicJobAndCancelledUnmanagedSuspend");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic", f = "BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic.kt", l = {HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT, 208}, m = "updatePeriodicJobAndCancelledUnmanagedSuspend", v = 2)
    /* renamed from: com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic$updatePeriodicJobAndCancelledUnmanagedSuspend$1, reason: invalid class name and case insensitive filesystem */
    public final class C144361 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C144361(HtJ<? super C144361> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Companion companion = BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic.Companion;
            throw new NullPointerException("updatePeriodicJobAndCancelledUnmanagedSuspend");
        }
    }

    private final void scheduleJob(long j) {
        throw F60.createAndThrow();
    }

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcalls
    public abstract void cancel();

    public abstract Class<? extends ConfigurablePeriodicBackgroundJobCoroutine> getBackgroundPeriodicWorkerClass();

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcalls
    public abstract BackgroundV2TaskSchedulerConfig getConfig();

    public abstract C3UX getCoroutineScope();

    public abstract void logOnBackgroundSchedulingCompleted(String str);

    public abstract void logOnBackgroundSchedulingStarted(String str);

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcalls
    public abstract void refresh(long j);

    public static final /* synthetic */ Object access$updatePeriodicJobAndCancelledUnmanagedSuspend(BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic backgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic, C7yx c7yx, String str, HtJ htJ) {
        throw new NullPointerException("updatePeriodicJobAndCancelledUnmanagedSuspend");
    }

    public BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic(Context context, BackgroundV2TaskSchedulerAppLayer backgroundV2TaskSchedulerAppLayer, BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig) {
        throw F60.createAndThrow();
    }

    private final void updatePeriodicJobAndCancelledUnmanaged(C7yx c7yx, String str) {
        throw F60.createAndThrow();
    }

    private final Object updatePeriodicJobAndCancelledUnmanagedSuspend(C7yx c7yx, String str, HtJ<? super Unit> htJ) {
        throw F60.createAndThrow();
    }
}
