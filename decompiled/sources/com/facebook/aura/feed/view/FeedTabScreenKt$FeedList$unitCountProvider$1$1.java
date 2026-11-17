package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.feed.repo.FeedUnit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedList$unitCountProvider$1$1 extends AbstractC7559F3s implements Function0<Integer> {
    public final /* synthetic */ SnapshotStateList<FeedUnit> $feedItems;
    public final /* synthetic */ SnapshotStateList<FeedUnit> $infiniteItems;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedList$unitCountProvider$1$1(SnapshotStateList<FeedUnit> snapshotStateList, SnapshotStateList<FeedUnit> snapshotStateList2) {
        super(0);
        this.$feedItems = snapshotStateList;
        this.$infiniteItems = snapshotStateList2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(this.$feedItems.size() + this.$infiniteItems.size());
    }
}
