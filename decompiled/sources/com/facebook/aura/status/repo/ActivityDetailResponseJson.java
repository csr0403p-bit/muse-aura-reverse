package com.facebook.aura.status.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;

@Serializable
/* loaded from: classes2.dex */
public final class ActivityDetailResponseJson extends C06G {
    public final String body;
    public final List<JsonObject> files;
    public final String hash;
    public final ActivityDetailNoteJson note;
    public final String subject;
    public final Long ts_ms;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, ActivityDetailResponseJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<ActivityDetailResponseJson> serializer() {
            return ActivityDetailResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ActivityDetailResponseJson() {
        this("", null, null, null, null, null);
    }

    public final ActivityDetailResponseJson copy(String str, Long l, String str2, String str3, ActivityDetailNoteJson activityDetailNoteJson, List<JsonObject> list) {
        C7384Etj.A0Y(str, 0);
        return new ActivityDetailResponseJson(str, l, str2, str3, activityDetailNoteJson, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityDetailResponseJson) {
                ActivityDetailResponseJson activityDetailResponseJson = (ActivityDetailResponseJson) obj;
                if (!C7384Etj.areEqual(this.hash, activityDetailResponseJson.hash) || !C7384Etj.areEqual(this.ts_ms, activityDetailResponseJson.ts_ms) || !C7384Etj.areEqual(this.subject, activityDetailResponseJson.subject) || !C7384Etj.areEqual(this.body, activityDetailResponseJson.body) || !C7384Etj.areEqual(this.note, activityDetailResponseJson.note) || !C7384Etj.areEqual(this.files, activityDetailResponseJson.files)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityDetailResponseJson copy$default(ActivityDetailResponseJson activityDetailResponseJson, String str, Long l, String str2, String str3, ActivityDetailNoteJson activityDetailNoteJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityDetailResponseJson.hash;
        }
        if ((i & 2) != 0) {
            l = activityDetailResponseJson.ts_ms;
        }
        if ((i & 4) != 0) {
            str2 = activityDetailResponseJson.subject;
        }
        if ((i & 8) != 0) {
            str3 = activityDetailResponseJson.body;
        }
        if ((i & 16) != 0) {
            activityDetailNoteJson = activityDetailResponseJson.note;
        }
        if ((i & 32) != 0) {
            list = activityDetailResponseJson.files;
        }
        return activityDetailResponseJson.copy(str, l, str2, str3, activityDetailNoteJson, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(ActivityDetailResponseJson activityDetailResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(activityDetailResponseJson.hash)) {
            c9j5.AAV(activityDetailResponseJson.hash, c9iZ, 0);
        }
        if (zAfR || activityDetailResponseJson.ts_ms != null) {
            c9j5.AAP(activityDetailResponseJson.ts_ms, C9j1.A00, c9iZ, 1);
        }
        if (zAfR || activityDetailResponseJson.subject != null) {
            c9j5.AAP(activityDetailResponseJson.subject, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || activityDetailResponseJson.body != null) {
            c9j5.AAP(activityDetailResponseJson.body, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || activityDetailResponseJson.note != null) {
            c9j5.AAP(activityDetailResponseJson.note, ActivityDetailNoteJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || activityDetailResponseJson.files != null) {
            c9j5.AAP(activityDetailResponseJson.files, C3cH.A15(f0cArr, 5), c9iZ, 5);
        }
    }

    public final String component1() {
        return this.hash;
    }

    public final Long component2() {
        return this.ts_ms;
    }

    public final String component3() {
        return this.subject;
    }

    public final String component4() {
        return this.body;
    }

    public final ActivityDetailNoteJson component5() {
        return this.note;
    }

    public final List<JsonObject> component6() {
        return this.files;
    }

    public final String getBody() {
        return this.body;
    }

    public final List<JsonObject> getFiles() {
        return this.files;
    }

    public final String getHash() {
        return this.hash;
    }

    public final ActivityDetailNoteJson getNote() {
        return this.note;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final Long getTs_ms() {
        return this.ts_ms;
    }

    public int hashCode() {
        return ((((((((AnonymousClass001.A0G(this.hash) + AnonymousClass006.A0D(this.ts_ms)) * 31) + AnonymousClass006.A0G(this.subject)) * 31) + AnonymousClass006.A0G(this.body)) * 31) + AnonymousClass006.A0D(this.note)) * 31) + C3cH.A02(this.files);
    }

    public final ActivityDetailResponse toDomain() {
        String str = this.hash;
        Long l = this.ts_ms;
        String str2 = this.subject;
        String str3 = this.body;
        ActivityDetailNoteJson activityDetailNoteJson = this.note;
        ArrayList arrayListA0i = null;
        ActivityDetailNote domain = activityDetailNoteJson != null ? activityDetailNoteJson.toDomain() : null;
        List<JsonObject> list = this.files;
        if (list != null) {
            arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<JsonObject> it = list.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(ActivityDataSourceJsonKt.toActivityFile(it.next()));
            }
        }
        return new ActivityDetailResponse(str, l, str2, str3, domain, arrayListA0i);
    }

    public String toString() {
        return super.toString();
    }

    public ActivityDetailResponseJson(String str, Long l, String str2, String str3, ActivityDetailNoteJson activityDetailNoteJson, List<JsonObject> list) {
        C7384Etj.A0Y(str, 0);
        this.hash = str;
        this.ts_ms = l;
        this.subject = str2;
        this.body = str3;
        this.note = activityDetailNoteJson;
        this.files = list;
    }

    public /* synthetic */ ActivityDetailResponseJson(String str, Long l, String str2, String str3, ActivityDetailNoteJson activityDetailNoteJson, List list, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : activityDetailNoteJson, (i & 32) != 0 ? null : list);
    }

    public /* synthetic */ ActivityDetailResponseJson(int i, String str, Long l, String str2, String str3, ActivityDetailNoteJson activityDetailNoteJson, List list, C2hx c2hx) {
        this.hash = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.ts_ms = null;
        } else {
            this.ts_ms = l;
        }
        if ((i & 4) == 0) {
            this.subject = null;
        } else {
            this.subject = str2;
        }
        if ((i & 8) == 0) {
            this.body = null;
        } else {
            this.body = str3;
        }
        if ((i & 16) == 0) {
            this.note = null;
        } else {
            this.note = activityDetailNoteJson;
        }
        if ((i & 32) == 0) {
            this.files = null;
        } else {
            this.files = list;
        }
    }
}
