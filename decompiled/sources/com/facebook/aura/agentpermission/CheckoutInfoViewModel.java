package com.facebook.aura.agentpermission;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass441;
import X.AnonymousClass603;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3Ek;
import X.C3UX;
import X.C3cI;
import X.C3rb;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.agentpermission.CheckoutInfoUiState;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.HatchWalletRepository;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class CheckoutInfoViewModel extends AEs {
    public static final int $stable = 8;
    public final String approvalId;
    public final HatchAgentPermissionsRepository approvalRepository;
    public final C1BN<List<HatchAgentPermissionsRepository.AgentPermissionApproval>> approvals;
    public final C20Q<String> selection;
    public final C1BN<CheckoutInfoUiState> uiState;
    public final HatchWalletRepository wallet;

    @DebugMetadata(c = "com.facebook.aura.agentpermission.CheckoutInfoViewModel$1", f = "CheckoutInfoViewModel.kt", l = {78}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.CheckoutInfoViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return CheckoutInfoViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final CheckoutInfoViewModel checkoutInfoViewModel = CheckoutInfoViewModel.this;
                C20Q c20qA01 = GDB.A01(checkoutInfoViewModel.selection);
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.agentpermission.CheckoutInfoViewModel.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((String) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(String str, HtJ<? super Unit> htJ) {
                        if (str != null) {
                            checkoutInfoViewModel.wallet.loadCheckoutInfo(str, true);
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
            return CheckoutInfoViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<CheckoutInfoViewModel> {
        public static final int $stable = 8;
        public final String approvalId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public CheckoutInfoViewModel create() {
            return new CheckoutInfoViewModel(this.userSession, this.approvalId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.approvalId = str;
        }
    }

    public final C1BN<CheckoutInfoUiState> getUiState() {
        return this.uiState;
    }

    public final void onCloseHandleTapped() {
        Object next;
        Iterator itA0z = C3cI.A0z(this.approvals);
        do {
            next = null;
            if (!itA0z.hasNext()) {
                break;
            } else {
                next = itA0z.next();
            }
        } while (!C7384Etj.areEqual(((HatchAgentPermissionsRepository.AgentPermissionApproval) next).approvalId, this.approvalId));
        AgentPermissionTelemetryKt.logAgentPermissionSheetCloseClick((HatchAgentPermissionsRepository.AgentPermissionApproval) next, HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_SHEET);
    }

    public final void retry() {
        String paymentMethod = this.uiState.getValue().getPaymentMethod();
        if (paymentMethod != null) {
            this.wallet.loadCheckoutInfo(paymentMethod, true);
        }
    }

    public CheckoutInfoViewModel(AbstractC3358CGz abstractC3358CGz, String str) {
        AnonymousClass003.A0u(abstractC3358CGz, str);
        this.approvalId = str;
        HatchAgentPermissionsRepository companion = HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz);
        this.approvalRepository = companion;
        C1BN<List<HatchAgentPermissionsRepository.AgentPermissionApproval>> c1bn = companion.pendingApprovals;
        this.approvals = c1bn;
        HatchWalletRepository companion2 = HatchWalletRepository.Companion.getInstance(abstractC3358CGz);
        this.wallet = companion2;
        CheckoutInfoViewModel$special$$inlined$map$1 checkoutInfoViewModel$special$$inlined$map$1 = new CheckoutInfoViewModel$special$$inlined$map$1(c1bn, this);
        this.selection = checkoutInfoViewModel$special$$inlined$map$1;
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
        AnonymousClass603 anonymousClass603A00 = C3rb.A00(new CheckoutInfoViewModel$uiState$1(null), checkoutInfoViewModel$special$$inlined$map$1, companion2.checkoutInfo, companion.hasLoadedServerApprovals);
        this.uiState = AnonymousClass441.A00(new CheckoutInfoUiState.Loading(null, CheckoutInfoViewModelKt.checkoutInfoFallbackTitle(null)), AEu.A00(this), anonymousClass603A00, C3Ek.A00);
    }
}
