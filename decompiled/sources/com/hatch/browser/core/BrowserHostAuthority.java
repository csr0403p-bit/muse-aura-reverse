package com.hatch.browser.core;

import X.HtJ;
import com.hatch.browser.protocol.Access;
import com.hatch.browser.protocol.PageAuthorityClaim;

/* loaded from: classes6.dex */
public interface BrowserHostAuthority {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    Object authorize(PageAuthorityClaim pageAuthorityClaim, Access access, HtJ<? super NativePageAuthorityDecision> htJ);
}
