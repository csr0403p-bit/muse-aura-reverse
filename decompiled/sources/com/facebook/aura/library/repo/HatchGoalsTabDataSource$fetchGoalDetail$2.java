package com.facebook.aura.library.repo;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BLG;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$fetchGoalDetail$2", f = "HatchGoalsTabDataSource.kt", l = {2362}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchGoalsTabDataSource$fetchGoalDetail$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends GoalDetail>>, Object> {
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
    public int label;
    public final /* synthetic */ HatchGoalsTabDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabDataSource$fetchGoalDetail$2(String str, HatchGoalsTabDataSource hatchGoalsTabDataSource, HtJ<? super HatchGoalsTabDataSource$fetchGoalDetail$2> htJ) {
        super(2, htJ);
        this.$goalId = str;
        this.this$0 = hatchGoalsTabDataSource;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGoalsTabDataSource$fetchGoalDetail$2(this.$goalId, this.this$0, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends GoalDetail>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<GoalDetail>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA0s;
        Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
        Throwable thA00;
        GoalsStore value;
        GoalsStore goalsStoreA0D;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchGoalsTabDataSource$fetchGoalDetail$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchGoalsTabDataSource$fetchGoalDetail$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchGoalsTabDataSource$fetchGoalDetail$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
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
                objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(hatchGoalsTabDataSource$fetchGoalDetail$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, new JarvisPath.Goal(this.$goalId), RequestType.GET, this.this$0.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            thA00 = HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            C3cI.A1L("Failed to load goal detail: ", e2.getMessage(), e2);
            objA0s = C3cG.A0s(e2);
        }
        if (thA00 != null) {
            return C3cG.A0t(C3cG.A0s(thA00));
        }
        GoalDetail domain = ((GoalDetailPayloadJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).toDomain();
        if (domain == null) {
            return C3cG.A0t(C3cG.A0s(C3cG.A0Q("Goal detail response is missing the goal")));
        }
        HatchGoalsTabDataSource hatchGoalsTabDataSource = this.this$0;
        BLG<GoalsStore> blg = hatchGoalsTabDataSource._store;
        do {
            value = blg.getValue();
            goalsStoreA0D = C3cI.A0D(hatchGoalsTabDataSource, HatchGoalsTabDataSourceKt.mergeGoalDetail(value, domain));
        } while (!blg.A6e(value, goalsStoreA0D));
        this.this$0.emitGoalCoreUpdatesFor(HatchGoalsTabDataSourceKt.subtreeIds(goalsStoreA0D, domain.goal.id), goalsStoreA0D);
        Object objBuildDetail = HatchGoalsTabDataSourceKt.buildDetail(goalsStoreA0D, domain.goal.id);
        objA0s = domain;
        if (objBuildDetail != null) {
            objA0s = objBuildDetail;
        }
        return C3cG.A0t(objA0s);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<GoalDetail>> htJ) {
        return ((HatchGoalsTabDataSource$fetchGoalDetail$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
