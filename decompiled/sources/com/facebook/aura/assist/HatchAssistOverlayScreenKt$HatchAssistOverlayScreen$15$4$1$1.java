package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ G0U<String, Unit> $onImageAttached;
    public final /* synthetic */ MutableState<Boolean> $showScreenshotMode$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        MutableState.A09(false, this.$showScreenshotMode$delegate);
        this.$onImageAttached.invoke(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$1$1(G0U<? super String, Unit> g0u, MutableState<Boolean> mutableState) {
        super(1);
        this.$onImageAttached = g0u;
        this.$showScreenshotMode$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
