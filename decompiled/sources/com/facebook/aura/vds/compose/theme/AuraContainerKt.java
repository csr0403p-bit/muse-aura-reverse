package com.facebook.aura.vds.compose.theme;

import X.AGO;
import X.AKH;
import X.AKT;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.G0V;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraContainerKt {
    public static final AKH<AuraContainer> LocalAuraContainer = new AGO(AuraContainerKt$LocalAuraContainer$1.INSTANCE);

    /* renamed from: com.facebook.aura.vds.compose.theme.AuraContainerKt$ProvideAuraContainer$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AuraContainer $container;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AuraContainer auraContainer, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$container = auraContainer;
            this.$content = g0v;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraContainerKt.ProvideAuraContainer(this.$container, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final AKH<AuraContainer> getLocalAuraContainer() {
        return LocalAuraContainer;
    }

    public static final void ProvideAuraContainer(AuraContainer auraContainer, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        AnonymousClass003.A0u(auraContainer, g0v);
        bfm.AgG(1698102764);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraContainer, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            AKT.A01(bfm, LocalAuraContainer.A04(auraContainer), g0v, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(auraContainer, g0v, i);
        }
    }
}
