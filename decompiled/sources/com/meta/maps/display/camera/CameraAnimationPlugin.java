package com.meta.maps.display.camera;

import X.C06H;
import com.meta.maps.NativeBase;
import com.meta.maps.display.MaplibrePlugin;
import com.meta.maps.display.SDKInsets;

/* loaded from: classes4.dex */
public final class CameraAnimationPlugin extends MaplibrePlugin {
    public static final Companion Companion = new Companion();
    public SDKInsets mapContentInset;
    public SDKInsets mapContentPadding;
    public CameraTrackingController trackingController;

    public interface CompletionCallback {
        void apply();
    }

    public final class CompletionCallbackImpl extends NativeBase implements CompletionCallback {
        public static final Companion Companion = new Companion();

        public static final native void disposeNativeHandle(long j);

        @Override // com.meta.maps.display.camera.CameraAnimationPlugin.CompletionCallback
        public native void apply();

        public CompletionCallbackImpl(long j, Object obj) {
            super(j, Companion);
        }

        public final class Companion implements NativeBase.Disposer {
            public /* synthetic */ Companion(C06H c06h) {
            }

            private final void disposeNativeHandle(long j) {
                CompletionCallbackImpl.disposeNativeHandle(j);
            }

            @Override // com.meta.maps.NativeBase.Disposer
            public void dispose(long j) {
                CompletionCallbackImpl.disposeNativeHandle(j);
            }

            public Companion() {
            }
        }
    }

    private final native void cacheThisInstance();

    public static final native long create();

    public final native void fitCameraTo(CameraBounds cameraBounds);

    public final native void fitCameraTo(CameraBounds cameraBounds, CameraTransition cameraTransition);

    public final native void fitCameraTo(CameraBounds cameraBounds, CameraTransition cameraTransition, CompletionCallback completionCallback);

    public final native SDKInsets getMapContentInset();

    public final native SDKInsets getMapContentPadding();

    public final native CameraTrackingController getTrackingController();

    public final native void moveCameraTo(CameraPose cameraPose);

    public final native void moveCameraTo(CameraPose cameraPose, CameraTransition cameraTransition);

    public final native void moveCameraTo(CameraPose cameraPose, CameraTransition cameraTransition, CompletionCallback completionCallback);

    public final native void revealCoordinate(CameraReveal cameraReveal);

    public final native void revealCoordinate(CameraReveal cameraReveal, CameraTransition cameraTransition);

    public final native void revealCoordinate(CameraReveal cameraReveal, CameraTransition cameraTransition, CompletionCallback completionCallback);

    public final native void setMapContentInset(SDKInsets sDKInsets);

    public final native void setMapContentPadding(SDKInsets sDKInsets);

    public final native void setTrackingController(CameraTrackingController cameraTrackingController);

    public final class Companion {
        public final long create() {
            return CameraAnimationPlugin.create();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CameraAnimationPlugin(long j, Object obj) {
        super(j, (NativeBase.Disposer) MaplibrePlugin.Companion);
    }

    public CameraAnimationPlugin() {
        super(create(), (NativeBase.Disposer) MaplibrePlugin.Companion);
        cacheThisInstance();
    }
}
