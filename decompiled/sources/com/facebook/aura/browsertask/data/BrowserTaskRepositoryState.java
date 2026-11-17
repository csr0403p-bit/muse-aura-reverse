package com.facebook.aura.browsertask.data;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import com.facebook.aura.model.BrowserTaskPresentation;
import java.util.List;

/* loaded from: classes2.dex */
public final class BrowserTaskRepositoryState {
    public static final int $stable = BrowserTaskPresentation.$stable;
    public final List<BrowserTaskPresentation> activeTasks;
    public final String presentedTaskId;
    public final BrowserTaskPresentation terminalTask;

    public BrowserTaskRepositoryState(List<BrowserTaskPresentation> list, String str, BrowserTaskPresentation browserTaskPresentation) {
        C7384Etj.A0Y(list, 0);
        this.activeTasks = list;
        this.presentedTaskId = str;
        this.terminalTask = browserTaskPresentation;
    }

    public final BrowserTaskRepositoryState copy(List<BrowserTaskPresentation> list, String str, BrowserTaskPresentation browserTaskPresentation) {
        C7384Etj.A0Y(list, 0);
        return new BrowserTaskRepositoryState(list, str, browserTaskPresentation);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserTaskRepositoryState) {
                BrowserTaskRepositoryState browserTaskRepositoryState = (BrowserTaskRepositoryState) obj;
                if (!C7384Etj.areEqual(this.activeTasks, browserTaskRepositoryState.activeTasks) || !C7384Etj.areEqual(this.presentedTaskId, browserTaskRepositoryState.presentedTaskId) || !C7384Etj.areEqual(this.terminalTask, browserTaskRepositoryState.terminalTask)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BrowserTaskRepositoryState copy$default(BrowserTaskRepositoryState browserTaskRepositoryState, List list, String str, BrowserTaskPresentation browserTaskPresentation, int i, Object obj) {
        if ((i & 1) != 0) {
            list = browserTaskRepositoryState.activeTasks;
        }
        if ((i & 2) != 0) {
            str = browserTaskRepositoryState.presentedTaskId;
        }
        if ((i & 4) != 0) {
            browserTaskPresentation = browserTaskRepositoryState.terminalTask;
        }
        return browserTaskRepositoryState.copy(list, str, browserTaskPresentation);
    }

    public final List<BrowserTaskPresentation> component1() {
        return this.activeTasks;
    }

    public final String component2() {
        return this.presentedTaskId;
    }

    public final BrowserTaskPresentation component3() {
        return this.terminalTask;
    }

    public final List<BrowserTaskPresentation> getActiveTasks() {
        return this.activeTasks;
    }

    public final String getPresentedTaskId() {
        return this.presentedTaskId;
    }

    public final BrowserTaskPresentation getTerminalTask() {
        return this.terminalTask;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0E(this.activeTasks) + AnonymousClass006.A0G(this.presentedTaskId)) * 31) + C3cH.A02(this.terminalTask);
    }

    public String toString() {
        List<BrowserTaskPresentation> list = this.activeTasks;
        String str = this.presentedTaskId;
        BrowserTaskPresentation browserTaskPresentation = this.terminalTask;
        StringBuilder sbA0f = C3cG.A0f(list, "BrowserTaskRepositoryState(activeTasks=");
        sbA0f.append(", presentedTaskId=");
        sbA0f.append(str);
        return C3cJ.A0L(browserTaskPresentation, ", terminalTask=", sbA0f);
    }
}
