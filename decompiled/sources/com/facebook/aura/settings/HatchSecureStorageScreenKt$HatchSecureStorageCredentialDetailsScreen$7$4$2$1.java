package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.key.SecureStorageCredentialDetailsScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
    public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$2$1(SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, MutableState<Boolean> mutableState) {
        super(0);
        this.$key = secureStorageCredentialDetailsScreenKey;
        this.$showDeleteConfirmation$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SecureStorageLogging.INSTANCE.deleteTapped(this.$key.id);
        MutableState.A09(true, this.$showDeleteConfirmation$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
