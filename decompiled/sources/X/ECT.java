package X;

/* loaded from: classes5.dex */
public final class ECT implements ECV {
    @Override // X.ECV
    public final double AM6(ECR ecr) {
        int iA0E = AnonymousClass001.A0E(ecr, 0);
        if (iA0E != 0) {
            if (iA0E == 5 || iA0E == 1 || iA0E == 2 || iA0E == 3) {
                return 1.0d;
            }
            AbstractC3422CMk.A07("NativeMemoryCacheTrimStrategy", "unknown trim type: %s", ecr);
        }
        return 0.0d;
    }
}
