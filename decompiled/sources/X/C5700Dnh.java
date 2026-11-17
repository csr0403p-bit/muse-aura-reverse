package X;

import com.facebook.aura.common.video.HatchVideoPlayerBackgroundEventProcessor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Dnh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5700Dnh {
    public static final Comparator<E1D> A08 = new C7572F4l(26);
    public final long A00;
    public final Queue<E1D> A01;
    public final AtomicInteger A02;
    public final C5963Dsz A03;
    public final HatchVideoPlayerBackgroundEventProcessor A04;
    public final InterfaceC6058Dut A05;
    public final C5699Dng A06;
    public volatile boolean A07;
    public final DrW videoLoggerHandler;

    public C5700Dnh(C5963Dsz c5963Dsz, HatchVideoPlayerBackgroundEventProcessor hatchVideoPlayerBackgroundEventProcessor, InterfaceC6058Dut interfaceC6058Dut, DrW drW, C5699Dng c5699Dng, long j) {
        this.videoLoggerHandler = drW;
        this.A00 = j;
        this.A05 = interfaceC6058Dut;
        this.A03 = c5963Dsz;
        this.A06 = c5699Dng;
        this.A04 = hatchVideoPlayerBackgroundEventProcessor;
        this.A01 = c5699Dng.mEnableSortEventsByClientTimestamp ? new PriorityBlockingQueue<>(5, A08) : new ConcurrentLinkedQueue<>();
        this.A02 = BV4.A13(0);
    }

    private final void A00() {
        if (this.A07) {
            return;
        }
        C5699Dng c5699Dng = this.A06;
        if (c5699Dng.mMmeLoggingThresholdForEventAccumulation <= 0 || this.A01.size() <= c5699Dng.mMmeLoggingThresholdForEventAccumulation) {
            return;
        }
        this.A07 = true;
    }

    public final void A01(long j) {
        E1D e1dPoll;
        String str;
        if (this instanceof C5673DnB) {
            C5673DnB c5673DnB = (C5673DnB) this;
            synchronized (c5673DnB) {
                C5700Dnh c5700Dnh = c5673DnB.A00;
                if (c5700Dnh != null) {
                    c5700Dnh.A01(j);
                } else {
                    c5673DnB.A01.add(new C6715EWv(j, 0));
                }
            }
            return;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        do {
            Queue<E1D> queue = this.A01;
            if (!queue.isEmpty() && (e1dPoll = queue.poll()) != null) {
                arrayListA0h.add(e1dPoll);
                str = e1dPoll.A0c;
                if ("completed".equals(str)) {
                    break;
                }
            } else {
                break;
            }
        } while (!"paused".equals(str));
        this.A02.set(0);
        HatchVideoPlayerBackgroundEventProcessor hatchVideoPlayerBackgroundEventProcessor = this.A04;
        if (hatchVideoPlayerBackgroundEventProcessor == null || !this.A06.mEnableBackgroundLogging) {
            this.videoLoggerHandler.Ab6(arrayListA0h, this.A00, j);
        } else {
            hatchVideoPlayerBackgroundEventProcessor.executeWithDelay(0L, new Dq5(this, arrayListA0h, j));
        }
    }

    public final void A03(C5963Dsz c5963Dsz) {
        if (!(this instanceof C5673DnB)) {
            this.videoLoggerHandler.Ai1(c5963Dsz);
            return;
        }
        C5673DnB c5673DnB = (C5673DnB) this;
        synchronized (c5673DnB) {
            C5700Dnh c5700Dnh = c5673DnB.A00;
            if (c5700Dnh != null) {
                c5700Dnh.A03(c5963Dsz);
            } else {
                c5673DnB.A01.add(new EQe(c5963Dsz, 16));
            }
        }
    }

    public final void A04(C5962Dsy c5962Dsy, String str, String str2, long j, long j2, long j3) {
        if (!(this instanceof C5673DnB)) {
            C7384Etj.A0Y(str, 3);
            this.A01.offer(new E1D(null, c5962Dsy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, str2, null, null, null, null, null, null, null, j3, j3 + this.A02.getAndIncrement(), j, j2, false));
            A00();
            return;
        }
        C5673DnB c5673DnB = (C5673DnB) this;
        synchronized (c5673DnB) {
            C7384Etj.A0Y(str, 3);
            C5700Dnh c5700Dnh = c5673DnB.A00;
            if (c5700Dnh != null) {
                c5700Dnh.A04(c5962Dsy, str, str2, j, j2, j3);
            } else {
                c5673DnB.A01.add(new C5891DrY(c5962Dsy, str, str2, j, j2, j3));
            }
        }
    }

    public final void A02(Dt0 dt0, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18, Long l19, Long l20, Long l21, Long l22, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j, long j2, long j3, boolean z) {
        if (this instanceof C5673DnB) {
            C5673DnB c5673DnB = (C5673DnB) this;
            synchronized (c5673DnB) {
                C7384Etj.A0Y(str, 3);
                C5700Dnh c5700Dnh = c5673DnB.A00;
                if (c5700Dnh != null) {
                    c5700Dnh.A02(dt0, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, l, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, str, str2, str3, str4, str5, str6, str7, str8, str9, j, j2, j3, z);
                } else {
                    c5673DnB.A01.add(new C5853Dqn(dt0, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, l, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, str, str2, str3, str4, str5, str6, str7, str8, str9, j, j2, j3, z));
                }
            }
            return;
        }
        C7384Etj.A0Y(str, 3);
        E1D e1d = new E1D(dt0, null, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, l, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, str, str2, str3, str6, str4, str5, str7, str8, str9, j3, j3 + this.A02.getAndIncrement(), j, j2, z);
        Queue<E1D> queue = this.A01;
        queue.offer(e1d);
        new ArrayList(queue);
        A00();
    }
}
