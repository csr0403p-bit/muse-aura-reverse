package com.facebook.aura.conversation.view;

import X.A3q;
import X.AGO;
import X.AHD;
import X.AKH;
import X.AKQ;
import X.AOe;
import X.AT5;
import X.AYD;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.As2;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BL4;
import X.BLU;
import X.BQG;
import X.BRg;
import X.C00x;
import X.C06827l3;
import X.C06G;
import X.C1003AOr;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1DP;
import X.C1YL;
import X.C1b8;
import X.C22I;
import X.C2VU;
import X.C3O5;
import X.C3TH;
import X.C3TQ;
import X.C3U4;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.components.reactions.AuraReactionAnimationKt;
import com.facebook.aura.components.reactions.AuraReactionEffects;
import com.facebook.aura.conversation.repo.HatchReactionLanding;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.identity.provider.HatchConversationTheme;
import com.facebook.aura.markdown.render.BlockTextDirectionKt;
import com.facebook.aura.memory.AuraByteLruCache;
import com.facebook.aura.model.ExternalLinkPresentationJsonKt;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.model.HatchMessageUnsendStatus;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.ui.HatchHighlightGlowKt;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchMessageBubbleKt {
    public static final long BUBBLE_SETTLE_TAIL_MS = 350;
    public static final float BubbleHorizontalPadding = 16.0f;
    public static final float BubbleHugEpsilon = 2.0f;
    public static final float BubbleMinHeight = 44.0f;
    public static final float BubbleMinWidth = 68.0f;
    public static final float BubbleWidthRatio = 0.85f;
    public static final float LargeWindowBubbleMaxWidth = 540.0f;
    public static final int MaxVisibleReactions = 3;
    public static final long REACTION_EFFECT_LIFT_MS = 2000;
    public static final float ReactionBadgeBottomOverflow = 18.0f;
    public static final float ReactionBadgeGlyphSize = 18.0f;
    public static final float ReactionBadgeGlyphSpacing = 3.0f;
    public static final float ReactionBadgeHorizontalPadding = 5.0f;
    public static final float ReactionBadgeMinHeight = 24.0f;
    public static final float ReactionBadgeMinWidth = 29.0f;
    public static final float ReactionBadgeRingWidth = 2.0f;
    public static final float ReactionBadgeTrailingInset = 6.0f;
    public static final float SmallCornerRadius = 6.0f;
    public static final float UnsendPlaceholderVerticalPadding = 6.0f;
    public static final C3TQ BubbleInnerPadding = new C1DP(16.0f, 12.0f, 16.0f, 12.0f);
    public static final AOe<BL4> BubbleResizeAnimationSpec = new C1003AOr(new BL4(1 | (1 << 32)), 1.0f, 400.0f);
    public static final C1003AOr<Float> ReactionBadgePopSpec = new C1003AOr<>(null, 0.6f, 1500.0f);
    public static final AuraByteLruCache<HuggedWidthKey, C1DG> HuggedWidthCache = new AuraByteLruCache<>(256, 524288, 0, false, 0, HatchMessageBubbleKt$HuggedWidthCache$1.INSTANCE, 28, null);
    public static final C06827l3 PARAGRAPH_BREAK = new C06827l3("\n[ \t]*\n");
    public static final AKH<HatchConversationTheme> LocalConversationTheme = new AGO(HatchMessageBubbleKt$LocalConversationTheme$1.INSTANCE);
    public static final AKH<C22I<HatchReactionLanding>> LocalReactionLanded = new AGO(HatchMessageBubbleKt$LocalReactionLanded$1.INSTANCE);
    public static final C3TQ UnsendPlaceholderInnerPadding = new C1DP(16.0f, 10.0f, 16.0f, 10.0f);

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageBubbleKt$HatchMessageBubble$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<String> $agentName;
        public final /* synthetic */ HatchConversationTheme $conversationTheme;
        public final /* synthetic */ float $highlightGlowAlpha;
        public final /* synthetic */ G2j<AHD<String>, Boolean, BFM, Integer, Unit> $inBubbleTokenContent;
        public final /* synthetic */ InlineContentCallbacks $inlineContentCallbacks;
        public final /* synthetic */ HatchMessageUiModel $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onFirstTokenRendered;
        public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HatchMessageUiModel hatchMessageUiModel, Function0<String> function0, BRg bRg, HatchConversationTheme hatchConversationTheme, float f, InlineContentCallbacks inlineContentCallbacks, G0U<? super String, Unit> g0u, G2j<? super AHD<String>, ? super Boolean, ? super BFM, ? super Integer, Unit> g2j, G0U<? super HatchMessageUiModel, Unit> g0u2, int i, int i2) {
            super(2);
            this.$message = hatchMessageUiModel;
            this.$agentName = function0;
            this.$modifier = bRg;
            this.$conversationTheme = hatchConversationTheme;
            this.$highlightGlowAlpha = f;
            this.$inlineContentCallbacks = inlineContentCallbacks;
            this.$onFirstTokenRendered = g0u;
            this.$inBubbleTokenContent = g2j;
            this.$onSelectionReply = g0u2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageBubbleKt.HatchMessageBubble(this.$message, this.$agentName, this.$modifier, this.$conversationTheme, this.$highlightGlowAlpha, this.$inlineContentCallbacks, this.$onFirstTokenRendered, this.$inBubbleTokenContent, this.$onSelectionReply, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageBubbleKt$HatchMessageBubble$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<String> $agentName;
        public final /* synthetic */ C3TH $alignment;
        public final /* synthetic */ float $alpha;
        public final /* synthetic */ HatchConversationTheme $conversationTheme;
        public final /* synthetic */ float $highlightGlowAlpha;
        public final /* synthetic */ G2j<AHD<String>, Boolean, BFM, Integer, Unit> $inBubbleTokenContent;
        public final /* synthetic */ InlineContentCallbacks $inlineContentCallbacks;
        public final /* synthetic */ HatchMessageUiModel $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onFirstTokenRendered;
        public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
        public final /* synthetic */ long $textColor;

        /* renamed from: com.facebook.aura.conversation.view.HatchMessageBubbleKt$HatchMessageBubble$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<BRg, G0U<? super BLU, ? extends Unit>, BFM, Integer, Unit> {
            public final /* synthetic */ Function0<String> $agentName;
            public final /* synthetic */ C3TH $alignment;
            public final /* synthetic */ float $alpha;
            public final /* synthetic */ HatchConversationTheme $conversationTheme;
            public final /* synthetic */ float $highlightGlowAlpha;
            public final /* synthetic */ G2j<AHD<String>, Boolean, BFM, Integer, Unit> $inBubbleTokenContent;
            public final /* synthetic */ InlineContentCallbacks $inlineContentCallbacks;
            public final /* synthetic */ HatchMessageUiModel $message;
            public final /* synthetic */ G0U<String, Unit> $onFirstTokenRendered;
            public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
            public final /* synthetic */ C1BO<Float> $pendingAlpha$delegate;
            public final /* synthetic */ long $textColor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(HatchMessageUiModel hatchMessageUiModel, C1BO<Float> c1bo, C3TH c3th, Function0<String> function0, HatchConversationTheme hatchConversationTheme, long j, float f, InlineContentCallbacks inlineContentCallbacks, G0U<? super String, Unit> g0u, G2j<? super AHD<String>, ? super Boolean, ? super BFM, ? super Integer, Unit> g2j, G0U<? super HatchMessageUiModel, Unit> g0u2, float f2) {
                super(4);
                this.$message = hatchMessageUiModel;
                this.$pendingAlpha$delegate = c1bo;
                this.$alignment = c3th;
                this.$agentName = function0;
                this.$conversationTheme = hatchConversationTheme;
                this.$textColor = j;
                this.$highlightGlowAlpha = f;
                this.$inlineContentCallbacks = inlineContentCallbacks;
                this.$onFirstTokenRendered = g0u;
                this.$inBubbleTokenContent = g2j;
                this.$onSelectionReply = g0u2;
                this.$alpha = f2;
            }

            public final void invoke(BRg bRg, G0U<? super BLU, Unit> g0u, BFM bfm, int i) {
                boolean zA1b = AnonymousClass004.A1b(bRg, g0u);
                int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg) : i;
                if ((i & 48) == 0) {
                    iA0d |= AnonymousClass004.A0U(bfm, g0u);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                HatchMessageUiModel hatchMessageUiModel = this.$message;
                boolean zA65 = bfm.A65(this.$pendingAlpha$delegate);
                float f = this.$alpha;
                C1BO<Float> c1bo = this.$pendingAlpha$delegate;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchMessageBubbleKt$HatchMessageBubble$2$1$1$1(f, c1bo);
                    bfm.Ai0(objAaT);
                }
                HatchMessageBubbleContentKt.m633HatchMessageBubbleContentz756j2U(hatchMessageUiModel, (Function0) objAaT, this.$alignment, this.$agentName, bRg, this.$conversationTheme, new B6A(this.$textColor), this.$highlightGlowAlpha, this.$inlineContentCallbacks, this.$onFirstTokenRendered, this.$inBubbleTokenContent, this.$onSelectionReply, g0u, bfm, AnonymousClass001.A0B(iA0d << 12, HatchMessageUiModel.$stable) | (HatchConversationTheme.$stable << 15) | (InlineContentCallbacks.$stable << 24), (iA0d << 3) & 896, zA1b ? 1 : 0);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, G0U<? super BLU, ? extends Unit> g0u, BFM bfm, Integer num) {
                invoke(bRg, (G0U<? super BLU, Unit>) g0u, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(HatchMessageUiModel hatchMessageUiModel, G0U<? super HatchMessageUiModel, Unit> g0u, BRg bRg, C3TH c3th, Function0<String> function0, HatchConversationTheme hatchConversationTheme, long j, float f, InlineContentCallbacks inlineContentCallbacks, G0U<? super String, Unit> g0u2, G2j<? super AHD<String>, ? super Boolean, ? super BFM, ? super Integer, Unit> g2j, float f2) {
            super(2);
            this.$message = hatchMessageUiModel;
            this.$onSelectionReply = g0u;
            this.$modifier = bRg;
            this.$alignment = c3th;
            this.$agentName = function0;
            this.$conversationTheme = hatchConversationTheme;
            this.$textColor = j;
            this.$highlightGlowAlpha = f;
            this.$inlineContentCallbacks = inlineContentCallbacks;
            this.$onFirstTokenRendered = g0u2;
            this.$inBubbleTokenContent = g2j;
            this.$alpha = f2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.BFM r16, int r17) {
            /*
                r15 = this;
                r2 = r17
                r0 = r17 & 3
                r5 = 2
                boolean r0 = X.AnonymousClass002.A1P(r0, r5)
                r1 = r16
                boolean r0 = X.AnonymousClass001.A1b(r0, r1, r2)
                if (r0 == 0) goto L76
                r0 = r15
                com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r4 = r15.$message
                com.facebook.aura.model.HatchMessageSendStatus r3 = r4.sendStatus
                com.facebook.aura.model.HatchMessageSendStatus r2 = com.facebook.aura.model.HatchMessageSendStatus.SENDING
                if (r3 != r2) goto L1f
                boolean r2 = r4.isPending
                r6 = 1
                if (r2 == 0) goto L20
            L1f:
                r6 = 0
            L20:
                r17 = 0
                r7 = 0
                r10 = r17
                r11 = r5
                r9 = r1
                boolean r3 = com.facebook.aura.common.ui.DelayedVisibilityKt.rememberDelayedVisible(r6, r7, r9, r10, r11)
                com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r2 = r15.$message
                boolean r2 = r2.isPending
                if (r2 != 0) goto L36
                r5 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L39
            L36:
                r5 = 1058642330(0x3f19999a, float:0.6)
            L39:
                r4 = 3072(0xc00, float:4.305E-42)
                r3 = 22
                r2 = 0
                X.1BO r5 = X.C31t.A01(r2, r1, r5, r4, r3)
                com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r4 = r15.$message
                X.G0U<com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, kotlin.Unit> r15 = r15.$onSelectionReply
                X.BRg r2 = r0.$modifier
                X.3TH r6 = r0.$alignment
                kotlin.jvm.functions.Function0<java.lang.String> r7 = r0.$agentName
                com.facebook.aura.identity.provider.HatchConversationTheme r8 = r0.$conversationTheme
                long r9 = r0.$textColor
                float r11 = r0.$highlightGlowAlpha
                com.facebook.aura.conversation.view.InlineContentCallbacks r12 = r0.$inlineContentCallbacks
                X.G0U<java.lang.String, kotlin.Unit> r13 = r0.$onFirstTokenRendered
                X.G2j<X.AHD<java.lang.String>, java.lang.Boolean, X.BFM, java.lang.Integer, kotlin.Unit> r14 = r0.$inBubbleTokenContent
                float r0 = r0.$alpha
                com.facebook.aura.conversation.view.HatchMessageBubbleKt$HatchMessageBubble$2$1 r3 = new com.facebook.aura.conversation.view.HatchMessageBubbleKt$HatchMessageBubble$2$1
                r16 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16)
                r0 = -993395522(0xffffffffc4c9fcbe, float:-1615.8982)
                X.B1U r14 = X.B1V.A00(r1, r3, r0)
                int r0 = com.facebook.aura.conversation.viewmodel.HatchMessageUiModel.$stable
                r0 = r0 | 3072(0xc00, float:4.305E-42)
                r11 = r4
                r12 = r15
                r13 = r2
                r15 = r1
                r16 = r0
                com.facebook.aura.conversation.view.HatchSwipeToReplyKt.HatchReplySwipeContainer(r11, r12, r13, r14, r15, r16, r17)
                return
            L76:
                r1.Afo()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageBubbleKt.AnonymousClass2.invoke(X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageBubbleKt$HatchMessageBubble$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<String> $agentName;
        public final /* synthetic */ HatchConversationTheme $conversationTheme;
        public final /* synthetic */ float $highlightGlowAlpha;
        public final /* synthetic */ G2j<AHD<String>, Boolean, BFM, Integer, Unit> $inBubbleTokenContent;
        public final /* synthetic */ InlineContentCallbacks $inlineContentCallbacks;
        public final /* synthetic */ HatchMessageUiModel $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onFirstTokenRendered;
        public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(HatchMessageUiModel hatchMessageUiModel, Function0<String> function0, BRg bRg, HatchConversationTheme hatchConversationTheme, float f, InlineContentCallbacks inlineContentCallbacks, G0U<? super String, Unit> g0u, G2j<? super AHD<String>, ? super Boolean, ? super BFM, ? super Integer, Unit> g2j, G0U<? super HatchMessageUiModel, Unit> g0u2, int i, int i2) {
            super(2);
            this.$message = hatchMessageUiModel;
            this.$agentName = function0;
            this.$modifier = bRg;
            this.$conversationTheme = hatchConversationTheme;
            this.$highlightGlowAlpha = f;
            this.$inlineContentCallbacks = inlineContentCallbacks;
            this.$onFirstTokenRendered = g0u;
            this.$inBubbleTokenContent = g2j;
            this.$onSelectionReply = g0u2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageBubbleKt.HatchMessageBubble(this.$message, this.$agentName, this.$modifier, this.$conversationTheme, this.$highlightGlowAlpha, this.$inlineContentCallbacks, this.$onFirstTokenRendered, this.$inBubbleTokenContent, this.$onSelectionReply, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageBubbleKt$HatchUnsendPlaceholderRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C114862 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchMessageUiModel $message;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114862(HatchMessageUiModel hatchMessageUiModel, BRg bRg, int i, int i2) {
            super(2);
            this.$message = hatchMessageUiModel;
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
            HatchMessageBubbleKt.HatchUnsendPlaceholderRow(this.$message, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageBubbleKt$ReactionBadge$2, reason: invalid class name and case insensitive filesystem */
    public final class C114872 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ AHD<String> $reactions;
        public final /* synthetic */ String $serverMessageId;
        public final /* synthetic */ InterfaceC05151eP $this_ReactionBadge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114872(InterfaceC05151eP interfaceC05151eP, AHD<String> ahd, String str, String str2, int i, int i2) {
            super(2);
            this.$this_ReactionBadge = interfaceC05151eP;
            this.$reactions = ahd;
            this.$messageId = str;
            this.$serverMessageId = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageBubbleKt.ReactionBadge(this.$this_ReactionBadge, this.$reactions, this.$messageId, this.$serverMessageId, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageBubbleKt$ReactionBadge$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ AHD<String> $reactions;
        public final /* synthetic */ String $serverMessageId;
        public final /* synthetic */ InterfaceC05151eP $this_ReactionBadge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(InterfaceC05151eP interfaceC05151eP, AHD<String> ahd, String str, String str2, int i, int i2) {
            super(2);
            this.$this_ReactionBadge = interfaceC05151eP;
            this.$reactions = ahd;
            this.$messageId = str;
            this.$serverMessageId = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageBubbleKt.ReactionBadge(this.$this_ReactionBadge, this.$reactions, this.$messageId, this.$serverMessageId, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageBubbleKt$reflowRtlParagraphs$1, reason: invalid class name and case insensitive filesystem */
    public final class C114881 extends AbstractC7559F3s implements G0U<String, CharSequence> {
        public static final C114881 INSTANCE = new C114881();

        public C114881() {
            super(1);
        }

        @Override // X.G0U
        public final CharSequence invoke(String str) {
            C7384Etj.A0Y(str, 0);
            return BlockTextDirectionKt.blockTextDirection(str) == 2 ? HatchMessageBubbleKt.softLineBreaksAsSpaces(str) : str;
        }
    }

    public static final void ReactionBadge(InterfaceC05151eP interfaceC05151eP, AHD<String> ahd, String str, String str2, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass7;
        boolean zA1a = AnonymousClass002.A1a(interfaceC05151eP, ahd);
        C7384Etj.A0Y(str, 2);
        bfm.AgG(282950624);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, interfaceC05151eP) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, ahd);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                str2 = null;
            }
            boolean zIsEmpty = ahd.isEmpty();
            boolean z = !zIsEmpty;
            String strRememberLiveReactionEmoji = rememberLiveReactionEmoji(str, str2, bfm, (iA0d >> 6) & 126);
            HatchUtil hatchUtil = HatchUtil.INSTANCE;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new HatchMessageBubbleKt$ReactionBadge$reactionEffects$1$1(hatchUtil);
                bfm.Ai0(objAaT);
            }
            AuraReactionEffects auraReactionEffectsRememberAuraReactionEffects = AuraReactionAnimationKt.rememberAuraReactionEffects(strRememberLiveReactionEmoji, (Function0) ((InterfaceC7353EnQ) objAaT), bfm, 0, 0);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass002.A0I(bfm, zIsEmpty ? 0.0f : 1.0f);
            }
            AT5 at5 = (AT5) objAaT2;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA1Q = AnonymousClass003.A1Q(bfm, at5, z);
            Object objAaT3 = bfm.AaT();
            if (zA1Q || objAaT3 == obj) {
                objAaT3 = new HatchMessageBubbleKt$ReactionBadge$1$1(z, at5, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A18(bfm, objAaT3, boolValueOf);
            if (zIsEmpty) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass7 = new C114872(interfaceC05151eP, ahd, str, str2, i, i2);
                    bBbAAc.A06 = anonymousClass7;
                }
                return;
            }
            List listA0e = AbstractC0878AGe.A0e(ahd, 3);
            int size = ahd.size() - listA0e.size();
            String strA0t = AnonymousClass001.A0t(bfm, HatchReactionGlyphKt.reactionAccessibilityText(ahd, bfm, (iA0d >> 3) & 14), R.string._name_removed__res_0x7f120871);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, AnonymousClass001.A0g(bfm, akh).footnoteMedium, null, null, null, null, null, null, null, null, 0, 0, 0, 16777213, 0L, HatchReactionGlyphKt.m660reactionTextSizeFor8Feqmps(ReactionBadgeGlyphSize, bfm, 6), 0L, 0L);
            BRg bRgA4C = interfaceC05151eP.A4C(C2VU.A07, BRg.A00);
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = HatchMessageBubbleKt$ReactionBadge$3$1.INSTANCE;
                bfm.Ai0(objAaT4);
            }
            BRg bRgThen = AYD.A03(bRgA4C, (G0U) objAaT4).then(auraReactionEffectsRememberAuraReactionEffects.overlay);
            boolean zA67 = bfm.A67(at5);
            Object objAaT5 = bfm.AaT();
            if (zA67 || objAaT5 == obj) {
                objAaT5 = new HatchMessageBubbleKt$ReactionBadge$4$1(at5);
                bfm.Ai0(objAaT5);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRgThen, objAaT5);
            boolean zA65 = bfm.A65(strA0t);
            Object objAaT6 = bfm.AaT();
            if (zA65 || objAaT6 == obj) {
                objAaT6 = new HatchMessageBubbleKt$ReactionBadge$5$1(strA0t);
                bfm.Ai0(objAaT6);
            }
            BRg bRgA0X = AnonymousClass001.A0X(bRgA0W, objAaT6);
            long jA0B = C06G.A0B(bfm);
            C1D3 c1d3 = C1D8.A00;
            BRg bRgA07 = C3U4.A07(C10G.A02(C2VU.A09, C1b8.A03(C10G.A09(C3U4.A09(C1b8.A03(bRgA0X, c1d3, jA0B), ReactionBadgeRingWidth), ReactionBadgeMinWidth, ReactionBadgeMinHeight), c1d3, bubbleBackground(HatchMessageRole.AGENT, (HatchConversationTheme) bfm.A6v(LocalConversationTheme), bfm, (HatchConversationTheme.$stable << 3) | 6)).then(auraReactionEffectsRememberAuraReactionEffects.glyph), false), ReactionBadgeHorizontalPadding);
            InterfaceC1380AiA interfaceC1380AiAA0L = AnonymousClass007.A0L(bfm, ReactionBadgeGlyphSpacing);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0L, akqA04, bRgA01, iA0J);
            Iterator itA0w = AnonymousClass001.A0w(bfm, listA0e, -1777527542);
            while (itA0w.hasNext()) {
                HatchReactionGlyphKt.HatchReactionGlyph(AnonymousClass005.A0j(itA0w), null, c1822ArmA00, bfm, 0, 2);
            }
            BBI.A0R(bbi, false);
            if (size > 0) {
                bfm.AgE(731334694);
                AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, Integer.valueOf(size), R.string._name_removed__res_0x7f120872), null, C06G.A0C(bfm), AnonymousClass001.A0g(bfm, akh).footnoteMedium, null, null, new C1YL(3), false, 0, zA1a ? 1 : 0, 2, null, null, null, bfm, 805306368, 6, 14770);
            } else {
                bfm.AgE(731648166);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass7 = new AnonymousClass7(interfaceC05151eP, ahd, str, str2, i, i2);
            bBbAAc.A06 = anonymousClass7;
        }
    }

    public static final BRg bubbleHighlightGlow(BRg bRg, float f, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        return HatchHighlightGlowKt.m2316highlightGlowuQhol8o(bRg, f, C06G.A0D(bfm), AnonymousClass002.A0d(bfm).bubbleCornerRadius, 0.0f, (B6A) null, bfm, i & 126, 24);
    }

    /* renamed from: bubbleMaxWidth-rAjV9yQ, reason: not valid java name */
    public static final BRg m636bubbleMaxWidthrAjV9yQ(BRg bRg, float f, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(bRg, 0);
        if ((i2 & 1) != 0) {
            f = Float.NaN;
        }
        return C10G.A0D(bRg, f, bubbleMaxWidthDp(bfm, 0));
    }

    public static final float bubbleMaxWidthDp(BFM bfm, int i) {
        return AuraLayoutSizeKt.m2364cappedOnLargeWindowsi1RSzL4(AuraLayoutSizeKt.auraLayoutWidth(bfm, 0) * 0.85f, LargeWindowBubbleMaxWidth, bfm, 48);
    }

    public static final boolean hasWidthAffectingMarkup(String str) {
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                if (hasEmphasisUnderscore(str) || C7BY.A0q(str, "](", false) || C7BY.A0q(str, "][", false) || C7BY.A0q(str, "]:", false) || C7BY.A0q(str, ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX, true) || C7BY.A0q(str, "https://", true) || C7BY.A0q(str, "www.", true)) {
                    break;
                }
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '*' || cCharAt == '`' || cCharAt == '~') {
                break;
            }
            i++;
        }
        return true;
    }

    public static final BRg reactionBadgeOverflowPadding(BRg bRg, boolean z) {
        C7384Etj.A0Y(bRg, 0);
        return z ? C3U4.A03(bRg, ReactionBadgeBottomOverflow) : bRg;
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchMessageUnsendStatus.values().length];
            try {
                AnonymousClass002.A13(HatchMessageUnsendStatus.UNSENDING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchMessageUnsendStatus.DELETED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchMessageUnsendStatus.NONE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchMessageBubble(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r30, kotlin.jvm.functions.Function0<java.lang.String> r31, X.BRg r32, com.facebook.aura.identity.provider.HatchConversationTheme r33, float r34, com.facebook.aura.conversation.view.InlineContentCallbacks r35, X.G0U<? super java.lang.String, kotlin.Unit> r36, X.G2j<? super X.AHD<java.lang.String>, ? super java.lang.Boolean, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r37, X.G0U<? super com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, kotlin.Unit> r38, X.BFM r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageBubbleKt.HatchMessageBubble(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, kotlin.jvm.functions.Function0, X.BRg, com.facebook.aura.identity.provider.HatchConversationTheme, float, com.facebook.aura.conversation.view.InlineContentCallbacks, X.G0U, X.G2j, X.G0U, X.BFM, int, int):void");
    }

    public static final void HatchUnsendPlaceholderRow(HatchMessageUiModel hatchMessageUiModel, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c114862;
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(1278407976);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchMessageUiModel, bfm, i) ? 1 : 0) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            int iOrdinal = hatchMessageUiModel.unsendStatus.ordinal();
            if (iOrdinal == 1) {
                bfm.AgE(189424731);
                i3 = R.string._name_removed__res_0x7f120894;
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal != 0) {
                        throw AnonymousClass005.A0k(bfm, 189422547);
                    }
                    AnonymousClass003.A0l(bfm, 1577405300);
                    bBbAAc = bfm.AAc();
                    if (bBbAAc != null) {
                        c114862 = new HatchMessageBubbleKt$HatchUnsendPlaceholderRow$label$1(hatchMessageUiModel, bRg2, i, i2);
                        bBbAAc.A06 = c114862;
                    }
                    return;
                }
                bfm.AgE(189428195);
                i3 = R.string._name_removed__res_0x7f120856;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i3);
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            BRg bRgA06 = C3U4.A06(AnonymousClass001.A0R(bRg2), UnsendPlaceholderVerticalPadding);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0A, false);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA06);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            C1822Arm hatchBubbleBodyTextStyle = getHatchBubbleBodyTextStyle(bfm, 0);
            long jA08 = C06G.A08(bfm);
            BRg bRgA0D = C3U4.A0D(C06G.A0P(bfm, BRg.A00, m637bubbleShapeTDGSqEk(hatchMessageUiModel.role, hatchMessageUiModel.groupPosition, AnonymousClass002.A0d(bfm).bubbleCornerRadius, false, false)), UnsendPlaceholderInnerPadding);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchMessageBubbleKt$HatchUnsendPlaceholderRow$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA0D, objAaT, false), jA08, hatchBubbleBodyTextStyle, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c114862 = new C114862(hatchMessageUiModel, bRg2, i, i2);
            bBbAAc.A06 = c114862;
        }
    }

    public static final boolean endsWithHardBreakAt(String str, int i) {
        Character chA15;
        int i2 = i - 1;
        Character chA152 = BQG.A15(str, i2);
        if (chA152 != null && chA152.charValue() == '\\') {
            return true;
        }
        Character chA153 = BQG.A15(str, i2);
        return chA153 != null && chA153.charValue() == ' ' && (chA15 = BQG.A15(str, i + (-2))) != null && chA15.charValue() == ' ';
    }

    public static final C3TQ getBubbleInnerPadding() {
        return BubbleInnerPadding;
    }

    public static final float getBubbleMinHeight() {
        return BubbleMinHeight;
    }

    public static final float getBubbleMinWidth() {
        return BubbleMinWidth;
    }

    public static final AOe<BL4> getBubbleResizeAnimationSpec() {
        return BubbleResizeAnimationSpec;
    }

    public static final AKH<HatchConversationTheme> getLocalConversationTheme() {
        return LocalConversationTheme;
    }

    public static final AKH<C22I<HatchReactionLanding>> getLocalReactionLanded() {
        return LocalReactionLanded;
    }

    public static final int lineEndAfter(String str, int i) {
        int iA08 = C7BY.A08(str, '\n', i + 1);
        return iA08 < 0 ? str.length() : iA08;
    }

    public static final String reflowRtlParagraphs(String str) {
        return AbstractC0878AGe.A0L(PairsDiscretionDocument.OWNER_SEPARATOR, "", "", PARAGRAPH_BREAK.A05(str), C114881.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a5 A[PHI: r0
  0x01a5: PHI (r0v21 X.1DG) = (r0v46 X.1DG), (r0v52 X.1DG) binds: [B:56:0x0144, B:65:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1DG rememberHuggedUserBubbleWidth(java.lang.String r39, java.lang.String r40, boolean r41, boolean r42, X.BFM r43, int r44) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageBubbleKt.rememberHuggedUserBubbleWidth(java.lang.String, java.lang.String, boolean, boolean, X.BFM, int):X.1DG");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[PHI: r7
  0x0050: PHI (r7v1 char) = (r7v0 char), (r7v0 char), (r7v0 char), (r7v2 char) binds: [B:7:0x0018, B:9:0x001e, B:11:0x002c, B:20:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String softLineBreaksAsSpaces(java.lang.String r8) {
        /*
            r6 = 10
            r5 = 0
            boolean r0 = X.C7BY.A0k(r8, r6)
            if (r0 == 0) goto L5a
            int r4 = r8.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
        L12:
            if (r5 >= r4) goto L56
            char r7 = r8.charAt(r5)
            if (r7 != r6) goto L50
            boolean r0 = endsWithHardBreakAt(r8, r5)
            if (r0 != 0) goto L50
            int r2 = r5 + 1
            int r1 = lineEndAfter(r8, r5)
            java.lang.String r0 = "\u2022"
            boolean r0 = com.facebook.aura.markdown.render.BulletMarkerKt.startsWithBulletMarker(r8, r0, r2, r1)
            if (r0 != 0) goto L50
            java.lang.Character r0 = X.BQG.A14(r3)
            if (r0 == 0) goto L53
            char r0 = r0.charValue()
            boolean r0 = X.C7LE.A00(r0)
            if (r0 != 0) goto L53
            java.lang.Character r0 = X.BQG.A15(r8, r2)
            if (r0 == 0) goto L53
            char r0 = r0.charValue()
            boolean r0 = X.C7LE.A00(r0)
            if (r0 != 0) goto L53
            r7 = 32
        L50:
            r3.append(r7)
        L53:
            int r5 = r5 + 1
            goto L12
        L56:
            java.lang.String r8 = r3.toString()
        L5a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageBubbleKt.softLineBreaksAsSpaces(java.lang.String):java.lang.String");
    }

    public static final long bubbleBackground(HatchMessageRole hatchMessageRole, HatchConversationTheme hatchConversationTheme, BFM bfm, int i) {
        AnonymousClass003.A0u(hatchMessageRole, hatchConversationTheme);
        boolean zA00 = C3O5.A00(bfm);
        return hatchMessageRole == HatchMessageRole.AGENT ? zA00 ? hatchConversationTheme.agentBubbleColorDark : hatchConversationTheme.agentBubbleColorLight : zA00 ? hatchConversationTheme.userBubbleColorDark : hatchConversationTheme.userBubbleColorLight;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0028 A[PHI: r2
  0x0028: PHI (r2v5 float) = (r2v1 float), (r2v1 float), (r2v6 float) binds: [B:15:0x0023, B:17:0x0026, B:13:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /* renamed from: bubbleShape-TDGSqEk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1D3 m637bubbleShapeTDGSqEk(com.facebook.aura.model.HatchMessageRole r6, com.facebook.aura.conversation.viewmodel.BubbleGroupPosition r7, float r8, boolean r9, boolean r10) {
        /*
            X.AnonymousClass003.A0u(r6, r7)
            float r5 = com.facebook.aura.conversation.view.HatchMessageBubbleKt.SmallCornerRadius
            com.facebook.aura.model.HatchMessageRole r0 = com.facebook.aura.model.HatchMessageRole.USER
            r4 = 1
            boolean r3 = X.AnonymousClass002.A1Z(r6, r0)
            com.facebook.aura.conversation.viewmodel.BubbleGroupPosition r2 = com.facebook.aura.conversation.viewmodel.BubbleGroupPosition.MIDDLE
            if (r7 == r2) goto L15
            com.facebook.aura.conversation.viewmodel.BubbleGroupPosition r0 = com.facebook.aura.conversation.viewmodel.BubbleGroupPosition.LAST
            r1 = 0
            if (r7 != r0) goto L16
        L15:
            r1 = 1
        L16:
            com.facebook.aura.conversation.viewmodel.BubbleGroupPosition r0 = com.facebook.aura.conversation.viewmodel.BubbleGroupPosition.FIRST
            if (r7 == r0) goto L1d
            if (r7 == r2) goto L1d
            r4 = 0
        L1d:
            if (r1 == 0) goto L22
            r2 = r5
            if (r3 == 0) goto L28
        L22:
            r2 = r8
            if (r1 == 0) goto L28
            r1 = r5
            if (r3 != 0) goto L29
        L28:
            r1 = r8
        L29:
            if (r4 == 0) goto L2e
            r0 = r5
            if (r3 == 0) goto L34
        L2e:
            r0 = r8
            if (r4 == 0) goto L34
            if (r3 == 0) goto L34
            r8 = r5
        L34:
            if (r9 == 0) goto L39
            if (r3 == 0) goto L44
            r1 = r5
        L39:
            if (r10 == 0) goto L3e
            if (r3 != 0) goto L3f
            r0 = r5
        L3e:
            r5 = r8
        L3f:
            X.1D3 r0 = X.C1D8.A01(r2, r1, r5, r0)
            return r0
        L44:
            r2 = r5
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageBubbleKt.m637bubbleShapeTDGSqEk(com.facebook.aura.model.HatchMessageRole, com.facebook.aura.conversation.viewmodel.BubbleGroupPosition, float, boolean, boolean):X.1D3");
    }

    public static final long conversationBackground(BFM bfm, int i) {
        return C06G.A0B(bfm);
    }

    public static final C1822Arm getHatchBubbleBodyTextStyle(BFM bfm, int i) {
        return C1822Arm.A00(null, C06G.A0T(bfm), null, null, null, null, null, null, As2.A02, null, 0, 0, 0, 8388607, 0L, 0L, 0L, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean hasEmphasisUnderscore(java.lang.String r7) {
        /*
            int r6 = r7.length()
            r5 = 0
            r4 = 0
        L6:
            if (r4 >= r6) goto L3b
            char r1 = r7.charAt(r4)
            r0 = 95
            if (r1 != r0) goto L38
            r3 = 1
            if (r4 <= 0) goto L20
            int r0 = r4 + (-1)
            char r0 = r7.charAt(r0)
            boolean r0 = isWordChar(r0)
            r2 = 1
            if (r0 != 0) goto L21
        L20:
            r2 = 0
        L21:
            int r0 = r6 + (-1)
            if (r4 >= r0) goto L32
            int r0 = r4 + 1
            char r0 = r7.charAt(r0)
            boolean r1 = isWordChar(r0)
            r0 = 1
            if (r1 != 0) goto L33
        L32:
            r0 = 0
        L33:
            if (r2 == 0) goto L37
            if (r0 != 0) goto L38
        L37:
            return r3
        L38:
            int r4 = r4 + 1
            goto L6
        L3b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageBubbleKt.hasEmphasisUnderscore(java.lang.String):boolean");
    }

    public static final boolean isWordChar(char c) {
        return Character.isLetterOrDigit(c) || c == '_';
    }

    public static final boolean landingMatchesMessage(String str, String str2, String str3) {
        return C7384Etj.areEqual(str, str2) || C7384Etj.areEqual(str, str3);
    }

    public static final long messageTextColor(HatchMessageRole hatchMessageRole, HatchConversationTheme hatchConversationTheme, boolean z) {
        AnonymousClass003.A0u(hatchMessageRole, hatchConversationTheme);
        return hatchMessageRole == HatchMessageRole.AGENT ? hatchConversationTheme.m1104agentTextColorvNxB06k(z) : hatchConversationTheme.m1138userTextColorvNxB06k(z);
    }

    public static final float reactionEffectZIndex(HatchMessageUiModel hatchMessageUiModel, Set<String> set) {
        AnonymousClass003.A0u(hatchMessageUiModel, set);
        if ((set instanceof Collection) && set.isEmpty()) {
            return 0.0f;
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (landingMatchesMessage(AnonymousClass005.A0j(it), hatchMessageUiModel.id, hatchMessageUiModel.serverMessageId)) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String rememberLiveReactionEmoji(java.lang.String r11, java.lang.String r12, X.BFM r13, int r14) {
        /*
            r0 = -2011135086(0xffffffff88208392, float:-4.830291E-34)
            r13.AgE(r0)
            X.AKH<X.22I<com.facebook.aura.conversation.repo.HatchReactionLanding>> r0 = com.facebook.aura.conversation.view.HatchMessageBubbleKt.LocalReactionLanded
            java.lang.Object r6 = r13.A6v(r0)
            X.22I r6 = (X.C22I) r6
            r10 = 0
            if (r6 != 0) goto L15
            X.AnonymousClass002.A19(r13)
            return r10
        L15:
            r0 = r14 & 14
            r5 = r0 ^ 6
            r3 = 0
            r4 = 4
            r7 = r11
            if (r5 <= r4) goto L24
            boolean r0 = r13.A65(r11)
            if (r0 != 0) goto L29
        L24:
            r1 = r14 & 6
            r0 = 0
            if (r1 != r4) goto L2a
        L29:
            r0 = 1
        L2a:
            java.lang.Object r9 = r13.AaT()
            if (r0 != 0) goto L34
            java.lang.Object r0 = X.C78N.A00
            if (r9 != r0) goto L38
        L34:
            androidx.compose.runtime.ParcelableSnapshotMutableState r9 = X.AnonymousClass004.A11(r13, r10)
        L38:
            androidx.compose.runtime.MutableState r9 = (androidx.compose.runtime.MutableState) r9
            boolean r2 = r13.A67(r6)
            if (r5 <= r4) goto L46
            boolean r0 = r13.A65(r11)
            if (r0 != 0) goto L4b
        L46:
            r1 = r14 & 6
            r0 = 0
            if (r1 != r4) goto L4c
        L4b:
            r0 = 1
        L4c:
            r2 = r2 | r0
            r0 = r14 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            r8 = r12
            if (r0 <= r1) goto L5c
            boolean r0 = r13.A65(r12)
            if (r0 != 0) goto L60
        L5c:
            r0 = r14 & 48
            if (r0 != r1) goto L61
        L60:
            r3 = 1
        L61:
            boolean r0 = X.AnonymousClass002.A1W(r13, r9, r2, r3)
            java.lang.Object r5 = r13.AaT()
            if (r0 != 0) goto L6f
            java.lang.Object r0 = X.C78N.A00
            if (r5 != r0) goto L77
        L6f:
            com.facebook.aura.conversation.view.HatchMessageBubbleKt$rememberLiveReactionEmoji$1$1 r5 = new com.facebook.aura.conversation.view.HatchMessageBubbleKt$rememberLiveReactionEmoji$1$1
            r5.<init>(r6, r7, r8, r9, r10)
            r13.Ai0(r5)
        L77:
            X.G0V r5 = (X.G0V) r5
            X.C78e.A02(r13, r6, r11, r12, r5)
            java.lang.String r0 = androidx.compose.runtime.MutableState.A05(r9)
            X.AnonymousClass002.A19(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageBubbleKt.rememberLiveReactionEmoji(java.lang.String, java.lang.String, X.BFM, int):java.lang.String");
    }

    public static final C1BO<Set<String>> rememberReactionEffectMessageIds(BFM bfm, int i) {
        Object objA0p = AnonymousClass001.A0p(bfm, 2094993896);
        Object obj = C78N.A00;
        if (objA0p == obj) {
            objA0p = AnonymousClass004.A11(bfm, A3q.A00);
        }
        MutableState mutableState = (MutableState) objA0p;
        C22I c22i = (C22I) bfm.A6v(LocalReactionLanded);
        if (c22i != null) {
            boolean zA67 = bfm.A67(c22i);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == obj) {
                objAaT = new HatchMessageBubbleKt$rememberReactionEffectMessageIds$1$1(mutableState, c22i, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, c22i);
        }
        AnonymousClass002.A19(bfm);
        return mutableState;
    }
}
