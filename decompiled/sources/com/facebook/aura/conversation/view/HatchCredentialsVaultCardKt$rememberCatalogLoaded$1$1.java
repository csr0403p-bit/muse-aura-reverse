package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes.dex */
public final class HatchCredentialsVaultCardKt$rememberCatalogLoaded$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ MutableState<Boolean> $loaded$delegate;
    public final /* synthetic */ MutableState<Boolean> $sawLoadStart$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCredentialsVaultCardKt$rememberCatalogLoaded$1$1(boolean z, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$isLoading = z;
        this.$sawLoadStart$delegate = mutableState;
        this.$loaded$delegate = mutableState2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        boolean z = this.$isLoading;
        MutableState<Boolean> mutableState = this.$sawLoadStart$delegate;
        if (z) {
            MutableState.A09(true, mutableState);
        } else if (MutableState.A0A((MutableState) mutableState)) {
            MutableState.A09(true, this.$loaded$delegate);
        }
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchCredentialsVaultCardKt$rememberCatalogLoaded$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
