package com.facebook.aura.library.view;

import X.AKQ;
import X.AT5;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C0dx;
import X.C0v2;
import X.C0z7;
import X.C10G;
import X.C1423Ais;
import X.C1515AkP;
import X.C1YD;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.components.confetti.AuraConfettiBurstKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class GoalCheckboxKt {
    public static final float CHECKBOX_SIZE = 24.0f;
    public static final long SPINNER_DELAY_MS = 150;

    /* renamed from: com.facebook.aura.library.view.GoalCheckboxKt$GoalCheckbox$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $checked;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Boolean> $onCheckedChange;
        public final /* synthetic */ boolean $pending;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(boolean z, G0U<? super Boolean, Boolean> g0u, String str, BRg bRg, boolean z2, int i, int i2) {
            super(2);
            this.$checked = z;
            this.$onCheckedChange = g0u;
            this.$label = str;
            this.$modifier = bRg;
            this.$pending = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            GoalCheckboxKt.GoalCheckbox(this.$checked, this.$onCheckedChange, this.$label, this.$modifier, this.$pending, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void GoalCheckbox(boolean z, G0U<? super Boolean, Boolean> g0u, String str, BRg bRg, boolean z2, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        boolean z3 = z2;
        AnonymousClass002.A1A(g0u, 1, str);
        bfm.AgG(-1431464863);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, str);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0n |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0r(bfm, z3);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (i4 != 0) {
                z3 = false;
            }
            C0dx c0dx = (C0dx) bfm.A6v(Am0.A08);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass002.A0I(bfm, 1.0f);
            }
            AT5 at5 = (AT5) objAaT;
            MutableState mutableState = (MutableState) AnonymousClass005.A0h(bfm, obj, z);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA1T = AnonymousClass004.A1T(bfm, c0dx, at5, AnonymousClass003.A1B(iA0n));
            Object objAaT2 = bfm.AaT();
            if (zA1T || objAaT2 == obj) {
                objAaT2 = new GoalCheckboxKt$GoalCheckbox$1$1(z, c0dx, at5, mutableState, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, boolValueOf);
            int i5 = R.drawable.square_outline_24_wght600;
            if (z) {
                i5 = R.drawable.squarecheck_filled_24_wght400;
            }
            AVy aVyA00 = BOf.A00(bfm, i5, 0);
            long j = AnonymousClass003.A0c(bfm, z ? -38071310 : -38018734).tertiaryText;
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            boolean zA64 = bfm.A64(j);
            Object objAaT3 = bfm.AaT();
            if (zA64 || objAaT3 == obj) {
                objAaT3 = AnonymousClass002.A0S(j);
                bfm.Ai0(objAaT3);
            }
            C1423Ais c1423Ais = (C1423Ais) objAaT3;
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass007.A0U(bfm, obj);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a5e);
            boolean zRememberDelayedPendingIndicator = rememberDelayedPendingIndicator(z3, bfm, (iA0n >> 12) & 14);
            BRg bRgA07 = C10G.A07(bRgA0Q, CHECKBOX_SIZE);
            boolean z4 = !z3;
            C1YD c1yd = new C1YD(1);
            boolean zA1T2 = AnonymousClass001.A1T(bfm, c0dx, AnonymousClass004.A1I(iA0n));
            Object objAaT4 = bfm.AaT();
            if (zA1T2 || objAaT4 == obj) {
                objAaT4 = new GoalCheckboxKt$GoalCheckbox$2$1(g0u, c0dx);
                bfm.Ai0(objAaT4);
            }
            BRg bRgA00 = C0v2.A00(null, interfaceC1072AWd, bRgA07, c1yd, (G0U) objAaT4, z, z4);
            boolean zA1W = AnonymousClass002.A1W(bfm, strA01, bfm.A66(zRememberDelayedPendingIndicator), AnonymousClass004.A1K(iA0n));
            Object objAaT5 = bfm.AaT();
            if (zA1W || objAaT5 == obj) {
                objAaT5 = new GoalCheckboxKt$GoalCheckbox$3$1(str, zRememberDelayedPendingIndicator, strA01);
                bfm.Ai0(objAaT5);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA00, objAaT5, false);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgM372auraConfettiBurstiHT50w = AuraConfettiBurstKt.m372auraConfettiBurstiHT50w(c0z7.AQJ(bs0), z, null, 0, 0.0f, null, null, bfm, (iA0n << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 62);
            boolean zA1R = AnonymousClass003.A1R(bfm, at5, zRememberDelayedPendingIndicator);
            Object objAaT6 = bfm.AaT();
            if (zA1R || objAaT6 == obj) {
                objAaT6 = new GoalCheckboxKt$GoalCheckbox$4$1$1(at5, zRememberDelayedPendingIndicator);
                bfm.Ai0(objAaT6);
            }
            C01N.A07(bfm, AnonymousClass005.A0V(AnonymousClass001.A0W(bRgM372auraConfettiBurstiHT50w, objAaT6), c1423Ais, aVyA00, B18.A02));
            if (zRememberDelayedPendingIndicator) {
                bfm.AgE(1620145179);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(c0z7.AQJ(bs0), null, 0L, bfm, 0, 6);
            } else {
                bfm.AgE(1620206683);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(z, g0u, str, bRgA0Q, z3, i, i2);
        }
    }

    public static final boolean rememberDelayedPendingIndicator(boolean z, BFM bfm, int i) {
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean z2 = (((i & 14) ^ 6) > 4 && bfm.A66(z)) || (i & 6) == 4;
        Object objAaT2 = bfm.AaT();
        if (z2 || objAaT2 == obj) {
            objAaT2 = new GoalCheckboxKt$rememberDelayedPendingIndicator$1$1(z, mutableState, null);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A18(bfm, objAaT2, boolValueOf);
        return MutableState.A0A(mutableState);
    }
}
