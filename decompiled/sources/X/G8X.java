package X;

import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;

/* loaded from: classes6.dex */
public final class G8X implements OverlayConfigLayerInterface {
    public final G8W A00;

    public G8X(G8W g8w) {
        C7384Etj.A0Y(g8w, 0);
        this.A00 = g8w;
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public final /* synthetic */ int[] getUpdatedValues() {
        return new int[0];
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public final int getLayerSource() {
        return 45;
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public final int[] getValues() {
        return AbstractC7607F5u.A1a(this.A00.A00, 6465);
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public final void logExposure(int i) {
    }
}
