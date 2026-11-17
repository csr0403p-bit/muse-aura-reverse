package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.B1V;
import X.BFM;
import X.C1DG;
import X.G0V;
import X.G2j;
import com.facebook.aura.ui.adaptive.AuraContentFrameKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchPageScreenKt$HatchPageScreen$3$1$2$1$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ G2j<C1DG, C1DG, BFM, Integer, Unit> $content;
    public final /* synthetic */ AuraContentRole $contentRole;
    public final /* synthetic */ float $pageHeaderHeight;

    /* renamed from: com.facebook.aura.header.view.HatchPageScreenKt$HatchPageScreen$3$1$2$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ float $bottomPadding;
        public final /* synthetic */ G2j<C1DG, C1DG, BFM, Integer, Unit> $content;
        public final /* synthetic */ float $pageHeaderHeight;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G2j<? super C1DG, ? super C1DG, ? super BFM, ? super Integer, Unit> g2j, float f, float f2) {
            super(2);
            this.$content = g2j;
            this.$pageHeaderHeight = f;
            this.$bottomPadding = f2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AnonymousClass001.A1F(new C1DG(this.$pageHeaderHeight), new C1DG(this.$bottomPadding), bfm, this.$content, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPageScreenKt$HatchPageScreen$3$1$2$1$2(AuraContentRole auraContentRole, G2j<? super C1DG, ? super C1DG, ? super BFM, ? super Integer, Unit> g2j, float f, float f2) {
        super(2);
        this.$contentRole = auraContentRole;
        this.$content = g2j;
        this.$pageHeaderHeight = f;
        this.$bottomPadding = f2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AuraContentFrameKt.AuraContentFrame(this.$contentRole, null, B1V.A00(bfm, new AnonymousClass1(this.$content, this.$pageHeaderHeight, this.$bottomPadding), 1892891568), bfm, 384, 2);
        } else {
            bfm.Afo();
        }
    }
}
