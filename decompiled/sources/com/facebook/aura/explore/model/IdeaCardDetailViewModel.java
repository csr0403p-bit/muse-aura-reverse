package com.facebook.aura.explore.model;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BGK;
import X.BLG;
import X.BQI;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0943AIw;
import X.C0KA;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.explore.repo.IdeaCardDetail;
import com.facebook.aura.explore.repo.IdeaCardDetailMergeKt;
import com.facebook.aura.explore.repo.IdeaCardItem;
import com.facebook.aura.explore.repo.IdeaCardsDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class IdeaCardDetailViewModel extends AEs {
    public final BLG<UiState> _uiState;
    public final IdeaCardsDataSource ideaCardsDataSource;
    public boolean isBuilt;
    public boolean loadStarted;
    public final C1BN<UiState> uiState;
    public boolean userModifiedSelection;

    public final class Factory extends AuraViewModelFactory<IdeaCardDetailViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public IdeaCardDetailViewModel create() {
            return new IdeaCardDetailViewModel(IdeaCardsDataSource.Companion.getInstance(this.userSession));
        }
    }

    public final class UiState extends C06G {
        public final IdeaCardDetail detail;
        public final boolean isLoading;
        public final BQI<String> selectedItemIds;

        public UiState(IdeaCardDetail ideaCardDetail, boolean z, BQI<String> bqi) {
            C7384Etj.A0Y(bqi, 2);
            this.detail = ideaCardDetail;
            this.isLoading = z;
            this.selectedItemIds = bqi;
        }

        public final UiState copy(IdeaCardDetail ideaCardDetail, boolean z, BQI<String> bqi) {
            C7384Etj.A0Y(bqi, 2);
            return new UiState(ideaCardDetail, z, bqi);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (!C7384Etj.areEqual(this.detail, uiState.detail) || this.isLoading != uiState.isLoading || !C7384Etj.areEqual(this.selectedItemIds, uiState.selectedItemIds)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiState copy$default(UiState uiState, IdeaCardDetail ideaCardDetail, boolean z, BQI bqi, int i, Object obj) {
            if ((i & 1) != 0) {
                ideaCardDetail = uiState.detail;
            }
            if ((i & 2) != 0) {
                z = uiState.isLoading;
            }
            if ((i & 4) != 0) {
                bqi = uiState.selectedItemIds;
            }
            return uiState.copy(ideaCardDetail, z, bqi);
        }

        public final IdeaCardDetail component1() {
            return this.detail;
        }

        public final boolean component2() {
            return this.isLoading;
        }

        public final BQI<String> component3() {
            return this.selectedItemIds;
        }

        public final IdeaCardDetail getDetail() {
            return this.detail;
        }

        public final BQI<String> getSelectedItemIds() {
            return this.selectedItemIds;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.selectedItemIds, C0KA.A01(AnonymousClass006.A0D(this.detail) * 31, this.isLoading));
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UiState(IdeaCardDetail ideaCardDetail, boolean z, BQI bqi, int i, C06H c06h) {
            this((i & 1) != 0 ? null : ideaCardDetail, (i & 2) != 0 ? true : z, (i & 4) != 0 ? C0943AIw.A03 : bqi);
        }

        public UiState() {
            this(null, true, C0943AIw.A03);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.model.IdeaCardDetailViewModel$load$1", f = "IdeaCardDetailViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.model.IdeaCardDetailViewModel$load$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $ideaCardId;
        public final /* synthetic */ IdeaCardDetail $seededDetail;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, IdeaCardDetail ideaCardDetail, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$ideaCardId = str;
            this.$seededDetail = ideaCardDetail;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return IdeaCardDetailViewModel.this.new AnonymousClass1(this.$ideaCardId, this.$seededDetail, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            UiState uiStateCopy;
            BQI<String> bqiSelectedItemIdsForLoadedItems$default;
            AHD<IdeaCardItem> ahd;
            IdeaCardDetail ideaCardDetailMergeServerFields;
            Object objFetchCardDetail = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objFetchCardDetail);
                IdeaCardsDataSource ideaCardsDataSource = IdeaCardDetailViewModel.this.ideaCardsDataSource;
                String str = this.$ideaCardId;
                this.label = 1;
                objFetchCardDetail = ideaCardsDataSource.fetchCardDetail(str, this);
                if (objFetchCardDetail == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objFetchCardDetail);
            }
            IdeaCardDetail ideaCardDetail = (IdeaCardDetail) objFetchCardDetail;
            IdeaCardDetailViewModel ideaCardDetailViewModel = IdeaCardDetailViewModel.this;
            BLG<UiState> blg = ideaCardDetailViewModel._uiState;
            IdeaCardDetail ideaCardDetail2 = this.$seededDetail;
            do {
                value = blg.getValue();
                uiStateCopy = value;
                if (ideaCardDetail2 == null) {
                    if (ideaCardDetail == null || (ahd = ideaCardDetail.items) == null || (bqiSelectedItemIdsForLoadedItems$default = IdeaCardDetailViewModel.selectedItemIdsForLoadedItems$default(ideaCardDetailViewModel, ahd, uiStateCopy.selectedItemIds, null, 4, null)) == null) {
                        bqiSelectedItemIdsForLoadedItems$default = C0943AIw.A03;
                    }
                    uiStateCopy = uiStateCopy.copy(ideaCardDetail, false, bqiSelectedItemIdsForLoadedItems$default);
                } else if (ideaCardDetail != null && (ideaCardDetailMergeServerFields = IdeaCardDetailMergeKt.mergeServerFields(ideaCardDetail2, ideaCardDetail)) != null) {
                    AHD<IdeaCardItem> ahd2 = ideaCardDetail2.items;
                    ArrayList arrayListA0m = AnonymousClass002.A0m(ahd2);
                    Iterator it = ahd2.iterator();
                    while (it.hasNext()) {
                        arrayListA0m.add(((IdeaCardItem) it.next()).itemId);
                    }
                    Set setA0g = AbstractC0878AGe.A0g(arrayListA0m);
                    AHD<IdeaCardItem> ahd3 = ideaCardDetailMergeServerFields.items;
                    ArrayList arrayListA0m2 = AnonymousClass002.A0m(ahd3);
                    Iterator it2 = ahd3.iterator();
                    while (it2.hasNext()) {
                        arrayListA0m2.add(((IdeaCardItem) it2.next()).itemId);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : arrayListA0m2) {
                        if (!setA0g.contains(obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    uiStateCopy = uiStateCopy.copy(ideaCardDetailMergeServerFields, uiStateCopy.isLoading, ideaCardDetailViewModel.selectedItemIdsForLoadedItems(ideaCardDetailMergeServerFields.items, uiStateCopy.selectedItemIds, arrayList));
                }
            } while (!blg.A6e(value, uiStateCopy));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public IdeaCardDetailViewModel(IdeaCardsDataSource ideaCardsDataSource) {
        C7384Etj.A0Y(ideaCardsDataSource, 0);
        this.ideaCardsDataSource = ideaCardsDataSource;
        C9286GCn c9286GCn = new C9286GCn(new UiState(null, true, C0943AIw.A03));
        this._uiState = c9286GCn;
        this.uiState = new C3Pi(null, c9286GCn);
    }

    public final void load(String str, IdeaCardDetail ideaCardDetail) {
        C7384Etj.A0Y(str, 0);
        if (this.loadStarted) {
            return;
        }
        this.loadStarted = true;
        if (ideaCardDetail != null) {
            AnonymousClass002.A1I(this._uiState, new UiState(ideaCardDetail, false, defaultSelectedItemIds(ideaCardDetail.items)));
        }
        AnonymousClass001.A1J(new AnonymousClass1(str, ideaCardDetail, null), AEu.A00(this));
    }

    public final void setItemSelected(String str, boolean z) {
        UiState value;
        UiState uiState;
        BQI<String> bqi;
        C7384Etj.A0Y(str, 0);
        this.userModifiedSelection = true;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
            bqi = uiState.selectedItemIds;
        } while (!blg.A6e(value, uiState.copy(uiState.detail, uiState.isLoading, AGI.A09(z ? BGK.A02(str, bqi) : BGK.A04(str, bqi)))));
    }

    private final BQI<String> defaultSelectedItemIds(List<IdeaCardItem> list) {
        ArrayList arrayList = new ArrayList();
        for (IdeaCardItem ideaCardItem : list) {
            IdeaCardItem ideaCardItem2 = ideaCardItem;
            if (!this.isBuilt || ideaCardItem2.isSelected) {
                arrayList.add(ideaCardItem);
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(((IdeaCardItem) it.next()).itemId);
        }
        return AGI.A09(arrayListA0i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BQI<String> selectedItemIdsForLoadedItems(List<IdeaCardItem> list, BQI<String> bqi, List<String> list2) {
        return !this.userModifiedSelection ? defaultSelectedItemIds(list) : this.isBuilt ? bqi : AGI.A09(BGK.A01(list2, bqi));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BQI selectedItemIdsForLoadedItems$default(IdeaCardDetailViewModel ideaCardDetailViewModel, List list, BQI bqi, List list2, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = C0881AGi.A00;
        }
        return ideaCardDetailViewModel.selectedItemIdsForLoadedItems(list, bqi, list2);
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final void setBuiltState(boolean z) {
        UiState value;
        UiState uiStateCopy;
        if (this.isBuilt != z) {
            this.isBuilt = z;
            if (this.userModifiedSelection) {
                return;
            }
            BLG<UiState> blg = this._uiState;
            do {
                value = blg.getValue();
                uiStateCopy = value;
                IdeaCardDetail ideaCardDetail = uiStateCopy.detail;
                if (ideaCardDetail != null) {
                    uiStateCopy = uiStateCopy.copy(uiStateCopy.detail, uiStateCopy.isLoading, defaultSelectedItemIds(ideaCardDetail.items));
                }
            } while (!blg.A6e(value, uiStateCopy));
        }
    }
}
