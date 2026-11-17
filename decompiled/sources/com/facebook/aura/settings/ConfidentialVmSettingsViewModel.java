package com.facebook.aura.settings;

import X.AEs;
import X.AEu;
import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass602;
import X.BLL;
import X.C06H;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.GDB;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.permissions.defaults.ConfidentialVmSettings;
import com.facebook.aura.permissions.defaults.ConfidentialVmToggle;
import com.facebook.aura.permissions.defaults.ConfidentialVmWriteOutcome;
import com.facebook.aura.permissions.defaults.PermissionSettingsRepository;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class ConfidentialVmSettingsViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String WEB_MEDIA_TOGGLE_KEY = "web_media";
    public final PermissionSettingsRepository repository;
    public final C1BN<ConfidentialVmSettings> uiState;
    public final AbstractC3358CGz userSession;
    public final ConfidentialVmSettingWrites writes;

    @DebugMetadata(c = "com.facebook.aura.settings.ConfidentialVmSettingsViewModel$1", f = "ConfidentialVmSettingsViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.ConfidentialVmSettingsViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmSettingsViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConfidentialVmSettingsViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmSettingsViewModel confidentialVmSettingsViewModel = ConfidentialVmSettingsViewModel.this;
                this.label = 1;
                if (confidentialVmSettingsViewModel.refresh(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.ConfidentialVmSettingsViewModel$2", f = "ConfidentialVmSettingsViewModel.kt", l = {40}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.ConfidentialVmSettingsViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C20Q<Unit> $refreshTriggers;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ ConfidentialVmSettingsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C20Q<Unit> c20q, ConfidentialVmSettingsViewModel confidentialVmSettingsViewModel, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$refreshTriggers = c20q;
            this.this$0 = confidentialVmSettingsViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$refreshTriggers, this.this$0, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            final C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q<Unit> c20q = this.$refreshTriggers;
                final ConfidentialVmSettingsViewModel confidentialVmSettingsViewModel = this.this$0;
                C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.settings.ConfidentialVmSettingsViewModel.2.1

                    @DebugMetadata(c = "com.facebook.aura.settings.ConfidentialVmSettingsViewModel$2$1$1", f = "ConfidentialVmSettingsViewModel.kt", l = {40}, m = "invokeSuspend", v = 2)
                    /* renamed from: com.facebook.aura.settings.ConfidentialVmSettingsViewModel$2$1$1, reason: invalid class name and collision with other inner class name */
                    public final class C03441 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                        public int label;
                        public final /* synthetic */ ConfidentialVmSettingsViewModel this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C03441(ConfidentialVmSettingsViewModel confidentialVmSettingsViewModel, HtJ<? super C03441> htJ) {
                            super(2, htJ);
                            this.this$0 = confidentialVmSettingsViewModel;
                        }

                        @Override // X.AbstractC8884Fsp
                        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                            return new C03441(this.this$0, htJ);
                        }

                        @Override // X.G0V
                        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                            return new C03441(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // X.AbstractC8884Fsp
                        public final Object invokeSuspend(Object obj) {
                            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                            int i = this.label;
                            if (i == 0) {
                                Hwg.A00(obj);
                                ConfidentialVmSettingsViewModel confidentialVmSettingsViewModel = this.this$0;
                                this.label = 1;
                                if (confidentialVmSettingsViewModel.refresh(this) == enumC10460Hji) {
                                    return enumC10460Hji;
                                }
                            } else {
                                if (i != 1) {
                                    throw AnonymousClass001.A0n();
                                }
                                Hwg.A00(obj);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        AnonymousClass001.A1J(new C03441(confidentialVmSettingsViewModel, null), c3ux);
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.L$0 = null;
                this.label = 1;
                if (c20q.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<ConfidentialVmSettingsViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        private final C20Q<Unit> refreshTriggers() {
            HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(this.userSession);
            return new ConfidentialVmSettingsViewModel$Factory$refreshTriggers$$inlined$map$2(AbstractC05633ui.A01(new ConfidentialVmSettingsViewModel$Factory$refreshTriggers$$inlined$filter$1(new AnonymousClass602(GDB.A01(new ConfidentialVmSettingsViewModel$Factory$refreshTriggers$$inlined$map$1(gateway.connectionState)), 0)), new ConfidentialVmSettingsViewModel$Factory$refreshTriggers$$inlined$filter$2(new AnonymousClass602(AuraAppLifecycleManager.isAppInForegroundFlow, 0), gateway)));
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConfidentialVmSettingsViewModel create() {
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            return new ConfidentialVmSettingsViewModel(abstractC3358CGz, PermissionSettingsRepository.Companion.getInstance(abstractC3358CGz), ConfidentialVmSettingWrites.Companion.getInstance(this.userSession), refreshTriggers());
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.ConfidentialVmSettingsViewModel", f = "ConfidentialVmSettingsViewModel.kt", l = {56}, m = "refresh", v = 2)
    /* renamed from: com.facebook.aura.settings.ConfidentialVmSettingsViewModel$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C134691 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C134691(HtJ<? super C134691> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmSettingsViewModel.this.refresh(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.ConfidentialVmSettingsViewModel$setAllowed$1", f = "ConfidentialVmSettingsViewModel.kt", l = {48}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.ConfidentialVmSettingsViewModel$setAllowed$1, reason: invalid class name and case insensitive filesystem */
    public final class C134701 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $allowed;
        public final /* synthetic */ ConfidentialVmToggle $toggle;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134701(ConfidentialVmToggle confidentialVmToggle, boolean z, HtJ<? super C134701> htJ) {
            super(2, htJ);
            this.$toggle = confidentialVmToggle;
            this.$allowed = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmSettingsViewModel.this.new C134701(this.$toggle, this.$allowed, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmSettingWrites confidentialVmSettingWrites = ConfidentialVmSettingsViewModel.this.writes;
                ConfidentialVmToggle confidentialVmToggle = this.$toggle;
                boolean z = this.$allowed;
                this.label = 1;
                obj = confidentialVmSettingWrites.setAllowed(confidentialVmToggle, z, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (obj == ConfidentialVmWriteOutcome.FAILED) {
                ToastApi.INSTANCE.showToast(com.facebook.aura.R.string._name_removed__res_0x7f120b19);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134701) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void setAllowed(ConfidentialVmToggle confidentialVmToggle, boolean z) {
        C7384Etj.A0Y(confidentialVmToggle, 0);
        if (WEB_MEDIA_TOGGLE_KEY.equals(confidentialVmToggle.key)) {
            HatchClientCvmEventLogger.INSTANCE.logWebMediaToggle(z);
        }
        AnonymousClass001.A1J(new C134701(confidentialVmToggle, z, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(X.HtJ<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.settings.ConfidentialVmSettingsViewModel.C134691
            if (r0 == 0) goto L3f
            r4 = r6
            com.facebook.aura.settings.ConfidentialVmSettingsViewModel$refresh$1 r4 = (com.facebook.aura.settings.ConfidentialVmSettingsViewModel.C134691) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L45
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L23:
            X.Hwg.A00(r1)
            com.facebook.aura.confidentialvm.session.ConfidentialSessionGate$Companion r1 = com.facebook.aura.confidentialvm.session.ConfidentialSessionGate.Companion
            X.CGz r0 = r5.userSession
            com.facebook.aura.confidentialvm.session.ConfidentialSessionGate r0 = r1.getInstance(r0)
            boolean r0 = r0.isStandardVm()
            if (r0 != 0) goto L20
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository r0 = r5.repository
            r4.label = r2
            java.lang.Object r0 = r0.m1850fetchIoAF18A(r4)
            if (r0 != r3) goto L20
            return r3
        L3f:
            com.facebook.aura.settings.ConfidentialVmSettingsViewModel$refresh$1 r4 = new com.facebook.aura.settings.ConfidentialVmSettingsViewModel$refresh$1
            r4.<init>(r6)
            goto L12
        L45:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.ConfidentialVmSettingsViewModel.refresh(X.HtJ):java.lang.Object");
    }

    public final C1BN<ConfidentialVmSettings> getUiState() {
        return this.uiState;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConfidentialVmSettingsViewModel(AbstractC3358CGz abstractC3358CGz, PermissionSettingsRepository permissionSettingsRepository, ConfidentialVmSettingWrites confidentialVmSettingWrites, C20Q<Unit> c20q) {
        AnonymousClass005.A14(abstractC3358CGz, permissionSettingsRepository, confidentialVmSettingWrites, c20q);
        this.userSession = abstractC3358CGz;
        this.repository = permissionSettingsRepository;
        this.writes = confidentialVmSettingWrites;
        this.uiState = permissionSettingsRepository.confidentialVmSettings;
        BLL bllA00 = AEu.A00(this);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, new AnonymousClass2(c20q, this, null), AnonymousClass001.A0e(this, num, c6ys, anonymousClass1, bllA00));
    }
}
