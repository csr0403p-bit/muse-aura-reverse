package com.facebook.aura.network.transport;

import X.C7384Etj;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.network.api.StefiPath;

/* loaded from: classes3.dex */
public abstract class HatchRequestPriorityPolicyKt {
    public static final HatchRequestCategory categoryFor(StefiPath stefiPath) {
        C7384Etj.A0Y(stefiPath, 0);
        return (stefiPath.equals(StefiHatchPath.FetchVms.INSTANCE) || stefiPath.equals(StefiHatchPath.LeaseVm.INSTANCE)) ? HatchRequestCategory.CRITICAL_API : HatchRequestCategory.API;
    }

    public static final HatchRequestCategory categoryFor(JarvisPath jarvisPath) {
        C7384Etj.A0Y(jarvisPath, 0);
        if (jarvisPath.equals(JarvisPath.ChatHistory.INSTANCE)) {
            return HatchRequestCategory.CRITICAL_API;
        }
        return HatchRequestCategory.API;
    }
}
