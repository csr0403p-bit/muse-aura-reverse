package X;

/* renamed from: X.Di6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5411Di6 implements InterfaceC5231Ddp {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03 = C5072DTn.A05.getAndIncrement();
    public final long A04;
    public final C6154Dwx A05;
    public final C1O A06;
    public final DF4 A07;
    public final Object A08;

    public AbstractC5411Di6(C6154Dwx c6154Dwx, C1J c1j, C1O c1o, Object obj, int i, int i2, long j, long j2) {
        this.A07 = new DF4(c1j);
        this.A06 = c1o;
        this.A01 = i;
        this.A05 = c6154Dwx;
        this.A00 = i2;
        this.A08 = obj;
        this.A04 = j;
        this.A02 = j2;
    }

    public static void A00(C5418DiE c5418DiE, Object obj) {
        obj.getClass();
        if (c5418DiE.A08 && (obj instanceof C4899DDs)) {
            C1J c1j = ((C4899DDs) obj).A02;
            if (c1j instanceof InterfaceC4896DDp) {
                ((InterfaceC4896DDp) c1j).cancel();
            }
        }
    }
}
