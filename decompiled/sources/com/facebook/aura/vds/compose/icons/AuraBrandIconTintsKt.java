package com.facebook.aura.vds.compose.icons;

import X.AEk;
import X.ART;
import X.ASR;
import X.AST;
import X.AbstractC1396AiR;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.B6A;
import X.BRg;
import X.C1335AhM;
import X.C16Z;
import X.C16a;
import X.C1EQ;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraBrandIconTintsKt {
    public static final List<B6A> InstagramGradientColors;
    public static final long MetaBlue;
    public static final long WhatsAppGreen;

    /* renamed from: com.facebook.aura.vds.compose.icons.AuraBrandIconTintsKt$instagramGradientTint$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<AST, ASR> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        /* renamed from: com.facebook.aura.vds.compose.icons.AuraBrandIconTintsKt$instagramGradientTint$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
            public final /* synthetic */ C1EQ $gradient;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C16Z c16z) {
                C16Z.A00(c16z);
                c16z.A9f(this.$gradient, null, C16a.A00, 1.0f, 5, 0L, ART.A00(c16z.AKb(), 0L));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C1EQ c1eq) {
                super(1);
                this.$gradient = c1eq;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
                invoke2(c16z);
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public final ASR invoke(AST ast) {
            C7384Etj.A0Y(ast, 0);
            return ast.A01(new AnonymousClass1(new C1335AhM(AuraBrandIconTintsKt.InstagramGradientColors, null, 0, 0L, AnonymousClass005.A0M(AnonymousClass001.A00(ast.A00.AKb()), AnonymousClass001.A01(ast.A00.AKb(), 4294967295L)))));
        }
    }

    public static final BRg instagramGradientTint(BRg bRg) {
        C7384Etj.A0Y(bRg, 0);
        return AEk.A02(AbstractC1396AiR.A00(bRg, AnonymousClass1.INSTANCE), AnonymousClass2.INSTANCE);
    }

    public static final long getMetaBlue() {
        return MetaBlue;
    }

    public static final long getWhatsAppGreen() {
        return WhatsAppGreen;
    }

    static {
        long j = B6A.A01;
        MetaBlue = 4278740735L << 32;
        WhatsAppGreen = 4280669030L << 32;
        InstagramGradientColors = Arrays.asList(new B6A(4292018373L << 32), new B6A(4294902121L << 32), new B6A(4294932992L << 32));
    }

    /* renamed from: com.facebook.aura.vds.compose.icons.AuraBrandIconTintsKt$instagramGradientTint$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2av c2av) {
            C7384Etj.A0Y(c2av, 0);
            c2av.Ad7(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
            invoke2(c2av);
            return Unit.INSTANCE;
        }
    }
}
