package X;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import java.util.Map;

/* renamed from: X.Bc0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2473Bc0 {
    public final InterfaceC2475Bc2 A00;
    public final C2395BZs A01;
    public final Map<Integer, Size[]> A04 = BV4.A0u();
    public final Map<Integer, Size[]> A03 = BV4.A0u();
    public final Map<Class<?>, Size[]> A02 = BV4.A0u();

    public final int[] A00() {
        int[] outputFormats;
        try {
            outputFormats = ((C2474Bc1) this.A00).A00.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e) {
            AbstractC2875Bni.A06("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
            outputFormats = null;
        }
        if (outputFormats == null) {
            return null;
        }
        return (int[]) outputFormats.clone();
    }

    public final Size[] A01(int i) throws CloneNotSupportedException {
        Object objClone;
        Map<Integer, Size[]> map = this.A03;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            Size[] highResolutionOutputSizes = ((C2474Bc1) this.A00).A00.getHighResolutionOutputSizes(i);
            if (highResolutionOutputSizes != null && highResolutionOutputSizes.length > 0) {
                highResolutionOutputSizes = this.A01.A01(highResolutionOutputSizes, i);
            }
            map.put(numValueOf, highResolutionOutputSizes);
            if (highResolutionOutputSizes == null) {
                return null;
            }
            objClone = highResolutionOutputSizes.clone();
        } else {
            if (map.get(numValueOf) == null) {
                return null;
            }
            objClone = map.get(numValueOf).clone();
        }
        return (Size[]) objClone;
    }

    public final Size[] A02(int i) throws CloneNotSupportedException {
        Object objClone;
        Map<Integer, Size[]> map = this.A04;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            Size[] outputSizes = ((C2474Bc1) this.A00).A00.getOutputSizes(i);
            if (outputSizes == null || outputSizes.length == 0) {
                AbstractC2875Bni.A03("StreamConfigurationMapCompat", FGI.A0H("Retrieved output sizes array is null or empty for format ", i));
                return outputSizes;
            }
            Size[] sizeArrA01 = this.A01.A01(outputSizes, i);
            map.put(numValueOf, sizeArrA01);
            objClone = sizeArrA01.clone();
        } else {
            if (map.get(numValueOf) == null) {
                return null;
            }
            objClone = map.get(numValueOf).clone();
        }
        return (Size[]) objClone;
    }

    public C2473Bc0(StreamConfigurationMap streamConfigurationMap, C2395BZs c2395BZs) {
        this.A00 = new C2474Bc1(streamConfigurationMap);
        this.A01 = c2395BZs;
    }
}
