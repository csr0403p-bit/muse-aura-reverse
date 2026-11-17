package com.facebook.traffic.nts.providers.background;

import X.AbstractC07127nr;
import X.AbstractC0852A5y;
import X.AnonymousClass001;
import X.BzB;
import X.C10543Hqv;
import X.C3UX;
import X.EnumC10460Hji;
import X.F24;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic;
import com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerPeriodicJobSafeHandling;
import com.facebook.traffic.nts.providers.background.JobResult;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerPeriodicJobSafeHandling$Companion$handleInvocation$2", f = "BackgroundV2TaskSchedulerPeriodicJobSafeHandling.kt", l = {202, 236}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class BackgroundV2TaskSchedulerPeriodicJobSafeHandling$Companion$handleInvocation$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $appContext;
    public final /* synthetic */ UUID $id;
    public final /* synthetic */ BzB $inputData;
    public final /* synthetic */ BackgroundV2TaskSchedulerEarlyNTSConfigChecker $ntsConfigChecker;
    public final /* synthetic */ C10543Hqv<JobResult.ResultCategory> $resultCategory;
    public final /* synthetic */ long $timeoutInSeconds;
    public boolean Z$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundV2TaskSchedulerPeriodicJobSafeHandling$Companion$handleInvocation$2(BzB bzB, Context context, UUID uuid, BackgroundV2TaskSchedulerEarlyNTSConfigChecker backgroundV2TaskSchedulerEarlyNTSConfigChecker, C10543Hqv<JobResult.ResultCategory> c10543Hqv, long j, HtJ<? super BackgroundV2TaskSchedulerPeriodicJobSafeHandling$Companion$handleInvocation$2> htJ) {
        super(2, htJ);
        this.$inputData = bzB;
        this.$appContext = context;
        this.$id = uuid;
        this.$ntsConfigChecker = backgroundV2TaskSchedulerEarlyNTSConfigChecker;
        this.$resultCategory = c10543Hqv;
        this.$timeoutInSeconds = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new BackgroundV2TaskSchedulerPeriodicJobSafeHandling$Companion$handleInvocation$2(this.$inputData, this.$appContext, this.$id, this.$ntsConfigChecker, this.$resultCategory, this.$timeoutInSeconds, htJ);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, com.facebook.traffic.nts.providers.background.JobResult$ResultCategory] */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, com.facebook.traffic.nts.providers.background.JobResult$ResultCategory] */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, com.facebook.traffic.nts.providers.background.JobResult$ResultCategory] */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zA02;
        BackgroundV2TaskSchedulerAppLayer backgroundV2TaskSchedulerAppLayerM3221getBackgroundTaskSchedulerImplFutureValueLRDsOJo;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            zA02 = this.$inputData.A02(ForeverConstants.USE_COROUTINES_FOR_JOB_EXECUTION_DATA_KEY);
            BackgroundV2TaskSchedulerPeriodicJobSafeHandling.Companion companion = BackgroundV2TaskSchedulerPeriodicJobSafeHandling.Companion;
            Context context = this.$appContext;
            UUID uuid = this.$id;
            if (zA02) {
                this.Z$0 = zA02;
                this.label = 1;
                if (companion.checkAndCancelStaleJobByIdSuspend(context, uuid, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                companion.checkAndCancelStaleJobById(context, uuid);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                backgroundV2TaskSchedulerAppLayerM3221getBackgroundTaskSchedulerImplFutureValueLRDsOJo = (BackgroundV2TaskSchedulerAppLayer) obj;
                backgroundV2TaskSchedulerAppLayerM3221getBackgroundTaskSchedulerImplFutureValueLRDsOJo.executeReadyTasks();
                this.$resultCategory.element = JobResult.ResultCategory.SUCCESS;
                return Unit.INSTANCE;
            }
            zA02 = this.Z$0;
            Hwg.A00(obj);
        }
        if (this.$inputData.A02(ForeverConstants.VERIFY_NTS_MANAGER_ENABLED_WORK_DATA_KEY)) {
            this.$resultCategory.element = JobResult.ResultCategory.CONFIGURATION_ERROR;
            throw new RuntimeException("NTS Manager is not enabled");
        }
        if (this.$inputData.A02(ForeverConstants.VERIFY_NTS_SCHEDULER_ENABLED_WORK_DATA_KEY)) {
            this.$resultCategory.element = JobResult.ResultCategory.CONFIGURATION_ERROR;
            throw new RuntimeException("NTS Background Task Scheduler is not enabled");
        }
        BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic.Companion companion2 = BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic.Companion;
        if (!zA02) {
            backgroundV2TaskSchedulerAppLayerM3221getBackgroundTaskSchedulerImplFutureValueLRDsOJo = companion2.m3221getBackgroundTaskSchedulerImplFutureValueLRDsOJo(AbstractC0852A5y.A02(F24.A07, this.$timeoutInSeconds));
            backgroundV2TaskSchedulerAppLayerM3221getBackgroundTaskSchedulerImplFutureValueLRDsOJo.executeReadyTasks();
            this.$resultCategory.element = JobResult.ResultCategory.SUCCESS;
            return Unit.INSTANCE;
        }
        this.Z$0 = zA02;
        this.label = 2;
        obj = companion2.awaitOnBackgroundTaskSchedulerImplFutureValue(this);
        if (obj == enumC10460Hji) {
            return enumC10460Hji;
        }
        backgroundV2TaskSchedulerAppLayerM3221getBackgroundTaskSchedulerImplFutureValueLRDsOJo = (BackgroundV2TaskSchedulerAppLayer) obj;
        backgroundV2TaskSchedulerAppLayerM3221getBackgroundTaskSchedulerImplFutureValueLRDsOJo.executeReadyTasks();
        this.$resultCategory.element = JobResult.ResultCategory.SUCCESS;
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((BackgroundV2TaskSchedulerPeriodicJobSafeHandling$Companion$handleInvocation$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
