package com.facebook.aura.subscription.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.subscription.view.AuraSubscriptionSheetKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ViewerSubscriptionResponseJson$$serializer implements C9cd<ViewerSubscriptionResponseJson> {
    public static final int $stable = 0;
    public static final ViewerSubscriptionResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ViewerSubscriptionResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        C2hx c2hx = null;
        ViewerAgreementJson viewerAgreementJson = null;
        String strA0g = null;
        String strA0m = null;
        String strA0g2 = null;
        ViewerManagementActionsJson viewerManagementActionsJson = null;
        ViewerComplimentaryOfferJson viewerComplimentaryOfferJson = null;
        String strA0t = null;
        Boolean bool = null;
        String strA0p = null;
        String str = null;
        String strA0n = null;
        String strA0o = null;
        ViewerTierJson viewerTierJson = null;
        String str2 = null;
        ViewerUsageJson viewerUsageJson = null;
        long jA8X = 0;
        long jA8X2 = 0;
        int i2 = 0;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ViewerSubscriptionResponseJson(i2, viewerTierJson, viewerUsageJson, jA8X, jA8X2, strA0g2, strA0m, strA0n, strA0o, str, strA0p, zA8G, bool, strA0g, strA0t, viewerComplimentaryOfferJson, viewerManagementActionsJson, str2, viewerAgreementJson, c2hx);
                case 0:
                    viewerTierJson = (ViewerTierJson) c9j4A55.A8a(ViewerTierJson$$serializer.INSTANCE, c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    viewerUsageJson = (ViewerUsageJson) c9j4A55.A8a(ViewerUsageJson$$serializer.INSTANCE, c9iZ, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    jA8X = c9j4A55.A8X(c9iZ, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    jA8X2 = c9j4A55.A8X(c9iZ, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i2 |= 32;
                    continue;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i2 |= 64;
                    continue;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
                    i2 |= 128;
                    continue;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i2 |= 256;
                    continue;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i2 |= 512;
                    continue;
                case 10:
                    zA8G = c9j4A55.A8G(c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    strA0t = C3cI.A0t(c9iZ, c9j4A55);
                    i2 |= 8192;
                    continue;
                case 14:
                    viewerComplimentaryOfferJson = (ViewerComplimentaryOfferJson) c9j4A55.A8Z(ViewerComplimentaryOfferJson$$serializer.INSTANCE, c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    viewerManagementActionsJson = (ViewerManagementActionsJson) c9j4A55.A8Z(ViewerManagementActionsJson$$serializer.INSTANCE, c9iZ, 15);
                    i = 32768;
                    break;
                case 16:
                    str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    viewerAgreementJson = (ViewerAgreementJson) c9j4A55.A8Z(ViewerAgreementJson$$serializer.INSTANCE, c9iZ, 17);
                    i2 |= 131072;
                    continue;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        ViewerSubscriptionResponseJson$$serializer viewerSubscriptionResponseJson$$serializer = new ViewerSubscriptionResponseJson$$serializer();
        INSTANCE = viewerSubscriptionResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.subscription.repo.ViewerSubscriptionResponseJson", viewerSubscriptionResponseJson$$serializer, 18);
        c9iKA1C.A08("tier", true);
        c9iKA1C.A08(AuraSubscriptionSheetKt.USAGE_TOKEN, true);
        c9iKA1C.A08("topup_balance", true);
        c9iKA1C.A08("topup_total", true);
        c9iKA1C.A08("status_subtitle", true);
        c9iKA1C.A08("usage_row_label", true);
        c9iKA1C.A08("usage_row_value_label", true);
        c9iKA1C.A08("usage_row_footer", true);
        c9iKA1C.A08("topup_row_label", true);
        c9iKA1C.A08("topup_row_value_label", true);
        c9iKA1C.A08("topup_eligible", true);
        c9iKA1C.A08("is_eligible_to_purchase", true);
        c9iKA1C.A08("billing_subtitle", true);
        c9iKA1C.A08("entry_point_cta_label", true);
        c9iKA1C.A08("complimentary_offer", true);
        c9iKA1C.A08("management_actions", true);
        c9iKA1C.A08("subscription_type", true);
        c9iKA1C.A08("agreement", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        ViewerTierJson$$serializer viewerTierJson$$serializer = ViewerTierJson$$serializer.INSTANCE;
        ViewerUsageJson$$serializer viewerUsageJson$$serializer = ViewerUsageJson$$serializer.INSTANCE;
        C9j1 c9j1 = C9j1.A00;
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA005 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA006 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{viewerTierJson$$serializer, viewerUsageJson$$serializer, c9j1, c9j1, c9hrA00, c9hrA002, c9hrA003, c9hrA004, c9hrA005, c9hrA006, c07839ix, AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(ViewerComplimentaryOfferJson$$serializer.INSTANCE), AbstractC07749im.A00(ViewerManagementActionsJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(ViewerAgreementJson$$serializer.INSTANCE)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, ViewerSubscriptionResponseJson viewerSubscriptionResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, viewerSubscriptionResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ViewerSubscriptionResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(viewerSubscriptionResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
