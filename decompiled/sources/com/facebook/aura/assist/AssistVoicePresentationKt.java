package com.facebook.aura.assist;

import X.AKH;
import X.AOB;
import X.AOP;
import X.AOQ;
import X.AOR;
import X.AOW;
import X.AOe;
import X.ARD;
import X.ASj;
import X.ASk;
import X.AT9;
import X.ATD;
import X.AVd;
import X.AXN;
import X.AXY;
import X.AYD;
import X.AYL;
import X.AYU;
import X.AZE;
import X.AaC;
import X.AaM;
import X.Ab3;
import X.AbstractC07117nq;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BRr;
import X.C01N;
import X.C10G;
import X.C1BO;
import X.C1DG;
import X.C28s;
import X.C2HU;
import X.C2ae;
import X.C31w;
import X.C3TG;
import X.C3UC;
import X.C7384Etj;
import X.C78N;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.InterfaceC0857A6e;
import X.InterfaceC1074AXb;
import X.InterfaceC1134Abi;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.unit.Constraints;
import com.facebook.acra.util.minidump.MinidumpReader;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AssistVoicePresentationKt {
    public static final AKH<AssistVoicePresentation> LocalAssistVoicePresentation = AnonymousClass002.A0L(AssistVoicePresentationKt$LocalAssistVoicePresentation$1.INSTANCE);
    public static final C28s reverseVoiceEasing = new C28s() { // from class: com.facebook.aura.assist.AssistVoicePresentationKt$reverseVoiceEasing$1
        @Override // X.C28s
        public final float transform(float f) {
            return 1.0f - C2HU.A01.transform(1.0f - f);
        }
    };

    /* renamed from: com.facebook.aura.assist.AssistVoicePresentationKt$AssistIdentityPlaceholder$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AssistVoicePresentation $presentation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AssistVoicePresentation assistVoicePresentation, BRg bRg, int i, int i2) {
            super(2);
            this.$presentation = assistVoicePresentation;
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
            AssistVoicePresentationKt.AssistIdentityPlaceholder(this.$presentation, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.assist.AssistVoicePresentationKt$animateBounds$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AOB<Boolean>, BFM, Integer, AOe<AaC>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(3);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ AOe<AaC> invoke(AOB<Boolean> aob, BFM bfm, Integer num) {
            return invoke(aob, bfm, AnonymousClass001.A0F(num));
        }

        public final AOe<AaC> invoke(AOB<Boolean> aob, BFM bfm, int i) {
            C28s c28s;
            AOe<AaC> aSj;
            C7384Etj.A0Y(aob, 0);
            bfm.AgE(-1794986006);
            if (!AnonymousClass001.A1X(aob.AGR()) && !AnonymousClass001.A1X(aob.ALW())) {
                aSj = new ASk<>();
            } else {
                if (AnonymousClass001.A1X(aob.ALW())) {
                    c28s = C2HU.A01;
                } else {
                    c28s = AssistVoicePresentationKt.reverseVoiceEasing;
                }
                aSj = new ASj<>(c28s, 350, 0);
            }
            AOe<AaC> aOe = aSj;
            AnonymousClass001.A1D(bfm);
            return aOe;
        }
    }

    /* renamed from: com.facebook.aura.assist.AssistVoicePresentationKt$assistAnimatedBounds$2, reason: invalid class name and case insensitive filesystem */
    public final class C109532 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
        public final /* synthetic */ C1BO<AaC> $bounds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109532(C1BO<AaC> c1bo) {
            super(1);
            this.$bounds = c1bo;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
            return new C2ae(m266invokeBjo55l4(axn));
        }

        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
        public final long m266invokeBjo55l4(AXN axn) {
            AaC value = this.$bounds.getValue();
            return AnonymousClass007.A0C(Ab3.A01(value.A01), Ab3.A01(value.A03));
        }
    }

    /* renamed from: com.facebook.aura.assist.AssistVoicePresentationKt$assistAnimatedBounds$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
        public final /* synthetic */ C1BO<AaC> $bounds;
        public final /* synthetic */ boolean $matchHeight;
        public final /* synthetic */ Function0<Boolean> $visible;

        /* renamed from: com.facebook.aura.assist.AssistVoicePresentationKt$assistAnimatedBounds$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
            public final /* synthetic */ AZE $child;
            public final /* synthetic */ Function0<Boolean> $visible;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AYU ayu) {
                C7384Etj.A0Y(ayu, 0);
                if (AnonymousClass003.A1Y(this.$visible)) {
                    ayu.A0A(this.$child, 0.0f, 0, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Function0<Boolean> function0, AZE aze) {
                super(1);
                this.$visible = function0;
                this.$child = aze;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                invoke2(ayu);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C1BO<AaC> c1bo, boolean z, Function0<Boolean> function0) {
            super(3);
            this.$bounds = c1bo;
            this.$matchHeight = z;
            this.$visible = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
            return m267invoke3p2s80s(axy, c3tg, constraints.A00);
        }

        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final InterfaceC1134Abi m267invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
            boolean zA1b = AnonymousClass004.A1b(axy, c3tg);
            AaC value = this.$bounds.getValue();
            int i = 0;
            int iA04 = ATD.A04(Ab3.A01(value.A02 - value.A01), zA1b ? 1 : 0, Constraints.A01(j));
            int iA01 = Ab3.A01(value.A00 - value.A03);
            int iA00 = Constraints.A00(j);
            int iA042 = ATD.A04(iA01, zA1b ? 1 : 0, iA00);
            if (this.$matchHeight) {
                i = iA042;
            } else {
                iA042 = iA00;
            }
            AZE azeAQW = c3tg.AQW(AYL.A05(iA04, iA04, i, iA042));
            return AnonymousClass002.A0X(axy, new AnonymousClass1(this.$visible, azeAQW), azeAQW.A01, azeAQW.A00);
        }
    }

    public static final void AssistIdentityPlaceholder(AssistVoicePresentation assistVoicePresentation, BRg bRg, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(assistVoicePresentation, 0);
        bfm.AgG(-988775076);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, assistVoicePresentation) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BRg bRgA04 = C10G.A04(AnonymousClass001.A0R(bRg), C1DG.A04(new C1DG(AnonymousClass002.A0Y(bfm).Agy(((AssistIdentityState) bfm.A6v(AssistIdentityStateKt.LocalAssistIdentityState)).getIdentityHeight())), 40.0f).A00);
            boolean zA1L = AnonymousClass001.A1L(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1L || objAaT == C78N.A00) {
                objAaT = new AssistVoicePresentationKt$AssistIdentityPlaceholder$1$1(assistVoicePresentation);
                bfm.Ai0(objAaT);
            }
            C01N.A07(bfm, AnonymousClass003.A0V(bRgA04, objAaT));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(assistVoicePresentation, bRg, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C1BO<AaC> animateBounds(AssistVoicePresentation assistVoicePresentation, AaC aaC, AaC aaC2, String str, BFM bfm, int i) {
        BBI bbiA0M;
        Object objA09;
        C7384Etj.A0Y(assistVoicePresentation, 0);
        AnonymousClass005.A11(aaC, aaC2, str, 1);
        final AOP<Boolean> aop = assistVoicePresentation.transition;
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        C31w<AaC, AT9> c31w = AVd.A07;
        int i2 = (((i >> 3) & 896) << 3) & 7168;
        if (aop.A0G()) {
            bbiA0M = AnonymousClass002.A0M(bfm, 1666827533);
            objA09 = aop.A02.A09();
        } else {
            boolean zA1Y = AnonymousClass001.A1Y(aop, bfm, 1666573488);
            objA09 = bfm.AaT();
            if (zA1Y || objA09 == C78N.A00) {
                Snapshot snapshotA03 = Snapshot.A03();
                G0U<Object, Unit> g0uA0D = snapshotA03 != null ? snapshotA03.A0D() : null;
                Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
                try {
                    objA09 = AnonymousClass007.A0S(aop, bfm, snapshotA03, snapshotA04, g0uA0D);
                } catch (Throwable th) {
                    Snapshot.A07(snapshotA03, snapshotA04, g0uA0D);
                    throw th;
                }
            }
            bbiA0M = (BBI) bfm;
            BBI.A0R(bbiA0M, false);
        }
        boolean zA1X = AnonymousClass001.A1X(objA09);
        bfm.AgE(-90952347);
        AaC aaC3 = aaC;
        if (zA1X) {
            aaC3 = aaC2;
        }
        BBI.A0R(bbiA0M, false);
        boolean zA65 = bfm.A65(aop);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = AnonymousClass003.A0R(bfm, new Function0<Boolean>() { // from class: com.facebook.aura.assist.AssistVoicePresentationKt$animateBounds$$inlined$animateRect$1
                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return aop.A07.getValue();
                }
            });
        }
        boolean zA0F = C1BO.A0F((C1BO) objAaT);
        bfm.AgE(-90952347);
        if (zA0F) {
            aaC = aaC2;
        }
        BBI.A0R(bbiA0M, false);
        boolean zA652 = bfm.A65(aop);
        Object objAaT2 = bfm.AaT();
        if (zA652 || objAaT2 == C78N.A00) {
            objAaT2 = AnonymousClass003.A0R(bfm, new Function0<AOB<Boolean>>() { // from class: com.facebook.aura.assist.AssistVoicePresentationKt$animateBounds$$inlined$animateRect$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final AOB<Boolean> invoke() {
                    return aop.A03();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ AOB<Boolean> invoke() {
                    return aop.A03();
                }
            });
        }
        return AOR.A01(anonymousClass1.invoke((AOB<Boolean>) ((C1BO) objAaT2).getValue(), bfm, (Integer) 0), aop, c31w, bfm, aaC3, aaC, (i2 << 6) & 458752);
    }

    public static final BRg assistComposerInteraction(BRg bRg, boolean z) {
        C7384Etj.A0Y(bRg, 0);
        if (z) {
            return bRg;
        }
        return AaM.A00(ARD.A00(bRg, C109541.INSTANCE), new PointerInputEventHandler() { // from class: com.facebook.aura.assist.AssistVoicePresentationKt.assistComposerInteraction.2

            @DebugMetadata(c = "com.facebook.aura.assist.AssistVoicePresentationKt$assistComposerInteraction$2$1", f = "AssistVoicePresentation.kt", l = {MinidumpReader.MODULE_FULL_SIZE}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.assist.AssistVoicePresentationKt$assistComposerInteraction$2$1, reason: invalid class name */
            public final class AnonymousClass1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                public /* synthetic */ Object L$0;
                public int label;

                public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[LOOP:0: B:7:0x0018->B:9:0x001e, LOOP_END] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002f -> B:6:0x0010). Please report as a decompilation issue!!! */
                @Override // X.AbstractC8884Fsp
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                    /*
                        r5 = this;
                        java.lang.Object r4 = r5.L$0
                        X.AXb r4 = (X.InterfaceC1074AXb) r4
                        X.Hji r3 = X.EnumC10460Hji.A02
                        int r0 = r5.label
                        r2 = 1
                        if (r0 == 0) goto L22
                        if (r0 != r2) goto L32
                        X.Hwg.A00(r6)
                    L10:
                        X.Afe r6 = (X.C1247Afe) r6
                        java.util.List<X.Agk> r0 = r6.A05
                        java.util.Iterator r1 = r0.iterator()
                    L18:
                        boolean r0 = r1.hasNext()
                        if (r0 == 0) goto L25
                        X.AnonymousClass006.A1S(r1)
                        goto L18
                    L22:
                        X.Hwg.A00(r6)
                    L25:
                        X.AXj r0 = X.EnumC1080AXj.A03
                        r5.L$0 = r4
                        r5.label = r2
                        java.lang.Object r6 = r4.A4z(r0, r5)
                        if (r6 != r3) goto L10
                        return r3
                    L32:
                        java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.AssistVoicePresentationKt.C109552.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // X.G0V
                public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                    anonymousClass1.L$0 = interfaceC1074AXb;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                Object objA50 = bRr.A50(new AnonymousClass1(null), htJ);
                return objA50 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA50;
            }
        }, Unit.INSTANCE);
    }

    /* renamed from: com.facebook.aura.assist.AssistVoicePresentationKt$assistAnimatedBounds$1, reason: invalid class name and case insensitive filesystem */
    public final class C109521 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final C109521 INSTANCE = new C109521();

        public C109521() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0i();
        }
    }

    public static final AKH<AssistVoicePresentation> getLocalAssistVoicePresentation() {
        return LocalAssistVoicePresentation;
    }

    /* renamed from: com.facebook.aura.assist.AssistVoicePresentationKt$assistComposerInteraction$1, reason: invalid class name and case insensitive filesystem */
    public final class C109541 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
        public static final C109541 INSTANCE = new C109541();

        public C109541() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        }
    }

    public static final BRg assistAnimatedBounds(BRg bRg, C1BO<AaC> c1bo, boolean z, Function0<Boolean> function0) {
        AnonymousClass005.A0y(bRg, c1bo, function0);
        return C3UC.A00(AYD.A02(bRg, new C109532(c1bo)), new AnonymousClass3(c1bo, z, function0));
    }

    public static /* synthetic */ BRg assistAnimatedBounds$default(BRg bRg, C1BO c1bo, boolean z, Function0 function0, int i, Object obj) {
        boolean zA1Q = AnonymousClass001.A1Q(i, z);
        if ((i & 4) != 0) {
            function0 = C109521.INSTANCE;
        }
        return assistAnimatedBounds(bRg, c1bo, zA1Q, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AssistVoicePresentation rememberAssistVoicePresentation(boolean z, BFM bfm, int i) {
        BBI bbiA0M;
        Object objA09;
        final AOP aopA04 = AOR.A04(bfm, Boolean.valueOf(z), "assistantVoice", (i & 14) | 48);
        AssistVoicePresentationKt$rememberAssistVoicePresentation$progress$1 assistVoicePresentationKt$rememberAssistVoicePresentation$progress$1 = AssistVoicePresentationKt$rememberAssistVoicePresentation$progress$1.INSTANCE;
        C31w<Float, AOW> c31w = AVd.A02;
        if (aopA04.A0G()) {
            bbiA0M = AnonymousClass002.A0M(bfm, 1666827533);
            objA09 = aopA04.A02.A09();
        } else {
            boolean zA1Y = AnonymousClass001.A1Y(aopA04, bfm, 1666573488);
            objA09 = bfm.AaT();
            if (zA1Y || objA09 == C78N.A00) {
                Snapshot snapshotA03 = Snapshot.A03();
                G0U<Object, Unit> g0uA0D = snapshotA03 != null ? snapshotA03.A0D() : null;
                Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
                try {
                    objA09 = AnonymousClass007.A0S(aopA04, bfm, snapshotA03, snapshotA04, g0uA0D);
                } catch (Throwable th) {
                    Snapshot.A07(snapshotA03, snapshotA04, g0uA0D);
                    throw th;
                }
            }
            bbiA0M = (BBI) bfm;
            BBI.A0R(bbiA0M, false);
        }
        boolean zA1X = AnonymousClass001.A1X(objA09);
        bfm.AgE(-119803925);
        Float fA0b = AnonymousClass005.A0b(bbiA0M, AnonymousClass006.A00(zA1X ? 1 : 0));
        boolean zA65 = bfm.A65(aopA04);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = AnonymousClass003.A0R(bfm, new Function0<Boolean>() { // from class: com.facebook.aura.assist.AssistVoicePresentationKt$rememberAssistVoicePresentation$$inlined$animateFloat$1
                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return aopA04.A07.getValue();
                }
            });
        }
        boolean zA0F = C1BO.A0F((C1BO) objAaT);
        bfm.AgE(-119803925);
        Float fA0b2 = AnonymousClass005.A0b(bbiA0M, zA0F ? 1.0f : 0.0f);
        boolean zA652 = bfm.A65(aopA04);
        Object objAaT2 = bfm.AaT();
        if (zA652 || objAaT2 == C78N.A00) {
            objAaT2 = AnonymousClass003.A0R(bfm, new Function0<AOB<Boolean>>() { // from class: com.facebook.aura.assist.AssistVoicePresentationKt$rememberAssistVoicePresentation$$inlined$animateFloat$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final AOB<Boolean> invoke() {
                    return aopA04.A03();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ AOB<Boolean> invoke() {
                    return aopA04.A03();
                }
            });
        }
        AOQ aoqA01 = AOR.A01(assistVoicePresentationKt$rememberAssistVoicePresentation$progress$1.invoke((AOB<Boolean>) ((C1BO) objAaT2).getValue(), bfm, (Integer) 0), aopA04, c31w, bfm, fA0b, fA0b2, 196608);
        boolean zA653 = bfm.A65(aopA04);
        Object objAaT3 = bfm.AaT();
        if (zA653 || objAaT3 == C78N.A00) {
            objAaT3 = new AssistVoicePresentation(aopA04, aoqA01);
            bfm.Ai0(objAaT3);
        }
        return (AssistVoicePresentation) objAaT3;
    }
}
