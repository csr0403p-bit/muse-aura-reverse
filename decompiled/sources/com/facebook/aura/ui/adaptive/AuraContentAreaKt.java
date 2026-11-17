package com.facebook.aura.ui.adaptive;

import X.AKH;
import X.AKQ;
import X.ATD;
import X.AXQ;
import X.AXY;
import X.AYL;
import X.AYU;
import X.AZE;
import X.AaC;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C16n;
import X.C1DG;
import X.C3TF;
import X.C3TG;
import X.C3Tr;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.EnumC1820Arj;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1134Abi;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraContentAreaKt {
    public static final AKH<C1DG> LocalAuraContentAreaStartInset = AnonymousClass002.A0L(AuraContentAreaKt$LocalAuraContentAreaStartInset$1.INSTANCE);

    /* renamed from: com.facebook.aura.ui.adaptive.AuraContentAreaKt$AuraContentArea$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ float $startInset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, float f) {
            super(2);
            this.$content = g0v;
            this.$modifier = bRg;
            this.$startInset = f;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                G0V<BFM, Integer, Unit> g0v = this.$content;
                BRg bRg = this.$modifier;
                boolean zA62 = bfm.A62(this.$startInset);
                final float f = this.$startInset;
                Object objAaT = bfm.AaT();
                if (zA62 || objAaT == C78N.A00) {
                    objAaT = new InterfaceC1380AiA() { // from class: com.facebook.aura.ui.adaptive.AuraContentAreaKt$AuraContentArea$1$1$1

                        /* renamed from: com.facebook.aura.ui.adaptive.AuraContentAreaKt$AuraContentArea$1$1$1$1, reason: invalid class name */
                        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
                            public final /* synthetic */ int $insetPx;
                            public final /* synthetic */ List<AZE> $placeables;

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(AYU ayu) {
                                C7384Etj.A0Y(ayu, 0);
                                List<AZE> list = this.$placeables;
                                int i = this.$insetPx;
                                int size = list.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    AYU.A04(ayu, list.get(i2), i, 0);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public AnonymousClass1(List<? extends AZE> list, int i) {
                                super(1);
                                this.$placeables = list;
                                this.$insetPx = i;
                            }

                            @Override // X.G0U
                            public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                                invoke2(ayu);
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
                        @Override // X.InterfaceC1380AiA
                        /* renamed from: measure-3p2s80s */
                        public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
                            int iIntValue;
                            ?? A1a = AnonymousClass002.A1a(axy, list);
                            boolean zA0A = Constraints.A0A(j);
                            int iIntValue2 = 0;
                            int iAbr = axy.Abr(f);
                            if (zA0A) {
                                iAbr = ATD.A04(iAbr, 0, Constraints.A01(j));
                            } else if (iAbr < 0) {
                                iAbr = 0;
                            }
                            ArrayList arrayList = new ArrayList(list.size());
                            int size = list.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                arrayList.add(list.get(i2).AQW(AYL.A08(j, -iAbr, 0)));
                            }
                            int i3 = 1;
                            if (arrayList.isEmpty()) {
                                iIntValue = 0;
                            } else {
                                Integer numValueOf = Integer.valueOf(((AZE) arrayList.get(0)).A01);
                                int size2 = arrayList.size() - 1;
                                if (A1a <= size2) {
                                    int i4 = 1;
                                    while (true) {
                                        Integer numValueOf2 = Integer.valueOf(((AZE) arrayList.get(i4)).A01);
                                        if (numValueOf2.compareTo(numValueOf) > 0) {
                                            numValueOf = numValueOf2;
                                        }
                                        if (i4 == size2) {
                                            break;
                                        }
                                        i4++;
                                    }
                                }
                                iIntValue = numValueOf.intValue();
                            }
                            int iA02 = AYL.A02(j, iIntValue + iAbr);
                            if (!arrayList.isEmpty()) {
                                Integer numValueOf3 = Integer.valueOf(((AZE) arrayList.get(0)).A00);
                                int size3 = arrayList.size() - 1;
                                if (A1a <= size3) {
                                    while (true) {
                                        Integer numValueOf4 = Integer.valueOf(((AZE) arrayList.get(i3)).A00);
                                        if (numValueOf4.compareTo(numValueOf3) > 0) {
                                            numValueOf3 = numValueOf4;
                                        }
                                        if (i3 == size3) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                                iIntValue2 = numValueOf3.intValue();
                            }
                            return AnonymousClass002.A0X(axy, new AnonymousClass1(arrayList, iAbr), iA02, AYL.A01(j, iIntValue2));
                        }

                        @Override // X.InterfaceC1380AiA
                        public /* bridge */ int maxIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i2) {
                            return AXQ.A00(c3tf, this, list, i2);
                        }

                        @Override // X.InterfaceC1380AiA
                        public /* bridge */ int maxIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i2) {
                            return AXQ.A01(c3tf, this, list, i2);
                        }

                        @Override // X.InterfaceC1380AiA
                        public /* bridge */ int minIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i2) {
                            return AXQ.A02(c3tf, this, list, i2);
                        }

                        @Override // X.InterfaceC1380AiA
                        public /* bridge */ int minIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i2) {
                            return AXQ.A03(c3tf, this, list, i2);
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
                AnonymousClass001.A1H(bfm, g0v, 0);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.ui.adaptive.AuraContentAreaKt$AuraContentArea$2, reason: invalid class name */
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

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraContentAreaKt.AuraContentArea(this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AuraContentArea(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(g0v, 1);
        bfm.AgG(-1963498774);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            float fA00 = C1DG.A00(bfm, LocalAuraContentAreaStartInset);
            AuraLayoutSizeKt.m2363ProvideAuraLayoutSizeUBP6k7g(C16n.A00(AuraLayoutSizeKt.auraLayoutWidth(bfm, 0) - fA00, AuraLayoutSizeKt.auraLayoutHeight(bfm, 0)), B1V.A00(bfm, new AnonymousClass1(g0v, bRg, fA00), -1629827283), bfm, 48);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg, g0v, i, i2);
        }
    }

    /* renamed from: ProvideAuraContentArea-kHDZbjc, reason: not valid java name */
    public static final void m2356ProvideAuraContentAreakHDZbjc(float f, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        C7384Etj.A0Y(g0v, 1);
        bfm.AgG(447788624);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA04), bfm, iA04)) {
            AnonymousClass001.A14(bfm, C1DG.A02(LocalAuraContentAreaStartInset, f), g0v, iA04);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraContentAreaKt$ProvideAuraContentArea$1(f, g0v, i);
        }
    }

    public static final AaC auraContentAreaInWindow(BFM bfm, int i) {
        long jAuraWindowContainerSize = AuraLayoutSizeKt.auraWindowContainerSize(bfm, 0);
        bfm.AgE(-607272543);
        float fAh4 = AnonymousClass002.A0Y(bfm).Ah4(C1DG.A00(bfm, LocalAuraContentAreaStartInset));
        AnonymousClass001.A1D(bfm);
        float f = (int) (jAuraWindowContainerSize >> 32);
        float fA09 = AnonymousClass002.A09(jAuraWindowContainerSize);
        if (bfm.A6v(Am0.A0A) != EnumC1820Arj.A03) {
            if (fAh4 > f) {
                fAh4 = f;
            }
            return new AaC(fAh4, 0.0f, f, fA09);
        }
        float f2 = f - fAh4;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        return new AaC(0.0f, 0.0f, f2, fA09);
    }

    public static final BRg auraContentAreaPadding(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        float fA00 = C1DG.A00(bfm, LocalAuraContentAreaStartInset);
        return C1DG.A01(fA00, 0.0f) > 0 ? C3U4.A0C(bRg, fA00, 0.0f, 0.0f, 0.0f) : bRg;
    }
}
