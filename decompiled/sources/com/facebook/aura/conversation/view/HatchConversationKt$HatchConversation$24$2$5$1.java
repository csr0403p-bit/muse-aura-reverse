package com.facebook.aura.conversation.view;

import X.ADq;
import X.AHD;
import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C0CD;
import X.C1BO;
import X.C1D8;
import X.C3U4;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.conversation.widget.api.ConversationTimelineContent;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.identity.provider.HatchConversationTheme;
import com.facebook.aura.model.HatchContentViewModelData;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.model.HatchSendMessage;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$24$2$5$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ MutableState<String> $activeHighlightId$delegate;
    public final /* synthetic */ C1BO<String> $agentNameState;
    public final /* synthetic */ String $approvalSessionId;
    public final /* synthetic */ AT5<Float, AOW> $highlightGlowAlpha;
    public final /* synthetic */ HatchConversationListItem.Message $lastMessage;
    public final /* synthetic */ ADq $latestResponseRange;
    public final /* synthetic */ AHD<HatchConversationListItem> $listItems;
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
    public final /* synthetic */ PresentationEntryTracker $presentationEntryTracker;
    public final /* synthetic */ C1BO<Set<String>> $reactionEffectMessageIds;
    public final /* synthetic */ String $sideChatSessionId;
    public final /* synthetic */ C1BO<AHD<ConversationTimelineContent>> $timelineContents$delegate;
    public final /* synthetic */ HatchConversationUiState $uiState;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        final AHD<HatchConversationListItem> ahd = this.$listItems;
        final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        final HatchConversationListItem.Message message = this.$lastMessage;
        final ADq aDq = this.$latestResponseRange;
        final PresentationEntryTracker presentationEntryTracker = this.$presentationEntryTracker;
        final C1BO<Set<String>> c1bo = this.$reactionEffectMessageIds;
        final String str = this.$sideChatSessionId;
        final HatchConversationUiState hatchConversationUiState = this.$uiState;
        final AT5<Float, AOW> at5 = this.$highlightGlowAlpha;
        final C1BO<String> c1bo2 = this.$agentNameState;
        final G0U<HatchContentViewModelData, Unit> g0u = this.$onRichFormatOpenCTAClick;
        final G0U<String, Unit> g0u2 = this.$onArtifactVisible;
        final G0U<String, Unit> g0u3 = this.$onMediaDeleted;
        final G0U<ContentItem, Unit> g0u4 = this.$onImageCopy;
        final G0U<String, Unit> g0u5 = this.$onScrollToMessage;
        final G0U<String, Unit> g0u6 = this.$onFirstTokenRendered;
        final G0U<String, Unit> g0u7 = this.$onRetry;
        final G0U<HatchSendMessage, Unit> g0u8 = this.$onWidgetSendMessage;
        final G0W<String, String, String, Unit> g0w = this.$onWidgetSetState;
        final Function0<Unit> function0 = this.$onFocusComposer;
        final G0U<String, Integer> g0u9 = this.$onGetWidgetHeight;
        final G0V<String, Integer, Unit> g0v = this.$onSetWidgetHeight;
        final G0U<HatchMessageUiModel, Unit> g0u10 = this.$onSelectionReply;
        final String str2 = this.$approvalSessionId;
        final MutableState<String> mutableState = this.$activeHighlightId$delegate;
        c0cd.APL(anonymousClass1 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$24$2$5$1$invoke$$inlined$itemsIndexed$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0n(Integer.valueOf(i), ahd, anonymousClass1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$24$2$5$1$invoke$$inlined$itemsIndexed$2
            public final Object invoke(int i) {
                HatchConversationListItem hatchConversationListItem = (HatchConversationListItem) ahd.get(i);
                if (hatchConversationListItem instanceof HatchConversationListItem.Message) {
                    return HatchConversationScrollingKt.messageContentType(((HatchConversationListItem.Message) hatchConversationListItem).message);
                }
                if (hatchConversationListItem instanceof HatchConversationListItem.TypingCursor) {
                    return "cursor";
                }
                if (hatchConversationListItem instanceof HatchConversationListItem.TimestampMarker) {
                    return "timestamp";
                }
                if (hatchConversationListItem instanceof HatchConversationListItem.AgentPermissionRequest) {
                    return "agent_permission";
                }
                throw new NoWhenBranchMatchedException();
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$24$2$5$1$invoke$$inlined$itemsIndexed$3
            /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(X.AnonymousClass037 r37, int r38, X.BFM r39, int r40) {
                /*
                    Method dump skipped, instructions count: 579
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$24$2$5$1$invoke$$inlined$itemsIndexed$3.invoke(X.037, int, X.BFM, int):void");
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996, true), ahd.size());
        final AHD<ConversationTimelineContent> value = this.$timelineContents$delegate.getValue();
        final AnonymousClass4 anonymousClass4 = AnonymousClass4.INSTANCE;
        final HatchConversationUiState hatchConversationUiState2 = this.$uiState;
        c0cd.APL(anonymousClass4 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$24$2$5$1$invoke$$inlined$itemsIndexed$4
            public final Object invoke(int i) {
                return AnonymousClass006.A0n(Integer.valueOf(i), value, anonymousClass4, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$24$2$5$1$invoke$$inlined$itemsIndexed$5
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                value.get(AnonymousClass001.A0F(num));
                return "contribution";
            }

            public final Object invoke(int i) {
                value.get(i);
                return "contribution";
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$24$2$5$1$invoke$$inlined$itemsIndexed$6
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, anonymousClass037) : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                ConversationTimelineContent conversationTimelineContent = (ConversationTimelineContent) value.get(i);
                bfm.AgE(-1328047974);
                BRg bRgM636bubbleMaxWidthrAjV9yQ = HatchMessageBubbleKt.m636bubbleMaxWidthrAjV9yQ(C3U4.A0C(BRg.A00, 16.0f, 16.0f, 16.0f, 0.0f), 0.0f, bfm, 0, 1);
                long jBubbleBackground = HatchMessageBubbleKt.bubbleBackground(HatchMessageRole.AGENT, hatchConversationUiState2.conversationTheme, bfm, (HatchConversationTheme.$stable << 3) | 6);
                float f = AnonymousClass002.A0d(bfm).bubbleCornerRadius;
                conversationTimelineContent.mo719RenderiJQMabo(bRgM636bubbleMaxWidthrAjV9yQ, jBubbleBackground, C1D8.A01(f, f, f, f), bfm, 0);
                AnonymousClass001.A1D(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996, true), value.size());
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$24$2$5$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<Integer, ConversationTimelineContent, Object> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, ConversationTimelineContent conversationTimelineContent) {
            return invoke(AnonymousClass001.A0F(num), conversationTimelineContent);
        }

        public final Object invoke(int i, ConversationTimelineContent conversationTimelineContent) {
            C7384Etj.A0Y(conversationTimelineContent, 1);
            return FGI.A0M("contribution:", conversationTimelineContent.getKey());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationKt$HatchConversation$24$2$5$1(AHD<? extends HatchConversationListItem> ahd, HatchConversationListItem.Message message, ADq aDq, PresentationEntryTracker presentationEntryTracker, C1BO<? extends Set<String>> c1bo, String str, HatchConversationUiState hatchConversationUiState, AT5<Float, AOW> at5, C1BO<String> c1bo2, G0U<? super HatchContentViewModelData, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super ContentItem, Unit> g0u4, G0U<? super String, Unit> g0u5, G0U<? super String, Unit> g0u6, G0U<? super String, Unit> g0u7, G0U<? super HatchSendMessage, Unit> g0u8, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function0, G0U<? super String, Integer> g0u9, G0V<? super String, ? super Integer, Unit> g0v, G0U<? super HatchMessageUiModel, Unit> g0u10, String str2, MutableState<String> mutableState, C1BO<? extends AHD<? extends ConversationTimelineContent>> c1bo3) {
        super(1);
        this.$listItems = ahd;
        this.$lastMessage = message;
        this.$latestResponseRange = aDq;
        this.$presentationEntryTracker = presentationEntryTracker;
        this.$reactionEffectMessageIds = c1bo;
        this.$sideChatSessionId = str;
        this.$uiState = hatchConversationUiState;
        this.$highlightGlowAlpha = at5;
        this.$agentNameState = c1bo2;
        this.$onRichFormatOpenCTAClick = g0u;
        this.$onArtifactVisible = g0u2;
        this.$onMediaDeleted = g0u3;
        this.$onImageCopy = g0u4;
        this.$onScrollToMessage = g0u5;
        this.$onFirstTokenRendered = g0u6;
        this.$onRetry = g0u7;
        this.$onWidgetSendMessage = g0u8;
        this.$onWidgetSetState = g0w;
        this.$onFocusComposer = function0;
        this.$onGetWidgetHeight = g0u9;
        this.$onSetWidgetHeight = g0v;
        this.$onSelectionReply = g0u10;
        this.$approvalSessionId = str2;
        this.$activeHighlightId$delegate = mutableState;
        this.$timelineContents$delegate = c1bo3;
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$24$2$5$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Integer, HatchConversationListItem, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        public final Object invoke(int i, HatchConversationListItem hatchConversationListItem) {
            C7384Etj.A0Y(hatchConversationListItem, 1);
            return hatchConversationListItem.getKey();
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, HatchConversationListItem hatchConversationListItem) {
            AnonymousClass005.A0w(num);
            HatchConversationListItem hatchConversationListItem2 = hatchConversationListItem;
            C7384Etj.A0Y(hatchConversationListItem2, 1);
            return hatchConversationListItem2.getKey();
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
