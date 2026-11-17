package com.facebook.aura.localbrowser;

import X.AnonymousClass003;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes2.dex */
public final class LocalBrowserEndpointFailure extends Exception {
    public static final int $stable = 8;
    public final boolean ambiguous;
    public final String code;
    public final Map<String, String> details;
    public final Map<String, String> hostState;
    public final String stage;
    public final String taskId;

    public /* synthetic */ LocalBrowserEndpointFailure(String str, boolean z, String str2, String str3, Map map, Map map2, int i, C06H c06h) {
        this(str, C3cG.A1K(i & 2, z), (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, C3cH.A0o(map, i & 16), C3cH.A0o(map2, i & 32));
    }

    public final boolean getAmbiguous() {
        return this.ambiguous;
    }

    public final String getCode() {
        return this.code;
    }

    public final Map<String, String> getDetails() {
        return this.details;
    }

    public final Map<String, String> getHostState() {
        return this.hostState;
    }

    public final String getStage() {
        return this.stage;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserEndpointFailure(String str, boolean z, String str2, String str3, Map<String, String> map, Map<String, String> map2) {
        super(str);
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A0y(map, map2);
        this.code = str;
        this.ambiguous = z;
        this.taskId = str2;
        this.stage = str3;
        this.hostState = map;
        this.details = map2;
    }
}
