package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class PendingDiscussionItem extends C06G {
    public static final int $stable = 8;
    public final String id;
    public final Bitmap previewImageData;

    public PendingDiscussionItem(String str, Bitmap bitmap) {
        C7384Etj.A0Y(str, 0);
        this.id = str;
        this.previewImageData = bitmap;
    }

    public final PendingDiscussionItem copy(String str, Bitmap bitmap) {
        C7384Etj.A0Y(str, 0);
        return new PendingDiscussionItem(str, bitmap);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PendingDiscussionItem) {
                PendingDiscussionItem pendingDiscussionItem = (PendingDiscussionItem) obj;
                if (!C7384Etj.areEqual(this.id, pendingDiscussionItem.id) || !C7384Etj.areEqual(this.previewImageData, pendingDiscussionItem.previewImageData)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PendingDiscussionItem copy$default(PendingDiscussionItem pendingDiscussionItem, String str, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pendingDiscussionItem.id;
        }
        if ((i & 2) != 0) {
            bitmap = pendingDiscussionItem.previewImageData;
        }
        C7384Etj.A0Y(str, 0);
        return new PendingDiscussionItem(str, bitmap);
    }

    public final String component1() {
        return this.id;
    }

    public final Bitmap component2() {
        return this.previewImageData;
    }

    public final String getId() {
        return this.id;
    }

    public final Bitmap getPreviewImageData() {
        return this.previewImageData;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.id) + AnonymousClass006.A0D(this.previewImageData);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PendingDiscussionItem(String str, Bitmap bitmap, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : bitmap);
    }
}
