package com.facebook.aura.explore.repo;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class IdeaSectionJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends IdeaCardSummaryJson>>> {
    public static final IdeaSectionJson$Companion$$childSerializers$1 INSTANCE = new IdeaSectionJson$Companion$$childSerializers$1();

    public IdeaSectionJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends IdeaCardSummaryJson>> invoke() {
        return C3cG.A19(IdeaCardSummaryJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends IdeaCardSummaryJson>> invoke() {
        return C3cG.A19(IdeaCardSummaryJson$$serializer.INSTANCE);
    }
}
