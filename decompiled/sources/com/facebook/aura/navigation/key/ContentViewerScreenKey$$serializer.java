package com.facebook.aura.navigation.key;

import X.AbstractC07749im;
import X.AnonymousClass003;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class ContentViewerScreenKey$$serializer implements C9cd<ContentViewerScreenKey> {
    public static final ContentViewerScreenKey$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ContentViewerScreenKey deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ContentViewerScreenKey.$childSerializers;
        ContentViewerBottomActions contentViewerBottomActions = null;
        ContentViewerTarget contentViewerTarget = null;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        boolean zA8G4 = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ContentViewerScreenKey(i, contentViewerTarget, zA8G, zA8G4, zA8G3, contentViewerBottomActions, zA8G2, (C2hx) null);
                case 0:
                    contentViewerTarget = (ContentViewerTarget) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 0);
                    i |= 1;
                    break;
                case 1:
                    zA8G = c9j4A55.A8G(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    zA8G4 = c9j4A55.A8G(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    zA8G3 = c9j4A55.A8G(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    contentViewerBottomActions = (ContentViewerBottomActions) c9j4A55.A8Z(ContentViewerBottomActions$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    zA8G2 = c9j4A55.A8G(c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ContentViewerScreenKey$$serializer contentViewerScreenKey$$serializer = new ContentViewerScreenKey$$serializer();
        INSTANCE = contentViewerScreenKey$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.navigation.key.ContentViewerScreenKey", contentViewerScreenKey$$serializer, 6);
        c9iKA1C.A08("target", false);
        c9iKA1C.A08("forceDarkMode", true);
        c9iKA1C.A08("interactiveDismissEnabled", true);
        c9iKA1C.A08("fullscreenSingleVideo", true);
        c9iKA1C.A08("bottomActions", true);
        c9iKA1C.A08("usesPushTransition", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA0z = C3cH.A0z(ContentViewerScreenKey.$childSerializers);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c9hrA0z, c07839ix, c07839ix, c07839ix, AbstractC07749im.A00(ContentViewerBottomActions$$serializer.INSTANCE), c07839ix};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ContentViewerScreenKey contentViewerScreenKey) {
        AnonymousClass003.A0u(interfaceC07789is, contentViewerScreenKey);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ContentViewerScreenKey.write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(contentViewerScreenKey, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
