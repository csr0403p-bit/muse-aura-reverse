package com.facebook.aura.feed.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.feed.repo.FeedRepository$markUnitsSeen-gIAlu-s$$inlined$executeJarvisRequest-Z6QaZII$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class FeedRepository$markUnitsSeengIAlus$$inlined$executeJarvisRequestZ6QaZII$default$1 extends AbstractC7559F3s implements Function0<C9hr<FeedUnitsSeenRequestJson>> {
    public static final FeedRepository$markUnitsSeengIAlus$$inlined$executeJarvisRequestZ6QaZII$default$1 INSTANCE = new FeedRepository$markUnitsSeengIAlus$$inlined$executeJarvisRequestZ6QaZII$default$1();

    public FeedRepository$markUnitsSeengIAlus$$inlined$executeJarvisRequestZ6QaZII$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<FeedUnitsSeenRequestJson> invoke() {
        int i = FeedUnitsSeenRequestJson.$stable;
        return FeedUnitsSeenRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<FeedUnitsSeenRequestJson> invoke() {
        int i = FeedUnitsSeenRequestJson.$stable;
        return FeedUnitsSeenRequestJson$$serializer.INSTANCE;
    }
}
