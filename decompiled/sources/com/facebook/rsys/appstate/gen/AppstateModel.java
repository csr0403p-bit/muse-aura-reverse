package com.facebook.rsys.appstate.gen;

import X.AbstractC7610F5x;
import X.C60O;
import X.C8923Ftf;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class AppstateModel {
    public static G50<AppstateModel> CONVERTER = C8923Ftf.A00(27);
    public static long sMcfTypeId;
    public final int backgroundedStatus;
    public final boolean isInAppBackgrounded;
    public final boolean isPictureInPicture;
    public final boolean isScreenOff;

    public static native AppstateModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppstateModel) {
                AppstateModel appstateModel = (AppstateModel) obj;
                if (this.backgroundedStatus != appstateModel.backgroundedStatus || this.isPictureInPicture != appstateModel.isPictureInPicture || this.isScreenOff != appstateModel.isScreenOff || this.isInAppBackgrounded != appstateModel.isInAppBackgrounded) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + this.backgroundedStatus) * 31) + (this.isPictureInPicture ? 1 : 0)) * 31) + (this.isScreenOff ? 1 : 0)) * 31) + (this.isInAppBackgrounded ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("AppstateModel{backgroundedStatus=");
        sbA0x.append(this.backgroundedStatus);
        sbA0x.append(",isPictureInPicture=");
        sbA0x.append(this.isPictureInPicture);
        sbA0x.append(",isScreenOff=");
        sbA0x.append(this.isScreenOff);
        sbA0x.append(",isInAppBackgrounded=");
        return AbstractC7610F5x.A0y(sbA0x, this.isInAppBackgrounded);
    }

    public AppstateModel(int i, boolean z, boolean z2, boolean z3) {
        this.backgroundedStatus = i;
        this.isPictureInPicture = z;
        this.isScreenOff = z2;
        this.isInAppBackgrounded = z3;
    }
}
