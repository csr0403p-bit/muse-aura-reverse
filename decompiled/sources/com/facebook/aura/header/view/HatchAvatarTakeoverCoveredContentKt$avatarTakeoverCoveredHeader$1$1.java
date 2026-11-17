package com.facebook.aura.header.view;

import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C1BO;
import X.C2av;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAvatarTakeoverCoveredContentKt$avatarTakeoverCoveredHeader$1$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ boolean $active;
    public final /* synthetic */ C1BO<Float> $alpha;
    public final /* synthetic */ boolean $hidden;

    /* renamed from: com.facebook.aura.header.view.HatchAvatarTakeoverCoveredContentKt$avatarTakeoverCoveredHeader$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ boolean $active;
        public final /* synthetic */ C1BO<Float> $alpha;
        public final /* synthetic */ AZE $child;
        public final /* synthetic */ boolean $hidden;

        /* renamed from: com.facebook.aura.header.view.HatchAvatarTakeoverCoveredContentKt$avatarTakeoverCoveredHeader$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01821 extends AbstractC7559F3s implements G0U<C2av, Unit> {
            public final /* synthetic */ C1BO<Float> $alpha;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C2av c2av) {
                C7384Etj.A0Y(c2av, 0);
                c2av.Acj(C1BO.A01(this.$alpha));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01821(C1BO<Float> c1bo) {
                super(1);
                this.$alpha = c1bo;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
                invoke2(c2av);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            if (this.$hidden) {
                return;
            }
            if (!this.$active || C1BO.A01(this.$alpha) > 0.0f) {
                ayu.A0C(this.$child, new C01821(this.$alpha), 0, 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, boolean z2, C1BO<Float> c1bo, AZE aze) {
            super(1);
            this.$hidden = z;
            this.$active = z2;
            this.$alpha = c1bo;
            this.$child = aze;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarTakeoverCoveredContentKt$avatarTakeoverCoveredHeader$1$1(boolean z, boolean z2, C1BO<Float> c1bo) {
        super(3);
        this.$hidden = z;
        this.$active = z2;
        this.$alpha = c1bo;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m986invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m986invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        AnonymousClass003.A0u(axy, c3tg);
        AZE azeAQW = c3tg.AQW(j);
        return AnonymousClass002.A0X(axy, new AnonymousClass1(this.$hidden, this.$active, this.$alpha, azeAQW), azeAQW.A01, azeAQW.A00);
    }
}
