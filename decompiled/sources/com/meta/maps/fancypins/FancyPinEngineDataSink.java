package com.meta.maps.fancypins;

import X.C0881AGi;
import X.C7384Etj;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public interface FancyPinEngineDataSink extends FancyPinSlotResolver {

    public abstract class DefaultImpls {
        @Deprecated
        public static List<String> copyRankedRuntimeClusterMemberPinIds(FancyPinEngineDataSink fancyPinEngineDataSink, String str, int i) {
            C7384Etj.A0Y(str, 1);
            return C0881AGi.A00;
        }

        @Deprecated
        public static List<String> copyRuntimeClusterMemberPinIds(FancyPinEngineDataSink fancyPinEngineDataSink, String str) {
            C7384Etj.A0Y(str, 1);
            return C0881AGi.A00;
        }
    }

    List<String> copyRankedRuntimeClusterMemberPinIds(String str, int i);

    List<String> copyRuntimeClusterMemberPinIds(String str);

    void registerBlueprint(String str, byte[] bArr);

    List<Integer> replaceClusterBlueprintCatalog(byte[] bArr);

    void updateLayouts(List<PinLayout> list);

    void updatePinMapping(Map<String, String> map);

    void updateStates(List<FancyPinFrameState> list);

    /* renamed from: com.meta.maps.fancypins.FancyPinEngineDataSink$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
    }
}
