package com.facebook.aura.subscription.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
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
import com.facebook.aura.gateway.ConnectorOrderCheckoutKt;
import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewerCtaConfirmationJson$$serializer implements C9cd<ViewerCtaConfirmationJson> {
    public static final int $stable = 0;
    public static final ViewerCtaConfirmationJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ViewerCtaConfirmationJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ViewerCtaConfirmationJson.$childSerializers;
        String strA0w = null;
        String strA0w2 = null;
        String strA0w3 = null;
        String strA0w4 = null;
        String strA0w5 = null;
        List listA0P = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ViewerCtaConfirmationJson(i, strA0w, strA0w2, strA0w3, strA0w4, strA0w5, listA0P, (C2hx) null);
                case 0:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 1);
                    i |= 2;
                    break;
                case 2:
                    strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0w4 = C3cI.A0w(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0w5 = C3cI.A0w(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ViewerCtaConfirmationJson$$serializer viewerCtaConfirmationJson$$serializer = new ViewerCtaConfirmationJson$$serializer();
        INSTANCE = viewerCtaConfirmationJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.subscription.repo.ViewerCtaConfirmationJson", viewerCtaConfirmationJson$$serializer, 6);
        boolean zA1R = C3cG.A1R(c9iKA1C);
        c9iKA1C.A08(MetaAiAppBroadcastSender.EXTRA_BODY, zA1R);
        c9iKA1C.A08("confirm_label", zA1R);
        c9iKA1C.A08("cancel_label", zA1R);
        c9iKA1C.A08("summary", zA1R);
        c9iKA1C.A08(ConnectorOrderCheckoutKt.ITEMS_KEY, zA1R);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ViewerCtaConfirmationJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 5)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ViewerCtaConfirmationJson viewerCtaConfirmationJson) {
        AnonymousClass003.A0u(interfaceC07789is, viewerCtaConfirmationJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ViewerCtaConfirmationJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(viewerCtaConfirmationJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
