package com.facebook.aura.settings;

import X.AKH;
import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1DG;
import X.C3IL;
import X.C3U4;
import X.C90l;
import X.F60;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ChannelSettingsScreensKt$ChannelConsentScreen$1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
    public final /* synthetic */ AuraButtonSize $connectButtonSize;
    public final /* synthetic */ String $connectButtonText;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $contentAfterDescription;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $contentBeforeConnectButton;
    public final /* synthetic */ BRg $contentModifier;
    public final /* synthetic */ String $description;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $icon;
    public final /* synthetic */ boolean $isConnecting;
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ Function0<Unit> $onConnect;
    public final /* synthetic */ String $title;
    public final /* synthetic */ float $topSpacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelSettingsScreensKt$ChannelConsentScreen$1(BRg bRg, boolean z, String str, AuraButtonSize auraButtonSize, boolean z2, Function0<Unit> function0, float f, G0V<? super BFM, ? super Integer, Unit> g0v, String str2, String str3, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w2) {
        super(4);
        this.$contentModifier = bRg;
        this.$isConnecting = z;
        this.$connectButtonText = str;
        this.$connectButtonSize = auraButtonSize;
        this.$isLoading = z2;
        this.$onConnect = function0;
        this.$topSpacing = f;
        this.$icon = g0v;
        this.$title = str2;
        this.$description = str3;
        this.$contentAfterDescription = g0w;
        this.$contentBeforeConnectButton = g0w2;
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
        m1901invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-i1RSzL4, reason: not valid java name */
    public final void m1901invokei1RSzL4(float f, float f2, BFM bfm, int i) {
        int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A05(bfm, f2);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
            bfm.Afo();
            return;
        }
        BS0 bs0 = BRg.A00;
        BRg bRgThen = C10G.A01.then(this.$contentModifier);
        boolean z = this.$isConnecting;
        String str = this.$connectButtonText;
        AuraButtonSize auraButtonSize = this.$connectButtonSize;
        boolean z2 = this.$isLoading;
        Function0<Unit> function0 = this.$onConnect;
        float f3 = this.$topSpacing;
        G0V<BFM, Integer, Unit> g0v = this.$icon;
        String str2 = this.$title;
        String str3 = this.$description;
        G0W<C07C, BFM, Integer, Unit> g0w = this.$contentAfterDescription;
        G0W<C07C, BFM, Integer, Unit> g0w2 = this.$contentBeforeConnectButton;
        InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
        BBI bbi = (BBI) bfm;
        int iA0J = AnonymousClass003.A0J(bbi);
        AKQ akqA04 = BBI.A04(bbi);
        BRg bRgA01 = AxM.A01(bfm, bRgThen);
        Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
        if (bbi.A0V == null) {
            C00x.A00();
            throw F60.createAndThrow();
        }
        AnonymousClass005.A0n(bfm, bbi, function02);
        AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
        BRg bRgAiP = C90l.A00.AiP(bs0, 1.0f, true);
        C1062ATq c1062ATq = C10G.A02;
        C3IL.A00(bfm, null, bRgAiP.then(c1062ATq), B1V.A00(bfm, new ChannelSettingsScreensKt$ChannelConsentScreen$1$1$1(f, f3, g0v, str2, str3, g0w, g0w2), 24438190), 3072, 6, false);
        AuraLabelButtonStyle auraLabelButtonStyleA0h = AnonymousClass006.A0h(bfm);
        AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
        AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, C3U4.A0C(c1062ATq, C06G.A01(bfm, akh), 0.0f, C06G.A01(bfm, akh), C06G.A01(bfm, akh) + f2), auraLabelButtonStyleA0h, auraButtonSize, null, false, false, !z, z2, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, 0, 0, 134199749);
        BBI.A0R(bbi, true);
    }
}
