package com.facebook.aura.hotels;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BLG;
import X.BLL;
import X.C06H;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C79;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HoC;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.hotels.HotelLoadState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HotelResultsViewModel extends AEs {
    public static final int $stable = 8;
    public final HotelResults initialResults;
    public final HotelDataSource repository;
    public HoC request;
    public final String searchRef;
    public final BLG<HotelLoadState<HotelResultsCollection>> state;
    public final C1BN<HotelLoadState<HotelResultsCollection>> uiState;

    public final class Factory extends AuraViewModelFactory<HotelResultsViewModel> {
        public static final int $stable = 8;
        public final String searchRef;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HotelResultsViewModel create() {
            HotelRepository companion = HotelRepository.Companion.getInstance(this.userSession);
            String str = this.searchRef;
            return new HotelResultsViewModel(str, companion, companion.takeInitialResults(str));
        }

        public Factory(String str, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(str, abstractC3358CGz);
            this.searchRef = str;
            this.userSession = abstractC3358CGz;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.hotels.HotelResultsViewModel$load$2", f = "HotelBrowseViewModels.kt", l = {60}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.hotels.HotelResultsViewModel$load$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $forceRefresh;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$forceRefresh = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HotelResultsViewModel.this.new AnonymousClass2(this.$forceRefresh, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objMo1061results0E7RQCE;
            HotelLoadState<HotelResultsCollection> value;
            HotelLoadState<HotelResultsCollection> loaded;
            HotelResultsCollection hotelResultsCollectionCopy;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HotelResultsViewModel hotelResultsViewModel = HotelResultsViewModel.this;
                HotelDataSource hotelDataSource = hotelResultsViewModel.repository;
                String str = hotelResultsViewModel.searchRef;
                boolean z = this.$forceRefresh;
                this.label = 1;
                objMo1061results0E7RQCE = hotelDataSource.mo1061results0E7RQCE(str, z, this);
                if (objMo1061results0E7RQCE == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objMo1061results0E7RQCE = AnonymousClass001.A0q(obj);
            }
            C3cG.A1H(this);
            HotelResultsViewModel hotelResultsViewModel2 = HotelResultsViewModel.this;
            BLG<HotelLoadState<HotelResultsCollection>> blg = hotelResultsViewModel2.state;
            do {
                value = blg.getValue();
                HotelLoadState<HotelResultsCollection> hotelLoadState = value;
                if (HsJ.A00(objMo1061results0E7RQCE) == null) {
                    hotelResultsCollectionCopy = HotelBrowseViewModelsKt.collection((HotelResults) objMo1061results0E7RQCE, hotelResultsViewModel2.initialResults);
                } else if (hotelLoadState instanceof HotelLoadState.Loaded) {
                    HotelResultsCollection hotelResultsCollection = (HotelResultsCollection) ((HotelLoadState.Loaded) hotelLoadState).value;
                    hotelResultsCollectionCopy = hotelResultsCollection.copy(hotelResultsCollection.results, hotelResultsCollection.entries, true);
                } else {
                    loaded = HotelLoadState.Failed.INSTANCE;
                }
                loaded = new HotelLoadState.Loaded<>(hotelResultsCollectionCopy);
            } while (!blg.A6e(value, loaded));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final C1BN<HotelLoadState<HotelResultsCollection>> getUiState() {
        return this.uiState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void load(boolean z) {
        HotelLoadState<HotelResultsCollection> value;
        HotelLoadState<HotelResultsCollection> loaded;
        HtJ htJA13 = AnonymousClass006.A13(this.request);
        BLG<HotelLoadState<HotelResultsCollection>> blg = this.state;
        do {
            value = blg.getValue();
            HotelLoadState<HotelResultsCollection> hotelLoadState = value;
            if (hotelLoadState instanceof HotelLoadState.Loaded) {
                HotelResultsCollection hotelResultsCollection = (HotelResultsCollection) ((HotelLoadState.Loaded) hotelLoadState).value;
                loaded = new HotelLoadState.Loaded<>(hotelResultsCollection.copy(hotelResultsCollection.results, hotelResultsCollection.entries, false));
            } else {
                loaded = HotelLoadState.Loading.INSTANCE;
            }
        } while (!blg.A6e(value, loaded));
        BLL bllA00 = AEu.A00(this);
        this.request = GAo.A02(C79.A00, AnonymousClass001.A0y(), new AnonymousClass2(z, htJA13), bllA00);
    }

    public HotelResultsViewModel(String str, HotelDataSource hotelDataSource, HotelResults hotelResults) {
        boolean zA1b = AnonymousClass004.A1b(str, hotelDataSource);
        this.searchRef = str;
        this.repository = hotelDataSource;
        hotelResults = (hotelResults == null || !str.equals(hotelResults.searchRef)) ? null : hotelResults;
        this.initialResults = hotelResults;
        C9286GCn c9286GCnA01 = HnJ.A01(hotelResults != null ? new HotelLoadState.Loaded(HotelBrowseViewModelsKt.collection(hotelResults, null)) : HotelLoadState.Loading.INSTANCE);
        this.state = c9286GCnA01;
        this.uiState = C3cG.A11(c9286GCnA01);
        load(zA1b);
    }

    public /* synthetic */ HotelResultsViewModel(String str, HotelDataSource hotelDataSource, HotelResults hotelResults, int i, C06H c06h) {
        this(str, hotelDataSource, (i & 4) != 0 ? null : hotelResults);
    }
}
