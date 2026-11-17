package com.facebook.aura.skills.viewmodel;

import X.AHD;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C20Q;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.skills.model.ConnectorCatalogQuery;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class HatchConnectorSearchViewModel extends ConnectorScreenViewModel {
    public final C20Q<AHD<Skill>> cachedConnectors;
    public final HatchConnectorCatalogRepository catalogRepository;
    public final String categoryId;
    public final boolean deviceOnly;
    public final LocalDeviceConnectorsRepository deviceRepository;
    public final ConnectorPager pager;
    public final BLG<String> query;
    public final C1BN<ConnectorSearchUiState> uiState;

    public final class Factory extends AuraViewModelFactory<HatchConnectorSearchViewModel> {
        public final String categoryId;
        public final boolean deviceOnly;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, boolean z) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
            this.categoryId = str;
            this.deviceOnly = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchConnectorSearchViewModel create() {
            return new HatchConnectorSearchViewModel(this.userSession, this.categoryId, this.deviceOnly, null, 0 == true ? 1 : 0, 24, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Factory(AbstractC3358CGz abstractC3358CGz, String str, boolean z, int i, C06H c06h) {
            this(abstractC3358CGz, AnonymousClass006.A0s(i, str), AnonymousClass005.A1O(i, z));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HatchConnectorSearchViewModel(X.AbstractC3358CGz r12, java.lang.String r13, boolean r14, com.facebook.aura.skills.repo.HatchConnectorCatalogRepository r15, com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository r16) {
        /*
            r11 = this;
            r5 = r15
            r10 = 0
            r4 = r16
            X.AnonymousClass002.A1C(r12, r10, r4)
            r2 = 0
            if (r15 == 0) goto Ld
            r0 = r15
            if (r14 == 0) goto Le
        Ld:
            r0 = r2
        Le:
            r3 = r11
            r11.<init>(r4, r0)
            r11.categoryId = r13
            r11.deviceOnly = r14
            r11.deviceRepository = r4
            if (r15 == 0) goto L1c
            if (r14 == 0) goto L1d
        L1c:
            r5 = r2
        L1d:
            r11.catalogRepository = r5
            java.lang.String r7 = ""
            X.GCn r12 = new X.GCn
            r12.<init>(r7)
            r11.query = r12
            if (r5 == 0) goto L34
            X.BLL r1 = X.AEu.A00(r11)
            com.facebook.aura.skills.viewmodel.ConnectorPager r0 = new com.facebook.aura.skills.viewmodel.ConnectorPager
            r0.<init>(r1, r5, r2)
            r2 = r0
        L34:
            r11.pager = r2
            if (r5 == 0) goto L3e
            X.20Q r14 = r5.observeCachedConnectors(r13)
            if (r14 != 0) goto L45
        L3e:
            X.AHI r0 = X.AHI.A01
            X.20Y r14 = new X.20Y
            r14.<init>(r0)
        L45:
            r11.cachedConnectors = r14
            if (r2 == 0) goto L76
            X.1BN<com.facebook.aura.skills.viewmodel.ConnectorPagerState> r13 = r2.state
            if (r13 == 0) goto L76
        L4d:
            X.1BN<X.AHD<com.facebook.aura.agentpermission.LocalDeviceConnector>> r15 = r4.connectors
            X.1BN<X.BQI<java.lang.String>> r0 = r11.connectingIds
            com.facebook.aura.skills.viewmodel.HatchConnectorSearchViewModel$uiState$1 r11 = new com.facebook.aura.skills.viewmodel.HatchConnectorSearchViewModel$uiState$1
            r11.<init>(r3)
            r16 = r0
            X.603 r2 = X.C3rb.A02(r11, r12, r13, r14, r15, r16)
            X.BLL r1 = X.AEu.A00(r3)
            X.3Ej r0 = X.C3Ek.A00
            X.AHI r8 = X.AHI.A01
            com.facebook.aura.skills.viewmodel.ConnectorSearchUiState r6 = new com.facebook.aura.skills.viewmodel.ConnectorSearchUiState
            r9 = r8
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.3Pi r0 = X.AnonymousClass441.A00(r6, r1, r2, r0)
            r3.uiState = r0
            return
        L76:
            r2 = 0
            com.facebook.aura.skills.viewmodel.ConnectorLoadStatus r1 = com.facebook.aura.skills.viewmodel.ConnectorLoadStatus.IDLE
            com.facebook.aura.skills.viewmodel.ConnectorPagerState r0 = new com.facebook.aura.skills.viewmodel.ConnectorPagerState
            r0.<init>(r2, r2, r1)
            X.20Y r13 = new X.20Y
            r13.<init>(r0)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.HatchConnectorSearchViewModel.<init>(X.CGz, java.lang.String, boolean, com.facebook.aura.skills.repo.HatchConnectorCatalogRepository, com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.skills.viewmodel.ConnectorSearchUiState present(java.lang.String r15, com.facebook.aura.skills.viewmodel.ConnectorPagerState r16, java.util.List<com.facebook.aura.skills.model.Skill> r17, java.util.List<com.facebook.aura.agentpermission.LocalDeviceConnector> r18, java.util.Set<java.lang.String> r19) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.HatchConnectorSearchViewModel.present(java.lang.String, com.facebook.aura.skills.viewmodel.ConnectorPagerState, java.util.List, java.util.List, java.util.Set):com.facebook.aura.skills.viewmodel.ConnectorSearchUiState");
    }

    public final void onQueryChanged(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(this.query.getValue())) {
            return;
        }
        AnonymousClass002.A1I(this.query, str);
        ConnectorPager connectorPager = this.pager;
        if (connectorPager != null) {
            connectorPager.selectQuery(searchQuery(str), 300L);
        }
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
            ConnectorPager connectorPager = this.pager;
            if (connectorPager != null) {
                connectorPager.ensureLoaded();
            }
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
            int[] iArr2 = new int[ConnectorLoadStatus.values().length];
            try {
                AnonymousClass005.A0v(ConnectorLoadStatus.LOADING, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(ConnectorLoadStatus.APPENDING, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A15(ConnectorLoadStatus.IDLE, iArr2);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final C1BN<ConnectorSearchUiState> getUiState() {
        return this.uiState;
    }

    public final void loadNextPage() {
        ConnectorPager connectorPager = this.pager;
        if (connectorPager != null) {
            connectorPager.loadNextPage();
        }
    }

    public final void refresh() {
        if (C7BY.A0j(this.query.getValue())) {
            return;
        }
        if (this.deviceOnly) {
            onLocalPermissionsChanged();
            return;
        }
        ConnectorPager connectorPager = this.pager;
        if (connectorPager != null) {
            connectorPager.refresh(false);
        }
    }

    public final void retry() {
        ConnectorPager connectorPager = this.pager;
        if (connectorPager != null) {
            connectorPager.retry();
        }
    }

    private final ConnectorCatalogQuery.Search searchQuery(String str) {
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() <= 0 || this.deviceOnly) {
            return null;
        }
        return new ConnectorCatalogQuery.Search(strA0l, this.categoryId);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HatchConnectorSearchViewModel(AbstractC3358CGz abstractC3358CGz, String str, boolean z, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, LocalDeviceConnectorsRepository localDeviceConnectorsRepository, int i, C06H c06h) {
        str = (i & 2) != 0 ? null : str;
        boolean zA1O = AnonymousClass005.A1O(i, z);
        if ((i & 8) != 0) {
            if (zA1O) {
                hatchConnectorCatalogRepository = null;
            } else {
                hatchConnectorCatalogRepository = HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz);
            }
        }
        this(abstractC3358CGz, str, zA1O, hatchConnectorCatalogRepository, (i & 16) != 0 ? LocalDeviceConnectorsRepository.Companion.getInstance(abstractC3358CGz) : localDeviceConnectorsRepository);
    }
}
