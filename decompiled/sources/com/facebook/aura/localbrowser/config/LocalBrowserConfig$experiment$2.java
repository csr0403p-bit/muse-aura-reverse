package com.facebook.aura.localbrowser.config;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C31u;
import X.C4992DKo;
import X.C4993DKp;
import X.C60O;
import X.C7491Exw;
import X.InterfaceC7359EnW;
import com.facebook.aura.localbrowser.config.LocalBrowserConfig;
import com.facebook.aura.localbrowser.config.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class LocalBrowserConfig$experiment$2 extends AbstractC7559F3s implements Function0<LocalBrowserConfig.Experiment> {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(LocalBrowserConfig.class, "enabled", "<v#0>", 0);
    public static final LocalBrowserConfig$experiment$2 INSTANCE = new LocalBrowserConfig$experiment$2();

    public LocalBrowserConfig$experiment$2() {
        super(0);
    }

    public static final boolean invoke$lambda$0(C31u<Object, Boolean> c31u) {
        return AnonymousClass001.A1X(C31u.A00(c31u, $$delegatedProperties));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LocalBrowserConfig.Experiment invoke() {
        C4992DKo c4992DKoA00 = C4992DKo.A00(new C4992DKo());
        c4992DKoA00.A02 = true;
        C7491Exw c7491Exw = MC.hatch_browser.enable_android_local_browser;
        AnonymousClass003.A0u(c7491Exw, c4992DKoA00);
        boolean zInvoke$lambda$0 = invoke$lambda$0(new AuraMobileConfigDelegatesKt.C126951(c7491Exw, c4992DKoA00));
        C4993DKp c4993DKp = c4992DKoA00.A00;
        return new LocalBrowserConfig.Experiment(zInvoke$lambda$0, AnonymousClass006.A0x(c4993DKp.A01), c4993DKp.A00);
    }
}
