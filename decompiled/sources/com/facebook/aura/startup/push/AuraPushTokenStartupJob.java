package com.facebook.aura.startup.push;

import X.AbstractC3358CGz;
import X.BzK;
import X.C0881AGi;
import X.C3939ChS;
import X.C7384Etj;
import X.CFK;
import X.DQZ;
import X.EtU;
import X.F0C;
import X.FGI;
import X.HtJ;
import X.InterfaceC7409Eus;
import com.facebook.aura.notifications.push.AuraPushManager;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import com.facebook.pushlite.PushTokenManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class AuraPushTokenStartupJob implements SessionedStartupJob {
    public static final AuraPushTokenStartupJob INSTANCE = new AuraPushTokenStartupJob();
    public static final String TAG = "AuraPushTokenStartupJob";

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public SessionedStartupJob getJob() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.AbstractCollection, java.util.HashSet] */
    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public Object execute(AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        try {
            C3939ChS c3939ChS = AuraPushManager.instance;
            C7384Etj.A0Z(c3939ChS, "null cannot be cast to non-null type com.facebook.pushlite.PushManager");
            PushTokenManager pushTokenManager = (PushTokenManager) C7384Etj.A0G(c3939ChS.A07);
            synchronized (pushTokenManager) {
                F0C f0c = pushTokenManager.A05;
                Iterator it = ((EtU) f0c.getValue()).A00().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!pushTokenManager.A02.containsKey(it.next())) {
                            break;
                        }
                    } else {
                        DQZ<String, InterfaceC7409Eus> dqz = pushTokenManager.A02;
                        int size = dqz.size();
                        boolean zA02 = false;
                        for (int i = 0; i < size; i++) {
                            String strA05 = dqz.A05(i);
                            EtU etU = (EtU) f0c.getValue();
                            C7384Etj.A0Y(strA05, 0);
                            if (etU.A01.getBoolean(FGI.A0M(strA05, ".enabled"), true)) {
                                boolean z = false;
                                String string = ((EtU) f0c.getValue()).A01.getString(FGI.A0M(strA05, ".token"), null);
                                if (string != null && !string.equals("<cleared>")) {
                                    z = true;
                                }
                                boolean z2 = dqz.A07(i).isAvailable();
                                if (z && !z2) {
                                    BzK bzKA02 = BzK.A02(((EtU) f0c.getValue()).A01);
                                    bzKA02.Aae(strA05);
                                    BzK.A06(bzKA02, strA05);
                                }
                                zA02 |= ((EtU) f0c.getValue()).A02(strA05);
                            }
                        }
                        if (!zA02) {
                            CFK.A05("PushTokenManager", "Push tokens are all up to date");
                        }
                    }
                }
                CFK.A05("PushTokenManager", "Scheduling refresh for one or more token providers");
                PushTokenManager.A00(pushTokenManager);
            }
        } catch (Exception e) {
            CFK.A0A(TAG, "Failed to check and update push tokens on user session available", e);
        }
        return Unit.INSTANCE;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public List<AppJobId> getDependsOn() {
        return C0881AGi.A00;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public AppJobId getJobId() {
        return AppJobId.PUSH_TOKEN_REGISTRATION;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public StartupPhase getPhase() {
        return StartupPhase.NON_BLOCKING_HIGH_PRIORITY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ProcessScope getProcessScope() {
        return ProcessScope.FOREGROUND_ONLY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ResumePolicy getResumePolicy() {
        return new ResumePolicy.Periodic(15L);
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public /* bridge */ long getTimeoutMs() {
        return 10000L;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.PUSH_TOKEN_REGISTRATION;
    }
}
