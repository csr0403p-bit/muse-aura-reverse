package com.facebook.aura.library.repo;

import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class GoalsClearFixedPositionsPayloadJson extends C06G {
    public final List<String> updated_goal_ids;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, GoalsClearFixedPositionsPayloadJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<GoalsClearFixedPositionsPayloadJson> serializer() {
            return GoalsClearFixedPositionsPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final GoalsClearFixedPositionsPayloadJson copy(List<String> list) {
        C7384Etj.A0Y(list, 0);
        return new GoalsClearFixedPositionsPayloadJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof GoalsClearFixedPositionsPayloadJson) && C7384Etj.areEqual(this.updated_goal_ids, ((GoalsClearFixedPositionsPayloadJson) obj).updated_goal_ids));
    }

    public static /* synthetic */ GoalsClearFixedPositionsPayloadJson copy$default(GoalsClearFixedPositionsPayloadJson goalsClearFixedPositionsPayloadJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = goalsClearFixedPositionsPayloadJson.updated_goal_ids;
        }
        C7384Etj.A0Y(list, 0);
        return new GoalsClearFixedPositionsPayloadJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(GoalsClearFixedPositionsPayloadJson goalsClearFixedPositionsPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(goalsClearFixedPositionsPayloadJson.updated_goal_ids)) {
            c9j5.AAQ(goalsClearFixedPositionsPayloadJson.updated_goal_ids, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<String> component1() {
        return this.updated_goal_ids;
    }

    public final List<String> getUpdated_goal_ids() {
        return this.updated_goal_ids;
    }

    public int hashCode() {
        return this.updated_goal_ids.hashCode();
    }

    public /* synthetic */ GoalsClearFixedPositionsPayloadJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.updated_goal_ids = C0881AGi.A00;
        } else {
            this.updated_goal_ids = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public GoalsClearFixedPositionsPayloadJson(List<String> list) {
        C7384Etj.A0Y(list, 0);
        this.updated_goal_ids = list;
    }

    public /* synthetic */ GoalsClearFixedPositionsPayloadJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public GoalsClearFixedPositionsPayloadJson() {
        this(C0881AGi.A00);
    }
}
