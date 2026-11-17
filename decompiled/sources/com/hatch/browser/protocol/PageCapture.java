package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PageCapture {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public DocumentKey document;
    public ProtectedImage image;
    public PageImageLoads imageLoads;
    public boolean redactionsPresent;
    public CaptureCrop region;
    public CoordinateScope scope;
    public Viewport viewport;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageCapture) {
                PageCapture pageCapture = (PageCapture) obj;
                if (!C7384Etj.areEqual(this.image, pageCapture.image) || !C7384Etj.areEqual(this.document, pageCapture.document) || !C7384Etj.areEqual(this.scope, pageCapture.scope) || !C7384Etj.areEqual(this.viewport, pageCapture.viewport) || this.redactionsPresent != pageCapture.redactionsPresent || !C7384Etj.areEqual(this.region, pageCapture.region) || !C7384Etj.areEqual(this.imageLoads, pageCapture.imageLoads)) {
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

    public final void setImage(ProtectedImage protectedImage) {
        C7384Etj.A0Y(protectedImage, 0);
        this.image = protectedImage;
    }

    public final void setRegion(CaptureCrop captureCrop) {
        C7384Etj.A0Y(captureCrop, 0);
        this.region = captureCrop;
    }

    public final void setScope(CoordinateScope coordinateScope) {
        C7384Etj.A0Y(coordinateScope, 0);
        this.scope = coordinateScope;
    }

    public final void setViewport(Viewport viewport) {
        C7384Etj.A0Y(viewport, 0);
        this.viewport = viewport;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ PageCapture copy$default(PageCapture pageCapture, ProtectedImage protectedImage, DocumentKey documentKey, CoordinateScope coordinateScope, Viewport viewport, boolean z, CaptureCrop captureCrop, PageImageLoads pageImageLoads, int i, Object obj) {
        if ((i & 1) != 0) {
            protectedImage = pageCapture.image;
        }
        if ((i & 2) != 0) {
            documentKey = pageCapture.document;
        }
        if ((i & 4) != 0) {
            coordinateScope = pageCapture.scope;
        }
        if ((i & 8) != 0) {
            viewport = pageCapture.viewport;
        }
        if ((i & 16) != 0) {
            z = pageCapture.redactionsPresent;
        }
        if ((i & 32) != 0) {
            captureCrop = pageCapture.region;
        }
        if ((i & 64) != 0) {
            pageImageLoads = pageCapture.imageLoads;
        }
        return pageCapture.copy(protectedImage, documentKey, coordinateScope, viewport, z, captureCrop, pageImageLoads);
    }

    public final ProtectedImage component1() {
        return this.image;
    }

    public final DocumentKey component2() {
        return this.document;
    }

    public final CoordinateScope component3() {
        return this.scope;
    }

    public final Viewport component4() {
        return this.viewport;
    }

    public final boolean component5() {
        return this.redactionsPresent;
    }

    public final CaptureCrop component6() {
        return this.region;
    }

    public final PageImageLoads component7() {
        return this.imageLoads;
    }

    public final DocumentKey getDocument() {
        return this.document;
    }

    public final ProtectedImage getImage() {
        return this.image;
    }

    public final PageImageLoads getImageLoads() {
        return this.imageLoads;
    }

    public final boolean getRedactionsPresent() {
        return this.redactionsPresent;
    }

    public final CaptureCrop getRegion() {
        return this.region;
    }

    public final CoordinateScope getScope() {
        return this.scope;
    }

    public final Viewport getViewport() {
        return this.viewport;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.region, C0KA.A01(AnonymousClass005.A0F(this.viewport, AnonymousClass005.A0F(this.scope, AnonymousClass005.A0F(this.document, AnonymousClass005.A0E(this.image)))), this.redactionsPresent)) + AnonymousClass006.A0D(this.imageLoads);
    }

    public final void setImageLoads(PageImageLoads pageImageLoads) {
        this.imageLoads = pageImageLoads;
    }

    public final void setRedactionsPresent(boolean z) {
        this.redactionsPresent = z;
    }

    public String toString() {
        ProtectedImage protectedImage = this.image;
        DocumentKey documentKey = this.document;
        CoordinateScope coordinateScope = this.scope;
        Viewport viewport = this.viewport;
        boolean z = this.redactionsPresent;
        CaptureCrop captureCrop = this.region;
        PageImageLoads pageImageLoads = this.imageLoads;
        StringBuilder sbA0f = C3cG.A0f(protectedImage, "PageCapture(image=");
        sbA0f.append(", document=");
        sbA0f.append(documentKey);
        AbstractC7609F5w.A1M(sbA0f, coordinateScope);
        sbA0f.append(", viewport=");
        sbA0f.append(viewport);
        sbA0f.append(", redactionsPresent=");
        sbA0f.append(z);
        sbA0f.append(", region=");
        sbA0f.append(captureCrop);
        return C3cJ.A0L(pageImageLoads, ", imageLoads=", sbA0f);
    }

    public PageCapture(ProtectedImage protectedImage, DocumentKey documentKey, CoordinateScope coordinateScope, Viewport viewport, boolean z, CaptureCrop captureCrop, PageImageLoads pageImageLoads) {
        AnonymousClass005.A14(protectedImage, documentKey, coordinateScope, viewport);
        C7384Etj.A0Y(captureCrop, 5);
        this.image = protectedImage;
        this.document = documentKey;
        this.scope = coordinateScope;
        this.viewport = viewport;
        this.redactionsPresent = z;
        this.region = captureCrop;
        this.imageLoads = pageImageLoads;
    }

    public final PageCapture copy(ProtectedImage protectedImage, DocumentKey documentKey, CoordinateScope coordinateScope, Viewport viewport, boolean z, CaptureCrop captureCrop, PageImageLoads pageImageLoads) {
        AnonymousClass005.A14(protectedImage, documentKey, coordinateScope, viewport);
        C7384Etj.A0Y(captureCrop, 5);
        return new PageCapture(protectedImage, documentKey, coordinateScope, viewport, z, captureCrop, pageImageLoads);
    }
}
