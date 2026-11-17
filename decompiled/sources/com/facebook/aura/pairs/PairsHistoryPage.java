package com.facebook.aura.pairs;

import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class PairsHistoryPage {
    public static final int $stable = 8;
    public final boolean hasMore;
    public final List<PairsHistoryMessage> messages;
    public final Long oldestSeq;

    public PairsHistoryPage(List<PairsHistoryMessage> list, boolean z, Long l) {
        C7384Etj.A0Y(list, 0);
        this.messages = list;
        this.hasMore = z;
        this.oldestSeq = l;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<PairsHistoryMessage> getMessages() {
        return this.messages;
    }

    public final Long getOldestSeq() {
        return this.oldestSeq;
    }
}
