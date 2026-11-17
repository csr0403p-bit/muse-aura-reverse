package com.facebook.aura.localbrowser;

import X.C06H;
import X.C7384Etj;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class LocalBrowserTakeoverActivitySink implements LocalBrowserActivitySink {
    public static final int $stable = 0;
    public final Function0<Integer> popup;
    public final Function0<LocalBrowserTakeoverSink> takeover;

    /* JADX WARN: Multi-variable type inference failed */
    public LocalBrowserTakeoverActivitySink(Function0<? extends LocalBrowserTakeoverSink> function0, Function0<Integer> function02) {
        C7384Etj.A0Y(function0, 0);
        this.takeover = function0;
        this.popup = function02;
    }

    @Override // com.facebook.aura.localbrowser.LocalBrowserActivitySink
    public void record(TakeoverActivityJson takeoverActivityJson) {
        Integer numInvoke;
        C7384Etj.A0Y(takeoverActivityJson, 0);
        LocalBrowserTakeoverSink localBrowserTakeoverSinkInvoke = this.takeover.invoke();
        if (localBrowserTakeoverSinkInvoke != null) {
            Function0<Integer> function0 = this.popup;
            if (function0 == null) {
                numInvoke = null;
            } else {
                numInvoke = function0.invoke();
                if (numInvoke == null) {
                    return;
                }
            }
            localBrowserTakeoverSinkInvoke.record(numInvoke, takeoverActivityJson);
        }
    }

    @Override // com.facebook.aura.localbrowser.LocalBrowserActivitySink
    public void framesDropped() {
        LocalBrowserTakeoverSink localBrowserTakeoverSinkInvoke = this.takeover.invoke();
        if (localBrowserTakeoverSinkInvoke != null) {
            localBrowserTakeoverSinkInvoke.markIncomplete();
        }
    }

    @Override // com.facebook.aura.localbrowser.LocalBrowserActivitySink
    public boolean isRecording() {
        LocalBrowserTakeoverSink localBrowserTakeoverSinkInvoke = this.takeover.invoke();
        if (localBrowserTakeoverSinkInvoke == null || !localBrowserTakeoverSinkInvoke.isRecording()) {
            return false;
        }
        Function0<Integer> function0 = this.popup;
        return function0 == null || function0.invoke() != null;
    }

    public /* synthetic */ LocalBrowserTakeoverActivitySink(Function0 function0, Function0 function02, int i, C06H c06h) {
        this(function0, (i & 2) != 0 ? null : function02);
    }
}
