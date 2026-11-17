package com.hatch.browser.protocol;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class CoordinateScope {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public DocumentKey document;
    public ViewportScope viewport;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CoordinateScope) {
                CoordinateScope coordinateScope = (CoordinateScope) obj;
                if (!C7384Etj.areEqual(this.document, coordinateScope.document) || !C7384Etj.areEqual(this.viewport, coordinateScope.viewport)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setDocument(DocumentKey documentKey) {
        C7384Etj.A0Y(documentKey, 0);
        this.document = documentKey;
    }

    public final void setViewport(ViewportScope viewportScope) {
        C7384Etj.A0Y(viewportScope, 0);
        this.viewport = viewportScope;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ CoordinateScope copy$default(CoordinateScope coordinateScope, DocumentKey documentKey, ViewportScope viewportScope, int i, Object obj) {
        if ((i & 1) != 0) {
            documentKey = coordinateScope.document;
        }
        if ((i & 2) != 0) {
            viewportScope = coordinateScope.viewport;
        }
        AnonymousClass003.A0u(documentKey, viewportScope);
        return new CoordinateScope(documentKey, viewportScope);
    }

    public final DocumentKey component1() {
        return this.document;
    }

    public final ViewportScope component2() {
        return this.viewport;
    }

    public final DocumentKey getDocument() {
        return this.document;
    }

    public final ViewportScope getViewport() {
        return this.viewport;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.viewport, AnonymousClass005.A0E(this.document));
    }

    public String toString() {
        return C3cJ.A0L(this.viewport, ", viewport=", C3cG.A0f(this.document, "CoordinateScope(document="));
    }

    public CoordinateScope(DocumentKey documentKey, ViewportScope viewportScope) {
        AnonymousClass003.A0u(documentKey, viewportScope);
        this.document = documentKey;
        this.viewport = viewportScope;
    }

    public final CoordinateScope copy(DocumentKey documentKey, ViewportScope viewportScope) {
        AnonymousClass003.A0u(documentKey, viewportScope);
        return new CoordinateScope(documentKey, viewportScope);
    }
}
