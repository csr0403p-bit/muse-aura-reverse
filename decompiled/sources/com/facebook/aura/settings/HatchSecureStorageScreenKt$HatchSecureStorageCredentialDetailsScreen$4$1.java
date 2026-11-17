package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1518AkS;
import X.C1BO;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$4$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
    public final /* synthetic */ C1BO<SecureStorageCredentialDetailsUiState> $uiState$delegate;
    public final /* synthetic */ C1518AkS $usernameFocusRequester;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$4$1(C1518AkS c1518AkS, MutableState<Boolean> mutableState, C1BO<SecureStorageCredentialDetailsUiState> c1bo) {
        super(1);
        this.$usernameFocusRequester = c1518AkS;
        this.$isEditing$delegate = mutableState;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (MutableState.A0A((MutableState) this.$isEditing$delegate) && this.$uiState$delegate.getValue().canEditCredentialFields) {
            C1518AkS.A00(this.$usernameFocusRequester);
        }
        return new C78g() { // from class: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$4$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
