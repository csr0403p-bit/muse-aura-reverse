package com.facebook.aura.pairs;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
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
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.library.uicontrol.GoalUiCommandsKt;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import com.facebook.aura.widgets.SpaceWidgetRefreshWorkerKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class PeerActivityJson$$serializer implements C9cd<PeerActivityJson> {
    public static final int $stable = 0;
    public static final PeerActivityJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PeerActivityJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        int i2;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0g = null;
        String strA0g2 = null;
        String strA0g3 = null;
        String strA0g4 = null;
        String strA0g5 = null;
        String strA0g6 = null;
        String strA0g7 = null;
        String strA0g8 = null;
        String strA0u = null;
        String strA0f = null;
        Integer num = null;
        String strA0f2 = null;
        String strA0f3 = null;
        String strA8f = null;
        String strA0l = null;
        String strA0m = null;
        String strA0n = null;
        String strA0o = null;
        String str = null;
        String strA0p = null;
        String strA0q = null;
        String strA0r = null;
        String strA0s = null;
        long jA8X = 0;
        String strA0h = null;
        String strA0i = null;
        int i3 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new PeerActivityJson(i3, strA8f, strA0h, strA0i, jA8X, strA0l, strA0m, strA0n, strA0o, str, strA0p, strA0q, strA0r, strA0s, num, strA0f, strA0u, strA0g, strA0g8, strA0g7, strA0g6, strA0g3, strA0g4, strA0g2, strA0f3, strA0f2, strA0g5, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i3 |= 1;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i3 |= 2;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i3 |= 4;
                case 3:
                    jA8X = c9j4A55.A8X(c9iZ, 3);
                    i3 |= 8;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i3 |= 16;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i3 |= 32;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i3 |= 64;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
                    i3 |= 128;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i3 |= 256;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i3 |= 512;
                case 10:
                    strA0q = C3cI.A0q(c9iZ, c9j4A55);
                    i3 |= 1024;
                case 11:
                    strA0r = C3cI.A0r(c9iZ, c9j4A55);
                    i3 |= 2048;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i3 |= 4096;
                case 13:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 13);
                    i3 |= 8192;
                case 14:
                    strA0f = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 14);
                    i3 |= 16384;
                case 15:
                    strA0u = C3cI.A0u(c9iZ, c9j4A55);
                    i2 = 32768;
                    i3 |= i2;
                case 16:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 16);
                    i2 = 65536;
                    i3 |= i2;
                case 17:
                    strA0g8 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 17);
                    i2 = 131072;
                    i3 |= i2;
                case 18:
                    strA0g7 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 18);
                    i2 = 262144;
                    i3 |= i2;
                case 19:
                    strA0g6 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 19);
                    i2 = 524288;
                    i3 |= i2;
                case 20:
                    strA0g3 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 20);
                    i = 1048576;
                    i3 |= i;
                case 21:
                    strA0g4 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 21);
                    i = 2097152;
                    i3 |= i;
                case 22:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 22);
                    i = 4194304;
                    i3 |= i;
                case 23:
                    strA0f3 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 23);
                    i = 8388608;
                    i3 |= i;
                case 24:
                    strA0f2 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 24);
                    i = HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES;
                    i3 |= i;
                case 25:
                    strA0g5 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 25);
                    i = 33554432;
                    i3 |= i;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        PeerActivityJson$$serializer peerActivityJson$$serializer = new PeerActivityJson$$serializer();
        INSTANCE = peerActivityJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.pairs.PeerActivityJson", peerActivityJson$$serializer, 26);
        C60O.A1S("activity_id", c9iKA1C, true);
        c9iKA1C.A08("muse_id", true);
        c9iKA1C.A08("at_ms", true);
        c9iKA1C.A08("delivery_id", true);
        c9iKA1C.A08("relationship_generation_id", true);
        c9iKA1C.A08("person_name", true);
        c9iKA1C.A08("person_photo_sha256", true);
        c9iKA1C.A08("file_name", true);
        c9iKA1C.A08("file_ref", true);
        C60O.A1U(PhotosSearchHandlerKt.PARAM_MIME_TYPE, c9iKA1C, true);
        c9iKA1C.A08("space_name", true);
        C3cH.A1G("member_count", c9iKA1C, true);
        c9iKA1C.A08("space_id", true);
        c9iKA1C.A08(SpaceWidgetRefreshWorkerKt.KEY_SLUG, true);
        c9iKA1C.A08("reference", true);
        C3cI.A1N("share_id", c9iKA1C, true);
        c9iKA1C.A08("item_id", true);
        c9iKA1C.A08(GoalUiCommandsKt.GOAL_ID_PARAM, true);
        c9iKA1C.A08("host_muse", true);
        c9iKA1C.A08("message_id", true);
        c9iKA1C.A08("connection_id", true);
        c9iKA1C.A08("icon_url", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, C9j1.A00, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C07729ii.A00), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PeerActivityJson peerActivityJson) {
        AnonymousClass003.A0u(interfaceC07789is, peerActivityJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PeerActivityJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(peerActivityJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
