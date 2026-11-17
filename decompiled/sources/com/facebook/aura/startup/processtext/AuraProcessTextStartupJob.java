package com.facebook.aura.startup.processtext;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C0881AGi;
import X.C31u;
import X.C60P;
import X.HtJ;
import X.InterfaceC7359EnW;
import android.content.ComponentName;
import android.content.Context;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import com.facebook.aura.startup.processtext.MC;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AuraProcessTextStartupJob implements SessionedStartupJob {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(AuraProcessTextStartupJob.class, "askHatchTextSelectionEnabled", "getAskHatchTextSelectionEnabled()Z");
    public static final AuraProcessTextStartupJob INSTANCE = new AuraProcessTextStartupJob();
    public static final C31u askHatchTextSelectionEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_ask_hatch_text_selection);

    private final boolean getAskHatchTextSelectionEnabled() {
        return C31u.A01(this, askHatchTextSelectionEnabled$delegate, $$delegatedProperties, 0);
    }

    private final void setComponentEnabled(boolean z) {
        Context context = AuraAppContext.INSTANCE.getContext();
        if (context != null) {
            ComponentName componentName = new ComponentName(context, AuraProcessTextStartupJobKt.PROCESS_TEXT_ACTIVITY);
            int i = z ? 1 : 2;
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != i) {
                context.getPackageManager().setComponentEnabledSetting(componentName, i, 1);
            }
        }
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public List<AppJobId> getDependsOn() {
        return C0881AGi.A00;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public SessionedStartupJob getJob() {
        return this;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public AppJobId getJobId() {
        return AppJobId.PROCESS_TEXT_SETUP;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public StartupPhase getPhase() {
        return StartupPhase.NON_BLOCKING_LOW_PRIORITY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ProcessScope getProcessScope() {
        return ProcessScope.FOREGROUND_ONLY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public /* bridge */ long getTimeoutMs() {
        return 10000L;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public Object execute(AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        setComponentEnabled(getAskHatchTextSelectionEnabled());
        return Unit.INSTANCE;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ResumePolicy getResumePolicy() {
        return C60P.A06();
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.PROCESS_TEXT_SETUP;
    }
}
