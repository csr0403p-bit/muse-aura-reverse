package com.facebook.aura.localbrowser;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C2hx;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class TakeoverJournalEntryJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final TakeoverActivityJson activity;
    public final long at_ms;
    public final String target_id;

    public final class Companion {
        public final C9hr<TakeoverJournalEntryJson> serializer() {
            return TakeoverJournalEntryJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(TakeoverJournalEntryJson takeoverJournalEntryJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAN(c9iZ, 0, takeoverJournalEntryJson.at_ms);
        c9j5.AAV(takeoverJournalEntryJson.target_id, c9iZ, 1);
        c9j5.AAQ(takeoverJournalEntryJson.activity, TakeoverActivityJson$$serializer.INSTANCE, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TakeoverJournalEntryJson) {
                TakeoverJournalEntryJson takeoverJournalEntryJson = (TakeoverJournalEntryJson) obj;
                if (this.at_ms != takeoverJournalEntryJson.at_ms || !C7384Etj.areEqual(this.target_id, takeoverJournalEntryJson.target_id) || !C7384Etj.areEqual(this.activity, takeoverJournalEntryJson.activity)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TakeoverJournalEntryJson copy$default(TakeoverJournalEntryJson takeoverJournalEntryJson, long j, String str, TakeoverActivityJson takeoverActivityJson, int i, Object obj) {
        if ((i & 1) != 0) {
            j = takeoverJournalEntryJson.at_ms;
        }
        if ((i & 2) != 0) {
            str = takeoverJournalEntryJson.target_id;
        }
        if ((i & 4) != 0) {
            takeoverActivityJson = takeoverJournalEntryJson.activity;
        }
        return takeoverJournalEntryJson.copy(j, str, takeoverActivityJson);
    }

    public final long component1() {
        return this.at_ms;
    }

    public final String component2() {
        return this.target_id;
    }

    public final TakeoverActivityJson component3() {
        return this.activity;
    }

    public final TakeoverActivityJson getActivity() {
        return this.activity;
    }

    public final long getAt_ms() {
        return this.at_ms;
    }

    public final String getTarget_id() {
        return this.target_id;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.activity, AnonymousClass005.A0I(this.target_id, C3cI.A01(this.at_ms)));
    }

    public String toString() {
        long j = this.at_ms;
        String str = this.target_id;
        TakeoverActivityJson takeoverActivityJson = this.activity;
        StringBuilder sb = new StringBuilder("TakeoverJournalEntryJson(at_ms=");
        sb.append(j);
        sb.append(", target_id=");
        sb.append(str);
        return C3cJ.A0L(takeoverActivityJson, ", activity=", sb);
    }

    public TakeoverJournalEntryJson(long j, String str, TakeoverActivityJson takeoverActivityJson) {
        AnonymousClass003.A0x(str, takeoverActivityJson);
        this.at_ms = j;
        this.target_id = str;
        this.activity = takeoverActivityJson;
    }

    public final TakeoverJournalEntryJson copy(long j, String str, TakeoverActivityJson takeoverActivityJson) {
        AnonymousClass003.A0x(str, takeoverActivityJson);
        return new TakeoverJournalEntryJson(j, str, takeoverActivityJson);
    }

    public /* synthetic */ TakeoverJournalEntryJson(int i, long j, String str, TakeoverActivityJson takeoverActivityJson, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(TakeoverJournalEntryJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.at_ms = j;
        this.target_id = str;
        this.activity = takeoverActivityJson;
    }
}
