package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.network.api.RpcMethod;
import com.facebook.aura.network.transport.AuraNetworkLogEntry;
import com.facebook.aura.network.transport.AuraNetworkLogRecorder;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class HatchGatewayNetworkLogRecorder {
    public static final int $stable = 8;

    @Deprecated
    public static final String CHAT_CANCEL_SUFFIX = "/chat/cancel";

    @Deprecated
    public static final String CHAT_STREAM_SUFFIX = "/chat/stream";
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String EVENT_MESSAGE_DONE = "delta.message_done";

    @Deprecated
    public static final String EVENT_MESSAGE_START = "delta.message_start";

    @Deprecated
    public static final int MAX_PENDING = 128;

    @Deprecated
    public static final String METHOD_WS = "WS";

    @Deprecated
    public static final String METHOD_WS_EVENT = "WS_EVENT";

    @Deprecated
    public static final int STATUS_ERROR = 500;

    @Deprecated
    public static final int STATUS_OK = 200;
    public final ConcurrentHashMap<String, PendingEntry> pendingRequests = C60O.A1C();

    public final class PendingEntry {
        public final long startedAtMs;
        public final String suffix;

        public PendingEntry(long j, String str) {
            C7384Etj.A0Y(str, 1);
            this.startedAtMs = j;
            this.suffix = str;
        }

        public final long getStartedAtMs() {
            return this.startedAtMs;
        }

        public final String getSuffix() {
            return this.suffix;
        }
    }

    public final void recordReceived(String str, JsonObject jsonObject) {
        boolean zEquals;
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        int i;
        String str2;
        String strA0U;
        PendingEntry pendingEntryRemove;
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(jsonObject, 1);
        String strRedactedBase = redactedBase(str);
        String strOptString = JsonObjectExtensionsKt.optString(jsonObject, "type", "");
        int iHashCode = strOptString.hashCode();
        if (iHashCode == 100835) {
            zEquals = strOptString.equals("evt");
        } else {
            if (iHashCode == 112800) {
                if (strOptString.equals("res")) {
                    String strOptString2 = JsonObjectExtensionsKt.optString(jsonObject, "id", "");
                    if (strOptString2.length() <= 0 || (pendingEntryRemove = this.pendingRequests.remove(strOptString2)) == null) {
                        return;
                    }
                    boolean z = JsonObjectExtensionsKt.optBoolean(jsonObject, PairsInviteMailboxKt.OUTCOME_OK, false) || PairsInviteMailboxKt.OUTCOME_OK.equals(JsonObjectExtensionsKt.optString(jsonObject, AuraDeeplinkRouteMapper.STATUS_ROUTE, ""));
                    strA0U = FGI.A0M(strRedactedBase, pendingEntryRemove.suffix);
                    i = z ? 200 : 500;
                    jCurrentTimeMillis2 = pendingEntryRemove.startedAtMs;
                    jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                    str2 = METHOD_WS;
                    record(strA0U, str2, i, jCurrentTimeMillis2, jCurrentTimeMillis);
                }
                return;
            }
            if (iHashCode != 96891546) {
                return;
            } else {
                zEquals = strOptString.equals("event");
            }
        }
        if (zEquals) {
            String strOptString3 = JsonObjectExtensionsKt.optString(jsonObject, "event", "");
            if (strOptString3.length() <= 0) {
                strOptString3 = JsonObjectExtensionsKt.optString(jsonObject, AgeCheckFunnelLogging.KEY_METHOD, "");
            }
            if (EVENT_MESSAGE_START.equals(strOptString3) || EVENT_MESSAGE_DONE.equals(strOptString3)) {
                jCurrentTimeMillis2 = System.currentTimeMillis();
                strA0U = FGI.A0U(strRedactedBase, CustomConnectorRegisterRepositoryKt.ROOT_PATH, strOptString3.replace('.', '/'));
                i = 200;
                jCurrentTimeMillis = 0;
                str2 = METHOD_WS_EVENT;
                record(strA0U, str2, i, jCurrentTimeMillis2, jCurrentTimeMillis);
            }
        }
    }

    private final void record(String str, String str2, int i, long j, long j2) {
        AuraNetworkLogRecorder.INSTANCE.record(new AuraNetworkLogEntry(j, str2, str, i, j2));
    }

    private final String redactedBase(String str) {
        return C7BY.A0Z(C7BY.A0W(str, HatchOpenGraphRepository.UNKNOWN_HOST, str), '/');
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void recordSent(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        if (!str3.equals(RpcMethod.ChatStream.INSTANCE.getValue())) {
            if (str3.equals(RpcMethod.ChatCancel.INSTANCE.getValue())) {
                record(FGI.A0M(redactedBase(str), CHAT_CANCEL_SUFFIX), METHOD_WS, 200, System.currentTimeMillis(), 0L);
                return;
            }
            return;
        }
        if (str2.length() > 0) {
            this.pendingRequests.put(str2, new PendingEntry(System.currentTimeMillis(), CHAT_STREAM_SUFFIX));
            if (this.pendingRequests.size() > 128) {
                this.pendingRequests.clear();
            }
        }
    }
}
