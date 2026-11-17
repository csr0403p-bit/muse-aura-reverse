package com.facebook.aura.status.view;

import X.AXY;
import X.AYL;
import X.AYU;
import X.AZE;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAvatarPanelViewportKt$avatarPanelViewport$1$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ float $panelBottom;
    public final /* synthetic */ long $window;

    /* renamed from: com.facebook.aura.status.view.HatchAvatarPanelViewportKt$avatarPanelViewport$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $child;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            ayu.A0A(this.$child, 0.0f, 0, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze) {
            super(1);
            this.$child = aze;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarPanelViewportKt$avatarPanelViewport$1$1(long j, float f) {
        super(3);
        this.$window = j;
        this.$panelBottom = f;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m2225invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m2225invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        int iMax = Math.max(AnonymousClass002.A09(this.$window), AnonymousClass002.A1a(axy, c3tg) ? 1 : 0);
        AZE azeAQW = c3tg.AQW(Constraints.A05(Constraints.A03(j), Constraints.A01(j), iMax, iMax));
        return AnonymousClass002.A0X(axy, new AnonymousClass1(azeAQW), azeAQW.A01, AYL.A01(j, Ab3.A01(this.$panelBottom)));
    }
}
