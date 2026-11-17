package com.facebook.aura.subscription.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ViewerAgreementJson$$serializer implements C9cd<ViewerAgreementJson> {
    public static final int $stable = 0;
    public static final ViewerAgreementJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ViewerAgreementJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0w = null;
        CurrencyAmountJson currencyAmountJson = null;
        ViewerPendingPlanChangeJson viewerPendingPlanChangeJson = null;
        SubscriptionPeriodJson subscriptionPeriodJson = null;
        ViewerCrossPlatformDialogJson viewerCrossPlatformDialogJson = null;
        String strA0w2 = null;
        String strA0i = null;
        String strA0k = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ViewerAgreementJson(i, strA0w2, strA0i, zA8G, strA0k, viewerCrossPlatformDialogJson, subscriptionPeriodJson, viewerPendingPlanChangeJson, strA0w, currencyAmountJson, (C2hx) null);
                case 0:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    zA8G = c9j4A55.A8G(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    viewerCrossPlatformDialogJson = (ViewerCrossPlatformDialogJson) c9j4A55.A8Z(ViewerCrossPlatformDialogJson$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    subscriptionPeriodJson = (SubscriptionPeriodJson) c9j4A55.A8Z(SubscriptionPeriodJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    viewerPendingPlanChangeJson = (ViewerPendingPlanChangeJson) c9j4A55.A8Z(ViewerPendingPlanChangeJson$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                case 8:
                    currencyAmountJson = (CurrencyAmountJson) c9j4A55.A8Z(CurrencyAmountJson$$serializer.INSTANCE, c9iZ, 8);
                    i |= 256;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ViewerAgreementJson$$serializer viewerAgreementJson$$serializer = new ViewerAgreementJson$$serializer();
        INSTANCE = viewerAgreementJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.subscription.repo.ViewerAgreementJson", viewerAgreementJson$$serializer, 9);
        c9iKA1C.A08("id", true);
        c9iKA1C.A08(AuraDeeplinkRouteMapper.STATUS_ROUTE, true);
        c9iKA1C.A08("is_x_platform", true);
        c9iKA1C.A08("x_platform_message", true);
        c9iKA1C.A08("x_platform_dialog", true);
        c9iKA1C.A08("current_period", true);
        c9iKA1C.A08("pending_plan_change", true);
        C9iK.A03("purchase_platform", c9iKA1C, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C07839ix.A00, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(ViewerCrossPlatformDialogJson$$serializer.INSTANCE), AbstractC07749im.A00(SubscriptionPeriodJson$$serializer.INSTANCE), AbstractC07749im.A00(ViewerPendingPlanChangeJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(CurrencyAmountJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ViewerAgreementJson viewerAgreementJson) {
        AnonymousClass003.A0u(interfaceC07789is, viewerAgreementJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ViewerAgreementJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(viewerAgreementJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
