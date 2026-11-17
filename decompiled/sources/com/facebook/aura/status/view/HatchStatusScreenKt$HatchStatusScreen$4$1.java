package com.facebook.aura.status.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.status.view.HatchStatusScreenKt$HatchStatusScreen$4$1", f = "HatchStatusScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchStatusScreenKt$HatchStatusScreen$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $hasOpenPermissionTask;
    public final /* synthetic */ MutableState<Boolean> $isTabSelectionLocked$delegate;
    public final /* synthetic */ String $requestedTabId;
    public final /* synthetic */ MutableState<String> $selectedTabId$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusScreenKt$HatchStatusScreen$4$1(String str, boolean z, MutableState<Boolean> mutableState, MutableState<String> mutableState2, HtJ<? super HatchStatusScreenKt$HatchStatusScreen$4$1> htJ) {
        super(2, htJ);
        this.$requestedTabId = str;
        this.$hasOpenPermissionTask = z;
        this.$isTabSelectionLocked$delegate = mutableState;
        this.$selectedTabId$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchStatusScreenKt$HatchStatusScreen$4$1(this.$requestedTabId, this.$hasOpenPermissionTask, this.$isTabSelectionLocked$delegate, this.$selectedTabId$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$requestedTabId == null && this.$hasOpenPermissionTask && !MutableState.A0A((MutableState) this.$isTabSelectionLocked$delegate)) {
            this.$selectedTabId$delegate.Af8("core:APPROVALS");
            MutableState.A09(true, this.$isTabSelectionLocked$delegate);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchStatusScreenKt$HatchStatusScreen$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
