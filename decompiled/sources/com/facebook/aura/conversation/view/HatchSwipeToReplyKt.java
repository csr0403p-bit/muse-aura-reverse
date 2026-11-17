package com.facebook.aura.conversation.view;

import X.AGO;
import X.AKH;
import X.AKQ;
import X.AXN;
import X.AYD;
import X.AaM;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BLU;
import X.BOf;
import X.BRg;
import X.C00q;
import X.C00x;
import X.C06G;
import X.C0dx;
import X.C0z7;
import X.C1515AkP;
import X.C1BO;
import X.C1er;
import X.C2VU;
import X.C3UX;
import X.C78N;
import X.EnumC1820Arj;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.view.richcontent.CurrentChatThreadLogMetadataKt;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchSwipeToReplyKt {
    public static final float REPLY_ACTIVATION_SLOP_MULTIPLIER = 2.0f;
    public static final float REPLY_AFFORDANCE_MIN_SCALE = 0.6f;
    public static final float REPLY_OVERSHOOT_RESISTANCE = 0.35f;
    public static final float REPLY_POST_ARM_RELEASE_MULTIPLIER = 2.5f;
    public static final float REPLY_VERTICAL_VETO_MULTIPLIER = 0.75f;
    public static final float ReplyAffordanceSlot = 44.0f;
    public static final float ReplyMaxTranslate = 80.0f;
    public static final float ReplyThreshold = 56.0f;
    public static final AKH<C1BO<Boolean>> LocalConversationListScrolling = new AGO(HatchSwipeToReplyKt$LocalConversationListScrolling$1.INSTANCE);
    public static final AKH<MutableState<Boolean>> LocalBubbleTextSelectionActive = new AGO(HatchSwipeToReplyKt$LocalBubbleTextSelectionActive$1.INSTANCE);

    /* renamed from: com.facebook.aura.conversation.view.HatchSwipeToReplyKt$HatchReplyAffordance$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Float> $progress;
        public final /* synthetic */ Function0<Float> $translation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Float> function0, Function0<Float> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$translation = function0;
            this.$progress = function02;
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
            HatchSwipeToReplyKt.HatchReplyAffordance(this.$translation, this.$progress, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchSwipeToReplyKt$HatchReplySwipeContainer$2, reason: invalid class name and case insensitive filesystem */
    public final class C115112 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G2j<BRg, G0U<? super BLU, Unit>, BFM, Integer, Unit> $content;
        public final /* synthetic */ HatchMessageUiModel $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onReply;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115112(HatchMessageUiModel hatchMessageUiModel, G0U<? super HatchMessageUiModel, Unit> g0u, BRg bRg, G2j<? super BRg, ? super G0U<? super BLU, Unit>, ? super BFM, ? super Integer, Unit> g2j, int i, int i2) {
            super(2);
            this.$message = hatchMessageUiModel;
            this.$onReply = g0u;
            this.$modifier = bRg;
            this.$content = g2j;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSwipeToReplyKt.HatchReplySwipeContainer(this.$message, this.$onReply, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchSwipeToReplyKt$HatchReplySwipeContainer$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G2j<BRg, G0U<? super BLU, Unit>, BFM, Integer, Unit> $content;
        public final /* synthetic */ HatchMessageUiModel $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onReply;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(HatchMessageUiModel hatchMessageUiModel, G0U<? super HatchMessageUiModel, Unit> g0u, BRg bRg, G2j<? super BRg, ? super G0U<? super BLU, Unit>, ? super BFM, ? super Integer, Unit> g2j, int i, int i2) {
            super(2);
            this.$message = hatchMessageUiModel;
            this.$onReply = g0u;
            this.$modifier = bRg;
            this.$content = g2j;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSwipeToReplyKt.HatchReplySwipeContainer(this.$message, this.$onReply, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchReplySwipeContainer(HatchMessageUiModel hatchMessageUiModel, G0U<? super HatchMessageUiModel, Unit> g0u, BRg bRg, G2j<? super BRg, ? super G0U<? super BLU, Unit>, ? super BFM, ? super Integer, Unit> g2j, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass6;
        BRg bRgA0P = bRg;
        AnonymousClass002.A1B(hatchMessageUiModel, 0, g2j);
        bfm.AgG(1657411855);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchMessageUiModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRgA0P);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g2j);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            if (g0u == null) {
                Object objA0p = AnonymousClass001.A0p(bfm, 1012773866);
                if (objA0p == C78N.A00) {
                    objA0p = HatchSwipeToReplyKt$HatchReplySwipeContainer$1$1.INSTANCE;
                    bfm.Ai0(objA0p);
                }
                AnonymousClass001.A1F(bRgA0P, objA0p, bfm, g2j, ((iA05 >> 3) & 896) | ((iA05 >> 6) & 14) | 48);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass6 = new C115112(hatchMessageUiModel, g0u, bRgA0P, g2j, i, i2);
                    bBbAAc.A06 = anonymousClass6;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, 1012813267);
            int i4 = HatchMessageUiModel.$stable;
            MutableState mutableStateA00 = C1er.A00(bfm, hatchMessageUiModel);
            MutableState mutableStateA002 = C1er.A00(bfm, g0u);
            MutableState mutableStateA003 = C1er.A00(bfm, CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0));
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            C1BO c1bo = (C1BO) bfm.A6v(LocalConversationListScrolling);
            boolean zA1Z = AnonymousClass002.A1Z(bfm.A6v(Am0.A0A), EnumC1820Arj.A03);
            boolean zA1T = AnonymousClass003.A1T(bfm, axnA0Y, zA1Z);
            Object objAaT2 = bfm.AaT();
            if (zA1T || objAaT2 == obj) {
                objAaT2 = new ReplySwipeMetrics(axnA0Y.Ah4(ReplyThreshold), axnA0Y.Ah4(ReplyMaxTranslate), axnA0Y.Ah4(ReplyAffordanceSlot), zA1Z);
                bfm.Ai0(objAaT2);
            }
            ReplySwipeMetrics replySwipeMetrics = (ReplySwipeMetrics) objAaT2;
            float f = zA1Z ? -1.0f : 1.0f;
            C00q c00q = (C00q) AnonymousClass007.A0T(bfm, obj);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = AnonymousClass003.A0R(bfm, new HatchSwipeToReplyKt$HatchReplySwipeContainer$isSwiping$2$1(c00q));
            }
            C1BO c1bo2 = (C1BO) objAaT3;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT4;
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0f(bfm, obj, null);
            MutableState<Boolean> mutableState3 = (MutableState) AnonymousClass005.A0h(bfm, obj, false);
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = new HatchSwipeToReplyKt$HatchReplySwipeContainer$3$1(mutableState);
                bfm.Ai0(objAaT5);
            }
            BRg bRgA0W = AnonymousClass005.A0W(bRgA0P, objAaT5);
            boolean zA1T2 = AnonymousClass005.A1T(bfm, mutableStateA002, mutableStateA00, mutableStateA003, AnonymousClass005.A1X(bfm, replySwipeMetrics, c0dxA0T, AnonymousClass003.A1N(bfm, c3ux, c1bo), bfm.A62(f)));
            Object objAaT6 = bfm.AaT();
            if (zA1T2 || objAaT6 == obj) {
                objAaT6 = new HatchSwipeToReplyKt$HatchReplySwipeContainer$4$1(c1bo, mutableState3, f, replySwipeMetrics, c00q, c0dxA0T, mutableStateA002, mutableStateA00, mutableStateA003, c3ux);
                bfm.Ai0(objAaT6);
            }
            BRg bRgA01 = AaM.A01(bRgA0W, (PointerInputEventHandler) objAaT6, replySwipeMetrics, c1bo);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            C0z7 c0z7 = C0z7.A00;
            if (C1BO.A0F(c1bo2)) {
                bfm.AgE(1523288764);
                boolean zA62 = bfm.A62(f);
                Object objAaT7 = bfm.AaT();
                if (zA62 || objAaT7 == obj) {
                    objAaT7 = new HatchSwipeToReplyKt$HatchReplySwipeContainer$5$1$1(c00q, f);
                    bfm.Ai0(objAaT7);
                }
                Function0 function02 = (Function0) objAaT7;
                boolean zA65 = bfm.A65(replySwipeMetrics);
                Object objAaT8 = bfm.AaT();
                if (zA65 || objAaT8 == obj) {
                    objAaT8 = new HatchSwipeToReplyKt$HatchReplySwipeContainer$5$2$1(c00q, replySwipeMetrics);
                    bfm.Ai0(objAaT8);
                }
                Function0 function03 = (Function0) objAaT8;
                BRg bRgA4C = c0z7.A4C(C2VU.A0B, BRg.A00);
                boolean zA652 = bfm.A65(replySwipeMetrics);
                Object objAaT9 = bfm.AaT();
                if (zA652 || objAaT9 == obj) {
                    objAaT9 = new HatchSwipeToReplyKt$HatchReplySwipeContainer$5$3$1(replySwipeMetrics, mutableState, mutableState2);
                    bfm.Ai0(objAaT9);
                }
                HatchReplyAffordance(function02, function03, AYD.A03(bRgA4C, (G0U) objAaT9), bfm, 0, 0);
            } else {
                bfm.AgE(1523747161);
            }
            BBI.A0R(bbiA0M, false);
            AnonymousClass003.A0m(bfm, LocalBubbleTextSelectionActive.A04(mutableState3), new HatchSwipeToReplyKt$HatchReplySwipeContainer$5$4(g2j, f, c00q, mutableState2), 166023945);
            bRgA0P = AnonymousClass001.A0P(bbiA0M, bRgA0P);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass6 = new AnonymousClass6(hatchMessageUiModel, g0u, bRgA0P, g2j, i, i2);
            bBbAAc.A06 = anonymousClass6;
        }
    }

    public static final AKH<MutableState<Boolean>> getLocalBubbleTextSelectionActive() {
        return LocalBubbleTextSelectionActive;
    }

    public static final AKH<C1BO<Boolean>> getLocalConversationListScrolling() {
        return LocalConversationListScrolling;
    }

    public static final void logSwipeToReply(Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logSwipe(HatchSurface.CHAT, null, HatchScreen.MAIN_CHAT, HatchComponent.REPLY_BUTTON, map);
    }

    public static final void HatchReplyAffordance(Function0<Float> function0, Function0<Float> function02, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1540193857);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            boolean zA1C = AnonymousClass003.A1C(iA0T) | AnonymousClass001.A1L(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new HatchSwipeToReplyKt$HatchReplyAffordance$1$1(function02, function0);
                bfm.Ai0(objAaT);
            }
            AuraIconKt.m2567AuraIconFHprtrg(AnonymousClass001.A0W(bRg, objAaT), BOf.A00(bfm, R.drawable.arrow_big_reply_wght400_outline_24, 0), AuraIconSize.SMALL, null, C06G.A06(bfm), null, bfm, AnonymousClass001.A04(), 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, function02, bRg, i, i2);
        }
    }

    public static final /* synthetic */ HatchMessageUiModel access$HatchReplySwipeContainer$lambda$1(C1BO c1bo) {
        return (HatchMessageUiModel) c1bo.getValue();
    }

    public static final /* synthetic */ BLU access$HatchReplySwipeContainer$lambda$12(MutableState mutableState) {
        return (BLU) mutableState.getValue();
    }

    public static final /* synthetic */ Map access$HatchReplySwipeContainer$lambda$3(C1BO c1bo) {
        return (Map) c1bo.getValue();
    }

    public static final /* synthetic */ BLU access$HatchReplySwipeContainer$lambda$9(MutableState mutableState) {
        return (BLU) mutableState.getValue();
    }
}
