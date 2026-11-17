package com.facebook.acra.info;

import X.AnonymousClass003;
import X.BV4;
import X.C3cG;
import X.C7384Etj;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ExternalProcessInfo {
    public final LinkedHashMap<String, String> acraFields = C3cG.A0j();
    public String message;
    public Integer pid;

    public final String getAcraField(String str) {
        C7384Etj.A0Y(str, 0);
        return BV4.A0h(str, this.acraFields);
    }

    public final Map<String, String> getAcraFields() {
        return Collections.unmodifiableMap(this.acraFields);
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getPid() {
        return this.pid;
    }

    public final void setAcraField(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.acraFields.put(str, str2);
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setPid(Integer num) {
        this.pid = num;
    }
}
