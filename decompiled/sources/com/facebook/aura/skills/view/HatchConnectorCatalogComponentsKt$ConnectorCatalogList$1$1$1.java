package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C01N;
import X.C0CD;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectorCatalogComponentsKt$ConnectorCatalogList$1$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ G0U<C0CD, Unit> $content;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $header;
    public final /* synthetic */ float $topPadding;

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogComponentsKt$ConnectorCatalogList$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ float $topPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f) {
            super(3);
            this.$topPadding = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                C01N.A08(bfm, BRg.A00, this.$topPadding);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogComponentsKt$ConnectorCatalogList$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $header;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(3);
            this.$header = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AnonymousClass001.A1H(bfm, this.$header, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ("catalog-top", "spacer", B1V.A01(new AnonymousClass1(this.$topPadding), 896389742, true));
        G0V<BFM, Integer, Unit> g0v = this.$header;
        if (g0v != null) {
            c0cd.APJ("catalog-tabs", "tabs", B1V.A01(new AnonymousClass2(g0v), 55040841, true));
            c0cd.APJ("catalog-tabs-spacing", "spacer", ComposableSingletons$HatchConnectorCatalogComponentsKt.lambda$1589094208);
        }
        this.$content.invoke(c0cd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConnectorCatalogComponentsKt$ConnectorCatalogList$1$1$1(G0V<? super BFM, ? super Integer, Unit> g0v, G0U<? super C0CD, Unit> g0u, float f) {
        super(1);
        this.$header = g0v;
        this.$content = g0u;
        this.$topPadding = f;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
