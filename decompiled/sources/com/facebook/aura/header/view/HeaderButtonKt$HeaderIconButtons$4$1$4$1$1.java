package com.facebook.aura.header.view;

import X.AGH;
import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass004;
import X.C00r;
import X.C3TG;
import X.C7384Etj;
import X.EnumC1820Arj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.header.api.HeaderAction;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HeaderButtonKt$HeaderIconButtons$4$1$4$1$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ C00r $contentWidth$delegate;
    public final /* synthetic */ int $index;
    public final /* synthetic */ List<HeaderAction> $leavingActions;
    public final /* synthetic */ boolean $sharesPill;

    /* renamed from: com.facebook.aura.header.view.HeaderButtonKt$HeaderIconButtons$4$1$4$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ C00r $contentWidth$delegate;
        public final /* synthetic */ EnumC1820Arj $direction;
        public final /* synthetic */ int $index;
        public final /* synthetic */ int $inset;
        public final /* synthetic */ List<HeaderAction> $leavingActions;
        public final /* synthetic */ AZE $placeable;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            int iAGd = this.$contentWidth$delegate.AGd() - this.$inset;
            int size = this.$leavingActions.size() - this.$index;
            AZE aze = this.$placeable;
            int i = aze.A01;
            int i2 = iAGd + (size * i);
            int i3 = i2 - i;
            if (this.$direction == EnumC1820Arj.A02) {
                i3 = -i2;
            }
            ayu.A0A(aze, 0.0f, i3, (-aze.A00) / 2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, List<HeaderAction> list, int i2, AZE aze, EnumC1820Arj enumC1820Arj, C00r c00r) {
            super(1);
            this.$inset = i;
            this.$leavingActions = list;
            this.$index = i2;
            this.$placeable = aze;
            this.$direction = enumC1820Arj;
            this.$contentWidth$delegate = c00r;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderButtonKt$HeaderIconButtons$4$1$4$1$1(boolean z, List<HeaderAction> list, int i, C00r c00r) {
        super(3);
        this.$sharesPill = z;
        this.$leavingActions = list;
        this.$index = i;
        this.$contentWidth$delegate = c00r;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m1037invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m1037invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        boolean zA1b = AnonymousClass004.A1b(axy, c3tg);
        AZE azeAQW = c3tg.AQW(j);
        return axy.APV(AGH.A0E(), new AnonymousClass1(this.$sharesPill ? axy.Abr(HeaderButtonKt.HeaderPillContentInset) : 0, this.$leavingActions, this.$index, azeAQW, axy.getLayoutDirection(), this.$contentWidth$delegate), zA1b ? 1 : 0, zA1b ? 1 : 0);
    }
}
