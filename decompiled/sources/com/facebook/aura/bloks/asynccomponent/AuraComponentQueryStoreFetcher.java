package com.facebook.aura.bloks.asynccomponent;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.HlX;
import X.InterfaceC10551Hsc;
import com.facebook.aura.bloks.extensions.async.AuraAsyncComponentsFetcher;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class AuraComponentQueryStoreFetcher {
    public void fetchFromResource(String str, Map<String, ? extends Object> map, boolean z, HlX hlX, Executor executor, InterfaceC10551Hsc interfaceC10551Hsc) {
        AnonymousClass005.A0y(str, map, hlX);
        AnonymousClass003.A0y(executor, interfaceC10551Hsc);
        AuraAsyncComponentsFetcher.INSTANCE.fetchBloksAsyncComponents(str, map, z, hlX, executor, interfaceC10551Hsc);
    }
}
