package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalSnapshotDisplayJson extends C06G {
    public static final int $stable = 8;
    public final String attention_label;
    public final String attention_mode;
    public final String card_title;
    public final ApprovalConnectorDisplayJson connector;
    public final String connector_display_name;
    public final String connector_icon_url;
    public final List<ApprovalDetailRowJson> detail_rows;
    public final String display_name;
    public final String icon_key;
    public final String icon_url;
    public final String outcome_label;
    public final String permission_caption;
    public final ApprovalPermissionQuestionJson permission_question;
    public final String presentation_kind;
    public final PurchasePreapprovalJson purchase_preapproval;
    public final String purpose_summary;
    public final String request_presentation;
    public final JsonElement request_preview_document;
    public final String review_text;
    public final String scope_summary;
    public final String summary_title;
    public final String total_promo_caption;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, ApprovalSnapshotDisplayJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<ApprovalSnapshotDisplayJson> serializer() {
            return ApprovalSnapshotDisplayJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalSnapshotDisplayJson) {
                ApprovalSnapshotDisplayJson approvalSnapshotDisplayJson = (ApprovalSnapshotDisplayJson) obj;
                if (!C7384Etj.areEqual(this.purchase_preapproval, approvalSnapshotDisplayJson.purchase_preapproval) || !C7384Etj.areEqual(this.card_title, approvalSnapshotDisplayJson.card_title) || !C7384Etj.areEqual(this.summary_title, approvalSnapshotDisplayJson.summary_title) || !C7384Etj.areEqual(this.review_text, approvalSnapshotDisplayJson.review_text) || !C7384Etj.areEqual(this.icon_key, approvalSnapshotDisplayJson.icon_key) || !C7384Etj.areEqual(this.icon_url, approvalSnapshotDisplayJson.icon_url) || !C7384Etj.areEqual(this.attention_label, approvalSnapshotDisplayJson.attention_label) || !C7384Etj.areEqual(this.attention_mode, approvalSnapshotDisplayJson.attention_mode) || !C7384Etj.areEqual(this.permission_caption, approvalSnapshotDisplayJson.permission_caption) || !C7384Etj.areEqual(this.outcome_label, approvalSnapshotDisplayJson.outcome_label) || !C7384Etj.areEqual(this.total_promo_caption, approvalSnapshotDisplayJson.total_promo_caption) || !C7384Etj.areEqual(this.display_name, approvalSnapshotDisplayJson.display_name) || !C7384Etj.areEqual(this.connector_display_name, approvalSnapshotDisplayJson.connector_display_name) || !C7384Etj.areEqual(this.connector_icon_url, approvalSnapshotDisplayJson.connector_icon_url) || !C7384Etj.areEqual(this.connector, approvalSnapshotDisplayJson.connector) || !C7384Etj.areEqual(this.scope_summary, approvalSnapshotDisplayJson.scope_summary) || !C7384Etj.areEqual(this.purpose_summary, approvalSnapshotDisplayJson.purpose_summary) || !C7384Etj.areEqual(this.presentation_kind, approvalSnapshotDisplayJson.presentation_kind) || !C7384Etj.areEqual(this.request_presentation, approvalSnapshotDisplayJson.request_presentation) || !C7384Etj.areEqual(this.request_preview_document, approvalSnapshotDisplayJson.request_preview_document) || !C7384Etj.areEqual(this.permission_question, approvalSnapshotDisplayJson.permission_question) || !C7384Etj.areEqual(this.detail_rows, approvalSnapshotDisplayJson.detail_rows)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalSnapshotDisplayJson approvalSnapshotDisplayJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || approvalSnapshotDisplayJson.purchase_preapproval != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.purchase_preapproval, PurchasePreapprovalJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || approvalSnapshotDisplayJson.card_title != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.card_title, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || approvalSnapshotDisplayJson.summary_title != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.summary_title, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || approvalSnapshotDisplayJson.review_text != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.review_text, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || approvalSnapshotDisplayJson.icon_key != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.icon_key, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || approvalSnapshotDisplayJson.icon_url != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.icon_url, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || approvalSnapshotDisplayJson.attention_label != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.attention_label, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || approvalSnapshotDisplayJson.attention_mode != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.attention_mode, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || approvalSnapshotDisplayJson.permission_caption != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.permission_caption, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || approvalSnapshotDisplayJson.outcome_label != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.outcome_label, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || approvalSnapshotDisplayJson.total_promo_caption != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.total_promo_caption, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || approvalSnapshotDisplayJson.display_name != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.display_name, C07779iq.A01, c9iZ, 11);
        }
        if (zAfR || approvalSnapshotDisplayJson.connector_display_name != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.connector_display_name, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || approvalSnapshotDisplayJson.connector_icon_url != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.connector_icon_url, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || approvalSnapshotDisplayJson.connector != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.connector, ApprovalConnectorDisplayJson$$serializer.INSTANCE, c9iZ, 14);
        }
        if (zAfR || approvalSnapshotDisplayJson.scope_summary != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.scope_summary, C07779iq.A01, c9iZ, 15);
        }
        if (zAfR || approvalSnapshotDisplayJson.purpose_summary != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.purpose_summary, C07779iq.A01, c9iZ, 16);
        }
        if (zAfR || approvalSnapshotDisplayJson.presentation_kind != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.presentation_kind, C07779iq.A01, c9iZ, 17);
        }
        if (zAfR || approvalSnapshotDisplayJson.request_presentation != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.request_presentation, C07779iq.A01, c9iZ, 18);
        }
        if (zAfR || approvalSnapshotDisplayJson.request_preview_document != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.request_preview_document, JsonElementSerializer.A00, c9iZ, 19);
        }
        if (zAfR || approvalSnapshotDisplayJson.permission_question != null) {
            c9j5.AAP(approvalSnapshotDisplayJson.permission_question, ApprovalPermissionQuestionJson$$serializer.INSTANCE, c9iZ, 20);
        }
        if (zAfR || !C3cG.A1L(approvalSnapshotDisplayJson.detail_rows)) {
            c9j5.AAQ(approvalSnapshotDisplayJson.detail_rows, C3cH.A15(f0cArr, 21), c9iZ, 21);
        }
    }

    public final PurchasePreapprovalJson component1() {
        return this.purchase_preapproval;
    }

    public final String component10() {
        return this.outcome_label;
    }

    public final String component11() {
        return this.total_promo_caption;
    }

    public final String component12() {
        return this.display_name;
    }

    public final String component13() {
        return this.connector_display_name;
    }

    public final String component14() {
        return this.connector_icon_url;
    }

    public final ApprovalConnectorDisplayJson component15() {
        return this.connector;
    }

    public final String component16() {
        return this.scope_summary;
    }

    public final String component17() {
        return this.purpose_summary;
    }

    public final String component18() {
        return this.presentation_kind;
    }

    public final String component19() {
        return this.request_presentation;
    }

    public final String component2() {
        return this.card_title;
    }

    public final JsonElement component20() {
        return this.request_preview_document;
    }

    public final ApprovalPermissionQuestionJson component21() {
        return this.permission_question;
    }

    public final List<ApprovalDetailRowJson> component22() {
        return this.detail_rows;
    }

    public final String component3() {
        return this.summary_title;
    }

    public final String component4() {
        return this.review_text;
    }

    public final String component5() {
        return this.icon_key;
    }

    public final String component6() {
        return this.icon_url;
    }

    public final String component7() {
        return this.attention_label;
    }

    public final String component8() {
        return this.attention_mode;
    }

    public final String component9() {
        return this.permission_caption;
    }

    public final ApprovalSnapshotDisplayJson copy(PurchasePreapprovalJson purchasePreapprovalJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, ApprovalConnectorDisplayJson approvalConnectorDisplayJson, String str14, String str15, String str16, String str17, JsonElement jsonElement, ApprovalPermissionQuestionJson approvalPermissionQuestionJson, List<ApprovalDetailRowJson> list) {
        C7384Etj.A0Y(list, 21);
        return new ApprovalSnapshotDisplayJson(purchasePreapprovalJson, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, approvalConnectorDisplayJson, str14, str15, str16, str17, jsonElement, approvalPermissionQuestionJson, list);
    }

    public final String getAttention_label() {
        return this.attention_label;
    }

    public final String getAttention_mode() {
        return this.attention_mode;
    }

    public final String getCard_title() {
        return this.card_title;
    }

    public final ApprovalConnectorDisplayJson getConnector() {
        return this.connector;
    }

    public final String getConnector_display_name() {
        return this.connector_display_name;
    }

    public final String getConnector_icon_url() {
        return this.connector_icon_url;
    }

    public final List<ApprovalDetailRowJson> getDetail_rows() {
        return this.detail_rows;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getIcon_key() {
        return this.icon_key;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getOutcome_label() {
        return this.outcome_label;
    }

    public final String getPermission_caption() {
        return this.permission_caption;
    }

    public final ApprovalPermissionQuestionJson getPermission_question() {
        return this.permission_question;
    }

    public final String getPresentation_kind() {
        return this.presentation_kind;
    }

    public final PurchasePreapprovalJson getPurchase_preapproval() {
        return this.purchase_preapproval;
    }

    public final String getPurpose_summary() {
        return this.purpose_summary;
    }

    public final String getRequest_presentation() {
        return this.request_presentation;
    }

    public final JsonElement getRequest_preview_document() {
        return this.request_preview_document;
    }

    public final String getReview_text() {
        return this.review_text;
    }

    public final String getScope_summary() {
        return this.scope_summary;
    }

    public final String getSummary_title() {
        return this.summary_title;
    }

    public final String getTotal_promo_caption() {
        return this.total_promo_caption;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.detail_rows, ((((((((((((((((((((((((((((((((((((((((AnonymousClass006.A0D(this.purchase_preapproval) * 31) + AnonymousClass006.A0G(this.card_title)) * 31) + AnonymousClass006.A0G(this.summary_title)) * 31) + AnonymousClass006.A0G(this.review_text)) * 31) + AnonymousClass006.A0G(this.icon_key)) * 31) + AnonymousClass006.A0G(this.icon_url)) * 31) + AnonymousClass006.A0G(this.attention_label)) * 31) + AnonymousClass006.A0G(this.attention_mode)) * 31) + AnonymousClass006.A0G(this.permission_caption)) * 31) + AnonymousClass006.A0G(this.outcome_label)) * 31) + AnonymousClass006.A0G(this.total_promo_caption)) * 31) + AnonymousClass006.A0G(this.display_name)) * 31) + AnonymousClass006.A0G(this.connector_display_name)) * 31) + AnonymousClass006.A0G(this.connector_icon_url)) * 31) + AnonymousClass006.A0D(this.connector)) * 31) + AnonymousClass006.A0G(this.scope_summary)) * 31) + AnonymousClass006.A0G(this.purpose_summary)) * 31) + AnonymousClass006.A0G(this.presentation_kind)) * 31) + AnonymousClass006.A0G(this.request_presentation)) * 31) + AnonymousClass006.A0D(this.request_preview_document)) * 31) + C3cH.A02(this.permission_question)) * 31);
    }

    public final String resolvedConnectorDisplayName() {
        String str;
        String strTrimToNonEmpty;
        String str2;
        String strTrimToNonEmpty2;
        ApprovalConnectorDisplayJson approvalConnectorDisplayJson = this.connector;
        if (approvalConnectorDisplayJson != null && (str2 = approvalConnectorDisplayJson.display_name) != null && (strTrimToNonEmpty2 = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str2)) != null) {
            return strTrimToNonEmpty2;
        }
        ApprovalConnectorDisplayJson approvalConnectorDisplayJson2 = this.connector;
        if (approvalConnectorDisplayJson2 != null && (str = approvalConnectorDisplayJson2.name) != null && (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str)) != null) {
            return strTrimToNonEmpty;
        }
        String str3 = this.connector_display_name;
        if (str3 != null) {
            return HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str3);
        }
        return null;
    }

    public final String resolvedIconUrl() {
        String strTrimToNonEmpty;
        String str;
        String strTrimToNonEmpty2;
        ApprovalConnectorDisplayJson approvalConnectorDisplayJson = this.connector;
        if (approvalConnectorDisplayJson != null && (str = approvalConnectorDisplayJson.icon_url) != null && (strTrimToNonEmpty2 = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str)) != null) {
            return strTrimToNonEmpty2;
        }
        String str2 = this.connector_icon_url;
        if (str2 != null && (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str2)) != null) {
            return strTrimToNonEmpty;
        }
        String str3 = this.icon_url;
        if (str3 != null) {
            return HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str3);
        }
        return null;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalSnapshotDisplayJson(int i, PurchasePreapprovalJson purchasePreapprovalJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, ApprovalConnectorDisplayJson approvalConnectorDisplayJson, String str14, String str15, String str16, String str17, JsonElement jsonElement, ApprovalPermissionQuestionJson approvalPermissionQuestionJson, List list, C2hx c2hx) {
        List list2 = list;
        if ((i & 1) == 0) {
            this.purchase_preapproval = null;
        } else {
            this.purchase_preapproval = purchasePreapprovalJson;
        }
        if ((i & 2) == 0) {
            this.card_title = null;
        } else {
            this.card_title = str;
        }
        if ((i & 4) == 0) {
            this.summary_title = null;
        } else {
            this.summary_title = str2;
        }
        if ((i & 8) == 0) {
            this.review_text = null;
        } else {
            this.review_text = str3;
        }
        if ((i & 16) == 0) {
            this.icon_key = null;
        } else {
            this.icon_key = str4;
        }
        if ((i & 32) == 0) {
            this.icon_url = null;
        } else {
            this.icon_url = str5;
        }
        if ((i & 64) == 0) {
            this.attention_label = null;
        } else {
            this.attention_label = str6;
        }
        if ((i & 128) == 0) {
            this.attention_mode = null;
        } else {
            this.attention_mode = str7;
        }
        if ((i & 256) == 0) {
            this.permission_caption = null;
        } else {
            this.permission_caption = str8;
        }
        if ((i & 512) == 0) {
            this.outcome_label = null;
        } else {
            this.outcome_label = str9;
        }
        if ((i & 1024) == 0) {
            this.total_promo_caption = null;
        } else {
            this.total_promo_caption = str10;
        }
        if ((i & 2048) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str11;
        }
        if ((i & 4096) == 0) {
            this.connector_display_name = null;
        } else {
            this.connector_display_name = str12;
        }
        if ((i & 8192) == 0) {
            this.connector_icon_url = null;
        } else {
            this.connector_icon_url = str13;
        }
        if ((i & 16384) == 0) {
            this.connector = null;
        } else {
            this.connector = approvalConnectorDisplayJson;
        }
        if ((32768 & i) == 0) {
            this.scope_summary = null;
        } else {
            this.scope_summary = str14;
        }
        if ((65536 & i) == 0) {
            this.purpose_summary = null;
        } else {
            this.purpose_summary = str15;
        }
        if ((131072 & i) == 0) {
            this.presentation_kind = null;
        } else {
            this.presentation_kind = str16;
        }
        if ((262144 & i) == 0) {
            this.request_presentation = null;
        } else {
            this.request_presentation = str17;
        }
        if ((524288 & i) == 0) {
            this.request_preview_document = null;
        } else {
            this.request_preview_document = jsonElement;
        }
        if ((1048576 & i) == 0) {
            this.permission_question = null;
        } else {
            this.permission_question = approvalPermissionQuestionJson;
        }
        this.detail_rows = (i & 2097152) == 0 ? C0881AGi.A00 : list2;
    }

    public static /* synthetic */ ApprovalSnapshotDisplayJson copy$default(ApprovalSnapshotDisplayJson approvalSnapshotDisplayJson, PurchasePreapprovalJson purchasePreapprovalJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, ApprovalConnectorDisplayJson approvalConnectorDisplayJson, String str14, String str15, String str16, String str17, JsonElement jsonElement, ApprovalPermissionQuestionJson approvalPermissionQuestionJson, List list, int i, Object obj) {
        PurchasePreapprovalJson purchasePreapprovalJson2 = purchasePreapprovalJson;
        String str18 = str;
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        String str22 = str5;
        String str23 = str6;
        String str24 = str7;
        String str25 = str8;
        String str26 = str9;
        String str27 = str10;
        String str28 = str11;
        String str29 = str12;
        String str30 = str13;
        ApprovalConnectorDisplayJson approvalConnectorDisplayJson2 = approvalConnectorDisplayJson;
        String str31 = str14;
        String str32 = str16;
        String str33 = str17;
        JsonElement jsonElement2 = jsonElement;
        ApprovalPermissionQuestionJson approvalPermissionQuestionJson2 = approvalPermissionQuestionJson;
        String str34 = str15;
        List list2 = list;
        if ((i & 1) != 0) {
            purchasePreapprovalJson2 = approvalSnapshotDisplayJson.purchase_preapproval;
        }
        if ((i & 2) != 0) {
            str18 = approvalSnapshotDisplayJson.card_title;
        }
        if ((i & 4) != 0) {
            str19 = approvalSnapshotDisplayJson.summary_title;
        }
        if ((i & 8) != 0) {
            str20 = approvalSnapshotDisplayJson.review_text;
        }
        if ((i & 16) != 0) {
            str21 = approvalSnapshotDisplayJson.icon_key;
        }
        if ((i & 32) != 0) {
            str22 = approvalSnapshotDisplayJson.icon_url;
        }
        if ((i & 64) != 0) {
            str23 = approvalSnapshotDisplayJson.attention_label;
        }
        if ((i & 128) != 0) {
            str24 = approvalSnapshotDisplayJson.attention_mode;
        }
        if ((i & 256) != 0) {
            str25 = approvalSnapshotDisplayJson.permission_caption;
        }
        if ((i & 512) != 0) {
            str26 = approvalSnapshotDisplayJson.outcome_label;
        }
        if ((i & 1024) != 0) {
            str27 = approvalSnapshotDisplayJson.total_promo_caption;
        }
        if ((i & 2048) != 0) {
            str28 = approvalSnapshotDisplayJson.display_name;
        }
        if ((i & 4096) != 0) {
            str29 = approvalSnapshotDisplayJson.connector_display_name;
        }
        if ((i & 8192) != 0) {
            str30 = approvalSnapshotDisplayJson.connector_icon_url;
        }
        if ((i & 16384) != 0) {
            approvalConnectorDisplayJson2 = approvalSnapshotDisplayJson.connector;
        }
        if ((i & 32768) != 0) {
            str31 = approvalSnapshotDisplayJson.scope_summary;
        }
        if ((i & 65536) != 0) {
            str34 = approvalSnapshotDisplayJson.purpose_summary;
        }
        if ((i & 131072) != 0) {
            str32 = approvalSnapshotDisplayJson.presentation_kind;
        }
        if ((i & 262144) != 0) {
            str33 = approvalSnapshotDisplayJson.request_presentation;
        }
        if ((i & 524288) != 0) {
            jsonElement2 = approvalSnapshotDisplayJson.request_preview_document;
        }
        if ((i & 1048576) != 0) {
            approvalPermissionQuestionJson2 = approvalSnapshotDisplayJson.permission_question;
        }
        if ((i & 2097152) != 0) {
            list2 = approvalSnapshotDisplayJson.detail_rows;
        }
        String str35 = str26;
        String str36 = str27;
        String str37 = str28;
        String str38 = str29;
        return approvalSnapshotDisplayJson.copy(purchasePreapprovalJson2, str18, str19, str20, str21, str22, str23, str24, str25, str35, str36, str37, str38, str30, approvalConnectorDisplayJson2, str31, str34, str32, str33, jsonElement2, approvalPermissionQuestionJson2, list2);
    }

    public /* synthetic */ ApprovalSnapshotDisplayJson(PurchasePreapprovalJson purchasePreapprovalJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, ApprovalConnectorDisplayJson approvalConnectorDisplayJson, String str14, String str15, String str16, String str17, JsonElement jsonElement, ApprovalPermissionQuestionJson approvalPermissionQuestionJson, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : purchasePreapprovalJson, C3cG.A0e(str, i & 2), C3cG.A0e(str2, i & 4), C3cG.A0e(str3, i & 8), C3cG.A0e(str4, i & 16), C3cG.A0e(str5, i & 32), C3cG.A0e(str6, i & 64), C3cG.A0e(str7, i & 128), C3cG.A0e(str8, i & 256), C3cG.A0e(str9, i & 512), C3cG.A0e(str10, i & 1024), C3cG.A0e(str11, i & 2048), C3cG.A0e(str12, i & 4096), C3cG.A0e(str13, i & 8192), (i & 16384) != 0 ? null : approvalConnectorDisplayJson, C3cI.A0V(i, 32768, str14), C3cI.A0V(i, 65536, str15), C3cI.A0V(i, 131072, str16), C3cI.A0V(i, 262144, str17), (i & 524288) != 0 ? null : jsonElement, (i & 1048576) != 0 ? null : approvalPermissionQuestionJson, (i & 2097152) != 0 ? C0881AGi.A00 : list);
    }

    public ApprovalSnapshotDisplayJson(PurchasePreapprovalJson purchasePreapprovalJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, ApprovalConnectorDisplayJson approvalConnectorDisplayJson, String str14, String str15, String str16, String str17, JsonElement jsonElement, ApprovalPermissionQuestionJson approvalPermissionQuestionJson, List<ApprovalDetailRowJson> list) {
        C7384Etj.A0Y(list, 21);
        this.purchase_preapproval = purchasePreapprovalJson;
        this.card_title = str;
        this.summary_title = str2;
        this.review_text = str3;
        this.icon_key = str4;
        this.icon_url = str5;
        this.attention_label = str6;
        this.attention_mode = str7;
        this.permission_caption = str8;
        this.outcome_label = str9;
        this.total_promo_caption = str10;
        this.display_name = str11;
        this.connector_display_name = str12;
        this.connector_icon_url = str13;
        this.connector = approvalConnectorDisplayJson;
        this.scope_summary = str14;
        this.purpose_summary = str15;
        this.presentation_kind = str16;
        this.request_presentation = str17;
        this.request_preview_document = jsonElement;
        this.permission_question = approvalPermissionQuestionJson;
        this.detail_rows = list;
    }

    public ApprovalSnapshotDisplayJson() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, C0881AGi.A00);
    }
}
