package com.facebook.aura.conversation.view;

import X.AFz;
import X.AKH;
import X.AKQ;
import X.AVy;
import X.AbstractC05192Wm;
import X.AbstractC2271BQs;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.B1U;
import X.B1V;
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
import X.C0A8;
import X.C0v5;
import X.C0z7;
import X.C1003AOr;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C2VU;
import X.C31t;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.view.richcontent.CurrentChatThreadLogMetadataKt;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.gateway.JarvisUtils;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchSpokenSummaryRowKt {
    /* renamed from: HatchSpokenSummaryRow-sW7UJKQ, reason: not valid java name */
    public static final void m663HatchSpokenSummaryRowsW7UJKQ(HatchMessageUiModel hatchMessageUiModel, long j, BRg bRg, G0U<? super HatchMessageUiModel, Unit> g0u, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        G0U<? super HatchMessageUiModel, Unit> g0u2 = g0u;
        C7384Etj.A0Y(hatchMessageUiModel, 0);
        bfm.AgG(1541516661);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchMessageUiModel, bfm, i) ? 1 : 0) | i : i;
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0u2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1155, 1154), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                g0u2 = null;
            }
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
            String str = hatchMessageUiModel.content;
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchSpokenSummaryRowKt$HatchSpokenSummaryRow$expanded$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableState = (MutableState) AFz.A03(bfm, (Function0) objAaT, objArr);
            C1BO c1boA01 = C31t.A01(new C1003AOr(null, 1.0f, 500.0f), bfm, MutableState.A0A(mutableState) ? 90.0f : 0.0f, 3120, 20);
            String selectedAssistantName = JarvisUtils.INSTANCE.getSelectedAssistantName(AnonymousClass002.A0h(bfm));
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(-366184325);
                i3 = R.string._name_removed__res_0x7f120883;
            } else {
                bfm.AgE(-366181700);
                i3 = R.string._name_removed__res_0x7f120881;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i3);
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            String strA0t = AnonymousClass001.A0t(bfm, selectedAssistantName, R.string._name_removed__res_0x7f120885);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgReactionBadgeOverflowPadding = HatchMessageBubbleKt.reactionBadgeOverflowPadding(bRg2.then(c1062ATq), !hatchMessageUiModel.reactions.isEmpty());
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            long j2 = bbi.A06;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgReactionBadgeOverflowPadding);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i6);
            G0U<InterfaceC1516AkQ, Unit> g0u3 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u3);
            C0z7 c0z7 = C0z7.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA00 = AbstractC05192Wm.A00(AnonymousClass005.A0O(), c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA00);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u3, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            Function0 function02 = null;
            boolean zA1N = AnonymousClass003.A1N(bfm, mapCurrentChatThreadLogMetadata, mutableState);
            Object objAaT2 = bfm.AaT();
            if (zA1N || objAaT2 == obj) {
                objAaT2 = new HatchSpokenSummaryRowKt$HatchSpokenSummaryRow$1$1$1$1(mapCurrentChatThreadLogMetadata, mutableState);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA04 = C0v5.A04(c1062ATq, null, null, (Function0) objAaT2, true);
            boolean zA1K = AnonymousClass003.A1K(bfm, strA0t, strA01);
            Object objAaT3 = bfm.AaT();
            if (zA1K || objAaT3 == obj) {
                objAaT3 = new HatchSpokenSummaryRowKt$HatchSpokenSummaryRow$1$1$2$1(strA0t, strA01);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA08 = C3U4.A08(AnonymousClass006.A0O(AnonymousClass001.A0Y(bRgA04, objAaT3, true)), 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA08);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u3, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120884);
            C1822Arm c1822ArmA0W = C06G.A0W(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(strA012, null, C06G.A0I(bfm, akh), c1822ArmA0W, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            C01N.A09(bfm, bs0, 6.0f);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.chevron_right_wght400_outline_24, 0);
            AuraIconSize auraIconSize = AuraIconSize.TINY;
            long jA0I = C06G.A0I(bfm, akh);
            boolean zA65 = bfm.A65(c1boA01);
            Object objAaT4 = bfm.AaT();
            if (zA65 || objAaT4 == obj) {
                objAaT4 = new HatchSpokenSummaryRowKt$HatchSpokenSummaryRow$1$1$3$1$1(c1boA01);
                bfm.Ai0(objAaT4);
            }
            AuraIconKt.m2567AuraIconFHprtrg(AnonymousClass001.A0W(bs0, objAaT4), aVyA00, auraIconSize, null, jA0I, null, bfm, (AVy.$stable << 3) | 3456, 32);
            BBI.A0R(bbi, true);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(632987270);
                B1U b1uA00 = B1V.A00(bfm, new HatchSpokenSummaryRowKt$HatchSpokenSummaryRow$1$1$summaryText$1(AnonymousClass006.A0w(bfm, selectedAssistantName, str, R.string._name_removed__res_0x7f120882), str), 1551963824);
                if (g0u2 == null) {
                    bfm.AgE(633673485);
                } else {
                    boolean zA1Y = AnonymousClass001.A1Y(g0u2, bfm, 633673486) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchMessageUiModel)));
                    Object objAaT5 = bfm.AaT();
                    if (zA1Y || objAaT5 == obj) {
                        objAaT5 = new HatchSpokenSummaryRowKt$HatchSpokenSummaryRow$1$1$4$1$1(g0u2, hatchMessageUiModel);
                        bfm.Ai0(objAaT5);
                    }
                    function02 = (Function0) objAaT5;
                }
                BBI.A0R(bbi, false);
                HatchMessageLongPressMenuHostKt.HatchMessageLongPressMenuHost(hatchMessageUiModel, function02, false, null, B1V.A00(bfm, new HatchSpokenSummaryRowKt$HatchSpokenSummaryRow$1$1$5(b1uA00), 904190135), bfm, HatchMessageUiModel.$stable | RuntimeInternals.IOPRIO_BACKGROUND | (iA05 & 14), 12);
            } else {
                bfm.AgE(633981905);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            HatchMessageBubbleKt.ReactionBadge(c0z7, hatchMessageUiModel.reactions, hatchMessageUiModel.id, hatchMessageUiModel.serverMessageId, bfm, 6, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchSpokenSummaryRowKt$HatchSpokenSummaryRow$2(hatchMessageUiModel, j, bRg2, g0u2, i, i2);
        }
    }

    public static final void logSpokenSummaryToggleClick(Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.SPOKEN_SUMMARY_TOGGLE, null, map, null);
    }
}
