package com.facebook.rtc.fbwebrtc.overlayconfig.djinni;

import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class OverlayConfigLayerDudImplementation implements OverlayConfigLayerInterface {
    public int fillValue;
    public final int[] mlayerArray;

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public /* synthetic */ int[] getUpdatedValues() {
        return new int[0];
    }

    public boolean equals(Object obj) {
        return (obj instanceof OverlayConfigLayerDudImplementation) && this.fillValue == ((OverlayConfigLayerDudImplementation) obj).fillValue;
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public int getLayerSource() {
        return 5;
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public int[] getValues() {
        return this.mlayerArray;
    }

    public int hashCode() {
        return 527 + this.fillValue;
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public void logExposure(int i) {
    }

    public OverlayConfigLayerDudImplementation(int i) {
        this.fillValue = i;
        int[] iArr = new int[6465];
        this.mlayerArray = iArr;
        Arrays.fill(iArr, i);
    }
}
