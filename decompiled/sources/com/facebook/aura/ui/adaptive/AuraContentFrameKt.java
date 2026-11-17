package com.facebook.aura.ui.adaptive;

import X.AKH;
import X.AKQ;
import X.AbstractC7559F3s;
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
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0er;
import X.C10G;
import X.C1417Aim;
import X.C1515AkP;
import X.C15k;
import X.C16n;
import X.C1DG;
import X.C1DM;
import X.C1OM;
import X.C2VU;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraContentFrameKt {
    public static final AKH<AuraPageResize> LocalAuraPageResize = AnonymousClass002.A0L(AuraContentFrameKt$LocalAuraPageResize$1.INSTANCE);

    /* renamed from: com.facebook.aura.ui.adaptive.AuraContentFrameKt$AuraContentFrame$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraContentRole $role;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(AuraContentRole auraContentRole, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$role = auraContentRole;
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
            AuraContentFrameKt.AuraContentFrame(this.$role, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.ui.adaptive.AuraContentFrameKt$AuraContentInsets$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0W<C1DG, BFM, Integer, Unit> $content;
        public final /* synthetic */ float $horizontalInset;
        public final /* synthetic */ AuraPageResize $resize;

        /* renamed from: com.facebook.aura.ui.adaptive.AuraContentFrameKt$AuraContentInsets$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04171 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ G0W<C1DG, BFM, Integer, Unit> $content;
            public final /* synthetic */ float $horizontalInset;
            public final /* synthetic */ AuraPageResize $resize;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04171(AuraPageResize auraPageResize, G0W<? super C1DG, ? super BFM, ? super Integer, Unit> g0w, float f) {
                super(2);
                this.$resize = auraPageResize;
                this.$content = g0w;
                this.$horizontalInset = f;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                C1DG c1dg;
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    G0W<C1DG, BFM, Integer, Unit> g0w = this.$content;
                    float f = this.$horizontalInset;
                    BS0 bs0 = BRg.A00;
                    AuraPageResize auraPageResize = this.$resize;
                    BRg bRgPageResizeAlpha = AuraContentFrameKt.pageResizeAlpha(bs0, auraPageResize);
                    C1DG c1dg2 = null;
                    if (auraPageResize != null) {
                        c1dg = new C1DG(auraPageResize.width);
                    } else {
                        c1dg = null;
                    }
                    boolean zA65 = bfm.A65(c1dg);
                    AuraPageResize auraPageResize2 = this.$resize;
                    Object objAaT = bfm.AaT();
                    if (zA65 || objAaT == C78N.A00) {
                        if (auraPageResize2 != null) {
                            c1dg2 = new C1DG(auraPageResize2.width);
                        }
                        objAaT = new ContentFrameMeasurePolicy(Float.NaN, c1dg2);
                        bfm.Ai0(objAaT);
                    }
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgPageResizeAlpha);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, objAaT, akqA04, bRgA01, iA0J);
                    AnonymousClass004.A1B(bbi, new C1DG(f), bfm, g0w, 0);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AuraPageResize auraPageResize, G0W<? super C1DG, ? super BFM, ? super Integer, Unit> g0w, float f) {
            super(2);
            this.$resize = auraPageResize;
            this.$content = g0w;
            this.$horizontalInset = f;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AuraContentFrameKt.ClearAuraPageResize(B1V.A00(bfm, new C04171(this.$resize, this.$content, this.$horizontalInset), 81375070), bfm, 6);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.ui.adaptive.AuraContentFrameKt$AuraContentInsets$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0W<C1DG, BFM, Integer, Unit> $content;
        public final /* synthetic */ AuraContentRole $role;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AuraContentRole auraContentRole, G0W<? super C1DG, ? super BFM, ? super Integer, Unit> g0w, int i) {
            super(2);
            this.$role = auraContentRole;
            this.$content = g0w;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraContentFrameKt.AuraContentInsets(this.$role, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.ui.adaptive.AuraContentFrameKt$ClearAuraPageResize$1, reason: invalid class name and case insensitive filesystem */
    public final class C142521 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142521(G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$content = g0v;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraContentFrameKt.ClearAuraPageResize(this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void AuraContentFrame(AuraContentRole auraContentRole, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        float fAuraLayoutWidth;
        AnonymousClass002.A1A(auraContentRole, 0, g0v);
        bfm.AgG(1577079386);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, auraContentRole) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            float fM2361getMaxWidthD9Ej5fM = C06G.A0p(bfm) ? Float.NaN : auraContentRole.m2361getMaxWidthD9Ej5fM();
            AuraPageResize auraPageResize = (AuraPageResize) bfm.A6v(LocalAuraPageResize);
            if (auraPageResize != null) {
                fAuraLayoutWidth = auraPageResize.width;
                bfm.AgE(-550156420);
            } else {
                bfm.AgE(-550155893);
                fAuraLayoutWidth = AuraLayoutSizeKt.auraLayoutWidth(bfm, 0);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (!Float.isNaN(fM2361getMaxWidthD9Ej5fM)) {
                C1DG c1dg = new C1DG(fAuraLayoutWidth);
                C1DG c1dg2 = new C1DG(fM2361getMaxWidthD9Ej5fM);
                if (c1dg.compareTo(c1dg2) > 0) {
                    c1dg = c1dg2;
                }
                fAuraLayoutWidth = c1dg.A00;
            }
            long jA00 = C16n.A00(fAuraLayoutWidth, AuraLayoutSizeKt.auraLayoutHeight(bfm, 0));
            BRg bRgPageResizeAlpha = pageResizeAlpha(bRg, auraPageResize);
            boolean zA65 = bfm.A65(auraPageResize != null ? new C1DG(auraPageResize.width) : null) | bfm.A62(fM2361getMaxWidthD9Ej5fM);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new ContentFrameMeasurePolicy(fM2361getMaxWidthD9Ej5fM, auraPageResize != null ? new C1DG(auraPageResize.width) : null);
                bfm.Ai0(objAaT);
            }
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgPageResizeAlpha);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, objAaT, akqA04, bRgA01, iA0J);
            AuraLayoutSizeKt.m2363ProvideAuraLayoutSizeUBP6k7g(jA00, B1V.A00(bfm, new AuraContentFrameKt$AuraContentFrame$1$1(g0v), -1258946348), bfm, 48);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(auraContentRole, bRg, g0v, i, i2);
        }
    }

    /* renamed from: ProvideAuraPageResize-B-JOX-Q, reason: not valid java name */
    public static final void m2358ProvideAuraPageResizeBJOXQ(C1DG c1dg, float f, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        C7384Etj.A0Y(g0v, 2);
        bfm.AgG(1749823275);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1dg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            AnonymousClass001.A14(bfm, LocalAuraPageResize.A04(c1dg != null ? new AuraPageResize(c1dg.A00, f) : null), g0v, iA0d >> 3);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraContentFrameKt$ProvideAuraPageResize$2(c1dg, f, g0v, i);
        }
    }

    public static final BRg pageResizeAlpha(BRg bRg, AuraPageResize auraPageResize) {
        if (auraPageResize == null) {
            return bRg;
        }
        float f = auraPageResize.alpha;
        long j = C15k.A01;
        C1DM c1dm = C1OM.A00;
        long j2 = C0er.A00;
        return bRg.then(new C1417Aim(c1dm, f, 0.0f, 0.0f, 0, j, j2, j2, false));
    }

    public static final void AuraContentInsets(AuraContentRole auraContentRole, G0W<? super C1DG, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i) {
        float fAuraLayoutWidth;
        float f;
        boolean zA1b = AnonymousClass004.A1b(auraContentRole, g0w);
        bfm.AgG(1949645379);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, auraContentRole) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA08), bfm, iA08)) {
            float fM2361getMaxWidthD9Ej5fM = C06G.A0p(bfm) ? Float.NaN : auraContentRole.m2361getMaxWidthD9Ej5fM();
            AuraPageResize auraPageResize = (AuraPageResize) bfm.A6v(LocalAuraPageResize);
            if (auraPageResize != null) {
                fAuraLayoutWidth = auraPageResize.width;
                bfm.AgE(1003476389);
            } else {
                bfm.AgE(1003476916);
                fAuraLayoutWidth = AuraLayoutSizeKt.auraLayoutWidth(bfm, zA1b ? 1 : 0);
            }
            AnonymousClass001.A1D(bfm);
            if (Float.isNaN(fM2361getMaxWidthD9Ej5fM)) {
                f = fAuraLayoutWidth;
            } else {
                C1DG c1dg = new C1DG(fAuraLayoutWidth);
                C1DG c1dg2 = new C1DG(fM2361getMaxWidthD9Ej5fM);
                if (c1dg.compareTo(c1dg2) <= 0) {
                    c1dg2 = c1dg;
                }
                f = c1dg2.A00;
            }
            AuraLayoutSizeKt.m2363ProvideAuraLayoutSizeUBP6k7g(C16n.A00(f, AuraLayoutSizeKt.auraLayoutHeight(bfm, zA1b ? 1 : 0)), B1V.A00(bfm, new AnonymousClass1(auraPageResize, g0w, C1DG.A04(new C1DG((fAuraLayoutWidth - f) / 2.0f), 0.0f).A00), -1147375930), bfm, 48);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(auraContentRole, g0w, i);
        }
    }

    public static final void ClearAuraPageResize(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(1182224457);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            AnonymousClass001.A14(bfm, LocalAuraPageResize.A04(null), g0v, iA0T << 3);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142521(g0v, i);
        }
    }

    /* renamed from: atWidth-K40F9xA, reason: not valid java name */
    public static final long m2360atWidthK40F9xA(long j, int i) {
        int iA03 = Constraints.A03(j);
        if (iA03 >= Constraints.A01(j) || iA03 > i) {
            iA03 = i;
        }
        return AnonymousClass004.A0x(j, iA03, i);
    }

    public static final BRg auraContentWidth(BRg bRg, AuraContentRole auraContentRole, BFM bfm, int i) {
        boolean zA1b = AnonymousClass004.A1b(bRg, auraContentRole);
        bfm.AgE(-1261376789);
        if (!C06G.A0p(bfm) && !Float.isNaN(auraContentRole.m2361getMaxWidthD9Ej5fM())) {
            bRg = C10G.A0D(C10G.A00(C2VU.A00, AnonymousClass001.A0R(bRg), zA1b), Float.NaN, auraContentRole.m2361getMaxWidthD9Ej5fM());
        }
        AnonymousClass001.A1D(bfm);
        return bRg;
    }
}
