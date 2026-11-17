package com.hatch.browser.protocol;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PageMetadataSnapshot {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public DocumentKey document;
    public PageMetadata metadata;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageMetadataSnapshot) {
                PageMetadataSnapshot pageMetadataSnapshot = (PageMetadataSnapshot) obj;
                if (!C7384Etj.areEqual(this.document, pageMetadataSnapshot.document) || !C7384Etj.areEqual(this.metadata, pageMetadataSnapshot.metadata)) {
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

    public final void setMetadata(PageMetadata pageMetadata) {
        C7384Etj.A0Y(pageMetadata, 0);
        this.metadata = pageMetadata;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ PageMetadataSnapshot copy$default(PageMetadataSnapshot pageMetadataSnapshot, DocumentKey documentKey, PageMetadata pageMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            documentKey = pageMetadataSnapshot.document;
        }
        if ((i & 2) != 0) {
            pageMetadata = pageMetadataSnapshot.metadata;
        }
        AnonymousClass003.A0u(documentKey, pageMetadata);
        return new PageMetadataSnapshot(documentKey, pageMetadata);
    }

    public final DocumentKey component1() {
        return this.document;
    }

    public final PageMetadata component2() {
        return this.metadata;
    }

    public final DocumentKey getDocument() {
        return this.document;
    }

    public final PageMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.metadata, AnonymousClass005.A0E(this.document));
    }

    public String toString() {
        return C3cJ.A0L(this.metadata, ", metadata=", C3cG.A0f(this.document, "PageMetadataSnapshot(document="));
    }

    public PageMetadataSnapshot(DocumentKey documentKey, PageMetadata pageMetadata) {
        AnonymousClass003.A0u(documentKey, pageMetadata);
        this.document = documentKey;
        this.metadata = pageMetadata;
    }

    public final PageMetadataSnapshot copy(DocumentKey documentKey, PageMetadata pageMetadata) {
        AnonymousClass003.A0u(documentKey, pageMetadata);
        return new PageMetadataSnapshot(documentKey, pageMetadata);
    }
}
