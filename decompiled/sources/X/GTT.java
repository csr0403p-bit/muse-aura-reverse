package X;

import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class GTT implements OverlayConfigLayerInterface {
    public final F0C A00 = C5322DgG.A01((Function0) new FZP(this, 9));

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public final /* synthetic */ int[] getUpdatedValues() {
        return new int[0];
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public final int getLayerSource() {
        return 28;
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public final int[] getValues() {
        return (int[]) C7384Etj.A0G(this.A00);
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public final void logExposure(int i) {
    }
}
