package com.facebook.aura.startup.appjob;

import java.util.List;

/* loaded from: classes3.dex */
public interface SessionlessStartupJobRegistration {
    List<AppJobId> getDependsOn();

    SessionlessStartupJob getJob();

    AppJobKey getJobId();

    StartupPhase getPhase();

    ProcessScope getProcessScope();

    ResumePolicy getResumePolicy();
}
