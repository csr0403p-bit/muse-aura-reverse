package com.facebook.aura.gateway;

import X.AGH;
import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C0881AGi;
import X.C2nw;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import X.C9iZ;
import X.C9oY;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.analytics.hatch.HatchSessionId;
import com.facebook.aura.bloks.data.AuraBloksDataProps;
import com.facebook.aura.conversation.widget.api.ConversationWidgetKinds;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.model.HatchAttachment;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.network.AuraAcceptLanguage;
import com.facebook.aura.network.api.RpcMethod;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class JarvisProtocolJsonKt {
    public static final long LARGE_FRAME_WARN_CHARS = 4194304;
    public static final String TAG = "JarvisProtocolJson";
    public static final String FACEBOOK_THUMBS_UP_CAPABILITY = "custom_reactions_facebook_thumbs_up_v1";
    public static final String VOICE_USER_LIVE_TRANSCRIPT_CAPABILITY = "voice_user_live_transcript";
    public static final List<String> CHAT_SUBSCRIBE_CAPABILITIES = Arrays.asList("delta_stream", "status_narration", "chat_cancel", "custom_reactions", FACEBOOK_THUMBS_UP_CAPABILITY, VOICE_USER_LIVE_TRANSCRIPT_CAPABILITY, "voice_realtime_event_opt_out");

    public static final String buildChatStreamBody(String str, String str2, List<HatchAttachment> list, Map<String, ? extends Object> map, String str3, String str4) {
        Map mapA0E;
        long j;
        AnonymousClass003.A0u(str, str2);
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06(ReplyAttributionSerializer.TYPE_MESSAGE, str2, c2nwA1K);
        if (str3 != null) {
            C7qW.A06("in_reply_to", str3, c2nwA1K);
        }
        if (map != null) {
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                c2nwA1K.A01(C60O.A0t(entryA0l), toJsonElementSafe(entryA0l.getValue()));
            }
        }
        Object obj = map != null ? map.get("metadata") : null;
        if (!(obj instanceof JsonObject) || (mapA0E = (JsonObject) obj) == null) {
            mapA0E = AGH.A0E();
        }
        c2nwA1K.A01("metadata", new JsonObject(AnonymousClass006.A11("mobile_app_session_id", C9oY.A07(HatchSessionId.INSTANCE.get()), mapA0E)));
        if (list != null && !list.isEmpty()) {
            C7pd c7pdA01 = C7pd.A01();
            Iterator<HatchAttachment> it = list.iterator();
            while (it.hasNext()) {
                C7qW.A0B(new JarvisProtocolJsonKt$buildChatStreamBody$params$1$2$1$1(it.next()), c7pdA01);
            }
            C7qW.A0B(new JarvisProtocolJsonKt$buildChatStreamBody$params$1$2$2(str2), c7pdA01);
            c2nwA1K.A01(ConnectorOrderCheckoutKt.ITEMS_KEY, C7pd.A00(c7pdA01));
        }
        JsonObject jsonObjectA00 = c2nwA1K.A00();
        if (list != null) {
            Iterator<HatchAttachment> it2 = list.iterator();
            int length = 0;
            while (it2.hasNext()) {
                byte[] bArr = it2.next().data;
                length += bArr != null ? bArr.length : 0;
            }
            j = length;
        } else {
            j = 0;
        }
        int length2 = str2.length();
        long j2 = length2 * 2;
        int size = list != null ? list.size() : 0;
        StringBuilder sbA0y = C60O.A0y("textChars=", length2);
        sbA0y.append(" attachments=");
        sbA0y.append(size);
        sbA0y.append(" inlineBytes=");
        sbA0y.append(j);
        sbA0y.append(" projectedChars=");
        sbA0y.append(j2);
        String string = sbA0y.toString();
        if (j2 > 4194304 || j > 0) {
            C3cG.A1G("Unexpected chat.stream frame: ", string, TAG);
        }
        return HatchJsonKt.HatchJson.A02(new ChatRequestEnvelopeJson("req", str, RpcMethod.ChatStream.INSTANCE.getValue(), jsonObjectA00, str4, AuraAcceptLanguage.INSTANCE.headerValue()), ChatRequestEnvelopeJson$$serializer.INSTANCE);
    }

    public static final String buildChatSubscribeBody(String str, String str2, Long l, Long l2, Integer num, String str3) {
        C7384Etj.A0Y(str, 0);
        return HatchJsonKt.HatchJson.A02(new ChatRequestEnvelopeJson("req", str, RpcMethod.ChatSubscribe.INSTANCE.getValue(), chatSubscribeParams(str2, l, l2, num), str3, AuraAcceptLanguage.INSTANCE.headerValue()), ChatRequestEnvelopeJson$$serializer.INSTANCE);
    }

    public static final String buildChatSubscribeParams(String str, Long l, Long l2, Integer num) {
        C7384Etj.A0Y(str, 0);
        return chatSubscribeParams(str, l, l2, num).toString();
    }

    public static final String buildGatewayRequestBody(String str, RpcMethod rpcMethod, JsonElement jsonElement) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(rpcMethod, 1);
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("type", "req", c2nwA1K);
        C7qW.A06("id", str, c2nwA1K);
        C7qW.A06(AgeCheckFunnelLogging.KEY_METHOD, rpcMethod.getValue(), c2nwA1K);
        C7qW.A06("accept_language", AuraAcceptLanguage.INSTANCE.headerValue(), c2nwA1K);
        if (jsonElement != null) {
            c2nwA1K.A01(AuraBloksDataProps.PARAMS, jsonElement);
        }
        return C60O.A0v(c2nwA1K);
    }

    public static final List<String> chatSubscribeCapabilities(boolean z) {
        return AbstractC0878AGe.A0P(z ? Collections.singletonList("session_identity_ack") : C0881AGi.A00, AbstractC0878AGe.A0P(ConversationWidgetKinds.INSTANCE.registered(), CHAT_SUBSCRIBE_CAPABILITIES));
    }

    public static final List<String> getCHAT_SUBSCRIBE_CAPABILITIES() {
        return CHAT_SUBSCRIBE_CAPABILITIES;
    }

    public static final JsonElement toJsonElementSafe(Object obj) {
        String string;
        if (obj == null) {
            obj = JsonNull.A00;
        } else if (!(obj instanceof JsonElement)) {
            if (obj instanceof String) {
                string = (String) obj;
            } else if (obj instanceof Boolean) {
                C9iZ c9iZ = C9oY.A00;
                obj = new JsonLiteral(obj, null, false);
            } else if (obj instanceof Number) {
                obj = C9oY.A06((Number) obj);
            } else {
                string = obj.toString();
            }
            obj = C9oY.A07(string);
        }
        return (JsonElement) obj;
    }

    public static final JsonObject chatSubscribeParams(String str, Long l, Long l2, Integer num) {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A07("capabilities", new JarvisProtocolJsonKt$chatSubscribeParams$1$1(str), c2nwA1K);
        if (str != null) {
            C7qW.A06("session_id", str, c2nwA1K);
        }
        if (l != null) {
            C7qW.A05(l, "after_stream_seq", c2nwA1K);
        }
        if (l2 != null) {
            C7qW.A05(l2, "after_chat_event_seq", c2nwA1K);
        }
        if (num != null) {
            C7qW.A05(num, "replay_limit", c2nwA1K);
        }
        return c2nwA1K.A00();
    }
}
