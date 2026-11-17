package com.facebook.aura.skills.repo;

import X.AHD;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightResult;
import com.facebook.aura.skills.model.Skill;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchConnectedConnectors$result$1", f = "HatchConnectorCatalogRepository.kt", l = {417}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConnectorCatalogRepository$fetchConnectedConnectors$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends AHD<? extends Skill>>>, Object> {
    public final /* synthetic */ long $generation;
    public int label;
    public final /* synthetic */ HatchConnectorCatalogRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCatalogRepository$fetchConnectedConnectors$result$1(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, long j, HtJ<? super HatchConnectorCatalogRepository$fetchConnectedConnectors$result$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchConnectorCatalogRepository;
        this.$generation = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConnectorCatalogRepository$fetchConnectedConnectors$result$1(this.this$0, this.$generation, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends AHD<? extends Skill>>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<? extends AHD<Skill>>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchConnectorCatalogRepository hatchConnectorCatalogRepository = this.this$0;
            SingleFlight singleFlight = hatchConnectorCatalogRepository.requests;
            long j = this.$generation;
            HxE hxE = new HxE("connected-traversal", new Long(j));
            HatchConnectorCatalogRepository$fetchConnectedConnectors$result$1$flight$1 hatchConnectorCatalogRepository$fetchConnectedConnectors$result$1$flight$1 = new HatchConnectorCatalogRepository$fetchConnectedConnectors$result$1$flight$1(hatchConnectorCatalogRepository, j, null);
            this.label = 1;
            obj = singleFlight.invoke(hxE, hatchConnectorCatalogRepository$fetchConnectedConnectors$result$1$flight$1, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        SingleFlightResult singleFlightResult = (SingleFlightResult) obj;
        C7384Etj.A0Z(singleFlightResult, "null cannot be cast to non-null type com.facebook.aura.common.coroutines.SingleFlightResult.Result<kotlin.Result<kotlinx.collections.immutable.ImmutableList<com.facebook.aura.skills.model.Skill>>>");
        return ((SingleFlightResult.Result) singleFlightResult).value;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<? extends AHD<Skill>>> htJ) {
        return ((HatchConnectorCatalogRepository$fetchConnectedConnectors$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
