package com.facebook.aura.library.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
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
public final class GoalDetailResponseJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<GoalAssociationJson> associations;
    public final GoalJson goal;
    public final GoalDetailPayloadJson result;
    public final List<GoalUpdateJson> updates;

    public final class Companion {
        public final C9hr<GoalDetailResponseJson> serializer() {
            return GoalDetailResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1U(num, null, null, AbstractC5321DgF.A02(num, GoalDetailResponseJson$Companion$$childSerializers$1.INSTANCE), GoalDetailResponseJson$Companion$$childSerializers$2.INSTANCE);
    }

    public GoalDetailResponseJson(GoalDetailPayloadJson goalDetailPayloadJson, GoalJson goalJson, List<GoalUpdateJson> list, List<GoalAssociationJson> list2) {
        AnonymousClass002.A1B(list, 2, list2);
        this.result = goalDetailPayloadJson;
        this.goal = goalJson;
        this.updates = list;
        this.associations = list2;
    }

    public final GoalDetailResponseJson copy(GoalDetailPayloadJson goalDetailPayloadJson, GoalJson goalJson, List<GoalUpdateJson> list, List<GoalAssociationJson> list2) {
        AnonymousClass002.A1B(list, 2, list2);
        return new GoalDetailResponseJson(goalDetailPayloadJson, goalJson, list, list2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalDetailResponseJson) {
                GoalDetailResponseJson goalDetailResponseJson = (GoalDetailResponseJson) obj;
                if (!C7384Etj.areEqual(this.result, goalDetailResponseJson.result) || !C7384Etj.areEqual(this.goal, goalDetailResponseJson.goal) || !C7384Etj.areEqual(this.updates, goalDetailResponseJson.updates) || !C7384Etj.areEqual(this.associations, goalDetailResponseJson.associations)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GoalDetailResponseJson copy$default(GoalDetailResponseJson goalDetailResponseJson, GoalDetailPayloadJson goalDetailPayloadJson, GoalJson goalJson, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            goalDetailPayloadJson = goalDetailResponseJson.result;
        }
        if ((i & 2) != 0) {
            goalJson = goalDetailResponseJson.goal;
        }
        if ((i & 4) != 0) {
            list = goalDetailResponseJson.updates;
        }
        if ((i & 8) != 0) {
            list2 = goalDetailResponseJson.associations;
        }
        AnonymousClass002.A1B(list, 2, list2);
        return new GoalDetailResponseJson(goalDetailPayloadJson, goalJson, list, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(GoalDetailResponseJson goalDetailResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || goalDetailResponseJson.result != null) {
            c9j5.AAP(goalDetailResponseJson.result, GoalDetailPayloadJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || goalDetailResponseJson.goal != null) {
            c9j5.AAP(goalDetailResponseJson.goal, GoalJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(goalDetailResponseJson.updates)) {
            c9j5.AAQ(goalDetailResponseJson.updates, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(goalDetailResponseJson.associations)) {
            c9j5.AAQ(goalDetailResponseJson.associations, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
    }

    public final GoalDetailPayloadJson component1() {
        return this.result;
    }

    public final GoalJson component2() {
        return this.goal;
    }

    public final List<GoalUpdateJson> component3() {
        return this.updates;
    }

    public final List<GoalAssociationJson> component4() {
        return this.associations;
    }

    public final List<GoalAssociationJson> getAssociations() {
        return this.associations;
    }

    public final GoalJson getGoal() {
        return this.goal;
    }

    public final GoalDetailPayloadJson getResult() {
        return this.result;
    }

    public final List<GoalUpdateJson> getUpdates() {
        return this.updates;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.associations, AnonymousClass005.A0F(this.updates, ((AnonymousClass006.A0D(this.result) * 31) + C3cH.A02(this.goal)) * 31));
    }

    public final GoalDetail toDomain() {
        GoalDetailPayloadJson goalDetailPayloadJson = this.result;
        if (goalDetailPayloadJson == null) {
            goalDetailPayloadJson = new GoalDetailPayloadJson(this.goal, this.updates, this.associations);
        }
        return goalDetailPayloadJson.toDomain();
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GoalDetailResponseJson(int i, GoalDetailPayloadJson goalDetailPayloadJson, GoalJson goalJson, List list, List list2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.result = null;
        } else {
            this.result = goalDetailPayloadJson;
        }
        if ((i & 2) == 0) {
            this.goal = null;
        } else {
            this.goal = goalJson;
        }
        if ((i & 4) == 0) {
            this.updates = C0881AGi.A00;
        } else {
            this.updates = list;
        }
        if ((i & 8) == 0) {
            this.associations = C0881AGi.A00;
        } else {
            this.associations = list2;
        }
    }

    public /* synthetic */ GoalDetailResponseJson(GoalDetailPayloadJson goalDetailPayloadJson, GoalJson goalJson, List list, List list2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : goalDetailPayloadJson, (i & 2) != 0 ? null : goalJson, C3cI.A12(list, i), (i & 8) != 0 ? C0881AGi.A00 : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GoalDetailResponseJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(null, null, c0881AGi, c0881AGi);
    }
}
