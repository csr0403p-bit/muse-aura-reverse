package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$HatchLibraryTabScreen$onTabSelected$1$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ MutableState<Integer> $selectedTab$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$HatchLibraryTabScreen$onTabSelected$1$1(MutableState<Integer> mutableState) {
        super(1);
        this.$selectedTab$delegate = mutableState;
    }

    public final void invoke(int i) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.LIBRARY, null, HatchScreen.LIBRARY_HOME, i == 0 ? HatchComponent.LIBRARY_SECTION_ARTIFACTS : HatchComponent.LIBRARY_SECTION_MEDIA, null, null, null);
        MutableState<Integer> mutableState = this.$selectedTab$delegate;
        int i2 = HatchLibraryTabScreenKt.ARTIFACTS_TAB_INDEX;
        MutableState.A07(i, mutableState);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
