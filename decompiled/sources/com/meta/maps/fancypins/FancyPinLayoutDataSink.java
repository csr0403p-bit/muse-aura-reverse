package com.meta.maps.fancypins;

import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public interface FancyPinLayoutDataSink {
    void registerBlueprint(String str, byte[] bArr);

    List<PinLayout> solveLayouts(List<FancyPinFrameState> list);

    void updateMeasurements(List<PinMeasurement> list);

    void updatePins(Map<String, String> map);
}
