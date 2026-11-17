package com.facebook.aura.localbrowser;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C06H;
import X.C3cG;
import java.util.List;

/* loaded from: classes2.dex */
public final class LocalBrowserTakeoverJournal {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int MAX_ENTRIES = 200;
    public Long startedAtMs;
    public final List<TakeoverJournalEntryJson> entries = C3cG.A0h();
    public boolean complete = true;

    public final void discard() {
        this.startedAtMs = null;
        this.entries.clear();
        this.complete = true;
    }

    public final void begin(long j) {
        if (this.startedAtMs == null) {
            this.startedAtMs = Long.valueOf(j);
        }
    }

    public final TakeoverJournalJson finish(long j) {
        Long l = this.startedAtMs;
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        int i = TakeoverJournalJson.$stable;
        TakeoverJournalJson takeoverJournalJson = new TakeoverJournalJson(jLongValue, Math.max(j, jLongValue), this.complete, AbstractC0878AGe.A0X(this.entries));
        discard();
        return takeoverJournalJson;
    }

    public final boolean isRecording() {
        return AnonymousClass002.A1X(this.startedAtMs);
    }

    public final void markIncomplete() {
        if (this.startedAtMs != null) {
            this.complete = false;
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void record(String str, TakeoverActivityJson takeoverActivityJson, long j) {
        boolean zA1b = AnonymousClass004.A1b(str, takeoverActivityJson);
        if (this.startedAtMs != null) {
            if (this.entries.size() >= 200) {
                this.complete = zA1b;
            } else {
                this.entries.add(new TakeoverJournalEntryJson(j, str, takeoverActivityJson));
            }
        }
    }
}
