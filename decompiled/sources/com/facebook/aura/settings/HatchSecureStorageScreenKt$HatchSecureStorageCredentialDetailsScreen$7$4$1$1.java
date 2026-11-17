package com.facebook.aura.settings;

import X.AKQ;
import X.ARD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.AuJ;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BHJ;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0CD;
import X.C0Hi;
import X.C1515AkP;
import X.C1518AkS;
import X.C1822Arm;
import X.C19h;
import X.C19i;
import X.C1BO;
import X.C1DM;
import X.C1YP;
import X.C2257BGr;
import X.C3U4;
import X.C3bM;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.navigation.key.SecureStorageCredentialDetailsScreenKey;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.ui.HatchLazySectionScope;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.header.AuraSectionHeaderKt;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.theme.AuraColorsTextInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ MutableState<CredentialAgentPermission> $editableAgentPermission$delegate;
    public final /* synthetic */ MutableState<String> $editablePassword$delegate;
    public final /* synthetic */ MutableState<String> $editableUsername$delegate;
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
    public final /* synthetic */ MutableState<Boolean> $isPasswordVisible$delegate;
    public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
    public final /* synthetic */ String $passwordMask;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ C1BO<SecureStorageCredentialDetailsUiState> $uiState$delegate;
    public final /* synthetic */ C1518AkS $usernameFocusRequester;

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ float $topPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f) {
            super(3);
            this.$topPadding = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                C01N.A08(bfm, BRg.A00, this.$topPadding);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<HatchLazySectionScope, Unit> {
        public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
        public final /* synthetic */ C1BO<SecureStorageCredentialDetailsUiState> $uiState$delegate;

        /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
            public final /* synthetic */ C1BO<SecureStorageCredentialDetailsUiState> $uiState$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, C1BO<SecureStorageCredentialDetailsUiState> c1bo) {
                super(2);
                this.$key = secureStorageCredentialDetailsScreenKey;
                this.$uiState$delegate = c1bo;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    HatchSecureStorageScreenKt.SecureStorageCredentialSiteRow(this.$key.displayName, this.$uiState$delegate.getValue().isFromOnePassword, null, bfm, 0, 4);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchLazySectionScope hatchLazySectionScope) {
            C7384Etj.A0Y(hatchLazySectionScope, 0);
            hatchLazySectionScope.item("website", "field", AnonymousClass001.A0M(new AnonymousClass1(this.$key, this.$uiState$delegate), -263277057));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, C1BO<SecureStorageCredentialDetailsUiState> c1bo) {
            super(1);
            this.$key = secureStorageCredentialDetailsScreenKey;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchLazySectionScope hatchLazySectionScope) {
            invoke2(hatchLazySectionScope);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<HatchLazySectionScope, Unit> {
        public final /* synthetic */ int $credentialRowCount;
        public final /* synthetic */ MutableState<String> $editablePassword$delegate;
        public final /* synthetic */ MutableState<String> $editableUsername$delegate;
        public final /* synthetic */ C0Hi $focusManager;
        public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
        public final /* synthetic */ MutableState<Boolean> $isPasswordVisible$delegate;
        public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
        public final /* synthetic */ String $passwordMask;
        public final /* synthetic */ boolean $showPassword;
        public final /* synthetic */ boolean $showUsername;
        public final /* synthetic */ C1BO<SecureStorageCredentialDetailsUiState> $uiState$delegate;
        public final /* synthetic */ C1518AkS $usernameFocusRequester;

        /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ int $credentialRowCount;
            public final /* synthetic */ MutableState<String> $editableUsername$delegate;
            public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
            public final /* synthetic */ C1BO<SecureStorageCredentialDetailsUiState> $uiState$delegate;
            public final /* synthetic */ C1518AkS $usernameFocusRequester;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C1518AkS c1518AkS, int i, MutableState<String> mutableState, MutableState<Boolean> mutableState2, C1BO<SecureStorageCredentialDetailsUiState> c1bo) {
                super(2);
                this.$usernameFocusRequester = c1518AkS;
                this.$credentialRowCount = i;
                this.$editableUsername$delegate = mutableState;
                this.$isEditing$delegate = mutableState2;
                this.$uiState$delegate = c1bo;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                String strA05;
                if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                    if (MutableState.A0A((MutableState) this.$isEditing$delegate)) {
                        strA05 = MutableState.A05(this.$editableUsername$delegate);
                    } else {
                        strA05 = this.$uiState$delegate.getValue().username;
                        if (strA05 == null) {
                            strA05 = "";
                        }
                    }
                    BRg bRgA00 = BHJ.A00(AnonymousClass006.A0N(BRg.A00), this.$usernameFocusRequester);
                    boolean z = !this.$uiState$delegate.getValue().isUpdating;
                    boolean z2 = !MutableState.A0A((MutableState) this.$isEditing$delegate);
                    C1822Arm c1822ArmA0T = C06G.A0T(bfm);
                    AuJ auJ = new AuJ(null, -1, 6, 6);
                    AuraColorsTextInput auraColorsTextInputA0b = C06G.A0b(bfm);
                    C1DM c1dmHatchSectionRowShape = HatchSectionKt.hatchSectionRowShape(0, this.$credentialRowCount, bfm, 6);
                    G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchSecureStorageScreenKt.lambda$900497409;
                    boolean zA65 = bfm.A65(this.$editableUsername$delegate);
                    MutableState<String> mutableState = this.$editableUsername$delegate;
                    Object objAaT = bfm.AaT();
                    if (zA65 || objAaT == C78N.A00) {
                        objAaT = new HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$3$1$1$1(mutableState);
                        bfm.Ai0(objAaT);
                    }
                    AuraTextInputKt.AuraTextInput(strA05, null, bRgA00, g0v, auJ, null, null, c1822ArmA0T, true, 0, 0, null, null, auraColorsTextInputA0b, null, z, z2, false, false, c1dmHatchSectionRowShape, (G0U) objAaT, bfm, 100690944, 0, 0, 417378);
                    return;
                }
                bfm.Afo();
            }
        }

        /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$3$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ int $credentialRowCount;
            public final /* synthetic */ MutableState<String> $editablePassword$delegate;
            public final /* synthetic */ C0Hi $focusManager;
            public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
            public final /* synthetic */ MutableState<Boolean> $isPasswordVisible$delegate;
            public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
            public final /* synthetic */ String $passwordMask;
            public final /* synthetic */ boolean $showUsername;
            public final /* synthetic */ C1BO<SecureStorageCredentialDetailsUiState> $uiState$delegate;

            /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$3$2$2, reason: invalid class name and collision with other inner class name */
            public final class C03502 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
                public final /* synthetic */ MutableState<Boolean> $isPasswordVisible$delegate;
                public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
                public final /* synthetic */ C1BO<SecureStorageCredentialDetailsUiState> $uiState$delegate;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C03502(SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, MutableState<Boolean> mutableState, C1BO<SecureStorageCredentialDetailsUiState> c1bo) {
                    super(2);
                    this.$key = secureStorageCredentialDetailsScreenKey;
                    this.$isPasswordVisible$delegate = mutableState;
                    this.$uiState$delegate = c1bo;
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                    invoke(bfm, AnonymousClass001.A0F(num));
                    return Unit.INSTANCE;
                }

                public final void invoke(BFM bfm, int i) {
                    if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                        boolean zA0A = MutableState.A0A((MutableState) this.$isPasswordVisible$delegate);
                        boolean z = !this.$uiState$delegate.getValue().isUpdating;
                        boolean zA1R = AnonymousClass001.A1R(bfm, this.$isPasswordVisible$delegate, bfm.A67(this.$key));
                        SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey = this.$key;
                        MutableState<Boolean> mutableState = this.$isPasswordVisible$delegate;
                        Object objAaT = bfm.AaT();
                        if (zA1R || objAaT == C78N.A00) {
                            objAaT = new HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$3$2$2$1$1(secureStorageCredentialDetailsScreenKey, mutableState);
                            bfm.Ai0(objAaT);
                        }
                        HatchSecureStorageScreenKt.PasswordVisibilityButton(zA0A, z, (Function0) objAaT, bfm, 0);
                        return;
                    }
                    bfm.Afo();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(String str, C0Hi c0Hi, boolean z, int i, MutableState<String> mutableState, MutableState<Boolean> mutableState2, C1BO<SecureStorageCredentialDetailsUiState> c1bo, MutableState<Boolean> mutableState3, SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey) {
                super(2);
                this.$passwordMask = str;
                this.$focusManager = c0Hi;
                this.$showUsername = z;
                this.$credentialRowCount = i;
                this.$editablePassword$delegate = mutableState;
                this.$isEditing$delegate = mutableState2;
                this.$uiState$delegate = c1bo;
                this.$isPasswordVisible$delegate = mutableState3;
                this.$key = secureStorageCredentialDetailsScreenKey;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                String strA05;
                C19h c1yp;
                if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                    if (MutableState.A0A((MutableState) this.$isEditing$delegate)) {
                        strA05 = MutableState.A05(this.$editablePassword$delegate);
                    } else {
                        strA05 = this.$passwordMask;
                    }
                    B1U b1uA00 = null;
                    BRg bRgA0N = AnonymousClass006.A0N(BRg.A00);
                    boolean z = !this.$uiState$delegate.getValue().isUpdating;
                    boolean z2 = !MutableState.A0A((MutableState) this.$isEditing$delegate);
                    C1822Arm c1822ArmA0T = C06G.A0T(bfm);
                    if (MutableState.A0A((MutableState) this.$isEditing$delegate) && MutableState.A0A((MutableState) this.$isPasswordVisible$delegate)) {
                        c1yp = C19i.A00;
                    } else {
                        c1yp = new C1YP();
                    }
                    AuJ auJ = new AuJ(null, -1, 7, 7);
                    boolean zA67 = bfm.A67(this.$focusManager);
                    C0Hi c0Hi = this.$focusManager;
                    Object objAaT = bfm.AaT();
                    if (zA67 || objAaT == C78N.A00) {
                        objAaT = new HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$3$2$1$1(c0Hi);
                        bfm.Ai0(objAaT);
                    }
                    C2257BGr c2257BGr = new C2257BGr((G0U) objAaT, null, null, null);
                    if (MutableState.A0A((MutableState) this.$isEditing$delegate)) {
                        bfm.AgE(-2067122467);
                        b1uA00 = B1V.A00(bfm, new C03502(this.$key, this.$isPasswordVisible$delegate, this.$uiState$delegate), -1858053120);
                    } else {
                        bfm.AgE(-2066577394);
                    }
                    AnonymousClass001.A1D(bfm);
                    AuraColorsTextInput auraColorsTextInputA0b = C06G.A0b(bfm);
                    C1DM c1dmHatchSectionRowShape = HatchSectionKt.hatchSectionRowShape(this.$showUsername ? 1 : 0, this.$credentialRowCount, bfm, 0);
                    G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchSecureStorageScreenKt.f246lambda$1296537046;
                    boolean zA65 = bfm.A65(this.$editablePassword$delegate);
                    MutableState<String> mutableState = this.$editablePassword$delegate;
                    Object objAaT2 = bfm.AaT();
                    if (zA65 || objAaT2 == C78N.A00) {
                        objAaT2 = new HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$3$2$3$1(mutableState);
                        bfm.Ai0(objAaT2);
                    }
                    AuraTextInputKt.AuraTextInput(strA05, null, bRgA0N, g0v, auJ, c2257BGr, c1yp, c1822ArmA0T, true, 0, 0, null, b1uA00, auraColorsTextInputA0b, null, z, z2, false, false, c1dmHatchSectionRowShape, (G0U) objAaT2, bfm, 100691328, 0, 0, 413186);
                    return;
                }
                bfm.Afo();
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchLazySectionScope hatchLazySectionScope) {
            C7384Etj.A0Y(hatchLazySectionScope, 0);
            if (this.$showUsername) {
                hatchLazySectionScope.item("username", "field", B1V.A01(new AnonymousClass1(this.$usernameFocusRequester, this.$credentialRowCount, this.$editableUsername$delegate, this.$isEditing$delegate, this.$uiState$delegate), -1821106707, true));
            }
            if (this.$showPassword) {
                hatchLazySectionScope.item(HatchConnectorQplLogger.AuthType.PASSWORD, "field", B1V.A01(new AnonymousClass2(this.$passwordMask, this.$focusManager, this.$showUsername, this.$credentialRowCount, this.$editablePassword$delegate, this.$isEditing$delegate, this.$uiState$delegate, this.$isPasswordVisible$delegate, this.$key), -1123009258, true));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, boolean z2, C1518AkS c1518AkS, int i, MutableState<String> mutableState, MutableState<Boolean> mutableState2, C1BO<SecureStorageCredentialDetailsUiState> c1bo, String str, C0Hi c0Hi, MutableState<String> mutableState3, MutableState<Boolean> mutableState4, SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey) {
            super(1);
            this.$showUsername = z;
            this.$showPassword = z2;
            this.$usernameFocusRequester = c1518AkS;
            this.$credentialRowCount = i;
            this.$editableUsername$delegate = mutableState;
            this.$isEditing$delegate = mutableState2;
            this.$uiState$delegate = c1bo;
            this.$passwordMask = str;
            this.$focusManager = c0Hi;
            this.$editablePassword$delegate = mutableState3;
            this.$isPasswordVisible$delegate = mutableState4;
            this.$key = secureStorageCredentialDetailsScreenKey;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchLazySectionScope hatchLazySectionScope) {
            invoke2(hatchLazySectionScope);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ CredentialAgentPermission $displayedAgentPermission;
        public final /* synthetic */ MutableState<CredentialAgentPermission> $editableAgentPermission$delegate;
        public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
        public final /* synthetic */ C1BO<SecureStorageCredentialDetailsUiState> $uiState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(CredentialAgentPermission credentialAgentPermission, MutableState<Boolean> mutableState, C1BO<SecureStorageCredentialDetailsUiState> c1bo, MutableState<CredentialAgentPermission> mutableState2) {
            super(3);
            this.$displayedAgentPermission = credentialAgentPermission;
            this.$isEditing$delegate = mutableState;
            this.$uiState$delegate = c1bo;
            this.$editableAgentPermission$delegate = mutableState2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                int iOrdinal = -1;
                BRg bRgA01 = ARD.A01(C3U4.A04(BRg.A00, 16.0f), new C3bM(7), false);
                CredentialAgentPermission credentialAgentPermission = this.$displayedAgentPermission;
                MutableState<Boolean> mutableState = this.$isEditing$delegate;
                C1BO<SecureStorageCredentialDetailsUiState> c1bo = this.$uiState$delegate;
                MutableState<CredentialAgentPermission> mutableState2 = this.$editableAgentPermission$delegate;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA01);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0J);
                C90l c90l = C90l.A00;
                AuraSectionHeaderKt.AuraSectionHeader(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e90), null, null, bfm, 48, 4);
                if (credentialAgentPermission != null) {
                    iOrdinal = credentialAgentPermission.ordinal();
                }
                boolean zA1T = AnonymousClass005.A1T(bfm, mutableState, c1bo, mutableState2, bfm.A63(iOrdinal));
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$4$1$1$1(credentialAgentPermission, mutableState2, mutableState, c1bo);
                    bfm.Ai0(objAaT);
                }
                HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT, bfm, 6, 7);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0070 A[PHI: r1
  0x0070: PHI (r1v8 boolean) = (r1v3 boolean), (r1v9 boolean) binds: [B:10:0x006e, B:8:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073 A[PHI: r13
  0x0073: PHI (r13v3 boolean) = (r13v0 boolean), (r13v4 boolean) binds: [B:10:0x006e, B:12:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[PHI: r13
  0x0080: PHI (r13v1 boolean) = (r13v8 boolean), (r13v5 boolean) binds: [B:14:0x007e, B:12:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(X.C0CD r29) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1.invoke2(X.0CD):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1(float f, C1BO<SecureStorageCredentialDetailsUiState> c1bo, SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, MutableState<Boolean> mutableState, C1518AkS c1518AkS, MutableState<String> mutableState2, String str, C0Hi c0Hi, MutableState<String> mutableState3, MutableState<Boolean> mutableState4, MutableState<CredentialAgentPermission> mutableState5) {
        super(1);
        this.$topPadding = f;
        this.$uiState$delegate = c1bo;
        this.$key = secureStorageCredentialDetailsScreenKey;
        this.$isEditing$delegate = mutableState;
        this.$usernameFocusRequester = c1518AkS;
        this.$editableUsername$delegate = mutableState2;
        this.$passwordMask = str;
        this.$focusManager = c0Hi;
        this.$editablePassword$delegate = mutableState3;
        this.$isPasswordVisible$delegate = mutableState4;
        this.$editableAgentPermission$delegate = mutableState5;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
