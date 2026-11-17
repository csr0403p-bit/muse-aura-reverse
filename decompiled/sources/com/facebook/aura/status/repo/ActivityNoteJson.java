package com.facebook.aura.status.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
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
public final class ActivityNoteJson extends C06G {
    public final List<String> highlights;
    public final String summary;
    public final String tag;
    public final String title;
    public final Integer version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, ActivityNoteJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null};

    public final class Companion {
        public final C9hr<ActivityNoteJson> serializer() {
            return ActivityNoteJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityNoteJson) {
                ActivityNoteJson activityNoteJson = (ActivityNoteJson) obj;
                if (!C7384Etj.areEqual(this.highlights, activityNoteJson.highlights) || !C7384Etj.areEqual(this.summary, activityNoteJson.summary) || !C7384Etj.areEqual(this.tag, activityNoteJson.tag) || !C7384Etj.areEqual(this.title, activityNoteJson.title) || !C7384Etj.areEqual(this.version, activityNoteJson.version)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityNoteJson copy$default(ActivityNoteJson activityNoteJson, List list, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = activityNoteJson.highlights;
        }
        if ((i & 2) != 0) {
            str = activityNoteJson.summary;
        }
        if ((i & 4) != 0) {
            str2 = activityNoteJson.tag;
        }
        if ((i & 8) != 0) {
            str3 = activityNoteJson.title;
        }
        if ((i & 16) != 0) {
            num = activityNoteJson.version;
        }
        return activityNoteJson.copy(list, str, str2, str3, num);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(ActivityNoteJson activityNoteJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || activityNoteJson.highlights != null) {
            c9j5.AAP(activityNoteJson.highlights, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || activityNoteJson.summary != null) {
            c9j5.AAP(activityNoteJson.summary, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || activityNoteJson.tag != null) {
            c9j5.AAP(activityNoteJson.tag, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || activityNoteJson.title != null) {
            c9j5.AAP(activityNoteJson.title, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || activityNoteJson.version != null) {
            c9j5.AAP(activityNoteJson.version, C07729ii.A00, c9iZ, 4);
        }
    }

    public final List<String> component1() {
        return this.highlights;
    }

    public final String component2() {
        return this.summary;
    }

    public final String component3() {
        return this.tag;
    }

    public final String component4() {
        return this.title;
    }

    public final Integer component5() {
        return this.version;
    }

    public final ActivityNoteJson copy(List<String> list, String str, String str2, String str3, Integer num) {
        return new ActivityNoteJson(list, str, str2, str3, num);
    }

    public final List<String> getHighlights() {
        return this.highlights;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0D(this.highlights) * 31) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass006.A0G(this.tag)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + C3cH.A02(this.version);
    }

    public final ActivityNote toDomain() {
        return new ActivityNote(this.highlights, this.summary, this.tag, this.title, this.version);
    }

    public ActivityNoteJson(List<String> list, String str, String str2, String str3, Integer num) {
        this.highlights = list;
        this.summary = str;
        this.tag = str2;
        this.title = str3;
        this.version = num;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivityNoteJson(List list, String str, String str2, String str3, Integer num, int i, C06H c06h) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num);
    }

    public /* synthetic */ ActivityNoteJson(int i, List list, String str, String str2, String str3, Integer num, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.highlights = null;
        } else {
            this.highlights = list;
        }
        if ((i & 2) == 0) {
            this.summary = null;
        } else {
            this.summary = str;
        }
        if ((i & 4) == 0) {
            this.tag = null;
        } else {
            this.tag = str2;
        }
        if ((i & 8) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 16) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
    }

    public ActivityNoteJson() {
        this(null, null, null, null, null);
    }
}
