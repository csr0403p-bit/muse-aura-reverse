package com.facebook.aura.checkpoint.view;

import X.AKQ;
import X.AbstractC1754Apr;
import X.AbstractC2139Az7;
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
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1746Apj;
import X.C1822Arm;
import X.C19U;
import X.C1BO;
import X.C1b8;
import X.C2CK;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C6t6;
import X.C6tA;
import X.C78N;
import X.C78e;
import X.C7bA;
import X.EnumC3085Bxl;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.checkpoint.HatchCheckpointBlock;
import com.facebook.aura.checkpoint.view.HatchCheckpointViewModel;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchCheckpointOverlayKt {

    /* renamed from: com.facebook.aura.checkpoint.view.HatchCheckpointOverlayKt$HatchCheckpointBlock$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ Function0<Unit> $onLogOut;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$url = str;
            this.$onContinue = function0;
            this.$onLogOut = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCheckpointOverlayKt.HatchCheckpointBlock(this.$url, this.$onContinue, this.$onLogOut, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkpoint.view.HatchCheckpointOverlayKt$HatchCheckpointOverlayContent$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCheckpointOverlayKt.HatchCheckpointOverlayContent(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkpoint.view.HatchCheckpointOverlayKt$HatchCheckpointRecheckSpinner$3, reason: invalid class name and case insensitive filesystem */
    public final class C110603 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110603(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCheckpointOverlayKt.HatchCheckpointRecheckSpinner(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkpoint.view.HatchCheckpointOverlayKt$HatchCheckpointWebView$3, reason: invalid class name and case insensitive filesystem */
    public final class C110613 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDone;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110613(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$url = str;
            this.$onDone = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCheckpointOverlayKt.HatchCheckpointWebView(this.$url, this.$onDone, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchCheckpointRecheckSpinner(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(794315062);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12022d);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchCheckpointOverlayKt$HatchCheckpointRecheckSpinner$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            B81.A00(false, (Function0) objAaT, bfm, 48, 1);
            BRg bRgThen = C1b8.A01(AnonymousClass001.A0T(bRg2), C60O.A01(bfm, AuraTheme.INSTANCE)).then(new C1746Apj(AbstractC2139Az7.A00, AbstractC1754Apr.A00));
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            boolean zA65 = bfm.A65(strA01);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new HatchCheckpointOverlayKt$HatchCheckpointRecheckSpinner$2$1$1(strA01);
                bfm.Ai0(objAaT2);
            }
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(AnonymousClass001.A0Y(bs0, objAaT2, false), AuraSpinnerStyle.Companion.large(bfm, 6), 0L, bfm, AuraSpinnerStyle.$stable << 3, 4);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110603(bRg2, i, i2);
        }
    }

    public static final void HatchCheckpointBlock(String str, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(159141658);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204a5);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120702);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchCheckpointOverlayKt$HatchCheckpointBlock$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            B81.A00(false, (Function0) objAaT, bfm, 48, 1);
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA07 = C3U4.A07(C1b8.A01(bRgA0T, C60O.A01(bfm, auraTheme)).then(new C1746Apj(AbstractC2139Az7.A00, AbstractC1754Apr.A00)), AuraDimensKt.SpacingXlarge);
            InterfaceC1380AiA interfaceC1380AiAA0R = AnonymousClass006.A0R(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0R, akqA04, bRgA01, iA0D);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204a2);
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, auraTheme.getTypography(bfm, 6).title1Emphasized, null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, C19U.A03(32));
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            AuraTextKt.m2639AuraTextUY9GdpU(strA013, c1062ATq, jA06, c1822ArmA00, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingLarge);
            int i4 = R.string._name_removed__res_0x7f1204ad;
            if (str != null) {
                i4 = R.string._name_removed__res_0x7f12049d;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i4), c1062ATq, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingLargePlusMicro);
            boolean zA1W = AnonymousClass002.A1W(bfm, strA012, bfm.A65(strA01) | ((iA0d & 14) == 4), AnonymousClass003.A1C(iA0d)) | AnonymousClass004.A1K(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == obj) {
                objAaT2 = new HatchCheckpointOverlayKt$HatchCheckpointBlock$2$1$1(str, strA01, function0, strA012, function02);
                bfm.Ai0(objAaT2);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(c1062ATq, null, null, null, null, null, null, true, (G0U) objAaT2, bfm, 12582918, 126);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, function0, function02, bRg2, i, i2);
        }
    }

    public static final void HatchCheckpointOverlayContent(BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass5;
        BRg bRg2 = bRg;
        bfm.AgG(-971703119);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchCheckpointViewModel.Factory factory = new HatchCheckpointViewModel.Factory(AnonymousClass002.A0h(bfm));
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchCheckpointViewModel hatchCheckpointViewModel = (HatchCheckpointViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, C3cG.A0x(HatchCheckpointViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, hatchCheckpointViewModel.block);
            C1BO c1boA022 = C2CK.A02(bfm, hatchCheckpointViewModel.isRechecking);
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchCheckpointOverlayKt$HatchCheckpointOverlayContent$isClearing$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0K = AnonymousClass006.A0K(bfm, objAaT, objArr);
            HatchCheckpointBlock hatchCheckpointBlock = (HatchCheckpointBlock) c1boA02.getValue();
            if (hatchCheckpointBlock == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass5 = new HatchCheckpointOverlayKt$HatchCheckpointOverlayContent$url$1(bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass5);
                }
                return;
            }
            String str = hatchCheckpointBlock.url;
            EnumC3085Bxl enumC3085Bxl = EnumC3085Bxl.ON_RESUME;
            boolean zA1J = AnonymousClass003.A1J(bfm, mutableStateA0K, hatchCheckpointViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA1J || objAaT2 == obj) {
                objAaT2 = new HatchCheckpointOverlayKt$HatchCheckpointOverlayContent$1$1(hatchCheckpointViewModel, mutableStateA0K);
                bfm.Ai0(objAaT2);
            }
            C7bA.A00(bfm, enumC3085Bxl, null, (Function0) objAaT2, 6, 2);
            if (MutableState.A0A(mutableStateA0K) && str != null) {
                bfm.AgE(-1798773187);
                boolean zA1J2 = AnonymousClass003.A1J(bfm, mutableStateA0K, hatchCheckpointViewModel);
                Object objAaT3 = bfm.AaT();
                if (zA1J2 || objAaT3 == obj) {
                    objAaT3 = new HatchCheckpointOverlayKt$HatchCheckpointOverlayContent$2$1(hatchCheckpointViewModel, mutableStateA0K);
                    bfm.Ai0(objAaT3);
                }
                HatchCheckpointWebView(str, (Function0) objAaT3, bRg2, bfm, (iA0d << 6) & 896, 0);
            } else if (C1BO.A0F(c1boA022)) {
                bfm.AgE(-1798766141);
                HatchCheckpointRecheckSpinner(bRg2, bfm, iA0d & 14, 0);
            } else {
                boolean zA1Y = AnonymousClass001.A1Y(mutableStateA0K, bfm, -1798763742);
                Object objAaT4 = bfm.AaT();
                if (zA1Y || objAaT4 == obj) {
                    objAaT4 = new HatchCheckpointOverlayKt$HatchCheckpointOverlayContent$3$1(mutableStateA0K);
                    bfm.Ai0(objAaT4);
                }
                Function0 function0 = (Function0) objAaT4;
                boolean zA67 = bfm.A67(hatchCheckpointViewModel);
                Object objAaT5 = bfm.AaT();
                if (zA67 || objAaT5 == obj) {
                    objAaT5 = new HatchCheckpointOverlayKt$HatchCheckpointOverlayContent$4$1(hatchCheckpointViewModel);
                    bfm.Ai0(objAaT5);
                }
                HatchCheckpointBlock(str, function0, (Function0) ((InterfaceC7353EnQ) objAaT5), bRg2, bfm, (iA0d << 9) & 7168, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
    }

    public static final void HatchCheckpointWebView(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(827244722);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            final MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, true);
            boolean zA65 = bfm.A65(contextA0H);
            Object objAaT2 = bfm.AaT();
            Object obj2 = objAaT2;
            if (zA65 || objAaT2 == obj) {
                C6t6 c6t6 = new C6t6(contextA0H);
                c6t6.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                c6t6.getSettings().setJavaScriptEnabled(true);
                c6t6.getSettings().setDomStorageEnabled(true);
                c6t6.setWebViewClient(new C6tA() { // from class: com.facebook.aura.checkpoint.view.HatchCheckpointOverlayKt$HatchCheckpointWebView$webView$1$1$1
                    @Override // X.C6tA
                    public void onPageFinished(WebView webView, String str2) {
                        MutableState.A09(false, mutableState);
                    }

                    @Override // X.C6tA
                    public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                        MutableState.A09(true, mutableState);
                    }
                });
                bfm.Ai0(c6t6);
                obj2 = c6t6;
            }
            C6t6 c6t62 = (C6t6) obj2;
            boolean zA67 = bfm.A67(c6t62) | ((iA0d & 14) == 4);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new HatchCheckpointOverlayKt$HatchCheckpointWebView$1$1(c6t62, str, null);
                bfm.Ai0(objAaT3);
            }
            int i4 = iA0d << 3;
            C78e.A04(bfm, c6t62, str, (G0V) objAaT3);
            boolean zA672 = bfm.A67(c6t62);
            Object objAaT4 = bfm.AaT();
            if (zA672 || objAaT4 == obj) {
                objAaT4 = new HatchCheckpointOverlayKt$HatchCheckpointWebView$2$1(c6t62);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A17(bfm, objAaT4, c6t62);
            HatchCheckpointWebPageKt.HatchCheckpointWebPage(c6t62, MutableState.A0A(mutableState), function0, bRg2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204a2), null, bfm, i4 & 8064, 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110613(str, function0, bRg2, i, i2);
        }
    }
}
