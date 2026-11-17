package com.facebook.rsys.sdk;

import X.AnonymousClass005;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.FGI;
import X.GVX;
import X.GVk;
import X.HxE;
import com.facebook.rsys.callintent.gen.CallIntentFactory;
import com.facebook.rsys.callmanager.callclient.gen.CallManager;
import java.util.Map;

/* loaded from: classes6.dex */
public final class RsysNativeCallAccess {
    public final String appId;
    public final CallIntentFactory callIntentFactory;
    public final CallManager callManager;
    public final GVk sdkOwner;
    public final String userId;

    public static final RsysNativeCallAccess acquire(GVk gVk, String str, String str2) {
        GVX gvx;
        AnonymousClass005.A0x(gVk, str, str2);
        if (!(gVk instanceof RsysSdkImpl)) {
            throw C60O.A0i("Native call access requires the standard RsysSdk implementation");
        }
        RsysSdkImpl rsysSdkImpl = (RsysSdkImpl) gVk;
        Map<HxE<String, String>, GVX> map = rsysSdkImpl.A09;
        C7384Etj.A0T(map);
        synchronized (map) {
            GVX gvx2 = map.get(C3cG.A0r(str, str2));
            if (gvx2 == null) {
                throw C3cG.A0Q(FGI.A0c("Cannot acquire native call access for unregistered user (", str, ", ", str2));
            }
            gvx = gvx2;
        }
        RsysSdkImpl.A01(gvx, rsysSdkImpl);
        return new RsysNativeCallAccess(str, str2, rsysSdkImpl.A0C.getValue(), (CallIntentFactory) C7384Etj.A0G(rsysSdkImpl.A0B), rsysSdkImpl);
    }

    public static /* synthetic */ void getSdkOwner$annotations() {
    }

    public final String getAppId() {
        return this.appId;
    }

    public final CallIntentFactory getCallIntentFactory() {
        return this.callIntentFactory;
    }

    public final CallManager getCallManager() {
        return this.callManager;
    }

    public final String getUserId() {
        return this.userId;
    }

    public RsysNativeCallAccess(String str, String str2, CallManager callManager, CallIntentFactory callIntentFactory, GVk gVk) {
        AnonymousClass005.A17(str, str2, callManager, callIntentFactory, gVk);
        this.userId = str;
        this.appId = str2;
        this.callManager = callManager;
        this.callIntentFactory = callIntentFactory;
        this.sdkOwner = gVk;
    }
}
