package com.facebook.aura.model;

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
import X.C60O;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.gateway.HatchGatewayConnectionKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class HatchAttachmentFile$$serializer implements C9cd<HatchAttachmentFile> {
    public static final int $stable = 0;
    public static final HatchAttachmentFile$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchAttachmentFile deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HatchAttachmentFile.$childSerializers;
        List listA0Q = null;
        HatchAttachmentKind hatchAttachmentKind = null;
        HatchAttachmentAudio hatchAttachmentAudio = null;
        String strA0g = null;
        Long l = null;
        String strA0j = null;
        String strA8f = null;
        String strA0h = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HatchAttachmentFile(i, strA8f, strA0h, strA0j, l, zA8G, strA0g, hatchAttachmentKind, hatchAttachmentAudio, listA0Q, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    zA8G = c9j4A55.A8G(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    hatchAttachmentKind = (HatchAttachmentKind) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 6);
                    i |= 64;
                    break;
                case 7:
                    hatchAttachmentAudio = (HatchAttachmentAudio) c9j4A55.A8Z(HatchAttachmentAudio$$serializer.INSTANCE, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 8);
                    i |= 256;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        HatchAttachmentFile$$serializer hatchAttachmentFile$$serializer = new HatchAttachmentFile$$serializer();
        INSTANCE = hatchAttachmentFile$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.HatchAttachmentFile", hatchAttachmentFile$$serializer, 9);
        C3cI.A1P("path", c9iKA1C, false);
        c9iKA1C.A08("mime", true);
        c9iKA1C.A08("byteLen", true);
        c9iKA1C.A08(HatchGatewayConnectionKt.TOKEN_SOURCE_MISSING, true);
        C60O.A1S("originalUrl", c9iKA1C, true);
        c9iKA1C.A08("audio", true);
        c9iKA1C.A08("featuredProducts", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = HatchAttachmentFile.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C9j1.A00), C07839ix.A00, AbstractC07749im.A00(c07779iq), C3cH.A14(f0cArr, 6), AbstractC07749im.A00(HatchAttachmentAudio$$serializer.INSTANCE), C3cG.A16(f0cArr, 8)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchAttachmentFile hatchAttachmentFile) {
        AnonymousClass003.A0u(interfaceC07789is, hatchAttachmentFile);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchAttachmentFile.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(hatchAttachmentFile, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
