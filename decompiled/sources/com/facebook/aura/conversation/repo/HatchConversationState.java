package com.facebook.aura.conversation.repo;

import X.A3q;
import X.AGH;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.model.HatchMessage;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class HatchConversationState extends C06G {
    public final String avatarImageUrl;
    public final HatchGatewayConnectionState connectionState;
    public final boolean hasMoreHistory;
    public final List<HatchMessage> history;
    public final HistoryLoadingState historyLoadingState;
    public final boolean islandLoading;
    public final List<HatchMessage> messages;
    public final Long oldestRowId;
    public final Long oldestSeq;
    public final Map<String, List<String>> reactions;
    public final boolean serviceRestartPending;
    public final String streamingMessageId;
    public final StreamingState streamingState;
    public final String streamingUserMessageId;
    public final String vmId;

    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationState(List<HatchMessage> list, List<HatchMessage> list2, StreamingState streamingState, String str, String str2, HatchGatewayConnectionState hatchGatewayConnectionState, boolean z, HistoryLoadingState historyLoadingState, boolean z2, Long l, Long l2, Map<String, ? extends List<String>> map, String str3, boolean z3, String str4) {
        C7384Etj.A0Y(list, 0);
        C7384Etj.A0Y(list2, 1);
        C7384Etj.A0Y(streamingState, 2);
        C7384Etj.A0Y(hatchGatewayConnectionState, 5);
        C7384Etj.A0Y(historyLoadingState, 7);
        C7384Etj.A0Y(map, 11);
        this.history = list;
        this.messages = list2;
        this.streamingState = streamingState;
        this.streamingMessageId = str;
        this.streamingUserMessageId = str2;
        this.connectionState = hatchGatewayConnectionState;
        this.serviceRestartPending = z;
        this.historyLoadingState = historyLoadingState;
        this.hasMoreHistory = z2;
        this.oldestRowId = l;
        this.oldestSeq = l2;
        this.reactions = map;
        this.avatarImageUrl = str3;
        this.islandLoading = z3;
        this.vmId = str4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchConversationState) {
                HatchConversationState hatchConversationState = (HatchConversationState) obj;
                if (!C7384Etj.areEqual(this.history, hatchConversationState.history) || !C7384Etj.areEqual(this.messages, hatchConversationState.messages) || this.streamingState != hatchConversationState.streamingState || !C7384Etj.areEqual(this.streamingMessageId, hatchConversationState.streamingMessageId) || !C7384Etj.areEqual(this.streamingUserMessageId, hatchConversationState.streamingUserMessageId) || !C7384Etj.areEqual(this.connectionState, hatchConversationState.connectionState) || this.serviceRestartPending != hatchConversationState.serviceRestartPending || this.historyLoadingState != hatchConversationState.historyLoadingState || this.hasMoreHistory != hatchConversationState.hasMoreHistory || !C7384Etj.areEqual(this.oldestRowId, hatchConversationState.oldestRowId) || !C7384Etj.areEqual(this.oldestSeq, hatchConversationState.oldestSeq) || !C7384Etj.areEqual(this.reactions, hatchConversationState.reactions) || !C7384Etj.areEqual(this.avatarImageUrl, hatchConversationState.avatarImageUrl) || this.islandLoading != hatchConversationState.islandLoading || !C7384Etj.areEqual(this.vmId, hatchConversationState.vmId)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchConversationState copy$default(HatchConversationState hatchConversationState, List list, List list2, StreamingState streamingState, String str, String str2, HatchGatewayConnectionState hatchGatewayConnectionState, boolean z, HistoryLoadingState historyLoadingState, boolean z2, Long l, Long l2, Map map, String str3, boolean z3, String str4, int i, Object obj) {
        StreamingState streamingState2 = streamingState;
        String str5 = str;
        String str6 = str2;
        HatchGatewayConnectionState hatchGatewayConnectionState2 = hatchGatewayConnectionState;
        boolean z4 = z;
        HistoryLoadingState historyLoadingState2 = historyLoadingState;
        boolean z5 = z2;
        Long l3 = l;
        Long l4 = l2;
        Map map2 = map;
        String str7 = str3;
        boolean z6 = z3;
        String str8 = str4;
        if ((i & 1) != 0) {
            list = hatchConversationState.history;
        }
        if ((i & 2) != 0) {
            list2 = hatchConversationState.messages;
        }
        if ((i & 4) != 0) {
            streamingState2 = hatchConversationState.streamingState;
        }
        if ((i & 8) != 0) {
            str5 = hatchConversationState.streamingMessageId;
        }
        if ((i & 16) != 0) {
            str6 = hatchConversationState.streamingUserMessageId;
        }
        if ((i & 32) != 0) {
            hatchGatewayConnectionState2 = hatchConversationState.connectionState;
        }
        if ((i & 64) != 0) {
            z4 = hatchConversationState.serviceRestartPending;
        }
        if ((i & 128) != 0) {
            historyLoadingState2 = hatchConversationState.historyLoadingState;
        }
        if ((i & 256) != 0) {
            z5 = hatchConversationState.hasMoreHistory;
        }
        if ((i & 512) != 0) {
            l3 = hatchConversationState.oldestRowId;
        }
        if ((i & 1024) != 0) {
            l4 = hatchConversationState.oldestSeq;
        }
        if ((i & 2048) != 0) {
            map2 = hatchConversationState.reactions;
        }
        if ((i & 4096) != 0) {
            str7 = hatchConversationState.avatarImageUrl;
        }
        if ((i & 8192) != 0) {
            z6 = hatchConversationState.islandLoading;
        }
        if ((i & 16384) != 0) {
            str8 = hatchConversationState.vmId;
        }
        return hatchConversationState.copy(list, list2, streamingState2, str5, str6, hatchGatewayConnectionState2, z4, historyLoadingState2, z5, l3, l4, map2, str7, z6, str8);
    }

    public final List<HatchMessage> component1() {
        return this.history;
    }

    public final Long component10() {
        return this.oldestRowId;
    }

    public final Long component11() {
        return this.oldestSeq;
    }

    public final Map<String, List<String>> component12() {
        return this.reactions;
    }

    public final String component13() {
        return this.avatarImageUrl;
    }

    public final boolean component14() {
        return this.islandLoading;
    }

    public final String component15() {
        return this.vmId;
    }

    public final List<HatchMessage> component2() {
        return this.messages;
    }

    public final StreamingState component3() {
        return this.streamingState;
    }

    public final String component4() {
        return this.streamingMessageId;
    }

    public final String component5() {
        return this.streamingUserMessageId;
    }

    public final HatchGatewayConnectionState component6() {
        return this.connectionState;
    }

    public final boolean component7() {
        return this.serviceRestartPending;
    }

    public final HistoryLoadingState component8() {
        return this.historyLoadingState;
    }

    public final boolean component9() {
        return this.hasMoreHistory;
    }

    public final Set<String> getActiveStreamingMessageIds() {
        String str;
        return (this.streamingState == StreamingState.Done || (str = this.streamingMessageId) == null) ? A3q.A00 : Collections.singleton(str);
    }

    public final String getAvatarImageUrl() {
        return this.avatarImageUrl;
    }

    public final HatchGatewayConnectionState getConnectionState() {
        return this.connectionState;
    }

    public final boolean getHasMoreHistory() {
        return this.hasMoreHistory;
    }

    public final List<HatchMessage> getHistory() {
        return this.history;
    }

    public final HistoryLoadingState getHistoryLoadingState() {
        return this.historyLoadingState;
    }

    public final boolean getIslandLoading() {
        return this.islandLoading;
    }

    public final List<HatchMessage> getMessages() {
        return this.messages;
    }

    public final Long getOldestRowId() {
        return this.oldestRowId;
    }

    public final Long getOldestSeq() {
        return this.oldestSeq;
    }

    public final Map<String, List<String>> getReactions() {
        return this.reactions;
    }

    public final boolean getServiceRestartPending() {
        return this.serviceRestartPending;
    }

    public final String getStreamingMessageId() {
        return this.streamingMessageId;
    }

    public final StreamingState getStreamingState() {
        return this.streamingState;
    }

    public final String getStreamingUserMessageId() {
        return this.streamingUserMessageId;
    }

    public final String getVmId() {
        return this.vmId;
    }

    public int hashCode() {
        return C0KA.A01((AnonymousClass005.A0F(this.reactions, (((C0KA.A01(AnonymousClass005.A0F(this.historyLoadingState, C0KA.A01(AnonymousClass005.A0F(this.connectionState, (((AnonymousClass005.A0F(this.streamingState, AnonymousClass005.A0F(this.messages, AnonymousClass005.A0E(this.history))) + AnonymousClass006.A0G(this.streamingMessageId)) * 31) + AnonymousClass006.A0G(this.streamingUserMessageId)) * 31), this.serviceRestartPending)), this.hasMoreHistory) + AnonymousClass006.A0D(this.oldestRowId)) * 31) + AnonymousClass006.A0D(this.oldestSeq)) * 31) + AnonymousClass006.A0G(this.avatarImageUrl)) * 31, this.islandLoading) + AnonymousClass005.A0H(this.vmId);
    }

    public final HatchConversationState copy(List<HatchMessage> list, List<HatchMessage> list2, StreamingState streamingState, String str, String str2, HatchGatewayConnectionState hatchGatewayConnectionState, boolean z, HistoryLoadingState historyLoadingState, boolean z2, Long l, Long l2, Map<String, ? extends List<String>> map, String str3, boolean z3, String str4) {
        AnonymousClass005.A0x(list, list2, streamingState);
        C7384Etj.A0Y(hatchGatewayConnectionState, 5);
        AnonymousClass002.A1G(historyLoadingState, 7, map);
        return new HatchConversationState(list, list2, streamingState, str, str2, hatchGatewayConnectionState, z, historyLoadingState, z2, l, l2, map, str3, z3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchConversationState(List list, List list2, StreamingState streamingState, String str, String str2, HatchGatewayConnectionState hatchGatewayConnectionState, boolean z, HistoryLoadingState historyLoadingState, boolean z2, Long l, Long l2, Map map, String str3, boolean z3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? C0881AGi.A00 : list, (i & 2) != 0 ? C0881AGi.A00 : list2, (i & 4) != 0 ? StreamingState.Done : streamingState, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? new HatchGatewayConnectionState.Disconnected(HatchGatewayConnectionState.Reason.NONE) : hatchGatewayConnectionState, (i & 64) != 0 ? false : z, (i & 128) != 0 ? HistoryLoadingState.INITIAL : historyLoadingState, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : l, (i & 1024) != 0 ? null : l2, (i & 2048) != 0 ? AGH.A0E() : map, (i & 4096) != 0 ? null : str3, (i & 8192) == 0 ? z3 : false, (i & 16384) != 0 ? null : str4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationState() {
        boolean z = false;
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 32767, 0 == true ? 1 : 0);
    }
}
