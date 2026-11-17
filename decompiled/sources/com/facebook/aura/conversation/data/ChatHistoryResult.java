package com.facebook.aura.conversation.data;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.model.HatchMessage;
import java.util.List;

/* loaded from: classes3.dex */
public final class ChatHistoryResult extends C06G {
    public final boolean hasMore;
    public final List<HatchMessage> history;

    public ChatHistoryResult(List<HatchMessage> list, boolean z) {
        C7384Etj.A0Y(list, 0);
        this.history = list;
        this.hasMore = z;
    }

    public final ChatHistoryResult copy(List<HatchMessage> list, boolean z) {
        C7384Etj.A0Y(list, 0);
        return new ChatHistoryResult(list, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChatHistoryResult) {
                ChatHistoryResult chatHistoryResult = (ChatHistoryResult) obj;
                if (!C7384Etj.areEqual(this.history, chatHistoryResult.history) || this.hasMore != chatHistoryResult.hasMore) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChatHistoryResult copy$default(ChatHistoryResult chatHistoryResult, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chatHistoryResult.history;
        }
        if ((i & 2) != 0) {
            z = chatHistoryResult.hasMore;
        }
        C7384Etj.A0Y(list, 0);
        return new ChatHistoryResult(list, z);
    }

    public final List<HatchMessage> component1() {
        return this.history;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<HatchMessage> getHistory() {
        return this.history;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0E(this.history), this.hasMore);
    }

    public String toString() {
        return super.toString();
    }
}
