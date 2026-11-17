package com.facebook.aura.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class CanonicalEventEnvelope extends C06G {
    public static final int $stable = 0;
    public final Long chatEventSeq;
    public final boolean isThread;
    public final String messageId;
    public final Long messageSeq;
    public final String parentAgentId;
    public final String parentMessageId;
    public final String replyToMessageId;
    public final Long seq;
    public final String sessionId;
    public final String streamLane;
    public final String subagentId;
    public final String voiceCallId;

    public CanonicalEventEnvelope() {
        this(null, null, null, null, null, null, null, null, null, false, null, null);
    }

    public static /* synthetic */ CanonicalEventEnvelope copy$default(CanonicalEventEnvelope canonicalEventEnvelope, Long l, String str, String str2, String str3, String str4, String str5, Long l2, Long l3, String str6, boolean z, String str7, String str8, int i, Object obj) {
        Long l4 = l;
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        Long l5 = l2;
        Long l6 = l3;
        String str14 = str6;
        boolean z2 = z;
        String str15 = str7;
        String str16 = str8;
        if ((i & 1) != 0) {
            l4 = canonicalEventEnvelope.seq;
        }
        if ((i & 2) != 0) {
            str9 = canonicalEventEnvelope.messageId;
        }
        if ((i & 4) != 0) {
            str10 = canonicalEventEnvelope.replyToMessageId;
        }
        if ((i & 8) != 0) {
            str11 = canonicalEventEnvelope.streamLane;
        }
        if ((i & 16) != 0) {
            str12 = canonicalEventEnvelope.parentAgentId;
        }
        if ((i & 32) != 0) {
            str13 = canonicalEventEnvelope.subagentId;
        }
        if ((i & 64) != 0) {
            l5 = canonicalEventEnvelope.messageSeq;
        }
        if ((i & 128) != 0) {
            l6 = canonicalEventEnvelope.chatEventSeq;
        }
        if ((i & 256) != 0) {
            str14 = canonicalEventEnvelope.sessionId;
        }
        if ((i & 512) != 0) {
            z2 = canonicalEventEnvelope.isThread;
        }
        if ((i & 1024) != 0) {
            str15 = canonicalEventEnvelope.parentMessageId;
        }
        if ((i & 2048) != 0) {
            str16 = canonicalEventEnvelope.voiceCallId;
        }
        return new CanonicalEventEnvelope(l4, str9, str10, str11, str12, str13, l5, l6, str14, z2, str15, str16);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CanonicalEventEnvelope) {
                CanonicalEventEnvelope canonicalEventEnvelope = (CanonicalEventEnvelope) obj;
                if (!C7384Etj.areEqual(this.seq, canonicalEventEnvelope.seq) || !C7384Etj.areEqual(this.messageId, canonicalEventEnvelope.messageId) || !C7384Etj.areEqual(this.replyToMessageId, canonicalEventEnvelope.replyToMessageId) || !C7384Etj.areEqual(this.streamLane, canonicalEventEnvelope.streamLane) || !C7384Etj.areEqual(this.parentAgentId, canonicalEventEnvelope.parentAgentId) || !C7384Etj.areEqual(this.subagentId, canonicalEventEnvelope.subagentId) || !C7384Etj.areEqual(this.messageSeq, canonicalEventEnvelope.messageSeq) || !C7384Etj.areEqual(this.chatEventSeq, canonicalEventEnvelope.chatEventSeq) || !C7384Etj.areEqual(this.sessionId, canonicalEventEnvelope.sessionId) || this.isThread != canonicalEventEnvelope.isThread || !C7384Etj.areEqual(this.parentMessageId, canonicalEventEnvelope.parentMessageId) || !C7384Etj.areEqual(this.voiceCallId, canonicalEventEnvelope.voiceCallId)) {
                }
            }
            return false;
        }
        return true;
    }

    public final Long component1() {
        return this.seq;
    }

    public final boolean component10() {
        return this.isThread;
    }

    public final String component11() {
        return this.parentMessageId;
    }

    public final String component12() {
        return this.voiceCallId;
    }

    public final String component2() {
        return this.messageId;
    }

    public final String component3() {
        return this.replyToMessageId;
    }

    public final String component4() {
        return this.streamLane;
    }

    public final String component5() {
        return this.parentAgentId;
    }

    public final String component6() {
        return this.subagentId;
    }

    public final Long component7() {
        return this.messageSeq;
    }

    public final Long component8() {
        return this.chatEventSeq;
    }

    public final String component9() {
        return this.sessionId;
    }

    public final CanonicalEventEnvelope copy(Long l, String str, String str2, String str3, String str4, String str5, Long l2, Long l3, String str6, boolean z, String str7, String str8) {
        return new CanonicalEventEnvelope(l, str, str2, str3, str4, str5, l2, l3, str6, z, str7, str8);
    }

    public final Long getChatEventSeq() {
        return this.chatEventSeq;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final Long getMessageSeq() {
        return this.messageSeq;
    }

    public final String getParentAgentId() {
        return this.parentAgentId;
    }

    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    public final String getReplyToMessageId() {
        return this.replyToMessageId;
    }

    public final Long getSeq() {
        return this.seq;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getStreamLane() {
        return this.streamLane;
    }

    public final String getSubagentId() {
        return this.subagentId;
    }

    public final String getVoiceCallId() {
        return this.voiceCallId;
    }

    public int hashCode() {
        return ((C0KA.A01(((((((((((((((((AnonymousClass006.A0D(this.seq) * 31) + AnonymousClass006.A0G(this.messageId)) * 31) + AnonymousClass006.A0G(this.replyToMessageId)) * 31) + AnonymousClass006.A0G(this.streamLane)) * 31) + AnonymousClass006.A0G(this.parentAgentId)) * 31) + AnonymousClass006.A0G(this.subagentId)) * 31) + AnonymousClass006.A0D(this.messageSeq)) * 31) + AnonymousClass006.A0D(this.chatEventSeq)) * 31) + AnonymousClass006.A0G(this.sessionId)) * 31, this.isThread) + AnonymousClass006.A0G(this.parentMessageId)) * 31) + AnonymousClass005.A0H(this.voiceCallId);
    }

    public final boolean isThread() {
        return this.isThread;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CanonicalEventEnvelope(Long l, String str, String str2, String str3, String str4, String str5, Long l2, Long l3, String str6, boolean z, String str7, String str8, int i, C06H c06h) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : l3, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8);
    }

    public CanonicalEventEnvelope(Long l, String str, String str2, String str3, String str4, String str5, Long l2, Long l3, String str6, boolean z, String str7, String str8) {
        this.seq = l;
        this.messageId = str;
        this.replyToMessageId = str2;
        this.streamLane = str3;
        this.parentAgentId = str4;
        this.subagentId = str5;
        this.messageSeq = l2;
        this.chatEventSeq = l3;
        this.sessionId = str6;
        this.isThread = z;
        this.parentMessageId = str7;
        this.voiceCallId = str8;
    }
}
