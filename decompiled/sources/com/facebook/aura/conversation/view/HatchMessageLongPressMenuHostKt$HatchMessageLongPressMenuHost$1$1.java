package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $selectionEnabled;
    public final /* synthetic */ MutableState<Boolean> $swipeSelectionGate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$1$1(MutableState<Boolean> mutableState, boolean z) {
        super(1);
        this.$swipeSelectionGate = mutableState;
        this.$selectionEnabled = z;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        MutableState<Boolean> mutableState = this.$swipeSelectionGate;
        if (mutableState != null) {
            MutableState.A09(this.$selectionEnabled, mutableState);
        }
        final MutableState<Boolean> mutableState2 = this.$swipeSelectionGate;
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                MutableState mutableState3 = mutableState2;
                if (mutableState3 != null) {
                    MutableState.A09(false, mutableState3);
                }
            }
        };
    }
}
