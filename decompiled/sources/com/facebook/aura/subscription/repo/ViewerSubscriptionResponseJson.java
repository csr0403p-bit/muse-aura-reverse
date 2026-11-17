package com.facebook.aura.subscription.repo;

import X.ATD;
import X.Ab3;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.CFK;
import java.util.Locale;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ViewerSubscriptionResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final ViewerAgreementJson agreement;
    public final String billing_subtitle;
    public final ViewerComplimentaryOfferJson complimentary_offer;
    public final String entry_point_cta_label;
    public final Boolean is_eligible_to_purchase;
    public final ViewerManagementActionsJson management_actions;
    public final String status_subtitle;
    public final String subscription_type;
    public final ViewerTierJson tier;
    public final long topup_balance;
    public final boolean topup_eligible;
    public final String topup_row_label;
    public final String topup_row_value_label;
    public final long topup_total;
    public final ViewerUsageJson usage;
    public final String usage_row_footer;
    public final String usage_row_label;
    public final String usage_row_value_label;

    public final class Companion {
        public final C9hr<ViewerSubscriptionResponseJson> serializer() {
            return ViewerSubscriptionResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerSubscriptionResponseJson viewerSubscriptionResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C7384Etj.areEqual(viewerSubscriptionResponseJson.tier, new ViewerTierJson(null, "", null, false))) {
            c9j5.AAQ(viewerSubscriptionResponseJson.tier, ViewerTierJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || !C7384Etj.areEqual(viewerSubscriptionResponseJson.usage, new ViewerUsageJson(null, null, null))) {
            c9j5.AAQ(viewerSubscriptionResponseJson.usage, ViewerUsageJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || viewerSubscriptionResponseJson.topup_balance != 0) {
            c9j5.AAN(c9iZ, 2, viewerSubscriptionResponseJson.topup_balance);
        }
        if (zAfR || viewerSubscriptionResponseJson.topup_total != 0) {
            c9j5.AAN(c9iZ, 3, viewerSubscriptionResponseJson.topup_total);
        }
        if (zAfR || viewerSubscriptionResponseJson.status_subtitle != null) {
            c9j5.AAP(viewerSubscriptionResponseJson.status_subtitle, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || viewerSubscriptionResponseJson.usage_row_label != null) {
            c9j5.AAP(viewerSubscriptionResponseJson.usage_row_label, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || viewerSubscriptionResponseJson.usage_row_value_label != null) {
            c9j5.AAP(viewerSubscriptionResponseJson.usage_row_value_label, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || viewerSubscriptionResponseJson.usage_row_footer != null) {
            c9j5.AAP(viewerSubscriptionResponseJson.usage_row_footer, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || viewerSubscriptionResponseJson.topup_row_label != null) {
            c9j5.AAP(viewerSubscriptionResponseJson.topup_row_label, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || viewerSubscriptionResponseJson.topup_row_value_label != null) {
            c9j5.AAP(viewerSubscriptionResponseJson.topup_row_value_label, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || viewerSubscriptionResponseJson.topup_eligible) {
            c9j5.AA7(c9iZ, 10, viewerSubscriptionResponseJson.topup_eligible);
        }
        if (zAfR || viewerSubscriptionResponseJson.is_eligible_to_purchase != null) {
            c9j5.AAP(viewerSubscriptionResponseJson.is_eligible_to_purchase, C07839ix.A00, c9iZ, 11);
        }
        if (zAfR || viewerSubscriptionResponseJson.billing_subtitle != null) {
            c9j5.AAP(viewerSubscriptionResponseJson.billing_subtitle, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || viewerSubscriptionResponseJson.entry_point_cta_label != null) {
            c9j5.AAP(viewerSubscriptionResponseJson.entry_point_cta_label, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || viewerSubscriptionResponseJson.complimentary_offer != null) {
            c9j5.AAP(viewerSubscriptionResponseJson.complimentary_offer, ViewerComplimentaryOfferJson$$serializer.INSTANCE, c9iZ, 14);
        }
        if (zAfR || viewerSubscriptionResponseJson.management_actions != null) {
            c9j5.AAP(viewerSubscriptionResponseJson.management_actions, ViewerManagementActionsJson$$serializer.INSTANCE, c9iZ, 15);
        }
        if (zAfR || viewerSubscriptionResponseJson.subscription_type != null) {
            c9j5.AAP(viewerSubscriptionResponseJson.subscription_type, C07779iq.A01, c9iZ, 16);
        }
        if (zAfR || viewerSubscriptionResponseJson.agreement != null) {
            c9j5.AAP(viewerSubscriptionResponseJson.agreement, ViewerAgreementJson$$serializer.INSTANCE, c9iZ, 17);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerSubscriptionResponseJson) {
                ViewerSubscriptionResponseJson viewerSubscriptionResponseJson = (ViewerSubscriptionResponseJson) obj;
                if (!C7384Etj.areEqual(this.tier, viewerSubscriptionResponseJson.tier) || !C7384Etj.areEqual(this.usage, viewerSubscriptionResponseJson.usage) || this.topup_balance != viewerSubscriptionResponseJson.topup_balance || this.topup_total != viewerSubscriptionResponseJson.topup_total || !C7384Etj.areEqual(this.status_subtitle, viewerSubscriptionResponseJson.status_subtitle) || !C7384Etj.areEqual(this.usage_row_label, viewerSubscriptionResponseJson.usage_row_label) || !C7384Etj.areEqual(this.usage_row_value_label, viewerSubscriptionResponseJson.usage_row_value_label) || !C7384Etj.areEqual(this.usage_row_footer, viewerSubscriptionResponseJson.usage_row_footer) || !C7384Etj.areEqual(this.topup_row_label, viewerSubscriptionResponseJson.topup_row_label) || !C7384Etj.areEqual(this.topup_row_value_label, viewerSubscriptionResponseJson.topup_row_value_label) || this.topup_eligible != viewerSubscriptionResponseJson.topup_eligible || !C7384Etj.areEqual(this.is_eligible_to_purchase, viewerSubscriptionResponseJson.is_eligible_to_purchase) || !C7384Etj.areEqual(this.billing_subtitle, viewerSubscriptionResponseJson.billing_subtitle) || !C7384Etj.areEqual(this.entry_point_cta_label, viewerSubscriptionResponseJson.entry_point_cta_label) || !C7384Etj.areEqual(this.complimentary_offer, viewerSubscriptionResponseJson.complimentary_offer) || !C7384Etj.areEqual(this.management_actions, viewerSubscriptionResponseJson.management_actions) || !C7384Etj.areEqual(this.subscription_type, viewerSubscriptionResponseJson.subscription_type) || !C7384Etj.areEqual(this.agreement, viewerSubscriptionResponseJson.agreement)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ViewerSubscriptionResponseJson copy$default(ViewerSubscriptionResponseJson viewerSubscriptionResponseJson, ViewerTierJson viewerTierJson, ViewerUsageJson viewerUsageJson, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, Boolean bool, String str7, String str8, ViewerComplimentaryOfferJson viewerComplimentaryOfferJson, ViewerManagementActionsJson viewerManagementActionsJson, String str9, ViewerAgreementJson viewerAgreementJson, int i, Object obj) {
        ViewerTierJson viewerTierJson2 = viewerTierJson;
        ViewerUsageJson viewerUsageJson2 = viewerUsageJson;
        long j3 = j;
        long j4 = j2;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        boolean z2 = z;
        Boolean bool2 = bool;
        String str15 = str7;
        String str16 = str8;
        ViewerComplimentaryOfferJson viewerComplimentaryOfferJson2 = viewerComplimentaryOfferJson;
        ViewerManagementActionsJson viewerManagementActionsJson2 = viewerManagementActionsJson;
        String str17 = str9;
        ViewerAgreementJson viewerAgreementJson2 = viewerAgreementJson;
        if ((i & 1) != 0) {
            viewerTierJson2 = viewerSubscriptionResponseJson.tier;
        }
        if ((i & 2) != 0) {
            viewerUsageJson2 = viewerSubscriptionResponseJson.usage;
        }
        if ((i & 4) != 0) {
            j3 = viewerSubscriptionResponseJson.topup_balance;
        }
        if ((i & 8) != 0) {
            j4 = viewerSubscriptionResponseJson.topup_total;
        }
        if ((i & 16) != 0) {
            str = viewerSubscriptionResponseJson.status_subtitle;
        }
        if ((i & 32) != 0) {
            str10 = viewerSubscriptionResponseJson.usage_row_label;
        }
        if ((i & 64) != 0) {
            str11 = viewerSubscriptionResponseJson.usage_row_value_label;
        }
        if ((i & 128) != 0) {
            str12 = viewerSubscriptionResponseJson.usage_row_footer;
        }
        if ((i & 256) != 0) {
            str13 = viewerSubscriptionResponseJson.topup_row_label;
        }
        if ((i & 512) != 0) {
            str14 = viewerSubscriptionResponseJson.topup_row_value_label;
        }
        if ((i & 1024) != 0) {
            z2 = viewerSubscriptionResponseJson.topup_eligible;
        }
        if ((i & 2048) != 0) {
            bool2 = viewerSubscriptionResponseJson.is_eligible_to_purchase;
        }
        if ((i & 4096) != 0) {
            str15 = viewerSubscriptionResponseJson.billing_subtitle;
        }
        if ((i & 8192) != 0) {
            str16 = viewerSubscriptionResponseJson.entry_point_cta_label;
        }
        if ((i & 16384) != 0) {
            viewerComplimentaryOfferJson2 = viewerSubscriptionResponseJson.complimentary_offer;
        }
        if ((i & 32768) != 0) {
            viewerManagementActionsJson2 = viewerSubscriptionResponseJson.management_actions;
        }
        if ((i & 65536) != 0) {
            str17 = viewerSubscriptionResponseJson.subscription_type;
        }
        if ((i & 131072) != 0) {
            viewerAgreementJson2 = viewerSubscriptionResponseJson.agreement;
        }
        AnonymousClass003.A0u(viewerTierJson2, viewerUsageJson2);
        String str18 = str11;
        String str19 = str13;
        String str20 = str14;
        boolean z3 = z2;
        return new ViewerSubscriptionResponseJson(viewerTierJson2, viewerUsageJson2, j3, j4, str, str10, str18, str12, str19, str20, z3, bool2, str15, str16, viewerComplimentaryOfferJson2, viewerManagementActionsJson2, str17, viewerAgreementJson2);
    }

    private final Integer purchasedUsedPercentOrNull() {
        long j = this.topup_total;
        if (j <= 0) {
            return null;
        }
        return Integer.valueOf(Ab3.A00(((j - ATD.A07(this.topup_balance, 0L, j)) * 100.0d) / j));
    }

    private final String tierIdOrNull() {
        String str;
        String str2 = this.tier.tier_id;
        if (str2 == null || C7BY.A0j(str2)) {
            str2 = null;
            if (this.tier.is_paid) {
                ViewerAgreementJson viewerAgreementJson = this.agreement;
                if (!AuraSubscriptionRepositoryJsonKt.PROVISIONING_STATUS.equals((viewerAgreementJson == null || (str = viewerAgreementJson.status) == null) ? null : str.toUpperCase(Locale.ROOT))) {
                    CFK.A06(AuraSubscriptionRepositoryJsonKt.TAG, C60O.A0r("Paid viewer with no tier_id (status=", viewerAgreementJson != null ? viewerAgreementJson.status : null));
                    return null;
                }
            }
        }
        return str2;
    }

    public final ViewerTierJson component1() {
        return this.tier;
    }

    public final String component10() {
        return this.topup_row_value_label;
    }

    public final boolean component11() {
        return this.topup_eligible;
    }

    public final Boolean component12() {
        return this.is_eligible_to_purchase;
    }

    public final String component13() {
        return this.billing_subtitle;
    }

    public final String component14() {
        return this.entry_point_cta_label;
    }

    public final ViewerComplimentaryOfferJson component15() {
        return this.complimentary_offer;
    }

    public final ViewerManagementActionsJson component16() {
        return this.management_actions;
    }

    public final String component17() {
        return this.subscription_type;
    }

    public final ViewerAgreementJson component18() {
        return this.agreement;
    }

    public final ViewerUsageJson component2() {
        return this.usage;
    }

    public final long component3() {
        return this.topup_balance;
    }

    public final long component4() {
        return this.topup_total;
    }

    public final String component5() {
        return this.status_subtitle;
    }

    public final String component6() {
        return this.usage_row_label;
    }

    public final String component7() {
        return this.usage_row_value_label;
    }

    public final String component8() {
        return this.usage_row_footer;
    }

    public final String component9() {
        return this.topup_row_label;
    }

    public final ViewerAgreementJson getAgreement() {
        return this.agreement;
    }

    public final String getBilling_subtitle() {
        return this.billing_subtitle;
    }

    public final ViewerComplimentaryOfferJson getComplimentary_offer() {
        return this.complimentary_offer;
    }

    public final String getEntry_point_cta_label() {
        return this.entry_point_cta_label;
    }

    public final ViewerManagementActionsJson getManagement_actions() {
        return this.management_actions;
    }

    public final String getStatus_subtitle() {
        return this.status_subtitle;
    }

    public final String getSubscription_type() {
        return this.subscription_type;
    }

    public final ViewerTierJson getTier() {
        return this.tier;
    }

    public final long getTopup_balance() {
        return this.topup_balance;
    }

    public final boolean getTopup_eligible() {
        return this.topup_eligible;
    }

    public final String getTopup_row_label() {
        return this.topup_row_label;
    }

    public final String getTopup_row_value_label() {
        return this.topup_row_value_label;
    }

    public final long getTopup_total() {
        return this.topup_total;
    }

    public final ViewerUsageJson getUsage() {
        return this.usage;
    }

    public final String getUsage_row_footer() {
        return this.usage_row_footer;
    }

    public final String getUsage_row_label() {
        return this.usage_row_label;
    }

    public final String getUsage_row_value_label() {
        return this.usage_row_value_label;
    }

    public int hashCode() {
        return ((((((((((((C0KA.A01((((((((((((AnonymousClass006.A06(this.topup_total, AnonymousClass006.A06(this.topup_balance, AnonymousClass005.A0F(this.usage, AnonymousClass005.A0E(this.tier)))) + AnonymousClass006.A0G(this.status_subtitle)) * 31) + AnonymousClass006.A0G(this.usage_row_label)) * 31) + AnonymousClass006.A0G(this.usage_row_value_label)) * 31) + AnonymousClass006.A0G(this.usage_row_footer)) * 31) + AnonymousClass006.A0G(this.topup_row_label)) * 31) + AnonymousClass006.A0G(this.topup_row_value_label)) * 31, this.topup_eligible) + AnonymousClass006.A0D(this.is_eligible_to_purchase)) * 31) + AnonymousClass006.A0G(this.billing_subtitle)) * 31) + AnonymousClass006.A0G(this.entry_point_cta_label)) * 31) + AnonymousClass006.A0D(this.complimentary_offer)) * 31) + AnonymousClass006.A0D(this.management_actions)) * 31) + AnonymousClass006.A0G(this.subscription_type)) * 31) + C3cH.A02(this.agreement);
    }

    public final Boolean is_eligible_to_purchase() {
        return this.is_eligible_to_purchase;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0188 A[PHI: r54
  0x0188: PHI (r54v3 java.lang.Long) = (r54v0 java.lang.Long), (r54v4 java.lang.Long) binds: [B:129:0x0186, B:127:0x0182] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019a A[PHI: r54
  0x019a: PHI (r54v1 java.lang.Long) = (r54v0 java.lang.Long), (r54v3 java.lang.Long), (r54v3 java.lang.Long) binds: [B:129:0x0186, B:131:0x018a, B:133:0x0198] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01af A[PHI: r5
  0x01af: PHI (r5v6 java.lang.String) = (r5v3 java.lang.String), (r5v7 java.lang.String) binds: [B:143:0x01ad, B:141:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01bb A[PHI: r5
  0x01bb: PHI (r5v4 java.lang.String) = (r5v3 java.lang.String), (r5v6 java.lang.String), (r5v6 java.lang.String) binds: [B:143:0x01ad, B:145:0x01b1, B:147:0x01b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bc A[PHI: r34
  0x00bc: PHI (r34v3 boolean) = (r34v0 boolean), (r34v4 boolean) binds: [B:61:0x00ba, B:59:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c8 A[PHI: r34
  0x00c8: PHI (r34v1 boolean) = (r34v0 boolean), (r34v3 boolean), (r34v3 boolean) binds: [B:61:0x00ba, B:63:0x00c0, B:65:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.subscription.repo.SubscriptionDetails toDomain() {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.ViewerSubscriptionResponseJson.toDomain():com.facebook.aura.subscription.repo.SubscriptionDetails");
    }

    public ViewerSubscriptionResponseJson(ViewerTierJson viewerTierJson, ViewerUsageJson viewerUsageJson, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, Boolean bool, String str7, String str8, ViewerComplimentaryOfferJson viewerComplimentaryOfferJson, ViewerManagementActionsJson viewerManagementActionsJson, String str9, ViewerAgreementJson viewerAgreementJson) {
        AnonymousClass003.A0u(viewerTierJson, viewerUsageJson);
        this.tier = viewerTierJson;
        this.usage = viewerUsageJson;
        this.topup_balance = j;
        this.topup_total = j2;
        this.status_subtitle = str;
        this.usage_row_label = str2;
        this.usage_row_value_label = str3;
        this.usage_row_footer = str4;
        this.topup_row_label = str5;
        this.topup_row_value_label = str6;
        this.topup_eligible = z;
        this.is_eligible_to_purchase = bool;
        this.billing_subtitle = str7;
        this.entry_point_cta_label = str8;
        this.complimentary_offer = viewerComplimentaryOfferJson;
        this.management_actions = viewerManagementActionsJson;
        this.subscription_type = str9;
        this.agreement = viewerAgreementJson;
    }

    public final ViewerSubscriptionResponseJson copy(ViewerTierJson viewerTierJson, ViewerUsageJson viewerUsageJson, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, Boolean bool, String str7, String str8, ViewerComplimentaryOfferJson viewerComplimentaryOfferJson, ViewerManagementActionsJson viewerManagementActionsJson, String str9, ViewerAgreementJson viewerAgreementJson) {
        AnonymousClass003.A0u(viewerTierJson, viewerUsageJson);
        return new ViewerSubscriptionResponseJson(viewerTierJson, viewerUsageJson, j, j2, str, str2, str3, str4, str5, str6, z, bool, str7, str8, viewerComplimentaryOfferJson, viewerManagementActionsJson, str9, viewerAgreementJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ViewerSubscriptionResponseJson(ViewerTierJson viewerTierJson, ViewerUsageJson viewerUsageJson, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, Boolean bool, String str7, String str8, ViewerComplimentaryOfferJson viewerComplimentaryOfferJson, ViewerManagementActionsJson viewerManagementActionsJson, String str9, ViewerAgreementJson viewerAgreementJson, int i, C06H c06h) {
        this((i & 1) != 0 ? new ViewerTierJson(null, "", null, false) : viewerTierJson, (i & 2) != 0 ? new ViewerUsageJson(null, null, null) : viewerUsageJson, C3cH.A03(i & 4, j), (i & 8) == 0 ? j2 : 0L, C3cG.A0e(str, i & 16), C3cG.A0e(str2, i & 32), C3cG.A0e(str3, i & 64), C3cG.A0e(str4, i & 128), C3cG.A0e(str5, i & 256), C3cG.A0e(str6, i & 512), C3cG.A1K(i & 1024, z), (i & 2048) != 0 ? null : bool, C3cG.A0e(str7, i & 4096), C3cG.A0e(str8, i & 8192), (i & 16384) != 0 ? null : viewerComplimentaryOfferJson, (i & 32768) != 0 ? null : viewerManagementActionsJson, C3cG.A0e(str9, i & 65536), (i & 131072) != 0 ? null : viewerAgreementJson);
    }

    public /* synthetic */ ViewerSubscriptionResponseJson(int i, ViewerTierJson viewerTierJson, ViewerUsageJson viewerUsageJson, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, Boolean bool, String str7, String str8, ViewerComplimentaryOfferJson viewerComplimentaryOfferJson, ViewerManagementActionsJson viewerManagementActionsJson, String str9, ViewerAgreementJson viewerAgreementJson, C2hx c2hx) {
        boolean z2 = z;
        if ((i & 1) == 0) {
            this.tier = new ViewerTierJson(null, "", null, false);
        } else {
            this.tier = viewerTierJson;
        }
        if ((i & 2) == 0) {
            this.usage = new ViewerUsageJson(null, null, null);
        } else {
            this.usage = viewerUsageJson;
        }
        if ((i & 4) == 0) {
            this.topup_balance = 0L;
        } else {
            this.topup_balance = j;
        }
        if ((i & 8) == 0) {
            this.topup_total = 0L;
        } else {
            this.topup_total = j2;
        }
        if ((i & 16) == 0) {
            this.status_subtitle = null;
        } else {
            this.status_subtitle = str;
        }
        if ((i & 32) == 0) {
            this.usage_row_label = null;
        } else {
            this.usage_row_label = str2;
        }
        if ((i & 64) == 0) {
            this.usage_row_value_label = null;
        } else {
            this.usage_row_value_label = str3;
        }
        if ((i & 128) == 0) {
            this.usage_row_footer = null;
        } else {
            this.usage_row_footer = str4;
        }
        if ((i & 256) == 0) {
            this.topup_row_label = null;
        } else {
            this.topup_row_label = str5;
        }
        if ((i & 512) == 0) {
            this.topup_row_value_label = null;
        } else {
            this.topup_row_value_label = str6;
        }
        this.topup_eligible = (i & 1024) == 0 ? false : z2;
        if ((i & 2048) == 0) {
            this.is_eligible_to_purchase = null;
        } else {
            this.is_eligible_to_purchase = bool;
        }
        if ((i & 4096) == 0) {
            this.billing_subtitle = null;
        } else {
            this.billing_subtitle = str7;
        }
        if ((i & 8192) == 0) {
            this.entry_point_cta_label = null;
        } else {
            this.entry_point_cta_label = str8;
        }
        if ((i & 16384) == 0) {
            this.complimentary_offer = null;
        } else {
            this.complimentary_offer = viewerComplimentaryOfferJson;
        }
        if ((32768 & i) == 0) {
            this.management_actions = null;
        } else {
            this.management_actions = viewerManagementActionsJson;
        }
        if ((65536 & i) == 0) {
            this.subscription_type = null;
        } else {
            this.subscription_type = str9;
        }
        if ((i & 131072) == 0) {
            this.agreement = null;
        } else {
            this.agreement = viewerAgreementJson;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewerSubscriptionResponseJson() {
        long j = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        this((ViewerTierJson) null, (ViewerUsageJson) objArr, j, j, (String) objArr2, (String) objArr3, (String) objArr4, (String) objArr5, (String) objArr6, (String) objArr7, false, (Boolean) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (ViewerComplimentaryOfferJson) (0 == true ? 1 : 0), (ViewerManagementActionsJson) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (ViewerAgreementJson) (0 == true ? 1 : 0), 262143, (C06H) (0 == true ? 1 : 0));
    }
}
