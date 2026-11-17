package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SharedGoalScreenKt$SharedGoalContent$1$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $awaitingSave$delegate;
    public final /* synthetic */ G0U<Boolean, Unit> $onEditingChange;
    public final /* synthetic */ SharedGoalUiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SharedGoalScreenKt$SharedGoalContent$1$1$1(SharedGoalUiState sharedGoalUiState, G0U<? super Boolean, Unit> g0u, MutableState<Boolean> mutableState) {
        super(1);
        this.$uiState = sharedGoalUiState;
        this.$onEditingChange = g0u;
        this.$awaitingSave$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        MutableState.A09(false, this.$awaitingSave$delegate);
        if (this.$uiState.draft == null) {
            AnonymousClass001.A1K(false, this.$onEditingChange);
        }
        return new C78g() { // from class: com.facebook.aura.pairs.SharedGoalScreenKt$SharedGoalContent$1$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
