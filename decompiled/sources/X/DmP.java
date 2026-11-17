package X;

import androidx.media3.common.util.Util;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.spaces.preload.SpacesShareBridge;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class DmP implements InterfaceC5745Dog {
    public long A00;
    public final C5462Dix A01;
    public final HashMap<E6Y, C6062Dux> A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;

    private final int A00() {
        Iterator itA0x = BV5.A0x(this.A02);
        int i = 0;
        while (itA0x.hasNext()) {
            i += ((C6062Dux) itA0x.next()).A00;
        }
        return i;
    }

    @Override // X.InterfaceC5745Dog
    public final InterfaceC5538DkF ACN() {
        return this.A01;
    }

    @Override // X.InterfaceC5745Dog
    public final void AVG(E6Y e6y) {
        HashMap<E6Y, C6062Dux> map = this.A02;
        if (map.remove(e6y) != null) {
            A01(this, map);
        }
        if (map.isEmpty()) {
            this.A00 = -1L;
        }
    }

    @Override // X.InterfaceC5745Dog
    public final void AWJ(E6Y e6y) {
        HashMap<E6Y, C6062Dux> map = this.A02;
        if (map.remove(e6y) != null) {
            A01(this, map);
        }
    }

    @Override // X.InterfaceC5745Dog
    public final void AWf(C5820Dq6 c5820Dq6, C5414DiA c5414DiA, InterfaceC5441Dic[] interfaceC5441DicArr) {
        HashMap<E6Y, C6062Dux> map = this.A02;
        C6062Dux c6062Dux = map.get(c5820Dq6.A06);
        c6062Dux.getClass();
        C6062Dux c6062Dux2 = c6062Dux;
        int i = 0;
        for (InterfaceC5441Dic interfaceC5441Dic : interfaceC5441DicArr) {
            if (interfaceC5441Dic != null) {
                int i2 = interfaceC5441Dic.ALt().A02;
                int i3 = 13107200;
                switch (i2) {
                    case -1:
                    case 1:
                        break;
                    case 0:
                    case 3:
                    default:
                        i3 = 131072;
                        break;
                    case 2:
                        i3 = 131072000;
                        break;
                    case 4:
                        i3 = SpacesShareBridge.MAX_FILE_BYTES;
                        break;
                }
                i += i3;
            }
        }
        c6062Dux2.A00 = Math.max(13107200, i);
        A01(this, map);
    }

    @Override // X.InterfaceC5745Dog
    public final boolean AfO(C5820Dq6 c5820Dq6) {
        C6062Dux c6062Dux = this.A02.get(c5820Dq6.A06);
        c6062Dux.getClass();
        C6062Dux c6062Dux2 = c6062Dux;
        boolean zA1P = BV5.A1P(this.A01.ALp(), A00());
        float f = c5820Dq6.A00;
        long jMax = Math.max(f > 1.0f ? Math.min(Util.A0C(50000000L, f), 50000000L) : 50000000L, 500000L);
        long j = c5820Dq6.A01;
        if (j < jMax) {
            boolean z = zA1P ? false : true;
            c6062Dux2.A01 = z;
            if (!z && j < 500000) {
                CNC.A04("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= 50000000 || zA1P) {
            c6062Dux2.A01 = false;
        }
        return c6062Dux2.A01;
    }

    @Override // X.InterfaceC5745Dog
    public final boolean AfP() {
        Iterator itA0x = BV5.A0x(this.A02);
        while (itA0x.hasNext()) {
            if (((C6062Dux) itA0x.next()).A01) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC5745Dog
    public final boolean Afb(C5820Dq6 c5820Dq6) {
        long jA0D = Util.A0D(c5820Dq6.A01, c5820Dq6.A00);
        long jMin = c5820Dq6.A09 ? 2000000L : 1000000L;
        long j = c5820Dq6.A04;
        if (j != -9223372036854775807L) {
            jMin = Math.min(BV6.A0I(j), jMin);
        }
        return jMin <= 0 || jA0D >= jMin || this.A01.ALp() >= A00();
    }

    public DmP(C5462Dix c5462Dix) {
        C1G.A09(BV5.A1P(1000, 0), FGI.A0U("bufferForPlaybackMs", " cannot be less than ", HatchPriceImpressionEventDataKt.NO_DISCOUNT));
        C1G.A09(BV5.A1P(2000, 0), FGI.A0U("bufferForPlaybackAfterRebufferMs", " cannot be less than ", HatchPriceImpressionEventDataKt.NO_DISCOUNT));
        C1G.A09(BV5.A1P(50000, 1000), FGI.A0U("minBufferMs", " cannot be less than ", "bufferForPlaybackMs"));
        C1G.A09(BV5.A1P(50000, 2000), FGI.A0U("minBufferMs", " cannot be less than ", "bufferForPlaybackAfterRebufferMs"));
        C1G.A09(BV5.A1P(50000, 50000), FGI.A0U("maxBufferMs", " cannot be less than ", "minBufferMs"));
        FGI.A0U("backBufferDurationMs", " cannot be less than ", HatchPriceImpressionEventDataKt.NO_DISCOUNT);
        this.A01 = c5462Dix;
        this.A06 = 50000000L;
        this.A05 = 50000000L;
        this.A04 = 1000000L;
        this.A03 = 2000000L;
        this.A02 = BV4.A0u();
        this.A00 = -1L;
    }

    public static void A01(DmP dmP, AbstractMap abstractMap) {
        boolean zIsEmpty = abstractMap.isEmpty();
        C5462Dix c5462Dix = dmP.A01;
        if (!zIsEmpty) {
            c5462Dix.A00(dmP.A00());
        } else {
            synchronized (c5462Dix) {
                c5462Dix.A00(0);
            }
        }
    }

    @Override // X.InterfaceC5745Dog
    public final long ACi(E6Y e6y) {
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    @Override // X.InterfaceC5745Dog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AUu(X.E6Y r9) {
        /*
            r8 = this;
            long r2 = X.BV7.A0Q()
            long r4 = r8.A00
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L11
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L12
        L11:
            r1 = 1
        L12:
            java.lang.String r0 = "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper)."
            if (r1 == 0) goto L39
            r8.A00 = r2
            java.util.HashMap<X.E6Y, X.Dux> r1 = r8.A02
            boolean r0 = r1.containsKey(r9)
            if (r0 != 0) goto L28
            X.Dux r0 = new X.Dux
            r0.<init>()
            r1.put(r9, r0)
        L28:
            java.lang.Object r1 = r1.get(r9)
            r1.getClass()
            X.Dux r1 = (X.C6062Dux) r1
            r0 = 13107200(0xc80000, float:1.8367099E-38)
            r1.A00 = r0
            r0 = 0
            r1.A01 = r0
            return
        L39:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DmP.AUu(X.E6Y):void");
    }

    @Override // X.InterfaceC5745Dog
    public final boolean Abj(E6Y e6y) {
        return false;
    }

    public DmP() {
        this(new C5462Dix());
    }
}
