package com.facebook.aura.conversation.offline;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C5hV;
import X.C60O;
import X.C7384Etj;
import X.C9Y;
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
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.model.HatchContentBlockSerializer;
import com.facebook.aura.model.HatchDeltaTranscript;
import com.facebook.aura.model.HatchDeltaTranscript$$serializer;
import com.facebook.aura.model.ReplyAttribution;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class HatchPersistedMessageJson$$serializer implements C9cd<HatchPersistedMessageJson> {
    public static final HatchPersistedMessageJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchPersistedMessageJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HatchPersistedMessageJson.$childSerializers;
        String str = null;
        long jA8X = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        HatchDeltaTranscript hatchDeltaTranscript = null;
        List list4 = null;
        String str7 = null;
        ReplyAttribution replyAttribution = null;
        String strA8f = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String strA8f4 = null;
        String strA8f5 = null;
        Long l = null;
        Long l2 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        List list5 = null;
        List list6 = null;
        String str11 = null;
        int i2 = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        boolean z = true;
        while (z) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strA8f3 = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA8f2 = c9j4A55.A8f(c9iZ, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    strA8f = c9j4A55.A8f(c9iZ, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    jA8X = c9j4A55.A8X(c9iZ, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    l2 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    str8 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    str9 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    str10 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    list5 = (List) c9j4A55.A8a(f0cArr[9].getValue(), c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    list6 = (List) c9j4A55.A8a(f0cArr[10].getValue(), c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    str11 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    str7 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    str5 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    str3 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    str4 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 15);
                    i = 32768;
                    break;
                case 16:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    zA8G3 = c9j4A55.A8G(c9iZ, 17);
                    i = 131072;
                    break;
                case 18:
                    zA8G2 = c9j4A55.A8G(c9iZ, 18);
                    i = 262144;
                    break;
                case 19:
                    strA8f4 = c9j4A55.A8f(c9iZ, 19);
                    i = 524288;
                    break;
                case 20:
                    strA8f5 = c9j4A55.A8f(c9iZ, 20);
                    i = 1048576;
                    break;
                case 21:
                    str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 21);
                    i = 2097152;
                    break;
                case 22:
                    str6 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 22);
                    i = 4194304;
                    break;
                case 23:
                    list4 = (List) c9j4A55.A8a(f0cArr[23].getValue(), c9iZ, 23);
                    i = 8388608;
                    break;
                case 24:
                    hatchDeltaTranscript = (HatchDeltaTranscript) c9j4A55.A8Z(HatchDeltaTranscript$$serializer.INSTANCE, c9iZ, 24);
                    i = HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES;
                    break;
                case 25:
                    replyAttribution = (ReplyAttribution) c9j4A55.A8Z(ReplyAttributionSerializer.INSTANCE, c9iZ, 25);
                    i = 33554432;
                    break;
                case 26:
                    list3 = (List) c9j4A55.A8a(f0cArr[26].getValue(), c9iZ, 26);
                    i = 67108864;
                    break;
                case 27:
                    list2 = (List) c9j4A55.A8a(f0cArr[27].getValue(), c9iZ, 27);
                    i = 134217728;
                    break;
                case 28:
                    list = (List) c9j4A55.A8a(f0cArr[28].getValue(), c9iZ, 28);
                    i = 268435456;
                    break;
                case 29:
                    zA8G = c9j4A55.A8G(c9iZ, 29);
                    i = 536870912;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
        c9j4A55.AAd(c9iZ);
        return new HatchPersistedMessageJson(i2, strA8f3, strA8f2, strA8f, jA8X, l, l2, str8, str9, str10, list5, list6, str11, str7, str5, str3, str4, str, zA8G3, zA8G2, strA8f4, strA8f5, str2, str6, list4, hatchDeltaTranscript, replyAttribution, list3, list2, list, zA8G, (C2hx) null);
    }

    static {
        HatchPersistedMessageJson$$serializer hatchPersistedMessageJson$$serializer = new HatchPersistedMessageJson$$serializer();
        INSTANCE = hatchPersistedMessageJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.conversation.offline.HatchPersistedMessageJson", hatchPersistedMessageJson$$serializer, 30);
        boolean zA1Y = C60O.A1Y(c9iKA1C);
        c9iKA1C.A08("role", zA1Y);
        c9iKA1C.A08("content", zA1Y);
        c9iKA1C.A08("timestamp", zA1Y);
        c9iKA1C.A08(AgeCheckFunnelLogging.KEY_SEQ, true);
        c9iKA1C.A08("rowId", true);
        c9iKA1C.A08("serverMessageId", true);
        c9iKA1C.A08("requestId", true);
        c9iKA1C.A08(HatchContentBlockSerializer.TYPE_THINKING, true);
        c9iKA1C.A08("reactions", true);
        c9iKA1C.A08("citations", true);
        c9iKA1C.A08("channel", true);
        c9iKA1C.A08("turnKind", true);
        c9iKA1C.A08("executionTurnId", true);
        c9iKA1C.A08("milestoneType", true);
        c9iKA1C.A08("milestoneVideoPath", true);
        c9iKA1C.A08("milestoneVariant", true);
        c9iKA1C.A08("isSpokenSummary", true);
        c9iKA1C.A08("isPending", true);
        c9iKA1C.A08("sendStatus", true);
        c9iKA1C.A08("unsendStatus", true);
        c9iKA1C.A08("sendErrorMessage", true);
        c9iKA1C.A08("errorCategory", true);
        c9iKA1C.A08(C9Y.BUG_REPORT_ATTACHMENTS_ENDPOINT, true);
        c9iKA1C.A08("transcript", true);
        c9iKA1C.A08("replyAttribution", true);
        c9iKA1C.A08("widgets", true);
        c9iKA1C.A08("presentations", true);
        c9iKA1C.A08("segments", true);
        c9iKA1C.A08("isSyntheticPresentationCarrier", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = HatchPersistedMessageJson.$childSerializers;
        C9hr<?>[] c9hrArr = new C9hr[30];
        C07779iq c07779iq = C07779iq.A01;
        C9j1 c9j1 = C9j1.A00;
        C9hr c9hrA00 = AbstractC07749im.A00(c9j1);
        C9hr c9hrA002 = AbstractC07749im.A00(c9j1);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA005 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA16 = C3cG.A16(f0cArr, 9);
        C9hr c9hrA162 = C3cG.A16(f0cArr, 10);
        C9hr c9hrA006 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA007 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA008 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA009 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0010 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0011 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        System.arraycopy(new C9hr[]{c07779iq, c07779iq, c07779iq, c9j1, c9hrA00, c9hrA002, c9hrA003, c9hrA004, c9hrA005, c9hrA16, c9hrA162, c9hrA006, c9hrA007, c9hrA008, c9hrA009, c9hrA0010, c9hrA0011, c07839ix, c07839ix, c07779iq, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 23), AbstractC07749im.A00(HatchDeltaTranscript$$serializer.INSTANCE), AbstractC07749im.A00(ReplyAttributionSerializer.INSTANCE), C3cG.A16(f0cArr, 26)}, 0, c9hrArr, 0, 27);
        System.arraycopy(new C9hr[]{C3cG.A16(f0cArr, 27), C3cG.A16(f0cArr, 28), c07839ix}, 0, c9hrArr, 27, 3);
        return c9hrArr;
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchPersistedMessageJson hatchPersistedMessageJson) {
        AnonymousClass003.A0u(interfaceC07789is, hatchPersistedMessageJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchPersistedMessageJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_offline_offline(hatchPersistedMessageJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
