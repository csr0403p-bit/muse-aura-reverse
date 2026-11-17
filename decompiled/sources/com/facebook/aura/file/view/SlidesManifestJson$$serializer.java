package com.facebook.aura.file.view;

import X.AnonymousClass003;
import X.C07779iq;
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
import com.facebook.aura.model.HatchWidgetPresentationKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class SlidesManifestJson$$serializer implements C9cd<SlidesManifestJson> {
    public static final int $stable = 0;
    public static final SlidesManifestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SlidesManifestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = SlidesManifestJson.$childSerializers;
        C2hx c2hx = null;
        List listA0Q = null;
        String strA8f = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new SlidesManifestJson(i, strA8f, listA0Q, c2hx);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 1);
                i |= 2;
            }
        }
    }

    static {
        SlidesManifestJson$$serializer slidesManifestJson$$serializer = new SlidesManifestJson$$serializer();
        INSTANCE = slidesManifestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.file.view.SlidesManifestJson", slidesManifestJson$$serializer, 2);
        c9iKA1C.A08("main_title", true);
        c9iKA1C.A08(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SLIDES, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cH.A1b(C07779iq.A01, SlidesManifestJson.$childSerializers);
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SlidesManifestJson slidesManifestJson) {
        AnonymousClass003.A0u(interfaceC07789is, slidesManifestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SlidesManifestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_file_view_view(slidesManifestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
