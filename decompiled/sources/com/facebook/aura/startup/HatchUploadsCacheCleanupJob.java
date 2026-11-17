package com.facebook.aura.startup;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0881AGi;
import X.C3UX;
import X.C3cJ;
import X.C4JM;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.composer.camera.HatchCameraFiles;
import com.facebook.aura.composer.upload.HatchAttachmentStaging;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionlessStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchUploadsCacheCleanupJob implements SessionlessStartupJob {
    public static final HatchUploadsCacheCleanupJob INSTANCE = new HatchUploadsCacheCleanupJob();

    @DebugMetadata(c = "com.facebook.aura.startup.HatchUploadsCacheCleanupJob$execute$2", f = "HatchUploadsCacheCleanupJob.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.HatchUploadsCacheCleanupJob$execute$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchAttachmentStaging.INSTANCE.wipeStagingDir(C4JM.A00());
            HatchCameraFiles.INSTANCE.evictExpired();
            return Unit.INSTANCE;
        }
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob, com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public List<AppJobId> getDependsOn() {
        return C0881AGi.A00;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public SessionlessStartupJob getJob() {
        return this;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public AppJobId getJobId() {
        return AppJobId.CLEANUP_UPLOADS_CACHE;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public StartupPhase getPhase() {
        return StartupPhase.NON_BLOCKING_LOW_PRIORITY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob, com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public ProcessScope getProcessScope() {
        return ProcessScope.ALL_PROCESSES;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob, com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public ResumePolicy getResumePolicy() {
        return ResumePolicy.OncePerProcess.INSTANCE;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob
    public /* bridge */ long getTimeoutMs() {
        return 10000L;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob
    public Object execute(HtJ<? super Unit> htJ) {
        return C3cJ.A0D(htJ, AnonymousClass001.A0y(), new AnonymousClass2(null));
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.CLEANUP_UPLOADS_CACHE;
    }
}
