package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$isActive$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ Object $key;
    public final /* synthetic */ HatchGalleryClipPlayback $playback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$isActive$2$1(HatchGalleryClipPlayback hatchGalleryClipPlayback, Object obj) {
        super(0);
        this.$playback = hatchGalleryClipPlayback;
        this.$key = obj;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$playback.isActive$fbandroid_express_aura_java_com_facebook_aura_maps_impl_impl(this.$key));
    }
}
