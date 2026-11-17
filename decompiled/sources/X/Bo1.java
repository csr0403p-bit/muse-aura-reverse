package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.LruCache;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class Bo1 implements InterfaceC2849Bms {
    public static final Range<Long> A0U;
    public Integer A04;
    public Future<?> A07;
    public final MediaCodec A0D;
    public final MediaFormat A0E;
    public final BWz A0F;
    public final Bn3 A0G;
    public final InterfaceC2372BWd A0H;
    public final ListenableFuture<Void> A0J;
    public final String A0L;
    public final Executor A0R;
    public final boolean A0S;
    public final C3010Brs<Void> A0T;
    public final Object A0K = C3cG.A0T();
    public final Queue<Integer> A0O = BV4.A0s();
    public final Queue<C3010Brs<InterfaceC2904BoR>> A0N = BV4.A0s();
    public final Set<InterfaceC2904BoR> A0Q = C60O.A13();
    public final Set<C2894Bo6> A0P = C60O.A13();
    public final Deque<Range<Long>> A0M = BV4.A0s();
    public final InterfaceC2425BbB A0I = new C2426BbC();
    public Bn6 A02 = Bn6.A00;
    public Executor A06 = ExecutorC2446BbZ.A00();
    public Range<Long> A01 = A0U;
    public long A00 = 0;
    public boolean A0B = false;
    public Long A05 = null;
    public Future<?> A08 = null;
    public C2892Bo4 A03 = null;
    public boolean A09 = false;
    public boolean A0C = false;
    public boolean A0A = false;

    public final void A06(MediaCodec.CodecException codecException) {
        A05(1, codecException.getMessage(), codecException);
    }

    public static void A00(Bo1 bo1) {
        Surface surface;
        HashSet hashSetA0x;
        if (bo1.A09) {
            bo1.A0D.stop();
            bo1.A09 = false;
        }
        bo1.A0D.release();
        Bn3 bn3 = bo1.A0G;
        if (bn3 instanceof C2848Bmr) {
            C2848Bmr c2848Bmr = (C2848Bmr) bn3;
            synchronized (c2848Bmr.A03) {
                surface = c2848Bmr.A00;
                c2848Bmr.A00 = null;
                Set<Surface> set = c2848Bmr.A04;
                hashSetA0x = BV4.A0x(set);
                set.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSetA0x.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        A02(bo1, C79.A0Z);
        bo1.A0T.A03(null);
    }

    public static void A01(Bo1 bo1) {
        Bo1 bo12;
        Surface surfaceCreateInputSurface;
        InterfaceC2846Bmp interfaceC2846Bmp;
        Executor executor;
        bo1.A01 = A0U;
        bo1.A00 = 0L;
        bo1.A0M.clear();
        bo1.A0O.clear();
        Queue<C3010Brs<InterfaceC2904BoR>> queue = bo1.A0N;
        Iterator<C3010Brs<InterfaceC2904BoR>> it = queue.iterator();
        while (it.hasNext()) {
            it.next().A02();
        }
        queue.clear();
        MediaCodec mediaCodec = bo1.A0D;
        mediaCodec.reset();
        bo1.A09 = false;
        bo1.A0C = false;
        bo1.A0A = false;
        bo1.A0B = false;
        Future<?> future = bo1.A08;
        if (future != null) {
            future.cancel(true);
            bo1.A08 = null;
        }
        Future<?> future2 = bo1.A07;
        if (future2 != null) {
            future2.cancel(false);
            bo1.A07 = null;
        }
        C2892Bo4 c2892Bo4 = bo1.A03;
        if (c2892Bo4 != null) {
            c2892Bo4.A08 = true;
        }
        C2892Bo4 c2892Bo42 = new C2892Bo4(bo1);
        bo1.A03 = c2892Bo42;
        mediaCodec.setCallback(c2892Bo42);
        mediaCodec.configure(bo1.A0E, (Surface) null, (MediaCrypto) null, 1);
        Bn3 bn3 = bo1.A0G;
        if (bn3 instanceof C2848Bmr) {
            C2848Bmr c2848Bmr = (C2848Bmr) bn3;
            BX1 bx1A01 = AbstractC2411BaU.A00.A01(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (c2848Bmr.A03) {
                Surface surface = c2848Bmr.A00;
                if (bx1A01 == null) {
                    if (surface == null) {
                        surfaceCreateInputSurface = MediaCodec.createPersistentInputSurface();
                        c2848Bmr.A00 = surfaceCreateInputSurface;
                        surface = surfaceCreateInputSurface;
                    } else {
                        surfaceCreateInputSurface = null;
                    }
                    bo12 = c2848Bmr.A05;
                    bo12.A0D.setInputSurface(surface);
                } else {
                    if (surface != null) {
                        c2848Bmr.A04.add(surface);
                    }
                    bo12 = c2848Bmr.A05;
                    surfaceCreateInputSurface = bo12.A0D.createInputSurface();
                    c2848Bmr.A00 = surfaceCreateInputSurface;
                }
                interfaceC2846Bmp = c2848Bmr.A01;
                executor = c2848Bmr.A02;
            }
            if (surfaceCreateInputSurface == null || interfaceC2846Bmp == null || executor == null) {
                return;
            }
            try {
                executor.execute(new RunnableC2847Bmq(surfaceCreateInputSurface, interfaceC2846Bmp));
            } catch (RejectedExecutionException e) {
                AbstractC2875Bni.A05(bo12.A0L, "Unable to post to the supplied executor.", e);
            }
        }
    }

    public static void A02(Bo1 bo1, Integer num) {
        Integer num2 = bo1.A04;
        if (num2 != num) {
            AbstractC2875Bni.A01(bo1.A0L, FGI.A0d("Transitioning encoder internal state: ", num2 != null ? AbstractC2828BmV.A00(num2) : HatchCcvLoggingKt.NO_POSTAL_FIELD, " --> ", AbstractC2828BmV.A00(num)));
            bo1.A04 = num;
        }
    }

    public static final void A03(Bo1 bo1, final String str, final Throwable th, final int i) {
        final Bn6 bn6;
        Executor executor;
        synchronized (bo1.A0K) {
            bn6 = bo1.A02;
            executor = bo1.A06;
        }
        try {
            executor.execute(new Runnable() { // from class: X.Bn7
                public static final String __redex_internal_original_name = "EncoderImpl$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    Bn6 bn62 = bn6;
                    int i2 = i;
                    String str2 = str;
                    Throwable th2 = th;
                    Range<Long> range = Bo1.A0U;
                    bn62.ASs(new EncodeException(i2, str2, th2));
                }
            });
        } catch (RejectedExecutionException e) {
            AbstractC2875Bni.A05(bo1.A0L, "Unable to post to the supplied executor.", e);
        }
    }

    public final void A04() {
        AbstractC2875Bni.A01(this.A0L, "signalCodecStop");
        if (this.A0G instanceof C2848Bmr) {
            try {
                if (AbstractC2411BaU.A00.A01(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    final C2892Bo4 c2892Bo4 = this.A03;
                    final Executor executor = this.A0R;
                    Future<?> future = this.A07;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.A07 = BoS.A00().schedule(new Runnable() { // from class: X.BoI
                        public static final String __redex_internal_original_name = "EncoderImpl$$ExternalSyntheticLambda12";

                        @Override // java.lang.Runnable
                        public final void run() {
                            Executor executor2 = executor;
                            final C2892Bo4 c2892Bo42 = c2892Bo4;
                            Range<Long> range = Bo1.A0U;
                            c2892Bo42.getClass();
                            executor2.execute(new Runnable() { // from class: X.BoN
                                public static final String __redex_internal_original_name = "EncoderImpl$$ExternalSyntheticLambda13";

                                @Override // java.lang.Runnable
                                public final void run() {
                                    c2892Bo42.A00();
                                }
                            });
                        }
                    }, 1000L, TimeUnit.MILLISECONDS);
                }
                this.A0D.signalEndOfInputStream();
                this.A0A = true;
            } catch (MediaCodec.CodecException e) {
                A06(e);
            }
        }
    }

    public final void A05(final int i, final String str, final Throwable th) {
        switch (this.A04.intValue()) {
            case 0:
                A03(this, str, th, i);
                A01(this);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                A02(this, C79.A0Y);
                A07(new Runnable() { // from class: X.BoM
                    public static final String __redex_internal_original_name = "EncoderImpl$$ExternalSyntheticLambda7";

                    @Override // java.lang.Runnable
                    public final void run() {
                        Bo1.A03(this.A01, str, th, i);
                    }
                });
                break;
            case 7:
                AbstractC2875Bni.A06(this.A0L, FGI.A0A(i, "Get more than one error: ", str, "(", ")"), th);
                break;
        }
    }

    public final void A07(final Runnable runnable) {
        String str = this.A0L;
        AbstractC2875Bni.A01(str, "stopMediaCodec");
        final ArrayList arrayListA0h = C3cG.A0h();
        Set<C2894Bo6> set = this.A0P;
        Iterator<C2894Bo6> it = set.iterator();
        while (it.hasNext()) {
            arrayListA0h.add(AbstractC2942BpW.A01(it.next().A01));
        }
        Set<InterfaceC2904BoR> set2 = this.A0Q;
        Iterator<InterfaceC2904BoR> it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayListA0h.add(AbstractC2942BpW.A01(((C2896BoA) it2.next()).A03));
        }
        if (!arrayListA0h.isEmpty()) {
            AbstractC2875Bni.A01(str, FGI.A0T("Waiting for resources to return. encoded data = ", ", input buffers = ", set.size(), set2.size()));
        }
        new Bpa(BV4.A0t(arrayListA0h), ExecutorC2446BbZ.A00(), false).addListener(new Runnable() { // from class: X.Bo7
            public static final String __redex_internal_original_name = "EncoderImpl$$ExternalSyntheticLambda6";

            @Override // java.lang.Runnable
            public final void run() {
                Bo1 bo1 = this.A00;
                List list = arrayListA0h;
                Runnable runnable2 = runnable;
                if (bo1.A04 != C79.A0Y) {
                    if (!list.isEmpty()) {
                        AbstractC2875Bni.A01(bo1.A0L, "encoded data and input buffers are returned");
                    }
                    if ((bo1.A0G instanceof C2848Bmr) && !bo1.A0C && AbstractC2411BaU.A00.A01(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) == null) {
                        bo1.A0D.flush();
                        bo1.A09 = true;
                    } else {
                        bo1.A0D.stop();
                    }
                }
                runnable2.run();
                Integer num = bo1.A04;
                if (num == C79.A0W) {
                    Bo1.A00(bo1);
                    return;
                }
                if (!bo1.A09) {
                    Bo1.A01(bo1);
                }
                Bo1.A02(bo1, C79.A00);
                if (num == C79.A0P || num == C79.A0T) {
                    long jA0G = BV8.A0G();
                    Executor executor = bo1.A0R;
                    executor.execute(new RunnableC2891Bo3(bo1, jA0G));
                    if (num == C79.A0T) {
                        executor.execute(new Bo9(bo1, BV8.A0G()));
                    }
                }
            }
        }, this.A0R);
    }

    public Bo1(InterfaceC2573Be5 interfaceC2573Be5, Executor executor) throws InvalidConfigException, IOException {
        int integer;
        int iA05;
        executor.getClass();
        interfaceC2573Be5.getClass();
        LruCache<String, MediaCodecInfo> lruCache = BeL.A00;
        Bd7 bd7 = (Bd7) interfaceC2573Be5;
        String str = bd7.A08;
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
            this.A0D = mediaCodecCreateEncoderByType;
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            this.A0R = new ExecutorC2949Bpk(executor);
            Size size = bd7.A05;
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, size.getWidth(), size.getHeight());
            mediaFormatCreateVideoFormat.setInteger("color-format", bd7.A02);
            mediaFormatCreateVideoFormat.setInteger("bitrate", bd7.A01);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", bd7.A03);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", bd7.A00);
            int i = bd7.A04;
            if (i != -1) {
                mediaFormatCreateVideoFormat.setInteger("profile", i);
            }
            BdE bdE = (BdE) bd7.A07;
            int i2 = bdE.A01;
            if (i2 != 0) {
                mediaFormatCreateVideoFormat.setInteger("color-standard", i2);
            }
            int i3 = bdE.A02;
            if (i3 != 0) {
                mediaFormatCreateVideoFormat.setInteger("color-transfer", i3);
            }
            int i4 = bdE.A00;
            if (i4 != 0) {
                mediaFormatCreateVideoFormat.setInteger("color-range", i4);
            }
            this.A0E = mediaFormatCreateVideoFormat;
            BWz bWz = bd7.A06;
            this.A0F = bWz;
            if (!(interfaceC2573Be5 instanceof BdF)) {
                throw new InvalidConfigException("Unknown encoder config type");
            }
            this.A0L = "VideoEncoder";
            this.A0S = true;
            this.A0G = new C2848Bmr(this);
            C2572Be4 c2572Be4 = new C2572Be4(codecInfo, str);
            BeS.A07(this.A0S, null);
            if (mediaFormatCreateVideoFormat.containsKey("bitrate") && integer != (iA05 = BV8.A05(c2572Be4.A00.getBitrateRange(), (integer = mediaFormatCreateVideoFormat.getInteger("bitrate"))))) {
                mediaFormatCreateVideoFormat.setInteger("bitrate", iA05);
                AbstractC2875Bni.A01(this.A0L, FGI.A0T("updated bitrate from ", " to ", integer, iA05));
            }
            this.A0H = c2572Be4;
            AbstractC2875Bni.A00(bWz, "mInputTimebase = ", this.A0L);
            AbstractC2875Bni.A00(mediaFormatCreateVideoFormat, "mMediaFormat = ", this.A0L);
            try {
                A01(this);
                AtomicReference atomicReferenceA15 = BV4.A15();
                this.A0J = AbstractC2942BpW.A01(AbstractC2947Bpi.A01(atomicReferenceA15, 28));
                Object obj = atomicReferenceA15.get();
                obj.getClass();
                this.A0T = (C3010Brs) obj;
                A02(this, C79.A00);
            } catch (MediaCodec.CodecException e) {
                throw new InvalidConfigException(e);
            }
        } catch (IOException | IllegalArgumentException e2) {
            throw new InvalidConfigException(e2);
        }
    }

    static {
        Long lValueOf = Long.valueOf(LinkEncryptedPairingKt.LINK_COUNTER_MAX);
        A0U = Range.create(lValueOf, lValueOf);
    }
}
