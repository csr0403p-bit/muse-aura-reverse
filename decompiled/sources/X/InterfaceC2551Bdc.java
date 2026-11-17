package X;

import android.util.Pair;
import android.util.Size;
import java.util.List;

/* renamed from: X.Bdc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC2551Bdc extends InterfaceC2586Bei {
    public static final AbstractC2531BdI<Integer> A00;
    public static final AbstractC2531BdI<List<Size>> A01;
    public static final AbstractC2531BdI<Size> A02;
    public static final AbstractC2531BdI<Size> A03;
    public static final AbstractC2531BdI<Integer> A04;
    public static final AbstractC2531BdI<C2601Bez> A05;
    public static final AbstractC2531BdI<List<Pair<Integer, Size[]>>> A06;
    public static final AbstractC2531BdI<Integer> A07 = AbstractC2531BdI.A00(C2553Bde.class, "camerax.core.imageOutput.targetAspectRatio");
    public static final AbstractC2531BdI<Size> A08;
    public static final AbstractC2531BdI<Integer> A09;

    static {
        Class cls = Integer.TYPE;
        A09 = AbstractC2531BdI.A00(cls, "camerax.core.imageOutput.targetRotation");
        A00 = AbstractC2531BdI.A00(cls, "camerax.core.imageOutput.appTargetRotation");
        A04 = AbstractC2531BdI.A00(cls, "camerax.core.imageOutput.mirrorMode");
        A08 = AbstractC2531BdI.A00(Size.class, "camerax.core.imageOutput.targetResolution");
        A02 = AbstractC2531BdI.A00(Size.class, "camerax.core.imageOutput.defaultResolution");
        A03 = AbstractC2531BdI.A00(Size.class, "camerax.core.imageOutput.maxResolution");
        A06 = AbstractC2531BdI.A00(List.class, "camerax.core.imageOutput.supportedResolutions");
        A05 = AbstractC2531BdI.A00(C2601Bez.class, "camerax.core.imageOutput.resolutionSelector");
        A01 = AbstractC2531BdI.A00(List.class, "camerax.core.imageOutput.customOrderedResolutions");
    }
}
