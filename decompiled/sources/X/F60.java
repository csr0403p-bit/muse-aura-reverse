package X;

/* loaded from: classes6.dex */
public final class F60 extends RuntimeException {
    public F60() {
        super("Redex: Unreachable code. This should never get triggered.");
    }

    public static F60 createAndThrow() {
        throw new F60();
    }
}
