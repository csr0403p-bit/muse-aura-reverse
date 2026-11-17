package com.facebook.aura.partners.voice.session.impl;

import X.ADq;
import X.AbstractC7607F5u;
import X.BV6;
import X.G8R;
import X.G8S;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class HatchAppOverlayConfigLayer extends G8S {
    private final int[] buildValues() {
        int[] iArr = new int[6465];
        Arrays.fill(iArr, -1);
        iArr[1369] = joinRequestRetryMinBackoffS();
        iArr[6259] = 8000;
        iArr[6168] = 1;
        iArr[1300] = (int) VoiceGating.INSTANCE.getConnectTimeoutMs();
        iArr[1302] = 30000;
        return AbstractC7607F5u.A1a(iArr, 6465);
    }

    private final int joinRequestRetryMinBackoffS() {
        int iA02 = BV6.A02(VoiceGating.INSTANCE.getJoinRequestRetryMinBackoffS());
        ADq aDq = HatchCallControllerConfigKt.VALID_JOIN_REQUEST_RETRY_MIN_BACKOFF_S;
        int i = aDq.A00;
        if (iA02 > aDq.A01 || i > iA02) {
            return 4;
        }
        return iA02;
    }

    @Override // X.G8S
    public long fetchMC(long j) {
        return -1L;
    }

    @Override // X.G8S, com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public int getLayerSource() {
        return 50;
    }

    @Override // X.G8S
    public G8R getReporter() {
        return new G8R() { // from class: com.facebook.aura.partners.voice.session.impl.HatchAppOverlayConfigLayer.getReporter.1
            public final void report(String str, String str2) {
            }
        };
    }

    @Override // X.G8S
    public String getSoftErrorCategory() {
        return VoiceSessionHelpers.THREAD_ENTRYPOINT;
    }

    @Override // X.G8S, com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public void logExposure(int i) {
    }

    @Override // X.G8S
    public void logMCExposure(long j) {
    }

    @Override // X.G8S, X.G8T, com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public int[] getUpdatedValues() {
        return buildValues();
    }

    @Override // X.G8S, com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public int[] getValues() {
        return buildValues();
    }
}
