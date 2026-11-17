package com.facebook.rsys.appinfo.gen;

import X.AnonymousClass001;
import X.BV8;
import X.C8923Ftf;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class AppInfo {
    public static G50<AppInfo> CONVERTER = C8923Ftf.A00(25);
    public static long sMcfTypeId;
    public final String appId;
    public final String deviceId;

    public static native AppInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppInfo) {
                AppInfo appInfo = (AppInfo) obj;
                if (!this.appId.equals(appInfo.appId) || !this.deviceId.equals(appInfo.deviceId)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.deviceId, BV8.A0B(this.appId));
    }

    public String toString() {
        return FGI.A0h("AppInfo{appId=", this.appId, ",deviceId=", this.deviceId, "}");
    }

    public AppInfo(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.appId = str;
        this.deviceId = str2;
    }
}
