package X;

/* renamed from: X.Adk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1181Adk<T> {
    public final int A00;
    public final int A01;
    public final T A02;

    /* JADX WARN: Incorrect types in method signature: (IITT;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C1181Adk(Object obj, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj;
        if (i >= 0) {
            return;
        }
        AbstractC1061ATk.A00("startIndex should be >= 0");
        throw F60.createAndThrow();
    }
}
