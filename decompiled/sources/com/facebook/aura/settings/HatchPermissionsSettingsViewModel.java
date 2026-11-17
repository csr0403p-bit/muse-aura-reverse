package com.facebook.aura.settings;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BLG;
import X.C10571Hud;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.R;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.HatchNodeHitlGate;
import com.facebook.aura.permissions.defaults.PermissionDefaultMode;
import com.facebook.aura.permissions.defaults.PermissionDefaultSurfaceContent;
import com.facebook.aura.permissions.defaults.PermissionSettings;
import com.facebook.aura.permissions.defaults.PermissionSettingsRepository;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchPermissionsSettingsViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<PermissionDefaultsUiState> _uiState;
    public final HatchNodeHitlGate nodeHitlGate;
    public final PermissionSettingsRepository repository;
    public final C1BN<PermissionDefaultsUiState> uiState;
    public int updateEpoch;

    public final class Factory extends AuraViewModelFactory<HatchPermissionsSettingsViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchPermissionsSettingsViewModel create() {
            return new HatchPermissionsSettingsViewModel(PermissionSettingsRepository.Companion.getInstance(this.userSession), HatchNodeHitlGate.Companion.getInstance(this.userSession));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchPermissionsSettingsViewModel$applyDefault$2", f = "HatchPermissionsSettingsViewModel.kt", l = {93}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchPermissionsSettingsViewModel$applyDefault$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> $onApplied;
        public final /* synthetic */ PermissionSettings $previous;
        public final /* synthetic */ PermissionDefaultsUiState $previousState;
        public final /* synthetic */ G0U<HtJ<? super HsJ<PermissionSettings>>, Object> $request;
        public int label;
        public final /* synthetic */ HatchPermissionsSettingsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0U<? super HtJ<? super HsJ<PermissionSettings>>, ? extends Object> g0u, Function0<Unit> function0, HatchPermissionsSettingsViewModel hatchPermissionsSettingsViewModel, PermissionSettings permissionSettings, PermissionDefaultsUiState permissionDefaultsUiState, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$request = g0u;
            this.$onApplied = function0;
            this.this$0 = hatchPermissionsSettingsViewModel;
            this.$previous = permissionSettings;
            this.$previousState = permissionDefaultsUiState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$request, this.$onApplied, this.this$0, this.$previous, this.$previousState, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                X.Hji r2 = X.EnumC10460Hji.A02
                int r0 = r10.label
                r1 = 1
                if (r0 == 0) goto L52
                if (r0 != r1) goto L60
                X.Hwg.A00(r11)
            Lc:
                X.HsJ r11 = (X.HsJ) r11
                java.lang.Object r9 = r11.value
                boolean r0 = r9 instanceof X.C10571Hud
                if (r0 == 0) goto L15
                r9 = 0
            L15:
                com.facebook.aura.permissions.defaults.PermissionSettings r9 = (com.facebook.aura.permissions.defaults.PermissionSettings) r9
                if (r9 != 0) goto L4a
                com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
                r0 = 2131886411(0x7f12014b, float:1.94074E38)
                r1.showToast(r0)
            L21:
                com.facebook.aura.settings.HatchPermissionsSettingsViewModel r0 = r10.this$0
                X.BLG<com.facebook.aura.settings.PermissionDefaultsUiState> r8 = r0._uiState
                com.facebook.aura.permissions.defaults.PermissionSettings r7 = r10.$previous
                com.facebook.aura.settings.PermissionDefaultsUiState r6 = r10.$previousState
            L29:
                java.lang.Object r5 = r8.getValue()
                r4 = r5
                com.facebook.aura.settings.PermissionDefaultsUiState r4 = (com.facebook.aura.settings.PermissionDefaultsUiState) r4
                r3 = r9
                if (r9 != 0) goto L34
                r3 = r7
            L34:
                r2 = 0
                if (r9 != 0) goto L3c
                boolean r1 = r6.isServerConfirmed
                r0 = 0
                if (r1 == 0) goto L3d
            L3c:
                r0 = 1
            L3d:
                com.facebook.aura.settings.PermissionDefaultsUiState r0 = r4.copy(r3, r2, r0)
                boolean r0 = r8.A6e(r5, r0)
                if (r0 == 0) goto L29
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
            L4a:
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r10.$onApplied
                if (r0 == 0) goto L21
                r0.invoke()
                goto L21
            L52:
                X.Hwg.A00(r11)
                X.G0U<X.HtJ<? super X.HsJ<com.facebook.aura.permissions.defaults.PermissionSettings>>, java.lang.Object> r0 = r10.$request
                r10.label = r1
                java.lang.Object r11 = r0.invoke(r10)
                if (r11 != r2) goto Lc
                return r2
            L60:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchPermissionsSettingsViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchPermissionsSettingsViewModel$refresh$1", f = "HatchPermissionsSettingsViewModel.kt", l = {48}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchPermissionsSettingsViewModel$refresh$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int I$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPermissionsSettingsViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchPermissionsSettingsViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            int i;
            Object objM1850fetchIoAF18A;
            PermissionDefaultsUiState value;
            PermissionDefaultsUiState permissionDefaultsUiState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            if (i2 == 0) {
                Hwg.A00(obj);
                HatchPermissionsSettingsViewModel hatchPermissionsSettingsViewModel = HatchPermissionsSettingsViewModel.this;
                i = hatchPermissionsSettingsViewModel.updateEpoch;
                PermissionSettingsRepository permissionSettingsRepository = hatchPermissionsSettingsViewModel.repository;
                this.I$0 = i;
                this.label = 1;
                objM1850fetchIoAF18A = permissionSettingsRepository.m1850fetchIoAF18A(this);
                if (objM1850fetchIoAF18A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i2 != 1) {
                    throw AnonymousClass001.A0n();
                }
                i = this.I$0;
                objM1850fetchIoAF18A = AnonymousClass001.A0q(obj);
            }
            HatchPermissionsSettingsViewModel hatchPermissionsSettingsViewModel2 = HatchPermissionsSettingsViewModel.this;
            if (!(objM1850fetchIoAF18A instanceof C10571Hud)) {
                PermissionSettings permissionSettings = (PermissionSettings) objM1850fetchIoAF18A;
                if (i == hatchPermissionsSettingsViewModel2.updateEpoch) {
                    BLG<PermissionDefaultsUiState> blg = hatchPermissionsSettingsViewModel2._uiState;
                    do {
                        value = blg.getValue();
                        permissionDefaultsUiState = value;
                    } while (!blg.A6e(value, permissionDefaultsUiState.copy(permissionSettings, permissionDefaultsUiState.isUpdating, true)));
                }
            }
            HatchPermissionsSettingsViewModel hatchPermissionsSettingsViewModel3 = HatchPermissionsSettingsViewModel.this;
            if (HsJ.A00(objM1850fetchIoAF18A) != null && !hatchPermissionsSettingsViewModel3._uiState.getValue().isServerConfirmed) {
                ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120f4f);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchPermissionsSettingsViewModel$setConnectorDefault$1", f = "HatchPermissionsSettingsViewModel.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchPermissionsSettingsViewModel$setConnectorDefault$1, reason: invalid class name and case insensitive filesystem */
    public final class C135651 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends PermissionSettings>>, Object> {
        public final /* synthetic */ PermissionDefaultMode $mode;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135651(PermissionDefaultMode permissionDefaultMode, HtJ<? super C135651> htJ) {
            super(1, htJ);
            this.$mode = permissionDefaultMode;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return HatchPermissionsSettingsViewModel.this.new C135651(this.$mode, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1851update0E7RQCE;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                PermissionSettingsRepository permissionSettingsRepository = HatchPermissionsSettingsViewModel.this.repository;
                PermissionDefaultMode permissionDefaultMode = this.$mode;
                this.label = 1;
                objM1851update0E7RQCE = permissionSettingsRepository.m1851update0E7RQCE(permissionDefaultMode, null, this);
                if (objM1851update0E7RQCE == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1851update0E7RQCE = AnonymousClass001.A0q(obj);
            }
            return C3cG.A0t(objM1851update0E7RQCE);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HtJ<? super HsJ<PermissionSettings>> htJ) {
            return ((C135651) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends PermissionSettings>> htJ) {
            return invoke2((HtJ<? super HsJ<PermissionSettings>>) htJ);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchPermissionsSettingsViewModel$setConnectorDefault$2, reason: invalid class name and case insensitive filesystem */
    public final class C135662 extends AbstractC7559F3s implements Function0<Unit> {
        public C135662() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchPermissionsSettingsViewModel.this.nodeHitlGate.clearAllOverrides();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchPermissionsSettingsViewModel$setNetworkDefault$1", f = "HatchPermissionsSettingsViewModel.kt", l = {71}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchPermissionsSettingsViewModel$setNetworkDefault$1, reason: invalid class name and case insensitive filesystem */
    public final class C135671 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends PermissionSettings>>, Object> {
        public final /* synthetic */ PermissionDefaultMode $mode;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135671(PermissionDefaultMode permissionDefaultMode, HtJ<? super C135671> htJ) {
            super(1, htJ);
            this.$mode = permissionDefaultMode;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return HatchPermissionsSettingsViewModel.this.new C135671(this.$mode, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1851update0E7RQCE;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                PermissionSettingsRepository permissionSettingsRepository = HatchPermissionsSettingsViewModel.this.repository;
                PermissionDefaultMode permissionDefaultMode = this.$mode;
                this.label = 1;
                objM1851update0E7RQCE = permissionSettingsRepository.m1851update0E7RQCE(null, permissionDefaultMode, this);
                if (objM1851update0E7RQCE == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1851update0E7RQCE = AnonymousClass001.A0q(obj);
            }
            return C3cG.A0t(objM1851update0E7RQCE);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HtJ<? super HsJ<PermissionSettings>> htJ) {
            return ((C135671) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends PermissionSettings>> htJ) {
            return invoke2((HtJ<? super HsJ<PermissionSettings>>) htJ);
        }
    }

    private final void applyDefault(PermissionDefaultMode permissionDefaultMode, PermissionDefaultMode permissionDefaultMode2, G0U<? super HtJ<? super HsJ<PermissionSettings>>, ? extends Object> g0u, Function0<Unit> function0) {
        PermissionDefaultsUiState value = this._uiState.getValue();
        PermissionSettings permissionSettings = value.settings;
        if (permissionDefaultMode == null) {
            permissionDefaultMode = permissionSettings.connectorDefault;
        }
        if (permissionDefaultMode2 == null) {
            permissionDefaultMode2 = permissionSettings.networkDefault;
        }
        PermissionDefaultSurfaceContent permissionDefaultSurfaceContent = permissionSettings.connectorContent;
        PermissionDefaultSurfaceContent permissionDefaultSurfaceContent2 = permissionSettings.networkContent;
        AnonymousClass003.A0u(permissionDefaultMode, permissionDefaultMode2);
        PermissionSettings permissionSettings2 = new PermissionSettings(permissionDefaultMode, permissionDefaultMode2, permissionDefaultSurfaceContent, permissionDefaultSurfaceContent2);
        if (permissionSettings2.equals(permissionSettings) && value.isServerConfirmed) {
            return;
        }
        this.updateEpoch++;
        BLG<PermissionDefaultsUiState> blg = this._uiState;
        while (!blg.A6e(blg.getValue(), new PermissionDefaultsUiState(permissionSettings2, true, true))) {
        }
        AnonymousClass001.A1J(new AnonymousClass2(g0u, function0, this, permissionSettings, value, null), AEu.A00(this));
    }

    public final void setConnectorDefault(PermissionDefaultMode permissionDefaultMode) {
        C7384Etj.A0Y(permissionDefaultMode, 0);
        applyDefault(permissionDefaultMode, null, new C135651(permissionDefaultMode, null), new C135662());
    }

    public final void setNetworkDefault(PermissionDefaultMode permissionDefaultMode) {
        C7384Etj.A0Y(permissionDefaultMode, 0);
        applyDefault(null, permissionDefaultMode, new C135671(permissionDefaultMode, null), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void applyDefault$default(HatchPermissionsSettingsViewModel hatchPermissionsSettingsViewModel, PermissionDefaultMode permissionDefaultMode, PermissionDefaultMode permissionDefaultMode2, G0U g0u, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            permissionDefaultMode = null;
        }
        if ((i & 2) != 0) {
            permissionDefaultMode2 = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        hatchPermissionsSettingsViewModel.applyDefault(permissionDefaultMode, permissionDefaultMode2, g0u, function0);
    }

    public final C1BN<PermissionDefaultsUiState> getUiState() {
        return this.uiState;
    }

    public HatchPermissionsSettingsViewModel(PermissionSettingsRepository permissionSettingsRepository, HatchNodeHitlGate hatchNodeHitlGate) {
        boolean zA1b = AnonymousClass004.A1b(permissionSettingsRepository, hatchNodeHitlGate);
        this.repository = permissionSettingsRepository;
        this.nodeHitlGate = hatchNodeHitlGate;
        C9286GCn c9286GCnA14 = C3cG.A14(new PermissionDefaultsUiState(permissionSettingsRepository.cached(), zA1b, permissionSettingsRepository.hasCachedSettings()));
        this._uiState = c9286GCnA14;
        this.uiState = C3Pi.A00(c9286GCnA14);
    }

    public final void refresh() {
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }
}
