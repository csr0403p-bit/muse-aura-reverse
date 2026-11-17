package com.facebook.aura.conversation.view;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C10G;
import X.C1515AkP;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.ui.HatchComposerGeometryKt;
import com.facebook.aura.ui.adaptive.AuraContentFrameKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationComposerLayout$1$1$composerPlaceable$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ G0V<BFM, Integer, Unit> $composer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationContentKt$HatchConversationComposerLayout$1$1$composerPlaceable$1(G0V<? super BFM, ? super Integer, Unit> g0v) {
        super(2);
        this.$composer = g0v;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            BRg bRgAuraContentWidth = AuraContentFrameKt.auraContentWidth(HatchComposerGeometryKt.trackHatchComposerClearance(C10G.A02, bfm, 6), AuraContentRole.Conversation, bfm, 48);
            G0V<BFM, Integer, Unit> g0v = this.$composer;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgAuraContentWidth);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            AnonymousClass001.A1H(bfm, g0v, 0);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
