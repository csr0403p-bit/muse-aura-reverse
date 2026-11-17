package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HeaderButton;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$1$1 extends AbstractC7559F3s implements G0U<HeaderButton, Unit> {
    public final /* synthetic */ MutableState<Boolean> $showOverflowMenu$delegate;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HeaderButton.values().length];
            try {
                AnonymousClass002.A13(HeaderButton.MoreOptions, iArr);
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$1$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$showOverflowMenu$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderButton headerButton) {
        if (AnonymousClass003.A0L(headerButton) == 1) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.LIBRARY, HatchSubsurface.HEADER, HatchScreen.LIBRARY_HOME, HatchComponent.THREE_DOTS_MENU, null, null, null);
            MutableState<Boolean> mutableState = this.$showOverflowMenu$delegate;
            int i = HatchLibraryTabScreenKt.ARTIFACTS_TAB_INDEX;
            MutableState.A09(true, mutableState);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderButton headerButton) {
        invoke2(headerButton);
        return Unit.INSTANCE;
    }
}
