package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.Bo4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2892Bo4 extends MediaCodec.Callback {
    public boolean A07;
    public final C2424BbA A09;
    public final /* synthetic */ Bo1 A0A;
    public boolean A04 = false;
    public boolean A03 = false;
    public boolean A02 = false;
    public long A00 = 0;
    public long A01 = 0;
    public boolean A06 = false;
    public boolean A05 = false;
    public boolean A08 = false;

    public C2892Bo4(Bo1 bo1) {
        C2424BbA c2424BbA;
        this.A0A = bo1;
        this.A07 = true;
        if (bo1.A0S) {
            c2424BbA = new C2424BbA(bo1.A0F, (CameraUseInconsistentTimebaseQuirk) AbstractC2411BaU.A00.A01(CameraUseInconsistentTimebaseQuirk.class), bo1.A0I);
        } else {
            c2424BbA = null;
        }
        this.A09 = c2424BbA;
        if (AbstractC2411BaU.A00.A01(CodecStuckOnFlushQuirk.class) == null || !"video/mp4v-es".equals(bo1.A0E.getString("mime"))) {
            return;
        }
        this.A07 = false;
    }

    public final void A00() {
        final Bn6 bn6;
        final Executor executor;
        if (this.A02) {
            return;
        }
        this.A02 = true;
        Bo1 bo1 = this.A0A;
        Range<Long> range = Bo1.A0U;
        Future<?> future = bo1.A07;
        if (future != null) {
            future.cancel(false);
            bo1.A07 = null;
        }
        synchronized (bo1.A0K) {
            bn6 = bo1.A02;
            executor = bo1.A06;
        }
        bo1.A07(new Runnable() { // from class: X.BoC
            public static final String __redex_internal_original_name = "EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda4";

            @Override // java.lang.Runnable
            public final void run() {
                C2892Bo4 c2892Bo4 = this;
                Executor executor2 = executor;
                final Bn6 bn62 = bn6;
                Bo1 bo12 = c2892Bo4.A0A;
                if (bo12.A04 != C79.A0Y) {
                    try {
                        executor2.execute(new Runnable() { // from class: X.BnA
                            public static final String __redex_internal_original_name = "EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda2";

                            @Override // java.lang.Runnable
                            public final void run() {
                                bn62.ASt();
                            }
                        });
                    } catch (RejectedExecutionException e) {
                        AbstractC2875Bni.A05(bo12.A0L, "Unable to post to the supplied executor.", e);
                    }
                }
            }
        });
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
        this.A0A.A0R.execute(new Runnable() { // from class: X.BoF
            public static final String __redex_internal_original_name = "EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda9";

            @Override // java.lang.Runnable
            public final void run() {
                C2892Bo4 c2892Bo4 = this;
                MediaCodec.CodecException codecException2 = codecException;
                Bo1 bo1 = c2892Bo4.A0A;
                Integer num = bo1.A04;
                switch (num.intValue()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        bo1.A06(codecException2);
                        return;
                    default:
                        throw BV5.A0U("Unknown state: ", AbstractC2828BmV.A00(num));
                }
            }
        });
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, final int i) {
        this.A0A.A0R.execute(new Runnable() { // from class: X.BoB
            public static final String __redex_internal_original_name = "EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() throws MediaCodec.CryptoException {
                C2892Bo4 c2892Bo4 = this.A01;
                int i2 = i;
                boolean z = c2892Bo4.A08;
                final Bo1 bo1 = c2892Bo4.A0A;
                if (z) {
                    AbstractC2875Bni.A03(bo1.A0L, "Receives input frame after codec is reset.");
                    return;
                }
                Integer num = bo1.A04;
                switch (num.intValue()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        Queue<Integer> queue = bo1.A0O;
                        queue.offer(Integer.valueOf(i2));
                        while (true) {
                            Queue<C3010Brs<InterfaceC2904BoR>> queue2 = bo1.A0N;
                            if (queue2.isEmpty() || queue.isEmpty()) {
                                return;
                            }
                            C3010Brs c3010BrsPoll = queue2.poll();
                            c3010BrsPoll.getClass();
                            try {
                                final C2896BoA c2896BoA = new C2896BoA(bo1.A0D, BV7.A0C(queue.poll()));
                                if (c3010BrsPoll.A03(c2896BoA)) {
                                    bo1.A0Q.add(c2896BoA);
                                    AbstractC2942BpW.A01(c2896BoA.A03).addListener(new Runnable() { // from class: X.BoL
                                        public static final String __redex_internal_original_name = "EncoderImpl$$ExternalSyntheticLambda16";

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Bo1 bo12 = bo1;
                                            bo12.A0Q.remove(c2896BoA);
                                        }
                                    }, bo1.A0R);
                                } else if (!c2896BoA.A05.getAndSet(true)) {
                                    try {
                                        c2896BoA.A01.queueInputBuffer(c2896BoA.A00, 0, 0, 0L, 0);
                                        c2896BoA.A02.A03(null);
                                    } catch (IllegalStateException e) {
                                        c2896BoA.A02.A04(e);
                                    }
                                }
                            } catch (MediaCodec.CodecException e2) {
                                bo1.A06(e2);
                                return;
                            }
                        }
                        break;
                    default:
                        throw BV5.A0U("Unknown state: ", AbstractC2828BmV.A00(num));
                }
            }
        });
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i, final MediaCodec.BufferInfo bufferInfo) {
        this.A0A.A0R.execute(new Runnable() { // from class: X.Bo2
            public static final String __redex_internal_original_name = "EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda1";

            /* JADX WARN: Removed duplicated region for block: B:133:0x02b0  */
            /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 756
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.Bo2.run():void");
            }
        });
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
        this.A0A.A0R.execute(new Runnable() { // from class: X.Bo8
            public static final String __redex_internal_original_name = "EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda10";

            @Override // java.lang.Runnable
            public final void run() {
                final Bn6 bn6;
                Executor executor;
                C2892Bo4 c2892Bo4 = this;
                final MediaFormat mediaFormat2 = mediaFormat;
                boolean z = c2892Bo4.A08;
                Bo1 bo1 = c2892Bo4.A0A;
                if (z) {
                    AbstractC2875Bni.A03(bo1.A0L, "Receives onOutputFormatChanged after codec is reset.");
                    return;
                }
                Integer num = bo1.A04;
                switch (num.intValue()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        synchronized (bo1.A0K) {
                            bn6 = bo1.A02;
                            executor = bo1.A06;
                        }
                        try {
                            executor.execute(new Runnable() { // from class: X.Bmm
                                public static final String __redex_internal_original_name = "EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda7";

                                @Override // java.lang.Runnable
                                public final void run() {
                                    bn6.AUR(new C2842Bml(mediaFormat2));
                                }
                            });
                            return;
                        } catch (RejectedExecutionException e) {
                            AbstractC2875Bni.A05(bo1.A0L, "Unable to post to the supplied executor.", e);
                            return;
                        }
                    default:
                        throw BV5.A0U("Unknown state: ", AbstractC2828BmV.A00(num));
                }
            }
        });
    }
}
