package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C4oT;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$6$1 extends AbstractC7559F3s implements G0U<LibraryViewMode, Unit> {
    public final /* synthetic */ MutableState<LibraryViewMode> $viewMode$delegate;
    public final /* synthetic */ C4oT $viewModePrefs;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LibraryViewMode libraryViewMode) {
        C7384Etj.A0Y(libraryViewMode, 0);
        HatchLibraryTabScreenKt.logLibraryMenuOption(HatchComponent.LIBRARY_LAYOUT_OPTION, HatchMetadataKey.LIBRARY_LAYOUT, AnonymousClass006.A0x(libraryViewMode));
        this.$viewMode$delegate.Af8(libraryViewMode);
        HatchLibraryTabScreenKt.writeLibraryViewMode(this.$viewModePrefs, libraryViewMode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$6$1(C4oT c4oT, MutableState<LibraryViewMode> mutableState) {
        super(1);
        this.$viewModePrefs = c4oT;
        this.$viewMode$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(LibraryViewMode libraryViewMode) {
        invoke2(libraryViewMode);
        return Unit.INSTANCE;
    }
}
