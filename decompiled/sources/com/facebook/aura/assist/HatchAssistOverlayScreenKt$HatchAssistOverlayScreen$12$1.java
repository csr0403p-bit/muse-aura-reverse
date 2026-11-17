package com.facebook.aura.assist;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$12$1", f = "HatchAssistOverlayScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$12$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ C1BO<Float> $overlayAlpha$delegate;
    public final /* synthetic */ MutableState<Boolean> $pendingDismiss$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$12$1(Function0<Unit> function0, MutableState<Boolean> mutableState, C1BO<Float> c1bo, HtJ<? super HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$12$1> htJ) {
        super(2, htJ);
        this.$onDismissRequest = function0;
        this.$pendingDismiss$delegate = mutableState;
        this.$overlayAlpha$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$12$1(this.$onDismissRequest, this.$pendingDismiss$delegate, this.$overlayAlpha$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (MutableState.A0A((MutableState) this.$pendingDismiss$delegate) && C1BO.A01(this.$overlayAlpha$delegate) == 0.0f) {
            this.$onDismissRequest.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$12$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
