package com.facebook.aura.network.tigon;

import X.AnonymousClass003;
import X.InterfaceC3290C9q;
import com.facebook.aura.mme.AuraUnexpectedEventReporterProvider;
import java.util.Map;

/* loaded from: classes5.dex */
public final class AuraTigonUnexpectedEventReporter implements InterfaceC3290C9q {
    public static final AuraTigonUnexpectedEventReporter INSTANCE = new AuraTigonUnexpectedEventReporter();

    @Override // X.InterfaceC3290C9q
    public void report(int i, String str, Map<String, String> map) {
        AnonymousClass003.A0x(str, map);
        AuraUnexpectedEventReporterProvider.INSTANCE.report(i, str, map);
    }
}
