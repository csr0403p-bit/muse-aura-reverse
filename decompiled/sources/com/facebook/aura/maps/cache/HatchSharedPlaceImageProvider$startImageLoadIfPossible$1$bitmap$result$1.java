package com.facebook.aura.maps.cache;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider$startImageLoadIfPossible$1$bitmap$result$1", f = "HatchMapAgenticSceneFlowCache.kt", l = {237}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchSharedPlaceImageProvider$startImageLoadIfPossible$1$bitmap$result$1 extends AbstractC07127nr implements G0U<HtJ<? super Bitmap>, Object> {
    public final /* synthetic */ String $imageUrl;
    public int label;
    public final /* synthetic */ HatchSharedPlaceImageProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSharedPlaceImageProvider$startImageLoadIfPossible$1$bitmap$result$1(HatchSharedPlaceImageProvider hatchSharedPlaceImageProvider, String str, HtJ<? super HatchSharedPlaceImageProvider$startImageLoadIfPossible$1$bitmap$result$1> htJ) {
        super(1, htJ);
        this.this$0 = hatchSharedPlaceImageProvider;
        this.$imageUrl = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchSharedPlaceImageProvider$startImageLoadIfPossible$1$bitmap$result$1(this.this$0, this.$imageUrl, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchPlaceBitmapLoader hatchPlaceBitmapLoader = this.this$0.imageLoader;
            String str = this.$imageUrl;
            this.label = 1;
            obj = hatchPlaceBitmapLoader.load(str, this);
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
    public final Object invoke(HtJ<? super Bitmap> htJ) {
        return ((HatchSharedPlaceImageProvider$startImageLoadIfPossible$1$bitmap$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
