package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC0878AGe;
import X.AnonymousClass000;
import X.AnonymousClass002;
import X.C06H;
import X.C3cG;
import X.C60N;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.perf.HatchQplLogger;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes2.dex */
public final class VoiceTurnLatencyTracker {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int MAX_RESPONSES_BEFORE_COMMIT = 32;

    @Deprecated
    public static final String REASON_REPLACED_BY_NEW_USER_TURN = "replaced_by_new_user_turn";

    @Deprecated
    public static final String REASON_RESPONSE_STARTED = "response_started";

    @Deprecated
    public static final String REASON_RESPONSE_STARTED_BEFORE_USER_COMMIT = "response_started_before_user_commit";

    @Deprecated
    public static final String TIMING_BASIS = "client_receipt_message_user_to_response_start";
    public String callAttemptId;
    public boolean inCall;
    public Integer openInstanceKey;
    public String openUserMessageId;
    public int turnCounter;
    public final HashSet<String> countedUserMessageIds = new HashSet<>();
    public final LinkedHashMap<String, String> responsesBeforeCommit = C3cG.A0j();

    private final void resetCallState() {
        this.turnCounter = 0;
        this.callAttemptId = null;
        this.inCall = false;
        this.countedUserMessageIds.clear();
        this.responsesBeforeCommit.clear();
        this.openUserMessageId = null;
    }

    public final synchronized void onBotResponseStarted(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        if (this.inCall) {
            if (str2 == null || C7BY.A0j(str2)) {
                str2 = null;
            }
            Integer num = this.openInstanceKey;
            if (num != null) {
                int iOrdinal = VoiceTurnLatencyTrackerKt.voiceResponseCorrelation(this.openUserMessageId, str2).ordinal();
                if (iOrdinal == 0) {
                    annotateResponse(num.intValue(), str, str2, VoiceResponseCorrelation.EXPLICIT_REPLY_TO.getAnnotationValue());
                    endTurn((short) 2, REASON_RESPONSE_STARTED);
                } else if (iOrdinal == 1) {
                    annotateResponse(num.intValue(), str, str2, VoiceResponseCorrelation.OPEN_TURN_FALLBACK.getAnnotationValue());
                    endTurn((short) 2, REASON_RESPONSE_STARTED);
                } else {
                    if (iOrdinal != 2) {
                        throw C3cG.A0q();
                    }
                    if (str2 != null && !this.countedUserMessageIds.contains(str2)) {
                        rememberResponseBeforeCommit(str2, str);
                    }
                }
            } else if (str2 != null && !this.countedUserMessageIds.contains(str2)) {
                rememberResponseBeforeCommit(str2, str);
            }
        }
    }

    public final synchronized void onCallEnded(String str) {
        C7384Etj.A0Y(str, 0);
        String strCanonicalVoiceTurnEndReason = VoiceTurnLatencyTrackerKt.canonicalVoiceTurnEndReason(str);
        endTurn(VoiceTurnLatencyTrackerKt.VOICE_TURN_CANCELLATION_REASONS.contains(strCanonicalVoiceTurnEndReason) ? (short) 4 : (short) 3, strCanonicalVoiceTurnEndReason);
        resetCallState();
    }

    public final synchronized void onCallStarted(String str) {
        C7384Etj.A0Y(str, 0);
        endTurn((short) 4, "superseded");
        resetCallState();
        this.callAttemptId = str;
        this.inCall = true;
    }

    public final synchronized void onUserTurnCommitted(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        if (this.inCall && this.countedUserMessageIds.add(str)) {
            endTurn((short) 4, REASON_REPLACED_BY_NEW_USER_TURN);
            int i = this.turnCounter + 1;
            this.turnCounter = i;
            this.openInstanceKey = Integer.valueOf(i);
            this.openUserMessageId = str;
            HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
            hatchQplLogger.markerStart(734863101, i, false);
            hatchQplLogger.markerAnnotate(734863101, "turn_index", i, i);
            hatchQplLogger.markerAnnotate(734863101, "is_cosmos_s2s", true, i);
            hatchQplLogger.markerAnnotate(734863101, "pipeline", "cosmos_s2s", i);
            hatchQplLogger.markerAnnotate(734863101, AnonymousClass000.A00(31), str, i);
            hatchQplLogger.markerAnnotate(734863101, "timing_basis", TIMING_BASIS, i);
            String str3 = this.callAttemptId;
            if (str3 != null) {
                hatchQplLogger.markerAnnotate(734863101, "call_attempt_id", str3, i);
            }
            if (str2 != null) {
                hatchQplLogger.markerAnnotate(734863101, "thread_id", str2, i);
            }
            String strRemove = this.responsesBeforeCommit.remove(str);
            if (strRemove != null) {
                annotateResponse(i, strRemove, str, VoiceResponseCorrelation.EXPLICIT_REPLY_TO.getAnnotationValue());
                endTurn((short) 4, REASON_RESPONSE_STARTED_BEFORE_USER_COMMIT);
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceResponseCorrelation.values().length];
            try {
                AnonymousClass002.A13(VoiceResponseCorrelation.EXPLICIT_REPLY_TO, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VoiceResponseCorrelation.OPEN_TURN_FALLBACK, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VoiceResponseCorrelation.MISMATCH, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void annotateResponse(int i, String str, String str2, String str3) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(734863101, "response_message_id", str, i);
        hatchQplLogger.markerAnnotate(734863101, "correlation_mode", str3, i);
        if (str2 != null) {
            hatchQplLogger.markerAnnotate(734863101, C60N.A00(98), str2, i);
        }
    }

    private final void endTurn(short s, String str) {
        Integer num = this.openInstanceKey;
        if (num != null) {
            int iIntValue = num.intValue();
            this.openInstanceKey = null;
            this.openUserMessageId = null;
            HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
            hatchQplLogger.markerAnnotate(734863101, "reason", str, iIntValue);
            hatchQplLogger.markerEnd(734863101, s, iIntValue);
        }
    }

    private final void rememberResponseBeforeCommit(String str, String str2) {
        if (!this.responsesBeforeCommit.containsKey(str)) {
            LinkedHashMap<String, String> linkedHashMap = this.responsesBeforeCommit;
            if (linkedHashMap.size() >= 32) {
                Set<String> setKeySet = linkedHashMap.keySet();
                C7384Etj.A0U(setKeySet);
                linkedHashMap.remove(AbstractC0878AGe.A0B(setKeySet));
            }
        }
        this.responsesBeforeCommit.put(str, str2);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
