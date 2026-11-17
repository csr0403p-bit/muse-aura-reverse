package X;

import android.util.Range;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Bgd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2646Bgd {
    public final int A00;
    public final InterfaceC2861BnK A01;
    public final InterfaceC2585Beh A02;
    public final BhZ A03;
    public final List<BeX> A04;
    public final List<BjC> A05;
    public final boolean A06;
    public final boolean A07;
    public static final AbstractC2531BdI<Integer> A0A = AbstractC2531BdI.A00(Integer.TYPE, "camerax.core.captureConfig.rotation");
    public static final AbstractC2531BdI<Integer> A08 = AbstractC2531BdI.A00(Integer.class, "camerax.core.captureConfig.jpegQuality");
    public static final AbstractC2531BdI<Range<Integer>> A09 = AbstractC2531BdI.A00(Range.class, "camerax.core.captureConfig.resolvedFrameRate");

    public final int A00() {
        return BV7.A0C(this.A02.Abl(BfN.A05, BV4.A0V()));
    }

    public final int A01() {
        return BV7.A0C(this.A02.Abl(BfN.A09, BV4.A0V()));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/BjC;>;LX/Beh;IZLjava/util/List<LX/BeX;>;ZLX/BhZ;LX/BnK;)V */
    public C2646Bgd(InterfaceC2861BnK interfaceC2861BnK, InterfaceC2585Beh interfaceC2585Beh, BhZ bhZ, List list, List list2, int i, boolean z, boolean z2) {
        this.A05 = list;
        this.A02 = interfaceC2585Beh;
        this.A00 = i;
        this.A04 = Collections.unmodifiableList(list2);
        this.A07 = z2;
        this.A03 = bhZ;
        this.A01 = interfaceC2861BnK;
        this.A06 = z;
    }
}
