package com.facebook.aura.skills.viewmodel;

import X.AEu;
import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass441;
import X.AnonymousClass603;
import X.BLG;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C3Ek;
import X.C3Pi;
import X.C3UX;
import X.C3rb;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.agentpermission.LocalDeviceConnectorKt;
import com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.skills.model.ConnectorCatalogHomepage;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchConnectorCatalogViewModel extends ConnectorScreenViewModel {
    public final BLG<ConnectorCatalogTab> _selectedTab;
    public final ConnectorCatalogPageViewModel connected;
    public final LocalDeviceConnectorsRepository deviceRepository;
    public final C1BN<ConnectorCatalogHomepageUiState> homepage;
    public HoC homepageJob;
    public final BLG<ConnectorLoadStatus> homepageLoadStatus;
    public long homepageVersion;
    public final HatchConnectorCatalogRepository repository;
    public final C1BN<ConnectorCatalogTab> selectedTab;

    public final class Factory extends AuraViewModelFactory<HatchConnectorCatalogViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchConnectorCatalogViewModel create() {
            return new HatchConnectorCatalogViewModel(this.userSession, null, 0 == true ? 1 : 0, 6, 0 == true ? 1 : 0);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.HatchConnectorCatalogViewModel$loadHomepage$1", f = "HatchConnectorCatalogViewModel.kt", l = {139}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.HatchConnectorCatalogViewModel$loadHomepage$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $forceRefresh;
        public final /* synthetic */ long $version;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, long j, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$forceRefresh = z;
            this.$version = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectorCatalogViewModel.this.new AnonymousClass1(this.$forceRefresh, this.$version, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM2120fetchHomepagegIAlus;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConnectorCatalogRepository hatchConnectorCatalogRepository = HatchConnectorCatalogViewModel.this.repository;
                boolean z = this.$forceRefresh;
                this.label = 1;
                objM2120fetchHomepagegIAlus = hatchConnectorCatalogRepository.m2120fetchHomepagegIAlus(z, this);
                if (objM2120fetchHomepagegIAlus == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM2120fetchHomepagegIAlus = AnonymousClass001.A0q(obj);
            }
            long j = this.$version;
            HatchConnectorCatalogViewModel hatchConnectorCatalogViewModel = HatchConnectorCatalogViewModel.this;
            if (j == hatchConnectorCatalogViewModel.homepageVersion) {
                boolean z2 = !(objM2120fetchHomepagegIAlus instanceof C10571Hud);
                AnonymousClass002.A1I(hatchConnectorCatalogViewModel.homepageLoadStatus, z2 ? ConnectorLoadStatus.IDLE : ConnectorLoadStatus.INITIAL_ERROR);
                HatchConnectorCatalogViewModel hatchConnectorCatalogViewModel2 = HatchConnectorCatalogViewModel.this;
                if (z2) {
                    hatchConnectorCatalogViewModel2.repository.prefetchCategoryPages((ConnectorCatalogHomepage) objM2120fetchHomepagegIAlus);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCatalogViewModel(AbstractC3358CGz abstractC3358CGz, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, LocalDeviceConnectorsRepository localDeviceConnectorsRepository) {
        super(localDeviceConnectorsRepository, hatchConnectorCatalogRepository);
        AnonymousClass003.A0x(hatchConnectorCatalogRepository, localDeviceConnectorsRepository);
        this.repository = hatchConnectorCatalogRepository;
        this.deviceRepository = localDeviceConnectorsRepository;
        C9286GCn c9286GCn = new C9286GCn(ConnectorLoadStatus.LOADING);
        this.homepageLoadStatus = c9286GCn;
        AnonymousClass603 anonymousClass603A01 = C3rb.A01(new HatchConnectorCatalogViewModel$homepage$1(this), hatchConnectorCatalogRepository.observeHomepage(), c9286GCn, localDeviceConnectorsRepository.connectors, this.connectingIds);
        this.homepage = AnonymousClass441.A00(present(hatchConnectorCatalogRepository.cache.getHomepage(), (ConnectorLoadStatus) c9286GCn.getValue(), localDeviceConnectorsRepository.connectors.getValue(), this.connectingIds.getValue()), AEu.A00(this), anonymousClass603A01, C3Ek.A00);
        C9286GCn c9286GCn2 = new C9286GCn(ConnectorCatalogTab.AVAILABLE);
        this._selectedTab = c9286GCn2;
        this.selectedTab = C3Pi.A00(c9286GCn2);
        ConnectorCatalogPageViewModel connectorCatalogPageViewModel = new ConnectorCatalogPageViewModel(AEu.A00(this), hatchConnectorCatalogRepository, "connected", localDeviceConnectorsRepository, this.connectingIds);
        this.connected = connectorCatalogPageViewModel;
        loadHomepage(false, false);
        connectorCatalogPageViewModel.refresh(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadHomepage(boolean z, boolean z2) {
        AnonymousClass002.A1K(this.homepageJob);
        long j = this.homepageVersion + 1;
        this.homepageVersion = j;
        C9286GCn.A00(null, z2 ? ConnectorLoadStatus.REFRESHING : ConnectorLoadStatus.LOADING, (C9286GCn) this.homepageLoadStatus);
        this.homepageJob = AnonymousClass001.A11(new AnonymousClass1(z, j, null), AEu.A00(this));
    }

    @Override // com.facebook.aura.skills.viewmodel.ConnectorScreenViewModel
    public void refreshQuery(ConnectorCatalogRefreshReason connectorCatalogRefreshReason) {
        C7384Etj.A0Y(connectorCatalogRefreshReason, 0);
        int iOrdinal = this._selectedTab.getValue().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            int iOrdinal2 = connectorCatalogRefreshReason.ordinal();
            if (iOrdinal2 == 0) {
                this.connected.refresh(false);
                return;
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                this.connected.ensureLoaded();
                return;
            }
        }
        int iOrdinal3 = connectorCatalogRefreshReason.ordinal();
        if (iOrdinal3 == 0) {
            loadHomepage(false, false);
            return;
        }
        if (iOrdinal3 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        HoC hoC = this.homepageJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.homepageVersion++;
        AnonymousClass001.A1E(this.homepageLoadStatus, null, this.repository.cache.getHomepage() == null ? ConnectorLoadStatus.INITIAL_ERROR : ConnectorLoadStatus.IDLE);
    }

    public final void selectTab(ConnectorCatalogTab connectorCatalogTab) {
        C7384Etj.A0Y(connectorCatalogTab, 0);
        if (connectorCatalogTab != this._selectedTab.getValue()) {
            AnonymousClass002.A1I(this._selectedTab, connectorCatalogTab);
            int iOrdinal = connectorCatalogTab.ordinal();
            if (iOrdinal == 0) {
                loadHomepage(false, false);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                this.connected.ensureLoaded();
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ConnectorCatalogTab.values().length];
            try {
                AnonymousClass005.A0v(ConnectorCatalogTab.AVAILABLE, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(ConnectorCatalogTab.CONNECTED, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConnectorCatalogRefreshReason.values().length];
            try {
                AnonymousClass005.A0v(ConnectorCatalogRefreshReason.RESUME, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(ConnectorCatalogRefreshReason.CONNECTION_CHANGED, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097 A[PHI: r14
  0x0097: PHI (r14v3 boolean) = (r14v1 boolean), (r14v4 boolean) binds: [B:29:0x008e, B:27:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.skills.viewmodel.ConnectorCatalogHomepageUiState present(com.facebook.aura.skills.model.ConnectorCatalogHomepage r15, com.facebook.aura.skills.viewmodel.ConnectorLoadStatus r16, java.util.List<com.facebook.aura.agentpermission.LocalDeviceConnector> r17, java.util.Set<java.lang.String> r18) {
        /*
            r14 = this;
            if (r15 == 0) goto L6
            X.AHD<com.facebook.aura.skills.model.Skill> r0 = r15.featured
            if (r0 != 0) goto L8
        L6:
            X.AGi r0 = X.C0881AGi.A00
        L8:
            r5 = r18
            X.AHD r6 = r14.toRows(r0, r5)
            r0 = 5
            r1 = r17
            java.util.List r0 = X.AbstractC0878AGe.A0a(r1, r0)
            java.util.ArrayList r2 = X.AnonymousClass002.A0m(r0)
            java.util.Iterator r1 = r0.iterator()
        L1d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r1.next()
            com.facebook.aura.agentpermission.LocalDeviceConnector r0 = (com.facebook.aura.agentpermission.LocalDeviceConnector) r0
            com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState r0 = com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiStateKt.localConnectorCatalogRow(r0, r5)
            r2.add(r0)
            goto L1d
        L31:
            X.AHH r8 = X.AGI.A0C(r2)
            if (r15 == 0) goto L3b
            X.AHD<com.facebook.aura.skills.model.ConnectorCatalogSection> r0 = r15.categories
            if (r0 != 0) goto L3d
        L3b:
            X.AGi r0 = X.C0881AGi.A00
        L3d:
            java.util.ArrayList r4 = X.AnonymousClass002.A0m(r0)
            java.util.Iterator r3 = r0.iterator()
        L45:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r3.next()
            com.facebook.aura.skills.model.ConnectorCatalogSection r0 = (com.facebook.aura.skills.model.ConnectorCatalogSection) r0
            com.facebook.aura.skills.model.ConnectorCatalogCategory r2 = r0.category
            X.AHD<com.facebook.aura.skills.model.Skill> r0 = r0.connectors
            X.AHD r1 = r14.toRows(r0, r5)
            com.facebook.aura.skills.viewmodel.ConnectorCatalogSectionUiState r0 = new com.facebook.aura.skills.viewmodel.ConnectorCatalogSectionUiState
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L45
        L62:
            X.AHH r7 = X.AGI.A0C(r4)
            boolean r0 = r6.isEmpty()
            r9 = r0 ^ 1
            boolean r0 = r8.isEmpty()
            r10 = r0 ^ 1
            com.facebook.aura.skills.viewmodel.ConnectorLoadStatus r0 = com.facebook.aura.skills.viewmodel.ConnectorLoadStatus.REFRESHING
            r1 = r16
            boolean r11 = X.AnonymousClass002.A1Z(r1, r0)
            com.facebook.aura.skills.viewmodel.ConnectorLoadStatus r0 = com.facebook.aura.skills.viewmodel.ConnectorLoadStatus.LOADING
            if (r1 != r0) goto L81
            r12 = 1
            if (r15 == 0) goto L82
        L81:
            r12 = 0
        L82:
            boolean r13 = r1.getHasError()
            if (r15 == 0) goto L8d
            int r0 = r15.customCount
            r14 = 1
            if (r0 > 0) goto L97
        L8d:
            r14 = 0
            if (r15 != 0) goto L97
            r15 = 0
        L91:
            com.facebook.aura.skills.viewmodel.ConnectorCatalogHomepageUiState r5 = new com.facebook.aura.skills.viewmodel.ConnectorCatalogHomepageUiState
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r5
        L97:
            int r15 = r15.customCount
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.HatchConnectorCatalogViewModel.present(com.facebook.aura.skills.model.ConnectorCatalogHomepage, com.facebook.aura.skills.viewmodel.ConnectorLoadStatus, java.util.List, java.util.Set):com.facebook.aura.skills.viewmodel.ConnectorCatalogHomepageUiState");
    }

    private final AHD<ConnectorCatalogRowUiState> toRows(List<Skill> list, Set<String> set) {
        ArrayList arrayList = new ArrayList();
        for (Skill skill : list) {
            Skill skill2 = skill;
            if (ConnectorCatalogPageViewModelKt.isVisibleInConnectorCatalog(skill2, false) && !LocalDeviceConnectorKt.isLocalDeviceConnectorId(skill2.id)) {
                arrayList.add(skill);
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(ConnectorCatalogRowUiStateKt.connectorCatalogRow((Skill) it.next(), set));
        }
        return AGI.A0C(arrayListA0i);
    }

    public final ConnectorCatalogPageViewModel getConnected() {
        return this.connected;
    }

    public final C1BN<ConnectorCatalogHomepageUiState> getHomepage() {
        return this.homepage;
    }

    public final C1BN<ConnectorCatalogTab> getSelectedTab() {
        return this.selectedTab;
    }

    public final void refresh() {
        int iOrdinal = this._selectedTab.getValue().ordinal();
        if (iOrdinal == 0) {
            loadHomepage(true, false);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            this.connected.refresh(false);
        }
    }

    public final void refreshFromPull() {
        int iOrdinal = this._selectedTab.getValue().ordinal();
        if (iOrdinal == 0) {
            loadHomepage(true, true);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            this.connected.refresh(true);
        }
    }

    public /* synthetic */ HatchConnectorCatalogViewModel(AbstractC3358CGz abstractC3358CGz, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, LocalDeviceConnectorsRepository localDeviceConnectorsRepository, int i, C06H c06h) {
        this(abstractC3358CGz, (i & 2) != 0 ? HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz) : hatchConnectorCatalogRepository, (i & 4) != 0 ? LocalDeviceConnectorsRepository.Companion.getInstance(abstractC3358CGz) : localDeviceConnectorsRepository);
    }
}
