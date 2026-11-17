package com.facebook.aura.gateway;

import X.AIW;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06827l3;
import X.C0881AGi;
import X.C0924AIa;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C60Q;
import X.C6tn;
import X.C7384Etj;
import X.C7BY;
import X.C9oY;
import X.FGI;
import X.Hr7;
import com.facebook.aura.activation.repo.InviteCodeServerErrorKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.model.HatchDeltaTranscript;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchMessageChannel;
import com.facebook.aura.model.HatchMessageResource;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.model.HatchPlaceholderEntry;
import com.facebook.aura.model.HatchTranscriptMessage;
import com.facebook.aura.model.HatchTranscriptMetadata;
import com.facebook.aura.model.HatchTranscriptStatus;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class HatchChatHandlerKt {
    public static final String CONTENT_LENGTH_HEADER = "Content-Length";
    public static final String MAIN_CHAT_SCOPE = "main";
    public static final long MAX_CHAT_HISTORY_ERROR_BODY_BYTES = 65536;
    public static final long MAX_CHAT_HISTORY_RESPONSE_BYTES = 8388608;
    public static final String MESSAGE_STATE_DELETED = "DELETED";
    public static final String TAG = "HatchChatHandler";
    public static final C06827l3 ATTACHMENT_PATTERN = C06827l3.A02("\\[(image|file):(\\S+)\\s+(\\S+)]");
    public static final JsonObject EMPTY_JSON_OBJECT = C60O.A1G();

    public static final List<HatchMessage> mergeConsecutiveUserMessages(List<HatchMessage> list) {
        HatchMessageChannel hatchMessageChannel;
        Object objCopy$default;
        C7384Etj.A0Y(list, 0);
        if (list.size() <= 1) {
            return list;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        int i = 0;
        while (i < list.size()) {
            HatchMessage hatchMessage = list.get(i);
            HatchMessageRole hatchMessageRole = hatchMessage.role;
            HatchMessageRole hatchMessageRole2 = HatchMessageRole.USER;
            if (hatchMessageRole == hatchMessageRole2 && "message_parts".equals(hatchMessage.turnKind)) {
                ArrayList arrayList = new ArrayList();
                if (!arrayListA0h.isEmpty() && ((HatchMessage) AbstractC0878AGe.A0H(arrayListA0h)).role == hatchMessageRole2 && !"message_parts".equals(((HatchMessage) AbstractC0878AGe.A0H(arrayListA0h)).turnKind)) {
                    arrayList.add(arrayListA0h.remove(arrayListA0h.size() - 1));
                }
                while (i < list.size() && list.get(i).role == hatchMessageRole2 && "message_parts".equals(list.get(i).turnKind)) {
                    arrayList.add(list.get(i));
                    i++;
                }
                if (arrayList.size() == 1) {
                    objCopy$default = AbstractC0878AGe.A0F(arrayList);
                } else {
                    HatchMessage hatchMessage2 = (HatchMessage) AbstractC0878AGe.A0F(arrayList);
                    ArrayList arrayList2 = new ArrayList(Hr7.A1D(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((HatchMessage) it.next()).content);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (!C7BY.A0j((String) obj)) {
                            arrayList3.add(obj);
                        }
                    }
                    String strA0L = AbstractC0878AGe.A0L(PairsDiscretionDocument.TERMINATOR, "", "", arrayList3, null);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        AbstractC0882AGj.A0r(((HatchMessage) it2.next()).reactions, arrayList4);
                    }
                    List listA0X = AbstractC0878AGe.A0X(AbstractC0878AGe.A0f(arrayList4));
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        Iterable iterable = ((HatchMessage) it3.next()).attachments;
                        if (iterable == null) {
                            iterable = C0881AGi.A00;
                        }
                        AbstractC0882AGj.A0r(iterable, arrayList5);
                    }
                    if (arrayList5.isEmpty()) {
                        arrayList5 = null;
                    }
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            hatchMessageChannel = null;
                            break;
                        }
                        hatchMessageChannel = ((HatchMessage) it4.next()).channel;
                        if (hatchMessageChannel != null) {
                            break;
                        }
                    }
                    objCopy$default = HatchMessage.copy$default(hatchMessage2, null, null, strA0L, 0L, arrayList5, null, null, null, null, listA0X, null, null, hatchMessageChannel, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, -12821, 3, null);
                }
                arrayListA0h.add(objCopy$default);
            } else {
                arrayListA0h.add(hatchMessage);
                i++;
            }
        }
        return arrayListA0h;
    }

    public static final List<String> parseInlineReactionEmoji(JsonObject jsonObject) {
        C7384Etj.A0Y(jsonObject, 0);
        String strOptNonBlankString = optNonBlankString(jsonObject, "reaction_emoji");
        return strOptNonBlankString != null ? Collections.singletonList(strOptNonBlankString) : C0881AGi.A00;
    }

    public static final HatchDeltaTranscript withCitationResources(HatchDeltaTranscript hatchDeltaTranscript, String str, String str2, List<HatchMessageResource> list) {
        Map linkedHashMap;
        C7384Etj.A0Y(str, 1);
        C7384Etj.A0Y(list, 3);
        ArrayList<HatchMessageResource> arrayList = new ArrayList();
        for (HatchMessageResource hatchMessageResource : list) {
            if ("citation".equals(hatchMessageResource.kind)) {
                arrayList.add(hatchMessageResource);
            }
        }
        if (arrayList.isEmpty()) {
            return hatchDeltaTranscript;
        }
        if (hatchDeltaTranscript == null || (linkedHashMap = hatchDeltaTranscript.placeholders) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        for (HatchMessageResource hatchMessageResource2 : arrayList) {
            if (!linkedHashMap.containsKey(hatchMessageResource2.uri)) {
                String str3 = hatchMessageResource2.uri;
                C0924AIa c0924AIa = new C0924AIa();
                c0924AIa.put("permalink", str3);
                String str4 = hatchMessageResource2.label;
                if (str4 != null) {
                    c0924AIa.put("title", str4);
                }
                String str5 = hatchMessageResource2.domain;
                if (str5 != null) {
                    c0924AIa.put("domain", str5);
                }
                String str6 = hatchMessageResource2.faviconUrl;
                if (str6 != null) {
                    c0924AIa.put("favicon_url", str6);
                }
                linkedHashMap.put(str3, new HatchPlaceholderEntry(str3, "citation", true, AIW.A0K(c0924AIa)));
            }
        }
        int i = HatchDeltaTranscript.$stable;
        if (hatchDeltaTranscript == null) {
            return new HatchDeltaTranscript(str, null, null, str2, HatchTranscriptStatus.COMPLETED, new ArrayList(), null, linkedHashMap);
        }
        String str7 = hatchDeltaTranscript.messageId;
        String str8 = hatchDeltaTranscript.agentId;
        String str9 = hatchDeltaTranscript.sessionId;
        String str10 = hatchDeltaTranscript.replyToMessageId;
        HatchTranscriptStatus hatchTranscriptStatus = hatchDeltaTranscript.status;
        List<HatchTranscriptMessage> list2 = hatchDeltaTranscript.messages;
        HatchTranscriptMetadata hatchTranscriptMetadata = hatchDeltaTranscript.metadata;
        AnonymousClass003.A0y(hatchTranscriptStatus, list2);
        return new HatchDeltaTranscript(str7, str8, str9, str10, hatchTranscriptStatus, list2, hatchTranscriptMetadata, linkedHashMap);
    }

    public static final boolean isDeletedMarker(JsonObject jsonObject) {
        String strOptNonBlankString = optNonBlankString(jsonObject, "state");
        return (strOptNonBlankString != null && strOptNonBlankString.equalsIgnoreCase(MESSAGE_STATE_DELETED)) || JsonObjectExtensionsKt.optBoolean(jsonObject, "deleted", false);
    }

    public static final String optErrorDetail(JsonElement jsonElement) {
        if (jsonElement instanceof JsonPrimitive) {
            String strA04 = C9oY.A04((JsonPrimitive) jsonElement);
            if (strA04 != null) {
                return C6tn.A03(strA04);
            }
            return null;
        }
        if (!(jsonElement instanceof JsonObject)) {
            return null;
        }
        JsonObject jsonObject = (JsonObject) jsonElement;
        String strOptNonBlankString = optNonBlankString(jsonObject, ReplyAttributionSerializer.TYPE_MESSAGE);
        if (strOptNonBlankString != null) {
            return strOptNonBlankString;
        }
        String strOptNonBlankString2 = optNonBlankString(jsonObject, AuraDeeplinkRouteMapper.CODE_PARAM);
        return strOptNonBlankString2 == null ? optNonBlankString(jsonObject, "type") : strOptNonBlankString2;
    }

    public static final List<String> parseReactionEmojis(JsonArray jsonArray) {
        String strOptStringOrNull;
        if (jsonArray == null) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonElement jsonElementA11 = C60Q.A11(it);
            if (jsonElementA11 instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementA11;
                if (jsonPrimitive.A01()) {
                    String strA0l = AnonymousClass002.A0l(jsonPrimitive.A00());
                    C60Q.A1M(strA0l, arrayListA0h);
                }
            } else if ((jsonElementA11 instanceof JsonObject) && (strOptStringOrNull = JsonObjectExtensionsKt.optStringOrNull((JsonObject) jsonElementA11, "emoji")) != null && (strA0l = AnonymousClass002.A0l(strOptStringOrNull)) != null) {
                C60Q.A1M(strA0l, arrayListA0h);
            }
        }
        return arrayListA0h;
    }

    public static final String chatHistoryFailureDetail(Throwable th) {
        String strA03;
        String message = th.getMessage();
        return (message == null || (strA03 = C6tn.A03(message)) == null || C7BY.A0j(strA03)) ? C3cI.A0Y(th) : FGI.A0U(C3cI.A0Y(th), ":", strA03);
    }

    public static final String optNonBlankString(JsonObject jsonObject, String str) {
        String string;
        String strOptStringOrNull = JsonObjectExtensionsKt.optStringOrNull(jsonObject, str);
        if (strOptStringOrNull == null || (string = C7BY.A0F(strOptStringOrNull).toString()) == null || string.length() == 0) {
            return null;
        }
        return string;
    }

    public static final String optErrorDetail(JsonObject jsonObject) {
        JsonElement jsonElementA1F = C60O.A1F("error", jsonObject);
        if (jsonElementA1F == null && (jsonElementA1F = C60O.A1F(ReplyAttributionSerializer.TYPE_MESSAGE, jsonObject)) == null && (jsonElementA1F = (JsonElement) jsonObject.get(InviteCodeServerErrorKt.SERVER_ERROR_DETAIL_FIELD)) == null) {
            return null;
        }
        return optErrorDetail(jsonElementA1F);
    }
}
