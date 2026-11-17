package com.facebook.aura.conversation.repo;

import X.AGH;
import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06827l3;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.HxE;
import com.facebook.aura.gateway.HatchPresentationTokenBinderKt;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchMessageSendStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchConversationRepositoryKt {
    public static final long CANCEL_FALLBACK_TIMEOUT_MS = 5000;
    public static final String GLOBAL_DEDUP_KEY = "__global__";
    public static final long HISTORY_RECOVERY_COALESCE_MS = 1000;
    public static final int HISTORY_RECOVERY_PAGE_LIMIT = 20;
    public static final long HISTORY_RECOVERY_TIMEOUT_MS = 30000;
    public static final int INITIAL_CHAT_HISTORY_LIMIT = 10;
    public static final String LOCATION_FIX_TIMESTAMP_MS_KEY = "location_fix_timestamp_ms";
    public static final String LOCATION_UPLOAD_TIMESTAMP_MS_KEY = "location_upload_timestamp_ms";
    public static final int PAGE_HISTORY_LIMIT = 20;
    public static final String PROVISIONAL_USER_MESSAGE_PREFIX = "voice-user-";
    public static final long QUEUED_SEND_MAX_AGE_MS = 1800000;
    public static final int SAME_PARTIAL_PREFIX_LEN = 64;
    public static final long SEND_ACK_TIMEOUT_MS = 15000;
    public static final String SESSION_UPDATED_CHANGE_ACTIVITY = "activity";
    public static final long STALE_RECONNECT_THRESHOLD_MS = 5000;
    public static final long STALE_SCAN_DELAY_MS = 5000;
    public static final long STALE_SENDING_THRESHOLD_MS = 300000;
    public static final long STREAM_IDLE_TIMEOUT_MS = 120000;
    public static final long STREAM_SETTLE_RECOVERY_TIMEOUT_MS = 240000;
    public static final long STREAM_TRANSCRIPT_FLUSH_INTERVAL_MS = 50;
    public static final String TAG = "HatchConversationRepository";
    public static final String TERMINAL_STATUS_FAILED = "failed";
    public static final String TERMINAL_STATUS_INTERRUPTED = "interrupted";
    public static final int TRANSPORT_REJECTION_MAX_RETRIES = 6;
    public static final long TRANSPORT_REJECTION_MAX_RETRY_DELAY_MS = 30000;
    public static final long TRANSPORT_REJECTION_RETRY_DELAY_MS = 2000;
    public static final String VM_CHANGED_FETCH_ERROR = "vm_changed";
    public static final C06827l3 messageContentWhitespaceRegex = C06827l3.A02("\\s+");
    public static final Set<HatchConversationRepository> reachableRepositories;

    public static final boolean isWithinLoadedWindow(HatchMessage hatchMessage, Long l) {
        Long l2;
        return l == null || ((l2 = hatchMessage.seq) != null && l2.longValue() >= l.longValue());
    }

    static {
        Set<HatchConversationRepository> setSynchronizedSet = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        C7384Etj.A0U(setSynchronizedSet);
        reachableRepositories = setSynchronizedSet;
    }

    public static final boolean hasIdIn(HatchMessage hatchMessage, Set<String> set) {
        String str;
        return set.contains(hatchMessage.id) || ((str = hatchMessage.serverMessageId) != null && set.contains(str));
    }

    public static final boolean isStaleSend(HatchMessage hatchMessage, long j, boolean z, long j2, boolean z2, Function0<Boolean> function0) {
        return hatchMessage.sendStatus == HatchMessageSendStatus.SENDING && hatchMessage.requestId != null && j - hatchMessage.timestamp > 300000 && (!AnonymousClass003.A1Y(function0) || (!z2 && (!hatchMessage.isPending || (!z && (j - hatchMessage.timestamp > 1800000 || j - j2 > 300000)))));
    }

    public static final List<HatchConversationRepository> reachableConversationRepositories() {
        List<HatchConversationRepository> listA0X;
        Set<HatchConversationRepository> set = reachableRepositories;
        synchronized (set) {
            listA0X = AbstractC0878AGe.A0X(set);
        }
        return listA0X;
    }

    public static final HatchConversationState withTokenBoundWidgetPresentations(HatchConversationState hatchConversationState) {
        List<HatchMessage> list = hatchConversationState.history;
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        Iterator<HatchMessage> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(it.next().id);
        }
        Set setA0g = AbstractC0878AGe.A0g(arrayListA0m);
        List<HatchMessage> list2 = hatchConversationState.messages;
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
        Iterator<HatchMessage> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayListA0m2.add(it2.next().id);
        }
        Set setA0g2 = AbstractC0878AGe.A0g(arrayListA0m2);
        List<HatchMessage> listBindWidgetPresentationsToTokenHosts = HatchPresentationTokenBinderKt.bindWidgetPresentationsToTokenHosts(AbstractC0878AGe.A0P(hatchConversationState.messages, hatchConversationState.history));
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchMessage hatchMessage : listBindWidgetPresentationsToTokenHosts) {
            if (setA0g.contains(hatchMessage.id)) {
                arrayListA0h.add(hatchMessage);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (HatchMessage hatchMessage2 : listBindWidgetPresentationsToTokenHosts) {
            HatchMessage hatchMessage3 = hatchMessage2;
            if (setA0g2.contains(hatchMessage3.id) && !setA0g.contains(hatchMessage3.id)) {
                arrayListA0h2.add(hatchMessage2);
            }
        }
        return HatchConversationState.copy$default(hatchConversationState, arrayListA0h, arrayListA0h2, null, null, null, null, false, null, false, null, null, null, null, false, null, 32764, null);
    }

    public static final Map<String, List<String>> reactionsForMessages(List<HatchMessage> list) {
        ArrayList arrayListA0y = C3cI.A0y(list);
        for (HatchMessage hatchMessage : list) {
            List<String> list2 = hatchMessage.reactions;
            if (!list2.isEmpty()) {
                arrayListA0y.add(new HxE(hatchMessage.id, list2));
            }
        }
        return AGH.A06(arrayListA0y);
    }
}
