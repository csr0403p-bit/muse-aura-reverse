package com.facebook.aura.browsertask.screen;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AnonymousClass441;
import X.BFM;
import X.BRg;
import X.C1BN;
import X.C3Ek;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.G0U;
import com.facebook.aura.R;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.browsertask.presentation.BrowserTaskActions;
import com.facebook.aura.browsertask.view.AgentComputerOtherDevice;
import com.facebook.aura.browsertask.view.AgentComputerScreenScope;
import com.facebook.aura.browsertask.view.AgentComputerSurface;
import com.facebook.aura.browsertask.view.AgentComputerTakeoverControls;
import com.facebook.aura.browsertask.view.AgentComputerTerminalOutcome;
import com.facebook.aura.browsertask.view.AgentComputerText;
import com.facebook.aura.model.BrowserTaskDisplayStatus;
import com.facebook.aura.model.BrowserTaskExecution;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class RemoteBrowserSurface implements AgentComputerSurface {
    public final int browserName;
    public final C1BN<Boolean> canStopTask;
    public final C1BN<Boolean> controlConflict;
    public final C1BN<Boolean> isPreviewRevoked;
    public final C1BN<Boolean> isUserControlled;
    public final C1BN<Boolean> isViewerReady;
    public final AgentComputerOtherDevice otherDevice;
    public final C1BN<BrowserTaskPresentation> presentation;
    public final BrowserTaskRepository repository;
    public final C3UX scope;
    public final C1BN<String> shareablePageUrl;
    public final C1BN<String> siteDomain;
    public final AgentComputerTakeoverControls takeoverControls;
    public final C1BN<AgentComputerText> taskActivityTitle;
    public final C1BN<BrowserTaskDisplayStatus> taskDisplayState;
    public final C1BN<AgentComputerText> taskDisplayStatus;
    public final C1BN<String> taskId;
    public final C1BN<AgentComputerTerminalOutcome> terminalOutcome;
    public final AbstractC3358CGz userSession;

    public RemoteBrowserSurface(String str, AbstractC3358CGz abstractC3358CGz, C3UX c3ux) {
        AnonymousClass005.A10(str, abstractC3358CGz, c3ux);
        this.userSession = abstractC3358CGz;
        this.scope = c3ux;
        BrowserTaskRepository companion = BrowserTaskRepository.Companion.getInstance(abstractC3358CGz);
        this.repository = companion;
        C3Pi c3PiA00 = AnonymousClass441.A00(companion.presentation(str), c3ux, companion.presentationUpdates(str), C3Ek.A00);
        this.presentation = c3PiA00;
        this.browserName = R.string._name_removed__res_0x7f1201c8;
        this.otherDevice = new AgentComputerOtherDevice(state(c3PiA00, new G0U() { // from class: com.facebook.aura.browsertask.screen.RemoteBrowserSurface$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return RemoteBrowserSurface.otherDevice$lambda$0((BrowserTaskPresentation) obj);
            }
        }));
        this.taskId = C3cG.A14(str);
        this.canStopTask = state(c3PiA00, RemoteBrowserSurface$canStopTask$1.INSTANCE);
        this.terminalOutcome = state(c3PiA00, new G0U() { // from class: com.facebook.aura.browsertask.screen.RemoteBrowserSurface$$ExternalSyntheticLambda1
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return RemoteBrowserSurface.terminalOutcome$lambda$0((BrowserTaskPresentation) obj);
            }
        });
        this.isPreviewRevoked = C3cG.A14(false);
        this.controlConflict = C3cG.A14(false);
        this.taskActivityTitle = state(c3PiA00, new G0U() { // from class: com.facebook.aura.browsertask.screen.RemoteBrowserSurface$$ExternalSyntheticLambda2
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return RemoteBrowserSurface.taskActivityTitle$lambda$0((BrowserTaskPresentation) obj);
            }
        });
        this.taskDisplayStatus = state(c3PiA00, new G0U() { // from class: com.facebook.aura.browsertask.screen.RemoteBrowserSurface$$ExternalSyntheticLambda3
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return RemoteBrowserSurface.taskDisplayStatus$lambda$0((BrowserTaskPresentation) obj);
            }
        });
        this.taskDisplayState = state(c3PiA00, new G0U() { // from class: com.facebook.aura.browsertask.screen.RemoteBrowserSurface$$ExternalSyntheticLambda4
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return RemoteBrowserSurface.taskDisplayState$lambda$0((BrowserTaskPresentation) obj);
            }
        });
        this.siteDomain = state(c3PiA00, new G0U() { // from class: com.facebook.aura.browsertask.screen.RemoteBrowserSurface$$ExternalSyntheticLambda5
            @Override // X.G0U
            public final Object invoke(Object obj) {
                BrowserTaskPresentation browserTaskPresentation = (BrowserTaskPresentation) obj;
                if (browserTaskPresentation != null) {
                    return browserTaskPresentation.siteDomain;
                }
                return null;
            }
        });
        this.shareablePageUrl = C3cG.A13();
        this.isUserControlled = C3cG.A14(false);
        this.isViewerReady = C3cG.A14(false);
    }

    public static final Unit Viewport__jt2gSs$lambda$4(String str, BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 1);
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            RemoteBrowserScreenKt.RemoteScreenshot(str, bRg, bfm, (i << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final AgentComputerText.Literal taskDisplayStatus$lambda$0(BrowserTaskPresentation browserTaskPresentation) {
        String str;
        if (browserTaskPresentation == null || (str = browserTaskPresentation.displayStatus) == null || C7BY.A0j(str)) {
            return null;
        }
        return new AgentComputerText.Literal(str);
    }

    public static final AgentComputerTerminalOutcome terminalOutcome$lambda$0(BrowserTaskPresentation browserTaskPresentation) {
        if (browserTaskPresentation == null || !browserTaskPresentation.isTombstone()) {
            return null;
        }
        return new AgentComputerTerminalOutcome(browserTaskPresentation.getDisplayState(), browserTaskPresentation.displayStatus, browserTaskPresentation.activityTitle);
    }

    public static final String otherDevice$lambda$0(BrowserTaskPresentation browserTaskPresentation) {
        BrowserTaskExecution browserTaskExecution;
        if (browserTaskPresentation == null || (browserTaskExecution = browserTaskPresentation.execution) == null) {
            return null;
        }
        return browserTaskExecution.deviceName;
    }

    public static final String siteDomain$lambda$0(BrowserTaskPresentation browserTaskPresentation) {
        if (browserTaskPresentation != null) {
            return browserTaskPresentation.siteDomain;
        }
        return null;
    }

    private final <T> C1BN<T> state(C1BN<BrowserTaskPresentation> c1bn, G0U<? super BrowserTaskPresentation, ? extends T> g0u) {
        RemoteBrowserSurface$state$$inlined$map$1 remoteBrowserSurface$state$$inlined$map$1 = new RemoteBrowserSurface$state$$inlined$map$1(c1bn, g0u);
        return AnonymousClass441.A00(g0u.invoke(c1bn.getValue()), this.scope, remoteBrowserSurface$state$$inlined$map$1, C3Ek.A00);
    }

    public static final AgentComputerText.Literal taskActivityTitle$lambda$0(BrowserTaskPresentation browserTaskPresentation) {
        String str;
        if (browserTaskPresentation == null || (str = browserTaskPresentation.activityTitle) == null) {
            return null;
        }
        return new AgentComputerText.Literal(str);
    }

    public static final BrowserTaskDisplayStatus taskDisplayState$lambda$0(BrowserTaskPresentation browserTaskPresentation) {
        if (browserTaskPresentation != null) {
            return browserTaskPresentation.getDisplayState();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    /* renamed from: Viewport--jt2gSs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo306Viewportjt2gSs(final com.facebook.aura.browsertask.view.AgentComputerScreenScope r21, final boolean r22, final boolean r23, final float r24, final X.BRg r25, X.BFM r26, final int r27) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.screen.RemoteBrowserSurface.mo306Viewportjt2gSs(com.facebook.aura.browsertask.view.AgentComputerScreenScope, boolean, boolean, float, X.BRg, X.BFM, int):void");
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public void acknowledgeTerminalOutcome() {
        BrowserTaskPresentation browserTaskPresentationA0G = C3cG.A0G(this.repository.terminalTask);
        if (C7384Etj.areEqual(browserTaskPresentationA0G != null ? browserTaskPresentationA0G.browserTaskId : null, getTaskId().getValue())) {
            this.repository.clearTerminalTask();
        }
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public void closeViewer() {
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
    public AgentComputerOtherDevice getOtherDevice() {
        return this.otherDevice;
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
        BrowserTaskPresentation browserTaskPresentationA0G = C3cG.A0G(this.presentation);
        if (browserTaskPresentationA0G != null) {
            BrowserTaskActions.Companion.getInstance(this.userSession).stopTask(browserTaskPresentationA0G);
        }
    }

    public static final Unit Viewport__jt2gSs$lambda$5(RemoteBrowserSurface remoteBrowserSurface, AgentComputerScreenScope agentComputerScreenScope, boolean z, boolean z2, float f, BRg bRg, int i, BFM bfm, int i2) {
        remoteBrowserSurface.mo306Viewportjt2gSs(agentComputerScreenScope, z, z2, f, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }
}
