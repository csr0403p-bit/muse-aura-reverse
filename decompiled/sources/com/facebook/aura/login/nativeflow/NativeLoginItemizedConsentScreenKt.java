package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.B6A;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C07C;
import X.C1731ApS;
import X.C1809ArT;
import X.C1824Aro;
import X.C1DG;
import X.C1OR;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G2j;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginItemizedConsentScreenKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginItemizedConsentScreenKt$NativeLoginItemizedConsentCards$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AHD<Boolean> $accepted;
        public final /* synthetic */ boolean $allAccepted;
        public final /* synthetic */ HatchItemizedConsent $consent;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ G0U<Boolean, Unit> $onAgreeToAllToggled;
        public final /* synthetic */ G0V<Integer, Boolean, Unit> $onItemToggled;
        public final /* synthetic */ C07C $this_NativeLoginItemizedConsentCards;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(C07C c07c, HatchItemizedConsent hatchItemizedConsent, AHD<Boolean> ahd, boolean z, G0V<? super Integer, ? super Boolean, Unit> g0v, G0U<? super Boolean, Unit> g0u, boolean z2, int i) {
            super(2);
            this.$this_NativeLoginItemizedConsentCards = c07c;
            this.$consent = hatchItemizedConsent;
            this.$accepted = ahd;
            this.$allAccepted = z;
            this.$onItemToggled = g0v;
            this.$onAgreeToAllToggled = g0u;
            this.$isLoading = z2;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginItemizedConsentScreenKt.NativeLoginItemizedConsentCards(this.$this_NativeLoginItemizedConsentCards, this.$consent, this.$accepted, this.$allAccepted, this.$onItemToggled, this.$onAgreeToAllToggled, this.$isLoading, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginItemizedConsentScreenKt$NativeLoginItemizedConsentScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C125312 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<Boolean> $accepted;
        public final /* synthetic */ boolean $allAccepted;
        public final /* synthetic */ boolean $confirmEnabled;
        public final /* synthetic */ HatchItemizedConsent $consent;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ G0U<Boolean, Unit> $onAgreeToAllToggled;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDecline;
        public final /* synthetic */ G0V<Integer, Boolean, Unit> $onItemToggled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C125312(HatchItemizedConsent hatchItemizedConsent, Function0<Unit> function0, boolean z, boolean z2, AHD<Boolean> ahd, boolean z3, G0V<? super Integer, ? super Boolean, Unit> g0v, G0U<? super Boolean, Unit> g0u, Function0<Unit> function02) {
            super(4);
            this.$consent = hatchItemizedConsent;
            this.$onConfirm = function0;
            this.$isLoading = z;
            this.$confirmEnabled = z2;
            this.$accepted = ahd;
            this.$allAccepted = z3;
            this.$onItemToggled = g0v;
            this.$onAgreeToAllToggled = g0u;
            this.$onDecline = function02;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1293invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0127  */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1293invokei1RSzL4(float r38, float r39, X.BFM r40, int r41) {
            /*
                Method dump skipped, instructions count: 427
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginItemizedConsentScreenKt.C125312.m1293invokei1RSzL4(float, float, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginItemizedConsentScreenKt$NativeLoginItemizedConsentScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<Boolean> $accepted;
        public final /* synthetic */ boolean $allAccepted;
        public final /* synthetic */ boolean $confirmEnabled;
        public final /* synthetic */ HatchItemizedConsent $consent;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onAgreeToAllToggled;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDecline;
        public final /* synthetic */ G0V<Integer, Boolean, Unit> $onItemToggled;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ HatchSubsurface $subsurface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(HatchItemizedConsent hatchItemizedConsent, AHD<Boolean> ahd, boolean z, boolean z2, G0V<? super Integer, ? super Boolean, Unit> g0v, G0U<? super Boolean, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, boolean z3, BRg bRg, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, int i, int i2, int i3) {
            super(2);
            this.$consent = hatchItemizedConsent;
            this.$accepted = ahd;
            this.$allAccepted = z;
            this.$confirmEnabled = z2;
            this.$onItemToggled = g0v;
            this.$onAgreeToAllToggled = g0u;
            this.$onConfirm = function0;
            this.$onDecline = function02;
            this.$onBack = function03;
            this.$isLoading = z3;
            this.$modifier = bRg;
            this.$subsurface = hatchSubsurface;
            this.$screen = hatchScreen;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginItemizedConsentScreenKt.NativeLoginItemizedConsentScreen(this.$consent, this.$accepted, this.$allAccepted, this.$confirmEnabled, this.$onItemToggled, this.$onAgreeToAllToggled, this.$onConfirm, this.$onDecline, this.$onBack, this.$isLoading, this.$modifier, this.$subsurface, this.$screen, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NativeLoginItemizedConsentScreen(com.facebook.aura.login.nativeflow.HatchItemizedConsent r71, X.AHD<java.lang.Boolean> r72, boolean r73, boolean r74, X.G0V<? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit> r75, X.G0U<? super java.lang.Boolean, kotlin.Unit> r76, kotlin.jvm.functions.Function0<kotlin.Unit> r77, kotlin.jvm.functions.Function0<kotlin.Unit> r78, kotlin.jvm.functions.Function0<kotlin.Unit> r79, boolean r80, X.BRg r81, com.facebook.aura.analytics.hatch.HatchSubsurface r82, com.facebook.aura.analytics.hatch.HatchScreen r83, X.BFM r84, int r85, int r86, int r87) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginItemizedConsentScreenKt.NativeLoginItemizedConsentScreen(com.facebook.aura.login.nativeflow.HatchItemizedConsent, X.AHD, boolean, boolean, X.G0V, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, X.BRg, com.facebook.aura.analytics.hatch.HatchSubsurface, com.facebook.aura.analytics.hatch.HatchScreen, X.BFM, int, int, int):void");
    }

    public static final void NativeLoginItemizedConsentCards(C07C c07c, HatchItemizedConsent hatchItemizedConsent, AHD<Boolean> ahd, boolean z, G0V<? super Integer, ? super Boolean, Unit> g0v, G0U<? super Boolean, Unit> g0u, boolean z2, BFM bfm, int i) {
        bfm.AgG(-924836287);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, hatchItemizedConsent);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, ahd);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0v);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0u);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0t(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 599187, 599186), bfm, iA0d)) {
            Context contextA0O = AnonymousClass003.A0O(bfm);
            long jA07 = C06G.A07(bfm);
            boolean zA1V = AnonymousClass002.A1V(bfm, contextA0O, AnonymousClass001.A1T(bfm, hatchItemizedConsent, AnonymousClass003.A1F(3670016, iA0d, 1048576)) | AnonymousClass003.A1E(iA0d) | AnonymousClass007.A1H(iA0d), bfm.A64(jA07)) | AnonymousClass004.A1K(iA0d) | ((57344 & iA0d) == 16384);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new NativeLoginItemizedConsentScreenKt$NativeLoginItemizedConsentCards$1$1(hatchItemizedConsent, z2, z, g0u, jA07, contextA0O, ahd, g0v);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0p(c07c, bfm, objAaT, iA0d);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(c07c, hatchItemizedConsent, ahd, z, g0v, g0u, z2, i);
        }
    }

    /* renamed from: sentenceText-4WTKRHQ, reason: not valid java name */
    public static final ApQ m1292sentenceText4WTKRHQ(HatchConsentItem hatchConsentItem, long j) {
        C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
        for (HatchTosBodyRun hatchTosBodyRun : hatchConsentItem.sentence) {
            String str = hatchTosBodyRun.url;
            if (str == null) {
                c1731ApSA0W.A0E(hatchTosBodyRun.text);
            } else {
                long j2 = C1809ArT.A01;
                int iA02 = c1731ApSA0W.A02(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j, j2, j2, B6A.A07));
                try {
                    int iA03 = c1731ApSA0W.A03(new C1OR(str));
                    try {
                        c1731ApSA0W.A0E(hatchTosBodyRun.text);
                    } finally {
                    }
                } finally {
                    c1731ApSA0W.A06(iA02);
                }
            }
        }
        return c1731ApSA0W.A04();
    }
}
