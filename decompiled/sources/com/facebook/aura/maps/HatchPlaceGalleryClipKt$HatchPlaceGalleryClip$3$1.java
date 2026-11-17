package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Object $key;
    public final /* synthetic */ HatchGalleryClipPlayback $playback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$3$1(HatchGalleryClipPlayback hatchGalleryClipPlayback, Object obj) {
        super(1);
        this.$playback = hatchGalleryClipPlayback;
        this.$key = obj;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final HatchGalleryClipPlayback hatchGalleryClipPlayback = this.$playback;
        final Object obj = this.$key;
        return new C78g() { // from class: com.facebook.aura.maps.HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchGalleryClipPlayback.report$fbandroid_express_aura_java_com_facebook_aura_maps_impl_impl(obj, null);
            }
        };
    }
}
