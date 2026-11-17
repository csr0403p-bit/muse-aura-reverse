package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C20Q;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.model.HatchContentViewModelData;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.qpl.startup.StartupRenderCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$25 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$changed3;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $$default1;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ StartupRenderCallback $conversationRender;
    public final /* synthetic */ HighlightRequest $highlightRequest;
    public final /* synthetic */ float $horizontalInset;
    public final /* synthetic */ boolean $isMainTab;
    public final /* synthetic */ AHD<HatchConversationListItem> $listItems;
    public final /* synthetic */ String $listOwnerId;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
    public final /* synthetic */ Function0<Unit> $onClearHighlightedMessageIndex;
    public final /* synthetic */ Function0<Unit> $onDeeplinkConsumed;
    public final /* synthetic */ Function0<Unit> $onFirstChatViewFinished;
    public final /* synthetic */ Function0<Unit> $onFirstConversationContentDrawn;
    public final /* synthetic */ G0U<String, Unit> $onFirstTokenRendered;
    public final /* synthetic */ Function0<Unit> $onFocusComposer;
    public final /* synthetic */ G0U<String, Integer> $onGetWidgetHeight;
    public final /* synthetic */ Function0<Unit> $onHighlightConsumed;
    public final /* synthetic */ G0U<ContentItem, Unit> $onImageCopy;
    public final /* synthetic */ G0V<String, String, Unit> $onJumpToAudioSource;
    public final /* synthetic */ Function0<Unit> $onLoadHistory;
    public final /* synthetic */ G0U<String, Unit> $onMediaDeleted;
    public final /* synthetic */ G0U<G0U<? super String, Unit>, Unit> $onProvideScrollToMessage;
    public final /* synthetic */ G0U<String, Unit> $onRetry;
    public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;
    public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
    public final /* synthetic */ G0V<String, Integer, Unit> $onSetWidgetHeight;
    public final /* synthetic */ Function0<Unit> $onViewFinished;
    public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
    public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
    public final /* synthetic */ C20Q<Unit> $scrollToBottomRequests;
    public final /* synthetic */ String $sideChatSessionId;
    public final /* synthetic */ C20Q<Unit> $tabReselectedFlow;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ HatchConversationUiState $uiState;
    public final /* synthetic */ long $userMessageBubbleColor;
    public final /* synthetic */ long $userMessageTextColor;

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationKt$HatchConversation$25(HatchConversationUiState hatchConversationUiState, AHD<? extends HatchConversationListItem> ahd, String str, float f, float f2, float f3, long j, long j2, Function0<Unit> function0, StartupRenderCallback startupRenderCallback, G0U<? super ContentItem, Unit> g0u, boolean z, BRg bRg, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, HighlightRequest highlightRequest, Function0<Unit> function05, Function0<Unit> function06, G0U<? super HatchContentViewModelData, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super String, Unit> g0u4, G0U<? super G0U<? super String, Unit>, Unit> g0u5, G0V<? super String, ? super String, Unit> g0v, Function0<Unit> function07, G0U<? super String, Unit> g0u6, G0U<? super String, Unit> g0u7, G0U<? super HatchSendMessage, Unit> g0u8, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function08, G0U<? super String, Integer> g0u9, G0V<? super String, ? super Integer, Unit> g0v2, G0U<? super HatchMessageUiModel, Unit> g0u10, C20Q<Unit> c20q, C20Q<Unit> c20q2, String str2, int i, int i2, int i3, int i4, int i5, int i6) {
        super(2);
        this.$uiState = hatchConversationUiState;
        this.$listItems = ahd;
        this.$listOwnerId = str;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$horizontalInset = f3;
        this.$userMessageBubbleColor = j;
        this.$userMessageTextColor = j2;
        this.$onLoadHistory = function0;
        this.$conversationRender = startupRenderCallback;
        this.$onImageCopy = g0u;
        this.$isMainTab = z;
        this.$modifier = bRg;
        this.$onViewFinished = function02;
        this.$onFirstChatViewFinished = function03;
        this.$onFirstConversationContentDrawn = function04;
        this.$highlightRequest = highlightRequest;
        this.$onDeeplinkConsumed = function05;
        this.$onHighlightConsumed = function06;
        this.$onRichFormatOpenCTAClick = g0u2;
        this.$onArtifactVisible = g0u3;
        this.$onMediaDeleted = g0u4;
        this.$onProvideScrollToMessage = g0u5;
        this.$onJumpToAudioSource = g0v;
        this.$onClearHighlightedMessageIndex = function07;
        this.$onFirstTokenRendered = g0u6;
        this.$onRetry = g0u7;
        this.$onWidgetSendMessage = g0u8;
        this.$onWidgetSetState = g0w;
        this.$onFocusComposer = function08;
        this.$onGetWidgetHeight = g0u9;
        this.$onSetWidgetHeight = g0v2;
        this.$onSelectionReply = g0u10;
        this.$tabReselectedFlow = c20q;
        this.$scrollToBottomRequests = c20q2;
        this.$sideChatSessionId = str2;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$changed2 = i3;
        this.$$changed3 = i4;
        this.$$default = i5;
        this.$$default1 = i6;
    }

    public final void invoke(BFM bfm, int i) {
        HatchConversationKt.m557HatchConversation80_EzA0(this.$uiState, this.$listItems, this.$listOwnerId, this.$topPadding, this.$bottomPadding, this.$horizontalInset, this.$userMessageBubbleColor, this.$userMessageTextColor, this.$onLoadHistory, this.$conversationRender, this.$onImageCopy, this.$isMainTab, this.$modifier, this.$onViewFinished, this.$onFirstChatViewFinished, this.$onFirstConversationContentDrawn, this.$highlightRequest, this.$onDeeplinkConsumed, this.$onHighlightConsumed, this.$onRichFormatOpenCTAClick, this.$onArtifactVisible, this.$onMediaDeleted, this.$onProvideScrollToMessage, this.$onJumpToAudioSource, this.$onClearHighlightedMessageIndex, this.$onFirstTokenRendered, this.$onRetry, this.$onWidgetSendMessage, this.$onWidgetSetState, this.$onFocusComposer, this.$onGetWidgetHeight, this.$onSetWidgetHeight, this.$onSelectionReply, this.$tabReselectedFlow, this.$scrollToBottomRequests, this.$sideChatSessionId, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), AnonymousClass011.A01(this.$$changed3), this.$$default, this.$$default1);
    }
}
