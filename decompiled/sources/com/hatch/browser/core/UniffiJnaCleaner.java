package com.hatch.browser.core;

import X.AnonymousClass003;
import com.hatch.browser.core.UniffiCleaner;
import com.sun.jna.internal.Cleaner;

/* loaded from: classes5.dex */
public final class UniffiJnaCleaner implements UniffiCleaner {
    public final Cleaner cleaner = Cleaner.INSTANCE;

    @Override // com.hatch.browser.core.UniffiCleaner
    public UniffiCleaner.Cleanable register(Object obj, Runnable runnable) {
        AnonymousClass003.A0u(obj, runnable);
        return new UniffiJnaCleanable(this.cleaner.register(obj, runnable));
    }
}
