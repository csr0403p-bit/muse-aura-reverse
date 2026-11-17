package com.facebook.aura.model;

import X.AnonymousClass001;
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
public final class ReplyElementTargetJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String citationId;
    public final String citation_id;
    public final String elementKey;
    public final String elementKind;
    public final String element_key;
    public final String element_kind;
    public final String entityId;
    public final String entityKind;
    public final String entity_id;
    public final String entity_kind;
    public final String imageUrl;
    public final String image_url;
    public final Integer index;
    public final Boolean isUnavailable;
    public final Boolean is_unavailable;
    public final String messageId;
    public final String message_id;
    public final String replyToText;
    public final String reply_to_text;
    public final String title;
    public final String type;
    public final String widgetId;
    public final String widget_id;

    public final class Companion {
        public final C9hr<ReplyElementTargetJson> serializer() {
            return ReplyElementTargetJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ReplyElementTargetJson replyElementTargetJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(replyElementTargetJson.type, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || replyElementTargetJson.widget_id != null) {
            c9j5.AAP(replyElementTargetJson.widget_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || replyElementTargetJson.widgetId != null) {
            c9j5.AAP(replyElementTargetJson.widgetId, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || replyElementTargetJson.index != null) {
            c9j5.AAP(replyElementTargetJson.index, StrictReplyIndexSerializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || replyElementTargetJson.element_key != null) {
            c9j5.AAP(replyElementTargetJson.element_key, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || replyElementTargetJson.elementKey != null) {
            c9j5.AAP(replyElementTargetJson.elementKey, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || replyElementTargetJson.message_id != null) {
            c9j5.AAP(replyElementTargetJson.message_id, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || replyElementTargetJson.messageId != null) {
            c9j5.AAP(replyElementTargetJson.messageId, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || replyElementTargetJson.citation_id != null) {
            c9j5.AAP(replyElementTargetJson.citation_id, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || replyElementTargetJson.citationId != null) {
            c9j5.AAP(replyElementTargetJson.citationId, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || replyElementTargetJson.entity_kind != null) {
            c9j5.AAP(replyElementTargetJson.entity_kind, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || replyElementTargetJson.entityKind != null) {
            c9j5.AAP(replyElementTargetJson.entityKind, C07779iq.A01, c9iZ, 11);
        }
        if (zAfR || replyElementTargetJson.entity_id != null) {
            c9j5.AAP(replyElementTargetJson.entity_id, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || replyElementTargetJson.entityId != null) {
            c9j5.AAP(replyElementTargetJson.entityId, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || replyElementTargetJson.element_kind != null) {
            c9j5.AAP(replyElementTargetJson.element_kind, C07779iq.A01, c9iZ, 14);
        }
        if (zAfR || replyElementTargetJson.elementKind != null) {
            c9j5.AAP(replyElementTargetJson.elementKind, C07779iq.A01, c9iZ, 15);
        }
        if (zAfR || replyElementTargetJson.reply_to_text != null) {
            c9j5.AAP(replyElementTargetJson.reply_to_text, C07779iq.A01, c9iZ, 16);
        }
        if (zAfR || replyElementTargetJson.replyToText != null) {
            c9j5.AAP(replyElementTargetJson.replyToText, C07779iq.A01, c9iZ, 17);
        }
        if (zAfR || replyElementTargetJson.title != null) {
            c9j5.AAP(replyElementTargetJson.title, C07779iq.A01, c9iZ, 18);
        }
        if (zAfR || replyElementTargetJson.image_url != null) {
            c9j5.AAP(replyElementTargetJson.image_url, C07779iq.A01, c9iZ, 19);
        }
        if (zAfR || replyElementTargetJson.imageUrl != null) {
            c9j5.AAP(replyElementTargetJson.imageUrl, C07779iq.A01, c9iZ, 20);
        }
        if (zAfR || replyElementTargetJson.is_unavailable != null) {
            c9j5.AAP(replyElementTargetJson.is_unavailable, C07839ix.A00, c9iZ, 21);
        }
        if (zAfR || replyElementTargetJson.isUnavailable != null) {
            c9j5.AAP(replyElementTargetJson.isUnavailable, C07839ix.A00, c9iZ, 22);
        }
    }

    public final ReplyElementTargetJson copy(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Boolean bool, Boolean bool2) {
        C7384Etj.A0Y(str, 0);
        return new ReplyElementTargetJson(str, str2, str3, num, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReplyElementTargetJson) {
                ReplyElementTargetJson replyElementTargetJson = (ReplyElementTargetJson) obj;
                if (!C7384Etj.areEqual(this.type, replyElementTargetJson.type) || !C7384Etj.areEqual(this.widget_id, replyElementTargetJson.widget_id) || !C7384Etj.areEqual(this.widgetId, replyElementTargetJson.widgetId) || !C7384Etj.areEqual(this.index, replyElementTargetJson.index) || !C7384Etj.areEqual(this.element_key, replyElementTargetJson.element_key) || !C7384Etj.areEqual(this.elementKey, replyElementTargetJson.elementKey) || !C7384Etj.areEqual(this.message_id, replyElementTargetJson.message_id) || !C7384Etj.areEqual(this.messageId, replyElementTargetJson.messageId) || !C7384Etj.areEqual(this.citation_id, replyElementTargetJson.citation_id) || !C7384Etj.areEqual(this.citationId, replyElementTargetJson.citationId) || !C7384Etj.areEqual(this.entity_kind, replyElementTargetJson.entity_kind) || !C7384Etj.areEqual(this.entityKind, replyElementTargetJson.entityKind) || !C7384Etj.areEqual(this.entity_id, replyElementTargetJson.entity_id) || !C7384Etj.areEqual(this.entityId, replyElementTargetJson.entityId) || !C7384Etj.areEqual(this.element_kind, replyElementTargetJson.element_kind) || !C7384Etj.areEqual(this.elementKind, replyElementTargetJson.elementKind) || !C7384Etj.areEqual(this.reply_to_text, replyElementTargetJson.reply_to_text) || !C7384Etj.areEqual(this.replyToText, replyElementTargetJson.replyToText) || !C7384Etj.areEqual(this.title, replyElementTargetJson.title) || !C7384Etj.areEqual(this.image_url, replyElementTargetJson.image_url) || !C7384Etj.areEqual(this.imageUrl, replyElementTargetJson.imageUrl) || !C7384Etj.areEqual(this.is_unavailable, replyElementTargetJson.is_unavailable) || !C7384Etj.areEqual(this.isUnavailable, replyElementTargetJson.isUnavailable)) {
                }
            }
            return false;
        }
        return true;
    }

    @Serializable(with = StrictReplyIndexSerializer.class)
    public static /* synthetic */ void getIndex$annotations() {
    }

    public final String component1() {
        return this.type;
    }

    public final String component10() {
        return this.citationId;
    }

    public final String component11() {
        return this.entity_kind;
    }

    public final String component12() {
        return this.entityKind;
    }

    public final String component13() {
        return this.entity_id;
    }

    public final String component14() {
        return this.entityId;
    }

    public final String component15() {
        return this.element_kind;
    }

    public final String component16() {
        return this.elementKind;
    }

    public final String component17() {
        return this.reply_to_text;
    }

    public final String component18() {
        return this.replyToText;
    }

    public final String component19() {
        return this.title;
    }

    public final String component2() {
        return this.widget_id;
    }

    public final String component20() {
        return this.image_url;
    }

    public final String component21() {
        return this.imageUrl;
    }

    public final Boolean component22() {
        return this.is_unavailable;
    }

    public final Boolean component23() {
        return this.isUnavailable;
    }

    public final String component3() {
        return this.widgetId;
    }

    public final Integer component4() {
        return this.index;
    }

    public final String component5() {
        return this.element_key;
    }

    public final String component6() {
        return this.elementKey;
    }

    public final String component7() {
        return this.message_id;
    }

    public final String component8() {
        return this.messageId;
    }

    public final String component9() {
        return this.citation_id;
    }

    public final String getCitationId() {
        return this.citationId;
    }

    public final String getCitation_id() {
        return this.citation_id;
    }

    public final String getElementKey() {
        return this.elementKey;
    }

    public final String getElementKind() {
        return this.elementKind;
    }

    public final String getElement_key() {
        return this.element_key;
    }

    public final String getElement_kind() {
        return this.element_kind;
    }

    public final String getEntityId() {
        return this.entityId;
    }

    public final String getEntityKind() {
        return this.entityKind;
    }

    public final String getEntity_id() {
        return this.entity_id;
    }

    public final String getEntity_kind() {
        return this.entity_kind;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final Integer getIndex() {
        return this.index;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getReplyToText() {
        return this.replyToText;
    }

    public final String getReply_to_text() {
        return this.reply_to_text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public final String getWidget_id() {
        return this.widget_id;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((AnonymousClass001.A0G(this.type) + AnonymousClass006.A0G(this.widget_id)) * 31) + AnonymousClass006.A0G(this.widgetId)) * 31) + AnonymousClass006.A0D(this.index)) * 31) + AnonymousClass006.A0G(this.element_key)) * 31) + AnonymousClass006.A0G(this.elementKey)) * 31) + AnonymousClass006.A0G(this.message_id)) * 31) + AnonymousClass006.A0G(this.messageId)) * 31) + AnonymousClass006.A0G(this.citation_id)) * 31) + AnonymousClass006.A0G(this.citationId)) * 31) + AnonymousClass006.A0G(this.entity_kind)) * 31) + AnonymousClass006.A0G(this.entityKind)) * 31) + AnonymousClass006.A0G(this.entity_id)) * 31) + AnonymousClass006.A0G(this.entityId)) * 31) + AnonymousClass006.A0G(this.element_kind)) * 31) + AnonymousClass006.A0G(this.elementKind)) * 31) + AnonymousClass006.A0G(this.reply_to_text)) * 31) + AnonymousClass006.A0G(this.replyToText)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.image_url)) * 31) + AnonymousClass006.A0G(this.imageUrl)) * 31) + AnonymousClass006.A0D(this.is_unavailable)) * 31) + C3cH.A02(this.isUnavailable);
    }

    public final Boolean isUnavailable() {
        return this.isUnavailable;
    }

    public final Boolean is_unavailable() {
        return this.is_unavailable;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ReplyElementTargetJson(int i, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Boolean bool, Boolean bool2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ReplyElementTargetJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.widget_id = null;
        } else {
            this.widget_id = str2;
        }
        if ((i & 4) == 0) {
            this.widgetId = null;
        } else {
            this.widgetId = str3;
        }
        if ((i & 8) == 0) {
            this.index = null;
        } else {
            this.index = num;
        }
        if ((i & 16) == 0) {
            this.element_key = null;
        } else {
            this.element_key = str4;
        }
        if ((i & 32) == 0) {
            this.elementKey = null;
        } else {
            this.elementKey = str5;
        }
        if ((i & 64) == 0) {
            this.message_id = null;
        } else {
            this.message_id = str6;
        }
        if ((i & 128) == 0) {
            this.messageId = null;
        } else {
            this.messageId = str7;
        }
        if ((i & 256) == 0) {
            this.citation_id = null;
        } else {
            this.citation_id = str8;
        }
        if ((i & 512) == 0) {
            this.citationId = null;
        } else {
            this.citationId = str9;
        }
        if ((i & 1024) == 0) {
            this.entity_kind = null;
        } else {
            this.entity_kind = str10;
        }
        if ((i & 2048) == 0) {
            this.entityKind = null;
        } else {
            this.entityKind = str11;
        }
        if ((i & 4096) == 0) {
            this.entity_id = null;
        } else {
            this.entity_id = str12;
        }
        if ((i & 8192) == 0) {
            this.entityId = null;
        } else {
            this.entityId = str13;
        }
        if ((i & 16384) == 0) {
            this.element_kind = null;
        } else {
            this.element_kind = str14;
        }
        if ((32768 & i) == 0) {
            this.elementKind = null;
        } else {
            this.elementKind = str15;
        }
        if ((65536 & i) == 0) {
            this.reply_to_text = null;
        } else {
            this.reply_to_text = str16;
        }
        if ((131072 & i) == 0) {
            this.replyToText = null;
        } else {
            this.replyToText = str17;
        }
        if ((262144 & i) == 0) {
            this.title = null;
        } else {
            this.title = str18;
        }
        if ((524288 & i) == 0) {
            this.image_url = null;
        } else {
            this.image_url = str19;
        }
        if ((1048576 & i) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str20;
        }
        if ((2097152 & i) == 0) {
            this.is_unavailable = null;
        } else {
            this.is_unavailable = bool;
        }
        if ((i & 4194304) == 0) {
            this.isUnavailable = null;
        } else {
            this.isUnavailable = bool2;
        }
    }

    public static /* synthetic */ ReplyElementTargetJson copy$default(ReplyElementTargetJson replyElementTargetJson, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Boolean bool, Boolean bool2, int i, Object obj) {
        String str21 = str;
        String str22 = str2;
        String str23 = str3;
        Integer num2 = num;
        String str24 = str4;
        String str25 = str5;
        String str26 = str6;
        String str27 = str7;
        String str28 = str8;
        String str29 = str9;
        String str30 = str10;
        String str31 = str11;
        String str32 = str12;
        String str33 = str13;
        String str34 = str14;
        String str35 = str15;
        String str36 = str18;
        String str37 = str19;
        String str38 = str20;
        Boolean bool3 = bool;
        String str39 = str16;
        String str40 = str17;
        Boolean bool4 = bool2;
        if ((i & 1) != 0) {
            str21 = replyElementTargetJson.type;
        }
        if ((i & 2) != 0) {
            str22 = replyElementTargetJson.widget_id;
        }
        if ((i & 4) != 0) {
            str23 = replyElementTargetJson.widgetId;
        }
        if ((i & 8) != 0) {
            num2 = replyElementTargetJson.index;
        }
        if ((i & 16) != 0) {
            str24 = replyElementTargetJson.element_key;
        }
        if ((i & 32) != 0) {
            str25 = replyElementTargetJson.elementKey;
        }
        if ((i & 64) != 0) {
            str26 = replyElementTargetJson.message_id;
        }
        if ((i & 128) != 0) {
            str27 = replyElementTargetJson.messageId;
        }
        if ((i & 256) != 0) {
            str28 = replyElementTargetJson.citation_id;
        }
        if ((i & 512) != 0) {
            str29 = replyElementTargetJson.citationId;
        }
        if ((i & 1024) != 0) {
            str30 = replyElementTargetJson.entity_kind;
        }
        if ((i & 2048) != 0) {
            str31 = replyElementTargetJson.entityKind;
        }
        if ((i & 4096) != 0) {
            str32 = replyElementTargetJson.entity_id;
        }
        if ((i & 8192) != 0) {
            str33 = replyElementTargetJson.entityId;
        }
        if ((i & 16384) != 0) {
            str34 = replyElementTargetJson.element_kind;
        }
        if ((i & 32768) != 0) {
            str35 = replyElementTargetJson.elementKind;
        }
        if ((i & 65536) != 0) {
            str39 = replyElementTargetJson.reply_to_text;
        }
        if ((i & 131072) != 0) {
            str40 = replyElementTargetJson.replyToText;
        }
        if ((i & 262144) != 0) {
            str36 = replyElementTargetJson.title;
        }
        if ((i & 524288) != 0) {
            str37 = replyElementTargetJson.image_url;
        }
        if ((i & 1048576) != 0) {
            str38 = replyElementTargetJson.imageUrl;
        }
        if ((i & 2097152) != 0) {
            bool3 = replyElementTargetJson.is_unavailable;
        }
        if ((i & 4194304) != 0) {
            bool4 = replyElementTargetJson.isUnavailable;
        }
        String str41 = str30;
        String str42 = str31;
        String str43 = str32;
        return replyElementTargetJson.copy(str21, str22, str23, num2, str24, str25, str26, str27, str28, str29, str41, str42, str43, str33, str34, str35, str39, str40, str36, str37, str38, bool3, bool4);
    }

    public ReplyElementTargetJson(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Boolean bool, Boolean bool2) {
        C7384Etj.A0Y(str, 0);
        this.type = str;
        this.widget_id = str2;
        this.widgetId = str3;
        this.index = num;
        this.element_key = str4;
        this.elementKey = str5;
        this.message_id = str6;
        this.messageId = str7;
        this.citation_id = str8;
        this.citationId = str9;
        this.entity_kind = str10;
        this.entityKind = str11;
        this.entity_id = str12;
        this.entityId = str13;
        this.element_kind = str14;
        this.elementKind = str15;
        this.reply_to_text = str16;
        this.replyToText = str17;
        this.title = str18;
        this.image_url = str19;
        this.imageUrl = str20;
        this.is_unavailable = bool;
        this.isUnavailable = bool2;
    }

    public /* synthetic */ ReplyElementTargetJson(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Boolean bool, Boolean bool2, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : str17, (i & 262144) != 0 ? null : str18, (i & 524288) != 0 ? null : str19, (i & 1048576) != 0 ? null : str20, (i & 2097152) != 0 ? null : bool, (i & 4194304) != 0 ? null : bool2);
    }
}
