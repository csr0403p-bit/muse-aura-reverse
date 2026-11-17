package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchLifecycleSummaryEntry extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String event;
    public final String id;
    public final long receivedAtMs;
    public final String summary;

    public final class Companion {
        public final C9hr<HatchLifecycleSummaryEntry> serializer() {
            return HatchLifecycleSummaryEntry$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ HatchLifecycleSummaryEntry copy$default(HatchLifecycleSummaryEntry hatchLifecycleSummaryEntry, String str, String str2, String str3, long j, int i, Object obj) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        long j2 = j;
        if ((i & 1) != 0) {
            str4 = hatchLifecycleSummaryEntry.id;
        }
        if ((i & 2) != 0) {
            str5 = hatchLifecycleSummaryEntry.event;
        }
        if ((i & 4) != 0) {
            str6 = hatchLifecycleSummaryEntry.summary;
        }
        if ((i & 8) != 0) {
            j2 = hatchLifecycleSummaryEntry.receivedAtMs;
        }
        AnonymousClass005.A0x(str4, str5, str6);
        return new HatchLifecycleSummaryEntry(str4, str5, str6, j2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchLifecycleSummaryEntry hatchLifecycleSummaryEntry, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchLifecycleSummaryEntry.id, c9iZ, 0);
        c9j5.AAV(hatchLifecycleSummaryEntry.event, c9iZ, 1);
        c9j5.AAV(hatchLifecycleSummaryEntry.summary, c9iZ, 2);
        c9j5.AAN(c9iZ, 3, hatchLifecycleSummaryEntry.receivedAtMs);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchLifecycleSummaryEntry) {
                HatchLifecycleSummaryEntry hatchLifecycleSummaryEntry = (HatchLifecycleSummaryEntry) obj;
                if (!C7384Etj.areEqual(this.id, hatchLifecycleSummaryEntry.id) || !C7384Etj.areEqual(this.event, hatchLifecycleSummaryEntry.event) || !C7384Etj.areEqual(this.summary, hatchLifecycleSummaryEntry.summary) || this.receivedAtMs != hatchLifecycleSummaryEntry.receivedAtMs) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchLifecycleSummaryEntry(int i, String str, String str2, String str3, long j, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(HatchLifecycleSummaryEntry$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.event = str2;
        this.summary = str3;
        this.receivedAtMs = j;
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.event;
    }

    public final String component3() {
        return this.summary;
    }

    public final long component4() {
        return this.receivedAtMs;
    }

    public final String getEvent() {
        return this.event;
    }

    public final String getId() {
        return this.id;
    }

    public final long getReceivedAtMs() {
        return this.receivedAtMs;
    }

    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.receivedAtMs, AnonymousClass005.A0I(this.summary, AnonymousClass005.A0I(this.event, AnonymousClass001.A0G(this.id))));
    }

    public final HatchLifecycleSummaryEntry copy(String str, String str2, String str3, long j) {
        AnonymousClass005.A0x(str, str2, str3);
        return new HatchLifecycleSummaryEntry(str, str2, str3, j);
    }

    public String toString() {
        return super.toString();
    }

    public HatchLifecycleSummaryEntry(String str, String str2, String str3, long j) {
        AnonymousClass005.A0x(str, str2, str3);
        this.id = str;
        this.event = str2;
        this.summary = str3;
        this.receivedAtMs = j;
    }
}
