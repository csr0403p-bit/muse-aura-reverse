package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass001;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import X.CFK;
import X.HwN;
import android.graphics.Bitmap;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import com.facebook.aura.model.PendingDiscussionItem;

/* loaded from: classes.dex */
public final class HatchPendingDiscussionItem implements SignOutCleanupHandler {
    public static final int $stable = 0;
    public static final HatchPendingDiscussionItem INSTANCE = new HatchPendingDiscussionItem();
    public static final int MAX_PREVIEW_ALLOCATION_BYTES = 8388608;
    public static final long MAX_PREVIEW_PIXELS = 2000000;
    public static final String TAG = "HatchPendingDiscussionItem";
    public static final BLG<PendingDiscussionItem> _pendingDiscussionItem;
    public static final C1BN<PendingDiscussionItem> pendingDiscussionItem;

    public final void setPendingDiscussionItem(String str, Bitmap bitmap) {
        C7384Etj.A0Y(str, 0);
        BLG<PendingDiscussionItem> blg = _pendingDiscussionItem;
        if (bitmap == null || !INSTANCE.isSafePreview(bitmap)) {
            bitmap = null;
        }
        AnonymousClass001.A1E(blg, null, new PendingDiscussionItem(str, bitmap));
    }

    static {
        C9286GCn c9286GCn = new C9286GCn(HwN.A01);
        _pendingDiscussionItem = c9286GCn;
        pendingDiscussionItem = new C3Pi(null, c9286GCn);
    }

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        _pendingDiscussionItem.Af8(null);
    }

    public final PendingDiscussionItem consumePendingDiscussionItem() {
        BLG<PendingDiscussionItem> blg = _pendingDiscussionItem;
        PendingDiscussionItem value = blg.getValue();
        blg.Af8(null);
        return value;
    }

    public final C1BN<PendingDiscussionItem> getPendingDiscussionItem() {
        return pendingDiscussionItem;
    }

    private final boolean isSafePreview(Bitmap bitmap) {
        if (!bitmap.isRecycled() && bitmap.getAllocationByteCount() <= 8388608 && bitmap.getWidth() * bitmap.getHeight() <= 2000000) {
            return true;
        }
        boolean zIsRecycled = bitmap.isRecycled();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int allocationByteCount = bitmap.getAllocationByteCount();
        StringBuilder sb = new StringBuilder("Dropping discussion preview: recycled=");
        sb.append(zIsRecycled);
        sb.append(", ");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append(", ");
        sb.append(allocationByteCount);
        CFK.A06(TAG, AnonymousClass001.A0v("B", sb));
        return false;
    }
}
