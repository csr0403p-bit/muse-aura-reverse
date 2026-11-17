package com.facebook.aura.gateway;

import X.C7384Etj;
import com.facebook.aura.json.HatchJsonKt;

/* loaded from: classes3.dex */
public abstract class HatchFileOperationsJsonKt {
    public static final String buildFsReadRequestBody(String str, long j, long j2) {
        C7384Etj.A0Y(str, 0);
        return HatchJsonKt.HatchJson.A02(new FsReadRequestJson(str, j, j2), FsReadRequestJson$$serializer.INSTANCE);
    }
}
