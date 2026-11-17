package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.B1V;
import X.BFM;
import X.C1DG;
import X.G0V;
import X.G0W;
import com.facebook.aura.ui.adaptive.AuraContentFrameKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchTabScreenKt$HatchTabScreenLayout$2$1$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ G0W<C1DG, BFM, Integer, Unit> $content;
    public final /* synthetic */ AuraContentRole $contentRole;
    public final /* synthetic */ float $contentTopPadding;

    /* renamed from: com.facebook.aura.header.view.HatchTabScreenKt$HatchTabScreenLayout$2$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0W<C1DG, BFM, Integer, Unit> $content;
        public final /* synthetic */ float $contentTopPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0W<? super C1DG, ? super BFM, ? super Integer, Unit> g0w, float f) {
            super(2);
            this.$content = g0w;
            this.$contentTopPadding = f;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AnonymousClass001.A1G(new C1DG(this.$contentTopPadding), bfm, this.$content, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTabScreenKt$HatchTabScreenLayout$2$1$1$1(AuraContentRole auraContentRole, G0W<? super C1DG, ? super BFM, ? super Integer, Unit> g0w, float f) {
        super(2);
        this.$contentRole = auraContentRole;
        this.$content = g0w;
        this.$contentTopPadding = f;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AuraContentFrameKt.AuraContentFrame(this.$contentRole, null, B1V.A00(bfm, new AnonymousClass1(this.$content, this.$contentTopPadding), -972345534), bfm, 384, 2);
        } else {
            bfm.Afo();
        }
    }
}
