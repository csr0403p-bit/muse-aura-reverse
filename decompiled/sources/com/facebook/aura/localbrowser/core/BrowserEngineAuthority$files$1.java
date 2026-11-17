package com.facebook.aura.localbrowser.core;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.hatch.browser.protocol.PageAuthorityClaim;

/* loaded from: classes6.dex */
public final /* synthetic */ class BrowserEngineAuthority$files$1 extends C7438Evz implements G0U<PageAuthorityClaim, BrowserEnginePageFacts> {
    public BrowserEngineAuthority$files$1(Object obj) {
        super(1, obj, BrowserEngineAuthority.class, "requirePage", "requirePage(Lcom/hatch/browser/protocol/PageAuthorityClaim;)Lcom/facebook/aura/localbrowser/core/BrowserEnginePageFacts;", 0);
    }

    @Override // X.G0U
    public final BrowserEnginePageFacts invoke(PageAuthorityClaim pageAuthorityClaim) {
        return ((BrowserEngineAuthority) AnonymousClass006.A0o(pageAuthorityClaim, this)).requirePage(pageAuthorityClaim);
    }
}
