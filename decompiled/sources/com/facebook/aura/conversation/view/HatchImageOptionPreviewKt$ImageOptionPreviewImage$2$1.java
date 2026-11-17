package com.facebook.aura.conversation.view;

import X.AXY;
import X.AYL;
import X.AYU;
import X.AZE;
import X.AaC;
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
public final class HatchImageOptionPreviewKt$ImageOptionPreviewImage$2$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ Function0<AaC> $bounds;

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$ImageOptionPreviewImage$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $placeable;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            ayu.A0A(this.$placeable, 0.0f, 0, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze) {
            super(1);
            this.$placeable = aze;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionPreviewKt$ImageOptionPreviewImage$2$1(Function0<AaC> function0) {
        super(3);
        this.$bounds = function0;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m616invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m616invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        ?? A1b = AnonymousClass004.A1b(axy, c3tg);
        long jA01 = this.$bounds.invoke().A01();
        int iA01 = Ab3.A01(AnonymousClass003.A03(jA01));
        if (iA01 < A1b) {
            iA01 = 0;
        }
        int iA012 = Ab3.A01(AnonymousClass004.A00(jA01));
        if (iA012 < A1b) {
            iA012 = 0;
        }
        AZE azeAQW = c3tg.AQW(AYL.A06(iA01, iA01, iA012, iA012));
        return AnonymousClass002.A0X(axy, new AnonymousClass1(azeAQW), azeAQW.A01, azeAQW.A00);
    }
}
