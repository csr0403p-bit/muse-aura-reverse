package com.facebook.aura.header.view;

import X.AGO;
import X.AIC;
import X.AKH;
import X.AKQ;
import X.AXQ;
import X.AXY;
import X.AYL;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BCM;
import X.BFM;
import X.BLU;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C1BO;
import X.C1HY;
import X.C1er;
import X.C2Jb;
import X.C2VU;
import X.C2ae;
import X.C3TF;
import X.C3TG;
import X.C3TH;
import X.C3Tr;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1134Abi;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchFloatingChromeGeometry;
import com.facebook.aura.ui.HatchFloatingChromeGeometryKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchForegroundHeaderKt {
    public static final AKH<HatchForegroundHeaderState> LocalHatchForegroundHeaderState = new AGO(HatchForegroundHeaderKt$LocalHatchForegroundHeaderState$1.INSTANCE);
    public static final Function0<C2ae> NoObstacleOffset = HatchForegroundHeaderKt$NoObstacleOffset$1.INSTANCE;

    /* renamed from: com.facebook.aura.header.view.HatchForegroundHeaderKt$ForegroundHeaderContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ForegroundHeaderSlot $slot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ForegroundHeaderSlot foregroundHeaderSlot, BRg bRg, int i, int i2) {
            super(2);
            this.$slot = foregroundHeaderSlot;
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
            HatchForegroundHeaderKt.ForegroundHeaderContent(this.$slot, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.header.view.HatchForegroundHeaderKt$HatchForegroundHeaderHost$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
            super(2);
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
            HatchForegroundHeaderKt.HatchForegroundHeaderHost(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.header.view.HatchForegroundHeaderKt$HatchForegroundHeaderHost$3, reason: invalid class name and case insensitive filesystem */
    public final class C121943 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121943(BRg bRg, int i, int i2) {
            super(2);
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
            HatchForegroundHeaderKt.HatchForegroundHeaderHost(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.header.view.HatchForegroundHeaderKt$HatchForegroundHeaderSlot$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ C3TH $horizontalAlignment;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $trackBounds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(BRg bRg, boolean z, C3TH c3th, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$trackBounds = z;
            this.$horizontalAlignment = c3th;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchForegroundHeaderKt.HatchForegroundHeaderSlot(this.$modifier, this.$trackBounds, this.$horizontalAlignment, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.header.view.HatchForegroundHeaderKt$HatchForegroundHeaderSlot$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ C3TH $horizontalAlignment;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $trackBounds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(BRg bRg, boolean z, C3TH c3th, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$trackBounds = z;
            this.$horizontalAlignment = c3th;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchForegroundHeaderKt.HatchForegroundHeaderSlot(this.$modifier, this.$trackBounds, this.$horizontalAlignment, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchForegroundHeaderSlot(BRg bRg, boolean z, C3TH c3th, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass7;
        BRg bRg2 = bRg;
        boolean z2 = z;
        C3TH c3th2 = c3th;
        C7384Etj.A0Y(g0v, 3);
        bfm.AgG(-952395832);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c3th2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            if (i5 != 0) {
                c3th2 = C2VU.A02;
            }
            HatchForegroundHeaderState hatchForegroundHeaderState = (HatchForegroundHeaderState) bfm.A6v(LocalHatchForegroundHeaderState);
            if (hatchForegroundHeaderState == null) {
                bfm.AgE(-269996129);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRg2);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                    AnonymousClass005.A0q(bbi, bfm, g0v, iA0d >> 9);
                    bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                    if (bBbAAc != null) {
                        anonymousClass7 = new AnonymousClass2(bRg2, z2, c3th2, g0v, i, i2);
                        bBbAAc.A06 = anonymousClass7;
                    }
                    return;
                }
            } else {
                BBI bbiA0M = AnonymousClass002.A0M(bfm, -269939430);
                C1HY c1hy = (C1HY) bfm.A6v(AIC.A00);
                MutableState mutableStateA00 = C1er.A00(bfm, g0v);
                MutableState mutableStateA002 = C1er.A00(bfm, new C2Jb(bfm.A5U().A0I()));
                boolean zA1D = AnonymousClass003.A1D(iA0d) | bfm.A65(c1hy);
                Object objAaT = bfm.AaT();
                if (zA1D || objAaT == C78N.A00) {
                    objAaT = new ForegroundHeaderSlot(c1hy, c3th2, BCM.A00(AnonymousClass001.A0M(new HatchForegroundHeaderKt$HatchForegroundHeaderSlot$slot$1$1(mutableStateA002, new HatchForegroundHeaderKt$HatchForegroundHeaderSlot$slot$1$inPageObstacleOffset$1(hatchForegroundHeaderState), mutableStateA00), 1268357196)));
                    bfm.Ai0(objAaT);
                }
                final ForegroundHeaderSlot foregroundHeaderSlot = (ForegroundHeaderSlot) objAaT;
                HatchFloatingChromeGeometry hatchFloatingChromeGeometry = (HatchFloatingChromeGeometry) bfm.A6v(HatchFloatingChromeGeometryKt.LocalHatchFloatingChromeGeometry);
                Object[] objArr = {hatchForegroundHeaderState, foregroundHeaderSlot, hatchFloatingChromeGeometry, Boolean.valueOf(z2)};
                boolean zA1S = AnonymousClass004.A1S(bfm, foregroundHeaderSlot, c1hy, bfm.A65(hatchForegroundHeaderState));
                int i6 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
                boolean zA1W = AnonymousClass002.A1W(bfm, hatchFloatingChromeGeometry, zA1S, AnonymousClass003.A18(i6));
                Object objAaT2 = bfm.AaT();
                if (zA1W || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchForegroundHeaderKt$HatchForegroundHeaderSlot$3$1(hatchForegroundHeaderState, foregroundHeaderSlot, c1hy, z2, hatchFloatingChromeGeometry);
                    bfm.Ai0(objAaT2);
                }
                C78e.A07(bfm, (G0U) objAaT2, objArr);
                final boolean zIsElevated$fbandroid_express_aura_java_com_facebook_aura_header_view_view = hatchForegroundHeaderState.isElevated$fbandroid_express_aura_java_com_facebook_aura_header_view_view(foregroundHeaderSlot);
                boolean zA1W2 = AnonymousClass002.A1W(bfm, hatchFloatingChromeGeometry, AnonymousClass003.A1K(bfm, hatchForegroundHeaderState, foregroundHeaderSlot), i6 == 32);
                Object objAaT3 = bfm.AaT();
                if (zA1W2 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchForegroundHeaderKt$HatchForegroundHeaderSlot$5$1(hatchForegroundHeaderState, foregroundHeaderSlot, z2, hatchFloatingChromeGeometry);
                    bfm.Ai0(objAaT3);
                }
                BRg bRgA0V = AnonymousClass003.A0V(bRg2, objAaT3);
                boolean zA1T = AnonymousClass003.A1T(bfm, foregroundHeaderSlot, zIsElevated$fbandroid_express_aura_java_com_facebook_aura_header_view_view);
                Object objAaT4 = bfm.AaT();
                if (zA1T || objAaT4 == C78N.A00) {
                    objAaT4 = new InterfaceC1380AiA() { // from class: com.facebook.aura.header.view.HatchForegroundHeaderKt$HatchForegroundHeaderSlot$6$1

                        /* renamed from: com.facebook.aura.header.view.HatchForegroundHeaderKt$HatchForegroundHeaderSlot$6$1$3, reason: invalid class name */
                        public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<AYU, Unit> {
                            public final /* synthetic */ List<AZE> $placeables;

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(AYU ayu) {
                                C7384Etj.A0Y(ayu, 0);
                                Iterator<AZE> it = this.$placeables.iterator();
                                while (it.hasNext()) {
                                    ayu.A0A(it.next(), 0.0f, 0, 0);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public AnonymousClass3(List<? extends AZE> list) {
                                super(1);
                                this.$placeables = list;
                            }

                            @Override // X.G0U
                            public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                                invoke2(ayu);
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // X.InterfaceC1380AiA
                        public /* bridge */ int maxIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i7) {
                            return AXQ.A00(c3tf, this, list, i7);
                        }

                        @Override // X.InterfaceC1380AiA
                        public /* bridge */ int maxIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i7) {
                            return AXQ.A01(c3tf, this, list, i7);
                        }

                        @Override // X.InterfaceC1380AiA
                        /* renamed from: measure-3p2s80s */
                        public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
                            boolean zA1b = AnonymousClass004.A1b(axy, list);
                            foregroundHeaderSlot.m983setConstraintsBRTryo0(Constraints.A05(zA1b ? 1 : 0, Constraints.A01(j), zA1b ? 1 : 0, Constraints.A00(j)));
                            ForegroundHeaderSlot foregroundHeaderSlot2 = foregroundHeaderSlot;
                            ArrayList arrayListA0m = AnonymousClass002.A0m(list);
                            Iterator<? extends C3TG> it = list.iterator();
                            while (it.hasNext()) {
                                arrayListA0m.add(it.next().AQW(foregroundHeaderSlot2.m981getConstraintsmsEJaDk()));
                            }
                            if (!zIsElevated$fbandroid_express_aura_java_com_facebook_aura_header_view_view) {
                                ForegroundHeaderSlot foregroundHeaderSlot3 = foregroundHeaderSlot;
                                Iterator it2 = arrayListA0m.iterator();
                                Integer numValueOf = null;
                                if (it2.hasNext()) {
                                    numValueOf = Integer.valueOf(((AZE) it2.next()).A01);
                                    while (it2.hasNext()) {
                                        Integer numValueOf2 = Integer.valueOf(((AZE) it2.next()).A01);
                                        if (numValueOf.compareTo(numValueOf2) < 0) {
                                            numValueOf = numValueOf2;
                                        }
                                    }
                                }
                                int iIntValue = 0;
                                int iIntValue2 = numValueOf != null ? numValueOf.intValue() : 0;
                                Iterator it3 = arrayListA0m.iterator();
                                if (it3.hasNext()) {
                                    Integer numValueOf3 = Integer.valueOf(((AZE) it3.next()).A00);
                                    while (it3.hasNext()) {
                                        Integer numValueOf4 = Integer.valueOf(((AZE) it3.next()).A00);
                                        if (numValueOf3.compareTo(numValueOf4) < 0) {
                                            numValueOf3 = numValueOf4;
                                        }
                                    }
                                    iIntValue = numValueOf3.intValue();
                                }
                                foregroundHeaderSlot3.m984setSizeozmzZPI((iIntValue & 4294967295L) | (iIntValue2 << 32));
                            }
                            return AnonymousClass002.A0X(axy, new AnonymousClass3(arrayListA0m), AYL.A02(j, (int) (foregroundHeaderSlot.m982getSizeYbymL2g() >> 32)), AYL.A01(j, (int) (4294967295L & foregroundHeaderSlot.m982getSizeYbymL2g())));
                        }

                        @Override // X.InterfaceC1380AiA
                        public /* bridge */ int minIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i7) {
                            return AXQ.A02(c3tf, this, list, i7);
                        }

                        @Override // X.InterfaceC1380AiA
                        public /* bridge */ int minIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i7) {
                            return AXQ.A03(c3tf, this, list, i7);
                        }
                    };
                    bfm.Ai0(objAaT4);
                }
                int iA0J2 = AnonymousClass003.A0J(bbiA0M);
                AKQ akqA042 = BBI.A04(bbiA0M);
                BRg bRgA012 = AxM.A01(bfm, bRgA0V);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbiA0M.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbiA0M, function02);
                    AnonymousClass005.A0p(bfm, objAaT4, akqA042, bRgA012, iA0J2);
                    if (zIsElevated$fbandroid_express_aura_java_com_facebook_aura_header_view_view) {
                        bfm.AgE(-1605203663);
                    } else {
                        bfm.AgE(363860799);
                        AnonymousClass001.A1G(false, bfm, foregroundHeaderSlot.content, 6);
                    }
                    AnonymousClass003.A0q(bbiA0M);
                }
            }
            C00x.A00();
            throw F60.createAndThrow();
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass7 = new AnonymousClass7(bRg2, z2, c3th2, g0v, i, i2);
            bBbAAc.A06 = anonymousClass7;
        }
    }

    public static final AKH<HatchForegroundHeaderState> getLocalHatchForegroundHeaderState() {
        return LocalHatchForegroundHeaderState;
    }

    public static final void ForegroundHeaderContent(final ForegroundHeaderSlot foregroundHeaderSlot, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-332648108);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, foregroundHeaderSlot) | i : i;
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
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new InterfaceC1380AiA() { // from class: com.facebook.aura.header.view.HatchForegroundHeaderKt$ForegroundHeaderContent$2$1

                    /* renamed from: com.facebook.aura.header.view.HatchForegroundHeaderKt$ForegroundHeaderContent$2$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
                        public final /* synthetic */ List<AZE> $placeables;
                        public final /* synthetic */ long $size;
                        public final /* synthetic */ ForegroundHeaderSlot $slot;
                        public final /* synthetic */ AXY $this_Layout;

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(AYU ayu) {
                            C7384Etj.A0Y(ayu, 0);
                            int i = this.$slot.getBounds().A01;
                            ForegroundHeaderSlot foregroundHeaderSlot = this.$slot;
                            C3TH c3th = foregroundHeaderSlot.horizontalAlignment;
                            int i2 = (int) (this.$size >> 32);
                            BLU bounds = foregroundHeaderSlot.getBounds();
                            int iA4E = i + c3th.A4E(this.$this_Layout.getLayoutDirection(), i2, Math.max(bounds.A02 - bounds.A01, (int) (this.$size >> 32)));
                            List<AZE> list = this.$placeables;
                            ForegroundHeaderSlot foregroundHeaderSlot2 = this.$slot;
                            Iterator<AZE> it = list.iterator();
                            while (it.hasNext()) {
                                ayu.A0A(it.next(), 0.0f, iA4E, foregroundHeaderSlot2.getBounds().A03);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public AnonymousClass1(ForegroundHeaderSlot foregroundHeaderSlot, long j, AXY axy, List<? extends AZE> list) {
                            super(1);
                            this.$slot = foregroundHeaderSlot;
                            this.$size = j;
                            this.$this_Layout = axy;
                            this.$placeables = list;
                        }

                        @Override // X.G0U
                        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                            invoke2(ayu);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // X.InterfaceC1380AiA
                    /* renamed from: measure-3p2s80s */
                    public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
                        AnonymousClass003.A0u(axy, list);
                        long jM981getConstraintsmsEJaDk = foregroundHeaderSlot.m981getConstraintsmsEJaDk();
                        int iA01 = Constraints.A01(foregroundHeaderSlot.m981getConstraintsmsEJaDk());
                        int iA012 = Constraints.A01(j);
                        int iMin = Math.min(iA01, iA012);
                        int iA00 = Constraints.A00(foregroundHeaderSlot.m981getConstraintsmsEJaDk());
                        int iA002 = Constraints.A00(j);
                        long jA05 = Constraints.A05(Constraints.A03(jM981getConstraintsmsEJaDk), iMin, Constraints.A02(jM981getConstraintsmsEJaDk), Math.min(iA00, iA002));
                        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                        Iterator<? extends C3TG> it = list.iterator();
                        while (it.hasNext()) {
                            arrayListA0i.add(it.next().AQW(jA05));
                        }
                        Iterator it2 = arrayListA0i.iterator();
                        Integer numValueOf = null;
                        if (it2.hasNext()) {
                            numValueOf = Integer.valueOf(((AZE) it2.next()).A01);
                            while (it2.hasNext()) {
                                Integer numValueOf2 = Integer.valueOf(((AZE) it2.next()).A01);
                                if (numValueOf.compareTo(numValueOf2) < 0) {
                                    numValueOf = numValueOf2;
                                }
                            }
                        }
                        int iIntValue = 0;
                        int iIntValue2 = numValueOf != null ? numValueOf.intValue() : 0;
                        Iterator it3 = arrayListA0i.iterator();
                        if (it3.hasNext()) {
                            Integer numValueOf3 = Integer.valueOf(((AZE) it3.next()).A00);
                            while (it3.hasNext()) {
                                Integer numValueOf4 = Integer.valueOf(((AZE) it3.next()).A00);
                                if (numValueOf3.compareTo(numValueOf4) < 0) {
                                    numValueOf3 = numValueOf4;
                                }
                            }
                            iIntValue = numValueOf3.intValue();
                        }
                        long jA0G = AnonymousClass002.A0G(iIntValue, iIntValue2 << 32);
                        foregroundHeaderSlot.m984setSizeozmzZPI(jA0G);
                        return AnonymousClass002.A0X(axy, new AnonymousClass1(foregroundHeaderSlot, jA0G, axy, arrayListA0i), iA012, iA002);
                    }

                    @Override // X.InterfaceC1380AiA
                    public /* bridge */ int maxIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i4) {
                        return AXQ.A00(c3tf, this, list, i4);
                    }

                    @Override // X.InterfaceC1380AiA
                    public /* bridge */ int maxIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i4) {
                        return AXQ.A01(c3tf, this, list, i4);
                    }

                    @Override // X.InterfaceC1380AiA
                    public /* bridge */ int minIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i4) {
                        return AXQ.A02(c3tf, this, list, i4);
                    }

                    @Override // X.InterfaceC1380AiA
                    public /* bridge */ int minIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i4) {
                        return AXQ.A03(c3tf, this, list, i4);
                    }
                };
                bfm.Ai0(objAaT);
            }
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, objAaT, akqA04, bRgA01, iA0J);
            AnonymousClass001.A1G(true, bfm, foregroundHeaderSlot.content, 6);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(foregroundHeaderSlot, bRg, i, i2);
        }
    }

    public static final void HatchForegroundHeaderHost(BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c121943;
        bfm.AgG(1415020743);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            HatchForegroundHeaderState hatchForegroundHeaderState = (HatchForegroundHeaderState) bfm.A6v(LocalHatchForegroundHeaderState);
            if (hatchForegroundHeaderState == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    c121943 = new HatchForegroundHeaderKt$HatchForegroundHeaderHost$host$1(bRg, i, i2);
                }
            } else if (C1BO.A0F(hatchForegroundHeaderState.elevated$delegate)) {
                BRg bRgA0T = AnonymousClass001.A0T(bRg);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0T);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                bfm.AgE(-1890702411);
                Iterator it = hatchForegroundHeaderState.slots.iterator();
                while (it.hasNext()) {
                    ForegroundHeaderSlot foregroundHeaderSlot = (ForegroundHeaderSlot) it.next();
                    bfm.Ag8(1410031556, foregroundHeaderSlot);
                    if (hatchForegroundHeaderState.isElevated$fbandroid_express_aura_java_com_facebook_aura_header_view_view(foregroundHeaderSlot)) {
                        bfm.AgE(761350197);
                        ForegroundHeaderContent(foregroundHeaderSlot, null, bfm, 0, 2);
                        BBI.A0R(bbi, false);
                    } else {
                        bfm.AgE(761399208);
                        BBI.A0R(bbi, false);
                    }
                    BBI.A0R(bbi, false);
                }
                AnonymousClass003.A0q(bbi);
            } else {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    c121943 = new AnonymousClass1(bRg, i, i2);
                }
            }
            bBbAAc.A06 = c121943;
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c121943 = new C121943(bRg, i, i2);
            bBbAAc.A06 = c121943;
        }
    }
}
