package com.facebook.aura.activation.view;

import X.AEk;
import X.AII;
import X.AIM;
import X.AKH;
import X.AKQ;
import X.ARD;
import X.ASR;
import X.AST;
import X.ASj;
import X.AT2;
import X.ATD;
import X.AWx;
import X.AaI;
import X.AaM;
import X.AbstractC07117nq;
import X.AbstractC1046ASq;
import X.AbstractC1396AiR;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BRr;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0dx;
import X.C0v5;
import X.C0z7;
import X.C1041ASi;
import X.C1050ASu;
import X.C1051ASv;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1299Agk;
import X.C1515AkP;
import X.C16Z;
import X.C16a;
import X.C1822Arm;
import X.C1BO;
import X.C1EQ;
import X.C1YD;
import X.C1YL;
import X.C1b8;
import X.C2HU;
import X.C2VU;
import X.C2av;
import X.C31t;
import X.C3U4;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.C79;
import X.EnumC10460Hji;
import X.EnumC1080AXj;
import X.F1F;
import X.F60;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxS;
import X.InterfaceC05151eP;
import X.InterfaceC1074AXb;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class InviteCodeScratcherKt {
    public static final String CODE_SEPARATOR = " ";
    public static final int COVERAGE_COLUMNS = 36;
    public static final int COVERAGE_ROWS = 6;
    public static final float REVEAL_COVERAGE = 0.6f;
    public static final int REVEAL_DURATION_MS = 520;
    public static final int SCRATCH_LABEL_SHIMMER_DURATION_MS = 1400;
    public static final List<B6A> ScratchLabelShimmer;
    public static final long ScratchSheenDark;
    public static final long ScratchSheenLight;
    public static final float ScratcherHeight = 54.0f;
    public static final float ScratchRadius = 18.0f;
    public static final float ScratchCoverageRadius = 19.8f;
    public static final float ScratchSampleSpacing = 4.0f;
    public static final float ScratchHapticSpacing = 12.0f;
    public static final float RevealDrop = 10.0f;
    public static final float CopyTapTarget = 48.0f;
    public static final float CopyIconSize = 20.0f;
    public static final float CopyIconEndInset = 16.0f;
    public static final float CopyButtonReservedWidth = (16.0f + 48.0f) - ((48.0f - 20.0f) / 2.0f);

    /* renamed from: com.facebook.aura.activation.view.InviteCodeScratcherKt$CopyCodeButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            InviteCodeScratcherKt.CopyCodeButton(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.InviteCodeScratcherKt$InviteCodeScratcher$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $code;
        public final /* synthetic */ boolean $isRevealed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onCopy;
        public final /* synthetic */ Function0<Unit> $onRevealed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, boolean z, G0U<? super String, Unit> g0u, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$code = str;
            this.$isRevealed = z;
            this.$onCopy = g0u;
            this.$onRevealed = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            InviteCodeScratcherKt.InviteCodeScratcher(this.$code, this.$isRevealed, this.$onCopy, this.$onRevealed, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.InviteCodeScratcherKt$ScratchFoil$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Float> $alpha;
        public final /* synthetic */ String $code;
        public final /* synthetic */ InviteCodeScratchDebrisState $debrisState;
        public final /* synthetic */ Function0<Unit> $onReveal;
        public final /* synthetic */ Function0<Unit> $onScratchTick;
        public final /* synthetic */ boolean $reduceMotion;
        public final /* synthetic */ InterfaceC05151eP $this_ScratchFoil;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(InterfaceC05151eP interfaceC05151eP, String str, Function0<Float> function0, InviteCodeScratchDebrisState inviteCodeScratchDebrisState, boolean z, Function0<Unit> function02, Function0<Unit> function03, int i) {
            super(2);
            this.$this_ScratchFoil = interfaceC05151eP;
            this.$code = str;
            this.$alpha = function0;
            this.$debrisState = inviteCodeScratchDebrisState;
            this.$reduceMotion = z;
            this.$onScratchTick = function02;
            this.$onReveal = function03;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            InviteCodeScratcherKt.ScratchFoil(this.$this_ScratchFoil, this.$code, this.$alpha, this.$debrisState, this.$reduceMotion, this.$onScratchTick, this.$onReveal, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.activation.view.InviteCodeScratcherKt$shimmerHighlight$3, reason: invalid class name and case insensitive filesystem */
    public final class C107313 extends AbstractC7559F3s implements G0U<AST, ASR> {
        public final /* synthetic */ List<B6A> $colors;
        public final /* synthetic */ Function0<Float> $progress;

        /* renamed from: com.facebook.aura.activation.view.InviteCodeScratcherKt$shimmerHighlight$3$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
            public final /* synthetic */ C1EQ $brush;
            public final /* synthetic */ Function0<Float> $progress;
            public final /* synthetic */ float $shimmerWidth;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(float f, Function0<Float> function0, C1EQ c1eq) {
                super(1);
                this.$shimmerWidth = f;
                this.$progress = function0;
                this.$brush = c1eq;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C16Z c16z) {
                C16Z.A00(c16z);
                float f = -this.$shimmerWidth;
                float fA03 = ATD.A03(AnonymousClass003.A04(this.$progress), 0.0f, 1.0f);
                float fA00 = AnonymousClass001.A00(c16z.AKb());
                float f2 = this.$shimmerWidth;
                float f3 = f + (fA03 * (fA00 + f2));
                C1EQ c1eq = this.$brush;
                AT2 at2 = ((AaI) c16z.AEq()).A01;
                at2.AhL(f3, 0.0f);
                try {
                    c16z.A9f(c1eq, null, C16a.A00, 1.0f, 9, 0L, AnonymousClass005.A0L(f2, AnonymousClass001.A01(4294967295L, c16z.AKb())));
                } finally {
                    at2.AhL(-f3, -0.0f);
                }
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
                invoke2(c16z);
                return Unit.INSTANCE;
            }
        }

        @Override // X.G0U
        public final ASR invoke(AST ast) {
            C7384Etj.A0Y(ast, 0);
            float fA03 = AnonymousClass003.A03(ast.A00.AKb()) * 0.7f;
            if (fA03 < 1.0f) {
                fA03 = 1.0f;
            }
            return ast.A01(new AnonymousClass1(fA03, this.$progress, C1EQ.A00(this.$colors, 0.0f, fA03)));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107313(List<B6A> list, Function0<Float> function0) {
            super(1);
            this.$colors = list;
            this.$progress = function0;
        }
    }

    public static final BRg claimTouches(BRg bRg, boolean z) {
        C7384Etj.A0Y(bRg, 0);
        if (!z) {
            return bRg;
        }
        return AaM.A00(bRg, new PointerInputEventHandler() { // from class: com.facebook.aura.activation.view.InviteCodeScratcherKt.claimTouches.1

            @DebugMetadata(c = "com.facebook.aura.activation.view.InviteCodeScratcherKt$claimTouches$1$1", f = "InviteCodeScratcher.kt", l = {222, 225}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.activation.view.InviteCodeScratcherKt$claimTouches$1$1, reason: invalid class name and collision with other inner class name */
            public final class C00141 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                public /* synthetic */ Object L$0;
                public Object L$1;
                public int label;

                public C00141(HtJ<? super C00141> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C00141 c00141 = new C00141(htJ);
                    c00141.L$0 = obj;
                    return c00141;
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[LOOP:0: B:8:0x001b->B:10:0x0021, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x006d -> B:7:0x0013). Please report as a decompilation issue!!! */
                @Override // X.AbstractC8884Fsp
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    /*
                        r6 = this;
                        java.lang.Object r4 = r6.L$0
                        X.AXb r4 = (X.InterfaceC1074AXb) r4
                        X.Hji r3 = X.EnumC10460Hji.A02
                        int r1 = r6.label
                        r2 = 2
                        r0 = 1
                        if (r1 == 0) goto L47
                        if (r1 == r0) goto L58
                        if (r1 != r2) goto L70
                        X.Hwg.A00(r7)
                    L13:
                        X.Afe r7 = (X.C1247Afe) r7
                        java.util.List<X.Agk> r5 = r7.A05
                        java.util.Iterator r1 = r5.iterator()
                    L1b:
                        boolean r0 = r1.hasNext()
                        if (r0 == 0) goto L25
                        X.AnonymousClass006.A1S(r1)
                        goto L1b
                    L25:
                        boolean r0 = r5 instanceof java.util.Collection
                        if (r0 == 0) goto L32
                        boolean r0 = r5.isEmpty()
                        if (r0 == 0) goto L32
                    L2f:
                        kotlin.Unit r3 = kotlin.Unit.INSTANCE
                        return r3
                    L32:
                        java.util.Iterator r1 = r5.iterator()
                    L36:
                        boolean r0 = r1.hasNext()
                        if (r0 == 0) goto L2f
                        java.lang.Object r0 = r1.next()
                        X.Agk r0 = (X.C1299Agk) r0
                        boolean r0 = r0.A0F
                        if (r0 == 0) goto L36
                        goto L60
                    L47:
                        X.Hwg.A00(r7)
                        r6.L$0 = r4
                        r6.label = r0
                        r1 = 0
                        X.AXj r0 = X.EnumC1080AXj.A04
                        java.lang.Object r7 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A04(r4, r0, r6, r1)
                        if (r7 != r3) goto L5b
                        return r3
                    L58:
                        X.Hwg.A00(r7)
                    L5b:
                        X.Agk r7 = (X.C1299Agk) r7
                        r7.A02()
                    L60:
                        r6.L$0 = r4
                        r0 = 0
                        r6.L$1 = r0
                        r6.label = r2
                        X.AXj r0 = X.EnumC1080AXj.A04
                        java.lang.Object r7 = r4.A4z(r0, r6)
                        if (r7 != r3) goto L13
                        return r3
                    L70:
                        java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.InviteCodeScratcherKt.AnonymousClass1.C00141.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // X.G0V
                public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                    C00141 c00141 = new C00141(htJ);
                    c00141.L$0 = interfaceC1074AXb;
                    return c00141.invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                return AnonymousClass006.A0l(bRr, htJ, new C00141(null));
            }
        }, Unit.INSTANCE);
    }

    /* renamed from: com.facebook.aura.activation.view.InviteCodeScratcherKt$shimmerHighlight$1, reason: invalid class name and case insensitive filesystem */
    public final class C107291 extends AbstractC7559F3s implements Function0<Float> {
        public static final C107291 INSTANCE = new C107291();

        public C107291() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return AnonymousClass005.A0a();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Float invoke() {
            return AnonymousClass005.A0a();
        }
    }

    static {
        long j = B6A.A01;
        ScratchSheenLight = 4294440951L << 32;
        ScratchSheenDark = 536870911 << 32;
        long j2 = 14216447 << 32;
        long j3 = 584641791 << 32;
        ScratchLabelShimmer = Arrays.asList(new B6A(j2), new B6A(j3), new B6A(2297428223L << 32), new B6A(j3), new B6A(j2));
    }

    public static final void CopyCodeButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-772404287);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            float f = CopyIconEndInset;
            float f2 = CopyTapTarget;
            BRg bRgA04 = C0v5.A04(C10G.A09(C3U4.A0C(bRg2, 0.0f, 0.0f, f - ((f2 - CopyIconSize) / 2.0f), 0.0f), f2, f2), new C1YD(0), null, function0, true);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.copy_wght400_outline_24, 0), AuraIconSize.X_SMALL, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208a0), C06G.A07(bfm), null, bfm, AnonymousClass001.A03(), 33);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, bRg2, i, i2);
        }
    }

    public static final void InviteCodeScratcher(String str, boolean z, G0U<? super String, Unit> g0u, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0X;
        BRg bRg2 = bRg;
        int iA0C = AnonymousClass002.A0C(str, g0u, 0);
        C7384Etj.A0Y(function0, 3);
        bfm.AgG(-299569510);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA0d & 14;
            boolean zIsInviteCodeFoilCovering = isInviteCodeFoilCovering(str, z, bfm, iA0d & 126);
            boolean z2 = !zIsInviteCodeFoilCovering;
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            boolean zRememberScratchReduceMotionEnabled = InviteCodeScratchDebrisKt.rememberScratchReduceMotionEnabled(bfm, 0);
            InviteCodeScratchDebrisState inviteCodeScratchDebrisStateRememberInviteCodeScratchDebrisState = InviteCodeScratchDebrisKt.rememberInviteCodeScratchDebrisState(bfm, 0);
            boolean zA1Q = AnonymousClass002.A1Q(i4, 4);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            C1BO c1boA01 = C31t.A01(new ASj(C2HU.A00, REVEAL_DURATION_MS, 0), bfm, zIsInviteCodeFoilCovering ? 1.0f : 0.0f, 3072, 20);
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass002.A0K(bfm, null, new InviteCodeScratcherKt$InviteCodeScratcher$isFoilVisible$2$1(c1boA01));
            }
            C1BO c1bo = (C1BO) objAaT2;
            Boolean boolValueOf = Boolean.valueOf(z2);
            Boolean boolValueOf2 = Boolean.valueOf(MutableState.A0A(mutableState));
            boolean zA1V = AnonymousClass004.A1V(bfm, c0dxA0T, zRememberScratchReduceMotionEnabled, AnonymousClass003.A1S(bfm, mutableState, z2));
            Object objAaT3 = bfm.AaT();
            if (zA1V || objAaT3 == obj) {
                objAaT3 = new InviteCodeScratcherKt$InviteCodeScratcher$1$1(z2, zRememberScratchReduceMotionEnabled, c0dxA0T, mutableState, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A1A(bfm, objAaT3, boolValueOf, boolValueOf2);
            boolean zA1S = AnonymousClass004.A1S(bfm, mutableState, c0dxA0T, bfm.A66(z2)) | AnonymousClass004.A1M(iA0d);
            Object objAaT4 = bfm.AaT();
            if (zA1S || objAaT4 == obj) {
                objAaT4 = new InviteCodeScratcherKt$InviteCodeScratcher$reveal$1$1(z2, c0dxA0T, function0, mutableState);
                bfm.Ai0(objAaT4);
            }
            Function0 function02 = (Function0) objAaT4;
            Alignment alignment = C2VU.A09;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA01, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            C0z7 c0z7 = C0z7.A00;
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA012 = C1b8.A01(C11U.A03(AnonymousClass001.A0V(c1062ATq, ScratcherHeight), AnonymousClass002.A0e(bfm).large), AnonymousClass002.A0c(bfm).secondaryElevated);
            InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA012);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA012, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            boolean zA17 = AnonymousClass003.A17(i4);
            Object objAaT5 = bfm.AaT();
            if (zA17 || objAaT5 == obj) {
                char[] charArray = str.toCharArray();
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "");
                int i6 = 0;
                for (char c : charArray) {
                    i6++;
                    if (i6 > 1) {
                        sb.append((CharSequence) CODE_SEPARATOR);
                    }
                    sb.append(c);
                }
                sb.append((CharSequence) "");
                objAaT5 = sb.toString();
                bfm.Ai0(objAaT5);
            }
            String str2 = (String) objAaT5;
            C1822Arm c1822ArmA0U = C06G.A0U(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long jA0L = C06G.A0L(bfm, akh);
            BRg bRgA0B = C3U4.A0B(c1062ATq, CopyButtonReservedWidth, 0.0f);
            if (zIsInviteCodeFoilCovering) {
                Object objA0p = AnonymousClass001.A0p(bfm, -2084708158);
                if (objA0p == obj) {
                    objA0p = InviteCodeScratcherKt$InviteCodeScratcher$2$1$3$1.INSTANCE;
                    bfm.Ai0(objA0p);
                }
                bRgA0X = AnonymousClass001.A0X(bs0, objA0p);
            } else {
                bfm.AgE(-2084947292);
                String strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f12042f);
                boolean zA65 = bfm.A65(strA0t);
                Object objAaT6 = bfm.AaT();
                if (zA65 || objAaT6 == obj) {
                    objAaT6 = new InviteCodeScratcherKt$InviteCodeScratcher$2$1$2$1(strA0t);
                    bfm.Ai0(objAaT6);
                }
                bRgA0X = AnonymousClass001.A0Y(bs0, objAaT6, false);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, bRgA0B.then(bRgA0X), jA0L, c1822ArmA0U, null, null, new C1YL(3), false, 0, iA0C, iA0C, null, null, null, bfm, 805306368, 6, 14768);
            if (zIsInviteCodeFoilCovering) {
                bfm.AgE(-2084465676);
            } else {
                bfm.AgE(-2084569464);
                boolean zA1K = AnonymousClass004.A1K(iA0d) | AnonymousClass003.A17(i4);
                Object objAaT7 = bfm.AaT();
                if (zA1K || objAaT7 == obj) {
                    objAaT7 = new InviteCodeScratcherKt$InviteCodeScratcher$2$1$4$1(g0u, str);
                    bfm.Ai0(objAaT7);
                }
                CopyCodeButton((Function0) objAaT7, c0z7.A4C(C2VU.A0A, bs0), bfm, 0, 0);
            }
            BBI.A0R(bbi, false);
            if (C1BO.A0F(c1bo)) {
                boolean zA1Y = AnonymousClass001.A1Y(c1boA01, bfm, -2084428538);
                Object objAaT8 = bfm.AaT();
                if (zA1Y || objAaT8 == obj) {
                    objAaT8 = new InviteCodeScratcherKt$InviteCodeScratcher$2$1$5$1(c1boA01);
                    bfm.Ai0(objAaT8);
                }
                Function0 function04 = (Function0) objAaT8;
                boolean zA67 = bfm.A67(c0dxA0T);
                Object objAaT9 = bfm.AaT();
                if (zA67 || objAaT9 == obj) {
                    objAaT9 = new InviteCodeScratcherKt$InviteCodeScratcher$2$1$6$1(c0dxA0T);
                    bfm.Ai0(objAaT9);
                }
                ScratchFoil(c0z7, str, function04, inviteCodeScratchDebrisStateRememberInviteCodeScratchDebrisState, zRememberScratchReduceMotionEnabled, (Function0) objAaT9, function02, bfm, ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6 | (InviteCodeScratchDebrisState.$stable << 9));
            } else {
                bfm.AgE(-2084107564);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            InviteCodeScratchDebrisKt.m145InviteCodeScratchDebris3IgeMak(inviteCodeScratchDebrisStateRememberInviteCodeScratchDebrisState, C06G.A0I(bfm, akh), c0z7.AQJ(bs0), bfm, InviteCodeScratchDebrisState.$stable, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, z, g0u, function0, bRg2, i, i2);
        }
    }

    /* renamed from: addCellsAround-OXOWCTw, reason: not valid java name */
    public static final void m152addCellsAroundOXOWCTw(Set<Integer> set, long j, long j2, float f) {
        int i;
        int i2 = (int) (j2 >> 32);
        if (i2 == 0 || (i = (int) (j2 & 4294967295L)) == 0) {
            return;
        }
        float f2 = i2 / 36.0f;
        float f3 = i / 6.0f;
        int i3 = 0;
        do {
            int i4 = 0;
            do {
                if (((float) Math.hypot(((i4 + 0.5f) * f2) - AnonymousClass001.A00(j), ((i3 + 0.5f) * f3) - AnonymousClass001.A01(j, 4294967295L))) <= f) {
                    set.add(Integer.valueOf((i3 * 36) + i4));
                }
                i4++;
            } while (i4 < 36);
            i3++;
        } while (i3 < 6);
    }

    /* renamed from: coverageCellSize-ozmzZPI, reason: not valid java name */
    public static final long m153coverageCellSizeozmzZPI(long j) {
        return AnonymousClass005.A0M(((int) (j >> 32)) / 36.0f, ((int) (j & 4294967295L)) / 6.0f);
    }

    public static final boolean isTouchExplorationEnabled(Context context) {
        Object systemService = context.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    public static final BRg shimmerHighlight(BRg bRg, List<B6A> list, Function0<Float> function0) {
        return AEk.A02(AbstractC1396AiR.A00(bRg, C107302.INSTANCE), new C107313(list, function0));
    }

    public static /* synthetic */ BRg shimmerHighlight$default(BRg bRg, List list, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = C107291.INSTANCE;
        }
        return shimmerHighlight(bRg, list, function0);
    }

    public static final void ScratchFoil(InterfaceC05151eP interfaceC05151eP, String str, Function0<Float> function0, final InviteCodeScratchDebrisState inviteCodeScratchDebrisState, final boolean z, final Function0<Unit> function02, final Function0<Unit> function03, BFM bfm, int i) {
        bfm.AgG(-861962922);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, interfaceC05151eP) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass002.A00(AnonymousClass004.A1a(inviteCodeScratchDebrisState, bfm, i) ? 1 : 0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function02);
        }
        if ((i & 1572864) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function03);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 599187, 599186), bfm, iA0d)) {
            int i2 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1Q = AnonymousClass002.A1Q(i2, 32);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new SnapshotStateList();
                bfm.Ai0(objAaT);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) objAaT;
            boolean zA1Q2 = AnonymousClass002.A1Q(i2, 32);
            Object objAaT2 = bfm.AaT();
            if (zA1Q2 || objAaT2 == C78N.A00) {
                objAaT2 = new LinkedHashSet();
                bfm.Ai0(objAaT2);
            }
            final Set set = (Set) objAaT2;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12042c);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long j = AnonymousClass001.A0f(bfm, akh).secondaryElevated;
            long jA02 = AnonymousClass001.A0f(bfm, akh).isLight ? ScratchSheenLight : HxS.A02(ScratchSheenDark, j);
            C1050ASu c1050ASuA00 = AbstractC1046ASq.A00(new C1041ASi(new ASj(C2HU.A02, 1400, 0), C79.A00, 0L), AbstractC1046ASq.A01(bfm), bfm, 0.0f, 1.0f);
            BS0 bs0 = BRg.A00;
            BRg bRgAQJ = interfaceC05151eP.AQJ(bs0);
            boolean zA1W = AnonymousClass006.A1W(iA0d);
            Object objAaT3 = bfm.AaT();
            if (zA1W || objAaT3 == C78N.A00) {
                objAaT3 = new InviteCodeScratcherKt$ScratchFoil$1$1(function0);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRgAQJ, objAaT3);
            boolean zA1W2 = AnonymousClass002.A1W(bfm, snapshotStateList, bfm.A64(j), bfm.A64(jA02));
            Object objAaT4 = bfm.AaT();
            if (zA1W2 || objAaT4 == C78N.A00) {
                objAaT4 = new InviteCodeScratcherKt$ScratchFoil$2$1(j, jA02, snapshotStateList);
                bfm.Ai0(objAaT4);
            }
            BRg bRgA02 = AEk.A02(bRgA0W, (G0U) objAaT4);
            int i3 = iA0d & 3670016;
            boolean zA1V = AnonymousClass002.A1V(bfm, set, bfm.A65(snapshotStateList) | ((iA0d & 7168) == 2048 || ((iA0d & 4096) != 0 && bfm.A67(inviteCodeScratchDebrisState))), AnonymousClass005.A1L(iA0d)) | AnonymousClass002.A1Q(i3, 1048576) | AnonymousClass007.A1I(iA0d);
            Object objAaT5 = bfm.AaT();
            if (zA1V || objAaT5 == C78N.A00) {
                objAaT5 = new PointerInputEventHandler() { // from class: com.facebook.aura.activation.view.InviteCodeScratcherKt$ScratchFoil$3$1

                    @DebugMetadata(c = "com.facebook.aura.activation.view.InviteCodeScratcherKt$ScratchFoil$3$1$1", f = "InviteCodeScratcher.kt", l = {316, 319}, m = "invokeSuspend", v = 2)
                    /* renamed from: com.facebook.aura.activation.view.InviteCodeScratcherKt$ScratchFoil$3$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                        public final /* synthetic */ float $hapticSpacingPx;
                        public final /* synthetic */ Function0<Unit> $onScratchTick;
                        public final /* synthetic */ G0U<AWx, Unit> $scratch;
                        public final /* synthetic */ float $spacingPx;
                        public /* synthetic */ Object L$0;
                        public Object L$1;
                        public Object L$2;
                        public int label;

                        /* renamed from: com.facebook.aura.activation.view.InviteCodeScratcherKt$ScratchFoil$3$1$1$1, reason: invalid class name and collision with other inner class name */
                        public final class C00131 extends AbstractC7559F3s implements G0U<C1299Agk, Unit> {
                            public final /* synthetic */ C1051ASv $hapticDistancePx;
                            public final /* synthetic */ float $hapticSpacingPx;
                            public final /* synthetic */ Function0<Unit> $onScratchTick;
                            public final /* synthetic */ G0U<AWx, Unit> $scratch;
                            public final /* synthetic */ float $spacingPx;

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(C1299Agk c1299Agk) {
                                C7384Etj.A0Y(c1299Agk, 0);
                                C1051ASv c1051ASv = this.$hapticDistancePx;
                                float f = c1051ASv.element;
                                long j = c1299Agk.A0A;
                                long j2 = c1299Agk.A0B;
                                long jA04 = AWx.A04(j, j2);
                                float fA00 = f + AWx.A00(jA04);
                                c1051ASv.element = fA00;
                                float f2 = this.$hapticSpacingPx;
                                if (fA00 >= f2) {
                                    c1051ASv.element = fA00 % f2;
                                    this.$onScratchTick.invoke();
                                }
                                float f3 = this.$spacingPx;
                                G0U<AWx, Unit> g0u = this.$scratch;
                                int iCeil = (int) Math.ceil(r6 / f3);
                                int i = 1;
                                if (iCeil < 1) {
                                    iCeil = 1;
                                }
                                while (true) {
                                    AnonymousClass006.A1T(g0u, AWx.A05(j2, AWx.A02(jA04, i / iCeil)));
                                    if (i == iCeil) {
                                        c1299Agk.A02();
                                        return;
                                    }
                                    i++;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C00131(C1051ASv c1051ASv, float f, Function0<Unit> function0, float f2, G0U<? super AWx, Unit> g0u) {
                                super(1);
                                this.$hapticDistancePx = c1051ASv;
                                this.$hapticSpacingPx = f;
                                this.$onScratchTick = function0;
                                this.$spacingPx = f2;
                                this.$scratch = g0u;
                            }

                            @Override // X.G0U
                            public /* bridge */ /* synthetic */ Unit invoke(C1299Agk c1299Agk) {
                                invoke2(c1299Agk);
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public AnonymousClass1(G0U<? super AWx, Unit> g0u, float f, Function0<Unit> function0, float f2, HtJ<? super AnonymousClass1> htJ) {
                            super(2, htJ);
                            this.$scratch = g0u;
                            this.$hapticSpacingPx = f;
                            this.$onScratchTick = function0;
                            this.$spacingPx = f2;
                        }

                        @Override // X.AbstractC8884Fsp
                        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scratch, this.$hapticSpacingPx, this.$onScratchTick, this.$spacingPx, htJ);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        @Override // X.AbstractC8884Fsp
                        public final Object invokeSuspend(Object obj) {
                            C1051ASv c1051ASv;
                            InterfaceC1074AXb interfaceC1074AXb = (InterfaceC1074AXb) this.L$0;
                            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                            int i = this.label;
                            if (i == 0) {
                                Hwg.A00(obj);
                                c1051ASv = new C1051ASv();
                                this.L$0 = interfaceC1074AXb;
                                this.L$1 = c1051ASv;
                                this.label = 1;
                                obj = TapGestureDetectorKt.A04(interfaceC1074AXb, EnumC1080AXj.A04, this, false);
                                if (obj == enumC10460Hji) {
                                    return enumC10460Hji;
                                }
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw AnonymousClass001.A0n();
                                    }
                                    Hwg.A00(obj);
                                    return Unit.INSTANCE;
                                }
                                c1051ASv = (C1051ASv) this.L$1;
                                Hwg.A00(obj);
                            }
                            C1299Agk c1299Agk = (C1299Agk) obj;
                            c1299Agk.A02();
                            AnonymousClass006.A1T(this.$scratch, c1299Agk.A0A);
                            long j = c1299Agk.A08;
                            C00131 c00131 = new C00131(c1051ASv, this.$hapticSpacingPx, this.$onScratchTick, this.$spacingPx, this.$scratch);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 2;
                            if (DragGestureDetectorKt.A05(interfaceC1074AXb, this, c00131, j) == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // X.G0V
                        public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                            return ((AnonymousClass1) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        float fAh4 = bRr.Ah4(InviteCodeScratcherKt.ScratchCoverageRadius);
                        float fAh42 = bRr.Ah4(InviteCodeScratcherKt.ScratchSampleSpacing);
                        return AnonymousClass006.A0l(bRr, htJ, new AnonymousClass1(new InviteCodeScratcherKt$ScratchFoil$3$1$scratch$1(new F1F(), snapshotStateList, inviteCodeScratchDebrisState, z, set, bRr, fAh4, 129.6f, function03), bRr.Ah4(InviteCodeScratcherKt.ScratchHapticSpacing), function02, fAh42, null));
                    }
                };
                bfm.Ai0(objAaT5);
            }
            BRg bRgA00 = AaM.A00(bRgA02, (PointerInputEventHandler) objAaT5, str);
            boolean zA65 = bfm.A65(strA01) | AnonymousClass002.A1Q(i3, 1048576);
            Object objAaT6 = bfm.AaT();
            if (zA65 || objAaT6 == C78N.A00) {
                objAaT6 = new InviteCodeScratcherKt$ScratchFoil$4$1(strA01, function03);
                bfm.Ai0(objAaT6);
            }
            BRg bRgA01 = ARD.A01(bRgA00, (G0U) objAaT6, true);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A09, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA012, iA0J);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12042d);
            C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
            long jA08 = C06G.A08(bfm);
            List<B6A> list = ScratchLabelShimmer;
            boolean zA652 = bfm.A65(c1050ASuA00);
            Object objAaT7 = bfm.AaT();
            if (zA652 || objAaT7 == C78N.A00) {
                objAaT7 = new InviteCodeScratcherKt$ScratchFoil$5$1$1(c1050ASuA00);
                bfm.Ai0(objAaT7);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA012, shimmerHighlight(bs0, list, (Function0) objAaT7), jA08, c1822ArmA0Z, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(interfaceC05151eP, str, function0, inviteCodeScratchDebrisState, z, function02, function03, i);
        }
    }

    /* renamed from: forEachSample-jyLRC_s, reason: not valid java name */
    public static final void m154forEachSamplejyLRC_s(long j, long j2, float f, G0U<? super AWx, Unit> g0u) {
        long jA04 = AWx.A04(j2, j);
        int iCeil = (int) Math.ceil(AWx.A00(jA04) / f);
        int i = 1;
        if (iCeil < 1) {
            iCeil = 1;
        }
        while (true) {
            AnonymousClass006.A1T(g0u, AWx.A05(j, AWx.A02(jA04, i / iCeil)));
            if (i == iCeil) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final boolean isInviteCodeFoilCovering(String str, boolean z, BFM bfm, int i) {
        Context contextA0H = AnonymousClass002.A0H(bfm);
        boolean zA65 = bfm.A65(contextA0H);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = AnonymousClass001.A0j(bfm, isTouchExplorationEnabled(contextA0H));
        }
        return (str == null || z || AnonymousClass001.A1X(objAaT) || !HatchUtil.INSTANCE.isScratchToRevealCodeEnabled()) ? false : true;
    }

    /* renamed from: uncoveredCellCenters-O0kMr_c, reason: not valid java name */
    public static final List<AWx> m155uncoveredCellCentersO0kMr_c(Set<Integer> set, long j) {
        long jM153coverageCellSizeozmzZPI = m153coverageCellSizeozmzZPI(j);
        AII aiiA17 = AIM.A17();
        int i = 0;
        do {
            int i2 = 0;
            do {
                if (!set.contains(Integer.valueOf((i * 36) + i2))) {
                    aiiA17.add(new AWx(AnonymousClass005.A0L((i2 + 0.5f) * AnonymousClass001.A00(jM153coverageCellSizeozmzZPI), (i + 0.5f) * AnonymousClass001.A01(jM153coverageCellSizeozmzZPI, 4294967295L))));
                }
                i2++;
            } while (i2 < 36);
            i++;
        } while (i < 6);
        return AIM.A18(aiiA17);
    }

    /* renamed from: com.facebook.aura.activation.view.InviteCodeScratcherKt$shimmerHighlight$2, reason: invalid class name and case insensitive filesystem */
    public final class C107302 extends AbstractC7559F3s implements G0U<C2av, Unit> {
        public static final C107302 INSTANCE = new C107302();

        public C107302() {
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
