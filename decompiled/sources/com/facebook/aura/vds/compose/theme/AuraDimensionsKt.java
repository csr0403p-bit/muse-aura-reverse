package com.facebook.aura.vds.compose.theme;

import X.AGO;
import X.AKH;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C1DG;
import X.C1DP;
import X.G0V;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraDimensionsKt {
    public static final AKH<AuraDimensions> LocalAuraDimensions = new AGO(AuraDimensionsKt$LocalAuraDimensions$1.INSTANCE);
    public static final AuraDimensions auraDimensions;
    public static final AuraCardDimensions globalCardDimensions;

    /* renamed from: com.facebook.aura.vds.compose.theme.AuraDimensionsKt$AuraDimensionsOverride$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ AuraDimensions $dimensions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AuraDimensions auraDimensions, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$dimensions = auraDimensions;
            this.$content = g0v;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraDimensionsKt.AuraDimensionsOverride(this.$dimensions, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    static {
        float f = AuraDimensKt.SpacingMedium;
        C1DP c1dp = new C1DP(f, f, f, f);
        C1DP c1dp2 = new C1DP(AuraDimensKt.SpacingLarge, f, f, f);
        float f2 = AuraDimensKt.SpacingXsmall;
        AuraCardDimensions auraCardDimensions = new AuraCardDimensions(c1dp, c1dp2, new C1DP(0.0f, 0.0f, f2, 0.0f), new C1DG(1.0f), null);
        globalCardDimensions = auraCardDimensions;
        AuraDimensionsIcon auraDimensionsIcon = new AuraDimensionsIcon(8.0f, 12.0f, 16.0f, 20.0f, 24.0f, 28.0f, 32.0f, 48.0f, 64.0f, 44.0f, 56.0f, 72.0f, 796.0f);
        AuraButtonDimensions auraButtonDimensions = new AuraButtonDimensions(36.0f, 8.0f, 16.0f, 16.0f, new C1DP(4.0f, 4.0f, 4.0f, 4.0f), new C1DP(12.0f, 4.0f, 12.0f, 4.0f), new C1DP(12.0f, 4.0f, 12.0f, 4.0f));
        AuraButtonDimensions auraButtonDimensions2 = new AuraButtonDimensions(40.0f, 8.0f, 24.0f, 20.0f, new C1DP(10.0f, 10.0f, 10.0f, 10.0f), new C1DP(12.0f, 10.0f, 12.0f, 10.0f), new C1DP(12.0f, 10.0f, 12.0f, 10.0f));
        AuraButtonDimensions auraButtonDimensions3 = new AuraButtonDimensions(48.0f, 8.0f, 24.0f, 20.0f, new C1DP(16.0f, 16.0f, 16.0f, 16.0f), new C1DP(28.0f, 16.0f, 28.0f, 16.0f), new C1DP(28.0f, 12.0f, 28.0f, 12.0f));
        float f3 = AuraDimensKt.SpacingMicro;
        float f4 = AuraDimensKt.SpacingXlarge;
        float f5 = AuraDimensKt.SpacingSmall;
        C1DP c1dp3 = new C1DP(0.0f, 0.0f, 0.0f, f5);
        C1DP c1dp4 = new C1DP(0.0f, 0.0f, 0.0f, 0.0f);
        float f6 = AuraDimensKt.SpacingLarge;
        C1DP c1dp5 = new C1DP(f6, f6, f6, 0.0f);
        AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
        AuraButtonSize auraButtonSize2 = AuraButtonSize.LARGE;
        float f7 = AuraDimensKt.SpacingXsmallPlusNano;
        float f8 = AuraDimensKt.SpacingMicroPlusNano;
        float f9 = AuraDimensKt.SpacingLargePlusMicro;
        auraDimensions = new AuraDimensions(auraDimensionsIcon, auraButtonDimensions, auraButtonDimensions2, auraButtonDimensions3, 16.0f, 72.0f, 64.0f, 2.0f, f3, f2, 38.0f, f4, c1dp3, c1dp4, c1dp5, null, auraButtonSize, auraButtonSize2, f7, f8, new C1DP(10.0f, 10.0f, 10.0f, 10.0f), 36.0f, new C1DP(12.0f, 12.0f, 12.0f, 12.0f), 48.0f, new AuraDimensionsSwitch(64.0f, 28.0f, 39.0f, 24.0f, 100.0f, 100.0f, 2.0f), auraButtonSize, auraCardDimensions, auraCardDimensions, auraCardDimensions, auraCardDimensions, new AuraCardDimensions(new C1DP(f5, f9, f5, f9), new C1DP(f, f9, f, f9), new C1DP(0.0f, 0.0f, 0.0f, 0.0f), new C1DG(1.0f), null), new AuraCardDimensions(new C1DP(f5, f5, f5, f5), new C1DP(f5, f5, f5, f5), new C1DP(0.0f, 0.0f, 0.0f, 0.0f), new C1DG(1.0f), null), new AuraCardDimensions(new C1DP(f, f, f, f), new C1DP(f6, f, f, f), new C1DP(0.0f, 0.0f, f2, 0.0f), new C1DG(1.0f), new C1DG(56.0f)), new AuraCardDimensions(new C1DP(f, f, f, f), new C1DP(f6, f, f, f), new C1DP(0.0f, 0.0f, 0.0f, 0.0f), new C1DG(1.0f), new C1DG(56.0f)), 22.0f, 22.0f, 92.0f, AuraIconSize.X_SMALL, AuraIconSize.X_TINY, new C1DP(9.0f, f8, 9.0f, f8), 120.0f, new AuraToastDimensions(new C1DP(f5, f5, f2, f5), new C1DP(f, f5, f2, f5), new C1DP(0.0f, 0.0f, f3, 0.0f), 56.0f), 68.0f, 56.0f, 240.0f, 26.0f, new C1DP(f, f4, f, f), 22.0f);
    }

    public static final AuraDimensions getAuraDimensions() {
        return auraDimensions;
    }

    public static final AKH<AuraDimensions> getLocalAuraDimensions() {
        return LocalAuraDimensions;
    }

    public static final void AuraDimensionsOverride(AuraDimensions auraDimensions2, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        AnonymousClass003.A0u(auraDimensions2, g0v);
        bfm.AgG(701027105);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, auraDimensions2) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            AnonymousClass001.A14(bfm, LocalAuraDimensions.A04(auraDimensions2), g0v, iA0d);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(auraDimensions2, g0v, i);
        }
    }
}
