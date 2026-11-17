package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.DEt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4923DEt {
    public final C4926DEw A02;
    public final VpsEventCallback A03;
    public final C4925DEv A04;
    public final C3159C0h A05;
    public final DF7 A06;
    public final String A08;
    public final Object A07 = C3cG.A0T();
    public final AtomicInteger A09 = new AtomicInteger();
    public int A00 = 3;
    public Integer A01 = C79.A00;

    public C4923DEt(C4926DEw c4926DEw, VpsEventCallback vpsEventCallback, C4925DEv c4925DEv, C3159C0h c3159C0h, DF7 df7, String str) {
        this.A06 = df7;
        this.A05 = c3159C0h;
        this.A03 = vpsEventCallback;
        this.A08 = str;
        this.A02 = c4926DEw;
        this.A04 = c4925DEv;
    }

    public final void A00(Integer num) {
        synchronized (this.A07) {
            if (this.A01 == C79.A00) {
                this.A01 = num;
            }
        }
    }
}
