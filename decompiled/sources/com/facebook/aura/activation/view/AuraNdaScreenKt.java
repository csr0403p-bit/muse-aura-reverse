package com.facebook.aura.activation.view;

import X.AKQ;
import X.AVy;
import X.AXN;
import X.AbstractC1754Apr;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AuJ;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BIj;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00r;
import X.C00x;
import X.C01N;
import X.C06827l3;
import X.C06847l8;
import X.C06I;
import X.C0953AJg;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C15z;
import X.C1DM;
import X.C1Lu;
import X.C1OM;
import X.C1SA;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60Q;
import X.C6tn;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90l;
import X.EnumC06837l4;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HxS;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.facebook.aura.R;
import com.facebook.aura.activation.data.HatchNdaAgreement;
import com.facebook.aura.activation.model.AuraNdaViewModel;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import com.facebook.aura.model.ExternalLinkPresentationJsonKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.adaptive.AuraContentFrameKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.webview.AccompanistWebViewClient;
import com.facebook.aura.webview.HatchWebViewKt;
import com.facebook.aura.webview.WebContent;
import com.facebook.aura.webview.WebViewState;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AuraNdaScreenKt {

    /* renamed from: com.facebook.aura.activation.view.AuraNdaScreenKt$AuraNdaScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAccept;
        public final /* synthetic */ G0U<String, Unit> $onEmailChange;
        public final /* synthetic */ G0U<String, Unit> $onNameChange;
        public final /* synthetic */ AuraNdaViewModel.UiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AuraNdaViewModel.UiState uiState, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = uiState;
            this.$onNameChange = g0u;
            this.$onEmailChange = g0u2;
            this.$onAccept = function0;
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
            AuraNdaScreenKt.AuraNdaScreen(this.$uiState, this.$onNameChange, this.$onEmailChange, this.$onAccept, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraNdaScreenKt$AuraNdaScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAccept;
        public final /* synthetic */ G0U<String, Unit> $onEmailChange;
        public final /* synthetic */ G0U<String, Unit> $onNameChange;
        public final /* synthetic */ AuraNdaViewModel.UiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AuraNdaViewModel.UiState uiState, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = uiState;
            this.$onNameChange = g0u;
            this.$onEmailChange = g0u2;
            this.$onAccept = function0;
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
            AuraNdaScreenKt.AuraNdaScreen(this.$uiState, this.$onNameChange, this.$onEmailChange, this.$onAccept, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraNdaScreenKt$AuraNdaScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAccept;
        public final /* synthetic */ G0U<String, Unit> $onEmailChange;
        public final /* synthetic */ G0U<String, Unit> $onNameChange;
        public final /* synthetic */ AuraNdaViewModel.UiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(AuraNdaViewModel.UiState uiState, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = uiState;
            this.$onNameChange = g0u;
            this.$onEmailChange = g0u2;
            this.$onAccept = function0;
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
            AuraNdaScreenKt.AuraNdaScreen(this.$uiState, this.$onNameChange, this.$onEmailChange, this.$onAccept, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraNdaScreenKt$NdaAgreementWebView$2, reason: invalid class name and case insensitive filesystem */
    public final class C107162 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $term;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107162(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$term = str;
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
            AuraNdaScreenKt.NdaAgreementWebView(this.$term, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraNdaScreenKt$NdaHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C107172 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107172(BRg bRg, int i, int i2) {
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
            AuraNdaScreenKt.NdaHeader(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraNdaScreenKt$NdaInputFields$2, reason: invalid class name and case insensitive filesystem */
    public final class C107182 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $email;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;
        public final /* synthetic */ G0U<String, Unit> $onEmailChange;
        public final /* synthetic */ G0U<String, Unit> $onNameChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107182(String str, String str2, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$name = str;
            this.$email = str2;
            this.$onNameChange = g0u;
            this.$onEmailChange = g0u2;
            this.$enabled = z;
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
            AuraNdaScreenKt.NdaInputFields(this.$name, this.$email, this.$onNameChange, this.$onEmailChange, this.$enabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraNdaScreenKt$addMissingHrefs$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C107191 extends AbstractC7559F3s implements G0U<C1Lu, CharSequence> {
        public static final C107191 INSTANCE = new C107191();

        public C107191() {
            super(1);
        }

        @Override // X.G0U
        public final CharSequence invoke(C1Lu c1Lu) {
            C7384Etj.A0Y(c1Lu, 0);
            String strA0n = C60Q.A0n(c1Lu.AG1(), 1);
            String strA0n2 = C60Q.A0n(c1Lu.AG1(), 2);
            return C7BY.A0q(strA0n, "href", true) ? C06847l8.A00((C06847l8) c1Lu) : FGI.A0k("<a", strA0n, " href=\"", strA0n2, "\">", strA0n2, "</a>");
        }
    }

    public static final void AuraNdaScreen(AuraNdaViewModel.UiState uiState, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass4;
        String str;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(uiState, 0);
        AnonymousClass005.A11(g0u, g0u2, function0, 1);
        bfm.AgG(-145815091);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, uiState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0u2);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors colors = AuraTheme.INSTANCE.getColors(bfm, 6);
            if (uiState.isFetching) {
                bfm.AgE(-1765180563);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A02(C2VU.A09, C1b8.A01(AnonymousClass001.A0T(bRg2), colors.background), false), AuraSpinnerStyle.Companion.small(bfm, 6), 0L, bfm, AuraSpinnerStyle.$stable << 3, 4);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc == null) {
                    return;
                } else {
                    anonymousClass4 = new AnonymousClass1(uiState, g0u, g0u2, function0, bRg2, i, i2);
                }
            } else {
                BBI bbiA0M = AnonymousClass002.A0M(bfm, -1764988363);
                if (uiState.agreement == null) {
                    bfm.AgE(-1764951845);
                    AuraGatingScreenKt.AuraGatingScreen(bRg2, null, null, null, null, bfm, (iA0T >> 12) & 14, 30);
                    bBbAAc = AnonymousClass001.A0L(bfm, bbiA0M);
                    if (bBbAAc == null) {
                        return;
                    } else {
                        anonymousClass4 = new AnonymousClass2(uiState, g0u, g0u2, function0, bRg2, i, i2);
                    }
                } else {
                    bfm.AgE(-1764896107);
                    BBI.A0R(bbiA0M, false);
                    AXN axnA0Y = AnonymousClass002.A0Y(bfm);
                    Object objAaT = bfm.AaT();
                    Object obj = C78N.A00;
                    if (objAaT == obj) {
                        objAaT = AnonymousClass002.A0O(bfm, 0);
                    }
                    C00r c00r = (C00r) objAaT;
                    float fAgy = axnA0Y.Agy(c00r.AGd()) + AuraDimensKt.SpacingMedium;
                    float f = AuraDimensKt.SpacingLarge;
                    float f2 = fAgy + f;
                    C1062ATq c1062ATq = C10G.A01;
                    BRg bRgThen = bRg2.then(c1062ATq);
                    long j = colors.background;
                    C1DM c1dm = C1OM.A00;
                    BRg bRgA03 = C1b8.A03(bRgThen, c1dm, j);
                    InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                    int iA02 = C3cG.A02(bbiA0M.A06);
                    AKQ akqA04 = BBI.A04(bbiA0M);
                    BRg bRgA01 = AxM.A01(bfm, bRgA03);
                    Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                    if (bbiA0M.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbiA0M, function02);
                    G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0c);
                    G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
                    G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
                    G0U<InterfaceC1516AkQ, Unit> g0u3 = C1515AkP.A02;
                    G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u3);
                    C0z7 c0z7 = C0z7.A00;
                    BS0 bs0 = BRg.A00;
                    BRg bRgA012 = AbstractC1754Apr.A01(C15z.A00(bfm, c1062ATq));
                    float f3 = AuraDimensKt.SpacingMedium;
                    BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(C3U4.A0B(bRgA012, f3, 0.0f), HatchOrigin.ONBOARDING, HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_POST_AUTH, HatchScreen.ONBOARDING_NDA, HatchComponent.NDA_AGREEMENT, null, null, null, 500L, 0.0f, null, null, null);
                    AuraContentRole auraContentRole = AuraContentRole.Focused;
                    BRg bRgAuraContentWidth = AuraContentFrameKt.auraContentWidth(bRgHatchImpression, auraContentRole, bfm, 48);
                    InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
                    C3TH c3th = C2VU.A02;
                    InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                    int iA0D = AnonymousClass001.A0D(bbiA0M);
                    AKQ akqA042 = BBI.A04(bbiA0M);
                    BRg bRgA013 = AxM.A01(bfm, bRgAuraContentWidth);
                    AnonymousClass005.A0n(bfm, bbiA0M, function02);
                    BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
                    BPg.A02(bfm, akqA042, g0v);
                    AnonymousClass003.A15(g0u3, g0vA19, bfm, iA0D);
                    BPg.A02(bfm, bRgA013, g0vA0u);
                    C90l c90l = C90l.A00;
                    NdaHeader(null, bfm, 0, 1);
                    C01N.A08(bfm, bs0, f3);
                    HatchNdaAgreement hatchNdaAgreement = uiState.agreement;
                    if (hatchNdaAgreement == null || (str = hatchNdaAgreement.termText) == null) {
                        str = "";
                    }
                    BRg bRgAiP = c90l.AiP(bs0, 1.0f, true);
                    C1062ATq c1062ATq2 = C10G.A02;
                    NdaAgreementWebView(str, bRgAiP.then(c1062ATq2), bfm, 0, 0);
                    C01N.A04(bfm, bbiA0M, bs0, f2, true);
                    BRg bRgA0C = C3U4.A0C(C3U4.A0B(C1b8.A03(AbstractC1754Apr.A01(AbstractC1754Apr.A00(c0z7.A4C(C2VU.A06, bs0).then(c1062ATq2))), c1dm, colors.background), f3, 0.0f), 0.0f, f3, 0.0f, f);
                    Object objAaT2 = bfm.AaT();
                    if (objAaT2 == obj) {
                        objAaT2 = new AuraNdaScreenKt$AuraNdaScreen$3$2$1(c00r);
                        bfm.Ai0(objAaT2);
                    }
                    BRg bRgAuraContentWidth2 = AuraContentFrameKt.auraContentWidth(BIj.A00(bRgA0C, (G0U) objAaT2), auraContentRole, bfm, 48);
                    InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                    int iA0D2 = AnonymousClass001.A0D(bbiA0M);
                    AKQ akqA043 = BBI.A04(bbiA0M);
                    BRg bRgA014 = AxM.A01(bfm, bRgAuraContentWidth2);
                    AnonymousClass005.A0n(bfm, bbiA0M, function02);
                    BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                    BPg.A02(bfm, akqA043, g0v);
                    AnonymousClass003.A15(g0u3, g0vA19, bfm, iA0D2);
                    BPg.A02(bfm, bRgA014, g0vA0u);
                    NdaInputFields(uiState.name, uiState.email, g0u, g0u2, !uiState.isLoading, null, bfm, (iA0T << 3) & 8064, 32);
                    C01N.A08(bfm, bs0, f);
                    boolean zA67 = bfm.A67(uiState) | AnonymousClass004.A1M(iA0T);
                    Object objAaT3 = bfm.AaT();
                    if (zA67 || objAaT3 == obj) {
                        objAaT3 = new AuraNdaScreenKt$AuraNdaScreen$3$3$1$1(uiState, function0);
                        bfm.Ai0(objAaT3);
                    }
                    AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(c1062ATq2, null, null, null, null, null, null, true, (G0U) objAaT3, bfm, 12582918, 126);
                    BBI.A0R(bbiA0M, true);
                    BBI.A0R(bbiA0M, true);
                }
            }
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(uiState, g0u, g0u2, function0, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
    }

    public static final void NdaAgreementWebView(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1111874439);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            final Context contextA0H = AnonymousClass002.A0H(bfm);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            String strM129toCssHex8_81llA = m129toCssHex8_81llA(C3cH.A06(bfm, auraTheme));
            String strM129toCssHex8_81llA2 = m129toCssHex8_81llA(auraTheme.getColors(bfm, 6).link);
            boolean zA1W = AnonymousClass002.A1W(bfm, strM129toCssHex8_81llA2, bfm.A65(strM129toCssHex8_81llA), AnonymousClass001.A1M(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new WebViewState(isHostedUrl(str) ? new WebContent.Url(AnonymousClass002.A0l(str), C0953AJg.A00()) : new WebContent.Data(wrapAgreementHtml(str, strM129toCssHex8_81llA, strM129toCssHex8_81llA2), "https://www.facebook.com/", "utf-8", "text/html", null));
                bfm.Ai0(objAaT);
            }
            WebViewState webViewState = (WebViewState) objAaT;
            boolean zA65 = bfm.A65(contextA0H);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new AccompanistWebViewClient() { // from class: com.facebook.aura.activation.view.AuraNdaScreenKt$NdaAgreementWebView$linkClient$1$1
                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                        String string;
                        Uri url;
                        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
                            string = "";
                        }
                        if (!AnonymousClass006.A1b(ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX, string) && !AnonymousClass006.A1b("https://", string)) {
                            return false;
                        }
                        AuraBrowserLauncherKt.openBrowser(string, contextA0H);
                        return true;
                    }
                };
                bfm.Ai0(objAaT2);
            }
            AccompanistWebViewClient accompanistWebViewClient = (AccompanistWebViewClient) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == C78N.A00) {
                objAaT3 = AuraNdaScreenKt$NdaAgreementWebView$1$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            HatchWebViewKt.WebView(webViewState, bRg2, false, false, false, null, (G0U) objAaT3, null, false, accompanistWebViewClient, null, null, bfm, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 1576320 | (AccompanistWebViewClient.$stable << 27), 0, 3504);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107162(str, bRg2, i, i2);
        }
    }

    public static final void NdaHeader(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1904823450);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            C3TH c3th = C2VU.A00;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass002.A0V(bfm, c3th);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXHugePlus);
            C1SA.A00(bfm, null, C10G.A07(bs0, 64.0f), null, BOf.A00(bfm, R.drawable.hatch_logo, 0), null, null, 0.0f, AVy.$stable | 432, 120);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingLargePlusMicro);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120563), null, colors.primaryText, auraTheme.getTypography(bfm, 6).title2Medium, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            C01N.A05(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120562), null, colors.secondaryText, C3cH.A0B(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107172(bRg2, i, i2);
        }
    }

    public static final void NdaInputFields(String str, String str2, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(224989740);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120561);
            BS0 bs0 = BRg.A00;
            int i4 = (iA0d << 3) & 458752;
            AuraTextInputKt.AuraTextInput(str, strA01, c1062ATq, null, new AuJ(null, -1, 1, 6), null, null, null, true, 0, 0, null, null, null, null, z, false, false, false, null, g0u, bfm, (iA0d & 14) | 100688256, i4, (iA0d >> 6) & 14, 1015528);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingMedium);
            AuraTextInputKt.AuraTextInput(str2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120560), c1062ATq, null, new AuJ(null, -1, 6, 7), null, null, null, true, 0, 0, null, null, null, null, z, false, false, false, null, g0u2, bfm, ((iA0d >> 3) & 14) | 100688256, i4, (iA0d >> 9) & 14, 1015528);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107182(str, str2, g0u, g0u2, z, bRg2, i, i2);
        }
    }

    public static final String addMissingHrefs(String str) {
        return new C06827l3("<a\\b([^>]*)>\\s*(https?://[^<\\s]+)\\s*</a>", EnumC06837l4.A03).A04(str, C107191.INSTANCE);
    }

    public static final boolean isHostedUrl(String str) {
        String strA0l = AnonymousClass002.A0l(str);
        C7384Etj.A0Y(strA0l, 0);
        return (AnonymousClass006.A1b(ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX, strA0l) || AnonymousClass006.A1b("https://", strA0l)) && !C7BY.A0k(strA0l, '<');
    }

    /* renamed from: toCssHex-8_81llA, reason: not valid java name */
    public static final String m129toCssHex8_81llA(long j) {
        return String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(HxS.A01(j) & 16777215)}, 1));
    }

    public static final String wrapAgreementHtml(String str, String str2, String str3) {
        C06827l3 c06827l3;
        StringBuilder sbA0x;
        String strAddMissingHrefs = addMissingHrefs(str);
        String strA05 = C6tn.A05(FGI.A0k("\n      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n      <style>\n        :root { color-scheme: light dark; }\n        html { -webkit-text-size-adjust: 100% !important; }\n        html, body { margin: 0 !important; padding: 0 !important; width: auto !important; max-width: 100% !important; overflow-x: hidden !important; background: transparent !important; color: ", str2, " !important; }\n        body { padding: 16px !important; box-sizing: border-box !important; }\n        p, li, ul, ol, div, section, article, h1, h2, h3, h4, h5, h6, table, blockquote, td, th, span { color: ", str2, " !important; }\n        a { color: ", str3, " !important; }\n        * { max-width: 100% !important; box-sizing: border-box !important; overflow-wrap: break-word !important; word-wrap: break-word !important; background-color: transparent !important; }\n        p, li, ul, ol, div, section, article, h1, h2, h3, h4, h5, h6, table, blockquote { margin-right: 0 !important; }\n        p, div, section, article, h1, h2, h3, h4, h5, h6, blockquote { margin-left: 0 !important; }\n        img, video, svg { height: auto !important; }\n        table { table-layout: fixed !important; width: 100% !important; }\n        td, th { word-break: break-word !important; }\n      </style>\n      "));
        if (C7BY.A0q(strAddMissingHrefs, "</head>", true)) {
            c06827l3 = new C06827l3("</head>", EnumC06837l4.A03);
            sbA0x = C3cG.A0g(strA05);
            sbA0x.append("</head>");
        } else {
            if (!C7BY.A0q(strAddMissingHrefs, "<body", true)) {
                return FGI.A0h("<html><head>", strA05, "</head><body>", strAddMissingHrefs, "</body></html>");
            }
            c06827l3 = new C06827l3("<body[^>]*>", EnumC06837l4.A03);
            sbA0x = C3cI.A0x("$0", strA05);
        }
        String string = sbA0x.toString();
        C7384Etj.A0Y(strAddMissingHrefs, 0);
        String strReplaceFirst = c06827l3.nativePattern.matcher(strAddMissingHrefs).replaceFirst(string);
        C7384Etj.A0U(strReplaceFirst);
        return strReplaceFirst;
    }
}
