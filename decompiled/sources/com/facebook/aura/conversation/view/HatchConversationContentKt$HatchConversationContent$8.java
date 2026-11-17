package com.facebook.aura.conversation.view;

import X.AHD;
import X.AKH;
import X.AKJ;
import X.AKQ;
import X.ASF;
import X.Ab8;
import X.AbstractC2139Az7;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BJW;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0wg;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1C3;
import X.C1Cd;
import X.C1DG;
import X.C1DP;
import X.C1YY;
import X.C1b8;
import X.C20Q;
import X.C2CK;
import X.C2VU;
import X.C3Hd;
import X.C3Tz;
import X.C3U4;
import X.C3Ue;
import X.C78N;
import X.C78e;
import X.C8jn;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.viewmodel.GenericListSelectionDelegate;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.conversation.viewmodel.HatchPendingFileAction;
import com.facebook.aura.conversation.viewmodel.HatchSuggestionLabels;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.model.HatchMessageChannel;
import com.facebook.aura.navigation.HatchSidePanelController;
import com.facebook.aura.qpl.startup.StartupRenderCallback;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.ui.HatchTabBarPaddingKt;
import com.facebook.aura.ui.adaptive.AuraContentFrameKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.uicontrol.UiSuggestion;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ HatchMessageChannel $channel;
    public final /* synthetic */ long $chatBackground;
    public final /* synthetic */ BRg $clearFocusOnTap;
    public final /* synthetic */ MutableState<String> $composerAnimatedHint$delegate;
    public final /* synthetic */ String $composerHintText;
    public final /* synthetic */ BRg $composerModifier;
    public final /* synthetic */ float $consumedBottom;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ StartupRenderCallback $conversationRender;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $emptyContent;
    public final /* synthetic */ HatchConversationContentKt$HatchConversationContent$hideKeyboardOnScrollConnection$1$1 $hideKeyboardOnScrollConnection;
    public final /* synthetic */ HighlightRequest $highlightRequest;
    public final /* synthetic */ boolean $isMainTab;
    public final /* synthetic */ boolean $isMicAvailable;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ boolean $isReadOnly;
    public final /* synthetic */ G0V<String, String, Unit> $jumpToAudioSource;
    public final /* synthetic */ C1C3 $keyboardController;
    public final /* synthetic */ Function0<Unit> $launchCamera;
    public final /* synthetic */ G0U<C3Hd, Unit> $launchVisualMediaPicker;
    public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $listItems$delegate;
    public final /* synthetic */ MutableState<Boolean> $listRenderReady$delegate;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
    public final /* synthetic */ Function0<Unit> $onClearHighlightedMessageIndex;
    public final /* synthetic */ Function0<Unit> $onDeeplinkConsumed;
    public final /* synthetic */ Function0<Unit> $onFilesClick;
    public final /* synthetic */ Function0<Unit> $onFirstChatViewFinished;
    public final /* synthetic */ Function0<Unit> $onFirstConversationContentDrawn;
    public final /* synthetic */ Function0<Unit> $onGalleryClick;
    public final /* synthetic */ Function0<Unit> $onHighlightConsumed;
    public final /* synthetic */ G0U<String, Unit> $onMediaDeleted;
    public final /* synthetic */ G0U<Boolean, Unit> $onMicClick;
    public final /* synthetic */ G0U<G0U<? super String, Unit>, Unit> $onProvideScrollToMessage;
    public final /* synthetic */ G0U<String, Unit> $onRichFormatOpenCTAClick;
    public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
    public final /* synthetic */ Function0<Unit> $onViewFinished;
    public final /* synthetic */ UiSuggestion $pendingSuggestion;
    public final /* synthetic */ MutableState<G0U<String, Unit>> $scrollToMessage$delegate;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;
    public final /* synthetic */ HatchSuggestionLabels.LabelResources $suggestionResources;
    public final /* synthetic */ C20Q<Unit> $tabReselectedFlow;
    public final /* synthetic */ String $threadId;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ C1BO<HatchConversationUiState> $uiState$delegate;
    public final /* synthetic */ long $userBubbleColor;
    public final /* synthetic */ long $userTextColor;
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$8$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ float $bottomPadding;
        public final /* synthetic */ HatchMessageChannel $channel;
        public final /* synthetic */ MutableState<String> $composerAnimatedHint$delegate;
        public final /* synthetic */ String $composerHintText;
        public final /* synthetic */ BRg $composerModifier;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ boolean $isMicAvailable;
        public final /* synthetic */ boolean $isPrimaryThread;
        public final /* synthetic */ boolean $isReadOnly;
        public final /* synthetic */ C1C3 $keyboardController;
        public final /* synthetic */ Function0<Unit> $launchCamera;
        public final /* synthetic */ G0U<C3Hd, Unit> $launchVisualMediaPicker;
        public final /* synthetic */ Function0<Unit> $onFilesClick;
        public final /* synthetic */ Function0<Unit> $onGalleryClick;
        public final /* synthetic */ G0U<Boolean, Unit> $onMicClick;
        public final /* synthetic */ UiSuggestion $pendingSuggestion;
        public final /* synthetic */ MutableState<G0U<String, Unit>> $scrollToMessage$delegate;
        public final /* synthetic */ HatchSidePanelController $sidePanelController;
        public final /* synthetic */ HatchSuggestionLabels.LabelResources $suggestionResources;
        public final /* synthetic */ String $threadId;
        public final /* synthetic */ C1BO<HatchConversationUiState> $uiState$delegate;
        public final /* synthetic */ long $userBubbleColor;
        public final /* synthetic */ long $userTextColor;
        public final /* synthetic */ HatchConversationViewModel $viewModel;

        /* renamed from: com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$8$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00961 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
            public final /* synthetic */ float $bottomPadding;
            public final /* synthetic */ HatchMessageChannel $channel;
            public final /* synthetic */ MutableState<String> $composerAnimatedHint$delegate;
            public final /* synthetic */ String $composerHintText;
            public final /* synthetic */ BRg $composerModifier;
            public final /* synthetic */ Context $context;
            public final /* synthetic */ boolean $isMicAvailable;
            public final /* synthetic */ boolean $isPrimaryThread;
            public final /* synthetic */ boolean $isReadOnly;
            public final /* synthetic */ C1C3 $keyboardController;
            public final /* synthetic */ Function0<Unit> $launchCamera;
            public final /* synthetic */ G0U<C3Hd, Unit> $launchVisualMediaPicker;
            public final /* synthetic */ Function0<Unit> $onFilesClick;
            public final /* synthetic */ Function0<Unit> $onGalleryClick;
            public final /* synthetic */ G0U<Boolean, Unit> $onMicClick;
            public final /* synthetic */ UiSuggestion $pendingSuggestion;
            public final /* synthetic */ MutableState<G0U<String, Unit>> $scrollToMessage$delegate;
            public final /* synthetic */ HatchSidePanelController $sidePanelController;
            public final /* synthetic */ HatchSuggestionLabels.LabelResources $suggestionResources;
            public final /* synthetic */ String $threadId;
            public final /* synthetic */ C1BO<HatchConversationUiState> $uiState$delegate;
            public final /* synthetic */ long $userBubbleColor;
            public final /* synthetic */ long $userTextColor;
            public final /* synthetic */ HatchConversationViewModel $viewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00961(float f, boolean z, HatchMessageChannel hatchMessageChannel, HatchConversationViewModel hatchConversationViewModel, boolean z2, C1C3 c1c3, UiSuggestion uiSuggestion, HatchSuggestionLabels.LabelResources labelResources, C1BO<HatchConversationUiState> c1bo, String str, BRg bRg, HatchSidePanelController hatchSidePanelController, long j, long j2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super C3Hd, Unit> g0u, Context context, G0U<? super Boolean, Unit> g0u2, String str2, MutableState<String> mutableState, MutableState<G0U<String, Unit>> mutableState2) {
                super(3);
                this.$bottomPadding = f;
                this.$isReadOnly = z;
                this.$channel = hatchMessageChannel;
                this.$viewModel = hatchConversationViewModel;
                this.$isPrimaryThread = z2;
                this.$keyboardController = c1c3;
                this.$pendingSuggestion = uiSuggestion;
                this.$suggestionResources = labelResources;
                this.$uiState$delegate = c1bo;
                this.$composerHintText = str;
                this.$composerModifier = bRg;
                this.$sidePanelController = hatchSidePanelController;
                this.$userBubbleColor = j;
                this.$userTextColor = j2;
                this.$isMicAvailable = z3;
                this.$onGalleryClick = function0;
                this.$launchCamera = function02;
                this.$onFilesClick = function03;
                this.$launchVisualMediaPicker = g0u;
                this.$context = context;
                this.$onMicClick = g0u2;
                this.$threadId = str2;
                this.$composerAnimatedHint$delegate = mutableState;
                this.$scrollToMessage$delegate = mutableState2;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) throws Resources.NotFoundException {
                invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x0125  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(X.C1Cd r45, X.BFM r46, int r47) throws android.content.res.Resources.NotFoundException {
                /*
                    Method dump skipped, instructions count: 597
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$8.AnonymousClass1.C00961.invoke(X.1Cd, X.BFM, int):void");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z, HatchMessageChannel hatchMessageChannel, float f, HatchConversationViewModel hatchConversationViewModel, boolean z2, C1C3 c1c3, UiSuggestion uiSuggestion, HatchSuggestionLabels.LabelResources labelResources, C1BO<HatchConversationUiState> c1bo, String str, BRg bRg, HatchSidePanelController hatchSidePanelController, long j, long j2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super C3Hd, Unit> g0u, Context context, G0U<? super Boolean, Unit> g0u2, String str2, MutableState<String> mutableState, MutableState<G0U<String, Unit>> mutableState2) {
            super(2);
            this.$isReadOnly = z;
            this.$channel = hatchMessageChannel;
            this.$bottomPadding = f;
            this.$viewModel = hatchConversationViewModel;
            this.$isPrimaryThread = z2;
            this.$keyboardController = c1c3;
            this.$pendingSuggestion = uiSuggestion;
            this.$suggestionResources = labelResources;
            this.$uiState$delegate = c1bo;
            this.$composerHintText = str;
            this.$composerModifier = bRg;
            this.$sidePanelController = hatchSidePanelController;
            this.$userBubbleColor = j;
            this.$userTextColor = j2;
            this.$isMicAvailable = z3;
            this.$onGalleryClick = function0;
            this.$launchCamera = function02;
            this.$onFilesClick = function03;
            this.$launchVisualMediaPicker = g0u;
            this.$context = context;
            this.$onMicClick = g0u2;
            this.$threadId = str2;
            this.$composerAnimatedHint$delegate = mutableState;
            this.$scrollToMessage$delegate = mutableState2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.BFM r43, int r44) {
            /*
                Method dump skipped, instructions count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$8.AnonymousClass1.invoke(X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$8$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<Integer, BFM, Integer, Unit> {
        public final /* synthetic */ float $bottomPadding;
        public final /* synthetic */ long $chatBackground;
        public final /* synthetic */ BRg $clearFocusOnTap;
        public final /* synthetic */ StartupRenderCallback $conversationRender;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $emptyContent;
        public final /* synthetic */ HatchConversationContentKt$HatchConversationContent$hideKeyboardOnScrollConnection$1$1 $hideKeyboardOnScrollConnection;
        public final /* synthetic */ HighlightRequest $highlightRequest;
        public final /* synthetic */ boolean $isMainTab;
        public final /* synthetic */ boolean $isPrimaryThread;
        public final /* synthetic */ G0V<String, String, Unit> $jumpToAudioSource;
        public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $listItems$delegate;
        public final /* synthetic */ MutableState<Boolean> $listRenderReady$delegate;
        public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
        public final /* synthetic */ Function0<Unit> $onClearHighlightedMessageIndex;
        public final /* synthetic */ Function0<Unit> $onDeeplinkConsumed;
        public final /* synthetic */ Function0<Unit> $onFirstChatViewFinished;
        public final /* synthetic */ Function0<Unit> $onFirstConversationContentDrawn;
        public final /* synthetic */ Function0<Unit> $onHighlightConsumed;
        public final /* synthetic */ G0U<String, Unit> $onMediaDeleted;
        public final /* synthetic */ G0U<G0U<? super String, Unit>, Unit> $onProvideScrollToMessage;
        public final /* synthetic */ G0U<String, Unit> $onRichFormatOpenCTAClick;
        public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
        public final /* synthetic */ Function0<Unit> $onViewFinished;
        public final /* synthetic */ MutableState<G0U<String, Unit>> $scrollToMessage$delegate;
        public final /* synthetic */ C20Q<Unit> $tabReselectedFlow;
        public final /* synthetic */ String $threadId;
        public final /* synthetic */ float $topPadding;
        public final /* synthetic */ C1BO<HatchConversationUiState> $uiState$delegate;
        public final /* synthetic */ long $userBubbleColor;
        public final /* synthetic */ long $userTextColor;
        public final /* synthetic */ HatchConversationViewModel $viewModel;

        /* renamed from: com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$8$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ float $bottomPadding;
            public final /* synthetic */ long $chatBackground;
            public final /* synthetic */ BRg $clearFocusOnTap;
            public final /* synthetic */ float $composerHeight;
            public final /* synthetic */ int $composerHeightPx;
            public final /* synthetic */ StartupRenderCallback $conversationRender;
            public final /* synthetic */ G0V<BFM, Integer, Unit> $emptyContent;
            public final /* synthetic */ HatchConversationContentKt$HatchConversationContent$hideKeyboardOnScrollConnection$1$1 $hideKeyboardOnScrollConnection;
            public final /* synthetic */ HighlightRequest $highlightRequest;
            public final /* synthetic */ boolean $isMainTab;
            public final /* synthetic */ boolean $isPrimaryThread;
            public final /* synthetic */ G0V<String, String, Unit> $jumpToAudioSource;
            public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $listItems$delegate;
            public final /* synthetic */ MutableState<Boolean> $listRenderReady$delegate;
            public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
            public final /* synthetic */ Function0<Unit> $onClearHighlightedMessageIndex;
            public final /* synthetic */ Function0<Unit> $onDeeplinkConsumed;
            public final /* synthetic */ Function0<Unit> $onFirstChatViewFinished;
            public final /* synthetic */ Function0<Unit> $onFirstConversationContentDrawn;
            public final /* synthetic */ Function0<Unit> $onHighlightConsumed;
            public final /* synthetic */ G0U<String, Unit> $onMediaDeleted;
            public final /* synthetic */ G0U<G0U<? super String, Unit>, Unit> $onProvideScrollToMessage;
            public final /* synthetic */ G0U<String, Unit> $onRichFormatOpenCTAClick;
            public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
            public final /* synthetic */ Function0<Unit> $onViewFinished;
            public final /* synthetic */ MutableState<G0U<String, Unit>> $scrollToMessage$delegate;
            public final /* synthetic */ C20Q<Unit> $tabReselectedFlow;
            public final /* synthetic */ String $threadId;
            public final /* synthetic */ float $topPadding;
            public final /* synthetic */ float $transcriptBottomPadding;
            public final /* synthetic */ C1BO<HatchConversationUiState> $uiState$delegate;
            public final /* synthetic */ long $userBubbleColor;
            public final /* synthetic */ long $userTextColor;
            public final /* synthetic */ HatchConversationViewModel $viewModel;

            /* renamed from: com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$8$2$1$1, reason: invalid class name and collision with other inner class name */
            public final class C00971 extends AbstractC7559F3s implements G0W<C1DG, BFM, Integer, Unit> {
                public final /* synthetic */ float $bottomPadding;
                public final /* synthetic */ long $chatBackground;
                public final /* synthetic */ BRg $clearFocusOnTap;
                public final /* synthetic */ float $composerHeight;
                public final /* synthetic */ int $composerHeightPx;
                public final /* synthetic */ StartupRenderCallback $conversationRender;
                public final /* synthetic */ G0V<BFM, Integer, Unit> $emptyContent;
                public final /* synthetic */ HatchConversationContentKt$HatchConversationContent$hideKeyboardOnScrollConnection$1$1 $hideKeyboardOnScrollConnection;
                public final /* synthetic */ HighlightRequest $highlightRequest;
                public final /* synthetic */ boolean $isMainTab;
                public final /* synthetic */ boolean $isPrimaryThread;
                public final /* synthetic */ G0V<String, String, Unit> $jumpToAudioSource;
                public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $listItems$delegate;
                public final /* synthetic */ MutableState<Boolean> $listRenderReady$delegate;
                public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
                public final /* synthetic */ Function0<Unit> $onClearHighlightedMessageIndex;
                public final /* synthetic */ Function0<Unit> $onDeeplinkConsumed;
                public final /* synthetic */ Function0<Unit> $onFirstChatViewFinished;
                public final /* synthetic */ Function0<Unit> $onFirstConversationContentDrawn;
                public final /* synthetic */ Function0<Unit> $onHighlightConsumed;
                public final /* synthetic */ G0U<String, Unit> $onMediaDeleted;
                public final /* synthetic */ G0U<G0U<? super String, Unit>, Unit> $onProvideScrollToMessage;
                public final /* synthetic */ G0U<String, Unit> $onRichFormatOpenCTAClick;
                public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
                public final /* synthetic */ Function0<Unit> $onViewFinished;
                public final /* synthetic */ MutableState<G0U<String, Unit>> $scrollToMessage$delegate;
                public final /* synthetic */ C20Q<Unit> $tabReselectedFlow;
                public final /* synthetic */ String $threadId;
                public final /* synthetic */ float $topPadding;
                public final /* synthetic */ float $transcriptBottomPadding;
                public final /* synthetic */ C1BO<HatchConversationUiState> $uiState$delegate;
                public final /* synthetic */ long $userBubbleColor;
                public final /* synthetic */ long $userTextColor;
                public final /* synthetic */ HatchConversationViewModel $viewModel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C00971(HatchConversationContentKt$HatchConversationContent$hideKeyboardOnScrollConnection$1$1 hatchConversationContentKt$HatchConversationContent$hideKeyboardOnScrollConnection$1$1, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, StartupRenderCallback startupRenderCallback, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, float f, float f2, HatchConversationViewModel hatchConversationViewModel, G0U<? super String, Unit> g0u, long j, long j2, boolean z, HighlightRequest highlightRequest, Function0<Unit> function04, Function0<Unit> function05, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super G0U<? super String, Unit>, Unit> g0u4, G0V<? super String, ? super String, Unit> g0v2, Function0<Unit> function06, G0U<? super HatchMessageUiModel, Unit> g0u5, C20Q<Unit> c20q, float f3, float f4, int i, long j3, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo, boolean z2, String str, MutableState<Boolean> mutableState, C1BO<HatchConversationUiState> c1bo2, MutableState<G0U<String, Unit>> mutableState2) {
                    super(3);
                    this.$hideKeyboardOnScrollConnection = hatchConversationContentKt$HatchConversationContent$hideKeyboardOnScrollConnection$1$1;
                    this.$emptyContent = g0v;
                    this.$clearFocusOnTap = bRg;
                    this.$conversationRender = startupRenderCallback;
                    this.$onViewFinished = function0;
                    this.$onFirstConversationContentDrawn = function02;
                    this.$onFirstChatViewFinished = function03;
                    this.$topPadding = f;
                    this.$transcriptBottomPadding = f2;
                    this.$viewModel = hatchConversationViewModel;
                    this.$onRichFormatOpenCTAClick = g0u;
                    this.$userBubbleColor = j;
                    this.$userTextColor = j2;
                    this.$isMainTab = z;
                    this.$highlightRequest = highlightRequest;
                    this.$onDeeplinkConsumed = function04;
                    this.$onHighlightConsumed = function05;
                    this.$onArtifactVisible = g0u2;
                    this.$onMediaDeleted = g0u3;
                    this.$onProvideScrollToMessage = g0u4;
                    this.$jumpToAudioSource = g0v2;
                    this.$onClearHighlightedMessageIndex = function06;
                    this.$onSelectionReply = g0u5;
                    this.$tabReselectedFlow = c20q;
                    this.$composerHeight = f3;
                    this.$bottomPadding = f4;
                    this.$composerHeightPx = i;
                    this.$chatBackground = j3;
                    this.$listItems$delegate = c1bo;
                    this.$isPrimaryThread = z2;
                    this.$threadId = str;
                    this.$listRenderReady$delegate = mutableState;
                    this.$uiState$delegate = c1bo2;
                    this.$scrollToMessage$delegate = mutableState2;
                }

                @Override // X.G0W
                public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, BFM bfm, Integer num) {
                    m548invoke8Feqmps(c1dg.A00, bfm, AnonymousClass001.A0F(num));
                    return Unit.INSTANCE;
                }

                public static final long invoke_8Feqmps$lambda$0$20(MutableState<Long> mutableState) {
                    return mutableState.getValue().longValue();
                }

                public static final void invoke_8Feqmps$lambda$0$21(MutableState<Long> mutableState, long j) {
                    mutableState.Af8(Long.valueOf(j));
                }

                /* renamed from: invoke-8Feqmps, reason: not valid java name */
                public final void m548invoke8Feqmps(float f, BFM bfm, int i) {
                    boolean z;
                    int iA04 = i;
                    if ((i & 6) == 0) {
                        iA04 = i | AnonymousClass004.A04(bfm, f);
                    }
                    if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA04), bfm, iA04)) {
                        BS0 bs0 = BRg.A00;
                        C1062ATq c1062ATq = C10G.A01;
                        BRg bRgA00 = C8jn.A00(c1062ATq, this.$hideKeyboardOnScrollConnection, null);
                        G0V<BFM, Integer, Unit> g0v = this.$emptyContent;
                        BRg bRg = this.$clearFocusOnTap;
                        StartupRenderCallback startupRenderCallback = this.$conversationRender;
                        Function0<Unit> function0 = this.$onViewFinished;
                        Function0<Unit> function02 = this.$onFirstConversationContentDrawn;
                        Function0<Unit> function03 = this.$onFirstChatViewFinished;
                        float f2 = this.$topPadding;
                        float f3 = this.$transcriptBottomPadding;
                        HatchConversationViewModel hatchConversationViewModel = this.$viewModel;
                        G0U<String, Unit> g0u = this.$onRichFormatOpenCTAClick;
                        long j = this.$userBubbleColor;
                        long j2 = this.$userTextColor;
                        boolean z2 = this.$isMainTab;
                        HighlightRequest highlightRequest = this.$highlightRequest;
                        Function0<Unit> function04 = this.$onDeeplinkConsumed;
                        Function0<Unit> function05 = this.$onHighlightConsumed;
                        G0U<String, Unit> g0u2 = this.$onArtifactVisible;
                        G0U<String, Unit> g0u3 = this.$onMediaDeleted;
                        G0U<G0U<? super String, Unit>, Unit> g0u4 = this.$onProvideScrollToMessage;
                        G0V<String, String, Unit> g0v2 = this.$jumpToAudioSource;
                        Function0<Unit> function06 = this.$onClearHighlightedMessageIndex;
                        G0U<HatchMessageUiModel, Unit> g0u5 = this.$onSelectionReply;
                        C20Q<Unit> c20q = this.$tabReselectedFlow;
                        float f4 = this.$composerHeight;
                        float f5 = this.$bottomPadding;
                        int i2 = this.$composerHeightPx;
                        long j3 = this.$chatBackground;
                        C1BO<AHD<HatchConversationListItem>> c1bo = this.$listItems$delegate;
                        boolean z3 = this.$isPrimaryThread;
                        String str = this.$threadId;
                        MutableState<Boolean> mutableState = this.$listRenderReady$delegate;
                        C1BO<HatchConversationUiState> c1bo2 = this.$uiState$delegate;
                        MutableState<G0U<String, Unit>> mutableState2 = this.$scrollToMessage$delegate;
                        InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0E, false);
                        BBI bbi = (BBI) bfm;
                        int iA0J = AnonymousClass003.A0J(bbi);
                        AKQ akqA04 = BBI.A04(bbi);
                        BRg bRgA01 = AxM.A01(bfm, bRgA00);
                        Function0<InterfaceC1516AkQ> function07 = C1515AkP.A00;
                        if (bbi.A0V == null) {
                            C00x.A00();
                            throw F60.createAndThrow();
                        }
                        AnonymousClass005.A0n(bfm, bbi, function07);
                        AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
                        C0z7 c0z7 = C0z7.A00;
                        if (g0v != null && C1BO.A0E(c1bo)) {
                            boolean zA1T = AnonymousClass005.A1T(bfm, function0, function02, function03, AnonymousClass001.A1Z(startupRenderCallback, bfm, -1191480259));
                            Object objAaT = bfm.AaT();
                            if (zA1T || objAaT == C78N.A00) {
                                objAaT = new HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$1$1(startupRenderCallback, function0, function02, function03);
                                bfm.Ai0(objAaT);
                            }
                            BRg bRgA002 = BJW.A00(bRg, (Function0) objAaT);
                            InterfaceC1185Ado interfaceC1185Ado = AcQ.A05;
                            C1DP c1dp = new C1DP(f, f2, f, f3);
                            boolean zA65 = bfm.A65(g0v);
                            Object objAaT2 = bfm.AaT();
                            if (zA65 || objAaT2 == C78N.A00) {
                                objAaT2 = new HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$2$1(g0v);
                                bfm.Ai0(objAaT2);
                            }
                            C1YY.A01(null, null, interfaceC1185Ado, c1dp, null, bfm, null, bRgA002, (G0U) objAaT2, RuntimeInternals.IOPRIO_BACKGROUND, 490, false, false);
                            BBI.A0R(bbi, false);
                            z = true;
                        } else {
                            G0U g0u6 = null;
                            if (MutableState.A0A((MutableState) mutableState)) {
                                bfm.AgE(-1190434164);
                                HatchConversationUiState value = c1bo2.getValue();
                                AHD ahdA0C = C1BO.A0C(c1bo);
                                String str2 = hatchConversationViewModel.instanceId;
                                boolean zA67 = bfm.A67(hatchConversationViewModel);
                                Object objAaT3 = bfm.AaT();
                                if (zA67 || objAaT3 == C78N.A00) {
                                    objAaT3 = new HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$3$1(hatchConversationViewModel);
                                    bfm.Ai0(objAaT3);
                                }
                                InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT3;
                                String str3 = hatchConversationViewModel.sessionId;
                                String str4 = null;
                                if (!z3) {
                                    str4 = str3;
                                }
                                C20Q<Unit> c20q2 = hatchConversationViewModel.scrollToBottomRequests;
                                boolean zA672 = bfm.A67(hatchConversationViewModel);
                                Object objAaT4 = bfm.AaT();
                                if (zA672 || objAaT4 == C78N.A00) {
                                    objAaT4 = new HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$5$1(hatchConversationViewModel);
                                    bfm.Ai0(objAaT4);
                                }
                                InterfaceC7353EnQ interfaceC7353EnQ2 = (InterfaceC7353EnQ) objAaT4;
                                boolean zA673 = bfm.A67(hatchConversationViewModel);
                                Object objAaT5 = bfm.AaT();
                                if (zA673 || objAaT5 == C78N.A00) {
                                    objAaT5 = new HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$6$1(hatchConversationViewModel);
                                    bfm.Ai0(objAaT5);
                                }
                                InterfaceC7353EnQ interfaceC7353EnQ3 = (InterfaceC7353EnQ) objAaT5;
                                boolean zA674 = bfm.A67(hatchConversationViewModel);
                                Object objAaT6 = bfm.AaT();
                                if (zA674 || objAaT6 == C78N.A00) {
                                    objAaT6 = new HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$7$1(hatchConversationViewModel);
                                    bfm.Ai0(objAaT6);
                                }
                                InterfaceC7353EnQ interfaceC7353EnQ4 = (InterfaceC7353EnQ) objAaT6;
                                boolean zA675 = bfm.A67(hatchConversationViewModel);
                                Object objAaT7 = bfm.AaT();
                                if (zA675 || objAaT7 == C78N.A00) {
                                    objAaT7 = new HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$8$1(hatchConversationViewModel);
                                    bfm.Ai0(objAaT7);
                                }
                                InterfaceC7353EnQ interfaceC7353EnQ5 = (InterfaceC7353EnQ) objAaT7;
                                boolean zA676 = bfm.A67(hatchConversationViewModel);
                                Object objAaT8 = bfm.AaT();
                                if (zA676 || objAaT8 == C78N.A00) {
                                    objAaT8 = new HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$9$1(hatchConversationViewModel);
                                    bfm.Ai0(objAaT8);
                                }
                                InterfaceC7353EnQ interfaceC7353EnQ6 = (InterfaceC7353EnQ) objAaT8;
                                boolean zA677 = bfm.A67(hatchConversationViewModel);
                                Object objAaT9 = bfm.AaT();
                                if (zA677 || objAaT9 == C78N.A00) {
                                    objAaT9 = new HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$10$1(hatchConversationViewModel);
                                    bfm.Ai0(objAaT9);
                                }
                                InterfaceC7353EnQ interfaceC7353EnQ7 = (InterfaceC7353EnQ) objAaT9;
                                boolean zA678 = bfm.A67(hatchConversationViewModel);
                                Object objAaT10 = bfm.AaT();
                                if (zA678 || objAaT10 == C78N.A00) {
                                    objAaT10 = new HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$11$1(hatchConversationViewModel);
                                    bfm.Ai0(objAaT10);
                                }
                                InterfaceC7353EnQ interfaceC7353EnQ8 = (InterfaceC7353EnQ) objAaT10;
                                boolean zA679 = bfm.A67(hatchConversationViewModel);
                                Object objAaT11 = bfm.AaT();
                                if (zA679 || objAaT11 == C78N.A00) {
                                    objAaT11 = new HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$12$1(hatchConversationViewModel);
                                    bfm.Ai0(objAaT11);
                                }
                                InterfaceC7353EnQ interfaceC7353EnQ9 = (InterfaceC7353EnQ) objAaT11;
                                if (g0u == null) {
                                    bfm.AgE(-1187969913);
                                    BBI.A0R(bbi, false);
                                } else {
                                    boolean zA1Y = AnonymousClass001.A1Y(g0u, bfm, -1187969912);
                                    Object objAaT12 = bfm.AaT();
                                    if (zA1Y || objAaT12 == C78N.A00) {
                                        objAaT12 = new HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$13$1$1(g0u);
                                        bfm.Ai0(objAaT12);
                                    }
                                    g0u6 = (G0U) objAaT12;
                                    BBI.A0R(bbi, false);
                                }
                                Function0 function08 = (Function0) interfaceC7353EnQ;
                                G0U g0u7 = (G0U) interfaceC7353EnQ2;
                                boolean zA652 = bfm.A65(g0u4);
                                Object objAaT13 = bfm.AaT();
                                if (zA652 || objAaT13 == C78N.A00) {
                                    objAaT13 = new HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$14$1(g0u4, mutableState2);
                                    bfm.Ai0(objAaT13);
                                }
                                z = true;
                                HatchConversationKt.m557HatchConversation80_EzA0(value, ahdA0C, str2, f2, f3, f, j, j2, function08, startupRenderCallback, g0u7, z2, bRg, function0, function03, function02, highlightRequest, function04, function05, g0u6, g0u2, g0u3, (G0U) objAaT13, g0v2, function06, (G0U) interfaceC7353EnQ3, (G0U) interfaceC7353EnQ4, (G0U) interfaceC7353EnQ5, (G0W) interfaceC7353EnQ6, (Function0) interfaceC7353EnQ7, (G0U) interfaceC7353EnQ8, (G0V) interfaceC7353EnQ9, g0u5, c20q, c20q2, str4, bfm, AnonymousClass001.A08(iA04 << 15, HatchConversationUiState.$stable) | (StartupRenderCallback.$stable << 27), HighlightRequest.$stable << 18, 0, 0, 0, 0);
                            } else {
                                z = true;
                                bfm.AgE(-1187597075);
                            }
                            BBI.A0R(bbi, false);
                        }
                        if (C1DG.A01(f4, f5) > 0) {
                            bfm.AgE(-1187540717);
                            HatchComposerScrimKt.m542HatchComposerScrimXOJAsU(c0z7, i2, j3, bfm, 6);
                        } else {
                            bfm.AgE(-1187454227);
                        }
                        BBI.A0R(bbi, false);
                        HatchGatewayConnectionState hatchGatewayConnectionState = c1bo2.getValue().connectionState;
                        Object objAaT14 = bfm.AaT();
                        Object obj = C78N.A00;
                        MutableState mutableState3 = (MutableState) AnonymousClass005.A0g(bfm, objAaT14, obj, false);
                        Object objAaT15 = bfm.AaT();
                        if (objAaT15 == obj) {
                            objAaT15 = AuraAppLifecycleManager.isAppInForegroundFlow;
                            bfm.Ai0(objAaT15);
                        }
                        C1BO c1boA01 = C2CK.A01(bfm, null, Boolean.valueOf(z), (C20Q) objAaT15, 48, 14);
                        Object objAaT16 = bfm.AaT();
                        if (objAaT16 == obj) {
                            objAaT16 = AnonymousClass004.A11(bfm, 0L);
                        }
                        MutableState mutableState4 = (MutableState) objAaT16;
                        Boolean boolValueOf = Boolean.valueOf(C1BO.A0F(c1boA01));
                        boolean zA653 = bfm.A65(c1boA01);
                        Object objAaT17 = bfm.AaT();
                        if (zA653 || objAaT17 == obj) {
                            objAaT17 = new HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$15$1(c1boA01, mutableState4, null);
                            bfm.Ai0(objAaT17);
                        }
                        AnonymousClass001.A18(bfm, objAaT17, boolValueOf);
                        AHD<HatchConversationListItem> value2 = c1bo.getValue();
                        Long lValueOf = Long.valueOf(invoke_8Feqmps$lambda$0$20(mutableState4));
                        boolean zA1N = AnonymousClass003.A1N(bfm, hatchGatewayConnectionState, c1bo);
                        Object objAaT18 = bfm.AaT();
                        if (zA1N || objAaT18 == obj) {
                            objAaT18 = new HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$16$1(hatchGatewayConnectionState, mutableState4, c1bo, mutableState3);
                            bfm.Ai0(objAaT18);
                        }
                        C78e.A01(bfm, hatchGatewayConnectionState, value2, lValueOf, (G0U) objAaT18);
                        if (MutableState.A0A(mutableState3)) {
                            bfm.AgE(-1186080090);
                            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120853);
                            boolean zA6710 = bfm.A67(hatchConversationViewModel);
                            Object objAaT19 = bfm.AaT();
                            if (zA6710 || objAaT19 == obj) {
                                objAaT19 = new HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$17$1(hatchConversationViewModel);
                                bfm.Ai0(objAaT19);
                            }
                            HatchScreenErrorStateKt.HatchScreenErrorState(strA01, (Function0) ((InterfaceC7353EnQ) objAaT19), HatchImpressionModifierKt.hatchImpression(C1b8.A01(C3U4.A0C(c1062ATq, 0.0f, f2, 0.0f, f4), j3), HatchOrigin.CHAT, HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchInteractionEnumsKt.chatScreen(z3), HatchComponent.ERROR_BANNER, null, AnonymousClass002.A0o(null, str, z3), null, 500L, 0.0f, null, FGI.A0M("chat_connection_error:", hatchConversationViewModel.sessionId), null), null, null, null, null, bfm, 0, 120);
                        } else {
                            bfm.AgE(-1185089299);
                        }
                        BBI.A0R(bbi, false);
                        HatchConversationContentKt.HatchPendingFileActionPill(c1bo2.getValue().pendingFileAction, C3U4.A03(c0z7.A4C(C2VU.A06, bs0), f4 + 8.0f), bfm, HatchPendingFileAction.$stable, 0);
                        BBI.A0R(bbi, true);
                        return;
                    }
                    bfm.Afo();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(HatchConversationContentKt$HatchConversationContent$hideKeyboardOnScrollConnection$1$1 hatchConversationContentKt$HatchConversationContent$hideKeyboardOnScrollConnection$1$1, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, StartupRenderCallback startupRenderCallback, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, float f, float f2, HatchConversationViewModel hatchConversationViewModel, G0U<? super String, Unit> g0u, long j, long j2, boolean z, HighlightRequest highlightRequest, Function0<Unit> function04, Function0<Unit> function05, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super G0U<? super String, Unit>, Unit> g0u4, G0V<? super String, ? super String, Unit> g0v2, Function0<Unit> function06, G0U<? super HatchMessageUiModel, Unit> g0u5, C20Q<Unit> c20q, float f3, float f4, int i, long j3, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo, boolean z2, String str, MutableState<Boolean> mutableState, C1BO<HatchConversationUiState> c1bo2, MutableState<G0U<String, Unit>> mutableState2) {
                super(2);
                this.$hideKeyboardOnScrollConnection = hatchConversationContentKt$HatchConversationContent$hideKeyboardOnScrollConnection$1$1;
                this.$emptyContent = g0v;
                this.$clearFocusOnTap = bRg;
                this.$conversationRender = startupRenderCallback;
                this.$onViewFinished = function0;
                this.$onFirstConversationContentDrawn = function02;
                this.$onFirstChatViewFinished = function03;
                this.$topPadding = f;
                this.$transcriptBottomPadding = f2;
                this.$viewModel = hatchConversationViewModel;
                this.$onRichFormatOpenCTAClick = g0u;
                this.$userBubbleColor = j;
                this.$userTextColor = j2;
                this.$isMainTab = z;
                this.$highlightRequest = highlightRequest;
                this.$onDeeplinkConsumed = function04;
                this.$onHighlightConsumed = function05;
                this.$onArtifactVisible = g0u2;
                this.$onMediaDeleted = g0u3;
                this.$onProvideScrollToMessage = g0u4;
                this.$jumpToAudioSource = g0v2;
                this.$onClearHighlightedMessageIndex = function06;
                this.$onSelectionReply = g0u5;
                this.$tabReselectedFlow = c20q;
                this.$composerHeight = f3;
                this.$bottomPadding = f4;
                this.$composerHeightPx = i;
                this.$chatBackground = j3;
                this.$listItems$delegate = c1bo;
                this.$isPrimaryThread = z2;
                this.$threadId = str;
                this.$listRenderReady$delegate = mutableState;
                this.$uiState$delegate = c1bo2;
                this.$scrollToMessage$delegate = mutableState2;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    AuraContentFrameKt.AuraContentInsets(AuraContentRole.Conversation, B1V.A00(bfm, new C00971(this.$hideKeyboardOnScrollConnection, this.$emptyContent, this.$clearFocusOnTap, this.$conversationRender, this.$onViewFinished, this.$onFirstConversationContentDrawn, this.$onFirstChatViewFinished, this.$topPadding, this.$transcriptBottomPadding, this.$viewModel, this.$onRichFormatOpenCTAClick, this.$userBubbleColor, this.$userTextColor, this.$isMainTab, this.$highlightRequest, this.$onDeeplinkConsumed, this.$onHighlightConsumed, this.$onArtifactVisible, this.$onMediaDeleted, this.$onProvideScrollToMessage, this.$jumpToAudioSource, this.$onClearHighlightedMessageIndex, this.$onSelectionReply, this.$tabReselectedFlow, this.$composerHeight, this.$bottomPadding, this.$composerHeightPx, this.$chatBackground, this.$listItems$delegate, this.$isPrimaryThread, this.$threadId, this.$listRenderReady$delegate, this.$uiState$delegate, this.$scrollToMessage$delegate), 569690671), bfm, 54);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(HatchConversationViewModel hatchConversationViewModel, HatchConversationContentKt$HatchConversationContent$hideKeyboardOnScrollConnection$1$1 hatchConversationContentKt$HatchConversationContent$hideKeyboardOnScrollConnection$1$1, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, StartupRenderCallback startupRenderCallback, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, float f, G0U<? super String, Unit> g0u, long j, long j2, boolean z, HighlightRequest highlightRequest, Function0<Unit> function04, Function0<Unit> function05, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super G0U<? super String, Unit>, Unit> g0u4, G0V<? super String, ? super String, Unit> g0v2, Function0<Unit> function06, G0U<? super HatchMessageUiModel, Unit> g0u5, C20Q<Unit> c20q, float f2, long j3, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo, boolean z2, String str, MutableState<Boolean> mutableState, C1BO<HatchConversationUiState> c1bo2, MutableState<G0U<String, Unit>> mutableState2) {
            super(3);
            this.$viewModel = hatchConversationViewModel;
            this.$hideKeyboardOnScrollConnection = hatchConversationContentKt$HatchConversationContent$hideKeyboardOnScrollConnection$1$1;
            this.$emptyContent = g0v;
            this.$clearFocusOnTap = bRg;
            this.$conversationRender = startupRenderCallback;
            this.$onViewFinished = function0;
            this.$onFirstConversationContentDrawn = function02;
            this.$onFirstChatViewFinished = function03;
            this.$topPadding = f;
            this.$onRichFormatOpenCTAClick = g0u;
            this.$userBubbleColor = j;
            this.$userTextColor = j2;
            this.$isMainTab = z;
            this.$highlightRequest = highlightRequest;
            this.$onDeeplinkConsumed = function04;
            this.$onHighlightConsumed = function05;
            this.$onArtifactVisible = g0u2;
            this.$onMediaDeleted = g0u3;
            this.$onProvideScrollToMessage = g0u4;
            this.$jumpToAudioSource = g0v2;
            this.$onClearHighlightedMessageIndex = function06;
            this.$onSelectionReply = g0u5;
            this.$tabReselectedFlow = c20q;
            this.$bottomPadding = f2;
            this.$chatBackground = j3;
            this.$listItems$delegate = c1bo;
            this.$isPrimaryThread = z2;
            this.$threadId = str;
            this.$listRenderReady$delegate = mutableState;
            this.$uiState$delegate = c1bo2;
            this.$scrollToMessage$delegate = mutableState2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, BFM bfm, Integer num2) {
            invoke(AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
            return Unit.INSTANCE;
        }

        public final void invoke(int i, BFM bfm, int i2) {
            int iA0D = i2;
            if ((i2 & 6) == 0) {
                iA0D = i2 | AnonymousClass004.A0D(bfm, i);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0D), bfm, iA0D)) {
                float fA00 = C0wg.A00(bfm, i);
                float fA002 = fA00 + C06G.A00(bfm);
                AKJ akjA02 = C1DG.A02(HatchMessageLongPressMenuHostKt.LocalMessageActionMenuBottomBoundary, fA002);
                AKH<GenericListSelectionDelegate> akh = LocalGenericListSelectionsKt.LocalGenericListSelections;
                HatchConversationViewModel hatchConversationViewModel = this.$viewModel;
                AnonymousClass003.A0p(bfm, new AnonymousClass1(this.$hideKeyboardOnScrollConnection, this.$emptyContent, this.$clearFocusOnTap, this.$conversationRender, this.$onViewFinished, this.$onFirstConversationContentDrawn, this.$onFirstChatViewFinished, this.$topPadding, fA002, hatchConversationViewModel, this.$onRichFormatOpenCTAClick, this.$userBubbleColor, this.$userTextColor, this.$isMainTab, this.$highlightRequest, this.$onDeeplinkConsumed, this.$onHighlightConsumed, this.$onArtifactVisible, this.$onMediaDeleted, this.$onProvideScrollToMessage, this.$jumpToAudioSource, this.$onClearHighlightedMessageIndex, this.$onSelectionReply, this.$tabReselectedFlow, fA00, this.$bottomPadding, i, this.$chatBackground, this.$listItems$delegate, this.$isPrimaryThread, this.$threadId, this.$listRenderReady$delegate, this.$uiState$delegate, this.$scrollToMessage$delegate), new AKJ[]{akjA02, akh.A04(hatchConversationViewModel.genericListSelections)}, 714285691);
                return;
            }
            bfm.Afo();
        }
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationContentKt$HatchConversationContent$8(BRg bRg, long j, float f, boolean z, HatchMessageChannel hatchMessageChannel, float f2, HatchConversationViewModel hatchConversationViewModel, boolean z2, C1C3 c1c3, UiSuggestion uiSuggestion, HatchSuggestionLabels.LabelResources labelResources, C1BO<HatchConversationUiState> c1bo, String str, BRg bRg2, HatchSidePanelController hatchSidePanelController, long j2, long j3, boolean z3, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super C3Hd, Unit> g0u, Context context, G0U<? super Boolean, Unit> g0u2, String str2, MutableState<String> mutableState, MutableState<G0U<String, Unit>> mutableState2, HatchConversationContentKt$HatchConversationContent$hideKeyboardOnScrollConnection$1$1 hatchConversationContentKt$HatchConversationContent$hideKeyboardOnScrollConnection$1$1, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg3, StartupRenderCallback startupRenderCallback, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, float f3, G0U<? super String, Unit> g0u3, boolean z4, HighlightRequest highlightRequest, Function0<Unit> function07, Function0<Unit> function08, G0U<? super String, Unit> g0u4, G0U<? super String, Unit> g0u5, G0U<? super G0U<? super String, Unit>, Unit> g0u6, G0V<? super String, ? super String, Unit> g0v2, Function0<Unit> function09, G0U<? super HatchMessageUiModel, Unit> g0u7, C20Q<Unit> c20q, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo2, MutableState<Boolean> mutableState3) {
        super(2);
        this.$modifier = bRg;
        this.$chatBackground = j;
        this.$consumedBottom = f;
        this.$isReadOnly = z;
        this.$channel = hatchMessageChannel;
        this.$bottomPadding = f2;
        this.$viewModel = hatchConversationViewModel;
        this.$isPrimaryThread = z2;
        this.$keyboardController = c1c3;
        this.$pendingSuggestion = uiSuggestion;
        this.$suggestionResources = labelResources;
        this.$uiState$delegate = c1bo;
        this.$composerHintText = str;
        this.$composerModifier = bRg2;
        this.$sidePanelController = hatchSidePanelController;
        this.$userBubbleColor = j2;
        this.$userTextColor = j3;
        this.$isMicAvailable = z3;
        this.$onGalleryClick = function0;
        this.$launchCamera = function02;
        this.$onFilesClick = function03;
        this.$launchVisualMediaPicker = g0u;
        this.$context = context;
        this.$onMicClick = g0u2;
        this.$threadId = str2;
        this.$composerAnimatedHint$delegate = mutableState;
        this.$scrollToMessage$delegate = mutableState2;
        this.$hideKeyboardOnScrollConnection = hatchConversationContentKt$HatchConversationContent$hideKeyboardOnScrollConnection$1$1;
        this.$emptyContent = g0v;
        this.$clearFocusOnTap = bRg3;
        this.$conversationRender = startupRenderCallback;
        this.$onViewFinished = function04;
        this.$onFirstConversationContentDrawn = function05;
        this.$onFirstChatViewFinished = function06;
        this.$topPadding = f3;
        this.$onRichFormatOpenCTAClick = g0u3;
        this.$isMainTab = z4;
        this.$highlightRequest = highlightRequest;
        this.$onDeeplinkConsumed = function07;
        this.$onHighlightConsumed = function08;
        this.$onArtifactVisible = g0u4;
        this.$onMediaDeleted = g0u5;
        this.$onProvideScrollToMessage = g0u6;
        this.$jumpToAudioSource = g0v2;
        this.$onClearHighlightedMessageIndex = function09;
        this.$onSelectionReply = g0u7;
        this.$tabReselectedFlow = c20q;
        this.$listItems$delegate = c1bo2;
        this.$listRenderReady$delegate = mutableState3;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            BRg bRgA01 = C1b8.A01(AnonymousClass001.A0T(this.$modifier), this.$chatBackground);
            float f = this.$consumedBottom;
            final C1DP c1dp = new C1DP(0.0f, 0.0f, 0.0f, f);
            final G0U<ASF, Unit> g0u = AbstractC2139Az7.A00;
            HatchConversationContentKt.HatchConversationComposerLayout(HatchTabBarPaddingKt.m2329hatchTabImePaddingziNgDLE(bRgA01.then(new Ab8<C3Tz>(c1dp, g0u) { // from class: X.3U0
                public final C3TQ A00;
                public final G0U<ASF, Unit> A01;

                @Override // X.Ab8
                public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
                    C3TQ c3tq = this.A00;
                    C3Tz c3Tz = new C3Tz();
                    c3Tz.A00 = c3tq;
                    return c3Tz;
                }

                @Override // X.Ab8
                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (obj instanceof C3U0) {
                        return C7384Etj.areEqual(((C3U0) obj).A00, this.A00);
                    }
                    return false;
                }

                @Override // X.Ab8
                public final int hashCode() {
                    return this.A00.hashCode();
                }

                @Override // X.Ab8
                public final void inspectableProperties(ASF asf) {
                    this.A01.invoke(asf);
                }

                @Override // X.Ab8
                public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
                    C3Tz c3Tz = (C3Tz) abstractC1439Aj8;
                    C3TQ c3tq = this.A00;
                    if (C7384Etj.areEqual(c3tq, c3Tz.A00)) {
                        return;
                    }
                    c3Tz.A00 = c3tq;
                    c3Tz.A01();
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.A00 = c1dp;
                    this.A01 = g0u;
                }
            }), f, bfm, 0), B1V.A00(bfm, new AnonymousClass1(this.$isReadOnly, this.$channel, this.$bottomPadding, this.$viewModel, this.$isPrimaryThread, this.$keyboardController, this.$pendingSuggestion, this.$suggestionResources, this.$uiState$delegate, this.$composerHintText, this.$composerModifier, this.$sidePanelController, this.$userBubbleColor, this.$userTextColor, this.$isMicAvailable, this.$onGalleryClick, this.$launchCamera, this.$onFilesClick, this.$launchVisualMediaPicker, this.$context, this.$onMicClick, this.$threadId, this.$composerAnimatedHint$delegate, this.$scrollToMessage$delegate), -1023690349), B1V.A00(bfm, new AnonymousClass2(this.$viewModel, this.$hideKeyboardOnScrollConnection, this.$emptyContent, this.$clearFocusOnTap, this.$conversationRender, this.$onViewFinished, this.$onFirstConversationContentDrawn, this.$onFirstChatViewFinished, this.$topPadding, this.$onRichFormatOpenCTAClick, this.$userBubbleColor, this.$userTextColor, this.$isMainTab, this.$highlightRequest, this.$onDeeplinkConsumed, this.$onHighlightConsumed, this.$onArtifactVisible, this.$onMediaDeleted, this.$onProvideScrollToMessage, this.$jumpToAudioSource, this.$onClearHighlightedMessageIndex, this.$onSelectionReply, this.$tabReselectedFlow, this.$bottomPadding, this.$chatBackground, this.$listItems$delegate, this.$isPrimaryThread, this.$threadId, this.$listRenderReady$delegate, this.$uiState$delegate, this.$scrollToMessage$delegate), -876650693), bfm, 432, 0);
            return;
        }
        bfm.Afo();
    }
}
