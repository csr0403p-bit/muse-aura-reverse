package com.facebook.aura.composer.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06c;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1AC;
import X.C1D8;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HDi;
import X.HxE;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.gateway.JarvisUtils;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.utils.HatchStringUtils;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$2 extends AbstractC7559F3s implements G2j<C06c, HxE<? extends String, ? extends String>, BFM, Integer, Unit> {
    public final /* synthetic */ AuraColors $colors;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ Function0<Unit> $onClearReply;
    public final /* synthetic */ Function0<Unit> $onReplyPreviewClick;
    public final /* synthetic */ HxE<String, String> $replyContent;
    public final /* synthetic */ String $threadId;
    public final /* synthetic */ AuraTypography $typography;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$2(AuraColors auraColors, HxE<String, String> hxE, boolean z, String str, Function0<Unit> function0, Function0<Unit> function02, AuraTypography auraTypography) {
        super(4);
        this.$colors = auraColors;
        this.$replyContent = hxE;
        this.$isPrimaryThread = z;
        this.$threadId = str;
        this.$onReplyPreviewClick = function0;
        this.$onClearReply = function02;
        this.$typography = auraTypography;
    }

    public final void invoke(C06c c06c, HxE<String, String> hxE, BFM bfm, int i) {
        int iA0e = i;
        C7384Etj.A0Y(c06c, 0);
        if ((i & 48) == 0) {
            iA0e = i | AnonymousClass004.A0e(bfm, hxE);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0e & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA0e)) {
            bfm.Afo();
            return;
        }
        if (hxE != null) {
            bfm.AgE(-1356035380);
            String str = hxE.first;
            String str2 = hxE.second;
            BS0 bs0 = BRg.A00;
            BRg bRgA0C = C3U4.A0C(C10G.A02, 8.0f, 8.0f, 8.0f, 0.0f);
            long j = this.$colors.primaryText;
            BRg bRgA03 = C1b8.A03(bRgA0C, C1D8.A00(16.0f), HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.05f));
            boolean zEquals = hxE.equals(this.$replyContent);
            C1YD c1yd = new C1YD(0);
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onReplyPreviewClick, AnonymousClass001.A1R(bfm, this.$threadId, bfm.A66(this.$isPrimaryThread)));
            boolean z = this.$isPrimaryThread;
            String str3 = this.$threadId;
            Function0<Unit> function0 = this.$onReplyPreviewClick;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$2$1$1(z, str3, function0);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0C2 = C3U4.A0C(C0v5.A01(null, null, bRgA03, c1yd, null, (Function0) objAaT, zEquals), 10.0f, 6.0f, 0.0f, 6.0f);
            C1AC c1ac = C2VU.A04;
            boolean z2 = this.$isPrimaryThread;
            String str4 = this.$threadId;
            Function0<Unit> function02 = this.$onClearReply;
            AuraTypography auraTypography = this.$typography;
            AuraColors auraColors = this.$colors;
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
            BBI bbi = (BBI) bfm;
            long j2 = bbi.A06;
            int i2 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C2);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            if (str2 != null) {
                bfm.AgE(-1580244874);
                AuraImageKt.AuraImage(str2, C11U.A01(C10G.A07(C3U4.A0C(bs0, 0.0f, 0.0f, 10.0f, 0.0f), 32.0f), 8.0f), AnonymousClass005.A0Z(C7197Ei9.A0P), null, null, false, null, null, true, null, bfm, 100663296, 760);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1579832605);
                BBI.A0R(bbi, false);
            }
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, JarvisUtils.INSTANCE.getSelectedAssistantName(AnonymousClass002.A0h(bfm)), R.string._name_removed__res_0x7f120721), null, auraColors.secondaryText, auraTypography.caption1Regular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            boolean zA65 = bfm.A65(str);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = HatchStringUtils.INSTANCE.stripMarkdown(str);
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2639AuraTextUY9GdpU((String) objAaT2, null, auraColors.primaryText, auraTypography.footnoteRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120715);
            BRg bRgA07 = C10G.A07(bs0, 44.0f);
            C1YD c1yd2 = new C1YD(0);
            boolean zA1P = AnonymousClass003.A1P(bfm, str4, function02, bfm.A66(z2));
            Object objAaT3 = bfm.AaT();
            if (zA1P || objAaT3 == C78N.A00) {
                objAaT3 = new HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$2$2$2$1(z2, str4, function02);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA04 = C0v5.A04(bRgA07, c1yd2, null, (Function0) objAaT3, true);
            boolean zA652 = bfm.A65(strA01);
            Object objAaT4 = bfm.AaT();
            if (zA652 || objAaT4 == C78N.A00) {
                objAaT4 = new HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$2$2$3$1(strA01);
                bfm.Ai0(objAaT4);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT4, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0Y);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.nav_close, 0), AuraIconSize.X_TINY, null, auraColors.secondaryText, null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.AgE(-1351678206);
        }
        AnonymousClass001.A1D(bfm);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(C06c c06c, HxE<? extends String, ? extends String> hxE, BFM bfm, Integer num) {
        invoke(c06c, (HxE<String, String>) hxE, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
