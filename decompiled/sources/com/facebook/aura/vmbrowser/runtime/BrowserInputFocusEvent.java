package com.facebook.aura.vmbrowser.runtime;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C0KA;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class BrowserInputFocusEvent {
    public static final int $stable = 0;
    public final boolean focused;
    public final Function0<Boolean> isCurrentContext;
    public final String takeoverId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserInputFocusEvent) {
                BrowserInputFocusEvent browserInputFocusEvent = (BrowserInputFocusEvent) obj;
                if (!C7384Etj.areEqual(this.takeoverId, browserInputFocusEvent.takeoverId) || this.focused != browserInputFocusEvent.focused || !C7384Etj.areEqual(this.isCurrentContext, browserInputFocusEvent.isCurrentContext)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BrowserInputFocusEvent copy$default(BrowserInputFocusEvent browserInputFocusEvent, String str, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserInputFocusEvent.takeoverId;
        }
        if ((i & 2) != 0) {
            z = browserInputFocusEvent.focused;
        }
        if ((i & 4) != 0) {
            function0 = browserInputFocusEvent.isCurrentContext;
        }
        return browserInputFocusEvent.copy(str, z, function0);
    }

    public final String component1() {
        return this.takeoverId;
    }

    public final boolean component2() {
        return this.focused;
    }

    public final Function0<Boolean> component3() {
        return this.isCurrentContext;
    }

    public final boolean getFocused() {
        return this.focused;
    }

    public final String getTakeoverId() {
        return this.takeoverId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.isCurrentContext, C0KA.A01(AnonymousClass001.A0G(this.takeoverId), this.focused));
    }

    public final Function0<Boolean> isCurrentContext() {
        return this.isCurrentContext;
    }

    public String toString() {
        String str = this.takeoverId;
        boolean z = this.focused;
        Function0<Boolean> function0 = this.isCurrentContext;
        StringBuilder sbA0x = C3cI.A0x("BrowserInputFocusEvent(takeoverId=", str);
        sbA0x.append(", focused=");
        sbA0x.append(z);
        return C3cJ.A0L(function0, ", isCurrentContext=", sbA0x);
    }

    public BrowserInputFocusEvent(String str, boolean z, Function0<Boolean> function0) {
        AnonymousClass003.A0v(str, function0);
        this.takeoverId = str;
        this.focused = z;
        this.isCurrentContext = function0;
    }

    public final BrowserInputFocusEvent copy(String str, boolean z, Function0<Boolean> function0) {
        AnonymousClass003.A0v(str, function0);
        return new BrowserInputFocusEvent(str, z, function0);
    }
}
