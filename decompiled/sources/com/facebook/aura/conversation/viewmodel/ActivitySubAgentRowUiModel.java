package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ActivitySubAgentRowUiModel extends C06G {
    public static final int $stable = 0;
    public final boolean isDone;
    public final boolean showConnector;
    public final String subtitle;
    public final String title;

    public ActivitySubAgentRowUiModel(String str, String str2, boolean z, boolean z2) {
        C7384Etj.A0Y(str, 0);
        this.title = str;
        this.subtitle = str2;
        this.isDone = z;
        this.showConnector = z2;
    }

    public final ActivitySubAgentRowUiModel copy(String str, String str2, boolean z, boolean z2) {
        C7384Etj.A0Y(str, 0);
        return new ActivitySubAgentRowUiModel(str, str2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivitySubAgentRowUiModel) {
                ActivitySubAgentRowUiModel activitySubAgentRowUiModel = (ActivitySubAgentRowUiModel) obj;
                if (!C7384Etj.areEqual(this.title, activitySubAgentRowUiModel.title) || !C7384Etj.areEqual(this.subtitle, activitySubAgentRowUiModel.subtitle) || this.isDone != activitySubAgentRowUiModel.isDone || this.showConnector != activitySubAgentRowUiModel.showConnector) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivitySubAgentRowUiModel copy$default(ActivitySubAgentRowUiModel activitySubAgentRowUiModel, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activitySubAgentRowUiModel.title;
        }
        if ((i & 2) != 0) {
            str2 = activitySubAgentRowUiModel.subtitle;
        }
        if ((i & 4) != 0) {
            z = activitySubAgentRowUiModel.isDone;
        }
        if ((i & 8) != 0) {
            z2 = activitySubAgentRowUiModel.showConnector;
        }
        C7384Etj.A0Y(str, 0);
        return new ActivitySubAgentRowUiModel(str, str2, z, z2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final boolean component3() {
        return this.isDone;
    }

    public final boolean component4() {
        return this.showConnector;
    }

    public final boolean getShowConnector() {
        return this.showConnector;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01((AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.subtitle)) * 31, this.isDone), this.showConnector);
    }

    public final boolean isDone() {
        return this.isDone;
    }

    public String toString() {
        return super.toString();
    }
}
