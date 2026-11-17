package com.facebook.aura.header.view;

import X.ATD;
import X.AXY;
import X.AYU;
import X.AZE;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchExpandedAvatarPanelKt$hatchExpandedAvatarPanelInset$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ HatchForegroundHeaderState $headerState;
    public final /* synthetic */ float $panelHeight;
    public final /* synthetic */ Function0<Float> $progress;

    /* renamed from: com.facebook.aura.header.view.HatchExpandedAvatarPanelKt$hatchExpandedAvatarPanelInset$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $placeable;
        public final /* synthetic */ int $top;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            ayu.A0A(this.$placeable, 0.0f, 0, this.$top);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze, int i) {
            super(1);
            this.$placeable = aze;
            this.$top = i;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchExpandedAvatarPanelKt$hatchExpandedAvatarPanelInset$1(float f, Function0<Float> function0, HatchForegroundHeaderState hatchForegroundHeaderState) {
        super(3);
        this.$panelHeight = f;
        this.$progress = function0;
        this.$headerState = hatchForegroundHeaderState;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m989invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m989invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        ?? A1b = AnonymousClass004.A1b(axy, c3tg);
        int iA01 = Ab3.A01(axy.Ah4(this.$panelHeight) * AnonymousClass003.A00(AnonymousClass003.A04(this.$progress)));
        int iA00 = Constraints.A00(j);
        int iA04 = ATD.A04(iA01, A1b == true ? 1 : 0, iA00);
        HatchForegroundHeaderState hatchForegroundHeaderState = this.$headerState;
        if (hatchForegroundHeaderState != null) {
            hatchForegroundHeaderState.setContentInsetPx$fbandroid_express_aura_java_com_facebook_aura_header_view_view(iA04);
        }
        int iA02 = Constraints.A02(j) - iA04;
        if (iA02 < A1b) {
            iA02 = 0;
        }
        AZE azeAQW = c3tg.AQW(Constraints.A05(Constraints.A03(j), Constraints.A01(j), iA02, iA00 - iA04));
        return AnonymousClass002.A0X(axy, new AnonymousClass1(azeAQW, iA04), azeAQW.A01, azeAQW.A00 + iA04);
    }
}
