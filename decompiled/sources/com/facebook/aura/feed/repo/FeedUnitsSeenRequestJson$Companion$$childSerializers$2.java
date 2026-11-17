package com.facebook.aura.feed.repo;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class FeedUnitsSeenRequestJson$Companion$$childSerializers$2 extends AbstractC7559F3s implements Function0<C9hr<List<? extends FeedUnitViewJson>>> {
    public static final FeedUnitsSeenRequestJson$Companion$$childSerializers$2 INSTANCE = new FeedUnitsSeenRequestJson$Companion$$childSerializers$2();

    public FeedUnitsSeenRequestJson$Companion$$childSerializers$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends FeedUnitViewJson>> invoke() {
        return C3cG.A19(FeedUnitViewJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends FeedUnitViewJson>> invoke() {
        return C3cG.A19(FeedUnitViewJson$$serializer.INSTANCE);
    }
}
