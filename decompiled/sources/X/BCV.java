package X;

/* loaded from: classes4.dex */
public abstract class BCV {
    public static final BCR A00(B1X b1x) {
        BCR bcr;
        if ((b1x instanceof BCR) && (bcr = (BCR) b1x) != null) {
            return bcr;
        }
        BBL.A02("Inconsistent composition");
        throw F60.createAndThrow();
    }
}
