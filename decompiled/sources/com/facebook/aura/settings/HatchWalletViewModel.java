package com.facebook.aura.settings;

import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C20Z;
import X.C3Pi;
import X.C3UX;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import X.C7BY;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.JarvisUtils;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.skills.model.ConnectorCatalogKt;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogActionLabel;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogPageUiState;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogPageViewModel;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogRefreshReason;
import com.facebook.aura.skills.viewmodel.ConnectorScreenViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchWalletViewModel extends ConnectorScreenViewModel {
    public static final int $stable = 8;
    public final BLG<HatchWalletUiState> _uiState;
    public final LocalDeviceConnectorsRepository deviceRepository;
    public final C1BN<AiIdentity> identity;
    public final ConnectorCatalogPageViewModel page;
    public final C1BN<HatchWalletUiState> uiState;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.settings.HatchWalletViewModel$1", f = "HatchWalletViewModel.kt", l = {91}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchWalletViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.settings.HatchWalletViewModel$1$1", f = "HatchWalletViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.settings.HatchWalletViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03521 extends AbstractC07127nr implements G0W<AiIdentity, ConnectorCatalogPageUiState, HtJ<? super HatchWalletUiState>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public int label;
            public final /* synthetic */ HatchWalletViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03521(HatchWalletViewModel hatchWalletViewModel, HtJ<? super C03521> htJ) {
                super(3, htJ);
                this.this$0 = hatchWalletViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                String selectedAssistantName;
                String str;
                AiIdentity aiIdentity = (AiIdentity) this.L$0;
                ConnectorCatalogPageUiState connectorCatalogPageUiState = (ConnectorCatalogPageUiState) this.L$1;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                HatchWalletViewModel hatchWalletViewModel = this.this$0;
                if (aiIdentity == null || (str = aiIdentity.name) == null || (selectedAssistantName = AnonymousClass002.A0l(str)) == null || C7BY.A0j(selectedAssistantName)) {
                    selectedAssistantName = JarvisUtils.INSTANCE.getSelectedAssistantName(this.this$0.userSession);
                }
                return hatchWalletViewModel.present(selectedAssistantName, connectorCatalogPageUiState);
            }

            @Override // X.G0W
            public final Object invoke(AiIdentity aiIdentity, ConnectorCatalogPageUiState connectorCatalogPageUiState, HtJ<? super HatchWalletUiState> htJ) {
                C03521 c03521 = new C03521(this.this$0, htJ);
                c03521.L$0 = aiIdentity;
                c03521.L$1 = connectorCatalogPageUiState;
                return c03521.invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchWalletViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchWalletViewModel hatchWalletViewModel = HatchWalletViewModel.this;
                C60I c60iA03 = C3rb.A03(new C03521(hatchWalletViewModel, null), hatchWalletViewModel.identity, hatchWalletViewModel.page.uiState);
                final HatchWalletViewModel hatchWalletViewModel2 = HatchWalletViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.settings.HatchWalletViewModel.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchWalletUiState) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HatchWalletUiState hatchWalletUiState, HtJ<? super Unit> htJ) {
                        hatchWalletViewModel2._uiState.Af8(hatchWalletUiState);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c60iA03.collect(c20z, this) == enumC10460Hji) {
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
            return HatchWalletViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<HatchWalletViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchWalletViewModel create() {
            return new HatchWalletViewModel(this.userSession, null, 0 == true ? 1 : 0, 6, 0 == true ? 1 : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWalletViewModel(AbstractC3358CGz abstractC3358CGz, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, LocalDeviceConnectorsRepository localDeviceConnectorsRepository) {
        super(localDeviceConnectorsRepository, hatchConnectorCatalogRepository);
        AnonymousClass005.A10(abstractC3358CGz, hatchConnectorCatalogRepository, localDeviceConnectorsRepository);
        this.userSession = abstractC3358CGz;
        this.deviceRepository = localDeviceConnectorsRepository;
        ConnectorCatalogPageViewModel connectorCatalogPageViewModel = new ConnectorCatalogPageViewModel(AEu.A00(this), hatchConnectorCatalogRepository, ConnectorCatalogKt.WALLET_CATEGORY_ID, localDeviceConnectorsRepository, this.connectingIds);
        this.page = connectorCatalogPageViewModel;
        this.identity = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz).getAiIdentity();
        C9286GCn c9286GCnA01 = HnJ.A01(present(currentAgentName(), connectorCatalogPageViewModel.uiState.getValue()));
        this._uiState = c9286GCnA01;
        this.uiState = new C3Pi(null, c9286GCnA01);
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
        connectorCatalogPageViewModel.refresh(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.settings.HatchWalletUiState present(java.lang.String r9, com.facebook.aura.skills.viewmodel.ConnectorCatalogPageUiState r10) {
        /*
            r8 = this;
            r8 = 1
            X.AII r7 = X.AIM.A17()
            X.AHD<com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState> r0 = r10.rows
            java.util.Iterator r6 = r0.iterator()
        Lb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r5 = r6.next()
            com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState r5 = (com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState) r5
            java.lang.String r4 = r5.connectorId
            java.lang.String r0 = "connector-"
            java.lang.String r3 = X.FGI.A0M(r0, r4)
            com.facebook.aura.skills.viewmodel.ConnectorCatalogActionLabel r0 = r5.actionLabel
            int r1 = r0.ordinal()
            if (r1 == r8) goto L3b
            r0 = 2
            if (r1 == r0) goto L38
            r0 = 0
            if (r1 != r0) goto L42
            java.lang.String r1 = "hatch-wallet-add-payment-method"
        L2f:
            com.facebook.aura.settings.WalletEntryUiState$Connector r0 = new com.facebook.aura.settings.WalletEntryUiState$Connector
            r0.<init>(r5, r3, r1)
            r7.add(r0)
            goto Lb
        L38:
            java.lang.String r0 = "hatch-wallet-coming-soon-payment-method-"
            goto L3d
        L3b:
            java.lang.String r0 = "hatch-wallet-payment-method-"
        L3d:
            java.lang.String r1 = X.FGI.A0M(r0, r4)
            goto L2f
        L42:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L48:
            X.AII r0 = X.AIM.A18(r7)
            X.AHH r3 = X.AGI.A0C(r0)
            boolean r4 = r10.hasLoaded
            boolean r5 = r10.showLoading
            boolean r6 = r10.showError
            if (r4 == 0) goto L67
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L67
            boolean r0 = r10.showLoading
            if (r0 != 0) goto L67
            boolean r0 = r10.showError
            r7 = 1
            if (r0 == 0) goto L68
        L67:
            r7 = 0
        L68:
            boolean r8 = r10.canLoadMore
            com.facebook.aura.settings.HatchWalletUiState r1 = new com.facebook.aura.settings.HatchWalletUiState
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchWalletViewModel.present(java.lang.String, com.facebook.aura.skills.viewmodel.ConnectorCatalogPageUiState):com.facebook.aura.settings.HatchWalletUiState");
    }

    @Override // com.facebook.aura.skills.viewmodel.ConnectorScreenViewModel
    public void refreshQuery(ConnectorCatalogRefreshReason connectorCatalogRefreshReason) {
        int iA0E = AnonymousClass001.A0E(connectorCatalogRefreshReason, 0);
        if (iA0E == 0) {
            refresh();
        } else {
            if (iA0E != 1) {
                throw new NoWhenBranchMatchedException();
            }
            publishCurrentState();
            this.page.ensureLoaded();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ConnectorCatalogRefreshReason.values().length];
            try {
                AnonymousClass005.A0v(ConnectorCatalogRefreshReason.RESUME, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(ConnectorCatalogRefreshReason.CONNECTION_CHANGED, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConnectorCatalogActionLabel.values().length];
            try {
                AnonymousClass005.A0v(ConnectorCatalogActionLabel.VIEW, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(ConnectorCatalogActionLabel.COMING_SOON, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A15(ConnectorCatalogActionLabel.CONNECT, iArr2);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final String currentAgentName() {
        String str;
        String strA0l;
        AiIdentity value = this.identity.getValue();
        return (value == null || (str = value.name) == null || (strA0l = AnonymousClass002.A0l(str)) == null || C7BY.A0j(strA0l)) ? JarvisUtils.INSTANCE.getSelectedAssistantName(this.userSession) : strA0l;
    }

    private final void publishCurrentState() {
        this._uiState.Af8(present(currentAgentName(), this.page.uiState.getValue()));
    }

    public final C1BN<HatchWalletUiState> getUiState() {
        return this.uiState;
    }

    public final void loadNextPage() {
        this.page.loadNextPage();
    }

    public final void refresh() {
        publishCurrentState();
        this.page.refresh(false);
    }

    public final void retry() {
        publishCurrentState();
        this.page.retry();
    }

    public /* synthetic */ HatchWalletViewModel(AbstractC3358CGz abstractC3358CGz, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, LocalDeviceConnectorsRepository localDeviceConnectorsRepository, int i, C06H c06h) {
        this(abstractC3358CGz, (i & 2) != 0 ? HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz) : hatchConnectorCatalogRepository, (i & 4) != 0 ? LocalDeviceConnectorsRepository.Companion.getInstance(abstractC3358CGz) : localDeviceConnectorsRepository);
    }
}
