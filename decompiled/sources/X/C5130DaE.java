package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.DaE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5130DaE implements DZu {
    public static final AtomicReferenceFieldUpdater<C5130DaE, AbstractC5140DaU> A07 = AtomicReferenceFieldUpdater.newUpdater(C5130DaE.class, AbstractC5140DaU.class, "resolverFields");
    public final int A00;
    public final DZi A01;
    public final C5129DaD A02;
    public final C5128DaC A03;
    public final DZy A04;
    public volatile C5141DaV A05;
    public volatile AbstractC5169Db0 A06;
    public volatile AbstractC5140DaU resolverFields;

    public C5130DaE(DZi dZi, DZy dZy) {
        this.A04 = dZy;
        this.A01 = dZi;
        this.A00 = DZx.A02(dZy, 4);
        this.A03 = new C5128DaC(this, DZx.A00(dZy, 8));
        this.A02 = new C5129DaD(this, DZx.A00(dZy, 10));
    }
}
