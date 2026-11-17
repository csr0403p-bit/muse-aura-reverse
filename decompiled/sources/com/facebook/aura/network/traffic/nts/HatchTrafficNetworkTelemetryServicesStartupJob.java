package com.facebook.aura.network.traffic.nts;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C31u;
import X.C60O;
import X.HtJ;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.network.traffic.nts.MC;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import com.facebook.traffic.nts.TrafficNetworkTelemetryServicesManager;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchTrafficNetworkTelemetryServicesStartupJob implements SessionedStartupJob {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(HatchTrafficNetworkTelemetryServicesStartupJob.class, "initServicesEnabled", "<v#0>", 0);
    public static final HatchTrafficNetworkTelemetryServicesStartupJob INSTANCE = new HatchTrafficNetworkTelemetryServicesStartupJob();

    public static final boolean execute$lambda$0(C31u<Object, Boolean> c31u) {
        return AnonymousClass001.A1X(C31u.A00(c31u, $$delegatedProperties));
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public Object execute(AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        if (execute$lambda$0(AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_traffic_nts_v2.init_services_enabled))) {
            HatchTrafficNTSManagerConfigImpl hatchTrafficNTSManagerConfigImpl = new HatchTrafficNTSManagerConfigImpl();
            TrafficNetworkTelemetryServicesManager.Companion.initializeManagerAndAllModules(hatchTrafficNTSManagerConfigImpl, new HatchTrafficNTSProvidersAppLayerImpl(hatchTrafficNTSManagerConfigImpl));
        }
        return Unit.INSTANCE;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public List<AppJobId> getDependsOn() {
        return Collections.singletonList(AppJobId.FETCH_MOBILE_CONFIGS);
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public SessionedStartupJob getJob() {
        return this;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public AppJobId getJobId() {
        return AppJobId.TRAFFIC_NTS;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public StartupPhase getPhase() {
        return StartupPhase.NON_BLOCKING_CRITICAL_PRIORITY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ProcessScope getProcessScope() {
        return ProcessScope.ALL_PROCESSES;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ResumePolicy getResumePolicy() {
        return ResumePolicy.OncePerProcess.INSTANCE;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public /* bridge */ long getTimeoutMs() {
        return 10000L;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.TRAFFIC_NTS;
    }
}
