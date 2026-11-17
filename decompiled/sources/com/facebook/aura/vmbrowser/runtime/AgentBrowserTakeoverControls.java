package com.facebook.aura.vmbrowser.runtime;

import X.C1BN;
import X.C22I;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public interface AgentBrowserTakeoverControls {
    void copySelection(G0U<? super String, Unit> g0u);

    C22I<Unit> getDeviceClipboardActionSucceeded();

    C1BN<BrowserDeviceClipboardAction> getPendingDeviceClipboardAction();

    C22I<String> getRemoteClipboardText();

    boolean isDeviceClipboardEnabled();

    C1BN<Boolean> isPanModeEnabled();

    void pasteFromDevice(Function0<String> function0);

    AutoCloseable registerKeyboard(G0U<? super Boolean, Unit> g0u);

    void sendSpecialKey(AgentBrowserRemoteKey agentBrowserRemoteKey);

    void sendTextInput(String str);

    void setDeviceClipboardControlsExposed(String str, Object obj, boolean z);

    void setPanModeEnabled(boolean z);
}
