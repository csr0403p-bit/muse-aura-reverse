package com.facebook.aura.vmbrowser.runtime;

import X.AnonymousClass005;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AgentBrowserSurfaceKt {
    public static final void writeDeviceClipboardThenReport(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02) {
        AnonymousClass005.A14(str, g0u, function0, function02);
        try {
            g0u.invoke(str);
            function0.invoke();
        } catch (Exception unused) {
            function02.invoke();
        }
    }
}
