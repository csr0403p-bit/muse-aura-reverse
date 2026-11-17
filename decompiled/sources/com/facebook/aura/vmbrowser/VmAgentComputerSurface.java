package com.facebook.aura.vmbrowser;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AnonymousClass441;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1BN;
import X.C1BO;
import X.C2CK;
import X.C3Ej;
import X.C3Ek;
import X.C3UX;
import X.C3cG;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.browsertask.view.AgentComputerOtherDevice;
import com.facebook.aura.browsertask.view.AgentComputerScreenScope;
import com.facebook.aura.browsertask.view.AgentComputerSurface;
import com.facebook.aura.browsertask.view.AgentComputerTakeoverControls;
import com.facebook.aura.browsertask.view.AgentComputerTerminalOutcome;
import com.facebook.aura.browsertask.view.AgentComputerText;
import com.facebook.aura.model.BrowserTaskDisplayStatus;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VmAgentComputerSurface implements AgentComputerSurface {
    public static final int $stable = AgentBrowserSurface.$stable;
    public final int browserName;
    public final C1BN<Boolean> canStopTask;
    public final C1BN<Boolean> controlConflict;
    public final C1BN<Boolean> isPreviewRevoked;
    public final C1BN<Boolean> isUserControlled;
    public final C1BN<Boolean> isViewerReady;
    public final C1BN<String> shareablePageUrl;
    public final C1BN<String> siteDomain;
    public final AgentBrowserSurface surface;
    public final AgentComputerTakeoverControls takeoverControls;
    public final C1BN<AgentComputerText> taskActivityTitle;
    public final C1BN<BrowserTaskDisplayStatus> taskDisplayState;
    public final C1BN<AgentComputerText> taskDisplayStatus;
    public final C1BN<String> taskId;
    public final C1BN<AgentComputerTerminalOutcome> terminalOutcome;

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    /* renamed from: Viewport--jt2gSs */
    public void mo306Viewportjt2gSs(final AgentComputerScreenScope agentComputerScreenScope, final boolean z, final boolean z2, final float f, final BRg bRg, BFM bfm, final int i) {
        AnonymousClass002.A1C(agentComputerScreenScope, 0, bRg);
        bfm.AgG(-1021570170);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentComputerScreenScope, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A07(bfm, f);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass002.A02(AnonymousClass004.A1R(bfm, this, 262144, i) ? 1 : 0);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA05), bfm, iA05)) {
            if (C1BO.A0F(C2CK.A02(bfm, this.surface.isPreviewRevoked))) {
                bfm.AgE(541603027);
                VmAgentComputerSurfaceKt.RevokedPreviewFrame(this.surface, bRg, bfm, ((iA05 >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | AgentBrowserSurface.$stable, 0);
            } else {
                bfm.AgE(541702754);
                int i2 = iA05 << 3;
                this.surface.m3143LiveViewerWHejsw(agentComputerScreenScope.taskId, agentComputerScreenScope, z, z2, f, bRg, bfm, (i2 & 458752) | AnonymousClass001.A0A(i2, AnonymousClass002.A07(i2, AgentComputerScreenScope.$stable << 3) | (i2 & 7168)) | (AgentBrowserSurface.$stable << 18), 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.vmbrowser.VmAgentComputerSurface$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    this.f$0.mo306Viewportjt2gSs(agentComputerScreenScope, z, z2, f, bRg, (BFM) obj, AnonymousClass011.A02(obj2, i));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public void acknowledgeTerminalOutcome() {
        this.surface.acknowledgeTerminalOutcome();
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public void closeViewer() {
        this.surface.closeViewer();
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public int getBrowserName() {
        return this.browserName;
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public C1BN<Boolean> getCanStopTask() {
        return this.canStopTask;
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public C1BN<Boolean> getControlConflict() {
        return this.controlConflict;
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public /* bridge */ AgentComputerOtherDevice getOtherDevice() {
        return null;
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public C1BN<String> getShareablePageUrl() {
        return this.shareablePageUrl;
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public C1BN<String> getSiteDomain() {
        return this.siteDomain;
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public AgentComputerTakeoverControls getTakeoverControls() {
        return this.takeoverControls;
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public C1BN<AgentComputerText> getTaskActivityTitle() {
        return this.taskActivityTitle;
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public C1BN<BrowserTaskDisplayStatus> getTaskDisplayState() {
        return this.taskDisplayState;
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public C1BN<AgentComputerText> getTaskDisplayStatus() {
        return this.taskDisplayStatus;
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public C1BN<String> getTaskId() {
        return this.taskId;
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public C1BN<AgentComputerTerminalOutcome> getTerminalOutcome() {
        return this.terminalOutcome;
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public void handBackControl() {
        this.surface.handBackControl();
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public C1BN<Boolean> isPreviewRevoked() {
        return this.isPreviewRevoked;
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public C1BN<Boolean> isUserControlled() {
        return this.isUserControlled;
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public C1BN<Boolean> isViewerReady() {
        return this.isViewerReady;
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public void stopSession() {
        this.surface.stopSession();
    }

    public VmAgentComputerSurface(AgentBrowserSurface agentBrowserSurface, C3UX c3ux) {
        AnonymousClass003.A0u(agentBrowserSurface, c3ux);
        this.surface = agentBrowserSurface;
        this.browserName = R.string._name_removed__res_0x7f12018d;
        C1BN<BrowserTaskPresentation> c1bn = agentBrowserSurface.currentTask;
        VmAgentComputerSurface$special$$inlined$map$1 vmAgentComputerSurface$special$$inlined$map$1 = new VmAgentComputerSurface$special$$inlined$map$1(c1bn);
        C3Ej c3Ej = C3Ek.A00;
        BrowserTaskPresentation browserTaskPresentationA0G = C3cG.A0G(c1bn);
        this.taskId = AnonymousClass441.A00(browserTaskPresentationA0G != null ? browserTaskPresentationA0G.browserTaskId : null, c3ux, vmAgentComputerSurface$special$$inlined$map$1, c3Ej);
        this.canStopTask = agentBrowserSurface.canStopTask;
        C1BN<BrowserTaskPresentation> c1bn2 = agentBrowserSurface.terminalOutcome;
        VmAgentComputerSurface$special$$inlined$map$2 vmAgentComputerSurface$special$$inlined$map$2 = new VmAgentComputerSurface$special$$inlined$map$2(c1bn2);
        BrowserTaskPresentation browserTaskPresentationA0G2 = C3cG.A0G(c1bn2);
        this.terminalOutcome = AnonymousClass441.A00(browserTaskPresentationA0G2 != null ? VmAgentComputerSurfaceKt.toTerminalOutcome(browserTaskPresentationA0G2) : null, c3ux, vmAgentComputerSurface$special$$inlined$map$2, c3Ej);
        this.isPreviewRevoked = agentBrowserSurface.isPreviewRevoked;
        this.controlConflict = agentBrowserSurface.controlConflict;
        this.taskActivityTitle = VmAgentComputerSurfaceKt.literal(agentBrowserSurface.taskActivityTitle, c3ux);
        this.taskDisplayStatus = VmAgentComputerSurfaceKt.literal(agentBrowserSurface.taskDisplayStatus, c3ux);
        this.taskDisplayState = agentBrowserSurface.taskDisplayState;
        this.siteDomain = agentBrowserSurface.siteDomain;
        this.shareablePageUrl = agentBrowserSurface.pageUrl;
        this.isUserControlled = agentBrowserSurface.isUserControlled;
        this.isViewerReady = agentBrowserSurface.isViewerReady;
        this.takeoverControls = new VmAgentComputerSurface$takeoverControls$1(this);
    }

    public static final Unit Viewport__jt2gSs$lambda$1(VmAgentComputerSurface vmAgentComputerSurface, AgentComputerScreenScope agentComputerScreenScope, boolean z, boolean z2, float f, BRg bRg, int i, BFM bfm, int i2) {
        vmAgentComputerSurface.mo306Viewportjt2gSs(agentComputerScreenScope, z, z2, f, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }
}
