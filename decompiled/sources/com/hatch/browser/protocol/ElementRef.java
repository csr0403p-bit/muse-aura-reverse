package com.hatch.browser.protocol;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class ElementRef {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public String reference;
    public RefScope scope;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ElementRef) {
                ElementRef elementRef = (ElementRef) obj;
                if (!C7384Etj.areEqual(this.reference, elementRef.reference) || !C7384Etj.areEqual(this.scope, elementRef.scope)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setReference(String str) {
        C7384Etj.A0Y(str, 0);
        this.reference = str;
    }

    public final void setScope(RefScope refScope) {
        C7384Etj.A0Y(refScope, 0);
        this.scope = refScope;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ ElementRef copy$default(ElementRef elementRef, String str, RefScope refScope, int i, Object obj) {
        if ((i & 1) != 0) {
            str = elementRef.reference;
        }
        if ((i & 2) != 0) {
            refScope = elementRef.scope;
        }
        AnonymousClass003.A0u(str, refScope);
        return new ElementRef(str, refScope);
    }

    public final String component1() {
        return this.reference;
    }

    public final RefScope component2() {
        return this.scope;
    }

    public final String getReference() {
        return this.reference;
    }

    public final RefScope getScope() {
        return this.scope;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.scope, AnonymousClass001.A0G(this.reference));
    }

    public String toString() {
        return C3cJ.A0L(this.scope, ", scope=", C3cI.A0x("ElementRef(reference=", this.reference));
    }

    public ElementRef(String str, RefScope refScope) {
        AnonymousClass003.A0u(str, refScope);
        this.reference = str;
        this.scope = refScope;
    }

    public final ElementRef copy(String str, RefScope refScope) {
        AnonymousClass003.A0u(str, refScope);
        return new ElementRef(str, refScope);
    }
}
