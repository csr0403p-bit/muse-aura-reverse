package com.facebook.aura.conversation.view;

import X.AKQ;
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
import X.C00x;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationComposerLayout$1$1$contentPlaceable$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $composerHeightPx;
    public final /* synthetic */ G0W<Integer, BFM, Integer, Unit> $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationContentKt$HatchConversationComposerLayout$1$1$contentPlaceable$1(G0W<? super Integer, ? super BFM, ? super Integer, Unit> g0w, int i) {
        super(2);
        this.$content = g0w;
        this.$composerHeightPx = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            C1062ATq c1062ATq = C10G.A01;
            G0W<Integer, BFM, Integer, Unit> g0w = this.$content;
            int i2 = this.$composerHeightPx;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            AnonymousClass004.A1B(bbi, Integer.valueOf(i2), bfm, g0w, 0);
            return;
        }
        bfm.Afo();
    }
}
