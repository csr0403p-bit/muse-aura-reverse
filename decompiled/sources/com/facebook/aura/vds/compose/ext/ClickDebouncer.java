package com.facebook.aura.vds.compose.ext;

import X.C06H;
import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ClickDebouncer {
    public static final int $stable = 8;
    public long previousClickMs;
    public final long timeoutMs;

    public final void handleClick(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        if (System.currentTimeMillis() - this.previousClickMs >= this.timeoutMs) {
            function0.invoke();
            this.previousClickMs = System.currentTimeMillis();
        }
    }

    public /* synthetic */ ClickDebouncer(long j, int i, C06H c06h) {
        this((i & 1) != 0 ? 300L : j);
    }

    private final long getNow() {
        return System.currentTimeMillis();
    }

    public ClickDebouncer(long j) {
        this.timeoutMs = j;
    }

    public ClickDebouncer() {
        this(300L);
    }
}
