package com.facebook.aura.startup;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC10627Hzt;
import X.AbstractC2258BHp;
import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass801;
import X.BLG;
import X.C0881AGi;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C7Bq;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.EsN;
import X.F0C;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HoC;
import X.Hr7;
import X.HrB;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.os.SystemClock;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.components.reactions.AuraMicroLaunchKt;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.nodes.transport.HatchNodeServiceState;
import com.facebook.aura.qpl.startup.HatchStartupQpl;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.ScopeFilter;
import com.facebook.aura.startup.appjob.StartupPhase;
import com.facebook.aura.startup.readiness.BackgroundReadyState;
import com.facebook.aura.tracer.AuraSystrace;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraStartupOrchestrator {
    public static final BLG<Boolean> _isUiBlockingReady;
    public static final ConcurrentHashMap<AppJobKey, HoC> inFlight;
    public static final C1BN<Boolean> isUiBlockingReady;
    public static final ConcurrentHashMap<AppJobKey, Long> lastRunAtMs;
    public static final ConcurrentHashMap<AppJobKey, Long> lastSuccessAtMs;
    public static final AtomicReference<ScopeFilter> latestScopeFilter;
    public static HoC lowPrioritySessionedJob;
    public static HoC lowPrioritySessionlessJob;
    public static final AtomicBoolean qplSessionlessEmitted;
    public static final C3UX scope;
    public static final AtomicBoolean sessionLoopStarted;
    public static HoC sessionWorkJob;
    public static final AuraStartupOrchestrator INSTANCE = new AuraStartupOrchestrator();
    public static final F0C enabledSessionlessKeys$delegate = AbstractC5321DgF.A03(AuraStartupOrchestrator$enabledSessionlessKeys$2.INSTANCE);
    public static final F0C enabledSessionedKeys$delegate = AbstractC5321DgF.A03(AuraStartupOrchestrator$enabledSessionedKeys$2.INSTANCE);

    @DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator$launchLowPrioritySessionedJobs$3", f = "AuraStartupOrchestrator.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.AuraStartupOrchestrator$launchLowPrioritySessionedJobs$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ List<Integer> $lowPriority;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(List<Integer> list, AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$lowPriority = list;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$lowPriority, this.$userSession, htJ);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            List<Integer> list = this.$lowPriority;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass001.A1I(AnonymousClass001.A0y(), new AuraStartupOrchestrator$launchLowPrioritySessionedJobs$3$1$1(AnonymousClass001.A0F(it.next()), abstractC3358CGz, null), c3ux);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator$launchLowPrioritySessionlessJobs$3", f = "AuraStartupOrchestrator.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.AuraStartupOrchestrator$launchLowPrioritySessionlessJobs$3, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C139933 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ List<Integer> $lowPriority;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139933(List<Integer> list, HtJ<? super C139933> htJ) {
            super(2, htJ);
            this.$lowPriority = list;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C139933 c139933 = new C139933(this.$lowPriority, htJ);
            c139933.L$0 = obj;
            return c139933;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            Iterator<Integer> it = this.$lowPriority.iterator();
            while (it.hasNext()) {
                AnonymousClass001.A1I(AnonymousClass001.A0y(), new AuraStartupOrchestrator$launchLowPrioritySessionlessJobs$3$1$1(AnonymousClass001.A0F(it.next()), null), c3ux);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C139933) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator$notifyInitialContentRendered$1", f = "AuraStartupOrchestrator.kt", l = {182, 183}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.AuraStartupOrchestrator$notifyInitialContentRendered$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(5000L, this) == enumC10460Hji) {
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
            AuraStartupOrchestrator auraStartupOrchestrator = AuraStartupOrchestrator.INSTANCE;
            this.label = 2;
            if (auraStartupOrchestrator.launchLowPrioritySessionlessJobs(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator$notifyInitialContentRenderedPostLogin$1", f = "AuraStartupOrchestrator.kt", l = {191, 192}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.AuraStartupOrchestrator$notifyInitialContentRenderedPostLogin$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C139941 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139941(AbstractC3358CGz abstractC3358CGz, HtJ<? super C139941> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C139941(this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(3000L, this) == enumC10460Hji) {
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
            AuraStartupOrchestrator auraStartupOrchestrator = AuraStartupOrchestrator.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            this.label = 2;
            if (auraStartupOrchestrator.launchLowPrioritySessionedJobs(abstractC3358CGz, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C139941(this.$userSession, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator$onActivating$1", f = "AuraStartupOrchestrator.kt", l = {358}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.AuraStartupOrchestrator$onActivating$1, reason: invalid class name and case insensitive filesystem */
    public final class C139951 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ScopeFilter $scopeFilter;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139951(ScopeFilter scopeFilter, AbstractC3358CGz abstractC3358CGz, HtJ<? super C139951> htJ) {
            super(2, htJ);
            this.$scopeFilter = scopeFilter;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C139951(this.$scopeFilter, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchStartupQpl.Companion.markerPoint(HatchStartupPoints.BLOCKING_FETCH_START);
                    AuraStartupOrchestrator auraStartupOrchestrator = AuraStartupOrchestrator.INSTANCE;
                    AbstractC3358CGz abstractC3358CGz = this.$userSession;
                    ScopeFilter scopeFilter = this.$scopeFilter;
                    this.label = 1;
                    if (auraStartupOrchestrator.runBlockingSessionedJobs(abstractC3358CGz, scopeFilter, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                HatchStartupQpl.Companion.markerPoint(HatchStartupPoints.BLOCKING_FETCH_END);
                AuraSessionManager auraSessionManager = AuraSessionManager.INSTANCE;
                if (AuraSessionManager.state.getValue() instanceof AuraSessionManager.SessionState.Activating) {
                    auraSessionManager.onSessionReady();
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                HatchStartupQpl.Companion.markerPoint(HatchStartupPoints.BLOCKING_FETCH_END);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C139951) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator", f = "AuraStartupOrchestrator.kt", l = {AuraMicroLaunchKt.MICRO_LAUNCH_TOTAL_MS}, m = "runBlockingSessionedJobs", v = 2)
    /* renamed from: com.facebook.aura.startup.AuraStartupOrchestrator$runBlockingSessionedJobs$1, reason: invalid class name and case insensitive filesystem */
    public final class C139961 extends HzP {
        public long J$0;
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
        public /* synthetic */ Object result;

        public C139961(HtJ<? super C139961> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraStartupOrchestrator.this.runBlockingSessionedJobs(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator$runBlockingSessionedJobs$3", f = "AuraStartupOrchestrator.kt", l = {717}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.AuraStartupOrchestrator$runBlockingSessionedJobs$3, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C139973 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends Unit>>, Object> {
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ List<Integer> $wave;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139973(List<Integer> list, AbstractC3358CGz abstractC3358CGz, HtJ<? super C139973> htJ) {
            super(2, htJ);
            this.$wave = list;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C139973 c139973 = new C139973(this.$wave, this.$userSession, htJ);
            c139973.L$0 = obj;
            return c139973;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends Unit>> htJ) {
            return invoke2(c3ux, (HtJ<? super List<Unit>>) htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                List<Integer> list = this.$wave;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    arrayListA0i.add(GAo.A01(C79.A00, AuraDispatchers.INSTANCE.io(), new AuraStartupOrchestrator$runBlockingSessionedJobs$3$1$1(iIntValue, abstractC3358CGz, null), c3ux));
                }
                this.L$0 = null;
                this.label = 1;
                obj = EsN.A00(arrayListA0i, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super List<Unit>> htJ) {
            return ((C139973) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator", f = "AuraStartupOrchestrator.kt", l = {817, 832, 834}, m = "runSessionedJob", v = 2)
    /* renamed from: com.facebook.aura.startup.AuraStartupOrchestrator$runSessionedJob$1, reason: invalid class name and case insensitive filesystem */
    public final class C139981 extends HzP {
        public int I$0;
        public int I$1;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
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

        public C139981(HtJ<? super C139981> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraStartupOrchestrator.this.runSessionedJob(0, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator", f = "AuraStartupOrchestrator.kt", l = {634, 651, 653}, m = "runSessionlessJob", v = 2)
    /* renamed from: com.facebook.aura.startup.AuraStartupOrchestrator$runSessionlessJob$1, reason: invalid class name and case insensitive filesystem */
    public final class C139991 extends HzP {
        public int I$0;
        public int I$1;
        public long J$0;
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

        public C139991(HtJ<? super C139991> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraStartupOrchestrator.this.runSessionlessJob(0, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator", f = "AuraStartupOrchestrator.kt", l = {571}, m = "runSessionlessJobs", v = 2)
    /* renamed from: com.facebook.aura.startup.AuraStartupOrchestrator$runSessionlessJobs$1, reason: invalid class name and case insensitive filesystem */
    public final class C140001 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public C140001(HtJ<? super C140001> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraStartupOrchestrator.this.runSessionlessJobs(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator$runSessionlessJobs$4", f = "AuraStartupOrchestrator.kt", l = {576}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.AuraStartupOrchestrator$runSessionlessJobs$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends Unit>>, Object> {
        public final /* synthetic */ List<Integer> $wave;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(List<Integer> list, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.$wave = list;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$wave, htJ);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends Unit>> htJ) {
            return invoke2(c3ux, (HtJ<? super List<Unit>>) htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                List<Integer> list = this.$wave;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    arrayListA0i.add(GAo.A01(C79.A00, AuraDispatchers.INSTANCE.io(), new AuraStartupOrchestrator$runSessionlessJobs$4$1$1(iIntValue, null), c3ux));
                }
                this.L$0 = null;
                this.label = 1;
                obj = EsN.A00(arrayListA0i, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super List<Unit>> htJ) {
            return ((AnonymousClass4) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator$start$1", f = "AuraStartupOrchestrator.kt", l = {219, 229}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.AuraStartupOrchestrator$start$1, reason: invalid class name and case insensitive filesystem */
    public final class C140011 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ScopeFilter $scopeFilter;
        public boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140011(ScopeFilter scopeFilter, HtJ<? super C140011> htJ) {
            super(2, htJ);
            this.$scopeFilter = scopeFilter;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C140011(this.$scopeFilter, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C140011(this.$scopeFilter, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean zCompareAndSet;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                zCompareAndSet = AuraStartupOrchestrator.qplSessionlessEmitted.compareAndSet(false, true);
                if (zCompareAndSet) {
                    HatchStartupQpl.Companion.markerPoint(HatchStartupPoints.SESSIONLESS_BLOCKING_START);
                }
                AuraStartupOrchestrator auraStartupOrchestrator = AuraStartupOrchestrator.INSTANCE;
                ScopeFilter scopeFilter = this.$scopeFilter;
                this.Z$0 = zCompareAndSet;
                this.label = 1;
                if (auraStartupOrchestrator.runSessionlessJobs(scopeFilter, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    throw C3cG.A0p();
                }
                zCompareAndSet = this.Z$0;
                Hwg.A00(obj);
            }
            if (zCompareAndSet) {
                HatchStartupQpl.Companion.markerPoint(HatchStartupPoints.SESSIONLESS_BLOCKING_END);
            }
            if (!AuraStartupOrchestrator.sessionLoopStarted.compareAndSet(false, true)) {
                ScopeFilter scopeFilter2 = this.$scopeFilter;
                if (scopeFilter2 == ScopeFilter.FULL) {
                    AuraStartupOrchestrator.INSTANCE.catchUpSessionedJobs(scopeFilter2);
                }
                return Unit.INSTANCE;
            }
            AuraStartupOrchestrator.INSTANCE.watchForegroundService();
            HatchStartupQpl.Companion companion = HatchStartupQpl.Companion;
            companion.markerPoint(HatchStartupPoints.SESSION_INIT_START);
            AuraSessionManager.INSTANCE.initialize();
            companion.markerPoint(HatchStartupPoints.SESSION_INIT_END);
            C1BN<AuraSessionManager.SessionState> c1bn = AuraSessionManager.state;
            C20Z<? super AuraSessionManager.SessionState> c20z = new C20Z() { // from class: com.facebook.aura.startup.AuraStartupOrchestrator.start.1.1
                public final Object emit(AuraSessionManager.SessionState sessionState, HtJ<? super Unit> htJ) {
                    HatchGatewayStartupRequirement.INSTANCE.onSessionState(sessionState);
                    if (sessionState instanceof AuraSessionManager.SessionState.Activating) {
                        AuraStartupOrchestrator auraStartupOrchestrator2 = AuraStartupOrchestrator.INSTANCE;
                        AbstractC3358CGz abstractC3358CGz = ((AuraSessionManager.SessionState.Activating) sessionState).session;
                        ScopeFilter scopeFilter3 = AuraStartupOrchestrator.latestScopeFilter.get();
                        C7384Etj.A0U(scopeFilter3);
                        auraStartupOrchestrator2.onActivating(abstractC3358CGz, scopeFilter3);
                    } else if (sessionState instanceof AuraSessionManager.SessionState.Active) {
                        AuraStartupOrchestrator auraStartupOrchestrator3 = AuraStartupOrchestrator.INSTANCE;
                        AbstractC3358CGz abstractC3358CGz2 = ((AuraSessionManager.SessionState.Active) sessionState).session;
                        ScopeFilter scopeFilter4 = AuraStartupOrchestrator.latestScopeFilter.get();
                        C7384Etj.A0U(scopeFilter4);
                        auraStartupOrchestrator3.launchHighPrioritySessionedJobs(abstractC3358CGz2, scopeFilter4);
                    } else if (sessionState instanceof AuraSessionManager.SessionState.SignedOut) {
                        AuraStartupOrchestrator.INSTANCE.onSignedOut();
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((AuraSessionManager.SessionState) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.Z$0 = zCompareAndSet;
            this.label = 2;
            if (c1bn.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            throw C3cG.A0p();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator$upgradeScope$1", f = "AuraStartupOrchestrator.kt", l = {321}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.AuraStartupOrchestrator$upgradeScope$1, reason: invalid class name and case insensitive filesystem */
    public final class C140021 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ List<Integer> $activating;
        public final /* synthetic */ List<Integer> $blocking;
        public final /* synthetic */ Set<AppJobKey> $blockingJobIds;
        public final /* synthetic */ Set<AppJobKey> $done;
        public final /* synthetic */ List<Integer> $highPriority;
        public final /* synthetic */ Set<Integer> $launchedActivating;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator$upgradeScope$1$1", f = "AuraStartupOrchestrator.kt", l = {328}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.startup.AuraStartupOrchestrator$upgradeScope$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C03891 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends Unit>>, Object> {
            public final /* synthetic */ AbstractC3358CGz $userSession;
            public final /* synthetic */ List<Integer> $wave;
            public /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03891(List<Integer> list, AbstractC3358CGz abstractC3358CGz, HtJ<? super C03891> htJ) {
                super(2, htJ);
                this.$wave = list;
                this.$userSession = abstractC3358CGz;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C03891 c03891 = new C03891(this.$wave, this.$userSession, htJ);
                c03891.L$0 = obj;
                return c03891;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends Unit>> htJ) {
                return invoke2(c3ux, (HtJ<? super List<Unit>>) htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                C3UX c3ux = (C3UX) this.L$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    List<Integer> list = this.$wave;
                    AbstractC3358CGz abstractC3358CGz = this.$userSession;
                    ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                    Iterator<Integer> it = list.iterator();
                    while (it.hasNext()) {
                        int iIntValue = it.next().intValue();
                        arrayListA0i.add(GAo.A01(C79.A00, AuraDispatchers.INSTANCE.io(), new AuraStartupOrchestrator$upgradeScope$1$1$1$1(iIntValue, abstractC3358CGz, null), c3ux));
                    }
                    this.L$0 = null;
                    this.label = 1;
                    obj = EsN.A00(arrayListA0i, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return obj;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(C3UX c3ux, HtJ<? super List<Unit>> htJ) {
                return ((C03891) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140021(AbstractC3358CGz abstractC3358CGz, List<Integer> list, Set<AppJobKey> set, Set<AppJobKey> set2, Set<Integer> set3, List<Integer> list2, List<Integer> list3, HtJ<? super C140021> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$activating = list;
            this.$blockingJobIds = set;
            this.$done = set2;
            this.$launchedActivating = set3;
            this.$blocking = list2;
            this.$highPriority = list3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C140021 c140021 = new C140021(this.$userSession, this.$activating, this.$blockingJobIds, this.$done, this.$launchedActivating, this.$blocking, this.$highPriority, htJ);
            c140021.L$0 = obj;
            return c140021;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[LOOP:1: B:22:0x00b2->B:24:0x00b8, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[LOOP:0: B:7:0x002a->B:9:0x0030, LOOP_END] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00a2 -> B:6:0x0019). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.L$0
                X.3UX r0 = (X.C3UX) r0
                X.Hji r2 = X.EnumC10460Hji.A02
                int r4 = r14.label
                r1 = 0
                r3 = 1
                if (r4 == 0) goto L42
                if (r4 != r3) goto La5
                java.lang.Object r9 = r14.L$3
                java.util.List r9 = (java.util.List) r9
                java.lang.Object r6 = r14.L$2
                java.util.Iterator r6 = (java.util.Iterator) r6
                X.Hwg.A00(r15)
            L19:
                java.util.Set<com.facebook.aura.startup.appjob.AppJobKey> r8 = r14.$done
                r4 = 10
                int r4 = X.Hr7.A1D(r9, r4)
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>(r4)
                java.util.Iterator r5 = r9.iterator()
            L2a:
                boolean r4 = r5.hasNext()
                if (r4 == 0) goto L6d
                java.lang.Object r4 = r5.next()
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                com.facebook.aura.startup.appjob.AppJobKey r4 = X.AnonymousClass801.A0B(r4)
                r7.add(r4)
                goto L2a
            L42:
                X.Hwg.A00(r15)
                com.facebook.aura.startup.AuraStartupOrchestrator r7 = com.facebook.aura.startup.AuraStartupOrchestrator.INSTANCE
                X.CGz r8 = r14.$userSession
                java.util.List<java.lang.Integer> r9 = r14.$activating
                java.util.Set<com.facebook.aura.startup.appjob.AppJobKey> r10 = r14.$blockingJobIds
                java.util.Set<com.facebook.aura.startup.appjob.AppJobKey> r11 = r14.$done
                java.util.Set<java.lang.Integer> r12 = r14.$launchedActivating
                java.lang.String r13 = "sessioned/upgrade-activating"
                com.facebook.aura.startup.AuraStartupOrchestrator.access$launchReadyActivatingJobs(r7, r8, r9, r10, r11, r12, r13)
                java.util.List<java.lang.Integer> r4 = r14.$blocking
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto Laa
                java.util.List<java.lang.Integer> r6 = r14.$blocking
                com.facebook.aura.startup.AuraStartupOrchestrator$upgradeScope$1$waves$1 r5 = com.facebook.aura.startup.AuraStartupOrchestrator$upgradeScope$1$waves$1.INSTANCE
                com.facebook.aura.startup.AuraStartupOrchestrator$upgradeScope$1$waves$2 r4 = com.facebook.aura.startup.AuraStartupOrchestrator$upgradeScope$1$waves$2.INSTANCE
                java.util.List r4 = com.facebook.aura.startup.AuraStartupOrchestrator.access$computeWaves(r7, r6, r5, r4)
                java.util.Iterator r6 = r4.iterator()
                goto L81
            L6d:
                X.AbstractC0882AGj.A0r(r7, r8)
                com.facebook.aura.startup.AuraStartupOrchestrator r7 = com.facebook.aura.startup.AuraStartupOrchestrator.INSTANCE
                X.CGz r8 = r14.$userSession
                java.util.List<java.lang.Integer> r9 = r14.$activating
                java.util.Set<com.facebook.aura.startup.appjob.AppJobKey> r10 = r14.$blockingJobIds
                java.util.Set<com.facebook.aura.startup.appjob.AppJobKey> r11 = r14.$done
                java.util.Set<java.lang.Integer> r12 = r14.$launchedActivating
                java.lang.String r13 = "sessioned/upgrade-activating"
                com.facebook.aura.startup.AuraStartupOrchestrator.access$launchReadyActivatingJobs(r7, r8, r9, r10, r11, r12, r13)
            L81:
                boolean r4 = r6.hasNext()
                if (r4 == 0) goto Laa
                java.lang.Object r9 = r6.next()
                java.util.List r9 = (java.util.List) r9
                X.CGz r5 = r14.$userSession
                com.facebook.aura.startup.AuraStartupOrchestrator$upgradeScope$1$1 r4 = new com.facebook.aura.startup.AuraStartupOrchestrator$upgradeScope$1$1
                r4.<init>(r9, r5, r1)
                r14.L$0 = r0
                r14.L$1 = r1
                r14.L$2 = r6
                r14.L$3 = r9
                r14.label = r3
                java.lang.Object r4 = X.AbstractC10627Hzt.A00(r4, r14)
                if (r4 != r2) goto L19
                return r2
            La5:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            Laa:
                java.util.List<java.lang.Integer> r2 = r14.$highPriority
                X.CGz r7 = r14.$userSession
                java.util.Iterator r6 = r2.iterator()
            Lb2:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto Ld3
                java.lang.Object r2 = r6.next()
                java.lang.Number r2 = (java.lang.Number) r2
                int r5 = r2.intValue()
                com.facebook.aura.executors.AuraDispatchers r2 = com.facebook.aura.executors.AuraDispatchers.INSTANCE
                X.78T r4 = r2.io()
                com.facebook.aura.startup.AuraStartupOrchestrator$upgradeScope$1$3$1 r3 = new com.facebook.aura.startup.AuraStartupOrchestrator$upgradeScope$1$3$1
                r3.<init>(r5, r7, r1)
                java.lang.Integer r2 = X.C79.A00
                X.GAo.A02(r2, r4, r3, r0)
                goto Lb2
            Ld3:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.AuraStartupOrchestrator.C140021.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C140021) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator$watchForegroundService$1", f = "AuraStartupOrchestrator.kt", l = {250}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.AuraStartupOrchestrator$watchForegroundService$1, reason: invalid class name and case insensitive filesystem */
    public final class C140031 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator$watchForegroundService$1$1", f = "AuraStartupOrchestrator.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.startup.AuraStartupOrchestrator$watchForegroundService$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C03901 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public int label;

            public C03901(HtJ<? super C03901> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C03901 c03901 = new C03901(htJ);
                c03901.Z$0 = AnonymousClass001.A1X(obj);
                return c03901;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                if (this.label == 0) {
                    return AnonymousClass001.A0k(obj, z);
                }
                throw AnonymousClass001.A0n();
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                return ((C03901) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C140031(HtJ<? super C140031> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C140031(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C140031(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<Boolean> c1bn = HatchNodeServiceState.isForeground;
                C03901 c03901 = new C03901(null);
                this.label = 1;
                if (AbstractC9777Gfy.A00(this, c03901, c1bn) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            AuraStartupOrchestrator auraStartupOrchestrator = AuraStartupOrchestrator.INSTANCE;
            ScopeFilter scopeFilter = ScopeFilter.FOREGROUND_SERVICE;
            if (auraStartupOrchestrator.widenScopeFilter(scopeFilter).compareTo(scopeFilter) < 0) {
                auraStartupOrchestrator.catchUpSessionedJobs(scopeFilter);
            }
            return Unit.INSTANCE;
        }
    }

    private final boolean shouldRunOnResume(ResumePolicy resumePolicy, Long l, long j) {
        long j2;
        if (l != null) {
            long jLongValue = j - l.longValue();
            if (!C7384Etj.areEqual(resumePolicy, ResumePolicy.OncePerProcess.INSTANCE)) {
                if (resumePolicy instanceof ResumePolicy.Periodic) {
                    j2 = ((ResumePolicy.Periodic) resumePolicy).intervalMinutes * 60000;
                } else {
                    if (!C7384Etj.areEqual(resumePolicy, ResumePolicy.EveryResume.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j2 = 1000;
                }
                if (jLongValue >= j2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void notifyInitialContentRenderedPostLogin(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        HtJ htJA13 = AnonymousClass006.A13(lowPrioritySessionedJob);
        C3UX c3ux = scope;
        lowPrioritySessionedJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C139941(abstractC3358CGz, htJA13), c3ux);
    }

    public final void start(ScopeFilter scopeFilter) {
        C7384Etj.A0Y(scopeFilter, 0);
        widenScopeFilter(scopeFilter);
        AnonymousClass001.A1J(new C140011(scopeFilter, null), scope);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScopeFilter.values().length];
            try {
                AnonymousClass002.A13(ScopeFilter.FULL, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ScopeFilter.FOREGROUND_SERVICE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ScopeFilter.ALL_PROCESSES_ONLY, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        _isUiBlockingReady = c9286GCnA0v;
        isUiBlockingReady = C3cG.A11(c9286GCnA0v);
        scope = C78T.A01(AnonymousClass001.A0y(), null);
        lastRunAtMs = C60O.A1C();
        lastSuccessAtMs = C60O.A1C();
        inFlight = C60O.A1C();
        sessionLoopStarted = new AtomicBoolean(false);
        qplSessionlessEmitted = new AtomicBoolean(false);
        latestScopeFilter = new AtomicReference<>(ScopeFilter.ALL_PROCESSES_ONLY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void catchUpSessionedJobs(ScopeFilter scopeFilter) {
        AbstractC3358CGz abstractC3358CGz;
        AuraSessionManager.SessionState value = AuraSessionManager.state.getValue();
        if (value instanceof AuraSessionManager.SessionState.Active) {
            abstractC3358CGz = ((AuraSessionManager.SessionState.Active) value).session;
        } else if (!(value instanceof AuraSessionManager.SessionState.Activating)) {
            return;
        } else {
            abstractC3358CGz = ((AuraSessionManager.SessionState.Activating) value).session;
        }
        upgradeScope(abstractC3358CGz, scopeFilter);
    }

    private final int[] getEnabledSessionedKeys() {
        return (int[]) enabledSessionedKeys$delegate.getValue();
    }

    private final int[] getEnabledSessionlessKeys() {
        return (int[]) enabledSessionlessKeys$delegate.getValue();
    }

    @Deprecated(message = "Use isUiBlockingReady", replaceWith = @ReplaceWith(expression = "isUiBlockingReady", imports = {}))
    public static /* synthetic */ void isInitialized$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isJobEnabled(AppJobKey appJobKey) {
        boolean zIsEnabled = AuraStartupJobPolicy.INSTANCE.isEnabled(appJobKey);
        if (!zIsEnabled) {
            StringBuilder sb = new StringBuilder("Startup policy: disabled ");
            sb.append(appJobKey);
            sb.append(" on watch");
            CFK.A05(AuraStartupOrchestratorKt.TAG, sb.toString());
        }
        return zIsEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchHighPrioritySessionedJobs(AbstractC3358CGz abstractC3358CGz, ScopeFilter scopeFilter) {
        List<Integer> listFilterSessionedByScope = filterSessionedByScope((int[]) enabledSessionedKeys$delegate.getValue(), scopeFilter);
        ArrayList arrayListA0h = C3cG.A0h();
        for (Integer num : listFilterSessionedByScope) {
            if (AnonymousClass801.A0I(num.intValue()) == StartupPhase.NON_BLOCKING_HIGH_PRIORITY) {
                arrayListA0h.add(num);
            }
        }
        if (arrayListA0h.isEmpty()) {
            return;
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(AnonymousClass801.A0B(((Number) it.next()).intValue()));
        }
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            C3UX c3ux = scope;
            GAo.A02(C79.A00, AuraDispatchers.INSTANCE.io(), new AuraStartupOrchestrator$launchHighPrioritySessionedJobs$2$1(iIntValue, abstractC3358CGz, null), c3ux);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object launchLowPrioritySessionedJobs(AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        int[] iArr = (int[]) enabledSessionedKeys$delegate.getValue();
        ArrayList arrayListA0h = C3cG.A0h();
        for (int i : iArr) {
            if (AnonymousClass801.A0I(i) == StartupPhase.NON_BLOCKING_LOW_PRIORITY) {
                arrayListA0h.add(C3cG.A0R(i));
            }
        }
        if (!arrayListA0h.isEmpty()) {
            ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(AnonymousClass801.A0B(C60Q.A03(it)));
            }
            Object objA00 = AbstractC10627Hzt.A00(new AnonymousClass3(arrayListA0h, abstractC3358CGz, null), htJ);
            if (objA00 == EnumC10460Hji.A02) {
                return objA00;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object launchLowPrioritySessionlessJobs(HtJ<? super Unit> htJ) {
        int[] iArr = (int[]) enabledSessionlessKeys$delegate.getValue();
        ArrayList arrayListA0h = C3cG.A0h();
        for (int i : iArr) {
            if (AnonymousClass801.A0J(i) == StartupPhase.NON_BLOCKING_LOW_PRIORITY) {
                arrayListA0h.add(C3cG.A0R(i));
            }
        }
        if (!arrayListA0h.isEmpty()) {
            ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(AnonymousClass801.A0A(C60Q.A03(it)));
            }
            Object objA00 = AbstractC10627Hzt.A00(new C139933(arrayListA0h, null), htJ);
            if (objA00 == EnumC10460Hji.A02) {
                return objA00;
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void launchReadyActivatingJobs$default(AuraStartupOrchestrator auraStartupOrchestrator, AbstractC3358CGz abstractC3358CGz, List list, Set set, Set set2, Set set3, String str, int i, Object obj) {
        if ((i & 32) != 0) {
            str = "sessioned/activating";
        }
        auraStartupOrchestrator.launchReadyActivatingJobs(abstractC3358CGz, list, set, set2, set3, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActivating(AbstractC3358CGz abstractC3358CGz, ScopeFilter scopeFilter) {
        HtJ htJA13 = AnonymousClass006.A13(sessionWorkJob);
        sessionWorkJob = AnonymousClass001.A11(new C139951(scopeFilter, abstractC3358CGz, htJA13), scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSignedOut() {
        HoC hoC = sessionWorkJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        sessionWorkJob = null;
        HoC hoC2 = lowPrioritySessionedJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        lowPrioritySessionedJob = null;
    }

    private final void recomputeUiBlockingReady() {
        boolean z;
        boolean z2;
        boolean z3;
        F0C f0c = enabledSessionlessKeys$delegate;
        int[] iArr = (int[]) f0c.getValue();
        int length = iArr.length;
        boolean z4 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            int i2 = iArr[i];
            if (AnonymousClass801.A0J(i2) == StartupPhase.BLOCKING && lastRunAtMs.get(AnonymousClass801.A0A(i2)) == null) {
                z = false;
                break;
            }
            i++;
        }
        BLG<Boolean> blg = _isUiBlockingReady;
        if (blg.getValue().booleanValue() != z) {
            C9286GCn.A00(null, Boolean.valueOf(z), (C9286GCn) blg);
        }
        int[] iArr2 = (int[]) f0c.getValue();
        int length2 = iArr2.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                z2 = true;
                break;
            }
            int i4 = iArr2[i3];
            if (AnonymousClass801.A0D(i4) == ProcessScope.ALL_PROCESSES && AnonymousClass801.A0J(i4) == StartupPhase.BLOCKING && lastRunAtMs.get(AnonymousClass801.A0A(i4)) == null) {
                z2 = false;
                break;
            }
            i3++;
        }
        if (AuraSessionManager.state.getValue() instanceof AuraSessionManager.SessionState.Active) {
            for (int i5 : (int[]) enabledSessionedKeys$delegate.getValue()) {
                if (AnonymousClass801.A0C(i5) == ProcessScope.ALL_PROCESSES && AnonymousClass801.A0I(i5) == StartupPhase.BLOCKING && lastRunAtMs.get(AnonymousClass801.A0B(i5)) == null) {
                    z3 = false;
                    break;
                }
            }
            z3 = true;
        } else {
            z3 = true;
        }
        BackgroundReadyState backgroundReadyState = BackgroundReadyState.INSTANCE;
        if (z2 && z3) {
            z4 = true;
        }
        backgroundReadyState.setReady(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[LOOP:0: B:12:0x0052->B:14:0x0058, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017d  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.facebook.aura.startup.AuraStartupOrchestrator] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x016e -> B:11:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runBlockingSessionedJobs(X.AbstractC3358CGz r18, com.facebook.aura.startup.appjob.ScopeFilter r19, X.HtJ<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.AuraStartupOrchestrator.runBlockingSessionedJobs(X.CGz, com.facebook.aura.startup.appjob.ScopeFilter, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x017e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fd A[Catch: Exception -> 0x0201, all -> 0x024b, TryCatch #4 {all -> 0x024b, blocks: (B:86:0x01f5, B:88:0x01fd, B:89:0x0200, B:67:0x019a, B:69:0x01a2, B:72:0x01a8), top: B:104:0x0029 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentHashMap<com.facebook.aura.startup.appjob.AppJobKey, X.HoC>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.HtJ] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.facebook.aura.startup.appjob.AppJobKey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runSessionedJob(int r23, X.AbstractC3358CGz r24, java.lang.String r25, X.HtJ<? super kotlin.Unit> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.AuraStartupOrchestrator.runSessionedJob(int, X.CGz, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191 A[Catch: Exception -> 0x01e9, all -> 0x0235, TryCatch #3 {all -> 0x0235, blocks: (B:86:0x01ec, B:63:0x0189, B:65:0x0191, B:66:0x0194, B:40:0x00c8, B:41:0x00e4, B:43:0x00f3, B:44:0x00ff, B:46:0x0107), top: B:99:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e3 A[Catch: Exception -> 0x01e7, all -> 0x0233, TryCatch #12 {Exception -> 0x01e7, all -> 0x0233, blocks: (B:77:0x01db, B:79:0x01e3, B:80:0x01e6), top: B:114:0x01db }] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [long] */
    /* JADX WARN: Type inference failed for: r2v5, types: [long] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [long] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentHashMap<com.facebook.aura.startup.appjob.AppJobKey, X.HoC>] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.facebook.aura.startup.appjob.AppJobId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runSessionlessJob(int r23, java.lang.String r24, X.HtJ<? super kotlin.Unit> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.AuraStartupOrchestrator.runSessionlessJob(int, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121 A[LOOP:1: B:45:0x011b->B:47:0x0121, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runSessionlessJobs(com.facebook.aura.startup.appjob.ScopeFilter r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.AuraStartupOrchestrator.runSessionlessJobs(com.facebook.aura.startup.appjob.ScopeFilter, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ void start$default(AuraStartupOrchestrator auraStartupOrchestrator, ScopeFilter scopeFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            scopeFilter = ScopeFilter.FULL;
        }
        auraStartupOrchestrator.start(scopeFilter);
    }

    private final <T> T traceStartupJob(String str, AppJobKey appJobKey, StartupPhase startupPhase, Function0<? extends T> function0) {
        String strName = startupPhase.name();
        Locale locale = Locale.ROOT;
        String strA0j = FGI.A0j("job_", str, "_", strName.toLowerCase(locale), "_", appJobKey.getName().toLowerCase(locale));
        boolean zA1Z = AnonymousClass002.A1Z(startupPhase, StartupPhase.BLOCKING);
        if (zA1Z) {
            HatchStartupQpl.Companion.markerPoint(FGI.A0M(strA0j, "_start"));
        }
        if (Systrace.A09(1L)) {
            AuraSystrace.beginSection(strA0j);
        }
        try {
            try {
                T tInvoke = function0.invoke();
                if (zA1Z) {
                    HatchStartupQpl.Companion.markerPoint(FGI.A0M(strA0j, "_end"), C60O.A0s("SUCCESS", null));
                }
                return tInvoke;
            } catch (Exception e) {
                if (zA1Z) {
                    HatchStartupQpl.Companion companion = HatchStartupQpl.Companion;
                    String strA0M = FGI.A0M(strA0j, "_end");
                    String message = e.getMessage();
                    if (message == null) {
                        message = C3cI.A0Y(e);
                    }
                    companion.markerPoint(strA0M, C60O.A0s("FAILURE", message));
                }
                throw e;
            }
        } finally {
            if (Systrace.A09(1L)) {
                AuraSystrace.endSection();
            }
        }
    }

    private final void upgradeScope(AbstractC3358CGz abstractC3358CGz, ScopeFilter scopeFilter) {
        int[] iArr = (int[]) enabledSessionedKeys$delegate.getValue();
        ArrayList arrayListA0h = C3cG.A0h();
        for (int i : iArr) {
            ProcessScope processScopeA0C = AnonymousClass801.A0C(i);
            C7384Etj.A0U(processScopeA0C);
            if (processScopeA0C != ProcessScope.ALL_PROCESSES && INSTANCE.includes(scopeFilter, processScopeA0C)) {
                arrayListA0h.add(Integer.valueOf(i));
            }
        }
        if (arrayListA0h.isEmpty()) {
            return;
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj : arrayListA0h) {
            if (AnonymousClass801.A0I(((Number) obj).intValue()) == StartupPhase.BLOCKING) {
                arrayListA0h2.add(obj);
            }
        }
        ArrayList arrayListA0h3 = C3cG.A0h();
        for (Object obj2 : arrayListA0h) {
            if (AnonymousClass801.A0I(((Number) obj2).intValue()) == StartupPhase.NON_BLOCKING_CRITICAL_PRIORITY) {
                arrayListA0h3.add(obj2);
            }
        }
        ArrayList arrayListA0h4 = C3cG.A0h();
        for (Object obj3 : arrayListA0h) {
            if (AnonymousClass801.A0I(((Number) obj3).intValue()) == StartupPhase.NON_BLOCKING_HIGH_PRIORITY) {
                arrayListA0h4.add(obj3);
            }
        }
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator it = arrayListA0h2.iterator();
        while (it.hasNext()) {
            linkedHashSetA0k.add(AnonymousClass801.A0B(((Number) it.next()).intValue()));
        }
        AnonymousClass001.A1J(new C140021(abstractC3358CGz, arrayListA0h3, linkedHashSetA0k, C3cG.A0k(), C3cG.A0k(), arrayListA0h2, arrayListA0h4, null), scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void watchForegroundService() {
        AnonymousClass001.A1J(new C140031(null), scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScopeFilter widenScopeFilter(final ScopeFilter scopeFilter) {
        ScopeFilter andUpdate = latestScopeFilter.getAndUpdate(new UnaryOperator() { // from class: com.facebook.aura.startup.AuraStartupOrchestrator.widenScopeFilter.1
            @Override // java.util.function.Function
            public final ScopeFilter apply(ScopeFilter scopeFilter2) {
                C7384Etj.A0X(scopeFilter2);
                return (ScopeFilter) HrB.A01(scopeFilter2, scopeFilter);
            }
        });
        C7384Etj.A0U(andUpdate);
        return andUpdate;
    }

    public final C1BN<Boolean> isInitialized() {
        return isUiBlockingReady;
    }

    public final C1BN<Boolean> isUiBlockingReady() {
        return isUiBlockingReady;
    }

    public final void notifyInitialContentRendered() {
        HtJ htJA13 = AnonymousClass006.A13(lowPrioritySessionlessJob);
        C3UX c3ux = scope;
        lowPrioritySessionlessJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new AnonymousClass1(htJA13), c3ux);
    }

    public final void refreshIfNeeded() {
        AuraSessionManager.SessionState value = AuraSessionManager.state.getValue();
        if (value instanceof AuraSessionManager.SessionState.Active) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            AbstractC3358CGz abstractC3358CGz = ((AuraSessionManager.SessionState.Active) value).session;
            int[] iArr = (int[]) enabledSessionedKeys$delegate.getValue();
            ArrayList arrayListA0h = C3cG.A0h();
            for (int i : iArr) {
                AppJobKey appJobKeyA0B = AnonymousClass801.A0B(i);
                C7384Etj.A0U(appJobKeyA0B);
                ResumePolicy resumePolicyA0E = AnonymousClass801.A0E(i);
                C7384Etj.A0U(resumePolicyA0E);
                if (INSTANCE.shouldRunOnResume(resumePolicyA0E, lastSuccessAtMs.get(appJobKeyA0B), jElapsedRealtime)) {
                    arrayListA0h.add(Integer.valueOf(i));
                }
            }
            if (!arrayListA0h.isEmpty()) {
                ArrayList arrayListA0m = AnonymousClass002.A0m(arrayListA0h);
                Iterator it = arrayListA0h.iterator();
                while (it.hasNext()) {
                    arrayListA0m.add(AnonymousClass801.A0B(((Number) it.next()).intValue()));
                }
                Iterator it2 = arrayListA0h.iterator();
                while (it2.hasNext()) {
                    GAo.A02(C79.A00, AuraDispatchers.INSTANCE.io(), new AuraStartupOrchestrator$refreshIfNeeded$2$1(((Number) it2.next()).intValue(), abstractC3358CGz, null), scope);
                }
            }
            int[] iArr2 = (int[]) enabledSessionlessKeys$delegate.getValue();
            ArrayList arrayListA0h2 = C3cG.A0h();
            for (int i2 : iArr2) {
                AppJobId appJobIdA0A = AnonymousClass801.A0A(i2);
                ResumePolicy resumePolicyA0F = AnonymousClass801.A0F(i2);
                C7384Etj.A0U(resumePolicyA0F);
                if (INSTANCE.shouldRunOnResume(resumePolicyA0F, lastSuccessAtMs.get(appJobIdA0A), jElapsedRealtime)) {
                    arrayListA0h2.add(Integer.valueOf(i2));
                }
            }
            if (arrayListA0h2.isEmpty()) {
                return;
            }
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0h2);
            Iterator it3 = arrayListA0h2.iterator();
            while (it3.hasNext()) {
                arrayListA0m2.add(AnonymousClass801.A0A(((Number) it3.next()).intValue()));
            }
            Iterator it4 = arrayListA0h2.iterator();
            while (it4.hasNext()) {
                GAo.A02(C79.A00, AuraDispatchers.INSTANCE.io(), new AuraStartupOrchestrator$refreshIfNeeded$4$1(((Number) it4.next()).intValue(), null), scope);
            }
        }
    }

    public final void startBackground() {
        start(ScopeFilter.ALL_PROCESSES_ONLY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<List<Integer>> computeWaves(List<Integer> list, G0U<? super Integer, ? extends AppJobKey> g0u, G0U<? super Integer, ? extends List<? extends AppJobKey>> g0u2) {
        if (list.isEmpty()) {
            return C0881AGi.A00;
        }
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSetA0k.add(g0u.invoke(Integer.valueOf(it.next().intValue())));
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(list));
        for (Integer num : list) {
            Integer numValueOf = Integer.valueOf(num.intValue());
            List<? extends AppJobKey> listInvoke = g0u2.invoke(numValueOf);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listInvoke) {
                if (linkedHashSetA0k.contains(obj)) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                AppJobKey appJobKeyInvoke = g0u.invoke(numValueOf);
                StringBuilder sb = new StringBuilder("Job ");
                sb.append(appJobKeyInvoke);
                sb.append(" declares dependsOn=");
                sb.append(arrayList2);
                sb.append(" not in this partition; ignoring");
                CFK.A06(AuraStartupOrchestratorKt.TAG, sb.toString());
            }
            linkedHashMapA15.put(num, AbstractC0878AGe.A0g(arrayList));
        }
        LinkedHashSet linkedHashSetA0k2 = C3cG.A0k();
        ArrayList arrayList3 = new ArrayList(list);
        ArrayList arrayListA0h = C3cG.A0h();
        while (!arrayList3.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Iterable iterable = (Iterable) AbstractC2258BHp.A0L(Integer.valueOf(((Number) next).intValue()), linkedHashMapA15);
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        if (!linkedHashSetA0k2.contains(it3.next())) {
                            break;
                        }
                    }
                }
                arrayList4.add(next);
            }
            if (arrayList4.isEmpty()) {
                ArrayList arrayListA0m = AnonymousClass002.A0m(arrayList3);
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    arrayListA0m.add(g0u.invoke(Integer.valueOf(((Number) it4.next()).intValue())));
                }
                CFK.A04(AuraStartupOrchestratorKt.TAG, AnonymousClass001.A0v(" in a single wave", C3cG.A0f(arrayListA0m, "Cycle detected in startup job dependsOn; running remaining ")));
                arrayListA0h.add(AbstractC0878AGe.A0X(arrayList3));
                return arrayListA0h;
            }
            arrayListA0h.add(arrayList4);
            ArrayList arrayList5 = new ArrayList(Hr7.A1D(arrayList4, 10));
            Iterator it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                arrayList5.add(g0u.invoke(Integer.valueOf(((Number) it5.next()).intValue())));
            }
            AbstractC0882AGj.A0r(arrayList5, linkedHashSetA0k2);
            AbstractC0882AGj.A0s(AbstractC0878AGe.A0g(arrayList4), arrayList3);
        }
        return arrayListA0h;
    }

    private final List<Integer> filterSessionedByScope(int[] iArr, ScopeFilter scopeFilter) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (int i : iArr) {
            AuraStartupOrchestrator auraStartupOrchestrator = INSTANCE;
            ProcessScope processScopeA0C = AnonymousClass801.A0C(i);
            C7384Etj.A0U(processScopeA0C);
            if (auraStartupOrchestrator.includes(scopeFilter, processScopeA0C)) {
                arrayListA0h.add(Integer.valueOf(i));
            }
        }
        return arrayListA0h;
    }

    private final List<Integer> filterSessionlessByScope(int[] iArr, ScopeFilter scopeFilter) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (int i : iArr) {
            AuraStartupOrchestrator auraStartupOrchestrator = INSTANCE;
            ProcessScope processScopeA0D = AnonymousClass801.A0D(i);
            C7384Etj.A0U(processScopeA0D);
            if (auraStartupOrchestrator.includes(scopeFilter, processScopeA0D)) {
                arrayListA0h.add(Integer.valueOf(i));
            }
        }
        return arrayListA0h;
    }

    private final boolean includes(ScopeFilter scopeFilter, ProcessScope processScope) {
        int iOrdinal = scopeFilter.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 1) {
                if (iOrdinal != 0) {
                    throw new NoWhenBranchMatchedException();
                }
                if (processScope == ProcessScope.ALL_PROCESSES) {
                }
            } else if (processScope != ProcessScope.FOREGROUND_ONLY) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchReadyActivatingJobs(AbstractC3358CGz abstractC3358CGz, List<Integer> list, Set<? extends AppJobKey> set, Set<? extends AppJobKey> set2, Set<Integer> set3, String str) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (!set3.contains(numValueOf)) {
                List<AppJobId> listA0Q = AnonymousClass801.A0Q(iIntValue);
                C7384Etj.A0U(listA0Q);
                ArrayList arrayList = new ArrayList();
                for (AppJobId appJobId : listA0Q) {
                    if (set.contains(appJobId) && !set2.contains(appJobId)) {
                        arrayList.add(appJobId);
                    }
                }
                if (arrayList.isEmpty()) {
                    set3.add(numValueOf);
                    C3UX c3ux = scope;
                    GAo.A02(C79.A00, AuraDispatchers.INSTANCE.io(), new AuraStartupOrchestrator$launchReadyActivatingJobs$1$1(iIntValue, abstractC3358CGz, str, null), c3ux);
                }
            }
        }
    }

    private final void onActive(AbstractC3358CGz abstractC3358CGz, ScopeFilter scopeFilter) {
        launchHighPrioritySessionedJobs(abstractC3358CGz, scopeFilter);
    }
}
