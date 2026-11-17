package com.facebook.aura.subscription.repo;

import X.AGI;
import X.AHD;
import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0953AJg;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ViewerCatalogResponseJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final ViewerBlockedActionDialogJson blocked_action_dialog;
    public final List<ViewerCheckoutAddOnJson> checkout_add_ons;
    public final List<ViewerCreditPackJson> credit_packs;
    public final ViewerNameDialogJson name_dialog;
    public final boolean plan_change_blocked;
    public final List<ViewerCatalogPlanJson> plans;
    public final String purchase_cta_label;
    public final DisclaimerJson purchase_disclaimer;
    public final DisclaimerJson purchase_notice;
    public final boolean requires_name;
    public final String suggested_tier_id;
    public final String topup_cta_label;
    public final String topup_disclaimer;
    public final DisclaimerJson topup_disclaimer_block;

    public final class Companion {
        public final C9hr<ViewerCatalogResponseJson> serializer() {
            return ViewerCatalogResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{AbstractC5321DgF.A02(num, ViewerCatalogResponseJson$Companion$$childSerializers$1.INSTANCE), null, AbstractC5321DgF.A02(num, ViewerCatalogResponseJson$Companion$$childSerializers$2.INSTANCE), null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, ViewerCatalogResponseJson$Companion$$childSerializers$3.INSTANCE)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewerCatalogResponseJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(c0881AGi, null, c0881AGi, null, null, null, null, null, null, false, null, false, null, c0881AGi);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerCatalogResponseJson) {
                ViewerCatalogResponseJson viewerCatalogResponseJson = (ViewerCatalogResponseJson) obj;
                if (!C7384Etj.areEqual(this.plans, viewerCatalogResponseJson.plans) || !C7384Etj.areEqual(this.suggested_tier_id, viewerCatalogResponseJson.suggested_tier_id) || !C7384Etj.areEqual(this.credit_packs, viewerCatalogResponseJson.credit_packs) || !C7384Etj.areEqual(this.topup_disclaimer, viewerCatalogResponseJson.topup_disclaimer) || !C7384Etj.areEqual(this.purchase_disclaimer, viewerCatalogResponseJson.purchase_disclaimer) || !C7384Etj.areEqual(this.topup_disclaimer_block, viewerCatalogResponseJson.topup_disclaimer_block) || !C7384Etj.areEqual(this.purchase_notice, viewerCatalogResponseJson.purchase_notice) || !C7384Etj.areEqual(this.purchase_cta_label, viewerCatalogResponseJson.purchase_cta_label) || !C7384Etj.areEqual(this.topup_cta_label, viewerCatalogResponseJson.topup_cta_label) || this.plan_change_blocked != viewerCatalogResponseJson.plan_change_blocked || !C7384Etj.areEqual(this.blocked_action_dialog, viewerCatalogResponseJson.blocked_action_dialog) || this.requires_name != viewerCatalogResponseJson.requires_name || !C7384Etj.areEqual(this.name_dialog, viewerCatalogResponseJson.name_dialog) || !C7384Etj.areEqual(this.checkout_add_ons, viewerCatalogResponseJson.checkout_add_ons)) {
                }
            }
            return false;
        }
        return true;
    }

    private final Disclaimer topUpDisclaimer() {
        Disclaimer domain;
        DisclaimerJson disclaimerJson = this.topup_disclaimer_block;
        if (disclaimerJson != null && (domain = disclaimerJson.toDomain()) != null) {
            return domain;
        }
        String str = this.topup_disclaimer;
        if (str == null || C7BY.A0j(str)) {
            return null;
        }
        return new Disclaimer(AGI.A0E(new DisclaimerRun(str, null)), C0953AJg.A03);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerCatalogResponseJson viewerCatalogResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(viewerCatalogResponseJson.plans)) {
            c9j5.AAQ(viewerCatalogResponseJson.plans, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || viewerCatalogResponseJson.suggested_tier_id != null) {
            c9j5.AAP(viewerCatalogResponseJson.suggested_tier_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(viewerCatalogResponseJson.credit_packs)) {
            c9j5.AAQ(viewerCatalogResponseJson.credit_packs, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || viewerCatalogResponseJson.topup_disclaimer != null) {
            c9j5.AAP(viewerCatalogResponseJson.topup_disclaimer, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || viewerCatalogResponseJson.purchase_disclaimer != null) {
            c9j5.AAP(viewerCatalogResponseJson.purchase_disclaimer, DisclaimerJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || viewerCatalogResponseJson.topup_disclaimer_block != null) {
            c9j5.AAP(viewerCatalogResponseJson.topup_disclaimer_block, DisclaimerJson$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || viewerCatalogResponseJson.purchase_notice != null) {
            c9j5.AAP(viewerCatalogResponseJson.purchase_notice, DisclaimerJson$$serializer.INSTANCE, c9iZ, 6);
        }
        if (zAfR || viewerCatalogResponseJson.purchase_cta_label != null) {
            c9j5.AAP(viewerCatalogResponseJson.purchase_cta_label, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || viewerCatalogResponseJson.topup_cta_label != null) {
            c9j5.AAP(viewerCatalogResponseJson.topup_cta_label, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || viewerCatalogResponseJson.plan_change_blocked) {
            c9j5.AA7(c9iZ, 9, viewerCatalogResponseJson.plan_change_blocked);
        }
        if (zAfR || viewerCatalogResponseJson.blocked_action_dialog != null) {
            c9j5.AAP(viewerCatalogResponseJson.blocked_action_dialog, ViewerBlockedActionDialogJson$$serializer.INSTANCE, c9iZ, 10);
        }
        if (zAfR || viewerCatalogResponseJson.requires_name) {
            c9j5.AA7(c9iZ, 11, viewerCatalogResponseJson.requires_name);
        }
        if (zAfR || viewerCatalogResponseJson.name_dialog != null) {
            c9j5.AAP(viewerCatalogResponseJson.name_dialog, ViewerNameDialogJson$$serializer.INSTANCE, c9iZ, 12);
        }
        if (zAfR || !C3cG.A1L(viewerCatalogResponseJson.checkout_add_ons)) {
            c9j5.AAQ(viewerCatalogResponseJson.checkout_add_ons, C3cH.A15(f0cArr, 13), c9iZ, 13);
        }
    }

    public final List<ViewerCatalogPlanJson> component1() {
        return this.plans;
    }

    public final boolean component10() {
        return this.plan_change_blocked;
    }

    public final ViewerBlockedActionDialogJson component11() {
        return this.blocked_action_dialog;
    }

    public final boolean component12() {
        return this.requires_name;
    }

    public final ViewerNameDialogJson component13() {
        return this.name_dialog;
    }

    public final List<ViewerCheckoutAddOnJson> component14() {
        return this.checkout_add_ons;
    }

    public final String component2() {
        return this.suggested_tier_id;
    }

    public final List<ViewerCreditPackJson> component3() {
        return this.credit_packs;
    }

    public final String component4() {
        return this.topup_disclaimer;
    }

    public final DisclaimerJson component5() {
        return this.purchase_disclaimer;
    }

    public final DisclaimerJson component6() {
        return this.topup_disclaimer_block;
    }

    public final DisclaimerJson component7() {
        return this.purchase_notice;
    }

    public final String component8() {
        return this.purchase_cta_label;
    }

    public final String component9() {
        return this.topup_cta_label;
    }

    public final ViewerBlockedActionDialogJson getBlocked_action_dialog() {
        return this.blocked_action_dialog;
    }

    public final List<ViewerCheckoutAddOnJson> getCheckout_add_ons() {
        return this.checkout_add_ons;
    }

    public final List<ViewerCreditPackJson> getCredit_packs() {
        return this.credit_packs;
    }

    public final ViewerNameDialogJson getName_dialog() {
        return this.name_dialog;
    }

    public final boolean getPlan_change_blocked() {
        return this.plan_change_blocked;
    }

    public final List<ViewerCatalogPlanJson> getPlans() {
        return this.plans;
    }

    public final String getPurchase_cta_label() {
        return this.purchase_cta_label;
    }

    public final DisclaimerJson getPurchase_disclaimer() {
        return this.purchase_disclaimer;
    }

    public final DisclaimerJson getPurchase_notice() {
        return this.purchase_notice;
    }

    public final boolean getRequires_name() {
        return this.requires_name;
    }

    public final String getSuggested_tier_id() {
        return this.suggested_tier_id;
    }

    public final String getTopup_cta_label() {
        return this.topup_cta_label;
    }

    public final String getTopup_disclaimer() {
        return this.topup_disclaimer;
    }

    public final DisclaimerJson getTopup_disclaimer_block() {
        return this.topup_disclaimer_block;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.checkout_add_ons, (C0KA.A01((C0KA.A01((((((((((((AnonymousClass005.A0F(this.credit_packs, (AnonymousClass005.A0E(this.plans) + AnonymousClass006.A0G(this.suggested_tier_id)) * 31) + AnonymousClass006.A0G(this.topup_disclaimer)) * 31) + AnonymousClass006.A0D(this.purchase_disclaimer)) * 31) + AnonymousClass006.A0D(this.topup_disclaimer_block)) * 31) + AnonymousClass006.A0D(this.purchase_notice)) * 31) + AnonymousClass006.A0G(this.purchase_cta_label)) * 31) + AnonymousClass006.A0G(this.topup_cta_label)) * 31, this.plan_change_blocked) + AnonymousClass006.A0D(this.blocked_action_dialog)) * 31, this.requires_name) + C3cH.A02(this.name_dialog)) * 31);
    }

    public final SubscriptionCatalog toCatalog() {
        List<ViewerCatalogPlanJson> list = this.plans;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<ViewerCatalogPlanJson> it = list.iterator();
        while (it.hasNext()) {
            SubscriptionProduct domain = it.next().toDomain();
            if (domain != null) {
                arrayListA0h.add(domain);
            }
        }
        AHD ahdA07 = AGI.A07(arrayListA0h);
        String str = this.suggested_tier_id;
        if (str == null || C7BY.A0j(str)) {
            str = null;
        }
        DisclaimerJson disclaimerJson = this.purchase_disclaimer;
        Disclaimer domain2 = disclaimerJson != null ? disclaimerJson.toDomain() : null;
        DisclaimerJson disclaimerJson2 = this.purchase_notice;
        Disclaimer domain3 = disclaimerJson2 != null ? disclaimerJson2.toDomain() : null;
        boolean z = this.plan_change_blocked;
        ViewerBlockedActionDialogJson viewerBlockedActionDialogJson = this.blocked_action_dialog;
        SubscriptionBlockedActionDialog domain4 = viewerBlockedActionDialogJson != null ? viewerBlockedActionDialogJson.toDomain() : null;
        boolean z2 = this.requires_name;
        ViewerNameDialogJson viewerNameDialogJson = this.name_dialog;
        SubscriptionNameDialog domain5 = viewerNameDialogJson != null ? viewerNameDialogJson.toDomain() : null;
        String str2 = this.purchase_cta_label;
        if (str2 == null || C7BY.A0j(str2)) {
            str2 = null;
        }
        List<ViewerCheckoutAddOnJson> list2 = this.checkout_add_ons;
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator<ViewerCheckoutAddOnJson> it2 = list2.iterator();
        while (it2.hasNext()) {
            SubscriptionCheckoutAddOn domain6 = it2.next().toDomain();
            if (domain6 != null) {
                arrayListA0h2.add(domain6);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayListA0h3 = C3cG.A0h();
        for (Object obj : arrayListA0h2) {
            AnonymousClass006.A1P(((SubscriptionCheckoutAddOn) obj).type, obj, hashSet, arrayListA0h3);
        }
        return new SubscriptionCatalog(ahdA07, str, domain2, domain3, z, domain4, z2, domain5, str2, AGI.A07(arrayListA0h3));
    }

    public final TopUpCatalog toTopUpCatalog() {
        List<ViewerCreditPackJson> list = this.credit_packs;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<ViewerCreditPackJson> it = list.iterator();
        while (it.hasNext()) {
            TopUpPack domain = it.next().toDomain();
            if (domain != null) {
                arrayListA0h.add(domain);
            }
        }
        Disclaimer disclaimer = topUpDisclaimer();
        boolean z = this.requires_name;
        ViewerNameDialogJson viewerNameDialogJson = this.name_dialog;
        SubscriptionNameDialog domain2 = viewerNameDialogJson != null ? viewerNameDialogJson.toDomain() : null;
        String str = this.topup_cta_label;
        if (str == null || C7BY.A0j(str)) {
            str = null;
        }
        return new TopUpCatalog(arrayListA0h, disclaimer, z, domain2, str);
    }

    public final ViewerCatalogResponseJson copy(List<ViewerCatalogPlanJson> list, String str, List<ViewerCreditPackJson> list2, String str2, DisclaimerJson disclaimerJson, DisclaimerJson disclaimerJson2, DisclaimerJson disclaimerJson3, String str3, String str4, boolean z, ViewerBlockedActionDialogJson viewerBlockedActionDialogJson, boolean z2, ViewerNameDialogJson viewerNameDialogJson, List<ViewerCheckoutAddOnJson> list3) {
        AnonymousClass003.A0v(list, list2);
        C7384Etj.A0Y(list3, 13);
        return new ViewerCatalogResponseJson(list, str, list2, str2, disclaimerJson, disclaimerJson2, disclaimerJson3, str3, str4, z, viewerBlockedActionDialogJson, z2, viewerNameDialogJson, list3);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ ViewerCatalogResponseJson copy$default(ViewerCatalogResponseJson viewerCatalogResponseJson, List list, String str, List list2, String str2, DisclaimerJson disclaimerJson, DisclaimerJson disclaimerJson2, DisclaimerJson disclaimerJson3, String str3, String str4, boolean z, ViewerBlockedActionDialogJson viewerBlockedActionDialogJson, boolean z2, ViewerNameDialogJson viewerNameDialogJson, List list3, int i, Object obj) {
        String str5 = str;
        List list4 = list2;
        String str6 = str2;
        DisclaimerJson disclaimerJson4 = disclaimerJson;
        DisclaimerJson disclaimerJson5 = disclaimerJson2;
        DisclaimerJson disclaimerJson6 = disclaimerJson3;
        String str7 = str3;
        String str8 = str4;
        boolean z3 = z;
        ViewerBlockedActionDialogJson viewerBlockedActionDialogJson2 = viewerBlockedActionDialogJson;
        boolean z4 = z2;
        ViewerNameDialogJson viewerNameDialogJson2 = viewerNameDialogJson;
        List list5 = list3;
        if ((i & 1) != 0) {
            list = viewerCatalogResponseJson.plans;
        }
        if ((i & 2) != 0) {
            str5 = viewerCatalogResponseJson.suggested_tier_id;
        }
        if ((i & 4) != 0) {
            list4 = viewerCatalogResponseJson.credit_packs;
        }
        if ((i & 8) != 0) {
            str6 = viewerCatalogResponseJson.topup_disclaimer;
        }
        if ((i & 16) != 0) {
            disclaimerJson4 = viewerCatalogResponseJson.purchase_disclaimer;
        }
        if ((i & 32) != 0) {
            disclaimerJson5 = viewerCatalogResponseJson.topup_disclaimer_block;
        }
        if ((i & 64) != 0) {
            disclaimerJson6 = viewerCatalogResponseJson.purchase_notice;
        }
        if ((i & 128) != 0) {
            str7 = viewerCatalogResponseJson.purchase_cta_label;
        }
        if ((i & 256) != 0) {
            str8 = viewerCatalogResponseJson.topup_cta_label;
        }
        if ((i & 512) != 0) {
            z3 = viewerCatalogResponseJson.plan_change_blocked;
        }
        if ((i & 1024) != 0) {
            viewerBlockedActionDialogJson2 = viewerCatalogResponseJson.blocked_action_dialog;
        }
        if ((i & 2048) != 0) {
            z4 = viewerCatalogResponseJson.requires_name;
        }
        if ((i & 4096) != 0) {
            viewerNameDialogJson2 = viewerCatalogResponseJson.name_dialog;
        }
        if ((i & 8192) != 0) {
            list5 = viewerCatalogResponseJson.checkout_add_ons;
        }
        return viewerCatalogResponseJson.copy(list, str5, list4, str6, disclaimerJson4, disclaimerJson5, disclaimerJson6, str7, str8, z3, viewerBlockedActionDialogJson2, z4, viewerNameDialogJson2, list5);
    }

    public /* synthetic */ ViewerCatalogResponseJson(int i, List list, String str, List list2, String str2, DisclaimerJson disclaimerJson, DisclaimerJson disclaimerJson2, DisclaimerJson disclaimerJson3, String str3, String str4, boolean z, ViewerBlockedActionDialogJson viewerBlockedActionDialogJson, boolean z2, ViewerNameDialogJson viewerNameDialogJson, List list3, C2hx c2hx) {
        List list4 = list3;
        this.plans = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.suggested_tier_id = null;
        } else {
            this.suggested_tier_id = str;
        }
        if ((i & 4) == 0) {
            this.credit_packs = C0881AGi.A00;
        } else {
            this.credit_packs = list2;
        }
        if ((i & 8) == 0) {
            this.topup_disclaimer = null;
        } else {
            this.topup_disclaimer = str2;
        }
        if ((i & 16) == 0) {
            this.purchase_disclaimer = null;
        } else {
            this.purchase_disclaimer = disclaimerJson;
        }
        if ((i & 32) == 0) {
            this.topup_disclaimer_block = null;
        } else {
            this.topup_disclaimer_block = disclaimerJson2;
        }
        if ((i & 64) == 0) {
            this.purchase_notice = null;
        } else {
            this.purchase_notice = disclaimerJson3;
        }
        if ((i & 128) == 0) {
            this.purchase_cta_label = null;
        } else {
            this.purchase_cta_label = str3;
        }
        if ((i & 256) == 0) {
            this.topup_cta_label = null;
        } else {
            this.topup_cta_label = str4;
        }
        if ((i & 512) == 0) {
            this.plan_change_blocked = false;
        } else {
            this.plan_change_blocked = z;
        }
        if ((i & 1024) == 0) {
            this.blocked_action_dialog = null;
        } else {
            this.blocked_action_dialog = viewerBlockedActionDialogJson;
        }
        if ((i & 2048) == 0) {
            this.requires_name = false;
        } else {
            this.requires_name = z2;
        }
        if ((i & 4096) == 0) {
            this.name_dialog = null;
        } else {
            this.name_dialog = viewerNameDialogJson;
        }
        this.checkout_add_ons = (i & 8192) == 0 ? C0881AGi.A00 : list4;
    }

    public /* synthetic */ ViewerCatalogResponseJson(List list, String str, List list2, String str2, DisclaimerJson disclaimerJson, DisclaimerJson disclaimerJson2, DisclaimerJson disclaimerJson3, String str3, String str4, boolean z, ViewerBlockedActionDialogJson viewerBlockedActionDialogJson, boolean z2, ViewerNameDialogJson viewerNameDialogJson, List list3, int i, C06H c06h) {
        this((i & 1) != 0 ? C0881AGi.A00 : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? C0881AGi.A00 : list2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : disclaimerJson, (i & 32) != 0 ? null : disclaimerJson2, (i & 64) != 0 ? null : disclaimerJson3, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, C3cG.A1K(i & 512, z), (i & 1024) != 0 ? null : viewerBlockedActionDialogJson, (i & 2048) == 0 ? z2 : false, (i & 4096) == 0 ? viewerNameDialogJson : null, (i & 8192) != 0 ? C0881AGi.A00 : list3);
    }

    public ViewerCatalogResponseJson(List<ViewerCatalogPlanJson> list, String str, List<ViewerCreditPackJson> list2, String str2, DisclaimerJson disclaimerJson, DisclaimerJson disclaimerJson2, DisclaimerJson disclaimerJson3, String str3, String str4, boolean z, ViewerBlockedActionDialogJson viewerBlockedActionDialogJson, boolean z2, ViewerNameDialogJson viewerNameDialogJson, List<ViewerCheckoutAddOnJson> list3) {
        AnonymousClass003.A0v(list, list2);
        C7384Etj.A0Y(list3, 13);
        this.plans = list;
        this.suggested_tier_id = str;
        this.credit_packs = list2;
        this.topup_disclaimer = str2;
        this.purchase_disclaimer = disclaimerJson;
        this.topup_disclaimer_block = disclaimerJson2;
        this.purchase_notice = disclaimerJson3;
        this.purchase_cta_label = str3;
        this.topup_cta_label = str4;
        this.plan_change_blocked = z;
        this.blocked_action_dialog = viewerBlockedActionDialogJson;
        this.requires_name = z2;
        this.name_dialog = viewerNameDialogJson;
        this.checkout_add_ons = list3;
    }
}
