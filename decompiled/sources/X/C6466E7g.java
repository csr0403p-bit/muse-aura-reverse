package X;

import android.util.Pair;
import androidx.media3.common.Timeline;
import java.io.IOException;
import java.util.List;

/* renamed from: X.E7g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6466E7g implements Du7, InterfaceC6021DuE {
    public final C6431E5j A00;
    public final /* synthetic */ C6430E5i A01;

    /* JADX WARN: Incorrect types in method signature: (ILX/Dy6;)Landroid/util/Pair<Ljava/lang/Integer;LX/Dy6;>; */
    private Pair A00(Dy6 dy6, int i) {
        Dy6 dy6A01 = null;
        if (dy6 != null) {
            C6431E5j c6431E5j = this.A00;
            int i2 = 0;
            while (true) {
                List<Dy6> list = c6431E5j.A04;
                if (i2 >= list.size()) {
                    return null;
                }
                if (list.get(i2).A03 == dy6.A03) {
                    Object obj = dy6.A04;
                    Object obj2 = c6431E5j.A03;
                    Timeline timeline = Timeline.A00;
                    dy6A01 = dy6.A01(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
        }
        return Pair.create(Integer.valueOf(i + this.A00.A00), dy6A01);
    }

    public C6466E7g(C6431E5j c6431E5j, C6430E5i c6430E5i) {
        this.A01 = c6430E5i;
        this.A00 = c6431E5j;
    }

    @Override // X.InterfaceC6021DuE
    public final void ASj(Dy6 dy6, int i) {
        final Pair pairA00 = A00(dy6, i);
        if (pairA00 != null) {
            BV6.A1C(this.A01.A03, new Runnable() { // from class: X.E7o
                public static final String __redex_internal_original_name = "MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda9";

                @Override // java.lang.Runnable
                public final void run() {
                    C6466E7g c6466E7g = this;
                    Pair pair = pairA00;
                    c6466E7g.A01.A05.ASj((Dy6) pair.second, BV7.A08(pair));
                }
            });
        }
    }

    @Override // X.InterfaceC6021DuE
    public final void ASk(Dy6 dy6, int i) {
        final Pair pairA00 = A00(dy6, i);
        if (pairA00 != null) {
            BV6.A1C(this.A01.A03, new Runnable() { // from class: X.E7r
                public static final String __redex_internal_original_name = "MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda5";

                @Override // java.lang.Runnable
                public final void run() {
                    C6466E7g c6466E7g = this;
                    Pair pair = pairA00;
                    c6466E7g.A01.A05.ASk((Dy6) pair.second, BV7.A08(pair));
                }
            });
        }
    }

    @Override // X.InterfaceC6021DuE
    public final void ASl(Dy6 dy6, int i, final int i2) {
        final Pair pairA00 = A00(dy6, i);
        if (pairA00 != null) {
            BV6.A1C(this.A01.A03, new Runnable() { // from class: X.E7p
                public static final String __redex_internal_original_name = "MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda8";

                @Override // java.lang.Runnable
                public final void run() {
                    C6466E7g c6466E7g = this;
                    Pair pair = pairA00;
                    int i3 = i2;
                    c6466E7g.A01.A05.ASl((Dy6) pair.second, BV7.A08(pair), i3);
                }
            });
        }
    }

    @Override // X.InterfaceC6021DuE
    public final void ASm(Dy6 dy6, final Exception exc, int i) {
        final Pair pairA00 = A00(dy6, i);
        if (pairA00 != null) {
            BV6.A1C(this.A01.A03, new Runnable() { // from class: X.E7n
                public static final String __redex_internal_original_name = "MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda3";

                @Override // java.lang.Runnable
                public final void run() {
                    C6466E7g c6466E7g = this;
                    Pair pair = pairA00;
                    Exception exc2 = exc;
                    c6466E7g.A01.A05.ASm((Dy6) pair.second, exc2, BV7.A08(pair));
                }
            });
        }
    }

    @Override // X.InterfaceC6021DuE
    public final void ASo(Dy6 dy6, int i) {
        final Pair pairA00 = A00(dy6, i);
        if (pairA00 != null) {
            BV6.A1C(this.A01.A03, new Runnable() { // from class: X.E7q
                public static final String __redex_internal_original_name = "MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda6";

                @Override // java.lang.Runnable
                public final void run() {
                    C6466E7g c6466E7g = this;
                    Pair pair = pairA00;
                    c6466E7g.A01.A05.ASo((Dy6) pair.second, BV7.A08(pair));
                }
            });
        }
    }

    @Override // X.Du7
    public final void onDownstreamFormatChanged(int i, Dy6 dy6, final C5893Dra c5893Dra) {
        final Pair pairA00 = A00(dy6, i);
        if (pairA00 != null) {
            BV6.A1C(this.A01.A03, new Runnable() { // from class: X.E7m
                public static final String __redex_internal_original_name = "MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda4";

                @Override // java.lang.Runnable
                public final void run() {
                    C6466E7g c6466E7g = this;
                    Pair pair = pairA00;
                    c6466E7g.A01.A05.onDownstreamFormatChanged(BV7.A08(pair), (Dy6) pair.second, c5893Dra);
                }
            });
        }
    }

    @Override // X.Du7
    public final void onLoadCanceled(int i, Dy6 dy6, final C5072DTn c5072DTn, final C5893Dra c5893Dra) {
        final Pair pairA00 = A00(dy6, i);
        if (pairA00 != null) {
            BV6.A1C(this.A01.A03, new Runnable() { // from class: X.E7k
                public static final String __redex_internal_original_name = "MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda1";

                @Override // java.lang.Runnable
                public final void run() {
                    C6466E7g c6466E7g = this;
                    Pair pair = pairA00;
                    c6466E7g.A01.A05.onLoadCanceled(BV7.A08(pair), (Dy6) pair.second, c5072DTn, c5893Dra);
                }
            });
        }
    }

    @Override // X.Du7
    public final void onLoadCompleted(int i, Dy6 dy6, final C5072DTn c5072DTn, final C5893Dra c5893Dra) {
        final Pair pairA00 = A00(dy6, i);
        if (pairA00 != null) {
            BV6.A1C(this.A01.A03, new Runnable() { // from class: X.E7j
                public static final String __redex_internal_original_name = "MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda7";

                @Override // java.lang.Runnable
                public final void run() {
                    C6466E7g c6466E7g = this;
                    Pair pair = pairA00;
                    c6466E7g.A01.A05.onLoadCompleted(BV7.A08(pair), (Dy6) pair.second, c5072DTn, c5893Dra);
                }
            });
        }
    }

    @Override // X.Du7
    public final void onLoadError(int i, Dy6 dy6, final C5072DTn c5072DTn, final C5893Dra c5893Dra, final IOException iOException, final boolean z) {
        final Pair pairA00 = A00(dy6, i);
        if (pairA00 != null) {
            BV6.A1C(this.A01.A03, new Runnable() { // from class: X.E7h
                public static final String __redex_internal_original_name = "MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda11";

                @Override // java.lang.Runnable
                public final void run() {
                    C6466E7g c6466E7g = this;
                    Pair pair = pairA00;
                    c6466E7g.A01.A05.onLoadError(BV7.A08(pair), (Dy6) pair.second, c5072DTn, c5893Dra, iOException, z);
                }
            });
        }
    }

    @Override // X.Du7
    public final void onLoadStarted(int i, Dy6 dy6, final C5072DTn c5072DTn, final C5893Dra c5893Dra, final int i2) {
        final Pair pairA00 = A00(dy6, i);
        if (pairA00 != null) {
            BV6.A1C(this.A01.A03, new Runnable() { // from class: X.E7l
                public static final String __redex_internal_original_name = "MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda10";

                @Override // java.lang.Runnable
                public final void run() {
                    C6466E7g c6466E7g = this;
                    Pair pair = pairA00;
                    c6466E7g.A01.A05.onLoadStarted(BV7.A08(pair), (Dy6) pair.second, c5072DTn, c5893Dra, i2);
                }
            });
        }
    }

    @Override // X.Du7
    public final void onUpstreamDiscarded(int i, Dy6 dy6, final C5893Dra c5893Dra) {
        final Pair pairA00 = A00(dy6, i);
        if (pairA00 != null) {
            BV6.A1C(this.A01.A03, new Runnable() { // from class: X.E7i
                public static final String __redex_internal_original_name = "MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    C6466E7g c6466E7g = this;
                    Pair pair = pairA00;
                    C5893Dra c5893Dra2 = c5893Dra;
                    E65 e65 = c6466E7g.A01.A05;
                    int iA08 = BV7.A08(pair);
                    Object obj = pair.second;
                    obj.getClass();
                    e65.onUpstreamDiscarded(iA08, (Dy6) obj, c5893Dra2);
                }
            });
        }
    }
}
