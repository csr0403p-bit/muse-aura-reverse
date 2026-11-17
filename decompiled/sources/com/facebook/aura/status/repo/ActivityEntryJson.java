package com.facebook.aura.status.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class ActivityEntryJson extends C06G {
    public static final Companion Companion = new Companion();
    public final JsonObject details;
    public final String hash;
    public final ActivityNoteJson note;
    public final String status;
    public final String subject;
    public final String subtitle;
    public final String task_label;
    public final String timestamp;
    public final String title;
    public final Long ts_ms;
    public final String turn_id;
    public final String type;

    public final class Companion {
        public final C9hr<ActivityEntryJson> serializer() {
            return ActivityEntryJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ ActivityEntryJson copy$default(ActivityEntryJson activityEntryJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, ActivityNoteJson activityNoteJson, String str9, Long l, int i, Object obj) {
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        String str16 = str7;
        JsonObject jsonObject2 = jsonObject;
        String str17 = str8;
        ActivityNoteJson activityNoteJson2 = activityNoteJson;
        String str18 = str9;
        Long l2 = l;
        if ((i & 1) != 0) {
            str10 = activityEntryJson.timestamp;
        }
        if ((i & 2) != 0) {
            str11 = activityEntryJson.type;
        }
        if ((i & 4) != 0) {
            str12 = activityEntryJson.turn_id;
        }
        if ((i & 8) != 0) {
            str13 = activityEntryJson.title;
        }
        if ((i & 16) != 0) {
            str14 = activityEntryJson.subtitle;
        }
        if ((i & 32) != 0) {
            str15 = activityEntryJson.status;
        }
        if ((i & 64) != 0) {
            str16 = activityEntryJson.task_label;
        }
        if ((i & 128) != 0) {
            jsonObject2 = activityEntryJson.details;
        }
        if ((i & 256) != 0) {
            str17 = activityEntryJson.hash;
        }
        if ((i & 512) != 0) {
            activityNoteJson2 = activityEntryJson.note;
        }
        if ((i & 1024) != 0) {
            str18 = activityEntryJson.subject;
        }
        if ((i & 2048) != 0) {
            l2 = activityEntryJson.ts_ms;
        }
        return new ActivityEntryJson(str10, str11, str12, str13, str14, str15, str16, jsonObject2, str17, activityNoteJson2, str18, l2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(ActivityEntryJson activityEntryJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || activityEntryJson.timestamp != null) {
            c9j5.AAP(activityEntryJson.timestamp, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || activityEntryJson.type != null) {
            c9j5.AAP(activityEntryJson.type, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || activityEntryJson.turn_id != null) {
            c9j5.AAP(activityEntryJson.turn_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || activityEntryJson.title != null) {
            c9j5.AAP(activityEntryJson.title, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || activityEntryJson.subtitle != null) {
            c9j5.AAP(activityEntryJson.subtitle, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || activityEntryJson.status != null) {
            c9j5.AAP(activityEntryJson.status, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || activityEntryJson.task_label != null) {
            c9j5.AAP(activityEntryJson.task_label, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || activityEntryJson.details != null) {
            c9j5.AAP(activityEntryJson.details, JsonObjectSerializer.A01, c9iZ, 7);
        }
        if (zAfR || activityEntryJson.hash != null) {
            c9j5.AAP(activityEntryJson.hash, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || activityEntryJson.note != null) {
            c9j5.AAP(activityEntryJson.note, ActivityNoteJson$$serializer.INSTANCE, c9iZ, 9);
        }
        if (zAfR || activityEntryJson.subject != null) {
            c9j5.AAP(activityEntryJson.subject, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || activityEntryJson.ts_ms != null) {
            c9j5.AAP(activityEntryJson.ts_ms, C9j1.A00, c9iZ, 11);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityEntryJson) {
                ActivityEntryJson activityEntryJson = (ActivityEntryJson) obj;
                if (!C7384Etj.areEqual(this.timestamp, activityEntryJson.timestamp) || !C7384Etj.areEqual(this.type, activityEntryJson.type) || !C7384Etj.areEqual(this.turn_id, activityEntryJson.turn_id) || !C7384Etj.areEqual(this.title, activityEntryJson.title) || !C7384Etj.areEqual(this.subtitle, activityEntryJson.subtitle) || !C7384Etj.areEqual(this.status, activityEntryJson.status) || !C7384Etj.areEqual(this.task_label, activityEntryJson.task_label) || !C7384Etj.areEqual(this.details, activityEntryJson.details) || !C7384Etj.areEqual(this.hash, activityEntryJson.hash) || !C7384Etj.areEqual(this.note, activityEntryJson.note) || !C7384Etj.areEqual(this.subject, activityEntryJson.subject) || !C7384Etj.areEqual(this.ts_ms, activityEntryJson.ts_ms)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.timestamp;
    }

    public final ActivityNoteJson component10() {
        return this.note;
    }

    public final String component11() {
        return this.subject;
    }

    public final Long component12() {
        return this.ts_ms;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.turn_id;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.subtitle;
    }

    public final String component6() {
        return this.status;
    }

    public final String component7() {
        return this.task_label;
    }

    public final JsonObject component8() {
        return this.details;
    }

    public final String component9() {
        return this.hash;
    }

    public final ActivityEntryJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, ActivityNoteJson activityNoteJson, String str9, Long l) {
        return new ActivityEntryJson(str, str2, str3, str4, str5, str6, str7, jsonObject, str8, activityNoteJson, str9, l);
    }

    public final JsonObject getDetails() {
        return this.details;
    }

    public final String getHash() {
        return this.hash;
    }

    public final ActivityNoteJson getNote() {
        return this.note;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTask_label() {
        return this.task_label;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getTs_ms() {
        return this.ts_ms;
    }

    public final String getTurn_id() {
        return this.turn_id;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((((((((((((AnonymousClass006.A0G(this.timestamp) * 31) + AnonymousClass006.A0G(this.type)) * 31) + AnonymousClass006.A0G(this.turn_id)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.status)) * 31) + AnonymousClass006.A0G(this.task_label)) * 31) + AnonymousClass006.A0D(this.details)) * 31) + AnonymousClass006.A0G(this.hash)) * 31) + AnonymousClass006.A0D(this.note)) * 31) + AnonymousClass006.A0G(this.subject)) * 31) + C3cH.A02(this.ts_ms);
    }

    public final ActivityEntry toDomain() {
        String str = this.timestamp;
        String str2 = this.type;
        String str3 = this.turn_id;
        String str4 = this.title;
        String str5 = this.subtitle;
        String str6 = this.status;
        String str7 = this.task_label;
        JsonObject jsonObject = this.details;
        ActivityDetails activityDetails = jsonObject != null ? ActivityDataSourceJsonKt.toActivityDetails(jsonObject) : null;
        String str8 = this.hash;
        ActivityNoteJson activityNoteJson = this.note;
        return new ActivityEntry(str, str2, str3, str4, str5, str6, str7, activityDetails, str8, activityNoteJson != null ? activityNoteJson.toDomain() : null, this.subject, this.ts_ms);
    }

    public ActivityEntryJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, ActivityNoteJson activityNoteJson, String str9, Long l) {
        this.timestamp = str;
        this.type = str2;
        this.turn_id = str3;
        this.title = str4;
        this.subtitle = str5;
        this.status = str6;
        this.task_label = str7;
        this.details = jsonObject;
        this.hash = str8;
        this.note = activityNoteJson;
        this.subject = str9;
        this.ts_ms = l;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivityEntryJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, ActivityNoteJson activityNoteJson, String str9, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : jsonObject, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : activityNoteJson, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : l);
    }

    public /* synthetic */ ActivityEntryJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, ActivityNoteJson activityNoteJson, String str9, Long l, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = str;
        }
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        if ((i & 4) == 0) {
            this.turn_id = null;
        } else {
            this.turn_id = str3;
        }
        if ((i & 8) == 0) {
            this.title = null;
        } else {
            this.title = str4;
        }
        if ((i & 16) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str5;
        }
        if ((i & 32) == 0) {
            this.status = null;
        } else {
            this.status = str6;
        }
        if ((i & 64) == 0) {
            this.task_label = null;
        } else {
            this.task_label = str7;
        }
        if ((i & 128) == 0) {
            this.details = null;
        } else {
            this.details = jsonObject;
        }
        if ((i & 256) == 0) {
            this.hash = null;
        } else {
            this.hash = str8;
        }
        if ((i & 512) == 0) {
            this.note = null;
        } else {
            this.note = activityNoteJson;
        }
        if ((i & 1024) == 0) {
            this.subject = null;
        } else {
            this.subject = str9;
        }
        if ((i & 2048) == 0) {
            this.ts_ms = null;
        } else {
            this.ts_ms = l;
        }
    }

    public ActivityEntryJson() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
