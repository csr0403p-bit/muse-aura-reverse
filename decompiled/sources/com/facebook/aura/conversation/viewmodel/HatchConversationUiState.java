package com.facebook.aura.conversation.viewmodel;

import X.AHD;
import X.AHI;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BQI;
import X.C06G;
import X.C06H;
import X.C0943AIw;
import X.C0KA;
import X.C7384Etj;
import android.graphics.Bitmap;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchCitationAnalytics;
import com.facebook.aura.conversation.api.ComposerLaunchAction;
import com.facebook.aura.conversation.repo.HistoryLoadingState;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.identity.provider.HatchConversationTheme;
import com.facebook.aura.model.HatchSearchResultData;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import com.facebook.aura.uicontrol.UiSuggestion;

/* loaded from: classes.dex */
public final class HatchConversationUiState extends C06G {
    public static final int $stable = 8;
    public final boolean canStartLiveSession;
    public final int composerHintResId;
    public final ComposerLaunchAction composerLaunchRequest;
    public final HatchGatewayConnectionState connectionState;
    public final HatchConversationTheme conversationTheme;
    public final BQI<String> failedUploadUris;
    public final boolean hasHistory;
    public final boolean hasMoreHistory;
    public final int highlightedMessageIndex;
    public final HistoryLoadingState historyLoadingState;
    public final boolean isArchived;
    public final boolean isAwaitingApproval;
    public final boolean isAwaitingFirstResponse;
    public final boolean isAwaitingResponse;
    public final boolean isCancelableActivity;
    public final boolean isInputBlocked;
    public final boolean isNewThreadWithoutHistory;
    public final boolean isPokePending;
    public final boolean isPokeRateLimited;
    public final boolean isSendEnabled;
    public final boolean islandLoading;
    public final AHD<String> linkAttachmentUrls;
    public final MessageContext messageContext;
    public final boolean offlineSeedAttempted;
    public final Long oldestHistorySeq;
    public final Bitmap pendingDiscussionItemPreview;
    public final HatchPendingFileAction pendingFileAction;
    public final AHD<String> pendingFileUris;
    public final AHD<String> pendingImageUris;
    public final UiSuggestion pendingSuggestion;
    public final ReplyContext replyContext;
    public final boolean shouldFocusComposer;
    public final HatchCitationAnalytics sourcesBottomSheetAnalytics;
    public final HatchSearchResultData sourcesBottomSheetData;
    public final BQI<String> uploadingFileUris;

