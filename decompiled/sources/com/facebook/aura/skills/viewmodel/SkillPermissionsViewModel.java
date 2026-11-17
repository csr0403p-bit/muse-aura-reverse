package com.facebook.aura.skills.viewmodel;

import X.AEs;
import X.AEu;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.skills.repo.ConnectorAuthResult;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import com.facebook.aura.skills.repo.SkillPermissions;
import com.facebook.aura.skills.repo.SkillPermissionsRepository;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class SkillPermissionsViewModel extends AEs {
    public static final Companion Companion = new Companion();
    public final BLG<SkillPermissionsUiState> _uiState;
    public final HatchConnectorCatalogRepository connectorRepository;
    public final SkillPermissionsRepository repository;
    public final String skillId;
    public final C1BN<SkillPermissionsUiState> uiState;

    public final class Factory extends AuraViewModelFactory<SkillPermissionsViewModel> {
        public final String skillId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public SkillPermissionsViewModel create() {
            String str = this.skillId;
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            return new SkillPermissionsViewModel(str, abstractC3358CGz, new SkillPermissionsRepository(abstractC3358CGz), HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz));
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.skillId = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel$observeAuthCallbackSuccesses$1", f = "SkillPermissionsViewModel.kt", l = {83}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel$observeAuthCallbackSuccesses$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SkillPermissionsViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final SkillPermissionsViewModel skillPermissionsViewModel = SkillPermissionsViewModel.this;
                C22I<ConnectorAuthResult> c22i = skillPermissionsViewModel.connectorRepository.authResults;
                C20Z<? super ConnectorAuthResult> c20z = new C20Z() { // from class: com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel.observeAuthCallbackSuccesses.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((ConnectorAuthResult) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(ConnectorAuthResult connectorAuthResult, HtJ<? super Unit> htJ) {
                        if (connectorAuthResult.authenticationSucceeded) {
                            skillPermissionsViewModel.refresh();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SkillPermissionsViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel$refresh$1", f = "SkillPermissionsViewModel.kt", l = {97}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C138781 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C138781(HtJ<? super C138781> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SkillPermissionsViewModel.this.new C138781(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SkillPermissionsViewModel.this.new C138781(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            SkillPermissionsUiState value;
            SkillPermissionsUiState skillPermissionsUiState;
            SkillPermissionsUiState value2;
            SkillPermissionsUiState uiState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BLG<SkillPermissionsUiState> blg = SkillPermissionsViewModel.this._uiState;
                do {
                    value = blg.getValue();
                    skillPermissionsUiState = value;
                } while (!blg.A6e(value, skillPermissionsUiState.copy(skillPermissionsUiState.sections, SkillPermissionsLoadingState.LOADING, skillPermissionsUiState.updatingMethodKey, skillPermissionsUiState.updatingMode, skillPermissionsUiState.isResetting)));
                SkillPermissionsViewModel skillPermissionsViewModel = SkillPermissionsViewModel.this;
                SkillPermissionsRepository skillPermissionsRepository = skillPermissionsViewModel.repository;
                String str = skillPermissionsViewModel.skillId;
                this.label = 1;
                obj = skillPermissionsRepository.fetchPermissions(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            SkillPermissions skillPermissions = (SkillPermissions) obj;
            BLG<SkillPermissionsUiState> blg2 = SkillPermissionsViewModel.this._uiState;
            do {
                value2 = blg2.getValue();
                SkillPermissionsUiState skillPermissionsUiState2 = value2;
                if (skillPermissions == null) {
                    uiState = skillPermissionsUiState2.copy(skillPermissionsUiState2.sections, SkillPermissionsLoadingState.ERROR, skillPermissionsUiState2.updatingMethodKey, skillPermissionsUiState2.updatingMode, skillPermissionsUiState2.isResetting);
                } else {
                    uiState = SkillPermissionsViewModelKt.toUiState(skillPermissions);
                }
            } while (!blg2.A6e(value2, uiState));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel$resetToDefaults$1", f = "SkillPermissionsViewModel.kt", l = {136, 141}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel$resetToDefaults$1, reason: invalid class name and case insensitive filesystem */
    public final class C138791 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C138791(HtJ<? super C138791> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SkillPermissionsViewModel.this.new C138791(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SkillPermissionsViewModel.this.new C138791(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r11.label
                r2 = 2
                r10 = 1
                if (r0 == 0) goto L39
                if (r0 == r10) goto L68
                if (r0 != r2) goto La5
                X.Hwg.A00(r12)
            Lf:
                com.facebook.aura.skills.repo.SkillPermissions r12 = (com.facebook.aura.skills.repo.SkillPermissions) r12
                com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel r0 = com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel.this
                X.BLG<com.facebook.aura.skills.viewmodel.SkillPermissionsUiState> r2 = r0._uiState
            L15:
                java.lang.Object r1 = r2.getValue()
                r3 = r1
                com.facebook.aura.skills.viewmodel.SkillPermissionsUiState r3 = (com.facebook.aura.skills.viewmodel.SkillPermissionsUiState) r3
                if (r12 == 0) goto L2b
                com.facebook.aura.skills.viewmodel.SkillPermissionsUiState r0 = com.facebook.aura.skills.viewmodel.SkillPermissionsViewModelKt.toUiState(r12)
            L22:
                boolean r0 = r2.A6e(r1, r0)
                if (r0 == 0) goto L15
            L28:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L2b:
                com.facebook.aura.skills.viewmodel.SkillPermissionsLoadingState r5 = com.facebook.aura.skills.viewmodel.SkillPermissionsLoadingState.ERROR
                X.AHD<com.facebook.aura.skills.viewmodel.SkillPermissionSectionUiModel> r4 = r3.sections
                java.lang.String r6 = r3.updatingMethodKey
                com.facebook.aura.agentpermission.ConnectorPermissionMode r7 = r3.updatingMode
                r8 = 0
                com.facebook.aura.skills.viewmodel.SkillPermissionsUiState r0 = r3.copy(r4, r5, r6, r7, r8)
                goto L22
            L39:
                X.Hwg.A00(r12)
                com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel r0 = com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel.this
                X.BLG<com.facebook.aura.skills.viewmodel.SkillPermissionsUiState> r4 = r0._uiState
            L40:
                java.lang.Object r1 = r4.getValue()
                r5 = r1
                com.facebook.aura.skills.viewmodel.SkillPermissionsUiState r5 = (com.facebook.aura.skills.viewmodel.SkillPermissionsUiState) r5
                X.AHD<com.facebook.aura.skills.viewmodel.SkillPermissionSectionUiModel> r6 = r5.sections
                com.facebook.aura.skills.viewmodel.SkillPermissionsLoadingState r7 = r5.loadingState
                java.lang.String r8 = r5.updatingMethodKey
                com.facebook.aura.agentpermission.ConnectorPermissionMode r9 = r5.updatingMode
                com.facebook.aura.skills.viewmodel.SkillPermissionsUiState r0 = r5.copy(r6, r7, r8, r9, r10)
                boolean r0 = r4.A6e(r1, r0)
                if (r0 == 0) goto L40
                com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel r0 = com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel.this
                com.facebook.aura.skills.repo.SkillPermissionsRepository r1 = r0.repository
                java.lang.String r0 = r0.skillId
                r11.label = r10
                java.lang.Object r12 = r1.resetPermissions(r0, r11)
                if (r12 != r3) goto L6b
                return r3
            L68:
                X.Hwg.A00(r12)
            L6b:
                boolean r1 = X.AnonymousClass001.A1X(r12)
                com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel r0 = com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel.this
                if (r1 != 0) goto L98
                X.BLG<com.facebook.aura.skills.viewmodel.SkillPermissionsUiState> r2 = r0._uiState
            L75:
                java.lang.Object r1 = r2.getValue()
                r3 = r1
                com.facebook.aura.skills.viewmodel.SkillPermissionsUiState r3 = (com.facebook.aura.skills.viewmodel.SkillPermissionsUiState) r3
                X.AHD<com.facebook.aura.skills.viewmodel.SkillPermissionSectionUiModel> r4 = r3.sections
                com.facebook.aura.skills.viewmodel.SkillPermissionsLoadingState r5 = r3.loadingState
                java.lang.String r6 = r3.updatingMethodKey
                com.facebook.aura.agentpermission.ConnectorPermissionMode r7 = r3.updatingMode
                r8 = 0
                com.facebook.aura.skills.viewmodel.SkillPermissionsUiState r0 = r3.copy(r4, r5, r6, r7, r8)
                boolean r0 = r2.A6e(r1, r0)
                if (r0 == 0) goto L75
                com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
                r0 = 2131886369(0x7f120121, float:1.9407315E38)
                r1.showToast(r0)
                goto L28
            L98:
                com.facebook.aura.skills.repo.SkillPermissionsRepository r1 = r0.repository
                java.lang.String r0 = r0.skillId
                r11.label = r2
                java.lang.Object r12 = r1.fetchPermissions(r0, r11)
                if (r12 != r3) goto Lf
                return r3
            La5:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel.C138791.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel$setMethodMode$2", f = "SkillPermissionsViewModel.kt", l = {118, 123}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel$setMethodMode$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ SkillPermissionMethodUiModel $method;
        public final /* synthetic */ ConnectorPermissionMode $mode;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SkillPermissionMethodUiModel skillPermissionMethodUiModel, ConnectorPermissionMode connectorPermissionMode, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$method = skillPermissionMethodUiModel;
            this.$mode = connectorPermissionMode;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SkillPermissionsViewModel.this.new AnonymousClass2(this.$method, this.$mode, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r5 = 2
                r4 = 1
                if (r0 == 0) goto L36
                if (r0 == r4) goto L52
                if (r0 != r5) goto L76
                X.Hwg.A00(r8)
            Lf:
                com.facebook.aura.skills.repo.SkillPermissions r8 = (com.facebook.aura.skills.repo.SkillPermissions) r8
                com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel r0 = com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel.this
                X.BLG<com.facebook.aura.skills.viewmodel.SkillPermissionsUiState> r5 = r0._uiState
                com.facebook.aura.skills.viewmodel.SkillPermissionMethodUiModel r4 = r7.$method
                com.facebook.aura.agentpermission.ConnectorPermissionMode r3 = r7.$mode
            L19:
                java.lang.Object r2 = r5.getValue()
                r1 = r2
                com.facebook.aura.skills.viewmodel.SkillPermissionsUiState r1 = (com.facebook.aura.skills.viewmodel.SkillPermissionsUiState) r1
                if (r8 == 0) goto L2f
                com.facebook.aura.skills.viewmodel.SkillPermissionsUiState r0 = com.facebook.aura.skills.viewmodel.SkillPermissionsViewModelKt.toUiState(r8)
            L26:
                boolean r0 = r5.A6e(r2, r0)
                if (r0 == 0) goto L19
            L2c:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L2f:
                java.lang.String r0 = r4.key
                com.facebook.aura.skills.viewmodel.SkillPermissionsUiState r0 = com.facebook.aura.skills.viewmodel.SkillPermissionsViewModelKt.applyUpdatedMode(r1, r0, r3)
                goto L26
            L36:
                X.Hwg.A00(r8)
                com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel r0 = com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel.this
                com.facebook.aura.skills.repo.SkillPermissionsRepository r3 = r0.repository
                java.lang.String r2 = r0.skillId
                com.facebook.aura.skills.viewmodel.SkillPermissionMethodUiModel r0 = r7.$method
                java.lang.String r1 = r0.key
                com.facebook.aura.agentpermission.ConnectorPermissionMode r0 = r7.$mode
                java.util.Map r0 = X.AnonymousClass006.A10(r1, r0)
                r7.label = r4
                java.lang.Object r8 = r3.setPermissions(r2, r0, r7)
                if (r8 != r6) goto L55
                return r6
            L52:
                X.Hwg.A00(r8)
            L55:
                boolean r1 = X.AnonymousClass001.A1X(r8)
                com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel r0 = com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel.this
                if (r1 != 0) goto L69
                com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel.access$clearPendingUpdate(r0)
                com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
                r0 = 2131886411(0x7f12014b, float:1.94074E38)
                r1.showToast(r0)
                goto L2c
            L69:
                com.facebook.aura.skills.repo.SkillPermissionsRepository r1 = r0.repository
                java.lang.String r0 = r0.skillId
                r7.label = r5
                java.lang.Object r8 = r1.fetchPermissions(r0, r7)
                if (r8 != r6) goto Lf
                return r6
            L76:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void setMethodMode(SkillPermissionMethodUiModel skillPermissionMethodUiModel, ConnectorPermissionMode connectorPermissionMode) {
        SkillPermissionsUiState value;
        SkillPermissionsUiState skillPermissionsUiState;
        AnonymousClass003.A0u(skillPermissionMethodUiModel, connectorPermissionMode);
        SkillPermissionsUiState value2 = this._uiState.getValue();
        if (skillPermissionMethodUiModel.restricted || skillPermissionMethodUiModel.mode == connectorPermissionMode || value2.updatingMethodKey != null) {
            return;
        }
        BLG<SkillPermissionsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            skillPermissionsUiState = value;
        } while (!blg.A6e(value, skillPermissionsUiState.copy(skillPermissionsUiState.sections, skillPermissionsUiState.loadingState, skillPermissionMethodUiModel.key, connectorPermissionMode, skillPermissionsUiState.isResetting)));
        AnonymousClass001.A1J(new AnonymousClass2(skillPermissionMethodUiModel, connectorPermissionMode, null), AEu.A00(this));
    }

    public /* synthetic */ SkillPermissionsViewModel(String str, AbstractC3358CGz abstractC3358CGz, SkillPermissionsRepository skillPermissionsRepository, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, int i, C06H c06h) {
        this(str, abstractC3358CGz, (i & 4) != 0 ? new SkillPermissionsRepository(abstractC3358CGz) : skillPermissionsRepository, (i & 8) != 0 ? HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz) : hatchConnectorCatalogRepository);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearPendingUpdate() {
        SkillPermissionsUiState value;
        SkillPermissionsUiState skillPermissionsUiState;
        BLG<SkillPermissionsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            skillPermissionsUiState = value;
        } while (!blg.A6e(value, skillPermissionsUiState.copy(skillPermissionsUiState.sections, skillPermissionsUiState.loadingState, null, null, skillPermissionsUiState.isResetting)));
    }

    public final C1BN<SkillPermissionsUiState> getUiState() {
        return this.uiState;
    }

    public final void refresh() {
        if (this._uiState.getValue().updatingMethodKey == null) {
            AnonymousClass001.A1J(new C138781(null), AEu.A00(this));
        }
    }

    public final void resetToDefaults() {
        if (this._uiState.getValue().updatingMethodKey == null) {
            AnonymousClass001.A1J(new C138791(null), AEu.A00(this));
        }
    }

    public final class Companion {
        public final String key(String str) {
            C7384Etj.A0Y(str, 0);
            return FGI.A0M("SkillPermissionsViewModel:", str);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void observeAuthCallbackSuccesses() {
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    public SkillPermissionsViewModel(String str, AbstractC3358CGz abstractC3358CGz, SkillPermissionsRepository skillPermissionsRepository, HatchConnectorCatalogRepository hatchConnectorCatalogRepository) {
        AnonymousClass005.A11(str, skillPermissionsRepository, hatchConnectorCatalogRepository, 0);
        this.skillId = str;
        this.repository = skillPermissionsRepository;
        this.connectorRepository = hatchConnectorCatalogRepository;
        C9286GCn c9286GCnA14 = C3cG.A14(new SkillPermissionsUiState(AHI.A01, SkillPermissionsLoadingState.IDLE, null, null, false));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        refresh();
        observeAuthCallbackSuccesses();
    }
}
