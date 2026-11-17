package com.facebook.aura.network.transport;

/* loaded from: classes3.dex */
public interface HatchVmProbeResponseObserver {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final HatchVmProbeResponseObserver None = new HatchVmProbeResponseObserver() { // from class: com.facebook.aura.network.transport.HatchVmProbeResponseObserver$Companion$None$1
            @Override // com.facebook.aura.network.transport.HatchVmProbeResponseObserver
            public final void onResponse(int i, HatchHttpResponse hatchHttpResponse) {
            }
        };

        public final HatchVmProbeResponseObserver getNone() {
            return None;
        }
    }

    void onResponse(int i, HatchHttpResponse hatchHttpResponse);
}
