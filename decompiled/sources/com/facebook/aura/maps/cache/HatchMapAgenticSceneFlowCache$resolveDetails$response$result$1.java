package com.facebook.aura.maps.cache;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.maps.data.HatchPlaceDetailsLoadResult;
import com.facebook.aura.maps.data.HatchPlaceDetailsLoader;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache$resolveDetails$response$result$1", f = "HatchMapAgenticSceneFlowCache.kt", l = {104}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchMapAgenticSceneFlowCache$resolveDetails$response$result$1 extends AbstractC07127nr implements G0U<HtJ<? super HatchPlaceDetailsLoadResult>, Object> {
    public final /* synthetic */ String $placeId;
    public int label;
    public final /* synthetic */ HatchMapAgenticSceneFlowCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMapAgenticSceneFlowCache$resolveDetails$response$result$1(HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache, String str, HtJ<? super HatchMapAgenticSceneFlowCache$resolveDetails$response$result$1> htJ) {
        super(1, htJ);
        this.this$0 = hatchMapAgenticSceneFlowCache;
        this.$placeId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchMapAgenticSceneFlowCache$resolveDetails$response$result$1(this.this$0, this.$placeId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache = this.this$0;
            HatchPlaceDetailsLoader hatchPlaceDetailsLoader = hatchMapAgenticSceneFlowCache.detailsLoader;
            String str = this.$placeId;
            String str2 = hatchMapAgenticSceneFlowCache.scene.motivation;
            this.label = 1;
            obj = hatchPlaceDetailsLoader.load(str, str2, this);
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

    @Override // X.G0U
    public final Object invoke(HtJ<? super HatchPlaceDetailsLoadResult> htJ) {
        return ((HatchMapAgenticSceneFlowCache$resolveDetails$response$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
