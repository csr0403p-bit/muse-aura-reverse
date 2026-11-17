package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class VoiceBugReportInfo extends C06G {
    public static final int $stable = 0;
    public final Long connectedAtMillis;
    public final Long endedAtMillis;
    public final boolean isActive;
    public final String sharedCallId;
    public final long startedAtMillis;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceBugReportInfo) {
                VoiceBugReportInfo voiceBugReportInfo = (VoiceBugReportInfo) obj;
                if (!C7384Etj.areEqual(this.sharedCallId, voiceBugReportInfo.sharedCallId) || this.startedAtMillis != voiceBugReportInfo.startedAtMillis || !C7384Etj.areEqual(this.connectedAtMillis, voiceBugReportInfo.connectedAtMillis) || !C7384Etj.areEqual(this.endedAtMillis, voiceBugReportInfo.endedAtMillis) || this.isActive != voiceBugReportInfo.isActive) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceBugReportInfo copy$default(VoiceBugReportInfo voiceBugReportInfo, String str, long j, Long l, Long l2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceBugReportInfo.sharedCallId;
        }
        if ((i & 2) != 0) {
            j = voiceBugReportInfo.startedAtMillis;
        }
        if ((i & 4) != 0) {
            l = voiceBugReportInfo.connectedAtMillis;
        }
        if ((i & 8) != 0) {
            l2 = voiceBugReportInfo.endedAtMillis;
        }
        if ((i & 16) != 0) {
            z = voiceBugReportInfo.isActive;
        }
        return voiceBugReportInfo.copy(str, j, l, l2, z);
    }

    public final String component1() {
        return this.sharedCallId;
    }

    public final long component2() {
        return this.startedAtMillis;
    }

    public final Long component3() {
        return this.connectedAtMillis;
    }

    public final Long component4() {
        return this.endedAtMillis;
    }

    public final boolean component5() {
        return this.isActive;
    }

    public final VoiceBugReportInfo copy(String str, long j, Long l, Long l2, boolean z) {
        return new VoiceBugReportInfo(str, j, l, l2, z);
    }

    public final Long getConnectedAtMillis() {
        return this.connectedAtMillis;
    }

    public final Long getEndedAtMillis() {
        return this.endedAtMillis;
    }

    public final String getSharedCallId() {
        return this.sharedCallId;
    }

    public final long getStartedAtMillis() {
        return this.startedAtMillis;
    }

    public int hashCode() {
        return C0KA.A00(((((AnonymousClass006.A05(this.startedAtMillis, AnonymousClass006.A0G(this.sharedCallId) * 31) * 31) + AnonymousClass006.A0D(this.connectedAtMillis)) * 31) + C3cH.A02(this.endedAtMillis)) * 31, this.isActive);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public VoiceBugReportInfo(String str, long j, Long l, Long l2, boolean z) {
        this.sharedCallId = str;
        this.startedAtMillis = j;
        this.connectedAtMillis = l;
        this.endedAtMillis = l2;
        this.isActive = z;
    }

    public String toString() {
        return super.toString();
    }
}
