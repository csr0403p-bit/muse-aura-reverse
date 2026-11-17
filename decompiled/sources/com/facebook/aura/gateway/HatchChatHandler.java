package com.facebook.aura.gateway;

import X.A3Y;
import X.A3Z;
import X.AbstractC06907md;
import X.AbstractC07127nr;
import X.AbstractC07979sd;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BQG;
import X.C06G;
import X.C0881AGi;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C9tI;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.G0W;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.conversation.data.ChatHistoryFetchFailure;
import com.facebook.aura.conversation.data.ChatHistoryFetchResult;
import com.facebook.aura.conversation.data.ChatHistoryFetchSuccess;
import com.facebook.aura.conversation.data.ChatHistoryResult;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.model.HatchAttachment;
import com.facebook.aura.model.HatchDeltaTranscript;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchTranscriptKt;
import com.facebook.aura.model.HatchTranscriptMessage;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.network.api.ByteLimitExceededException;
import com.facebook.aura.network.api.HttpResponseBytesKt;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.api.RpcMethod;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.HatchHttpFailure;
import com.facebook.aura.network.http.HatchHttpStreamRequestFailure;
import com.facebook.aura.network.http.HatchHttpStreamRequestResult;
import com.facebook.aura.network.http.HatchHttpStreamRequestSuccess;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class HatchChatHandler {
    public static final int $stable = 8;
    public final SingleFlight historySingleFlight;
    public final JarvisProtocol protocol;
    public final G0W<String, String, String, Unit> send;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchChatHandler", f = "HatchChatHandler.kt", l = {160}, m = "fetchChatHistory", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchChatHandler$fetchChatHistory$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchChatHandler.this.fetchChatHistory(0, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchChatHandler$fetchChatHistoryInternal$2", f = "HatchChatHandler.kt", l = {177}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchChatHandler$fetchChatHistoryInternal$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ChatHistoryFetchResult>, Object> {
        public final /* synthetic */ Long $beforeSeq;
        public final /* synthetic */ int $limit;
        public final /* synthetic */ String $sessionId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, Long l, String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$limit = i;
            this.$beforeSeq = l;
            this.$sessionId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchChatHandler.this.new AnonymousClass2(this.$limit, this.$beforeSeq, this.$sessionId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String strChatHistoryFailureDetail;
            JsonObject jsonObjectAsJsonObjectOrNull;
            C06G chatHistoryFetchSuccess;
            ChatHistoryFetchFailure chatHistoryFetchFailure;
            C06G chatHistoryFetchSuccess2;
            ChatHistoryPayloadJson chatHistoryPayloadJsonPayload;
            JsonArray jsonArray;
            Long lA0s;
            Object objOpenJarvisHttpResponseStreamDetailedInternal = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(objOpenJarvisHttpResponseStreamDetailedInternal);
                JarvisPath.ChatHistory chatHistory = JarvisPath.ChatHistory.INSTANCE;
                RequestType requestType = RequestType.GET;
                AbstractC3358CGz abstractC3358CGz = HatchChatHandler.this.userSession;
                HxE<String, ? extends Object>[] hxEArrBuildChatHistoryQueryParams = HatchChatHandlerJsonKt.buildChatHistoryQueryParams(this.$limit, this.$beforeSeq, this.$sessionId);
                this.label = 1;
                objOpenJarvisHttpResponseStreamDetailedInternal = hatchHttpApiA06.openJarvisHttpResponseStreamDetailedInternal(chatHistory, requestType, abstractC3358CGz, null, null, null, hxEArrBuildChatHistoryQueryParams, this);
                if (objOpenJarvisHttpResponseStreamDetailedInternal == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objOpenJarvisHttpResponseStreamDetailedInternal);
            }
            HatchHttpStreamRequestResult hatchHttpStreamRequestResult = (HatchHttpStreamRequestResult) objOpenJarvisHttpResponseStreamDetailedInternal;
            if (!(hatchHttpStreamRequestResult instanceof HatchHttpStreamRequestSuccess)) {
                if (!(hatchHttpStreamRequestResult instanceof HatchHttpStreamRequestFailure)) {
                    throw C3cG.A0q();
                }
                HatchHttpFailure hatchHttpFailure = ((HatchHttpStreamRequestFailure) hatchHttpStreamRequestResult).failure;
                ChatHistoryFetchFailure chatHistoryFetchFailure2 = new ChatHistoryFetchFailure(hatchHttpFailure.reason, null, hatchHttpFailure.detail);
                C3cG.A1G("fetchChatHistory failed: ", chatHistoryFetchFailure2.getLogValue(), HatchChatHandlerKt.TAG);
                return chatHistoryFetchFailure2;
            }
            HatchHttpResponseStream hatchHttpResponseStream = ((HatchHttpStreamRequestSuccess) hatchHttpStreamRequestResult).response;
            Long l = this.$beforeSeq;
            HatchChatHandler hatchChatHandler = HatchChatHandler.this;
            try {
                int i2 = hatchHttpResponseStream.statusCode;
                String strA0p = C60O.A0p("Content-Length", hatchHttpResponseStream.headers);
                long jLongValue = (strA0p == null || (lA0s = C9tI.A0s(strA0p)) == null) ? -1L : lA0s.longValue();
                InputStream inputStream = hatchHttpResponseStream.body;
                if (inputStream == null) {
                    ChatHistoryFetchFailure chatHistoryFetchFailure3 = new ChatHistoryFetchFailure("empty_body", C3cG.A0R(i2), null);
                    C3cG.A1G("fetchChatHistory failed: ", chatHistoryFetchFailure3.getLogValue(), HatchChatHandlerKt.TAG);
                    hatchHttpResponseStream.close();
                    return chatHistoryFetchFailure3;
                }
                try {
                    if (200 > i2 || i2 >= 300) {
                        try {
                            jsonObjectAsJsonObjectOrNull = JsonObjectExtensionsKt.asJsonObjectOrNull((JsonElement) AbstractC07979sd.A00(HttpResponseBytesKt.withByteLimit(inputStream, 65536L, jLongValue), JsonElementSerializer.A00, HatchJsonKt.HatchJson));
                        } catch (ByteLimitExceededException e) {
                            strChatHistoryFailureDetail = HatchChatHandlerKt.chatHistoryFailureDetail(e);
                        } catch (Exception unused) {
                        }
                        strChatHistoryFailureDetail = jsonObjectAsJsonObjectOrNull != null ? HatchChatHandlerKt.optErrorDetail(jsonObjectAsJsonObjectOrNull) : null;
                        ChatHistoryFetchFailure chatHistoryFetchFailure4 = new ChatHistoryFetchFailure("http_error", C3cG.A0R(i2), strChatHistoryFailureDetail);
                        C3cG.A1G("fetchChatHistory failed: ", chatHistoryFetchFailure4.getLogValue(), HatchChatHandlerKt.TAG);
                        chatHistoryFetchSuccess = chatHistoryFetchFailure4;
                    } else {
                        try {
                            chatHistoryPayloadJsonPayload = ((ChatHistoryResponseJson) AbstractC07979sd.A00(HttpResponseBytesKt.withByteLimit(inputStream, 8388608L, jLongValue), ChatHistoryResponseJson$$serializer.INSTANCE, HatchJsonKt.HatchJson)).payload();
                            jsonArray = chatHistoryPayloadJsonPayload.chat_events;
                        } catch (ByteLimitExceededException e2) {
                            ChatHistoryFetchFailure chatHistoryFetchFailure5 = new ChatHistoryFetchFailure("response_too_large", C3cG.A0R(i2), HatchChatHandlerKt.chatHistoryFailureDetail(e2));
                            C3cG.A1G("fetchChatHistory failed: ", chatHistoryFetchFailure5.getLogValue(), HatchChatHandlerKt.TAG);
                            chatHistoryFetchSuccess2 = chatHistoryFetchFailure5;
                        } catch (Exception e3) {
                            chatHistoryFetchFailure = new ChatHistoryFetchFailure("parse_failed", C3cG.A0R(i2), HatchChatHandlerKt.chatHistoryFailureDetail(e3));
                            C60O.A1Q("fetchChatHistory failed: ", chatHistoryFetchFailure.getLogValue(), HatchChatHandlerKt.TAG, e3);
                        }
                        if (jsonArray != null && !jsonArray.isEmpty()) {
                            jsonArray.size();
                            try {
                                chatHistoryFetchSuccess2 = new ChatHistoryFetchSuccess(new ChatHistoryResult(HatchChatHandlerKt.mergeConsecutiveUserMessages(hatchChatHandler.parseChatEventsToMessages$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(jsonArray)), chatHistoryPayloadJsonPayload.has_more));
                                hatchHttpResponseStream.close();
                                return chatHistoryFetchSuccess2;
                            } catch (Exception e4) {
                                chatHistoryFetchFailure = new ChatHistoryFetchFailure("parse_failed", C3cG.A0R(i2), HatchChatHandlerKt.chatHistoryFailureDetail(e4));
                                C60O.A1Q("fetchChatHistory failed: ", chatHistoryFetchFailure.getLogValue(), HatchChatHandlerKt.TAG, e4);
                                hatchHttpResponseStream.close();
                                return chatHistoryFetchFailure;
                            }
                        }
                        CFK.A06(HatchChatHandlerKt.TAG, AnonymousClass007.A0a("fetchChatHistory: empty response, beforeSeq=", l));
                        chatHistoryFetchSuccess = new ChatHistoryFetchSuccess(new ChatHistoryResult(C0881AGi.A00, chatHistoryPayloadJsonPayload.has_more));
                    }
                    hatchHttpResponseStream.close();
                    return chatHistoryFetchSuccess;
                } catch (CancellationException e5) {
                    throw e5;
                }
            } finally {
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ChatHistoryFetchResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchChatHandler", f = "HatchChatHandler.kt", l = {334}, m = "fetchUnreadCount", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchChatHandler$fetchUnreadCount$1, reason: invalid class name and case insensitive filesystem */
    public final class C120501 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C120501(HtJ<? super C120501> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchChatHandler.this.fetchUnreadCount(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchChatHandler", f = "HatchChatHandler.kt", l = {961}, m = "fetchUnreadState", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchChatHandler$fetchUnreadState$1, reason: invalid class name and case insensitive filesystem */
    public final class C120511 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public C120511(HtJ<? super C120511> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchChatHandler.this.fetchUnreadState(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchChatHandler", f = "HatchChatHandler.kt", l = {961}, m = "markChatAsSeen", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchChatHandler$markChatAsSeen$1, reason: invalid class name and case insensitive filesystem */
    public final class C120521 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C120521(HtJ<? super C120521> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchChatHandler.this.markChatAsSeen(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchChatHandler", f = "HatchChatHandler.kt", l = {985}, m = "toggleReaction", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchChatHandler$toggleReaction$1, reason: invalid class name and case insensitive filesystem */
    public final class C120531 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C120531(HtJ<? super C120531> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchChatHandler.this.toggleReaction(null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchChatHandler(G0W<? super String, ? super String, ? super String, Unit> g0w, JarvisProtocol jarvisProtocol, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass005.A10(g0w, jarvisProtocol, abstractC3358CGz);
        this.send = g0w;
        this.protocol = jarvisProtocol;
        this.userSession = abstractC3358CGz;
        this.historySingleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
    }

    public final List<HatchMessage> parseChatEventsToMessages$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(JsonArray jsonArray) {
        HatchDeltaTranscript transcript;
        C7384Etj.A0Y(jsonArray, 0);
        final ArrayList arrayListA0h = C3cG.A0h();
        int size = jsonArray.size();
        for (int i = 0; i < size; i++) {
            JsonObject jsonObjectAsJsonObjectOrNull = JsonObjectExtensionsKt.asJsonObjectOrNull(jsonArray.A00.get(i));
            if (jsonObjectAsJsonObjectOrNull != null) {
                arrayListA0h.add(new HatchChatHandler$parseChatEventsToMessages$EventRow(jsonObjectAsJsonObjectOrNull, JsonObjectExtensionsKt.optLong(jsonObjectAsJsonObjectOrNull, AgeCheckFunnelLogging.KEY_SEQ, LinkEncryptedPairingKt.LINK_COUNTER_MAX), JsonObjectExtensionsKt.optLong(jsonObjectAsJsonObjectOrNull, "occurred_at_ms", 0L)));
            }
        }
        final Comparator comparator = new Comparator() { // from class: com.facebook.aura.gateway.HatchChatHandler$parseChatEventsToMessages$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Long.valueOf(((HatchChatHandler$parseChatEventsToMessages$EventRow) t).seq).compareTo(Long.valueOf(((HatchChatHandler$parseChatEventsToMessages$EventRow) t2).seq));
            }
        };
        AbstractC06907md.A04(arrayListA0h, new Comparator() { // from class: com.facebook.aura.gateway.HatchChatHandler$parseChatEventsToMessages$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare == 0 ? Long.valueOf(((HatchChatHandler$parseChatEventsToMessages$EventRow) t).occurredAtMs).compareTo(Long.valueOf(((HatchChatHandler$parseChatEventsToMessages$EventRow) t2).occurredAtMs)) : iCompare;
            }
        });
        A3Z.A00(new A3Y<HatchChatHandler$parseChatEventsToMessages$EventRow, String>() { // from class: com.facebook.aura.gateway.HatchChatHandler$parseChatEventsToMessages$$inlined$groupingBy$1
            @Override // X.A3Y
            public String keyOf(HatchChatHandler$parseChatEventsToMessages$EventRow hatchChatHandler$parseChatEventsToMessages$EventRow) {
                return JsonObjectExtensionsKt.optString(hatchChatHandler$parseChatEventsToMessages$EventRow.json, "event_name", "unknown");
            }

            @Override // X.A3Y
            public Iterator<HatchChatHandler$parseChatEventsToMessages$EventRow> sourceIterator() {
                return arrayListA0h.iterator();
            }
        });
        if (!arrayListA0h.isEmpty()) {
            AbstractC0878AGe.A0F(arrayListA0h);
            AbstractC0878AGe.A0H(arrayListA0h);
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        LinkedHashMap linkedHashMapA0j2 = C3cG.A0j();
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            HatchChatHandler$parseChatEventsToMessages$EventRow hatchChatHandler$parseChatEventsToMessages$EventRow = (HatchChatHandler$parseChatEventsToMessages$EventRow) it.next();
            try {
                parseChatEventsToMessages$applyRow(this, linkedHashMapA0j, linkedHashMapA0j2, hatchChatHandler$parseChatEventsToMessages$EventRow);
            } catch (Exception e) {
                CFK.A0A(HatchChatHandlerKt.TAG, FGI.A0B(hatchChatHandler$parseChatEventsToMessages$EventRow.seq, "chat history: skipping unparseable event seq="), e);
            }
        }
        Iterator itA0i = C3cG.A0i(linkedHashMapA0j2);
        while (itA0i.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0i.next();
            Object key = entry.getKey();
            HatchDeltaAccumulator hatchDeltaAccumulator = (HatchDeltaAccumulator) entry.getValue();
            HatchChatHandler$parseChatEventsToMessages$MessageEntry hatchChatHandler$parseChatEventsToMessages$MessageEntry = (HatchChatHandler$parseChatEventsToMessages$MessageEntry) linkedHashMapA0j.get(key);
            if (hatchChatHandler$parseChatEventsToMessages$MessageEntry != null && (transcript = hatchDeltaAccumulator.getTranscript()) != null) {
                HatchDeltaTranscript hatchDeltaTranscriptFinalizeTranscript = HatchTranscriptKt.finalizeTranscript(transcript);
                List<HatchTranscriptMessage> list = hatchDeltaTranscriptFinalizeTranscript.messages;
                ArrayList arrayList = new ArrayList();
                Iterator<HatchTranscriptMessage> it2 = list.iterator();
                while (it2.hasNext()) {
                    AbstractC0882AGj.A0r(it2.next().content, arrayList);
                }
                String strCollectTextFromBlocks = HatchTranscriptKt.collectTextFromBlocks(arrayList);
                if (strCollectTextFromBlocks.length() == 0) {
                    strCollectTextFromBlocks = hatchChatHandler$parseChatEventsToMessages$MessageEntry.message.content;
                }
                hatchChatHandler$parseChatEventsToMessages$MessageEntry.setMessage(HatchMessage.copy$default(hatchChatHandler$parseChatEventsToMessages$MessageEntry.message, null, null, strCollectTextFromBlocks, 0L, null, null, null, null, null, null, null, hatchDeltaTranscriptFinalizeTranscript, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, -2053, 3, null));
                linkedHashMapA0j.put(key, hatchChatHandler$parseChatEventsToMessages$MessageEntry);
            }
        }
        Collection collectionValues = linkedHashMapA0j.values();
        C7384Etj.A0U(collectionValues);
        List listA0c = AbstractC0878AGe.A0c(collectionValues, new Comparator() { // from class: com.facebook.aura.gateway.HatchChatHandler$parseChatEventsToMessages$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Long.valueOf(((HatchChatHandler$parseChatEventsToMessages$MessageEntry) t).sortSeq).compareTo(Long.valueOf(((HatchChatHandler$parseChatEventsToMessages$MessageEntry) t2).sortSeq));
            }
        });
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0c);
        Iterator it3 = listA0c.iterator();
        while (it3.hasNext()) {
            arrayListA0i.add(((HatchChatHandler$parseChatEventsToMessages$MessageEntry) it3.next()).message);
        }
        return HatchPresentationTokenBinderKt.bindWidgetPresentationsToTokenHosts(arrayListA0i);
    }

    public final void sendChatMessage(String str, List<HatchAttachment> list, Map<String, ? extends Object> map, String str2, String str3) {
        AnonymousClass002.A1C(str, 0, str3);
        BQG.A17(str3, 8);
        if (str2 != null) {
            BQG.A17(str2, 20);
        }
        this.send.invoke(this.protocol.buildChatSendRequest(str3, str, list, map, str2), str3, RpcMethod.ChatStream.INSTANCE.getValue());
    }

    public static /* synthetic */ Object fetchChatHistory$default(HatchChatHandler hatchChatHandler, int i, Long l, String str, HtJ htJ, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 50;
        }
        if ((i2 & 2) != 0) {
            l = null;
        }
        return hatchChatHandler.fetchChatHistory(i, l, str, htJ);
    }

    public static /* synthetic */ Object fetchChatHistoryInternal$default(HatchChatHandler hatchChatHandler, int i, Long l, String str, HtJ htJ, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 50;
        }
        if ((i2 & 2) != 0) {
            l = null;
        }
        return hatchChatHandler.fetchChatHistoryInternal(i, l, str, htJ);
    }

    private final List<HatchWidget> mergeInlineWidgetIntoList(List<HatchWidget> list, HatchWidget hatchWidget) {
        if (list == null) {
            list = C0881AGi.A00;
        }
        ArrayList arrayListA0R = AbstractC0878AGe.A0R(list);
        Iterator it = arrayListA0R.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!C7384Etj.areEqual(((HatchWidget) it.next()).widgetId, hatchWidget.widgetId)) {
                i++;
            } else if (i >= 0) {
                arrayListA0R.set(i, HatchWidgetPresentationKt.preserveWidgetState((HatchWidget) arrayListA0R.get(i), hatchWidget));
                return arrayListA0R;
            }
        }
        arrayListA0R.add(hatchWidget);
        return arrayListA0R;
    }

    private final List<HatchWidget> mergeInlineWidgets(List<HatchWidget> list, List<HatchWidget> list2) {
        if (list2 != null && !list2.isEmpty()) {
            Iterator<HatchWidget> it = list2.iterator();
            while (it.hasNext()) {
                list = mergeInlineWidgetIntoList(list, it.next());
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendChatMessage$default(HatchChatHandler hatchChatHandler, String str, List list, Map map, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        hatchChatHandler.sendChatMessage(str, list, map, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchChatHistory(int r8, java.lang.Long r9, java.lang.String r10, X.HtJ<? super com.facebook.aura.conversation.data.ChatHistoryFetchResult> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.facebook.aura.gateway.HatchChatHandler.AnonymousClass1
            if (r0 == 0) goto L4e
            r5 = r11
            com.facebook.aura.gateway.HatchChatHandler$fetchChatHistory$1 r5 = (com.facebook.aura.gateway.HatchChatHandler.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 != r3) goto L6a
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
            if (r0 == 0) goto L54
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            T r4 = r1.value
            return r4
        L2b:
            X.Hwg.A00(r1)
            com.facebook.aura.common.coroutines.SingleFlight r2 = r7.historySingleFlight
            java.lang.Integer r1 = X.C3cG.A0R(r8)
            X.HwV r0 = new X.HwV
            r0.<init>(r10, r9, r1)
            r11 = 0
            com.facebook.aura.gateway.HatchChatHandler$fetchChatHistory$result$1 r6 = new com.facebook.aura.gateway.HatchChatHandler$fetchChatHistory$result$1
            r6.<init>(r7, r8, r9, r10, r11)
            r5.L$0 = r11
            r5.L$1 = r11
            r5.I$0 = r8
            r5.label = r3
            java.lang.Object r1 = r2.invoke(r0, r6, r5)
            if (r1 != r4) goto L20
            return r4
        L4e:
            com.facebook.aura.gateway.HatchChatHandler$fetchChatHistory$1 r5 = new com.facebook.aura.gateway.HatchChatHandler$fetchChatHistory$1
            r5.<init>(r11)
            goto L12
        L54:
            com.facebook.aura.common.coroutines.SingleFlightResult$Skipped r0 = com.facebook.aura.common.coroutines.SingleFlightResult.Skipped.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L65
            r1 = 0
            java.lang.String r0 = "coalesced_skip"
            com.facebook.aura.conversation.data.ChatHistoryFetchFailure r4 = new com.facebook.aura.conversation.data.ChatHistoryFetchFailure
            r4.<init>(r0, r1, r1)
            return r4
        L65:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L6a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchChatHandler.fetchChatHistory(int, java.lang.Long, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchUnreadCount(java.lang.String r6, X.HtJ<? super java.lang.Integer> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.gateway.HatchChatHandler.C120501
            if (r0 == 0) goto L3c
            r4 = r7
            com.facebook.aura.gateway.HatchChatHandler$fetchUnreadCount$1 r4 = (com.facebook.aura.gateway.HatchChatHandler.C120501) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L42
            X.Hwg.A00(r3)
        L20:
            com.facebook.aura.gateway.ChatUnreadState r3 = (com.facebook.aura.gateway.ChatUnreadState) r3
            if (r3 == 0) goto L2b
            int r0 = r3.unreadCount
        L26:
            java.lang.Integer r2 = X.C3cG.A0R(r0)
            return r2
        L2b:
            r0 = 0
            goto L26
        L2d:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.label = r1
            java.lang.Object r3 = r5.fetchUnreadState(r6, r4)
            if (r3 != r2) goto L20
            return r2
        L3c:
            com.facebook.aura.gateway.HatchChatHandler$fetchUnreadCount$1 r4 = new com.facebook.aura.gateway.HatchChatHandler$fetchUnreadCount$1
            r4.<init>(r7)
            goto L12
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchChatHandler.fetchUnreadCount(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchUnreadState(java.lang.String r18, X.HtJ<? super com.facebook.aura.gateway.ChatUnreadState> r19) {
        /*
            r17 = this;
            r4 = r19
            boolean r0 = r4 instanceof com.facebook.aura.gateway.HatchChatHandler.C120511
            r5 = r17
            if (r0 == 0) goto L80
            r3 = r4
            com.facebook.aura.gateway.HatchChatHandler$fetchUnreadState$1 r3 = (com.facebook.aura.gateway.HatchChatHandler.C120511) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r2 = r3.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r14 = 1
            if (r0 == 0) goto L39
            if (r0 != r14) goto L86
            java.lang.Object r3 = X.AnonymousClass001.A0q(r2)
        L25:
            boolean r0 = r3 instanceof X.C10571Hud
            r2 = 0
            if (r0 == 0) goto L2b
            r3 = r2
        L2b:
            com.facebook.aura.gateway.UnreadCountResponseJson r3 = (com.facebook.aura.gateway.UnreadCountResponseJson) r3
            if (r3 == 0) goto L38
            int r1 = r3.unread_count
            java.lang.Long r0 = r3.seen_at_ms
            com.facebook.aura.gateway.ChatUnreadState r2 = new com.facebook.aura.gateway.ChatUnreadState
            r2.<init>(r1, r0)
        L38:
            return r2
        L39:
            X.Hwg.A00(r2)
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$ChatUnreadCount r7 = com.facebook.aura.network.api.JarvisPath.ChatUnreadCount.INSTANCE
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r9 = r5.userSession
            X.HxE[] r0 = com.facebook.aura.gateway.HatchChatHandlerJsonKt.buildUnreadCountQueryParams(r18)
            X.HxE[] r11 = X.C60O.A1a(r0)
            java.util.Set r13 = X.AnonymousClass004.A18()
            X.9jH r15 = X.AGH.A0E()
            com.facebook.aura.gateway.HatchChatHandler$fetchUnreadState$$inlined$executeJarvisRequest-1iavgos$default$1 r5 = com.facebook.aura.gateway.HatchChatHandler$fetchUnreadState$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r6 = 0
            r10 = 0
            r3.L$0 = r10
            r3.L$1 = r10
            r3.L$2 = r10
            r3.L$3 = r10
            r3.L$4 = r10
            r3.L$5 = r10
            r3.L$6 = r10
            r3.L$7 = r10
            r3.I$0 = r14
            r3.I$1 = r14
            r3.I$2 = r6
            r3.label = r14
            r12 = r10
            r16 = r14
            r17 = r10
            r18 = r6
            r19 = r3
            java.lang.Object r3 = r4.m1595executeBodylessJarvisRequestWithp3iPjrY(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r3 != r1) goto L25
            return r1
        L80:
            com.facebook.aura.gateway.HatchChatHandler$fetchUnreadState$1 r3 = new com.facebook.aura.gateway.HatchChatHandler$fetchUnreadState$1
            r3.<init>(r4)
            goto L16
        L86:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchChatHandler.fetchUnreadState(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object markChatAsSeen(java.lang.String r18, X.HtJ<? super com.facebook.aura.gateway.MarkChatAsSeenResult> r19) {
        /*
            r17 = this;
            r5 = r18
            r4 = r19
            boolean r0 = r4 instanceof com.facebook.aura.gateway.HatchChatHandler.C120521
            r6 = r17
            if (r0 == 0) goto L85
            r3 = r4
            com.facebook.aura.gateway.HatchChatHandler$markChatAsSeen$1 r3 = (com.facebook.aura.gateway.HatchChatHandler.C120521) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r3.label = r2
        L18:
            java.lang.Object r2 = r3.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r14 = 1
            if (r0 == 0) goto L3b
            if (r0 != r14) goto L8b
            java.lang.Object r3 = X.AnonymousClass001.A0q(r2)
        L27:
            boolean r0 = r3 instanceof X.C10571Hud
            r2 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L2f
            r3 = r1
        L2f:
            com.facebook.aura.gateway.MarkChatAsSeenPayloadJson r3 = (com.facebook.aura.gateway.MarkChatAsSeenPayloadJson) r3
            if (r3 == 0) goto L35
            java.lang.Boolean r1 = r3.has_unread_threads
        L35:
            com.facebook.aura.gateway.MarkChatAsSeenResult r0 = new com.facebook.aura.gateway.MarkChatAsSeenResult
            r0.<init>(r2, r1)
            return r0
        L3b:
            X.Hwg.A00(r2)
            if (r18 != 0) goto L42
            java.lang.String r5 = "main"
        L42:
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$ChatSeen r7 = new com.facebook.aura.network.api.JarvisPath$ChatSeen
            r7.<init>(r5)
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r9 = r6.userSession
            r6 = 0
            X.HxE[] r11 = new X.HxE[r6]
            java.util.Set r13 = X.AnonymousClass004.A18()
            X.9jH r15 = X.AGH.A0E()
            com.facebook.aura.gateway.HatchChatHandler$markChatAsSeen$$inlined$executeJarvisRequest-1iavgos$default$1 r5 = com.facebook.aura.gateway.HatchChatHandler$markChatAsSeen$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r10 = 0
            r3.L$0 = r10
            r3.L$1 = r10
            r3.L$2 = r10
            r3.L$3 = r10
            r3.L$4 = r10
            r3.L$5 = r10
            r3.L$6 = r10
            r3.L$7 = r10
            r3.L$8 = r10
            r3.I$0 = r14
            r3.I$1 = r14
            r3.I$2 = r6
            r3.label = r14
            r12 = r10
            r16 = r14
            r17 = r10
            r18 = r6
            r19 = r3
            java.lang.Object r3 = r4.m1595executeBodylessJarvisRequestWithp3iPjrY(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r3 != r1) goto L27
            return r1
        L85:
            com.facebook.aura.gateway.HatchChatHandler$markChatAsSeen$1 r3 = new com.facebook.aura.gateway.HatchChatHandler$markChatAsSeen$1
            r3.<init>(r4)
            goto L18
        L8b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchChatHandler.markChatAsSeen(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object toggleReaction(java.lang.String r26, java.lang.String r27, java.lang.String r28, X.HtJ<? super java.util.List<java.lang.String>> r29) {
        /*
            r25 = this;
            r4 = r29
            boolean r0 = r4 instanceof com.facebook.aura.gateway.HatchChatHandler.C120531
            r5 = r25
            if (r0 == 0) goto La5
            r2 = r4
            com.facebook.aura.gateway.HatchChatHandler$toggleReaction$1 r2 = (com.facebook.aura.gateway.HatchChatHandler.C120531) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto La5
            int r3 = r3 - r1
            r2.label = r3
        L16:
            java.lang.Object r4 = r2.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r1 = 1
            if (r0 == 0) goto L3a
            if (r0 != r1) goto Lad
            java.lang.Object r2 = X.AnonymousClass001.A0q(r4)
        L25:
            boolean r0 = r2 instanceof X.C10571Hud
            r1 = 0
            if (r0 == 0) goto L2b
            r2 = r1
        L2b:
            com.facebook.aura.gateway.ToggleReactionResponseJson r2 = (com.facebook.aura.gateway.ToggleReactionResponseJson) r2
            if (r2 == 0) goto Lac
            boolean r0 = r2.ok
            if (r0 == 0) goto Lac
            kotlinx.serialization.json.JsonArray r0 = r2.reactions
            java.util.List r3 = com.facebook.aura.gateway.HatchChatHandlerKt.parseReactionEmojis(r0)
            return r3
        L3a:
            X.Hwg.A00(r4)
            com.facebook.aura.network.http.HatchHttpApi r7 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$ReactionsToggle r11 = com.facebook.aura.network.api.JarvisPath.ReactionsToggle.INSTANCE
            com.facebook.aura.gateway.ToggleReactionRequestJson r12 = new com.facebook.aura.gateway.ToggleReactionRequestJson
            r6 = r26
            r4 = r27
            r0 = r28
            r12.<init>(r6, r4, r0)
            com.facebook.aura.network.http.RequestType r13 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r14 = r5.userSession
            r10 = 0
            X.HxE[] r0 = new X.HxE[r10]
            java.util.Set r18 = X.AnonymousClass004.A18()
            X.9jH r21 = X.AGH.A0E()
            com.facebook.aura.gateway.HatchChatHandler$toggleReaction$$inlined$executeJarvisRequest-Z6QaZII$default$1 r8 = com.facebook.aura.gateway.HatchChatHandler$toggleReaction$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.gateway.HatchChatHandler$toggleReaction$$inlined$executeJarvisRequest-Z6QaZII$default$2 r9 = com.facebook.aura.gateway.HatchChatHandler$toggleReaction$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r15 = 0
            r2.L$0 = r15
            r2.L$1 = r15
            r2.L$2 = r15
            r2.L$3 = r15
            r2.L$4 = r15
            r2.L$5 = r15
            r2.L$6 = r15
            r2.L$7 = r15
            r2.L$8 = r15
            r2.L$9 = r15
            r2.L$10 = r15
            r2.I$0 = r1
            r2.I$1 = r1
            r2.I$2 = r10
            r2.I$3 = r1
            r2.I$4 = r10
            r2.I$5 = r10
            r2.I$6 = r10
            r2.label = r1
            r16 = r15
            r20 = r1
            r22 = r15
            r23 = r10
            r24 = r1
            r25 = r10
            r26 = r10
            r27 = r15
            r28 = r10
            r29 = r2
            r17 = r0
            r19 = r1
            java.lang.Object r2 = r7.m1599executeJarvisRequestWithFof5HsY(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            if (r2 != r3) goto L25
            return r3
        La5:
            com.facebook.aura.gateway.HatchChatHandler$toggleReaction$1 r2 = new com.facebook.aura.gateway.HatchChatHandler$toggleReaction$1
            r2.<init>(r4)
            goto L16
        Lac:
            return r1
        Lad:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchChatHandler.toggleReaction(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchChatHistoryInternal(int i, Long l, String str, HtJ<? super ChatHistoryFetchResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(i, l, str, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x03a5 A[PHI: r4
  0x03a5: PHI (r4v35 java.lang.String) = (r4v34 java.lang.String), (r4v37 java.lang.String), (r4v38 java.lang.String) binds: [B:100:0x038b, B:102:0x0397, B:105:0x03a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04ad A[PHI: r9
  0x04ad: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v6 java.lang.String), (r9v7 java.lang.String) binds: [B:143:0x0493, B:145:0x049f, B:148:0x04ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x052e A[PHI: r8
  0x052e: PHI (r8v4 kotlinx.serialization.json.JsonObject) = (r8v3 kotlinx.serialization.json.JsonObject), (r8v11 kotlinx.serialization.json.JsonObject) binds: [B:176:0x0524, B:179:0x052c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x055c A[PHI: r13
  0x055c: PHI (r13v6 java.lang.String) = (r13v3 java.lang.String), (r13v7 java.lang.String) binds: [B:211:0x05f6, B:190:0x055a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05fa A[PHI: r13
  0x05fa: PHI (r13v4 java.lang.String) = (r13v3 java.lang.String), (r13v6 java.lang.String) binds: [B:211:0x05f6, B:192:0x0566] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0634 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0850 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x08e2 A[PHI: r6
  0x08e2: PHI (r6v19 java.lang.String) = (r6v18 java.lang.String), (r6v20 java.lang.String) binds: [B:352:0x08da, B:354:0x08dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:418:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:424:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0373  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void parseChatEventsToMessages$applyRow(com.facebook.aura.gateway.HatchChatHandler r70, java.util.LinkedHashMap<java.lang.String, com.facebook.aura.gateway.HatchChatHandler$parseChatEventsToMessages$MessageEntry> r71, java.util.Map<java.lang.String, com.facebook.aura.gateway.HatchDeltaAccumulator> r72, com.facebook.aura.gateway.HatchChatHandler$parseChatEventsToMessages$EventRow r73) {
        /*
            Method dump skipped, instructions count: 2340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchChatHandler.parseChatEventsToMessages$applyRow(com.facebook.aura.gateway.HatchChatHandler, java.util.LinkedHashMap, java.util.Map, com.facebook.aura.gateway.HatchChatHandler$parseChatEventsToMessages$EventRow):void");
    }
}
