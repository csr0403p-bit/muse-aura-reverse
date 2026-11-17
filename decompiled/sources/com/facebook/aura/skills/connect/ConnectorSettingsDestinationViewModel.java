package com.facebook.aura.skills.connect;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BLG;
import X.C10571Hud;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3Pi;
import X.C3UX;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.skills.model.ConnectorCatalogKt;
import com.facebook.aura.skills.model.ConnectorCatalogPage;
import com.facebook.aura.skills.model.ConnectorCatalogQuery;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class ConnectorSettingsDestinationViewModel extends AEs {
    public static final int $stable = 8;
    public final C3Em<ConnectorSettingsDestination> _destination;
    public final BLG<Boolean> _isResolving;
    public final HatchConnectorCatalogRepository catalog;
    public final C22I<ConnectorSettingsDestination> destination;
    public final C1BN<Boolean> isResolving;

    public final class Factory extends AuraViewModelFactory<ConnectorSettingsDestinationViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConnectorSettingsDestinationViewModel create() {
            return new ConnectorSettingsDestinationViewModel(HatchConnectorCatalogRepository.Companion.getInstance(this.userSession));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.connect.ConnectorSettingsDestinationViewModel$onGoToSettings$1", f = "ConnectorSettingsDestinationViewModel.kt", l = {52, 53}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.connect.ConnectorSettingsDestinationViewModel$onGoToSettings$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ ConnectorCatalogQuery.Category $query;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConnectorCatalogQuery.Category category, String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$query = category;
            this.$connectorId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectorSettingsDestinationViewModel.this.new AnonymousClass1(this.$query, this.$connectorId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM2121fetchQueryPage0E7RQCE;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchConnectorCatalogRepository hatchConnectorCatalogRepository = ConnectorSettingsDestinationViewModel.this.catalog;
                    ConnectorCatalogQuery.Category category = this.$query;
                    this.label = 1;
                    objM2121fetchQueryPage0E7RQCE = hatchConnectorCatalogRepository.m2121fetchQueryPage0E7RQCE(category, null, this);
                    if (objM2121fetchQueryPage0E7RQCE == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                        AnonymousClass004.A1D(false, ConnectorSettingsDestinationViewModel.this._isResolving);
                        return Unit.INSTANCE;
                    }
                    objM2121fetchQueryPage0E7RQCE = AnonymousClass001.A0q(obj);
                }
                if (objM2121fetchQueryPage0E7RQCE instanceof C10571Hud) {
                    objM2121fetchQueryPage0E7RQCE = null;
                }
                ConnectorCatalogPage connectorCatalogPage = (ConnectorCatalogPage) objM2121fetchQueryPage0E7RQCE;
                C3Em<ConnectorSettingsDestination> c3Em = ConnectorSettingsDestinationViewModel.this._destination;
                ConnectorSettingsDestination connectorSettingsDestinationDestinationFor = connectorCatalogPage != null ? ConnectorSettingsDestinationViewModelKt.destinationFor(connectorCatalogPage, this.$connectorId) : ConnectorSettingsDestination.CONNECTORS;
                this.L$0 = null;
                this.label = 2;
                if (c3Em.emit(connectorSettingsDestinationDestinationFor, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                AnonymousClass004.A1D(false, ConnectorSettingsDestinationViewModel.this._isResolving);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                AnonymousClass004.A1D(false, ConnectorSettingsDestinationViewModel.this._isResolving);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ConnectorSettingsDestinationViewModel(HatchConnectorCatalogRepository hatchConnectorCatalogRepository) {
        C7384Etj.A0Y(hatchConnectorCatalogRepository, 0);
        this.catalog = hatchConnectorCatalogRepository;
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this._isResolving = c9286GCnA0v;
        this.isResolving = C3Pi.A00(c9286GCnA0v);
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, 1);
        this._destination = c9290GCr;
        this.destination = new C3pd(c9290GCr);
    }

    public final void onGoToSettings(String str) {
        C7384Etj.A0Y(str, 0);
        if (AnonymousClass003.A1Z(this._isResolving)) {
            return;
        }
        ConnectorCatalogQuery.Category category = new ConnectorCatalogQuery.Category(ConnectorCatalogKt.WALLET_CATEGORY_ID);
        ConnectorCatalogPage connectorCatalogPagePage = this.catalog.cache.page(category);
        if (connectorCatalogPagePage != null) {
            this._destination.AhV(ConnectorSettingsDestinationViewModelKt.destinationFor(connectorCatalogPagePage, str));
            return;
        }
        C9286GCn.A00(null, AnonymousClass001.A0i(), (C9286GCn) this._isResolving);
        AnonymousClass001.A1J(new AnonymousClass1(category, str, null), AEu.A00(this));
    }

    public final C22I<ConnectorSettingsDestination> getDestination() {
        return this.destination;
    }

    public final C1BN<Boolean> isResolving() {
        return this.isResolving;
    }
}
