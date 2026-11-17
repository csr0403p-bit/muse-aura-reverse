package com.facebook.aura.conversation.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class SubAgentTaskInfo extends C06G {
    public final String id;
    public final boolean isDone;
    public final String subtitle;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubAgentTaskInfo) {
                SubAgentTaskInfo subAgentTaskInfo = (SubAgentTaskInfo) obj;
                if (!C7384Etj.areEqual(this.id, subAgentTaskInfo.id) || !C7384Etj.areEqual(this.title, subAgentTaskInfo.title) || !C7384Etj.areEqual(this.subtitle, subAgentTaskInfo.subtitle) || this.isDone != subAgentTaskInfo.isDone) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SubAgentTaskInfo copy$default(SubAgentTaskInfo subAgentTaskInfo, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subAgentTaskInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = subAgentTaskInfo.title;
        }
        if ((i & 4) != 0) {
            str3 = subAgentTaskInfo.subtitle;
        }
        if ((i & 8) != 0) {
            z = subAgentTaskInfo.isDone;
        }
        AnonymousClass003.A0u(str, str2);
        return new SubAgentTaskInfo(str, str2, str3, z);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final boolean component4() {
        return this.isDone;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0G(this.subtitle)) * 31, this.isDone);
    }

    public final boolean isDone() {
        return this.isDone;
    }

    public SubAgentTaskInfo(String str, String str2, String str3, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.isDone = z;
    }

    public final SubAgentTaskInfo copy(String str, String str2, String str3, boolean z) {
        AnonymousClass003.A0u(str, str2);
        return new SubAgentTaskInfo(str, str2, str3, z);
    }

    public String toString() {
        return super.toString();
    }
}
