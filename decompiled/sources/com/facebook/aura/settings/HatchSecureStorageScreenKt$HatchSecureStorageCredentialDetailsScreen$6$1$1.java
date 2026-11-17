package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Hi;
import X.C1BO;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.key.SecureStorageCredentialDetailsScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$6$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<CredentialAgentPermission> $editableAgentPermission$delegate;
    public final /* synthetic */ MutableState<String> $editablePassword$delegate;
    public final /* synthetic */ MutableState<String> $editableUsername$delegate;
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
    public final /* synthetic */ MutableState<Boolean> $isPasswordVisible$delegate;
    public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
    public final /* synthetic */ C1BO<SecureStorageCredentialDetailsUiState> $uiState$delegate;
    public final /* synthetic */ HatchCredentialsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$6$1$1(SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, Context context, C0Hi c0Hi, HatchCredentialsViewModel hatchCredentialsViewModel, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<CredentialAgentPermission> mutableState5, C1BO<SecureStorageCredentialDetailsUiState> c1bo) {
        super(0);
        this.$key = secureStorageCredentialDetailsScreenKey;
        this.$context = context;
        this.$focusManager = c0Hi;
        this.$viewModel = hatchCredentialsViewModel;
        this.$isEditing$delegate = mutableState;
        this.$isPasswordVisible$delegate = mutableState2;
        this.$editableUsername$delegate = mutableState3;
        this.$editablePassword$delegate = mutableState4;
        this.$editableAgentPermission$delegate = mutableState5;
        this.$uiState$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean zA0A = MutableState.A0A((MutableState) this.$isEditing$delegate);
        SecureStorageLogging secureStorageLogging = SecureStorageLogging.INSTANCE;
        String str = this.$key.id;
        if (zA0A) {
            secureStorageLogging.saveTapped(str);
            HatchSecureStorageScreenKt.cancelAutofill(this.$context);
            this.$focusManager.A6G(false);
            MutableState.A09(false, this.$isPasswordVisible$delegate);
            this.$viewModel.updateCredential(this.$key.id, MutableState.A05(this.$editableUsername$delegate), MutableState.A05(this.$editablePassword$delegate), this.$editableAgentPermission$delegate.getValue());
            return;
        }
        secureStorageLogging.editTapped(str);
        MutableState<String> mutableState = this.$editableUsername$delegate;
        String str2 = this.$uiState$delegate.getValue().username;
        if (str2 == null) {
            str2 = "";
        }
        mutableState.Af8(str2);
        this.$editablePassword$delegate.Af8("");
        this.$editableAgentPermission$delegate.Af8(this.$uiState$delegate.getValue().agentPermission);
        MutableState.A09(false, this.$isPasswordVisible$delegate);
        MutableState.A09(true, this.$isEditing$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
