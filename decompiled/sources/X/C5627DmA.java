package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.aura.common.video.HatchVideoPlayerGrootListener;
import com.facebook.debug.tracer.Tracer;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.DmA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5627DmA implements InterfaceC5724DoJ {
    public static final Handler A1B = C60O.A02();
    public static final WeakHashMap<View, WeakReference<C5627DmA>> A1C = BV4.A11();
    public long A00;
    public AudioManager A01;
    public View A02;
    public ViewGroup A03;
    public C5720DoF A04;
    public HandlerC5659Dmo A05;
    public C5635DmJ A06;
    public C5625Dm8 A07;
    public DmR A08;
    public Integer A09;
    public Integer A0A;
    public String A0B;
    public C3066Bwo A0C;
    public InterfaceC6115Dvu A0D;
    public final Context A0E;
    public final Handler A0F;
    public final Looper A0G;
    public final HatchVideoPlayerGrootListener A0H;
    public final C5981DtO A0I;
    public final InterfaceC6052Dun A0J;
    public final C5733DoS A0K;
    public final DwW A0L;
    public final DsL A0M;
    public final C6080DvK A0N;
    public final C1F A0O;
    public final C5875DrB A0P;
    public final HeroPlayerSetting A0Q;
    public final C6130DwX A0R;
    public final Object A0S;
    public final Runnable A0T;
    public final HashMap<String, DuX> A0U;
    public final HashMap<String, LruCache<Long, Long>> A0V;
    public final AtomicBoolean A0W;
    public final AtomicBoolean A0X;
    public final AtomicBoolean A0Y;
    public final AtomicBoolean A0Z;
    public final AtomicBoolean A0a;
    public final AtomicBoolean A0b;
    public final AtomicBoolean A0c;
    public final AtomicBoolean A0d;
    public final AtomicInteger A0e;
    public final AtomicInteger A0f;
    public final AtomicLong A0g;
    public final AtomicLong A0h;
    public final AtomicReference<Boolean> A0i;
    public final AtomicReference<InterfaceC6055Duq> A0j;
    public final AtomicReference A0k;
    public final AtomicReference<Integer> A0l;
    public final AtomicReference<C5723DoI> A0m;
    public final AtomicReference<C5723DoI> A0n;
    public final AtomicReference<String> A0o;
    public final AtomicReference<String> A0p;
    public final AtomicReference<InterfaceC6055Duq> A0q;
    public final AtomicReference<Float> A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final Looper A0v;
    public final InterfaceC6119Dvy A0w;
    public final Dw0 A0x;
    public final C6125DwR A0y;
    public final C6129DwV A0z;
    public final AtomicBoolean A10;
    public final AtomicInteger A11;
    public final AtomicReference<C5788DpW> A12;
    public volatile int A13;
    public volatile long A14;
    public volatile C5643DmX A15;
    public volatile C5645DmZ A16;
    public volatile C5630DmE A17;
    public volatile C5806Dpq A18;
    public volatile String A19;
    public volatile List<String> A1A;

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0A(X.C5627DmA r10, X.C5790DpZ r11) {
        /*
            r8 = r10
            boolean r0 = A09(r10)
            r2 = 0
            r9 = r11
            if (r0 == 0) goto L1c
            boolean r0 = A0B(r10, r11)
            if (r0 == 0) goto L1c
            X.Dsq r0 = r11.A00
            if (r0 == 0) goto L1a
            java.lang.Integer r1 = r0.A00
        L15:
            java.lang.Integer r0 = X.C79.A0T
            if (r1 != r0) goto L1c
        L19:
            return r2
        L1a:
            r1 = 0
            goto L15
        L1c:
            X.DmR r10 = r10.A08
            if (r10 == 0) goto L19
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A11
            r1 = 1
            r0.addAndGet(r1)
            X.A3q r4 = X.A3q.A00
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L19
            java.lang.String r0 = "BY_PLAYER"
            r8.AXg(r0)
            X.Dm8 r0 = r8.A07
            long r2 = r0.A0D()
            int r11 = (int) r2
            android.view.ViewGroup r6 = r8.A03
            X.DvI r7 = new X.DvI
            r7.<init>()
            X.DqI r5 = new X.DqI
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.1MU r0 = X.C1MU.A02
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L78
            X.DpI r6 = new X.DpI
            r6.<init>(r5, r8)
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r8.A0Q
            X.Dlv r0 = r0.gen
            boolean r0 = r0.avoid_main_looper_on_refresh_player_recovery
            if (r0 == 0) goto L75
            android.os.Handler r0 = r8.A0F
            android.os.Looper r2 = r0.getLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r0 = X.C7384Etj.areEqual(r2, r0)
            if (r0 == 0) goto L75
            android.os.Looper r0 = r8.A0G
            android.os.Handler r0 = X.BV4.A09(r0)
        L71:
            r0.post(r6)
            return r1
        L75:
            android.os.Handler r0 = r8.A0F
            goto L71
        L78:
            X.DvI r8 = r5.A02
            X.DmA r9 = r5.A05
            android.view.ViewGroup r7 = r5.A01
            int r11 = r5.A00
            X.DmI r6 = new X.DmI
            r6.<init>(r7, r8, r9, r10, r11)
            android.os.Handler r0 = X.C5627DmA.A1B
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5627DmA.A0A(X.DmA, X.DpZ):boolean");
    }

    @Override // X.DsJ
    public final C5992DtZ ALH(String str, boolean z) {
        C5992DtZ c5992DtZ = null;
        if (str == null || str.length() == 0 || !(this.A0t || this.A0u)) {
            return null;
        }
        synchronized (this.A0S) {
            if (str.equals(this.A19)) {
                AtomicLong atomicLong = this.A0g;
                long andSet = z ? atomicLong.getAndSet(0L) : atomicLong.get();
                AtomicLong atomicLong2 = this.A0h;
                c5992DtZ = new C5992DtZ(andSet, z ? atomicLong2.getAndSet(0L) : atomicLong2.get());
            }
        }
        return c5992DtZ;
    }

    @Override // X.InterfaceC5724DoJ
    public final void AfD(DmR dmR) {
        C7384Etj.A0Y(dmR, 0);
        Tracer.A01("GrootPlayerImpl.setVideoPlaybackParams");
        try {
            String str = dmR.A09;
            if (str != null && str.length() != 0 && (this.A0t || this.A0u)) {
                synchronized (this.A0S) {
                    if (!str.equals(this.A19)) {
                        this.A0g.set(0L);
                        this.A0h.set(0L);
                        this.A19 = str;
                    }
                }
            }
            this.A0f.incrementAndGet();
            this.A0F.removeCallbacks(this.A0T);
            this.A0W.set(false);
            this.A0X.set(false);
            this.A0i.set(null);
            this.A08 = dmR;
            this.A15 = new C5643DmX(this.A0v, this, this.A0y, this.A0z, dmR.A03.A0Q);
            this.A0C = new C3066Bwo();
            this.A07.A0E(dmR);
            this.A0e.set(1);
            C5645DmZ c5645DmZ = this.A16;
            if (c5645DmZ != null) {
                c5645DmZ.A08.set(1);
            }
            Tracer.A01("GrootBaseTextureViewControllerImpl.getGrootSurfaceListenerLogger");
            Tracer.A00();
            HashMap mapA0u = BV4.A0u();
            if (!mapA0u.isEmpty()) {
                C6080DvK c6080DvK = this.A0N;
                JSONObject jSONObjectA18 = BV4.A18();
                Iterator itA0i = C3cG.A0i(mapA0u);
                while (itA0i.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0i);
                    String strA0t = C60O.A0t(entryA0l);
                    try {
                        jSONObjectA18.put(strA0t, entryA0l.getValue());
                    } catch (JSONException e) {
                        CFK.A0A("GrootPlayer", FGI.A0M("Failed to serialize player config key: ", strA0t), e);
                    }
                }
                String strA0o = C60O.A0o(jSONObjectA18);
                C5962Dsy c5962Dsy = new C5962Dsy();
                AbstractC8150FWo.A02(c5962Dsy, "player_config", strA0o);
                InterfaceC6037DuY interfaceC6037DuY = c6080DvK.A00;
                if (interfaceC6037DuY != null) {
                    interfaceC6037DuY.AWX(c5962Dsy);
                }
            }
        } finally {
            Tracer.A00();
        }
    }

    public static final float A00(C5627DmA c5627DmA, float f) {
        C5645DmZ c5645DmZ = c5627DmA.A16;
        if (c5645DmZ != null) {
            int i = c5627DmA.A0Q.audioFocusAcquireFailBehavior;
            if (i != 1) {
                if (i != 2) {
                    AtomicBoolean atomicBoolean = c5645DmZ.A07;
                    if (!atomicBoolean.get() || (c5645DmZ.A05.reacquireAudioFocusOnLoss && c5645DmZ.A09.get() != Do2.A02 && atomicBoolean.compareAndSet(true, false))) {
                        if (c5645DmZ.A05.offloadGrootAudioFocus) {
                            c5645DmZ.A00.post(c5645DmZ.A06);
                            return f;
                        }
                        ReentrantLock reentrantLock = c5645DmZ.A0A;
                        reentrantLock.lock();
                        try {
                            c5645DmZ.A06.run();
                            return f;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                } else {
                    AtomicBoolean atomicBoolean2 = c5627DmA.A0a;
                    atomicBoolean2.set(true);
                    if (c5645DmZ.A01()) {
                        atomicBoolean2.set(false);
                        return f;
                    }
                }
            } else if (!c5645DmZ.A01()) {
                return 0.0f;
            }
        }
        return f;
    }

    public static final void A01(C5627DmA c5627DmA) {
        if (c5627DmA.A0d.get() || c5627DmA.A0k.get() != null) {
            return;
        }
        c5627DmA.A0j.set(C6053Duo.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C5627DmA r7) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5627DmA.A02(X.DmA):void");
    }

    public static final void A03(C5627DmA c5627DmA) {
        ViewGroup viewGroup;
        Tracer.A01("GrootPlayerImpl.tryRemovePlayerViewFromParent");
        try {
            View view = c5627DmA.A02;
            if (view != null) {
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    viewGroup.removeView(view);
                }
            }
            if (c5627DmA.A0s) {
                c5627DmA.A03 = null;
            }
        } finally {
            Tracer.A00();
        }
    }

    public static final void A05(C5627DmA c5627DmA, String str, boolean z) {
        String str2;
        c5627DmA.A07.A0F(str);
        boolean z2 = c5627DmA.A0Y.get();
        A07(c5627DmA, z);
        if (z2) {
            HatchVideoPlayerGrootListener hatchVideoPlayerGrootListener = c5627DmA.A0H;
            long jA0U = BV7.A0U(c5627DmA);
            C6060Duv c6060Duv = C6060Duv.A00;
            DmR dmR = c5627DmA.A08;
            if (dmR == null || (str2 = dmR.A09) == null) {
                str2 = "";
            }
            hatchVideoPlayerGrootListener.onVideoPaused(jA0U, false, 0L, c6060Duv, str2);
        }
        C5720DoF c5720DoF = c5627DmA.A04;
        if (c5720DoF != null) {
            c5720DoF.A00();
        }
    }

    public static final void A06(C5627DmA c5627DmA, boolean z) {
        if (c5627DmA.A10.compareAndSet(!z, z)) {
            A1B.post(new RunnableC5912Drv(c5627DmA, z));
        }
    }

    public static final void A07(C5627DmA c5627DmA, boolean z) {
        C5645DmZ c5645DmZ;
        c5627DmA.A0Y.set(false);
        if (z && c5627DmA.A0Z.get() && (c5645DmZ = c5627DmA.A16) != null) {
            C5645DmZ.A00(c5645DmZ);
        }
        A06(c5627DmA, false);
        HandlerC5659Dmo handlerC5659Dmo = c5627DmA.A05;
        if (handlerC5659Dmo != null) {
            AtomicReference<BWI> atomicReference = handlerC5659Dmo.A01;
            BWI bwi = atomicReference.get();
            BWI bwi2 = BWI.A04;
            if (bwi != bwi2) {
                HandlerC5659Dmo.A00(handlerC5659Dmo);
            }
            handlerC5659Dmo.removeMessages(2);
            handlerC5659Dmo.A03 = 0;
            atomicReference.set(bwi2);
        }
    }

    public static final boolean A08(C5627DmA c5627DmA) {
        return (!c5627DmA.A0d.get() && c5627DmA.A0k.get() == null && c5627DmA.A0j.get() == C6053Duo.A00 && c5627DmA.A0q.get() == null) ? false : true;
    }

    public static final boolean A09(C5627DmA c5627DmA) {
        C4904DDx c4904DDx;
        DmR dmR = c5627DmA.A08;
        if (dmR == null || (c4904DDx = dmR.A03) == null || dmR.A00 == EnumC2374BWi.AUDIO_ONLY.mValue) {
            return false;
        }
        BXX bxx = c4904DDx.A0A;
        return (bxx == BXX.DASH_VOD || bxx == BXX.PROGRESSIVE || bxx == BXX.BYTEARRAY) && c5627DmA.A0Q.gen.enable_dav1d_fallback;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0B(X.C5627DmA r6, X.C5790DpZ r7) {
        /*
            X.Dm7 r7 = r7.A02
            X.C7384Etj.A0T(r7)
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r6.A0Q
            X.Dlv r0 = r0.gen
            boolean r6 = r0.dav1d_fallback_frame_drop_enabled
            boolean r5 = r0.dav1d_fallback_low_fps_enabled
            boolean r4 = r0.dav1d_fallback_stall_enabled
            boolean r3 = r0.dav1d_fallback_startup_enabled
            boolean r2 = r0.dav1d_fallback_init_hang_enabled
            boolean r1 = r0.dav1d_fallback_runtime_enabled
            int r0 = r7.ordinal()
            switch(r0) {
                case 111: goto L23;
                case 112: goto L24;
                case 113: goto L21;
                case 115: goto L24;
                case 116: goto L24;
                case 129: goto L23;
                default: goto L1c;
            }
        L1c:
            switch(r0) {
                case 18: goto L20;
                case 19: goto L28;
                case 24: goto L20;
                case 62: goto L28;
                case 119: goto L28;
                case 120: goto L29;
                case 122: goto L28;
                case 123: goto L28;
                default: goto L1f;
            }
        L1f:
            r3 = 1
        L20:
            return r3
        L21:
            r6 = r5
            goto L24
        L23:
            r6 = r4
        L24:
            if (r6 != 0) goto L1f
            r3 = 0
            return r3
        L28:
            return r1
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5627DmA.A0B(X.DmA, X.DpZ):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        throw r0;
     */
    @Override // X.InterfaceC5724DoJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A4t(android.view.ViewGroup r6, java.lang.Integer r7) {
        /*
            r5 = this;
            java.lang.String r0 = "GrootPlayerImpl.attachPlayerView"
            com.facebook.debug.tracer.Tracer.A01(r0)
            X.Dpq r4 = r5.A18     // Catch: java.lang.Throwable -> L85
            android.content.Context r1 = r6.getContext()     // Catch: java.lang.Throwable -> L85
            X.C7384Etj.A0U(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = "GrootBaseTextureViewControllerImpl.createPlayerViewForAttach"
            com.facebook.debug.tracer.Tracer.A01(r0)     // Catch: java.lang.Throwable -> L85
            X.Dpw r3 = r4.A03     // Catch: java.lang.Throwable -> L80
            android.view.TextureView r2 = new android.view.TextureView     // Catch: java.lang.Throwable -> L80
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L80
            r4.A00 = r2     // Catch: java.lang.Throwable -> L80
            X.Dqg r1 = r4.A02     // Catch: java.lang.Throwable -> L80
            X.DmG r0 = new X.DmG     // Catch: java.lang.Throwable -> L80
            r0.<init>(r5, r5, r1, r3)     // Catch: java.lang.Throwable -> L80
            r4.A01 = r0     // Catch: java.lang.Throwable -> L80
            r2.setSurfaceTextureListener(r0)     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = "GrootBaseTextureViewControllerImpl.useWarmedSurfaceIfAvailable"
            com.facebook.debug.tracer.Tracer.A01(r0)     // Catch: java.lang.Throwable -> L80
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> L80
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> L85
            r5.A02 = r2     // Catch: java.lang.Throwable -> L85
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Throwable -> L85
            r0.<init>(r1, r1)     // Catch: java.lang.Throwable -> L85
            r2.setLayoutParams(r0)     // Catch: java.lang.Throwable -> L85
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r3 = r5.A0Q     // Catch: java.lang.Throwable -> L85
            boolean r0 = r3.cleanUpSfvBeforeAttaching     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L5c
            int r2 = r6.getChildCount()     // Catch: java.lang.Throwable -> L85
            r1 = 0
        L49:
            if (r1 >= r2) goto L5c
            android.view.View r0 = r6.getChildAt(r1)     // Catch: java.lang.Throwable -> L85
            boolean r0 = r0 instanceof android.view.SurfaceView     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L54
            goto L57
        L54:
            int r1 = r1 + 1
            goto L49
        L57:
            if (r1 < 0) goto L5c
            r6.removeViewAt(r1)     // Catch: java.lang.Throwable -> L85
        L5c:
            A03(r5)     // Catch: java.lang.Throwable -> L85
            android.view.View r1 = r5.A02     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L70
            if (r7 == 0) goto L6d
            int r0 = r7.intValue()     // Catch: java.lang.Throwable -> L85
            r6.addView(r1, r0)     // Catch: java.lang.Throwable -> L85
            goto L70
        L6d:
            r6.addView(r1)     // Catch: java.lang.Throwable -> L85
        L70:
            boolean r0 = r5.A0s     // Catch: java.lang.Throwable -> L85
            if (r0 != 0) goto L7a
            X.Dlv r0 = r3.gen     // Catch: java.lang.Throwable -> L85
            boolean r0 = r0.enable_zero_sized_container_recovery     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L7c
        L7a:
            r5.A03 = r6     // Catch: java.lang.Throwable -> L85
        L7c:
            com.facebook.debug.tracer.Tracer.A00()
            return
        L80:
            r0 = move-exception
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> L85
            throw r0     // Catch: java.lang.Throwable -> L85
        L85:
            r0 = move-exception
            com.facebook.debug.tracer.Tracer.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5627DmA.A4t(android.view.ViewGroup, java.lang.Integer):void");
    }

    @Override // X.InterfaceC5724DoJ
    public final int AEt() {
        C5625Dm8 c5625Dm8 = this.A07;
        C5623Dm6 c5623Dm6A0i = BV7.A0i(c5625Dm8);
        long j = c5623Dm6A0i != null ? c5623Dm6A0i.A0t : -1L;
        long j2 = c5623Dm6A0i != null ? c5623Dm6A0i.A0R : 0L;
        if (!c5625Dm8.A06.alwaysRespectMinTrackDuration || j2 <= 0) {
            j2 = j >= 0 ? j : -1L;
        }
        return (int) j2;
    }

    @Override // X.InterfaceC5724DoJ
    public final List<C3067Bwp> AFt() {
        C3066Bwo c3066Bwo;
        if (!this.A0Q.enableFrameBasedLogging || (c3066Bwo = this.A0C) == null) {
            return null;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        c3066Bwo.A00.drainTo(arrayListA0h);
        return arrayListA0h;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC5724DoJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AXg(java.lang.String r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A0b
            r0 = 0
            r1.set(r0)
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r2.A0Q
            X.Dlv r1 = r0.gen
            boolean r0 = r1.hold_audio_focus_on_pause
            if (r0 != 0) goto L1b
            boolean r0 = r1.hold_audio_focus_on_user_pause
            if (r0 == 0) goto L20
            java.lang.String r0 = "user_initiated"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L20
        L1b:
            r0 = 0
        L1c:
            A05(r2, r3, r0)
            return
        L20:
            java.lang.String r1 = r1.pause_trigger_allow_list
            if (r1 == 0) goto L3e
            int r0 = r1.length()
            if (r0 == 0) goto L3e
            if (r0 <= 0) goto L40
            java.lang.String r0 = ";"
            java.util.List r1 = X.C7BY.A0e(r1, r0)
        L32:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L3e
            boolean r0 = X.AbstractC0878AGe.A0k(r1, r3)
            if (r0 != 0) goto L1b
        L3e:
            r0 = 1
            goto L1c
        L40:
            X.AGi r1 = X.C0881AGi.A00
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5627DmA.AXg(java.lang.String):void");
    }

    @Override // X.InterfaceC5724DoJ
    public final void AcN(int i, String str) {
        C5625Dm8 c5625Dm8 = this.A07;
        C5625Dm8.A0A(c5625Dm8, "seekTo: seekTimeMsWithPreview: %d", BV5.A1Y(i));
        c5625Dm8.A0b = i;
        c5625Dm8.A0c = C5625Dm8.A0n.incrementAndGet();
        c5625Dm8.A0d = SystemClock.elapsedRealtime();
        Handler handler = c5625Dm8.A0F;
        Long lValueOf = Long.valueOf(c5625Dm8.A0b);
        Long lValueOf2 = Long.valueOf(c5625Dm8.A0c);
        Long lA0o = BV7.A0o();
        BV6.A0z(handler, c5625Dm8, new Object[]{lValueOf, lValueOf2, lA0o, lA0o, str}, 4);
    }

    @Override // X.InterfaceC5724DoJ
    public final boolean isPlaying() {
        C5625Dm8 c5625Dm8 = this.A07;
        C5623Dm6 c5623Dm6A0i = BV7.A0i(c5625Dm8);
        if (AnonymousClass002.A1L((c5625Dm8.A0a > 0L ? 1 : (c5625Dm8.A0a == 0L ? 0 : -1))) && c5623Dm6A0i != null && c5623Dm6A0i.A0o) {
            return (c5625Dm8.A06.gen.hero_player_cache_pause_state_until_done && c5625Dm8.A0H.A0F) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b6, code lost:
    
        if (r0 == false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0221 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019f A[Catch: all -> 0x02bd, TryCatch #7 {all -> 0x02bd, blocks: (B:60:0x0151, B:62:0x0157, B:64:0x0167, B:67:0x016f, B:69:0x0187, B:71:0x018b, B:73:0x0193, B:75:0x019b, B:77:0x019f, B:93:0x0201, B:95:0x0209, B:97:0x020f, B:98:0x0214, B:99:0x0220, B:107:0x023b, B:108:0x023c, B:110:0x0242, B:111:0x0246, B:127:0x027a, B:150:0x02bb, B:151:0x02bc, B:132:0x0284, B:134:0x0288, B:136:0x0290, B:138:0x029b, B:140:0x02a3, B:147:0x02b8, B:81:0x01ba, B:84:0x01c2, B:86:0x01cc, B:88:0x01d6, B:91:0x01e0, B:142:0x02af, B:92:0x01f8, B:100:0x0221, B:102:0x022b, B:104:0x0233, B:106:0x0239, B:112:0x0247, B:113:0x024b, B:115:0x0251, B:117:0x025d, B:119:0x0267, B:120:0x0269, B:122:0x026e, B:124:0x0271, B:145:0x02b6, B:125:0x0275, B:121:0x026a), top: B:206:0x0151, inners: #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ba A[Catch: all -> 0x02bd, TryCatch #7 {all -> 0x02bd, blocks: (B:60:0x0151, B:62:0x0157, B:64:0x0167, B:67:0x016f, B:69:0x0187, B:71:0x018b, B:73:0x0193, B:75:0x019b, B:77:0x019f, B:93:0x0201, B:95:0x0209, B:97:0x020f, B:98:0x0214, B:99:0x0220, B:107:0x023b, B:108:0x023c, B:110:0x0242, B:111:0x0246, B:127:0x027a, B:150:0x02bb, B:151:0x02bc, B:132:0x0284, B:134:0x0288, B:136:0x0290, B:138:0x029b, B:140:0x02a3, B:147:0x02b8, B:81:0x01ba, B:84:0x01c2, B:86:0x01cc, B:88:0x01d6, B:91:0x01e0, B:142:0x02af, B:92:0x01f8, B:100:0x0221, B:102:0x022b, B:104:0x0233, B:106:0x0239, B:112:0x0247, B:113:0x024b, B:115:0x0251, B:117:0x025d, B:119:0x0267, B:120:0x0269, B:122:0x026e, B:124:0x0271, B:145:0x02b6, B:125:0x0275, B:121:0x026a), top: B:206:0x0151, inners: #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f8 A[Catch: all -> 0x02bd, TryCatch #7 {all -> 0x02bd, blocks: (B:60:0x0151, B:62:0x0157, B:64:0x0167, B:67:0x016f, B:69:0x0187, B:71:0x018b, B:73:0x0193, B:75:0x019b, B:77:0x019f, B:93:0x0201, B:95:0x0209, B:97:0x020f, B:98:0x0214, B:99:0x0220, B:107:0x023b, B:108:0x023c, B:110:0x0242, B:111:0x0246, B:127:0x027a, B:150:0x02bb, B:151:0x02bc, B:132:0x0284, B:134:0x0288, B:136:0x0290, B:138:0x029b, B:140:0x02a3, B:147:0x02b8, B:81:0x01ba, B:84:0x01c2, B:86:0x01cc, B:88:0x01d6, B:91:0x01e0, B:142:0x02af, B:92:0x01f8, B:100:0x0221, B:102:0x022b, B:104:0x0233, B:106:0x0239, B:112:0x0247, B:113:0x024b, B:115:0x0251, B:117:0x025d, B:119:0x0267, B:120:0x0269, B:122:0x026e, B:124:0x0271, B:145:0x02b6, B:125:0x0275, B:121:0x026a), top: B:206:0x0151, inners: #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0209 A[Catch: all -> 0x02bd, TryCatch #7 {all -> 0x02bd, blocks: (B:60:0x0151, B:62:0x0157, B:64:0x0167, B:67:0x016f, B:69:0x0187, B:71:0x018b, B:73:0x0193, B:75:0x019b, B:77:0x019f, B:93:0x0201, B:95:0x0209, B:97:0x020f, B:98:0x0214, B:99:0x0220, B:107:0x023b, B:108:0x023c, B:110:0x0242, B:111:0x0246, B:127:0x027a, B:150:0x02bb, B:151:0x02bc, B:132:0x0284, B:134:0x0288, B:136:0x0290, B:138:0x029b, B:140:0x02a3, B:147:0x02b8, B:81:0x01ba, B:84:0x01c2, B:86:0x01cc, B:88:0x01d6, B:91:0x01e0, B:142:0x02af, B:92:0x01f8, B:100:0x0221, B:102:0x022b, B:104:0x0233, B:106:0x0239, B:112:0x0247, B:113:0x024b, B:115:0x0251, B:117:0x025d, B:119:0x0267, B:120:0x0269, B:122:0x026e, B:124:0x0271, B:145:0x02b6, B:125:0x0275, B:121:0x026a), top: B:206:0x0151, inners: #2, #3, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C5627DmA r32, java.lang.String r33, long r34, long r36) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5627DmA.A04(X.DmA, java.lang.String, long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0183 A[PHI: r11
  0x0183: PHI (r11v3 android.media.AudioManager) = (r11v2 android.media.AudioManager), (r11v5 android.media.AudioManager) binds: [B:17:0x0171, B:21:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5627DmA(android.content.Context r11, android.os.Handler r12, android.os.Looper r13, com.facebook.aura.common.video.HatchVideoPlayerGrootListener r14, X.C5981DtO r15, X.InterfaceC6119Dvy r16, X.Dw0 r17, X.InterfaceC6052Dun r18, X.DwW r19, X.DsL r20, X.C1F r21, X.C5875DrB r22, com.facebook.video.heroplayer.setting.HeroPlayerSetting r23, X.C6125DwR r24, X.C6129DwV r25, X.C6130DwX r26, X.C5806Dpq r27) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5627DmA.<init>(android.content.Context, android.os.Handler, android.os.Looper, com.facebook.aura.common.video.HatchVideoPlayerGrootListener, X.DtO, X.Dvy, X.Dw0, X.Dun, X.DwW, X.DsL, X.C1F, X.DrB, com.facebook.video.heroplayer.setting.HeroPlayerSetting, X.DwR, X.DwV, X.DwX, X.Dpq):void");
    }
}
