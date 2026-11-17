package com.facebook.aura.survey;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SurveyLinkJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final int length;
    public final int offset;
    public final String url;

    public final class Companion {
        public final C9hr<SurveyLinkJson> serializer() {
            return SurveyLinkJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SurveyLinkJson(int i, int i2, String str) {
        C7384Etj.A0Y(str, 2);
        this.offset = i;
        this.length = i2;
        this.url = str;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_survey_survey(SurveyLinkJson surveyLinkJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || surveyLinkJson.offset != 0) {
            c9j5.AAK(c9iZ, 0, surveyLinkJson.offset);
        }
        if (zAfR || surveyLinkJson.length != 0) {
            c9j5.AAK(c9iZ, 1, surveyLinkJson.length);
        }
        if (zAfR || !C3cH.A1Q(surveyLinkJson.url)) {
            c9j5.AAV(surveyLinkJson.url, c9iZ, 2);
        }
    }

    public final SurveyLinkJson copy(int i, int i2, String str) {
        C7384Etj.A0Y(str, 2);
        return new SurveyLinkJson(i, i2, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SurveyLinkJson) {
                SurveyLinkJson surveyLinkJson = (SurveyLinkJson) obj;
                if (this.offset != surveyLinkJson.offset || this.length != surveyLinkJson.length || !C7384Etj.areEqual(this.url, surveyLinkJson.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SurveyLinkJson copy$default(SurveyLinkJson surveyLinkJson, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = surveyLinkJson.offset;
        }
        if ((i3 & 2) != 0) {
            i2 = surveyLinkJson.length;
        }
        if ((i3 & 4) != 0) {
            str = surveyLinkJson.url;
        }
        return surveyLinkJson.copy(i, i2, str);
    }

    public final int component1() {
        return this.offset;
    }

    public final int component2() {
        return this.length;
    }

    public final String component3() {
        return this.url;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.url, ((this.offset * 31) + this.length) * 31);
    }

    public final HatchSurveyLink toDomain() {
        return new HatchSurveyLink(this.offset, this.length, this.url);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SurveyLinkJson(int i, int i2, int i3, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.offset = 0;
        } else {
            this.offset = i2;
        }
        if ((i & 2) == 0) {
            this.length = 0;
        } else {
            this.length = i3;
        }
        if ((i & 4) == 0) {
            this.url = "";
        } else {
            this.url = str;
        }
    }

    public /* synthetic */ SurveyLinkJson(int i, int i2, String str, int i3, C06H c06h) {
        this(C3cI.A00(i3, i), C3cG.A01(i3, i2), (i3 & 4) != 0 ? "" : str);
    }

    public SurveyLinkJson() {
        this(0, 0, "");
    }
}
