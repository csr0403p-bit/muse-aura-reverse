package com.facebook.aura.model;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.model.ReplyAttribution;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchMessage extends C06G {
    public static final int $stable = HatchDeltaTranscript.$stable;
    public final List<HatchAttachment> attachments;
    public final HatchMessageChannel channel;
    public final List<HatchCitation> citations;
    public final String content;
    public final HatchSendErrorCategory errorCategory;
    public final String executionTurnId;
    public final Map<String, Object> extraParams;
    public final String id;
    public final boolean isPending;
    public final boolean isSpokenSummary;
    public final boolean isSyntheticPresentationCarrier;
    public final String liveSessionTargetThreadId;
    public final String milestoneType;
    public final String milestoneVariant;
    public final String milestoneVideoPath;
    public final List<HatchWidgetPresentation> presentations;
    public final String qplTurnId;
    public final List<String> reactions;
    public final ReplyAttribution replyAttribution;
    public final String requestId;
    public final HatchMessageRole role;
    public final boolean routeToLiveSession;
    public final Long rowId;
    public final List<HatchTextEntitySegment> segments;
    public final String sendErrorMessage;
    public final HatchMessageSendStatus sendStatus;
    public final Long seq;
    public final String serverMessageId;
    public final String thinking;
    public final long timestamp;
    public final HatchDeltaTranscript transcript;
    public final String turnKind;
    public final HatchMessageUnsendStatus unsendStatus;
    public final List<HatchWidget> widgets;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchMessage) {
                HatchMessage hatchMessage = (HatchMessage) obj;
                if (!C60Q.A1T(this, hatchMessage) || this.role != hatchMessage.role || !C7384Etj.areEqual(this.content, hatchMessage.content) || this.timestamp != hatchMessage.timestamp || !C7384Etj.areEqual(this.attachments, hatchMessage.attachments) || !C7384Etj.areEqual(this.thinking, hatchMessage.thinking) || !C7384Etj.areEqual(this.rowId, hatchMessage.rowId) || !C7384Etj.areEqual(this.seq, hatchMessage.seq) || !C7384Etj.areEqual(this.serverMessageId, hatchMessage.serverMessageId) || !C7384Etj.areEqual(this.reactions, hatchMessage.reactions) || !C7384Etj.areEqual(this.citations, hatchMessage.citations) || !C7384Etj.areEqual(this.transcript, hatchMessage.transcript) || this.channel != hatchMessage.channel || !C7384Etj.areEqual(this.turnKind, hatchMessage.turnKind) || this.isSpokenSummary != hatchMessage.isSpokenSummary || !C7384Etj.areEqual(this.executionTurnId, hatchMessage.executionTurnId) || !C7384Etj.areEqual(this.replyAttribution, hatchMessage.replyAttribution) || this.isPending != hatchMessage.isPending || !C7384Etj.areEqual(this.milestoneType, hatchMessage.milestoneType) || !C7384Etj.areEqual(this.milestoneVideoPath, hatchMessage.milestoneVideoPath) || !C7384Etj.areEqual(this.milestoneVariant, hatchMessage.milestoneVariant) || !C7384Etj.areEqual(this.qplTurnId, hatchMessage.qplTurnId) || this.sendStatus != hatchMessage.sendStatus || this.unsendStatus != hatchMessage.unsendStatus || !C7384Etj.areEqual(this.sendErrorMessage, hatchMessage.sendErrorMessage) || this.errorCategory != hatchMessage.errorCategory || !C7384Etj.areEqual(this.requestId, hatchMessage.requestId) || !C7384Etj.areEqual(this.widgets, hatchMessage.widgets) || !C7384Etj.areEqual(this.presentations, hatchMessage.presentations) || this.isSyntheticPresentationCarrier != hatchMessage.isSyntheticPresentationCarrier || !C7384Etj.areEqual(this.segments, hatchMessage.segments) || !C7384Etj.areEqual(this.extraParams, hatchMessage.extraParams) || this.routeToLiveSession != hatchMessage.routeToLiveSession || !C7384Etj.areEqual(this.liveSessionTargetThreadId, hatchMessage.liveSessionTargetThreadId)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.id;
    }

    public final List<String> component10() {
        return this.reactions;
    }

    public final List<HatchCitation> component11() {
        return this.citations;
    }

    public final HatchDeltaTranscript component12() {
        return this.transcript;
    }

    public final HatchMessageChannel component13() {
        return this.channel;
    }

    public final String component14() {
        return this.turnKind;
    }

    public final boolean component15() {
        return this.isSpokenSummary;
    }

    public final String component16() {
        return this.executionTurnId;
    }

    public final ReplyAttribution component17() {
        return this.replyAttribution;
    }

    public final boolean component18() {
        return this.isPending;
    }

    public final String component19() {
        return this.milestoneType;
    }

    public final HatchMessageRole component2() {
        return this.role;
    }

    public final String component20() {
        return this.milestoneVideoPath;
    }

    public final String component21() {
        return this.milestoneVariant;
    }

    public final String component22() {
        return this.qplTurnId;
    }

    public final HatchMessageSendStatus component23() {
        return this.sendStatus;
    }

    public final HatchMessageUnsendStatus component24() {
        return this.unsendStatus;
    }

    public final String component25() {
        return this.sendErrorMessage;
    }

    public final HatchSendErrorCategory component26() {
        return this.errorCategory;
    }

    public final String component27() {
        return this.requestId;
    }

    public final List<HatchWidget> component28() {
        return this.widgets;
    }

    public final List<HatchWidgetPresentation> component29() {
        return this.presentations;
    }

    public final String component3() {
        return this.content;
    }

    public final boolean component30() {
        return this.isSyntheticPresentationCarrier;
    }

    public final List<HatchTextEntitySegment> component31() {
        return this.segments;
    }

    public final Map<String, Object> component32() {
        return this.extraParams;
    }

    public final boolean component33() {
        return this.routeToLiveSession;
    }

    public final String component34() {
        return this.liveSessionTargetThreadId;
    }

    public final long component4() {
        return this.timestamp;
    }

    public final List<HatchAttachment> component5() {
        return this.attachments;
    }

    public final String component6() {
        return this.thinking;
    }

    public final Long component7() {
        return this.rowId;
    }

    public final Long component8() {
        return this.seq;
    }

    public final String component9() {
        return this.serverMessageId;
    }

    public final String getAnalyticsMessageId() {
        HatchDeltaTranscript hatchDeltaTranscript;
        if (!this.isSyntheticPresentationCarrier) {
            String str = this.serverMessageId;
            if (str == null && ((hatchDeltaTranscript = this.transcript) == null || (str = hatchDeltaTranscript.messageId) == null)) {
                str = this.id;
                if (this.requestId == null) {
                }
            }
            return str;
        }
        return null;
    }

    public final List<HatchAttachment> getAttachments() {
        return this.attachments;
    }

    public final HatchMessageChannel getChannel() {
        return this.channel;
    }

    public final List<HatchCitation> getCitations() {
        return this.citations;
    }

    public final String getContent() {
        return this.content;
    }

    public final HatchSendErrorCategory getErrorCategory() {
        return this.errorCategory;
    }

    public final String getExecutionTurnId() {
        return this.executionTurnId;
    }

    public final Map<String, Object> getExtraParams() {
        return this.extraParams;
    }

    public final String getId() {
        return this.id;
    }

    public final String getInReplyTo() {
        ReplyAttribution replyAttribution = this.replyAttribution;
        if (replyAttribution instanceof ReplyAttribution.Message) {
            return ((ReplyAttribution.Message) replyAttribution).messageId;
        }
        if ((replyAttribution instanceof ReplyAttribution.Idea) || (replyAttribution instanceof ReplyAttribution.Presentation) || (replyAttribution instanceof ReplyAttribution.Element) || (replyAttribution instanceof ReplyAttribution.Product) || (replyAttribution instanceof ReplyAttribution.FeedUnit) || (replyAttribution instanceof ReplyAttribution.Goal) || (replyAttribution instanceof ReplyAttribution.Context) || replyAttribution == null) {
            return null;
        }
        throw C3cG.A0q();
    }

    public final String getLiveSessionTargetThreadId() {
        return this.liveSessionTargetThreadId;
    }

    public final String getMilestoneType() {
        return this.milestoneType;
    }

    public final String getMilestoneVariant() {
        return this.milestoneVariant;
    }

    public final String getMilestoneVideoPath() {
        return this.milestoneVideoPath;
    }

    public final List<HatchWidgetPresentation> getPresentations() {
        return this.presentations;
    }

    public final String getQplTurnId() {
        return this.qplTurnId;
    }

    public final String getReactionTargetId() {
        HatchWidgetPresentation hatchWidgetPresentation;
        if (!this.isSyntheticPresentationCarrier) {
            return this.id;
        }
        List<HatchWidgetPresentation> list = this.presentations;
        if (list == null || (hatchWidgetPresentation = (HatchWidgetPresentation) AbstractC0878AGe.A0G(list)) == null) {
            return null;
        }
        return hatchWidgetPresentation.presentationEventId;
    }

    public final List<String> getReactions() {
        return this.reactions;
    }

    public final ReplyAttribution getReplyAttribution() {
        return this.replyAttribution;
    }

    public final String getReplyPreview() {
        ReplyAttribution replyAttribution = this.replyAttribution;
        if (replyAttribution instanceof ReplyAttribution.Message) {
            return ((ReplyAttribution.Message) replyAttribution).preview;
        }
        if (replyAttribution instanceof ReplyAttribution.Idea) {
            return ((ReplyAttribution.Idea) replyAttribution).idea.title;
        }
        if (replyAttribution instanceof ReplyAttribution.Presentation) {
            return ((ReplyAttribution.Presentation) replyAttribution).preview;
        }
        if (replyAttribution instanceof ReplyAttribution.Element) {
            return ((ReplyAttribution.Element) replyAttribution).title;
        }
        if (replyAttribution instanceof ReplyAttribution.Product) {
            ReplyAttribution.Product product = (ReplyAttribution.Product) replyAttribution;
            String str = product.name;
            return (str == null || C7BY.A0j(str)) ? product.url : str;
        }
        if (replyAttribution instanceof ReplyAttribution.FeedUnit) {
            ReplyAttribution.FeedUnit feedUnit = (ReplyAttribution.FeedUnit) replyAttribution;
            String str2 = feedUnit.preview;
            return C7BY.A0j(str2) ? feedUnit.kicker : str2;
        }
        if (replyAttribution instanceof ReplyAttribution.Goal) {
            return ((ReplyAttribution.Goal) replyAttribution).title;
        }
        if (replyAttribution instanceof ReplyAttribution.Context) {
            return ((ReplyAttribution.Context) replyAttribution).preview;
        }
        if (replyAttribution != null) {
            throw C3cG.A0q();
        }
        return null;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final HatchMessageRole getRole() {
        return this.role;
    }

    public final boolean getRouteToLiveSession() {
        return this.routeToLiveSession;
    }

    public final Long getRowId() {
        return this.rowId;
    }

    public final List<HatchTextEntitySegment> getSegments() {
        return this.segments;
    }

    public final String getSendErrorMessage() {
        return this.sendErrorMessage;
    }

    public final HatchMessageSendStatus getSendStatus() {
        return this.sendStatus;
    }

    public final Long getSeq() {
        return this.seq;
    }

    public final String getServerMessageId() {
        return this.serverMessageId;
    }

    public final String getThinking() {
        return this.thinking;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final HatchDeltaTranscript getTranscript() {
        return this.transcript;
    }

    public final String getTurnKind() {
        return this.turnKind;
    }

    public final HatchMessageUnsendStatus getUnsendStatus() {
        return this.unsendStatus;
    }

    public final List<HatchWidget> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        return C0KA.A01((((C0KA.A01((((((((((AnonymousClass005.A0F(this.unsendStatus, AnonymousClass005.A0F(this.sendStatus, (((((((C0KA.A01((((C0KA.A01((((((AnonymousClass005.A0F(this.citations, AnonymousClass005.A0F(this.reactions, (((((((((C60R.A00(this.timestamp, AnonymousClass005.A0I(this.content, AnonymousClass005.A0F(this.role, AnonymousClass001.A0G(this.id)))) + AnonymousClass006.A0D(this.attachments)) * 31) + AnonymousClass006.A0G(this.thinking)) * 31) + AnonymousClass006.A0D(this.rowId)) * 31) + AnonymousClass006.A0D(this.seq)) * 31) + AnonymousClass006.A0G(this.serverMessageId)) * 31)) + AnonymousClass006.A0D(this.transcript)) * 31) + AnonymousClass006.A0D(this.channel)) * 31) + AnonymousClass006.A0G(this.turnKind)) * 31, this.isSpokenSummary) + AnonymousClass006.A0G(this.executionTurnId)) * 31) + AnonymousClass006.A0D(this.replyAttribution)) * 31, this.isPending) + AnonymousClass006.A0G(this.milestoneType)) * 31) + AnonymousClass006.A0G(this.milestoneVideoPath)) * 31) + AnonymousClass006.A0G(this.milestoneVariant)) * 31) + AnonymousClass006.A0G(this.qplTurnId)) * 31)) + AnonymousClass006.A0G(this.sendErrorMessage)) * 31) + AnonymousClass006.A0D(this.errorCategory)) * 31) + AnonymousClass006.A0G(this.requestId)) * 31) + AnonymousClass006.A0D(this.widgets)) * 31) + AnonymousClass006.A0D(this.presentations)) * 31, this.isSyntheticPresentationCarrier) + AnonymousClass006.A0D(this.segments)) * 31) + AnonymousClass006.A0D(this.extraParams)) * 31, this.routeToLiveSession) + AnonymousClass005.A0H(this.liveSessionTargetThreadId);
    }

    public final boolean isPending() {
        return this.isPending;
    }

    public final boolean isSpokenSummary() {
        return this.isSpokenSummary;
    }

    public final boolean isSyntheticPresentationCarrier() {
        return this.isSyntheticPresentationCarrier;
    }

    public final HatchMessage copy(String str, HatchMessageRole hatchMessageRole, String str2, long j, List<HatchAttachment> list, String str3, Long l, Long l2, String str4, List<String> list2, List<HatchCitation> list3, HatchDeltaTranscript hatchDeltaTranscript, HatchMessageChannel hatchMessageChannel, String str5, boolean z, String str6, ReplyAttribution replyAttribution, boolean z2, String str7, String str8, String str9, String str10, HatchMessageSendStatus hatchMessageSendStatus, HatchMessageUnsendStatus hatchMessageUnsendStatus, String str11, HatchSendErrorCategory hatchSendErrorCategory, String str12, List<HatchWidget> list4, List<HatchWidgetPresentation> list5, boolean z3, List<HatchTextEntitySegment> list6, Map<String, ? extends Object> map, boolean z4, String str13) {
        AnonymousClass005.A0x(str, hatchMessageRole, str2);
        C3cH.A18(list2, list3);
        C7384Etj.A0Y(hatchMessageSendStatus, 22);
        C7384Etj.A0Y(hatchMessageUnsendStatus, 23);
        return new HatchMessage(str, hatchMessageRole, str2, j, list, str3, l, l2, str4, list2, list3, hatchDeltaTranscript, hatchMessageChannel, str5, z, str6, replyAttribution, z2, str7, str8, str9, str10, hatchMessageSendStatus, hatchMessageUnsendStatus, str11, hatchSendErrorCategory, str12, list4, list5, z3, list6, map, z4, str13);
    }

    public String toString() {
        return super.toString();
    }

    public HatchMessage(String str, HatchMessageRole hatchMessageRole, String str2, long j, List<HatchAttachment> list, String str3, Long l, Long l2, String str4, List<String> list2, List<HatchCitation> list3, HatchDeltaTranscript hatchDeltaTranscript, HatchMessageChannel hatchMessageChannel, String str5, boolean z, String str6, ReplyAttribution replyAttribution, boolean z2, String str7, String str8, String str9, String str10, HatchMessageSendStatus hatchMessageSendStatus, HatchMessageUnsendStatus hatchMessageUnsendStatus, String str11, HatchSendErrorCategory hatchSendErrorCategory, String str12, List<HatchWidget> list4, List<HatchWidgetPresentation> list5, boolean z3, List<HatchTextEntitySegment> list6, Map<String, ? extends Object> map, boolean z4, String str13) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(hatchMessageRole, 1);
        C7384Etj.A0Y(str2, 2);
        C7384Etj.A0Y(list2, 9);
        C7384Etj.A0Y(list3, 10);
        C7384Etj.A0Y(hatchMessageSendStatus, 22);
        C7384Etj.A0Y(hatchMessageUnsendStatus, 23);
        this.id = str;
        this.role = hatchMessageRole;
        this.content = str2;
        this.timestamp = j;
        this.attachments = list;
        this.thinking = str3;
        this.rowId = l;
        this.seq = l2;
        this.serverMessageId = str4;
        this.reactions = list2;
        this.citations = list3;
        this.transcript = hatchDeltaTranscript;
        this.channel = hatchMessageChannel;
        this.turnKind = str5;
        this.isSpokenSummary = z;
        this.executionTurnId = str6;
        this.replyAttribution = replyAttribution;
        this.isPending = z2;
        this.milestoneType = str7;
        this.milestoneVideoPath = str8;
        this.milestoneVariant = str9;
        this.qplTurnId = str10;
        this.sendStatus = hatchMessageSendStatus;
        this.unsendStatus = hatchMessageUnsendStatus;
        this.sendErrorMessage = str11;
        this.errorCategory = hatchSendErrorCategory;
        this.requestId = str12;
        this.widgets = list4;
        this.presentations = list5;
        this.isSyntheticPresentationCarrier = z3;
        this.segments = list6;
        this.extraParams = map;
        this.routeToLiveSession = z4;
        this.liveSessionTargetThreadId = str13;
    }

    public static /* synthetic */ HatchMessage copy$default(HatchMessage hatchMessage, String str, HatchMessageRole hatchMessageRole, String str2, long j, List list, String str3, Long l, Long l2, String str4, List list2, List list3, HatchDeltaTranscript hatchDeltaTranscript, HatchMessageChannel hatchMessageChannel, String str5, boolean z, String str6, ReplyAttribution replyAttribution, boolean z2, String str7, String str8, String str9, String str10, HatchMessageSendStatus hatchMessageSendStatus, HatchMessageUnsendStatus hatchMessageUnsendStatus, String str11, HatchSendErrorCategory hatchSendErrorCategory, String str12, List list4, List list5, boolean z3, List list6, Map map, boolean z4, String str13, int i, int i2, Object obj) {
        String str14 = str;
        HatchMessageRole hatchMessageRole2 = hatchMessageRole;
        String str15 = str2;
        long j2 = j;
        List list7 = list;
        String str16 = str3;
        Long l3 = l;
        Long l4 = l2;
        String str17 = str4;
        List list8 = list2;
        List list9 = list3;
        HatchDeltaTranscript hatchDeltaTranscript2 = hatchDeltaTranscript;
        HatchMessageChannel hatchMessageChannel2 = hatchMessageChannel;
        String str18 = str5;
        boolean z5 = z;
        boolean z6 = z2;
        List list10 = list4;
        List list11 = list5;
        boolean z7 = z3;
        List list12 = list6;
        Map map2 = map;
        boolean z8 = z4;
        String str19 = str6;
        ReplyAttribution replyAttribution2 = replyAttribution;
        String str20 = str7;
        String str21 = str8;
        String str22 = str9;
        String str23 = str10;
        HatchMessageSendStatus hatchMessageSendStatus2 = hatchMessageSendStatus;
        HatchMessageUnsendStatus hatchMessageUnsendStatus2 = hatchMessageUnsendStatus;
        String str24 = str11;
        HatchSendErrorCategory hatchSendErrorCategory2 = hatchSendErrorCategory;
        String str25 = str12;
        String str26 = str13;
        if ((i & 1) != 0) {
            str14 = hatchMessage.id;
        }
        if ((i & 2) != 0) {
            hatchMessageRole2 = hatchMessage.role;
        }
        if ((i & 4) != 0) {
            str15 = hatchMessage.content;
        }
        if ((i & 8) != 0) {
            j2 = hatchMessage.timestamp;
        }
        if ((i & 16) != 0) {
            list7 = hatchMessage.attachments;
        }
        if ((i & 32) != 0) {
            str16 = hatchMessage.thinking;
        }
        if ((i & 64) != 0) {
            l3 = hatchMessage.rowId;
        }
        if ((i & 128) != 0) {
            l4 = hatchMessage.seq;
        }
        if ((i & 256) != 0) {
            str17 = hatchMessage.serverMessageId;
        }
        if ((i & 512) != 0) {
            list8 = hatchMessage.reactions;
        }
        if ((i & 1024) != 0) {
            list9 = hatchMessage.citations;
        }
        if ((i & 2048) != 0) {
            hatchDeltaTranscript2 = hatchMessage.transcript;
        }
        if ((i & 4096) != 0) {
            hatchMessageChannel2 = hatchMessage.channel;
        }
        if ((i & 8192) != 0) {
            str18 = hatchMessage.turnKind;
        }
        if ((i & 16384) != 0) {
            z5 = hatchMessage.isSpokenSummary;
        }
        if ((i & 32768) != 0) {
            str19 = hatchMessage.executionTurnId;
        }
        if ((i & 65536) != 0) {
            replyAttribution2 = hatchMessage.replyAttribution;
        }
        if ((i & 131072) != 0) {
            z6 = hatchMessage.isPending;
        }
        if ((i & 262144) != 0) {
            str20 = hatchMessage.milestoneType;
        }
        if ((i & 524288) != 0) {
            str21 = hatchMessage.milestoneVideoPath;
        }
        if ((i & 1048576) != 0) {
            str22 = hatchMessage.milestoneVariant;
        }
        if ((i & 2097152) != 0) {
            str23 = hatchMessage.qplTurnId;
        }
        if ((i & 4194304) != 0) {
            hatchMessageSendStatus2 = hatchMessage.sendStatus;
        }
        if ((i & 8388608) != 0) {
            hatchMessageUnsendStatus2 = hatchMessage.unsendStatus;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            str24 = hatchMessage.sendErrorMessage;
        }
        if ((i & 33554432) != 0) {
            hatchSendErrorCategory2 = hatchMessage.errorCategory;
        }
        if ((i & 67108864) != 0) {
            str25 = hatchMessage.requestId;
        }
        if ((i & 134217728) != 0) {
            list10 = hatchMessage.widgets;
        }
        if ((i & 268435456) != 0) {
            list11 = hatchMessage.presentations;
        }
        if ((i & 536870912) != 0) {
            z7 = hatchMessage.isSyntheticPresentationCarrier;
        }
        if ((i & 1073741824) != 0) {
            list12 = hatchMessage.segments;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            map2 = hatchMessage.extraParams;
        }
        if ((i2 & 1) != 0) {
            z8 = hatchMessage.routeToLiveSession;
        }
        if ((i2 & 2) != 0) {
            str26 = hatchMessage.liveSessionTargetThreadId;
        }
        return hatchMessage.copy(str14, hatchMessageRole2, str15, j2, list7, str16, l3, l4, str17, list8, list9, hatchDeltaTranscript2, hatchMessageChannel2, str18, z5, str19, replyAttribution2, z6, str20, str21, str22, str23, hatchMessageSendStatus2, hatchMessageUnsendStatus2, str24, hatchSendErrorCategory2, str25, list10, list11, z7, list12, map2, z8, str26);
    }

    public /* synthetic */ HatchMessage(String str, HatchMessageRole hatchMessageRole, String str2, long j, List list, String str3, Long l, Long l2, String str4, List list2, List list3, HatchDeltaTranscript hatchDeltaTranscript, HatchMessageChannel hatchMessageChannel, String str5, boolean z, String str6, ReplyAttribution replyAttribution, boolean z2, String str7, String str8, String str9, String str10, HatchMessageSendStatus hatchMessageSendStatus, HatchMessageUnsendStatus hatchMessageUnsendStatus, String str11, HatchSendErrorCategory hatchSendErrorCategory, String str12, List list4, List list5, boolean z3, List list6, Map map, boolean z4, String str13, int i, int i2, C06H c06h) {
        this((i & 1) != 0 ? AnonymousClass002.A0k() : str, hatchMessageRole, str2, (i & 8) != 0 ? System.currentTimeMillis() : j, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : l2, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? C0881AGi.A00 : list2, (i & 1024) != 0 ? C0881AGi.A00 : list3, (i & 2048) != 0 ? null : hatchDeltaTranscript, (i & 4096) != 0 ? null : hatchMessageChannel, (i & 8192) != 0 ? null : str5, C3cG.A1K(i & 16384, z), (32768 & i) != 0 ? null : str6, (65536 & i) != 0 ? null : replyAttribution, C3cH.A1L(131072, i, z2), (262144 & i) != 0 ? null : str7, (524288 & i) != 0 ? null : str8, (1048576 & i) != 0 ? null : str9, (2097152 & i) != 0 ? null : str10, (4194304 & i) != 0 ? HatchMessageSendStatus.SENT : hatchMessageSendStatus, (8388608 & i) != 0 ? HatchMessageUnsendStatus.NONE : hatchMessageUnsendStatus, (16777216 & i) != 0 ? null : str11, (33554432 & i) != 0 ? null : hatchSendErrorCategory, (67108864 & i) != 0 ? null : str12, (134217728 & i) != 0 ? null : list4, (268435456 & i) != 0 ? null : list5, C3cH.A1L(536870912, i, z3), (1073741824 & i) != 0 ? null : list6, (i & Integer.MIN_VALUE) != 0 ? null : map, C3cG.A1K(i2 & 1, z4), (i2 & 2) != 0 ? null : str13);
    }
}
