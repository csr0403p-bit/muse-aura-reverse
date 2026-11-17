package X;

import java.util.Set;

/* loaded from: classes5.dex */
public final class ECS implements ECV {
    public static final Set<ECR> A00;
    public static final Set<ECR> A01;

    @Override // X.ECV
    public final double AM6(ECR ecr) {
        C7384Etj.A0Y(ecr, 0);
        ECR ecr2 = ECR.A02;
        if (ecr == ecr2) {
            return ecr2.mSuggestedTrimRatio;
        }
        if (A01.contains(ecr)) {
            return 1.0d;
        }
        AbstractC3422CMk.A07("BitmapMemoryCacheTrimStrategy", "unknown trim type: %s", ecr);
        return 0.0d;
    }

    static {
        Set<ECR> setA0H = BFI.A0H(new ECR[]{ECR.A01, ECR.A05, ECR.A04, ECR.A03});
        A01 = setA0H;
        A00 = BGK.A02(ECR.A02, setA0H);
    }
}