    public final HatchConversationUiState copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, HatchGatewayConnectionState hatchGatewayConnectionState, boolean z7, AHD<String> ahd, AHD<String> ahd2, BQI<String> bqi, BQI<String> bqi2, AHD<String> ahd3, HistoryLoadingState historyLoadingState, boolean z8, boolean z9, boolean z10, Long l, Bitmap bitmap, ReplyContext replyContext, MessageContext messageContext, UiSuggestion uiSuggestion, HatchConversationTheme hatchConversationTheme, HatchSearchResultData hatchSearchResultData, HatchCitationAnalytics hatchCitationAnalytics, boolean z11, int i2, boolean z12, boolean z13, boolean z14, boolean z15, ComposerLaunchAction composerLaunchAction, HatchPendingFileAction hatchPendingFileAction, boolean z16) {
        AnonymousClass002.A1F(hatchGatewayConnectionState, 7, ahd);
        AnonymousClass005.A18(ahd2, bqi, bqi2, ahd3, historyLoadingState);
        C7384Etj.A0Y(hatchConversationTheme, 23);
        return new HatchConversationUiState(z, z2, z3, z4, z5, z6, i, hatchGatewayConnectionState, z7, ahd, ahd2, bqi, bqi2, ahd3, historyLoadingState, z8, z9, z10, l, bitmap, replyContext, messageContext, uiSuggestion, hatchConversationTheme, hatchSearchResultData, hatchCitationAnalytics, z11, i2, z12, z13, z14, z15, composerLaunchAction, hatchPendingFileAction, z16);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchConversationUiState) {
                HatchConversationUiState hatchConversationUiState = (HatchConversationUiState) obj;
                if (this.hasHistory != hatchConversationUiState.hasHistory || this.isAwaitingResponse != hatchConversationUiState.isAwaitingResponse || this.isAwaitingFirstResponse != hatchConversationUiState.isAwaitingFirstResponse || this.isCancelableActivity != hatchConversationUiState.isCancelableActivity || this.isSendEnabled != hatchConversationUiState.isSendEnabled || this.isAwaitingApproval != hatchConversationUiState.isAwaitingApproval || this.composerHintResId != hatchConversationUiState.composerHintResId || !C7384Etj.areEqual(this.connectionState, hatchConversationUiState.connectionState) || this.canStartLiveSession != hatchConversationUiState.canStartLiveSession || !C7384Etj.areEqual(this.pendingImageUris, hatchConversationUiState.pendingImageUris) || !C7384Etj.areEqual(this.pendingFileUris, hatchConversationUiState.pendingFileUris) || !C7384Etj.areEqual(this.uploadingFileUris, hatchConversationUiState.uploadingFileUris) || !C7384Etj.areEqual(this.failedUploadUris, hatchConversationUiState.failedUploadUris) || !C7384Etj.areEqual(this.linkAttachmentUrls, hatchConversationUiState.linkAttachmentUrls) || this.historyLoadingState != hatchConversationUiState.historyLoadingState || this.offlineSeedAttempted != hatchConversationUiState.offlineSeedAttempted || this.isNewThreadWithoutHistory != hatchConversationUiState.isNewThreadWithoutHistory || this.hasMoreHistory != hatchConversationUiState.hasMoreHistory || !C7384Etj.areEqual(this.oldestHistorySeq, hatchConversationUiState.oldestHistorySeq) || !C7384Etj.areEqual(this.pendingDiscussionItemPreview, hatchConversationUiState.pendingDiscussionItemPreview) || !C7384Etj.areEqual(this.replyContext, hatchConversationUiState.replyContext) || !C7384Etj.areEqual(this.messageContext, hatchConversationUiState.messageContext) || !C7384Etj.areEqual(this.pendingSuggestion, hatchConversationUiState.pendingSuggestion) || !C7384Etj.areEqual(this.conversationTheme, hatchConversationUiState.conversationTheme) || !C7384Etj.areEqual(this.sourcesBottomSheetData, hatchConversationUiState.sourcesBottomSheetData) || !C7384Etj.areEqual(this.sourcesBottomSheetAnalytics, hatchConversationUiState.sourcesBottomSheetAnalytics) || this.islandLoading != hatchConversationUiState.islandLoading || this.highlightedMessageIndex != hatchConversationUiState.highlightedMessageIndex || this.isPokePending != hatchConversationUiState.isPokePending || this.isPokeRateLimited != hatchConversationUiState.isPokeRateLimited || this.isArchived != hatchConversationUiState.isArchived || this.shouldFocusComposer != hatchConversationUiState.shouldFocusComposer || this.composerLaunchRequest != hatchConversationUiState.composerLaunchRequest || !C7384Etj.areEqual(this.pendingFileAction, hatchConversationUiState.pendingFileAction) || this.isInputBlocked != hatchConversationUiState.isInputBlocked) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationUiState() {
        boolean z = false;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        this(z, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, null, objArr24, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr25, objArr26, objArr27, objArr7, objArr8, objArr9, objArr10, objArr11, objArr12, objArr13, objArr14, objArr28, objArr29, objArr30, objArr31, objArr32, objArr33, objArr15, objArr16, objArr34, -1, 7, objArr17);
    }

    public final boolean component1() {
        return this.hasHistory;
    }

    public final AHD<String> component10() {
        return this.pendingImageUris;
    }

    public final AHD<String> component11() {
        return this.pendingFileUris;
    }

    public final BQI<String> component12() {
        return this.uploadingFileUris;
    }

    public final BQI<String> component13() {
        return this.failedUploadUris;
    }

    public final AHD<String> component14() {
        return this.linkAttachmentUrls;
    }

    public final HistoryLoadingState component15() {
        return this.historyLoadingState;
    }

    public final boolean component16() {
        return this.offlineSeedAttempted;
    }

    public final boolean component17() {
        return this.isNewThreadWithoutHistory;
    }

    public final boolean component18() {
        return this.hasMoreHistory;
    }

    public final Long component19() {
        return this.oldestHistorySeq;
    }

    public final boolean component2() {
        return this.isAwaitingResponse;
    }

    public final Bitmap component20() {
        return this.pendingDiscussionItemPreview;
    }

    public final ReplyContext component21() {
        return this.replyContext;
    }

    public final MessageContext component22() {
        return this.messageContext;
    }

    public final UiSuggestion component23() {
        return this.pendingSuggestion;
    }

    public final HatchConversationTheme component24() {
        return this.conversationTheme;
    }

    public final HatchSearchResultData component25() {
        return this.sourcesBottomSheetData;
    }

    public final HatchCitationAnalytics component26() {
        return this.sourcesBottomSheetAnalytics;
    }

    public final boolean component27() {
        return this.islandLoading;
    }

    public final int component28() {
        return this.highlightedMessageIndex;
    }

    public final boolean component29() {
        return this.isPokePending;
    }

    public final boolean component3() {
        return this.isAwaitingFirstResponse;
    }

    public final boolean component30() {
        return this.isPokeRateLimited;
    }

    public final boolean component31() {
        return this.isArchived;
    }

    public final boolean component32() {
        return this.shouldFocusComposer;
    }

    public final ComposerLaunchAction component33() {
        return this.composerLaunchRequest;
    }

    public final HatchPendingFileAction component34() {
        return this.pendingFileAction;
    }

    public final boolean component35() {
        return this.isInputBlocked;
    }

    public final boolean component4() {
        return this.isCancelableActivity;
    }

    public final boolean component5() {
        return this.isSendEnabled;
    }

    public final boolean component6() {
        return this.isAwaitingApproval;
    }

    public final int component7() {
        return this.composerHintResId;
    }

    public final HatchGatewayConnectionState component8() {
        return this.connectionState;
    }

    public final boolean component9() {
        return this.canStartLiveSession;
    }

    public final boolean getCanStartLiveSession() {
        return this.canStartLiveSession;
    }

    public final int getComposerHintResId() {
        return this.composerHintResId;
    }

    public final ComposerLaunchAction getComposerLaunchRequest() {
        return this.composerLaunchRequest;
    }

    public final HatchGatewayConnectionState getConnectionState() {
        return this.connectionState;
    }

    public final HatchConversationTheme getConversationTheme() {
        return this.conversationTheme;
    }

    public final BQI<String> getFailedUploadUris() {
        return this.failedUploadUris;
    }

    public final boolean getHasAttachments() {
        return (this.pendingImageUris.isEmpty() && this.pendingFileUris.isEmpty() && this.linkAttachmentUrls.isEmpty() && this.pendingDiscussionItemPreview == null) ? false : true;
    }

    public final boolean getHasHistory() {
        return this.hasHistory;
    }

    public final boolean getHasMoreHistory() {
        return this.hasMoreHistory;
    }

    public final int getHighlightedMessageIndex() {
        return this.highlightedMessageIndex;
    }

    public final HistoryLoadingState getHistoryLoadingState() {
        return this.historyLoadingState;
    }

    public final boolean getIslandLoading() {
        return this.islandLoading;
    }

    public final AHD<String> getLinkAttachmentUrls() {
        return this.linkAttachmentUrls;
    }

    public final MessageContext getMessageContext() {
        return this.messageContext;
    }

    public final boolean getOfflineSeedAttempted() {
        return this.offlineSeedAttempted;
    }

    public final Long getOldestHistorySeq() {
        return this.oldestHistorySeq;
    }

    public final Bitmap getPendingDiscussionItemPreview() {
        return this.pendingDiscussionItemPreview;
    }

    public final HatchPendingFileAction getPendingFileAction() {
        return this.pendingFileAction;
    }

    public final AHD<String> getPendingFileUris() {
        return this.pendingFileUris;
    }

    public final AHD<String> getPendingImageUris() {
        return this.pendingImageUris;
    }

    public final UiSuggestion getPendingSuggestion() {
        return this.pendingSuggestion;
    }

    public final ReplyContext getReplyContext() {
        return this.replyContext;
    }

    public final boolean getShouldFocusComposer() {
        return this.shouldFocusComposer;
    }

    public final HatchCitationAnalytics getSourcesBottomSheetAnalytics() {
        return this.sourcesBottomSheetAnalytics;
    }

    public final HatchSearchResultData getSourcesBottomSheetData() {
        return this.sourcesBottomSheetData;
    }

    public final BQI<String> getUploadingFileUris() {
        return this.uploadingFileUris;
    }

    public int hashCode() {
        return C0KA.A00((((C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01((C0KA.A01((((AnonymousClass005.A0F(this.conversationTheme, (((((((((C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.historyLoadingState, AnonymousClass005.A0F(this.linkAttachmentUrls, AnonymousClass005.A0F(this.failedUploadUris, AnonymousClass005.A0F(this.uploadingFileUris, AnonymousClass005.A0F(this.pendingFileUris, AnonymousClass005.A0F(this.pendingImageUris, C0KA.A01(AnonymousClass005.A0F(this.connectionState, (C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A02(this.hasHistory), this.isAwaitingResponse), this.isAwaitingFirstResponse), this.isCancelableActivity), this.isSendEnabled), this.isAwaitingApproval) + this.composerHintResId) * 31), this.canStartLiveSession))))))), this.offlineSeedAttempted), this.isNewThreadWithoutHistory), this.hasMoreHistory) + AnonymousClass006.A0D(this.oldestHistorySeq)) * 31) + AnonymousClass006.A0D(this.pendingDiscussionItemPreview)) * 31) + AnonymousClass006.A0D(this.replyContext)) * 31) + AnonymousClass006.A0D(this.messageContext)) * 31) + AnonymousClass006.A0D(this.pendingSuggestion)) * 31) + AnonymousClass006.A0D(this.sourcesBottomSheetData)) * 31) + AnonymousClass006.A0D(this.sourcesBottomSheetAnalytics)) * 31, this.islandLoading) + this.highlightedMessageIndex) * 31, this.isPokePending), this.isPokeRateLimited), this.isArchived), this.shouldFocusComposer) + AnonymousClass006.A0D(this.composerLaunchRequest)) * 31) + C06G.A04(this.pendingFileAction)) * 31, this.isInputBlocked);
    }

    public final boolean isArchived() {
        return this.isArchived;
    }

    public final boolean isAwaitingApproval() {
        return this.isAwaitingApproval;
    }

    public final boolean isAwaitingFirstResponse() {
        return this.isAwaitingFirstResponse;
    }

    public final boolean isAwaitingResponse() {
        return this.isAwaitingResponse;
    }

    public final boolean isCancelableActivity() {
        return this.isCancelableActivity;
    }

    public final boolean isInputBlocked() {
        return this.isInputBlocked;
    }

    public final boolean isNewThreadWithoutHistory() {
        return this.isNewThreadWithoutHistory;
    }

    public final boolean isPokePending() {
        return this.isPokePending;
    }

    public final boolean isPokeRateLimited() {
        return this.isPokeRateLimited;
    }

    public final boolean isSendEnabled() {
        return this.isSendEnabled;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ HatchConversationUiState copy$default(HatchConversationUiState hatchConversationUiState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, HatchGatewayConnectionState hatchGatewayConnectionState, boolean z7, AHD ahd, AHD ahd2, BQI bqi, BQI bqi2, AHD ahd3, HistoryLoadingState historyLoadingState, boolean z8, boolean z9, boolean z10, Long l, Bitmap bitmap, ReplyContext replyContext, MessageContext messageContext, UiSuggestion uiSuggestion, HatchConversationTheme hatchConversationTheme, HatchSearchResultData hatchSearchResultData, HatchCitationAnalytics hatchCitationAnalytics, boolean z11, int i2, boolean z12, boolean z13, boolean z14, boolean z15, ComposerLaunchAction composerLaunchAction, HatchPendingFileAction hatchPendingFileAction, boolean z16, int i3, int i4, Object obj) {
        boolean z17 = z;
        boolean z18 = z2;
        boolean z19 = z3;
        boolean z20 = z4;
        boolean z21 = z5;
        boolean z22 = z6;
        int i5 = i;
        HatchGatewayConnectionState hatchGatewayConnectionState2 = hatchGatewayConnectionState;
        boolean z23 = z7;
        AHD ahd4 = ahd;
        AHD ahd5 = ahd2;
        BQI bqi3 = bqi;
        BQI bqi4 = bqi2;
        AHD ahd6 = ahd3;
        HistoryLoadingState historyLoadingState2 = historyLoadingState;
        boolean z24 = z8;
        HatchConversationTheme hatchConversationTheme2 = hatchConversationTheme;
        HatchSearchResultData hatchSearchResultData2 = hatchSearchResultData;
        HatchCitationAnalytics hatchCitationAnalytics2 = hatchCitationAnalytics;
        boolean z25 = z12;
        boolean z26 = z13;
        boolean z27 = z14;
        boolean z28 = z15;
        ComposerLaunchAction composerLaunchAction2 = composerLaunchAction;
        HatchPendingFileAction hatchPendingFileAction2 = hatchPendingFileAction;
        boolean z29 = z9;
        boolean z30 = z10;
        Long l2 = l;
        Bitmap bitmap2 = bitmap;
        ReplyContext replyContext2 = replyContext;
        MessageContext messageContext2 = messageContext;
        UiSuggestion uiSuggestion2 = uiSuggestion;
        boolean z31 = z11;
        int i6 = i2;
        boolean z32 = z16;
        if ((i3 & 1) != 0) {
            z17 = hatchConversationUiState.hasHistory;
        }
        if ((i3 & 2) != 0) {
            z18 = hatchConversationUiState.isAwaitingResponse;
        }
        if ((i3 & 4) != 0) {
            z19 = hatchConversationUiState.isAwaitingFirstResponse;
        }
        if ((i3 & 8) != 0) {
            z20 = hatchConversationUiState.isCancelableActivity;
        }
        if ((i3 & 16) != 0) {
            z21 = hatchConversationUiState.isSendEnabled;
        }
        if ((i3 & 32) != 0) {
            z22 = hatchConversationUiState.isAwaitingApproval;
        }
        if ((i3 & 64) != 0) {
            i5 = hatchConversationUiState.composerHintResId;
        }
        if ((i3 & 128) != 0) {
            hatchGatewayConnectionState2 = hatchConversationUiState.connectionState;
        }
        if ((i3 & 256) != 0) {
            z23 = hatchConversationUiState.canStartLiveSession;
        }
        if ((i3 & 512) != 0) {
            ahd4 = hatchConversationUiState.pendingImageUris;
        }
        if ((i3 & 1024) != 0) {
            ahd5 = hatchConversationUiState.pendingFileUris;
        }
        if ((i3 & 2048) != 0) {
            bqi3 = hatchConversationUiState.uploadingFileUris;
        }
        if ((i3 & 4096) != 0) {
            bqi4 = hatchConversationUiState.failedUploadUris;
        }
        if ((i3 & 8192) != 0) {
            ahd6 = hatchConversationUiState.linkAttachmentUrls;
        }
        if ((i3 & 16384) != 0) {
            historyLoadingState2 = hatchConversationUiState.historyLoadingState;
        }
        if ((i3 & 32768) != 0) {
            z24 = hatchConversationUiState.offlineSeedAttempted;
        }
        if ((i3 & 65536) != 0) {
            z29 = hatchConversationUiState.isNewThreadWithoutHistory;
        }
        if ((i3 & 131072) != 0) {
            z30 = hatchConversationUiState.hasMoreHistory;
        }
        if ((i3 & 262144) != 0) {
            l2 = hatchConversationUiState.oldestHistorySeq;
        }
        if ((i3 & 524288) != 0) {
            bitmap2 = hatchConversationUiState.pendingDiscussionItemPreview;
        }
        if ((i3 & 1048576) != 0) {
            replyContext2 = hatchConversationUiState.replyContext;
        }
        if ((i3 & 2097152) != 0) {
            messageContext2 = hatchConversationUiState.messageContext;
        }
        if ((i3 & 4194304) != 0) {
            uiSuggestion2 = hatchConversationUiState.pendingSuggestion;
        }
        if ((i3 & 8388608) != 0) {
            hatchConversationTheme2 = hatchConversationUiState.conversationTheme;
        }
        if ((i3 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            hatchSearchResultData2 = hatchConversationUiState.sourcesBottomSheetData;
        }
        if ((i3 & 33554432) != 0) {
            hatchCitationAnalytics2 = hatchConversationUiState.sourcesBottomSheetAnalytics;
        }
        if ((i3 & 67108864) != 0) {
            z31 = hatchConversationUiState.islandLoading;
        }
        if ((i3 & 134217728) != 0) {
            i6 = hatchConversationUiState.highlightedMessageIndex;
        }
        if ((i3 & 268435456) != 0) {
            z25 = hatchConversationUiState.isPokePending;
        }
        if ((i3 & 536870912) != 0) {
            z26 = hatchConversationUiState.isPokeRateLimited;
        }
        if ((i3 & 1073741824) != 0) {
            z27 = hatchConversationUiState.isArchived;
        }
        if ((i3 & Integer.MIN_VALUE) != 0) {
            z28 = hatchConversationUiState.shouldFocusComposer;
        }
        if ((i4 & 1) != 0) {
            composerLaunchAction2 = hatchConversationUiState.composerLaunchRequest;
        }
        if ((i4 & 2) != 0) {
            hatchPendingFileAction2 = hatchConversationUiState.pendingFileAction;
        }
        if ((i4 & 4) != 0) {
            z32 = hatchConversationUiState.isInputBlocked;
        }
        return hatchConversationUiState.copy(z17, z18, z19, z20, z21, z22, i5, hatchGatewayConnectionState2, z23, ahd4, ahd5, bqi3, bqi4, ahd6, historyLoadingState2, z24, z29, z30, l2, bitmap2, replyContext2, messageContext2, uiSuggestion2, hatchConversationTheme2, hatchSearchResultData2, hatchCitationAnalytics2, z31, i6, z25, z26, z27, z28, composerLaunchAction2, hatchPendingFileAction2, z32);
    }

    public /* synthetic */ HatchConversationUiState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, HatchGatewayConnectionState hatchGatewayConnectionState, boolean z7, AHD ahd, AHD ahd2, BQI bqi, BQI bqi2, AHD ahd3, HistoryLoadingState historyLoadingState, boolean z8, boolean z9, boolean z10, Long l, Bitmap bitmap, ReplyContext replyContext, MessageContext messageContext, UiSuggestion uiSuggestion, HatchConversationTheme hatchConversationTheme, HatchSearchResultData hatchSearchResultData, HatchCitationAnalytics hatchCitationAnalytics, boolean z11, int i2, boolean z12, boolean z13, boolean z14, boolean z15, ComposerLaunchAction composerLaunchAction, HatchPendingFileAction hatchPendingFileAction, boolean z16, int i3, int i4, C06H c06h) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? false : z3, (i3 & 8) != 0 ? false : z4, (i3 & 16) != 0 ? false : z5, AnonymousClass002.A1R(i3, z6), (i3 & 64) != 0 ? R.string.composer_hint : i, (i3 & 128) != 0 ? new HatchGatewayConnectionState.Disconnected(HatchGatewayConnectionState.Reason.NONE) : hatchGatewayConnectionState, (i3 & 256) != 0 ? false : z7, (i3 & 512) != 0 ? AHI.A01 : ahd, (i3 & 1024) != 0 ? AHI.A01 : ahd2, (i3 & 2048) != 0 ? C0943AIw.A03 : bqi, (i3 & 4096) != 0 ? C0943AIw.A03 : bqi2, (i3 & 8192) != 0 ? AHI.A01 : ahd3, (i3 & 16384) != 0 ? HistoryLoadingState.INITIAL : historyLoadingState, C06G.A0o(i3, 32768, z8), C06G.A0o(i3, 65536, z9), C06G.A0o(i3, 131072, z10), (i3 & 262144) != 0 ? null : l, (i3 & 524288) != 0 ? null : bitmap, (i3 & 1048576) != 0 ? null : replyContext, (i3 & 2097152) != 0 ? null : messageContext, (i3 & 4194304) != 0 ? null : uiSuggestion, (i3 & 8388608) != 0 ? HatchConversationTheme.DEFAULT : hatchConversationTheme, (i3 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0 ? null : hatchSearchResultData, (i3 & 33554432) != 0 ? null : hatchCitationAnalytics, C06G.A0o(i3, 67108864, z11), (i3 & 134217728) != 0 ? -1 : i2, C06G.A0o(i3, 268435456, z12), C06G.A0o(i3, 536870912, z13), C06G.A0o(i3, 1073741824, z14), C06G.A0o(i3, Integer.MIN_VALUE, z15), (i4 & 1) != 0 ? null : composerLaunchAction, (i4 & 2) != 0 ? null : hatchPendingFileAction, (i4 & 4) != 0 ? false : z16);
    }

    public HatchConversationUiState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, HatchGatewayConnectionState hatchGatewayConnectionState, boolean z7, AHD<String> ahd, AHD<String> ahd2, BQI<String> bqi, BQI<String> bqi2, AHD<String> ahd3, HistoryLoadingState historyLoadingState, boolean z8, boolean z9, boolean z10, Long l, Bitmap bitmap, ReplyContext replyContext, MessageContext messageContext, UiSuggestion uiSuggestion, HatchConversationTheme hatchConversationTheme, HatchSearchResultData hatchSearchResultData, HatchCitationAnalytics hatchCitationAnalytics, boolean z11, int i2, boolean z12, boolean z13, boolean z14, boolean z15, ComposerLaunchAction composerLaunchAction, HatchPendingFileAction hatchPendingFileAction, boolean z16) {
        AnonymousClass002.A1F(hatchGatewayConnectionState, 7, ahd);
        AnonymousClass005.A18(ahd2, bqi, bqi2, ahd3, historyLoadingState);
        C7384Etj.A0Y(hatchConversationTheme, 23);
        this.hasHistory = z;
        this.isAwaitingResponse = z2;
        this.isAwaitingFirstResponse = z3;
        this.isCancelableActivity = z4;
        this.isSendEnabled = z5;
        this.isAwaitingApproval = z6;
        this.composerHintResId = i;
        this.connectionState = hatchGatewayConnectionState;
        this.canStartLiveSession = z7;
        this.pendingImageUris = ahd;
        this.pendingFileUris = ahd2;
        this.uploadingFileUris = bqi;
        this.failedUploadUris = bqi2;
        this.linkAttachmentUrls = ahd3;
        this.historyLoadingState = historyLoadingState;
        this.offlineSeedAttempted = z8;
        this.isNewThreadWithoutHistory = z9;
        this.hasMoreHistory = z10;
        this.oldestHistorySeq = l;
        this.pendingDiscussionItemPreview = bitmap;
        this.replyContext = replyContext;
        this.messageContext = messageContext;
        this.pendingSuggestion = uiSuggestion;
        this.conversationTheme = hatchConversationTheme;
        this.sourcesBottomSheetData = hatchSearchResultData;
        this.sourcesBottomSheetAnalytics = hatchCitationAnalytics;
        this.islandLoading = z11;
        this.highlightedMessageIndex = i2;
        this.isPokePending = z12;
        this.isPokeRateLimited = z13;
        this.isArchived = z14;
        this.shouldFocusComposer = z15;
        this.composerLaunchRequest = composerLaunchAction;
        this.pendingFileAction = hatchPendingFileAction;
        this.isInputBlocked = z16;
    }
}
