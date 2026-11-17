package X;

/* renamed from: X.CpQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC4192CpQ implements Runnable {
    public static final String __redex_internal_original_name = "zabo";
    public final /* synthetic */ C4382Cui A00;

    public RunnableC4192CpQ(C4382Cui c4382Cui) {
        this.A00 = c4382Cui;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.A00.A00.A04;
        String strConcat = String.valueOf(C60Q.A0e(obj)).concat(" disconnecting because it was signed out.");
        AbstractC4160CoH abstractC4160CoH = (AbstractC4160CoH) obj;
        abstractC4160CoH.A0N = strConcat;
        abstractC4160CoH.A96();
    }
}
