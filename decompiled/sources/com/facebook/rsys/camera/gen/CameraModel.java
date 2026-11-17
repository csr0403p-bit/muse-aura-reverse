package com.facebook.rsys.camera.gen;

import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class CameraModel {
    public static G50<CameraModel> CONVERTER = C8926Fti.A00(39);
    public static long sMcfTypeId;
    public final int activeCameraIdx;
    public final boolean cameraEverOn;
    public final boolean cameraOn;
    public final boolean cameraPaused;
    public final int cameraState;
    public final ArrayList<Camera> cameras;
    public final StreamInfo streamInfo;
    public final int targetCaptureResolutionHeight;
    public final int targetCaptureResolutionWidth;
    public final int targetFps;
    public final boolean userHasDeclinedVideoPrompt;

    public static native CameraModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CameraModel) {
                CameraModel cameraModel = (CameraModel) obj;
                if (this.cameraOn != cameraModel.cameraOn || this.cameraState != cameraModel.cameraState || this.cameraPaused != cameraModel.cameraPaused || this.activeCameraIdx != cameraModel.activeCameraIdx || !this.cameras.equals(cameraModel.cameras) || this.cameraEverOn != cameraModel.cameraEverOn || this.userHasDeclinedVideoPrompt != cameraModel.userHasDeclinedVideoPrompt || this.targetFps != cameraModel.targetFps || this.targetCaptureResolutionWidth != cameraModel.targetCaptureResolutionWidth || this.targetCaptureResolutionHeight != cameraModel.targetCaptureResolutionHeight || !this.streamInfo.equals(cameraModel.streamInfo)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.streamInfo, (((((((((AnonymousClass005.A0F(this.cameras, (((((((527 + (this.cameraOn ? 1 : 0)) * 31) + this.cameraState) * 31) + (this.cameraPaused ? 1 : 0)) * 31) + this.activeCameraIdx) * 31) + (this.cameraEverOn ? 1 : 0)) * 31) + (this.userHasDeclinedVideoPrompt ? 1 : 0)) * 31) + this.targetFps) * 31) + this.targetCaptureResolutionWidth) * 31) + this.targetCaptureResolutionHeight) * 31);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("CameraModel{cameraOn=");
        sbA0x.append(this.cameraOn);
        sbA0x.append(",cameraState=");
        sbA0x.append(this.cameraState);
        sbA0x.append(",cameraPaused=");
        sbA0x.append(this.cameraPaused);
        sbA0x.append(",activeCameraIdx=");
        sbA0x.append(this.activeCameraIdx);
        sbA0x.append(",cameras=");
        sbA0x.append(this.cameras);
        sbA0x.append(",cameraEverOn=");
        sbA0x.append(this.cameraEverOn);
        sbA0x.append(",userHasDeclinedVideoPrompt=");
        sbA0x.append(this.userHasDeclinedVideoPrompt);
        sbA0x.append(",targetFps=");
        sbA0x.append(this.targetFps);
        sbA0x.append(",targetCaptureResolutionWidth=");
        sbA0x.append(this.targetCaptureResolutionWidth);
        sbA0x.append(",targetCaptureResolutionHeight=");
        sbA0x.append(this.targetCaptureResolutionHeight);
        sbA0x.append(",streamInfo=");
        return BV8.A0v(this.streamInfo, sbA0x);
    }

    public CameraModel(boolean z, int i, boolean z2, int i2, ArrayList<Camera> arrayList, boolean z3, boolean z4, int i3, int i4, int i5, StreamInfo streamInfo) {
        arrayList.getClass();
        streamInfo.getClass();
        this.cameraOn = z;
        this.cameraState = i;
        this.cameraPaused = z2;
        this.activeCameraIdx = i2;
        this.cameras = arrayList;
        this.cameraEverOn = z3;
        this.userHasDeclinedVideoPrompt = z4;
        this.targetFps = i3;
        this.targetCaptureResolutionWidth = i4;
        this.targetCaptureResolutionHeight = i5;
        this.streamInfo = streamInfo;
    }
}
