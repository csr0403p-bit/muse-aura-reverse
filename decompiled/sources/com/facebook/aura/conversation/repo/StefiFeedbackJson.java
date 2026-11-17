package com.facebook.aura.conversation.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class StefiFeedbackJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String comment;
    public final String message_id;
    public final String platform;
    public final int sentiment;
    public final String source;
    public final String tags;
    public final String vm_id;

    public final class Companion {
        public final C9hr<StefiFeedbackJson> serializer() {
            return StefiFeedbackJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo(StefiFeedbackJson stefiFeedbackJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(stefiFeedbackJson.message_id, c9iZ, 0);
        c9j5.AAK(c9iZ, 1, stefiFeedbackJson.sentiment);
        c9j5.AAV(stefiFeedbackJson.source, c9iZ, 2);
        c9j5.AAV(stefiFeedbackJson.platform, c9iZ, 3);
        boolean zAfR = c9j5.AfR();
        if (zAfR || stefiFeedbackJson.vm_id != null) {
            c9j5.AAP(stefiFeedbackJson.vm_id, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || stefiFeedbackJson.tags != null) {
            c9j5.AAP(stefiFeedbackJson.tags, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || stefiFeedbackJson.comment != null) {
            c9j5.AAP(stefiFeedbackJson.comment, C07779iq.A01, c9iZ, 6);
        }
    }

    public final StefiFeedbackJson copy(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A11(str, str2, str3, 0);
        return new StefiFeedbackJson(str, i, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StefiFeedbackJson) {
                StefiFeedbackJson stefiFeedbackJson = (StefiFeedbackJson) obj;
                if (!C7384Etj.areEqual(this.message_id, stefiFeedbackJson.message_id) || this.sentiment != stefiFeedbackJson.sentiment || !C7384Etj.areEqual(this.source, stefiFeedbackJson.source) || !C7384Etj.areEqual(this.platform, stefiFeedbackJson.platform) || !C7384Etj.areEqual(this.vm_id, stefiFeedbackJson.vm_id) || !C7384Etj.areEqual(this.tags, stefiFeedbackJson.tags) || !C7384Etj.areEqual(this.comment, stefiFeedbackJson.comment)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ StefiFeedbackJson(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(StefiFeedbackJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.message_id = str;
        this.sentiment = i2;
        this.source = str2;
        this.platform = str3;
        if ((i & 16) == 0) {
            this.vm_id = null;
        } else {
            this.vm_id = str4;
        }
        if ((i & 32) == 0) {
            this.tags = null;
        } else {
            this.tags = str5;
        }
        if ((i & 64) == 0) {
            this.comment = null;
        } else {
            this.comment = str6;
        }
    }

    public static /* synthetic */ StefiFeedbackJson copy$default(StefiFeedbackJson stefiFeedbackJson, String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = stefiFeedbackJson.message_id;
        }
        if ((i2 & 2) != 0) {
            i = stefiFeedbackJson.sentiment;
        }
        if ((i2 & 4) != 0) {
            str2 = stefiFeedbackJson.source;
        }
        if ((i2 & 8) != 0) {
            str3 = stefiFeedbackJson.platform;
        }
        if ((i2 & 16) != 0) {
            str4 = stefiFeedbackJson.vm_id;
        }
        if ((i2 & 32) != 0) {
            str5 = stefiFeedbackJson.tags;
        }
        if ((i2 & 64) != 0) {
            str6 = stefiFeedbackJson.comment;
        }
        return stefiFeedbackJson.copy(str, i, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.message_id;
    }

    public final int component2() {
        return this.sentiment;
    }

    public final String component3() {
        return this.source;
    }

    public final String component4() {
        return this.platform;
    }

    public final String component5() {
        return this.vm_id;
    }

    public final String component6() {
        return this.tags;
    }

    public final String component7() {
        return this.comment;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final int getSentiment() {
        return this.sentiment;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTags() {
        return this.tags;
    }

    public final String getVm_id() {
        return this.vm_id;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.platform, AnonymousClass005.A0I(this.source, (AnonymousClass001.A0G(this.message_id) + this.sentiment) * 31)) + AnonymousClass006.A0G(this.vm_id)) * 31) + AnonymousClass006.A0G(this.tags)) * 31) + AnonymousClass005.A0H(this.comment);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ StefiFeedbackJson(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, C06H c06h) {
        this(str, i, str2, str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6);
    }

    public StefiFeedbackJson(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A11(str, str2, str3, 0);
        this.message_id = str;
        this.sentiment = i;
        this.source = str2;
        this.platform = str3;
        this.vm_id = str4;
        this.tags = str5;
        this.comment = str6;
    }
}
