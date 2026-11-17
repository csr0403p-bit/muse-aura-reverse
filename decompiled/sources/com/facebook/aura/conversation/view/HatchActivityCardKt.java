package com.facebook.aura.conversation.view;

import X.AHD;
import X.AKQ;
import X.AVy;
import X.AbstractC05192Wm;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BGR;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C0A8;
import X.C0dx;
import X.C0lh;
import X.C0v5;
import X.C0zJ;
import X.C1003AOr;
import X.C10G;
import X.C1515AkP;
import X.C1736ApY;
import X.C1822Arm;
import X.C1BO;
import X.C2VU;
import X.C31t;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.C90m;
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
import com.facebook.aura.conversation.viewmodel.ActivitySubAgentRowUiModel;
import com.facebook.aura.conversation.viewmodel.HatchRenderSegment;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchActivityCardKt {
    public static final long COMPLETED_COLOR;
    public static final float CONNECTOR_WIDTH = 1.0f;
    public static final float ICON_SIZE = 16.0f;

    /* renamed from: com.facebook.aura.conversation.view.HatchActivityCardKt$HatchActivityCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchRenderSegment.ActivitySegment $segment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchRenderSegment.ActivitySegment activitySegment, BRg bRg, int i, int i2) {
            super(2);
            this.$segment = activitySegment;
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
            HatchActivityCardKt.HatchActivityCard(this.$segment, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchActivityCardKt$HatchActivityCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchRenderSegment.ActivitySegment $segment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchRenderSegment.ActivitySegment activitySegment, BRg bRg, int i, int i2) {
            super(2);
            this.$segment = activitySegment;
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
            HatchActivityCardKt.HatchActivityCard(this.$segment, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchActivityCardKt$SubAgentRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ActivitySubAgentRowUiModel $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ActivitySubAgentRowUiModel activitySubAgentRowUiModel, int i) {
            super(2);
            this.$row = activitySubAgentRowUiModel;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchActivityCardKt.SubAgentRow(this.$row, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: DottedVerticalConnector-iJQMabo, reason: not valid java name */
    public static final void m522DottedVerticalConnectoriJQMabo(BRg bRg, long j, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1164008256);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1O = AnonymousClass001.A1O(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new HatchActivityCardKt$DottedVerticalConnector$1$1(j);
                bfm.Ai0(objAaT);
            }
            C0zJ.A00(bRg2, (G0U) objAaT, bfm, iA0d & 14);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchActivityCardKt$DottedVerticalConnector$2(bRg2, j, i, i2);
        }
    }

    public static final void HatchActivityCard(HatchRenderSegment.ActivitySegment activitySegment, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        float f;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(activitySegment, 0);
        bfm.AgG(1158891329);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(activitySegment, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
            AHD<ActivitySubAgentRowUiModel> ahd = activitySegment.subAgentRows;
            if (ahd.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(activitySegment, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            BRg bRgA0B = C3U4.A0B(AbstractC05192Wm.A00(AnonymousClass001.A0K(200, 0), AnonymousClass001.A0R(bRg2)), 0.0f, 8.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            String str = activitySegment.headerLabel;
            if (str != null) {
                bfm.AgE(307380263);
                C1BO c1boA01 = C31t.A01(new C1003AOr(null, 1.0f, 500.0f), bfm, MutableState.A0A(mutableState) ? 90.0f : 0.0f, 3120, 20);
                BS0 bs0 = BRg.A00;
                boolean zA1M = AnonymousClass003.A1M(bfm, c0dxA0T, mapCurrentChatThreadLogMetadata);
                Object objAaT2 = bfm.AaT();
                if (zA1M || objAaT2 == obj) {
                    objAaT2 = new HatchActivityCardKt$HatchActivityCard$2$1$1(c0dxA0T, mapCurrentChatThreadLogMetadata, mutableState);
                    bfm.Ai0(objAaT2);
                }
                BRg bRgA0B2 = C3U4.A0B(C0v5.A04(bs0, null, null, (Function0) objAaT2, true), 0.0f, 4.0f);
                InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0B2);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                AVy aVyA00 = BOf.A00(bfm, R.drawable.caret_right_circle, 0);
                AuraIconSize auraIconSize = AuraIconSize.TINY;
                long j2 = auraColorsA0c.tertiaryText;
                boolean zA65 = bfm.A65(c1boA01);
                Object objAaT3 = bfm.AaT();
                if (zA65 || objAaT3 == obj) {
                    objAaT3 = new HatchActivityCardKt$HatchActivityCard$2$2$1$1(c1boA01);
                    bfm.Ai0(objAaT3);
                }
                f = 8.0f;
                AuraIconKt.m2567AuraIconFHprtrg(AnonymousClass001.A0W(bs0, objAaT3), aVyA00, auraIconSize, null, j2, null, bfm, AnonymousClass001.A04(), 32);
                C01N.A09(bfm, bs0, 8.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, auraColorsA0c.tertiaryText, auraTypographyA0f.caption1Regular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, true);
            } else {
                f = 8.0f;
                bfm.AgE(308491179);
            }
            BBI.A0R(bbi, false);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(308514801);
                C01N.A08(bfm, BRg.A00, f);
                Iterator it = ahd.iterator();
                while (it.hasNext()) {
                    SubAgentRow((ActivitySubAgentRowUiModel) it.next(), bfm, ActivitySubAgentRowUiModel.$stable);
                }
            } else {
                bfm.AgE(308632043);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(activitySegment, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass3;
        }
    }

    public static final void logActivityCardHeaderClick(Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.ACTIVITY_CARD_HEADER, null, map, null);
    }

    /* renamed from: StatusCircle-RPmYEkk, reason: not valid java name */
    public static final void m523StatusCircleRPmYEkk(boolean z, long j, BFM bfm, int i) {
        bfm.AgG(1664144720);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0N(bfm, j);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            BRg bRgA07 = C10G.A07(BRg.A00, ICON_SIZE);
            boolean zA1B = AnonymousClass003.A1B(iA0n) | AnonymousClass001.A1O(iA0n);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new HatchActivityCardKt$StatusCircle$1$1(z, j);
                bfm.Ai0(objAaT);
            }
            C0zJ.A00(bRgA07, (G0U) objAaT, bfm, 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchActivityCardKt$StatusCircle$2(z, j, i);
        }
    }

    public static final void SubAgentRow(ActivitySubAgentRowUiModel activitySubAgentRowUiModel, BFM bfm, int i) {
        bfm.AgG(-1378816089);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(activitySubAgentRowUiModel, bfm, i) ? 1 : 0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            long j = activitySubAgentRowUiModel.isDone ? COMPLETED_COLOR : auraColorsA0c.tertiaryText;
            BS0 bs0 = BRg.A00;
            BRg bRgA0B = C3U4.A0B(BGR.A00(C0lh.A03, bs0), 4.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A05, 0);
            BBI bbi = (BBI) bfm;
            long j2 = bbi.A06;
            int i2 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            G0V g0vA0t = AnonymousClass002.A0t(bfm, interfaceC1380AiAA00, akqA04, g0v);
            Integer numValueOf = Integer.valueOf(i2);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v2 = C1515AkP.A03;
            BPg.A02(bfm, numValueOf, g0v2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BRg bRgThen = C10G.A08(bs0, ICON_SIZE).then(C10G.A00);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgThen);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0J, g0v);
            BPg.A02(bfm, akqA042, g0vA0t);
            AnonymousClass003.A15(g0u, g0v2, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90l c90l = C90l.A00;
            m523StatusCircleRPmYEkk(activitySubAgentRowUiModel.isDone, j, bfm, 0);
            if (activitySubAgentRowUiModel.showConnector) {
                bfm.AgE(1082217313);
                m522DottedVerticalConnectoriJQMabo(c90l.AiP(C10G.A08(bs0, CONNECTOR_WIDTH), 1.0f, true), auraColorsA0c.tertiaryText, bfm, 0, 0);
            } else {
                bfm.AgE(1082371073);
            }
            boolean zA1V = AnonymousClass003.A1V(bbi);
            C01N.A09(bfm, bs0, 12.0f);
            BRg bRgA0C = C3U4.A0C(AnonymousClass001.A0O(c90m, bs0, zA1V), 0.0f, 0.0f, 0.0f, activitySubAgentRowUiModel.showConnector ? 8.0f : 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 2.0f, 6);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0v);
            BPg.A02(bfm, akqA043, g0vA0t);
            AnonymousClass003.A15(g0u, g0v2, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(activitySubAgentRowUiModel.title, null, auraColorsA0c.secondaryText, C1822Arm.A00(null, auraTypographyA0f.caption2Regular, null, null, C1736ApY.A05, null, null, null, null, null, 0, 0, 0, 16777211, 0L, 0L, 0L, 0L), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            String str = activitySubAgentRowUiModel.subtitle;
            if (str != null) {
                bfm.AgE(-977885319);
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, auraColorsA0c.tertiaryText, auraTypographyA0f.caption2Regular, null, null, null, false, 0, zA1V ? 1 : 0, 2, null, null, null, bfm, 805306368, 6, 14834);
            } else {
                bfm.AgE(-977676534);
            }
            AnonymousClass002.A10(bbi, false, zA1V);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(activitySubAgentRowUiModel, i);
        }
    }

    static {
        long j = B6A.A01;
        COMPLETED_COLOR = 4279286145L << 32;
    }
}
