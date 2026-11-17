package com.facebook.aura.library.repo;

import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC5321DgF;
import X.AnonymousClass003;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class GoalDetailPayloadJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<GoalAssociationJson> associations;
    public final GoalJson goal;
    public final List<GoalUpdateJson> updates;

    public final class Companion {
        public final C9hr<GoalDetailPayloadJson> serializer() {
            return GoalDetailPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1V(num, null, AbstractC5321DgF.A02(num, GoalDetailPayloadJson$Companion$$childSerializers$1.INSTANCE), GoalDetailPayloadJson$Companion$$childSerializers$2.INSTANCE);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalDetailPayloadJson) {
                GoalDetailPayloadJson goalDetailPayloadJson = (GoalDetailPayloadJson) obj;
                if (!C7384Etj.areEqual(this.goal, goalDetailPayloadJson.goal) || !C7384Etj.areEqual(this.updates, goalDetailPayloadJson.updates) || !C7384Etj.areEqual(this.associations, goalDetailPayloadJson.associations)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoalDetailPayloadJson copy$default(GoalDetailPayloadJson goalDetailPayloadJson, GoalJson goalJson, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            goalJson = goalDetailPayloadJson.goal;
        }
        if ((i & 2) != 0) {
            list = goalDetailPayloadJson.updates;
        }
        if ((i & 4) != 0) {
            list2 = goalDetailPayloadJson.associations;
        }
        return goalDetailPayloadJson.copy(goalJson, list, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(GoalDetailPayloadJson goalDetailPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || goalDetailPayloadJson.goal != null) {
            c9j5.AAP(goalDetailPayloadJson.goal, GoalJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(goalDetailPayloadJson.updates)) {
            c9j5.AAQ(goalDetailPayloadJson.updates, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(goalDetailPayloadJson.associations)) {
            c9j5.AAQ(goalDetailPayloadJson.associations, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final GoalJson component1() {
        return this.goal;
    }

    public final List<GoalUpdateJson> component2() {
        return this.updates;
    }

    public final List<GoalAssociationJson> component3() {
        return this.associations;
    }

    public final List<GoalAssociationJson> getAssociations() {
        return this.associations;
    }

    public final GoalJson getGoal() {
        return this.goal;
    }

    public final List<GoalUpdateJson> getUpdates() {
        return this.updates;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.associations, AnonymousClass005.A0F(this.updates, AnonymousClass006.A0D(this.goal) * 31));
    }

    public final GoalDetail toDomain() {
        AHD ahdA07;
        GoalJson goalJson = this.goal;
        if (goalJson == null) {
            return null;
        }
        Goal domain = goalJson.toDomain();
        if (this.updates.isEmpty()) {
            ahdA07 = AHI.A01;
        } else {
            List<GoalUpdateJson> list = this.updates;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<GoalUpdateJson> it = list.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(it.next().toDomain());
            }
            ahdA07 = AGI.A07(arrayListA0i);
        }
        List<GoalAssociationJson> list2 = this.associations;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<GoalAssociationJson> it2 = list2.iterator();
        while (it2.hasNext()) {
            GoalAssociation domain2 = it2.next().toDomain();
            if (domain2 != null) {
                arrayListA0h.add(domain2);
            }
        }
        return new GoalDetail(domain, ahdA07, AGI.A07(arrayListA0h));
    }

    public GoalDetailPayloadJson(GoalJson goalJson, List<GoalUpdateJson> list, List<GoalAssociationJson> list2) {
        AnonymousClass003.A0x(list, list2);
        this.goal = goalJson;
        this.updates = list;
        this.associations = list2;
    }

    public final GoalDetailPayloadJson copy(GoalJson goalJson, List<GoalUpdateJson> list, List<GoalAssociationJson> list2) {
        AnonymousClass003.A0x(list, list2);
        return new GoalDetailPayloadJson(goalJson, list, list2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GoalDetailPayloadJson(int i, GoalJson goalJson, List list, List list2, C2hx c2hx) {
        this.goal = (i & 1) == 0 ? null : goalJson;
        if ((i & 2) == 0) {
            this.updates = C0881AGi.A00;
        } else {
            this.updates = list;
        }
        if ((i & 4) == 0) {
            this.associations = C0881AGi.A00;
        } else {
            this.associations = list2;
        }
    }

    public /* synthetic */ GoalDetailPayloadJson(GoalJson goalJson, List list, List list2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : goalJson, C3cI.A11(list, i), C3cI.A12(list2, i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GoalDetailPayloadJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(null, c0881AGi, c0881AGi);
    }
}
