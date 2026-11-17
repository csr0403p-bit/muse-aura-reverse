package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class GoalDetailScreenKey extends C06G implements AuraNavKey {
    public static final Companion Companion = new Companion();
    public final String goalId;
    public final String goalTitle;
    public final String parentGoalTitle;

    public final class Companion {
        public final C9hr<GoalDetailScreenKey> serializer() {
            return GoalDetailScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public GoalDetailScreenKey(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.goalId = str;
        this.goalTitle = str2;
        this.parentGoalTitle = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(GoalDetailScreenKey goalDetailScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(goalDetailScreenKey.goalId, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || goalDetailScreenKey.goalTitle != null) {
            c9j5.AAP(goalDetailScreenKey.goalTitle, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || goalDetailScreenKey.parentGoalTitle != null) {
            c9j5.AAP(goalDetailScreenKey.parentGoalTitle, C07779iq.A01, c9iZ, 2);
        }
    }

    public final GoalDetailScreenKey copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new GoalDetailScreenKey(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalDetailScreenKey) {
                GoalDetailScreenKey goalDetailScreenKey = (GoalDetailScreenKey) obj;
                if (!C7384Etj.areEqual(this.goalId, goalDetailScreenKey.goalId) || !C7384Etj.areEqual(this.goalTitle, goalDetailScreenKey.goalTitle) || !C7384Etj.areEqual(this.parentGoalTitle, goalDetailScreenKey.parentGoalTitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GoalDetailScreenKey copy$default(GoalDetailScreenKey goalDetailScreenKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goalDetailScreenKey.goalId;
        }
        if ((i & 2) != 0) {
            str2 = goalDetailScreenKey.goalTitle;
        }
        if ((i & 4) != 0) {
            str3 = goalDetailScreenKey.parentGoalTitle;
        }
        return goalDetailScreenKey.copy(str, str2, str3);
    }

    public final String component1() {
        return this.goalId;
    }

    public final String component2() {
        return this.goalTitle;
    }

    public final String component3() {
        return this.parentGoalTitle;
    }

    public final String getGoalId() {
        return this.goalId;
    }

    public final String getGoalTitle() {
        return this.goalTitle;
    }

    public final String getParentGoalTitle() {
        return this.parentGoalTitle;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.goalId) + AnonymousClass006.A0G(this.goalTitle)) * 31) + AnonymousClass005.A0H(this.parentGoalTitle);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GoalDetailScreenKey(int i, String str, String str2, String str3, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(GoalDetailScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.goalId = str;
        if ((i & 2) == 0) {
            this.goalTitle = null;
        } else {
            this.goalTitle = str2;
        }
        if ((i & 4) == 0) {
            this.parentGoalTitle = null;
        } else {
            this.parentGoalTitle = str3;
        }
    }

    public /* synthetic */ GoalDetailScreenKey(String str, String str2, String str3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
