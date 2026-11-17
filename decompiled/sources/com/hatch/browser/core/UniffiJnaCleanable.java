package com.hatch.browser.core;

import X.C7384Etj;
import com.hatch.browser.core.UniffiCleaner;
import com.sun.jna.internal.Cleaner;

/* loaded from: classes5.dex */
public final class UniffiJnaCleanable implements UniffiCleaner.Cleanable {
    public final Cleaner.Cleanable cleanable;

    public UniffiJnaCleanable(Cleaner.Cleanable cleanable) {
        C7384Etj.A0Y(cleanable, 0);
        this.cleanable = cleanable;
    }

    @Override // com.hatch.browser.core.UniffiCleaner.Cleanable
    public void clean() {
        this.cleanable.clean();
    }
}
