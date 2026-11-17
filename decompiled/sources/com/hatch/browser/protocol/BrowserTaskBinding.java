package com.hatch.browser.protocol;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class BrowserTaskBinding {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public BindingId bindingId;
    public BrowserTaskId browserTaskId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserTaskBinding) {
                BrowserTaskBinding browserTaskBinding = (BrowserTaskBinding) obj;
                if (!C7384Etj.areEqual(this.browserTaskId, browserTaskBinding.browserTaskId) || !C7384Etj.areEqual(this.bindingId, browserTaskBinding.bindingId)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setBindingId(BindingId bindingId) {
        C7384Etj.A0Y(bindingId, 0);
        this.bindingId = bindingId;
    }

    public final void setBrowserTaskId(BrowserTaskId browserTaskId) {
        C7384Etj.A0Y(browserTaskId, 0);
        this.browserTaskId = browserTaskId;
    }

    public static /* synthetic */ BrowserTaskBinding copy$default(BrowserTaskBinding browserTaskBinding, BrowserTaskId browserTaskId, BindingId bindingId, int i, Object obj) {
        if ((i & 1) != 0) {
            browserTaskId = browserTaskBinding.browserTaskId;
        }
        if ((i & 2) != 0) {
            bindingId = browserTaskBinding.bindingId;
        }
        AnonymousClass003.A0u(browserTaskId, bindingId);
        return new BrowserTaskBinding(browserTaskId, bindingId);
    }

    public final BrowserTaskId component1() {
        return this.browserTaskId;
    }

    public final BindingId component2() {
        return this.bindingId;
    }

    public final BindingId getBindingId() {
        return this.bindingId;
    }

    public final BrowserTaskId getBrowserTaskId() {
        return this.browserTaskId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.bindingId, AnonymousClass005.A0E(this.browserTaskId));
    }

    public String toString() {
        return C3cJ.A0L(this.bindingId, ", bindingId=", C3cG.A0f(this.browserTaskId, "BrowserTaskBinding(browserTaskId="));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public BrowserTaskBinding(BrowserTaskId browserTaskId, BindingId bindingId) {
        AnonymousClass003.A0u(browserTaskId, bindingId);
        this.browserTaskId = browserTaskId;
        this.bindingId = bindingId;
    }

    public final BrowserTaskBinding copy(BrowserTaskId browserTaskId, BindingId bindingId) {
        AnonymousClass003.A0u(browserTaskId, bindingId);
        return new BrowserTaskBinding(browserTaskId, bindingId);
    }
}
