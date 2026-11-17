package com.facebook.aura.subscription.view;

import X.AEk;
import X.AKQ;
import X.ATD;
import X.AXP;
import X.AXR;
import X.AXY;
import X.AYL;
import X.AYU;
import X.AZE;
import X.AaH;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOI;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C05473bt;
import X.C06G;
import X.C06I;
import X.C10G;
import X.C11U;
import X.C1350Ahb;
import X.C1515AkP;
import X.C1D3;
import X.C1D8;
import X.C2VU;
import X.C3TF;
import X.C3TG;
import X.C3TH;
import X.C3Tr;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C79;
import X.C8j4;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1134Abi;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraSubscriptionUsageMetersKt {

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageMetersKt$LabelValueLine$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, BRg bRg, int i, int i2) {
            super(2);
            this.$label = g0v;
            this.$value = g0v2;
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
            AuraSubscriptionUsageMetersKt.LabelValueLine(this.$label, this.$value, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageMetersKt$UsageMeterRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C142112 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;
        public final /* synthetic */ Integer $usedPercent;
        public final /* synthetic */ String $valueLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142112(String str, String str2, Integer num, BRg bRg, String str3, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$usedPercent = num;
            this.$modifier = bRg;
            this.$valueLabel = str3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageMetersKt.UsageMeterRow(this.$title, this.$subtitle, this.$usedPercent, this.$modifier, this.$valueLabel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5  */
    /* renamed from: UsageCtaRow-gF0flNs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2274UsageCtaRowgF0flNs(java.lang.String r33, kotlin.jvm.functions.Function0<kotlin.Unit> r34, X.BRg r35, long r36, java.lang.Integer r38, boolean r39, boolean r40, java.lang.String r41, boolean r42, X.BFM r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraSubscriptionUsageMetersKt.m2274UsageCtaRowgF0flNs(java.lang.String, kotlin.jvm.functions.Function0, X.BRg, long, java.lang.Integer, boolean, boolean, java.lang.String, boolean, X.BFM, int, int):void");
    }

    public static final void UsageMeterRow(String str, String str2, Integer num, BRg bRg, String str3, BFM bfm, int i, int i2) {
        Integer numValueOf;
        BRg bRg2 = bRg;
        bfm.AgG(-1495063092);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, num);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str3);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str3 = null;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue < 0) {
                    iIntValue = 0;
                } else if (iIntValue > 100) {
                    iIntValue = 100;
                }
                numValueOf = Integer.valueOf(iIntValue);
            } else {
                numValueOf = null;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingSmall);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C9m9 c9m9A002 = AcQ.A00(AuraDimensKt.SpacingNano);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(c9m9A002, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            LabelValueLine(B1V.A00(bfm, new AuraSubscriptionUsageMetersKt$UsageMeterRow$1$1$1(str, auraColorsA0c, numValueOf), -1808597982), B1V.A00(bfm, new AuraSubscriptionUsageMetersKt$UsageMeterRow$1$1$2(numValueOf, str3, auraColorsA0c), -1150215103), null, bfm, 54, 4);
            if (str2 != null) {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, auraColorsA0c.secondaryText, AnonymousClass006.A0k(bfm, -976747578).footnoteRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d >> 3), 6, 14834);
            } else {
                bfm.AgE(-976528222);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            m2275UsageProgressBareopBjH0((numValueOf != null ? numValueOf.intValue() : 0) / 100.0f, auraColorsA0c.fillDivider, C06G.A0D(bfm), null, bfm, 0, 8);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142112(str, str2, num, bRg2, str3, i, i2);
        }
    }

    /* renamed from: UsageProgressBar-eopBjH0, reason: not valid java name */
    public static final void m2275UsageProgressBareopBjH0(float f, long j, long j2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(962678947);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0O(bfm, j2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA04 |= 3072;
        } else if ((i & 3072) == 0) {
            iA04 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 1171, 1170), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1D3 c1d3A00 = C1D8.A00(3.0f);
            float fA03 = ATD.A03(f, 0.0f, 1.0f);
            BRg bRgA03 = C11U.A03(C10G.A04(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMicroPlusNano), c1d3A00);
            boolean zA1C = AnonymousClass003.A1C(iA04) | bfm.A62(fA03) | ((iA04 & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new AuraSubscriptionUsageMetersKt$UsageProgressBar$1$1(j, fA03, j2);
                bfm.Ai0(objAaT);
            }
            C01N.A07(bfm, AEk.A02(bRgA03, (G0U) objAaT));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraSubscriptionUsageMetersKt$UsageProgressBar$2(f, j, j2, bRg2, i, i2);
        }
    }

    public static final void LabelValueLine(G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(287142671);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0v2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            List listAsList = Arrays.asList(g0v, g0v2);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new AaH() { // from class: com.facebook.aura.subscription.view.AuraSubscriptionUsageMetersKt$LabelValueLine$1$1

                    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageMetersKt$LabelValueLine$1$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
                        public final /* synthetic */ int $height;
                        public final /* synthetic */ AZE $labelPlaceable;
                        public final /* synthetic */ AZE $valuePlaceable;
                        public final /* synthetic */ int $width;

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(AYU ayu) {
                            C7384Etj.A0Y(ayu, 0);
                            AZE aze = this.$labelPlaceable;
                            if (aze != null) {
                                AYU.A04(ayu, aze, 0, (this.$height - aze.A00) / 2);
                            }
                            AZE aze2 = this.$valuePlaceable;
                            AYU.A04(ayu, aze2, this.$width - aze2.A01, (this.$height - aze2.A00) / 2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(AZE aze, int i, AZE aze2, int i2) {
                            super(1);
                            this.$labelPlaceable = aze;
                            this.$height = i;
                            this.$valuePlaceable = aze2;
                            this.$width = i2;
                        }

                        @Override // X.G0U
                        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                            invoke2(ayu);
                            return Unit.INSTANCE;
                        }
                    }

                    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageMetersKt$LabelValueLine$1$1$2, reason: invalid class name */
                    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<AYU, Unit> {
                        public final /* synthetic */ AZE $labelPlaceable;
                        public final /* synthetic */ AZE $valuePlaceable;
                        public final /* synthetic */ int $valueTop;

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(AYU ayu) {
                            C7384Etj.A0Y(ayu, 0);
                            AZE aze = this.$labelPlaceable;
                            if (aze != null) {
                                AYU.A04(ayu, aze, 0, 0);
                            }
                            AYU.A04(ayu, this.$valuePlaceable, 0, this.$valueTop);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(AZE aze, AZE aze2, int i) {
                            super(1);
                            this.$labelPlaceable = aze;
                            this.$valuePlaceable = aze2;
                            this.$valueTop = i;
                        }

                        @Override // X.G0U
                        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                            invoke2(ayu);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // X.AaH
                    /* renamed from: measure-3p2s80s */
                    public final InterfaceC1134Abi mo14measure3p2s80s(AXY axy, List<? extends List<? extends C3TG>> list, long j) {
                        int iMax;
                        G0U anonymousClass2;
                        boolean zA1a = AnonymousClass002.A1a(axy, list);
                        List<? extends C3TG> list2 = list.get(0);
                        List<? extends C3TG> list3 = list.get(zA1a ? 1 : 0);
                        C3TG c3tg = (C3TG) AbstractC0878AGe.A0G(list2);
                        C3TG c3tg2 = (C3TG) AbstractC0878AGe.A0F(list3);
                        int iAbr = c3tg == null ? 0 : axy.Abr(AuraDimensKt.SpacingSmall);
                        int iAQO = c3tg != null ? c3tg.AQO(Integer.MAX_VALUE) : 0;
                        int iAQO2 = iAQO + iAbr + c3tg2.AQO(Integer.MAX_VALUE);
                        int iA01 = Constraints.A0A(j) ? Constraints.A01(j) : iAQO2;
                        long jA05 = Constraints.A05(0, Constraints.A01(j), 0, Constraints.A00(j));
                        if (iAQO2 <= iA01) {
                            int i4 = iA01 - iAbr;
                            int i5 = i4 - iAQO;
                            int iA03 = Constraints.A03(jA05);
                            int iA02 = Constraints.A02(jA05);
                            int iA00 = Constraints.A00(jA05);
                            AZE azeAQW = c3tg2.AQW(Constraints.A05(iA03, i5, iA02, iA00));
                            if (c3tg != null) {
                                int i6 = i4 - azeAQW.A01;
                                if (i6 < 0) {
                                    i6 = 0;
                                }
                                azeAQW = c3tg.AQW(Constraints.A05(iA03, i6, iA02, iA00));
                                if (azeAQW != null) {
                                    iAbr = azeAQW.A00;
                                }
                            }
                            iMax = Math.max(iAbr, azeAQW.A00);
                            anonymousClass2 = new AnonymousClass1(azeAQW, iMax, azeAQW, iA01);
                        } else {
                            azeAQW = c3tg != null ? c3tg.AQW(jA05) : null;
                            AZE azeAQW2 = c3tg2.AQW(jA05);
                            iAbr = azeAQW != null ? azeAQW.A00 + axy.Abr(AuraDimensKt.SpacingNano) : 0;
                            iMax = azeAQW2.A00 + iAbr;
                            anonymousClass2 = new AnonymousClass2(azeAQW, azeAQW2, iAbr);
                        }
                        return AXY.A01(axy, anonymousClass2, iA01, iMax);
                    }

                    @Override // X.AaH
                    public /* bridge */ int maxIntrinsicHeight(C3TF c3tf, List<? extends List<? extends C3Tr>> list, int i4) {
                        ArrayList arrayListA0t = C60Q.A0t(list);
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            List<? extends C3Tr> list2 = list.get(i5);
                            ArrayList arrayListA0t2 = C60Q.A0t(list2);
                            int size2 = list2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                C3Tr c3TrA0a = C8j4.A0a(list2, i6);
                                Integer num = C79.A01;
                                arrayListA0t2.add(new AXR(c3TrA0a, num, num));
                            }
                            arrayListA0t.add(arrayListA0t2);
                        }
                        return mo14measure3p2s80s(AXP.A00(c3tf), arrayListA0t, AYL.A04(i4)).getHeight();
                    }

                    @Override // X.AaH
                    public /* bridge */ int maxIntrinsicWidth(C3TF c3tf, List<? extends List<? extends C3Tr>> list, int i4) {
                        ArrayList arrayListA0t = C60Q.A0t(list);
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            List<? extends C3Tr> list2 = list.get(i5);
                            ArrayList arrayListA0t2 = C60Q.A0t(list2);
                            int size2 = list2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                arrayListA0t2.add(new AXR(C8j4.A0a(list2, i6), C79.A01, C79.A00));
                            }
                            arrayListA0t.add(arrayListA0t2);
                        }
                        return mo14measure3p2s80s(AXP.A00(c3tf), arrayListA0t, AYL.A03(i4)).getWidth();
                    }

                    @Override // X.AaH
                    public /* bridge */ int minIntrinsicHeight(C3TF c3tf, List<? extends List<? extends C3Tr>> list, int i4) {
                        ArrayList arrayListA0t = C60Q.A0t(list);
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            List<? extends C3Tr> list2 = list.get(i5);
                            ArrayList arrayListA0t2 = C60Q.A0t(list2);
                            int size2 = list2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                arrayListA0t2.add(new AXR(C8j4.A0a(list2, i6), C79.A00, C79.A01));
                            }
                            arrayListA0t.add(arrayListA0t2);
                        }
                        return mo14measure3p2s80s(AXP.A00(c3tf), arrayListA0t, AYL.A04(i4)).getHeight();
                    }

                    @Override // X.AaH
                    public /* bridge */ int minIntrinsicWidth(C3TF c3tf, List<? extends List<? extends C3Tr>> list, int i4) {
                        ArrayList arrayListA0t = C60Q.A0t(list);
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            List<? extends C3Tr> list2 = list.get(i5);
                            ArrayList arrayListA0t2 = C60Q.A0t(list2);
                            int size2 = list2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                C3Tr c3TrA0a = C8j4.A0a(list2, i6);
                                Integer num = C79.A00;
                                arrayListA0t2.add(new AXR(c3TrA0a, num, num));
                            }
                            arrayListA0t.add(arrayListA0t2);
                        }
                        return mo14measure3p2s80s(AXP.A00(c3tf), arrayListA0t, AYL.A03(i4)).getWidth();
                    }
                };
                bfm.Ai0(objAaT);
            }
            AaH aaH = (AaH) objAaT;
            B1U b1uA01 = B1V.A01(new C05473bt(listAsList, 12), 1271844412, true);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new C1350Ahb(aaH);
                bfm.Ai0(objAaT2);
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
            AnonymousClass005.A0p(bfm, objAaT2, akqA04, bRgA01, iA0J);
            AnonymousClass001.A1B(b1uA01, bfm, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(g0v, g0v2, bRg, i, i2);
        }
    }

    /* renamed from: MeterSkeletonBar--orJrPs, reason: not valid java name */
    public static final void m2273MeterSkeletonBarorJrPs(float f, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-820714633);
        int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA04 |= 48;
        } else if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA04), bfm, iA04)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            C01N.A07(bfm, BOI.A00(C10G.A0C(bRg, f, 18.0f), C1D8.A00(AuraDimensKt.SpacingMicro), BOI.A01(bfm, null, 0.0f, 252, auraColorsA0c.shimmeringBase, auraColorsA0c.shimmeringHighlight)));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraSubscriptionUsageMetersKt$MeterSkeletonBar$1(f, bRg, i, i2);
        }
    }
}
