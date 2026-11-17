package com.facebook.aura.startup.appjob;

import java.util.List;

/* loaded from: classes3.dex */
public interface SessionedStartupJobRegistration {
    List<AppJobId> getDependsOn();

    SessionedStartupJob getJob();

    AppJobKey getJobId();

    StartupPhase getPhase();

    ProcessScope getProcessScope();

    ResumePolicy getResumePolicy();
}
