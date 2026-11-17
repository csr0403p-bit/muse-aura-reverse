package com.facebook.aura.skills.viewmodel;

import X.AGI;
import X.AHD;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass441;
import X.BQI;
import X.C1BN;
import X.C3Ek;
import X.C3UX;
import X.C3rb;
import com.facebook.aura.agentpermission.LocalDeviceConnectorKt;
import com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository;
import com.facebook.aura.skills.model.ConnectorCatalogQuery;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class ConnectorCatalogPageViewModel {
    public final String categoryId;
    public final ConnectorPager pager;
    public final C1BN<ConnectorCatalogPageUiState> uiState;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.skills.viewmodel.ConnectorCatalogPageUiState present(com.facebook.aura.skills.viewmodel.ConnectorPagerState r14, com.facebook.aura.skills.model.ConnectorCatalogHomepage r15, java.util.List<com.facebook.aura.agentpermission.LocalDeviceConnector> r16, java.util.Set<java.lang.String> r17) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.ConnectorCatalogPageViewModel.present(com.facebook.aura.skills.viewmodel.ConnectorPagerState, com.facebook.aura.skills.model.ConnectorCatalogHomepage, java.util.List, java.util.Set):com.facebook.aura.skills.viewmodel.ConnectorCatalogPageUiState");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectorLoadStatus.values().length];
            try {
                AnonymousClass002.A13(ConnectorLoadStatus.LOADING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConnectorLoadStatus.APPENDING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConnectorLoadStatus.IDLE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean accepts(com.facebook.aura.skills.model.Skill r6) {
        /*
            r5 = this;
            java.lang.String r1 = r5.categoryId
            java.lang.String r0 = "wallet"
            boolean r0 = r0.equals(r1)
            r4 = 1
            if (r0 != 0) goto L32
            java.lang.String r3 = "connected"
            boolean r0 = r3.equals(r1)
            r2 = 0
            if (r0 != 0) goto L1d
            java.lang.String r0 = "custom"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto L1e
        L1d:
            r0 = 1
        L1e:
            boolean r0 = com.facebook.aura.skills.viewmodel.ConnectorCatalogPageViewModelKt.isVisibleInConnectorCatalog(r6, r0)
            if (r0 == 0) goto L33
            java.lang.String r0 = r5.categoryId
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L32
            com.facebook.aura.skills.model.SkillState r1 = r6.state
            com.facebook.aura.skills.model.SkillState r0 = com.facebook.aura.skills.model.SkillState.CONNECTED
            if (r1 != r0) goto L33
        L32:
            return r4
        L33:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.ConnectorCatalogPageViewModel.accepts(com.facebook.aura.skills.model.Skill):boolean");
    }

    private final AHD<ConnectorCatalogRowUiState> toRows(List<Skill> list, Set<String> set) {
        ArrayList arrayList = new ArrayList();
        for (Skill skill : list) {
            Skill skill2 = skill;
            if (accepts(skill2) && !LocalDeviceConnectorKt.isLocalDeviceConnectorId(skill2.id)) {
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

    public final void ensureLoaded() {
        this.pager.ensureLoaded();
    }

    public final C1BN<ConnectorCatalogPageUiState> getUiState() {
        return this.uiState;
    }

    public final void loadNextPage() {
        this.pager.loadNextPage();
    }

    public final void refresh(boolean z) {
        this.pager.refresh(z);
    }

    public final void retry() {
        this.pager.retry();
    }

    public ConnectorCatalogPageViewModel(C3UX c3ux, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, String str, LocalDeviceConnectorsRepository localDeviceConnectorsRepository, C1BN<? extends BQI<String>> c1bn) {
        AnonymousClass005.A17(c3ux, hatchConnectorCatalogRepository, str, localDeviceConnectorsRepository, c1bn);
        this.categoryId = str;
        ConnectorPager connectorPager = new ConnectorPager(c3ux, hatchConnectorCatalogRepository, new ConnectorCatalogQuery.Category(str));
        this.pager = connectorPager;
        this.uiState = AnonymousClass441.A00(present(connectorPager.state.getValue(), hatchConnectorCatalogRepository.cache.getHomepage(), localDeviceConnectorsRepository.connectors.getValue(), c1bn.getValue()), c3ux, C3rb.A01(new ConnectorCatalogPageViewModel$uiState$1(this), connectorPager.state, hatchConnectorCatalogRepository.observeHomepage(), localDeviceConnectorsRepository.connectors, c1bn), C3Ek.A00);
    }
}
