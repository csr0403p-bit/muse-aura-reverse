package com.hatch.browser.core;

import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.core.UniffiCleaner;
import java.lang.ref.Cleaner;

/* loaded from: classes6.dex */
public final class JavaLangRefCleaner implements UniffiCleaner {
    public final Cleaner cleaner = Cleaner.create();

    public final Cleaner getCleaner() {
        return this.cleaner;
    }

    @Override // com.hatch.browser.core.UniffiCleaner
    public UniffiCleaner.Cleanable register(Object obj, Runnable runnable) {
        AnonymousClass003.A0u(obj, runnable);
        Cleaner.Cleanable cleanableRegister = this.cleaner.register(obj, runnable);
        C7384Etj.A0U(cleanableRegister);
        return new JavaLangRefCleanable(cleanableRegister);
    }
}
