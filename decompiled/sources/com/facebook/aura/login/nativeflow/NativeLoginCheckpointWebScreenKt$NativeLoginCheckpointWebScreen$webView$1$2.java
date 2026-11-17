package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C00r;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$webView$1$2 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    public final /* synthetic */ C00r $loadGeneration$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$webView$1$2(MutableState<Boolean> mutableState, C00r c00r) {
        super(1);
        this.$isLoading$delegate = mutableState;
        this.$loadGeneration$delegate = c00r;
    }

    public final void invoke(boolean z) {
        MutableState.A09(z, this.$isLoading$delegate);
        if (z) {
            this.$loadGeneration$delegate.AdX(this.$loadGeneration$delegate.AGd() + 1);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
