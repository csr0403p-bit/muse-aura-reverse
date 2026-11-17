package com.facebook.aura.ageverification;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ModuleLoad extends C06G {
    public final boolean downloadFailed;
    public final int request;
    public final FaceDetectionModuleState state;

    public ModuleLoad(FaceDetectionModuleState faceDetectionModuleState, int i, boolean z) {
        C7384Etj.A0Y(faceDetectionModuleState, 0);
        this.state = faceDetectionModuleState;
        this.request = i;
        this.downloadFailed = z;
    }

    public final ModuleLoad copy(FaceDetectionModuleState faceDetectionModuleState, int i, boolean z) {
        C7384Etj.A0Y(faceDetectionModuleState, 0);
        return new ModuleLoad(faceDetectionModuleState, i, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ModuleLoad) {
                ModuleLoad moduleLoad = (ModuleLoad) obj;
                if (this.state != moduleLoad.state || this.request != moduleLoad.request || this.downloadFailed != moduleLoad.downloadFailed) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ModuleLoad copy$default(ModuleLoad moduleLoad, FaceDetectionModuleState faceDetectionModuleState, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            faceDetectionModuleState = moduleLoad.state;
        }
        if ((i2 & 2) != 0) {
            i = moduleLoad.request;
        }
        if ((i2 & 4) != 0) {
            z = moduleLoad.downloadFailed;
        }
        return moduleLoad.copy(faceDetectionModuleState, i, z);
    }

    public final FaceDetectionModuleState component1() {
        return this.state;
    }

    public final int component2() {
        return this.request;
    }

    public final boolean component3() {
        return this.downloadFailed;
    }

    public final boolean getDownloadFailed() {
        return this.downloadFailed;
    }

    public final int getRequest() {
        return this.request;
    }

    public final FaceDetectionModuleState getState() {
        return this.state;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0E(this.state) + this.request) * 31, this.downloadFailed);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ModuleLoad(FaceDetectionModuleState faceDetectionModuleState, int i, boolean z, int i2, C06H c06h) {
        this(faceDetectionModuleState, C3cG.A01(i2, i), AnonymousClass005.A1O(i2, z));
    }
}
