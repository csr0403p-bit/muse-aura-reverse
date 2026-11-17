package com.facebook.aura.settings;

import X.AKQ;
import X.AbstractC1103AYp;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C0Ig;
import X.C1515AkP;
import X.C1YL;
import X.C2VU;
import X.C3TH;
import X.C7384Etj;
import X.C90l;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ChannelSettingsScreensKt$ChannelConsentScreen$1$1$1 extends AbstractC7559F3s implements G0W<C0Ig, BFM, Integer, Unit> {
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $contentAfterDescription;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $contentBeforeConnectButton;
    public final /* synthetic */ String $description;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $icon;
    public final /* synthetic */ String $title;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ float $topSpacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelSettingsScreensKt$ChannelConsentScreen$1$1$1(float f, float f2, G0V<? super BFM, ? super Integer, Unit> g0v, String str, String str2, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w2) {
        super(3);
        this.$topPadding = f;
        this.$topSpacing = f2;
        this.$icon = g0v;
        this.$title = str;
        this.$description = str2;
        this.$contentAfterDescription = g0w;
        this.$contentBeforeConnectButton = g0w2;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C0Ig c0Ig, BFM bfm, Integer num) {
        invoke(c0Ig, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C0Ig c0Ig, BFM bfm, int i) {
        int iA0d = i;
        C7384Etj.A0Y(c0Ig, 0);
        if ((i & 6) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, c0Ig);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA0M = C06G.A0M(bfm, AnonymousClass001.A0R(AnonymousClass001.A0U(AbstractC1103AYp.A02(AbstractC1103AYp.A00(0, bfm, 0, 1), bs0, true), c0Ig.AHP())));
            C3TH c3th = C2VU.A00;
            float f = this.$topPadding;
            float f2 = this.$topSpacing;
            G0V<BFM, Integer, Unit> g0v = this.$icon;
            String str = this.$title;
            String str2 = this.$description;
            G0W<C07C, BFM, Integer, Unit> g0w = this.$contentAfterDescription;
            G0W<C07C, BFM, Integer, Unit> g0w2 = this.$contentBeforeConnectButton;
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass002.A0V(bfm, c3th);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0M);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, f + f2);
            AnonymousClass001.A1H(bfm, g0v, 0);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0C(bfm), C01N.A01(bfm, bs0, AuraDimensKt.SpacingMedium).title2Emphasized, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A08(bfm), C01N.A01(bfm, bs0, AuraDimensKt.SpacingSmall).subheadlineRegular, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            g0w.invoke(c90l, bfm, 6);
            C01N.A07(bfm, AnonymousClass001.A0N(c90l, bs0, true));
            C01N.A06(bfm, bs0);
            g0w2.invoke(c90l, bfm, 6);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
