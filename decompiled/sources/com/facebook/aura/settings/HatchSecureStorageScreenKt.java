package com.facebook.aura.settings;

import X.AKH;
import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
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
import X.AxM;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06H;
import X.C06I;
import X.C07C;
import X.C0881AGi;
import X.C0Hi;
import X.C0ob;
import X.C0v2;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1518AkS;
import X.C1822Arm;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1DM;
import X.C1DP;
import X.C1YD;
import X.C1YL;
import X.C1YY;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.C7bA;
import X.C90l;
import X.C90m;
import X.EnumC3085Bxl;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import android.net.Uri;
import android.view.autofill.AutofillManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.header.view.HatchBackClickAnalytics;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.navigation.key.SecureStorageCredentialDetailsScreenKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.ui.ShadowModifiersKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.input.AuraTextInputDefaults;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColorsTextInput;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchSecureStorageScreenKt {
    public static final int CAPTURE_CREDENTIAL_ROW_COUNT = 2;

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$CredentialAgentPermissionRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ boolean $selected;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$selected = z;
            this.$enabled = z2;
            this.$onClick = function0;
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
            HatchSecureStorageScreenKt.CredentialAgentPermissionRow(this.$text, this.$selected, this.$enabled, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$CustomConnectorRow$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ CustomConnectorCandidate $connector;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CustomConnectorCandidate customConnectorCandidate, Function0<Unit> function0, int i) {
            super(2);
            this.$connector = customConnectorCandidate;
            this.$onClick = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSecureStorageScreenKt.CustomConnectorRow(this.$connector, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $addButtonText;
        public final /* synthetic */ boolean $canSave;
        public final /* synthetic */ String $cancelButtonText;
        public final /* synthetic */ String $captureAuthorization;
        public final /* synthetic */ C0Hi $focusManager;
        public final /* synthetic */ MutableState<String> $idempotencyKey$delegate;
        public final /* synthetic */ String $initialPageUrl;
        public final /* synthetic */ boolean $isFromChat;
        public final /* synthetic */ boolean $isOriginPrefilled;
        public final /* synthetic */ MutableState<Boolean> $isPasswordVisible$delegate;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ MutableState<String> $password$delegate;
        public final /* synthetic */ String $passwordLabel;
        public final /* synthetic */ boolean $passwordTooLong;
        public final /* synthetic */ MutableState<Boolean> $saveToSecureStorage$delegate;
        public final /* synthetic */ String $savingButtonText;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ boolean $showSaveToSecureStorageToggle;
        public final /* synthetic */ C1BO<SecureStorageCaptureUiState> $uiState$delegate;
        public final /* synthetic */ MutableState<String> $username$delegate;
        public final /* synthetic */ String $usernameLabel;
        public final /* synthetic */ boolean $usernameTooLong;
        public final /* synthetic */ HatchCredentialsViewModel $viewModel;
        public final /* synthetic */ MutableState<String> $website$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(boolean z, String str, MutableState<String> mutableState, C1BO<SecureStorageCaptureUiState> c1bo, MutableState<String> mutableState2, HatchCredentialsViewModel hatchCredentialsViewModel, MutableState<String> mutableState3, String str2, boolean z2, MutableState<String> mutableState4, C0Hi c0Hi, boolean z3, MutableState<Boolean> mutableState5, String str3, String str4, boolean z4, boolean z5, String str5, boolean z6, String str6, String str7, String str8, Function0<Unit> function0, MutableState<Boolean> mutableState6) {
            super(3);
            this.$isOriginPrefilled = z;
            this.$initialPageUrl = str;
            this.$website$delegate = mutableState;
            this.$uiState$delegate = c1bo;
            this.$idempotencyKey$delegate = mutableState2;
            this.$viewModel = hatchCredentialsViewModel;
            this.$username$delegate = mutableState3;
            this.$usernameLabel = str2;
            this.$usernameTooLong = z2;
            this.$password$delegate = mutableState4;
            this.$focusManager = c0Hi;
            this.$canSave = z3;
            this.$saveToSecureStorage$delegate = mutableState5;
            this.$sessionId = str3;
            this.$captureAuthorization = str4;
            this.$isFromChat = z4;
            this.$passwordTooLong = z5;
            this.$passwordLabel = str5;
            this.$showSaveToSecureStorageToggle = z6;
            this.$savingButtonText = str6;
            this.$addButtonText = str7;
            this.$cancelButtonText = str8;
            this.$onDismiss = function0;
            this.$isPasswordVisible$delegate = mutableState6;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            int i2;
            String strA0s;
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA0B = C3U4.A0B(c1062ATq, 24.0f, 0.0f);
                C3TH c3th = C2VU.A00;
                boolean z = this.$isOriginPrefilled;
                String str = this.$initialPageUrl;
                MutableState<String> mutableState = this.$website$delegate;
                C1BO<SecureStorageCaptureUiState> c1bo = this.$uiState$delegate;
                MutableState<String> mutableState2 = this.$idempotencyKey$delegate;
                HatchCredentialsViewModel hatchCredentialsViewModel = this.$viewModel;
                MutableState<String> mutableState3 = this.$username$delegate;
                String str2 = this.$usernameLabel;
                boolean z2 = this.$usernameTooLong;
                MutableState<String> mutableState4 = this.$password$delegate;
                C0Hi c0Hi = this.$focusManager;
                boolean z3 = this.$canSave;
                MutableState<Boolean> mutableState5 = this.$saveToSecureStorage$delegate;
                String str3 = this.$sessionId;
                String str4 = this.$captureAuthorization;
                boolean z4 = this.$isFromChat;
                boolean z5 = this.$passwordTooLong;
                String str5 = this.$passwordLabel;
                boolean z6 = this.$showSaveToSecureStorageToggle;
                String str6 = this.$savingButtonText;
                String str7 = this.$addButtonText;
                String str8 = this.$cancelButtonText;
                Function0<Unit> function0 = this.$onDismiss;
                MutableState<Boolean> mutableState6 = this.$isPasswordVisible$delegate;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th, 48);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i3 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0B);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i3);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                C90l c90l = C90l.A00;
                int iA00 = C01N.A00(bfm, bs0, 24.0f);
                C1D3 c1d3A00 = C1D8.A00(14.0f);
                BRg bRgA07 = C10G.A07(bs0, 48.0f);
                AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
                BRg bRgA03 = C11U.A03(C1b8.A03(ShadowModifiersKt.m2345elevationShadow6ILLrsY(bRgA07, 3.0f, c1d3A00, C06G.A0F(bfm, akh), 0.08f), c1d3A00, AnonymousClass001.A0f(bfm, akh).onMedia), c1d3A00);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA03);
                AnonymousClass005.A0n(bfm, bbi, function02);
                BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.ic_secure_lock, 0), AuraIconSize.MEDIUM, null, AnonymousClass001.A0f(bfm, akh).onLight, null, bfm, AnonymousClass001.A03(), 41);
                BBI.A0R(bbi, true);
                C01N.A08(bfm, bs0, 12.0f);
                if (z) {
                    bfm.AgE(748380381);
                    i2 = R.string._name_removed__res_0x7f120e8c;
                } else {
                    bfm.AgE(748481441);
                    i2 = R.string._name_removed__res_0x7f120eb3;
                }
                String strA0s2 = AnonymousClass001.A0s(bfm, bbi, i2);
                C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title3Emphasized;
                long jA0C = C06G.A0C(bfm);
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$2$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA0s2, AnonymousClass001.A0Y(c1062ATq, objAaT, false), jA0C, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                C01N.A08(bfm, bs0, 8.0f);
                if (z) {
                    bfm.AgE(748904498);
                    strA0s = AnonymousClass003.A0f(bfm, bbi, HatchSecureStorageScreenKt.secureStorageDisplayHost(str), R.string._name_removed__res_0x7f120e8b);
                } else {
                    bfm.AgE(749108323);
                    strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120e8d);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA0s, c1062ATq, C06G.A08(bfm), C06G.A0Y(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
                C01N.A08(bfm, bs0, 28.0f);
                if (!z) {
                    bfm.AgE(749494025);
                    boolean zA1T = AnonymousClass001.A1T(bfm, hatchCredentialsViewModel, AnonymousClass005.A1R(bfm, mutableState, c1bo, mutableState2));
                    Object objAaT2 = bfm.AaT();
                    if (zA1T || objAaT2 == obj) {
                        objAaT2 = new HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$3$1(mutableState, mutableState2, hatchCredentialsViewModel, c1bo);
                        bfm.Ai0(objAaT2);
                    }
                    HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT2, bfm, iA00, 7);
                    C01N.A08(bfm, bs0, 16.0f);
                } else {
                    bfm.AgE(750497309);
                }
                BBI.A0R(bbi, false);
                boolean zA1W = AnonymousClass004.A1W(bfm, str5, z5, AnonymousClass004.A1U(bfm, str4, AnonymousClass005.A1T(bfm, mutableState, mutableState5, str3, AnonymousClass001.A1U(bfm, z3, AnonymousClass001.A1T(bfm, c0Hi, AnonymousClass005.A1U(bfm, mutableState2, hatchCredentialsViewModel, mutableState4, AnonymousClass001.A1U(bfm, z2, AnonymousClass005.A1R(bfm, mutableState3, c1bo, str2)))))), z4));
                Object objAaT3 = bfm.AaT();
                if (zA1W || objAaT3 == obj) {
                    objAaT3 = new HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1(z2, mutableState3, mutableState2, hatchCredentialsViewModel, c1bo, str2, c0Hi, z3, mutableState, mutableState4, mutableState5, str3, str4, z4, z5, mutableState6, str5);
                    bfm.Ai0(objAaT3);
                }
                HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT3, bfm, iA00, 7);
                if (z6) {
                    bfm.AgE(755924293);
                    C01N.A08(bfm, bs0, 16.0f);
                    boolean zA0A = MutableState.A0A((MutableState) mutableState5);
                    boolean z7 = !c1bo.getValue().isSaving;
                    boolean zA1T2 = AnonymousClass001.A1T(bfm, hatchCredentialsViewModel, AnonymousClass005.A1T(bfm, str4, mutableState5, mutableState2, bfm.A66(z4)));
                    Object objAaT4 = bfm.AaT();
                    if (zA1T2 || objAaT4 == obj) {
                        objAaT4 = new HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$5$1(z4, str4, hatchCredentialsViewModel, mutableState5, mutableState2);
                        bfm.Ai0(objAaT4);
                    }
                    HatchSecureStorageScreenKt.SecureStoragePersistenceToggle(zA0A, z7, (G0U) objAaT4, bfm, 0);
                } else {
                    bfm.AgE(756500893);
                }
                BBI.A0R(bbi, false);
                Integer numErrorResource = HatchCredentialCaptureErrorKt.errorResource(c1bo.getValue());
                if (numErrorResource == null) {
                    bfm.AgE(756544354);
                    BBI.A0R(bbi, false);
                } else {
                    String strA0g = AnonymousClass003.A0g(bfm, numErrorResource, 756544355);
                    C1822Arm c1822ArmA0T = C06G.A0T(bfm);
                    long j2 = AnonymousClass002.A0c(bfm).error;
                    BRg bRgA0C = C3U4.A0C(c1062ATq, 0.0f, 12.0f, 0.0f, 0.0f);
                    Object objAaT5 = bfm.AaT();
                    if (objAaT5 == obj) {
                        objAaT5 = HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$6$1$1.INSTANCE;
                        bfm.Ai0(objAaT5);
                    }
                    AuraTextKt.m2639AuraTextUY9GdpU(strA0g, AnonymousClass001.A0Y(bRgA0C, objAaT5, false), j2, c1822ArmA0T, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                    BBI.A0R(bbi, false);
                }
                C01N.A08(bfm, bs0, 40.0f);
                if (c1bo.getValue().isSaving) {
                    str7 = str6;
                }
                AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
                AuraLabelButtonStyle auraLabelButtonStylePrimary = auraButtonStyles.primary(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                boolean z8 = c1bo.getValue().isSaving;
                boolean zA1V = AnonymousClass004.A1V(bfm, c0Hi, z4, AnonymousClass001.A1R(bfm, str4, AnonymousClass005.A1T(bfm, mutableState5, mutableState2, str3, AnonymousClass005.A1T(bfm, mutableState, mutableState3, mutableState4, bfm.A67(hatchCredentialsViewModel)))));
                Object objAaT6 = bfm.AaT();
                if (zA1V || objAaT6 == obj) {
                    objAaT6 = new HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$7$1(hatchCredentialsViewModel, str3, str4, z4, c0Hi, mutableState, mutableState3, mutableState4, mutableState5, mutableState2);
                    bfm.Ai0(objAaT6);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, str7, null, c1062ATq, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, z3, z8, false, null, null, (Function0) objAaT6, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134199749);
                AuraLabelButtonStyle auraLabelButtonStyleTertiary = auraButtonStyles.tertiary(null, bfm, 48, 1);
                boolean z9 = !c1bo.getValue().isSaving;
                boolean zA1S = AnonymousClass003.A1S(bfm, function0, z4);
                Object objAaT7 = bfm.AaT();
                if (zA1S || objAaT7 == obj) {
                    objAaT7 = new HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$8$1(z4, function0);
                    bfm.Ai0(objAaT7);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, str8, null, c1062ATq, auraLabelButtonStyleTertiary, auraButtonSize, null, false, false, z9, false, false, null, null, (Function0) objAaT7, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134200773);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $captureAuthorization;
        public final /* synthetic */ String $initialPageUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ String $passwordLabel;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ boolean $showSaveToSecureStorageToggle;
        public final /* synthetic */ String $usernameLabel;
        public final /* synthetic */ HatchCredentialsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(String str, String str2, String str3, String str4, String str5, HatchCredentialsViewModel hatchCredentialsViewModel, Function0<Unit> function0, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$initialPageUrl = str;
            this.$usernameLabel = str2;
            this.$passwordLabel = str3;
            this.$sessionId = str4;
            this.$captureAuthorization = str5;
            this.$viewModel = hatchCredentialsViewModel;
            this.$onDismiss = function0;
            this.$showSaveToSecureStorageToggle = z;
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
            HatchSecureStorageScreenKt.HatchSecureStorageCaptureSheet(this.$initialPageUrl, this.$usernameLabel, this.$passwordLabel, this.$sessionId, this.$captureAuthorization, this.$viewModel, this.$onDismiss, this.$showSaveToSecureStorageToggle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ HatchCredentialsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, HatchCredentialsViewModel hatchCredentialsViewModel, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$key = secureStorageCredentialDetailsScreenKey;
            this.$viewModel = hatchCredentialsViewModel;
            this.$onBack = function0;
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
            HatchSecureStorageScreenKt.HatchSecureStorageCredentialDetailsScreen(this.$key, this.$viewModel, this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$6, reason: invalid class name and case insensitive filesystem */
    public final class C135686 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<CredentialAgentPermission> $editableAgentPermission$delegate;
        public final /* synthetic */ MutableState<String> $editablePassword$delegate;
        public final /* synthetic */ MutableState<String> $editableUsername$delegate;
        public final /* synthetic */ C0Hi $focusManager;
        public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
        public final /* synthetic */ MutableState<Boolean> $isPasswordVisible$delegate;
        public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
        public final /* synthetic */ C1BO<SecureStorageCredentialDetailsUiState> $uiState$delegate;
        public final /* synthetic */ HatchCredentialsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135686(MutableState<Boolean> mutableState, SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, Context context, C0Hi c0Hi, MutableState<Boolean> mutableState2, HatchCredentialsViewModel hatchCredentialsViewModel, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<CredentialAgentPermission> mutableState5, C1BO<SecureStorageCredentialDetailsUiState> c1bo) {
            super(2);
            this.$isEditing$delegate = mutableState;
            this.$key = secureStorageCredentialDetailsScreenKey;
            this.$context = context;
            this.$focusManager = c0Hi;
            this.$isPasswordVisible$delegate = mutableState2;
            this.$viewModel = hatchCredentialsViewModel;
            this.$editableUsername$delegate = mutableState3;
            this.$editablePassword$delegate = mutableState4;
            this.$editableAgentPermission$delegate = mutableState5;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.BFM r27, int r28) {
            /*
                Method dump skipped, instructions count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchSecureStorageScreenKt.C135686.invoke(X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<CredentialAgentPermission> $editableAgentPermission$delegate;
        public final /* synthetic */ MutableState<String> $editablePassword$delegate;
        public final /* synthetic */ MutableState<String> $editableUsername$delegate;
        public final /* synthetic */ C0Hi $focusManager;
        public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
        public final /* synthetic */ MutableState<Boolean> $isPasswordVisible$delegate;
        public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
        public final /* synthetic */ String $loadingDescription;
        public final /* synthetic */ String $passwordMask;
        public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;
        public final /* synthetic */ C1BO<SecureStorageCredentialDetailsUiState> $uiState$delegate;
        public final /* synthetic */ C1518AkS $usernameFocusRequester;
        public final /* synthetic */ HatchCredentialsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, String str, HatchCredentialsViewModel hatchCredentialsViewModel, C1BO<SecureStorageCredentialDetailsUiState> c1bo, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, String str2, MutableState<Boolean> mutableState4, C0Hi c0Hi, MutableState<CredentialAgentPermission> mutableState5, MutableState<Boolean> mutableState6, C1518AkS c1518AkS) {
            super(4);
            this.$key = secureStorageCredentialDetailsScreenKey;
            this.$loadingDescription = str;
            this.$viewModel = hatchCredentialsViewModel;
            this.$uiState$delegate = c1bo;
            this.$isEditing$delegate = mutableState;
            this.$editableUsername$delegate = mutableState2;
            this.$editablePassword$delegate = mutableState3;
            this.$passwordMask = str2;
            this.$isPasswordVisible$delegate = mutableState4;
            this.$focusManager = c0Hi;
            this.$editableAgentPermission$delegate = mutableState5;
            this.$showDeleteConfirmation$delegate = mutableState6;
            this.$usernameFocusRequester = c1518AkS;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1962invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x01cf  */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1962invokei1RSzL4(float r43, float r44, X.BFM r45, int r46) {
            /*
                Method dump skipped, instructions count: 617
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchSecureStorageScreenKt.AnonymousClass7.m1962invokei1RSzL4(float, float, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelLabel;
        public final /* synthetic */ String $deleteLabel;
        public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
        public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;
        public final /* synthetic */ HatchCredentialsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(String str, SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, MutableState<Boolean> mutableState, HatchCredentialsViewModel hatchCredentialsViewModel, String str2) {
            super(2);
            this.$deleteLabel = str;
            this.$key = secureStorageCredentialDetailsScreenKey;
            this.$showDeleteConfirmation$delegate = mutableState;
            this.$viewModel = hatchCredentialsViewModel;
            this.$cancelLabel = str2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$cancelLabel, AnonymousClass001.A1T(bfm, this.$viewModel, AnonymousClass001.A1R(bfm, this.$showDeleteConfirmation$delegate, AnonymousClass001.A1T(bfm, this.$key, bfm.A65(this.$deleteLabel)))));
                String str = this.$deleteLabel;
                String str2 = this.$cancelLabel;
                SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey = this.$key;
                HatchCredentialsViewModel hatchCredentialsViewModel = this.$viewModel;
                MutableState<Boolean> mutableState = this.$showDeleteConfirmation$delegate;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$8$1$1(str, str2, secureStorageCredentialDetailsScreenKey, hatchCredentialsViewModel, mutableState);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C135692 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onAdd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135692(Function0<Unit> function0) {
            super(2);
            this.$onAdd = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                AVy aVyA00 = BOf.A00(bfm, R.drawable.plus_wght400_outline_24, 0);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e8a);
                boolean zA65 = bfm.A65(this.$onAdd);
                Function0<Unit> function0 = this.$onAdd;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchSecureStorageScreenKt$HatchSecureStorageScreen$2$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass005.A0o(bfm, aVyA00, strA01, (Function0) objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $catalogIsEmpty;
        public final /* synthetic */ List<SecureStorageCatalogRow> $catalogRows;
        public final /* synthetic */ String $loadingDescription;
        public final /* synthetic */ Function0<Unit> $onAdd;
        public final /* synthetic */ G0U<CredentialCandidate, Unit> $onCredentialClick;
        public final /* synthetic */ G0U<CustomConnectorCandidate, Unit> $onCustomConnectorClick;
        public final /* synthetic */ C1BO<SecureStorageCatalogUiState> $uiState$delegate;
        public final /* synthetic */ HatchCredentialsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(boolean z, String str, HatchCredentialsViewModel hatchCredentialsViewModel, List<? extends SecureStorageCatalogRow> list, G0U<? super CredentialCandidate, Unit> g0u, G0U<? super CustomConnectorCandidate, Unit> g0u2, C1BO<SecureStorageCatalogUiState> c1bo, Function0<Unit> function0) {
            super(4);
            this.$catalogIsEmpty = z;
            this.$loadingDescription = str;
            this.$viewModel = hatchCredentialsViewModel;
            this.$catalogRows = list;
            this.$onCredentialClick = g0u;
            this.$onCustomConnectorClick = g0u2;
            this.$uiState$delegate = c1bo;
            this.$onAdd = function0;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1963invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1963invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            if (this.$uiState$delegate.getValue().isLoading && this.$catalogIsEmpty) {
                bfm.AgE(141471719);
                BRg bRgA0A = C3U4.A0A(C10G.A01, f, f2);
                boolean zA65 = bfm.A65(this.$loadingDescription);
                String str = this.$loadingDescription;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$1$1(str);
                    bfm.Ai0(objAaT);
                }
                HatchScreenLoadingStateKt.HatchScreenLoadingState(AnonymousClass001.A0Y(bRgA0A, objAaT, false), bfm, 0, 0);
            } else if (this.$uiState$delegate.getValue().hasError && this.$catalogIsEmpty) {
                bfm.AgE(141485297);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ea4);
                Object obj = this.$viewModel;
                boolean zA67 = bfm.A67(obj);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$2$1(obj);
                    bfm.Ai0(objAaT2);
                }
                Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT2);
                BRg bRgA0A2 = C3U4.A0A(C10G.A01, f, f2);
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == C78N.A00) {
                    objAaT3 = HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$3$1.INSTANCE;
                    bfm.Ai0(objAaT3);
                }
                BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0A2, objAaT3, false);
                HatchScreen hatchScreen = HatchScreen.SECURE_STORAGE_LIST;
                HatchScreenErrorStateKt.HatchScreenErrorState(strA01, function0, HatchSecureStorageScreenKt.secureStorageImpression(bRgA0Y, hatchScreen, HatchComponent.SECURE_STORAGE_ERROR_STATE, false, null), HatchSurface.SETTINGS, HatchSubsurface.SECURE_STORAGE, hatchScreen, null, bfm, 224256, 64);
            } else if (this.$catalogIsEmpty) {
                bfm.AgE(141510604);
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A01;
                AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
                BRg bRgSecureStorageImpression = HatchSecureStorageScreenKt.secureStorageImpression(C3U4.A0C(c1062ATq, C06G.A01(bfm, akh), 0.0f, C06G.A01(bfm, akh), 0.0f), HatchScreen.SECURE_STORAGE_LIST, HatchComponent.SECURE_STORAGE_EMPTY_STATE, false, AnonymousClass006.A10(HatchMetadataKey.TOTAL_COUNT.getValue(), HatchPriceImpressionEventDataKt.NO_DISCOUNT));
                Alignment alignment = C2VU.A09;
                Function0<Unit> function02 = this.$onAdd;
                InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgSecureStorageImpression);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA01, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                InterfaceC1380AiA interfaceC1380AiAA0R = AnonymousClass006.A0R(bfm);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function03);
                BPg.A02(bfm, interfaceC1380AiAA0R, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ea1);
                C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title3Emphasized;
                long jA0C = C06G.A0C(bfm);
                Object objAaT4 = bfm.AaT();
                Object obj2 = C78N.A00;
                if (objAaT4 == obj2) {
                    objAaT4 = HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$4$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT4);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA012, AnonymousClass001.A0Y(bs0, objAaT4, false), jA0C, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                C01N.A08(bfm, bs0, 4.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ea0), null, C06G.A08(bfm), C06G.A0T(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
                C01N.A08(bfm, bs0, 20.0f);
                String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e9f);
                AuraLabelButtonStyle auraLabelButtonStyleA0h = AnonymousClass006.A0h(bfm);
                boolean zA652 = bfm.A65(function02);
                Object objAaT5 = bfm.AaT();
                if (zA652 || objAaT5 == obj2) {
                    objAaT5 = new HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$4$1$2$1(function02);
                    bfm.Ai0(objAaT5);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA013, null, null, auraLabelButtonStyleA0h, null, null, false, false, false, false, false, null, null, (Function0) objAaT5, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, 0, 0, 134201325);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, true);
            } else {
                bfm.AgE(141571198);
                C1062ATq c1062ATq2 = C10G.A01;
                AKH<AuraDimensions> akh2 = AuraDimensionsKt.LocalAuraDimensions;
                C1DP c1dp = new C1DP(C06G.A01(bfm, akh2), 0.0f, C06G.A01(bfm, akh2), f2 + C06G.A01(bfm, akh2));
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onCustomConnectorClick, AnonymousClass001.A1R(bfm, this.$onCredentialClick, AnonymousClass001.A1S(bfm, this.$catalogRows, AnonymousClass001.A1L(iA04))));
                List<SecureStorageCatalogRow> list = this.$catalogRows;
                G0U<CredentialCandidate, Unit> g0u2 = this.$onCredentialClick;
                G0U<CustomConnectorCandidate, Unit> g0u3 = this.$onCustomConnectorClick;
                Object objAaT6 = bfm.AaT();
                if (zA1R || objAaT6 == C78N.A00) {
                    objAaT6 = new HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$5$1(f, list, g0u2, g0u3);
                    bfm.Ai0(objAaT6);
                }
                C1YY.A01(null, null, null, c1dp, null, bfm, null, c1062ATq2, (G0U) objAaT6, 6, 506, false, false);
            }
            AnonymousClass001.A1D(bfm);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAdd;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0U<CredentialCandidate, Unit> $onCredentialClick;
        public final /* synthetic */ G0U<CustomConnectorCandidate, Unit> $onCustomConnectorClick;
        public final /* synthetic */ HatchCredentialsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(HatchCredentialsViewModel hatchCredentialsViewModel, Function0<Unit> function0, Function0<Unit> function02, G0U<? super CredentialCandidate, Unit> g0u, G0U<? super CustomConnectorCandidate, Unit> g0u2, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = hatchCredentialsViewModel;
            this.$onBack = function0;
            this.$onAdd = function02;
            this.$onCredentialClick = g0u;
            this.$onCustomConnectorClick = g0u2;
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
            HatchSecureStorageScreenKt.HatchSecureStorageScreen(this.$viewModel, this.$onBack, this.$onAdd, this.$onCredentialClick, this.$onCustomConnectorClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$PasswordVisibilityButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C135701 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $isPasswordVisible;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135701(boolean z, boolean z2, Function0<Unit> function0, int i) {
            super(2);
            this.$isPasswordVisible = z;
            this.$enabled = z2;
            this.$onClick = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSecureStorageScreenKt.PasswordVisibilityButton(this.$isPasswordVisible, this.$enabled, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$SecureStorageCredentialRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C135712 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ CredentialCandidate $candidate;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135712(CredentialCandidate credentialCandidate, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$candidate = credentialCandidate;
            this.$onClick = function0;
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
            HatchSecureStorageScreenKt.SecureStorageCredentialRow(this.$candidate, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$SecureStorageCredentialSiteRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C135722 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $displayName;
        public final /* synthetic */ boolean $isFromOnePassword;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135722(String str, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$displayName = str;
            this.$isFromOnePassword = z;
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
            HatchSecureStorageScreenKt.SecureStorageCredentialSiteRow(this.$displayName, this.$isFromOnePassword, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$SecureStoragePersistenceToggle$2, reason: invalid class name and case insensitive filesystem */
    public final class C135732 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $checked;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ G0U<Boolean, Unit> $onCheckedChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C135732(boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, int i) {
            super(2);
            this.$checked = z;
            this.$enabled = z2;
            this.$onCheckedChange = g0u;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSecureStorageScreenKt.SecureStoragePersistenceToggle(this.$checked, this.$enabled, this.$onCheckedChange, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final String secureStorageDisplayHost(String str) {
        C7384Etj.A0Y(str, 0);
        String host = Uri.parse(str).getHost();
        return host == null ? str : host;
    }

    public static final BRg secureStorageImpression(BRg bRg, HatchScreen hatchScreen, HatchComponent hatchComponent, boolean z, Map<String, String> map) {
        HatchOrigin hatchOrigin;
        HatchSurface hatchSurface;
        AnonymousClass005.A0x(bRg, hatchScreen, hatchComponent);
        if (z) {
            hatchOrigin = HatchOrigin.CHAT;
            hatchSurface = HatchSurface.CHAT;
        } else {
            hatchOrigin = HatchOrigin.SETTINGS;
            hatchSurface = HatchSurface.SETTINGS;
        }
        return HatchImpressionModifierKt.hatchImpression(bRg, hatchOrigin, hatchSurface, HatchSubsurface.SECURE_STORAGE, hatchScreen, hatchComponent, null, map, null, 500L, 0.0f, null, null, null);
    }

    public static final void CredentialAgentPermissionRow(String str, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-594671074);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C3U4.A07(C0ob.A00(AnonymousClass006.A0N(AnonymousClass001.A0R(bRg2)), new C1YD(3), function0, z, z2), 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRgAiP, C06G.A0L(bfm, akh), c1822ArmA0T, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            BRg bRgA0S = AnonymousClass001.A0S(bs0);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0S);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if (z) {
                bfm.AgE(-86267688);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.check_outline_24_wght400, 0), AuraIconSize.SMALL, null, C06G.A0L(bfm, akh), null, bfm, AnonymousClass001.A04(), 33);
            } else {
                bfm.AgE(-86042566);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, z, z2, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchSecureStorageCaptureSheet(java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, com.facebook.aura.settings.HatchCredentialsViewModel r58, kotlin.jvm.functions.Function0<kotlin.Unit> r59, boolean r60, X.BRg r61, X.BFM r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchSecureStorageScreenKt.HatchSecureStorageCaptureSheet(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.settings.HatchCredentialsViewModel, kotlin.jvm.functions.Function0, boolean, X.BRg, X.BFM, int, int):void");
    }

    public static final void HatchSecureStorageCredentialDetailsScreen(SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, HatchCredentialsViewModel hatchCredentialsViewModel, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(secureStorageCredentialDetailsScreenKey, hatchCredentialsViewModel);
        C7384Etj.A0Y(function0, 2);
        bfm.AgG(1308960285);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, secureStorageCredentialDetailsScreenKey) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchCredentialsViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, hatchCredentialsViewModel.credentialDetailsState);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ea5);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120eaa);
            Context contextA0O = AnonymousClass003.A0O(bfm);
            C0Hi c0HiA0Z = AnonymousClass001.A0Z(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C1518AkS c1518AkS = (C1518AkS) AnonymousClass003.A0d(bfm, objAaT, obj);
            Object[] objArr = {secureStorageCredentialDetailsScreenKey.id};
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$isEditing$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT2, objArr);
            boolean zA65 = bfm.A65(secureStorageCredentialDetailsScreenKey.id);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == obj) {
                objAaT3 = AnonymousClass005.A0S(bfm, zA1b);
            }
            MutableState mutableState = (MutableState) objAaT3;
            boolean zA652 = bfm.A65(secureStorageCredentialDetailsScreenKey.id);
            Object objAaT4 = bfm.AaT();
            if (zA652 || objAaT4 == obj) {
                objAaT4 = AnonymousClass005.A0S(bfm, zA1b);
            }
            MutableState mutableState2 = (MutableState) objAaT4;
            boolean zA1K = AnonymousClass003.A1K(bfm, secureStorageCredentialDetailsScreenKey.id, ((SecureStorageCredentialDetailsUiState) c1boA02.getValue()).username);
            Object objAaT5 = bfm.AaT();
            if (zA1K || objAaT5 == obj) {
                String str = ((SecureStorageCredentialDetailsUiState) c1boA02.getValue()).username;
                if (str == null) {
                    str = "";
                }
                objAaT5 = AnonymousClass004.A12(bfm, str);
            }
            MutableState mutableState3 = (MutableState) objAaT5;
            boolean zA653 = bfm.A65(secureStorageCredentialDetailsScreenKey.id);
            Object objAaT6 = bfm.AaT();
            if (zA653 || objAaT6 == obj) {
                objAaT6 = AnonymousClass004.A12(bfm, "");
            }
            MutableState mutableState4 = (MutableState) objAaT6;
            boolean zA1a = AnonymousClass001.A1a(bfm.A65(secureStorageCredentialDetailsScreenKey.id), bfm, AnonymousClass003.A0K(((SecureStorageCredentialDetailsUiState) c1boA02.getValue()).agentPermission));
            Object objAaT7 = bfm.AaT();
            if (zA1a || objAaT7 == obj) {
                objAaT7 = AnonymousClass004.A11(bfm, ((SecureStorageCredentialDetailsUiState) c1boA02.getValue()).agentPermission);
            }
            MutableState mutableState5 = (MutableState) objAaT7;
            String str2 = secureStorageCredentialDetailsScreenKey.id;
            int i4 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1T = AnonymousClass001.A1T(bfm, secureStorageCredentialDetailsScreenKey, i4 == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchCredentialsViewModel)));
            Object objAaT8 = bfm.AaT();
            if (zA1T || objAaT8 == obj) {
                objAaT8 = new HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$1$1(hatchCredentialsViewModel, secureStorageCredentialDetailsScreenKey);
                bfm.Ai0(objAaT8);
            }
            AnonymousClass001.A19(bfm, objAaT8, hatchCredentialsViewModel, str2);
            Boolean boolValueOf = Boolean.valueOf(((SecureStorageCredentialDetailsUiState) c1boA02.getValue()).isDeleted);
            boolean zA1K2 = AnonymousClass004.A1K(iA0T) | bfm.A65(c1boA02);
            Object objAaT9 = bfm.AaT();
            if (zA1K2 || objAaT9 == obj) {
                objAaT9 = new HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$2$1(function0, c1boA02, null);
                bfm.Ai0(objAaT9);
            }
            AnonymousClass001.A18(bfm, objAaT9, boolValueOf);
            String str3 = secureStorageCredentialDetailsScreenKey.id;
            boolean zA1T2 = AnonymousClass001.A1T(bfm, c0HiA0Z, AnonymousClass005.A1T(bfm, mutableState4, mutableState2, mutableStateA0N, AnonymousClass001.A1T(bfm, secureStorageCredentialDetailsScreenKey, i4 == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchCredentialsViewModel)))));
            Object objAaT10 = bfm.AaT();
            if (zA1T2 || objAaT10 == obj) {
                objAaT10 = new HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$3$1(hatchCredentialsViewModel, secureStorageCredentialDetailsScreenKey, c0HiA0Z, mutableState4, mutableState2, mutableStateA0N, null);
                bfm.Ai0(objAaT10);
            }
            AnonymousClass001.A1A(bfm, objAaT10, hatchCredentialsViewModel, str3);
            Boolean boolValueOf2 = Boolean.valueOf(MutableState.A0A(mutableStateA0N));
            boolean zA1K3 = AnonymousClass003.A1K(bfm, mutableStateA0N, c1boA02);
            Object objAaT11 = bfm.AaT();
            if (zA1K3 || objAaT11 == obj) {
                objAaT11 = new HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$4$1(c1518AkS, mutableStateA0N, c1boA02);
                bfm.Ai0(objAaT11);
            }
            AnonymousClass001.A17(bfm, objAaT11, boolValueOf2);
            EnumC3085Bxl enumC3085Bxl = EnumC3085Bxl.ON_STOP;
            boolean zA654 = bfm.A65(mutableState2);
            Object objAaT12 = bfm.AaT();
            if (zA654 || objAaT12 == obj) {
                objAaT12 = new HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$5$1(mutableState2);
                bfm.Ai0(objAaT12);
            }
            C7bA.A00(bfm, enumC3085Bxl, null, (Function0) objAaT12, 6, 2);
            HatchSurface hatchSurface = HatchSurface.SETTINGS;
            HatchScreen hatchScreen = HatchScreen.SECURE_STORAGE_DETAIL;
            HatchBackClickAnalytics hatchBackClickAnalytics = new HatchBackClickAnalytics(hatchSurface, hatchScreen);
            int iA02 = C06G.A02();
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, secureStorageImpression(bRg2, hatchScreen, HatchComponent.SETTINGS_SCREEN_VIEW, zA1b, null), AuraContentRole.Focused, 0L, secureStorageCredentialDetailsScreenKey.displayName, null, function0, null, zA1b, zA1b, zA1b ? 1 : 0, null, null, null, null, null, B1V.A00(bfm, new C135686(mutableStateA0N, secureStorageCredentialDetailsScreenKey, contextA0O, c0HiA0Z, mutableState2, hatchCredentialsViewModel, mutableState3, mutableState4, mutableState5, c1boA02), 269219824), 0L, 0L, null, 0.0f, null, null, null, zA1b ? 1 : 0, null, null, hatchBackClickAnalytics, zA1b, B1V.A00(bfm, new AnonymousClass7(secureStorageCredentialDetailsScreenKey, strA01, hatchCredentialsViewModel, c1boA02, mutableStateA0N, mutableState3, mutableState4, strA012, mutableState2, c0HiA0Z, mutableState5, mutableState, c1518AkS), -2054054280), bfm, ((iA0T << 12) & 3670016) | 390, 1572864, iA02, 402587560);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(1241423197);
                String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e99);
                String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ed6);
                String strA015 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e9b);
                String strA0t = AnonymousClass001.A0t(bfm, secureStorageCredentialDetailsScreenKey.displayName, R.string._name_removed__res_0x7f120e9a);
                B1U b1uA00 = B1V.A00(bfm, new AnonymousClass8(strA013, secureStorageCredentialDetailsScreenKey, mutableState, hatchCredentialsViewModel, strA014), -1367081527);
                boolean zA1N = AnonymousClass003.A1N(bfm, secureStorageCredentialDetailsScreenKey, mutableState);
                Object objAaT13 = bfm.AaT();
                if (zA1N || objAaT13 == obj) {
                    objAaT13 = new HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$9$1(secureStorageCredentialDetailsScreenKey, mutableState);
                    bfm.Ai0(objAaT13);
                }
                AuraAlertDialogKt.AuraAlertDialog((BRg) null, strA015, strA0t, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, b1uA00, (Function0<Unit>) objAaT13, (BA2) null, zA1b, zA1b, (G0U<? super String, Unit>) null, bfm, 196608, zA1b ? 1 : 0, 1945);
            } else {
                bfm.AgE(1242568709);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass10(secureStorageCredentialDetailsScreenKey, hatchCredentialsViewModel, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchSecureStorageScreen(com.facebook.aura.settings.HatchCredentialsViewModel r45, kotlin.jvm.functions.Function0<kotlin.Unit> r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, X.G0U<? super com.facebook.aura.settings.CredentialCandidate, kotlin.Unit> r48, X.G0U<? super com.facebook.aura.settings.CustomConnectorCandidate, kotlin.Unit> r49, X.BRg r50, X.BFM r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchSecureStorageScreenKt.HatchSecureStorageScreen(com.facebook.aura.settings.HatchCredentialsViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, X.G0U, X.BRg, X.BFM, int, int):void");
    }

    public static final void SecureStorageCredentialRow(CredentialCandidate credentialCandidate, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        String strA0e;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(credentialCandidate, function0);
        bfm.AgG(469668105);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, credentialCandidate) | i : i;
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
            if (credentialCandidate.available) {
                AnonymousClass003.A0l(bfm, -1120675368);
                strA0e = credentialCandidate.label;
            } else {
                bfm.AgE(-1120752496);
                strA0e = AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f120eb4);
            }
            AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, zA1a ? 1 : 0);
            String str = credentialCandidate.displayName;
            C0881AGi c0881AGi = C0881AGi.A00;
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0R, auraCardStyleCardStyleForSettings, new AuraCardContent(new ApQ(str, c0881AGi), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, strA0e != null ? new ApQ(strA0e, c0881AGi) : null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097132, (C06H) null), chevronNavigation, null, null, function0, null, null, null, false, false, null, null, 0L, false, null, null, bfm, ((iA0d << 15) & 3670016) | 3072, 0, 262064);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135712(credentialCandidate, function0, bRg2, i, i2);
        }
    }

    public static final void SecureStorageCredentialSiteRow(String str, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(396209467);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
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
            if (z) {
                bfm.AgE(906270724);
                BRg bRgA0R = AnonymousClass001.A0R(bRg2);
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                C0881AGi c0881AGi = C0881AGi.A00;
                AuraCardKt.m2484AuraCardjQVUvHA(bRgA0R, auraCardStyleCardStyleForSettings, new AuraCardContent(new ApQ(str, c0881AGi), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, AnonymousClass006.A0Z(bfm, c0881AGi, R.string._name_removed__res_0x7f120ea2), (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097132, (C06H) null), null, null, null, null, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 0, 0, 262136);
            } else {
                bfm.AgE(906696850);
                BRg bRgA0N = AnonymousClass006.A0N(bRg2);
                C1822Arm c1822ArmA0T = C06G.A0T(bfm);
                AuraColorsTextInput auraColorsTextInputA0b = C06G.A0b(bfm);
                C1DM c1dmHatchSectionRowShape = HatchSectionKt.hatchSectionRowShape(0, 1, bfm, 54);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchSecureStorageScreenKt$SecureStorageCredentialSiteRow$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextInputKt.AuraTextInput(str, null, bRgA0N, null, null, null, null, c1822ArmA0T, true, 0, 0, null, null, auraColorsTextInputA0b, null, false, true, false, false, c1dmHatchSectionRowShape, (G0U) objAaT, bfm, (iA0d & 14) | 100663296, 1572864, 6, 450170);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135722(str, z, bRg2, i, i2);
        }
    }

    public static final void cancelAutofill(Context context) {
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            autofillManager.cancel();
        }
    }

    public static final void saveCredential(HatchCredentialsViewModel hatchCredentialsViewModel, String str, String str2, String str3, boolean z, String str4, String str5, String str6, boolean z2, C0Hi c0Hi) {
        SecureStorageLogging.INSTANCE.addLoginSubmitTapped(z2);
        c0Hi.A6G(false);
        hatchCredentialsViewModel.saveCredential(str, str2, str3, z, str4, str5, str6, z2);
    }

    public static final void CustomConnectorRow(CustomConnectorCandidate customConnectorCandidate, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(1622293344);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, customConnectorCandidate) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            AuraCardKt.m2484AuraCardjQVUvHA(C10G.A02, SettingsKt.cardStyleForSettings(null, bfm, 0, 1), new AuraCardContent(AnonymousClass005.A0X(customConnectorCandidate.host), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null), new AuraCardType.ChevronNavigation(null), null, null, function0, null, null, null, false, false, null, null, 0L, false, null, null, bfm, ((iA0d << 15) & 3670016) | 3078, 0, 262064);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(customConnectorCandidate, function0, i);
        }
    }

    public static final void PasswordVisibilityButton(boolean z, boolean z2, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-947274662);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            AuraTextInputDefaults auraTextInputDefaults = AuraTextInputDefaults.INSTANCE;
            int i2 = R.drawable.eye_wght400_outline_24;
            if (z) {
                i2 = R.drawable.eyeslash_outline_24_wght400;
            }
            AVy aVyA00 = BOf.A00(bfm, i2, 0);
            int i3 = R.string._name_removed__res_0x7f1205b7;
            if (z) {
                i3 = R.string._name_removed__res_0x7f1205b6;
            }
            auraTextInputDefaults.TrailingIconButton(aVyA00, function0, z2, AbstractC2271BQs.A01(bfm, i3), bfm, AVy.$stable | RuntimeInternals.IOPRIO_BACKGROUND | ((iA0n >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA0n << 3) & 896), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135701(z, z2, function0, i);
        }
    }

    public static final void SecureStoragePersistenceToggle(boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, BFM bfm, int i) {
        bfm.AgG(-1629308183);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C3U4.A07(C0v2.A01(AnonymousClass003.A0U(C10G.A02), new C1YD(1), g0u, z, z2), 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0L = AnonymousClass007.A0L(bfm, 12.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0L, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            int i2 = z ? AnonymousClass006.A0j(bfm, -1191248228).checkboxChecked : AnonymousClass006.A0j(bfm, -1191246402).checkboxUnchecked;
            BBI.A0R(bbi, false);
            AVy aVyA00 = BOf.A00(bfm, i2, 0);
            long j = z ? AnonymousClass003.A0c(bfm, -1191242765).accent : AnonymousClass003.A0c(bfm, -1191241388).secondaryIcon.enabled;
            BBI.A0R(bbi, false);
            AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, AuraIconSize.SMALL, null, j, null, bfm, AnonymousClass001.A04(), 33);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120eb1), AnonymousClass001.A0O(c90m, bs0, true), C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135732(z, z2, g0u, i);
        }
    }

    public static final /* synthetic */ SecureStorageCaptureUiState access$HatchSecureStorageCaptureSheet$lambda$0(C1BO c1bo) {
        return (SecureStorageCaptureUiState) c1bo.getValue();
    }

    public static final /* synthetic */ SecureStorageCredentialDetailsUiState access$HatchSecureStorageCredentialDetailsScreen$lambda$0(C1BO c1bo) {
        return (SecureStorageCredentialDetailsUiState) c1bo.getValue();
    }

    public static final /* synthetic */ CredentialAgentPermission access$HatchSecureStorageCredentialDetailsScreen$lambda$18(MutableState mutableState) {
        return (CredentialAgentPermission) mutableState.getValue();
    }

    public static final /* synthetic */ SecureStorageCatalogUiState access$HatchSecureStorageScreen$lambda$0(C1BO c1bo) {
        return (SecureStorageCatalogUiState) c1bo.getValue();
    }

    public static /* synthetic */ BRg secureStorageImpression$default(BRg bRg, HatchScreen hatchScreen, HatchComponent hatchComponent, boolean z, Map map, int i, Object obj) {
        boolean zA1O = AnonymousClass005.A1O(i, z);
        if ((i & 8) != 0) {
            map = null;
        }
        return secureStorageImpression(bRg, hatchScreen, hatchComponent, zA1O, map);
    }
}
