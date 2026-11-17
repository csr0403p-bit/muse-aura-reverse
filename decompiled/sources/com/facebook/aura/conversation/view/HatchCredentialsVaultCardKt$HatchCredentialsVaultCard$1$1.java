package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.view.SavedCredential;

/* loaded from: classes.dex */
public final class HatchCredentialsVaultCardKt$HatchCredentialsVaultCard$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ SavedCredential $saved;
    public final /* synthetic */ MutableState<Boolean> $sawUnsaved$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCredentialsVaultCardKt$HatchCredentialsVaultCard$1$1(SavedCredential savedCredential, MutableState<Boolean> mutableState) {
        super(1);
        this.$saved = savedCredential;
        this.$sawUnsaved$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$saved instanceof SavedCredential.NotSaved) {
            MutableState.A09(true, this.$sawUnsaved$delegate);
        }
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchCredentialsVaultCardKt$HatchCredentialsVaultCard$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
