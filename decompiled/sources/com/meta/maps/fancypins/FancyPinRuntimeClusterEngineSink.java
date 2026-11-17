package com.meta.maps.fancypins;

import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public interface FancyPinRuntimeClusterEngineSink extends FancyPinSlotResolver {
    void updateRuntimeClusterLayouts(List<PinLayout> list);

    void updateRuntimeClusterRanks(Map<String, Integer> map);

    void updateRuntimeClusterVariants(Map<String, String> map);
}
