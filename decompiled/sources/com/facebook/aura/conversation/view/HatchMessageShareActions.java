package com.facebook.aura.conversation.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageShareActions {
    public static final int $stable = 0;
    public final Function0<Unit> onDownload;
    public final Function0<Unit> onShare;

    public final Function0<Unit> getOnDownload() {
        return this.onDownload;
    }

    public final Function0<Unit> getOnShare() {
        return this.onShare;
    }

    public HatchMessageShareActions(Function0<Unit> function0, Function0<Unit> function02) {
        this.onShare = function0;
        this.onDownload = function02;
    }
}
