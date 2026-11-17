package com.facebook.aura.feed.view;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C3U4;
import X.C78N;
import X.C7BY;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt;
import com.facebook.aura.feed.repo.FeedTapKind;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedUnitBody$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ G0U<FeedTapKind, Unit> $reportTap;
    public final /* synthetic */ FeedUnit $unit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedUnitRowKt$FeedUnitBody$1$1(FeedUnit feedUnit, int i, G0U<? super FeedTapKind, Unit> g0u) {
        super(2);
        this.$unit = feedUnit;
        this.$absolutePosition = i;
        this.$reportTap = g0u;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            FeedUnit feedUnit = this.$unit;
            int i2 = this.$absolutePosition;
            G0U<FeedTapKind, Unit> g0u = this.$reportTap;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            if (!C7BY.A0j(feedUnit.getTitle())) {
                bfm.AgE(110487243);
                String title = feedUnit.getTitle();
                C1822Arm c1822ArmA0X = C06G.A0X(bfm);
                AuraTextKt.m2639AuraTextUY9GdpU(title, C3U4.A03(FeedUnitRowKt.unitInsets(C10G.A02), FeedUnitRowKt.TitleBottomPadding), C06G.A0C(bfm), c1822ArmA0X, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            } else {
                bfm.AgE(110782642);
            }
            BBI.A0R(bbi, false);
            if (!C7BY.A0j(feedUnit.getBodyMarkdown())) {
                bfm.AgE(110870713);
                Context contextA0H = AnonymousClass002.A0H(bfm);
                boolean zA1O = AnonymousClass003.A1O(bfm, contextA0H, g0u, AnonymousClass003.A1W(feedUnit, bfm, i2));
                Object objAaT = bfm.AaT();
                if (zA1O || objAaT == C78N.A00) {
                    objAaT = new FeedUnitRowKt$FeedUnitBody$1$1$1$1$1(feedUnit, i2, contextA0H, g0u);
                    bfm.Ai0(objAaT);
                }
                HatchAuraMarkdownProvidersKt.HatchAuraMarkdownUrlHandler((G0U) objAaT, B1V.A00(bfm, new FeedUnitRowKt$FeedUnitBody$1$1$1$2(feedUnit), 1139864355), bfm, 48);
            } else {
                bfm.AgE(112155570);
            }
            AnonymousClass003.A0q(bbi);
            return;
        }
        bfm.Afo();
    }
}
