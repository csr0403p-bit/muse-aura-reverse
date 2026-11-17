package com.facebook.aura.library.view;

import X.C7438Evz;
import com.facebook.aura.library.model.HatchLibraryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$2$4$1 extends C7438Evz implements Function0<Unit> {
    public HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$2$4$1(Object obj) {
        super(0, obj, HatchLibraryViewModel.class, "loadMoreArtifacts", "loadMoreArtifacts()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchLibraryViewModel) this.receiver).loadMoreArtifacts();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
