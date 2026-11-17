package com.facebook.aura.file.view;

import X.C7438Evz;
import com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$3$1 extends C7438Evz implements Function0<Unit> {
    public HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$3$1(Object obj) {
        super(0, obj, HatchPublishArtifactViewModel.class, "publishArtifact", "publishArtifact()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchPublishArtifactViewModel) this.receiver).publishArtifact();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
