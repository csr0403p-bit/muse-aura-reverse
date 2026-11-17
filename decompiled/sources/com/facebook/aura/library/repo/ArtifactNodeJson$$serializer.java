package com.facebook.aura.library.repo;

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
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class ArtifactNodeJson$$serializer implements C9cd<ArtifactNodeJson> {
    public static final ArtifactNodeJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ArtifactNodeJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0g = null;
        Long l = null;
        Long l2 = null;
        ArtifactSharingInfoJson artifactSharingInfoJson = null;
        String strA0f = null;
        String strA0t = null;
        ArtifactOpenTargetJson artifactOpenTargetJson = null;
        ArtifactPreviewJson artifactPreviewJson = null;
        String strA0p = null;
        Long l3 = null;
        Long l4 = null;
        ArtifactCapabilitiesJson artifactCapabilitiesJson = null;
        String strA8f = null;
        String strA0h = null;
        String strA0i = null;
        String strA0k = null;
        int i2 = 0;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ArtifactNodeJson(i2, strA8f, strA0h, strA0i, strA0k, l2, l, l3, l4, zA8G, strA0p, artifactPreviewJson, artifactOpenTargetJson, artifactCapabilitiesJson, strA0t, strA0f, artifactSharingInfoJson, strA0g, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i2 |= 8;
                    continue;
                case 4:
                    l2 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    l3 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    l4 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    zA8G = c9j4A55.A8G(c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i2 |= 512;
                    continue;
                case 10:
                    artifactPreviewJson = (ArtifactPreviewJson) c9j4A55.A8Z(ArtifactPreviewJson$$serializer.INSTANCE, c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    artifactOpenTargetJson = (ArtifactOpenTargetJson) c9j4A55.A8Z(ArtifactOpenTargetJson$$serializer.INSTANCE, c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    artifactCapabilitiesJson = (ArtifactCapabilitiesJson) c9j4A55.A8a(ArtifactCapabilitiesJson$$serializer.INSTANCE, c9iZ, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    strA0t = C3cI.A0t(c9iZ, c9j4A55);
                    i2 |= 8192;
                    continue;
                case 14:
                    strA0f = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    artifactSharingInfoJson = (ArtifactSharingInfoJson) c9j4A55.A8Z(ArtifactSharingInfoJson$$serializer.INSTANCE, c9iZ, 15);
                    i = 32768;
                    break;
                case 16:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 16);
                    i = 65536;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        ArtifactNodeJson$$serializer artifactNodeJson$$serializer = new ArtifactNodeJson$$serializer();
        INSTANCE = artifactNodeJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.library.repo.ArtifactNodeJson", artifactNodeJson$$serializer, 17);
        c9iKA1C.A08("artifact_ref", true);
        C3cH.A1I(PhotosSearchHandlerKt.PARAM_SOURCE, c9iKA1C, true);
        c9iKA1C.A08("format", true);
        c9iKA1C.A08("created_at_ms", true);
        c9iKA1C.A08("updated_at_ms", true);
        c9iKA1C.A08("last_opened_at_ms", true);
        c9iKA1C.A08("last_activity_at_ms", true);
        C3cH.A1H("is_pinned", c9iKA1C, true);
        c9iKA1C.A08("preview", true);
        c9iKA1C.A08("open_target", true);
        c9iKA1C.A08("capabilities", true);
        c9iKA1C.A08("space_id", true);
        c9iKA1C.A08("placement", true);
        c9iKA1C.A08("sharing", true);
        c9iKA1C.A08("publisher_name", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c9hrA00, AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c9j1), C07839ix.A00, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(ArtifactPreviewJson$$serializer.INSTANCE), AbstractC07749im.A00(ArtifactOpenTargetJson$$serializer.INSTANCE), ArtifactCapabilitiesJson$$serializer.INSTANCE, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(ArtifactSharingInfoJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ArtifactNodeJson artifactNodeJson) {
        AnonymousClass003.A0u(interfaceC07789is, artifactNodeJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ArtifactNodeJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(artifactNodeJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
