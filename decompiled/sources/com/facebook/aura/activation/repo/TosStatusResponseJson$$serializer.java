package com.facebook.aura.activation.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
public final /* synthetic */ class TosStatusResponseJson$$serializer implements C9cd<TosStatusResponseJson> {
    public static final TosStatusResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final TosStatusResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = TosStatusResponseJson.$childSerializers;
        int i = 0;
        String strA8f = null;
        TosInfoBannerJson tosInfoBannerJson = null;
        TosUpsellCellJson tosUpsellCellJson = null;
        List listA0P = null;
        List listA0P2 = null;
        TosUpsellCellJson tosUpsellCellJson2 = null;
        List list = null;
        String strA0h = null;
        String strA0i = null;
        String strA8f2 = null;
        String strA8f3 = null;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new TosStatusResponseJson(i, zA8G, strA0h, strA0i, list, strA8f2, strA8f3, listA0P, tosUpsellCellJson2, tosUpsellCellJson, tosInfoBannerJson, strA8f, listA0P2, (C2hx) null);
                case 0:
                    zA8G = c9j4A55.A8G(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    list = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 3);
                    i |= 8;
                    break;
                case 4:
                    strA8f2 = c9j4A55.A8f(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA8f3 = c9j4A55.A8f(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 6);
                    i |= 64;
                    break;
                case 7:
                    tosUpsellCellJson2 = (TosUpsellCellJson) c9j4A55.A8Z(TosUpsellCellJson$$serializer.INSTANCE, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    tosUpsellCellJson = (TosUpsellCellJson) c9j4A55.A8Z(TosUpsellCellJson$$serializer.INSTANCE, c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    tosInfoBannerJson = (TosInfoBannerJson) c9j4A55.A8Z(TosInfoBannerJson$$serializer.INSTANCE, c9iZ, 9);
                    i |= 512;
                    break;
                case 10:
                    strA8f = c9j4A55.A8f(c9iZ, 10);
                    i |= 1024;
                    break;
                case 11:
                    listA0P2 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 11);
                    i |= 2048;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        TosStatusResponseJson$$serializer tosStatusResponseJson$$serializer = new TosStatusResponseJson$$serializer();
        INSTANCE = tosStatusResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.activation.repo.TosStatusResponseJson", tosStatusResponseJson$$serializer, 12);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_HAS_ACCEPTED_TOS, true);
        c9iKA1C.A08("disclosure_text", true);
        c9iKA1C.A08("disclosure_version", true);
        c9iKA1C.A08("disclosure_entities", true);
        c9iKA1C.A08("disclosure_title", true);
        c9iKA1C.A08("disclosure_button_text", true);
        c9iKA1C.A08("disclosure_sections", true);
        c9iKA1C.A08("cvm_upsell_cell", true);
        c9iKA1C.A08("subscription_upsell_cell", true);
        c9iKA1C.A08("info_banner", true);
        c9iKA1C.A08("subscription_disclosure_text", true);
        c9iKA1C.A08("subscription_disclosure_entities", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = TosStatusResponseJson.$childSerializers;
        C07839ix c07839ix = C07839ix.A00;
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA12 = C3cH.A12(f0cArr);
        C9hr c9hrA16 = C3cG.A16(f0cArr, 6);
        TosUpsellCellJson$$serializer tosUpsellCellJson$$serializer = TosUpsellCellJson$$serializer.INSTANCE;
        return new C9hr[]{c07839ix, c07779iq, c07779iq, c9hrA12, c07779iq, c07779iq, c9hrA16, AbstractC07749im.A00(tosUpsellCellJson$$serializer), AbstractC07749im.A00(tosUpsellCellJson$$serializer), AbstractC07749im.A00(TosInfoBannerJson$$serializer.INSTANCE), c07779iq, C3cG.A16(f0cArr, 11)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, TosStatusResponseJson tosStatusResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, tosStatusResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        TosStatusResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(tosStatusResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
