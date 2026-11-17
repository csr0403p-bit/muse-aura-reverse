package X;

import X.BfD;
import android.util.Range;

/* loaded from: classes5.dex */
public interface BfN<T extends BfD> extends BdG<T>, InterfaceC2490BcH {
    public static final AbstractC2531BdI<EnumC2489BcG> A01;
    public static final AbstractC2531BdI<Boolean> A04;
    public static final AbstractC2531BdI<Integer> A05;
    public static final AbstractC2531BdI<Integer> A07;
    public static final AbstractC2531BdI<Range<Integer>> A08;
    public static final AbstractC2531BdI<Integer> A09;
    public static final AbstractC2531BdI<Boolean> A0A;
    public static final AbstractC2531BdI<C2643Bga> A03 = AbstractC2531BdI.A00(C2643Bga.class, "camerax.core.useCase.defaultSessionConfig");
    public static final AbstractC2531BdI<C2646Bgd> A02 = AbstractC2531BdI.A00(C2646Bgd.class, "camerax.core.useCase.defaultCaptureConfig");
    public static final AbstractC2531BdI<InterfaceC2674BhL> A06 = AbstractC2531BdI.A00(InterfaceC2674BhL.class, "camerax.core.useCase.sessionConfigUnpacker");
    public static final AbstractC2531BdI<InterfaceC2656Bgo> A00 = AbstractC2531BdI.A00(InterfaceC2656Bgo.class, "camerax.core.useCase.captureConfigUnpacker");

    EnumC2489BcG ADT();

    static {
        Class cls = Integer.TYPE;
        A07 = AbstractC2531BdI.A00(cls, "camerax.core.useCase.surfaceOccupancyPriority");
        A08 = AbstractC2531BdI.A00(Range.class, "camerax.core.useCase.targetFrameRate");
        Class cls2 = Boolean.TYPE;
        A0A = AbstractC2531BdI.A00(cls2, "camerax.core.useCase.zslDisabled");
        A04 = AbstractC2531BdI.A00(cls2, "camerax.core.useCase.highResolutionDisabled");
        A01 = AbstractC2531BdI.A00(EnumC2489BcG.class, "camerax.core.useCase.captureType");
        A05 = AbstractC2531BdI.A00(cls, "camerax.core.useCase.previewStabilizationMode");
        A09 = AbstractC2531BdI.A00(cls, "camerax.core.useCase.videoStabilizationMode");
    }
}
