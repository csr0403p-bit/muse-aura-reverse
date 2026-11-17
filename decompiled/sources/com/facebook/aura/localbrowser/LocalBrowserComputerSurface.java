package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.AnonymousClass441;
import X.AnonymousClass603;
import X.BFM;
import X.BLG;
import X.BRg;
import X.C0Yr;
import X.C1BN;
import X.C1BO;
import X.C20Q;
import X.C3Ej;
import X.C3Ek;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import X.C78g;
import X.C9286GCn;
import X.G0U;
import X.G2l;
import X.HnJ;
import X.HtJ;
import android.net.Uri;
import com.facebook.aura.R;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.browsertask.view.AgentComputerOtherDevice;
import com.facebook.aura.browsertask.view.AgentComputerScreenScope;
import com.facebook.aura.browsertask.view.AgentComputerSurface;
import com.facebook.aura.browsertask.view.AgentComputerTakeoverControls;
import com.facebook.aura.browsertask.view.AgentComputerTerminalOutcome;
import com.facebook.aura.browsertask.view.AgentComputerText;
import com.facebook.aura.localbrowser.LocalBrowserTarget;
import com.facebook.aura.model.BrowserTaskDisplayStatus;
import com.facebook.aura.model.BrowserTaskPresentation;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class LocalBrowserComputerSurface implements AgentComputerSurface {
    public static final int $stable = (BrowserTaskRepository.$stable | LocalBrowserTarget.$stable) | LocalBrowserSession.$stable;
    public final int browserName;
    public final C1BN<Boolean> canStopTask;
    public final C1BN<Boolean> controlConflict;
    public final C1BN<Boolean> isPreviewRevoked;
    public final C1BN<Boolean> isUserControlled;
    public final C1BN<Boolean> isViewerReady;
    public final BLG<LocalBrowserTarget.HostLease> mountedHost;
    public final C1BN<BrowserTaskPresentation> presentation;
    public final BrowserTaskRepository repository;
    public final C3UX scope;
    public final LocalBrowserSession session;
    public final C1BN<String> shareablePageUrl;
    public final C1BN<String> siteDomain;
    public final AgentComputerTakeoverControls takeoverControls;
    public final LocalBrowserTarget target;
    public final C1BN<AgentComputerText> taskActivityTitle;
    public final C1BN<BrowserTaskDisplayStatus> taskDisplayState;
    public final C1BN<AgentComputerText> taskDisplayStatus;
    public final C1BN<String> taskId;
    public final C1BN<AgentComputerTerminalOutcome> terminalOutcome;
    public final C1BN<LocalBrowserPageState> visiblePage;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserComputerSurface$isViewerReady$1", f = "LocalBrowserComputerSurface.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserComputerSurface$isViewerReady$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G2l<LocalBrowserTarget.HostLease, LocalBrowserTarget.HostLease, LocalBrowserFacts, Boolean, Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public /* synthetic */ Object L$2;
        public /* synthetic */ boolean Z$0;
        public /* synthetic */ boolean Z$1;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(6, htJ);
        }

        @Override // X.G2l
        public /* bridge */ /* synthetic */ Object invoke(LocalBrowserTarget.HostLease hostLease, LocalBrowserTarget.HostLease hostLease2, LocalBrowserFacts localBrowserFacts, Boolean bool, Boolean bool2, HtJ<? super Boolean> htJ) {
            return invoke(hostLease, hostLease2, localBrowserFacts, AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r5 = r6.L$0
                java.lang.Object r4 = r6.L$1
                com.facebook.aura.localbrowser.LocalBrowserTarget$HostLease r4 = (com.facebook.aura.localbrowser.LocalBrowserTarget.HostLease) r4
                java.lang.Object r1 = r6.L$2
                com.facebook.aura.localbrowser.LocalBrowserFacts r1 = (com.facebook.aura.localbrowser.LocalBrowserFacts) r1
                boolean r3 = r6.Z$0
                boolean r2 = r6.Z$1
                int r0 = r6.label
                if (r0 != 0) goto L32
                X.Hwg.A00(r7)
                if (r5 != r4) goto L2c
                com.facebook.aura.localbrowser.LocalBrowserComputerSurface r0 = com.facebook.aura.localbrowser.LocalBrowserComputerSurface.this
                com.facebook.aura.localbrowser.LocalBrowserTarget r0 = r0.target
                boolean r0 = r0.isUserHost(r4)
                if (r0 == 0) goto L2c
                com.facebook.aura.localbrowser.LocalBrowserControl r1 = r1.control
                com.facebook.aura.localbrowser.LocalBrowserControl r0 = com.facebook.aura.localbrowser.LocalBrowserControl.STOPPED
                if (r1 == r0) goto L2c
                if (r3 == 0) goto L2c
                r0 = 1
                if (r2 == 0) goto L2d
            L2c:
                r0 = 0
            L2d:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L32:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserComputerSurface.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(LocalBrowserTarget.HostLease hostLease, LocalBrowserTarget.HostLease hostLease2, LocalBrowserFacts localBrowserFacts, boolean z, boolean z2, HtJ<? super Boolean> htJ) {
            AnonymousClass1 anonymousClass1 = LocalBrowserComputerSurface.this.new AnonymousClass1(htJ);
            anonymousClass1.L$0 = hostLease;
            anonymousClass1.L$1 = hostLease2;
            anonymousClass1.L$2 = localBrowserFacts;
            anonymousClass1.Z$0 = z;
            anonymousClass1.Z$1 = z2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    public LocalBrowserComputerSurface(LocalBrowserSession localBrowserSession, C3UX c3ux) {
        LocalBrowserTaskControl localBrowserTaskControl;
        C20Q c20q;
        LocalBrowserTaskControl localBrowserTaskControl2;
        C1BN<Boolean> c1bn;
        boolean zA1a = AnonymousClass002.A1a(localBrowserSession, c3ux);
        this.session = localBrowserSession;
        this.scope = c3ux;
        LocalBrowserTarget localBrowserTarget = localBrowserSession.target;
        this.target = localBrowserTarget;
        BrowserTaskRepository companion = BrowserTaskRepository.Companion.getInstance(localBrowserSession.userSession);
        this.repository = companion;
        LocalBrowserTask localBrowserTask = localBrowserSession.task;
        C20Q<BrowserTaskPresentation> c20qPresentationUpdates = companion.presentationUpdates(localBrowserTask != null ? C3cH.A0b(localBrowserTask) : null);
        C3Ej c3Ej = C3Ek.A00;
        LocalBrowserTask localBrowserTask2 = localBrowserSession.task;
        C3Pi c3PiA00 = AnonymousClass441.A00(companion.presentation(localBrowserTask2 != null ? C3cH.A0b(localBrowserTask2) : null), c3ux, c20qPresentationUpdates, c3Ej);
        this.presentation = c3PiA00;
        C9286GCn c9286GCnA13 = C3cG.A13();
        this.mountedHost = c9286GCnA13;
        C60I c60iA03 = C3rb.A03(new LocalBrowserComputerSurface$visiblePage$1(null), localBrowserTarget.page.state, localBrowserTarget.popupPage);
        LocalBrowserPageState value = localBrowserTarget.popupPage.getValue();
        C3Pi c3PiA002 = AnonymousClass441.A00(value == null ? localBrowserTarget.page.state.getValue() : value, c3ux, c60iA03, c3Ej);
        this.visiblePage = c3PiA002;
        this.browserName = R.string._name_removed__res_0x7f120199;
        LocalBrowserTask localBrowserTask3 = localBrowserSession.task;
        this.taskId = C3cG.A11(HnJ.A01(localBrowserTask3 != null ? C3cH.A0b(localBrowserTask3) : localBrowserSession.id));
        this.canStopTask = AnonymousClass441.A00(false, c3ux, C3rb.A03(new LocalBrowserComputerSurface$canStopTask$1(null), localBrowserSession.facts, c3PiA00), c3Ej);
        this.terminalOutcome = state(c3PiA00, new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserComputerSurface$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return LocalBrowserComputerSurface.terminalOutcome$lambda$0((BrowserTaskPresentation) obj);
            }
        });
        this.isPreviewRevoked = state(companion.previewRevokedTaskIds, new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserComputerSurface$$ExternalSyntheticLambda1
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return Boolean.valueOf(LocalBrowserComputerSurface.isPreviewRevoked$lambda$0(this.f$0, (Set) obj));
            }
        });
        LocalBrowserTask localBrowserTask4 = localBrowserSession.task;
        this.controlConflict = (localBrowserTask4 == null || (localBrowserTaskControl2 = localBrowserTask4.viewer) == null || (c1bn = localBrowserTaskControl2.conflict) == null) ? C3cG.A14(false) : c1bn;
        this.taskActivityTitle = state(c3PiA00, new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserComputerSurface$$ExternalSyntheticLambda2
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return LocalBrowserComputerSurface.taskActivityTitle$lambda$0((BrowserTaskPresentation) obj);
            }
        });
        this.taskDisplayStatus = AnonymousClass441.A00(null, c3ux, C3rb.A01(new LocalBrowserComputerSurface$taskDisplayStatus$1(this, null), localBrowserSession.facts, c3PiA002, localBrowserSession.dialogs.revision, c3PiA00), c3Ej);
        this.taskDisplayState = AnonymousClass441.A00(null, c3ux, C3rb.A03(new LocalBrowserComputerSurface$taskDisplayState$1(null), localBrowserSession.facts, c3PiA00), c3Ej);
        this.siteDomain = AnonymousClass441.A00(Uri.parse(((LocalBrowserPageState) c3PiA002.getValue()).url).getHost(), c3ux, new LocalBrowserComputerSurface$special$$inlined$map$1(c3PiA002), c3Ej);
        this.shareablePageUrl = state(c3PiA002, new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserComputerSurface$$ExternalSyntheticLambda3
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return LocalBrowserComputerSurface.shareablePageUrl$lambda$0((LocalBrowserPageState) obj);
            }
        });
        LocalBrowserTask localBrowserTask5 = localBrowserSession.task;
        this.isUserControlled = localBrowserTask5 != null ? AnonymousClass441.A00(false, c3ux, C3rb.A03(new LocalBrowserComputerSurface$isUserControlled$1$1(null), localBrowserSession.facts, localBrowserTask5.viewer.granted), c3Ej) : state(localBrowserSession.facts, new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserComputerSurface$$ExternalSyntheticLambda4
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return Boolean.valueOf(LocalBrowserComputerSurface.isUserControlled$lambda$1((LocalBrowserFacts) obj));
            }
        });
        C1BN<LocalBrowserTarget.HostLease> c1bn2 = localBrowserTarget.availableHost;
        C1BN<LocalBrowserFacts> c1bn3 = localBrowserSession.facts;
        LocalBrowserTask localBrowserTask6 = localBrowserSession.task;
        this.isViewerReady = AnonymousClass441.A00(false, c3ux, new AnonymousClass603(3, new AnonymousClass1(null), new C20Q[]{c1bn2, c9286GCnA13, c1bn3, (localBrowserTask6 == null || (localBrowserTaskControl = localBrowserTask6.viewer) == null || (c20q = localBrowserTaskControl.ready) == null) ? AnonymousClass002.A0v(zA1a) : c20q, isPreviewRevoked()}), c3Ej);
    }

    public static final boolean isPreviewRevoked$lambda$0(LocalBrowserComputerSurface localBrowserComputerSurface, Set set) {
        C7384Etj.A0Y(set, 1);
        LocalBrowserTask localBrowserTask = localBrowserComputerSurface.session.task;
        return AbstractC0878AGe.A0k(set, localBrowserTask != null ? C3cH.A0b(localBrowserTask) : null);
    }

    public static final boolean isUserControlled$lambda$1(LocalBrowserFacts localBrowserFacts) {
        C7384Etj.A0Y(localBrowserFacts, 0);
        return localBrowserFacts.control == LocalBrowserControl.USER;
    }

    public static final String shareablePageUrl$lambda$0(LocalBrowserPageState localBrowserPageState) {
        C7384Etj.A0Y(localBrowserPageState, 0);
        String str = localBrowserPageState.url;
        if (LocalBrowserUrlPolicy.INSTANCE.host(str) == null) {
            return null;
        }
        return str;
    }

    public static final AgentComputerTerminalOutcome terminalOutcome$lambda$0(BrowserTaskPresentation browserTaskPresentation) {
        if (browserTaskPresentation == null || !browserTaskPresentation.isTombstone()) {
            return null;
        }
        return new AgentComputerTerminalOutcome(browserTaskPresentation.getDisplayState(), browserTaskPresentation.displayStatus, browserTaskPresentation.activityTitle);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    /* renamed from: Viewport--jt2gSs */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo306Viewportjt2gSs(final com.facebook.aura.browsertask.view.AgentComputerScreenScope r47, final boolean r48, final boolean r49, final float r50, final X.BRg r51, X.BFM r52, final int r53) {
        /*
            Method dump skipped, instructions count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserComputerSurface.mo306Viewportjt2gSs(com.facebook.aura.browsertask.view.AgentComputerScreenScope, boolean, boolean, float, X.BRg, X.BFM, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit Viewport__jt2gSs$lambda$5$0(com.facebook.aura.localbrowser.LocalBrowserComputerSurface r14, boolean r15, X.C1Cd r16, X.BFM r17, int r18) {
        /*
            r1 = r18
            boolean r0 = X.AnonymousClass004.A1G(r1)
            r12 = r17
            boolean r0 = X.AnonymousClass001.A1b(r0, r12, r1)
            if (r0 == 0) goto Lc0
            X.1BN<com.facebook.aura.localbrowser.LocalBrowserPageState> r0 = r14.visiblePage
            r11 = 0
            X.1BO r2 = X.C2CK.A02(r12, r0)
            com.facebook.aura.localbrowser.LocalBrowserTarget r0 = r14.target
            X.1BN<com.facebook.aura.localbrowser.LocalBrowserPageState> r0 = r0.popupPage
            X.1BO r1 = X.C2CK.A02(r12, r0)
            java.lang.Object r3 = r2.getValue()
            com.facebook.aura.localbrowser.LocalBrowserPageState r3 = (com.facebook.aura.localbrowser.LocalBrowserPageState) r3
            java.lang.Object r0 = r2.getValue()
            com.facebook.aura.localbrowser.LocalBrowserPageState r0 = (com.facebook.aura.localbrowser.LocalBrowserPageState) r0
            boolean r0 = r0.canGoBack
            if (r0 != 0) goto L34
            java.lang.Object r0 = r1.getValue()
            r4 = 0
            if (r0 == 0) goto L35
        L34:
            r4 = 1
        L35:
            com.facebook.aura.localbrowser.LocalBrowserTarget r1 = r14.target
            boolean r0 = r12.A67(r1)
            java.lang.Object r6 = r12.AaT()
            if (r0 != 0) goto L45
            java.lang.Object r0 = X.C78N.A00
            if (r6 != r0) goto L4d
        L45:
            com.facebook.aura.localbrowser.LocalBrowserComputerSurface$Viewport$2$1$1$1 r6 = new com.facebook.aura.localbrowser.LocalBrowserComputerSurface$Viewport$2$1$1$1
            r6.<init>(r1)
            r12.Ai0(r6)
        L4d:
            X.G0U r6 = (X.G0U) r6
            com.facebook.aura.localbrowser.LocalBrowserTarget r1 = r14.target
            boolean r0 = r12.A67(r1)
            java.lang.Object r7 = r12.AaT()
            if (r0 != 0) goto L5f
            java.lang.Object r0 = X.C78N.A00
            if (r7 != r0) goto L67
        L5f:
            com.facebook.aura.localbrowser.LocalBrowserComputerSurface$Viewport$2$1$2$1 r7 = new com.facebook.aura.localbrowser.LocalBrowserComputerSurface$Viewport$2$1$2$1
            r7.<init>(r1)
            r12.Ai0(r7)
        L67:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            com.facebook.aura.localbrowser.LocalBrowserTarget r1 = r14.target
            boolean r0 = r12.A67(r1)
            java.lang.Object r8 = r12.AaT()
            if (r0 != 0) goto L79
            java.lang.Object r0 = X.C78N.A00
            if (r8 != r0) goto L81
        L79:
            com.facebook.aura.localbrowser.LocalBrowserComputerSurface$Viewport$2$1$3$1 r8 = new com.facebook.aura.localbrowser.LocalBrowserComputerSurface$Viewport$2$1$3$1
            r8.<init>(r1)
            r12.Ai0(r8)
        L81:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            com.facebook.aura.localbrowser.LocalBrowserTarget r1 = r14.target
            boolean r0 = r12.A67(r1)
            java.lang.Object r9 = r12.AaT()
            if (r0 != 0) goto L93
            java.lang.Object r0 = X.C78N.A00
            if (r9 != r0) goto L9b
        L93:
            com.facebook.aura.localbrowser.LocalBrowserComputerSurface$Viewport$2$1$4$1 r9 = new com.facebook.aura.localbrowser.LocalBrowserComputerSurface$Viewport$2$1$4$1
            r9.<init>(r1)
            r12.Ai0(r9)
        L9b:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            boolean r0 = r12.A67(r14)
            java.lang.Object r10 = r12.AaT()
            if (r0 != 0) goto Lab
            java.lang.Object r0 = X.C78N.A00
            if (r10 != r0) goto Lb3
        Lab:
            com.facebook.aura.localbrowser.LocalBrowserComputerSurface$Viewport$2$1$5$1 r10 = new com.facebook.aura.localbrowser.LocalBrowserComputerSurface$Viewport$2$1$5$1
            r10.<init>(r14)
            r12.Ai0(r10)
        Lb3:
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            int r13 = com.facebook.aura.localbrowser.LocalBrowserPageState.$stable
            r14 = 256(0x100, float:3.59E-43)
            r5 = r15
            com.facebook.aura.localbrowser.LocalBrowserAddressBarKt.LocalBrowserAddressBar(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        Lbd:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lc0:
            r12.Afo()
            goto Lbd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserComputerSurface.Viewport__jt2gSs$lambda$5$0(com.facebook.aura.localbrowser.LocalBrowserComputerSurface, boolean, X.1Cd, X.BFM, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hostChanged(LocalBrowserTarget.HostLease hostLease) {
        if (this.mountedHost.getValue() != hostLease) {
            this.session.handBack(this.mountedHost.getValue());
            this.mountedHost.Af8(hostLease);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordInteraction() {
        LocalBrowserRuntime.Companion.getInstance(this.session.userSession).recordInteraction(this.session);
    }

    private final <T, R> C1BN<R> state(C1BN<? extends T> c1bn, G0U<? super T, ? extends R> g0u) {
        LocalBrowserComputerSurface$state$$inlined$map$1 localBrowserComputerSurface$state$$inlined$map$1 = new LocalBrowserComputerSurface$state$$inlined$map$1(c1bn, g0u);
        return AnonymousClass441.A00(g0u.invoke(c1bn.getValue()), this.scope, localBrowserComputerSurface$state$$inlined$map$1, C3Ek.A00);
    }

    public static final AgentComputerText.Literal taskActivityTitle$lambda$0(BrowserTaskPresentation browserTaskPresentation) {
        String str;
        if (browserTaskPresentation == null || (str = browserTaskPresentation.activityTitle) == null) {
            return null;
        }
        return new AgentComputerText.Literal(str);
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public void acknowledgeTerminalOutcome() {
        BrowserTaskPresentation browserTaskPresentationA0G = C3cG.A0G(this.repository.terminalTask);
        String str = browserTaskPresentationA0G != null ? browserTaskPresentationA0G.browserTaskId : null;
        LocalBrowserTask localBrowserTask = this.session.task;
        if (C7384Etj.areEqual(str, localBrowserTask != null ? C3cH.A0b(localBrowserTask) : null)) {
            this.repository.clearTerminalTask();
        }
    }

    @Override // com.facebook.aura.browsertask.view.AgentComputerSurface
    public void closeViewer() {
        LocalBrowserTarget.HostSlot hostSlot;
        LocalBrowserRuntime.Companion.getInstance(this.session.userSession).recordInteraction(this.session);
        LocalBrowserTarget.HostLease value = this.mountedHost.getValue();
        this.session.handBack(value);
        if (value == null || (hostSlot = value.slot) == null) {
            return;
        }
        hostSlot.close();
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
        if (this.session.acceptsUserInput(this.mountedHost.getValue())) {
            this.target.closeUserWindows();
        }
        this.session.handBack(this.mountedHost.getValue());
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
        LocalBrowserSession localBrowserSession = this.session;
        LocalBrowserTask localBrowserTask = localBrowserSession.task;
        if (localBrowserTask != null) {
            localBrowserTask.viewer.stop();
        } else {
            LocalBrowserRuntime.Companion.getInstance(localBrowserSession.userSession).closeSession(this.session, LocalBrowserCloseReason.USER);
        }
    }

    public static final Unit Viewport__jt2gSs$lambda$0(LocalBrowserComputerSurface localBrowserComputerSurface, AgentComputerScreenScope agentComputerScreenScope, boolean z, boolean z2, float f, BRg bRg, int i, BFM bfm, int i2) {
        localBrowserComputerSurface.mo306Viewportjt2gSs(agentComputerScreenScope, z, z2, f, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final C78g Viewport__jt2gSs$lambda$4$0(LocalBrowserComputerSurface localBrowserComputerSurface, boolean z, C1BO c1bo, C1BO c1bo2, C0Yr c0Yr) {
        LocalBrowserTarget.HostLease hostLease = (LocalBrowserTarget.HostLease) c1bo.getValue();
        if (hostLease != null && hostLease == c1bo2.getValue()) {
            LocalBrowserSession localBrowserSession = localBrowserComputerSurface.session;
            LocalBrowserTask localBrowserTask = localBrowserSession.task;
            if (localBrowserTask != null) {
                localBrowserTask.viewer.present(hostLease, !z);
            } else if (!z) {
                localBrowserSession.takeControl(hostLease);
            }
        }
        return new C78g() { // from class: com.facebook.aura.localbrowser.LocalBrowserComputerSurface$Viewport__jt2gSs$lambda$4$0$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }

    public static final Unit Viewport__jt2gSs$lambda$6(LocalBrowserComputerSurface localBrowserComputerSurface, AgentComputerScreenScope agentComputerScreenScope, boolean z, boolean z2, float f, BRg bRg, int i, BFM bfm, int i2) {
        localBrowserComputerSurface.mo306Viewportjt2gSs(agentComputerScreenScope, z, z2, f, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }
}
