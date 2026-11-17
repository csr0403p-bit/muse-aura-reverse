package org.webrtc;

import X.C60O;
import X.C8j3;
import android.graphics.Matrix;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class VideoFrame implements RefCounted {
    public final Buffer buffer;
    public final int rotation;
    public final long rtpTimestamp;
    public final long timestampNs;

    public interface Buffer extends RefCounted {
        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        int getBufferType();

        int getHeight();

        int getWidth();

        @Override // org.webrtc.RefCounted
        void release();

        @Override // org.webrtc.RefCounted
        void retain();

        I420Buffer toI420();

        /* renamed from: org.webrtc.VideoFrame$Buffer$-CC, reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static int $default$getBufferType(Buffer buffer) {
                return 0;
            }
        }
    }

    public interface I420Buffer extends Buffer {
        @Override // org.webrtc.VideoFrame.Buffer
        int getBufferType();

        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();

        /* renamed from: org.webrtc.VideoFrame$I420Buffer$-CC, reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static int $default$getBufferType(I420Buffer i420Buffer) {
                return 1;
            }
        }
    }

    public interface TextureBuffer extends Buffer {

        /* renamed from: org.webrtc.VideoFrame$TextureBuffer$-CC, reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static TextureBuffer $default$applyTransformMatrix(TextureBuffer textureBuffer, Matrix matrix, int i, int i2) {
                throw C8j3.A18("Not implemented");
            }
        }

        public enum Type {
            OES(36197),
            RGB(3553);

            public final int glTarget;

            public int getGlTarget() {
                return this.glTarget;
            }

            Type(int i) {
                this.glTarget = i;
            }
        }

        TextureBuffer applyTransformMatrix(Matrix matrix, int i, int i2);

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();

        int getUnscaledHeight();

        int getUnscaledWidth();
    }

    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotatedHeight() {
        int i = this.rotation % 180;
        Buffer buffer = this.buffer;
        return i == 0 ? buffer.getHeight() : buffer.getWidth();
    }

    public int getRotatedWidth() {
        int i = this.rotation % 180;
        Buffer buffer = this.buffer;
        return i == 0 ? buffer.getWidth() : buffer.getHeight();
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getRtpTimestamp() {
        return this.rtpTimestamp;
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        this.buffer.release();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.buffer.retain();
    }

    public VideoFrame(Buffer buffer, int i, long j, long j2) {
        if (buffer == null) {
            throw C60O.A0i("buffer not allowed to be null");
        }
        if (i % 90 != 0) {
            throw C60O.A0i("rotation must be a multiple of 90");
        }
        this.buffer = buffer;
        this.rotation = i;
        this.timestampNs = j;
        this.rtpTimestamp = j2;
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        this(buffer, i, j, 0L);
    }
}
