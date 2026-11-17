package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C00r;
import X.C2LD;
import X.C2ae;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$observed$1$1 extends AbstractC7559F3s implements G0U<C2LD, Unit> {
    public final /* synthetic */ Object $key;
    public final /* synthetic */ C2ae[] $lastPosition;
    public final /* synthetic */ C00r $moveCount$delegate;
    public final /* synthetic */ HatchGalleryClipPlayback $playback;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2LD c2ld) {
        C7384Etj.A0Y(c2ld, 0);
        long j = c2ld.A02;
        this.$playback.report$fbandroid_express_aura_java_com_facebook_aura_maps_impl_impl(this.$key, C8j3.A1Q((c2ld.A00(C8j3.A0G(j), (int) j) > 0.5f ? 1 : (c2ld.A00(C8j3.A0G(j), (int) j) == 0.5f ? 0 : -1))) ? Float.valueOf(c2ld.A03().A01) : null);
        long jA01 = c2ld.A01();
        C2ae[] c2aeArr = this.$lastPosition;
        C2ae c2ae = c2aeArr[0];
        if (c2ae == null || jA01 != c2ae.A00) {
            c2aeArr[0] = C8j3.A0l(jA01);
            this.$moveCount$delegate.AdX(this.$moveCount$delegate.AGd() + 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$observed$1$1(HatchGalleryClipPlayback hatchGalleryClipPlayback, Object obj, C2ae[] c2aeArr, C00r c00r) {
        super(1);
        this.$playback = hatchGalleryClipPlayback;
        this.$key = obj;
        this.$lastPosition = c2aeArr;
        this.$moveCount$delegate = c00r;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2LD c2ld) {
        invoke2(c2ld);
        return Unit.INSTANCE;
    }
}
