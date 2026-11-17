package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import com.facebook.aura.perf.HatchNavTTRCCoordinator;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$rememberLibraryTabTtrc$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchNavTTRCCoordinator $navTtrcCoordinator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$rememberLibraryTabTtrc$2$1(HatchNavTTRCCoordinator hatchNavTTRCCoordinator) {
        super(0);
        this.$navTtrcCoordinator = hatchNavTTRCCoordinator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navTtrcCoordinator.onViewFinished(HatchNavTTRCSpec.Surface.LIBRARY, null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
