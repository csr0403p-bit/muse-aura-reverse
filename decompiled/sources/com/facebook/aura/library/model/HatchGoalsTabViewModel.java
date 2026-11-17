package com.facebook.aura.library.model;

import X.AEs;
import X.AEu;
import X.AHD;
import X.AHG;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass441;
import X.AnonymousClass603;
import X.BLG;
import X.BLL;
import X.C06G;
import X.C06H;
import X.C0943AIw;
import X.C0KA;
import X.C1BN;
import X.C20Q;
import X.C3Ej;
import X.C3Ek;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C3rb;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.library.repo.GoalListSection;
import com.facebook.aura.library.repo.GoalsState;
import com.facebook.aura.library.repo.HatchGoalsTabDataSource;
import com.facebook.aura.library.repo.LoadingState;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.utils.HatchUtil;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchGoalsTabViewModel extends AEs {
    public static final int $stable = 8;
    public final HatchGoalsTabDataSource dataSource;
    public final Locale displayLocale;
    public final BLG<Integer> imageRetryNonce;
    public final C1BN<UiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchGoalsTabViewModel$1", f = "HatchGoalsTabViewModel.kt", l = {113}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchGoalsTabViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabViewModel.this.dataSource;
                this.label = 1;
                if (hatchGoalsTabDataSource.load(this) == enumC10460Hji) {
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
            return HatchGoalsTabViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<HatchGoalsTabViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchGoalsTabViewModel create() {
            return new HatchGoalsTabViewModel(HatchGoalsTabDataSource.Companion.getInstance(this.userSession));
        }
    }

    public final class UiState extends C06G {
        public static final int $stable = 8;
        public final boolean completedHasNextPage;
        public final LoadingState completedLoadingState;
        public final AHD<CompletedGoalsSection> completedSections;
        public final GoalsState goalsState;
        public final int imageRetryNonce;
        public final boolean isLoadingMoreCompleted;
        public final boolean isLoadingMoreTracking;
        public final AHG<String> pendingCompletionIds;
        public final boolean showGoalsFirst;
        public final boolean showSubtitles;
        public final AHD<Goal> trackingGoals;
        public final boolean trackingHasNextPage;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (!C7384Etj.areEqual(this.goalsState, uiState.goalsState) || !C7384Etj.areEqual(this.trackingGoals, uiState.trackingGoals) || this.trackingHasNextPage != uiState.trackingHasNextPage || this.isLoadingMoreTracking != uiState.isLoadingMoreTracking || !C7384Etj.areEqual(this.completedSections, uiState.completedSections) || this.completedLoadingState != uiState.completedLoadingState || this.completedHasNextPage != uiState.completedHasNextPage || this.isLoadingMoreCompleted != uiState.isLoadingMoreCompleted || this.imageRetryNonce != uiState.imageRetryNonce || this.showSubtitles != uiState.showSubtitles || this.showGoalsFirst != uiState.showGoalsFirst || !C7384Etj.areEqual(this.pendingCompletionIds, uiState.pendingCompletionIds)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiState copy$default(UiState uiState, GoalsState goalsState, AHD ahd, boolean z, boolean z2, AHD ahd2, LoadingState loadingState, boolean z3, boolean z4, int i, boolean z5, boolean z6, AHG ahg, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                goalsState = uiState.goalsState;
            }
            if ((i2 & 2) != 0) {
                ahd = uiState.trackingGoals;
            }
            if ((i2 & 4) != 0) {
                z = uiState.trackingHasNextPage;
            }
            if ((i2 & 8) != 0) {
                z2 = uiState.isLoadingMoreTracking;
            }
            if ((i2 & 16) != 0) {
                ahd2 = uiState.completedSections;
            }
            if ((i2 & 32) != 0) {
                loadingState = uiState.completedLoadingState;
            }
            if ((i2 & 64) != 0) {
                z3 = uiState.completedHasNextPage;
            }
            if ((i2 & 128) != 0) {
                z4 = uiState.isLoadingMoreCompleted;
            }
            if ((i2 & 256) != 0) {
                i = uiState.imageRetryNonce;
            }
            if ((i2 & 512) != 0) {
                z5 = uiState.showSubtitles;
            }
            if ((i2 & 1024) != 0) {
                z6 = uiState.showGoalsFirst;
            }
            if ((i2 & 2048) != 0) {
                ahg = uiState.pendingCompletionIds;
            }
            return uiState.copy(goalsState, ahd, z, z2, ahd2, loadingState, z3, z4, i, z5, z6, ahg);
        }

        public final GoalsState component1() {
            return this.goalsState;
        }

        public final boolean component10() {
            return this.showSubtitles;
        }

        public final boolean component11() {
            return this.showGoalsFirst;
        }

        public final AHG<String> component12() {
            return this.pendingCompletionIds;
        }

        public final AHD<Goal> component2() {
            return this.trackingGoals;
        }

        public final boolean component3() {
            return this.trackingHasNextPage;
        }

        public final boolean component4() {
            return this.isLoadingMoreTracking;
        }

        public final AHD<CompletedGoalsSection> component5() {
            return this.completedSections;
        }

        public final LoadingState component6() {
            return this.completedLoadingState;
        }

        public final boolean component7() {
            return this.completedHasNextPage;
        }

        public final boolean component8() {
            return this.isLoadingMoreCompleted;
        }

        public final int component9() {
            return this.imageRetryNonce;
        }

        public final boolean getCompletedHasNextPage() {
            return this.completedHasNextPage;
        }

        public final LoadingState getCompletedLoadingState() {
            return this.completedLoadingState;
        }

        public final AHD<CompletedGoalsSection> getCompletedSections() {
            return this.completedSections;
        }

        public final GoalsState getGoalsState() {
            return this.goalsState;
        }

        public final int getImageRetryNonce() {
            return this.imageRetryNonce;
        }

        public final AHG<String> getPendingCompletionIds() {
            return this.pendingCompletionIds;
        }

        public final boolean getShowGoalsFirst() {
            return this.showGoalsFirst;
        }

        public final boolean getShowSubtitles() {
            return this.showSubtitles;
        }

        public final AHD<Goal> getTrackingGoals() {
            return this.trackingGoals;
        }

        public final boolean getTrackingHasNextPage() {
            return this.trackingHasNextPage;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.pendingCompletionIds, C0KA.A01(C0KA.A01((C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.completedLoadingState, AnonymousClass005.A0F(this.completedSections, C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.trackingGoals, AnonymousClass005.A0E(this.goalsState)), this.trackingHasNextPage), this.isLoadingMoreTracking))), this.completedHasNextPage), this.isLoadingMoreCompleted) + this.imageRetryNonce) * 31, this.showSubtitles), this.showGoalsFirst));
        }

        public final boolean isLoadingMoreCompleted() {
            return this.isLoadingMoreCompleted;
        }

        public final boolean isLoadingMoreTracking() {
            return this.isLoadingMoreTracking;
        }

        public UiState(GoalsState goalsState, AHD<Goal> ahd, boolean z, boolean z2, AHD<CompletedGoalsSection> ahd2, LoadingState loadingState, boolean z3, boolean z4, int i, boolean z5, boolean z6, AHG<String> ahg) {
            AnonymousClass003.A0u(goalsState, ahd);
            AnonymousClass003.A0y(ahd2, loadingState);
            C7384Etj.A0Y(ahg, 11);
            this.goalsState = goalsState;
            this.trackingGoals = ahd;
            this.trackingHasNextPage = z;
            this.isLoadingMoreTracking = z2;
            this.completedSections = ahd2;
            this.completedLoadingState = loadingState;
            this.completedHasNextPage = z3;
            this.isLoadingMoreCompleted = z4;
            this.imageRetryNonce = i;
            this.showSubtitles = z5;
            this.showGoalsFirst = z6;
            this.pendingCompletionIds = ahg;
        }

        public final UiState copy(GoalsState goalsState, AHD<Goal> ahd, boolean z, boolean z2, AHD<CompletedGoalsSection> ahd2, LoadingState loadingState, boolean z3, boolean z4, int i, boolean z5, boolean z6, AHG<String> ahg) {
            AnonymousClass003.A0u(goalsState, ahd);
            AnonymousClass003.A0y(ahd2, loadingState);
            C7384Etj.A0Y(ahg, 11);
            return new UiState(goalsState, ahd, z, z2, ahd2, loadingState, z3, z4, i, z5, z6, ahg);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UiState(GoalsState goalsState, AHD ahd, boolean z, boolean z2, AHD ahd2, LoadingState loadingState, boolean z3, boolean z4, int i, boolean z5, boolean z6, AHG ahg, int i2, C06H c06h) {
            this((i2 & 1) != 0 ? new GoalsState(AHI.A01, LoadingState.INITIAL, false, false, C0943AIw.A03) : goalsState, (i2 & 2) != 0 ? AHI.A01 : ahd, C3cG.A1K(i2 & 4, z), C3cG.A1K(i2 & 8, z2), (i2 & 16) != 0 ? AHI.A01 : ahd2, (i2 & 32) != 0 ? LoadingState.INITIAL : loadingState, C3cH.A1M(i2, z3), C3cH.A1N(i2, z4), (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? true : z5, (i2 & 1024) == 0 ? z6 : false, (i2 & 2048) != 0 ? C0943AIw.A03 : ahg);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public UiState() {
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            this(null, objArr, false, 0 == true ? 1 : 0, objArr2, objArr3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr4, 4095, objArr5);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchGoalsTabViewModel$deleteGoal$1", f = "HatchGoalsTabViewModel.kt", l = {148}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchGoalsTabViewModel$deleteGoal$1, reason: invalid class name and case insensitive filesystem */
    public final class C122541 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $goalId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122541(String str, HtJ<? super C122541> htJ) {
            super(2, htJ);
            this.$goalId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabViewModel.this.new C122541(this.$goalId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabViewModel.this.dataSource;
                String str = this.$goalId;
                this.label = 1;
                if (hatchGoalsTabDataSource.deleteGoal(str, this) == enumC10460Hji) {
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
            return ((C122541) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchGoalsTabViewModel$loadCompleted$1", f = "HatchGoalsTabViewModel.kt", l = {132}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchGoalsTabViewModel$loadCompleted$1, reason: invalid class name and case insensitive filesystem */
    public final class C122551 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122551(HtJ<? super C122551> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabViewModel.this.new C122551(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabViewModel.this.dataSource;
                this.label = 1;
                if (hatchGoalsTabDataSource.loadCompleted(this) == enumC10460Hji) {
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
            return HatchGoalsTabViewModel.this.new C122551(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchGoalsTabViewModel$loadMoreCompleted$1", f = "HatchGoalsTabViewModel.kt", l = {VoiceCallForegroundService.AVATAR_TARGET_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchGoalsTabViewModel$loadMoreCompleted$1, reason: invalid class name and case insensitive filesystem */
    public final class C122561 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122561(HtJ<? super C122561> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabViewModel.this.new C122561(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabViewModel.this.dataSource;
                this.label = 1;
                if (hatchGoalsTabDataSource.loadMoreCompleted(this) == enumC10460Hji) {
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
            return HatchGoalsTabViewModel.this.new C122561(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchGoalsTabViewModel$loadMoreGoals$1", f = "HatchGoalsTabViewModel.kt", l = {136}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchGoalsTabViewModel$loadMoreGoals$1, reason: invalid class name and case insensitive filesystem */
    public final class C122571 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122571(HtJ<? super C122571> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabViewModel.this.new C122571(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabViewModel.this.dataSource;
                this.label = 1;
                if (hatchGoalsTabDataSource.loadMoreGoals(this) == enumC10460Hji) {
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
            return HatchGoalsTabViewModel.this.new C122571(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchGoalsTabViewModel$loadMoreTracking$1", f = "HatchGoalsTabViewModel.kt", l = {140}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchGoalsTabViewModel$loadMoreTracking$1, reason: invalid class name and case insensitive filesystem */
    public final class C122581 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122581(HtJ<? super C122581> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabViewModel.this.new C122581(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabViewModel.this.dataSource;
                this.label = 1;
                if (hatchGoalsTabDataSource.loadMoreTracking(this) == enumC10460Hji) {
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
            return HatchGoalsTabViewModel.this.new C122581(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchGoalsTabViewModel$loadTracking$1", f = "HatchGoalsTabViewModel.kt", l = {128}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchGoalsTabViewModel$loadTracking$1, reason: invalid class name and case insensitive filesystem */
    public final class C122591 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122591(HtJ<? super C122591> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabViewModel.this.new C122591(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabViewModel.this.dataSource;
                this.label = 1;
                if (hatchGoalsTabDataSource.loadTracking(this) == enumC10460Hji) {
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
            return HatchGoalsTabViewModel.this.new C122591(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchGoalsTabViewModel$refresh$2", f = "HatchGoalsTabViewModel.kt", l = {121}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchGoalsTabViewModel$refresh$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $isSilent;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$isSilent = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabViewModel.this.new AnonymousClass2(this.$isSilent, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabViewModel.this.dataSource;
                boolean z = this.$isSilent;
                this.label = 1;
                if (hatchGoalsTabDataSource.refresh(z, this) == enumC10460Hji) {
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
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchGoalsTabViewModel$sortGoalsAutomatically$1", f = "HatchGoalsTabViewModel.kt", l = {HatchWidgetWebViewKt.HTTP_NO_CONTENT, 205}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchGoalsTabViewModel$sortGoalsAutomatically$1, reason: invalid class name and case insensitive filesystem */
    public final class C122601 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122601(HtJ<? super C122601> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabViewModel.this.new C122601(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabViewModel.this.dataSource;
                this.label = 1;
                if (hatchGoalsTabDataSource.sortGoalsAutomatically(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            HatchGoalsTabDataSource hatchGoalsTabDataSource2 = HatchGoalsTabViewModel.this.dataSource;
            this.label = 2;
            if (hatchGoalsTabDataSource2.resetAndRefresh(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchGoalsTabViewModel.this.new C122601(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchGoalsTabViewModel$updateGoal$1", f = "HatchGoalsTabViewModel.kt", l = {152}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchGoalsTabViewModel$updateGoal$1, reason: invalid class name and case insensitive filesystem */
    public final class C122611 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $description;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ String $title;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122611(String str, String str2, String str3, HtJ<? super C122611> htJ) {
            super(2, htJ);
            this.$goalId = str;
            this.$title = str2;
            this.$description = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabViewModel.this.new C122611(this.$goalId, this.$title, this.$description, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabViewModel.this.dataSource;
                String str = this.$goalId;
                String str2 = this.$title;
                String str3 = this.$description;
                this.label = 1;
                if (hatchGoalsTabDataSource.updateGoal(str, str2, str3, this) == enumC10460Hji) {
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
            return ((C122611) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchGoalsTabViewModel(HatchGoalsTabDataSource hatchGoalsTabDataSource) {
        C7384Etj.A0Y(hatchGoalsTabDataSource, 0);
        this.dataSource = hatchGoalsTabDataSource;
        C9286GCn c9286GCnA14 = C3cG.A14(0);
        this.imageRetryNonce = c9286GCnA14;
        Locale locale = Locale.getDefault();
        C7384Etj.A0U(locale);
        this.displayLocale = locale;
        AnonymousClass603 anonymousClass603 = new AnonymousClass603(3, new HatchGoalsTabViewModel$uiState$2(this, null), new C20Q[]{hatchGoalsTabDataSource.goalsState, hatchGoalsTabDataSource.trackingState, hatchGoalsTabDataSource.completedState, C3rb.A00(new HatchGoalsTabViewModel$uiState$1(null), c9286GCnA14, hatchGoalsTabDataSource.showSubtitles, hatchGoalsTabDataSource.pendingCompletionIds), hatchGoalsTabDataSource.showGoalsFirst});
        BLL bllA00 = AEu.A00(this);
        C3Ej c3Ej = C3Ek.A00;
        Object[] objArr = null == true ? 1 : 0;
        Object[] objArr2 = null == true ? 1 : 0;
        Object[] objArr3 = null == true ? 1 : 0;
        Object[] objArr4 = null == true ? 1 : 0;
        Object[] objArr5 = null == true ? 1 : 0;
        Object[] objArr6 = null == true ? 1 : 0;
        this.uiState = AnonymousClass441.A00(new UiState(null, null == true ? 1 : 0, false, objArr, null == true ? 1 : 0, null == true ? 1 : 0, objArr2, objArr3, objArr4, objArr5, objArr6, null == true ? 1 : 0, 4095, null == true ? 1 : 0), bllA00, anonymousClass603, c3Ej);
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
        loadTracking();
    }

    public final void deleteGoal(String str) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass001.A1J(new C122541(str, null), AEu.A00(this));
    }

    public final boolean setGoalCompleted(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return this.dataSource.setGoalCompleted(str, z);
    }

    public final void updateGoal(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass001.A1J(new C122611(str, str2, str3, null), AEu.A00(this));
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final void loadTracking() {
        if (HatchUtil.INSTANCE.isGoalsTrackingSectionEnabled()) {
            AnonymousClass001.A1J(new C122591(null), AEu.A00(this));
        }
    }

    public final void refresh(boolean z) {
        if (!z) {
            while (!C3cJ.A11(this.imageRetryNonce)) {
            }
        }
        AnonymousClass001.A1J(new AnonymousClass2(z, null), AEu.A00(this));
    }

    public final void setShowGoalsFirst(boolean z) {
        this.dataSource.setShowGoalsFirst(z);
    }

    public final void setShowSubtitles(boolean z) {
        this.dataSource.setShowSubtitles(z);
    }

    public final void loadCompleted() {
        AnonymousClass001.A1J(new C122551(null), AEu.A00(this));
    }

    public final void loadMoreCompleted() {
        AnonymousClass001.A1J(new C122561(null), AEu.A00(this));
    }

    public final void loadMoreGoals() {
        AnonymousClass001.A1J(new C122571(null), AEu.A00(this));
    }

    public final void loadMoreTracking() {
        AnonymousClass001.A1J(new C122581(null), AEu.A00(this));
    }

    public final void moveGoal(GoalListSection goalListSection, String str, String str2) {
        AnonymousClass005.A0x(goalListSection, str, str2);
        this.dataSource.moveGoal(goalListSection, str, str2);
    }

    public final void nestGoalUnder(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.dataSource.nestGoalUnder(str, str2);
    }

    public final void placeGoalAtRoot(String str, GoalListSection goalListSection, GoalListSection goalListSection2, String str2) {
        AnonymousClass005.A0x(str, goalListSection, goalListSection2);
        this.dataSource.placeGoalAtRoot(str, goalListSection, goalListSection2, str2);
    }

    public final void promoteSubGoalToGoal(String str, GoalListSection goalListSection) {
        AnonymousClass003.A0u(str, goalListSection);
        this.dataSource.promoteSubGoalToGoal(str, goalListSection);
    }

    public final void setSubGoalOrder(String str, List<String> list, String str2) {
        AnonymousClass003.A0u(str, list);
        this.dataSource.setSubGoalOrder(str, list, str2);
    }

    public final void sortGoalsAutomatically() {
        AnonymousClass001.A1J(new C122601(null), AEu.A00(this));
    }
}
