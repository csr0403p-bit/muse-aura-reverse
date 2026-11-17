package com.facebook.aura.browsertask.navigation;

import X.AbstractC3358CGz;
import X.AnonymousClass004;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.browsertask.presentation.BrowserTaskActions;
import com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore;
import com.facebook.aura.common.identifiers.AuraDeviceId;
import com.facebook.aura.localbrowser.LocalBrowserTaskViewerKt;
import com.facebook.aura.model.BrowserTaskExecution;
import com.facebook.aura.model.BrowserTaskExecutionKind;
import com.facebook.aura.model.BrowserTaskIdKt;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.RemoteBrowserScreenKey;
import com.facebook.aura.vmbrowser.VmBrowserViewer;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class BrowserTaskNavigation {
    public static final int $stable = 8;
    public final BrowserTaskActions actions;
    public final BrowserTaskPresentationStore presentation;
    public final BrowserTaskRepository repository;
    public final AbstractC3358CGz userSession;

    public BrowserTaskNavigation(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.repository = BrowserTaskRepository.Companion.getInstance(abstractC3358CGz);
        this.presentation = BrowserTaskPresentationStore.Companion.getInstance(abstractC3358CGz);
        this.actions = BrowserTaskActions.Companion.getInstance(abstractC3358CGz);
    }

    public final boolean canOpenTask(BrowserTaskPresentation browserTaskPresentation) {
        C7384Etj.A0Y(browserTaskPresentation, 0);
        return browserTaskPresentation.execution.isVm() || isOnThisDevice(browserTaskPresentation) || isOnOtherDevice(browserTaskPresentation);
    }

    public final AuraNavKey focusTaskCard(String str) {
        C7384Etj.A0Y(str, 0);
        BrowserTaskPresentation browserTaskPresentationKnownTask = knownTask(str);
        if (browserTaskPresentationKnownTask == null || !canOpenTask(browserTaskPresentationKnownTask)) {
            return null;
        }
        this.actions.focusTask(browserTaskPresentationKnownTask);
        return taskScreenKey(browserTaskPresentationKnownTask, opensInTakeover(browserTaskPresentationKnownTask));
    }

    private final boolean isOnOtherDevice(BrowserTaskPresentation browserTaskPresentation) {
        return browserTaskPresentation.execution.kind == BrowserTaskExecutionKind.LOCAL_DEVICE && !isOnThisDevice(browserTaskPresentation);
    }

    private final boolean isOnThisDevice(BrowserTaskPresentation browserTaskPresentation) {
        BrowserTaskExecution browserTaskExecution = browserTaskPresentation.execution;
        return browserTaskExecution.kind == BrowserTaskExecutionKind.LOCAL_DEVICE && C7384Etj.areEqual(browserTaskExecution.deviceId, AuraDeviceId.INSTANCE.getNodeId());
    }

    private final BrowserTaskPresentation knownTask(String str) {
        Object next;
        Iterator itA0z = C3cI.A0z(this.repository.activeTasks);
        while (true) {
            if (!itA0z.hasNext()) {
                next = null;
                break;
            }
            next = itA0z.next();
            if (C7384Etj.areEqual(((BrowserTaskPresentation) next).browserTaskId, str)) {
                break;
            }
        }
        BrowserTaskPresentation browserTaskPresentationA0G = (BrowserTaskPresentation) next;
        if (browserTaskPresentationA0G != null || ((browserTaskPresentationA0G = C3cG.A0G(this.repository.terminalTask)) != null && C7384Etj.areEqual(browserTaskPresentationA0G.browserTaskId, str))) {
            return browserTaskPresentationA0G;
        }
        BrowserTaskPresentation browserTaskPresentationA0G2 = C3cG.A0G(this.presentation.currentTask);
        if (browserTaskPresentationA0G2 == null || !C7384Etj.areEqual(browserTaskPresentationA0G2.browserTaskId, str)) {
            return null;
        }
        return browserTaskPresentationA0G2;
    }

    public static final boolean openTaskForAgent$matches(BrowserTaskPresentation browserTaskPresentation, String str) {
        return BrowserTaskIdKt.canonicalBrowserTaskId(browserTaskPresentation.browserTaskId).equals(str);
    }

    private final AuraNavKey taskScreenKey(BrowserTaskPresentation browserTaskPresentation, boolean z) {
        if (browserTaskPresentation.execution.isVm()) {
            return VmBrowserViewer.Companion.getInstance(this.userSession).focusedTaskScreenKey(browserTaskPresentation.browserTaskId, z);
        }
        if (isOnThisDevice(browserTaskPresentation)) {
            return LocalBrowserTaskViewerKt.localBrowserTaskScreenKey(this.userSession, browserTaskPresentation.browserTaskId, z);
        }
        if (isOnOtherDevice(browserTaskPresentation)) {
            return new RemoteBrowserScreenKey(browserTaskPresentation.browserTaskId);
        }
        return null;
    }

    private final boolean openTask(BrowserTaskPresentation browserTaskPresentation, AuraNavigator auraNavigator, boolean z) {
        AuraNavKey auraNavKeyTaskScreenKey = taskScreenKey(browserTaskPresentation, z);
        if (auraNavKeyTaskScreenKey == null) {
            return false;
        }
        auraNavigator.navigate(auraNavKeyTaskScreenKey, false);
        return true;
    }

    private final boolean opensInTakeover(BrowserTaskPresentation browserTaskPresentation) {
        return (browserTaskPresentation.isControlledByUser() || browserTaskPresentation.isWaitingForUser()) && !this.presentation.previewRevokedTaskIds.getValue().contains(browserTaskPresentation.browserTaskId);
    }

    public final boolean openTaskCard(BrowserTaskPresentation browserTaskPresentation, AuraNavigator auraNavigator) {
        boolean zA1b = AnonymousClass004.A1b(browserTaskPresentation, auraNavigator);
        if (!canOpenTask(browserTaskPresentation)) {
            return zA1b;
        }
        this.actions.focusTask(browserTaskPresentation);
        return openTask(browserTaskPresentation, auraNavigator, opensInTakeover(browserTaskPresentation));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenResult openTaskForAgent$fbandroid_express_aura_java_com_facebook_aura_browsertask_navigation_navigation(java.lang.String r6, com.facebook.aura.navigation.AuraNavigator r7) {
        /*
            r5 = this;
            boolean r3 = X.AnonymousClass002.A1a(r6, r7)
            java.lang.String r4 = com.facebook.aura.model.BrowserTaskIdKt.canonicalBrowserTaskId(r6)
            com.facebook.aura.browsertask.data.BrowserTaskRepository r0 = r5.repository
            X.1BN<com.facebook.aura.model.BrowserTaskPresentation> r0 = r0.terminalTask
            com.facebook.aura.model.BrowserTaskPresentation r0 = X.C3cG.A0G(r0)
            if (r0 == 0) goto L22
            boolean r0 = openTaskForAgent$matches(r0, r4)
            if (r0 != r3) goto L22
        L18:
            com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenFailure r1 = com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenFailure.FINISHED
        L1a:
            com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenResult$Failed r0 = new com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenResult$Failed
            r0.<init>(r1)
        L1f:
            com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenResult r0 = (com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenResult) r0
            return r0
        L22:
            com.facebook.aura.browsertask.data.BrowserTaskRepository r0 = r5.repository
            X.1BN<java.util.List<com.facebook.aura.model.BrowserTaskPresentation>> r0 = r0.activeTasks
            java.util.Iterator r1 = X.C3cI.A0z(r0)
        L2a:
            boolean r0 = r1.hasNext()
            r2 = 0
            if (r0 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            r0 = r2
            com.facebook.aura.model.BrowserTaskPresentation r0 = (com.facebook.aura.model.BrowserTaskPresentation) r0
            boolean r0 = openTaskForAgent$matches(r0, r4)
            if (r0 == 0) goto L2a
        L3e:
            com.facebook.aura.model.BrowserTaskPresentation r2 = (com.facebook.aura.model.BrowserTaskPresentation) r2
            if (r2 != 0) goto L45
            com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenFailure r1 = com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenFailure.NOT_FOUND
            goto L1a
        L45:
            boolean r0 = r2.isTombstone()
            if (r0 != 0) goto L18
            boolean r0 = r5.canOpenTask(r2)
            if (r0 != 0) goto L54
            com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenFailure r1 = com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenFailure.NOT_OPENABLE
            goto L1a
        L54:
            boolean r0 = r5.isOnThisDevice(r2)
            if (r0 != 0) goto L6e
            com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore r0 = r5.presentation
            X.1BN<java.util.Set<java.lang.String>> r0 = r0.previewRevokedTaskIds
            java.lang.Object r1 = r0.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L77
            boolean r0 = X.C3cG.A1N(r1)
            if (r0 == 0) goto L77
        L6e:
            boolean r0 = r2.isLiveViewable()
            if (r0 != 0) goto L92
            com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenFailure r1 = com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenFailure.NOT_STARTED
            goto L1a
        L77:
            java.util.Iterator r1 = r1.iterator()
        L7b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6e
            java.lang.String r0 = X.AnonymousClass005.A0j(r1)
            java.lang.String r0 = com.facebook.aura.model.BrowserTaskIdKt.canonicalBrowserTaskId(r0)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L7b
            com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenFailure r1 = com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenFailure.PREVIEW_REVOKED
            goto L1a
        L92:
            boolean r0 = r5.isOnThisDevice(r2)
            if (r0 == 0) goto La6
            X.CGz r1 = r5.userSession
            java.lang.String r0 = r2.browserTaskId
            boolean r0 = com.facebook.aura.localbrowser.LocalBrowserTaskViewerKt.hasLiveLocalBrowserTask(r1, r0)
            if (r0 != 0) goto La6
            com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenFailure r1 = com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenFailure.BROWSER_GONE
            goto L1a
        La6:
            com.facebook.aura.navigation.AuraNavKey r0 = r7.currentKey(r3)
            boolean r0 = r0 instanceof com.facebook.aura.navigation.AuraOverlayNavKey
            if (r0 == 0) goto Lb2
            com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenFailure r1 = com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenFailure.COVERED
            goto L1a
        Lb2:
            boolean r0 = r5.openTaskCard(r2, r7)
            if (r0 == 0) goto Lbc
            com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenResult$Opened r0 = com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenResult.Opened.INSTANCE
            goto L1f
        Lbc:
            com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenFailure r1 = com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenFailure.VIEWER_UNAVAILABLE
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.navigation.BrowserTaskNavigation.openTaskForAgent$fbandroid_express_aura_java_com_facebook_aura_browsertask_navigation_navigation(java.lang.String, com.facebook.aura.navigation.AuraNavigator):com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenResult");
    }

    public final boolean openTaskPreview(String str, AuraNavigator auraNavigator) {
        boolean zA1b = AnonymousClass004.A1b(str, auraNavigator);
        BrowserTaskPresentation browserTaskPresentationKnownTask = knownTask(str);
        if (browserTaskPresentationKnownTask == null || !canOpenTask(browserTaskPresentationKnownTask)) {
            return zA1b;
        }
        this.actions.focusTask(str);
        return openTask(browserTaskPresentationKnownTask, auraNavigator, zA1b);
    }

    public final boolean showFocusedTask(String str, AuraNavigator auraNavigator, boolean z) {
        boolean zA1b = AnonymousClass004.A1b(str, auraNavigator);
        BrowserTaskPresentation browserTaskPresentationKnownTask = knownTask(str);
        return browserTaskPresentationKnownTask != null ? openTask(browserTaskPresentationKnownTask, auraNavigator, z) : zA1b;
    }

    public final boolean canOpenTask(String str) {
        C7384Etj.A0Y(str, 0);
        BrowserTaskPresentation browserTaskPresentationKnownTask = knownTask(str);
        if (browserTaskPresentationKnownTask == null || !canOpenTask(browserTaskPresentationKnownTask)) {
            return false;
        }
        return true;
    }
}
