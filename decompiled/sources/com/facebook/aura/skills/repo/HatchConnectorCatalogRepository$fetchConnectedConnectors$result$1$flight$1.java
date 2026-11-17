package com.facebook.aura.skills.repo;

import X.AHD;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.skills.model.Skill;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$fetchConnectedConnectors$result$1$flight$1", f = "HatchConnectorCatalogRepository.kt", l = {418}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConnectorCatalogRepository$fetchConnectedConnectors$result$1$flight$1 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends AHD<? extends Skill>>>, Object> {
    public final /* synthetic */ long $generation;
    public int label;
    public final /* synthetic */ HatchConnectorCatalogRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCatalogRepository$fetchConnectedConnectors$result$1$flight$1(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, long j, HtJ<? super HatchConnectorCatalogRepository$fetchConnectedConnectors$result$1$flight$1> htJ) {
        super(1, htJ);
        this.this$0 = hatchConnectorCatalogRepository;
        this.$generation = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchConnectorCatalogRepository$fetchConnectedConnectors$result$1$flight$1(this.this$0, this.$generation, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM2109fetchAllConnectedPagesgIAlus;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchConnectorCatalogRepository hatchConnectorCatalogRepository = this.this$0;
            long j = this.$generation;
            this.label = 1;
            objM2109fetchAllConnectedPagesgIAlus = hatchConnectorCatalogRepository.m2109fetchAllConnectedPagesgIAlus(j, this);
            if (objM2109fetchAllConnectedPagesgIAlus == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM2109fetchAllConnectedPagesgIAlus = AnonymousClass001.A0q(obj);
        }
        return new HsJ(objM2109fetchAllConnectedPagesgIAlus);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HtJ<? super HsJ<? extends AHD<Skill>>> htJ) {
        return ((HatchConnectorCatalogRepository$fetchConnectedConnectors$result$1$flight$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends AHD<? extends Skill>>> htJ) {
        return invoke2((HtJ<? super HsJ<? extends AHD<Skill>>>) htJ);
    }
}
