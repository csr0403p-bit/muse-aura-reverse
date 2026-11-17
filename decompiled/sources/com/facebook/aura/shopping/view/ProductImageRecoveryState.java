package com.facebook.aura.shopping.view;

import X.A3q;
import X.AGE;
import X.AGF;
import X.C7384Etj;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Set;

/* loaded from: classes.dex */
public final class ProductImageRecoveryState {
    public final MutableState failedUrls$delegate;
    public final String initialSeedUrl;
    public final MutableState preview$delegate;

    public ProductImageRecoveryState(ProductImagePreview productImagePreview, String str) {
        C7384Etj.A0Y(productImagePreview, 0);
        this.initialSeedUrl = str;
        AGE ageA01 = AGF.A01();
        this.preview$delegate = new ParcelableSnapshotMutableState(ageA01, productImagePreview);
        this.failedUrls$delegate = new ParcelableSnapshotMutableState(ageA01, A3q.A00);
    }

    public final void setFailedUrls(Set<String> set) {
        C7384Etj.A0Y(set, 0);
        this.failedUrls$delegate.Af8(set);
    }

    public final void setPreview(ProductImagePreview productImagePreview) {
        C7384Etj.A0Y(productImagePreview, 0);
        this.preview$delegate.Af8(productImagePreview);
    }

    public final Set<String> getFailedUrls() {
        return (Set) this.failedUrls$delegate.getValue();
    }

    public final String getInitialSeedUrl() {
        return this.initialSeedUrl;
    }

    public final ProductImagePreview getPreview() {
        return (ProductImagePreview) this.preview$delegate.getValue();
    }
}
