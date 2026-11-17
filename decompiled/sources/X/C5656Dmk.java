package X;

import android.os.Handler;
import android.os.MessageQueue;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Dmk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5656Dmk {
    public MessageQueue.IdleHandler A00;
    public final Handler A01;
    public final HeroPlayerSetting A02;
    public final InterfaceC5928DsG A03;
    public final Handler A05;
    public final C5664Dmt A06;
    public final CXY A07;
    public final Executor A08;
    public final AtomicReference A04 = BV4.A15();
    public volatile boolean A09 = false;
    public volatile boolean A0A = true;

    public static void A00(C5656Dmk c5656Dmk) {
        InterfaceC5928DsG interfaceC5928DsG = c5656Dmk.A03;
        AbstractC3426CMt.A03("PlayerWarmupScheduler", "processQueue, queueSize=%d", BV5.A1Y(interfaceC5928DsG.size()));
        if (c5656Dmk.A04.get() != null) {
            boolean z = c5656Dmk.A02.enableWarmupProcessPeriodically;
            boolean zIsEmpty = interfaceC5928DsG.isEmpty();
            if (z) {
                if (!zIsEmpty && c5656Dmk.A0A && interfaceC5928DsG.AY0() != null) {
                    throw BV4.A0a("playRequest");
                }
                return;
            }
            if (!zIsEmpty && c5656Dmk.A0A && interfaceC5928DsG.AY0() != null) {
                throw BV4.A0a("playRequest");
            }
        }
    }

    public static void A01(final C5656Dmk c5656Dmk) {
        Executor executor;
        if (!c5656Dmk.A02.enableWarmupPollExecutorDispatch || (executor = c5656Dmk.A08) == null) {
            c5656Dmk.A05.post(new Runnable() { // from class: X.DsH
                public static final String __redex_internal_original_name = "PlayerWarmupScheduler$$ExternalSyntheticLambda4";

                @Override // java.lang.Runnable
                public final void run() {
                    C5656Dmk.A00(this.A00);
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: X.DsI
                public static final String __redex_internal_original_name = "PlayerWarmupScheduler$$ExternalSyntheticLambda3";

                @Override // java.lang.Runnable
                public final void run() {
                    C5656Dmk.A00(this.A00);
                }
            });
        }
    }

    public C5656Dmk(Handler handler, Handler handler2, HeroPlayerSetting heroPlayerSetting, C5664Dmt c5664Dmt, CXY cxy, Executor executor) {
        this.A02 = heroPlayerSetting;
        this.A06 = c5664Dmt;
        this.A05 = handler;
        this.A01 = handler2;
        this.A08 = executor;
        this.A07 = cxy;
        this.A03 = heroPlayerSetting.gen.enable_warmup_priority_scheduler ? new DX9(heroPlayerSetting, cxy) : new DX8(heroPlayerSetting, cxy);
        if (heroPlayerSetting.enableStopWarmupSchedulerEmpty) {
            this.A00 = new MessageQueue.IdleHandler() { // from class: X.Dqm
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    boolean z;
                    C5656Dmk c5656Dmk = this.A00;
                    C5656Dmk.A01(c5656Dmk);
                    synchronized (c5656Dmk) {
                        z = false;
                        if (c5656Dmk.A03.isEmpty()) {
                            c5656Dmk.A09 = false;
                            z = true;
                        }
                    }
                    return !z;
                }
            };
        }
    }
}
