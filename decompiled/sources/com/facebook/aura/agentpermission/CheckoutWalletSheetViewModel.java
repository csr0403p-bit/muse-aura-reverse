package com.facebook.aura.agentpermission;

import X.AEs;
import X.AEu;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.GDB;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.HatchWalletRepository;
import com.facebook.aura.gateway.WalletCatalog;
import com.facebook.aura.gateway.WalletPaymentOption;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class CheckoutWalletSheetViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<WalletSheetUiState> _uiState;
    public HatchAgentPermissionsRepository.CheckoutApprovalPayload approval;
    public final String approvalId;
    public final HatchAgentPermissionsRepository approvalsRepository;
    public WalletCatalog catalog;
    public HoC loadJob;
    public final String paymentMethod;
    public final C1BN<WalletSheetUiState> uiState;
    public final HatchWalletRepository walletRepository;

    @DebugMetadata(c = "com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1", f = "CheckoutWalletSheetViewModel.kt", l = {163}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return CheckoutWalletSheetViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final CheckoutWalletSheetViewModel checkoutWalletSheetViewModel = CheckoutWalletSheetViewModel.this;
                C20Q c20qA01 = GDB.A01(new CheckoutWalletSheetViewModel$1$invokeSuspend$$inlined$map$1(checkoutWalletSheetViewModel.approvalsRepository.pendingApprovals, checkoutWalletSheetViewModel));
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchAgentPermissionsRepository.CheckoutApprovalPayload) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HatchAgentPermissionsRepository.CheckoutApprovalPayload checkoutApprovalPayload, HtJ<? super Unit> htJ) {
                        CheckoutWalletSheetViewModel checkoutWalletSheetViewModel2 = checkoutWalletSheetViewModel;
                        if (checkoutApprovalPayload == null) {
                            checkoutWalletSheetViewModel2.dismiss();
                        } else {
                            checkoutWalletSheetViewModel2.approval = checkoutApprovalPayload;
                            checkoutWalletSheetViewModel2.renderCatalog();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c20qA01.collect(c20z, this) == enumC10460Hji) {
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
            return CheckoutWalletSheetViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<CheckoutWalletSheetViewModel> {
        public static final int $stable = 8;
        public final String approvalId;
        public final String paymentMethod;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public CheckoutWalletSheetViewModel create() {
            return new CheckoutWalletSheetViewModel(this.userSession, this.approvalId, this.paymentMethod);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.approvalId = str;
            this.paymentMethod = str2;
        }

        public /* synthetic */ Factory(AbstractC3358CGz abstractC3358CGz, String str, String str2, int i, C06H c06h) {
            this(abstractC3358CGz, str, AnonymousClass006.A0t(i, str2));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$load$2", f = "CheckoutWalletSheetViewModel.kt", l = {195}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$load$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return CheckoutWalletSheetViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM969getCataloggIAlus;
            WalletSheetUiState value;
            WalletSheetUiState walletSheetUiState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                CheckoutWalletSheetViewModel checkoutWalletSheetViewModel = CheckoutWalletSheetViewModel.this;
                HatchWalletRepository hatchWalletRepository = checkoutWalletSheetViewModel.walletRepository;
                boolean zA1Y = AnonymousClass002.A1Y(checkoutWalletSheetViewModel.paymentMethod);
                this.label = 1;
                objM969getCataloggIAlus = hatchWalletRepository.m969getCataloggIAlus(zA1Y, this);
                if (objM969getCataloggIAlus == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM969getCataloggIAlus = AnonymousClass001.A0q(obj);
            }
            if (objM969getCataloggIAlus instanceof C10571Hud) {
                objM969getCataloggIAlus = null;
            }
            WalletCatalog walletCatalog = (WalletCatalog) objM969getCataloggIAlus;
            CheckoutWalletSheetViewModel checkoutWalletSheetViewModel2 = CheckoutWalletSheetViewModel.this;
            if (walletCatalog == null) {
                BLG<WalletSheetUiState> blg = checkoutWalletSheetViewModel2._uiState;
                do {
                    value = blg.getValue();
                    walletSheetUiState = value;
                } while (!blg.A6e(value, walletSheetUiState.copy(walletSheetUiState.groups, walletSheetUiState.currentSelectionKey, walletSheetUiState.requestedKey, true, true, walletSheetUiState.dismissed)));
            } else {
                checkoutWalletSheetViewModel2.applyCatalog(walletCatalog);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return CheckoutWalletSheetViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$onSelectCard$2", f = "CheckoutWalletSheetViewModel.kt", l = {244}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel$onSelectCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C108232 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ WalletPaymentOption $option;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108232(WalletPaymentOption walletPaymentOption, HtJ<? super C108232> htJ) {
            super(2, htJ);
            this.$option = walletPaymentOption;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return CheckoutWalletSheetViewModel.this.new C108232(this.$option, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            WalletSheetUiState value;
            WalletSheetUiState walletSheetUiState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                CheckoutWalletSheetViewModel checkoutWalletSheetViewModel = CheckoutWalletSheetViewModel.this;
                HatchAgentPermissionsRepository hatchAgentPermissionsRepository = checkoutWalletSheetViewModel.approvalsRepository;
                String str = checkoutWalletSheetViewModel.approvalId;
                WalletPaymentOption walletPaymentOption = this.$option;
                String str2 = walletPaymentOption.paymentMethod;
                String str3 = walletPaymentOption.paymentType;
                if (str3 == null) {
                    str3 = "card";
                }
                String str4 = walletPaymentOption.paymentId;
                this.label = 1;
                obj = hatchAgentPermissionsRepository.setWalletSelection(str, str2, str3, str4, true, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (obj instanceof HatchAgentPermissionsRepository.DecideResult.Success) {
                CheckoutWalletSheetViewModel.this.dismiss();
            } else {
                if (!(obj instanceof HatchAgentPermissionsRepository.DecideResult.Failed) && !(obj instanceof HatchAgentPermissionsRepository.DecideResult.Confirming) && !(obj instanceof HatchAgentPermissionsRepository.DecideResult.PartiallyApplied)) {
                    throw C3cG.A0q();
                }
                BLG<WalletSheetUiState> blg = CheckoutWalletSheetViewModel.this._uiState;
                do {
                    value = blg.getValue();
                    walletSheetUiState = value;
                } while (!blg.A6e(value, walletSheetUiState.copy(walletSheetUiState.groups, walletSheetUiState.currentSelectionKey, null, walletSheetUiState.loaded, walletSheetUiState.loadFailed, walletSheetUiState.dismissed)));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C108232) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void onSelectCard(WalletOptionKey walletOptionKey) {
        WalletSheetUiState value;
        WalletSheetUiState walletSheetUiState;
        C7384Etj.A0Y(walletOptionKey, 0);
        AgentPermissionTelemetryKt.logAgentPermissionCardClick(HatchComponent.PAYMENT_METHOD_ROW, HatchScreen.PAYMENT_METHOD, pendingApproval(), null, null, 1);
        WalletSheetUiState value2 = this._uiState.getValue();
        if (AnonymousClass002.A1X(value2.requestedKey) || value2.dismissed) {
            return;
        }
        if (walletOptionKey.equals(value2.currentSelectionKey)) {
            dismiss();
            return;
        }
        WalletPaymentOption walletPaymentOptionFindOption = CheckoutWalletSheetViewModelKt.findOption(value2.groups, walletOptionKey);
        if (walletPaymentOptionFindOption == null || !walletPaymentOptionFindOption.isEligible) {
            return;
        }
        BLG<WalletSheetUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            walletSheetUiState = value;
        } while (!blg.A6e(value, walletSheetUiState.copy(walletSheetUiState.groups, walletSheetUiState.currentSelectionKey, walletOptionKey, walletSheetUiState.loaded, walletSheetUiState.loadFailed, walletSheetUiState.dismissed)));
        AnonymousClass001.A1J(new C108232(walletPaymentOptionFindOption, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyCatalog(WalletCatalog walletCatalog) {
        this.catalog = walletCatalog;
        renderCatalog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismiss() {
        WalletSheetUiState value;
        WalletSheetUiState walletSheetUiState;
        BLG<WalletSheetUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            walletSheetUiState = value;
        } while (!blg.A6e(value, walletSheetUiState.copy(walletSheetUiState.groups, walletSheetUiState.currentSelectionKey, walletSheetUiState.requestedKey, walletSheetUiState.loaded, walletSheetUiState.loadFailed, true)));
    }

    private final HatchAgentPermissionsRepository.AgentPermissionApproval pendingApproval() {
        Object next;
        Iterator itA0z = C3cI.A0z(this.approvalsRepository.pendingApprovals);
        while (true) {
            if (!itA0z.hasNext()) {
                next = null;
                break;
            }
            next = itA0z.next();
            if (C7384Etj.areEqual(((HatchAgentPermissionsRepository.AgentPermissionApproval) next).approvalId, this.approvalId)) {
                break;
            }
        }
        return (HatchAgentPermissionsRepository.AgentPermissionApproval) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void renderCatalog() {
        /*
            r12 = this;
            com.facebook.aura.gateway.WalletCatalog r1 = r12.catalog
            if (r1 == 0) goto L5f
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$CheckoutApprovalPayload r0 = r12.approval
            java.util.List r0 = com.facebook.aura.agentpermission.CheckoutWalletSheetViewModelKt.paymentOptionsFor(r1, r0)
            X.AHD r4 = com.facebook.aura.agentpermission.CheckoutWalletSheetViewModelKt.groupByPaymentMethod(r0)
            if (r4 == 0) goto L5f
            java.lang.String r5 = r12.paymentMethod
            if (r5 == 0) goto L35
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r4.iterator()
        L1c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.agentpermission.WalletPaymentMethodGroup r0 = (com.facebook.aura.agentpermission.WalletPaymentMethodGroup) r0
            java.lang.String r0 = r0.paymentMethod
            X.C3cI.A1J(r0, r1, r5, r3)
            goto L1c
        L2f:
            X.AHD r6 = X.AGI.A07(r3)
            if (r6 != 0) goto L36
        L35:
            r6 = r4
        L36:
            X.BLG<com.facebook.aura.agentpermission.WalletSheetUiState> r3 = r12._uiState
        L38:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            com.facebook.aura.agentpermission.WalletSheetUiState r1 = (com.facebook.aura.agentpermission.WalletSheetUiState) r1
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$CheckoutApprovalPayload r0 = r12.approval
            if (r0 == 0) goto L5d
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$CheckoutPaymentSelection r0 = r0.getPaymentSelection()
        L47:
            com.facebook.aura.agentpermission.WalletOptionKey r7 = com.facebook.aura.agentpermission.CheckoutWalletSheetViewModelKt.resolveSelection(r4, r0)
            com.facebook.aura.agentpermission.WalletOptionKey r8 = r1.requestedKey
            boolean r11 = r1.dismissed
            r9 = 1
            r10 = 0
            com.facebook.aura.agentpermission.WalletSheetUiState r5 = new com.facebook.aura.agentpermission.WalletSheetUiState
            r5.<init>(r6, r7, r8, r9, r10, r11)
            boolean r0 = r3.A6e(r2, r5)
            if (r0 == 0) goto L38
            return
        L5d:
            r0 = 0
            goto L47
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.CheckoutWalletSheetViewModel.renderCatalog():void");
    }

    public final C1BN<WalletSheetUiState> getUiState() {
        return this.uiState;
    }

    public final void load() {
        WalletSheetUiState value;
        WalletSheetUiState walletSheetUiState;
        BLG<WalletSheetUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            walletSheetUiState = value;
        } while (!blg.A6e(value, walletSheetUiState.copy(walletSheetUiState.groups, walletSheetUiState.currentSelectionKey, walletSheetUiState.requestedKey, false, false, walletSheetUiState.dismissed)));
        HoC hoC = this.loadJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.loadJob = AnonymousClass001.A11(new AnonymousClass2(null), AEu.A00(this));
    }

    public final void onChooseDifferentCardTapped() {
        C3cI.A1C(HatchComponent.USE_CREDIT_CARD, HatchScreen.PAYMENT_METHOD, pendingApproval());
    }

    public final void onRetryTapped() {
        C3cI.A1C(HatchComponent.RETRY_BUTTON, HatchScreen.PAYMENT_METHOD, pendingApproval());
        load();
    }

    public CheckoutWalletSheetViewModel(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
        boolean zA1b = AnonymousClass004.A1b(abstractC3358CGz, str);
        this.approvalId = str;
        this.paymentMethod = str2;
        this.approvalsRepository = HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz);
        this.walletRepository = HatchWalletRepository.Companion.getInstance(abstractC3358CGz);
        C9286GCn c9286GCnA14 = C3cG.A14(new WalletSheetUiState(AHI.A01, null, null, zA1b, zA1b, zA1b));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
        load();
    }

    public final void onCloseTapped() {
        AgentPermissionTelemetryKt.logAgentPermissionSheetCloseClick(pendingApproval(), HatchScreen.PAYMENT_METHOD);
    }

    public /* synthetic */ CheckoutWalletSheetViewModel(AbstractC3358CGz abstractC3358CGz, String str, String str2, int i, C06H c06h) {
        this(abstractC3358CGz, str, AnonymousClass006.A0t(i, str2));
    }
}
