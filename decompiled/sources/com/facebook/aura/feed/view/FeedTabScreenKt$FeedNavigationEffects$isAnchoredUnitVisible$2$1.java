package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedNavigationEffects$isAnchoredUnitVisible$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ String $anchoredUnitId;
    public final /* synthetic */ LazyListState $listState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedNavigationEffects$isAnchoredUnitVisible$2$1(String str, LazyListState lazyListState) {
        super(0);
        this.$anchoredUnitId = str;
        this.$listState = lazyListState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r2 = this;
            java.lang.String r0 = r2.$anchoredUnitId
            if (r0 == 0) goto L16
            androidx.compose.foundation.lazy.LazyListState r0 = r2.$listState
            java.util.List r1 = X.AnonymousClass003.A0j(r0)
            java.lang.String r2 = r2.$anchoredUnitId
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L1c
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L1c
        L16:
            r0 = 0
        L17:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1c:
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            X.16C r0 = (X.C16C) r0
            X.Acs r0 = (X.C1160Acs) r0
            java.lang.Object r0 = r0.A0B
            boolean r0 = X.C7384Etj.areEqual(r0, r2)
            if (r0 == 0) goto L20
            r0 = 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.view.FeedTabScreenKt$FeedNavigationEffects$isAnchoredUnitVisible$2$1.invoke():java.lang.Boolean");
    }
}
