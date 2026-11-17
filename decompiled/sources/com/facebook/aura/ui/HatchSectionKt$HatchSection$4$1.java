package com.facebook.aura.ui;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass037;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1DM;
import X.C1b8;
import X.C3U4;
import X.F60;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSectionKt$HatchSection$4$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public final /* synthetic */ B6A $backgroundColor;
    public final /* synthetic */ int $index;
    public final /* synthetic */ HatchLazySectionScopeImpl $scope;
    public final /* synthetic */ HatchLazySectionItem $sectionItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSectionKt$HatchSection$4$1(int i, HatchLazySectionScopeImpl hatchLazySectionScopeImpl, B6A b6a, HatchLazySectionItem hatchLazySectionItem) {
        super(3);
        this.$index = i;
        this.$scope = hatchLazySectionScopeImpl;
        this.$backgroundColor = b6a;
        this.$sectionItem = hatchLazySectionItem;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        BBI bbiA0M;
        long jA0J;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            C1DM c1dmHatchSectionRowShape = HatchSectionKt.hatchSectionRowShape(this.$index, this.$scope.items.size(), bfm, 0);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            B6A b6a = this.$backgroundColor;
            if (b6a == null) {
                bfm.AgE(516764526);
                jA0J = C06G.A0J(bfm, AuraColorsKt.LocalAuraColors);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 516763937);
                jA0J = b6a.A00;
            }
            BRg bRgA03 = C11U.A03(C1b8.A03(c1062ATq, c1dmHatchSectionRowShape, jA0J), c1dmHatchSectionRowShape);
            HatchLazySectionItem hatchLazySectionItem = this.$sectionItem;
            int i2 = this.$index;
            HatchLazySectionScopeImpl hatchLazySectionScopeImpl = this.$scope;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            AnonymousClass001.A1H(bfm, hatchLazySectionItem.content, 0);
            if (i2 < AnonymousClass002.A0E(hatchLazySectionScopeImpl.items)) {
                bfm.AgE(-179318156);
                AuraDividerKt.AuraRowDivider(C3U4.A07(bs0, AuraDimensKt.SpacingMedium), bfm, 0, 0);
            } else {
                bfm.AgE(-179228783);
            }
            AnonymousClass003.A0q(bbiA0M);
            return;
        }
        bfm.Afo();
    }
}
