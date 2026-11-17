package com.facebook.aura.onboarding.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C1822Arm;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class OnboardingErrorStateKt {

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingErrorStateKt$OnboardingErrorMessage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C1822Arm $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, C1822Arm c1822Arm, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$style = c1822Arm;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            OnboardingErrorStateKt.OnboardingErrorMessage(this.$modifier, this.$style, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingErrorStateKt$OnboardingErrorRetryButton$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onRetry = function0;
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
            OnboardingErrorStateKt.OnboardingErrorRetryButton(this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingErrorStateKt$OnboardingErrorState$2, reason: invalid class name and case insensitive filesystem */
    public final class C127982 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C1822Arm $messageTextStyle;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127982(Function0<Unit> function0, BRg bRg, C1822Arm c1822Arm, int i, int i2) {
            super(2);
            this.$onRetry = function0;
            this.$modifier = bRg;
            this.$messageTextStyle = c1822Arm;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            OnboardingErrorStateKt.OnboardingErrorState(this.$onRetry, this.$modifier, this.$messageTextStyle, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingErrorStateKt$OnboardingLoadingState$3, reason: invalid class name */
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
            OnboardingErrorStateKt.OnboardingLoadingState(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OnboardingErrorMessage(X.BRg r24, X.C1822Arm r25, X.BFM r26, int r27, int r28) {
        /*
            r14 = r25
            r2 = r24
            r0 = -1205440549(0xffffffffb8266fdb, float:-3.9681658E-5)
            r5 = r26
            r5.AgG(r0)
            r3 = r28
            r7 = r28 & 1
            r4 = r27
            if (r7 == 0) goto Lb5
            r8 = r27 | 6
        L16:
            r0 = r27 & 48
            if (r0 != 0) goto L29
            r0 = r28 & 2
            if (r0 != 0) goto L26
            boolean r1 = r5.A65(r14)
            r0 = 32
            if (r1 != 0) goto L28
        L26:
            r0 = 16
        L28:
            r8 = r8 | r0
        L29:
            r1 = r8 & 19
            r0 = 18
            r6 = 0
            boolean r0 = X.AnonymousClass002.A1P(r1, r0)
            boolean r0 = X.AnonymousClass001.A1b(r0, r5, r8)
            if (r0 == 0) goto Lb1
            r5.Afy()
            r0 = r27 & 1
            if (r0 == 0) goto La2
            boolean r0 = r5.AEk()
            if (r0 != 0) goto La2
            int r8 = X.AnonymousClass003.A0C(r3, r5, r8)
        L49:
            r5.AAb()
            r0 = 2131889470(0x7f120d3e, float:1.9413604E38)
            java.lang.String r10 = X.AbstractC2271BQs.A01(r5, r0)
            long r12 = X.C06G.A08(r5)
            r7 = 3
            r15 = 0
            X.BRg r9 = X.AnonymousClass001.A0R(r2)
            java.lang.Object r1 = r5.AaT()
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L6a
            com.facebook.aura.onboarding.view.OnboardingErrorStateKt$OnboardingErrorMessage$1$1 r1 = com.facebook.aura.onboarding.view.OnboardingErrorStateKt$OnboardingErrorMessage$1$1.INSTANCE
            r5.Ai0(r1)
        L6a:
            X.BRg r11 = X.AnonymousClass001.A0Y(r9, r1, r6)
            X.1YL r1 = new X.1YL
            r1.<init>(r7)
            int r0 = r8 << 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r28 = 16304(0x3fb0, float:2.2847E-41)
            r16 = r15
            r19 = r6
            r20 = r6
            r21 = r6
            r22 = r15
            r23 = r15
            r24 = r15
            r25 = r5
            r26 = r0
            r27 = r6
            r17 = r1
            r18 = r6
            com.facebook.aura.vds.compose.text.AuraTextKt.m2639AuraTextUY9GdpU(r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L94:
            X.BBb r1 = r5.AAc()
            if (r1 == 0) goto La1
            com.facebook.aura.onboarding.view.OnboardingErrorStateKt$OnboardingErrorMessage$2 r0 = new com.facebook.aura.onboarding.view.OnboardingErrorStateKt$OnboardingErrorMessage$2
            r0.<init>(r2, r14, r4, r3)
            r1.A06 = r0
        La1:
            return
        La2:
            if (r7 == 0) goto La6
            X.BS0 r2 = X.BRg.A00
        La6:
            r0 = r28 & 2
            if (r0 == 0) goto L49
            X.Arm r14 = X.C06G.A0T(r5)
            r8 = r8 & (-113(0xffffffffffffff8f, float:NaN))
            goto L49
        Lb1:
            r5.Afo()
            goto L94
        Lb5:
            r0 = r27 & 6
            if (r0 != 0) goto Lc1
            int r8 = X.AnonymousClass004.A0d(r5, r2)
            r8 = r8 | r27
            goto L16
        Lc1:
            r8 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.view.OnboardingErrorStateKt.OnboardingErrorMessage(X.BRg, X.Arm, X.BFM, int, int):void");
    }

    public static final void OnboardingErrorRetryButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(1533637508);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d3f), null, bRg2, AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1), AuraButtonSize.LARGE, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, ((iA0T << 6) & 7168) | 196608, (iA0T << 12) & 57344, 0, 134201285);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OnboardingErrorState(kotlin.jvm.functions.Function0<kotlin.Unit> r15, X.BRg r16, X.C1822Arm r17, X.BFM r18, int r19, int r20) {
        /*
            r6 = r17
            r0 = 0
            r7 = r15
            X.C7384Etj.A0Y(r15, r0)
            r0 = 1033548869(0x3d9ab445, float:0.07553915)
            r9 = r18
            r9.AgG(r0)
            r5 = r19
            r0 = r19 & 6
            r8 = 2
            if (r0 != 0) goto Laa
            int r10 = X.AnonymousClass004.A0T(r9, r15)
            r10 = r10 | r19
        L1c:
            r4 = r20
            r2 = r20 & 2
            if (r2 == 0) goto L9d
            r10 = r10 | 48
        L24:
            r0 = r5 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L37
            r0 = r20 & 4
            if (r0 != 0) goto L34
            boolean r1 = r9.A65(r6)
            r0 = 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L36
        L34:
            r0 = 128(0x80, float:1.794E-43)
        L36:
            r10 = r10 | r0
        L37:
            r1 = r10 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            r12 = 1
            boolean r0 = X.AnonymousClass002.A1P(r1, r0)
            boolean r0 = X.AnonymousClass001.A1b(r0, r9, r10)
            if (r0 == 0) goto Lc3
            r9.Afy()
            r0 = r19 & 1
            if (r0 == 0) goto L8e
            boolean r0 = r9.AEk()
            if (r0 != 0) goto L8e
            int r10 = X.AnonymousClass003.A0B(r4, r9, r10)
        L57:
            r9.AAb()
            r11 = 0
            X.BRg r1 = X.AnonymousClass001.A0R(r16)
            float r0 = com.facebook.aura.vds.compose.base.AuraDimensKt.SpacingMedium
            X.BRg r2 = X.C3U4.A09(r1, r0)
            X.3TH r3 = X.C2VU.A00
            X.9m9 r1 = X.AcQ.A00(r0)
            r0 = 48
            X.AiA r15 = X.C06I.A00(r1, r9, r3, r0)
            r3 = r9
            X.BBI r3 = (X.BBI) r3
            int r14 = X.AnonymousClass003.A0J(r3)
            X.AKQ r13 = X.BBI.A04(r3)
            X.BRg r2 = X.AxM.A01(r9, r2)
            kotlin.jvm.functions.Function0<X.AkQ> r1 = X.C1515AkP.A00
            X.Ahw<?> r0 = r3.A0V
            if (r0 != 0) goto Lad
            X.C00x.A00()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L8e:
            if (r2 == 0) goto L92
            X.BS0 r16 = X.BRg.A00
        L92:
            r0 = r20 & 4
            if (r0 == 0) goto L57
            X.Arm r6 = X.C06G.A0T(r9)
            r10 = r10 & (-897(0xfffffffffffffc7f, float:NaN))
            goto L57
        L9d:
            r0 = r19 & 48
            if (r0 != 0) goto L24
            r0 = r16
            int r0 = X.AnonymousClass004.A0e(r9, r0)
            r10 = r10 | r0
            goto L24
        Laa:
            r10 = r5
            goto L1c
        Lad:
            X.AnonymousClass005.A0n(r9, r3, r1)
            X.AnonymousClass005.A0p(r9, r15, r13, r2, r14)
            int r0 = r10 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            OnboardingErrorMessage(r11, r6, r9, r0, r12)
            r0 = r10 & 14
            OnboardingErrorRetryButton(r7, r11, r9, r0, r8)
            X.BBI.A0R(r3, r12)
            goto Lc6
        Lc3:
            r9.Afo()
        Lc6:
            X.BBb r1 = r9.AAc()
            if (r1 == 0) goto Ld9
            com.facebook.aura.onboarding.view.OnboardingErrorStateKt$OnboardingErrorState$2 r0 = new com.facebook.aura.onboarding.view.OnboardingErrorStateKt$OnboardingErrorState$2
            r11 = r4
            r10 = r5
            r9 = r6
            r8 = r16
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            r1.A06 = r0
        Ld9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.view.OnboardingErrorStateKt.OnboardingErrorState(kotlin.jvm.functions.Function0, X.BRg, X.Arm, X.BFM, int, int):void");
    }

    public static final void OnboardingLoadingState(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(133440973);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d40);
            BRg bRgA0R = AnonymousClass001.A0R(bRg);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new OnboardingErrorStateKt$OnboardingLoadingState$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0R, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AnonymousClass007.A0s(bfm, bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg, i, i2);
        }
    }
}
