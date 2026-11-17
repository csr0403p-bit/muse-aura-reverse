package com.facebook.aura.vds.compose.image;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0Ig;
import X.C1062ATq;
import X.C10G;
import X.C11S;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1b8;
import X.C2VU;
import X.C31t;
import X.C3IL;
import X.C3TH;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.ext.StringExtKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraRetryViewKt {
    public static final float ErrorGlyphMinSize = 40.0f;
    public static final float ErrorTextMinSize = 96.0f;
    public static final int FADE_ANIMATION_DURATION = 300;

    /* renamed from: com.facebook.aura.vds.compose.image.AuraRetryViewKt$AuraImageDefaultError$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C0Ig, BFM, Integer, Unit> {
        public final /* synthetic */ String $label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(3);
            this.$label = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C0Ig c0Ig, BFM bfm, Integer num) {
            invoke(c0Ig, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C0Ig c0Ig, BFM bfm, int i) {
            int iA0d = i;
            C7384Etj.A0Y(c0Ig, 0);
            if ((i & 6) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, c0Ig);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                float fAHT = c0Ig.AHT();
                float f = AuraRetryViewKt.ErrorTextMinSize;
                if (C1DG.A01(fAHT, f) >= 0 && C1DG.A01(c0Ig.AHP(), f) >= 0) {
                    bfm.AgE(715507698);
                    C3TH c3th = C2VU.A00;
                    BS0 bs0 = BRg.A00;
                    InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass002.A0V(bfm, c3th);
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bs0);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA0J);
                    AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.ic_info, 0), AuraIconSize.SMALL, null, C06G.A08(bfm), null, bfm, AnonymousClass001.A04(), 33);
                    C01N.A08(bfm, bs0, 8.0f);
                    AuraTextKt.m2640AuraTextVmYn7U0(StringExtKt.annotatedStringResource(R.string._name_removed__res_0x7f120ce3, null, false, null, null, bfm, 0, 30), null, C06G.A08(bfm), C06G.A0W(bfm), null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32754);
                    BBI.A0R(bbi, true);
                } else {
                    float fAHT2 = c0Ig.AHT();
                    float f2 = AuraRetryViewKt.ErrorGlyphMinSize;
                    if (C1DG.A01(fAHT2, f2) >= 0 && C1DG.A01(c0Ig.AHP(), f2) >= 0) {
                        bfm.AgE(706568970);
                        AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.ic_info, 0), AuraIconSize.SMALL, this.$label, C06G.A08(bfm), null, bfm, AnonymousClass001.A03(), 33);
                    } else {
                        bfm.AgE(715536652);
                        C1062ATq c1062ATq = C10G.A01;
                        boolean zA65 = bfm.A65(this.$label);
                        String str = this.$label;
                        Object objAaT = bfm.AaT();
                        if (zA65 || objAaT == C78N.A00) {
                            objAaT = new AuraRetryViewKt$AuraImageDefaultError$1$2$1(str);
                            bfm.Ai0(objAaT);
                        }
                        C01N.A07(bfm, AnonymousClass001.A0Y(c1062ATq, objAaT, false));
                    }
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.image.AuraRetryViewKt$AuraImageDefaultError$2, reason: invalid class name */
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
            AuraRetryViewKt.AuraImageDefaultError(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.image.AuraRetryViewKt$AuraRetryView$2, reason: invalid class name and case insensitive filesystem */
    public final class C142882 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetryClick;
        public final /* synthetic */ MutableState<Boolean> $showRetryView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142882(MutableState<Boolean> mutableState, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$showRetryView = mutableState;
            this.$onRetryClick = function0;
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
            AuraRetryViewKt.AuraRetryView(this.$showRetryView, this.$onRetryClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AuraRetryView(MutableState<Boolean> mutableState, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(mutableState, function0);
        bfm.AgG(367395730);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, mutableState) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA01 = C31t.A01(AnonymousClass001.A0K(300, zA1b ? 1 : 0), bfm, AnonymousClass006.A00(MutableState.A0A((MutableState) mutableState) ? 1 : 0), 3120, 20);
            if (MutableState.A0A((MutableState) mutableState)) {
                bfm.AgE(1509916606);
                ApQ apQAnnotatedStringResource = StringExtKt.annotatedStringResource(R.string._name_removed__res_0x7f120ce2, null, zA1b, null, null, bfm, zA1b ? 1 : 0, 30);
                BRg bRgA00 = C11S.A00(C10G.A02(C2VU.A09, bRg2, zA1b), C1BO.A01(c1boA01));
                C1822Arm c1822ArmA0W = C06G.A0W(bfm);
                boolean zA1V = AnonymousClass006.A1V(iA0d) | AnonymousClass004.A1F(iA0d);
                Object objAaT = bfm.AaT();
                if (zA1V || objAaT == C78N.A00) {
                    objAaT = new AuraRetryViewKt$AuraRetryView$1$1(mutableState, function0);
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2638AuraClickableTextZsD2BWI(apQAnnotatedStringResource, bRgA00, (G0U) objAaT, null, null, null, zA1b, 0L, c1822ArmA0W, null, null, null, 0L, zA1b, zA1b ? 1 : 0, zA1b ? 1 : 0, zA1b ? 1 : 0, null, null, null, bfm, zA1b ? 1 : 0, zA1b ? 1 : 0, 1048312);
            } else {
                bfm.AgE(1510214640);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142882(mutableState, function0, bRg2, i, i2);
        }
    }

    public static final void AuraImageDefaultError(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(322857476);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            C3IL.A00(bfm, C2VU.A09, C1b8.A00(AnonymousClass001.A0T(bRg), 0.04f, C06G.A0C(bfm)), B1V.A00(bfm, new AnonymousClass1(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ce3)), -660707238), 3120, 4, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg, i, i2);
        }
    }
}
