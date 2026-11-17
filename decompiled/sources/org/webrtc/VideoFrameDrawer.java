package org.webrtc;

import X.AnonymousClass002;
import X.BV4;
import X.FGI;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;

/* loaded from: classes5.dex */
public class VideoFrameDrawer {
    public static final String TAG = "VideoFrameDrawer";
    public static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    public VideoFrame lastI420Frame;
    public int renderHeight;
    public int renderWidth;
    public final float[] dstPoints = new float[6];
    public final YuvUploader yuvUploader = new YuvUploader();
    public final Matrix renderMatrix = BV4.A08();

    public class YuvUploader {
        public ByteBuffer copyBuffer;
        public int[] yuvTextures;

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public int[] uploadYuvData(int i, int i2, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i3 = i / 2;
            int[] iArr2 = {i, i3, i3};
            int i4 = i2 / 2;
            int[] iArr3 = {i2, i4, i4};
            int i5 = 0;
            int i6 = 0;
            int iMax = 0;
            do {
                int i7 = iArr[i6];
                int i8 = iArr2[i6];
                if (i7 > i8) {
                    iMax = Math.max(iMax, i8 * iArr3[i6]);
                }
                i6++;
            } while (i6 < 3);
            if (iMax > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < iMax)) {
                this.copyBuffer = ByteBuffer.allocateDirect(iMax);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                int i9 = 0;
                do {
                    this.yuvTextures[i9] = GlUtil.generateTexture(3553);
                    i9++;
                } while (i9 < 3);
            }
            do {
                GLES20.glActiveTexture(33984 + i5);
                GLES20.glBindTexture(3553, this.yuvTextures[i5]);
                int i10 = iArr[i5];
                int i11 = iArr2[i5];
                if (i10 == i11) {
                    byteBuffer = byteBufferArr[i5];
                } else {
                    YuvHelper.copyPlane(byteBufferArr[i5], i10, this.copyBuffer, i11, i11, iArr3[i5]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i5], iArr3[i5], 0, 6409, 5121, byteBuffer);
                i5++;
            } while (i5 < 3);
            return this.yuvTextures;
        }

        public /* synthetic */ YuvUploader(VideoFrameDrawerIA videoFrameDrawerIA) {
        }

        public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
        }

        public YuvUploader() {
        }
    }

    public static int distance(float f, float f2, float f3, float f4) {
        return (int) Math.round(Math.hypot(f3 - f, f4 - f2));
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer) {
        drawFrame(videoFrame, glDrawer, null);
    }

    /* renamed from: org.webrtc.VideoFrameDrawer$1, reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type;

        static {
            int[] iArr = new int[VideoFrame.TextureBuffer.Type.values().length];
            $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type = iArr;
            try {
                AnonymousClass002.A13(VideoFrame.TextureBuffer.Type.OES, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VideoFrame.TextureBuffer.Type.RGB, iArr);
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void calculateTransformedRenderSize(int i, int i2, Matrix matrix) {
        if (matrix == null) {
            this.renderWidth = i;
            this.renderHeight = i2;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        int i3 = 0;
        while (true) {
            float[] fArr = this.dstPoints;
            if (i3 >= 3) {
                float f = fArr[0];
                float f2 = fArr[1];
                this.renderWidth = distance(f, f2, fArr[2], fArr[3]);
                this.renderHeight = distance(f, f2, fArr[4], fArr[5]);
                return;
            }
            int i4 = i3 * 2;
            fArr[i4] = fArr[i4] * i;
            int i5 = i4 + 1;
            fArr[i5] = fArr[i5] * i2;
            i3++;
        }
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
    }

    public static void drawTexture(RendererCommon.GlDrawer glDrawer, VideoFrame.TextureBuffer textureBuffer, Matrix matrix, int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix2 = new Matrix(textureBuffer.getTransformMatrix());
        matrix2.preConcat(matrix);
        float[] fArrConvertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int iOrdinal = textureBuffer.getType().ordinal();
        if (iOrdinal == 0) {
            glDrawer.drawOes(textureBuffer.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6);
        } else {
            if (iOrdinal != 1) {
                throw BV4.A0c("Unknown texture type.");
            }
            glDrawer.drawRgb(textureBuffer.getTextureId(), fArrConvertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6);
        }
    }

    public VideoFrame.Buffer prepareBufferForViewportSize(VideoFrame.Buffer buffer, int i, int i2) {
        buffer.retain();
        return buffer;
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(videoFrame, glDrawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix, int i, int i2, int i3, int i4) {
        calculateTransformedRenderSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), matrix);
        int i5 = this.renderWidth;
        if (i5 > 0 && this.renderHeight > 0) {
            boolean z = videoFrame.buffer instanceof VideoFrame.TextureBuffer;
            this.renderMatrix.reset();
            this.renderMatrix.preTranslate(0.5f, 0.5f);
            if (!z) {
                this.renderMatrix.preScale(1.0f, -1.0f);
            }
            this.renderMatrix.preRotate(videoFrame.rotation);
            this.renderMatrix.preTranslate(-0.5f, -0.5f);
            if (matrix != null) {
                this.renderMatrix.preConcat(matrix);
            }
            if (z) {
                this.lastI420Frame = null;
                drawTexture(glDrawer, (VideoFrame.TextureBuffer) videoFrame.buffer, this.renderMatrix, this.renderWidth, this.renderHeight, i, i2, i3, i4);
                return;
            }
            if (videoFrame != this.lastI420Frame) {
                this.lastI420Frame = videoFrame;
                VideoFrame.I420Buffer i420 = videoFrame.buffer.toI420();
                this.yuvUploader.uploadFromBuffer(i420);
                i420.release();
            }
            glDrawer.drawYuv(this.yuvUploader.yuvTextures, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i, i2, i3, i4);
            return;
        }
        Logging.w(TAG, FGI.A0T("Illegal frame size: ", "x", i5, this.renderHeight));
    }
}
