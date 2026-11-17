package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC0882AGj;
import X.AnonymousClass000;
import X.AnonymousClass002;
import X.C06H;
import X.C7384Etj;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
public final class VoiceCallReconnectEpisodes {
    public static final Companion Companion = new Companion();
    public static final List<VoiceCallReconnectCause> FIRST_CAUSE_ORDER = Arrays.asList(VoiceCallReconnectCause.OFFLINE, VoiceCallReconnectCause.REJOIN, VoiceCallReconnectCause.MEDIA, VoiceCallReconnectCause.GATEWAY);

    @Deprecated
    public static final long RECOVERY_GRACE_MS = 1000;
    public final String callId;
    public final long connectedAtMs;
    public int count;
    public boolean endedWhileReconnecting;
    public OpenEpisode open;
    public final EnumSet<VoiceCallReconnectCause> seen = EnumSet.noneOf(VoiceCallReconnectCause.class);
    public long totalMs;

    public final class Companion {
        public final List<VoiceCallReconnectCause> getFIRST_CAUSE_ORDER() {
            return VoiceCallReconnectEpisodes.FIRST_CAUSE_ORDER;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class OpenEpisode {
        public final VoiceCallReconnectCause cause;
        public final Set<VoiceCallReconnectCause> causes;
        public Long clearedAtMs;
        public final int index;
        public String networkTypeAtClear;
        public final String networkTypeStart;
        public VoiceCallRejoinOutcome rejoinOutcome;
        public final long startedAtMs;

        public OpenEpisode(int i, long j, VoiceCallReconnectCause voiceCallReconnectCause, Set<VoiceCallReconnectCause> set, String str) {
            AnonymousClass002.A1B(voiceCallReconnectCause, 2, set);
            this.index = i;
            this.startedAtMs = j;
            this.cause = voiceCallReconnectCause;
            this.causes = set;
            this.networkTypeStart = str;
        }

        public final VoiceCallReconnectCause getCause() {
            return this.cause;
        }

        public final Set<VoiceCallReconnectCause> getCauses() {
            return this.causes;
        }

        public final Long getClearedAtMs() {
            return this.clearedAtMs;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getNetworkTypeAtClear() {
            return this.networkTypeAtClear;
        }

        public final String getNetworkTypeStart() {
            return this.networkTypeStart;
        }

        public final VoiceCallRejoinOutcome getRejoinOutcome() {
            return this.rejoinOutcome;
        }

        public final long getStartedAtMs() {
            return this.startedAtMs;
        }

        public final boolean isRecovered(long j) {
            Long l = this.clearedAtMs;
            return l != null && j - l.longValue() >= 1000;
        }

        public final void setClearedAtMs(Long l) {
            this.clearedAtMs = l;
        }

        public final void setNetworkTypeAtClear(String str) {
            this.networkTypeAtClear = str;
        }

        public final void setRejoinOutcome(VoiceCallRejoinOutcome voiceCallRejoinOutcome) {
            this.rejoinOutcome = voiceCallRejoinOutcome;
        }
    }

    public final VoiceCallReconnectEpisode onCallEnded(long j, String str) {
        VoiceCallReconnectOutcome voiceCallReconnectOutcome;
        OpenEpisode openEpisode = this.open;
        if (openEpisode == null) {
            return null;
        }
        if (openEpisode.isRecovered(j)) {
            voiceCallReconnectOutcome = VoiceCallReconnectOutcome.RECOVERED;
        } else {
            this.endedWhileReconnecting = true;
            voiceCallReconnectOutcome = VoiceCallReconnectOutcome.CALL_ENDED;
        }
        return close(openEpisode, voiceCallReconnectOutcome, j, str);
    }

    public final void onRejoinEnded(VoiceCallRejoinOutcome voiceCallRejoinOutcome) {
        C7384Etj.A0Y(voiceCallRejoinOutcome, 0);
        OpenEpisode openEpisode = this.open;
        if (openEpisode != null) {
            openEpisode.rejoinOutcome = voiceCallRejoinOutcome;
        }
    }

    public final VoiceCallReconnectEpisode update(Set<? extends VoiceCallReconnectCause> set, long j, String str) {
        C7384Etj.A0Y(set, 0);
        OpenEpisode openEpisode = this.open;
        VoiceCallReconnectEpisode voiceCallReconnectEpisodeClose = (openEpisode == null || !openEpisode.isRecovered(j)) ? null : close(openEpisode, VoiceCallReconnectOutcome.RECOVERED, j, str);
        OpenEpisode openEpisode2 = this.open;
        if (set.isEmpty()) {
            if (openEpisode2 != null && openEpisode2.clearedAtMs == null) {
                openEpisode2.clearedAtMs = Long.valueOf(j);
                openEpisode2.networkTypeAtClear = str;
            }
        } else if (openEpisode2 == null) {
            start(set, j, str);
        } else {
            AbstractC0882AGj.A0r(set, openEpisode2.causes);
            openEpisode2.clearedAtMs = null;
            openEpisode2.networkTypeAtClear = null;
        }
        EnumSet<VoiceCallReconnectCause> enumSet = this.seen;
        C7384Etj.A0T(enumSet);
        AbstractC0882AGj.A0r(set, enumSet);
        return voiceCallReconnectEpisodeClose;
    }

    private final VoiceCallReconnectEpisode close(OpenEpisode openEpisode, VoiceCallReconnectOutcome voiceCallReconnectOutcome, long j, String str) {
        String str2 = str;
        long jLongValue = j;
        this.open = null;
        Long l = openEpisode.clearedAtMs;
        if (l != null) {
            jLongValue = l.longValue();
        }
        long j2 = openEpisode.startedAtMs;
        long j3 = jLongValue - j2;
        if (j3 < 0) {
            j3 = 0;
        }
        this.totalMs += j3;
        int i = openEpisode.index;
        VoiceCallReconnectCause voiceCallReconnectCause = openEpisode.cause;
        Set<VoiceCallReconnectCause> set = openEpisode.causes;
        long j4 = j2 - this.connectedAtMs;
        if (j4 < 0) {
            j4 = 0;
        }
        VoiceCallRejoinOutcome voiceCallRejoinOutcome = openEpisode.rejoinOutcome;
        String str3 = openEpisode.networkTypeStart;
        if (l != null) {
            str2 = openEpisode.networkTypeAtClear;
        }
        return new VoiceCallReconnectEpisode(i, voiceCallReconnectCause, set, voiceCallReconnectOutcome, j3, j4, voiceCallRejoinOutcome, str3, str2);
    }

    private final void start(Set<? extends VoiceCallReconnectCause> set, long j, String str) {
        int i = this.count + 1;
        this.count = i;
        for (VoiceCallReconnectCause voiceCallReconnectCause : FIRST_CAUSE_ORDER) {
            if (set.contains(voiceCallReconnectCause)) {
                EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) set);
                C7384Etj.A0U(enumSetCopyOf);
                this.open = new OpenEpisode(i, j, voiceCallReconnectCause, enumSetCopyOf, str);
                return;
            }
        }
        throw new NoSuchElementException(AnonymousClass000.A00(9));
    }

    public final String getCallId() {
        return this.callId;
    }

    public final Set<VoiceCallReconnectCause> getCausesSeen() {
        EnumSet<VoiceCallReconnectCause> enumSet = this.seen;
        C7384Etj.A0T(enumSet);
        return enumSet;
    }

    public final int getCount() {
        return this.count;
    }

    public final boolean getEndedWhileReconnecting() {
        return this.endedWhileReconnecting;
    }

    public final long getTotalMs() {
        return this.totalMs;
    }

    public VoiceCallReconnectEpisodes(String str, long j) {
        this.callId = str;
        this.connectedAtMs = j;
    }
}
