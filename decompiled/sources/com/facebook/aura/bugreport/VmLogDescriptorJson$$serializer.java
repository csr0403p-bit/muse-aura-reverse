package com.facebook.aura.bugreport;

import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class VmLogDescriptorJson$$serializer implements C9cd<VmLogDescriptorJson> {
    public static final int $stable = 0;
    public static final VmLogDescriptorJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final VmLogDescriptorJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        int i = 0;
        String strA8f = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String strA8f4 = null;
        String strA0h = null;
        long jA8X = 0;
        int iA8U = 0;
        long jA8X2 = 0;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new VmLogDescriptorJson(i, strA8f, strA0h, strA8f4, strA8f2, strA8f3, jA8X, jA8X2, zA8G, iA8U, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA8f4 = c9j4A55.A8f(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    strA8f2 = c9j4A55.A8f(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA8f3 = c9j4A55.A8f(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    jA8X = c9j4A55.A8X(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    jA8X2 = c9j4A55.A8X(c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    zA8G = c9j4A55.A8G(c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    iA8U = c9j4A55.A8U(c9iZ, 8);
                    i |= 256;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        VmLogDescriptorJson$$serializer vmLogDescriptorJson$$serializer = new VmLogDescriptorJson$$serializer();
        INSTANCE = vmLogDescriptorJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.bugreport.VmLogDescriptorJson", vmLogDescriptorJson$$serializer, 9);
        c9iKA1C.A08("request_id", true);
        c9iKA1C.A08("file_id", true);
        c9iKA1C.A08("download_path", true);
        c9iKA1C.A08("filename", true);
        c9iKA1C.A08(PhotosSearchHandlerKt.PARAM_MIME_TYPE, true);
        c9iKA1C.A08("byte_length", true);
        c9iKA1C.A08("expires_at_ms", true);
        c9iKA1C.A08("truncated", true);
        c9iKA1C.A08("omitted_rows", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c9j1, c9j1, C07839ix.A00, C07729ii.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, VmLogDescriptorJson vmLogDescriptorJson) {
        AnonymousClass003.A0u(interfaceC07789is, vmLogDescriptorJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        VmLogDescriptorJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(vmLogDescriptorJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
