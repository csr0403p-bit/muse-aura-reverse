package X;

import java.io.Closeable;
import java.util.Map;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes5.dex */
public final class EfF<T> implements Closeable, Cloneable {
    public boolean A00;
    public final EfN A01;
    public final EfG<T> A02;
    public final Throwable A03;
    public static final InterfaceC3587CVm<Closeable> A05 = new CVP();
    public static final EfN A04 = new EfI();

    public final synchronized EfF<T> A03() {
        if (!A05()) {
            return null;
        }
        return clone();
    }

    public final synchronized T A04() {
        T tA01;
        CVn.A03(!this.A00);
        tA01 = this.A02.A01();
        tA01.getClass();
        return tA01;
    }

    public final synchronized boolean A05() {
        return !this.A00;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        T t;
        synchronized (this) {
            if (this.A00) {
                return;
            }
            this.A00 = true;
            EfG<T> efG = this.A02;
            synchronized (efG) {
                EfG.A00(efG);
                CVn.A02(AnonymousClass002.A1N(efG.A00));
                i = efG.A00 - 1;
                efG.A00 = i;
            }
            if (i == 0) {
                synchronized (efG) {
                    t = efG.A01;
                    efG.A01 = null;
                }
                if (t != null) {
                    InterfaceC3587CVm<T> interfaceC3587CVm = efG.A02;
                    if (interfaceC3587CVm != null) {
                        interfaceC3587CVm.Aa9(t);
                    }
                    Map<Object, Integer> map = EfG.A03;
                    synchronized (map) {
                        Integer num = map.get(t);
                        if (num == null) {
                            AbstractC3422CMk.A07("SharedReference", "No entry in sLiveObjects for value of type %s", t.getClass());
                        } else {
                            int iIntValue = num.intValue();
                            if (iIntValue == 1) {
                                map.remove(t);
                            } else {
                                BV4.A1H(t, map, iIntValue - 1);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void finalize() {
        synchronized (this) {
            if (this.A00) {
                return;
            }
            EfG<T> efG = this.A02;
            T tA01 = efG.A01();
            AbstractC3422CMk.A06("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", BV7.A0n(this), BV7.A0n(efG), tA01 == null ? null : C60Q.A0e(tA01));
            EfN efN = this.A01;
            if (efN != null) {
                efN.Ab4(efG, this.A03);
            }
            close();
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)LX/EfF<TT;>; */
    public static EfF A00(Closeable closeable) {
        return new EfF(A04, A05, closeable);
    }

    public static boolean A01(EfF<?> efF) {
        return efF != null && efF.A05();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/EfG<TT;>;LX/EfN;Ljava/lang/Throwable;)V */
    public EfF(EfN efN, EfG efG, Throwable th) {
        this.A00 = false;
        this.A02 = efG;
        synchronized (efG) {
            EfG.A00(efG);
            efG.A00++;
        }
        this.A01 = efN;
        this.A03 = th;
    }

    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final EfF<T> clone() {
        CVn.A03(A05());
        return new EfF<>(this.A01, this.A02, this.A03 != null ? new Throwable() : null);
    }

    public EfF(EfN efN, InterfaceC3587CVm interfaceC3587CVm, Object obj) {
        this.A00 = false;
        this.A02 = new EfG<>(interfaceC3587CVm, obj);
        this.A01 = efN;
        this.A03 = null;
    }
}
