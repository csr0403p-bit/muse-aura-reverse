package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$9$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchPublishBottomSheetState $publishState;
    public final /* synthetic */ G0V<String, String, Unit> $shareArtifact;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$9$1(G0V<? super String, ? super String, Unit> g0v, HatchPublishBottomSheetState hatchPublishBottomSheetState) {
        super(0);
        this.$shareArtifact = g0v;
        this.$publishState = hatchPublishBottomSheetState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        G0V<String, String, Unit> g0v = this.$shareArtifact;
        HatchPublishBottomSheetState.Success success = (HatchPublishBottomSheetState.Success) this.$publishState;
        g0v.invoke(success.url, success.getFileName());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
