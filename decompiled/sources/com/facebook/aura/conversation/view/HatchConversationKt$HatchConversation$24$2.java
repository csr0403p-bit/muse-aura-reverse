package com.facebook.aura.conversation.view;

import X.ADq;
import X.AHD;
import X.AOW;
import X.AT5;
import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C1BO;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.conversation.widget.api.ConversationTimelineContent;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.model.HatchContentViewModelData;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.qpl.startup.StartupRenderCallback;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$24$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ MutableState<String> $activeHighlightId$delegate;
    public final /* synthetic */ C1BO<String> $agentNameState;
    public final /* synthetic */ String $approvalSessionId;
    public final /* synthetic */ ConversationAudioPlayback $audio;
    public final /* synthetic */ MutableState<Boolean> $autoFollowEnabled$delegate;
    public final /* synthetic */ boolean $awaitingInitialScroll;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ long $chatBackground;
    public final /* synthetic */ StartupRenderCallback $conversationRender;
    public final /* synthetic */ boolean $didInitialScroll;
    public final /* synthetic */ MutableState<Boolean> $hasDrawnConversationContent$delegate;
    public final /* synthetic */ AT5<Float, AOW> $highlightGlowAlpha;
    public final /* synthetic */ float $horizontalInset;
    public final /* synthetic */ MutableState<Boolean> $isWaitingForDeeplinkedMessage$delegate;
    public final /* synthetic */ HatchConversationListItem.Message $lastMessage;
    public final /* synthetic */ ADq $latestResponseRange;
    public final /* synthetic */ AHD<HatchConversationListItem> $listItems;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
    public final /* synthetic */ Function0<Unit> $onFirstChatViewFinished;
    public final /* synthetic */ Function0<Unit> $onFirstConversationContentDrawn;
    public final /* synthetic */ G0U<String, Unit> $onFirstTokenRendered;
    public final /* synthetic */ Function0<Unit> $onFocusComposer;
    public final /* synthetic */ G0U<String, Integer> $onGetWidgetHeight;
    public final /* synthetic */ G0U<ContentItem, Unit> $onImageCopy;
    public final /* synthetic */ G0V<String, String, Unit> $onJumpToAudioSource;
    public final /* synthetic */ G0U<String, Unit> $onMediaDeleted;
    public final /* synthetic */ G0U<String, Unit> $onRetry;
    public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;
    public final /* synthetic */ G0U<String, Unit> $onScrollToMessage;
    public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
    public final /* synthetic */ G0V<String, Integer, Unit> $onSetWidgetHeight;
    public final /* synthetic */ Function0<Unit> $onViewFinished;
    public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
    public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
    public final /* synthetic */ PresentationEntryTracker $presentationEntryTracker;
    public final /* synthetic */ C1BO<Set<String>> $reactionEffectMessageIds;
    public final /* synthetic */ Function0<Unit> $requestBottomFollow;
    public final /* synthetic */ MutableState<AaC> $scrollViewportBounds$delegate;
    public final /* synthetic */ String $sideChatSessionId;
    public final /* synthetic */ InterfaceC05151eP $this_Box;
    public final /* synthetic */ C1BO<AHD<ConversationTimelineContent>> $timelineContents$delegate;
    public final /* synthetic */ String $timelineConversationId;
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
    public HatchConversationKt$HatchConversation$24$2(LazyListState lazyListState, boolean z, boolean z2, StartupRenderCallback startupRenderCallback, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, float f, float f2, float f3, Function0<Unit> function04, G0U<? super String, Integer> g0u, G0V<? super String, ? super Integer, Unit> g0v, AHD<? extends HatchConversationListItem> ahd, HatchConversationListItem.Message message, ADq aDq, PresentationEntryTracker presentationEntryTracker, C1BO<? extends Set<String>> c1bo, String str, HatchConversationUiState hatchConversationUiState, AT5<Float, AOW> at5, C1BO<String> c1bo2, G0U<? super HatchContentViewModelData, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super String, Unit> g0u4, G0U<? super ContentItem, Unit> g0u5, G0U<? super String, Unit> g0u6, G0U<? super String, Unit> g0u7, G0U<? super HatchSendMessage, Unit> g0u8, G0W<? super String, ? super String, ? super String, Unit> g0w, G0U<? super HatchMessageUiModel, Unit> g0u9, String str2, C1BO<? extends AHD<? extends ConversationTimelineContent>> c1bo3, InterfaceC05151eP interfaceC05151eP, long j, long j2, long j3, Function0<Unit> function05, ConversationAudioPlayback conversationAudioPlayback, G0V<? super String, ? super String, Unit> g0v2, MutableState<Boolean> mutableState, String str3, MutableState<AaC> mutableState2, MutableState<Boolean> mutableState3, G0U<? super String, Unit> g0u10, MutableState<String> mutableState4, MutableState<Boolean> mutableState5) {
        super(2);
        this.$listState = lazyListState;
        this.$didInitialScroll = z;
        this.$awaitingInitialScroll = z2;
        this.$conversationRender = startupRenderCallback;
        this.$onViewFinished = function0;
        this.$onFirstConversationContentDrawn = function02;
        this.$onFirstChatViewFinished = function03;
        this.$horizontalInset = f;
        this.$topPadding = f2;
        this.$bottomPadding = f3;
        this.$onFocusComposer = function04;
        this.$onGetWidgetHeight = g0u;
        this.$onSetWidgetHeight = g0v;
        this.$listItems = ahd;
        this.$lastMessage = message;
        this.$latestResponseRange = aDq;
        this.$presentationEntryTracker = presentationEntryTracker;
        this.$reactionEffectMessageIds = c1bo;
        this.$sideChatSessionId = str;
        this.$uiState = hatchConversationUiState;
        this.$highlightGlowAlpha = at5;
        this.$agentNameState = c1bo2;
        this.$onRichFormatOpenCTAClick = g0u2;
        this.$onArtifactVisible = g0u3;
        this.$onMediaDeleted = g0u4;
        this.$onImageCopy = g0u5;
        this.$onFirstTokenRendered = g0u6;
        this.$onRetry = g0u7;
        this.$onWidgetSendMessage = g0u8;
        this.$onWidgetSetState = g0w;
        this.$onSelectionReply = g0u9;
        this.$approvalSessionId = str2;
        this.$timelineContents$delegate = c1bo3;
        this.$this_Box = interfaceC05151eP;
        this.$chatBackground = j;
        this.$userMessageBubbleColor = j2;
        this.$userMessageTextColor = j3;
        this.$requestBottomFollow = function05;
        this.$audio = conversationAudioPlayback;
        this.$onJumpToAudioSource = g0v2;
        this.$autoFollowEnabled$delegate = mutableState;
        this.$timelineConversationId = str3;
        this.$scrollViewportBounds$delegate = mutableState2;
        this.$hasDrawnConversationContent$delegate = mutableState3;
        this.$onScrollToMessage = g0u10;
        this.$activeHighlightId$delegate = mutableState4;
        this.$isWaitingForDeeplinkedMessage$delegate = mutableState5;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.BFM r58, int r59) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$24$2.invoke(X.BFM, int):void");
    }
}
