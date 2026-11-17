package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchAssistVoiceModeKt$AssistVoiceCallEndedEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Boolean> $active$delegate;
    public final /* synthetic */ Function0<Unit> $onCallEnded;
    public final /* synthetic */ C1BO<Long> $pending$delegate;
    public final /* synthetic */ MutableState<Boolean> $wasActive$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistVoiceModeKt$AssistVoiceCallEndedEffect$1$1(Function0<Unit> function0, C1BO<Boolean> c1bo, MutableState<Boolean> mutableState, C1BO<Long> c1bo2) {
        super(1);
        this.$onCallEnded = function0;
        this.$active$delegate = c1bo;
        this.$wasActive$delegate = mutableState;
        this.$pending$delegate = c1bo2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        boolean zA0F = C1BO.A0F(this.$active$delegate);
        MutableState<Boolean> mutableState = this.$wasActive$delegate;
        if (zA0F) {
            MutableState.A09(true, mutableState);
        } else if (MutableState.A0A((MutableState) mutableState) && this.$pending$delegate.getValue() == null) {
            MutableState.A09(false, this.$wasActive$delegate);
            this.$onCallEnded.invoke();
        }
        return new C78g() { // from class: com.facebook.aura.assist.HatchAssistVoiceModeKt$AssistVoiceCallEndedEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
