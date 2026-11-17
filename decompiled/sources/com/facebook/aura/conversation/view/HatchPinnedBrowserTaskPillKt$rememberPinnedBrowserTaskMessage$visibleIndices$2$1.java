package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C1160Acs;
import X.C16C;
import androidx.compose.foundation.lazy.LazyListState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPinnedBrowserTaskPillKt$rememberPinnedBrowserTaskMessage$visibleIndices$2$1 extends AbstractC7559F3s implements Function0<Set<Integer>> {
    public final /* synthetic */ LazyListState $listState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPinnedBrowserTaskPillKt$rememberPinnedBrowserTaskMessage$visibleIndices$2$1(LazyListState lazyListState) {
        super(0);
        this.$listState = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<Integer> invoke() {
        List listA0j = AnonymousClass003.A0j(this.$listState);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listA0j.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Integer.valueOf(((C1160Acs) ((C16C) it.next())).A07));
        }
        return linkedHashSet;
    }
}
