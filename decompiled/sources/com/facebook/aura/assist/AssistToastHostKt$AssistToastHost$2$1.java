package com.facebook.aura.assist;

import X.ASU;
import X.AXY;
import X.AYU;
import X.AZE;
import X.AaC;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C1BO;
import X.C1Ny;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AssistToastHostKt$AssistToastHost$2$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ AssistIdentityState $identityState;
    public final /* synthetic */ C1Ny $safeDrawing;

    /* renamed from: com.facebook.aura.assist.AssistToastHostKt$AssistToastHost$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ long $constraints;
        public final /* synthetic */ AssistIdentityState $identityState;
        public final /* synthetic */ C1Ny $safeDrawing;
        public final /* synthetic */ AZE $toast;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C1BO<AaC> c1bo;
            AaC value;
            C7384Etj.A0Y(ayu, 0);
            AssistIdentityPresentation identity = this.$identityState.getIdentity();
            int iA00 = (((identity == null || (c1bo = identity.bounds) == null || (value = c1bo.getValue()) == null) ? Constraints.A00(this.$constraints) : Ab3.A01(value.A03)) - ASU.A01(ayu, AuraDimensKt.SpacingXsmall)) - this.$toast.A00;
            int iALn = this.$safeDrawing.ALn(ayu);
            if (iA00 < iALn) {
                iA00 = iALn;
            }
            ayu.A0A(this.$toast, 0.0f, 0, iA00);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AssistIdentityState assistIdentityState, long j, AZE aze, C1Ny c1Ny) {
            super(1);
            this.$identityState = assistIdentityState;
            this.$constraints = j;
            this.$toast = aze;
            this.$safeDrawing = c1Ny;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistToastHostKt$AssistToastHost$2$1(AssistIdentityState assistIdentityState, C1Ny c1Ny) {
        super(3);
        this.$identityState = assistIdentityState;
        this.$safeDrawing = c1Ny;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m265invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m265invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        AnonymousClass003.A0u(axy, c3tg);
        AZE azeAQW = c3tg.AQW(j);
        return AnonymousClass002.A0X(axy, new AnonymousClass1(this.$identityState, j, azeAQW, this.$safeDrawing), Constraints.A01(j), Constraints.A00(j));
    }
}
