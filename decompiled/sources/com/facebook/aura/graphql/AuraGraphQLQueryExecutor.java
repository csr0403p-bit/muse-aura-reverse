package com.facebook.aura.graphql;

import X.AbstractC05643uj;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7555F3i;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C20Q;
import X.C5108DYi;
import X.C7384Etj;
import X.C7541F0t;
import X.C7Bm;
import X.C8fm;
import X.CFK;
import X.CPS;
import X.DYI;
import X.DYg;
import X.DYp;
import X.DYq;
import X.DZD;
import X.E8f;
import X.EDJ;
import X.EQe;
import X.EZ9;
import X.EnumC10460Hji;
import X.EnumC3451CNw;
import X.F0C;
import X.F0T;
import X.F1G;
import X.F3D;
import X.F57;
import X.G0V;
import X.G6I;
import X.GBL;
import X.HtJ;
import X.Hwg;
import X.HyO;
import X.InterfaceC2619Bfl;
import X.InterfaceC5106DYe;
import X.InterfaceC5107DYf;
import X.RunnableC5111DYn;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.checkpoint.HatchCheckpointRepository;
import com.facebook.graphql.error.GraphQLErrorException;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoGraphQLServiceJNI;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraGraphQLQueryExecutor implements InterfaceC5107DYf {
    public static final int API_EC_PARAM_ACCESS_TOKEN = 190;
    public static final int CHECKPOINT_GRAPHQL_CODE = 3571065;
    public static final Companion Companion = new Companion();
    public static final String TAG = "AuraGraphQLQueryExecutor";
    public final DYp queryExecutor;

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final Throwable ensureException(Throwable th, AuraSessionManager.SessionSnapshot sessionSnapshot) {
            if (th instanceof GraphQLErrorException.GraphQLResponseError) {
                int i = ((GraphQLErrorException.GraphQLResponseError) th).code;
                if (i == 190) {
                    CFK.A06(AuraGraphQLQueryExecutor.TAG, "Invalid access token (code 190), conditionally signing out");
                    if (sessionSnapshot != null) {
                        AuraSessionManager.INSTANCE.signOutForGraphQLAuthFailureIfCurrent(sessionSnapshot.session, sessionSnapshot.accessToken, sessionSnapshot.frlFingerprint);
                    }
                } else if (i == 3571065) {
                    reportCheckpoint();
                }
            }
            return th instanceof Exception ? th : new IOException(th.getMessage(), th.getCause());
        }

        private final void reportCheckpoint() {
            AbstractC3358CGz currentSession = AuraSessionManager.INSTANCE.getCurrentSession();
            if (currentSession == null) {
                CFK.A06(AuraGraphQLQueryExecutor.TAG, "Checkpoint detected with no session, nothing to block");
            } else {
                CFK.A06(AuraGraphQLQueryExecutor.TAG, "Checkpoint detected on a GraphQL call");
                HatchCheckpointRepository.Companion.getInstance(currentSession).onBlocked(null);
            }
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.facebook.aura.graphql.AuraGraphQLQueryExecutor$asFlow$1", f = "AuraGraphQLQueryExecutor.kt", l = {79}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.graphql.AuraGraphQLQueryExecutor$asFlow$1, reason: invalid class name */
    public final class AnonymousClass1<T> extends AbstractC07127nr implements G0V<HyO<? super AbstractC7555F3i<? extends F1G<T>, ? extends Throwable>>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ DYI<T> $request;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* renamed from: com.facebook.aura.graphql.AuraGraphQLQueryExecutor$asFlow$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01811 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ InterfaceC5106DYe $token;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01811(InterfaceC5106DYe interfaceC5106DYe) {
                super(0);
                this.$token = interfaceC5106DYe;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$token.cancel();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DYI<T> dyi, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$request = dyi;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = AuraGraphQLQueryExecutor.this.new AnonymousClass1(this.$request, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            final HyO hyO = (HyO) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C01811 c01811 = new C01811(AuraGraphQLQueryExecutor.this.execute(this.$request, new F0T() { // from class: com.facebook.aura.graphql.AuraGraphQLQueryExecutor$asFlow$1$token$1
                    @Override // X.F0T
                    public final void invoke(F1G<T> f1g) {
                        C7384Etj.A0Y(f1g, 0);
                        hyO.AhZ(new F3D(f1g));
                    }
                }, new CPS() { // from class: com.facebook.aura.graphql.AuraGraphQLQueryExecutor$asFlow$1$token$2
                    @Override // X.CPS
                    public final void invoke(Throwable th) {
                        C7384Etj.A0Y(th, 0);
                        hyO.AhZ(new C7541F0t(th));
                    }
                }, EnumC3451CNw.A01));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (C8fm.A00(this, c01811, hyO) == enumC10460Hji) {
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
        public final Object invoke(HyO<? super AbstractC7555F3i<? extends F1G<T>, ? extends Throwable>> hyO, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(hyO, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AuraGraphQLQueryExecutor(DYp dYp) {
        C7384Etj.A0Y(dYp, 0);
        this.queryExecutor = dYp;
    }

    public final <T extends InterfaceC2619Bfl> C20Q<AbstractC7555F3i<F1G<T>, Throwable>> asFlow(DYI<T> dyi) {
        C7384Etj.A0Y(dyi, 0);
        return AbstractC05643uj.A00(new AnonymousClass1(dyi, null));
    }

    @Override // X.InterfaceC5107DYf
    public /* bridge */ <T> ListenableFuture<F1G<T>> asFuture(DYI<T> dyi, Executor executor) {
        int iA0C = AnonymousClass002.A0C(dyi, executor, 1);
        SettableFuture settableFuture = new SettableFuture();
        C5108DYi c5108DYi = new C5108DYi(settableFuture);
        settableFuture.addListener(new RunnableC5111DYn(execute(dyi, new E8f(c5108DYi, iA0C), new F57(c5108DYi, iA0C), executor)), EnumC3451CNw.A01);
        return settableFuture;
    }

    public /* bridge */ <T> C20Q<AbstractC7555F3i<F1G<T>, Throwable>> asSubscribingFlow(DYI<T> dyi, Executor executor) {
        AnonymousClass003.A0x(dyi, executor);
        return AbstractC05643uj.A00(new EZ9(this, dyi, executor, null, 1));
    }

    @Override // X.InterfaceC5107DYf
    public <T> InterfaceC5106DYe execute(DYI<T> dyi, F0T<T> f0t, CPS cps, Executor executor) {
        AnonymousClass005.A0y(dyi, f0t, executor);
        AuraSessionManager.SessionSnapshot currentSessionSnapshot = AuraSessionManager.INSTANCE.getCurrentSessionSnapshot();
        DYp dYp = this.queryExecutor;
        AuraGraphQLQueryExecutor$sam$com_facebook_graphql_query_interfaces_IGraphQLQueryExecutor_OnFailureCallback$0 auraGraphQLQueryExecutor$sam$com_facebook_graphql_query_interfaces_IGraphQLQueryExecutor_OnFailureCallback$0 = cps != null ? new AuraGraphQLQueryExecutor$sam$com_facebook_graphql_query_interfaces_IGraphQLQueryExecutor_OnFailureCallback$0(new AuraGraphQLQueryExecutor$execute$1$1(cps, currentSessionSnapshot)) : null;
        F0C<PandoGraphQLServiceJNI> f0c = dYp.A06;
        EDJ edj = new EDJ(f0t, auraGraphQLQueryExecutor$sam$com_facebook_graphql_query_interfaces_IGraphQLQueryExecutor_OnFailureCallback$0, executor, dYp, dyi, 2);
        if (f0c.AOX()) {
            return DYp.A00(auraGraphQLQueryExecutor$sam$com_facebook_graphql_query_interfaces_IGraphQLQueryExecutor_OnFailureCallback$0, executor, f0c, edj);
        }
        DZD dzd = new DZD();
        dYp.A03.execute(new DYq(auraGraphQLQueryExecutor$sam$com_facebook_graphql_query_interfaces_IGraphQLQueryExecutor_OnFailureCallback$0, dzd, executor, f0c, edj));
        return dzd;
    }

    @Override // X.InterfaceC5107DYf
    public <T> InterfaceC5106DYe executeAndSubscribe(DYI<T> dyi, F0T<T> f0t, CPS cps, Executor executor) {
        PandoGraphQLRequest pandoGraphQLRequest;
        AnonymousClass005.A0y(dyi, f0t, executor);
        AuraSessionManager.SessionSnapshot currentSessionSnapshot = AuraSessionManager.INSTANCE.getCurrentSessionSnapshot();
        DYp dYp = this.queryExecutor;
        AuraGraphQLQueryExecutor$sam$com_facebook_graphql_query_interfaces_IGraphQLQueryExecutor_OnFailureCallback$0 auraGraphQLQueryExecutor$sam$com_facebook_graphql_query_interfaces_IGraphQLQueryExecutor_OnFailureCallback$0 = cps != null ? new AuraGraphQLQueryExecutor$sam$com_facebook_graphql_query_interfaces_IGraphQLQueryExecutor_OnFailureCallback$0(new AuraGraphQLQueryExecutor$executeAndSubscribe$1$1(cps, currentSessionSnapshot)) : null;
        F0C<PandoGraphQLServiceJNI> f0c = ((dyi instanceof PandoGraphQLRequest) && (pandoGraphQLRequest = (PandoGraphQLRequest) dyi) != null && pandoGraphQLRequest.isSubscription()) ? dYp.A08 : dYp.A05;
        EDJ edj = new EDJ(f0t, auraGraphQLQueryExecutor$sam$com_facebook_graphql_query_interfaces_IGraphQLQueryExecutor_OnFailureCallback$0, executor, dYp, dyi, 2);
        if (f0c.AOX()) {
            return DYp.A00(auraGraphQLQueryExecutor$sam$com_facebook_graphql_query_interfaces_IGraphQLQueryExecutor_OnFailureCallback$0, executor, f0c, edj);
        }
        DZD dzd = new DZD();
        dYp.A03.execute(new DYq(auraGraphQLQueryExecutor$sam$com_facebook_graphql_query_interfaces_IGraphQLQueryExecutor_OnFailureCallback$0, dzd, executor, f0c, edj));
        return dzd;
    }

    @Override // X.InterfaceC5107DYf
    public /* bridge */ <T> Object asCoroutine(DYI<T> dyi, Executor executor, HtJ<? super AbstractC7555F3i<? extends F1G<T>, ? extends Throwable>> htJ) {
        InterfaceC5106DYe interfaceC5106DYe;
        GBL gblA03 = C7Bm.A03(htJ);
        AtomicReference atomicReferenceA16 = BV4.A16(null);
        DYg dYg = new DYg(atomicReferenceA16, gblA03);
        atomicReferenceA16.set(execute(dyi, new E8f(dYg, 0), new F57(dYg, 0), executor));
        if ((!(GBL.A04.get(gblA03) instanceof G6I)) && (interfaceC5106DYe = (InterfaceC5106DYe) atomicReferenceA16.getAndSet(null)) != null) {
            interfaceC5106DYe.cancel();
        }
        gblA03.AO2(new EQe(atomicReferenceA16, 7));
        return gblA03.A0F();
    }

    public /* bridge */ <T> C20Q<AbstractC7555F3i<F1G<T>, Throwable>> asFlow(DYI<T> dyi, Executor executor) {
        AnonymousClass003.A0x(dyi, executor);
        return AbstractC05643uj.A00(new EZ9(this, dyi, executor, null, 0));
    }
}
