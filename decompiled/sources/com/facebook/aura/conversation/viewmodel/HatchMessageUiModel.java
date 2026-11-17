package com.facebook.aura.conversation.viewmodel;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BO6;
import X.C06G;
import X.C06H;
import X.C0953AJg;
import X.C0KA;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.analytics.hatch.HatchCitationAnalytics;
import com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityState;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.model.HatchContentViewModelData;
import com.facebook.aura.model.HatchMessageChannel;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.model.HatchMessageSendStatus;
import com.facebook.aura.model.HatchMessageUnsendStatus;
import com.facebook.aura.model.HatchSearchResultData;
import com.facebook.aura.model.HatchSendErrorCategory;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;

/* loaded from: classes.dex */
public final class HatchMessageUiModel extends C06G {
    public static final int $stable = ((HatchWidgetPresentation.$stable | HatchWidget.$stable) | HatchRenderSegment.$stable) | HatchSearchResultData.$stable;
    public final String analyticsMessageId;
    public final ReplyAttributionUiModel attribution;
    public final HatchMessageChannel channel;
    public final HatchCitationAnalytics citationAnalytics;
    public final AHD<HatchCitationUiModel> citations;
    public final String content;
    public final HatchSendErrorCategory errorCategory;
    public final String executionTurnId;
    public final BubbleGroupPosition groupPosition;
    public final String id;
    public final BO6<String, ContentItem> imageCopyTargets;
    public final ConversationInlineEntityState inlineEntityState;
    public final AHD<ContentItem> inlineMediaItems;
    public final boolean isAgent;
    public final boolean isFromHistory;
    public final boolean isPending;
    public final boolean isStreaming;
    public final boolean isStreamingUserMessage;
    public final boolean isValidSpokenSummary;
    public final boolean isWaitingForNetwork;
    public final BO6<String, ContentItem> mediaShareTargets;
    public final String messageId;
    public final AHD<HatchWidgetPresentation> presentations;
    public final String qplTurnId;
    public final String reactionTargetId;
    public final AHD<String> reactions;
    public final AHD<HatchRenderSegment> renderSegments;
    public final AHD<HatchContentViewModelData> richContent;
    public final HatchMessageRole role;
    public final HatchSearchResultData searchResultData;
    public final String sendErrorMessage;
    public final HatchMessageSendStatus sendStatus;
    public final String serverMessageId;
    public final String sessionId;
    public final ContentItem shareableMedia;
    public final String thinking;
    public final long timestamp;
    public final HatchMessageUnsendStatus unsendStatus;
    public final AHD<String> widgetTokenIds;
    public final AHD<HatchWidget> widgets;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchMessageUiModel) {
                HatchMessageUiModel hatchMessageUiModel = (HatchMessageUiModel) obj;
                if (!C7384Etj.areEqual(this.id, hatchMessageUiModel.id) || !C7384Etj.areEqual(this.serverMessageId, hatchMessageUiModel.serverMessageId) || !C7384Etj.areEqual(this.sessionId, hatchMessageUiModel.sessionId) || this.role != hatchMessageUiModel.role || !C7384Etj.areEqual(this.content, hatchMessageUiModel.content) || this.timestamp != hatchMessageUiModel.timestamp || this.isStreaming != hatchMessageUiModel.isStreaming || this.isStreamingUserMessage != hatchMessageUiModel.isStreamingUserMessage || !C7384Etj.areEqual(this.thinking, hatchMessageUiModel.thinking) || this.isFromHistory != hatchMessageUiModel.isFromHistory || !C7384Etj.areEqual(this.richContent, hatchMessageUiModel.richContent) || this.groupPosition != hatchMessageUiModel.groupPosition || !C7384Etj.areEqual(this.reactions, hatchMessageUiModel.reactions) || !C7384Etj.areEqual(this.citations, hatchMessageUiModel.citations) || !C7384Etj.areEqual(this.searchResultData, hatchMessageUiModel.searchResultData) || !C7384Etj.areEqual(this.citationAnalytics, hatchMessageUiModel.citationAnalytics) || !C7384Etj.areEqual(this.renderSegments, hatchMessageUiModel.renderSegments) || !C7384Etj.areEqual(this.widgetTokenIds, hatchMessageUiModel.widgetTokenIds) || this.channel != hatchMessageUiModel.channel || this.isValidSpokenSummary != hatchMessageUiModel.isValidSpokenSummary || !C7384Etj.areEqual(this.messageId, hatchMessageUiModel.messageId) || !C7384Etj.areEqual(this.analyticsMessageId, hatchMessageUiModel.analyticsMessageId) || !C7384Etj.areEqual(this.executionTurnId, hatchMessageUiModel.executionTurnId) || !C7384Etj.areEqual(this.attribution, hatchMessageUiModel.attribution) || this.isPending != hatchMessageUiModel.isPending || this.isWaitingForNetwork != hatchMessageUiModel.isWaitingForNetwork || !C7384Etj.areEqual(this.qplTurnId, hatchMessageUiModel.qplTurnId) || this.sendStatus != hatchMessageUiModel.sendStatus || this.unsendStatus != hatchMessageUiModel.unsendStatus || !C7384Etj.areEqual(this.sendErrorMessage, hatchMessageUiModel.sendErrorMessage) || this.errorCategory != hatchMessageUiModel.errorCategory || !C7384Etj.areEqual(this.widgets, hatchMessageUiModel.widgets) || !C7384Etj.areEqual(this.presentations, hatchMessageUiModel.presentations) || !C7384Etj.areEqual(this.inlineEntityState, hatchMessageUiModel.inlineEntityState) || !C7384Etj.areEqual(this.inlineMediaItems, hatchMessageUiModel.inlineMediaItems) || !C7384Etj.areEqual(this.shareableMedia, hatchMessageUiModel.shareableMedia) || !C7384Etj.areEqual(this.mediaShareTargets, hatchMessageUiModel.mediaShareTargets) || !C7384Etj.areEqual(this.imageCopyTargets, hatchMessageUiModel.imageCopyTargets) || !C7384Etj.areEqual(this.reactionTargetId, hatchMessageUiModel.reactionTargetId)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.isFromHistory;
    }

    public final AHD<HatchContentViewModelData> component11() {
        return this.richContent;
    }

    public final BubbleGroupPosition component12() {
        return this.groupPosition;
    }

    public final AHD<String> component13() {
        return this.reactions;
    }

    public final AHD<HatchCitationUiModel> component14() {
        return this.citations;
    }

    public final HatchSearchResultData component15() {
        return this.searchResultData;
    }

    public final HatchCitationAnalytics component16() {
        return this.citationAnalytics;
    }

    public final AHD<HatchRenderSegment> component17() {
        return this.renderSegments;
    }

    public final AHD<String> component18() {
        return this.widgetTokenIds;
    }

    public final HatchMessageChannel component19() {
        return this.channel;
    }

    public final String component2() {
        return this.serverMessageId;
    }

    public final boolean component20() {
        return this.isValidSpokenSummary;
    }

    public final String component21() {
        return this.messageId;
    }

    public final String component22() {
        return this.analyticsMessageId;
    }

    public final String component23() {
        return this.executionTurnId;
    }

    public final ReplyAttributionUiModel component24() {
        return this.attribution;
    }

    public final boolean component25() {
        return this.isPending;
    }

    public final boolean component26() {
        return this.isWaitingForNetwork;
    }

    public final String component27() {
        return this.qplTurnId;
    }

    public final HatchMessageSendStatus component28() {
        return this.sendStatus;
    }

    public final HatchMessageUnsendStatus component29() {
        return this.unsendStatus;
    }

    public final String component3() {
        return this.sessionId;
    }

    public final String component30() {
        return this.sendErrorMessage;
    }

    public final HatchSendErrorCategory component31() {
        return this.errorCategory;
    }

    public final AHD<HatchWidget> component32() {
        return this.widgets;
    }

    public final AHD<HatchWidgetPresentation> component33() {
        return this.presentations;
    }

    public final ConversationInlineEntityState component34() {
        return this.inlineEntityState;
    }

    public final AHD<ContentItem> component35() {
        return this.inlineMediaItems;
    }

    public final ContentItem component36() {
        return this.shareableMedia;
    }

    public final BO6<String, ContentItem> component37() {
        return this.mediaShareTargets;
    }

    public final BO6<String, ContentItem> component38() {
        return this.imageCopyTargets;
    }

    public final String component39() {
        return this.reactionTargetId;
    }

    public final HatchMessageRole component4() {
        return this.role;
    }

    public final String component5() {
        return this.content;
    }

    public final long component6() {
        return this.timestamp;
    }

    public final boolean component7() {
        return this.isStreaming;
    }

    public final boolean component8() {
        return this.isStreamingUserMessage;
    }

    public final String component9() {
        return this.thinking;
    }

    public final String getAnalyticsMessageId() {
        return this.analyticsMessageId;
    }

    public final ReplyAttributionUiModel getAttribution() {
        return this.attribution;
    }

    public final HatchMessageChannel getChannel() {
        return this.channel;
    }

    public final HatchCitationAnalytics getCitationAnalytics() {
        return this.citationAnalytics;
    }

    public final AHD<HatchCitationUiModel> getCitations() {
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

    public final BubbleGroupPosition getGroupPosition() {
        return this.groupPosition;
    }

    public final boolean getHasBubbleContent() {
        return (C7BY.A0j(this.content) && this.richContent == null && this.renderSegments == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getHasPresentations() {
        /*
            r1 = this;
            X.AHD<com.facebook.aura.model.HatchWidgetPresentation> r0 = r1.presentations
            if (r0 == 0) goto Lb
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto Lc
        Lb:
            r0 = 1
        Lc:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchMessageUiModel.getHasPresentations():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getHasWidgets() {
        /*
            r1 = this;
            X.AHD<com.facebook.aura.model.HatchWidget> r0 = r1.widgets
            if (r0 == 0) goto Lb
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto Lc
        Lb:
            r0 = 1
        Lc:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchMessageUiModel.getHasWidgets():boolean");
    }

    public final String getId() {
        return this.id;
    }

    public final BO6<String, ContentItem> getImageCopyTargets() {
        return this.imageCopyTargets;
    }

    public final ConversationInlineEntityState getInlineEntityState() {
        return this.inlineEntityState;
    }

    public final AHD<ContentItem> getInlineMediaItems() {
        return this.inlineMediaItems;
    }

    public final BO6<String, ContentItem> getMediaShareTargets() {
        return this.mediaShareTargets;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final AHD<HatchWidgetPresentation> getPresentations() {
        return this.presentations;
    }

    public final String getQplTurnId() {
        return this.qplTurnId;
    }

    public final String getReactionTargetId() {
        return this.reactionTargetId;
    }

    public final AHD<String> getReactions() {
        return this.reactions;
    }

    public final AHD<HatchRenderSegment> getRenderSegments() {
        return this.renderSegments;
    }

    public final AHD<HatchContentViewModelData> getRichContent() {
        return this.richContent;
    }

    public final HatchMessageRole getRole() {
        return this.role;
    }

    public final HatchSearchResultData getSearchResultData() {
        return this.searchResultData;
    }

    public final String getSendErrorMessage() {
        return this.sendErrorMessage;
    }

    public final HatchMessageSendStatus getSendStatus() {
        return this.sendStatus;
    }

    public final String getServerMessageId() {
        return this.serverMessageId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final ContentItem getShareableMedia() {
        return this.shareableMedia;
    }

    public final String getThinking() {
        return this.thinking;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final HatchMessageUnsendStatus getUnsendStatus() {
        return this.unsendStatus;
    }

    public final AHD<String> getWidgetTokenIds() {
        return this.widgetTokenIds;
    }

    public final AHD<HatchWidget> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.imageCopyTargets, AnonymousClass005.A0F(this.mediaShareTargets, (AnonymousClass005.A0F(this.inlineMediaItems, (((((((((AnonymousClass005.A0F(this.unsendStatus, AnonymousClass005.A0F(this.sendStatus, (C0KA.A01(C0KA.A01((((((((C0KA.A01((AnonymousClass005.A0F(this.widgetTokenIds, (((((AnonymousClass005.A0F(this.citations, AnonymousClass005.A0F(this.reactions, AnonymousClass005.A0F(this.groupPosition, (C0KA.A01((C0KA.A01(C0KA.A01(AnonymousClass006.A06(this.timestamp, AnonymousClass005.A0I(this.content, AnonymousClass005.A0F(this.role, (((AnonymousClass001.A0G(this.id) + AnonymousClass006.A0G(this.serverMessageId)) * 31) + AnonymousClass006.A0G(this.sessionId)) * 31))), this.isStreaming), this.isStreamingUserMessage) + AnonymousClass006.A0G(this.thinking)) * 31, this.isFromHistory) + AnonymousClass006.A0D(this.richContent)) * 31))) + AnonymousClass006.A0D(this.searchResultData)) * 31) + AnonymousClass006.A0D(this.citationAnalytics)) * 31) + AnonymousClass006.A0D(this.renderSegments)) * 31) + AnonymousClass006.A0D(this.channel)) * 31, this.isValidSpokenSummary) + AnonymousClass006.A0G(this.messageId)) * 31) + AnonymousClass006.A0G(this.analyticsMessageId)) * 31) + AnonymousClass006.A0G(this.executionTurnId)) * 31) + AnonymousClass006.A0D(this.attribution)) * 31, this.isPending), this.isWaitingForNetwork) + AnonymousClass006.A0G(this.qplTurnId)) * 31)) + AnonymousClass006.A0G(this.sendErrorMessage)) * 31) + AnonymousClass006.A0D(this.errorCategory)) * 31) + AnonymousClass006.A0D(this.widgets)) * 31) + AnonymousClass006.A0D(this.presentations)) * 31) + AnonymousClass006.A0D(this.inlineEntityState)) * 31) + AnonymousClass006.A0D(this.shareableMedia)) * 31)) + AnonymousClass005.A0H(this.reactionTargetId);
    }

    public final boolean isAgent() {
        return this.isAgent;
    }

    public final boolean isFromHistory() {
        return this.isFromHistory;
    }

    public final boolean isPending() {
        return this.isPending;
    }

    public final boolean isStreaming() {
        return this.isStreaming;
    }

    public final boolean isStreamingUserMessage() {
        return this.isStreamingUserMessage;
    }

    public final boolean isValidSpokenSummary() {
        return this.isValidSpokenSummary;
    }

    public final boolean isWaitingForNetwork() {
        return this.isWaitingForNetwork;
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageUiModel(String str, String str2, String str3, HatchMessageRole hatchMessageRole, String str4, long j, boolean z, boolean z2, String str5, boolean z3, AHD<? extends HatchContentViewModelData> ahd, BubbleGroupPosition bubbleGroupPosition, AHD<String> ahd2, AHD<HatchCitationUiModel> ahd3, HatchSearchResultData hatchSearchResultData, HatchCitationAnalytics hatchCitationAnalytics, AHD<? extends HatchRenderSegment> ahd4, AHD<String> ahd5, HatchMessageChannel hatchMessageChannel, boolean z4, String str6, String str7, String str8, ReplyAttributionUiModel replyAttributionUiModel, boolean z5, boolean z6, String str9, HatchMessageSendStatus hatchMessageSendStatus, HatchMessageUnsendStatus hatchMessageUnsendStatus, String str10, HatchSendErrorCategory hatchSendErrorCategory, AHD<HatchWidget> ahd6, AHD<HatchWidgetPresentation> ahd7, ConversationInlineEntityState conversationInlineEntityState, AHD<ContentItem> ahd8, ContentItem contentItem, BO6<String, ContentItem> bo6, BO6<String, ContentItem> bo62, String str11) {
        AnonymousClass005.A12(str, hatchMessageRole, str4, 0);
        C7384Etj.A0Y(bubbleGroupPosition, 11);
        AnonymousClass003.A11(ahd2, ahd3);
        C7384Etj.A0Y(ahd5, 17);
        C7384Etj.A0Y(hatchMessageSendStatus, 27);
        C7384Etj.A0Y(hatchMessageUnsendStatus, 28);
        C7384Etj.A0Y(ahd8, 34);
        C7384Etj.A0Y(bo6, 36);
        C7384Etj.A0Y(bo62, 37);
        this.id = str;
        this.serverMessageId = str2;
        this.sessionId = str3;
        this.role = hatchMessageRole;
        this.content = str4;
        this.timestamp = j;
        this.isStreaming = z;
        this.isStreamingUserMessage = z2;
        this.thinking = str5;
        this.isFromHistory = z3;
        this.richContent = ahd;
        this.groupPosition = bubbleGroupPosition;
        this.reactions = ahd2;
        this.citations = ahd3;
        this.searchResultData = hatchSearchResultData;
        this.citationAnalytics = hatchCitationAnalytics;
        this.renderSegments = ahd4;
        this.widgetTokenIds = ahd5;
        this.channel = hatchMessageChannel;
        this.isValidSpokenSummary = z4;
        this.messageId = str6;
        this.analyticsMessageId = str7;
        this.executionTurnId = str8;
        this.attribution = replyAttributionUiModel;
        this.isPending = z5;
        this.isWaitingForNetwork = z6;
        this.qplTurnId = str9;
        this.sendStatus = hatchMessageSendStatus;
        this.unsendStatus = hatchMessageUnsendStatus;
        this.sendErrorMessage = str10;
        this.errorCategory = hatchSendErrorCategory;
        this.widgets = ahd6;
        this.presentations = ahd7;
        this.inlineEntityState = conversationInlineEntityState;
        this.inlineMediaItems = ahd8;
        this.shareableMedia = contentItem;
        this.mediaShareTargets = bo6;
        this.imageCopyTargets = bo62;
        this.reactionTargetId = str11;
        this.isAgent = AnonymousClass002.A1Z(hatchMessageRole, HatchMessageRole.AGENT);
    }

    public final HatchMessageUiModel copy(String str, String str2, String str3, HatchMessageRole hatchMessageRole, String str4, long j, boolean z, boolean z2, String str5, boolean z3, AHD<? extends HatchContentViewModelData> ahd, BubbleGroupPosition bubbleGroupPosition, AHD<String> ahd2, AHD<HatchCitationUiModel> ahd3, HatchSearchResultData hatchSearchResultData, HatchCitationAnalytics hatchCitationAnalytics, AHD<? extends HatchRenderSegment> ahd4, AHD<String> ahd5, HatchMessageChannel hatchMessageChannel, boolean z4, String str6, String str7, String str8, ReplyAttributionUiModel replyAttributionUiModel, boolean z5, boolean z6, String str9, HatchMessageSendStatus hatchMessageSendStatus, HatchMessageUnsendStatus hatchMessageUnsendStatus, String str10, HatchSendErrorCategory hatchSendErrorCategory, AHD<HatchWidget> ahd6, AHD<HatchWidgetPresentation> ahd7, ConversationInlineEntityState conversationInlineEntityState, AHD<ContentItem> ahd8, ContentItem contentItem, BO6<String, ContentItem> bo6, BO6<String, ContentItem> bo62, String str11) {
        AnonymousClass005.A12(str, hatchMessageRole, str4, 0);
        C7384Etj.A0Y(bubbleGroupPosition, 11);
        AnonymousClass003.A11(ahd2, ahd3);
        C7384Etj.A0Y(ahd5, 17);
        C7384Etj.A0Y(hatchMessageSendStatus, 27);
        C7384Etj.A0Y(hatchMessageUnsendStatus, 28);
        C7384Etj.A0Y(ahd8, 34);
        C7384Etj.A0Y(bo6, 36);
        C7384Etj.A0Y(bo62, 37);
        return new HatchMessageUiModel(str, str2, str3, hatchMessageRole, str4, j, z, z2, str5, z3, ahd, bubbleGroupPosition, ahd2, ahd3, hatchSearchResultData, hatchCitationAnalytics, ahd4, ahd5, hatchMessageChannel, z4, str6, str7, str8, replyAttributionUiModel, z5, z6, str9, hatchMessageSendStatus, hatchMessageUnsendStatus, str10, hatchSendErrorCategory, ahd6, ahd7, conversationInlineEntityState, ahd8, contentItem, bo6, bo62, str11);
    }

    public static /* synthetic */ HatchMessageUiModel copy$default(HatchMessageUiModel hatchMessageUiModel, String str, String str2, String str3, HatchMessageRole hatchMessageRole, String str4, long j, boolean z, boolean z2, String str5, boolean z3, AHD ahd, BubbleGroupPosition bubbleGroupPosition, AHD ahd2, AHD ahd3, HatchSearchResultData hatchSearchResultData, HatchCitationAnalytics hatchCitationAnalytics, AHD ahd4, AHD ahd5, HatchMessageChannel hatchMessageChannel, boolean z4, String str6, String str7, String str8, ReplyAttributionUiModel replyAttributionUiModel, boolean z5, boolean z6, String str9, HatchMessageSendStatus hatchMessageSendStatus, HatchMessageUnsendStatus hatchMessageUnsendStatus, String str10, HatchSendErrorCategory hatchSendErrorCategory, AHD ahd6, AHD ahd7, ConversationInlineEntityState conversationInlineEntityState, AHD ahd8, ContentItem contentItem, BO6 bo6, BO6 bo62, String str11, int i, int i2, Object obj) {
        String str12 = str;
        String str13 = str2;
        String str14 = str3;
        HatchMessageRole hatchMessageRole2 = hatchMessageRole;
        String str15 = str4;
        long j2 = j;
        boolean z7 = z;
        boolean z8 = z2;
        String str16 = str5;
        boolean z9 = z3;
        AHD ahd9 = ahd;
        BubbleGroupPosition bubbleGroupPosition2 = bubbleGroupPosition;
        AHD ahd10 = ahd2;
        AHD ahd11 = ahd3;
        HatchSearchResultData hatchSearchResultData2 = hatchSearchResultData;
        boolean z10 = z4;
        boolean z11 = z5;
        boolean z12 = z6;
        ConversationInlineEntityState conversationInlineEntityState2 = conversationInlineEntityState;
        AHD ahd12 = ahd8;
        ContentItem contentItem2 = contentItem;
        BO6 bo63 = bo6;
        BO6 bo64 = bo62;
        HatchCitationAnalytics hatchCitationAnalytics2 = hatchCitationAnalytics;
        AHD ahd13 = ahd4;
        AHD ahd14 = ahd5;
        HatchMessageChannel hatchMessageChannel2 = hatchMessageChannel;
        String str17 = str6;
        String str18 = str7;
        String str19 = str8;
        ReplyAttributionUiModel replyAttributionUiModel2 = replyAttributionUiModel;
        String str20 = str9;
        HatchMessageSendStatus hatchMessageSendStatus2 = hatchMessageSendStatus;
        HatchMessageUnsendStatus hatchMessageUnsendStatus2 = hatchMessageUnsendStatus;
        String str21 = str10;
        HatchSendErrorCategory hatchSendErrorCategory2 = hatchSendErrorCategory;
        AHD ahd15 = ahd6;
        AHD ahd16 = ahd7;
        String str22 = str11;
        if ((i & 1) != 0) {
            str12 = hatchMessageUiModel.id;
        }
        if ((i & 2) != 0) {
            str13 = hatchMessageUiModel.serverMessageId;
        }
        if ((i & 4) != 0) {
            str14 = hatchMessageUiModel.sessionId;
        }
        if ((i & 8) != 0) {
            hatchMessageRole2 = hatchMessageUiModel.role;
        }
        if ((i & 16) != 0) {
            str15 = hatchMessageUiModel.content;
        }
        if ((i & 32) != 0) {
            j2 = hatchMessageUiModel.timestamp;
        }
        if ((i & 64) != 0) {
            z7 = hatchMessageUiModel.isStreaming;
        }
        if ((i & 128) != 0) {
            z8 = hatchMessageUiModel.isStreamingUserMessage;
        }
        if ((i & 256) != 0) {
            str16 = hatchMessageUiModel.thinking;
        }
        if ((i & 512) != 0) {
            z9 = hatchMessageUiModel.isFromHistory;
        }
        if ((i & 1024) != 0) {
            ahd9 = hatchMessageUiModel.richContent;
        }
        if ((i & 2048) != 0) {
            bubbleGroupPosition2 = hatchMessageUiModel.groupPosition;
        }
        if ((i & 4096) != 0) {
            ahd10 = hatchMessageUiModel.reactions;
        }
        if ((i & 8192) != 0) {
            ahd11 = hatchMessageUiModel.citations;
        }
        if ((i & 16384) != 0) {
            hatchSearchResultData2 = hatchMessageUiModel.searchResultData;
        }
        if ((i & 32768) != 0) {
            hatchCitationAnalytics2 = hatchMessageUiModel.citationAnalytics;
        }
        if ((i & 65536) != 0) {
            ahd13 = hatchMessageUiModel.renderSegments;
        }
        if ((i & 131072) != 0) {
            ahd14 = hatchMessageUiModel.widgetTokenIds;
        }
        if ((i & 262144) != 0) {
            hatchMessageChannel2 = hatchMessageUiModel.channel;
        }
        if ((i & 524288) != 0) {
            z10 = hatchMessageUiModel.isValidSpokenSummary;
        }
        if ((i & 1048576) != 0) {
            str17 = hatchMessageUiModel.messageId;
        }
        if ((i & 2097152) != 0) {
            str18 = hatchMessageUiModel.analyticsMessageId;
        }
        if ((i & 4194304) != 0) {
            str19 = hatchMessageUiModel.executionTurnId;
        }
        if ((i & 8388608) != 0) {
            replyAttributionUiModel2 = hatchMessageUiModel.attribution;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            z11 = hatchMessageUiModel.isPending;
        }
        if ((i & 33554432) != 0) {
            z12 = hatchMessageUiModel.isWaitingForNetwork;
        }
        if ((i & 67108864) != 0) {
            str20 = hatchMessageUiModel.qplTurnId;
        }
        if ((i & 134217728) != 0) {
            hatchMessageSendStatus2 = hatchMessageUiModel.sendStatus;
        }
        if ((i & 268435456) != 0) {
            hatchMessageUnsendStatus2 = hatchMessageUiModel.unsendStatus;
        }
        if ((i & 536870912) != 0) {
            str21 = hatchMessageUiModel.sendErrorMessage;
        }
        if ((i & 1073741824) != 0) {
            hatchSendErrorCategory2 = hatchMessageUiModel.errorCategory;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            ahd15 = hatchMessageUiModel.widgets;
        }
        if ((i2 & 1) != 0) {
            ahd16 = hatchMessageUiModel.presentations;
        }
        if ((i2 & 2) != 0) {
            conversationInlineEntityState2 = hatchMessageUiModel.inlineEntityState;
        }
        if ((i2 & 4) != 0) {
            ahd12 = hatchMessageUiModel.inlineMediaItems;
        }
        if ((i2 & 8) != 0) {
            contentItem2 = hatchMessageUiModel.shareableMedia;
        }
        if ((i2 & 16) != 0) {
            bo63 = hatchMessageUiModel.mediaShareTargets;
        }
        if ((i2 & 32) != 0) {
            bo64 = hatchMessageUiModel.imageCopyTargets;
        }
        if ((i2 & 64) != 0) {
            str22 = hatchMessageUiModel.reactionTargetId;
        }
        return hatchMessageUiModel.copy(str12, str13, str14, hatchMessageRole2, str15, j2, z7, z8, str16, z9, ahd9, bubbleGroupPosition2, ahd10, ahd11, hatchSearchResultData2, hatchCitationAnalytics2, ahd13, ahd14, hatchMessageChannel2, z10, str17, str18, str19, replyAttributionUiModel2, z11, z12, str20, hatchMessageSendStatus2, hatchMessageUnsendStatus2, str21, hatchSendErrorCategory2, ahd15, ahd16, conversationInlineEntityState2, ahd12, contentItem2, bo63, bo64, str22);
    }

    public /* synthetic */ HatchMessageUiModel(String str, String str2, String str3, HatchMessageRole hatchMessageRole, String str4, long j, boolean z, boolean z2, String str5, boolean z3, AHD ahd, BubbleGroupPosition bubbleGroupPosition, AHD ahd2, AHD ahd3, HatchSearchResultData hatchSearchResultData, HatchCitationAnalytics hatchCitationAnalytics, AHD ahd4, AHD ahd5, HatchMessageChannel hatchMessageChannel, boolean z4, String str6, String str7, String str8, ReplyAttributionUiModel replyAttributionUiModel, boolean z5, boolean z6, String str9, HatchMessageSendStatus hatchMessageSendStatus, HatchMessageUnsendStatus hatchMessageUnsendStatus, String str10, HatchSendErrorCategory hatchSendErrorCategory, AHD ahd6, AHD ahd7, ConversationInlineEntityState conversationInlineEntityState, AHD ahd8, ContentItem contentItem, BO6 bo6, BO6 bo62, String str11, int i, int i2, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, hatchMessageRole, str4, j, z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? null : ahd, (i & 2048) != 0 ? BubbleGroupPosition.STANDALONE : bubbleGroupPosition, (i & 4096) != 0 ? AHI.A01 : ahd2, (i & 8192) != 0 ? AHI.A01 : ahd3, (i & 16384) != 0 ? null : hatchSearchResultData, (32768 & i) != 0 ? null : hatchCitationAnalytics, (65536 & i) != 0 ? null : ahd4, (131072 & i) != 0 ? AHI.A01 : ahd5, (262144 & i) != 0 ? null : hatchMessageChannel, C06G.A0o(524288, i, z4), (1048576 & i) != 0 ? null : str6, (2097152 & i) != 0 ? null : str7, (4194304 & i) != 0 ? null : str8, (8388608 & i) != 0 ? null : replyAttributionUiModel, C06G.A0o(HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES, i, z5), C06G.A0o(33554432, i, z6), (67108864 & i) != 0 ? null : str9, (134217728 & i) != 0 ? HatchMessageSendStatus.SENT : hatchMessageSendStatus, (268435456 & i) != 0 ? HatchMessageUnsendStatus.NONE : hatchMessageUnsendStatus, (536870912 & i) != 0 ? null : str10, (1073741824 & i) != 0 ? null : hatchSendErrorCategory, (i & Integer.MIN_VALUE) != 0 ? null : ahd6, (i2 & 1) != 0 ? null : ahd7, (i2 & 2) != 0 ? null : conversationInlineEntityState, (i2 & 4) != 0 ? AHI.A01 : ahd8, (i2 & 8) != 0 ? null : contentItem, (i2 & 16) != 0 ? C0953AJg.A00() : bo6, (i2 & 32) != 0 ? C0953AJg.A00() : bo62, (i2 & 64) != 0 ? null : str11);
    }
}
