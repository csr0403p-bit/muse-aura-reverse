package com.facebook.aura.assist;

import X.AHD;
import X.AXN;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
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
import X.C0yq;
import X.C10G;
import X.C19U;
import X.C1BO;
import X.C1D8;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.FGI;
import X.G0U;
import X.G0W;
import X.G2j;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.conversation.view.HatchAgentIndicatorsKt;
import com.facebook.aura.conversation.view.HatchMessageBubbleKt;
import com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt;
import com.facebook.aura.conversation.view.HatchMessageItemKt;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.conversation.widget.api.ConversationTimelineContent;
import com.facebook.aura.identity.provider.HatchConversationTheme;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.vds.compose.theme.AuraColors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$2$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ C1BO<String> $agentNameState;
    public final /* synthetic */ AuraColors $colors;
    public final /* synthetic */ HatchConversationUiState $convState;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ MutableState<Integer> $frozenHeightPx$delegate;
    public final /* synthetic */ AHD<HatchConversationListItem> $listItems;
    public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
    public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
    public final /* synthetic */ AssistOverlayState $overlayState;
    public final /* synthetic */ C1BO<AHD<ConversationTimelineContent>> $timelineContents$delegate;

    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<ConversationTimelineContent, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Object invoke(ConversationTimelineContent conversationTimelineContent) {
            C7384Etj.A0Y(conversationTimelineContent, 0);
            return FGI.A0M("contribution:", conversationTimelineContent.getKey());
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$2$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<HatchConversationListItem, Object> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(HatchConversationListItem hatchConversationListItem) {
            HatchConversationListItem hatchConversationListItem2 = hatchConversationListItem;
            C7384Etj.A0Y(hatchConversationListItem2, 0);
            return hatchConversationListItem2.getKey();
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HatchConversationListItem hatchConversationListItem) {
            C7384Etj.A0Y(hatchConversationListItem, 0);
            return hatchConversationListItem.getKey();
        }
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$2$1$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ AuraColors $colors;
        public final /* synthetic */ AssistOverlayState $overlayState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(AssistOverlayState assistOverlayState, AuraColors auraColors) {
            super(3);
            this.$overlayState = assistOverlayState;
            this.$colors = auraColors;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, anonymousClass037), bfm, i)) {
                String strA01 = this.$overlayState.errorMessage;
                if (strA01 == null) {
                    bfm.AgE(1061340999);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120172);
                } else {
                    bfm.AgE(1061339170);
                }
                AnonymousClass001.A1D(bfm);
                C0yq.A00(bfm, C3U4.A06(BRg.A00, 6.0f), null, null, null, null, null, null, strA01, null, 0, 0, 0, 3120, 0, 131056, this.$colors.errorText, C19U.A03(14), 0L, 0L, false);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        final AHD<ConversationTimelineContent> value = this.$timelineContents$delegate.getValue();
        final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        final AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        final HatchConversationUiState hatchConversationUiState = this.$convState;
        c0cd.APL(anonymousClass1 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$2$1$invoke$$inlined$items$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(value, anonymousClass1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$2$1$invoke$$inlined$items$2
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(value, anonymousClass2, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$2$1$invoke$$inlined$items$3
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
                bfm.AgE(-2059537583);
                BRg bRgA0B = C3U4.A0B(HatchMessageBubbleKt.m636bubbleMaxWidthrAjV9yQ(BRg.A00, 0.0f, bfm, 6, 1), 0.0f, 6.0f);
                long jBubbleBackground = HatchMessageBubbleKt.bubbleBackground(HatchMessageRole.AGENT, hatchConversationUiState.conversationTheme, bfm, (HatchConversationTheme.$stable << 3) | 6);
                float f = AnonymousClass002.A0d(bfm).bubbleCornerRadius;
                conversationTimelineContent.mo719RenderiJQMabo(bRgA0B, jBubbleBackground, C1D8.A01(f, f, f, f), bfm, 0);
                AnonymousClass001.A1D(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 802480018, true), value.size());
        final AHD<HatchConversationListItem> ahd = this.$listItems;
        final AnonymousClass4 anonymousClass4 = AnonymousClass4.INSTANCE;
        final AXN axn = this.$density;
        final HatchConversationUiState hatchConversationUiState2 = this.$convState;
        final C1BO<String> c1bo = this.$agentNameState;
        final G0U<HatchSendMessage, Unit> g0u = this.$onWidgetSendMessage;
        final G0W<String, String, String, Unit> g0w = this.$onWidgetSetState;
        final MutableState<Integer> mutableState = this.$frozenHeightPx$delegate;
        final HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$2$1$invoke$$inlined$items$default$1 hatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$2$1$invoke$$inlined$items$default$1 = new G0U() { // from class: com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$2$1$invoke$$inlined$items$default$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return null;
            }

            @Override // X.G0U
            public final Void invoke(HatchConversationListItem hatchConversationListItem) {
                return null;
            }
        };
        c0cd.APL(anonymousClass4 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$2$1$invoke$$inlined$items$default$2
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, anonymousClass4, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$2$1$invoke$$inlined$items$default$3
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, hatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$2$1$invoke$$inlined$items$default$1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$2$1$invoke$$inlined$items$default$4
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                BRg bRgA0A;
                BRg bRg;
                int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, anonymousClass037) : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                HatchConversationListItem hatchConversationListItem = (HatchConversationListItem) ahd.get(i);
                bfm.AgE(1673371067);
                if (hatchConversationListItem != AbstractC0878AGe.A0G(ahd) || MutableState.A02(mutableState) <= 0) {
                    bRgA0A = BRg.A00;
                    bRg = bRgA0A;
                } else {
                    bRg = BRg.A00;
                    bRgA0A = C10G.A0A(bRg, Float.NaN, axn.Agy(MutableState.A02(mutableState)));
                }
                if (hatchConversationListItem instanceof HatchConversationListItem.Message) {
                    bfm.AgE(1673718359);
                    HatchConversationListItem.Message message = (HatchConversationListItem.Message) hatchConversationListItem;
                    HatchMessageUiModel hatchMessageUiModel = message.message;
                    HatchConversationTheme hatchConversationTheme = hatchConversationUiState2.conversationTheme;
                    String str = message.key;
                    int i3 = HatchMessageUiModel.$stable;
                    BRg bRgA0B = C3U4.A0B(HatchMessageEntryAnimationsKt.m641messageEntryAnimationhGBTI10(bRg, hatchMessageUiModel, str, 0.0f, false, true, bfm, (i3 << 3) | 224262).then(bRgA0A), 0.0f, 6.0f);
                    boolean zA65 = bfm.A65(c1bo);
                    Object objAaT = bfm.AaT();
                    if (zA65 || objAaT == C78N.A00) {
                        objAaT = new HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$2$1$5$1$1(c1bo);
                        bfm.Ai0(objAaT);
                    }
                    HatchMessageItemKt.HatchMessageItem(hatchMessageUiModel, (Function0) objAaT, bRgA0B, hatchConversationTheme, 0.0f, null, null, null, null, null, null, null, g0u, g0w, null, null, null, null, null, false, bfm, i3 | (HatchConversationTheme.$stable << 9), 0, 1036272);
                } else if (hatchConversationListItem instanceof HatchConversationListItem.TypingCursor) {
                    bfm.AgE(1674664417);
                    HatchAgentIndicatorsKt.m526HatchStreamingCursorKTwxG1Y(HatchMessageBubbleKt.bubbleBackground(HatchMessageRole.AGENT, hatchConversationUiState2.conversationTheme, bfm, (HatchConversationTheme.$stable << 3) | 6), ((HatchConversationListItem.TypingCursor) hatchConversationListItem).activityText, C3U4.A0B(HatchMessageEntryAnimationsKt.streamingCursorEntryAnimation(bRg, bfm, 6), 0.0f, 6.0f), bfm, 0, 0);
                } else {
                    bfm.AgE(1675069556);
                }
                AnonymousClass006.A1M(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 802480018, true), ahd.size());
        AssistOverlayState assistOverlayState = this.$overlayState;
        if (assistOverlayState.phase == AssistOverlayPhase.ERROR) {
            c0cd.APJ("error", null, B1V.A01(new AnonymousClass6(assistOverlayState, this.$colors), -494984426, true));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$2$1(AHD<? extends HatchConversationListItem> ahd, AssistOverlayState assistOverlayState, C1BO<? extends AHD<? extends ConversationTimelineContent>> c1bo, HatchConversationUiState hatchConversationUiState, AXN axn, C1BO<String> c1bo2, G0U<? super HatchSendMessage, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, MutableState<Integer> mutableState, AuraColors auraColors) {
        super(1);
        this.$listItems = ahd;
        this.$overlayState = assistOverlayState;
        this.$timelineContents$delegate = c1bo;
        this.$convState = hatchConversationUiState;
        this.$density = axn;
        this.$agentNameState = c1bo2;
        this.$onWidgetSendMessage = g0u;
        this.$onWidgetSetState = g0w;
        this.$frozenHeightPx$delegate = mutableState;
        this.$colors = auraColors;
    }

    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<ConversationTimelineContent, Object> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ConversationTimelineContent conversationTimelineContent) {
            return "contribution";
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(ConversationTimelineContent conversationTimelineContent) {
            return "contribution";
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
