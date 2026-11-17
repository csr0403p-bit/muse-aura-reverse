package com.facebook.aura.skills.viewmodel;

import X.AEu;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class HatchConnectorCategoryViewModel extends ConnectorScreenViewModel {
    public final LocalDeviceConnectorsRepository deviceRepository;
    public final ConnectorCatalogPageViewModel page;

    public final class Factory extends AuraViewModelFactory<HatchConnectorCategoryViewModel> {
        public final String categoryId;
        public final AbstractC3358CGz userSession;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchConnectorCategoryViewModel create() {
            return new HatchConnectorCategoryViewModel(this.userSession, this.categoryId, null, 0 == true ? 1 : 0, 12, 0 == true ? 1 : 0);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.categoryId = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCategoryViewModel(AbstractC3358CGz abstractC3358CGz, String str, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, LocalDeviceConnectorsRepository localDeviceConnectorsRepository) {
        super(localDeviceConnectorsRepository, hatchConnectorCatalogRepository);
        AnonymousClass005.A11(str, hatchConnectorCatalogRepository, localDeviceConnectorsRepository, 1);
        this.deviceRepository = localDeviceConnectorsRepository;
        ConnectorCatalogPageViewModel connectorCatalogPageViewModel = new ConnectorCatalogPageViewModel(AEu.A00(this), hatchConnectorCatalogRepository, str, localDeviceConnectorsRepository, this.connectingIds);
        this.page = connectorCatalogPageViewModel;
        connectorCatalogPageViewModel.ensureLoaded();
    }

    @Override // com.facebook.aura.skills.viewmodel.ConnectorScreenViewModel
    public void refreshQuery(ConnectorCatalogRefreshReason connectorCatalogRefreshReason) {
        int iA0E = AnonymousClass001.A0E(connectorCatalogRefreshReason, 0);
        if (iA0E != 0 && iA0E != 1) {
            throw new NoWhenBranchMatchedException();
        }
        this.page.ensureLoaded();
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

    public final ConnectorCatalogPageViewModel getPage() {
        return this.page;
    }

    public final void refreshFromPull() {
        this.page.refresh(true);
    }

    public /* synthetic */ HatchConnectorCategoryViewModel(AbstractC3358CGz abstractC3358CGz, String str, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, LocalDeviceConnectorsRepository localDeviceConnectorsRepository, int i, C06H c06h) {
        this(abstractC3358CGz, str, (i & 4) != 0 ? HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz) : hatchConnectorCatalogRepository, (i & 8) != 0 ? LocalDeviceConnectorsRepository.Companion.getInstance(abstractC3358CGz) : localDeviceConnectorsRepository);
    }
}
