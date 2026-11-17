package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class GoalCreationBottomSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String category;

    public final class Companion {
        public final C9hr<GoalCreationBottomSheetKey> serializer() {
            return GoalCreationBottomSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final GoalCreationBottomSheetKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new GoalCreationBottomSheetKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof GoalCreationBottomSheetKey) && C7384Etj.areEqual(this.category, ((GoalCreationBottomSheetKey) obj).category));
    }

    public /* synthetic */ GoalCreationBottomSheetKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(GoalCreationBottomSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.category = str;
    }

    public static /* synthetic */ GoalCreationBottomSheetKey copy$default(GoalCreationBottomSheetKey goalCreationBottomSheetKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goalCreationBottomSheetKey.category;
        }
        C7384Etj.A0Y(str, 0);
        return new GoalCreationBottomSheetKey(str);
    }

    public final String component1() {
        return this.category;
    }

    public final String getCategory() {
        return this.category;
    }

    public int hashCode() {
        return this.category.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public GoalCreationBottomSheetKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.category = str;
    }
}
