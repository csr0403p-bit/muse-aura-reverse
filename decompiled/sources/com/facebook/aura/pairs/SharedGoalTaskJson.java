package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SharedGoalTaskJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String assigned_to;
    public final Boolean completed;
    public final String task_id;
    public final String title;

    public final class Companion {
        public final C9hr<SharedGoalTaskJson> serializer() {
            return SharedGoalTaskJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(SharedGoalTaskJson sharedGoalTaskJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(sharedGoalTaskJson.task_id)) {
            c9j5.AAV(sharedGoalTaskJson.task_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(sharedGoalTaskJson.title)) {
            c9j5.AAV(sharedGoalTaskJson.title, c9iZ, 1);
        }
        if (zAfR || sharedGoalTaskJson.assigned_to != null) {
            c9j5.AAP(sharedGoalTaskJson.assigned_to, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || sharedGoalTaskJson.completed != null) {
            c9j5.AAP(sharedGoalTaskJson.completed, C07839ix.A00, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SharedGoalTaskJson) {
                SharedGoalTaskJson sharedGoalTaskJson = (SharedGoalTaskJson) obj;
                if (!C7384Etj.areEqual(this.task_id, sharedGoalTaskJson.task_id) || !C7384Etj.areEqual(this.title, sharedGoalTaskJson.title) || !C7384Etj.areEqual(this.assigned_to, sharedGoalTaskJson.assigned_to) || !C7384Etj.areEqual(this.completed, sharedGoalTaskJson.completed)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SharedGoalTaskJson copy$default(SharedGoalTaskJson sharedGoalTaskJson, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedGoalTaskJson.task_id;
        }
        if ((i & 2) != 0) {
            str2 = sharedGoalTaskJson.title;
        }
        if ((i & 4) != 0) {
            str3 = sharedGoalTaskJson.assigned_to;
        }
        if ((i & 8) != 0) {
            bool = sharedGoalTaskJson.completed;
        }
        AnonymousClass003.A0u(str, str2);
        return new SharedGoalTaskJson(str, str2, str3, bool);
    }

    public final String component1() {
        return this.task_id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.assigned_to;
    }

    public final Boolean component4() {
        return this.completed;
    }

    public final String getAssigned_to() {
        return this.assigned_to;
    }

    public final Boolean getCompleted() {
        return this.completed;
    }

    public final String getTask_id() {
        return this.task_id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.task_id)) + AnonymousClass006.A0G(this.assigned_to)) * 31) + C3cH.A02(this.completed);
    }

    public /* synthetic */ SharedGoalTaskJson(int i, String str, String str2, String str3, Boolean bool, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.task_id = "";
        } else {
            this.task_id = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.assigned_to = null;
        } else {
            this.assigned_to = str3;
        }
        if ((i & 8) == 0) {
            this.completed = null;
        } else {
            this.completed = bool;
        }
    }

    public final SharedGoalTaskJson copy(String str, String str2, String str3, Boolean bool) {
        AnonymousClass003.A0u(str, str2);
        return new SharedGoalTaskJson(str, str2, str3, bool);
    }

    public String toString() {
        return super.toString();
    }

    public SharedGoalTaskJson(String str, String str2, String str3, Boolean bool) {
        AnonymousClass003.A0u(str, str2);
        this.task_id = str;
        this.title = str2;
        this.assigned_to = str3;
        this.completed = bool;
    }

    public /* synthetic */ SharedGoalTaskJson(String str, String str2, String str3, Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool);
    }

    public SharedGoalTaskJson() {
        this("", "", null, null);
    }
}
