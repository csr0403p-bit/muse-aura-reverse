package com.facebook.aura.app.noopbindings;

import X.AnonymousClass006;
import X.InterfaceC9655GcB;
import java.util.Map;

/* loaded from: classes6.dex */
public final class NoopExecutorsStatesProviderImpl {
    public InterfaceC9655GcB getCurrentState() {
        return new InterfaceC9655GcB() { // from class: com.facebook.aura.app.noopbindings.NoopExecutorsStatesProviderImpl.getCurrentState.1
            public final Map<String, Object> state = AnonymousClass006.A10("ViewerContext", null);

            public Map<String, Object> getState() {
                return this.state;
            }
        };
    }

    public void onAfterExecution(InterfaceC9655GcB interfaceC9655GcB) {
    }

    public void onBeforeExecution(InterfaceC9655GcB interfaceC9655GcB) {
    }
}
