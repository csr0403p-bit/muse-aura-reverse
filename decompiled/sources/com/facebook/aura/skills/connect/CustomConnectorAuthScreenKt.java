package com.facebook.aura.skills.connect;

import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
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
import X.ApQ;
import X.AuJ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BOf;
import X.BPg;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0861A6i;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1731ApS;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C19h;
import X.C19i;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1OR;
import X.C1YL;
import X.C1YP;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.CustomConnectorAuthSheetKey;
import com.facebook.aura.skills.connect.CustomConnectorAuthViewModel;
import com.facebook.aura.skills.connect.config.CustomConnectorMode;
import com.facebook.aura.ui.ShadowModifiersKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.divider.AuraDividerStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class CustomConnectorAuthScreenKt {
    public static final String META_GENAI_PRIVACY_URL = "https://www.facebook.com/privacy/genai";

    /* renamed from: com.facebook.aura.skills.connect.CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<CustomConnectorAuthUiState> $uiState$delegate;
        public final /* synthetic */ CustomConnectorAuthViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CustomConnectorAuthViewModel customConnectorAuthViewModel, C1BO<CustomConnectorAuthUiState> c1bo) {
            super(3);
            this.$viewModel = customConnectorAuthViewModel;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                CustomConnectorAuthUiState value = this.$uiState$delegate.getValue();
                CustomConnectorAuthViewModel customConnectorAuthViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(customConnectorAuthViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$3$1$1(customConnectorAuthViewModel);
                    bfm.Ai0(objAaT);
                }
                G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT);
                CustomConnectorAuthViewModel customConnectorAuthViewModel2 = this.$viewModel;
                boolean zA672 = bfm.A67(customConnectorAuthViewModel2);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$3$2$1(customConnectorAuthViewModel2);
                    bfm.Ai0(objAaT2);
                }
                G0U g0u2 = (G0U) ((InterfaceC7353EnQ) objAaT2);
                CustomConnectorAuthViewModel customConnectorAuthViewModel3 = this.$viewModel;
                boolean zA673 = bfm.A67(customConnectorAuthViewModel3);
                Object objAaT3 = bfm.AaT();
                if (zA673 || objAaT3 == C78N.A00) {
                    objAaT3 = new CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$3$3$1(customConnectorAuthViewModel3);
                    bfm.Ai0(objAaT3);
                }
                G0U g0u3 = (G0U) ((InterfaceC7353EnQ) objAaT3);
                CustomConnectorAuthViewModel customConnectorAuthViewModel4 = this.$viewModel;
                boolean zA674 = bfm.A67(customConnectorAuthViewModel4);
                Object objAaT4 = bfm.AaT();
                if (zA674 || objAaT4 == C78N.A00) {
                    objAaT4 = new CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$3$4$1(customConnectorAuthViewModel4);
                    bfm.Ai0(objAaT4);
                }
                Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT4);
                CustomConnectorAuthViewModel customConnectorAuthViewModel5 = this.$viewModel;
                boolean zA675 = bfm.A67(customConnectorAuthViewModel5);
                Object objAaT5 = bfm.AaT();
                if (zA675 || objAaT5 == C78N.A00) {
                    objAaT5 = new CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$3$5$1(customConnectorAuthViewModel5);
                    bfm.Ai0(objAaT5);
                }
                CustomConnectorAuthScreenKt.CustomConnectorAuthSheetContent(value, g0u, g0u2, g0u3, function0, (Function0) ((InterfaceC7353EnQ) objAaT5), bfm, CustomConnectorAuthUiState.$stable);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ CustomConnectorAuthSheetKey $navKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(CustomConnectorAuthSheetKey customConnectorAuthSheetKey, int i) {
            super(2);
            this.$navKey = customConnectorAuthSheetKey;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            CustomConnectorAuthScreenKt.CustomConnectorAuthScreen(this.$navKey, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.CustomConnectorAuthScreenKt$CustomConnectorAuthSheetContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onAddClick;
        public final /* synthetic */ G0U<String, Unit> $onApiKeyChanged;
        public final /* synthetic */ Function0<Unit> $onCancelClick;
        public final /* synthetic */ G0U<String, Unit> $onClientIdChanged;
        public final /* synthetic */ G0U<String, Unit> $onClientSecretChanged;
        public final /* synthetic */ CustomConnectorAuthUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(CustomConnectorAuthUiState customConnectorAuthUiState, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$uiState = customConnectorAuthUiState;
            this.$onApiKeyChanged = g0u;
            this.$onClientIdChanged = g0u2;
            this.$onClientSecretChanged = g0u3;
            this.$onAddClick = function0;
            this.$onCancelClick = function02;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CustomConnectorAuthScreenKt.CustomConnectorAuthSheetContent(this.$uiState, this.$onApiKeyChanged, this.$onClientIdChanged, this.$onClientSecretChanged, this.$onAddClick, this.$onCancelClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.CustomConnectorAuthScreenKt$CustomConnectorDisclaimers$2, reason: invalid class name and case insensitive filesystem */
    public final class C137862 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137862(BRg bRg, int i, int i2) {
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
            CustomConnectorAuthScreenKt.CustomConnectorDisclaimers(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.CustomConnectorAuthScreenKt$CustomConnectorOAuthFields$2, reason: invalid class name and case insensitive filesystem */
    public final class C137872 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $clientId;
        public final /* synthetic */ String $clientSecret;
        public final /* synthetic */ G0U<String, Unit> $onClientIdChanged;
        public final /* synthetic */ G0U<String, Unit> $onClientSecretChanged;
        public final /* synthetic */ boolean $requiresClientSecret;
        public final /* synthetic */ C07C $this_CustomConnectorOAuthFields;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C137872(C07C c07c, String str, String str2, boolean z, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, int i) {
            super(2);
            this.$this_CustomConnectorOAuthFields = c07c;
            this.$clientId = str;
            this.$clientSecret = str2;
            this.$requiresClientSecret = z;
            this.$onClientIdChanged = g0u;
            this.$onClientSecretChanged = g0u2;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CustomConnectorAuthScreenKt.CustomConnectorOAuthFields(this.$this_CustomConnectorOAuthFields, this.$clientId, this.$clientSecret, this.$requiresClientSecret, this.$onClientIdChanged, this.$onClientSecretChanged, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void CustomConnectorAuthScreen(CustomConnectorAuthSheetKey customConnectorAuthSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(customConnectorAuthSheetKey, 0);
        bfm.AgG(-1590497000);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, customConnectorAuthSheetKey) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Context contextA0O = AnonymousClass003.A0O(bfm);
            CustomConnectorAuthViewModel.Factory factory = new CustomConnectorAuthViewModel.Factory(customConnectorAuthSheetKey.url, AnonymousClass002.A0h(bfm), customConnectorAuthSheetKey.origin, customConnectorAuthSheetKey.sourceSessionId);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            CustomConnectorAuthViewModel customConnectorAuthViewModel = (CustomConnectorAuthViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(CustomConnectorAuthViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, customConnectorAuthViewModel.uiState);
            boolean zA1S = AnonymousClass005.A1S(bfm, customConnectorAuthViewModel, contextA0O, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1S || objAaT == C78N.A00) {
                objAaT = new CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$1$1(customConnectorAuthViewModel, contextA0O, auraNavigatorA0b, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, customConnectorAuthViewModel);
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            boolean zA67 = bfm.A67(customConnectorAuthViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$2$1(customConnectorAuthViewModel);
                bfm.Ai0(objAaT2);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, null, null, null, null, null, (Function0) ((InterfaceC7353EnQ) objAaT2), false, false, false, null, B1V.A00(bfm, new AnonymousClass3(customConnectorAuthViewModel, c1boA02), 67117909), bfm, 6, 48, 1982);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(customConnectorAuthSheetKey, i);
        }
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomConnectorMode.values().length];
            try {
                AnonymousClass002.A13(CustomConnectorMode.API_KEY, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(CustomConnectorMode.OAUTH, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void CustomConnectorDisclaimers(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-111702833);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg2) : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = HatchIdentityProvider.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            C1BO c1boA02 = C2CK.A02(bfm, ((HatchIdentityProvider) objAaT).aiIdentityName);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d39);
            String strA0t = AnonymousClass001.A0t(bfm, strA01, R.string._name_removed__res_0x7f1208a7);
            int iA09 = AnonymousClass007.A09(strA0t, strA01);
            long jA07 = C06G.A07(bfm);
            boolean zA1T = AnonymousClass002.A1T(bfm, jA07, AnonymousClass003.A1K(bfm, strA0t, strA01), bfm.A63(iA09));
            Object objAaT2 = bfm.AaT();
            if (zA1T || objAaT2 == C78N.A00) {
                C1731ApS c1731ApSA0X = AnonymousClass006.A0X(strA0t);
                if (iA09 >= 0) {
                    long j = C1809ArT.A01;
                    C1824Aro c1824Aro = new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, jA07, j, j, B6A.A07);
                    int length = strA01.length() + iA09;
                    c1731ApSA0X.A0A(c1824Aro, iA09, length);
                    c1731ApSA0X.A0B(new C1OR("https://www.facebook.com/privacy/genai"), iA09, length);
                }
                objAaT2 = c1731ApSA0X.A04();
                bfm.Ai0(objAaT2);
            }
            ApQ apQ = (ApQ) objAaT2;
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
            C1822Arm c1822ArmA0S = C06G.A0S(bfm);
            long jA08 = C06G.A08(bfm);
            BS0 bs0 = BRg.A00;
            boolean zA1J = AnonymousClass003.A1J(bfm, apQ, contextA0H);
            Object objAaT3 = bfm.AaT();
            if (zA1J || objAaT3 == C78N.A00) {
                objAaT3 = new CustomConnectorAuthScreenKt$CustomConnectorDisclaimers$1$1$1(apQ, contextA0H);
                bfm.Ai0(objAaT3);
            }
            AuraTextKt.m2638AuraClickableTextZsD2BWI(apQ, c1062ATq, (G0U) objAaT3, null, null, null, false, jA08, c1822ArmA0S, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 48, 0, 1048184);
            C01N.A08(bfm, bs0, 20.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, c1boA02.getValue(), R.string._name_removed__res_0x7f1208a2), c1062ATq, C06G.A08(bfm), C06G.A0S(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137862(bRg2, i, i2);
        }
    }

    /* renamed from: CustomConnectorTextField-KznfkUg, reason: not valid java name */
    public static final void m2093CustomConnectorTextFieldKznfkUg(String str, String str2, G0U<? super String, Unit> g0u, boolean z, C19h c19h, int i, BFM bfm, int i2, int i3) {
        boolean z2 = z;
        int i4 = i;
        C19h c19h2 = c19h;
        bfm.AgG(294555166);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i5 = i3 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        int i6 = i3 & 16;
        if (i6 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, c19h2);
        }
        int i7 = i3 & 32;
        int iA0H = 196608;
        if (i7 != 0) {
            iA0d |= iA0H;
        } else if ((196608 & i2) == 0) {
            iA0H = AnonymousClass004.A0H(bfm, i4);
            iA0d |= iA0H;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i5 != 0) {
                z2 = false;
            }
            if (i6 != 0) {
                c19h2 = C19i.A00;
            }
            if (i7 != 0) {
                i4 = 1;
            }
            AuraTextInputKt.AuraTextInput(str, null, null, B1V.A00(bfm, new CustomConnectorAuthScreenKt$CustomConnectorTextField$1(str2), -265452238), new AuJ(null, -1, i4, -1), null, c19h2, null, true, 0, 0, null, null, null, null, false, z2, false, false, null, g0u, bfm, (iA0d & 14) | 100666368 | ((iA0d << 6) & 3670016), (iA0d << 9) & 3670016, (iA0d >> 6) & 14, 982694);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new CustomConnectorAuthScreenKt$CustomConnectorTextField$2(str, str2, g0u, z2, c19h2, i4, i2, i3);
        }
    }

    public static final void CustomConnectorAuthSheetContent(CustomConnectorAuthUiState customConnectorAuthUiState, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        float f;
        int iOrdinal;
        bfm.AgG(-840330742);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(customConnectorAuthUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0u3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA05, 74898), bfm, iA05)) {
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            C3TH c3th = C2VU.A00;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u4 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u4);
            int iA00 = C01N.A00(bfm, bs0, 24.0f);
            C1D3 c1d3A00 = C1D8.A00(14.0f);
            BRg bRgA07 = C10G.A07(bs0, 48.0f);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA03 = C11U.A03(C1b8.A03(ShadowModifiersKt.m2345elevationShadow6ILLrsY(bRgA07, 3.0f, c1d3A00, C06G.A0F(bfm, akh), 0.08f), c1d3A00, AnonymousClass001.A0f(bfm, akh).onMedia), c1d3A00);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA03);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u4, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.shield_lock_wght400_outline_24, 0), AuraIconSize.MEDIUM, null, AnonymousClass001.A0f(bfm, akh).onLight, null, bfm, AnonymousClass001.A03(), 41);
            BBI.A0R(bbi, true);
            C01N.A08(bfm, bs0, 12.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120eb3), C3U4.A0B(c1062ATq, 24.0f, 0.0f), C06G.A0C(bfm), AnonymousClass002.A0f(bfm).title3Emphasized, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            C01N.A08(bfm, bs0, 8.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208a9), C3U4.A0B(c1062ATq, 24.0f, 0.0f), C06G.A08(bfm), C06G.A0Z(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            C01N.A08(bfm, bs0, 28.0f);
            BRg bRgA0B = C3U4.A0B(c1062ATq, 24.0f, 0.0f);
            C3TH c3th2 = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th2, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u4, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            C90l c90l = C90l.A00;
            if (customConnectorAuthUiState.isInvalidLink) {
                f = 12.0f;
                bfm.AgE(1984648068);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1983228671);
                f = 12.0f;
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208a8), c1062ATq, C06G.A08(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                C01N.A08(bfm, bs0, 28.0f);
                if (C7BY.A0j(customConnectorAuthUiState.connectorHost)) {
                    bfm.AgE(1983778084);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(1983550327);
                    String str = customConnectorAuthUiState.connectorHost;
                    Object objAaT = bfm.AaT();
                    if (objAaT == C78N.A00) {
                        objAaT = CustomConnectorAuthScreenKt$CustomConnectorAuthSheetContent$1$2$1$1.INSTANCE;
                        bfm.Ai0(objAaT);
                    }
                    m2093CustomConnectorTextFieldKznfkUg(str, "", (G0U) objAaT, true, null, 0, bfm, 3504, 48);
                    C01N.A04(bfm, bbi, bs0, 16.0f, false);
                }
                CustomConnectorMode customConnectorMode = customConnectorAuthUiState.mode;
                if (customConnectorMode == null || (iOrdinal = customConnectorMode.ordinal()) == -1) {
                    bfm.AgE(756756866);
                    BBI.A0R(bbi, false);
                } else if (iOrdinal == 0) {
                    bfm.AgE(756732643);
                    m2093CustomConnectorTextFieldKznfkUg(customConnectorAuthUiState.apiKey, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208a3), g0u, false, new C1YP(), 7, bfm, ((iA05 << 3) & 896) | 196608, 8);
                    BBI.A0R(bbi, false);
                } else {
                    if (iOrdinal != 1) {
                        throw AnonymousClass003.A0k(bfm, bbi, 756730681);
                    }
                    bfm.AgE(1984269124);
                    int i3 = iA05 << 6;
                    CustomConnectorOAuthFields(c90l, customConnectorAuthUiState.clientId, customConnectorAuthUiState.clientSecret, customConnectorAuthUiState.requiresClientSecret, g0u2, g0u3, bfm, AnonymousClass001.A08(i3, (i3 & 57344) | 6));
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, false);
            }
            if (customConnectorAuthUiState.showRetryableError || customConnectorAuthUiState.isInvalidLink) {
                bfm.AgE(1984724018);
                C01N.A08(bfm, bs0, f);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208a6);
                C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
                long j2 = AnonymousClass002.A0c(bfm).errorText;
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = CustomConnectorAuthScreenKt$CustomConnectorAuthSheetContent$1$2$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(c1062ATq, objAaT2, false), j2, c1822ArmA0Y, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1985079588);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            C01N.A08(bfm, bs0, 24.0f);
            if (customConnectorAuthUiState.isInvalidLink) {
                bfm.AgE(-402612882);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-402820458);
                AuraDividerKt.AuraDivider(null, AuraDividerStyle.Elevated.INSTANCE, false, bfm, 48, 5);
                C01N.A08(bfm, bs0, 16.0f);
                CustomConnectorDisclaimers(C3U4.A0B(bs0, 24.0f, 0.0f), bfm, iA00, 0);
                C01N.A04(bfm, bbi, bs0, 28.0f, false);
            }
            BRg bRgA0B2 = C3U4.A0B(c1062ATq, 24.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA003 = C06I.A00(interfaceC1185Ado, bfm, c3th2, 0);
            int iA0D3 = AnonymousClass001.A0D(bbi);
            AKQ akqA044 = BBI.A04(bbi);
            BRg bRgA014 = AxM.A01(bfm, bRgA0B2);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA003, g0v);
            BPg.A02(bfm, akqA044, g0v2);
            AnonymousClass003.A15(g0u4, g0vA19, bfm, iA0D3);
            BPg.A02(bfm, bRgA014, g0vA0u);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208a1);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStylePrimary = auraButtonStyles.primary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, c1062ATq, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, customConnectorAuthUiState.addEnabled, customConnectorAuthUiState.isSubmitting, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, iA05 & 57344, 0, 134199749);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12117e), null, c1062ATq, auraButtonStyles.tertiary(null, bfm, 48, 1), auraButtonSize, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA05 >> 3) & 57344, 0, 134201285);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(customConnectorAuthUiState, g0u, g0u2, g0u3, function0, function02, i);
        }
    }

    public static final void CustomConnectorOAuthFields(C07C c07c, String str, String str2, boolean z, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, BFM bfm, int i) {
        bfm.AgG(142836710);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0u2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 74899, 74898), bfm, iA0d)) {
            int i2 = z ? 2 : 1;
            boolean zA63 = bfm.A63(i2) | AnonymousClass003.A1C(iA0d) | AnonymousClass003.A1F(57344, iA0d, 16384) | AnonymousClass003.A1E(iA0d) | AnonymousClass003.A1D(iA0d) | ((458752 & iA0d) == 131072);
            Object objAaT = bfm.AaT();
            if (zA63 || objAaT == C78N.A00) {
                objAaT = new CustomConnectorAuthScreenKt$CustomConnectorOAuthFields$1$1(z, i2, str, g0u, str2, g0u2);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0p(c07c, bfm, objAaT, iA0d);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137872(c07c, str, str2, z, g0u, g0u2, i);
        }
    }

    public static final /* synthetic */ CustomConnectorAuthUiState access$CustomConnectorAuthScreen$lambda$0(C1BO c1bo) {
        return (CustomConnectorAuthUiState) c1bo.getValue();
    }
}
