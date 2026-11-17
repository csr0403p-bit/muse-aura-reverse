package com.facebook.aura.maps;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.maps.HatchMapMarkerImageProvider;
import com.facebook.aura.maps.cache.HatchPlaceImageState;
import com.meta.maps.display.Image;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.maps.HatchMapMarkerImageProvider$getImage$4$1$image$1", f = "HatchMapMarkerImageProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchMapMarkerImageProvider$getImage$4$1$image$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Image>, Object> {
    public final /* synthetic */ HatchMapMarkerImageProvider.Request $request;
    public final /* synthetic */ HatchPlaceImageState $state;
    public int label;
    public final /* synthetic */ HatchMapMarkerImageProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMapMarkerImageProvider$getImage$4$1$image$1(HatchMapMarkerImageProvider hatchMapMarkerImageProvider, HatchMapMarkerImageProvider.Request request, HatchPlaceImageState hatchPlaceImageState, HtJ<? super HatchMapMarkerImageProvider$getImage$4$1$image$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchMapMarkerImageProvider;
        this.$request = request;
        this.$state = hatchPlaceImageState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMapMarkerImageProvider$getImage$4$1$image$1(this.this$0, this.$request, this.$state, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        HatchMapMarkerImageProvider hatchMapMarkerImageProvider = this.this$0;
        HatchMapMarkerImageProvider.Request request = this.$request;
        return hatchMapMarkerImageProvider.useAsImage(request.renderer.render(request.isSelected, request.isDarkMode, ((HatchPlaceImageState.Loaded) this.$state).bitmap), this.$request);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Image> htJ) {
        return ((HatchMapMarkerImageProvider$getImage$4$1$image$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
