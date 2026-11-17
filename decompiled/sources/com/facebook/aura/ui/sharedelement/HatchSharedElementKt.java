package com.facebook.aura.ui.sharedelement;

import X.AGO;
import X.AKH;
import X.AKO;
import X.AKT;
import X.AOe;
import X.AP0;
import X.AP1;
import X.AP9;
import X.APL;
import X.APZ;
import X.ASj;
import X.AaC;
import X.AbstractC1011APs;
import X.AbstractC1396AiR;
import X.AbstractC2139Az7;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BUT;
import X.C1003AOr;
import X.C1007AOy;
import X.C1019AQc;
import X.C1022AQg;
import X.C1Cd;
import X.C1DM;
import X.C1eL;
import X.C2328BUc;
import X.C28s;
import X.C2HU;
import X.C2av;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchSharedElementKt {
    public static final int HATCH_CARD_MORPH_DURATION_MS = 350;
    public static final float HATCH_SHARED_ELEMENT_SPRING_DAMPING = 0.9f;
    public static final float HATCH_SHARED_ELEMENT_SPRING_STIFFNESS = 1000.0f;
    public static final AKH<HatchSharedTransitionContext> LocalHatchSharedTransitionContext = new AGO(HatchSharedElementKt$LocalHatchSharedTransitionContext$1.INSTANCE);

    /* renamed from: com.facebook.aura.ui.sharedelement.HatchSharedElementKt$DisableHatchSharedTransitions$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$content = g0v;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSharedElementKt.DisableHatchSharedTransitions(this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ui.sharedelement.HatchSharedElementKt$HatchSharedElement$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C1DM $clipShape;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ Function0<Boolean> $isEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $sharedKey;
        public final /* synthetic */ HatchSharedElementTransform $transform;
        public final /* synthetic */ Integer $transitionDurationMillis;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(String str, C1DM c1dm, BRg bRg, Function0<Boolean> function0, HatchSharedElementTransform hatchSharedElementTransform, Integer num, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$sharedKey = str;
            this.$clipShape = c1dm;
            this.$modifier = bRg;
            this.$isEnabled = function0;
            this.$transform = hatchSharedElementTransform;
            this.$transitionDurationMillis = num;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSharedElementKt.HatchSharedElement(this.$sharedKey, this.$clipShape, this.$modifier, this.$isEnabled, this.$transform, this.$transitionDurationMillis, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ui.sharedelement.HatchSharedElementKt$HatchSharedTransitionLayout$1, reason: invalid class name and case insensitive filesystem */
    public final class C142541 extends AbstractC7559F3s implements G0W<AP1, BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(AP1 ap1, BFM bfm, int i) {
            C7384Etj.A0Y(ap1, 0);
            if ((i & 6) == 0) {
                i |= AnonymousClass004.A0d(bfm, ap1);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 19, 18), bfm, i)) {
                bfm.Afo();
                return;
            }
            boolean z = (i & 14) == 4;
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new HatchSharedTransitionContext(ap1, new SharedElementClipRegistry());
                BBI.A0T(bfm, objAaT);
            }
            AKT.A01(bfm, HatchSharedElementKt.LocalHatchSharedTransitionContext.A04(objAaT), this.$content, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142541(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(3);
            this.$content = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AP1 ap1, BFM bfm, Integer num) {
            invoke(ap1, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ui.sharedelement.HatchSharedElementKt$HatchSharedTransitionLayout$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSharedElementKt.HatchSharedTransitionLayout(this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ui.sharedelement.HatchSharedElementKt$hatchSharedElementTransform$2, reason: invalid class name and case insensitive filesystem */
    public final class C142562 extends AbstractC7559F3s implements G0U<C2av, Unit> {
        public final /* synthetic */ Function0<Float> $scale;
        public final /* synthetic */ HatchSharedElementTransform $transform;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2av c2av) {
            C7384Etj.A0Y(c2av, 0);
            float fA04 = AnonymousClass003.A04(this.$scale);
            c2av.Acj(this.$transform.getAlpha());
            long jMo1453getTranslationF1C5BW0 = this.$transform.mo1453getTranslationF1C5BW0();
            c2av.Af5(AnonymousClass003.A03(jMo1453getTranslationF1C5BW0));
            c2av.Af6(AnonymousClass004.A00(jMo1453getTranslationF1C5BW0));
            c2av.AeX(fA04);
            c2av.AeY(fA04);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142562(Function0<Float> function0, HatchSharedElementTransform hatchSharedElementTransform) {
            super(1);
            this.$scale = function0;
            this.$transform = hatchSharedElementTransform;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
            invoke2(c2av);
            return Unit.INSTANCE;
        }
    }

    public static final void DisableHatchSharedTransitions(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        C7384Etj.A0Y(g0v, 0);
        bfm.AgG(1031977112);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            AKT.A01(bfm, LocalHatchSharedTransitionContext.A04(null), g0v, (iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(g0v, i);
        }
    }

    public static final void HatchSharedTransitionLayout(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(g0v, 1);
        bfm.AgG(308173606);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AP9.A01(bRg, B1V.A00(bfm, new C142541(g0v), -1297471516), bfm, (iA0d & 14) | 48, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg, g0v, i, i2);
        }
    }

    public static final <T> C1003AOr<T> hatchSharedElementSpring() {
        return new C1003AOr<>(null, 0.9f, 1000.0f);
    }

    public static final BRg messageTransition(BRg bRg, String str, String str2, BFM bfm, int i) {
        AP1 ap1;
        AnonymousClass002.A1A(bRg, 0, str2);
        bfm.AgE(1437605290);
        if (str != null) {
            BBI bbi = (BBI) bfm;
            HatchSharedTransitionContext hatchSharedTransitionContext = (HatchSharedTransitionContext) AKO.A07(LocalHatchSharedTransitionContext, bbi);
            if (hatchSharedTransitionContext != null && (ap1 = hatchSharedTransitionContext.scope) != null) {
                C1Cd c1Cd = (C1Cd) AKO.A07(C1eL.A00, bbi);
                APL aplAaS = ap1.AaS(bfm, FGI.A0d("message/", str, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str2));
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new AP0() { // from class: com.facebook.aura.ui.sharedelement.HatchSharedElementKt$messageTransition$1$1$1
                        @Override // X.AP0
                        public final AOe<AaC> createAnimationSpec(AaC aaC, AaC aaC2) {
                            return AnonymousClass002.A0J(C2HU.A01, 450);
                        }
                    };
                    bfm.Ai0(objAaT);
                }
                BRg bRgA02 = AxM.A02(bRg, AbstractC2139Az7.A00, new C1007AOy((AP0) objAaT, AP9.A01, C1022AQg.A00, aplAaS, (APZ) ap1, c1Cd.AM0(), BUT.A00(11), 2.0f, true, true));
                BBI.A0R(bbi, false);
                return bRgA02;
            }
        }
        AnonymousClass001.A1D(bfm);
        return bRg;
    }

    public static final BRg renderAboveHatchSharedElements(BRg bRg, int i, BFM bfm, int i2) {
        AP1 ap1;
        C7384Etj.A0Y(bRg, 0);
        bfm.AgE(2088494140);
        BBI bbi = (BBI) bfm;
        HatchSharedTransitionContext hatchSharedTransitionContext = (HatchSharedTransitionContext) AKO.A07(LocalHatchSharedTransitionContext, bbi);
        if (hatchSharedTransitionContext == null || (ap1 = hatchSharedTransitionContext.scope) == null) {
            BBI.A0R(bbi, false);
            return bRg;
        }
        C1Cd c1Cd = (C1Cd) AKO.A07(C1eL.A00, bbi);
        ASj aSj = new ASj(C2HU.A02, i, 0);
        BRg bRgA4H = c1Cd.A4H(AbstractC1011APs.A04(aSj, 0.0f), AbstractC1011APs.A0E(aSj), bRg.then(new C1019AQc((APZ) ap1, C2328BUc.A00(ap1, 2), 1.0f)), "animateEnterExit");
        BBI.A0R(bbi, false);
        return bRgA4H;
    }

    /* renamed from: com.facebook.aura.ui.sharedelement.HatchSharedElementKt$hatchSharedElementTransform$1, reason: invalid class name and case insensitive filesystem */
    public final class C142551 extends AbstractC7559F3s implements Function0<Float> {
        public static final C142551 INSTANCE = new C142551();

        public C142551() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return C8j3.A0t();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Float invoke() {
            return C8j3.A0t();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0180 A[PHI: r0
  0x0180: PHI (r0v72 X.APW) = (r0v55 X.APN), (r0v73 X.APW) binds: [B:114:0x02b8, B:70:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchSharedElement(final java.lang.String r42, X.C1DM r43, X.BRg r44, kotlin.jvm.functions.Function0<java.lang.Boolean> r45, com.facebook.aura.ui.sharedelement.HatchSharedElementTransform r46, java.lang.Integer r47, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r48, X.BFM r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.sharedelement.HatchSharedElementKt.HatchSharedElement(java.lang.String, X.1DM, X.BRg, kotlin.jvm.functions.Function0, com.facebook.aura.ui.sharedelement.HatchSharedElementTransform, java.lang.Integer, X.G0V, X.BFM, int, int):void");
    }

    public static /* synthetic */ void getLocalHatchSharedTransitionContext$annotations() {
    }

    public static final <T> AOe<T> hatchSharedElementAnimationSpec(HatchSharedElementTransform hatchSharedElementTransform, Integer num) {
        AOe<T> aOeHatchSharedElementSpring;
        int iIntValue;
        C28s c28s;
        if (hatchSharedElementTransform != null && hatchSharedElementTransform.isActive()) {
            iIntValue = hatchSharedElementTransform.getInteractiveTransitionDurationMillis();
            c28s = C2HU.A02;
        } else {
            if (num == null) {
                aOeHatchSharedElementSpring = hatchSharedElementSpring();
                return aOeHatchSharedElementSpring;
            }
            iIntValue = num.intValue();
            c28s = C2HU.A01;
        }
        aOeHatchSharedElementSpring = AnonymousClass002.A0J(c28s, iIntValue);
        return aOeHatchSharedElementSpring;
    }

    public static final BRg hatchSharedElementTransform(BRg bRg, HatchSharedElementTransform hatchSharedElementTransform, Function0<Float> function0) {
        return hatchSharedElementTransform != null ? AbstractC1396AiR.A00(bRg, new C142562(function0, hatchSharedElementTransform)) : bRg;
    }

    public static /* synthetic */ BRg hatchSharedElementTransform$default(BRg bRg, HatchSharedElementTransform hatchSharedElementTransform, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = C142551.INSTANCE;
        }
        return hatchSharedElementTransform(bRg, hatchSharedElementTransform, function0);
    }

    public static final boolean isHatchSharedTransitionActive(BFM bfm, int i) {
        AP1 ap1;
        HatchSharedTransitionContext hatchSharedTransitionContext = (HatchSharedTransitionContext) AKO.A07(LocalHatchSharedTransitionContext, (BBI) bfm);
        return (hatchSharedTransitionContext == null || (ap1 = hatchSharedTransitionContext.scope) == null || !ap1.APC()) ? false : true;
    }

    public static final boolean isHatchSharedTransitionAvailable(BFM bfm, int i) {
        return AnonymousClass002.A1X(AKO.A07(LocalHatchSharedTransitionContext, (BBI) bfm));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.facebook.aura.ui.sharedelement.HatchSharedElementKt$rememberSharedElementClipParticipant$progress$1] */
    /* JADX WARN: Type inference failed for: r1v18, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r1v19, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.ui.sharedelement.SharedElementClipParticipant rememberSharedElementClipParticipant(java.lang.String r23, X.C1DM r24, X.APL r25, final X.AOP<X.EnumC04711Bv> r26, com.facebook.aura.ui.sharedelement.SharedElementClipRegistry r27, com.facebook.aura.ui.sharedelement.HatchSharedElementTransform r28, java.lang.Integer r29, X.BFM r30, int r31) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.sharedelement.HatchSharedElementKt.rememberSharedElementClipParticipant(java.lang.String, X.1DM, X.APL, X.AOP, com.facebook.aura.ui.sharedelement.SharedElementClipRegistry, com.facebook.aura.ui.sharedelement.HatchSharedElementTransform, java.lang.Integer, X.BFM, int):com.facebook.aura.ui.sharedelement.SharedElementClipParticipant");
    }

    public static final BRg renderAboveHatchPages(BRg bRg, Function0<Boolean> function0, BFM bfm, int i) {
        AP1 ap1;
        AnonymousClass003.A0u(bRg, function0);
        bfm.AgE(-1488315217);
        BBI bbi = (BBI) bfm;
        HatchSharedTransitionContext hatchSharedTransitionContext = (HatchSharedTransitionContext) AKO.A07(LocalHatchSharedTransitionContext, bbi);
        if (hatchSharedTransitionContext == null || (ap1 = hatchSharedTransitionContext.scope) == null) {
            BBI.A0R(bbi, false);
            return bRg;
        }
        BRg bRgThen = bRg.then(new C1019AQc((APZ) ap1, function0, 0.0f));
        BBI.A0R(bbi, false);
        return bRgThen;
    }
}
