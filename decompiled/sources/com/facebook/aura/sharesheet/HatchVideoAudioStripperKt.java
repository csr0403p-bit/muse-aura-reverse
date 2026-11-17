package com.facebook.aura.sharesheet;

import X.ATD;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BV4;
import X.C60O;
import X.C7384Etj;
import X.FGI;
import X.HtJ;
import X.HzS;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes5.dex */
public abstract class HatchVideoAudioStripperKt {
    public static final int INITIAL_SAMPLE_BUFFER_BYTES = 1048576;
    public static final int MAX_SAMPLE_BYTES = 16777216;

    public static final Object writeVideoWithoutAudio(Context context, Uri uri, File file, HtJ<? super Unit> htJ) throws IOException {
        MediaExtractor mediaExtractor = new MediaExtractor();
        Integer num = null;
        try {
            mediaExtractor.setDataSource(context, uri, (Map<String, String>) null);
            Iterator<Integer> it = ATD.A0C(0, mediaExtractor.getTrackCount()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer next = it.next();
                String string = mediaExtractor.getTrackFormat(AnonymousClass001.A0F(next)).getString("mime");
                if (string != null && string.startsWith("video/")) {
                    num = next;
                    break;
                }
            }
            Integer num2 = num;
            if (num2 == null) {
                throw BV4.A0K(AnonymousClass006.A0y(uri, "No video track in ", C60O.A0w()));
            }
            int iIntValue = num2.intValue();
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(iIntValue);
            C7384Etj.A0U(trackFormat);
            mediaExtractor.selectTrack(iIntValue);
            MediaMuxer mediaMuxer = new MediaMuxer(file.getPath(), 0);
            try {
                if (trackFormat.containsKey("rotation-degrees")) {
                    mediaMuxer.setOrientationHint(trackFormat.getInteger("rotation-degrees"));
                }
                int iAddTrack = mediaMuxer.addTrack(trackFormat);
                mediaMuxer.start();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                while (true) {
                    HzS.A05(htJ.getContext());
                    long sampleSize = mediaExtractor.getSampleSize();
                    if (sampleSize < 0) {
                        break;
                    }
                    if (sampleSize > 16777216) {
                        throw BV4.A0K(FGI.A0J("Video sample of ", sampleSize, " bytes exceeds 16777216"));
                    }
                    if (sampleSize > byteBufferAllocate.capacity()) {
                        byteBufferAllocate = ByteBuffer.allocate((int) sampleSize);
                    }
                    int sampleData = mediaExtractor.readSampleData(byteBufferAllocate, 0);
                    if (sampleData < 0) {
                        break;
                    }
                    bufferInfo.set(0, sampleData, mediaExtractor.getSampleTime(), AnonymousClass002.A1L(mediaExtractor.getSampleFlags() & 1) ? 1 : 0);
                    mediaMuxer.writeSampleData(iAddTrack, byteBufferAllocate, bufferInfo);
                    mediaExtractor.advance();
                }
                mediaMuxer.stop();
                mediaMuxer.release();
                mediaExtractor.release();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                mediaMuxer.release();
                throw th;
            }
        } catch (Throwable th2) {
            mediaExtractor.release();
            throw th2;
        }
    }
}
