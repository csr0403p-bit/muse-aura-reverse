package X;

import com.facebook.aura.partners.voice.chrome.VoiceConversationPresentationActionKt;
import com.whatsapp.accountlinking.ipc.api.models.linked.CrosspostShareType;
import com.whatsapp.accountlinking.ipc.api.models.linked.CrosspostShareTypeSerializer;
import com.whatsapp.accountlinking.ipc.api.models.linked.ExecuteCrosspostOperation;
import com.whatsapp.accountlinking.ipc.api.models.linked.SourceApp;
import com.whatsapp.accountlinking.ipc.api.models.linked.SourceAppSerializer;
import java.util.ArrayList;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9oQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9oQ implements C9cd<ExecuteCrosspostOperation> {
    public static final C9oQ A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ExecuteCrosspostOperation.$childSerializers;
        String strA8f = null;
        String strA0r = null;
        String strA0s = null;
        CrosspostShareType crosspostShareType = null;
        SourceApp sourceApp = null;
        String str = null;
        String strA0t = null;
        String strA0q = null;
        String strA0p = null;
        ArrayList arrayList = null;
        Integer num = null;
        ArrayList arrayList2 = null;
        String strA0h = null;
        String strA0i = null;
        String strA0o = null;
        boolean zA8G = false;
        int iA8U = 0;
        int i2 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ExecuteCrosspostOperation(i2, strA8f, strA0h, strA0i, strA0o, sourceApp, crosspostShareType, num, arrayList, arrayList2, strA0p, strA0q, strA0r, strA0s, strA0t, str, zA8G, iA8U, (C2hx) null);
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
                    strA0o = C60Q.A0o(c9iZ, c9j4A55);
                    i2 |= 8;
                    continue;
                case 4:
                    sourceApp = (SourceApp) c9j4A55.A8a(SourceAppSerializer.A00, c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    crosspostShareType = (CrosspostShareType) c9j4A55.A8a(CrosspostShareTypeSerializer.A00, c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    arrayList = (ArrayList) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    arrayList2 = (ArrayList) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i2 |= 512;
                    continue;
                case 10:
                    strA0q = C3cI.A0q(c9iZ, c9j4A55);
                    i2 |= 1024;
                    continue;
                case 11:
                    strA0r = C3cI.A0r(c9iZ, c9j4A55);
                    i2 |= 2048;
                    continue;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i2 |= 4096;
                    continue;
                case 13:
                    strA0t = C3cI.A0t(c9iZ, c9j4A55);
                    i2 |= 8192;
                    continue;
                case 14:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    zA8G = c9j4A55.A8G(c9iZ, 15);
                    i = 32768;
                    break;
                case 16:
                    iA8U = c9j4A55.A8U(c9iZ, 16);
                    i = 65536;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        C9oQ c9oQ = new C9oQ();
        A00 = c9oQ;
        C9iK c9iKA1C = C3cG.A1C("ExecuteCrosspostOperation", c9oQ, 17);
        c9iKA1C.A08("status_media_uri", false);
        c9iKA1C.A08("media_attribution_url", false);
        c9iKA1C.A08("story_unique_id", false);
        c9iKA1C.A08("xpost_request_id", false);
        c9iKA1C.A08(VoiceConversationPresentationActionKt.SOURCE_APP_ANNOTATION, false);
        c9iKA1C.A08("crosspost_share_type", false);
        c9iKA1C.A08("media_duration", false);
        c9iKA1C.A08("tappable_areas", false);
        c9iKA1C.A08("music_attributions", false);
        c9iKA1C.A08("foreground_media", false);
        c9iKA1C.A08("background_color", false);
        c9iKA1C.A08("color_gradient_top", false);
        c9iKA1C.A08("color_gradient_bottom", false);
        c9iKA1C.A08("entry_point", true);
        c9iKA1C.A08("flow_type", true);
        C9iK.A04("is_auto_xpost", c9iKA1C, true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ExecuteCrosspostOperation.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        SourceAppSerializer sourceAppSerializer = SourceAppSerializer.A00;
        CrosspostShareTypeSerializer crosspostShareTypeSerializer = CrosspostShareTypeSerializer.A00;
        C07729ii c07729ii = C07729ii.A00;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c07779iq, sourceAppSerializer, crosspostShareTypeSerializer, AbstractC07749im.A00(c07729ii), C3cH.A14(f0cArr, 7), C3cH.A14(f0cArr, 8), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C07839ix.A00, c07729ii};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        ExecuteCrosspostOperation executeCrosspostOperation = (ExecuteCrosspostOperation) obj;
        AnonymousClass003.A0u(interfaceC07789is, executeCrosspostOperation);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ExecuteCrosspostOperation.write$Self$java_com_whatsapp_accountlinking_ipc_api_api(executeCrosspostOperation, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
