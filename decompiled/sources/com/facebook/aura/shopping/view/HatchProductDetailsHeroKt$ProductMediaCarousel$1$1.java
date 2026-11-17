package com.facebook.aura.shopping.view;

import X.AHD;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.shopping.view.HatchProductDetailsHeroKt$ProductMediaCarousel$1$1", f = "HatchProductDetailsHero.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchProductDetailsHeroKt$ProductMediaCarousel$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AHD<String> $imageUrls;
    public final /* synthetic */ boolean $isMorphing;
    public final /* synthetic */ MutableState<AHD<String>> $settledImageUrls$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductDetailsHeroKt$ProductMediaCarousel$1$1(boolean z, AHD<String> ahd, MutableState<AHD<String>> mutableState, HtJ<? super HatchProductDetailsHeroKt$ProductMediaCarousel$1$1> htJ) {
        super(2, htJ);
        this.$isMorphing = z;
        this.$imageUrls = ahd;
        this.$settledImageUrls$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchProductDetailsHeroKt$ProductMediaCarousel$1$1(this.$isMorphing, this.$imageUrls, this.$settledImageUrls$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (!this.$isMorphing) {
            this.$settledImageUrls$delegate.Af8(this.$imageUrls);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchProductDetailsHeroKt$ProductMediaCarousel$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
