package com.facebook.aura.conversation.view;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BLU;
import X.BRg;
import X.C00x;
import X.C0z7;
import X.C10G;
import X.C1515AkP;
import X.C2VU;
import X.C3TH;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.identity.provider.HatchConversationTheme;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$8$1$sections$1$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ boolean $allowLivePresentationEntry;
    public final /* synthetic */ HatchConversationTheme $conversationTheme;
    public final /* synthetic */ boolean $hasStandaloneWidgets;
    public final /* synthetic */ InlineContentCallbacks $inlineCallbacks;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ Function0<Unit> $onFocusComposer;
    public final /* synthetic */ G0U<String, Integer> $onGetWidgetHeight;
    public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
    public final /* synthetic */ G0V<String, Integer, Unit> $onSetWidgetHeight;
    public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
    public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
    public final /* synthetic */ boolean $shouldRenderBubble;
    public final /* synthetic */ String $sideChatSessionId;
    public final /* synthetic */ List<HatchWidgetPresentation> $standalonePresentations;

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageItemKt$HatchMessageItem$8$1$sections$1$5$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ C3TH $cardAlignment;
        public final /* synthetic */ InlineContentCallbacks $inlineCallbacks;
        public final /* synthetic */ HatchMessageUiModel $message;
        public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
        public final /* synthetic */ G2j<BRg, G0U<? super BLU, Unit>, BFM, Integer, Unit> $presentations;
        public final /* synthetic */ boolean $shouldRenderBubble;

        /* renamed from: com.facebook.aura.conversation.view.HatchMessageItemKt$HatchMessageItem$8$1$sections$1$5$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01101 extends AbstractC7559F3s implements G2j<BRg, G0U<? super BLU, ? extends Unit>, BFM, Integer, Unit> {
            public final /* synthetic */ C3TH $cardAlignment;
            public final /* synthetic */ InlineContentCallbacks $inlineCallbacks;
            public final /* synthetic */ HatchMessageUiModel $message;
            public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
            public final /* synthetic */ G2j<BRg, G0U<? super BLU, Unit>, BFM, Integer, Unit> $presentations;

            /* renamed from: com.facebook.aura.conversation.view.HatchMessageItemKt$HatchMessageItem$8$1$sections$1$5$1$1$2, reason: invalid class name */
            public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<BRg, Boolean, BFM, Integer, Unit> {
                public final /* synthetic */ C3TH $cardAlignment;
                public final /* synthetic */ HatchMessageUiModel $message;
                public final /* synthetic */ G0U<BLU, Unit> $onBoundsChanged;
                public final /* synthetic */ G2j<BRg, G0U<? super BLU, Unit>, BFM, Integer, Unit> $presentations;
                public final /* synthetic */ BRg $swipeModifier;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(BRg bRg, C3TH c3th, HatchMessageUiModel hatchMessageUiModel, G2j<? super BRg, ? super G0U<? super BLU, Unit>, ? super BFM, ? super Integer, Unit> g2j, G0U<? super BLU, Unit> g0u) {
                    super(4);
                    this.$swipeModifier = bRg;
                    this.$cardAlignment = c3th;
                    this.$message = hatchMessageUiModel;
                    this.$presentations = g2j;
                    this.$onBoundsChanged = g0u;
                }

                public final void invoke(BRg bRg, boolean z, BFM bfm, int i) {
                    int iA0d = i;
                    C7384Etj.A0Y(bRg, 0);
                    if ((i & 6) == 0) {
                        iA0d = i | AnonymousClass004.A0d(bfm, bRg);
                    }
                    if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 131, 130), bfm, iA0d)) {
                        bfm.Afo();
                        return;
                    }
                    BRg bRgReactionBadgeOverflowPadding = HatchMessageBubbleKt.reactionBadgeOverflowPadding(C10G.A00(this.$cardAlignment, AnonymousClass001.A0R(this.$swipeModifier.then(bRg)), false), !this.$message.reactions.isEmpty());
                    G2j<BRg, G0U<? super BLU, Unit>, BFM, Integer, Unit> g2j = this.$presentations;
                    G0U<BLU, Unit> g0u = this.$onBoundsChanged;
                    HatchMessageUiModel hatchMessageUiModel = this.$message;
                    InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgReactionBadgeOverflowPadding);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                    C0z7 c0z7 = C0z7.A00;
                    AnonymousClass001.A1F(BRg.A00, g0u, bfm, g2j, 390);
                    HatchMessageBubbleKt.ReactionBadge(c0z7, hatchMessageUiModel.reactions, hatchMessageUiModel.id, hatchMessageUiModel.serverMessageId, bfm, 6, 0);
                    BBI.A0R(bbi, true);
                }

                @Override // X.G2j
                public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, Boolean bool, BFM bfm, Integer num) {
                    invoke(bRg, AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
                    return Unit.INSTANCE;
                }
            }

            public final void invoke(BRg bRg, G0U<? super BLU, Unit> g0u, BFM bfm, int i) {
                Function0 function0;
                boolean zA1b = AnonymousClass004.A1b(bRg, g0u);
                int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
                if ((i & 48) == 0) {
                    iA0d |= AnonymousClass004.A0U(bfm, g0u);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                HatchMessageUiModel hatchMessageUiModel = this.$message;
                G0U<HatchMessageUiModel, Unit> g0u2 = this.$onSelectionReply;
                if (g0u2 == null) {
                    AnonymousClass003.A0l(bfm, 1315160577);
                    function0 = null;
                } else {
                    bfm.AgE(1315160578);
                    HatchMessageUiModel hatchMessageUiModel2 = this.$message;
                    boolean zA1J = AnonymousClass003.A1J(bfm, g0u2, hatchMessageUiModel2);
                    Object objAaT = bfm.AaT();
                    if (zA1J || objAaT == C78N.A00) {
                        objAaT = new HatchMessageItemKt$HatchMessageItem$8$1$sections$1$5$1$1$1$1$1(g0u2, hatchMessageUiModel2);
                        bfm.Ai0(objAaT);
                    }
                    function0 = (Function0) objAaT;
                    AnonymousClass001.A1D(bfm);
                }
                HatchMessageLongPressMenuHostKt.HatchMessageLongPressMenuHost(hatchMessageUiModel, function0, zA1b, this.$inlineCallbacks.onImageCopy, B1V.A00(bfm, new AnonymousClass2(bRg, this.$cardAlignment, this.$message, this.$presentations, g0u), -775701240), bfm, HatchMessageUiModel.$stable | RuntimeInternals.IOPRIO_BACKGROUND, 4);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01101(HatchMessageUiModel hatchMessageUiModel, G0U<? super HatchMessageUiModel, Unit> g0u, InlineContentCallbacks inlineContentCallbacks, C3TH c3th, G2j<? super BRg, ? super G0U<? super BLU, Unit>, ? super BFM, ? super Integer, Unit> g2j) {
                super(4);
                this.$message = hatchMessageUiModel;
                this.$onSelectionReply = g0u;
                this.$inlineCallbacks = inlineContentCallbacks;
                this.$cardAlignment = c3th;
                this.$presentations = g2j;
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, G0U<? super BLU, ? extends Unit> g0u, BFM bfm, Integer num) {
                invoke(bRg, (G0U<? super BLU, Unit>) g0u, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z, G2j<? super BRg, ? super G0U<? super BLU, Unit>, ? super BFM, ? super Integer, Unit> g2j, HatchMessageUiModel hatchMessageUiModel, G0U<? super HatchMessageUiModel, Unit> g0u, InlineContentCallbacks inlineContentCallbacks, C3TH c3th) {
            super(2);
            this.$shouldRenderBubble = z;
            this.$presentations = g2j;
            this.$message = hatchMessageUiModel;
            this.$onSelectionReply = g0u;
            this.$inlineCallbacks = inlineContentCallbacks;
            this.$cardAlignment = c3th;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                if (this.$shouldRenderBubble) {
                    bfm.AgE(-1373493952);
                    AnonymousClass001.A1F(C10G.A02, null, bfm, this.$presentations, 438);
                } else {
                    bfm.AgE(-1373339882);
                    HatchMessageUiModel hatchMessageUiModel = this.$message;
                    G0U<HatchMessageUiModel, Unit> g0u = this.$onSelectionReply;
                    HatchSwipeToReplyKt.HatchReplySwipeContainer(hatchMessageUiModel, g0u, null, B1V.A00(bfm, new C01101(hatchMessageUiModel, g0u, this.$inlineCallbacks, this.$cardAlignment, this.$presentations), -628681059), bfm, HatchMessageUiModel.$stable | 3072, 4);
                }
                AnonymousClass002.A19(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageItemKt$HatchMessageItem$8$1$sections$1$5(HatchMessageUiModel hatchMessageUiModel, HatchConversationTheme hatchConversationTheme, boolean z, boolean z2, List<HatchWidgetPresentation> list, String str, G0U<? super HatchSendMessage, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function0, G0U<? super String, Integer> g0u2, G0V<? super String, ? super Integer, Unit> g0v, InlineContentCallbacks inlineContentCallbacks, boolean z3, G0U<? super HatchMessageUiModel, Unit> g0u3) {
        super(2);
        this.$message = hatchMessageUiModel;
        this.$conversationTheme = hatchConversationTheme;
        this.$shouldRenderBubble = z;
        this.$hasStandaloneWidgets = z2;
        this.$standalonePresentations = list;
        this.$sideChatSessionId = str;
        this.$onWidgetSendMessage = g0u;
        this.$onWidgetSetState = g0w;
        this.$onFocusComposer = function0;
        this.$onGetWidgetHeight = g0u2;
        this.$onSetWidgetHeight = g0v;
        this.$inlineCallbacks = inlineContentCallbacks;
        this.$allowLivePresentationEntry = z3;
        this.$onSelectionReply = g0u3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        C3TH c3th;
        AuraThemeMode auraThemeMode;
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchMessageUiModel hatchMessageUiModel = this.$message;
            HatchMessageRole hatchMessageRole = hatchMessageUiModel.role;
            HatchMessageRole hatchMessageRole2 = HatchMessageRole.AGENT;
            if (hatchMessageRole == hatchMessageRole2) {
                c3th = C2VU.A02;
            } else {
                c3th = C2VU.A01;
            }
            B1U b1uA00 = B1V.A00(bfm, new HatchMessageItemKt$HatchMessageItem$8$1$sections$1$5$presentations$1(this.$shouldRenderBubble, this.$hasStandaloneWidgets, hatchMessageUiModel, this.$conversationTheme, this.$standalonePresentations, this.$sideChatSessionId, this.$onWidgetSendMessage, this.$onWidgetSetState, this.$onFocusComposer, this.$onGetWidgetHeight, this.$onSetWidgetHeight, this.$inlineCallbacks, this.$allowLivePresentationEntry, c3th), 414111474);
            bfm.AgE(686382581);
            if (this.$message.role != hatchMessageRole2 && !this.$conversationTheme.isCustom()) {
                if (AnonymousClass002.A0c(bfm).isLight) {
                    auraThemeMode = AuraThemeMode.DARK;
                } else {
                    auraThemeMode = AuraThemeMode.LIGHT;
                }
            } else {
                auraThemeMode = AuraThemeMode.DEFAULT;
            }
            AnonymousClass002.A19(bfm);
            AnonymousClass002.A0x(bfm, auraThemeMode, B1V.A00(bfm, new AnonymousClass1(this.$shouldRenderBubble, b1uA00, this.$message, this.$onSelectionReply, this.$inlineCallbacks, c3th), -1816155108), 384);
            return;
        }
        bfm.Afo();
    }
}
