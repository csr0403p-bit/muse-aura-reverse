package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
import X.AnonymousClass002;
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
/* loaded from: classes4.dex */
public final class ViewerManagementCtaJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final String action;
    public final ViewerCtaConfirmationJson confirmation;
    public final String label;
    public final ViewerCtaParamsJson params;
    public final String short_label;
    public final String subtitle;

    public final class Companion {
        public final C9hr<ViewerManagementCtaJson> serializer() {
            return ViewerManagementCtaJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerManagementCtaJson viewerManagementCtaJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(viewerManagementCtaJson.label)) {
            c9j5.AAV(viewerManagementCtaJson.label, c9iZ, 0);
        }
        if (zAfR || viewerManagementCtaJson.action != null) {
            c9j5.AAP(viewerManagementCtaJson.action, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || viewerManagementCtaJson.params != null) {
            c9j5.AAP(viewerManagementCtaJson.params, ViewerCtaParamsJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || viewerManagementCtaJson.confirmation != null) {
            c9j5.AAP(viewerManagementCtaJson.confirmation, ViewerCtaConfirmationJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || viewerManagementCtaJson.subtitle != null) {
            c9j5.AAP(viewerManagementCtaJson.subtitle, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || viewerManagementCtaJson.short_label != null) {
            c9j5.AAP(viewerManagementCtaJson.short_label, C07779iq.A01, c9iZ, 5);
        }
    }

    public final ViewerManagementCtaJson copy(String str, String str2, ViewerCtaParamsJson viewerCtaParamsJson, ViewerCtaConfirmationJson viewerCtaConfirmationJson, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        return new ViewerManagementCtaJson(str, str2, viewerCtaParamsJson, viewerCtaConfirmationJson, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerManagementCtaJson) {
                ViewerManagementCtaJson viewerManagementCtaJson = (ViewerManagementCtaJson) obj;
                if (!C7384Etj.areEqual(this.label, viewerManagementCtaJson.label) || !C7384Etj.areEqual(this.action, viewerManagementCtaJson.action) || !C7384Etj.areEqual(this.params, viewerManagementCtaJson.params) || !C7384Etj.areEqual(this.confirmation, viewerManagementCtaJson.confirmation) || !C7384Etj.areEqual(this.subtitle, viewerManagementCtaJson.subtitle) || !C7384Etj.areEqual(this.short_label, viewerManagementCtaJson.short_label)) {
                }
            }
            return false;
        }
        return true;
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionManagementAction.values().length];
            try {
                AnonymousClass002.A13(SubscriptionManagementAction.PURCHASE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SubscriptionManagementAction.OPEN_URL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(SubscriptionManagementAction.CHANGE_PLAN, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(SubscriptionManagementAction.OPEN_PAYWALL, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(SubscriptionManagementAction.BUY_TOPUP, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(SubscriptionManagementAction.MANAGE_BILLING, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(SubscriptionManagementAction.CANCEL, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(SubscriptionManagementAction.REACTIVATE, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(SubscriptionManagementAction.REFRESH, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(SubscriptionManagementAction.CLAIM_META_HOME_LINK, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(SubscriptionManagementAction.REDEEM_COMPLIMENTARY, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(SubscriptionManagementAction.DISMISS, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ ViewerManagementCtaJson copy$default(ViewerManagementCtaJson viewerManagementCtaJson, String str, String str2, ViewerCtaParamsJson viewerCtaParamsJson, ViewerCtaConfirmationJson viewerCtaConfirmationJson, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerManagementCtaJson.label;
        }
        if ((i & 2) != 0) {
            str2 = viewerManagementCtaJson.action;
        }
        if ((i & 4) != 0) {
            viewerCtaParamsJson = viewerManagementCtaJson.params;
        }
        if ((i & 8) != 0) {
            viewerCtaConfirmationJson = viewerManagementCtaJson.confirmation;
        }
        if ((i & 16) != 0) {
            str3 = viewerManagementCtaJson.subtitle;
        }
        if ((i & 32) != 0) {
            str4 = viewerManagementCtaJson.short_label;
        }
        return viewerManagementCtaJson.copy(str, str2, viewerCtaParamsJson, viewerCtaConfirmationJson, str3, str4);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.action;
    }

    public final ViewerCtaParamsJson component3() {
        return this.params;
    }

    public final ViewerCtaConfirmationJson component4() {
        return this.confirmation;
    }

    public final String component5() {
        return this.subtitle;
    }

    public final String component6() {
        return this.short_label;
    }

    public final String getAction() {
        return this.action;
    }

    public final ViewerCtaConfirmationJson getConfirmation() {
        return this.confirmation;
    }

    public final String getLabel() {
        return this.label;
    }

    public final ViewerCtaParamsJson getParams() {
        return this.params;
    }

    public final String getShort_label() {
        return this.short_label;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        return ((((((((AnonymousClass001.A0G(this.label) + AnonymousClass006.A0G(this.action)) * 31) + AnonymousClass006.A0D(this.params)) * 31) + AnonymousClass006.A0D(this.confirmation)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass005.A0H(this.short_label);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.subscription.repo.SubscriptionManagementCta toDomain() {
        /*
            r11 = this;
            java.lang.String r0 = r11.label
            boolean r0 = X.C7BY.A0j(r0)
            r2 = 0
            if (r0 != 0) goto L95
            com.facebook.aura.subscription.repo.SubscriptionManagementAction$Companion r1 = com.facebook.aura.subscription.repo.SubscriptionManagementAction.Companion
            java.lang.String r0 = r11.action
            com.facebook.aura.subscription.repo.SubscriptionManagementAction r4 = r1.fromServerValue(r0)
            if (r4 == 0) goto L95
            com.facebook.aura.subscription.repo.ViewerCtaParamsJson r0 = r11.params
            if (r0 == 0) goto L21
            java.lang.String r5 = r0.target_tier_id
            if (r5 == 0) goto L21
            boolean r0 = X.C7BY.A0j(r5)
            if (r0 == 0) goto L22
        L21:
            r5 = r2
        L22:
            com.facebook.aura.subscription.repo.ViewerCtaParamsJson r0 = r11.params
            if (r0 == 0) goto L30
            java.lang.String r6 = r0.product_id
            if (r6 == 0) goto L30
            boolean r0 = X.C7BY.A0j(r6)
            if (r0 == 0) goto L31
        L30:
            r6 = r2
        L31:
            com.facebook.aura.subscription.repo.ViewerCtaParamsJson r0 = r11.params
            if (r0 == 0) goto L3f
            java.lang.String r7 = r0.url
            if (r7 == 0) goto L3f
            boolean r0 = X.C7BY.A0j(r7)
            if (r0 == 0) goto L40
        L3f:
            r7 = r2
        L40:
            int r0 = r4.ordinal()
            switch(r0) {
                case 0: goto L63;
                case 1: goto L63;
                case 2: goto L4c;
                case 3: goto L63;
                case 4: goto L63;
                case 5: goto L63;
                case 6: goto L63;
                case 7: goto L4e;
                case 8: goto L63;
                case 9: goto L63;
                case 10: goto L63;
                case 11: goto L63;
                default: goto L47;
            }
        L47:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L4c:
            r0 = r6
            goto L4f
        L4e:
            r0 = r7
        L4f:
            if (r0 != 0) goto L63
            java.lang.String r0 = "Dropping "
            java.lang.StringBuilder r1 = X.C3cG.A0f(r4, r0)
            java.lang.String r0 = " CTA: required parameter missing"
            java.lang.String r1 = X.AnonymousClass001.A0v(r0, r1)
            java.lang.String r0 = "AuraSubscriptionRepositoryJson"
            X.CFK.A06(r0, r1)
            return r2
        L63:
            java.lang.String r3 = r11.label
            com.facebook.aura.subscription.repo.ViewerCtaConfirmationJson r0 = r11.confirmation
            if (r0 == 0) goto L93
            com.facebook.aura.subscription.repo.SubscriptionCtaConfirmation r8 = r0.toDomain()
        L6d:
            java.lang.String r9 = r11.subtitle
            if (r9 == 0) goto L77
            boolean r0 = X.C7BY.A0j(r9)
            if (r0 == 0) goto L78
        L77:
            r9 = r2
        L78:
            com.facebook.aura.subscription.repo.ViewerCtaConfirmationJson r0 = r11.confirmation
            if (r0 == 0) goto L91
            com.facebook.aura.subscription.repo.SubscriptionConfidentialVmConfirmation r10 = r0.toConfidentialVmDomain()
        L80:
            java.lang.String r11 = r11.short_label
            if (r11 == 0) goto L8a
            boolean r0 = X.C7BY.A0j(r11)
            if (r0 == 0) goto L8b
        L8a:
            r11 = r2
        L8b:
            com.facebook.aura.subscription.repo.SubscriptionManagementCta r2 = new com.facebook.aura.subscription.repo.SubscriptionManagementCta
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        L91:
            r10 = r2
            goto L80
        L93:
            r8 = r2
            goto L6d
        L95:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.ViewerManagementCtaJson.toDomain():com.facebook.aura.subscription.repo.SubscriptionManagementCta");
    }

    public /* synthetic */ ViewerManagementCtaJson(int i, String str, String str2, ViewerCtaParamsJson viewerCtaParamsJson, ViewerCtaConfirmationJson viewerCtaConfirmationJson, String str3, String str4, C2hx c2hx) {
        this.label = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.action = null;
        } else {
            this.action = str2;
        }
        if ((i & 4) == 0) {
            this.params = null;
        } else {
            this.params = viewerCtaParamsJson;
        }
        if ((i & 8) == 0) {
            this.confirmation = null;
        } else {
            this.confirmation = viewerCtaConfirmationJson;
        }
        if ((i & 16) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        if ((i & 32) == 0) {
            this.short_label = null;
        } else {
            this.short_label = str4;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ViewerManagementCtaJson(String str, String str2, ViewerCtaParamsJson viewerCtaParamsJson, ViewerCtaConfirmationJson viewerCtaConfirmationJson, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        this.label = str;
        this.action = str2;
        this.params = viewerCtaParamsJson;
        this.confirmation = viewerCtaConfirmationJson;
        this.subtitle = str3;
        this.short_label = str4;
    }

    public /* synthetic */ ViewerManagementCtaJson(String str, String str2, ViewerCtaParamsJson viewerCtaParamsJson, ViewerCtaConfirmationJson viewerCtaConfirmationJson, String str3, String str4, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : viewerCtaParamsJson, (i & 8) != 0 ? null : viewerCtaConfirmationJson, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }

    public ViewerManagementCtaJson() {
        this("", null, null, null, null, null);
    }
}
