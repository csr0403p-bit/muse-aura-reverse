package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class BjM {
    public final C2643Bga A02;
    public final AbstractC2481Bc8 A03;
    public final BfN<?> A04;
    public final List<EnumC2489BcG> A05;
    public boolean A01 = false;
    public boolean A00 = false;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("UseCaseAttachInfo{mSessionConfig=");
        sbA0x.append(this.A02);
        sbA0x.append(", mUseCaseConfig=");
        sbA0x.append(this.A04);
        sbA0x.append(", mStreamSpec=");
        sbA0x.append(this.A03);
        sbA0x.append(", mCaptureTypes=");
        sbA0x.append(this.A05);
        sbA0x.append(", mAttached=");
        sbA0x.append(this.A01);
        sbA0x.append(", mActive=");
        sbA0x.append(this.A00);
        return C8j3.A15(sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Bga;LX/BfN<*>;LX/Bc8;Ljava/util/List<LX/BcG;>;)V */
    public BjM(C2643Bga c2643Bga, AbstractC2481Bc8 abstractC2481Bc8, BfN bfN, List list) {
        this.A02 = c2643Bga;
        this.A04 = bfN;
        this.A03 = abstractC2481Bc8;
        this.A05 = list;
    }
}
