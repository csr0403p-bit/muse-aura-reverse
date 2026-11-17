package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmReviewArtifactsScreenKt$ArtifactRow$2$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ Function0<Unit> $onToggle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmReviewArtifactsScreenKt$ArtifactRow$2$1(Function0<Unit> function0) {
        super(1);
        this.$onToggle = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        this.$onToggle.invoke();
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.$onToggle.invoke();
    }
}
