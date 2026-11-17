package com.facebook.aura.graduation;

import X.AKQ;
import X.ARL;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1544Al7;
import X.C1D3;
import X.C1D8;
import X.C1SA;
import X.C1YD;
import X.C1YL;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class GraduationAppClipCardKt {
    public static final float CARD_BACKGROUND_ALPHA = 0.7f;
    public static final float ICON_SIZE = 62.0f;
    public static final float MIN_TOUCH_TARGET = 48.0f;
    public static final String PLAY_STORE_PACKAGE = "com.facebook.aura";
    public static final C1D3 CARD_SHAPE = C1D8.A00(27.0f);
    public static final C1D3 ICON_SHAPE = C1D8.A00(17.0f);
    public static final C1D3 INSTALL_BUTTON_SHAPE = C1D8.A00(24.0f);

    /* renamed from: com.facebook.aura.graduation.GraduationAppClipCardKt$GraduationAppClipCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ long $shadowColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, long j) {
            super(2);
            this.$modifier = bRg;
            this.$shadowColor = j;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                BRg bRgA0R = AnonymousClass001.A0R(this.$modifier);
                C1D3 c1d3 = GraduationAppClipCardKt.CARD_SHAPE;
                boolean zA64 = bfm.A64(this.$shadowColor);
                long j = this.$shadowColor;
                Object objAaT = bfm.AaT();
                if (zA64 || objAaT == C78N.A00) {
                    objAaT = new GraduationAppClipCardKt$GraduationAppClipCard$1$1$1(j);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA09 = C3U4.A09(C1b8.A00(C11U.A03(bRgA0R.then(new C1544Al7(c1d3, (G0U) objAaT)), c1d3), 0.7f, AnonymousClass002.A0c(bfm).elevated), 10.0f);
                InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 10.0f);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA09);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA0J);
                C90m c90m = C90m.A00;
                GraduationAppClipCardKt.GraduationAppIcon(null, bfm, 0, 1);
                GraduationAppClipCardKt.GraduationAppDetails(AnonymousClass001.A0O(c90m, BRg.A00, true), bfm, 0, 0);
                GraduationAppClipCardKt.GraduationInstallButton(null, bfm, 0, 1);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationAppClipCardKt$GraduationAppClipCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
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
            GraduationAppClipCardKt.GraduationAppClipCard(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationAppClipCardKt$GraduationAppDetails$2, reason: invalid class name and case insensitive filesystem */
    public final class C121712 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121712(BRg bRg, int i, int i2) {
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
            GraduationAppClipCardKt.GraduationAppDetails(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationAppClipCardKt$GraduationAppIcon$2, reason: invalid class name and case insensitive filesystem */
    public final class C121722 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121722(BRg bRg, int i, int i2) {
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
            GraduationAppClipCardKt.GraduationAppIcon(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationAppClipCardKt$GraduationInstallButton$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
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
            GraduationAppClipCardKt.GraduationInstallButton(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void GraduationAppDetails(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-616599031);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1202af), null, C06G.A08(bfm), AnonymousClass002.A0f(bfm).footnoteMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f1202a9), null, C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1202aa), null, C06G.A08(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121712(bRg2, i, i2);
        }
    }

    public static final void GraduationAppIcon(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(732753992);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA03 = C11U.A03(C10G.A07(bRg2, ICON_SIZE), ICON_SHAPE);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.aura_launcher_background, 0);
            C1062ATq c1062ATq = C10G.A01;
            ARL arl = B18.A00;
            int i4 = AVy.$stable;
            C1SA.A00(bfm, null, c1062ATq, null, aVyA00, arl, null, 0.0f, i4 | 25008, 104);
            C1SA.A00(bfm, null, c1062ATq, null, BOf.A00(bfm, R.drawable.aura_launcher_foreground_vector, 0), arl, null, 0.0f, i4 | 25008, 104);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121722(bRg2, i, i2);
        }
    }

    public static final void GraduationInstallButton(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(768489397);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            float f = MIN_TOUCH_TARGET;
            BRg bRgA09 = C10G.A09(bRg2, f, f);
            C1YD c1yd = new C1YD(0);
            boolean zA67 = bfm.A67(contextA0H);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new GraduationAppClipCardKt$GraduationInstallButton$1$1(contextA0H);
                bfm.Ai0(objAaT);
            }
            BRg bRgA04 = C0v5.A04(bRgA09, c1yd, null, (Function0) objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1202b0), C3U4.A0B(C1b8.A01(C11U.A03(BRg.A00, INSTALL_BUTTON_SHAPE), AnonymousClass002.A0c(bfm).primaryButtonBackground), 20.0f, 4.0f), AnonymousClass002.A0c(bfm).onMedia, C06G.A0X(bfm), null, null, C1YL.A00(), false, 0, 1, 0, null, null, null, bfm, 805306368, 0, 15792);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg2, i, i2);
        }
    }

    public static final void GraduationAppClipCard(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-797902815);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            long j = AnonymousClass002.A0c(bfm).shadow;
            GraduationFixedFontScaleKt.GraduationFixedFontScale(B1V.A00(bfm, new AnonymousClass1(bRg, HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.1f)), -221272545), bfm, 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg, i, i2);
        }
    }
}
