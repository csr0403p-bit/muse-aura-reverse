package com.facebook.aura.feed.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.feed.repo.FeedRepository$search-0E7RQCE$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class FeedRepository$search0E7RQCE$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<FeedSearchResultJson>> {
    public static final FeedRepository$search0E7RQCE$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new FeedRepository$search0E7RQCE$$inlined$executeJarvisRequest1iavgos$default$1();

    public FeedRepository$search0E7RQCE$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<FeedSearchResultJson> invoke() {
        int i = FeedSearchResultJson.$stable;
        return FeedSearchResultJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<FeedSearchResultJson> invoke() {
        int i = FeedSearchResultJson.$stable;
        return FeedSearchResultJson$$serializer.INSTANCE;
    }
}
