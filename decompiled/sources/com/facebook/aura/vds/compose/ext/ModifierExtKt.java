package com.facebook.aura.vds.compose.ext;

import X.AEk;
import X.ART;
import X.AaM;
import X.AbstractC07117nq;
import X.AbstractC1396AiR;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BRr;
import X.C0v5;
import X.C16Z;
import X.C1YD;
import X.C1qN;
import X.C2127Ayt;
import X.C2av;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.InterfaceC05011Yg;
import X.InterfaceC1072AWd;
import X.InterfaceC1074AXb;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class ModifierExtKt {

    /* renamed from: com.facebook.aura.vds.compose.ext.ModifierExtKt$contentBlur$1, reason: invalid class name and case insensitive filesystem */
    public final class C142811 extends AbstractC7559F3s implements Function0<BlurConfig> {
        public static final C142811 INSTANCE = new C142811();

        public C142811() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final BlurConfig invoke() {
            return new BlurConfig(0.0f, 0L, 3, null);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.ext.ModifierExtKt$contentBlur$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<C2av, Unit> {
        public final /* synthetic */ Function0<BlurConfig> $contentBlurConfig;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2av c2av) {
            C7384Etj.A0Y(c2av, 0);
            BlurConfig blurConfigInvoke = this.$contentBlurConfig.invoke();
            if (blurConfigInvoke != null) {
                float f = blurConfigInvoke.radius;
                if (f < 0.1f) {
                    f = 0.1f;
                }
                RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR);
                C7384Etj.A0U(renderEffectCreateBlurEffect);
                c2av.AeM(new C2127Ayt(renderEffectCreateBlurEffect));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<BlurConfig> function0) {
            super(1);
            this.$contentBlurConfig = function0;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
            invoke2(c2av);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.ext.ModifierExtKt$contentBlur$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
        public final /* synthetic */ Function0<BlurConfig> $contentBlurConfig;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C16Z c16z) {
            C16Z.A00(c16z);
            BlurConfig blurConfigInvoke = this.$contentBlurConfig.invoke();
            if (blurConfigInvoke != null) {
                ART.A03(null, c16z, 0.0f, 126, blurConfigInvoke.color, 0L, 0L);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<BlurConfig> function0) {
            super(1);
            this.$contentBlurConfig = function0;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
            invoke2(c16z);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.ext.ModifierExtKt$contentBlur$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
        public final /* synthetic */ Function0<BlurConfig> $contentBlurConfig;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C16Z c16z) {
            C16Z.A00(c16z);
            BlurConfig blurConfigInvoke = this.$contentBlurConfig.invoke();
            if (blurConfigInvoke != null) {
                ART.A03(null, c16z, 0.0f, 126, blurConfigInvoke.color, 0L, 0L);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Function0<BlurConfig> function0) {
            super(1);
            this.$contentBlurConfig = function0;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
            invoke2(c16z);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: clickableWithDebounce-kvy4y6M, reason: not valid java name */
    public static final BRg m2547clickableWithDebouncekvy4y6M(BRg bRg, boolean z, String str, C1YD c1yd, long j, InterfaceC1072AWd interfaceC1072AWd, InterfaceC05011Yg interfaceC05011Yg, Function0<Unit> function0, BFM bfm, int i, int i2) {
        String str2 = str;
        C1YD c1yd2 = c1yd;
        long j2 = j;
        InterfaceC1072AWd interfaceC1072AWd2 = interfaceC1072AWd;
        C60O.A1M(bRg, 0, function0);
        boolean z2 = true;
        boolean zA1Q = C60Q.A1Q(i2 & 1, z);
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            c1yd2 = null;
        }
        if ((i2 & 8) != 0) {
            j2 = 300;
        }
        if ((i2 & 16) != 0) {
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new C1qN();
                BBI.A0T(bfm, objAaT);
            }
            interfaceC1072AWd2 = (InterfaceC1072AWd) objAaT;
        }
        InterfaceC05011Yg interfaceC05011Yg2 = (i2 & 32) == 0 ? interfaceC05011Yg : null;
        if ((((29360128 & i) ^ 12582912) <= 8388608 || !bfm.A65(function0)) && (i & 12582912) != 8388608) {
            z2 = false;
        }
        Object objAaT2 = bfm.AaT();
        if (z2 || objAaT2 == C78N.A00) {
            objAaT2 = new ModifierExtKt$clickableWithDebounce$2$1(function0);
            BBI.A0T(bfm, objAaT2);
        }
        return C0v5.A01(interfaceC05011Yg2, interfaceC1072AWd2, bRg, c1yd2, str2, withDebounce(j2, (Function0) objAaT2, bfm, (i >> 12) & 14, 0), zA1Q);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg combinedClickableWithDebounce(X.BRg r12, long r13, kotlin.jvm.functions.Function0<kotlin.Unit> r15, kotlin.jvm.functions.Function0<kotlin.Unit> r16, X.BFM r17, int r18, int r19) {
        /*
            r9 = r13
            r8 = r16
            r14 = 0
            r5 = r12
            X.AnonymousClass002.A1A(r12, r14, r15)
            r0 = r19 & 1
            if (r0 == 0) goto Le
            r9 = 300(0x12c, double:1.48E-321)
        Le:
            r0 = r19 & 4
            if (r0 == 0) goto L13
            r8 = 0
        L13:
            r4 = r18
            r0 = r4 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            r12 = r17
            if (r0 <= r2) goto L25
            boolean r0 = r12.A65(r15)
            if (r0 != 0) goto L2a
        L25:
            r1 = r4 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L2b
        L2a:
            r0 = 1
        L2b:
            java.lang.Object r11 = r12.AaT()
            if (r0 != 0) goto L35
            java.lang.Object r0 = X.C78N.A00
            if (r11 != r0) goto L3d
        L35:
            com.facebook.aura.vds.compose.ext.ModifierExtKt$combinedClickableWithDebounce$1$1 r11 = new com.facebook.aura.vds.compose.ext.ModifierExtKt$combinedClickableWithDebounce$1$1
            r11.<init>(r15)
            X.BBI.A0T(r12, r11)
        L3d:
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            int r0 = r18 >> 3
            r13 = r0 & 14
            kotlin.jvm.functions.Function0 r9 = withDebounce(r9, r11, r12, r13, r14)
            r6 = 0
            r10 = 1
            r7 = r6
            X.BRg r0 = X.C0v5.A03(r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.ext.ModifierExtKt.combinedClickableWithDebounce(X.BRg, long, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BFM, int, int):X.BRg");
    }

    public static final BRg thenIfElse(BRg bRg, boolean z, Function0<? extends BRg> function0, Function0<? extends BRg> function02) {
        AnonymousClass005.A11(bRg, function0, function02, 0);
        return z ? bRg.then(function0.invoke()) : function02.invoke();
    }

    public static /* synthetic */ BRg awaitClickOrDrag$default(BRg bRg, Object[] objArr, G0U g0u, int i, Object obj) {
        if ((i & 1) != 0) {
            objArr = new Unit[]{Unit.INSTANCE};
        }
        return awaitClickOrDrag(bRg, objArr, g0u);
    }

    public static /* synthetic */ BRg contentBlur$default(BRg bRg, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = C142811.INSTANCE;
        }
        return contentBlur(bRg, function0);
    }

    public static final BRg awaitClickOrDrag(BRg bRg, Object[] objArr, final G0U<? super Boolean, Boolean> g0u) {
        AnonymousClass005.A0x(bRg, objArr, g0u);
        return AaM.A00(bRg, new PointerInputEventHandler() { // from class: com.facebook.aura.vds.compose.ext.ModifierExtKt.awaitClickOrDrag.1

            @DebugMetadata(c = "com.facebook.aura.vds.compose.ext.ModifierExtKt$awaitClickOrDrag$1$1", f = "ModifierExt.kt", l = {169, 170, 171}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.vds.compose.ext.ModifierExtKt$awaitClickOrDrag$1$1, reason: invalid class name and collision with other inner class name */
            public final class C04251 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                public final /* synthetic */ G0U<Boolean, Boolean> $onIntercept;
                public /* synthetic */ Object L$0;
                public Object L$1;
                public Object L$2;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C04251(G0U<? super Boolean, Boolean> g0u, HtJ<? super C04251> htJ) {
                    super(2, htJ);
                    this.$onIntercept = g0u;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C04251 c04251 = new C04251(this.$onIntercept, htJ);
                    c04251.L$0 = obj;
                    return c04251;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
                /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
                @Override // X.AbstractC8884Fsp
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        r7 = this;
                        java.lang.Object r6 = r7.L$0
                        X.AXb r6 = (X.InterfaceC1074AXb) r6
                        X.Hji r5 = X.EnumC10460Hji.A02
                        int r0 = r7.label
                        r4 = 3
                        r2 = 2
                        r3 = 1
                        if (r0 == 0) goto L31
                        if (r0 == r3) goto L41
                        if (r0 == r2) goto L56
                        if (r0 != r4) goto L73
                        java.lang.Object r2 = r7.L$2
                        X.Agk r2 = (X.C1299Agk) r2
                        X.Hwg.A00(r8)
                    L1a:
                        X.G0U<java.lang.Boolean, java.lang.Boolean> r1 = r7.$onIntercept
                        if (r8 == 0) goto L1f
                        r3 = 0
                    L1f:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                        boolean r0 = X.AnonymousClass003.A1X(r0, r1)
                        if (r0 == 0) goto L2e
                        if (r2 == 0) goto L2e
                        r2.A02()
                    L2e:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    L30:
                        return r5
                    L31:
                        X.Hwg.A00(r8)
                        X.AXj r0 = X.EnumC1080AXj.A03
                        r7.L$0 = r6
                        r7.label = r3
                        java.lang.Object r8 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A04(r6, r0, r7, r3)
                        if (r8 != r5) goto L44
                        return r5
                    L41:
                        X.Hwg.A00(r8)
                    L44:
                        r0 = r8
                        X.Agk r0 = (X.C1299Agk) r0
                        X.AXj r1 = X.EnumC1080AXj.A03
                        r7.L$0 = r6
                        r7.L$1 = r0
                        r7.label = r2
                        java.lang.Object r8 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A03(r6, r1, r7)
                        if (r8 != r5) goto L5d
                        return r5
                    L56:
                        java.lang.Object r0 = r7.L$1
                        X.Agk r0 = (X.C1299Agk) r0
                        X.Hwg.A00(r8)
                    L5d:
                        X.Agk r8 = (X.C1299Agk) r8
                        long r1 = r0.A08
                        r0 = 0
                        r7.L$0 = r0
                        r7.L$1 = r0
                        r7.L$2 = r8
                        r7.label = r4
                        java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A03(r6, r7, r1)
                        if (r0 == r5) goto L30
                        r2 = r8
                        r8 = r0
                        goto L1a
                    L73:
                        java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.ext.ModifierExtKt.AnonymousClass1.C04251.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // X.G0V
                public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                    return ((C04251) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                return AnonymousClass006.A0l(bRr, htJ, new C04251(g0u, null));
            }
        }, objArr);
    }

    public static final BRg contentBlur(BRg bRg, Function0<BlurConfig> function0) {
        BRg bRgA00;
        Object anonymousClass4;
        AnonymousClass003.A0u(bRg, function0);
        if (Build.VERSION.SDK_INT >= 31) {
            bRgA00 = AbstractC1396AiR.A00(bRg, new AnonymousClass2(function0));
            anonymousClass4 = new AnonymousClass3(function0);
        } else {
            bRgA00 = BRg.A00;
            anonymousClass4 = new AnonymousClass4(function0);
        }
        return AEk.A00(bRgA00, anonymousClass4);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.jvm.functions.Function0<kotlin.Unit> withDebounce(com.facebook.aura.vds.compose.ext.ClickDebouncer r4, kotlin.jvm.functions.Function0<kotlin.Unit> r5, X.BFM r6, int r7) {
        /*
            X.AnonymousClass003.A0u(r4, r5)
            boolean r3 = r6.A67(r4)
            r0 = r7 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L15
            boolean r0 = r6.A65(r5)
            if (r0 != 0) goto L1a
        L15:
            r0 = r7 & 48
            r1 = 0
            if (r0 != r2) goto L1b
        L1a:
            r1 = 1
        L1b:
            r1 = r1 | r3
            java.lang.Object r0 = r6.AaT()
            if (r1 != 0) goto L26
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L2e
        L26:
            com.facebook.aura.vds.compose.ext.ModifierExtKt$withDebounce$1$1 r0 = new com.facebook.aura.vds.compose.ext.ModifierExtKt$withDebounce$1$1
            r0.<init>(r4, r5)
            X.BBI.A0T(r6, r0)
        L2e:
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.ext.ModifierExtKt.withDebounce(com.facebook.aura.vds.compose.ext.ClickDebouncer, kotlin.jvm.functions.Function0, X.BFM, int):kotlin.jvm.functions.Function0");
    }

    public static final Function0<Unit> withDebounce(long j, Function0<Unit> function0, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(function0, 1);
        if ((i2 & 1) != 0) {
            j = 300;
        }
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = new ClickDebouncer(j);
            BBI.A0T(bfm, objAaT);
        }
        return withDebounce((ClickDebouncer) objAaT, function0, bfm, i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
    }
}
