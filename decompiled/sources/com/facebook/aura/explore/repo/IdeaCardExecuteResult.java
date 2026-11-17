package com.facebook.aura.explore.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class IdeaCardExecuteResult extends C06G {
    public final String executionId;
    public final String ideaCardId;
    public final IdeaCardExecuteStatus status;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaCardExecuteResult) {
                IdeaCardExecuteResult ideaCardExecuteResult = (IdeaCardExecuteResult) obj;
                if (!C7384Etj.areEqual(this.ideaCardId, ideaCardExecuteResult.ideaCardId) || !C7384Etj.areEqual(this.executionId, ideaCardExecuteResult.executionId) || this.status != ideaCardExecuteResult.status) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaCardExecuteResult copy$default(IdeaCardExecuteResult ideaCardExecuteResult, String str, String str2, IdeaCardExecuteStatus ideaCardExecuteStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaCardExecuteResult.ideaCardId;
        }
        if ((i & 2) != 0) {
            str2 = ideaCardExecuteResult.executionId;
        }
        if ((i & 4) != 0) {
            ideaCardExecuteStatus = ideaCardExecuteResult.status;
        }
        return ideaCardExecuteResult.copy(str, str2, ideaCardExecuteStatus);
    }

    public final String component1() {
        return this.ideaCardId;
    }

    public final String component2() {
        return this.executionId;
    }

    public final IdeaCardExecuteStatus component3() {
        return this.status;
    }

    public final String getExecutionId() {
        return this.executionId;
    }

    public final String getIdeaCardId() {
        return this.ideaCardId;
    }

    public final IdeaCardExecuteStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.status, AnonymousClass005.A0I(this.executionId, AnonymousClass001.A0G(this.ideaCardId)));
    }

    public IdeaCardExecuteResult(String str, String str2, IdeaCardExecuteStatus ideaCardExecuteStatus) {
        AnonymousClass005.A0x(str, str2, ideaCardExecuteStatus);
        this.ideaCardId = str;
        this.executionId = str2;
        this.status = ideaCardExecuteStatus;
    }

    public final IdeaCardExecuteResult copy(String str, String str2, IdeaCardExecuteStatus ideaCardExecuteStatus) {
        AnonymousClass005.A0x(str, str2, ideaCardExecuteStatus);
        return new IdeaCardExecuteResult(str, str2, ideaCardExecuteStatus);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaCardExecuteResult(String str, String str2, IdeaCardExecuteStatus ideaCardExecuteStatus, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? IdeaCardExecuteStatus.UNKNOWN : ideaCardExecuteStatus);
    }

    public IdeaCardExecuteResult() {
        this("", "", IdeaCardExecuteStatus.UNKNOWN);
    }
}
