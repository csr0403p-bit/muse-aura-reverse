package com.facebook.aura.settings;

import X.AKQ;
import X.ARD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AuJ;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0Hi;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C19h;
import X.C19i;
import X.C1BO;
import X.C1DM;
import X.C1OM;
import X.C1YP;
import X.C2257BGr;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColorsTextInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ boolean $canSave;
    public final /* synthetic */ String $captureAuthorization;
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ MutableState<String> $idempotencyKey$delegate;
    public final /* synthetic */ boolean $isFromChat;
    public final /* synthetic */ MutableState<Boolean> $isPasswordVisible$delegate;
    public final /* synthetic */ MutableState<String> $password$delegate;
    public final /* synthetic */ String $passwordLabel;
    public final /* synthetic */ boolean $passwordTooLong;
    public final /* synthetic */ MutableState<Boolean> $saveToSecureStorage$delegate;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ C1BO<SecureStorageCaptureUiState> $uiState$delegate;
    public final /* synthetic */ MutableState<String> $username$delegate;
    public final /* synthetic */ String $usernameLabel;
    public final /* synthetic */ boolean $usernameTooLong;
    public final /* synthetic */ HatchCredentialsViewModel $viewModel;
    public final /* synthetic */ MutableState<String> $website$delegate;

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<String> $idempotencyKey$delegate;
        public final /* synthetic */ C1BO<SecureStorageCaptureUiState> $uiState$delegate;
        public final /* synthetic */ MutableState<String> $username$delegate;
        public final /* synthetic */ String $usernameLabel;
        public final /* synthetic */ boolean $usernameTooLong;
        public final /* synthetic */ HatchCredentialsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, MutableState<String> mutableState, MutableState<String> mutableState2, HatchCredentialsViewModel hatchCredentialsViewModel, C1BO<SecureStorageCaptureUiState> c1bo, String str) {
            super(3);
            this.$usernameTooLong = z;
            this.$username$delegate = mutableState;
            this.$idempotencyKey$delegate = mutableState2;
            this.$viewModel = hatchCredentialsViewModel;
            this.$uiState$delegate = c1bo;
            this.$usernameLabel = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                boolean z = this.$usernameTooLong;
                MutableState<String> mutableState = this.$username$delegate;
                MutableState<String> mutableState2 = this.$idempotencyKey$delegate;
                HatchCredentialsViewModel hatchCredentialsViewModel = this.$viewModel;
                C1BO<SecureStorageCaptureUiState> c1bo = this.$uiState$delegate;
                String str = this.$usernameLabel;
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                String strA05 = MutableState.A05(mutableState);
                BRg bRgA0N = AnonymousClass006.A0N(bs0);
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$1$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0N, objAaT, false);
                boolean z2 = !c1bo.getValue().isSaving;
                AuJ auJ = new AuJ(null, -1, 6, 6);
                AuraColorsTextInput auraColorsTextInputA0b = C06G.A0b(bfm);
                C1DM c1dmHatchSectionRowShape = HatchSectionKt.hatchSectionRowShape(0, 2, bfm, 54);
                B1U b1uA00 = B1V.A00(bfm, new HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$1$1$2(str), 2041858109);
                boolean zA1S = AnonymousClass004.A1S(bfm, mutableState2, hatchCredentialsViewModel, bfm.A65(mutableState));
                Object objAaT2 = bfm.AaT();
                if (zA1S || objAaT2 == obj) {
                    objAaT2 = new HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$1$1$3$1(hatchCredentialsViewModel, mutableState, mutableState2);
                    bfm.Ai0(objAaT2);
                }
                AuraTextInputKt.AuraTextInput(strA05, null, bRgA0Y, b1uA00, auJ, null, null, null, true, 0, 0, null, null, auraColorsTextInputA0b, null, z2, false, z, false, c1dmHatchSectionRowShape, (G0U) objAaT2, bfm, 100690944, 0, 0, 351970);
                if (z) {
                    bfm.AgE(-1274715153);
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120eb9);
                    C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
                    long j = AnonymousClass002.A0c(bfm).error;
                    BRg bRgA0C = C3U4.A0C(C10G.A02, 16.0f, 0.0f, 16.0f, 12.0f);
                    Object objAaT3 = bfm.AaT();
                    if (objAaT3 == obj) {
                        objAaT3 = HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$1$1$4$1.INSTANCE;
                        bfm.Ai0(objAaT3);
                    }
                    AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA0C, objAaT3, false), j, c1822ArmA0Y, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                } else {
                    bfm.AgE(-1274261127);
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $canSave;
        public final /* synthetic */ String $captureAuthorization;
        public final /* synthetic */ C0Hi $focusManager;
        public final /* synthetic */ MutableState<String> $idempotencyKey$delegate;
        public final /* synthetic */ boolean $isFromChat;
        public final /* synthetic */ MutableState<Boolean> $isPasswordVisible$delegate;
        public final /* synthetic */ MutableState<String> $password$delegate;
        public final /* synthetic */ String $passwordLabel;
        public final /* synthetic */ boolean $passwordTooLong;
        public final /* synthetic */ MutableState<Boolean> $saveToSecureStorage$delegate;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ C1BO<SecureStorageCaptureUiState> $uiState$delegate;
        public final /* synthetic */ MutableState<String> $username$delegate;
        public final /* synthetic */ HatchCredentialsViewModel $viewModel;
        public final /* synthetic */ MutableState<String> $website$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C0Hi c0Hi, boolean z, HatchCredentialsViewModel hatchCredentialsViewModel, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<Boolean> mutableState4, MutableState<String> mutableState5, String str, String str2, boolean z2, boolean z3, C1BO<SecureStorageCaptureUiState> c1bo, MutableState<Boolean> mutableState6, String str3) {
            super(3);
            this.$focusManager = c0Hi;
            this.$canSave = z;
            this.$viewModel = hatchCredentialsViewModel;
            this.$website$delegate = mutableState;
            this.$username$delegate = mutableState2;
            this.$password$delegate = mutableState3;
            this.$saveToSecureStorage$delegate = mutableState4;
            this.$idempotencyKey$delegate = mutableState5;
            this.$sessionId = str;
            this.$captureAuthorization = str2;
            this.$isFromChat = z2;
            this.$passwordTooLong = z3;
            this.$uiState$delegate = c1bo;
            this.$isPasswordVisible$delegate = mutableState6;
            this.$passwordLabel = str3;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C19h c1yp;
            int i2;
            boolean z;
            C1DM c1dmHatchSectionRowShape;
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                C0Hi c0Hi = this.$focusManager;
                boolean z2 = this.$canSave;
                HatchCredentialsViewModel hatchCredentialsViewModel = this.$viewModel;
                MutableState<String> mutableState = this.$website$delegate;
                MutableState<String> mutableState2 = this.$username$delegate;
                MutableState<String> mutableState3 = this.$password$delegate;
                MutableState<Boolean> mutableState4 = this.$saveToSecureStorage$delegate;
                MutableState<String> mutableState5 = this.$idempotencyKey$delegate;
                String str = this.$sessionId;
                String str2 = this.$captureAuthorization;
                boolean z3 = this.$isFromChat;
                boolean z4 = this.$passwordTooLong;
                C1BO<SecureStorageCaptureUiState> c1bo = this.$uiState$delegate;
                MutableState<Boolean> mutableState6 = this.$isPasswordVisible$delegate;
                String str3 = this.$passwordLabel;
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A02, 0);
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
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                String strA05 = MutableState.A05(mutableState3);
                BRg bRgA0N = AnonymousClass006.A0N(bs0);
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$2$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                BRg bRgA012 = ARD.A01(bRgA0N, (G0U) objAaT, false);
                boolean z5 = !c1bo.getValue().isSaving;
                if (MutableState.A0A((MutableState) mutableState6)) {
                    c1yp = C19i.A00;
                } else {
                    c1yp = new C1YP();
                }
                AuJ auJ = new AuJ(null, -1, 7, 7);
                boolean zA1U = AnonymousClass004.A1U(bfm, str2, AnonymousClass005.A1T(bfm, mutableState4, mutableState5, str, AnonymousClass005.A1T(bfm, mutableState, mutableState2, mutableState3, AnonymousClass004.A1V(bfm, hatchCredentialsViewModel, z2, bfm.A67(c0Hi)))), z3);
                Object objAaT2 = bfm.AaT();
                if (!zA1U && objAaT2 != obj) {
                    i2 = 2;
                } else {
                    i2 = 2;
                    objAaT2 = new HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$2$1$2$1(c0Hi, z2, hatchCredentialsViewModel, str, str2, z3, mutableState, mutableState2, mutableState3, mutableState4, mutableState5);
                    bfm.Ai0(objAaT2);
                }
                C2257BGr c2257BGr = new C2257BGr((G0U) objAaT2, null, null, null);
                AuraColorsTextInput auraColorsTextInputA0b = C06G.A0b(bfm);
                if (z4) {
                    bfm.AgE(-1764805228);
                    BBI.A0R(bbi, false);
                    c1dmHatchSectionRowShape = C1OM.A00;
                    z = true;
                } else {
                    bfm.AgE(-1764738051);
                    z = true;
                    c1dmHatchSectionRowShape = HatchSectionKt.hatchSectionRowShape(1, i2, bfm, 54);
                    BBI.A0R(bbi, false);
                }
                B1U b1uA00 = B1V.A00(bfm, new HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$2$1$3(str3), 417490214);
                B1U b1uA002 = B1V.A00(bfm, new HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$2$1$4(z3, mutableState6, c1bo), 592131708);
                boolean zA1S = AnonymousClass004.A1S(bfm, mutableState5, hatchCredentialsViewModel, bfm.A65(mutableState3));
                Object objAaT3 = bfm.AaT();
                if (zA1S || objAaT3 == obj) {
                    objAaT3 = new HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$2$1$5$1(hatchCredentialsViewModel, mutableState3, mutableState5);
                    bfm.Ai0(objAaT3);
                }
                AuraTextInputKt.AuraTextInput(strA05, null, bRgA012, b1uA00, auJ, c2257BGr, c1yp, null, z, 0, 0, null, b1uA002, auraColorsTextInputA0b, null, z5, false, z4, false, c1dmHatchSectionRowShape, (G0U) objAaT3, bfm, 100690944, 384, 0, 347778);
                if (z4) {
                    bfm.AgE(-1764334586);
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120eab);
                    C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
                    long j = AnonymousClass002.A0c(bfm).error;
                    BRg bRgA0C = C3U4.A0C(C10G.A02, 16.0f, 0.0f, 16.0f, 12.0f);
                    Object objAaT4 = bfm.AaT();
                    if (objAaT4 == obj) {
                        objAaT4 = HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$2$1$6$1.INSTANCE;
                        bfm.Ai0(objAaT4);
                    }
                    AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA0C, objAaT4, false), j, c1822ArmA0Y, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                } else {
                    bfm.AgE(-1763880560);
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, z);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$usernameTooLong, this.$username$delegate, this.$idempotencyKey$delegate, this.$viewModel, this.$uiState$delegate, this.$usernameLabel), -58707489);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$focusManager, this.$canSave, this.$viewModel, this.$website$delegate, this.$username$delegate, this.$password$delegate, this.$saveToSecureStorage$delegate, this.$idempotencyKey$delegate, this.$sessionId, this.$captureAuthorization, this.$isFromChat, this.$passwordTooLong, this.$uiState$delegate, this.$isPasswordVisible$delegate, this.$passwordLabel), 408579656);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1(boolean z, MutableState<String> mutableState, MutableState<String> mutableState2, HatchCredentialsViewModel hatchCredentialsViewModel, C1BO<SecureStorageCaptureUiState> c1bo, String str, C0Hi c0Hi, boolean z2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<Boolean> mutableState5, String str2, String str3, boolean z3, boolean z4, MutableState<Boolean> mutableState6, String str4) {
        super(1);
        this.$usernameTooLong = z;
        this.$username$delegate = mutableState;
        this.$idempotencyKey$delegate = mutableState2;
        this.$viewModel = hatchCredentialsViewModel;
        this.$uiState$delegate = c1bo;
        this.$usernameLabel = str;
        this.$focusManager = c0Hi;
        this.$canSave = z2;
        this.$website$delegate = mutableState3;
        this.$password$delegate = mutableState4;
        this.$saveToSecureStorage$delegate = mutableState5;
        this.$sessionId = str2;
        this.$captureAuthorization = str3;
        this.$isFromChat = z3;
        this.$passwordTooLong = z4;
        this.$isPasswordVisible$delegate = mutableState6;
        this.$passwordLabel = str4;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
