package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0Hi;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.key.SecureStorageCredentialDetailsScreenKey;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$3$1", f = "HatchSecureStorageScreen.kt", l = {408}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<String> $editablePassword$delegate;
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
    public final /* synthetic */ MutableState<Boolean> $isPasswordVisible$delegate;
    public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
    public final /* synthetic */ HatchCredentialsViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$3$1(HatchCredentialsViewModel hatchCredentialsViewModel, SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, C0Hi c0Hi, MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, HtJ<? super HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$3$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchCredentialsViewModel;
        this.$key = secureStorageCredentialDetailsScreenKey;
        this.$focusManager = c0Hi;
        this.$editablePassword$delegate = mutableState;
        this.$isPasswordVisible$delegate = mutableState2;
        this.$isEditing$delegate = mutableState3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$3$1(this.$viewModel, this.$key, this.$focusManager, this.$editablePassword$delegate, this.$isPasswordVisible$delegate, this.$isEditing$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<String> c22i = this.$viewModel.credentialUpdateCompleted;
            final SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey = this.$key;
            final C0Hi c0Hi = this.$focusManager;
            final MutableState<String> mutableState = this.$editablePassword$delegate;
            final MutableState<Boolean> mutableState2 = this.$isPasswordVisible$delegate;
            final MutableState<Boolean> mutableState3 = this.$isEditing$delegate;
            C20Z<? super String> c20z = new C20Z() { // from class: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$3$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((String) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(String str, HtJ<? super Unit> htJ) {
                    if (C7384Etj.areEqual(str, secureStorageCredentialDetailsScreenKey.id)) {
                        mutableState.Af8("");
                        MutableState.A09(false, mutableState2);
                        MutableState.A09(false, mutableState3);
                        c0Hi.A6G(false);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
