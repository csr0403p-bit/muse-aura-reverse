package X;

import android.os.Handler;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.DmZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5645DmZ {
    public final Handler A00;
    public final C5981DtO A01;
    public final C5641DmV A02;
    public final DnE A03;
    public final DsL A04;
    public final HeroPlayerSetting A05;
    public final Runnable A06;
    public final AtomicBoolean A07;
    public final AtomicInteger A08;
    public final AtomicReference<Do2> A09;
    public final ReentrantLock A0A;
    public final Runnable A0B;
    public volatile int A0C;
    public volatile E88 A0D;

    public C5645DmZ(Handler handler, C5981DtO c5981DtO, C5627DmA c5627DmA, DnE dnE, DsL dsL, HeroPlayerSetting heroPlayerSetting) {
        C7384Etj.A0Y(dsL, 4);
        this.A00 = handler;
        this.A01 = c5981DtO;
        this.A03 = dnE;
        this.A08 = BV4.A13(1);
        AtomicReference<Do2> atomicReferenceA16 = BV4.A16(Do2.A08);
        this.A09 = atomicReferenceA16;
        this.A02 = new C5641DmV(c5627DmA, dnE, atomicReferenceA16, heroPlayerSetting.fixAudioFocusGainStatus);
        this.A05 = heroPlayerSetting;
        this.A04 = dsL;
        this.A0A = new ReentrantLock();
        this.A06 = new RunnableC5708Dnq(this, dsL);
        this.A0B = new RunnableC5707Dnp(this, dsL, heroPlayerSetting);
        this.A07 = BV4.A12(false);
    }

    public static final void A00(C5645DmZ c5645DmZ) {
        if (c5645DmZ.A07.get() || (c5645DmZ.A05.abandonUnacquiredAudioFocusRequest && c5645DmZ.A0D != null)) {
            if (c5645DmZ.A05.offloadGrootAudioFocus) {
                c5645DmZ.A00.post(c5645DmZ.A0B);
                return;
            }
            try {
                ReentrantLock reentrantLock = c5645DmZ.A0A;
                boolean zTryLock = reentrantLock.tryLock(1L, TimeUnit.SECONDS);
                try {
                    c5645DmZ.A0B.run();
                } finally {
                    if (zTryLock) {
                        reentrantLock.unlock();
                    }
                }
            } catch (InterruptedException unused) {
                BV4.A1A();
            }
        }
    }

    public final boolean A01() {
        AtomicBoolean atomicBoolean = this.A07;
        atomicBoolean.compareAndSet(true, false);
        ReentrantLock reentrantLock = this.A0A;
        reentrantLock.lock();
        try {
            this.A06.run();
            reentrantLock.unlock();
            boolean z = atomicBoolean.get();
            if (z) {
                this.A09.set(Do2.A02);
            }
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
