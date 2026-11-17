package org.webrtc;

import X.C60O;
import X.C8j3;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* loaded from: classes5.dex */
public class JavaI420Buffer implements VideoFrame.I420Buffer {
    public final ByteBuffer dataU;
    public final ByteBuffer dataV;
    public final ByteBuffer dataY;
    public final int height;
    public final RefCountDelegate refCountDelegate;
    public final int strideU;
    public final int strideV;
    public final int strideY;
    public final int width;

    public interface Natives {
        void cropAndScaleI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4, int i8, ByteBuffer byteBuffer5, int i9, ByteBuffer byteBuffer6, int i10, int i11, int i12);
    }

    public static JavaI420Buffer allocate(int i, int i2) {
        int i3 = (i2 + 1) / 2;
        int i4 = (i + 1) / 2;
        int i5 = i * i2;
        int i6 = i4 * i3;
        int i7 = i5 + i6;
        final ByteBuffer byteBufferAllocateByteBuffer = JniCommonJni.get().allocateByteBuffer((i4 * 2 * i3) + i5);
        byteBufferAllocateByteBuffer.position(0);
        byteBufferAllocateByteBuffer.limit(i5);
        ByteBuffer byteBufferSlice = byteBufferAllocateByteBuffer.slice();
        byteBufferAllocateByteBuffer.position(i5);
        byteBufferAllocateByteBuffer.limit(i7);
        ByteBuffer byteBufferSlice2 = byteBufferAllocateByteBuffer.slice();
        byteBufferAllocateByteBuffer.position(i7);
        byteBufferAllocateByteBuffer.limit(i7 + i6);
        return new JavaI420Buffer(i, i2, byteBufferSlice, i, byteBufferSlice2, i4, byteBufferAllocateByteBuffer.slice(), i4, new Runnable() { // from class: org.webrtc.JavaI420Buffer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                JniCommon.nativeFreeByteBuffer(byteBufferAllocateByteBuffer);
            }
        });
    }

    public static void checkCapacity(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4 = (i3 * (i2 - 1)) + i;
        if (byteBuffer.capacity() < i4) {
            throw C8j3.A0v("Buffer must be at least ", " bytes, but was ", i4, byteBuffer.capacity());
        }
    }

    public static VideoFrame.Buffer cropAndScaleI420(final VideoFrame.I420Buffer i420Buffer, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 != i5 || i4 != i6) {
            JavaI420Buffer javaI420BufferAllocate = allocate(i5, i6);
            JavaI420BufferJni.get().cropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i, i2, i3, i4, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV(), i5, i6);
            return javaI420BufferAllocate;
        }
        ByteBuffer dataY = i420Buffer.getDataY();
        ByteBuffer dataU = i420Buffer.getDataU();
        ByteBuffer dataV = i420Buffer.getDataV();
        dataY.position(i + (i420Buffer.getStrideY() * i2));
        int i7 = i / 2;
        int i8 = i2 / 2;
        dataU.position((i420Buffer.getStrideU() * i8) + i7);
        dataV.position(i7 + (i8 * i420Buffer.getStrideV()));
        i420Buffer.retain();
        return wrap(i5, i6, dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), new Runnable() { // from class: org.webrtc.JavaI420Buffer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                i420Buffer.release();
            }
        });
    }

    public static JavaI420Buffer wrap(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw C60O.A0i("Data buffers cannot be null.");
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw C60O.A0i("Data buffers must be direct byte buffers.");
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
        ByteBuffer byteBufferSlice3 = byteBuffer3.slice();
        int i6 = (i + 1) / 2;
        int i7 = (i2 + 1) / 2;
        checkCapacity(byteBufferSlice, i, i2, i3);
        checkCapacity(byteBufferSlice2, i6, i7, i4);
        checkCapacity(byteBufferSlice3, i6, i7, i5);
        return new JavaI420Buffer(i, i2, byteBufferSlice, i3, byteBufferSlice2, i4, byteBufferSlice3, i5, runnable);
    }

    @Override // org.webrtc.VideoFrame.I420Buffer, org.webrtc.VideoFrame.Buffer
    public /* synthetic */ int getBufferType() {
        return 1;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    public JavaI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i3;
        this.strideU = i4;
        this.strideV = i5;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return cropAndScaleI420(this, i, i2, i3, i4, i5, i6);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }
}
