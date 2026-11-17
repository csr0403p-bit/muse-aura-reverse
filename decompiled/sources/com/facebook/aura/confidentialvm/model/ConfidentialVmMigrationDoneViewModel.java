package com.facebook.aura.confidentialvm.model;

import X.AEs;
import X.AEu;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3rb;
import X.C3up;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.logout.AuraLogoutHelper;
import com.facebook.aura.navigation.key.ConfidentialVmMigrationDoneOverlayScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection;
import com.facebook.aura.overlay.api.OverlayApi;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ConfidentialVmMigrationDoneViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ConfidentialVmMigrationDoneUiState> _uiState;
    public final HatchConnectorCatalogRepository connectorCatalog;
    public boolean hasLoggedShown;
    public final BLG<Boolean> isSuppressed;
    public final OverlayApi overlayApi;
    public final ConfidentialVmMigrationDoneRepository repository;
    public final C1BN<ConfidentialVmMigrationDoneUiState> uiState;
    public final BLG<Boolean> wantsOverlay;

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel$1", f = "ConfidentialVmMigrationDoneViewModel.kt", l = {64}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel$1$1", f = "ConfidentialVmMigrationDoneViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00811 extends AbstractC07127nr implements G0W<Boolean, Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public /* synthetic */ boolean Z$1;
            public int label;

            public C00811(HtJ<? super C00811> htJ) {
                super(3, htJ);
            }

            public final Object invoke(boolean z, boolean z2, HtJ<? super Boolean> htJ) {
                C00811 c00811 = new C00811(htJ);
                c00811.Z$0 = z;
                c00811.Z$1 = z2;
                return c00811.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    boolean r2 = r3.Z$0
                    boolean r1 = r3.Z$1
                    int r0 = r3.label
                    if (r0 != 0) goto L16
                    X.Hwg.A00(r4)
                    if (r2 == 0) goto L10
                    r0 = 1
                    if (r1 == 0) goto L11
                L10:
                    r0 = 0
                L11:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L16:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel.AnonymousClass1.C00811.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), htJ);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmMigrationDoneViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmMigrationDoneViewModel confidentialVmMigrationDoneViewModel = ConfidentialVmMigrationDoneViewModel.this;
                C20Q c20qA04 = C3rb.A04(new C00811(null), confidentialVmMigrationDoneViewModel.wantsOverlay, confidentialVmMigrationDoneViewModel.isSuppressed);
                final ConfidentialVmMigrationDoneViewModel confidentialVmMigrationDoneViewModel2 = ConfidentialVmMigrationDoneViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        OverlayApi overlayApi = confidentialVmMigrationDoneViewModel2.overlayApi;
                        ConfidentialVmMigrationDoneOverlayScreenKey confidentialVmMigrationDoneOverlayScreenKey = ConfidentialVmMigrationDoneOverlayScreenKey.INSTANCE;
                        if (z) {
                            overlayApi.showOverlay(confidentialVmMigrationDoneOverlayScreenKey);
                        } else {
                            overlayApi.hideOverlay(confidentialVmMigrationDoneOverlayScreenKey);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c20qA04.collect(c20z, this) == enumC10460Hji) {
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
            return ConfidentialVmMigrationDoneViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel$2", f = "ConfidentialVmMigrationDoneViewModel.kt", l = {73, 81, 81}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public boolean Z$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = ConfidentialVmMigrationDoneViewModel.this.new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ea A[RETURN] */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<ConfidentialVmMigrationDoneViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new ConfidentialVmMigrationDoneViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConfidentialVmMigrationDoneViewModel create() {
            return new ConfidentialVmMigrationDoneViewModel(this.userSession);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel", f = "ConfidentialVmMigrationDoneViewModel.kt", l = {151}, m = "disconnectedItem", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel$disconnectedItem$1, reason: invalid class name and case insensitive filesystem */
    public final class C112061 extends HzP {
        public Object L$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C112061(HtJ<? super C112061> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmMigrationDoneViewModel.this.disconnectedItem(null, false, this);
        }
    }

    public ConfidentialVmMigrationDoneViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.repository = ConfidentialVmMigrationDoneRepository.Companion.getInstance(abstractC3358CGz);
        this.connectorCatalog = HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz);
        this.overlayApi = OverlayApi.Companion.getInstance(abstractC3358CGz);
        this.wantsOverlay = C3cG.A14(false);
        this.isSuppressed = C3cG.A14(false);
        C9286GCn c9286GCnA14 = C3cG.A14(new ConfidentialVmMigrationDoneUiState(true, AHI.A01));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        BLL bllA00 = AEu.A00(this);
        AuraDispatchers auraDispatchers = AuraDispatchers.INSTANCE;
        C78T c78tM764default = auraDispatchers.m764default();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        Integer num = C79.A00;
        GAo.A02(num, auraDispatchers.io(), new AnonymousClass2(null), AnonymousClass001.A0e(this, num, c78tM764default, anonymousClass1, bllA00));
    }

    private final String humanized(String str) {
        C7384Etj.A0Y(str, 0);
        String strReplace = str.replace('_', ' ').replace('-', ' ');
        if (strReplace.length() <= 0) {
            return strReplace;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) C3up.A00(strReplace.charAt(0)));
        return AnonymousClass001.A0v(strReplace.substring(1), sb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b A[PHI: r2
  0x003b: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:24:0x0047, B:19:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object disconnectedItem(java.lang.String r6, boolean r7, X.HtJ<? super com.facebook.aura.confidentialvm.model.ConfidentialVmDisconnectedItem> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel.C112061
            if (r0 == 0) goto L5c
            r4 = r8
            com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel$disconnectedItem$1 r4 = (com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel.C112061) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L4a
            if (r0 != r1) goto L62
            boolean r7 = r4.Z$0
            java.lang.Object r6 = r4.L$0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = X.AnonymousClass001.A0q(r3)
        L27:
            boolean r0 = r3 instanceof X.C10571Hud
            r1 = 0
            if (r0 == 0) goto L2d
            r3 = r1
        L2d:
            com.facebook.aura.skills.model.Skill r3 = (com.facebook.aura.skills.model.Skill) r3
            if (r3 == 0) goto L43
            java.lang.String r2 = r3.displayName
            if (r2 == 0) goto L43
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 != 0) goto L43
        L3b:
            java.lang.String r1 = r3.iconUrl
        L3d:
            com.facebook.aura.confidentialvm.model.ConfidentialVmDisconnectedItem r0 = new com.facebook.aura.confidentialvm.model.ConfidentialVmDisconnectedItem
            r0.<init>(r2, r1, r7)
            return r0
        L43:
            java.lang.String r2 = r5.humanized(r6)
            if (r3 == 0) goto L3d
            goto L3b
        L4a:
            X.Hwg.A00(r3)
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository r0 = r5.connectorCatalog
            r4.L$0 = r6
            r4.Z$0 = r7
            r4.label = r1
            java.lang.Object r3 = r0.m2119fetchConnectorgIAlus(r6, r4)
            if (r3 != r2) goto L27
            return r2
        L5c:
            com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel$disconnectedItem$1 r4 = new com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel$disconnectedItem$1
            r4.<init>(r8)
            goto L12
        L62:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel.disconnectedItem(java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    private final void dismiss() {
        this.repository.dismiss();
        AnonymousClass004.A1D(false, this.wantsOverlay);
    }

    private final void logMenuTap(HatchComponent hatchComponent) {
        if (this._uiState.getValue().isConfidentialVm) {
            return;
        }
        ConfidentialVmAnalytics.INSTANCE.logMenuTap(HatchScreen.CVM_MIGRATION_DONE, hatchComponent, ConfidentialVmSwitchDirection.TO_SECURE_VM);
    }

    public final C1BN<ConfidentialVmMigrationDoneUiState> getUiState() {
        return this.uiState;
    }

    public final void onLogOutClick() {
        AuraLogoutHelper auraLogoutHelper = AuraLogoutHelper.INSTANCE;
        if (C3cH.A1R(AuraLogoutHelper.isLoggingOut)) {
            return;
        }
        HatchClientCvmEventLogger.INSTANCE.logLogoutClick();
        logMenuTap(HatchComponent.LOGOUT_BUTTON);
        auraLogoutHelper.performLogout();
    }

    public final void onMenuClick() {
        if (this._uiState.getValue().isConfidentialVm) {
            return;
        }
        ConfidentialVmAnalytics.INSTANCE.logMenuOpen(HatchScreen.CVM_MIGRATION_DONE, ConfidentialVmSwitchDirection.TO_SECURE_VM);
    }

    public final void onOkClick() {
        ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
        confidentialVmAnalytics.logCvmReadyConfirmTap();
        confidentialVmAnalytics.logMigrationDoneOkTap(this._uiState.getValue().isConfidentialVm);
        dismiss();
    }

    public final void onReportIssueClick() {
        ConfidentialVmAnalytics.INSTANCE.logCvmHelpTap();
        logMenuTap(HatchComponent.REPORT_PROBLEM_BUTTON);
    }

    public final void onShown() {
        if (this.hasLoggedShown) {
            return;
        }
        this.hasLoggedShown = true;
        ConfidentialVmAnalytics.INSTANCE.logMigrationDoneShown(this._uiState.getValue().isConfidentialVm);
    }

    public final void onSuppressionChanged(boolean z) {
        AnonymousClass004.A1D(z, this.isSuppressed);
    }

    public final void onBack() {
        dismiss();
    }
}
