package com.facebook.aura.conversation.view;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C0A8;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1D8;
import X.C1YD;
import X.C1YL;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.conversation.viewmodel.ReplyAttributionUiModel;
import com.facebook.aura.explore.view.cards.IdeaCardPreviewImageKt;
import com.facebook.aura.explore.view.cards.IdeaCardsKt;
import com.facebook.aura.explore.view.cards.IdeaIcon;
import com.facebook.aura.explore.view.cards.IdeaPreviewImageUrlsKt;
import com.facebook.aura.feed.model.HatchPendingFeedUnit;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.identity.provider.HatchConversationTheme;
import com.facebook.aura.model.HatchContentViewModelData;
import com.facebook.aura.model.HatchMessageKt;
import com.facebook.aura.model.HatchSendErrorCategory;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.model.IdeaWidgetData;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.FeedScreenKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchMessageItemKt {
    public static final float ReplyBubbleOverlap = 8.0f;
    public static final ConcurrentHashMap<String, String> AgentMessageContentTypes = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> UserMessageContentTypes = new ConcurrentHashMap<>();

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageItemKt$HatchMessageItem$12, reason: invalid class name */
    public final class AnonymousClass12 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<String> $agentName;
        public final /* synthetic */ boolean $allowLivePresentationEntry;
        public final /* synthetic */ HatchConversationTheme $conversationTheme;
        public final /* synthetic */ float $highlightGlowAlpha;
        public final /* synthetic */ HatchMessageUiModel $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
        public final /* synthetic */ G0U<String, Unit> $onFirstTokenRendered;
        public final /* synthetic */ Function0<Unit> $onFocusComposer;
        public final /* synthetic */ G0U<String, Integer> $onGetWidgetHeight;
        public final /* synthetic */ G0U<ContentItem, Unit> $onImageCopy;
        public final /* synthetic */ G0U<String, Unit> $onMediaDeleted;
        public final /* synthetic */ G0U<String, Unit> $onRetry;
        public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;
        public final /* synthetic */ G0U<String, Unit> $onScrollToMessage;
        public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
        public final /* synthetic */ G0V<String, Integer, Unit> $onSetWidgetHeight;
        public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
        public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
        public final /* synthetic */ String $sideChatSessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass12(HatchMessageUiModel hatchMessageUiModel, Function0<String> function0, BRg bRg, HatchConversationTheme hatchConversationTheme, float f, G0U<? super HatchContentViewModelData, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super ContentItem, Unit> g0u4, G0U<? super String, Unit> g0u5, G0U<? super String, Unit> g0u6, G0U<? super String, Unit> g0u7, G0U<? super HatchSendMessage, Unit> g0u8, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function02, G0U<? super String, Integer> g0u9, G0V<? super String, ? super Integer, Unit> g0v, G0U<? super HatchMessageUiModel, Unit> g0u10, String str, boolean z, int i, int i2, int i3) {
            super(2);
            this.$message = hatchMessageUiModel;
            this.$agentName = function0;
            this.$modifier = bRg;
            this.$conversationTheme = hatchConversationTheme;
            this.$highlightGlowAlpha = f;
            this.$onRichFormatOpenCTAClick = g0u;
            this.$onArtifactVisible = g0u2;
            this.$onMediaDeleted = g0u3;
            this.$onImageCopy = g0u4;
            this.$onScrollToMessage = g0u5;
            this.$onFirstTokenRendered = g0u6;
            this.$onRetry = g0u7;
            this.$onWidgetSendMessage = g0u8;
            this.$onWidgetSetState = g0w;
            this.$onFocusComposer = function02;
            this.$onGetWidgetHeight = g0u9;
            this.$onSetWidgetHeight = g0v;
            this.$onSelectionReply = g0u10;
            this.$sideChatSessionId = str;
            this.$allowLivePresentationEntry = z;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageItemKt.HatchMessageItem(this.$message, this.$agentName, this.$modifier, this.$conversationTheme, this.$highlightGlowAlpha, this.$onRichFormatOpenCTAClick, this.$onArtifactVisible, this.$onMediaDeleted, this.$onImageCopy, this.$onScrollToMessage, this.$onFirstTokenRendered, this.$onRetry, this.$onWidgetSendMessage, this.$onWidgetSetState, this.$onFocusComposer, this.$onGetWidgetHeight, this.$onSetWidgetHeight, this.$onSelectionReply, this.$sideChatSessionId, this.$allowLivePresentationEntry, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageItemKt$HatchMessageItem$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<String> $agentName;
        public final /* synthetic */ boolean $allowLivePresentationEntry;
        public final /* synthetic */ HatchConversationTheme $conversationTheme;
        public final /* synthetic */ float $highlightGlowAlpha;
        public final /* synthetic */ HatchMessageUiModel $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
        public final /* synthetic */ G0U<String, Unit> $onFirstTokenRendered;
        public final /* synthetic */ Function0<Unit> $onFocusComposer;
        public final /* synthetic */ G0U<String, Integer> $onGetWidgetHeight;
        public final /* synthetic */ G0U<ContentItem, Unit> $onImageCopy;
        public final /* synthetic */ G0U<String, Unit> $onMediaDeleted;
        public final /* synthetic */ G0U<String, Unit> $onRetry;
        public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;
        public final /* synthetic */ G0U<String, Unit> $onScrollToMessage;
        public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
        public final /* synthetic */ G0V<String, Integer, Unit> $onSetWidgetHeight;
        public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
        public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
        public final /* synthetic */ String $sideChatSessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(HatchMessageUiModel hatchMessageUiModel, Function0<String> function0, BRg bRg, HatchConversationTheme hatchConversationTheme, float f, G0U<? super HatchContentViewModelData, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super ContentItem, Unit> g0u4, G0U<? super String, Unit> g0u5, G0U<? super String, Unit> g0u6, G0U<? super String, Unit> g0u7, G0U<? super HatchSendMessage, Unit> g0u8, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function02, G0U<? super String, Integer> g0u9, G0V<? super String, ? super Integer, Unit> g0v, G0U<? super HatchMessageUiModel, Unit> g0u10, String str, boolean z, int i, int i2, int i3) {
            super(2);
            this.$message = hatchMessageUiModel;
            this.$agentName = function0;
            this.$modifier = bRg;
            this.$conversationTheme = hatchConversationTheme;
            this.$highlightGlowAlpha = f;
            this.$onRichFormatOpenCTAClick = g0u;
            this.$onArtifactVisible = g0u2;
            this.$onMediaDeleted = g0u3;
            this.$onImageCopy = g0u4;
            this.$onScrollToMessage = g0u5;
            this.$onFirstTokenRendered = g0u6;
            this.$onRetry = g0u7;
            this.$onWidgetSendMessage = g0u8;
            this.$onWidgetSetState = g0w;
            this.$onFocusComposer = function02;
            this.$onGetWidgetHeight = g0u9;
            this.$onSetWidgetHeight = g0v;
            this.$onSelectionReply = g0u10;
            this.$sideChatSessionId = str;
            this.$allowLivePresentationEntry = z;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageItemKt.HatchMessageItem(this.$message, this.$agentName, this.$modifier, this.$conversationTheme, this.$highlightGlowAlpha, this.$onRichFormatOpenCTAClick, this.$onArtifactVisible, this.$onMediaDeleted, this.$onImageCopy, this.$onScrollToMessage, this.$onFirstTokenRendered, this.$onRetry, this.$onWidgetSendMessage, this.$onWidgetSetState, this.$onFocusComposer, this.$onGetWidgetHeight, this.$onSetWidgetHeight, this.$onSelectionReply, this.$sideChatSessionId, this.$allowLivePresentationEntry, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageItemKt$HatchMessageItem$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<String> $agentName;
        public final /* synthetic */ boolean $allowLivePresentationEntry;
        public final /* synthetic */ HatchConversationTheme $conversationTheme;
        public final /* synthetic */ float $highlightGlowAlpha;
        public final /* synthetic */ HatchMessageUiModel $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
        public final /* synthetic */ G0U<String, Unit> $onFirstTokenRendered;
        public final /* synthetic */ Function0<Unit> $onFocusComposer;
        public final /* synthetic */ G0U<String, Integer> $onGetWidgetHeight;
        public final /* synthetic */ G0U<ContentItem, Unit> $onImageCopy;
        public final /* synthetic */ G0U<String, Unit> $onMediaDeleted;
        public final /* synthetic */ G0U<String, Unit> $onRetry;
        public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;
        public final /* synthetic */ G0U<String, Unit> $onScrollToMessage;
        public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
        public final /* synthetic */ G0V<String, Integer, Unit> $onSetWidgetHeight;
        public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
        public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
        public final /* synthetic */ String $sideChatSessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(HatchMessageUiModel hatchMessageUiModel, Function0<String> function0, BRg bRg, HatchConversationTheme hatchConversationTheme, float f, G0U<? super HatchContentViewModelData, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super ContentItem, Unit> g0u4, G0U<? super String, Unit> g0u5, G0U<? super String, Unit> g0u6, G0U<? super String, Unit> g0u7, G0U<? super HatchSendMessage, Unit> g0u8, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function02, G0U<? super String, Integer> g0u9, G0V<? super String, ? super Integer, Unit> g0v, G0U<? super HatchMessageUiModel, Unit> g0u10, String str, boolean z, int i, int i2, int i3) {
            super(2);
            this.$message = hatchMessageUiModel;
            this.$agentName = function0;
            this.$modifier = bRg;
            this.$conversationTheme = hatchConversationTheme;
            this.$highlightGlowAlpha = f;
            this.$onRichFormatOpenCTAClick = g0u;
            this.$onArtifactVisible = g0u2;
            this.$onMediaDeleted = g0u3;
            this.$onImageCopy = g0u4;
            this.$onScrollToMessage = g0u5;
            this.$onFirstTokenRendered = g0u6;
            this.$onRetry = g0u7;
            this.$onWidgetSendMessage = g0u8;
            this.$onWidgetSetState = g0w;
            this.$onFocusComposer = function02;
            this.$onGetWidgetHeight = g0u9;
            this.$onSetWidgetHeight = g0v;
            this.$onSelectionReply = g0u10;
            this.$sideChatSessionId = str;
            this.$allowLivePresentationEntry = z;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageItemKt.HatchMessageItem(this.$message, this.$agentName, this.$modifier, this.$conversationTheme, this.$highlightGlowAlpha, this.$onRichFormatOpenCTAClick, this.$onArtifactVisible, this.$onMediaDeleted, this.$onImageCopy, this.$onScrollToMessage, this.$onFirstTokenRendered, this.$onRetry, this.$onWidgetSendMessage, this.$onWidgetSetState, this.$onFocusComposer, this.$onGetWidgetHeight, this.$onSetWidgetHeight, this.$onSelectionReply, this.$sideChatSessionId, this.$allowLivePresentationEntry, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageItemKt$HatchMessageItem$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<String> $agentName;
        public final /* synthetic */ boolean $allowLivePresentationEntry;
        public final /* synthetic */ HatchConversationTheme $conversationTheme;
        public final /* synthetic */ float $highlightGlowAlpha;
        public final /* synthetic */ HatchMessageUiModel $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
        public final /* synthetic */ G0U<String, Unit> $onFirstTokenRendered;
        public final /* synthetic */ Function0<Unit> $onFocusComposer;
        public final /* synthetic */ G0U<String, Integer> $onGetWidgetHeight;
        public final /* synthetic */ G0U<ContentItem, Unit> $onImageCopy;
        public final /* synthetic */ G0U<String, Unit> $onMediaDeleted;
        public final /* synthetic */ G0U<String, Unit> $onRetry;
        public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;
        public final /* synthetic */ G0U<String, Unit> $onScrollToMessage;
        public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
        public final /* synthetic */ G0V<String, Integer, Unit> $onSetWidgetHeight;
        public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
        public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
        public final /* synthetic */ String $sideChatSessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(HatchMessageUiModel hatchMessageUiModel, Function0<String> function0, BRg bRg, HatchConversationTheme hatchConversationTheme, float f, G0U<? super HatchContentViewModelData, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super ContentItem, Unit> g0u4, G0U<? super String, Unit> g0u5, G0U<? super String, Unit> g0u6, G0U<? super String, Unit> g0u7, G0U<? super HatchSendMessage, Unit> g0u8, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function02, G0U<? super String, Integer> g0u9, G0V<? super String, ? super Integer, Unit> g0v, G0U<? super HatchMessageUiModel, Unit> g0u10, String str, boolean z, int i, int i2, int i3) {
            super(2);
            this.$message = hatchMessageUiModel;
            this.$agentName = function0;
            this.$modifier = bRg;
            this.$conversationTheme = hatchConversationTheme;
            this.$highlightGlowAlpha = f;
            this.$onRichFormatOpenCTAClick = g0u;
            this.$onArtifactVisible = g0u2;
            this.$onMediaDeleted = g0u3;
            this.$onImageCopy = g0u4;
            this.$onScrollToMessage = g0u5;
            this.$onFirstTokenRendered = g0u6;
            this.$onRetry = g0u7;
            this.$onWidgetSendMessage = g0u8;
            this.$onWidgetSetState = g0w;
            this.$onFocusComposer = function02;
            this.$onGetWidgetHeight = g0u9;
            this.$onSetWidgetHeight = g0v;
            this.$onSelectionReply = g0u10;
            this.$sideChatSessionId = str;
            this.$allowLivePresentationEntry = z;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageItemKt.HatchMessageItem(this.$message, this.$agentName, this.$modifier, this.$conversationTheme, this.$highlightGlowAlpha, this.$onRichFormatOpenCTAClick, this.$onArtifactVisible, this.$onMediaDeleted, this.$onImageCopy, this.$onScrollToMessage, this.$onFirstTokenRendered, this.$onRetry, this.$onWidgetSendMessage, this.$onWidgetSetState, this.$onFocusComposer, this.$onGetWidgetHeight, this.$onSetWidgetHeight, this.$onSelectionReply, this.$sideChatSessionId, this.$allowLivePresentationEntry, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageItemKt$HatchMessageItem$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<String> $agentName;
        public final /* synthetic */ boolean $allowLivePresentationEntry;
        public final /* synthetic */ HatchConversationTheme $conversationTheme;
        public final /* synthetic */ boolean $hasStandalonePresentations;
        public final /* synthetic */ boolean $hasStandaloneWidgets;
        public final /* synthetic */ float $highlightGlowAlpha;
        public final /* synthetic */ G2j<AHD<String>, Boolean, BFM, Integer, Unit> $inBubbleTokenContent;
        public final /* synthetic */ InlineContentCallbacks $inlineCallbacks;
        public final /* synthetic */ HatchMessageUiModel $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0U<String, Unit> $onFirstTokenRendered;
        public final /* synthetic */ Function0<Unit> $onFocusComposer;
        public final /* synthetic */ G0U<String, Integer> $onGetWidgetHeight;
        public final /* synthetic */ G0U<String, Unit> $onRetry;
        public final /* synthetic */ G0U<String, Unit> $onScrollToMessage;
        public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
        public final /* synthetic */ G0V<String, Integer, Unit> $onSetWidgetHeight;
        public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
        public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
        public final /* synthetic */ ReplyAttributionUiModel $resolvedAttribution;
        public final /* synthetic */ boolean $shouldRenderBubble;
        public final /* synthetic */ String $sideChatSessionId;
        public final /* synthetic */ List<HatchWidgetPresentation> $standalonePresentations;
        public final /* synthetic */ AHD<HatchWidget> $standaloneWidgets;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(BRg bRg, HatchMessageUiModel hatchMessageUiModel, boolean z, G0U<? super String, Unit> g0u, ReplyAttributionUiModel replyAttributionUiModel, boolean z2, boolean z3, AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, G0U<? super String, Unit> g0u2, AHD<HatchWidget> ahd, G0U<? super HatchSendMessage, Unit> g0u3, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function0, G0U<? super String, Integer> g0u4, G0V<? super String, ? super Integer, Unit> g0v, HatchConversationTheme hatchConversationTheme, Function0<String> function02, float f, InlineContentCallbacks inlineContentCallbacks, G0U<? super String, Unit> g0u5, G2j<? super AHD<String>, ? super Boolean, ? super BFM, ? super Integer, Unit> g2j, G0U<? super HatchMessageUiModel, Unit> g0u6, List<HatchWidgetPresentation> list, String str, boolean z4) {
            super(2);
            this.$modifier = bRg;
            this.$message = hatchMessageUiModel;
            this.$hasStandaloneWidgets = z;
            this.$onRetry = g0u;
            this.$resolvedAttribution = replyAttributionUiModel;
            this.$shouldRenderBubble = z2;
            this.$hasStandalonePresentations = z3;
            this.$userSession = abstractC3358CGz;
            this.$navigator = auraNavigator;
            this.$onScrollToMessage = g0u2;
            this.$standaloneWidgets = ahd;
            this.$onWidgetSendMessage = g0u3;
            this.$onWidgetSetState = g0w;
            this.$onFocusComposer = function0;
            this.$onGetWidgetHeight = g0u4;
            this.$onSetWidgetHeight = g0v;
            this.$conversationTheme = hatchConversationTheme;
            this.$agentName = function02;
            this.$highlightGlowAlpha = f;
            this.$inlineCallbacks = inlineContentCallbacks;
            this.$onFirstTokenRendered = g0u5;
            this.$inBubbleTokenContent = g2j;
            this.$onSelectionReply = g0u6;
            this.$standalonePresentations = list;
            this.$sideChatSessionId = str;
            this.$allowLivePresentationEntry = z4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01f7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.BFM r39, int r40) {
            /*
                Method dump skipped, instructions count: 672
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageItemKt.AnonymousClass8.invoke(X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageItemKt$ReplyContextHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isUser;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onTap;
        public final /* synthetic */ IdeaWidgetData $replyIdeaIcon;
        public final /* synthetic */ String $replyLabel;
        public final /* synthetic */ String $replyPreview;
        public final /* synthetic */ String $replyPreviewImageDescription;
        public final /* synthetic */ String $replyPreviewImageUrl;
        public final /* synthetic */ String $replySummary;
        public final /* synthetic */ String $transitionMessageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, boolean z, BRg bRg, Function0<Unit> function0, String str3, String str4, String str5, String str6, IdeaWidgetData ideaWidgetData, int i, int i2) {
            super(2);
            this.$replyPreview = str;
            this.$replyLabel = str2;
            this.$isUser = z;
            this.$modifier = bRg;
            this.$onTap = function0;
            this.$replyPreviewImageUrl = str3;
            this.$replyPreviewImageDescription = str4;
            this.$transitionMessageId = str5;
            this.$replySummary = str6;
            this.$replyIdeaIcon = ideaWidgetData;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageItemKt.ReplyContextHeader(this.$replyPreview, this.$replyLabel, this.$isUser, this.$modifier, this.$onTap, this.$replyPreviewImageUrl, this.$replyPreviewImageDescription, this.$transitionMessageId, this.$replySummary, this.$replyIdeaIcon, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageItemKt$ReplyContextText$2, reason: invalid class name and case insensitive filesystem */
    public final class C114892 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $summary;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114892(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$summary = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageItemKt.ReplyContextText(this.$title, this.$summary, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageItemKt$SendFailedNotice$2, reason: invalid class name and case insensitive filesystem */
    public final class C114902 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchSendErrorCategory $category;
        public final /* synthetic */ boolean $isUser;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114902(BRg bRg, boolean z, HatchSendErrorCategory hatchSendErrorCategory, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$isUser = z;
            this.$category = hatchSendErrorCategory;
            this.$onRetry = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageItemKt.SendFailedNotice(this.$modifier, this.$isUser, this.$category, this.$onRetry, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageItemKt$SendingNotice$2, reason: invalid class name and case insensitive filesystem */
    public final class C114912 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isUser;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ int $textRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114912(BRg bRg, boolean z, int i, int i2, int i3) {
            super(2);
            this.$modifier = bRg;
            this.$isUser = z;
            this.$textRes = i;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageItemKt.SendingNotice(this.$modifier, this.$isUser, this.$textRes, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageItemKt$TimestampLabel$2, reason: invalid class name and case insensitive filesystem */
    public final class C114922 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114922(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$label = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageItemKt.TimestampLabel(this.$label, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = X.AbstractC0878AGe.A0G(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String primaryContentType(X.AHD<? extends com.facebook.aura.model.HatchContentViewModelData> r3) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r3, r0)
            java.util.Iterator r2 = r3.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof com.facebook.aura.model.HatchContentViewModelData.Markdown
            if (r0 != 0) goto L8
            if (r1 != 0) goto L1c
        L18:
            java.lang.Object r1 = X.AbstractC0878AGe.A0G(r3)
        L1c:
            boolean r0 = r1 instanceof com.facebook.aura.model.HatchContentViewModelData.Code
            if (r0 == 0) goto L23
            java.lang.String r0 = "rich:code"
            return r0
        L23:
            boolean r0 = r1 instanceof com.facebook.aura.model.HatchContentViewModelData.Divider
            if (r0 == 0) goto L2a
            java.lang.String r0 = "rich:divider"
            return r0
        L2a:
            boolean r0 = r1 instanceof com.facebook.aura.model.HatchContentViewModelData.EmbeddedFileHTMLContent
            if (r0 == 0) goto L31
            java.lang.String r0 = "rich:html"
            return r0
        L31:
            boolean r0 = r1 instanceof com.facebook.aura.model.HatchContentViewModelData.InlineFile
            if (r0 == 0) goto L38
            java.lang.String r0 = "rich:file"
            return r0
        L38:
            boolean r0 = r1 instanceof com.facebook.aura.model.HatchContentViewModelData.InlineHtml
            if (r0 == 0) goto L3f
            java.lang.String r0 = "rich:html-file"
            return r0
        L3f:
            boolean r0 = r1 instanceof com.facebook.aura.model.HatchContentViewModelData.InlineImage
            if (r0 == 0) goto L46
            java.lang.String r0 = "rich:image"
            return r0
        L46:
            boolean r0 = r1 instanceof com.facebook.aura.model.HatchContentViewModelData.InlineImageGroup
            if (r0 == 0) goto L4d
            java.lang.String r0 = "rich:image-group"
            return r0
        L4d:
            boolean r0 = r1 instanceof com.facebook.aura.model.HatchContentViewModelData.InlineSlides
            if (r0 == 0) goto L54
            java.lang.String r0 = "rich:slides"
            return r0
        L54:
            boolean r0 = r1 instanceof com.facebook.aura.model.HatchContentViewModelData.Markdown
            if (r0 == 0) goto L5b
            java.lang.String r0 = "rich:markdown"
            return r0
        L5b:
            boolean r0 = r1 instanceof com.facebook.aura.model.HatchContentViewModelData.Math
            if (r0 == 0) goto L62
            java.lang.String r0 = "rich:math"
            return r0
        L62:
            boolean r0 = r1 instanceof com.facebook.aura.model.HatchContentViewModelData.MermaidDiagram
            if (r0 == 0) goto L69
            java.lang.String r0 = "rich:mermaid"
            return r0
        L69:
            boolean r0 = r1 instanceof com.facebook.aura.model.HatchContentViewModelData.Table
            if (r0 == 0) goto L70
            java.lang.String r0 = "rich:table"
            return r0
        L70:
            if (r1 != 0) goto L75
            java.lang.String r0 = "rich:empty"
            return r0
        L75:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageItemKt.primaryContentType(X.AHD):java.lang.String");
    }

    public static final int sendFailedTextRes(HatchSendErrorCategory hatchSendErrorCategory) {
        int iOrdinal;
        if (hatchSendErrorCategory == null || (iOrdinal = hatchSendErrorCategory.ordinal()) == -1) {
            return R.string._name_removed__res_0x7f120b7d;
        }
        if (iOrdinal == 0) {
            return R.string._name_removed__res_0x7f120b7a;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        return R.string._name_removed__res_0x7f120b7d;
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchSendErrorCategory.values().length];
            try {
                AnonymousClass002.A13(HatchSendErrorCategory.TRANSPORT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchSendErrorCategory.NON_TRANSPORT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ReplyContextHeader(String str, String str2, boolean z, BRg bRg, Function0<Unit> function0, String str3, String str4, String str5, String str6, IdeaWidgetData ideaWidgetData, BFM bfm, int i, int i2) {
        IdeaWidgetData ideaWidgetData2;
        BRg bRg2 = bRg;
        Function0<Unit> function02 = function0;
        String str7 = str3;
        String str8 = str5;
        String str9 = str6;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(1048047200);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function02);
        }
        int i5 = i2 & 32;
        int iA0i = 196608;
        if (i5 != 0) {
            iA0d |= iA0i;
        } else if ((i & 196608) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, str7);
            iA0d |= iA0i;
        }
        int i6 = i2 & 64;
        int iA0j = 1572864;
        if (i6 != 0) {
            iA0d |= iA0j;
        } else if ((i & 1572864) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, str4);
            iA0d |= iA0j;
        }
        int i7 = i2 & 128;
        int iA0k = 12582912;
        if (i7 != 0) {
            iA0d |= iA0k;
        } else if ((i & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, str8);
            iA0d |= iA0k;
        }
        int i8 = i2 & 256;
        int iA0l = 100663296;
        if (i8 != 0) {
            iA0d |= iA0l;
        } else if ((i & 100663296) == 0) {
            i8 = 0;
            iA0l = AnonymousClass004.A0l(bfm, str9);
            iA0d |= iA0l;
        }
        int i9 = i2 & 512;
        int i10 = 805306368;
        if (i9 != 0) {
            iA0d |= i10;
        } else if ((i & 805306368) == 0) {
            i10 = 268435456;
            if (AnonymousClass004.A1R(bfm, ideaWidgetData, i, 1073741824)) {
                i10 = 536870912;
            }
            iA0d |= i10;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1I(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                function02 = null;
            }
            if (i5 != 0) {
                str7 = null;
            }
            if (i6 != 0) {
                str4 = null;
            }
            if (i7 != 0) {
                str8 = null;
            }
            if (i8 != 0) {
                str9 = null;
            }
            ideaWidgetData2 = i9 == 0 ? ideaWidgetData : null;
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, z ? C2VU.A01 : C2VU.A02, 4.0f, 6);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i11 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i11);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            if (str2 != null) {
                bfm.AgE(33395990);
                C1AC c1ac = C2VU.A04;
                C9m9 c9m9A00 = AcQ.A00(4.0f);
                BRg bRgA07 = C3U4.A07(BRg.A00, 4.0f);
                InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(c9m9A00, bfm, c1ac);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA07);
                AnonymousClass005.A0n(bfm, bbi, function03);
                BPg.A02(bfm, interfaceC1380AiAA0b, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.arrow_big_reply_wght400_outline_24, 0), AuraIconSize.TINY, null, auraColorsA0c.secondaryText, null, bfm, AnonymousClass001.A03(), 41);
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, auraColorsA0c.secondaryText, auraTypographyA0f.footnoteRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16370);
                BBI.A0R(bbi, true);
            } else {
                bfm.AgE(33926648);
            }
            BBI.A0R(bbi, false);
            BS0 bs0 = BRg.A00;
            BRg bRgA08 = C3U4.A08(C1b8.A03(C10G.A0D(HatchSharedElementKt.messageTransition(bs0, str8, "reply", bfm, ((iA0d >> 18) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 390), Float.NaN, 240.0f), C1D8.A00(AnonymousClass002.A0d(bfm).bubbleCornerRadius), auraColorsA0c.bubble).then(function02 != null ? C0v5.A04(bs0, null, null, function02, true) : bs0), 12.0f);
            if (ideaWidgetData2 != null || str7 != null) {
                bfm.AgE(34552321);
                InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 10.0f);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA08);
                AnonymousClass005.A0n(bfm, bbi, function03);
                BPg.A02(bfm, interfaceC1380AiAA0V, g0v);
                BPg.A02(bfm, akqA043, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0vA0u);
                C90m c90m = C90m.A00;
                float f = str9 != null ? 32 : 60;
                if (ideaWidgetData2 != null) {
                    bfm.AgE(1483133793);
                    IdeaCardsKt.m797IdeaIconThumbnail942rkJo(IdeaPreviewImageUrlsKt.rememberIdeaIcon(ideaWidgetData2.ideaId, ideaWidgetData2.iconUrl, ideaWidgetData2.iconMimeType, null, bfm, 0, 8), null, f, null, bfm, IdeaIcon.$stable | 48, 8);
                } else if (str7 != null) {
                    bfm.AgE(1483574179);
                    IdeaCardPreviewImageKt.m795IdeaCardPreviewImageFV1VA1c(str7, C11U.A01(C10G.A07(bs0, f), 12.0f), 0, null, str4, null, bfm, AnonymousClass001.A0B(iA0d >> 6, (iA0d >> 15) & 14), 44);
                } else {
                    bfm.AgE(1483809934);
                }
                BBI.A0R(bbi, false);
                if (C7BY.A0j(str)) {
                    bfm.AgE(1484101582);
                } else {
                    bfm.AgE(1484017975);
                    ReplyContextText(str, str9, AnonymousClass006.A0L(c90m, bs0), bfm, (iA0d & 14) | ((iA0d >> 21) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
                }
                AnonymousClass003.A0q(bbi);
            } else if (C7BY.A0j(str)) {
                bfm.AgE(35889816);
            } else {
                bfm.AgE(35818702);
                ReplyContextText(str, str9, bRgA08, bfm, (iA0d & 14) | ((iA0d >> 21) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
            ideaWidgetData2 = ideaWidgetData;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, z, bRg2, function02, str7, str4, str8, str9, ideaWidgetData2, i, i2);
        }
    }

    public static final void ReplyContextText(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-963354083);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(2.0f), bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C1822Arm c1822Arm = str2 == null ? AnonymousClass006.A0k(bfm, -1996071326).footnoteRegular : AnonymousClass006.A0k(bfm, -1996069599).footnoteMedium;
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A08(bfm), c1822Arm, null, null, null, false, 0, 2, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14834);
            if (str2 == null || C7BY.A0j(str2)) {
                bfm.AgE(-1748220049);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A08(bfm), AnonymousClass006.A0k(bfm, -1748434538).footnoteRegular, null, null, null, false, 0, 2, 2, null, null, null, bfm, ((iA0d >> 3) & 14) | 805306368, 6, 14834);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114892(str, str2, bRg2, i, i2);
        }
    }

    public static final void SendFailedNotice(BRg bRg, boolean z, HatchSendErrorCategory hatchSendErrorCategory, Function0<Unit> function0, BFM bfm, int i, int i2) {
        Function0<Unit> function02;
        BRg bRg2 = bRg;
        boolean z2 = z;
        HatchSendErrorCategory hatchSendErrorCategory2 = hatchSendErrorCategory;
        bfm.AgG(953566308);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, AnonymousClass003.A0K(hatchSendErrorCategory2));
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            if (i5 != 0) {
                hatchSendErrorCategory2 = null;
            }
            function02 = i6 == 0 ? function0 : null;
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraColors auraColorsA0f = AnonymousClass001.A0f(bfm, akh);
            BRg bRgA04 = C3U4.A04(bRg2, 4.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(z2 ? AcQ.A00 : AcQ.A01, bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, sendFailedTextRes(hatchSendErrorCategory2)), null, auraColorsA0f.secondaryText, auraTypographyA0f.footnoteRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BRg bRgA042 = BRg.A00;
            C01N.A09(bfm, bRgA042, 4.0f);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b7e);
            C1822Arm c1822Arm = auraTypographyA0f.footnoteRegular;
            long j = AnonymousClass001.A0f(bfm, akh).accent;
            if (function02 != null) {
                bRgA042 = C0v5.A04(bRgA042, new C1YD(0), null, function02, true);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, bRgA042, j, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
            function02 = function0;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114902(bRg2, z2, hatchSendErrorCategory2, function02, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SendingNotice(X.BRg r29, boolean r30, int r31, X.BFM r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageItemKt.SendingNotice(X.BRg, boolean, int, X.BFM, int, int):void");
    }

    public static final void TimestampLabel(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1600028780);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1822Arm c1822ArmA0S = C06G.A0S(bfm);
            long jA08 = C06G.A08(bfm);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchMessageItemKt$TimestampLabel$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRg2, objAaT, false), jA08, c1822ArmA0S, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114922(str, bRg2, i, i2);
        }
    }

    public static final ConcurrentHashMap<String, String> getAgentMessageContentTypes() {
        return AgentMessageContentTypes;
    }

    public static final float getReplyBubbleOverlap() {
        return ReplyBubbleOverlap;
    }

    public static final ConcurrentHashMap<String, String> getUserMessageContentTypes() {
        return UserMessageContentTypes;
    }

    public static final void logSendRetryClick(HatchMessageUiModel hatchMessageUiModel, String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchInteractionEnumsKt.chatScreen(AnonymousClass002.A1Y(str)), HatchComponent.RETRY_BUTTON, null, HatchInteractionEnumsKt.chatThreadLogMetadata(AnonymousClass002.A1Y(str), str, null, AnonymousClass006.A10(HatchMetadataKey.MESSAGE_ROLE.getValue(), HatchMessageKt.getAnalyticsValue(hatchMessageUiModel.role))), null);
    }

    public static final void openFeedUnitFromAttribution(AuraNavigator auraNavigator, ReplyAttributionUiModel.FeedUnit feedUnit) {
        AnonymousClass003.A0u(auraNavigator, feedUnit);
        if (HatchUtil.INSTANCE.isFeedEnabled()) {
            HatchPendingFeedUnit.INSTANCE.publish(feedUnit.unitId);
            auraNavigator.navigate(FeedScreenKey.INSTANCE, LaunchFlag.BRING_TO_FRONT);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d4 A[PHI: r50
  0x03d4: PHI (r50v8 boolean) = (r50v2 boolean), (r50v10 boolean) binds: [B:206:0x042e, B:193:0x03d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchMessageItem(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r61, kotlin.jvm.functions.Function0<java.lang.String> r62, X.BRg r63, com.facebook.aura.identity.provider.HatchConversationTheme r64, float r65, X.G0U<? super com.facebook.aura.model.HatchContentViewModelData, kotlin.Unit> r66, X.G0U<? super java.lang.String, kotlin.Unit> r67, X.G0U<? super java.lang.String, kotlin.Unit> r68, X.G0U<? super com.facebook.aura.file.view.api.ContentItem, kotlin.Unit> r69, X.G0U<? super java.lang.String, kotlin.Unit> r70, X.G0U<? super java.lang.String, kotlin.Unit> r71, X.G0U<? super java.lang.String, kotlin.Unit> r72, X.G0U<? super com.facebook.aura.model.HatchSendMessage, kotlin.Unit> r73, X.G0W<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r74, kotlin.jvm.functions.Function0<kotlin.Unit> r75, X.G0U<? super java.lang.String, java.lang.Integer> r76, X.G0V<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> r77, X.G0U<? super com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, kotlin.Unit> r78, java.lang.String r79, boolean r80, X.BFM r81, int r82, int r83, int r84) {
        /*
            Method dump skipped, instructions count: 2076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageItemKt.HatchMessageItem(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, kotlin.jvm.functions.Function0, X.BRg, com.facebook.aura.identity.provider.HatchConversationTheme, float, X.G0U, X.G0U, X.G0U, X.G0U, X.G0U, X.G0U, X.G0U, X.G0U, X.G0W, kotlin.jvm.functions.Function0, X.G0U, X.G0V, X.G0U, java.lang.String, boolean, X.BFM, int, int, int):void");
    }
}
