package com.facebook.aura.status.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
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
public final class ActivityDetailNoteJson extends C06G {
    public final List<String> highlights;
    public final String summary;
    public final String tag;
    public final String title;
    public final Integer version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, ActivityDetailNoteJson$Companion$$childSerializers$1.INSTANCE), null, null, null};

    public final class Companion {
        public final C9hr<ActivityDetailNoteJson> serializer() {
            return ActivityDetailNoteJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityDetailNoteJson) {
                ActivityDetailNoteJson activityDetailNoteJson = (ActivityDetailNoteJson) obj;
                if (!C7384Etj.areEqual(this.summary, activityDetailNoteJson.summary) || !C7384Etj.areEqual(this.highlights, activityDetailNoteJson.highlights) || !C7384Etj.areEqual(this.version, activityDetailNoteJson.version) || !C7384Etj.areEqual(this.tag, activityDetailNoteJson.tag) || !C7384Etj.areEqual(this.title, activityDetailNoteJson.title)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityDetailNoteJson copy$default(ActivityDetailNoteJson activityDetailNoteJson, String str, List list, Integer num, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityDetailNoteJson.summary;
        }
        if ((i & 2) != 0) {
            list = activityDetailNoteJson.highlights;
        }
        if ((i & 4) != 0) {
            num = activityDetailNoteJson.version;
        }
        if ((i & 8) != 0) {
            str2 = activityDetailNoteJson.tag;
        }
        if ((i & 16) != 0) {
            str3 = activityDetailNoteJson.title;
        }
        return activityDetailNoteJson.copy(str, list, num, str2, str3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(ActivityDetailNoteJson activityDetailNoteJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || activityDetailNoteJson.summary != null) {
            c9j5.AAP(activityDetailNoteJson.summary, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || activityDetailNoteJson.highlights != null) {
            c9j5.AAP(activityDetailNoteJson.highlights, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || activityDetailNoteJson.version != null) {
            c9j5.AAP(activityDetailNoteJson.version, C07729ii.A00, c9iZ, 2);
        }
        if (zAfR || activityDetailNoteJson.tag != null) {
            c9j5.AAP(activityDetailNoteJson.tag, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || activityDetailNoteJson.title != null) {
            c9j5.AAP(activityDetailNoteJson.title, C07779iq.A01, c9iZ, 4);
        }
    }

    public final String component1() {
        return this.summary;
    }

    public final List<String> component2() {
        return this.highlights;
    }

    public final Integer component3() {
        return this.version;
    }

    public final String component4() {
        return this.tag;
    }

    public final String component5() {
        return this.title;
    }

    public final ActivityDetailNoteJson copy(String str, List<String> list, Integer num, String str2, String str3) {
        return new ActivityDetailNoteJson(str, list, num, str2, str3);
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
        return (((((((AnonymousClass006.A0G(this.summary) * 31) + AnonymousClass006.A0D(this.highlights)) * 31) + AnonymousClass006.A0D(this.version)) * 31) + AnonymousClass006.A0G(this.tag)) * 31) + AnonymousClass005.A0H(this.title);
    }

    public final ActivityDetailNote toDomain() {
        return new ActivityDetailNote(this.summary, this.highlights, this.version, this.tag, this.title);
    }

    public ActivityDetailNoteJson(String str, List<String> list, Integer num, String str2, String str3) {
        this.summary = str;
        this.highlights = list;
        this.version = num;
        this.tag = str2;
        this.title = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivityDetailNoteJson(String str, List list, Integer num, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }

    public /* synthetic */ ActivityDetailNoteJson(int i, String str, List list, Integer num, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.summary = null;
        } else {
            this.summary = str;
        }
        if ((i & 2) == 0) {
            this.highlights = null;
        } else {
            this.highlights = list;
        }
        if ((i & 4) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
        if ((i & 8) == 0) {
            this.tag = null;
        } else {
            this.tag = str2;
        }
        if ((i & 16) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
    }

    public ActivityDetailNoteJson() {
        this(null, null, null, null, null);
    }
}
