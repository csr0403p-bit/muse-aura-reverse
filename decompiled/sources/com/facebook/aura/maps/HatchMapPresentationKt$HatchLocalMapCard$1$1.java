package com.facebook.aura.maps;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C8j4;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.maps.HatchMapPresentationKt$HatchLocalMapCard$1$1", f = "HatchMapPresentation.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchMapPresentationKt$HatchLocalMapCard$1$1 extends AbstractC07127nr implements G0V<String, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<G0U<String, Unit>> $currentOnArtifactSelected$delegate;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMapPresentationKt$HatchLocalMapCard$1$1(C1BO<? extends G0U<? super String, Unit>> c1bo, HtJ<? super HatchMapPresentationKt$HatchLocalMapCard$1$1> htJ) {
        super(2, htJ);
        this.$currentOnArtifactSelected$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchMapPresentationKt$HatchLocalMapCard$1$1 hatchMapPresentationKt$HatchLocalMapCard$1$1 = new HatchMapPresentationKt$HatchLocalMapCard$1$1(this.$currentOnArtifactSelected$delegate, htJ);
        hatchMapPresentationKt$HatchLocalMapCard$1$1.L$0 = obj;
        return hatchMapPresentationKt$HatchLocalMapCard$1$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        C8j4.A1J(this.$currentOnArtifactSelected$delegate, obj2);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(String str, HtJ<? super Unit> htJ) {
        return ((HatchMapPresentationKt$HatchLocalMapCard$1$1) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
