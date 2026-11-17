package com.facebook.aura.status.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.status.api.StatusTabEntry;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.status.view.HatchStatusScreenKt$HatchStatusScreen$3$1", f = "HatchStatusScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchStatusScreenKt$HatchStatusScreen$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $isTabSelectionLocked$delegate;
    public final /* synthetic */ String $requestedTabId;
    public final /* synthetic */ MutableState<StatusTabEntry> $selectedTabEntry$delegate;
    public final /* synthetic */ MutableState<String> $selectedTabId$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusScreenKt$HatchStatusScreen$3$1(String str, MutableState<String> mutableState, MutableState<StatusTabEntry> mutableState2, MutableState<Boolean> mutableState3, HtJ<? super HatchStatusScreenKt$HatchStatusScreen$3$1> htJ) {
        super(2, htJ);
        this.$requestedTabId = str;
        this.$selectedTabId$delegate = mutableState;
        this.$selectedTabEntry$delegate = mutableState2;
        this.$isTabSelectionLocked$delegate = mutableState3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchStatusScreenKt$HatchStatusScreen$3$1(this.$requestedTabId, this.$selectedTabId$delegate, this.$selectedTabEntry$delegate, this.$isTabSelectionLocked$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        String str = this.$requestedTabId;
        if (str != null) {
            MutableState<String> mutableState = this.$selectedTabId$delegate;
            MutableState<StatusTabEntry> mutableState2 = this.$selectedTabEntry$delegate;
            MutableState<Boolean> mutableState3 = this.$isTabSelectionLocked$delegate;
            mutableState.Af8(str);
            mutableState2.Af8(StatusTabEntry.LINK);
            MutableState.A09(true, mutableState3);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchStatusScreenKt$HatchStatusScreen$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
