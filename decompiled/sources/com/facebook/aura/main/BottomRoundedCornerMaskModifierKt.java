package com.facebook.aura.main;

import X.AEk;
import X.ASR;
import X.AST;
import X.AbstractC1561Alb;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B6A;
import X.BRg;
import X.C16Z;
import X.C16a;
import X.C1710Aot;
import X.C1DG;
import X.C1DO;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import X.InterfaceC1068ATy;
import android.graphics.Path;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class BottomRoundedCornerMaskModifierKt {

    /* renamed from: com.facebook.aura.main.BottomRoundedCornerMaskModifierKt$drawBottomRoundedCornerMask$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C1DG> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m1327invokeD9Ej5fM() {
            return 0.0f;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ C1DG invoke() {
            return C1DG.A03();
        }
    }

    /* renamed from: com.facebook.aura.main.BottomRoundedCornerMaskModifierKt$drawBottomRoundedCornerMask$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<AST, ASR> {
        public final /* synthetic */ Function0<C1DG> $bottomInset;
        public final /* synthetic */ Function0<C1DG> $cornerRadius;

        /* renamed from: com.facebook.aura.main.BottomRoundedCornerMaskModifierKt$drawBottomRoundedCornerMask$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
                C16Z.A00(c16z);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C16Z c16z) {
                C16Z.A00(c16z);
            }
        }

        /* renamed from: com.facebook.aura.main.BottomRoundedCornerMaskModifierKt$drawBottomRoundedCornerMask$2$2, reason: invalid class name and collision with other inner class name */
        public final class C02312 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
            public final /* synthetic */ InterfaceC1068ATy $leftCornerMask;
            public final /* synthetic */ InterfaceC1068ATy $rightCornerMask;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C16Z c16z) {
                C16Z.A00(c16z);
                InterfaceC1068ATy interfaceC1068ATy = this.$leftCornerMask;
                long j = B6A.A01;
                C16a c16a = C16a.A00;
                c16z.A9d(null, interfaceC1068ATy, c16a, 1.0f, 3, j);
                c16z.A9d(null, this.$rightCornerMask, c16a, 1.0f, 3, j);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02312(InterfaceC1068ATy interfaceC1068ATy, InterfaceC1068ATy interfaceC1068ATy2) {
                super(1);
                this.$leftCornerMask = interfaceC1068ATy;
                this.$rightCornerMask = interfaceC1068ATy2;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
                invoke2(c16z);
                return Unit.INSTANCE;
            }
        }

        @Override // X.G0U
        public final ASR invoke(AST ast) {
            G0U<? super C16Z, Unit> c02312;
            C7384Etj.A0Y(ast, 0);
            float fA00 = AnonymousClass004.A00(ast.A00.AKb()) - (this.$bottomInset.invoke().A00 * ast.AEm());
            float fMin = Math.min(this.$cornerRadius.invoke().A00 * ast.AEm(), Math.min(AnonymousClass001.A00(ast.A00.AKb()) / 2.0f, fA00 / 2.0f));
            if (fMin <= 0.0f) {
                c02312 = AnonymousClass1.INSTANCE;
            } else {
                float fA002 = C1DO.A00(ast);
                C1710Aot c1710AotA00 = AbstractC1561Alb.A00();
                float f = fA00 - fMin;
                Path path = c1710AotA00.A03;
                path.moveTo(0.0f, f);
                path.lineTo(0.0f, fA00);
                path.lineTo(fMin, fA00);
                float f2 = 2.0f * fMin;
                float f3 = fA00 - f2;
                c1710AotA00.A4i(C8j3.A0f(0.0f, f3, f2, fA00), 90.0f, 90.0f, false);
                path.close();
                C1710Aot c1710AotA002 = AbstractC1561Alb.A00();
                Path path2 = c1710AotA002.A03;
                path2.moveTo(fA002 - fMin, fA00);
                path2.lineTo(fA002, fA00);
                path2.lineTo(fA002, f);
                c1710AotA002.A4i(C8j3.A0f(fA002 - f2, f3, fA002, fA00), 0.0f, 90.0f, false);
                path2.close();
                c02312 = new C02312(c1710AotA00, c1710AotA002);
            }
            return ast.A01(c02312);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<C1DG> function0, Function0<C1DG> function02) {
            super(1);
            this.$bottomInset = function0;
            this.$cornerRadius = function02;
        }
    }

    public static /* synthetic */ BRg drawBottomRoundedCornerMask$default(BRg bRg, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = AnonymousClass1.INSTANCE;
        }
        return drawBottomRoundedCornerMask(bRg, function0, function02);
    }

    public static final BRg drawBottomRoundedCornerMask(BRg bRg, Function0<C1DG> function0, Function0<C1DG> function02) {
        AnonymousClass005.A0x(bRg, function0, function02);
        return AEk.A02(bRg, new AnonymousClass2(function0, function02));
    }
}
