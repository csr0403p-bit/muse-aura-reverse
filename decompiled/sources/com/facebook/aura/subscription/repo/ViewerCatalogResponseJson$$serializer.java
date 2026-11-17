package com.facebook.aura.subscription.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.user.provider.AuraViewerDataProviderKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ViewerCatalogResponseJson$$serializer implements C9cd<ViewerCatalogResponseJson> {
    public static final int $stable = 0;
    public static final ViewerCatalogResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ViewerCatalogResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ViewerCatalogResponseJson.$childSerializers;
        List listA0P = null;
        String strA0f = null;
        List listA0P2 = null;
        ViewerNameDialogJson viewerNameDialogJson = null;
        String str = null;
        String strA0o = null;
        DisclaimerJson disclaimerJson = null;
        DisclaimerJson disclaimerJson2 = null;
        ViewerBlockedActionDialogJson viewerBlockedActionDialogJson = null;
        DisclaimerJson disclaimerJson3 = null;
        List listA0P3 = null;
        String strA0k = null;
        int i = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ViewerCatalogResponseJson(i, listA0P, strA0f, listA0P3, strA0k, disclaimerJson2, disclaimerJson3, disclaimerJson, strA0o, str, zA8G, viewerBlockedActionDialogJson, zA8G2, viewerNameDialogJson, listA0P2, (C2hx) null);
                case 0:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0f = C3cI.A0f(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    listA0P3 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    disclaimerJson2 = (DisclaimerJson) c9j4A55.A8Z(DisclaimerJson$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    disclaimerJson3 = (DisclaimerJson) c9j4A55.A8Z(DisclaimerJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    disclaimerJson = (DisclaimerJson) c9j4A55.A8Z(DisclaimerJson$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
                    i |= 128;
                    break;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i |= 256;
                    break;
                case 9:
                    zA8G = c9j4A55.A8G(c9iZ, 9);
                    i |= 512;
                    break;
                case 10:
                    viewerBlockedActionDialogJson = (ViewerBlockedActionDialogJson) c9j4A55.A8Z(ViewerBlockedActionDialogJson$$serializer.INSTANCE, c9iZ, 10);
                    i |= 1024;
                    break;
                case 11:
                    zA8G2 = c9j4A55.A8G(c9iZ, 11);
                    i |= 2048;
                    break;
                case 12:
                    viewerNameDialogJson = (ViewerNameDialogJson) c9j4A55.A8Z(ViewerNameDialogJson$$serializer.INSTANCE, c9iZ, 12);
                    i |= 4096;
                    break;
                case 13:
                    listA0P2 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 13);
                    i |= 8192;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ViewerCatalogResponseJson$$serializer viewerCatalogResponseJson$$serializer = new ViewerCatalogResponseJson$$serializer();
        INSTANCE = viewerCatalogResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.subscription.repo.ViewerCatalogResponseJson", viewerCatalogResponseJson$$serializer, 14);
        c9iKA1C.A08("plans", true);
        c9iKA1C.A08("suggested_tier_id", true);
        c9iKA1C.A08("credit_packs", true);
        c9iKA1C.A08("topup_disclaimer", true);
        c9iKA1C.A08("purchase_disclaimer", true);
        c9iKA1C.A08("topup_disclaimer_block", true);
        c9iKA1C.A08("purchase_notice", true);
        c9iKA1C.A08("purchase_cta_label", true);
        c9iKA1C.A08("topup_cta_label", true);
        c9iKA1C.A08("plan_change_blocked", true);
        c9iKA1C.A08("blocked_action_dialog", true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_REQUIRES_NAME, true);
        c9iKA1C.A08("name_dialog", true);
        c9iKA1C.A08("checkout_add_ons", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ViewerCatalogResponseJson.$childSerializers;
        C9hr c9hrA0z = C3cH.A0z(f0cArr);
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA11 = C3cH.A11(f0cArr);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        DisclaimerJson$$serializer disclaimerJson$$serializer = DisclaimerJson$$serializer.INSTANCE;
        C9hr c9hrA003 = AbstractC07749im.A00(disclaimerJson$$serializer);
        C9hr c9hrA004 = AbstractC07749im.A00(disclaimerJson$$serializer);
        C9hr c9hrA005 = AbstractC07749im.A00(disclaimerJson$$serializer);
        C9hr c9hrA006 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA007 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c9hrA0z, c9hrA00, c9hrA11, c9hrA002, c9hrA003, c9hrA004, c9hrA005, c9hrA006, c9hrA007, c07839ix, AbstractC07749im.A00(ViewerBlockedActionDialogJson$$serializer.INSTANCE), c07839ix, AbstractC07749im.A00(ViewerNameDialogJson$$serializer.INSTANCE), C3cG.A16(f0cArr, 13)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ViewerCatalogResponseJson viewerCatalogResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, viewerCatalogResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ViewerCatalogResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(viewerCatalogResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
