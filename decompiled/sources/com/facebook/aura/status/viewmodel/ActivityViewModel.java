package com.facebook.aura.status.viewmodel;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC2159Azp;
import X.AbstractC3358CGz;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3pU;
import X.C3up;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.icu.text.DateFormat;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.status.repo.ActivityAction;
import com.facebook.aura.status.repo.ActivityData;
import com.facebook.aura.status.repo.ActivityDataSource;
import com.facebook.aura.status.repo.ActivityDetails;
import com.facebook.aura.status.repo.ActivityError;
import com.facebook.aura.status.repo.LoadingState;
import com.facebook.aura.status.repo.TimelineDayGroup;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ActivityViewModel extends AEs {
    public final BLG<UiState> _uiState;
    public final Set<String> collapsedDates;
    public final ActivityDataSource dataSource;
    public final Set<String> expandedActionIds;
    public boolean hasSkippedFirstOnResume;
    public final C1BN<UiState> uiState;

    public final class ActionUiModel extends C06G {
        public final ActivityAction action;
        public final ActivityDetails details;
        public final ActivityAction.ActivityCategory fallbackCategory;
        public final String formattedTime;
        public final boolean hasExpandableDetails;
        public final String id;
        public final boolean isExpanded;
        public final ActivityAction.ActivityStatus status;
        public final String subtitle;
        public final String title;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ActionUiModel) {
                    ActionUiModel actionUiModel = (ActionUiModel) obj;
                    if (!C7384Etj.areEqual(this.id, actionUiModel.id) || !C7384Etj.areEqual(this.title, actionUiModel.title) || !C7384Etj.areEqual(this.subtitle, actionUiModel.subtitle) || !C7384Etj.areEqual(this.formattedTime, actionUiModel.formattedTime) || this.status != actionUiModel.status || this.hasExpandableDetails != actionUiModel.hasExpandableDetails || this.isExpanded != actionUiModel.isExpanded || !C7384Etj.areEqual(this.details, actionUiModel.details) || !C7384Etj.areEqual(this.action, actionUiModel.action) || this.fallbackCategory != actionUiModel.fallbackCategory) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ActionUiModel copy$default(ActionUiModel actionUiModel, String str, String str2, String str3, String str4, ActivityAction.ActivityStatus activityStatus, boolean z, boolean z2, ActivityDetails activityDetails, ActivityAction activityAction, ActivityAction.ActivityCategory activityCategory, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionUiModel.id;
            }
            if ((i & 2) != 0) {
                str2 = actionUiModel.title;
            }
            if ((i & 4) != 0) {
                str3 = actionUiModel.subtitle;
            }
            if ((i & 8) != 0) {
                str4 = actionUiModel.formattedTime;
            }
            if ((i & 16) != 0) {
                activityStatus = actionUiModel.status;
            }
            if ((i & 32) != 0) {
                z = actionUiModel.hasExpandableDetails;
            }
            if ((i & 64) != 0) {
                z2 = actionUiModel.isExpanded;
            }
            if ((i & 128) != 0) {
                activityDetails = actionUiModel.details;
            }
            if ((i & 256) != 0) {
                activityAction = actionUiModel.action;
            }
            if ((i & 512) != 0) {
                activityCategory = actionUiModel.fallbackCategory;
            }
            return actionUiModel.copy(str, str2, str3, str4, activityStatus, z, z2, activityDetails, activityAction, activityCategory);
        }

        public final String component1() {
            return this.id;
        }

        public final ActivityAction.ActivityCategory component10() {
            return this.fallbackCategory;
        }

        public final String component2() {
            return this.title;
        }

        public final String component3() {
            return this.subtitle;
        }

        public final String component4() {
            return this.formattedTime;
        }

        public final ActivityAction.ActivityStatus component5() {
            return this.status;
        }

        public final boolean component6() {
            return this.hasExpandableDetails;
        }

        public final boolean component7() {
            return this.isExpanded;
        }

        public final ActivityDetails component8() {
            return this.details;
        }

        public final ActivityAction component9() {
            return this.action;
        }

        public final ActivityAction getAction() {
            return this.action;
        }

        public final ActivityDetails getDetails() {
            return this.details;
        }

        public final ActivityAction.ActivityCategory getFallbackCategory() {
            return this.fallbackCategory;
        }

        public final String getFormattedTime() {
            return this.formattedTime;
        }

        public final boolean getHasExpandableDetails() {
            return this.hasExpandableDetails;
        }

        public final String getId() {
            return this.id;
        }

        public final ActivityAction.ActivityStatus getStatus() {
            return this.status;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.action, (C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.status, AnonymousClass005.A0I(this.formattedTime, AnonymousClass005.A0I(this.subtitle, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.id))))), this.hasExpandableDetails), this.isExpanded) + AnonymousClass006.A0D(this.details)) * 31) + C3cH.A02(this.fallbackCategory);
        }

        public final boolean isExpanded() {
            return this.isExpanded;
        }

        public ActionUiModel(String str, String str2, String str3, String str4, ActivityAction.ActivityStatus activityStatus, boolean z, boolean z2, ActivityDetails activityDetails, ActivityAction activityAction, ActivityAction.ActivityCategory activityCategory) {
            AnonymousClass005.A17(str, str2, str3, str4, activityStatus);
            C7384Etj.A0Y(activityAction, 8);
            this.id = str;
            this.title = str2;
            this.subtitle = str3;
            this.formattedTime = str4;
            this.status = activityStatus;
            this.hasExpandableDetails = z;
            this.isExpanded = z2;
            this.details = activityDetails;
            this.action = activityAction;
            this.fallbackCategory = activityCategory;
        }

        public final ActionUiModel copy(String str, String str2, String str3, String str4, ActivityAction.ActivityStatus activityStatus, boolean z, boolean z2, ActivityDetails activityDetails, ActivityAction activityAction, ActivityAction.ActivityCategory activityCategory) {
            AnonymousClass005.A17(str, str2, str3, str4, activityStatus);
            C7384Etj.A0Y(activityAction, 8);
            return new ActionUiModel(str, str2, str3, str4, activityStatus, z, z2, activityDetails, activityAction, activityCategory);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class DayGroupUiModel extends C06G {
        public final AHD<ActionUiModel> actions;
        public final String dateKey;
        public final long headerDateMillis;
        public final boolean isCollapsed;
        public final int itemCount;
        public final AHD<HatchSubAgentUiModel> subAgents;

        public DayGroupUiModel(String str, long j, int i, boolean z, AHD<ActionUiModel> ahd, AHD<HatchSubAgentUiModel> ahd2) {
            C7384Etj.A0Y(str, 0);
            AnonymousClass003.A0y(ahd, ahd2);
            this.dateKey = str;
            this.headerDateMillis = j;
            this.itemCount = i;
            this.isCollapsed = z;
            this.actions = ahd;
            this.subAgents = ahd2;
        }

        public final DayGroupUiModel copy(String str, long j, int i, boolean z, AHD<ActionUiModel> ahd, AHD<HatchSubAgentUiModel> ahd2) {
            C7384Etj.A0Y(str, 0);
            AnonymousClass003.A0y(ahd, ahd2);
            return new DayGroupUiModel(str, j, i, z, ahd, ahd2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof DayGroupUiModel) {
                    DayGroupUiModel dayGroupUiModel = (DayGroupUiModel) obj;
                    if (!C7384Etj.areEqual(this.dateKey, dayGroupUiModel.dateKey) || this.headerDateMillis != dayGroupUiModel.headerDateMillis || this.itemCount != dayGroupUiModel.itemCount || this.isCollapsed != dayGroupUiModel.isCollapsed || !C7384Etj.areEqual(this.actions, dayGroupUiModel.actions) || !C7384Etj.areEqual(this.subAgents, dayGroupUiModel.subAgents)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DayGroupUiModel copy$default(DayGroupUiModel dayGroupUiModel, String str, long j, int i, boolean z, AHD ahd, AHD ahd2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = dayGroupUiModel.dateKey;
            }
            if ((i2 & 2) != 0) {
                j = dayGroupUiModel.headerDateMillis;
            }
            if ((i2 & 4) != 0) {
                i = dayGroupUiModel.itemCount;
            }
            if ((i2 & 8) != 0) {
                z = dayGroupUiModel.isCollapsed;
            }
            if ((i2 & 16) != 0) {
                ahd = dayGroupUiModel.actions;
            }
            if ((i2 & 32) != 0) {
                ahd2 = dayGroupUiModel.subAgents;
            }
            return dayGroupUiModel.copy(str, j, i, z, ahd, ahd2);
        }

        public final String component1() {
            return this.dateKey;
        }

        public final long component2() {
            return this.headerDateMillis;
        }

        public final int component3() {
            return this.itemCount;
        }

        public final boolean component4() {
            return this.isCollapsed;
        }

        public final AHD<ActionUiModel> component5() {
            return this.actions;
        }

        public final AHD<HatchSubAgentUiModel> component6() {
            return this.subAgents;
        }

        public final AHD<ActionUiModel> getActions() {
            return this.actions;
        }

        public final String getDateKey() {
            return this.dateKey;
        }

        public final long getHeaderDateMillis() {
            return this.headerDateMillis;
        }

        public final int getItemCount() {
            return this.itemCount;
        }

        public final AHD<HatchSubAgentUiModel> getSubAgents() {
            return this.subAgents;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.subAgents, AnonymousClass005.A0F(this.actions, C0KA.A01((C60R.A00(this.headerDateMillis, AnonymousClass001.A0G(this.dateKey)) + this.itemCount) * 31, this.isCollapsed)));
        }

        public final boolean isCollapsed() {
            return this.isCollapsed;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Factory extends AuraViewModelFactory<ActivityViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ActivityViewModel create() {
            return new ActivityViewModel(ActivityDataSource.Companion.getInstance(this.userSession));
        }
    }

    public final class UiState extends C06G {
        public final AHD<DayGroupUiModel> dayGroups;
        public final ActivityError error;
        public final boolean hasMore;
        public final boolean isLoadingMore;
        public final LoadingState loadingState;
        public final String nextCursor;

        public static /* synthetic */ UiState copy$default(UiState uiState, LoadingState loadingState, AHD ahd, boolean z, String str, boolean z2, ActivityError activityError, int i, Object obj) {
            LoadingState loadingState2 = loadingState;
            AHD ahd2 = ahd;
            boolean z3 = z;
            String str2 = str;
            boolean z4 = z2;
            ActivityError activityError2 = activityError;
            if ((i & 1) != 0) {
                loadingState2 = uiState.loadingState;
            }
            if ((i & 2) != 0) {
                ahd2 = uiState.dayGroups;
            }
            if ((i & 4) != 0) {
                z3 = uiState.hasMore;
            }
            if ((i & 8) != 0) {
                str2 = uiState.nextCursor;
            }
            if ((i & 16) != 0) {
                z4 = uiState.isLoadingMore;
            }
            if ((i & 32) != 0) {
                activityError2 = uiState.error;
            }
            AnonymousClass003.A0u(loadingState2, ahd2);
            return new UiState(loadingState2, ahd2, z3, str2, z4, activityError2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (this.loadingState != uiState.loadingState || !C7384Etj.areEqual(this.dayGroups, uiState.dayGroups) || this.hasMore != uiState.hasMore || !C7384Etj.areEqual(this.nextCursor, uiState.nextCursor) || this.isLoadingMore != uiState.isLoadingMore || !C7384Etj.areEqual(this.error, uiState.error)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final LoadingState component1() {
            return this.loadingState;
        }

        public final AHD<DayGroupUiModel> component2() {
            return this.dayGroups;
        }

        public final boolean component3() {
            return this.hasMore;
        }

        public final String component4() {
            return this.nextCursor;
        }

        public final boolean component5() {
            return this.isLoadingMore;
        }

        public final ActivityError component6() {
            return this.error;
        }

        public final AHD<DayGroupUiModel> getDayGroups() {
            return this.dayGroups;
        }

        public final ActivityError getError() {
            return this.error;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final LoadingState getLoadingState() {
            return this.loadingState;
        }

        public final String getNextCursor() {
            return this.nextCursor;
        }

        public int hashCode() {
            return C0KA.A01((C0KA.A01(AnonymousClass005.A0F(this.dayGroups, AnonymousClass005.A0E(this.loadingState)), this.hasMore) + AnonymousClass006.A0G(this.nextCursor)) * 31, this.isLoadingMore) + C3cH.A02(this.error);
        }

        public final boolean isLoadingMore() {
            return this.isLoadingMore;
        }

        public UiState(LoadingState loadingState, AHD<DayGroupUiModel> ahd, boolean z, String str, boolean z2, ActivityError activityError) {
            AnonymousClass003.A0u(loadingState, ahd);
            this.loadingState = loadingState;
            this.dayGroups = ahd;
            this.hasMore = z;
            this.nextCursor = str;
            this.isLoadingMore = z2;
            this.error = activityError;
        }

        public final UiState copy(LoadingState loadingState, AHD<DayGroupUiModel> ahd, boolean z, String str, boolean z2, ActivityError activityError) {
            AnonymousClass003.A0u(loadingState, ahd);
            return new UiState(loadingState, ahd, z, str, z2, activityError);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UiState(LoadingState loadingState, AHD ahd, boolean z, String str, boolean z2, ActivityError activityError, int i, C06H c06h) {
            this((i & 1) != 0 ? LoadingState.INITIAL : loadingState, (i & 2) != 0 ? AHI.A01 : ahd, AnonymousClass005.A1O(i, z), (i & 8) != 0 ? null : str, AnonymousClass005.A1Q(i, z2), (i & 32) != 0 ? null : activityError);
        }

        public UiState() {
            this(LoadingState.INITIAL, AHI.A01, false, null, false, null);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.ActivityViewModel$loadActions$1", f = "ActivityViewModel.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.ActivityViewModel$loadActions$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ActivityViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ActivityViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ActivityDataSource activityDataSource = ActivityViewModel.this.dataSource;
                this.label = 1;
                if (activityDataSource.loadActions(15, false, false, this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.ActivityViewModel$loadMore$1", f = "ActivityViewModel.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.ActivityViewModel$loadMore$1, reason: invalid class name and case insensitive filesystem */
    public final class C140921 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C140921(HtJ<? super C140921> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ActivityViewModel.this.new C140921(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ActivityViewModel.this.new C140921(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ActivityDataSource activityDataSource = ActivityViewModel.this.dataSource;
                this.label = 1;
                if (activityDataSource.loadMore(this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.ActivityViewModel$observeDataSource$1", f = "ActivityViewModel.kt", l = {276}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.ActivityViewModel$observeDataSource$1, reason: invalid class name and case insensitive filesystem */
    public final class C140931 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.status.viewmodel.ActivityViewModel$observeDataSource$1$1", f = "ActivityViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.status.viewmodel.ActivityViewModel$observeDataSource$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03981 extends AbstractC07127nr implements G0V<ActivityData, HtJ<? super Unit>, Object> {
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ ActivityViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03981(ActivityViewModel activityViewModel, HtJ<? super C03981> htJ) {
                super(2, htJ);
                this.this$0 = activityViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C03981 c03981 = new C03981(this.this$0, htJ);
                c03981.L$0 = obj;
                return c03981;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) throws ParseException {
                UiState value;
                AHD ahdMapToDayGroupUiModels;
                boolean z;
                String str;
                boolean z2;
                ActivityError activityError;
                LoadingState loadingState;
                ActivityData activityData = (ActivityData) this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                ActivityViewModel activityViewModel = this.this$0;
                BLG<UiState> blg = activityViewModel._uiState;
                do {
                    value = blg.getValue();
                    ahdMapToDayGroupUiModels = activityViewModel.mapToDayGroupUiModels(activityData.days);
                    z = activityData.hasMore;
                    str = activityData.nextCursor;
                    z2 = activityData.isLoadingMore;
                    activityError = activityData.error;
                    loadingState = activityData.isRefreshing ? LoadingState.REFRESHING : activityData.isLoading ? LoadingState.LOADING : activityError != null ? LoadingState.ERROR : LoadingState.SUCCESS;
                    AnonymousClass003.A0u(loadingState, ahdMapToDayGroupUiModels);
                } while (!blg.A6e(value, new UiState(loadingState, ahdMapToDayGroupUiModels, z, str, z2, activityError)));
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(ActivityData activityData, HtJ<? super Unit> htJ) {
                return ((C03981) create(activityData, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C140931(HtJ<? super C140931> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ActivityViewModel.this.new C140931(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ActivityViewModel.this.new C140931(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ActivityViewModel activityViewModel = ActivityViewModel.this;
                C1BN<ActivityData> c1bn = activityViewModel.dataSource.data;
                C03981 c03981 = new C03981(activityViewModel, null);
                C7384Etj.A0Z(c1bn, AnonymousClass000.A00(33));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (C3pU.A00(this, c03981, c1bn) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0Q(AnonymousClass000.A00(24));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.ActivityViewModel$onResume$1", f = "ActivityViewModel.kt", l = {97}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.ActivityViewModel$onResume$1, reason: invalid class name and case insensitive filesystem */
    public final class C140941 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C140941(HtJ<? super C140941> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ActivityViewModel.this.new C140941(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ActivityViewModel.this.new C140941(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ActivityDataSource activityDataSource = ActivityViewModel.this.dataSource;
                this.label = 1;
                if (activityDataSource.refresh(true, this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.ActivityViewModel$refresh$1", f = "ActivityViewModel.kt", l = {106}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.ActivityViewModel$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C140951 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C140951(HtJ<? super C140951> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ActivityViewModel.this.new C140951(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ActivityViewModel.this.new C140951(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ActivityDataSource activityDataSource = ActivityViewModel.this.dataSource;
                this.label = 1;
                if (activityDataSource.refresh(false, this) == enumC10460Hji) {
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
    }

    public ActivityViewModel(ActivityDataSource activityDataSource) {
        C7384Etj.A0Y(activityDataSource, 0);
        this.dataSource = activityDataSource;
        C9286GCn c9286GCnA14 = C3cG.A14(new UiState(LoadingState.INITIAL, AHI.A01, false, null, false, null));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        this.collapsedDates = C3cG.A0k();
        this.expandedActionIds = C3cG.A0k();
        observeDataSource();
        loadActions();
    }

    private final String formatTime(Date date) {
        String str = DateFormat.getTimeInstance(3, Locale.getDefault()).format(date);
        C7384Etj.A0U(str);
        return AnonymousClass001.A0u(str);
    }

    private final ActionUiModel mapToActionUiModel(ActivityAction activityAction) {
        String str;
        return new ActionUiModel(activityAction.id, resolveActionTitle(activityAction), resolveActionSubtitle(activityAction), formatTime(activityAction.timestamp), activityAction.status, (activityAction.details == null && ((str = activityAction.taskLabel) == null || str.length() == 0)) ? false : true, this.expandedActionIds.contains(activityAction.id), activityAction.details, activityAction, getFallbackCategory(activityAction));
    }

    public final void toggleActionExpand(String str) throws ParseException {
        C7384Etj.A0Y(str, 0);
        boolean zContains = this.expandedActionIds.contains(str);
        Set<String> set = this.expandedActionIds;
        if (zContains) {
            set.remove(str);
        } else {
            set.add(str);
        }
        recomputeUiState();
    }

    public final void toggleDayCollapse(String str) throws ParseException {
        C7384Etj.A0Y(str, 0);
        boolean zContains = this.collapsedDates.contains(str);
        Set<String> set = this.collapsedDates;
        if (zContains) {
            set.remove(str);
        } else {
            set.add(str);
        }
        recomputeUiState();
    }

    private final String formatToolName(String str) {
        String strA0z = AbstractC2159Azp.A0z(str, "_", InviteCodeScratcherKt.CODE_SEPARATOR);
        if (strA0z.length() <= 0) {
            return strA0z;
        }
        StringBuilder sbA0w = C60O.A0w();
        char cCharAt = strA0z.charAt(0);
        sbA0w.append((Object) (Character.isLowerCase(cCharAt) ? C3up.A00(cCharAt) : String.valueOf(cCharAt)));
        return AnonymousClass001.A0v(strA0z.substring(1), sbA0w);
    }

    private final ActivityAction.ActivityCategory getFallbackCategory(ActivityAction activityAction) {
        ActivityAction.ActivityCategory activityCategory;
        String str = activityAction.title;
        if ((str == null || str.length() == 0) && ((activityCategory = activityAction.category) != ActivityAction.ActivityCategory.TOOL || activityAction.toolName == null)) {
            return activityCategory;
        }
        return null;
    }

    private final long parseDateKeyToMillis(String str) throws ParseException {
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(str);
            Calendar calendar = Calendar.getInstance();
            C7384Etj.A0X(date);
            calendar.setTime(date);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return calendar.getTimeInMillis();
        } catch (Exception unused) {
            return 0L;
        }
    }

    private final void recomputeUiState() throws ParseException {
        UiState value;
        AHD<DayGroupUiModel> ahdMapToDayGroupUiModels;
        LoadingState loadingState;
        boolean z;
        String str;
        boolean z2;
        ActivityError activityError;
        ActivityData value2 = this.dataSource.data.getValue();
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            UiState uiState = value;
            ahdMapToDayGroupUiModels = mapToDayGroupUiModels(value2.days);
            loadingState = uiState.loadingState;
            z = uiState.hasMore;
            str = uiState.nextCursor;
            z2 = uiState.isLoadingMore;
            activityError = uiState.error;
            AnonymousClass003.A0u(loadingState, ahdMapToDayGroupUiModels);
        } while (!blg.A6e(value, new UiState(loadingState, ahdMapToDayGroupUiModels, z, str, z2, activityError)));
    }

    private final String resolveActionSubtitle(ActivityAction activityAction) {
        String str = activityAction.summary;
        if (str != null && str.length() != 0) {
            return str;
        }
        String str2 = activityAction.subject;
        return (str2 == null || str2.length() == 0) ? "" : str2;
    }

    private final String resolveActionTitle(ActivityAction activityAction) {
        String str = activityAction.title;
        if (str != null && str.length() != 0) {
            return str;
        }
        String str2 = activityAction.toolName;
        return (activityAction.category != ActivityAction.ActivityCategory.TOOL || str2 == null) ? "" : formatToolName(str2);
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final void loadMore() {
        if (this._uiState.getValue().isLoadingMore || !this._uiState.getValue().hasMore) {
            return;
        }
        AnonymousClass001.A1J(new C140921(null), AEu.A00(this));
    }

    public final void onResume() {
        if (!this.hasSkippedFirstOnResume) {
            this.hasSkippedFirstOnResume = true;
        } else {
            AnonymousClass001.A1J(new C140941(null), AEu.A00(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AHD<DayGroupUiModel> mapToDayGroupUiModels(AHD<TimelineDayGroup> ahd) throws ParseException {
        ArrayList arrayListA0m = AnonymousClass002.A0m(ahd);
        for (TimelineDayGroup timelineDayGroup : ahd) {
            boolean zContains = this.collapsedDates.contains(timelineDayGroup.date);
            String str = timelineDayGroup.date;
            long dateKeyToMillis = parseDateKeyToMillis(str);
            int size = timelineDayGroup.activities.size();
            AHD<ActivityAction> ahd2 = timelineDayGroup.activities;
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(ahd2);
            Iterator it = ahd2.iterator();
            while (it.hasNext()) {
                arrayListA0m2.add(mapToActionUiModel((ActivityAction) it.next()));
            }
            arrayListA0m.add(new DayGroupUiModel(str, dateKeyToMillis, size, zContains, AGI.A07(arrayListA0m2), AHI.A01));
        }
        return AGI.A07(arrayListA0m);
    }

    private final void observeDataSource() {
        AnonymousClass001.A1J(new C140931(null), AEu.A00(this));
    }

    public final void loadActions() {
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    public final void refresh() {
        AnonymousClass001.A1J(new C140951(null), AEu.A00(this));
    }
}
