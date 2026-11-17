package com.facebook.aura.status.view;

import X.ADq;
import X.AGI;
import X.AHD;
import X.AKH;
import X.AKQ;
import X.ATE;
import X.AVy;
import X.AbstractC0878AGe;
import X.AbstractC1103AYp;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BNt;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C0A8;
import X.C0v5;
import X.C10376HDg;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1YD;
import X.C2Ct;
import X.C2Cy;
import X.C2VU;
import X.C3U4;
import X.C90l;
import X.C90m;
import X.CUB;
import X.CUC;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchMeshGradientKt;
import com.facebook.aura.ui.HatchPullToRefreshKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class IdentityScreenKt {

    /* renamed from: com.facebook.aura.status.view.IdentityScreenKt$FileCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $dateString;
        public final /* synthetic */ AHD<B6A> $gradientColors;
        public final /* synthetic */ AVy $iconPainter;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AHD<B6A> ahd, String str, String str2, String str3, AVy aVy) {
            super(3);
            this.$gradientColors = ahd;
            this.$title = str;
            this.$subtitle = str2;
            this.$dateString = str3;
            this.$iconPainter = aVy;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA04 = C10G.A04(c1062ATq, 150.0f);
                AHD<B6A> ahd = this.$gradientColors;
                String str = this.$title;
                String str2 = this.$subtitle;
                String str3 = this.$dateString;
                AVy aVy = this.$iconPainter;
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA04);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                C1062ATq c1062ATq2 = C10G.A01;
                HatchMeshGradientKt.HatchMeshGradient(ahd, c1062ATq2, bfm, 48, 0);
                BRg bRgA09 = C3U4.A09(c1062ATq2, AuraDimensKt.SpacingMedium);
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA09);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                C90l c90l = C90l.A00;
                C1822Arm c1822ArmA0X = C06G.A0X(bfm);
                long j2 = AnonymousClass002.A0c(bfm).onMedia;
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), 0.92f), c1822ArmA0X, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                C01N.A08(bfm, bs0, 4.0f);
                String upperCase = str2.toUpperCase(Locale.ROOT);
                C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).monoMedium;
                AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
                AuraTextKt.m2639AuraTextUY9GdpU(upperCase, null, AnonymousClass001.A0f(bfm, akh).onMedia, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                C01N.A07(bfm, c90l.AiP(bs0, 1.0f, true));
                InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, c1062ATq);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                BPg.A02(bfm, akqA043, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0vA0u);
                C90m c90m = C90m.A00;
                if (str3 == null) {
                    bfm.AgE(-542640208);
                    BBI.A0R(bbi, false);
                    bfm.AgE(-156044404);
                    C01N.A07(bfm, c90m.AiP(bs0, 1.0f, true));
                } else {
                    C1822Arm c1822Arm2 = AnonymousClass006.A0k(bfm, -542640207).monoMedium;
                    AuraTextKt.m2639AuraTextUY9GdpU(str3, c90m.AiP(bs0, 1.0f, true), AnonymousClass001.A0f(bfm, akh).onMedia, c1822Arm2, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                    BBI.A0R(bbi, false);
                    bfm.AgE(-156052185);
                }
                BBI.A0R(bbi, false);
                AuraIconKt.m2567AuraIconFHprtrg(null, aVy, AuraIconSize.TINY, null, AnonymousClass001.A0f(bfm, akh).onMedia, null, bfm, AnonymousClass001.A04(), 33);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.status.view.IdentityScreenKt$FileCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $dateString;
        public final /* synthetic */ AHD<B6A> $gradientColors;
        public final /* synthetic */ AVy $iconPainter;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, AHD<B6A> ahd, AVy aVy, Function0<Unit> function0, BRg bRg, String str3, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$gradientColors = ahd;
            this.$iconPainter = aVy;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$dateString = str3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            IdentityScreenKt.FileCard(this.$title, this.$subtitle, this.$gradientColors, this.$iconPainter, this.$onClick, this.$modifier, this.$dateString, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final AHD<B6A> generateGradientColors(float f, ATE<Float> ate, ATE<Float> ate2) {
        ADq aDq = new ADq(0, 8);
        ArrayList arrayListA0i = AnonymousClass003.A0i(aDq);
        Iterator<Integer> it = aDq.iterator();
        while (it.hasNext()) {
            ((BNt) it).A00();
            long j = B6A.A01;
            float fRandom = ((random(new C2Cy(-0.05f, 0.05f)) + f) * 360.0f) % 360.0f;
            if (fRandom != 0.0f && Math.signum(fRandom) != Math.signum(360.0f)) {
                fRandom += 360.0f;
            }
            float fRandom2 = random(ate);
            float fRandom3 = random(ate2);
            C10376HDg c10376HDg = HDi.A0I;
            if (0.0f > fRandom || fRandom > 360.0f || 0.0f > fRandom2 || fRandom2 > 1.0f || 0.0f > fRandom3 || fRandom3 > 1.0f) {
                StringBuilder sb = new StringBuilder("HSV (");
                sb.append(fRandom);
                sb.append(", ");
                sb.append(fRandom2);
                sb.append(", ");
                sb.append(fRandom3);
                throw new IllegalArgumentException(AnonymousClass001.A0v(") must be in range (0..360, 0..1, 0..1)", sb));
            }
            arrayListA0i.add(new B6A(HxS.A04(c10376HDg, C2Ct.A00(fRandom, fRandom2, fRandom3, 5), C2Ct.A00(fRandom, fRandom2, fRandom3, 3), C2Ct.A00(fRandom, fRandom2, fRandom3, 1), 1.0f)));
        }
        return AGI.A07(arrayListA0i);
    }

    public static final void FileCard(String str, String str2, AHD<B6A> ahd, AVy aVy, Function0<Unit> function0, BRg bRg, String str3, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        String str4 = str3;
        bfm.AgG(-1614253612);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, ahd);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass002.A00(AnonymousClass004.A1a(aVy, bfm, i) ? 1 : 0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        int i4 = i2 & 64;
        int iA0j = 1572864;
        if (i4 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, str4);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str4 = null;
            }
            AuraCardKt.m2484AuraCardjQVUvHA(C0v5.A04(bRg2, new C1YD(0), null, function0, true), null, null, null, null, null, null, null, null, null, false, false, null, null, 0L, false, null, B1V.A00(bfm, new AnonymousClass1(ahd, str, str2, str4, aVy), -153514842), bfm, 0, 12582912, 131070);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, ahd, aVy, function0, bRg2, str4, i, i2);
        }
    }

    /* renamed from: IdentityContent-KBW6s6s, reason: not valid java name */
    public static final void m2244IdentityContentKBW6s6s(AiIdentity aiIdentity, String str, boolean z, Function0<Unit> function0, G0U<? super String, Unit> g0u, String str2, String str3, float f, float f2, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        float f3 = f;
        float f4 = f2;
        BRg bRg2 = bRg;
        bfm.AgG(-1659018385);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(aiIdentity, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((i & 196608) == 0) {
            iA05 |= AnonymousClass004.A0i(bfm, str2);
        }
        if ((1572864 & i) == 0) {
            iA05 |= AnonymousClass004.A0j(bfm, str3);
        }
        int i4 = i2 & 128;
        int iA0B = 12582912;
        if (i4 != 0) {
            iA05 |= iA0B;
        } else if ((12582912 & i) == 0) {
            iA0B = AnonymousClass004.A0B(bfm, f3);
            iA05 |= iA0B;
        }
        int i5 = i2 & 256;
        if (i5 != 0) {
            iA05 |= 100663296;
            i3 = 196608;
        } else {
            i3 = 196608;
            if ((i & 100663296) == 0) {
                iA05 |= AnonymousClass002.A03(bfm.A62(f4) ? 1 : 0);
            }
        }
        int i6 = i2 & 512;
        int iA0m = 805306368;
        if (i6 != 0) {
            iA05 |= iA0m;
        } else if ((i & 805306368) == 0) {
            i6 = 0;
            iA0m = AnonymousClass004.A0m(bfm, bRg2);
            iA05 |= iA0m;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 306783379, 306783378), bfm, iA05)) {
            if (i4 != 0) {
                f3 = 0.0f;
            }
            if (i5 != 0) {
                f4 = 0.0f;
            }
            if (i6 != 0) {
                bRg2 = BRg.A00;
            }
            int i7 = iA05 >> 6;
            HatchPullToRefreshKt.m2322HatchPullToRefreshjIwJxvA(z, function0, bRg2, 0.0f, null, B1V.A00(bfm, new IdentityScreenKt$IdentityContent$1(AbstractC1103AYp.A00(0, bfm, 0, 1), f3, aiIdentity, str, f4, g0u, str2, str3), 1925417291), bfm, (i7 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i7 & 14) | i3 | ((iA05 >> 21) & 896), 24);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new IdentityScreenKt$IdentityContent$2(aiIdentity, str, z, function0, g0u, str2, str3, f3, f4, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* renamed from: IdentityScreen-pBklqvs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2245IdentityScreenpBklqvs(float r28, float r29, X.BRg r30, com.facebook.aura.status.viewmodel.IdentityViewModel r31, X.BFM r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.IdentityScreenKt.m2245IdentityScreenpBklqvs(float, float, X.BRg, com.facebook.aura.status.viewmodel.IdentityViewModel, X.BFM, int, int):void");
    }

    public static final AHD<B6A> generateMemoryPalette() {
        List listAsList = Arrays.asList(Float.valueOf(0.02f), Float.valueOf(0.55f), Float.valueOf(0.75f), Float.valueOf(0.35f), Float.valueOf(0.15f));
        CUC cuc = CUB.A00;
        if (listAsList.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return generateGradientColors(AnonymousClass001.A02(AbstractC0878AGe.A0E(listAsList, cuc.A05(listAsList.size()))), new C2Cy(0.6f, 0.95f), new C2Cy(0.25f, 0.75f));
    }

    public static final AHD<B6A> generateSoulPalette() {
        List listAsList = Arrays.asList(Float.valueOf(0.08f), Float.valueOf(0.15f), Float.valueOf(0.02f), Float.valueOf(0.55f), Float.valueOf(0.8f));
        CUC cuc = CUB.A00;
        if (listAsList.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return generateGradientColors(AnonymousClass001.A02(AbstractC0878AGe.A0E(listAsList, cuc.A05(listAsList.size()))), new C2Cy(0.15f, 0.45f), new C2Cy(0.4f, 0.7f));
    }

    public static final float random(ATE<Float> ate) {
        Float fAKt = ate.AKt();
        return fAKt.floatValue() + (((float) Math.random()) * (AnonymousClass001.A02(ate.AF8()) - fAKt.floatValue()));
    }
}
