package com.facebook.aura.modellock.view;

import X.AGH;
import X.AKH;
import X.AKQ;
import X.AbstractC04540eo;
import X.AbstractC2271BQs;
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
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1DM;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C78N;
import X.C9m9;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.conversation.widget.api.ConversationComposerStatusContext;
import com.facebook.aura.conversation.widget.api.ConversationTimelineSurface;
import com.facebook.aura.modellock.ModelLockAppealStage;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchModelLockCardKt {

    /* renamed from: com.facebook.aura.modellock.view.HatchModelLockCardKt$HatchModelLockCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ModelLockAppealStage $appealStage;
        public final /* synthetic */ ConversationComposerStatusContext $context;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ModelLockAppealStage modelLockAppealStage, ConversationComposerStatusContext conversationComposerStatusContext, BRg bRg, int i, int i2) {
            super(2);
            this.$appealStage = modelLockAppealStage;
            this.$context = conversationComposerStatusContext;
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
            HatchModelLockCardKt.HatchModelLockCard(this.$appealStage, this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModelLockAppealStage.values().length];
            try {
                AnonymousClass002.A13(ModelLockAppealStage.NOT_SUBMITTED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ModelLockAppealStage.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ModelLockAppealStage.IN_REVIEW, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ModelLockAppealStage.DENIED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void HatchModelLockCard(ModelLockAppealStage modelLockAppealStage, ConversationComposerStatusContext conversationComposerStatusContext, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        String strA0f;
        BRg bRgA0Q = bRg;
        boolean zA1a = AnonymousClass002.A1a(modelLockAppealStage, conversationComposerStatusContext);
        bfm.AgG(455351771);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, modelLockAppealStage) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass002.A06(AnonymousClass004.A1Y(conversationComposerStatusContext, bfm, i) ? 1 : 0);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA08), bfm, iA08)) {
            if (i4 != 0) {
                bRgA0Q = BRg.A00;
            }
            C1DM c1dmA0R = C06G.A0R(bfm);
            int i5 = iA08 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean z = i5 == 32 || ((iA08 & 64) != 0 && bfm.A65(conversationComposerStatusContext));
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = modelLockCardImpression(conversationComposerStatusContext);
                bfm.Ai0(objAaT);
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRgA0Q.then(c1062ATq);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgThen2 = C1b8.A01(C11U.A03(AbstractC04540eo.A00(bRgThen, c1dmA0R, 8.0f, 4, C06G.A0F(bfm, akh), C06G.A0F(bfm, akh)), c1dmA0R), AnonymousClass001.A0f(bfm, akh).elevated).then((BRg) objAaT);
            float f = AuraDimensKt.SpacingSmall;
            BRg bRgA09 = C3U4.A09(bRgThen2, f);
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = HatchModelLockCardKt$HatchModelLockCard$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA09, objAaT2, false);
            C9m9 c9m9A00 = AcQ.A00(f);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, iA0D);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgA07 = C3U4.A07(BRg.A00, AuraDimensKt.SpacingXsmall);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(AcQ.A06, bfm, c3th, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA07);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            int iOrdinal = modelLockAppealStage.ordinal();
            if (iOrdinal == 0 || iOrdinal == zA1a || iOrdinal == 2) {
                bfm.AgE(-190227207);
                i3 = R.string._name_removed__res_0x7f120483;
            } else {
                if (iOrdinal != 3) {
                    throw AnonymousClass003.A0k(bfm, bbi, -190232429);
                }
                bfm.AgE(-190223424);
                i3 = R.string._name_removed__res_0x7f120472;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0s(bfm, bbi, i3), null, C06G.A0C(bfm), C06G.A0W(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            if (iOrdinal == 0) {
                bfm.AgE(-190213041);
                strA0f = AnonymousClass003.A0f(bfm, bbi, HatchAppName.value, R.string._name_removed__res_0x7f120470);
            } else if (iOrdinal == zA1a) {
                bfm.AgE(-190208321);
                strA0f = AnonymousClass003.A0f(bfm, bbi, HatchAppName.value, R.string._name_removed__res_0x7f120484);
            } else if (iOrdinal != 2) {
                bfm.AgE(-190197197);
                strA0f = AnonymousClass003.A0f(bfm, bbi, HatchAppName.value, R.string._name_removed__res_0x7f120471);
            } else {
                bfm.AgE(-190201278);
                strA0f = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120473);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0f, null, C06G.A08(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, zA1a);
            if (iOrdinal == 0) {
                boolean z2 = false;
                bfm.AgE(-1470486908);
                AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
                boolean z3 = i5 == 32 || ((iA08 & 64) != 0 && bfm.A65(conversationComposerStatusContext));
                Object objAaT3 = bfm.AaT();
                if (z3 || objAaT3 == obj) {
                    objAaT3 = modelLockCardClickMetadata(conversationComposerStatusContext);
                    bfm.Ai0(objAaT3);
                }
                Map map = (Map) objAaT3;
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206c2);
                AuraLabelButtonStyle auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, zA1a ? 1 : 0);
                AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                if (i5 == 32 || ((iA08 & 64) != 0 && bfm.A67(conversationComposerStatusContext))) {
                    z2 = true;
                }
                boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, bfm.A67(map), z2);
                Object objAaT4 = bfm.AaT();
                if (zA1V || objAaT4 == obj) {
                    objAaT4 = new HatchModelLockCardKt$HatchModelLockCard$2$2$1(conversationComposerStatusContext, map, auraNavigatorA0b);
                    bfm.Ai0(objAaT4);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM("hatch-model-lock-get-support", strA01, null, c1062ATq, auraLabelButtonStyleSecondary, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT4, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199686, 0, 0, 134201284);
            } else if (iOrdinal == zA1a || iOrdinal != 2) {
                bfm.AgE(-463043147);
            } else {
                bfm.AgE(-1469859127);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120474);
                AuraLabelButtonStyle auraLabelButtonStyleSecondary2 = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, zA1a ? 1 : 0);
                AuraButtonSize auraButtonSize2 = AuraButtonSize.SMALL;
                Object objAaT5 = bfm.AaT();
                if (objAaT5 == obj) {
                    objAaT5 = HatchModelLockCardKt$HatchModelLockCard$2$3$1.INSTANCE;
                    bfm.Ai0(objAaT5);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM("hatch-model-lock-in-review", strA012, null, c1062ATq, auraLabelButtonStyleSecondary2, auraButtonSize2, null, false, false, false, false, false, null, null, (Function0) objAaT5, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 805506054, RuntimeInternals.IOPRIO_BACKGROUND, 0, 134200772);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(modelLockAppealStage, conversationComposerStatusContext, bRgA0Q, i, i2);
        }
    }

    public static final boolean isAssist(ConversationComposerStatusContext conversationComposerStatusContext) {
        return AnonymousClass002.A1Z(conversationComposerStatusContext.surface, ConversationTimelineSurface.ASSIST);
    }

    public static final void logGetSupportClick(ConversationComposerStatusContext conversationComposerStatusContext, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.COMPOSER, HatchInteractionEnumsKt.chatScreen(conversationComposerStatusContext.isPrimaryConversation), HatchComponent.CONTACT_SUPPORT, null, map, null);
    }

    public static final Map<String, String> modelLockCardClickMetadata(ConversationComposerStatusContext conversationComposerStatusContext) {
        boolean z = conversationComposerStatusContext.isPrimaryConversation;
        String str = conversationComposerStatusContext.conversationId;
        if (z) {
            str = null;
        }
        return HatchInteractionEnumsKt.chatThreadLogMetadata(z, str, null, assistEntryPoint(conversationComposerStatusContext));
    }

    public static final BRg modelLockCardImpression(ConversationComposerStatusContext conversationComposerStatusContext) {
        HatchScreen hatchScreenChatScreen = HatchInteractionEnumsKt.chatScreen(conversationComposerStatusContext.isPrimaryConversation);
        Map<String, String> mapAssistEntryPoint = assistEntryPoint(conversationComposerStatusContext);
        String strA0M = isAssist(conversationComposerStatusContext) ? FGI.A0M(":", HatchComposerEntryPoint.ASSIST.getValue()) : "";
        BS0 bs0 = BRg.A00;
        HatchOrigin hatchOrigin = HatchOrigin.CHAT;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        HatchSubsurface hatchSubsurface = HatchSubsurface.COMPOSER;
        HatchComponent hatchComponent = HatchComponent.MODEL_LOCK_CARD;
        if (mapAssistEntryPoint.isEmpty()) {
            mapAssistEntryPoint = null;
        }
        return HatchImpressionModifierKt.hatchImpression(bs0, hatchOrigin, hatchSurface, hatchSubsurface, hatchScreenChatScreen, hatchComponent, null, mapAssistEntryPoint, null, 500L, 0.0f, null, FGI.A0U("model_lock_card:", hatchScreenChatScreen.getValue(), strA0M), null);
    }

    public static final Map<String, String> assistEntryPoint(ConversationComposerStatusContext conversationComposerStatusContext) {
        return isAssist(conversationComposerStatusContext) ? AnonymousClass006.A10(HatchMetadataKey.ENTRY_POINT.getValue(), HatchComposerEntryPoint.ASSIST.getValue()) : AGH.A0E();
    }
}
