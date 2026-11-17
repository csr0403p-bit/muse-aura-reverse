package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ReceivedItemContentJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String file_name;
    public final String goal_id;
    public final String kind;
    public final String mime_type;
    public final String reference;
    public final String slug;
    public final String space_id;
    public final String summary;
    public final String text;

    public final class Companion {
        public final C9hr<ReceivedItemContentJson> serializer() {
            return ReceivedItemContentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ReceivedItemContentJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C7384Etj.A0Y(str, 0);
        this.kind = str;
        this.file_name = str2;
        this.reference = str3;
        this.mime_type = str4;
        this.space_id = str5;
        this.slug = str6;
        this.goal_id = str7;
        this.text = str8;
        this.summary = str9;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ReceivedItemContentJson receivedItemContentJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(receivedItemContentJson.kind)) {
            c9j5.AAV(receivedItemContentJson.kind, c9iZ, 0);
        }
        if (zAfR || receivedItemContentJson.file_name != null) {
            c9j5.AAP(receivedItemContentJson.file_name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || receivedItemContentJson.reference != null) {
            c9j5.AAP(receivedItemContentJson.reference, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || receivedItemContentJson.mime_type != null) {
            c9j5.AAP(receivedItemContentJson.mime_type, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || receivedItemContentJson.space_id != null) {
            c9j5.AAP(receivedItemContentJson.space_id, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || receivedItemContentJson.slug != null) {
            c9j5.AAP(receivedItemContentJson.slug, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || receivedItemContentJson.goal_id != null) {
            c9j5.AAP(receivedItemContentJson.goal_id, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || receivedItemContentJson.text != null) {
            c9j5.AAP(receivedItemContentJson.text, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || receivedItemContentJson.summary != null) {
            c9j5.AAP(receivedItemContentJson.summary, C07779iq.A01, c9iZ, 8);
        }
    }

    public final ReceivedItemContentJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C7384Etj.A0Y(str, 0);
        return new ReceivedItemContentJson(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReceivedItemContentJson) {
                ReceivedItemContentJson receivedItemContentJson = (ReceivedItemContentJson) obj;
                if (!C7384Etj.areEqual(this.kind, receivedItemContentJson.kind) || !C7384Etj.areEqual(this.file_name, receivedItemContentJson.file_name) || !C7384Etj.areEqual(this.reference, receivedItemContentJson.reference) || !C7384Etj.areEqual(this.mime_type, receivedItemContentJson.mime_type) || !C7384Etj.areEqual(this.space_id, receivedItemContentJson.space_id) || !C7384Etj.areEqual(this.slug, receivedItemContentJson.slug) || !C7384Etj.areEqual(this.goal_id, receivedItemContentJson.goal_id) || !C7384Etj.areEqual(this.text, receivedItemContentJson.text) || !C7384Etj.areEqual(this.summary, receivedItemContentJson.summary)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ReceivedItemContentJson copy$default(ReceivedItemContentJson receivedItemContentJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = receivedItemContentJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = receivedItemContentJson.file_name;
        }
        if ((i & 4) != 0) {
            str3 = receivedItemContentJson.reference;
        }
        if ((i & 8) != 0) {
            str4 = receivedItemContentJson.mime_type;
        }
        if ((i & 16) != 0) {
            str5 = receivedItemContentJson.space_id;
        }
        if ((i & 32) != 0) {
            str6 = receivedItemContentJson.slug;
        }
        if ((i & 64) != 0) {
            str7 = receivedItemContentJson.goal_id;
        }
        if ((i & 128) != 0) {
            str8 = receivedItemContentJson.text;
        }
        if ((i & 256) != 0) {
            str9 = receivedItemContentJson.summary;
        }
        return receivedItemContentJson.copy(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.file_name;
    }

    public final String component3() {
        return this.reference;
    }

    public final String component4() {
        return this.mime_type;
    }

    public final String component5() {
        return this.space_id;
    }

    public final String component6() {
        return this.slug;
    }

    public final String component7() {
        return this.goal_id;
    }

    public final String component8() {
        return this.text;
    }

    public final String component9() {
        return this.summary;
    }

    public final String getFile_name() {
        return this.file_name;
    }

    public final String getGoal_id() {
        return this.goal_id;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getMime_type() {
        return this.mime_type;
    }

    public final String getReference() {
        return this.reference;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getSpace_id() {
        return this.space_id;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return ((((((((((((((AnonymousClass001.A0G(this.kind) + AnonymousClass006.A0G(this.file_name)) * 31) + AnonymousClass006.A0G(this.reference)) * 31) + AnonymousClass006.A0G(this.mime_type)) * 31) + AnonymousClass006.A0G(this.space_id)) * 31) + AnonymousClass006.A0G(this.slug)) * 31) + AnonymousClass006.A0G(this.goal_id)) * 31) + AnonymousClass006.A0G(this.text)) * 31) + AnonymousClass005.A0H(this.summary);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ReceivedItemContentJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9);
    }

    public /* synthetic */ ReceivedItemContentJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, C2hx c2hx) {
        this.kind = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.file_name = null;
        } else {
            this.file_name = str2;
        }
        if ((i & 4) == 0) {
            this.reference = null;
        } else {
            this.reference = str3;
        }
        if ((i & 8) == 0) {
            this.mime_type = null;
        } else {
            this.mime_type = str4;
        }
        if ((i & 16) == 0) {
            this.space_id = null;
        } else {
            this.space_id = str5;
        }
        if ((i & 32) == 0) {
            this.slug = null;
        } else {
            this.slug = str6;
        }
        if ((i & 64) == 0) {
            this.goal_id = null;
        } else {
            this.goal_id = str7;
        }
        if ((i & 128) == 0) {
            this.text = null;
        } else {
            this.text = str8;
        }
        if ((i & 256) == 0) {
            this.summary = null;
        } else {
            this.summary = str9;
        }
    }

    public ReceivedItemContentJson() {
        this("", null, null, null, null, null, null, null, null);
    }
}
