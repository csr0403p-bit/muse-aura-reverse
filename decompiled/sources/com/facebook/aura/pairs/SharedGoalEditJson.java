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
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SharedGoalEditJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Boolean completed;
    public final String expected_revision;
    public final String mutation_id;
    public final String reason;
    public final Boolean remove_task;
    public final String status;
    public final String summary;
    public final String task_id;
    public final String task_title;
    public final String title;

    public final class Companion {
        public final C9hr<SharedGoalEditJson> serializer() {
            return SharedGoalEditJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ SharedGoalEditJson copy$default(SharedGoalEditJson sharedGoalEditJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, int i, Object obj) {
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        if ((i & 1) != 0) {
            str9 = sharedGoalEditJson.mutation_id;
        }
        if ((i & 2) != 0) {
            str10 = sharedGoalEditJson.expected_revision;
        }
        if ((i & 4) != 0) {
            str11 = sharedGoalEditJson.title;
        }
        if ((i & 8) != 0) {
            str12 = sharedGoalEditJson.summary;
        }
        if ((i & 16) != 0) {
            str13 = sharedGoalEditJson.status;
        }
        if ((i & 32) != 0) {
            str14 = sharedGoalEditJson.reason;
        }
        if ((i & 64) != 0) {
            str15 = sharedGoalEditJson.task_id;
        }
        if ((i & 128) != 0) {
            str16 = sharedGoalEditJson.task_title;
        }
        if ((i & 256) != 0) {
            bool3 = sharedGoalEditJson.completed;
        }
        if ((i & 512) != 0) {
            bool4 = sharedGoalEditJson.remove_task;
        }
        AnonymousClass003.A0u(str9, str10);
        return new SharedGoalEditJson(str9, str10, str11, str12, str13, str14, str15, str16, bool3, bool4);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(SharedGoalEditJson sharedGoalEditJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(sharedGoalEditJson.mutation_id, c9iZ, 0);
        c9j5.AAV(sharedGoalEditJson.expected_revision, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || sharedGoalEditJson.title != null) {
            c9j5.AAP(sharedGoalEditJson.title, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || sharedGoalEditJson.summary != null) {
            c9j5.AAP(sharedGoalEditJson.summary, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || sharedGoalEditJson.status != null) {
            c9j5.AAP(sharedGoalEditJson.status, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || sharedGoalEditJson.reason != null) {
            c9j5.AAP(sharedGoalEditJson.reason, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || sharedGoalEditJson.task_id != null) {
            c9j5.AAP(sharedGoalEditJson.task_id, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || sharedGoalEditJson.task_title != null) {
            c9j5.AAP(sharedGoalEditJson.task_title, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || sharedGoalEditJson.completed != null) {
            c9j5.AAP(sharedGoalEditJson.completed, C07839ix.A00, c9iZ, 8);
        }
        if (zAfR || sharedGoalEditJson.remove_task != null) {
            c9j5.AAP(sharedGoalEditJson.remove_task, C07839ix.A00, c9iZ, 9);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SharedGoalEditJson) {
                SharedGoalEditJson sharedGoalEditJson = (SharedGoalEditJson) obj;
                if (!C7384Etj.areEqual(this.mutation_id, sharedGoalEditJson.mutation_id) || !C7384Etj.areEqual(this.expected_revision, sharedGoalEditJson.expected_revision) || !C7384Etj.areEqual(this.title, sharedGoalEditJson.title) || !C7384Etj.areEqual(this.summary, sharedGoalEditJson.summary) || !C7384Etj.areEqual(this.status, sharedGoalEditJson.status) || !C7384Etj.areEqual(this.reason, sharedGoalEditJson.reason) || !C7384Etj.areEqual(this.task_id, sharedGoalEditJson.task_id) || !C7384Etj.areEqual(this.task_title, sharedGoalEditJson.task_title) || !C7384Etj.areEqual(this.completed, sharedGoalEditJson.completed) || !C7384Etj.areEqual(this.remove_task, sharedGoalEditJson.remove_task)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.mutation_id;
    }

    public final Boolean component10() {
        return this.remove_task;
    }

    public final String component2() {
        return this.expected_revision;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.summary;
    }

    public final String component5() {
        return this.status;
    }

    public final String component6() {
        return this.reason;
    }

    public final String component7() {
        return this.task_id;
    }

    public final String component8() {
        return this.task_title;
    }

    public final Boolean component9() {
        return this.completed;
    }

    public final Boolean getCompleted() {
        return this.completed;
    }

    public final String getExpected_revision() {
        return this.expected_revision;
    }

    public final String getMutation_id() {
        return this.mutation_id;
    }

    public final String getReason() {
        return this.reason;
    }

    public final Boolean getRemove_task() {
        return this.remove_task;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTask_id() {
        return this.task_id;
    }

    public final String getTask_title() {
        return this.task_title;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((((((((((((AnonymousClass005.A0I(this.expected_revision, AnonymousClass001.A0G(this.mutation_id)) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass006.A0G(this.status)) * 31) + AnonymousClass006.A0G(this.reason)) * 31) + AnonymousClass006.A0G(this.task_id)) * 31) + AnonymousClass006.A0G(this.task_title)) * 31) + AnonymousClass006.A0D(this.completed)) * 31) + C3cH.A02(this.remove_task);
    }

    public SharedGoalEditJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2) {
        AnonymousClass003.A0u(str, str2);
        this.mutation_id = str;
        this.expected_revision = str2;
        this.title = str3;
        this.summary = str4;
        this.status = str5;
        this.reason = str6;
        this.task_id = str7;
        this.task_title = str8;
        this.completed = bool;
        this.remove_task = bool2;
    }

    public final SharedGoalEditJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2) {
        AnonymousClass003.A0u(str, str2);
        return new SharedGoalEditJson(str, str2, str3, str4, str5, str6, str7, str8, bool, bool2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SharedGoalEditJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2);
    }

    public /* synthetic */ SharedGoalEditJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(SharedGoalEditJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.mutation_id = str;
        this.expected_revision = str2;
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.summary = null;
        } else {
            this.summary = str4;
        }
        if ((i & 16) == 0) {
            this.status = null;
        } else {
            this.status = str5;
        }
        if ((i & 32) == 0) {
            this.reason = null;
        } else {
            this.reason = str6;
        }
        if ((i & 64) == 0) {
            this.task_id = null;
        } else {
            this.task_id = str7;
        }
        if ((i & 128) == 0) {
            this.task_title = null;
        } else {
            this.task_title = str8;
        }
        if ((i & 256) == 0) {
            this.completed = null;
        } else {
            this.completed = bool;
        }
        if ((i & 512) == 0) {
            this.remove_task = null;
        } else {
            this.remove_task = bool2;
        }
    }
}
