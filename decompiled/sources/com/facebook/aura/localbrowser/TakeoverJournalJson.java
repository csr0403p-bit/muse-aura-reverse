package com.facebook.aura.localbrowser;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class TakeoverJournalJson {
    public static final int $stable = 8;
    public final boolean complete;
    public final long ended_at_ms;
    public final List<TakeoverJournalEntryJson> entries;
    public final long started_at_ms;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1U(C79.A01, null, null, null, new Function0() { // from class: com.facebook.aura.localbrowser.TakeoverJournalJson$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = TakeoverJournalJson.$stable;
            return C3cG.A19(TakeoverJournalEntryJson$$serializer.INSTANCE);
        }
    });

    public final class Companion {
        public final C9hr<TakeoverJournalJson> serializer() {
            return TakeoverJournalJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public TakeoverJournalJson(long j, long j2, boolean z, List<TakeoverJournalEntryJson> list) {
        C7384Etj.A0Y(list, 3);
        this.started_at_ms = j;
        this.ended_at_ms = j2;
        this.complete = z;
        this.entries = list;
    }

    public static /* synthetic */ TakeoverJournalJson copy$default(TakeoverJournalJson takeoverJournalJson, long j, long j2, boolean z, List list, int i, Object obj) {
        long j3 = j;
        long j4 = j2;
        boolean z2 = z;
        List list2 = list;
        if ((i & 1) != 0) {
            j3 = takeoverJournalJson.started_at_ms;
        }
        if ((i & 2) != 0) {
            j4 = takeoverJournalJson.ended_at_ms;
        }
        if ((i & 4) != 0) {
            z2 = takeoverJournalJson.complete;
        }
        if ((i & 8) != 0) {
            list2 = takeoverJournalJson.entries;
        }
        C7384Etj.A0Y(list2, 3);
        return new TakeoverJournalJson(j3, j4, z2, list2);
    }

    public final TakeoverJournalJson copy(long j, long j2, boolean z, List<TakeoverJournalEntryJson> list) {
        C7384Etj.A0Y(list, 3);
        return new TakeoverJournalJson(j, j2, z, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TakeoverJournalJson) {
                TakeoverJournalJson takeoverJournalJson = (TakeoverJournalJson) obj;
                if (this.started_at_ms != takeoverJournalJson.started_at_ms || this.ended_at_ms != takeoverJournalJson.ended_at_ms || this.complete != takeoverJournalJson.complete || !C7384Etj.areEqual(this.entries, takeoverJournalJson.entries)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(TakeoverJournalJson takeoverJournalJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAN(c9iZ, 0, takeoverJournalJson.started_at_ms);
        c9j5.AAN(c9iZ, 1, takeoverJournalJson.ended_at_ms);
        c9j5.AA7(c9iZ, 2, takeoverJournalJson.complete);
        c9j5.AAQ(takeoverJournalJson.entries, C3cH.A15(f0cArr, 3), c9iZ, 3);
    }

    public final long component1() {
        return this.started_at_ms;
    }

    public final long component2() {
        return this.ended_at_ms;
    }

    public final boolean component3() {
        return this.complete;
    }

    public final List<TakeoverJournalEntryJson> component4() {
        return this.entries;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final long getEnded_at_ms() {
        return this.ended_at_ms;
    }

    public final List<TakeoverJournalEntryJson> getEntries() {
        return this.entries;
    }

    public final long getStarted_at_ms() {
        return this.started_at_ms;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.entries, C0KA.A01(AnonymousClass006.A06(this.ended_at_ms, C3cG.A02(this.started_at_ms) * 31), this.complete));
    }

    public String toString() {
        long j = this.started_at_ms;
        long j2 = this.ended_at_ms;
        boolean z = this.complete;
        List<TakeoverJournalEntryJson> list = this.entries;
        StringBuilder sb = new StringBuilder("TakeoverJournalJson(started_at_ms=");
        sb.append(j);
        sb.append(", ended_at_ms=");
        sb.append(j2);
        sb.append(", complete=");
        sb.append(z);
        return C3cJ.A0L(list, ", entries=", sb);
    }

    public /* synthetic */ TakeoverJournalJson(int i, long j, long j2, boolean z, List list, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(TakeoverJournalJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.started_at_ms = j;
        this.ended_at_ms = j2;
        this.complete = z;
        this.entries = list;
    }
}
