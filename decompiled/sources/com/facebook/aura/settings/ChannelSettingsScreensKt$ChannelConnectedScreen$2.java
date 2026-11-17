package com.facebook.aura.settings;

import X.AKH;
import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1DG;
import X.C1YL;
import X.C2VU;
import X.C3U4;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ChannelSettingsScreensKt$ChannelConnectedScreen$2 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
    public final /* synthetic */ AuraButtonSize $chatButtonSize;
    public final /* synthetic */ String $chatButtonText;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $contentAfterStatus;
    public final /* synthetic */ BRg $contentModifier;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $icon;
    public final /* synthetic */ boolean $needsAttention;
    public final /* synthetic */ Function0<Unit> $onChatClick;
    public final /* synthetic */ Function0<Unit> $onDisconnect;
    public final /* synthetic */ String $title;
    public final /* synthetic */ float $topSpacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelSettingsScreensKt$ChannelConnectedScreen$2(BRg bRg, boolean z, String str, Function0<Unit> function0, Function0<Unit> function02, AuraButtonSize auraButtonSize, float f, G0V<? super BFM, ? super Integer, Unit> g0v, String str2, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w) {
        super(4);
        this.$contentModifier = bRg;
        this.$needsAttention = z;
        this.$chatButtonText = str;
        this.$onDisconnect = function0;
        this.$onChatClick = function02;
        this.$chatButtonSize = auraButtonSize;
        this.$topSpacing = f;
        this.$icon = g0v;
        this.$title = str2;
        this.$contentAfterStatus = g0w;
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
        m1900invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-i1RSzL4, reason: not valid java name */
    public final void m1900invokei1RSzL4(float f, float f2, BFM bfm, int i) {
        AuraLabelButtonStyle auraLabelButtonStylePrimary;
        int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A05(bfm, f2);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
            bfm.Afo();
            return;
        }
        BS0 bs0 = BRg.A00;
        C1062ATq c1062ATq = C10G.A01;
        BRg bRgThen = c1062ATq.then(this.$contentModifier);
        boolean z = this.$needsAttention;
        String strA0s = this.$chatButtonText;
        Function0<Unit> function0 = this.$onDisconnect;
        Function0<Unit> function02 = this.$onChatClick;
        AuraButtonSize auraButtonSize = this.$chatButtonSize;
        float f3 = this.$topSpacing;
        G0V<BFM, Integer, Unit> g0v = this.$icon;
        String str = this.$title;
        G0W<C07C, BFM, Integer, Unit> g0w = this.$contentAfterStatus;
        InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
        BBI bbi = (BBI) bfm;
        long j = bbi.A06;
        int i2 = (int) (j ^ (j >>> 32));
        AKQ akqA04 = BBI.A04(bbi);
        BRg bRgA01 = AxM.A01(bfm, bRgThen);
        Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
        if (bbi.A0V == null) {
            C00x.A00();
            throw F60.createAndThrow();
        }
        AnonymousClass005.A0n(bfm, bbi, function03);
        G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v2 = C1515AkP.A04;
        BPg.A02(bfm, interfaceC1380AiAA0c, g0v2);
        G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
        G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, i2);
        G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
        G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
        C0z7 c0z7 = C0z7.A00;
        BRg bRgA0B = C3U4.A0B(AnonymousClass005.A0T(bfm, c1062ATq), C06G.A00(bfm), 0.0f);
        InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
        int iA0D = AnonymousClass001.A0D(bbi);
        AKQ akqA042 = BBI.A04(bbi);
        BRg bRgA012 = AxM.A01(bfm, bRgA0B);
        AnonymousClass005.A0n(bfm, bbi, function03);
        BPg.A02(bfm, interfaceC1380AiAA00, g0v2);
        BPg.A02(bfm, akqA042, g0v3);
        AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
        BPg.A02(bfm, bRgA012, g0vA0u);
        C90l c90l = C90l.A00;
        C01N.A08(bfm, bs0, f + f3);
        AnonymousClass001.A1H(bfm, g0v, 0);
        AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0C(bfm), C01N.A01(bfm, bs0, AuraDimensKt.SpacingMedium).title2Emphasized, null, null, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
        C01N.A05(bfm, bs0);
        HatchTelegramSettingsScreenKt.StatusIndicator(true, null, z, bfm, 6, 2);
        if (z) {
            bfm.AgE(371144218);
            C01N.A06(bfm, bs0);
            ChannelSettingsScreensKt.ChannelConnectionIssueDescription(null, bfm, 0, 1);
            BBI.A0R(bbi, false);
        } else {
            bfm.AgE(371246084);
            BBI.A0R(bbi, false);
        }
        AnonymousClass001.A1G(c90l, bfm, g0w, 6);
        C01N.A08(bfm, bs0, 80.0f);
        C01N.A04(bfm, bbi, bs0, f2, true);
        if (z) {
            bfm.AgE(176632172);
            strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f1206cd);
            bfm.AgE(176637281);
            auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.destructive(null, bfm, 48, 1);
        } else {
            bfm.AgE(176634562);
            BBI.A0R(bbi, false);
            bfm.AgE(176638429);
            auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
        }
        BBI.A0R(bbi, false);
        BRg bRgA0G = AnonymousClass007.A0G(c0z7, bs0);
        AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
        BRg bRgA0C = C3U4.A0C(bRgA0G, C06G.A01(bfm, akh), 0.0f, C06G.A01(bfm, akh), C06G.A01(bfm, akh) + f2);
        if (z) {
            function02 = function0;
        }
        AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA0s, null, bRgA0C, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, 0, 0, 134201285);
        BBI.A0R(bbi, true);
    }
}
