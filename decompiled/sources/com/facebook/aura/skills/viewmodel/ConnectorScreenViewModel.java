package com.facebook.aura.skills.viewmodel;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BQI;
import X.C06H;
import X.C0943AIw;
import X.C1BN;
import X.C20Z;
import X.C22I;
import X.C3Em;
import X.C3Pi;
import X.C3UX;
import X.C3pd;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C9290GCr;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public abstract class ConnectorScreenViewModel extends AEs {
    public final C3Em<ConnectorCatalogEffect> _effects;
    public int activeHosts;
    public final C1BN<BQI<String>> connectingIds;
    public final LocalDeviceConnectorsRepository deviceRepository;
    public final C22I<ConnectorCatalogEffect> effects;
    public boolean hasResumed;
    public boolean needsRefresh;
    public final HatchConnectorCatalogRepository repository;

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.ConnectorScreenViewModel$1", f = "ConnectorScreenViewModel.kt", l = {40}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.ConnectorScreenViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectorScreenViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final ConnectorScreenViewModel connectorScreenViewModel = ConnectorScreenViewModel.this;
                C22I<String> c22i = connectorScreenViewModel.repository.connectionChanges;
                C20Z<? super String> c20z = new C20Z() { // from class: com.facebook.aura.skills.viewmodel.ConnectorScreenViewModel.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((String) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(String str, HtJ<? super Unit> htJ) {
                        ConnectorScreenViewModel connectorScreenViewModel2 = connectorScreenViewModel;
                        connectorScreenViewModel2.needsRefresh = true;
                        connectorScreenViewModel2.refreshIfActive(ConnectorCatalogRefreshReason.CONNECTION_CHANGED);
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
            return ConnectorScreenViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.ConnectorScreenViewModel$onRowClick$1", f = "ConnectorScreenViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiTiltGestures}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.ConnectorScreenViewModel$onRowClick$1, reason: invalid class name and case insensitive filesystem */
    public final class C138721 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ConnectorCatalogEffect $effect;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138721(ConnectorCatalogEffect connectorCatalogEffect, HtJ<? super C138721> htJ) {
            super(2, htJ);
            this.$effect = connectorCatalogEffect;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectorScreenViewModel.this.new C138721(this.$effect, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C3Em<ConnectorCatalogEffect> c3Em = ConnectorScreenViewModel.this._effects;
                ConnectorCatalogEffect connectorCatalogEffect = this.$effect;
                this.label = 1;
                if (c3Em.emit(connectorCatalogEffect, this) == enumC10460Hji) {
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
            return ((C138721) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void onRowClick(ConnectorCatalogRowUiState connectorCatalogRowUiState) {
        ConnectorCatalogEffect connectorCatalogEffect;
        C7384Etj.A0Y(connectorCatalogRowUiState, 0);
        if (!connectorCatalogRowUiState.enabled || this.connectingIds.getValue().contains(connectorCatalogRowUiState.connectorId) || (connectorCatalogEffect = connectorCatalogRowUiState.action) == null) {
            return;
        }
        AnonymousClass001.A1J(new C138721(connectorCatalogEffect, null), AEu.A00(this));
    }

    public abstract void refreshQuery(ConnectorCatalogRefreshReason connectorCatalogRefreshReason);

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshIfActive(ConnectorCatalogRefreshReason connectorCatalogRefreshReason) {
        HatchConnectorCatalogRepository hatchConnectorCatalogRepository;
        if (this.activeHosts == 0 || !this.needsRefresh || (hatchConnectorCatalogRepository = this.repository) == null || hatchConnectorCatalogRepository.isAuthCallbackInFlight(null)) {
            return;
        }
        this.needsRefresh = false;
        refreshQuery(connectorCatalogRefreshReason);
    }

    public final C1BN<BQI<String>> getConnectingIds() {
        return this.connectingIds;
    }

    public final C22I<ConnectorCatalogEffect> getEffects() {
        return this.effects;
    }

    public final void onLocalPermissionsChanged() {
        LocalDeviceConnectorsRepository localDeviceConnectorsRepository = this.deviceRepository;
        if (localDeviceConnectorsRepository != null) {
            localDeviceConnectorsRepository.refresh();
        }
    }

    public final void onPause() {
        int i = this.activeHosts - 1;
        if (i < 0) {
            i = 0;
        }
        this.activeHosts = i;
    }

    public final void onResume() {
        int i = this.activeHosts + 1;
        this.activeHosts = i;
        if (i == 1) {
            onLocalPermissionsChanged();
            boolean z = this.repository != null && (this.hasResumed || this.needsRefresh);
            this.hasResumed = true;
            if (z) {
                this.needsRefresh = true;
                refreshIfActive(ConnectorCatalogRefreshReason.RESUME);
            }
        }
    }

    public ConnectorScreenViewModel(LocalDeviceConnectorsRepository localDeviceConnectorsRepository, HatchConnectorCatalogRepository hatchConnectorCatalogRepository) {
        C1BN<BQI<String>> c1bn;
        this.deviceRepository = localDeviceConnectorsRepository;
        this.repository = hatchConnectorCatalogRepository;
        Integer num = C79.A00;
        C9290GCr c9290GCr = new C9290GCr(num, 0, 0);
        this._effects = c9290GCr;
        this.effects = new C3pd(c9290GCr);
        this.connectingIds = (hatchConnectorCatalogRepository == null || (c1bn = hatchConnectorCatalogRepository.connectingIds) == null) ? new C3Pi(null, HnJ.A01(C0943AIw.A03)) : c1bn;
        if (hatchConnectorCatalogRepository != null) {
            GAo.A02(num, C6ys.A00, new AnonymousClass1(null), AEu.A00(this));
        }
    }

    public /* synthetic */ ConnectorScreenViewModel(LocalDeviceConnectorsRepository localDeviceConnectorsRepository, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, int i, C06H c06h) {
        this((i & 1) != 0 ? null : localDeviceConnectorsRepository, (i & 2) != 0 ? null : hatchConnectorCatalogRepository);
    }

    public ConnectorScreenViewModel() {
        this(null, null);
    }
}
