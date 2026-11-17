package com.facebook.aura.common.video;

import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class MediaCallbacks {
    public volatile G0U<? super Exception, Unit> onError;
    public volatile Function0<Unit> onRendered;

    public final void setOnError(G0U<? super Exception, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.onError = g0u;
    }

    public final void setOnRendered(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.onRendered = function0;
    }

    public final G0U<Exception, Unit> getOnError() {
        return this.onError;
    }

    public final Function0<Unit> getOnRendered() {
        return this.onRendered;
    }

    public MediaCallbacks(G0U<? super Exception, Unit> g0u, Function0<Unit> function0) {
        AnonymousClass003.A0u(g0u, function0);
        this.onError = g0u;
        this.onRendered = function0;
    }
}
