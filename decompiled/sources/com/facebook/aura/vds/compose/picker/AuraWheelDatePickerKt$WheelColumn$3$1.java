package com.facebook.aura.vds.compose.picker;

import X.ART;
import X.ASR;
import X.AST;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.B6A;
import X.C16Z;
import X.C16a;
import X.C1EQ;
import X.C7384Etj;
import X.G0U;
import X.HxE;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraWheelDatePickerKt$WheelColumn$3$1 extends AbstractC7559F3s implements G0U<AST, ASR> {
    public static final AuraWheelDatePickerKt$WheelColumn$3$1 INSTANCE = new AuraWheelDatePickerKt$WheelColumn$3$1();

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraWheelDatePickerKt$WheelColumn$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
        public final /* synthetic */ C1EQ $fade;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C16Z c16z) {
            C16Z.A00(c16z);
            c16z.A9f(this.$fade, null, C16a.A00, 1.0f, 6, 0L, ART.A00(c16z.AKb(), 0L));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1EQ c1eq) {
            super(1);
            this.$fade = c1eq;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
            invoke2(c16z);
            return Unit.INSTANCE;
        }
    }

    public AuraWheelDatePickerKt$WheelColumn$3$1() {
        super(1);
    }

    @Override // X.G0U
    public final ASR invoke(AST ast) {
        C7384Etj.A0Y(ast, 0);
        Float fA0a = AnonymousClass005.A0a();
        long j = B6A.A06;
        HxE hxE = new HxE(fA0a, new B6A(j));
        Float fValueOf = Float.valueOf(0.3f);
        long j2 = B6A.A01;
        return ast.A01(new AnonymousClass1(C1EQ.A02(new HxE[]{hxE, new HxE(fValueOf, new B6A(j2)), AnonymousClass007.A0g(0.7f, j2), AnonymousClass007.A0g(1.0f, j)}, Float.POSITIVE_INFINITY)));
    }
}
