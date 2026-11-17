package com.facebook.aura.skills.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C10571Hud;
import X.C7384Etj;
import X.F60;
import X.G0U;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.network.api.JarvisPath;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [R] */
@DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$request$result$1$flight$1", f = "HatchConnectorCatalogRepository.kt", l = {569}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConnectorCatalogRepository$request$result$1$flight$1<R> extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends R>>, Object> {
    public final /* synthetic */ G0V<T, Long, R> $apply;
    public final /* synthetic */ JarvisPath $endpoint;
    public final /* synthetic */ long $generation;
    public final /* synthetic */ HxE<String, Object>[] $queryParams;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConnectorCatalogRepository$request$result$1$flight$1(HxE<String, ? extends Object>[] hxEArr, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, JarvisPath jarvisPath, G0V<? super T, ? super Long, ? extends R> g0v, long j, HtJ<? super HatchConnectorCatalogRepository$request$result$1$flight$1> htJ) {
        super(1, htJ);
        this.$queryParams = hxEArr;
        this.this$0 = hatchConnectorCatalogRepository;
        this.$endpoint = jarvisPath;
        this.$apply = g0v;
        this.$generation = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchConnectorCatalogRepository$request$result$1$flight$1(this.$queryParams, this.this$0, this.$endpoint, this.$apply, this.$generation, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HxE<String, Object>[] hxEArr = this.$queryParams;
            Arrays.copyOf(hxEArr, hxEArr.length);
            C7384Etj.A0P();
            throw F60.createAndThrow();
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Object objA0j = AnonymousClass002.A0j(obj);
        G0V<T, Long, R> g0v = this.$apply;
        long j = this.$generation;
        if (!(objA0j instanceof C10571Hud)) {
            try {
                objA0j = g0v.invoke(objA0j, new Long(j));
            } catch (Throwable th) {
                objA0j = new C10571Hud(th);
            }
        }
        return new HsJ(objA0j);
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        HxE<String, Object>[] hxEArr = this.$queryParams;
        Arrays.copyOf(hxEArr, hxEArr.length);
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super HsJ<? extends R>> htJ) {
        return ((HatchConnectorCatalogRepository$request$result$1$flight$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
