package com.facebook.rsys.rtc;

import X.BV5;
import X.C7384Etj;
import X.EQe;
import com.facebook.simplejni.NativeHolder;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.RefCounted;
import org.webrtc.VideoFrame;

/* loaded from: classes5.dex */
public class RSVideoFrame implements RefCounted {
    public final NativeHolder mNativeHolder;
    public final AtomicInteger refCount;

    public RSVideoFrame(NativeHolder nativeHolder) {
        C7384Etj.A0Y(nativeHolder, 0);
        this.refCount = BV5.A18();
        this.mNativeHolder = nativeHolder;
    }

    public static final native NativeHolder initNativeHolder(VideoFrame videoFrame, boolean z, int i, int i2, int i3, int i4, int i5);

    public native VideoFrame acquireVideoFrame();

    public native VideoFrame getVideoFrame();

    public native void onFrameReadyToRender();

    public native void onFrameRendered();

    public native void registerFrameRenderedCallback();

    public boolean equals(Object obj) {
        Object objInvoke;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof RSVideoFrame)) {
            EQe eQe = new EQe(obj, 14);
            VideoFrame videoFrameAcquireVideoFrame = acquireVideoFrame();
            if (videoFrameAcquireVideoFrame == null) {
                objInvoke = null;
            } else {
                try {
                    objInvoke = eQe.invoke(videoFrameAcquireVideoFrame);
                } finally {
                    videoFrameAcquireVideoFrame.release();
                }
            }
            Boolean bool = (Boolean) objInvoke;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        if (this.refCount.decrementAndGet() == 0) {
            NativeHolder nativeHolder = this.mNativeHolder;
            synchronized (nativeHolder) {
                nativeHolder.mDestructor.destruct();
            }
        }
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.refCount.incrementAndGet();
    }
}
