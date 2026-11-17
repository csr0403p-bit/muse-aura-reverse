package com.facebook.aura.skills.viewmodel;

import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.skills.model.ConnectorCatalogPage;
import com.facebook.aura.skills.model.ConnectorCatalogQuery;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchConnectedConnectorsViewModel extends ConnectorScreenViewModel {
    public final LocalDeviceConnectorsRepository deviceRepository;
    public final BLG<LoadState> loadState;
    public final ConnectorCatalogQuery.Category query;
    public HoC refreshJob;
    public long refreshVersion;
    public final HatchConnectorCatalogRepository repository;
    public final C1BN<ConnectedConnectorsUiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel$1", f = "HatchConnectedConnectorsViewModel.kt", l = {78}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectedConnectorsViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConnectedConnectorsViewModel hatchConnectedConnectorsViewModel = HatchConnectedConnectorsViewModel.this;
                C20Q<ConnectorCatalogPage> c20qObservePage = hatchConnectedConnectorsViewModel.repository.observePage(hatchConnectedConnectorsViewModel.query);
                final HatchConnectedConnectorsViewModel hatchConnectedConnectorsViewModel2 = HatchConnectedConnectorsViewModel.this;
                C20Z<? super ConnectorCatalogPage> c20z = new C20Z() { // from class: com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((ConnectorCatalogPage) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(ConnectorCatalogPage connectorCatalogPage, HtJ<? super Unit> htJ) {
                        if (connectorCatalogPage != null && connectorCatalogPage.nextCursor == null) {
                            BLG<LoadState> blg = hatchConnectedConnectorsViewModel2.loadState;
                            while (!blg.A6e(blg.getValue(), new LoadState(true, false, false))) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c20qObservePage.collect(c20z, this) == enumC10460Hji) {
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
            return HatchConnectedConnectorsViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<HatchConnectedConnectorsViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchConnectedConnectorsViewModel create() {
            return new HatchConnectedConnectorsViewModel(this.userSession, null, 0 == true ? 1 : 0, 6, 0 == true ? 1 : 0);
        }
    }

    public final class LoadState extends C06G {
        public final boolean error;
        public final boolean hasLoaded;
        public final boolean isLoading;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof LoadState) {
                    LoadState loadState = (LoadState) obj;
                    if (this.hasLoaded != loadState.hasLoaded || this.isLoading != loadState.isLoading || this.error != loadState.error) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ LoadState copy$default(LoadState loadState, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loadState.hasLoaded;
            }
            if ((i & 2) != 0) {
                z2 = loadState.isLoading;
            }
            if ((i & 4) != 0) {
                z3 = loadState.error;
            }
            return new LoadState(z, z2, z3);
        }

        public final boolean component1() {
            return this.hasLoaded;
        }

        public final boolean component2() {
            return this.isLoading;
        }

        public final boolean component3() {
            return this.error;
        }

        public final LoadState copy(boolean z, boolean z2, boolean z3) {
            return new LoadState(z, z2, z3);
        }

        public final boolean getError() {
            return this.error;
        }

        public final boolean getHasLoaded() {
            return this.hasLoaded;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(C0KA.A02(this.hasLoaded), this.isLoading), this.error);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public LoadState(boolean z, boolean z2, boolean z3) {
            this.hasLoaded = z;
            this.isLoading = z2;
            this.error = z3;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ LoadState(boolean z, boolean z2, boolean z3, int i, C06H c06h) {
            this(z, (i & 2) != 0 ? !z : z2, AnonymousClass005.A1O(i, z3));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel$refresh$2", f = "HatchConnectedConnectorsViewModel.kt", l = {AuraWaitlistConfettiKt.StandardParticleCount, 93}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel$refresh$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HoC $previousJob;
        public final /* synthetic */ long $version;
        public int label;
        public final /* synthetic */ HatchConnectedConnectorsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HoC hoC, HatchConnectedConnectorsViewModel hatchConnectedConnectorsViewModel, long j, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$previousJob = hoC;
            this.this$0 = hatchConnectedConnectorsViewModel;
            this.$version = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$previousJob, this.this$0, this.$version, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r2 = 2
                r1 = 1
                if (r0 == 0) goto L40
                if (r0 == r1) goto L50
                if (r0 != r2) goto L60
                java.lang.Object r6 = X.AnonymousClass001.A0q(r8)
            L10:
                long r4 = r7.$version
                com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel r3 = r7.this$0
                long r1 = r3.refreshVersion
                int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r0 != 0) goto L3d
                X.BLG<com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel$LoadState> r5 = r3.loadState
            L1c:
                java.lang.Object r4 = r5.getValue()
                r0 = r4
                com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel$LoadState r0 = (com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel.LoadState) r0
                boolean r0 = r0.hasLoaded
                if (r0 != 0) goto L2e
                boolean r0 = r6 instanceof X.C10571Hud
                r0 = r0 ^ 1
                r3 = 0
                if (r0 == 0) goto L2f
            L2e:
                r3 = 1
            L2f:
                boolean r2 = r6 instanceof X.C10571Hud
                r1 = 0
                com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel$LoadState r0 = new com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel$LoadState
                r0.<init>(r3, r1, r2)
                boolean r0 = r5.A6e(r4, r0)
                if (r0 == 0) goto L1c
            L3d:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L40:
                X.Hwg.A00(r8)
                X.HoC r0 = r7.$previousJob
                if (r0 == 0) goto L53
                r7.label = r1
                java.lang.Object r0 = X.HzS.A00(r7, r0)
                if (r0 != r3) goto L53
                return r3
            L50:
                X.Hwg.A00(r8)
            L53:
                com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel r0 = r7.this$0
                com.facebook.aura.skills.repo.HatchConnectorCatalogRepository r0 = r0.repository
                r7.label = r2
                java.lang.Object r6 = r0.m2118fetchConnectedConnectorsIoAF18A(r7)
                if (r6 != r3) goto L10
                return r3
            L60:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.skills.viewmodel.ConnectedConnectorsUiState present(com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel.LoadState r8, X.AHD<com.facebook.aura.skills.model.Skill> r9, X.AHD<com.facebook.aura.agentpermission.LocalDeviceConnector> r10) {
        /*
            r7 = this;
            r4 = r9
            boolean r0 = r8.hasLoaded
            if (r0 != 0) goto L7
            X.AHI r4 = X.AHI.A01
        L7:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r10.iterator()
        L10:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.agentpermission.LocalDeviceConnector r0 = (com.facebook.aura.agentpermission.LocalDeviceConnector) r0
            boolean r0 = r0.isConnected
            if (r0 == 0) goto L10
            r3.add(r1)
            goto L10
        L25:
            X.AHH r5 = X.AGI.A0C(r3)
            int r6 = r4.size()
            int r0 = r5.size()
            int r6 = r6 + r0
            boolean r7 = r8.isLoading
            boolean r0 = r8.error
            if (r0 == 0) goto L3f
            boolean r0 = r4.isEmpty()
            r8 = 1
            if (r0 != 0) goto L40
        L3f:
            r8 = 0
        L40:
            boolean r9 = X.AnonymousClass002.A1M(r6)
            com.facebook.aura.skills.viewmodel.ConnectedConnectorsUiState r3 = new com.facebook.aura.skills.viewmodel.ConnectedConnectorsUiState
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel.present(com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel$LoadState, X.AHD, X.AHD):com.facebook.aura.skills.viewmodel.ConnectedConnectorsUiState");
    }

    public final void refresh() {
        LoadState value;
        boolean z;
        long j = this.refreshVersion + 1;
        this.refreshVersion = j;
        HoC hoC = this.refreshJob;
        BLG<LoadState> blg = this.loadState;
        do {
            value = blg.getValue();
            z = value.hasLoaded;
        } while (!blg.A6e(value, new LoadState(z, !z, false)));
        this.refreshJob = AnonymousClass001.A11(new AnonymousClass2(hoC, this, j, null), AEu.A00(this));
    }

    @Override // com.facebook.aura.skills.viewmodel.ConnectorScreenViewModel
    public void refreshQuery(ConnectorCatalogRefreshReason connectorCatalogRefreshReason) {
        int iA0E = AnonymousClass001.A0E(connectorCatalogRefreshReason, 0);
        if (iA0E != 0) {
            if (iA0E != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.repository.hasFreshPage(this.query, true)) {
                return;
            }
            HoC hoC = this.refreshJob;
            if (hoC != null && hoC.isActive()) {
                return;
            }
        }
        refresh();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectorCatalogRefreshReason.values().length];
            try {
                AnonymousClass002.A13(ConnectorCatalogRefreshReason.RESUME, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConnectorCatalogRefreshReason.CONNECTION_CHANGED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final C1BN<ConnectedConnectorsUiState> getUiState() {
        return this.uiState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HatchConnectedConnectorsViewModel(X.AbstractC3358CGz r10, com.facebook.aura.skills.repo.HatchConnectorCatalogRepository r11, com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository r12) {
        /*
            r9 = this;
            X.AnonymousClass003.A0x(r11, r12)
            r9.<init>(r12, r11)
            r9.repository = r11
            r9.deviceRepository = r12
            java.lang.String r8 = "connected"
            com.facebook.aura.skills.model.ConnectorCatalogQuery$Category r1 = new com.facebook.aura.skills.model.ConnectorCatalogQuery$Category
            r1.<init>(r8)
            r9.query = r1
            com.facebook.aura.skills.repo.ConnectorCatalogCache r0 = r11.cache
            com.facebook.aura.skills.model.ConnectorCatalogPage r0 = r0.page(r1)
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.nextCursor
            r3 = 1
            if (r0 == 0) goto L21
        L20:
            r3 = 0
        L21:
            r6 = 0
            r2 = r3 ^ 1
            r1 = 0
            com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel$LoadState r0 = new com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel$LoadState
            r0.<init>(r3, r2, r1)
            X.GCn r7 = new X.GCn
            r7.<init>(r0)
            r9.loadState = r7
            X.20Q r2 = r11.observeCachedConnectors(r8)
            X.1BN<X.AHD<com.facebook.aura.agentpermission.LocalDeviceConnector>> r1 = r12.connectors
            com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel$uiState$1 r0 = new com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel$uiState$1
            r0.<init>(r9)
            X.603 r5 = X.C3rb.A00(r0, r7, r2, r1)
            X.BLL r4 = X.AEu.A00(r9)
            X.3Ej r3 = X.C3Ek.A00
            java.lang.Object r2 = r7.getValue()
            com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel$LoadState r2 = (com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel.LoadState) r2
            com.facebook.aura.skills.repo.ConnectorCatalogCache r0 = r11.cache
            X.AHD r1 = r0.connectors(r8)
            X.1BN<X.AHD<com.facebook.aura.agentpermission.LocalDeviceConnector>> r0 = r12.connectors
            java.lang.Object r0 = r0.getValue()
            X.AHD r0 = (X.AHD) r0
            com.facebook.aura.skills.viewmodel.ConnectedConnectorsUiState r0 = r9.present(r2, r1, r0)
            X.3Pi r0 = X.AnonymousClass441.A00(r0, r4, r5, r3)
            r9.uiState = r0
            X.BLL r1 = X.AEu.A00(r9)
            com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel$1 r0 = new com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel$1
            r0.<init>(r6)
            X.AnonymousClass001.A1J(r0, r1)
            r9.refresh()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel.<init>(X.CGz, com.facebook.aura.skills.repo.HatchConnectorCatalogRepository, com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository):void");
    }

    public /* synthetic */ HatchConnectedConnectorsViewModel(AbstractC3358CGz abstractC3358CGz, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, LocalDeviceConnectorsRepository localDeviceConnectorsRepository, int i, C06H c06h) {
        this(abstractC3358CGz, (i & 2) != 0 ? HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz) : hatchConnectorCatalogRepository, (i & 4) != 0 ? LocalDeviceConnectorsRepository.Companion.getInstance(abstractC3358CGz) : localDeviceConnectorsRepository);
    }
}
