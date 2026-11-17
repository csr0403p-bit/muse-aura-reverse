package X;

/* loaded from: classes5.dex */
public final class CR4 extends Throwable {
    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }

    public CR4() {
        super("Failure occurred while trying to finish a future.");
    }
}
