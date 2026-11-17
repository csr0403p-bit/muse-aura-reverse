package com.facebook.aura.library.repo;

import X.AGH;
import X.AGI;
import X.AHG;
import X.AHH;
import X.AHI;
import X.AbstractC05623ug;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass441;
import X.BFI;
import X.BLG;
import X.BLW;
import X.BzK;
import X.C06H;
import X.C0943AIw;
import X.C0944AIx;
import X.C0953AJg;
import X.C10543Hqv;
import X.C10571Hud;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C22I;
import X.C3Ej;
import X.C3Ek;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C3pd;
import X.C60N;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9286GCn;
import X.C9290GCr;
import X.C9hr;
import X.C9jH;
import X.C9sU;
import X.CFK;
import X.EnumC10460Hji;
import X.F0C;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HoC;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzC;
import X.HzP;
import X.InterfaceC0962AJp;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.conversation.repo.HatchConversationRepositoryKt;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.model.HatchEngagementEventType;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.perf.HatchNavQueryTrace;
import com.facebook.aura.perf.HatchNavTTRCCoordinator;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.aura.utils.HatchUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public final class HatchGoalsTabDataSource implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final C3Em<Goal> _goalCoreUpdates;
    public final BLG<InterfaceC0962AJp<String, GoalToggleState>> _inFlightToggles;
    public final BLG<GoalsLocalOrder> _localOrder;
    public final BLG<Boolean> _showGoalsFirst;
    public final BLG<Boolean> _showSubtitles;
    public final BLG<GoalsStore> _store;
    public final BLG<UserProfileState> _userProfileState;
    public final C1BN<GoalsState> completedState;
    public final C22I<Goal> goalCoreUpdates;
    public final C1BN<GoalsState> goalsState;
    public final HatchNavTTRCCoordinator navTtrcCoordinator;
    public final Map<String, HoC> orderSyncJobs;
    public final Object orderSyncLock;
    public final C1BN<AHG<String>> pendingCompletionIds;
    public final C3UX scope;
    public final C1BN<Boolean> showGoalsFirst;
    public final String showGoalsFirstKey;
    public final C1BN<Boolean> showSubtitles;
    public final Object toggleLock;
    public final C1BN<GoalsState> trackingState;
    public final C1BN<UserProfileState> userProfileState;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$deleteGoal$2", f = "HatchGoalsTabDataSource.kt", l = {2368}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$deleteGoal$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $goalId;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$goalId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new AnonymousClass2(this.$goalId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            GoalsStore value;
            GoalsStore value2;
            GoalsStore value3;
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            Goal goal;
            Object obj2;
            GoalsStore value4;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z = false;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    value2 = HatchGoalsTabDataSource.this._store.getValue();
                    GoalNode goalNodeA0P = C3cH.A0P(this.$goalId, value2.goalsById);
                    String str = (goalNodeA0P == null || (goal = goalNodeA0P.goal) == null) ? null : goal.parentGoalId;
                    BLG<GoalsStore> blg = HatchGoalsTabDataSource.this._store;
                    String str2 = this.$goalId;
                    do {
                        value3 = blg.getValue();
                    } while (!blg.A6e(value3, HatchGoalsTabDataSourceKt.removeGoalSubtree(value3, str2)));
                    if (str != null) {
                        HatchGoalsTabDataSource.this.emitGoalCoreUpdatesFor(str);
                    }
                    Set<Integer> setA18 = AnonymousClass004.A18();
                    C9jH c9jHA0E = AGH.A0E();
                    HatchGoalsTabDataSource$deleteGoal$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchGoalsTabDataSource$deleteGoal$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchGoalsTabDataSource$deleteGoal$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
                    this.L$0 = value2;
                    this.L$1 = str;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.I$0 = 1;
                    this.I$1 = 1;
                    this.I$2 = 0;
                    this.label = 1;
                    objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(hatchGoalsTabDataSource$deleteGoal$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, new JarvisPath.Goal(this.$goalId), RequestType.DELETE, HatchGoalsTabDataSource.this.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
                    obj2 = str;
                    if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Object obj3 = this.L$1;
                    value2 = (GoalsStore) this.L$0;
                    objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
                    obj2 = obj3;
                }
                if (!(objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud)) {
                    z = true;
                } else {
                    BLG<GoalsStore> blg2 = HatchGoalsTabDataSource.this._store;
                    String str3 = this.$goalId;
                    do {
                        value4 = blg2.getValue();
                    } while (!blg2.A6e(value4, HatchGoalsTabDataSourceKt.restoreGoalSubtreeFrom(value4, value2, str3)));
                    HatchGoalsTabDataSource.this.emitGoalCoreUpdatesFor((Set<String>) BLW.A05(this.$goalId, (String) obj2));
                }
            } catch (Exception e) {
                C3cI.A1L("Failed to delete goal: ", e.getMessage(), e);
                BLG<GoalsStore> blg3 = HatchGoalsTabDataSource.this._store;
                String str4 = this.$goalId;
                do {
                    value = blg3.getValue();
                } while (!blg3.A6e(value, HatchGoalsTabDataSourceKt.restoreGoalSubtreeFrom(value, value2, str4)));
                HatchGoalsTabDataSource.this.emitGoalCoreUpdatesFor((Set<String>) BLW.A05(this.$goalId, (String) obj2));
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource", f = "HatchGoalsTabDataSource.kt", l = {2365}, m = "fetchGoalsPage", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$fetchGoalsPage$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGoalsTabDataSource.this.fetchGoalsPage(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource", f = "HatchGoalsTabDataSource.kt", l = {1231}, m = "fetchGoalsThroughCount", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$fetchGoalsThroughCount$1, reason: invalid class name and case insensitive filesystem */
    public final class C122781 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C122781(HtJ<? super C122781> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGoalsTabDataSource.this.fetchGoalsThroughCount(null, 0, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource", f = "HatchGoalsTabDataSource.kt", l = {1112, 1113}, m = "load", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$load$1, reason: invalid class name and case insensitive filesystem */
    public final class C122791 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C122791(HtJ<? super C122791> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGoalsTabDataSource.this.load(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadCompleted$3", f = "HatchGoalsTabDataSource.kt", l = {1414}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadCompleted$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new AnonymousClass3(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            GoalsStore value;
            GoalsStore goalsStore;
            InterfaceC0962AJp<String, GoalNode> interfaceC0962AJpPutGoalTrees;
            ArrayList arrayListA0i;
            GoalsStore value2;
            Object objFetchGoalsPage = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objFetchGoalsPage);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabDataSource.this;
                GoalSource goalSourceCompletedGoalsSource = hatchGoalsTabDataSource.completedGoalsSource();
                GoalStatus goalStatus = GoalStatus.COMPLETED;
                this.label = 1;
                objFetchGoalsPage = hatchGoalsTabDataSource.fetchGoalsPage(goalSourceCompletedGoalsSource, goalStatus, null, this);
                if (objFetchGoalsPage == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objFetchGoalsPage);
            }
            GoalsPage goalsPage = (GoalsPage) objFetchGoalsPage;
            HatchGoalsTabDataSource hatchGoalsTabDataSource2 = HatchGoalsTabDataSource.this;
            BLG<GoalsStore> blg = hatchGoalsTabDataSource2._store;
            if (goalsPage == null) {
                do {
                    value2 = blg.getValue();
                } while (!blg.A6e(value2, GoalsStore.copy$default(value2, null, null, null, null, null, null, null, false, false, null, false, false, null, LoadingState.ERROR, null, false, false, null, null, 450559, null)));
            } else {
                do {
                    value = blg.getValue();
                    goalsStore = value;
                    interfaceC0962AJpPutGoalTrees = HatchGoalsTabDataSourceKt.putGoalTrees(goalsStore, goalsPage.goals, false);
                    List<Goal> list = goalsPage.goals;
                    arrayListA0i = AnonymousClass003.A0i(list);
                    Iterator<Goal> it = list.iterator();
                    while (it.hasNext()) {
                        C3cI.A1R(arrayListA0i, it);
                    }
                } while (!blg.A6e(value, C3cI.A0D(hatchGoalsTabDataSource2, GoalsStore.copy$default(goalsStore, interfaceC0962AJpPutGoalTrees, null, null, null, null, null, null, false, false, null, false, false, AGI.A0C(C3cG.A0m(arrayListA0i)), LoadingState.SUCCESS, goalsPage.nextCursor, goalsPage.hasNextPage, false, null, null, 397310, null))));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchGoalsTabDataSource.this.new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource", f = "HatchGoalsTabDataSource.kt", l = {2219}, m = "loadGoalDetail", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadGoalDetail$1, reason: invalid class name and case insensitive filesystem */
    public final class C122801 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C122801(HtJ<? super C122801> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGoalsTabDataSource.this.loadGoalDetail(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadGoals$3", f = "HatchGoalsTabDataSource.kt", l = {1140}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadGoals$3, reason: invalid class name and case insensitive filesystem */
    public final class C122813 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchNavQueryTrace $navTrace;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122813(HatchNavQueryTrace hatchNavQueryTrace, HtJ<? super C122813> htJ) {
            super(2, htJ);
            this.$navTrace = hatchNavQueryTrace;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new C122813(this.$navTrace, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            GoalsStore value;
            GoalsPage goalsPage;
            HatchGoalsTabDataSource hatchGoalsTabDataSource;
            GoalsStore value2;
            GoalsStore goalsStore;
            InterfaceC0962AJp<String, GoalNode> interfaceC0962AJpPutGoalTrees;
            ArrayList arrayListA0i;
            GoalsStore value3;
            Object objFetchGoalsPage = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objFetchGoalsPage);
                    HatchGoalsTabDataSource hatchGoalsTabDataSource2 = HatchGoalsTabDataSource.this;
                    GoalSource goalSource = GoalSource.USER_GOAL;
                    GoalStatus goalStatus = GoalStatus.ACTIVE;
                    this.label = 1;
                    objFetchGoalsPage = hatchGoalsTabDataSource2.fetchGoalsPage(goalSource, goalStatus, null, this);
                    if (objFetchGoalsPage == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objFetchGoalsPage);
                }
                goalsPage = (GoalsPage) objFetchGoalsPage;
                hatchGoalsTabDataSource = HatchGoalsTabDataSource.this;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                C3cI.A1L("Failed to load goals: ", e2.getMessage(), e2);
                BLG<GoalsStore> blg = HatchGoalsTabDataSource.this._store;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, GoalsStore.copy$default(value, null, null, null, null, LoadingState.ERROR, null, null, false, false, null, false, false, null, null, null, false, false, null, null, 524015, null)));
                this.$navTrace.onFailure("goals_load_exception", e2.getMessage());
            }
            if (goalsPage == null) {
                BLG<GoalsStore> blg2 = hatchGoalsTabDataSource._store;
                do {
                    value3 = blg2.getValue();
                } while (!blg2.A6e(value3, GoalsStore.copy$default(value3, null, null, null, null, LoadingState.ERROR, null, null, false, false, null, false, false, null, null, null, false, false, null, null, 524271, null)));
                this.$navTrace.onFailure("goals_load_failed", "GET /goals?source=user_goal&status=active failed");
                return Unit.INSTANCE;
            }
            BLG<GoalsStore> blg3 = hatchGoalsTabDataSource._store;
            do {
                value2 = blg3.getValue();
                goalsStore = value2;
                interfaceC0962AJpPutGoalTrees = HatchGoalsTabDataSourceKt.putGoalTrees(goalsStore, goalsPage.goals, true);
                List<Goal> list = goalsPage.goals;
                arrayListA0i = AnonymousClass003.A0i(list);
                Iterator<Goal> it = list.iterator();
                while (it.hasNext()) {
                    C3cI.A1R(arrayListA0i, it);
                }
            } while (!blg3.A6e(value2, C3cI.A0D(hatchGoalsTabDataSource, HatchGoalsTabDataSourceKt.pruneStaleExtras(GoalsStore.copy$default(goalsStore, interfaceC0962AJpPutGoalTrees, AGI.A0C(C3cG.A0m(arrayListA0i)), null, null, LoadingState.SUCCESS, null, goalsPage.nextCursor, goalsPage.hasNextPage, false, null, false, false, null, null, null, false, false, null, null, 523820, null)))));
            this.$navTrace.annotate(C60N.A00(22), C3cG.A0R(goalsPage.goals.size()));
            this.$navTrace.onDisplayed();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C122813) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadMoreCompleted$2", f = "HatchGoalsTabDataSource.kt", l = {1447}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadMoreCompleted$2, reason: invalid class name and case insensitive filesystem */
    public final class C122822 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $cursor;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122822(String str, HtJ<? super C122822> htJ) {
            super(2, htJ);
            this.$cursor = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new C122822(this.$cursor, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            GoalsStore value;
            GoalsStore value2;
            GoalsStore value3;
            GoalsStore goalsStoreA0D;
            Object objFetchGoalsPage = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objFetchGoalsPage);
                    HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabDataSource.this;
                    GoalSource goalSourceCompletedGoalsSource = hatchGoalsTabDataSource.completedGoalsSource();
                    GoalStatus goalStatus = GoalStatus.COMPLETED;
                    String str = this.$cursor;
                    this.label = 1;
                    objFetchGoalsPage = hatchGoalsTabDataSource.fetchGoalsPage(goalSourceCompletedGoalsSource, goalStatus, str, this);
                    if (objFetchGoalsPage == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objFetchGoalsPage);
                }
                GoalsPage goalsPage = (GoalsPage) objFetchGoalsPage;
                if (goalsPage != null) {
                    HatchGoalsTabDataSource hatchGoalsTabDataSource2 = HatchGoalsTabDataSource.this;
                    BLG<GoalsStore> blg = hatchGoalsTabDataSource2._store;
                    String str2 = this.$cursor;
                    do {
                        value3 = blg.getValue();
                        goalsStoreA0D = value3;
                        if (C7384Etj.areEqual(goalsStoreA0D.completedNextCursor, str2)) {
                            InterfaceC0962AJp<String, GoalNode> interfaceC0962AJpPutGoalTrees = HatchGoalsTabDataSourceKt.putGoalTrees(goalsStoreA0D, goalsPage.goals, false);
                            AHH<String> ahh = goalsStoreA0D.completedOrder;
                            List<Goal> list = goalsPage.goals;
                            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                            Iterator<Goal> it = list.iterator();
                            while (it.hasNext()) {
                                C3cI.A1R(arrayListA0i, it);
                            }
                            goalsStoreA0D = C3cI.A0D(hatchGoalsTabDataSource2, GoalsStore.copy$default(goalsStoreA0D, interfaceC0962AJpPutGoalTrees, null, null, null, null, null, null, false, false, null, false, false, AGI.A0C(AbstractC0878AGe.A0T(AbstractC0878AGe.A0P(arrayListA0i, ahh))), null, goalsPage.nextCursor, goalsPage.hasNextPage, false, null, null, 471038, null));
                        }
                    } while (!blg.A6e(value3, goalsStoreA0D));
                }
                BLG<GoalsStore> blg2 = HatchGoalsTabDataSource.this._store;
                do {
                    value2 = blg2.getValue();
                } while (!C3cJ.A0y(value2, value2, blg2, 458751));
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLG<GoalsStore> blg3 = HatchGoalsTabDataSource.this._store;
                do {
                    value = blg3.getValue();
                } while (!C3cJ.A0y(value, value, blg3, 458751));
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C122822) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadMoreGoals$2", f = "HatchGoalsTabDataSource.kt", l = {1296}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadMoreGoals$2, reason: invalid class name and case insensitive filesystem */
    public final class C122832 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $cursor;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122832(String str, HtJ<? super C122832> htJ) {
            super(2, htJ);
            this.$cursor = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new C122832(this.$cursor, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            GoalsStore value;
            GoalsStore value2;
            GoalsStore value3;
            GoalsStore goalsStoreA0D;
            Object objFetchGoalsPage = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objFetchGoalsPage);
                    HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabDataSource.this;
                    GoalSource goalSource = GoalSource.USER_GOAL;
                    GoalStatus goalStatus = GoalStatus.ACTIVE;
                    String str = this.$cursor;
                    this.label = 1;
                    objFetchGoalsPage = hatchGoalsTabDataSource.fetchGoalsPage(goalSource, goalStatus, str, this);
                    if (objFetchGoalsPage == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objFetchGoalsPage);
                }
                GoalsPage goalsPage = (GoalsPage) objFetchGoalsPage;
                if (goalsPage != null) {
                    HatchGoalsTabDataSource hatchGoalsTabDataSource2 = HatchGoalsTabDataSource.this;
                    BLG<GoalsStore> blg = hatchGoalsTabDataSource2._store;
                    String str2 = this.$cursor;
                    do {
                        value3 = blg.getValue();
                        goalsStoreA0D = value3;
                        if (C7384Etj.areEqual(goalsStoreA0D.listNextCursor, str2)) {
                            InterfaceC0962AJp<String, GoalNode> interfaceC0962AJpPutGoalTrees = HatchGoalsTabDataSourceKt.putGoalTrees(goalsStoreA0D, goalsPage.goals, false);
                            AHH<String> ahh = goalsStoreA0D.listOrder;
                            List<Goal> list = goalsPage.goals;
                            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                            Iterator<Goal> it = list.iterator();
                            while (it.hasNext()) {
                                C3cI.A1R(arrayListA0i, it);
                            }
                            goalsStoreA0D = C3cI.A0D(hatchGoalsTabDataSource2, GoalsStore.copy$default(goalsStoreA0D, interfaceC0962AJpPutGoalTrees, AGI.A0C(AbstractC0878AGe.A0T(AbstractC0878AGe.A0P(arrayListA0i, ahh))), null, null, null, null, goalsPage.nextCursor, goalsPage.hasNextPage, false, null, false, false, null, null, null, false, false, null, null, 524092, null));
                        }
                    } while (!blg.A6e(value3, goalsStoreA0D));
                }
                BLG<GoalsStore> blg2 = HatchGoalsTabDataSource.this._store;
                do {
                    value2 = blg2.getValue();
                } while (!C3cJ.A0y(value2, value2, blg2, 524031));
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLG<GoalsStore> blg3 = HatchGoalsTabDataSource.this._store;
                do {
                    value = blg3.getValue();
                } while (!C3cJ.A0y(value, value, blg3, 524031));
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C122832) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadMoreTracking$2", f = "HatchGoalsTabDataSource.kt", l = {1371}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadMoreTracking$2, reason: invalid class name and case insensitive filesystem */
    public final class C122842 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $cursor;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122842(String str, HtJ<? super C122842> htJ) {
            super(2, htJ);
            this.$cursor = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new C122842(this.$cursor, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            GoalsStore value;
            GoalsStore value2;
            GoalsStore value3;
            GoalsStore goalsStoreA0D;
            Object objFetchGoalsPage = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objFetchGoalsPage);
                    HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabDataSource.this;
                    GoalSource goalSource = GoalSource.ASSISTANT_TRACKING;
                    GoalStatus goalStatus = GoalStatus.ACTIVE;
                    String str = this.$cursor;
                    this.label = 1;
                    objFetchGoalsPage = hatchGoalsTabDataSource.fetchGoalsPage(goalSource, goalStatus, str, this);
                    if (objFetchGoalsPage == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objFetchGoalsPage);
                }
                GoalsPage goalsPage = (GoalsPage) objFetchGoalsPage;
                if (goalsPage != null) {
                    HatchGoalsTabDataSource hatchGoalsTabDataSource2 = HatchGoalsTabDataSource.this;
                    BLG<GoalsStore> blg = hatchGoalsTabDataSource2._store;
                    String str2 = this.$cursor;
                    do {
                        value3 = blg.getValue();
                        goalsStoreA0D = value3;
                        if (C7384Etj.areEqual(goalsStoreA0D.trackingNextCursor, str2)) {
                            InterfaceC0962AJp<String, GoalNode> interfaceC0962AJpPutGoalTrees = HatchGoalsTabDataSourceKt.putGoalTrees(goalsStoreA0D, goalsPage.goals, false);
                            AHH<String> ahh = goalsStoreA0D.trackingOrder;
                            List<Goal> list = goalsPage.goals;
                            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                            Iterator<Goal> it = list.iterator();
                            while (it.hasNext()) {
                                C3cI.A1R(arrayListA0i, it);
                            }
                            goalsStoreA0D = C3cI.A0D(hatchGoalsTabDataSource2, GoalsStore.copy$default(goalsStoreA0D, interfaceC0962AJpPutGoalTrees, null, AGI.A0C(AbstractC0878AGe.A0T(AbstractC0878AGe.A0P(arrayListA0i, ahh))), null, null, null, null, false, false, goalsPage.nextCursor, goalsPage.hasNextPage, false, null, null, null, false, false, null, null, 522746, null));
                        }
                    } while (!blg.A6e(value3, goalsStoreA0D));
                }
                BLG<GoalsStore> blg2 = HatchGoalsTabDataSource.this._store;
                do {
                    value2 = blg2.getValue();
                } while (!C3cJ.A0y(value2, value2, blg2, 522239));
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLG<GoalsStore> blg3 = HatchGoalsTabDataSource.this._store;
                do {
                    value = blg3.getValue();
                } while (!C3cJ.A0y(value, value, blg3, 522239));
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C122842) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadTracking$3", f = "HatchGoalsTabDataSource.kt", l = {1328}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadTracking$3, reason: invalid class name and case insensitive filesystem */
    public final class C122853 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122853(HtJ<? super C122853> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new C122853(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            GoalsStore value;
            GoalsPage goalsPage;
            HatchGoalsTabDataSource hatchGoalsTabDataSource;
            GoalsStore value2;
            GoalsStore goalsStore;
            InterfaceC0962AJp<String, GoalNode> interfaceC0962AJpPutGoalTrees;
            ArrayList arrayListA0i;
            GoalsStore value3;
            Object objFetchGoalsPage = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objFetchGoalsPage);
                    HatchGoalsTabDataSource hatchGoalsTabDataSource2 = HatchGoalsTabDataSource.this;
                    GoalSource goalSource = GoalSource.ASSISTANT_TRACKING;
                    GoalStatus goalStatus = GoalStatus.ACTIVE;
                    this.label = 1;
                    objFetchGoalsPage = hatchGoalsTabDataSource2.fetchGoalsPage(goalSource, goalStatus, null, this);
                    if (objFetchGoalsPage == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objFetchGoalsPage);
                }
                goalsPage = (GoalsPage) objFetchGoalsPage;
                hatchGoalsTabDataSource = HatchGoalsTabDataSource.this;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                C3cI.A1L("Failed to load tracking goals: ", e2.getMessage(), e2);
                BLG<GoalsStore> blg = HatchGoalsTabDataSource.this._store;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, GoalsStore.copy$default(value, null, null, null, null, null, LoadingState.ERROR, null, false, false, null, false, false, null, null, null, false, false, null, null, 522207, null)));
            }
            if (goalsPage == null) {
                BLG<GoalsStore> blg2 = hatchGoalsTabDataSource._store;
                do {
                    value3 = blg2.getValue();
                } while (!blg2.A6e(value3, GoalsStore.copy$default(value3, null, null, null, null, null, LoadingState.ERROR, null, false, false, null, false, false, null, null, null, false, false, null, null, 522207, null)));
                return Unit.INSTANCE;
            }
            BLG<GoalsStore> blg3 = hatchGoalsTabDataSource._store;
            do {
                value2 = blg3.getValue();
                goalsStore = value2;
                interfaceC0962AJpPutGoalTrees = HatchGoalsTabDataSourceKt.putGoalTrees(goalsStore, goalsPage.goals, false);
                List<Goal> list = goalsPage.goals;
                arrayListA0i = AnonymousClass003.A0i(list);
                Iterator<Goal> it = list.iterator();
                while (it.hasNext()) {
                    C3cI.A1R(arrayListA0i, it);
                }
            } while (!blg3.A6e(value2, C3cI.A0D(hatchGoalsTabDataSource, GoalsStore.copy$default(goalsStore, interfaceC0962AJpPutGoalTrees, null, AGI.A0C(C3cG.A0m(arrayListA0i)), null, null, LoadingState.SUCCESS, null, false, false, goalsPage.nextCursor, goalsPage.hasNextPage, false, null, null, null, false, false, null, null, 520666, null))));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchGoalsTabDataSource.this.new C122853(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadUserProfile$2", f = "HatchGoalsTabDataSource.kt", l = {1477}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadUserProfile$2, reason: invalid class name and case insensitive filesystem */
    public final class C122862 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122862(HtJ<? super C122862> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new C122862(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                    AbstractC3358CGz abstractC3358CGz = HatchGoalsTabDataSource.this.userSession;
                    this.label = 1;
                    obj = hatchFileOperations.readFile(HatchGoalsTabDataSourceKt.USER_FILE_PATH, abstractC3358CGz, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                str = (String) obj;
            } catch (Exception e) {
                C3cH.A1B("Failed to load USER.md: ", e.getMessage(), HatchGoalsTabDataSourceKt.TAG, e);
                BLG<UserProfileState> blg = HatchGoalsTabDataSource.this._userProfileState;
                UserProfileState value = blg.getValue();
                LoadingState loadingState = LoadingState.ERROR;
                UserProfile userProfile = value.profile;
                C7384Etj.A0Y(userProfile, 0);
                C9286GCn.A00(null, new UserProfileState(userProfile, loadingState), (C9286GCn) blg);
            }
            if (str == null) {
                CFK.A06(HatchGoalsTabDataSourceKt.TAG, "Failed to read USER.md");
                BLG<UserProfileState> blg2 = HatchGoalsTabDataSource.this._userProfileState;
                UserProfileState value2 = blg2.getValue();
                LoadingState loadingState2 = LoadingState.ERROR;
                UserProfile userProfile2 = value2.profile;
                C7384Etj.A0Y(userProfile2, 0);
                C9286GCn.A00(null, new UserProfileState(userProfile2, loadingState2), (C9286GCn) blg2);
                return Unit.INSTANCE;
            }
            if (str.length() == 0) {
                AnonymousClass001.A1E(HatchGoalsTabDataSource.this._userProfileState, null, new UserProfileState(new UserProfile(null, null, null, null, null, AHI.A01), LoadingState.SUCCESS));
                return Unit.INSTANCE;
            }
            UserProfile userProfile3 = UserProfile.Companion.parse(str);
            BLG<UserProfileState> blg3 = HatchGoalsTabDataSource.this._userProfileState;
            if (userProfile3 == null) {
                userProfile3 = new UserProfile(null, null, null, null, null, AHI.A01);
            }
            AnonymousClass001.A1E(blg3, null, new UserProfileState(userProfile3, LoadingState.SUCCESS));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchGoalsTabDataSource.this.new C122862(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$nestGoalUnder$3", f = "HatchGoalsTabDataSource.kt", l = {2012}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$nestGoalUnder$3, reason: invalid class name and case insensitive filesystem */
    public final class C122873 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $formerParentId;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ String $parentGoalId;
        public final /* synthetic */ Map<String, Long> $siblingPlacement;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$nestGoalUnder$3$1", f = "HatchGoalsTabDataSource.kt", l = {2015, 2016}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$nestGoalUnder$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ Map<String, Long> $siblingPlacement;
            public int label;
            public final /* synthetic */ HatchGoalsTabDataSource this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchGoalsTabDataSource hatchGoalsTabDataSource, Map<String, Long> map, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.this$0 = hatchGoalsTabDataSource;
                this.$siblingPlacement = map;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$siblingPlacement, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchGoalsTabDataSource hatchGoalsTabDataSource = this.this$0;
                    Map<String, Long> map = this.$siblingPlacement;
                    this.label = 1;
                    if (hatchGoalsTabDataSource.pushFixedPositions(map, this) == enumC10460Hji) {
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
                HatchGoalsTabDataSource hatchGoalsTabDataSource2 = this.this$0;
                this.label = 2;
                if (hatchGoalsTabDataSource2.refreshPlacementPages(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122873(String str, String str2, String str3, Map<String, Long> map, HtJ<? super C122873> htJ) {
            super(2, htJ);
            this.$goalId = str;
            this.$parentGoalId = str2;
            this.$formerParentId = str3;
            this.$siblingPlacement = map;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new C122873(this.$goalId, this.$parentGoalId, this.$formerParentId, this.$siblingPlacement, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabDataSource.this;
                String str = this.$goalId;
                String str2 = this.$parentGoalId;
                this.label = 1;
                obj = hatchGoalsTabDataSource.patchGoalParent(str, str2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            boolean zA1X = AnonymousClass001.A1X(obj);
            String str3 = this.$goalId;
            if (zA1X) {
                CFK.A03(str3, HatchGoalsTabDataSourceKt.DRAG_TAG, "nestGoalUnder %s PATCH ok");
                HatchGoalsTabDataSource hatchGoalsTabDataSource2 = HatchGoalsTabDataSource.this;
                hatchGoalsTabDataSource2.scheduleOrderSync(FGI.A0M("children:", this.$parentGoalId), new AnonymousClass1(hatchGoalsTabDataSource2, this.$siblingPlacement, null));
            } else {
                CFK.A0H(HatchGoalsTabDataSourceKt.DRAG_TAG, "nestGoalUnder %s PATCH failed, rolling back", str3);
                HatchGoalsTabDataSource.this.rollBackNesting(this.$goalId, this.$parentGoalId, this.$formerParentId);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C122873) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource", f = "HatchGoalsTabDataSource.kt", l = {2069}, m = "patchFixedPosition", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$patchFixedPosition$1, reason: invalid class name and case insensitive filesystem */
    public final class C122881 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C122881(HtJ<? super C122881> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGoalsTabDataSource.this.patchFixedPosition(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$patchGoal$2", f = "HatchGoalsTabDataSource.kt", l = {2386}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$patchGoal$2, reason: invalid class name and case insensitive filesystem */
    public final class C122892 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ GoalUpdateRequestJson $body;
        public final /* synthetic */ String $goalId;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public final /* synthetic */ HatchGoalsTabDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122892(String str, GoalUpdateRequestJson goalUpdateRequestJson, HatchGoalsTabDataSource hatchGoalsTabDataSource, HtJ<? super C122892> htJ) {
            super(2, htJ);
            this.$goalId = str;
            this.$body = goalUpdateRequestJson;
            this.this$0 = hatchGoalsTabDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C122892(this.$goalId, this.$body, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z = false;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    Set<Integer> setA18 = AnonymousClass004.A18();
                    C9jH c9jHA0E = AGH.A0E();
                    HatchGoalsTabDataSource$patchGoal$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchGoalsTabDataSource$patchGoal$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchGoalsTabDataSource$patchGoal$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                    HatchGoalsTabDataSource$patchGoal$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchGoalsTabDataSource$patchGoal$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchGoalsTabDataSource$patchGoal$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.I$0 = 1;
                    this.I$1 = 1;
                    this.I$2 = 0;
                    this.I$3 = 1;
                    this.I$4 = 0;
                    this.I$5 = 0;
                    this.I$6 = 0;
                    this.label = 1;
                    objM1599executeJarvisRequestWithFof5HsY = HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(hatchGoalsTabDataSource$patchGoal$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchGoalsTabDataSource$patchGoal$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, new JarvisPath.Goal(this.$goalId), this.$body, RequestType.PATCH, this.this$0.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                    if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
                }
                z = !(objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(HatchGoalsTabDataSourceKt.TAG, FGI.A0d("Failed to patch goal placement for ", this.$goalId, ": ", e2.getMessage()), e2);
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C122892) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource", f = "HatchGoalsTabDataSource.kt", l = {2386}, m = "patchGoalStatus", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$patchGoalStatus$1, reason: invalid class name and case insensitive filesystem */
    public final class C122901 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C122901(HtJ<? super C122901> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGoalsTabDataSource.this.patchGoalStatus(null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$pinOrder$2", f = "HatchGoalsTabDataSource.kt", l = {1809, 1810}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$pinOrder$2, reason: invalid class name and case insensitive filesystem */
    public final class C122912 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ Map<String, Long> $placement;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122912(Map<String, Long> map, HtJ<? super C122912> htJ) {
            super(1, htJ);
            this.$placement = map;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new C122912(this.$placement, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabDataSource.this;
                Map<String, Long> map = this.$placement;
                this.label = 1;
                if (hatchGoalsTabDataSource.pushFixedPositions(map, this) == enumC10460Hji) {
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
            HatchGoalsTabDataSource hatchGoalsTabDataSource2 = HatchGoalsTabDataSource.this;
            this.label = 2;
            if (hatchGoalsTabDataSource2.refreshPlacementPages(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C122912) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$placeGoalAtRoot$2", f = "HatchGoalsTabDataSource.kt", l = {1881, 1882}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$placeGoalAtRoot$2, reason: invalid class name and case insensitive filesystem */
    public final class C122922 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ Map<String, Long> $placement;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122922(Map<String, Long> map, HtJ<? super C122922> htJ) {
            super(1, htJ);
            this.$placement = map;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new C122922(this.$placement, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabDataSource.this;
                Map<String, Long> map = this.$placement;
                this.label = 1;
                if (hatchGoalsTabDataSource.pushFixedPositions(map, this) == enumC10460Hji) {
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
            HatchGoalsTabDataSource hatchGoalsTabDataSource2 = HatchGoalsTabDataSource.this;
            this.label = 2;
            if (hatchGoalsTabDataSource2.refreshPlacementPages(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C122922) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$placeGoalAtRoot$5", f = "HatchGoalsTabDataSource.kt", l = {1894, 1903}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$placeGoalAtRoot$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $changesSection;
        public final /* synthetic */ String $formerParentId;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ Map<String, Long> $placement;
        public final /* synthetic */ GoalsLocalOrder $previousLocalOrder;
        public final /* synthetic */ GoalListSection $toSection;
        public boolean Z$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$placeGoalAtRoot$5$1", f = "HatchGoalsTabDataSource.kt", l = {1906, 1907}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$placeGoalAtRoot$5$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ Map<String, Long> $placement;
            public int label;
            public final /* synthetic */ HatchGoalsTabDataSource this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchGoalsTabDataSource hatchGoalsTabDataSource, Map<String, Long> map, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.this$0 = hatchGoalsTabDataSource;
                this.$placement = map;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$placement, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchGoalsTabDataSource hatchGoalsTabDataSource = this.this$0;
                    Map<String, Long> map = this.$placement;
                    this.label = 1;
                    if (hatchGoalsTabDataSource.pushFixedPositions(map, this) == enumC10460Hji) {
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
                HatchGoalsTabDataSource hatchGoalsTabDataSource2 = this.this$0;
                this.label = 2;
                if (hatchGoalsTabDataSource2.refreshPlacementPages(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, boolean z, GoalListSection goalListSection, Map<String, Long> map, GoalsLocalOrder goalsLocalOrder, String str2, HtJ<? super AnonymousClass5> htJ) {
            super(2, htJ);
            this.$goalId = str;
            this.$changesSection = z;
            this.$toSection = goalListSection;
            this.$placement = map;
            this.$previousLocalOrder = goalsLocalOrder;
            this.$formerParentId = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new AnonymousClass5(this.$goalId, this.$changesSection, this.$toSection, this.$placement, this.$previousLocalOrder, this.$formerParentId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            GoalsStore value;
            GoalsStore goalsStoreWithLocalOrder;
            InterfaceC0962AJp<String, Long> interfaceC0962AJpAaZ;
            Object objPatchGoal = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objPatchGoal);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabDataSource.this;
                String str = this.$goalId;
                GoalUpdateRequestJson goalUpdateRequestJson = new GoalUpdateRequestJson(null, null, null, JsonNull.A00, null, this.$changesSection ? this.$toSection.getWireSource().getWireValue() : null);
                this.label = 1;
                objPatchGoal = hatchGoalsTabDataSource.patchGoal(str, goalUpdateRequestJson, this);
                if (objPatchGoal == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objPatchGoal);
                    return Unit.INSTANCE;
                }
                Hwg.A00(objPatchGoal);
            }
            boolean zA1X = AnonymousClass001.A1X(objPatchGoal);
            if (zA1X) {
                boolean zIsEmpty = this.$placement.isEmpty();
                HatchGoalsTabDataSource hatchGoalsTabDataSource2 = HatchGoalsTabDataSource.this;
                if (zIsEmpty) {
                    this.Z$0 = zA1X;
                    this.label = 2;
                    if (hatchGoalsTabDataSource2.refreshPlacementPages(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    hatchGoalsTabDataSource2.scheduleOrderSync(AnonymousClass007.A0a("section:", this.$toSection), new AnonymousClass1(HatchGoalsTabDataSource.this, this.$placement, null));
                }
            } else {
                HatchGoalsTabDataSource.this._localOrder.Af8(this.$previousLocalOrder);
                HatchGoalsTabDataSource hatchGoalsTabDataSource3 = HatchGoalsTabDataSource.this;
                BLG<GoalsStore> blg = hatchGoalsTabDataSource3._store;
                String str2 = this.$goalId;
                String str3 = this.$formerParentId;
                Map<String, Long> map = this.$placement;
                do {
                    value = blg.getValue();
                    GoalsStore goalsStore = value;
                    goalsStoreWithLocalOrder = hatchGoalsTabDataSource3.withLocalOrder(HatchGoalsTabDataSourceKt.withParentLink(goalsStore, str2, str3));
                    Set<String> setKeySet = map.keySet();
                    interfaceC0962AJpAaZ = goalsStore.pendingPins;
                    Iterator<String> it = setKeySet.iterator();
                    while (it.hasNext()) {
                        interfaceC0962AJpAaZ = interfaceC0962AJpAaZ.AaZ(it.next());
                    }
                } while (!blg.A6e(value, GoalsStore.copy$default(goalsStoreWithLocalOrder, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, interfaceC0962AJpAaZ, 262143, null)));
                HatchGoalsTabDataSource.this.emitGoalCoreUpdatesFor((Set<String>) BLW.A05(this.$goalId, this.$formerParentId));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass5) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$promoteSubGoalToGoal$3", f = "HatchGoalsTabDataSource.kt", l = {1845}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$promoteSubGoalToGoal$3, reason: invalid class name and case insensitive filesystem */
    public final class C122933 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ String $parentId;
        public final /* synthetic */ Map<String, Long> $promotedPlacement;
        public final /* synthetic */ GoalListSection $section;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$promoteSubGoalToGoal$3$1", f = "HatchGoalsTabDataSource.kt", l = {1847, 1848}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$promoteSubGoalToGoal$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ Map<String, Long> $promotedPlacement;
            public int label;
            public final /* synthetic */ HatchGoalsTabDataSource this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchGoalsTabDataSource hatchGoalsTabDataSource, Map<String, Long> map, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.this$0 = hatchGoalsTabDataSource;
                this.$promotedPlacement = map;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$promotedPlacement, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchGoalsTabDataSource hatchGoalsTabDataSource = this.this$0;
                    Map<String, Long> map = this.$promotedPlacement;
                    this.label = 1;
                    if (hatchGoalsTabDataSource.pushFixedPositions(map, this) == enumC10460Hji) {
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
                HatchGoalsTabDataSource hatchGoalsTabDataSource2 = this.this$0;
                this.label = 2;
                if (hatchGoalsTabDataSource2.refreshPlacementPages(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122933(String str, GoalListSection goalListSection, String str2, Map<String, Long> map, HtJ<? super C122933> htJ) {
            super(2, htJ);
            this.$goalId = str;
            this.$section = goalListSection;
            this.$parentId = str2;
            this.$promotedPlacement = map;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new C122933(this.$goalId, this.$section, this.$parentId, this.$promotedPlacement, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabDataSource.this;
                String str = this.$goalId;
                this.label = 1;
                obj = hatchGoalsTabDataSource.patchGoalParent(str, null, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            boolean zA1X = AnonymousClass001.A1X(obj);
            HatchGoalsTabDataSource hatchGoalsTabDataSource2 = HatchGoalsTabDataSource.this;
            if (zA1X) {
                hatchGoalsTabDataSource2.scheduleOrderSync(AnonymousClass007.A0a("section:", this.$section), new AnonymousClass1(HatchGoalsTabDataSource.this, this.$promotedPlacement, null));
            } else {
                hatchGoalsTabDataSource2.rollBackPromotion(this.$goalId, this.$parentId);
                HatchGoalsTabDataSource.this.emitGoalCoreUpdatesFor(this.$goalId, this.$parentId);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C122933) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource", f = "HatchGoalsTabDataSource.kt", l = {2052}, m = "pushFixedPositions", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$pushFixedPositions$1, reason: invalid class name and case insensitive filesystem */
    public final class C122941 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C122941(HtJ<? super C122941> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGoalsTabDataSource.this.pushFixedPositions(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource", f = "HatchGoalsTabDataSource.kt", l = {2183, 2190}, m = "reconcileGoalCollections", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$reconcileGoalCollections$1, reason: invalid class name and case insensitive filesystem */
    public final class C122951 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C122951(HtJ<? super C122951> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGoalsTabDataSource.this.reconcileGoalCollections(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$reconcileGoalCollections$2", f = "HatchGoalsTabDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$reconcileGoalCollections$2, reason: invalid class name and case insensitive filesystem */
    public final class C122962 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HoC>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$reconcileGoalCollections$2$1", f = "HatchGoalsTabDataSource.kt", l = {2184}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$reconcileGoalCollections$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ HatchGoalsTabDataSource this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchGoalsTabDataSource hatchGoalsTabDataSource, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = hatchGoalsTabDataSource;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchGoalsTabDataSource hatchGoalsTabDataSource = this.this$0;
                    this.label = 1;
                    if (hatchGoalsTabDataSource.loadGoals(this) == enumC10460Hji) {
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
                return new AnonymousClass1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$reconcileGoalCollections$2$2", f = "HatchGoalsTabDataSource.kt", l = {2186}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$reconcileGoalCollections$2$2, reason: invalid class name and collision with other inner class name */
        public final class C01942 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ HatchGoalsTabDataSource this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01942(HatchGoalsTabDataSource hatchGoalsTabDataSource, HtJ<? super C01942> htJ) {
                super(2, htJ);
                this.this$0 = hatchGoalsTabDataSource;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C01942(this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchGoalsTabDataSource hatchGoalsTabDataSource = this.this$0;
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
                return new C01942(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$reconcileGoalCollections$2$3", f = "HatchGoalsTabDataSource.kt", l = {2188}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$reconcileGoalCollections$2$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ HatchGoalsTabDataSource this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(HatchGoalsTabDataSource hatchGoalsTabDataSource, HtJ<? super AnonymousClass3> htJ) {
                super(2, htJ);
                this.this$0 = hatchGoalsTabDataSource;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass3(this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchGoalsTabDataSource hatchGoalsTabDataSource = this.this$0;
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
                return new AnonymousClass3(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C122962(HtJ<? super C122962> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C122962 c122962 = HatchGoalsTabDataSource.this.new C122962(htJ);
            c122962.L$0 = obj;
            return c122962;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(HatchGoalsTabDataSource.this, null);
            C6ys c6ys = C6ys.A00;
            Integer num = C79.A00;
            GAo.A02(num, c6ys, anonymousClass1, c3ux);
            if (HatchUtil.INSTANCE.isGoalsTrackingSectionEnabled()) {
                GAo.A02(num, c6ys, new C01942(HatchGoalsTabDataSource.this, null), c3ux);
            }
            return GAo.A02(num, c6ys, new AnonymousClass3(HatchGoalsTabDataSource.this, null), c3ux);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HoC> htJ) {
            return ((C122962) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$recordGoalEngagement$2", f = "HatchGoalsTabDataSource.kt", l = {2386}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$recordGoalEngagement$2, reason: invalid class name and case insensitive filesystem */
    public final class C122972 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchEngagementEventType $eventType;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ JsonObject $metadata;
        public final /* synthetic */ String $surface;
        public final /* synthetic */ Double $value;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public final /* synthetic */ HatchGoalsTabDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122972(String str, HatchEngagementEventType hatchEngagementEventType, String str2, Double d, JsonObject jsonObject, HatchGoalsTabDataSource hatchGoalsTabDataSource, HtJ<? super C122972> htJ) {
            super(2, htJ);
            this.$goalId = str;
            this.$eventType = hatchEngagementEventType;
            this.$surface = str2;
            this.$value = d;
            this.$metadata = jsonObject;
            this.this$0 = hatchGoalsTabDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C122972(this.$goalId, this.$eventType, this.$surface, this.$value, this.$metadata, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (Exception e) {
                C3cH.A1B("Failed to record goal engagement: ", e.getMessage(), HatchGoalsTabDataSourceKt.TAG, e);
            }
            if (i == 0) {
                Hwg.A00(obj);
                String str = this.$goalId;
                if (str.length() == 0) {
                    CFK.A06(HatchGoalsTabDataSourceKt.TAG, "[engagement] missing goalId");
                    return Unit.INSTANCE;
                }
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchGoalsTabDataSource$recordGoalEngagement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchGoalsTabDataSource$recordGoalEngagement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchGoalsTabDataSource$recordGoalEngagement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchGoalsTabDataSource$recordGoalEngagement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchGoalsTabDataSource$recordGoalEngagement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchGoalsTabDataSource$recordGoalEngagement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                if (HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(hatchGoalsTabDataSource$recordGoalEngagement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchGoalsTabDataSource$recordGoalEngagement$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, true, new JarvisPath.GoalEngagement(str), new GoalEngagementRequestJson(this.$eventType.getWireValue(), this.$surface, this.$value, this.$metadata), RequestType.POST, this.this$0.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this) == enumC10460Hji) {
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
            return ((C122972) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource", f = "HatchGoalsTabDataSource.kt", l = {1518, 1519, 1521}, m = "refresh", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C122981 extends HzP {
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C122981(HtJ<? super C122981> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGoalsTabDataSource.this.refresh(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$refreshPlacementPages$2", f = "HatchGoalsTabDataSource.kt", l = {1243, 1249}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$refreshPlacementPages$2, reason: invalid class name and case insensitive filesystem */
    public final class C122992 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ GoalsStore $prior;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122992(GoalsStore goalsStore, HtJ<? super C122992> htJ) {
            super(2, htJ);
            this.$prior = goalsStore;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new C122992(this.$prior, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[PHI: r4 r6
  0x005e: PHI (r4v2 com.facebook.aura.library.repo.GoalsPage) = (r4v1 com.facebook.aura.library.repo.GoalsPage), (r4v3 com.facebook.aura.library.repo.GoalsPage) binds: [B:22:0x005d, B:8:0x0019] A[DONT_GENERATE, DONT_INLINE]
  0x005e: PHI (r6v5 com.facebook.aura.library.repo.GoalsPage) = (r6v3 com.facebook.aura.library.repo.GoalsPage), (r6v7 com.facebook.aura.library.repo.GoalsPage) binds: [B:22:0x005d, B:8:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[LOOP:1: B:25:0x0079->B:27:0x007f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r36) {
            /*
                Method dump skipped, instructions count: 281
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSource.C122992.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C122992) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$rollBackNesting$3", f = "HatchGoalsTabDataSource.kt", l = {2031}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$rollBackNesting$3, reason: invalid class name and case insensitive filesystem */
    public final class C123003 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $goalId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123003(String str, HtJ<? super C123003> htJ) {
            super(2, htJ);
            this.$goalId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new C123003(this.$goalId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabDataSource.this;
                String str = this.$goalId;
                this.label = 1;
                if (hatchGoalsTabDataSource.loadGoalDetail(str, this) == enumC10460Hji) {
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
            return ((C123003) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$rollBackPromotion$3", f = "HatchGoalsTabDataSource.kt", l = {1929}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$rollBackPromotion$3, reason: invalid class name and case insensitive filesystem */
    public final class C123013 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $goalId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123013(String str, HtJ<? super C123013> htJ) {
            super(2, htJ);
            this.$goalId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new C123013(this.$goalId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = HatchGoalsTabDataSource.this;
                String str = this.$goalId;
                this.label = 1;
                if (hatchGoalsTabDataSource.loadGoalDetail(str, this) == enumC10460Hji) {
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
            return ((C123013) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource", f = "HatchGoalsTabDataSource.kt", l = {2140}, m = "runCompletionStep", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$runCompletionStep$1, reason: invalid class name and case insensitive filesystem */
    public final class C123021 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C123021(HtJ<? super C123021> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGoalsTabDataSource.this.runCompletionStep(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource", f = "HatchGoalsTabDataSource.kt", l = {1689, 1701}, m = "runInFlightCompletion", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$runInFlightCompletion$1, reason: invalid class name and case insensitive filesystem */
    public final class C123031 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C123031(HtJ<? super C123031> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGoalsTabDataSource.this.runInFlightCompletion(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$setShowGoalsFirst$1", f = "HatchGoalsTabDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$setShowGoalsFirst$1, reason: invalid class name and case insensitive filesystem */
    public final class C123041 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $goalsFirst;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123041(boolean z, HtJ<? super C123041> htJ) {
            super(2, htJ);
            this.$goalsFirst = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new C123041(this.$goalsFirst, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            BzK bzKA9q = HatchPrefsStore.INSTANCE.userPrefs(HatchGoalsTabDataSource.this.userSession).A9q();
            bzKA9q.A0A(HatchGoalsTabDataSource.this.showGoalsFirstKey, this.$goalsFirst);
            bzKA9q.apply();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C123041) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$setShowSubtitles$1", f = "HatchGoalsTabDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$setShowSubtitles$1, reason: invalid class name and case insensitive filesystem */
    public final class C123051 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $show;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123051(boolean z, HtJ<? super C123051> htJ) {
            super(2, htJ);
            this.$show = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new C123051(this.$show, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            BzK bzKA9q = HatchPrefsStore.INSTANCE.userPrefs(HatchGoalsTabDataSource.this.userSession).A9q();
            bzKA9q.A0A(HatchGoalsTabDataSourceKt.SHOW_SUBTITLES_KEY, this.$show);
            bzKA9q.apply();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C123051) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$sortGoalsAutomatically$2", f = "HatchGoalsTabDataSource.kt", l = {2362}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$sortGoalsAutomatically$2, reason: invalid class name and case insensitive filesystem */
    public final class C123062 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        public C123062(HtJ<? super C123062> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new C123062(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            GoalsStore value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z = false;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchGoalsTabDataSource.this.cancelPendingOrderSyncs();
                    Set<Integer> setA18 = AnonymousClass004.A18();
                    C9jH c9jHA0E = AGH.A0E();
                    HatchGoalsTabDataSource$sortGoalsAutomatically$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchGoalsTabDataSource$sortGoalsAutomatically$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchGoalsTabDataSource$sortGoalsAutomatically$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.I$0 = 1;
                    this.I$1 = 1;
                    this.I$2 = 0;
                    this.label = 1;
                    objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(hatchGoalsTabDataSource$sortGoalsAutomatically$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, JarvisPath.GoalsFixedPositions.INSTANCE, RequestType.DELETE, HatchGoalsTabDataSource.this.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
                    if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
                }
                if (!(objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud)) {
                    BLG<GoalsStore> blg = HatchGoalsTabDataSource.this._store;
                    do {
                        value = blg.getValue();
                    } while (!blg.A6e(value, GoalsStore.copy$default(value, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, C0953AJg.A00(), 262143, null)));
                    z = true;
                } else {
                    Throwable thA00 = HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
                    CFK.A04(HatchGoalsTabDataSourceKt.TAG, FGI.A0M("Failed to clear goal fixed positions: ", thA00 != null ? thA00.getMessage() : null));
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                C3cH.A1B("Failed to clear goal fixed positions: ", e2.getMessage(), HatchGoalsTabDataSourceKt.TAG, e2);
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return HatchGoalsTabDataSource.this.new C123062(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$subscribeToGoalTaskStatusEvents$1", f = "HatchGoalsTabDataSource.kt", l = {1037}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$subscribeToGoalTaskStatusEvents$1, reason: invalid class name and case insensitive filesystem */
    public final class C123071 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public Object L$0;
        public int label;
        public final /* synthetic */ HatchGoalsTabDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123071(HatchGatewayConnection hatchGatewayConnection, HatchGoalsTabDataSource hatchGoalsTabDataSource, HtJ<? super C123071> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
            this.this$0 = hatchGoalsTabDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C123071(this.$gateway, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q c20qA01 = AbstractC05623ug.A01(new HatchGoalsTabDataSource$subscribeToGoalTaskStatusEvents$1$invokeSuspend$$inlined$map$1(new HatchGoalsTabDataSource$subscribeToGoalTaskStatusEvents$1$invokeSuspend$$inlined$filter$1(new HatchGoalsTabDataSource$subscribeToGoalTaskStatusEvents$1$invokeSuspend$$inlined$filterIsInstance$1(this.$gateway.getChatEvents()), this.this$0, C3cG.A0k())));
                final HatchGoalsTabDataSource hatchGoalsTabDataSource = this.this$0;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.library.repo.HatchGoalsTabDataSource.subscribeToGoalTaskStatusEvents.1.3
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        return C3cG.A0U(hatchGoalsTabDataSource.refresh(true, htJ));
                    }
                };
                this.L$0 = null;
                this.label = 1;
                if (c20qA01.collect(c20z, this) == enumC10460Hji) {
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
            return ((C123071) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$subscribeToGoalUpdatedEvents$1", f = "HatchGoalsTabDataSource.kt", l = {1066}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$subscribeToGoalUpdatedEvents$1, reason: invalid class name and case insensitive filesystem */
    public final class C123081 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public int label;
        public final /* synthetic */ HatchGoalsTabDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123081(HatchGatewayConnection hatchGatewayConnection, HatchGoalsTabDataSource hatchGoalsTabDataSource, HtJ<? super C123081> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
            this.this$0 = hatchGoalsTabDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C123081(this.$gateway, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<JsonObject> goalUpdatedEvents = this.$gateway.getGoalUpdatedEvents();
                final HatchGoalsTabDataSource hatchGoalsTabDataSource = this.this$0;
                C20Z<? super JsonObject> c20z = new C20Z() { // from class: com.facebook.aura.library.repo.HatchGoalsTabDataSource.subscribeToGoalUpdatedEvents.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((JsonObject) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(JsonObject jsonObject, HtJ<? super Unit> htJ) {
                        GoalDetail domain;
                        GoalsStore value;
                        GoalsStore goalsStoreA0D;
                        Object objRefresh;
                        try {
                            C9sU c9sU = HatchJsonKt.HatchJson;
                            F0C<C9hr<Object>>[] f0cArr = GoalDetailResponseJson.$childSerializers;
                            domain = ((GoalDetailResponseJson) c9sU.A01(GoalDetailResponseJson$$serializer.INSTANCE, jsonObject)).toDomain();
                        } catch (Exception e) {
                            C3cG.A1G("Failed to parse goal.updated payload: ", e.getMessage(), HatchGoalsTabDataSourceKt.TAG);
                            domain = null;
                        }
                        if (domain != null) {
                            HatchGoalsTabDataSource hatchGoalsTabDataSource2 = hatchGoalsTabDataSource;
                            BLG<GoalsStore> blg = hatchGoalsTabDataSource2._store;
                            do {
                                value = blg.getValue();
                                goalsStoreA0D = C3cI.A0D(hatchGoalsTabDataSource2, HatchGoalsTabDataSourceKt.mergeGoalDetail(value, domain));
                            } while (!blg.A6e(value, goalsStoreA0D));
                            hatchGoalsTabDataSource.emitGoalCoreUpdatesFor(HatchGoalsTabDataSourceKt.subtreeIds(goalsStoreA0D, domain.goal.id), goalsStoreA0D);
                            if (!HatchGoalsTabDataSourceKt.isInAnyCollection(goalsStoreA0D, domain.goal.id) && (objRefresh = hatchGoalsTabDataSource.refresh(true, htJ)) == EnumC10460Hji.A02) {
                                return objRefresh;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (goalUpdatedEvents.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C123081) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$updateGoal$2", f = "HatchGoalsTabDataSource.kt", l = {2391}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$updateGoal$2, reason: invalid class name and case insensitive filesystem */
    public final class C123092 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $description;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ String $title;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123092(String str, String str2, String str3, HtJ<? super C123092> htJ) {
            super(2, htJ);
            this.$goalId = str;
            this.$title = str2;
            this.$description = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGoalsTabDataSource.this.new C123092(this.$goalId, this.$title, this.$description, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v31 */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8, types: [T, com.facebook.aura.library.repo.Goal] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C10543Hqv c10543HqvA10;
            GoalsStore value;
            GoalsStore goalsStoreWithGoalText;
            Goal goal;
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z = true;
            boolean z2 = false;
            try {
                if (i == 0) {
                    c10543HqvA10 = C3cG.A10(obj);
                    BLG<GoalsStore> blg = HatchGoalsTabDataSource.this._store;
                    String str = this.$goalId;
                    String str2 = this.$title;
                    String str3 = this.$description;
                    do {
                        value = blg.getValue();
                        GoalsStore goalsStore = value;
                        GoalNode goalNodeA0B = C3cI.A0B(goalsStore, str);
                        ?? r0 = goalNodeA0B != null ? goalNodeA0B.goal : 0;
                        c10543HqvA10.element = r0;
                        goalsStoreWithGoalText = HatchGoalsTabDataSourceKt.withGoalText(goalsStore, str, str2 == null ? r0 != 0 ? r0.title : null : str2, str3 == null ? r0 != 0 ? r0.description : null : str3);
                    } while (!blg.A6e(value, goalsStoreWithGoalText));
                    GoalNode goalNodeA0P = C3cH.A0P(this.$goalId, goalsStoreWithGoalText.goalsById);
                    goal = goalNodeA0P != null ? goalNodeA0P.goal : null;
                    HatchGoalsTabDataSource.this.emitGoalCoreUpdatesFor(this.$goalId);
                    Set<Integer> setA18 = AnonymousClass004.A18();
                    C9jH c9jHA0E = AGH.A0E();
                    HatchGoalsTabDataSource$updateGoal$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchGoalsTabDataSource$updateGoal$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchGoalsTabDataSource$updateGoal$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                    HatchGoalsTabDataSource$updateGoal$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchGoalsTabDataSource$updateGoal$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchGoalsTabDataSource$updateGoal$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                    this.L$0 = c10543HqvA10;
                    this.L$1 = null;
                    this.L$2 = goal;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.L$10 = null;
                    this.I$0 = 1;
                    this.I$1 = 1;
                    this.I$2 = 0;
                    this.I$3 = 1;
                    this.I$4 = 0;
                    this.I$5 = 0;
                    this.I$6 = 0;
                    this.label = 1;
                    objM1599executeJarvisRequestWithFof5HsY = HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(hatchGoalsTabDataSource$updateGoal$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchGoalsTabDataSource$updateGoal$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, new JarvisPath.Goal(this.$goalId), new GoalUpdateRequestJson(this.$title, this.$description, null, null, null, null), RequestType.PATCH, HatchGoalsTabDataSource.this.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                    if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    goal = (Goal) this.L$2;
                    c10543HqvA10 = (C10543Hqv) this.L$0;
                    objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
                }
                if (!(!(objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud))) {
                    HatchGoalsTabDataSource.this.rollBackGoalText(this.$goalId, goal, (Goal) c10543HqvA10.element);
                    z = false;
                }
                z2 = z;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                C3cI.A1L("Failed to update goal: ", e2.getMessage(), e2);
                HatchGoalsTabDataSource.this.rollBackGoalText(this.$goalId, goal, (Goal) c10543HqvA10.element);
            }
            return Boolean.valueOf(z2);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C123092) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void nestGoalUnder(String str, String str2) {
        GoalsLocalOrder value;
        InterfaceC0962AJp<String, GoalListSection> interfaceC0962AJpAaZ;
        InterfaceC0962AJp<String, String> interfaceC0962AJpAYj;
        GoalsStore value2;
        Object[] objArr;
        String str3;
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        if (str.equals(str2)) {
            objArr = new Object[]{str};
            str3 = "nestGoalUnder %s dropped: same goal as parent";
        } else {
            GoalsStore goalsStoreA0C = C3cI.A0C(this);
            GoalNode goalNodeA0B = C3cI.A0B(goalsStoreA0C, str);
            if (goalNodeA0B == null) {
                objArr = new Object[]{str};
                str3 = "nestGoalUnder %s dropped: goal not in store";
            } else {
                GoalNode goalNodeA0B2 = C3cI.A0B(goalsStoreA0C, str2);
                if (goalNodeA0B2 == null) {
                    objArr = new Object[]{str, str2};
                    str3 = "nestGoalUnder %s dropped: parent %s not in store";
                } else if (!goalNodeA0B.childIds.isEmpty()) {
                    objArr = new Object[]{str, Integer.valueOf(goalNodeA0B.childIds.size())};
                    str3 = "nestGoalUnder %s dropped: it has %d children";
                } else {
                    if (goalNodeA0B2.goal.parentGoalId == null) {
                        CFK.A02(str, str2, HatchGoalsTabDataSourceKt.DRAG_TAG, "nestGoalUnder %s under %s");
                        String str4 = goalNodeA0B.goal.parentGoalId;
                        ArrayList arrayListA0R = AbstractC0878AGe.A0R(HatchGoalsTabDataSourceKt.displayedOrder(goalsStoreA0C, goalNodeA0B2.childIds));
                        arrayListA0R.remove(str);
                        arrayListA0R.add(zA1b ? 1 : 0, str);
                        BLG<GoalsLocalOrder> blg = this._localOrder;
                        do {
                            value = blg.getValue();
                            GoalsLocalOrder goalsLocalOrder = value;
                            interfaceC0962AJpAaZ = goalsLocalOrder.promoted.AaZ(str);
                            interfaceC0962AJpAYj = goalsLocalOrder.nested.AYj(str, str2);
                            AnonymousClass003.A0u(interfaceC0962AJpAaZ, interfaceC0962AJpAYj);
                        } while (!blg.A6e(value, new GoalsLocalOrder(interfaceC0962AJpAaZ, interfaceC0962AJpAYj)));
                        Map<String, Long> mapPlacementFor = HatchGoalsTabDataSourceKt.placementFor(C3cI.A0C(this), arrayListA0R, str);
                        BLG<GoalsStore> blg2 = this._store;
                        do {
                            value2 = blg2.getValue();
                        } while (!blg2.A6e(value2, HatchGoalsTabDataSourceKt.withPendingPins(withLocalOrder(value2), mapPlacementFor)));
                        emitGoalCoreUpdatesFor(BLW.A05(str, str2, str4));
                        AnonymousClass001.A1J(new C122873(str, str2, str4, mapPlacementFor, null), this.scope);
                        return;
                    }
                    objArr = new Object[]{str, str2};
                    str3 = "nestGoalUnder %s dropped: parent %s is itself a subgoal";
                }
            }
        }
        CFK.A0H(HatchGoalsTabDataSourceKt.DRAG_TAG, str3, objArr);
    }

    public final void placeGoalAtRoot(String str, GoalListSection goalListSection, GoalListSection goalListSection2, String str2) {
        int size;
        GoalsLocalOrder value;
        InterfaceC0962AJp<String, GoalListSection> interfaceC0962AJpAYj;
        InterfaceC0962AJp<String, String> interfaceC0962AJpAaZ;
        GoalsStore value2;
        GoalsStore value3;
        AnonymousClass005.A0x(str, goalListSection, goalListSection2);
        GoalsStore goalsStoreA0C = C3cI.A0C(this);
        GoalNode goalNodeA0B = C3cI.A0B(goalsStoreA0C, str);
        if (goalNodeA0B == null) {
            CFK.A0H(HatchGoalsTabDataSourceKt.DRAG_TAG, "placeGoalAtRoot %s dropped: goal not in store", str);
            return;
        }
        String str3 = goalNodeA0B.goal.parentGoalId;
        boolean zA1Z = AnonymousClass006.A1Z(goalListSection, goalListSection2);
        boolean zA1X = AnonymousClass002.A1X(str3);
        ArrayList arrayListA0R = AbstractC0878AGe.A0R(HatchGoalsTabDataSourceKt.displayedOrder(goalsStoreA0C, HatchGoalsTabDataSourceKt.rootOrder(goalsStoreA0C, goalListSection2)));
        arrayListA0R.remove(str);
        if (str2 == null || (size = arrayListA0R.indexOf(str2)) < 0) {
            size = arrayListA0R.size();
        }
        arrayListA0R.add(size, str);
        if (!zA1Z && !zA1X) {
            Map<String, Long> mapPlacementFor = HatchGoalsTabDataSourceKt.placementFor(goalsStoreA0C, arrayListA0R, str);
            if (mapPlacementFor.isEmpty()) {
                return;
            }
            BLG<GoalsStore> blg = this._store;
            do {
                value3 = blg.getValue();
            } while (!blg.A6e(value3, HatchGoalsTabDataSourceKt.withPendingPins(value3, mapPlacementFor)));
            scheduleOrderSync(AnonymousClass007.A0a("section:", goalListSection2), new C122922(mapPlacementFor, null));
            return;
        }
        GoalsLocalOrder value4 = this._localOrder.getValue();
        BLG<GoalsLocalOrder> blg2 = this._localOrder;
        do {
            value = blg2.getValue();
            GoalsLocalOrder goalsLocalOrder = value;
            interfaceC0962AJpAYj = goalsLocalOrder.promoted.AYj(str, goalListSection2);
            interfaceC0962AJpAaZ = goalsLocalOrder.nested.AaZ(str);
            AnonymousClass003.A0u(interfaceC0962AJpAYj, interfaceC0962AJpAaZ);
        } while (!blg2.A6e(value, new GoalsLocalOrder(interfaceC0962AJpAYj, interfaceC0962AJpAaZ)));
        Map<String, Long> mapPlacementFor2 = HatchGoalsTabDataSourceKt.placementFor(C3cI.A0C(this), arrayListA0R, str);
        BLG<GoalsStore> blg3 = this._store;
        do {
            value2 = blg3.getValue();
        } while (!blg3.A6e(value2, HatchGoalsTabDataSourceKt.withPendingPins(withLocalOrder(value2), mapPlacementFor2)));
        emitGoalCoreUpdatesFor(BLW.A05(str, str3));
        AnonymousClass001.A1J(new AnonymousClass5(str, zA1Z, goalListSection2, mapPlacementFor2, value4, str3, null), this.scope);
    }

    public final void promoteSubGoalToGoal(String str, GoalListSection goalListSection) {
        GoalsLocalOrder value;
        InterfaceC0962AJp<String, GoalListSection> interfaceC0962AJpAYj;
        InterfaceC0962AJp<String, String> interfaceC0962AJpAaZ;
        GoalsStore value2;
        Goal goal;
        AnonymousClass003.A0u(str, goalListSection);
        GoalsStore goalsStoreA0C = C3cI.A0C(this);
        GoalNode goalNodeA0B = C3cI.A0B(goalsStoreA0C, str);
        String str2 = (goalNodeA0B == null || (goal = goalNodeA0B.goal) == null) ? null : goal.parentGoalId;
        if (str2 == null) {
            CFK.A0H(HatchGoalsTabDataSourceKt.DRAG_TAG, "promoteSubGoalToGoal %s dropped: it is already a root", str);
            return;
        }
        CFK.A01(str, str2, goalListSection.name(), HatchGoalsTabDataSourceKt.DRAG_TAG, "promoteSubGoalToGoal %s out of %s into %s");
        List<String> listDisplayedOrder = HatchGoalsTabDataSourceKt.displayedOrder(goalsStoreA0C, HatchGoalsTabDataSourceKt.rootOrder(goalsStoreA0C, goalListSection));
        int iIndexOf = listDisplayedOrder.indexOf(str2);
        if (iIndexOf < 0) {
            iIndexOf = listDisplayedOrder.size();
        }
        ArrayList arrayList = new ArrayList(listDisplayedOrder);
        arrayList.add(iIndexOf, str);
        BLG<GoalsLocalOrder> blg = this._localOrder;
        do {
            value = blg.getValue();
            GoalsLocalOrder goalsLocalOrder = value;
            interfaceC0962AJpAYj = goalsLocalOrder.promoted.AYj(str, goalListSection);
            interfaceC0962AJpAaZ = goalsLocalOrder.nested.AaZ(str);
            AnonymousClass003.A0u(interfaceC0962AJpAYj, interfaceC0962AJpAaZ);
        } while (!blg.A6e(value, new GoalsLocalOrder(interfaceC0962AJpAYj, interfaceC0962AJpAaZ)));
        Map<String, Long> mapPlacementFor = HatchGoalsTabDataSourceKt.placementFor(C3cI.A0C(this), arrayList, str);
        BLG<GoalsStore> blg2 = this._store;
        do {
            value2 = blg2.getValue();
        } while (!blg2.A6e(value2, HatchGoalsTabDataSourceKt.withPendingPins(withLocalOrder(value2), mapPlacementFor)));
        emitGoalCoreUpdatesFor(str, str2);
        AnonymousClass001.A1J(new C122933(str, goalListSection, str2, mapPlacementFor, null), this.scope);
    }

    public final boolean setGoalCompleted(String str, boolean z) {
        Object next;
        InterfaceC0962AJp<String, GoalToggleState> value;
        boolean z2;
        InterfaceC0962AJp<String, GoalToggleState> value2;
        GoalCompletionStep goalCompletionStep;
        Goal goal;
        C7384Etj.A0Y(str, 0);
        synchronized (this.toggleLock) {
            GoalsStore goalsStoreA0C = C3cI.A0C(this);
            GoalNode goalNodeA0B = C3cI.A0B(goalsStoreA0C, str);
            if (goalNodeA0B == null || (goal = goalNodeA0B.goal) == null || goal.isCompleted() != z) {
                Set<String> setCompletionStatusChangeIds = HatchGoalsTabDataSourceKt.completionStatusChangeIds(goalsStoreA0C, str, z);
                Iterator itA0n = AnonymousClass002.A0n(this._inFlightToggles.getValue());
                loop0: while (true) {
                    if (!itA0n.hasNext()) {
                        next = null;
                        break;
                    }
                    next = itA0n.next();
                    Set<String> set = ((GoalToggleState) ((Map.Entry) next).getValue()).inFlight.statusChangeIds;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator<String> it = set.iterator();
                        while (it.hasNext()) {
                            if (setCompletionStatusChangeIds.contains(AnonymousClass005.A0j(it))) {
                                break loop0;
                            }
                        }
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    String str2 = (String) entry.getKey();
                    GoalToggleState goalToggleState = (GoalToggleState) entry.getValue();
                    AHH ahhA34 = goalToggleState.queued.Aaj(new HatchGoalsTabDataSource$setGoalCompleted$1$queued$1(str)).A34(new GoalToggleIntent(str, z));
                    BLG<InterfaceC0962AJp<String, GoalToggleState>> blg = this._inFlightToggles;
                    do {
                        value2 = blg.getValue();
                        goalCompletionStep = goalToggleState.inFlight;
                        AnonymousClass003.A0u(goalCompletionStep, ahhA34);
                    } while (!blg.A6e(value2, value2.AYj(str2, new GoalToggleState(goalCompletionStep, ahhA34))));
                } else {
                    GoalCompletionStep goalCompletionStepApplyOptimistic = applyOptimistic(str, z, setCompletionStatusChangeIds);
                    BLG<InterfaceC0962AJp<String, GoalToggleState>> blg2 = this._inFlightToggles;
                    do {
                        value = blg2.getValue();
                    } while (!blg2.A6e(value, value.AYj(str, new GoalToggleState(goalCompletionStepApplyOptimistic, AHI.A01))));
                    AnonymousClass001.A1J(new HatchGoalsTabDataSource$setGoalCompleted$1$3(this, str, null), this.scope);
                }
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadingState.values().length];
            try {
                AnonymousClass002.A13(LoadingState.INITIAL, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LoadingState.LOADING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchGoalsTabDataSource(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.navTtrcCoordinator = HatchNavTTRCCoordinator.Companion.getInstance(abstractC3358CGz);
        HzC hzCA0x = C3cH.A0x(AnonymousClass001.A0y());
        this.scope = hzCA0x;
        C9286GCn c9286GCnA14 = C3cG.A14(new UserProfileState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        this._userProfileState = c9286GCnA14;
        this.userProfileState = C3cG.A11(c9286GCnA14);
        boolean z = false;
        C9286GCn c9286GCnA142 = C3cG.A14(new GoalsStore(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 524287, 0 == true ? 1 : 0));
        this._store = c9286GCnA142;
        C0953AJg c0953AJgA00 = C0953AJg.A00();
        this._localOrder = C3cG.A14(new GoalsLocalOrder(c0953AJgA00, c0953AJgA00));
        this.orderSyncLock = C3cG.A0T();
        this.orderSyncJobs = C3cG.A0j();
        HatchGoalsTabDataSource$special$$inlined$map$1 hatchGoalsTabDataSource$special$$inlined$map$1 = new HatchGoalsTabDataSource$special$$inlined$map$1(c9286GCnA142);
        C3Ej c3Ej = C3Ek.A00;
        AHI ahi = AHI.A01;
        LoadingState loadingState = LoadingState.INITIAL;
        C0943AIw c0943AIw = C0943AIw.A03;
        this.goalsState = AnonymousClass441.A00(new GoalsState(ahi, loadingState, false, false, c0943AIw), hzCA0x, hatchGoalsTabDataSource$special$$inlined$map$1, c3Ej);
        this.trackingState = AnonymousClass441.A00(new GoalsState(ahi, loadingState, false, false, c0943AIw), hzCA0x, new HatchGoalsTabDataSource$special$$inlined$map$2(c9286GCnA142), c3Ej);
        this.completedState = AnonymousClass441.A00(new GoalsState(ahi, loadingState, false, false, c0943AIw), hzCA0x, new HatchGoalsTabDataSource$special$$inlined$map$3(c9286GCnA142), c3Ej);
        this.toggleLock = C3cG.A0T();
        C9286GCn c9286GCnA01 = HnJ.A01(c0953AJgA00);
        this._inFlightToggles = c9286GCnA01;
        this.pendingCompletionIds = AnonymousClass441.A00(c0943AIw, hzCA0x, new HatchGoalsTabDataSource$special$$inlined$map$4(c9286GCnA01), c3Ej);
        HatchPrefsStore hatchPrefsStore = HatchPrefsStore.INSTANCE;
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(hatchPrefsStore.userPrefs(abstractC3358CGz).getBoolean(HatchGoalsTabDataSourceKt.SHOW_SUBTITLES_KEY, true));
        this._showSubtitles = c9286GCnA0v;
        this.showSubtitles = C3cG.A11(c9286GCnA0v);
        String strA0a = C3cH.A0a(HatchGatewayPrefsStore.Companion, abstractC3358CGz);
        String strA0M = (strA0a == null || C7BY.A0j(strA0a)) ? HatchGoalsTabDataSourceKt.SHOW_GOALS_FIRST_KEY : FGI.A0M("show_goals_section_first_", strA0a);
        this.showGoalsFirstKey = strA0M;
        C9286GCn c9286GCnA0v2 = AnonymousClass002.A0v(hatchPrefsStore.userPrefs(abstractC3358CGz).getBoolean(strA0M, false));
        this._showGoalsFirst = c9286GCnA0v2;
        this.showGoalsFirst = C3cG.A11(c9286GCnA0v2);
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A00, 0, 64);
        this._goalCoreUpdates = c9290GCrA12;
        this.goalCoreUpdates = C3pd.A00(c9290GCrA12);
        subscribeToGoalTaskStatusEvents();
        subscribeToGoalUpdatedEvents();
    }

    private final GoalCompletionStep applyOptimistic(String str, boolean z, Set<String> set) {
        GoalsStore value;
        GoalCompletionStep goalCompletionStep;
        GoalsStore goalsStoreWithCompletion;
        BLG<GoalsStore> blg = this._store;
        do {
            value = blg.getValue();
            GoalsStore goalsStore = value;
            goalCompletionStep = new GoalCompletionStep(str, z, set, goalsStore.listOrder.contains(str), goalsStore.trackingOrder.contains(str));
            goalsStoreWithCompletion = HatchGoalsTabDataSourceKt.withCompletion(goalsStore, set, str, z);
            if (z) {
                C0943AIw c0943AIwA5T = (C0943AIw) goalsStoreWithCompletion.sessionCompleted;
                C7384Etj.A0Y(set, 0);
                if (!set.isEmpty()) {
                    C0944AIx c0944AIx = new C0944AIx(c0943AIwA5T);
                    c0944AIx.addAll(set);
                    c0943AIwA5T = c0944AIx.A5T();
                }
                goalsStoreWithCompletion = GoalsStore.copy$default(goalsStoreWithCompletion, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, c0943AIwA5T, null, 393215, null);
            }
        } while (!blg.A6e(value, goalsStoreWithCompletion));
        emitGoalCoreUpdatesFor(goalCompletionStep.statusChangeIds, goalsStoreWithCompletion);
        return goalCompletionStep;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelPendingOrderSyncs() {
        synchronized (this.orderSyncLock) {
            Iterator<HoC> it = this.orderSyncJobs.values().iterator();
            while (it.hasNext()) {
                it.next().A5w(null);
            }
            this.orderSyncJobs.clear();
        }
    }

    private final void clearInFlightToggle(String str) {
        InterfaceC0962AJp<String, GoalToggleState> value;
        synchronized (this.toggleLock) {
            BLG<InterfaceC0962AJp<String, GoalToggleState>> blg = this._inFlightToggles;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, value.AaZ(str)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GoalSource completedGoalsSource() {
        if (HatchUtil.INSTANCE.isGoalsTrackingSectionEnabled()) {
            return null;
        }
        return GoalSource.USER_GOAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1 A[Catch: Exception -> 0x011a, CancellationException -> 0x0129, TryCatch #0 {Exception -> 0x011a, blocks: (B:27:0x00d8, B:30:0x00dd, B:32:0x00e1, B:34:0x00e7, B:35:0x00f5, B:37:0x00fb, B:38:0x0109, B:42:0x0112), top: B:51:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7 A[Catch: Exception -> 0x011a, CancellationException -> 0x0129, TryCatch #0 {Exception -> 0x011a, blocks: (B:27:0x00d8, B:30:0x00dd, B:32:0x00e1, B:34:0x00e7, B:35:0x00f5, B:37:0x00fb, B:38:0x0109, B:42:0x0112), top: B:51:0x00d8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchGoalsPage(com.facebook.aura.library.repo.GoalSource r23, com.facebook.aura.library.repo.GoalStatus r24, java.lang.String r25, X.HtJ<? super com.facebook.aura.library.repo.GoalsPage> r26) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSource.fetchGoalsPage(com.facebook.aura.library.repo.GoalSource, com.facebook.aura.library.repo.GoalStatus, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r1.size() >= r11) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008d -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchGoalsThroughCount(com.facebook.aura.library.repo.GoalSource r10, int r11, X.HtJ<? super com.facebook.aura.library.repo.GoalsPage> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.facebook.aura.library.repo.HatchGoalsTabDataSource.C122781
            if (r0 == 0) goto L90
            r7 = r12
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$fetchGoalsThroughCount$1 r7 = (com.facebook.aura.library.repo.HatchGoalsTabDataSource.C122781) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L90
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r5 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L65
            if (r0 != r4) goto L9d
            int r11 = r7.I$0
            java.lang.Object r2 = r7.L$2
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r1 = r7.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r10 = r7.L$0
            com.facebook.aura.library.repo.GoalSource r10 = (com.facebook.aura.library.repo.GoalSource) r10
            X.Hwg.A00(r5)
        L2f:
            com.facebook.aura.library.repo.GoalsPage r5 = (com.facebook.aura.library.repo.GoalsPage) r5
            if (r5 != 0) goto L34
            return r3
        L34:
            java.util.List<com.facebook.aura.library.repo.Goal> r0 = r5.goals
            r1.addAll(r0)
            java.lang.String r6 = r5.nextCursor
            boolean r5 = r5.hasNextPage
            if (r5 == 0) goto L45
            int r0 = r1.size()
            if (r0 < r11) goto L72
        L45:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r1.iterator()
        L52:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.library.repo.Goal r0 = (com.facebook.aura.library.repo.Goal) r0
            java.lang.String r0 = r0.id
            X.AnonymousClass006.A1P(r0, r1, r4, r3)
            goto L52
        L65:
            X.Hwg.A00(r5)
            java.util.ArrayList r1 = X.C3cG.A0h()
            java.util.LinkedHashSet r2 = X.C3cG.A0k()
            r5 = 0
            r6 = r3
        L72:
            boolean r0 = r2.add(r6)
            if (r0 != 0) goto L79
            return r3
        L79:
            com.facebook.aura.library.repo.GoalStatus r0 = com.facebook.aura.library.repo.GoalStatus.ACTIVE
            r7.L$0 = r10
            r7.L$1 = r1
            r7.L$2 = r2
            r7.L$3 = r3
            r7.I$0 = r11
            r7.I$1 = r5
            r7.label = r4
            java.lang.Object r5 = r9.fetchGoalsPage(r10, r0, r6, r7)
            if (r5 != r8) goto L2f
            return r8
        L90:
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$fetchGoalsThroughCount$1 r7 = new com.facebook.aura.library.repo.HatchGoalsTabDataSource$fetchGoalsThroughCount$1
            r7.<init>(r12)
            goto L12
        L97:
            com.facebook.aura.library.repo.GoalsPage r0 = new com.facebook.aura.library.repo.GoalsPage
            r0.<init>(r3, r6, r5)
            return r0
        L9d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSource.fetchGoalsThroughCount(com.facebook.aura.library.repo.GoalSource, int, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadGoals(HtJ<? super Unit> htJ) {
        GoalsStore value;
        if (C3cI.A0C(this).listLoadingState == LoadingState.INITIAL) {
            BLG<GoalsStore> blg = this._store;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, GoalsStore.copy$default(value, null, null, null, null, LoadingState.LOADING, null, null, false, false, null, false, false, null, null, null, false, false, null, null, 524271, null)));
        }
        return C3cJ.A0D(htJ, AnonymousClass001.A0y(), new C122813(HatchNavQueryTrace.Companion.begin(this.navTtrcCoordinator, HatchNavTTRCSpec.Surface.GOALS, HatchNavTTRCSpec.Queries.GOALS_DATA, HatchNavTTRCSpec.Points.GOALS_FETCH_START, HatchNavTTRCSpec.Points.GOALS_FETCH_END, HatchNavTTRCSpec.FailedSource.GOALS, true), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadUserProfile(HtJ<? super Unit> htJ) {
        BLG<UserProfileState> blg = this._userProfileState;
        UserProfileState value = blg.getValue();
        LoadingState loadingState = LoadingState.LOADING;
        UserProfile userProfile = value.profile;
        C7384Etj.A0Y(userProfile, 0);
        C9286GCn.A00(null, new UserProfileState(userProfile, loadingState), (C9286GCn) blg);
        return C3cJ.A0D(htJ, AnonymousClass001.A0y(), new C122862(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object patchFixedPosition(java.lang.String r28, long r29, X.HtJ<? super java.lang.Boolean> r31) {
        /*
            r27 = this;
            r4 = r28
            r0 = r29
            r6 = r31
            boolean r2 = r6 instanceof com.facebook.aura.library.repo.HatchGoalsTabDataSource.C122881
            r7 = r27
            if (r2 == 0) goto Lc6
            r8 = r6
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$patchFixedPosition$1 r8 = (com.facebook.aura.library.repo.HatchGoalsTabDataSource.C122881) r8
            int r5 = r8.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r5 & r3
            if (r2 == 0) goto Lc6
            int r5 = r5 - r3
            r8.label = r5
        L1a:
            java.lang.Object r6 = r8.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r8.label
            r5 = 1
            if (r2 == 0) goto La4
            if (r2 != r5) goto Lcd
            long r0 = r8.J$0
            java.lang.Object r4 = r8.L$0
            X.Hwg.A00(r6)
        L2c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r3 = r6
            boolean r2 = r6.booleanValue()
            if (r2 == 0) goto La3
            X.BLG<com.facebook.aura.library.repo.GoalsStore> r6 = r7._store
        L37:
            java.lang.Object r5 = r6.getValue()
            r10 = r5
            com.facebook.aura.library.repo.GoalsStore r10 = (com.facebook.aura.library.repo.GoalsStore) r10
            com.facebook.aura.library.repo.GoalNode r7 = X.C3cI.A0B(r10, r4)
            if (r7 == 0) goto L9d
            X.AJp<java.lang.String, com.facebook.aura.library.repo.GoalNode> r9 = r10.goalsById
            com.facebook.aura.library.repo.Goal r2 = r7.goal
            java.lang.Long r23 = X.C3cG.A0S(r0)
            r28 = 63487(0xf7ff, float:8.8964E-41)
            r12 = 0
            r11 = r2
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r12
            r24 = r12
            r25 = r12
            r26 = r12
            r27 = r12
            r29 = r12
            com.facebook.aura.library.repo.Goal r8 = com.facebook.aura.library.repo.Goal.copy$default(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.AHH<java.lang.String> r7 = r7.childIds
            X.AnonymousClass003.A0u(r8, r7)
            com.facebook.aura.library.repo.GoalNode r2 = new com.facebook.aura.library.repo.GoalNode
            r2.<init>(r8, r7)
            X.AJp r11 = r9.AYj(r4, r2)
            X.AJp<java.lang.String, java.lang.Long> r2 = r10.pendingPins
            X.AJp r29 = r2.AaZ(r4)
            r30 = 262142(0x3fffe, float:3.67339E-40)
            r18 = 0
            r19 = r18
            r21 = r18
            r22 = r18
            r23 = r12
            r26 = r18
            r27 = r18
            r28 = r12
            r31 = r12
            com.facebook.aura.library.repo.GoalsStore r10 = com.facebook.aura.library.repo.GoalsStore.copy$default(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L9d:
            boolean r2 = r6.A6e(r5, r10)
            if (r2 == 0) goto L37
        La3:
            return r3
        La4:
            X.Hwg.A00(r6)
            java.lang.Long r2 = X.C3cG.A0S(r0)
            kotlinx.serialization.json.JsonPrimitive r14 = X.C9oY.A06(r2)
            r10 = 0
            com.facebook.aura.library.repo.GoalUpdateRequestJson r9 = new com.facebook.aura.library.repo.GoalUpdateRequestJson
            r11 = r10
            r12 = r10
            r13 = r10
            r15 = r10
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r8.L$0 = r4
            r8.J$0 = r0
            r8.label = r5
            java.lang.Object r6 = r7.patchGoal(r4, r9, r8)
            if (r6 != r3) goto L2c
            return r3
        Lc6:
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$patchFixedPosition$1 r8 = new com.facebook.aura.library.repo.HatchGoalsTabDataSource$patchFixedPosition$1
            r8.<init>(r6)
            goto L1a
        Lcd:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSource.patchFixedPosition(java.lang.String, long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object patchGoalStatus(java.lang.String r27, boolean r28, X.HtJ<? super com.facebook.aura.library.repo.GoalCompletionOutcome> r29) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSource.patchGoalStatus(java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    private final boolean promoteQueuedToggle(String str) {
        AHH ahhAam;
        boolean z;
        InterfaceC0962AJp<String, GoalToggleState> value;
        GoalToggleIntent goalToggleIntent;
        InterfaceC0962AJp<String, GoalToggleState> value2;
        Goal goal;
        synchronized (this.toggleLock) {
            GoalsStore goalsStoreA0C = C3cI.A0C(this);
            GoalToggleState goalToggleState = this._inFlightToggles.getValue().get(str);
            if (goalToggleState == null || (ahhAam = goalToggleState.queued) == null) {
                ahhAam = AHI.A01;
            }
            do {
                z = false;
                if (ahhAam.isEmpty()) {
                    BLG<InterfaceC0962AJp<String, GoalToggleState>> blg = this._inFlightToggles;
                    do {
                        value = blg.getValue();
                    } while (!blg.A6e(value, value.AaZ(str)));
                } else {
                    goalToggleIntent = (GoalToggleIntent) AbstractC0878AGe.A0F(ahhAam);
                    ahhAam = ahhAam.Aam(0);
                    GoalNode goalNodeA0P = C3cH.A0P(goalToggleIntent.goalId, goalsStoreA0C.goalsById);
                    if (goalNodeA0P == null || (goal = goalNodeA0P.goal) == null) {
                        break;
                    }
                }
            } while (goal.isCompleted() == goalToggleIntent.completed);
            GoalCompletionStep goalCompletionStepApplyOptimistic = applyOptimistic(goalToggleIntent.goalId, goalToggleIntent.completed, HatchGoalsTabDataSourceKt.completionStatusChangeIds(goalsStoreA0C, goalToggleIntent.goalId, goalToggleIntent.completed));
            BLG<InterfaceC0962AJp<String, GoalToggleState>> blg2 = this._inFlightToggles;
            do {
                value2 = blg2.getValue();
            } while (!blg2.A6e(value2, value2.AYj(str, new GoalToggleState(goalCompletionStepApplyOptimistic, ahhAam))));
            z = true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0053 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pushFixedPositions(java.util.Map<java.lang.String, java.lang.Long> r13, X.HtJ<? super kotlin.Unit> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.facebook.aura.library.repo.HatchGoalsTabDataSource.C122941
            if (r0 == 0) goto Lab
            r6 = r14
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$pushFixedPositions$1 r6 = (com.facebook.aura.library.repo.HatchGoalsTabDataSource.C122941) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lab
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r0 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r4 = 1
            if (r1 == 0) goto L56
            if (r1 != r4) goto Lb2
            int r8 = r6.I$0
            java.lang.Object r7 = r6.L$3
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r3 = r6.L$2
            java.util.Map r3 = (java.util.Map) r3
            X.Hwg.A00(r0)
        L2a:
            int r0 = X.AnonymousClass001.A0F(r0)
            int r8 = r8 + r0
        L2f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lb7
            java.lang.Object r2 = r7.next()
            java.util.List r2 = (java.util.List) r2
            r1 = 0
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$pushFixedPositions$failed$1$1 r0 = new com.facebook.aura.library.repo.HatchGoalsTabDataSource$pushFixedPositions$failed$1$1
            r0.<init>(r2, r12, r1)
            r6.L$0 = r1
            r6.L$1 = r1
            r6.L$2 = r3
            r6.L$3 = r7
            r6.L$4 = r1
            r6.I$0 = r8
            r6.label = r4
            java.lang.Object r0 = X.Hxb.A00(r0, r6)
            if (r0 != r5) goto L2a
            return r5
        L56:
            X.Hwg.A00(r0)
            com.facebook.aura.library.repo.GoalsStore r10 = X.C3cI.A0C(r12)
            java.util.LinkedHashMap r3 = X.C3cG.A0j()
            java.util.Iterator r11 = X.AnonymousClass002.A0n(r13)
        L65:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L96
            java.util.Map$Entry r9 = X.C3cH.A0l(r11)
            java.lang.Object r1 = r9.getKey()
            java.lang.Object r0 = r9.getValue()
            long r7 = X.C3cG.A05(r0)
            com.facebook.aura.library.repo.GoalNode r0 = X.C3cI.A0B(r10, r1)
            if (r0 == 0) goto L92
            com.facebook.aura.library.repo.Goal r0 = r0.goal
            if (r0 == 0) goto L92
            java.lang.Long r0 = r0.fixedPosition
            if (r0 == 0) goto L92
            long r1 = r0.longValue()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L92
            goto L65
        L92:
            X.AnonymousClass006.A1R(r3, r9)
            goto L65
        L96:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Ld1
            java.util.Set r1 = r3.entrySet()
            r0 = 4
            java.util.ArrayList r0 = X.AbstractC0878AGe.A0N(r1, r0)
            java.util.Iterator r7 = r0.iterator()
            r8 = 0
            goto L2f
        Lab:
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$pushFixedPositions$1 r6 = new com.facebook.aura.library.repo.HatchGoalsTabDataSource$pushFixedPositions$1
            r6.<init>(r14)
            goto L12
        Lb2:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lb7:
            if (r8 <= 0) goto Ld1
            int r4 = r3.size()
            int r4 = r4 - r8
            int r3 = r3.size()
            java.lang.String r2 = "Pinned only "
            java.lang.String r1 = " of "
            java.lang.String r0 = " goal positions"
            java.lang.String r1 = X.FGI.A0Y(r2, r1, r0, r4, r3)
            java.lang.String r0 = "HatchGoalsTabDataSource"
            X.CFK.A04(r0, r1)
        Ld1:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSource.pushFixedPositions(java.util.Map, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reconcileGoalCollections(java.lang.String r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.library.repo.HatchGoalsTabDataSource.C122951
            if (r0 == 0) goto L4c
            r5 = r8
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$reconcileGoalCollections$1 r5 = (com.facebook.aura.library.repo.HatchGoalsTabDataSource.C122951) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L26
            if (r0 == r2) goto L3a
            if (r0 != r3) goto L52
            X.Hwg.A00(r1)
        L23:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L26:
            X.Hwg.A00(r1)
            r1 = 0
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$reconcileGoalCollections$2 r0 = new com.facebook.aura.library.repo.HatchGoalsTabDataSource$reconcileGoalCollections$2
            r0.<init>(r1)
            r5.L$0 = r7
            r5.label = r2
            java.lang.Object r0 = X.Hxb.A00(r0, r5)
            if (r0 != r4) goto L40
            return r4
        L3a:
            java.lang.Object r0 = r5.L$0
            java.lang.String r7 = X.C3cG.A0d(r0, r1)
        L40:
            r0 = 0
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r0 = r6.loadGoalDetail(r7, r5)
            if (r0 != r4) goto L23
            return r4
        L4c:
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$reconcileGoalCollections$1 r5 = new com.facebook.aura.library.repo.HatchGoalsTabDataSource$reconcileGoalCollections$1
            r5.<init>(r8)
            goto L12
        L52:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSource.reconcileGoalCollections(java.lang.String, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object recordGoalEngagement$default(HatchGoalsTabDataSource hatchGoalsTabDataSource, String str, HatchEngagementEventType hatchEngagementEventType, String str2, Double d, JsonObject jsonObject, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            d = null;
        }
        if ((i & 16) != 0) {
            jsonObject = null;
        }
        return hatchGoalsTabDataSource.recordGoalEngagement(str, hatchEngagementEventType, str2, d, jsonObject, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rollBackGoalText(String str, Goal goal, Goal goal2) {
        GoalsStore value;
        GoalsStore goalsStoreWithGoalText;
        boolean z;
        Goal goal3;
        if (goal == null || goal2 == null) {
            return;
        }
        BLG<GoalsStore> blg = this._store;
        do {
            value = blg.getValue();
            goalsStoreWithGoalText = value;
            GoalNode goalNodeA0B = C3cI.A0B(goalsStoreWithGoalText, str);
            if (goalNodeA0B == null || (goal3 = goalNodeA0B.goal) == null || !C7384Etj.areEqual(goal3.title, goal.title) || !C7384Etj.areEqual(goal3.description, goal.description)) {
                z = false;
            } else {
                z = true;
                goalsStoreWithGoalText = HatchGoalsTabDataSourceKt.withGoalText(goalsStoreWithGoalText, str, goal2.title, goal2.description);
            }
        } while (!blg.A6e(value, goalsStoreWithGoalText));
        if (z) {
            emitGoalCoreUpdatesFor(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rollBackNesting(String str, String str2, String str3) {
        GoalsLocalOrder value;
        InterfaceC0962AJp<String, String> interfaceC0962AJpAaZ;
        InterfaceC0962AJp<String, GoalListSection> interfaceC0962AJp;
        GoalsStore value2;
        BLG<GoalsLocalOrder> blg = this._localOrder;
        do {
            value = blg.getValue();
            GoalsLocalOrder goalsLocalOrder = value;
            interfaceC0962AJpAaZ = goalsLocalOrder.nested.AaZ(str);
            interfaceC0962AJp = goalsLocalOrder.promoted;
            AnonymousClass003.A0u(interfaceC0962AJp, interfaceC0962AJpAaZ);
        } while (!blg.A6e(value, new GoalsLocalOrder(interfaceC0962AJp, interfaceC0962AJpAaZ)));
        BLG<GoalsStore> blg2 = this._store;
        do {
            value2 = blg2.getValue();
        } while (!blg2.A6e(value2, HatchGoalsTabDataSourceKt.withoutPendingPin(withLocalOrder(HatchGoalsTabDataSourceKt.withParentLink(value2, str, str3)), str)));
        emitGoalCoreUpdatesFor(str, str2);
        AnonymousClass001.A1J(new C123003(str, null), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rollBackPromotion(String str, String str2) {
        GoalsLocalOrder value;
        InterfaceC0962AJp<String, GoalListSection> interfaceC0962AJpAaZ;
        InterfaceC0962AJp<String, String> interfaceC0962AJp;
        GoalsStore value2;
        BLG<GoalsLocalOrder> blg = this._localOrder;
        do {
            value = blg.getValue();
            GoalsLocalOrder goalsLocalOrder = value;
            interfaceC0962AJpAaZ = goalsLocalOrder.promoted.AaZ(str);
            interfaceC0962AJp = goalsLocalOrder.nested;
            AnonymousClass003.A0u(interfaceC0962AJpAaZ, interfaceC0962AJp);
        } while (!blg.A6e(value, new GoalsLocalOrder(interfaceC0962AJpAaZ, interfaceC0962AJp)));
        BLG<GoalsStore> blg2 = this._store;
        do {
            value2 = blg2.getValue();
        } while (!blg2.A6e(value2, HatchGoalsTabDataSourceKt.withoutPendingPin(withLocalOrder(HatchGoalsTabDataSourceKt.withParentLink(value2, str, str2)), str)));
        AnonymousClass001.A1J(new C123013(str, null), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runCompletionStep(com.facebook.aura.library.repo.GoalCompletionStep r7, X.HtJ<? super com.facebook.aura.library.repo.GoalCompletionOutcome> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.library.repo.HatchGoalsTabDataSource.C123021
            if (r0 == 0) goto L63
            r5 = r8
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$runCompletionStep$1 r5 = (com.facebook.aura.library.repo.HatchGoalsTabDataSource.C123021) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L3c
            if (r0 != r3) goto L94
            X.Hwg.A00(r1)
        L20:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r1.iterator()
        L2a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r1 = r2.next()
            com.facebook.aura.library.repo.GoalCompletionOutcome r0 = com.facebook.aura.library.repo.GoalCompletionOutcome.SUCCESS
            if (r1 == r0) goto L2a
            r3.add(r1)
            goto L2a
        L3c:
            X.Hwg.A00(r1)
            boolean r0 = r7.completed
            if (r0 == 0) goto L5c
            java.lang.String r0 = r7.goalId
            java.util.List r2 = java.util.Collections.singletonList(r0)
        L49:
            r1 = 0
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$runCompletionStep$outcomes$1 r0 = new com.facebook.aura.library.repo.HatchGoalsTabDataSource$runCompletionStep$outcomes$1
            r0.<init>(r2, r6, r7, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.label = r3
            java.lang.Object r1 = X.Hxb.A00(r0, r5)
            if (r1 != r4) goto L20
            return r4
        L5c:
            java.util.Set<java.lang.String> r0 = r7.statusChangeIds
            java.util.List r2 = X.AbstractC0878AGe.A0X(r0)
            goto L49
        L63:
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$runCompletionStep$1 r5 = new com.facebook.aura.library.repo.HatchGoalsTabDataSource$runCompletionStep$1
            r5.<init>(r8)
            goto L12
        L69:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L72
            com.facebook.aura.library.repo.GoalCompletionOutcome r4 = com.facebook.aura.library.repo.GoalCompletionOutcome.SUCCESS
            return r4
        L72:
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L7f
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7f
        L7c:
            com.facebook.aura.library.repo.GoalCompletionOutcome r4 = com.facebook.aura.library.repo.GoalCompletionOutcome.LIFECYCLE_CONFLICT
            return r4
        L7f:
            java.util.Iterator r2 = r3.iterator()
        L83:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r1 = r2.next()
            com.facebook.aura.library.repo.GoalCompletionOutcome r0 = com.facebook.aura.library.repo.GoalCompletionOutcome.LIFECYCLE_CONFLICT
            if (r1 == r0) goto L83
            com.facebook.aura.library.repo.GoalCompletionOutcome r4 = com.facebook.aura.library.repo.GoalCompletionOutcome.FAILURE
            return r4
        L94:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSource.runCompletionStep(com.facebook.aura.library.repo.GoalCompletionStep, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[PHI: r11
  0x0039: PHI (r11v5 java.lang.String) = (r11v0 java.lang.String), (r11v6 java.lang.String) binds: [B:16:0x0036, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007f -> B:12:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0092 -> B:12:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runInFlightCompletion(java.lang.String r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.facebook.aura.library.repo.HatchGoalsTabDataSource.C123031
            if (r0 == 0) goto L95
            r6 = r12
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$runInFlightCompletion$1 r6 = (com.facebook.aura.library.repo.HatchGoalsTabDataSource.C123031) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L95
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L36
            if (r0 == r4) goto L2d
            if (r0 != r5) goto L9c
            boolean r2 = r6.Z$0
            java.lang.Object r0 = r6.L$0
            java.lang.String r11 = X.C3cG.A0d(r0, r1)
        L28:
            if (r2 != 0) goto L39
        L2a:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L2d:
            java.lang.Object r9 = r6.L$1
            com.facebook.aura.library.repo.GoalCompletionStep r9 = (com.facebook.aura.library.repo.GoalCompletionStep) r9
            java.lang.Object r11 = r6.L$0
            java.lang.String r11 = (java.lang.String) r11
            goto L5d
        L36:
            X.Hwg.A00(r1)
        L39:
            X.BLG<X.AJp<java.lang.String, com.facebook.aura.library.repo.GoalToggleState>> r0 = r10._inFlightToggles
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r11)
            com.facebook.aura.library.repo.GoalToggleState r0 = (com.facebook.aura.library.repo.GoalToggleState) r0
            if (r0 == 0) goto L2a
            com.facebook.aura.library.repo.GoalCompletionStep r9 = r0.inFlight
            if (r9 == 0) goto L2a
            r6.L$0 = r11     // Catch: java.lang.Exception -> L63 java.util.concurrent.CancellationException -> La2
            r6.L$1 = r9     // Catch: java.lang.Exception -> L63 java.util.concurrent.CancellationException -> La2
            r0 = 0
            r6.L$2 = r0     // Catch: java.lang.Exception -> L63 java.util.concurrent.CancellationException -> La2
            r6.label = r4     // Catch: java.lang.Exception -> L63 java.util.concurrent.CancellationException -> La2
            java.lang.Object r1 = r10.runCompletionStep(r9, r6)     // Catch: java.lang.Exception -> L63 java.util.concurrent.CancellationException -> La2
            if (r1 != r7) goto L60
            goto La1
        L5d:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L63 java.util.concurrent.CancellationException -> La2
        L60:
            com.facebook.aura.library.repo.GoalCompletionOutcome r1 = (com.facebook.aura.library.repo.GoalCompletionOutcome) r1     // Catch: java.lang.Exception -> L63 java.util.concurrent.CancellationException -> La2
            goto L79
        L63:
            r8 = move-exception
            java.lang.String r3 = r9.goalId
            java.lang.String r2 = r8.getMessage()
            java.lang.String r1 = "Goal completion failed for "
            java.lang.String r0 = ": "
            java.lang.String r1 = X.FGI.A0d(r1, r3, r0, r2)
            java.lang.String r0 = "HatchGoalsTabDataSource"
            X.CFK.A08(r0, r1, r8)
            com.facebook.aura.library.repo.GoalCompletionOutcome r1 = com.facebook.aura.library.repo.GoalCompletionOutcome.FAILURE
        L79:
            boolean r2 = r10.promoteQueuedToggle(r11)
            com.facebook.aura.library.repo.GoalCompletionOutcome r0 = com.facebook.aura.library.repo.GoalCompletionOutcome.SUCCESS
            if (r1 == r0) goto L28
            java.lang.String r1 = r9.goalId
            r6.L$0 = r11
            r0 = 0
            r6.L$1 = r0
            r6.L$2 = r0
            r6.Z$0 = r2
            r6.label = r5
            java.lang.Object r0 = r10.reconcileGoalCollections(r1, r6)
            if (r0 != r7) goto L28
            return r7
        L95:
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$runInFlightCompletion$1 r6 = new com.facebook.aura.library.repo.HatchGoalsTabDataSource$runInFlightCompletion$1
            r6.<init>(r12)
            goto L12
        L9c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        La1:
            return r7
        La2:
            r0 = move-exception
            r10.clearInFlightToggle(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSource.runInFlightCompletion(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleOrderSync(String str, G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        synchronized (this.orderSyncLock) {
            HoC hoCRemove = this.orderSyncJobs.remove(str);
            if (hoCRemove != null) {
                hoCRemove.A5w(null);
            }
            this.orderSyncJobs.put(str, AnonymousClass001.A11(new HatchGoalsTabDataSource$scheduleOrderSync$1$1(g0u, this, str, null), this.scope));
        }
    }

    private final void subscribeToGoalTaskStatusEvents() {
        HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(this.userSession);
        AnonymousClass001.A1J(new C123071(gateway, this, null), this.scope);
    }

    private final void subscribeToGoalUpdatedEvents() {
        HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(this.userSession);
        AnonymousClass001.A1J(new C123081(gateway, this, null), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GoalsStore withActiveCompletionSteps(GoalsStore goalsStore) {
        ArrayList<GoalCompletionStep> arrayListA0i;
        GoalsStore goalsStoreCopy$default = goalsStore;
        synchronized (this.toggleLock) {
            Collection<GoalToggleState> collectionValues = this._inFlightToggles.getValue().values();
            arrayListA0i = AnonymousClass003.A0i(collectionValues);
            Iterator<GoalToggleState> it = collectionValues.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(it.next().inFlight);
            }
        }
        for (GoalCompletionStep goalCompletionStep : arrayListA0i) {
            GoalsStore goalsStoreWithCompletion = HatchGoalsTabDataSourceKt.withCompletion(goalsStoreCopy$default, goalCompletionStep.statusChangeIds, goalCompletionStep.goalId, goalCompletionStep.completed);
            goalsStoreCopy$default = GoalsStore.copy$default(goalsStoreWithCompletion, null, (!goalCompletionStep.wasInListOrder || goalsStoreWithCompletion.listOrder.contains(goalCompletionStep.goalId)) ? goalsStoreWithCompletion.listOrder : goalsStoreWithCompletion.listOrder.A34(goalCompletionStep.goalId), (!goalCompletionStep.wasInTrackingOrder || goalsStoreWithCompletion.trackingOrder.contains(goalCompletionStep.goalId)) ? goalsStoreWithCompletion.trackingOrder : goalsStoreWithCompletion.trackingOrder.A34(goalCompletionStep.goalId), null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, null, 524281, null);
        }
        return goalsStoreCopy$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GoalsStore withLocalOrder(GoalsStore goalsStore) {
        return HatchGoalsTabDataSourceKt.applyLocalOrder(goalsStore, this._localOrder.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        C0953AJg c0953AJgA00;
        synchronized (this.toggleLock) {
            BLG<InterfaceC0962AJp<String, GoalToggleState>> blg = this._inFlightToggles;
            c0953AJgA00 = C0953AJg.A00();
            blg.Af8(c0953AJgA00);
        }
        synchronized (this.orderSyncLock) {
            this.orderSyncJobs.clear();
        }
        boolean z = false;
        AnonymousClass001.A1E(this._store, null, new GoalsStore(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 524287, 0 == true ? 1 : 0));
        AnonymousClass001.A1E(this._localOrder, null, new GoalsLocalOrder(c0953AJgA00, c0953AJgA00));
        AnonymousClass001.A1E(this._userProfileState, null, new UserProfileState(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        Hxb.A03(null, this.scope);
        this.navTtrcCoordinator.clearObservedQuery(HatchNavTTRCSpec.Surface.GOALS, HatchNavTTRCSpec.Queries.GOALS_DATA);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* renamed from: fetchGoalDetail-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1141fetchGoalDetailgIAlus(java.lang.String r7, X.HtJ<? super X.HsJ<com.facebook.aura.library.repo.GoalDetail>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.library.repo.HatchGoalsTabDataSource$fetchGoalDetail$1
            if (r0 == 0) goto L3a
            r5 = r8
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$fetchGoalDetail$1 r5 = (com.facebook.aura.library.repo.HatchGoalsTabDataSource$fetchGoalDetail$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L40
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$fetchGoalDetail$2 r0 = new com.facebook.aura.library.repo.HatchGoalsTabDataSource$fetchGoalDetail$2
            r0.<init>(r7, r6, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3a:
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$fetchGoalDetail$1 r5 = new com.facebook.aura.library.repo.HatchGoalsTabDataSource$fetchGoalDetail$1
            r5.<init>(r6, r8)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSource.m1141fetchGoalDetailgIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final C1BN<GoalsState> getCompletedState() {
        return this.completedState;
    }

    public final C22I<Goal> getGoalCoreUpdates() {
        return this.goalCoreUpdates;
    }

    public final C1BN<GoalsState> getGoalsState() {
        return this.goalsState;
    }

    public final C1BN<AHG<String>> getPendingCompletionIds() {
        return this.pendingCompletionIds;
    }

    public final C1BN<Boolean> getShowGoalsFirst() {
        return this.showGoalsFirst;
    }

    public final C1BN<Boolean> getShowSubtitles() {
        return this.showSubtitles;
    }

    public final C1BN<GoalsState> getTrackingState() {
        return this.trackingState;
    }

    public final C1BN<UserProfileState> getUserProfileState() {
        return this.userProfileState;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(X.HtJ<? super kotlin.Unit> r29) {
        /*
            r28 = this;
            r3 = r29
            boolean r0 = r3 instanceof com.facebook.aura.library.repo.HatchGoalsTabDataSource.C122791
            r6 = r28
            if (r0 == 0) goto L8e
            r5 = r3
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$load$1 r5 = (com.facebook.aura.library.repo.HatchGoalsTabDataSource.C122791) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8e
            int r2 = r2 - r1
            r5.label = r2
        L16:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 2
            r7 = 1
            if (r0 == 0) goto L2a
            if (r0 == r7) goto L7f
            if (r0 != r3) goto L94
            X.Hwg.A00(r1)
        L27:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L2a:
            X.Hwg.A00(r1)
            com.facebook.aura.library.repo.GoalsStore r0 = X.C3cI.A0C(r6)
            com.facebook.aura.library.repo.LoadingState r1 = r0.listLoadingState
            com.facebook.aura.library.repo.LoadingState r0 = com.facebook.aura.library.repo.LoadingState.INITIAL
            if (r1 == r0) goto L73
            com.facebook.aura.library.repo.LoadingState r0 = com.facebook.aura.library.repo.LoadingState.LOADING
            if (r1 == r0) goto L73
            X.BLG<com.facebook.aura.library.repo.GoalsStore> r2 = r6._store
        L3d:
            java.lang.Object r1 = r2.getValue()
            r8 = r1
            com.facebook.aura.library.repo.GoalsStore r8 = (com.facebook.aura.library.repo.GoalsStore) r8
            com.facebook.aura.library.repo.LoadingState r13 = com.facebook.aura.library.repo.LoadingState.REFRESH_SILENTLY
            r28 = 524271(0x7ffef, float:7.3466E-40)
            r9 = 0
            r16 = 0
            r10 = r9
            r11 = r9
            r12 = r9
            r14 = r9
            r15 = r9
            r17 = r16
            r18 = r9
            r19 = r16
            r20 = r16
            r21 = r9
            r22 = r9
            r23 = r9
            r24 = r16
            r25 = r16
            r26 = r9
            r27 = r9
            r29 = r9
            com.facebook.aura.library.repo.GoalsStore r0 = com.facebook.aura.library.repo.GoalsStore.copy$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L3d
        L73:
            r0 = 0
            r5.L$0 = r0
            r5.label = r7
            java.lang.Object r0 = r6.loadUserProfile(r5)
            if (r0 != r4) goto L82
            return r4
        L7f:
            X.Hwg.A00(r1)
        L82:
            r0 = 0
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r0 = r6.loadGoals(r5)
            if (r0 != r4) goto L27
            return r4
        L8e:
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$load$1 r5 = new com.facebook.aura.library.repo.HatchGoalsTabDataSource$load$1
            r5.<init>(r3)
            goto L16
        L94:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSource.load(X.HtJ):java.lang.Object");
    }

    public final Object loadCompleted(HtJ<? super Unit> htJ) {
        GoalsStore value;
        GoalsStore goalsStore;
        BLG<GoalsStore> blg = this._store;
        do {
            value = blg.getValue();
            goalsStore = value;
        } while (!blg.A6e(value, GoalsStore.copy$default(goalsStore, null, null, null, null, null, null, null, false, false, null, false, false, null, goalsStore.completedLoadingState == LoadingState.INITIAL ? LoadingState.LOADING : LoadingState.REFRESH_SILENTLY, null, false, false, null, null, 516095, null)));
        return C3cJ.A0D(htJ, AnonymousClass001.A0y(), new AnonymousClass3(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadGoalDetail(java.lang.String r6, X.HtJ<? super com.facebook.aura.library.repo.GoalDetail> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.library.repo.HatchGoalsTabDataSource.C122801
            if (r0 == 0) goto L36
            r4 = r7
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadGoalDetail$1 r4 = (com.facebook.aura.library.repo.HatchGoalsTabDataSource.C122801) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L36
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L3c
            java.lang.Object r1 = X.AnonymousClass001.A0q(r3)
        L21:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L26
            r1 = 0
        L26:
            return r1
        L27:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.label = r1
            java.lang.Object r1 = r5.m1141fetchGoalDetailgIAlus(r6, r4)
            if (r1 != r2) goto L21
            return r2
        L36:
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadGoalDetail$1 r4 = new com.facebook.aura.library.repo.HatchGoalsTabDataSource$loadGoalDetail$1
            r4.<init>(r7)
            goto L12
        L3c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSource.loadGoalDetail(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final Object loadMoreCompleted(HtJ<? super Unit> htJ) {
        GoalsStore value;
        GoalsStore goalsStore;
        BLG<GoalsStore> blg = this._store;
        do {
            value = blg.getValue();
            goalsStore = value;
        } while (!blg.A6e(value, HatchGoalsTabDataSourceKt.canLoadMoreCompleted(goalsStore) ? GoalsStore.copy$default(goalsStore, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, true, null, null, 458751, null) : goalsStore));
        if (HatchGoalsTabDataSourceKt.canLoadMoreCompleted(goalsStore)) {
            Object objA00 = GAo.A00(htJ, AnonymousClass001.A0y(), new C122822(goalsStore.completedNextCursor, null));
            if (objA00 == EnumC10460Hji.A02) {
                return objA00;
            }
        }
        return Unit.INSTANCE;
    }

    public final Object loadMoreGoals(HtJ<? super Unit> htJ) {
        GoalsStore value;
        GoalsStore goalsStore;
        BLG<GoalsStore> blg = this._store;
        do {
            value = blg.getValue();
            goalsStore = value;
        } while (!blg.A6e(value, HatchGoalsTabDataSourceKt.canLoadMoreList(goalsStore) ? GoalsStore.copy$default(goalsStore, null, null, null, null, null, null, null, false, true, null, false, false, null, null, null, false, false, null, null, 524031, null) : goalsStore));
        if (HatchGoalsTabDataSourceKt.canLoadMoreList(goalsStore)) {
            Object objA00 = GAo.A00(htJ, AnonymousClass001.A0y(), new C122832(goalsStore.listNextCursor, null));
            if (objA00 == EnumC10460Hji.A02) {
                return objA00;
            }
        }
        return Unit.INSTANCE;
    }

    public final Object loadMoreTracking(HtJ<? super Unit> htJ) {
        GoalsStore value;
        GoalsStore goalsStore;
        BLG<GoalsStore> blg = this._store;
        do {
            value = blg.getValue();
            goalsStore = value;
        } while (!blg.A6e(value, HatchGoalsTabDataSourceKt.canLoadMoreTracking(goalsStore) ? GoalsStore.copy$default(goalsStore, null, null, null, null, null, null, null, false, false, null, false, true, null, null, null, false, false, null, null, 522239, null) : goalsStore));
        if (HatchGoalsTabDataSourceKt.canLoadMoreTracking(goalsStore)) {
            Object objA00 = GAo.A00(htJ, AnonymousClass001.A0y(), new C122842(goalsStore.trackingNextCursor, null));
            if (objA00 == EnumC10460Hji.A02) {
                return objA00;
            }
        }
        return Unit.INSTANCE;
    }

    public final Object loadTracking(HtJ<? super Unit> htJ) {
        GoalsStore value;
        if (C3cI.A0C(this).trackingLoadingState == LoadingState.INITIAL) {
            BLG<GoalsStore> blg = this._store;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, GoalsStore.copy$default(value, null, null, null, null, null, LoadingState.LOADING, null, false, false, null, false, false, null, null, null, false, false, null, null, 524255, null)));
        }
        return C3cJ.A0D(htJ, AnonymousClass001.A0y(), new C122853(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(boolean r32, X.HtJ<? super kotlin.Unit> r33) {
        /*
            r31 = this;
            r4 = r32
            r6 = r33
            boolean r0 = r6 instanceof com.facebook.aura.library.repo.HatchGoalsTabDataSource.C122981
            r5 = r31
            if (r0 == 0) goto Lbb
            r3 = r6
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$refresh$1 r3 = (com.facebook.aura.library.repo.HatchGoalsTabDataSource.C122981) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lbb
            int r2 = r2 - r1
            r3.label = r2
        L18:
            java.lang.Object r6 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 3
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L2f
            if (r0 == r8) goto L93
            if (r0 == r7) goto La3
            if (r0 != r1) goto Lc2
            X.Hwg.A00(r6)
        L2c:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L2f:
            X.Hwg.A00(r6)
            X.BLG<com.facebook.aura.library.repo.GoalsStore> r6 = r5._store
        L34:
            java.lang.Object r9 = r6.getValue()
            r12 = r9
            com.facebook.aura.library.repo.GoalsStore r12 = (com.facebook.aura.library.repo.GoalsStore) r12
            if (r4 == 0) goto L90
            X.AHG<java.lang.String> r0 = r12.sessionCompleted
        L3f:
            com.facebook.aura.library.repo.LoadingState r11 = r12.listLoadingState
            com.facebook.aura.library.repo.LoadingState r10 = com.facebook.aura.library.repo.LoadingState.INITIAL
            if (r11 == r10) goto L8d
            com.facebook.aura.library.repo.LoadingState r11 = r12.listLoadingState
            com.facebook.aura.library.repo.LoadingState r10 = com.facebook.aura.library.repo.LoadingState.LOADING
            if (r11 == r10) goto L8d
            if (r4 == 0) goto L8a
            com.facebook.aura.library.repo.LoadingState r17 = com.facebook.aura.library.repo.LoadingState.REFRESH_SILENTLY
        L4f:
            r32 = 393199(0x5ffef, float:5.50989E-40)
            r13 = 0
            r20 = 0
            r14 = r13
            r15 = r13
            r16 = r13
            r18 = r13
            r19 = r13
            r21 = r20
            r22 = r13
            r23 = r20
            r24 = r20
            r25 = r13
            r26 = r13
            r27 = r13
            r28 = r20
            r29 = r20
            r30 = r0
            r31 = r13
            r33 = r13
            com.facebook.aura.library.repo.GoalsStore r0 = com.facebook.aura.library.repo.GoalsStore.copy$default(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            boolean r0 = r6.A6e(r9, r0)
            if (r0 == 0) goto L34
            r3.Z$0 = r4
            r3.label = r8
            java.lang.Object r0 = r5.loadUserProfile(r3)
            if (r0 != r2) goto L98
            return r2
        L8a:
            com.facebook.aura.library.repo.LoadingState r17 = com.facebook.aura.library.repo.LoadingState.REFRESH_LOADING
            goto L4f
        L8d:
            com.facebook.aura.library.repo.LoadingState r17 = com.facebook.aura.library.repo.LoadingState.LOADING
            goto L4f
        L90:
            X.AIw r0 = X.C0943AIw.A03
            goto L3f
        L93:
            boolean r4 = r3.Z$0
            X.Hwg.A00(r6)
        L98:
            r3.Z$0 = r4
            r3.label = r7
            java.lang.Object r0 = r5.loadGoals(r3)
            if (r0 != r2) goto La8
            return r2
        La3:
            boolean r4 = r3.Z$0
            X.Hwg.A00(r6)
        La8:
            com.facebook.aura.utils.HatchUtil r0 = com.facebook.aura.utils.HatchUtil.INSTANCE
            boolean r0 = r0.isGoalsTrackingSectionEnabled()
            if (r0 == 0) goto L2c
            r3.Z$0 = r4
            r3.label = r1
            java.lang.Object r0 = r5.loadTracking(r3)
            if (r0 != r2) goto L2c
            return r2
        Lbb:
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$refresh$1 r3 = new com.facebook.aura.library.repo.HatchGoalsTabDataSource$refresh$1
            r3.<init>(r6)
            goto L18
        Lc2:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSource.refresh(boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object resetAndRefresh(HtJ<? super Unit> htJ) {
        boolean z = false;
        AnonymousClass001.A1E(this._store, null, new GoalsStore(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 524287, 0 == true ? 1 : 0));
        BLG<GoalsLocalOrder> blg = this._localOrder;
        C0953AJg c0953AJgA00 = C0953AJg.A00();
        AnonymousClass001.A1E(blg, null, new GoalsLocalOrder(c0953AJgA00, c0953AJgA00));
        Object objRefresh = refresh(false, htJ);
        return objRefresh != EnumC10460Hji.A02 ? Unit.INSTANCE : objRefresh;
    }

    public final void setShowGoalsFirst(boolean z) {
        if (AnonymousClass003.A1Z(this._showGoalsFirst) != z) {
            HtJ htJA14 = C3cI.A14(this._showGoalsFirst, Boolean.valueOf(z));
            AnonymousClass001.A1J(new C123041(z, htJA14), this.scope);
        }
    }

    public final void setShowSubtitles(boolean z) {
        if (AnonymousClass003.A1Z(this._showSubtitles) != z) {
            HtJ htJA14 = C3cI.A14(this._showSubtitles, Boolean.valueOf(z));
            AnonymousClass001.A1J(new C123051(z, htJA14), this.scope);
        }
    }

    public final class Companion {
        public final HatchGoalsTabDataSource getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchGoalsTabDataSource) abstractC3358CGz.A03(HatchGoalsTabDataSource.class, new HatchGoalsTabDataSource$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitGoalCoreUpdatesFor(Set<String> set) {
        emitGoalCoreUpdatesFor(set, C3cI.A0C(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isTerminalTaskStatus(String str) {
        String str2;
        String strA0J = C3cJ.A0J(str);
        switch (strA0J.hashCode()) {
            case -1947652542:
                str2 = HatchConversationRepositoryKt.TERMINAL_STATUS_INTERRUPTED;
                break;
            case -1478984537:
                return strA0J.equals("errored");
            case -1402931637:
                str2 = "completed";
                break;
            case -1281977283:
                str2 = "failed";
                break;
            case -169343402:
                str2 = "shutdown";
                break;
            case 476588369:
                str2 = "cancelled";
                break;
            case 1615526678:
                str2 = "not_found";
                break;
            default:
                return false;
        }
        return strA0J.equals(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object patchGoal(String str, GoalUpdateRequestJson goalUpdateRequestJson, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C122892(str, goalUpdateRequestJson, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object patchGoalParent(String str, String str2, HtJ<? super Boolean> htJ) {
        return patchGoal(str, new GoalUpdateRequestJson(null, null, null, HatchGoalsTabDataSourceJsonKt.goalParent(str2), null, null), htJ);
    }

    private final void pinOrder(String str, List<String> list, String str2) {
        GoalsStore value;
        Map<String, Long> mapPlacementFor = HatchGoalsTabDataSourceKt.placementFor(C3cI.A0C(this), list, str2);
        if (mapPlacementFor.isEmpty()) {
            return;
        }
        BLG<GoalsStore> blg = this._store;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchGoalsTabDataSourceKt.withPendingPins(value, mapPlacementFor)));
        scheduleOrderSync(str, new C122912(mapPlacementFor, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object refreshPlacementPages(HtJ<? super Unit> htJ) {
        return C3cJ.A0D(htJ, AnonymousClass001.A0y(), new C122992(C3cI.A0C(this), null));
    }

    public final Object deleteGoal(String str, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, null));
    }

    public final void moveGoal(GoalListSection goalListSection, String str, String str2) {
        AnonymousClass005.A0x(goalListSection, str, str2);
        if (str.equals(str2)) {
            return;
        }
        GoalsStore goalsStoreA0C = C3cI.A0C(this);
        List<String> listDisplayedOrder = HatchGoalsTabDataSourceKt.displayedOrder(goalsStoreA0C, HatchGoalsTabDataSourceKt.rootOrder(goalsStoreA0C, goalListSection));
        int iIndexOf = listDisplayedOrder.indexOf(str);
        int iIndexOf2 = listDisplayedOrder.indexOf(str2);
        if (iIndexOf < 0 || iIndexOf2 < 0) {
            return;
        }
        String strA0a = AnonymousClass007.A0a("section:", goalListSection);
        ArrayList arrayList = new ArrayList(listDisplayedOrder);
        arrayList.remove(iIndexOf);
        arrayList.add(iIndexOf2, str);
        pinOrder(strA0a, arrayList, str);
    }

    public final Object prefetch(HtJ<? super Unit> htJ) {
        int iOrdinal = C3cI.A0C(this).trackingLoadingState.ordinal();
        return C3cG.A0U((iOrdinal == 0 || iOrdinal == 1) ? load(htJ) : refresh(true, htJ));
    }

    public final Object recordGoalEngagement(String str, HatchEngagementEventType hatchEngagementEventType, String str2, Double d, JsonObject jsonObject, HtJ<? super Unit> htJ) {
        return C3cJ.A0D(htJ, AnonymousClass001.A0y(), new C122972(str, hatchEngagementEventType, str2, d, jsonObject, this, null));
    }

    public final void setSubGoalOrder(String str, List<String> list, String str2) {
        AnonymousClass003.A0u(str, list);
        if (list.isEmpty()) {
            return;
        }
        pinOrder(FGI.A0M("children:", str), list, str2);
        emitGoalCoreUpdatesFor(str);
    }

    public final Object sortGoalsAutomatically(HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C123062(null));
    }

    public final Object updateGoal(String str, String str2, String str3, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C123092(str, str2, str3, null));
    }

    public /* synthetic */ HatchGoalsTabDataSource(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitGoalCoreUpdatesFor(Set<String> set, GoalsStore goalsStore) {
        Goal goal;
        String str;
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        for (String str2 : set) {
            GoalNode goalNodeA0B = C3cI.A0B(goalsStore, str2);
            if (goalNodeA0B != null && (goal = goalNodeA0B.goal) != null && (str = goal.parentGoalId) != null) {
                linkedHashSetA0k.add(str);
            }
            linkedHashSetA0k.add(str2);
        }
        Iterator it = linkedHashSetA0k.iterator();
        while (it.hasNext()) {
            Goal goalBuildTree = HatchGoalsTabDataSourceKt.buildTree(goalsStore, AnonymousClass005.A0j(it), 0);
            if (goalBuildTree != null) {
                this._goalCoreUpdates.AhV(goalBuildTree);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitGoalCoreUpdatesFor(String... strArr) {
        emitGoalCoreUpdatesFor(BFI.A0H(strArr));
    }
}
