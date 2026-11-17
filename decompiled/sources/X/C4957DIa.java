package X;

import com.facebook.aura.analytics.impl.QplConfigInstance;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.Random;
import java.util.concurrent.Callable;

/* renamed from: X.DIa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4957DIa {
    public final C4970DJj A00;
    public final Callable<C4972DJl> A01;
    public volatile C4972DJl A02;

    public final C4972DJl A00() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    try {
                        C4972DJl c4972DJlCall = this.A01.call();
                        c4972DJlCall.getClass();
                        this.A02 = c4972DJlCall;
                    } catch (Exception e) {
                        throw BV4.A0e(e);
                    }
                }
            }
        }
        return this.A02;
    }

    public C4957DIa(final QplConfigInstance.AnonymousClass8 anonymousClass8, final AwakeTimeSinceBootClock awakeTimeSinceBootClock, final DKG dkg, final DGY dgy, final C0V c0v, final InterfaceC4945DGj interfaceC4945DGj, final Random random, final F18 f18, final F18 f182, final F18 f183, final F18 f184, final F18 f185, final F18 f186) {
        this.A01 = new Callable() { // from class: X.DIn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                DGY dgy2 = dgy;
                F18 f187 = f18;
                F18 f188 = f182;
                F18 f189 = f183;
                F18 f1810 = f184;
                F18 f1811 = f185;
                F18 f1812 = f186;
                return new C4972DJl(anonymousClass8, awakeTimeSinceBootClock, dkg, dgy2, c0v, interfaceC4945DGj, random, f187, f188, f189, f1810, f1811, f1812);
            }
        };
        A00();
        this.A00 = new C4970DJj(interfaceC4945DGj, new C7603F5q(this, 13));
    }
}
