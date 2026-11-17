package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import com.facebook.aura.library.model.HatchLibraryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaGalleryScreenKt$MediaGalleryScreen$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchLibraryViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaGalleryScreenKt$MediaGalleryScreen$1$2$1(HatchLibraryViewModel hatchLibraryViewModel) {
        super(0);
        this.$viewModel = hatchLibraryViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.loadMoreMedia();
    }
}
