package com.hatch.browser.core;

import X.C7384Etj;
import com.hatch.browser.core.UniffiCleaner;
import java.lang.ref.Cleaner;

/* loaded from: classes6.dex */
public final class JavaLangRefCleanable implements UniffiCleaner.Cleanable {
    public final Cleaner.Cleanable cleanable;

    public JavaLangRefCleanable(Cleaner.Cleanable cleanable) {
        C7384Etj.A0Y(cleanable, 0);
        this.cleanable = cleanable;
    }

    @Override // com.hatch.browser.core.UniffiCleaner.Cleanable
    public void clean() {
        this.cleanable.clean();
    }

    public final Cleaner.Cleanable getCleanable() {
        return this.cleanable;
    }
}
