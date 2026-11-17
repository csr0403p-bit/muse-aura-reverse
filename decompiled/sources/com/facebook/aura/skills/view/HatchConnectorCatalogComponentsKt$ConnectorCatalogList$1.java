package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C0CD;
import X.C10G;
import X.C1DP;
import X.C1YY;
import X.C3U4;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectorCatalogComponentsKt$ConnectorCatalogList$1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ G0U<C0CD, Unit> $content;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $header;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConnectorCatalogComponentsKt$ConnectorCatalogList$1(float f, LazyListState lazyListState, float f2, G0V<? super BFM, ? super Integer, Unit> g0v, G0U<? super C0CD, Unit> g0u) {
        super(3);
        this.$bottomPadding = f;
        this.$listState = lazyListState;
        this.$topPadding = f2;
        this.$header = g0v;
        this.$content = g0u;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            BRg bRgA0B = C3U4.A0B(C10G.A01, C06G.A00(bfm), 0.0f);
            C1DP c1dp = new C1DP(0.0f, 0.0f, 0.0f, this.$bottomPadding + 24.0f);
            LazyListState lazyListState = this.$listState;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$content, AnonymousClass001.A1R(bfm, this.$header, bfm.A62(this.$topPadding)));
            G0V<BFM, Integer, Unit> g0v = this.$header;
            G0U<C0CD, Unit> g0u = this.$content;
            float f = this.$topPadding;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchConnectorCatalogComponentsKt$ConnectorCatalogList$1$1$1(g0v, g0u, f);
                bfm.Ai0(objAaT);
            }
            C1YY.A01(null, null, null, c1dp, lazyListState, bfm, null, bRgA0B, (G0U) objAaT, 0, 504, false, false);
            return;
        }
        bfm.Afo();
    }
}
