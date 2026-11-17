package com.facebook.aura.skills.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BFI;
import X.C3UX;
import X.C7384Etj;
import X.F60;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.common.coroutines.SingleFlightResult;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.skills.model.ConnectorCatalogQuery;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [R] */
@DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$request$result$1", f = "HatchConnectorCatalogRepository.kt", l = {500}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConnectorCatalogRepository$request$result$1<R> extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends R>>, Object> {
    public final /* synthetic */ G0V<T, Long, R> $apply;
    public final /* synthetic */ JarvisPath $endpoint;
    public final /* synthetic */ long $generation;
    public final /* synthetic */ ConnectorCatalogQuery $query;
    public final /* synthetic */ HxE<String, Object>[] $queryParams;
    public int label;
    public final /* synthetic */ HatchConnectorCatalogRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConnectorCatalogRepository$request$result$1(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, JarvisPath jarvisPath, HxE<String, ? extends Object>[] hxEArr, ConnectorCatalogQuery connectorCatalogQuery, long j, G0V<? super T, ? super Long, ? extends R> g0v, HtJ<? super HatchConnectorCatalogRepository$request$result$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchConnectorCatalogRepository;
        this.$endpoint = jarvisPath;
        this.$queryParams = hxEArr;
        this.$query = connectorCatalogQuery;
        this.$generation = j;
        this.$apply = g0v;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConnectorCatalogRepository$request$result$1(this.this$0, this.$endpoint, this.$queryParams, this.$query, this.$generation, this.$apply, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            BFI.A0G(this.$queryParams);
            C7384Etj.A0P();
            throw F60.createAndThrow();
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        SingleFlightResult singleFlightResult = (SingleFlightResult) obj;
        C7384Etj.A0Z(singleFlightResult, "null cannot be cast to non-null type com.facebook.aura.common.coroutines.SingleFlightResult.Result<kotlin.Result<R of com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.request>>");
        return ((SingleFlightResult.Result) singleFlightResult).value;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        BFI.A0G(this.$queryParams);
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends R>> htJ) {
        return ((HatchConnectorCatalogRepository$request$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
