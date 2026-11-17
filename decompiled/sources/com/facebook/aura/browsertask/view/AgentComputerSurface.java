package com.facebook.aura.browsertask.view;

import X.BFM;
import X.BRg;
import X.C1BN;
import com.facebook.aura.model.BrowserTaskDisplayStatus;

/* loaded from: classes4.dex */
public interface AgentComputerSurface {

    /* renamed from: com.facebook.aura.browsertask.view.AgentComputerSurface$-CC, reason: invalid class name */
    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class CC {
        public static AgentComputerOtherDevice $default$getOtherDevice(AgentComputerSurface agentComputerSurface) {
            return null;
        }

        public static /* synthetic */ AgentComputerOtherDevice access$getOtherDevice$jd(AgentComputerSurface agentComputerSurface) {
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public abstract class DefaultImpls {
        @Deprecated
        public static AgentComputerOtherDevice getOtherDevice(AgentComputerSurface agentComputerSurface) {
            return null;
        }
    }

    /* renamed from: Viewport--jt2gSs */
    void mo306Viewportjt2gSs(AgentComputerScreenScope agentComputerScreenScope, boolean z, boolean z2, float f, BRg bRg, BFM bfm, int i);

    void acknowledgeTerminalOutcome();

    void closeViewer();

    int getBrowserName();

    C1BN<Boolean> getCanStopTask();

    C1BN<Boolean> getControlConflict();

    AgentComputerOtherDevice getOtherDevice();

    C1BN<String> getShareablePageUrl();

    C1BN<String> getSiteDomain();

    AgentComputerTakeoverControls getTakeoverControls();

    C1BN<AgentComputerText> getTaskActivityTitle();

    C1BN<BrowserTaskDisplayStatus> getTaskDisplayState();

    C1BN<AgentComputerText> getTaskDisplayStatus();

    C1BN<String> getTaskId();

    C1BN<AgentComputerTerminalOutcome> getTerminalOutcome();

    void handBackControl();

    C1BN<Boolean> isPreviewRevoked();

    C1BN<Boolean> isUserControlled();

    C1BN<Boolean> isViewerReady();

    void stopSession();
}
