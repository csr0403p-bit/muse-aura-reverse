package com.facebook.aura.skills.repo;

import X.AGH;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFI;
import X.C10571Hud;
import X.C3UX;
import X.C7384Etj;
import X.C9hr;
import X.C9jH;
import X.EnumC10460Hji;
import X.F0C;
import X.G0U;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.HwV;
import X.Hwg;
import X.HxE;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightResult;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.skills.model.ConnectorCatalogPage;
import com.facebook.aura.skills.model.ConnectorCatalogQuery;
import java.util.Arrays;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$searchConnectors-BWLJW6A$$inlined$request-hUnOzRk$default$1", f = "HatchConnectorCatalogRepository.kt", l = {500}, m = "invokeSuspend", v = 2)
/* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$searchConnectors-BWLJW6A$$inlined$request-hUnOzRk$default$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class HatchConnectorCatalogRepository$searchConnectorsBWLJW6A$$inlined$requesthUnOzRk$default$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends ConnectorCatalogPage>>, Object> {
    public final /* synthetic */ String $cursor$inlined;
    public final /* synthetic */ JarvisPath $endpoint;
    public final /* synthetic */ long $generation;
    public final /* synthetic */ ConnectorCatalogQuery $query;
    public final /* synthetic */ HxE[] $queryParams;
    public final /* synthetic */ ConnectorCatalogQuery.Search $requestQuery$inlined;
    public int label;
    public final /* synthetic */ HatchConnectorCatalogRepository this$0;
    public final /* synthetic */ HatchConnectorCatalogRepository this$0$inline_fun;

    @DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$searchConnectors-BWLJW6A$$inlined$request-hUnOzRk$default$1$1", f = "HatchConnectorCatalogRepository.kt", l = {569}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$searchConnectors-BWLJW6A$$inlined$request-hUnOzRk$default$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends ConnectorCatalogPage>>, Object> {
        public final /* synthetic */ String $cursor$inlined;
        public final /* synthetic */ JarvisPath $endpoint;
        public final /* synthetic */ long $generation;
        public final /* synthetic */ HxE[] $queryParams;
        public final /* synthetic */ ConnectorCatalogQuery.Search $requestQuery$inlined;
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
        public final /* synthetic */ HatchConnectorCatalogRepository this$0;
        public final /* synthetic */ HatchConnectorCatalogRepository this$0$inline_fun;

        /* renamed from: com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$searchConnectors-BWLJW6A$$inlined$request-hUnOzRk$default$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03701 extends AbstractC7559F3s implements Function0<C9hr<ConnectorCatalogPageJson>> {
            public static final C03701 INSTANCE = new C03701();

            public C03701() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<ConnectorCatalogPageJson> invoke() {
                F0C<C9hr<Object>>[] f0cArr = ConnectorCatalogPageJson.$childSerializers;
                return ConnectorCatalogPageJson$$serializer.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ C9hr<ConnectorCatalogPageJson> invoke() {
                F0C<C9hr<Object>>[] f0cArr = ConnectorCatalogPageJson.$childSerializers;
                return ConnectorCatalogPageJson$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HxE[] hxEArr, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, JarvisPath jarvisPath, long j, HtJ htJ, HatchConnectorCatalogRepository hatchConnectorCatalogRepository2, ConnectorCatalogQuery.Search search, String str) {
            super(1, htJ);
            this.$queryParams = hxEArr;
            this.this$0$inline_fun = hatchConnectorCatalogRepository;
            this.$endpoint = jarvisPath;
            this.$generation = j;
            this.this$0 = hatchConnectorCatalogRepository2;
            this.$requestQuery$inlined = search;
            this.$cursor$inlined = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(this.$queryParams, this.this$0$inline_fun, this.$endpoint, this.$generation, htJ, this.this$0, this.$requestQuery$inlined, this.$cursor$inlined);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                RequestType requestType = RequestType.GET;
                HxE[] hxEArr = this.$queryParams;
                HxE<String, ? extends Object>[] hxEArr2 = (HxE[]) Arrays.copyOf(hxEArr, hxEArr.length);
                AbstractC3358CGz abstractC3358CGz = this.this$0$inline_fun.userSession;
                JarvisPath jarvisPath = this.$endpoint;
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                C03701 c03701 = C03701.INSTANCE;
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
                objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(c03701, false, jarvisPath, requestType, abstractC3358CGz, null, hxEArr2, null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            long j = this.$generation;
            if (!(objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud)) {
                try {
                    HatchConnectorCatalogRepository hatchConnectorCatalogRepository = this.this$0;
                    ConnectorCatalogCache connectorCatalogCache = hatchConnectorCatalogRepository.cache;
                    ConnectorCatalogQuery.Search search = this.$requestQuery$inlined;
                    String str = this.$cursor$inlined;
                    ConnectorCatalogPage page = hatchConnectorCatalogRepository.toPage((ConnectorCatalogPageJson) objM1595executeBodylessJarvisRequestWithp3iPjrY);
                    objM1595executeBodylessJarvisRequestWithp3iPjrY = connectorCatalogCache.putPage(j, search, str, page.copy(page.category, AHI.A01, page.connectors, page.nextCursor, page.totalCount));
                } catch (Throwable th) {
                    objM1595executeBodylessJarvisRequestWithp3iPjrY = new C10571Hud(th);
                }
            }
            return new HsJ(objM1595executeBodylessJarvisRequestWithp3iPjrY);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super HsJ<? extends ConnectorCatalogPage>> htJ) {
            return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCatalogRepository$searchConnectorsBWLJW6A$$inlined$requesthUnOzRk$default$1(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, JarvisPath jarvisPath, HxE[] hxEArr, ConnectorCatalogQuery connectorCatalogQuery, long j, HtJ htJ, HatchConnectorCatalogRepository hatchConnectorCatalogRepository2, ConnectorCatalogQuery.Search search, String str) {
        super(2, htJ);
        this.this$0$inline_fun = hatchConnectorCatalogRepository;
        this.$endpoint = jarvisPath;
        this.$queryParams = hxEArr;
        this.$query = connectorCatalogQuery;
        this.$generation = j;
        this.this$0 = hatchConnectorCatalogRepository2;
        this.$requestQuery$inlined = search;
        this.$cursor$inlined = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConnectorCatalogRepository$searchConnectorsBWLJW6A$$inlined$requesthUnOzRk$default$1(this.this$0$inline_fun, this.$endpoint, this.$queryParams, this.$query, this.$generation, htJ, this.this$0, this.$requestQuery$inlined, this.$cursor$inlined);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objInvoke = obj;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(objInvoke);
            SingleFlight singleFlight = this.this$0$inline_fun.requests;
            HxE hxE = new HxE(this.$endpoint, BFI.A0G(this.$queryParams));
            ConnectorCatalogQuery connectorCatalogQuery = this.$query;
            long j = this.$generation;
            HwV hwV = new HwV(hxE, connectorCatalogQuery, new Long(j));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$queryParams, this.this$0$inline_fun, this.$endpoint, j, null, this.this$0, this.$requestQuery$inlined, this.$cursor$inlined);
            this.label = 1;
            objInvoke = singleFlight.invoke(hwV, anonymousClass1, this);
            if (objInvoke == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(objInvoke);
        }
        SingleFlightResult singleFlightResult = (SingleFlightResult) objInvoke;
        C7384Etj.A0Z(singleFlightResult, "null cannot be cast to non-null type com.facebook.aura.common.coroutines.SingleFlightResult.Result<kotlin.Result<R of com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.request>>");
        return ((SingleFlightResult.Result) singleFlightResult).value;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends ConnectorCatalogPage>> htJ) {
        return ((HatchConnectorCatalogRepository$searchConnectorsBWLJW6A$$inlined$requesthUnOzRk$default$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
