package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchFullscreenMapScreenKt$HatchFullscreenMapScreen$impressionKey$1$1 extends AbstractC7559F3s implements Function0<Long> {
    public static final HatchFullscreenMapScreenKt$HatchFullscreenMapScreen$impressionKey$1$1 INSTANCE = new HatchFullscreenMapScreenKt$HatchFullscreenMapScreen$impressionKey$1$1();

    public HatchFullscreenMapScreenKt$HatchFullscreenMapScreen$impressionKey$1$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(SystemClock.elapsedRealtimeNanos());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Long invoke() {
        return Long.valueOf(SystemClock.elapsedRealtimeNanos());
    }
}
