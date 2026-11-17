package com.facebook.aura.conversation.offline;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C10571Hud;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60R;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.model.HatchAttachment;
import com.facebook.aura.model.HatchCitation;
import com.facebook.aura.model.HatchDeltaTranscript;
import com.facebook.aura.model.HatchDeltaTranscript$$serializer;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchMessageChannel;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.model.HatchMessageSendStatus;
import com.facebook.aura.model.HatchMessageUnsendStatus;
import com.facebook.aura.model.HatchSendErrorCategory;
import com.facebook.aura.model.HatchTextEntitySegment;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.model.ReplyAttribution;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchPersistedMessageJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public static final String SEND_STATUS_SENT = "SENT";
    public static final String UNSEND_STATUS_NONE = "NONE";
    public final List<HatchPersistedAttachmentJson> attachments;
    public final String channel;
    public final List<HatchCitation> citations;
    public final String content;
    public final String errorCategory;
    public final String executionTurnId;
    public final String id;
    public final boolean isPending;
    public final boolean isSpokenSummary;
    public final boolean isSyntheticPresentationCarrier;
    public final String milestoneType;
    public final String milestoneVariant;
    public final String milestoneVideoPath;
    public final List<HatchWidgetPresentation> presentations;
    public final List<String> reactions;
    public final ReplyAttribution replyAttribution;
    public final String requestId;
    public final String role;
    public final Long rowId;
    public final List<HatchTextEntitySegment> segments;
    public final String sendErrorMessage;
    public final String sendStatus;
    public final Long seq;
    public final String serverMessageId;
    public final String thinking;
    public final long timestamp;
    public final HatchDeltaTranscript transcript;
    public final String turnKind;
    public final String unsendStatus;
    public final List<HatchWidget> widgets;

    public final class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [X.AGi] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
        public final HatchPersistedMessageJson fromDomain(HatchMessage hatchMessage) {
            List listA0i;
            C7384Etj.A0Y(hatchMessage, 0);
            String str = hatchMessage.id;
            String strName = hatchMessage.role.name();
            String str2 = hatchMessage.content;
            long j = hatchMessage.timestamp;
            Long l = hatchMessage.seq;
            Long l2 = hatchMessage.rowId;
            String str3 = hatchMessage.serverMessageId;
            String str4 = hatchMessage.requestId;
            String str5 = hatchMessage.thinking;
            List<String> list = hatchMessage.reactions;
            List<HatchCitation> list2 = hatchMessage.citations;
            HatchMessageChannel hatchMessageChannel = hatchMessage.channel;
            String serverValue = hatchMessageChannel != null ? hatchMessageChannel.getServerValue() : null;
            String str6 = hatchMessage.turnKind;
            String str7 = hatchMessage.executionTurnId;
            String str8 = hatchMessage.milestoneType;
            String str9 = hatchMessage.milestoneVideoPath;
            String str10 = hatchMessage.milestoneVariant;
            boolean z = hatchMessage.isSpokenSummary;
            boolean z2 = hatchMessage.isPending;
            String strName2 = hatchMessage.sendStatus.name();
            String strName3 = hatchMessage.unsendStatus.name();
            String str11 = hatchMessage.sendErrorMessage;
            HatchSendErrorCategory hatchSendErrorCategory = hatchMessage.errorCategory;
            String strName4 = hatchSendErrorCategory != null ? hatchSendErrorCategory.name() : null;
            List<HatchAttachment> list3 = hatchMessage.attachments;
            if (list3 != null) {
                listA0i = AnonymousClass003.A0i(list3);
                Iterator<HatchAttachment> it = list3.iterator();
                while (it.hasNext()) {
                    listA0i.add(HatchPersistedAttachmentJson.Companion.fromDomain(it.next()));
                }
            } else {
                listA0i = C0881AGi.A00;
            }
            HatchDeltaTranscript hatchDeltaTranscript = hatchMessage.transcript;
            ReplyAttribution replyAttribution = hatchMessage.replyAttribution;
            List list4 = hatchMessage.widgets;
            if (list4 == null) {
                list4 = C0881AGi.A00;
            }
            List list5 = hatchMessage.presentations;
            if (list5 == null) {
                list5 = C0881AGi.A00;
            }
            List list6 = hatchMessage.segments;
            if (list6 == null) {
                list6 = C0881AGi.A00;
            }
            return new HatchPersistedMessageJson(str, strName, str2, j, l, l2, str3, str4, str5, list, list2, serverValue, str6, str7, str8, str9, str10, z, z2, strName2, strName3, str11, strName4, listA0i, hatchDeltaTranscript, replyAttribution, list4, list5, list6, hatchMessage.isSyntheticPresentationCarrier);
        }

        public final C9hr<HatchPersistedMessageJson> serializer() {
            return HatchPersistedMessageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        F0C<C9hr<Object>>[] f0cArr = new F0C[30];
        Integer num = C79.A01;
        System.arraycopy(new F0C[]{null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, HatchPersistedMessageJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, HatchPersistedMessageJson$Companion$$childSerializers$2.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, HatchPersistedMessageJson$Companion$$childSerializers$3.INSTANCE), null, null, AbstractC5321DgF.A02(num, HatchPersistedMessageJson$Companion$$childSerializers$4.INSTANCE)}, 0, f0cArr, 0, 27);
        System.arraycopy(new F0C[]{AbstractC5321DgF.A02(num, HatchPersistedMessageJson$Companion$$childSerializers$5.INSTANCE), AbstractC5321DgF.A02(num, HatchPersistedMessageJson$Companion$$childSerializers$6.INSTANCE), null}, 0, f0cArr, 27, 3);
        $childSerializers = f0cArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchPersistedMessageJson) {
                HatchPersistedMessageJson hatchPersistedMessageJson = (HatchPersistedMessageJson) obj;
                if (!C7384Etj.areEqual(this.id, hatchPersistedMessageJson.id) || !C7384Etj.areEqual(this.role, hatchPersistedMessageJson.role) || !C7384Etj.areEqual(this.content, hatchPersistedMessageJson.content) || this.timestamp != hatchPersistedMessageJson.timestamp || !C7384Etj.areEqual(this.seq, hatchPersistedMessageJson.seq) || !C7384Etj.areEqual(this.rowId, hatchPersistedMessageJson.rowId) || !C7384Etj.areEqual(this.serverMessageId, hatchPersistedMessageJson.serverMessageId) || !C7384Etj.areEqual(this.requestId, hatchPersistedMessageJson.requestId) || !C7384Etj.areEqual(this.thinking, hatchPersistedMessageJson.thinking) || !C7384Etj.areEqual(this.reactions, hatchPersistedMessageJson.reactions) || !C7384Etj.areEqual(this.citations, hatchPersistedMessageJson.citations) || !C7384Etj.areEqual(this.channel, hatchPersistedMessageJson.channel) || !C7384Etj.areEqual(this.turnKind, hatchPersistedMessageJson.turnKind) || !C7384Etj.areEqual(this.executionTurnId, hatchPersistedMessageJson.executionTurnId) || !C7384Etj.areEqual(this.milestoneType, hatchPersistedMessageJson.milestoneType) || !C7384Etj.areEqual(this.milestoneVideoPath, hatchPersistedMessageJson.milestoneVideoPath) || !C7384Etj.areEqual(this.milestoneVariant, hatchPersistedMessageJson.milestoneVariant) || this.isSpokenSummary != hatchPersistedMessageJson.isSpokenSummary || this.isPending != hatchPersistedMessageJson.isPending || !C7384Etj.areEqual(this.sendStatus, hatchPersistedMessageJson.sendStatus) || !C7384Etj.areEqual(this.unsendStatus, hatchPersistedMessageJson.unsendStatus) || !C7384Etj.areEqual(this.sendErrorMessage, hatchPersistedMessageJson.sendErrorMessage) || !C7384Etj.areEqual(this.errorCategory, hatchPersistedMessageJson.errorCategory) || !C7384Etj.areEqual(this.attachments, hatchPersistedMessageJson.attachments) || !C7384Etj.areEqual(this.transcript, hatchPersistedMessageJson.transcript) || !C7384Etj.areEqual(this.replyAttribution, hatchPersistedMessageJson.replyAttribution) || !C7384Etj.areEqual(this.widgets, hatchPersistedMessageJson.widgets) || !C7384Etj.areEqual(this.presentations, hatchPersistedMessageJson.presentations) || !C7384Etj.areEqual(this.segments, hatchPersistedMessageJson.segments) || this.isSyntheticPresentationCarrier != hatchPersistedMessageJson.isSyntheticPresentationCarrier) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_offline_offline(HatchPersistedMessageJson hatchPersistedMessageJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(hatchPersistedMessageJson.id, c9iZ, 0);
        c9j5.AAV(hatchPersistedMessageJson.role, c9iZ, 1);
        c9j5.AAV(hatchPersistedMessageJson.content, c9iZ, 2);
        c9j5.AAN(c9iZ, 3, hatchPersistedMessageJson.timestamp);
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchPersistedMessageJson.seq != null) {
            c9j5.AAP(hatchPersistedMessageJson.seq, C9j1.A00, c9iZ, 4);
        }
        if (zAfR || hatchPersistedMessageJson.rowId != null) {
            c9j5.AAP(hatchPersistedMessageJson.rowId, C9j1.A00, c9iZ, 5);
        }
        if (zAfR || hatchPersistedMessageJson.serverMessageId != null) {
            c9j5.AAP(hatchPersistedMessageJson.serverMessageId, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || hatchPersistedMessageJson.requestId != null) {
            c9j5.AAP(hatchPersistedMessageJson.requestId, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || hatchPersistedMessageJson.thinking != null) {
            c9j5.AAP(hatchPersistedMessageJson.thinking, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || !C3cG.A1L(hatchPersistedMessageJson.reactions)) {
            c9j5.AAQ(hatchPersistedMessageJson.reactions, C3cH.A15(f0cArr, 9), c9iZ, 9);
        }
        if (zAfR || !C3cG.A1L(hatchPersistedMessageJson.citations)) {
            c9j5.AAQ(hatchPersistedMessageJson.citations, C3cH.A15(f0cArr, 10), c9iZ, 10);
        }
        if (zAfR || hatchPersistedMessageJson.channel != null) {
            c9j5.AAP(hatchPersistedMessageJson.channel, C07779iq.A01, c9iZ, 11);
        }
        if (zAfR || hatchPersistedMessageJson.turnKind != null) {
            c9j5.AAP(hatchPersistedMessageJson.turnKind, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || hatchPersistedMessageJson.executionTurnId != null) {
            c9j5.AAP(hatchPersistedMessageJson.executionTurnId, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || hatchPersistedMessageJson.milestoneType != null) {
            c9j5.AAP(hatchPersistedMessageJson.milestoneType, C07779iq.A01, c9iZ, 14);
        }
        if (zAfR || hatchPersistedMessageJson.milestoneVideoPath != null) {
            c9j5.AAP(hatchPersistedMessageJson.milestoneVideoPath, C07779iq.A01, c9iZ, 15);
        }
        if (zAfR || hatchPersistedMessageJson.milestoneVariant != null) {
            c9j5.AAP(hatchPersistedMessageJson.milestoneVariant, C07779iq.A01, c9iZ, 16);
        }
        if (zAfR || hatchPersistedMessageJson.isSpokenSummary) {
            c9j5.AA7(c9iZ, 17, hatchPersistedMessageJson.isSpokenSummary);
        }
        if (zAfR || hatchPersistedMessageJson.isPending) {
            c9j5.AA7(c9iZ, 18, hatchPersistedMessageJson.isPending);
        }
        if (zAfR || !SEND_STATUS_SENT.equals(hatchPersistedMessageJson.sendStatus)) {
            c9j5.AAV(hatchPersistedMessageJson.sendStatus, c9iZ, 19);
        }
        if (zAfR || !UNSEND_STATUS_NONE.equals(hatchPersistedMessageJson.unsendStatus)) {
            c9j5.AAV(hatchPersistedMessageJson.unsendStatus, c9iZ, 20);
        }
        if (zAfR || hatchPersistedMessageJson.sendErrorMessage != null) {
            c9j5.AAP(hatchPersistedMessageJson.sendErrorMessage, C07779iq.A01, c9iZ, 21);
        }
        if (zAfR || hatchPersistedMessageJson.errorCategory != null) {
            c9j5.AAP(hatchPersistedMessageJson.errorCategory, C07779iq.A01, c9iZ, 22);
        }
        if (zAfR || !C3cG.A1L(hatchPersistedMessageJson.attachments)) {
            c9j5.AAQ(hatchPersistedMessageJson.attachments, C3cH.A15(f0cArr, 23), c9iZ, 23);
        }
        if (zAfR || hatchPersistedMessageJson.transcript != null) {
            c9j5.AAP(hatchPersistedMessageJson.transcript, HatchDeltaTranscript$$serializer.INSTANCE, c9iZ, 24);
        }
        if (zAfR || hatchPersistedMessageJson.replyAttribution != null) {
            c9j5.AAP(hatchPersistedMessageJson.replyAttribution, ReplyAttributionSerializer.INSTANCE, c9iZ, 25);
        }
        if (zAfR || !C3cG.A1L(hatchPersistedMessageJson.widgets)) {
            c9j5.AAQ(hatchPersistedMessageJson.widgets, C3cH.A15(f0cArr, 26), c9iZ, 26);
        }
        if (zAfR || !C3cG.A1L(hatchPersistedMessageJson.presentations)) {
            c9j5.AAQ(hatchPersistedMessageJson.presentations, C3cH.A15(f0cArr, 27), c9iZ, 27);
        }
        if (zAfR || !C3cG.A1L(hatchPersistedMessageJson.segments)) {
            c9j5.AAQ(hatchPersistedMessageJson.segments, C3cH.A15(f0cArr, 28), c9iZ, 28);
        }
        if (zAfR || hatchPersistedMessageJson.isSyntheticPresentationCarrier) {
            c9j5.AA7(c9iZ, 29, hatchPersistedMessageJson.isSyntheticPresentationCarrier);
        }
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

    public final String component12() {
        return this.channel;
    }

    public final String component13() {
        return this.turnKind;
    }

    public final String component14() {
        return this.executionTurnId;
    }

    public final String component15() {
        return this.milestoneType;
    }

    public final String component16() {
        return this.milestoneVideoPath;
    }

    public final String component17() {
        return this.milestoneVariant;
    }

    public final boolean component18() {
        return this.isSpokenSummary;
    }

    public final boolean component19() {
        return this.isPending;
    }

    public final String component2() {
        return this.role;
    }

    public final String component20() {
        return this.sendStatus;
    }

    public final String component21() {
        return this.unsendStatus;
    }

    public final String component22() {
        return this.sendErrorMessage;
    }

    public final String component23() {
        return this.errorCategory;
    }

    public final List<HatchPersistedAttachmentJson> component24() {
        return this.attachments;
    }

    public final HatchDeltaTranscript component25() {
        return this.transcript;
    }

    public final ReplyAttribution component26() {
        return this.replyAttribution;
    }

    public final List<HatchWidget> component27() {
        return this.widgets;
    }

    public final List<HatchWidgetPresentation> component28() {
        return this.presentations;
    }

    public final List<HatchTextEntitySegment> component29() {
        return this.segments;
    }

    public final String component3() {
        return this.content;
    }

    public final boolean component30() {
        return this.isSyntheticPresentationCarrier;
    }

    public final long component4() {
        return this.timestamp;
    }

    public final Long component5() {
        return this.seq;
    }

    public final Long component6() {
        return this.rowId;
    }

    public final String component7() {
        return this.serverMessageId;
    }

    public final String component8() {
        return this.requestId;
    }

    public final String component9() {
        return this.thinking;
    }

    public final List<HatchPersistedAttachmentJson> getAttachments() {
        return this.attachments;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final List<HatchCitation> getCitations() {
        return this.citations;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getErrorCategory() {
        return this.errorCategory;
    }

    public final String getExecutionTurnId() {
        return this.executionTurnId;
    }

    public final String getId() {
        return this.id;
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

    public final List<String> getReactions() {
        return this.reactions;
    }

    public final ReplyAttribution getReplyAttribution() {
        return this.replyAttribution;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getRole() {
        return this.role;
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

    public final String getSendStatus() {
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

    public final String getUnsendStatus() {
        return this.unsendStatus;
    }

    public final List<HatchWidget> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.segments, AnonymousClass005.A0F(this.presentations, AnonymousClass005.A0F(this.widgets, (((AnonymousClass005.A0F(this.attachments, (((AnonymousClass005.A0I(this.unsendStatus, AnonymousClass005.A0I(this.sendStatus, C0KA.A01(C0KA.A01((((((((((((AnonymousClass005.A0F(this.citations, AnonymousClass005.A0F(this.reactions, (((((((((C60R.A00(this.timestamp, AnonymousClass005.A0I(this.content, AnonymousClass005.A0I(this.role, AnonymousClass001.A0G(this.id)))) + AnonymousClass006.A0D(this.seq)) * 31) + AnonymousClass006.A0D(this.rowId)) * 31) + AnonymousClass006.A0G(this.serverMessageId)) * 31) + AnonymousClass006.A0G(this.requestId)) * 31) + AnonymousClass006.A0G(this.thinking)) * 31)) + AnonymousClass006.A0G(this.channel)) * 31) + AnonymousClass006.A0G(this.turnKind)) * 31) + AnonymousClass006.A0G(this.executionTurnId)) * 31) + AnonymousClass006.A0G(this.milestoneType)) * 31) + AnonymousClass006.A0G(this.milestoneVideoPath)) * 31) + AnonymousClass006.A0G(this.milestoneVariant)) * 31, this.isSpokenSummary), this.isPending))) + AnonymousClass006.A0G(this.sendErrorMessage)) * 31) + AnonymousClass006.A0G(this.errorCategory)) * 31) + AnonymousClass006.A0D(this.transcript)) * 31) + C3cH.A02(this.replyAttribution)) * 31))), this.isSyntheticPresentationCarrier);
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

    public final HatchMessage toDomain() {
        Object objA0s;
        Object objA0s2;
        Object objA0s3;
        Object objA0s4;
        HatchSendErrorCategory hatchSendErrorCategory;
        String str = this.id;
        try {
            objA0s = HatchMessageRole.valueOf(this.role);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Object obj = HatchMessageRole.AGENT;
        if (objA0s instanceof C10571Hud) {
            objA0s = obj;
        }
        HatchMessageRole hatchMessageRole = (HatchMessageRole) objA0s;
        String str2 = this.content;
        long j = this.timestamp;
        Long l = this.seq;
        Long l2 = this.rowId;
        String str3 = this.serverMessageId;
        String str4 = this.requestId;
        String str5 = this.thinking;
        List<String> list = this.reactions;
        List<HatchCitation> list2 = this.citations;
        String str6 = this.channel;
        HatchMessageChannel hatchMessageChannelFromServerValue = str6 != null ? HatchMessageChannel.Companion.fromServerValue(str6) : null;
        String str7 = this.turnKind;
        String str8 = this.executionTurnId;
        String str9 = this.milestoneType;
        String str10 = this.milestoneVideoPath;
        String str11 = this.milestoneVariant;
        boolean z = this.isSpokenSummary;
        boolean z2 = this.isPending;
        try {
            objA0s2 = HatchMessageSendStatus.valueOf(this.sendStatus);
        } catch (Throwable th2) {
            objA0s2 = C3cG.A0s(th2);
        }
        HatchMessageSendStatus hatchMessageSendStatus = HatchMessageSendStatus.SENT;
        if (objA0s2 instanceof C10571Hud) {
            objA0s2 = hatchMessageSendStatus;
        }
        HatchMessageSendStatus hatchMessageSendStatus2 = (HatchMessageSendStatus) objA0s2;
        if (hatchMessageSendStatus2 == HatchMessageSendStatus.SENDING) {
            hatchMessageSendStatus2 = (this.seq == null && this.serverMessageId == null) ? HatchMessageSendStatus.FAILED : hatchMessageSendStatus;
        }
        try {
            objA0s3 = HatchMessageUnsendStatus.valueOf(this.unsendStatus);
        } catch (Throwable th3) {
            objA0s3 = C3cG.A0s(th3);
        }
        Object obj2 = HatchMessageUnsendStatus.NONE;
        if (objA0s3 instanceof C10571Hud) {
            objA0s3 = obj2;
        }
        HatchMessageUnsendStatus hatchMessageUnsendStatus = (HatchMessageUnsendStatus) objA0s3;
        if (hatchMessageUnsendStatus == HatchMessageUnsendStatus.UNSENDING) {
            hatchMessageUnsendStatus = HatchMessageUnsendStatus.DELETED;
        }
        String str12 = this.sendErrorMessage;
        String str13 = this.errorCategory;
        if (str13 != null) {
            try {
                objA0s4 = HatchSendErrorCategory.valueOf(str13);
            } catch (Throwable th4) {
                objA0s4 = C3cG.A0s(th4);
            }
            if (objA0s4 instanceof C10571Hud) {
                objA0s4 = null;
            }
            hatchSendErrorCategory = (HatchSendErrorCategory) objA0s4;
        } else {
            hatchSendErrorCategory = null;
        }
        List<HatchPersistedAttachmentJson> list3 = this.attachments;
        ArrayList arrayListA0m = AnonymousClass002.A0m(list3);
        Iterator<HatchPersistedAttachmentJson> it = list3.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(it.next().toDomain());
        }
        if (arrayListA0m.isEmpty()) {
            arrayListA0m = null;
        }
        HatchDeltaTranscript hatchDeltaTranscript = this.transcript;
        ReplyAttribution replyAttribution = this.replyAttribution;
        List<HatchWidget> list4 = this.widgets;
        if (list4.isEmpty()) {
            list4 = null;
        }
        List<HatchWidgetPresentation> list5 = this.presentations;
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list5);
        Iterator<HatchWidgetPresentation> it2 = list5.iterator();
        while (it2.hasNext()) {
            arrayListA0m2.add(HatchWidgetPresentation.copy$default(it2.next(), null, null, null, null, null, null, null, null, null, null, true, 1023, null));
        }
        if (arrayListA0m2.isEmpty()) {
            arrayListA0m2 = null;
        }
        List<HatchTextEntitySegment> list6 = this.segments;
        if (list6.isEmpty()) {
            list6 = null;
        }
        return new HatchMessage(str, hatchMessageRole, str2, j, arrayListA0m, str5, l2, l, str3, list, list2, hatchDeltaTranscript, hatchMessageChannelFromServerValue, str7, z, str8, replyAttribution, z2, str9, str10, str11, null, hatchMessageSendStatus2, hatchMessageUnsendStatus, str12, hatchSendErrorCategory, str4, list4, arrayListA0m2, this.isSyntheticPresentationCarrier, list6, null, false, null);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchPersistedMessageJson(int i, String str, String str2, String str3, long j, Long l, Long l2, String str4, String str5, String str6, List list, List list2, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, boolean z2, String str13, String str14, String str15, String str16, List list3, HatchDeltaTranscript hatchDeltaTranscript, ReplyAttribution replyAttribution, List list4, List list5, List list6, boolean z3, C2hx c2hx) {
        String str17 = str13;
        String str18 = str14;
        List list7 = list3;
        List list8 = list4;
        List list9 = list5;
        List list10 = list6;
        if (15 != (i & 15)) {
            C9iI.A00(HatchPersistedMessageJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.role = str2;
        this.content = str3;
        this.timestamp = j;
        if ((i & 16) == 0) {
            this.seq = null;
        } else {
            this.seq = l;
        }
        if ((i & 32) == 0) {
            this.rowId = null;
        } else {
            this.rowId = l2;
        }
        if ((i & 64) == 0) {
            this.serverMessageId = null;
        } else {
            this.serverMessageId = str4;
        }
        if ((i & 128) == 0) {
            this.requestId = null;
        } else {
            this.requestId = str5;
        }
        if ((i & 256) == 0) {
            this.thinking = null;
        } else {
            this.thinking = str6;
        }
        if ((i & 512) == 0) {
            this.reactions = C0881AGi.A00;
        } else {
            this.reactions = list;
        }
        if ((i & 1024) == 0) {
            this.citations = C0881AGi.A00;
        } else {
            this.citations = list2;
        }
        if ((i & 2048) == 0) {
            this.channel = null;
        } else {
            this.channel = str7;
        }
        if ((i & 4096) == 0) {
            this.turnKind = null;
        } else {
            this.turnKind = str8;
        }
        if ((i & 8192) == 0) {
            this.executionTurnId = null;
        } else {
            this.executionTurnId = str9;
        }
        if ((i & 16384) == 0) {
            this.milestoneType = null;
        } else {
            this.milestoneType = str10;
        }
        if ((32768 & i) == 0) {
            this.milestoneVideoPath = null;
        } else {
            this.milestoneVideoPath = str11;
        }
        if ((65536 & i) == 0) {
            this.milestoneVariant = null;
        } else {
            this.milestoneVariant = str12;
        }
        if ((131072 & i) == 0) {
            this.isSpokenSummary = false;
        } else {
            this.isSpokenSummary = z;
        }
        if ((262144 & i) == 0) {
            this.isPending = false;
        } else {
            this.isPending = z2;
        }
        this.sendStatus = (524288 & i) == 0 ? SEND_STATUS_SENT : str17;
        this.unsendStatus = (1048576 & i) == 0 ? UNSEND_STATUS_NONE : str18;
        if ((2097152 & i) == 0) {
            this.sendErrorMessage = null;
        } else {
            this.sendErrorMessage = str15;
        }
        if ((4194304 & i) == 0) {
            this.errorCategory = null;
        } else {
            this.errorCategory = str16;
        }
        this.attachments = (8388608 & i) == 0 ? C0881AGi.A00 : list7;
        if ((16777216 & i) == 0) {
            this.transcript = null;
        } else {
            this.transcript = hatchDeltaTranscript;
        }
        if ((33554432 & i) == 0) {
            this.replyAttribution = null;
        } else {
            this.replyAttribution = replyAttribution;
        }
        this.widgets = (67108864 & i) == 0 ? C0881AGi.A00 : list8;
        this.presentations = (134217728 & i) == 0 ? C0881AGi.A00 : list9;
        this.segments = (268435456 & i) == 0 ? C0881AGi.A00 : list10;
        if ((i & 536870912) == 0) {
            this.isSyntheticPresentationCarrier = false;
        } else {
            this.isSyntheticPresentationCarrier = z3;
        }
    }

    public final HatchPersistedMessageJson copy(String str, String str2, String str3, long j, Long l, Long l2, String str4, String str5, String str6, List<String> list, List<HatchCitation> list2, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, boolean z2, String str13, String str14, String str15, String str16, List<HatchPersistedAttachmentJson> list3, HatchDeltaTranscript hatchDeltaTranscript, ReplyAttribution replyAttribution, List<HatchWidget> list4, List<HatchWidgetPresentation> list5, List<HatchTextEntitySegment> list6, boolean z3) {
        AnonymousClass005.A0x(str, str2, str3);
        C3cH.A18(list, list2);
        C7384Etj.A0Y(str13, 19);
        C7384Etj.A0Y(str14, 20);
        C7384Etj.A0Y(list3, 23);
        C7384Etj.A0Y(list4, 26);
        C7384Etj.A0Y(list5, 27);
        C7384Etj.A0Y(list6, 28);
        return new HatchPersistedMessageJson(str, str2, str3, j, l, l2, str4, str5, str6, list, list2, str7, str8, str9, str10, str11, str12, z, z2, str13, str14, str15, str16, list3, hatchDeltaTranscript, replyAttribution, list4, list5, list6, z3);
    }

    public static /* synthetic */ HatchPersistedMessageJson copy$default(HatchPersistedMessageJson hatchPersistedMessageJson, String str, String str2, String str3, long j, Long l, Long l2, String str4, String str5, String str6, List list, List list2, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, boolean z2, String str13, String str14, String str15, String str16, List list3, HatchDeltaTranscript hatchDeltaTranscript, ReplyAttribution replyAttribution, List list4, List list5, List list6, boolean z3, int i, Object obj) {
        String str17 = str;
        String str18 = str2;
        String str19 = str3;
        long j2 = j;
        Long l3 = l;
        Long l4 = l2;
        String str20 = str4;
        String str21 = str5;
        String str22 = str6;
        List list7 = list;
        List list8 = list2;
        String str23 = str7;
        String str24 = str8;
        String str25 = str9;
        String str26 = str10;
        List list9 = list4;
        List list10 = list5;
        List list11 = list6;
        String str27 = str11;
        String str28 = str12;
        boolean z4 = z;
        boolean z5 = z2;
        String str29 = str13;
        String str30 = str14;
        String str31 = str15;
        String str32 = str16;
        List list12 = list3;
        HatchDeltaTranscript hatchDeltaTranscript2 = hatchDeltaTranscript;
        ReplyAttribution replyAttribution2 = replyAttribution;
        boolean z6 = z3;
        if ((i & 1) != 0) {
            str17 = hatchPersistedMessageJson.id;
        }
        if ((i & 2) != 0) {
            str18 = hatchPersistedMessageJson.role;
        }
        if ((i & 4) != 0) {
            str19 = hatchPersistedMessageJson.content;
        }
        if ((i & 8) != 0) {
            j2 = hatchPersistedMessageJson.timestamp;
        }
        if ((i & 16) != 0) {
            l3 = hatchPersistedMessageJson.seq;
        }
        if ((i & 32) != 0) {
            l4 = hatchPersistedMessageJson.rowId;
        }
        if ((i & 64) != 0) {
            str20 = hatchPersistedMessageJson.serverMessageId;
        }
        if ((i & 128) != 0) {
            str21 = hatchPersistedMessageJson.requestId;
        }
        if ((i & 256) != 0) {
            str22 = hatchPersistedMessageJson.thinking;
        }
        if ((i & 512) != 0) {
            list7 = hatchPersistedMessageJson.reactions;
        }
        if ((i & 1024) != 0) {
            list8 = hatchPersistedMessageJson.citations;
        }
        if ((i & 2048) != 0) {
            str23 = hatchPersistedMessageJson.channel;
        }
        if ((i & 4096) != 0) {
            str24 = hatchPersistedMessageJson.turnKind;
        }
        if ((i & 8192) != 0) {
            str25 = hatchPersistedMessageJson.executionTurnId;
        }
        if ((i & 16384) != 0) {
            str26 = hatchPersistedMessageJson.milestoneType;
        }
        if ((i & 32768) != 0) {
            str27 = hatchPersistedMessageJson.milestoneVideoPath;
        }
        if ((i & 65536) != 0) {
            str28 = hatchPersistedMessageJson.milestoneVariant;
        }
        if ((i & 131072) != 0) {
            z4 = hatchPersistedMessageJson.isSpokenSummary;
        }
        if ((i & 262144) != 0) {
            z5 = hatchPersistedMessageJson.isPending;
        }
        if ((i & 524288) != 0) {
            str29 = hatchPersistedMessageJson.sendStatus;
        }
        if ((i & 1048576) != 0) {
            str30 = hatchPersistedMessageJson.unsendStatus;
        }
        if ((i & 2097152) != 0) {
            str31 = hatchPersistedMessageJson.sendErrorMessage;
        }
        if ((i & 4194304) != 0) {
            str32 = hatchPersistedMessageJson.errorCategory;
        }
        if ((i & 8388608) != 0) {
            list12 = hatchPersistedMessageJson.attachments;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            hatchDeltaTranscript2 = hatchPersistedMessageJson.transcript;
        }
        if ((i & 33554432) != 0) {
            replyAttribution2 = hatchPersistedMessageJson.replyAttribution;
        }
        if ((i & 67108864) != 0) {
            list9 = hatchPersistedMessageJson.widgets;
        }
        if ((i & 134217728) != 0) {
            list10 = hatchPersistedMessageJson.presentations;
        }
        if ((i & 268435456) != 0) {
            list11 = hatchPersistedMessageJson.segments;
        }
        if ((i & 536870912) != 0) {
            z6 = hatchPersistedMessageJson.isSyntheticPresentationCarrier;
        }
        return hatchPersistedMessageJson.copy(str17, str18, str19, j2, l3, l4, str20, str21, str22, list7, list8, str23, str24, str25, str26, str27, str28, z4, z5, str29, str30, str31, str32, list12, hatchDeltaTranscript2, replyAttribution2, list9, list10, list11, z6);
    }

    public HatchPersistedMessageJson(String str, String str2, String str3, long j, Long l, Long l2, String str4, String str5, String str6, List<String> list, List<HatchCitation> list2, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, boolean z2, String str13, String str14, String str15, String str16, List<HatchPersistedAttachmentJson> list3, HatchDeltaTranscript hatchDeltaTranscript, ReplyAttribution replyAttribution, List<HatchWidget> list4, List<HatchWidgetPresentation> list5, List<HatchTextEntitySegment> list6, boolean z3) {
        AnonymousClass005.A0x(str, str2, str3);
        C3cH.A18(list, list2);
        C7384Etj.A0Y(str13, 19);
        C7384Etj.A0Y(str14, 20);
        C7384Etj.A0Y(list3, 23);
        C7384Etj.A0Y(list4, 26);
        C7384Etj.A0Y(list5, 27);
        C7384Etj.A0Y(list6, 28);
        this.id = str;
        this.role = str2;
        this.content = str3;
        this.timestamp = j;
        this.seq = l;
        this.rowId = l2;
        this.serverMessageId = str4;
        this.requestId = str5;
        this.thinking = str6;
        this.reactions = list;
        this.citations = list2;
        this.channel = str7;
        this.turnKind = str8;
        this.executionTurnId = str9;
        this.milestoneType = str10;
        this.milestoneVideoPath = str11;
        this.milestoneVariant = str12;
        this.isSpokenSummary = z;
        this.isPending = z2;
        this.sendStatus = str13;
        this.unsendStatus = str14;
        this.sendErrorMessage = str15;
        this.errorCategory = str16;
        this.attachments = list3;
        this.transcript = hatchDeltaTranscript;
        this.replyAttribution = replyAttribution;
        this.widgets = list4;
        this.presentations = list5;
        this.segments = list6;
        this.isSyntheticPresentationCarrier = z3;
    }

    public /* synthetic */ HatchPersistedMessageJson(String str, String str2, String str3, long j, Long l, Long l2, String str4, String str5, String str6, List list, List list2, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, boolean z2, String str13, String str14, String str15, String str16, List list3, HatchDeltaTranscript hatchDeltaTranscript, ReplyAttribution replyAttribution, List list4, List list5, List list6, boolean z3, int i, C06H c06h) {
        this(str, str2, str3, j, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? C0881AGi.A00 : list, (i & 1024) != 0 ? C0881AGi.A00 : list2, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : str8, (i & 8192) != 0 ? null : str9, (i & 16384) != 0 ? null : str10, (32768 & i) != 0 ? null : str11, (65536 & i) != 0 ? null : str12, C3cH.A1L(131072, i, z), C3cH.A1L(262144, i, z2), (524288 & i) != 0 ? SEND_STATUS_SENT : str13, (1048576 & i) != 0 ? UNSEND_STATUS_NONE : str14, (2097152 & i) != 0 ? null : str15, (4194304 & i) != 0 ? null : str16, (8388608 & i) != 0 ? C0881AGi.A00 : list3, (16777216 & i) != 0 ? null : hatchDeltaTranscript, (33554432 & i) != 0 ? null : replyAttribution, (67108864 & i) != 0 ? C0881AGi.A00 : list4, (134217728 & i) != 0 ? C0881AGi.A00 : list5, (268435456 & i) != 0 ? C0881AGi.A00 : list6, C3cH.A1L(i, 536870912, z3));
    }
}
