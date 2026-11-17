package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public abstract class DAZ implements DAu {
    public DAt A00;
    public boolean A01;
    public final AtomicBoolean A04 = C60O.A1E();
    public final C3412CLd A02 = new C3412CLd(734857510);
    public final Object A03 = C3cG.A0T();

    public abstract void A03();

    public abstract void A04();

    public static final void A00(DAZ daz, String str, String str2, short s, boolean z) {
        synchronized (daz.A03) {
            DAt dAt = daz.A00;
            if (dAt == null || !dAt.A04) {
                long jNow = daz.A01().AMN().now();
                DAt dAt2 = new DAt();
                dAt2.A03 = s;
                dAt2.A02 = str;
                dAt2.A00 = jNow;
                dAt2.A04 = z;
                dAt2.A01 = str2;
                daz.A00 = dAt2;
                String name = daz.getName();
                CFK.A00(AbstractC10411Hbi.A00(s), str, Boolean.valueOf(z), Boolean.valueOf(daz.A01), FGI.A0M("StartupDoneStrategy|", name), "Outcome=%s, reason=%s, isFinal=%b, isPickedStrategy=%b");
                boolean z2 = daz.A01;
                if (z2 && dAt2.A04) {
                    daz.A02().AMN().endStart(dAt2.A03, dAt2.A02, dAt2.A00, FGI.A0M("StartupDoneStrategy|", name), dAt2.A01);
                }
            }
        }
    }

    public F18<DK9> A01() {
        return ((DB4) this).A01;
    }

    public F18<DBB> A02() {
        return ((DB4) this).A02;
    }

    @Override // X.DAu
    public void ATc(String str) {
    }
}
