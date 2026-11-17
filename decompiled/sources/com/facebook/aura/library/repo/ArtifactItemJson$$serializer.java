package com.facebook.aura.library.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07799it;
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
public final /* synthetic */ class ArtifactItemJson$$serializer implements C9cd<ArtifactItemJson> {
    public static final ArtifactItemJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ArtifactItemJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String str = null;
        String str2 = null;
        ArtifactItemPreviewJson artifactItemPreviewJson = null;
        String str3 = null;
        ArtifactSharingInfoJson artifactSharingInfoJson = null;
        String str4 = null;
        String str5 = null;
        Boolean bool = null;
        String str6 = null;
        Double d = null;
        Double d2 = null;
        Long l = null;
        String strA8f = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String str7 = null;
        String str8 = null;
        int i2 = 0;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ArtifactItemJson(i2, strA8f, strA8f2, strA8f3, str8, str3, artifactItemPreviewJson, zA8G, d2, l, d, str6, bool, str2, str5, str4, artifactSharingInfoJson, str7, str, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA8f2 = c9j4A55.A8f(c9iZ, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    strA8f3 = c9j4A55.A8f(c9iZ, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    str8 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    str3 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    artifactItemPreviewJson = (ArtifactItemPreviewJson) c9j4A55.A8Z(ArtifactItemPreviewJson$$serializer.INSTANCE, c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    zA8G = c9j4A55.A8G(c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    d2 = (Double) c9j4A55.A8Z(C07799it.A00, c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    d = (Double) c9j4A55.A8Z(C07799it.A00, c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    str6 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    str5 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    str4 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    artifactSharingInfoJson = (ArtifactSharingInfoJson) c9j4A55.A8Z(ArtifactSharingInfoJson$$serializer.INSTANCE, c9iZ, 15);
                    i = 32768;
                    break;
                case 16:
                    str7 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 17);
                    i2 |= 131072;
                    continue;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        ArtifactItemJson$$serializer artifactItemJson$$serializer = new ArtifactItemJson$$serializer();
        INSTANCE = artifactItemJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.library.repo.ArtifactItemJson", artifactItemJson$$serializer, 18);
        c9iKA1C.A08(PhotosSearchHandlerKt.PARAM_SOURCE, true);
        C3cH.A1I("item_key", c9iKA1C, true);
        c9iKA1C.A08("icon", true);
        c9iKA1C.A08("xmds_icon", true);
        c9iKA1C.A08("preview", true);
        c9iKA1C.A08("is_favorite", true);
        c9iKA1C.A08("favorite_order", true);
        c9iKA1C.A08("accessed_at_ms", true);
        c9iKA1C.A08("frequency_score", true);
        c9iKA1C.A08("source_url", true);
        c9iKA1C.A08("has_server_actions", true);
        c9iKA1C.A08("space_id", true);
        c9iKA1C.A08("artifact_ref", true);
        c9iKA1C.A08("placement", true);
        c9iKA1C.A08("sharing", true);
        c9iKA1C.A08("construction_status", true);
        c9iKA1C.A08("view_url", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(ArtifactItemPreviewJson$$serializer.INSTANCE);
        C07839ix c07839ix = C07839ix.A00;
        C07799it c07799it = C07799it.A00;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c9hrA00, c9hrA002, c9hrA003, c07839ix, AbstractC07749im.A00(c07799it), AbstractC07749im.A00(C9j1.A00), AbstractC07749im.A00(c07799it), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(ArtifactSharingInfoJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ArtifactItemJson artifactItemJson) {
        AnonymousClass003.A0u(interfaceC07789is, artifactItemJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ArtifactItemJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(artifactItemJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
