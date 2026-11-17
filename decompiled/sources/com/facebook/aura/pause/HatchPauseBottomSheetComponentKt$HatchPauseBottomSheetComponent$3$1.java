package com.facebook.aura.pause;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C8328Fbu;
import X.EX8;
import X.FQL;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.widget.Toast;
import com.facebook.aura.R;
import com.facebook.aura.pause.HatchPauseEnrollmentViewModel;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.NoSuchPaddingException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pause.HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$3$1", f = "HatchPauseBottomSheetComponent.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ FQL $biometricPrompt;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C1BO<HatchPauseEnrollmentViewModel.DecryptionState> $decryptionState$delegate;
    public final /* synthetic */ HatchPauseEnrollmentViewModel $enrollmentViewModel;
    public final /* synthetic */ C8328Fbu $pausePromptInfo;
    public final /* synthetic */ HatchPauseViewModel $pauseViewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$3$1(FQL fql, C8328Fbu c8328Fbu, HatchPauseViewModel hatchPauseViewModel, HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, Context context, C1BO<? extends HatchPauseEnrollmentViewModel.DecryptionState> c1bo, HtJ<? super HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$3$1> htJ) {
        super(2, htJ);
        this.$biometricPrompt = fql;
        this.$pausePromptInfo = c8328Fbu;
        this.$pauseViewModel = hatchPauseViewModel;
        this.$enrollmentViewModel = hatchPauseEnrollmentViewModel;
        this.$context = context;
        this.$decryptionState$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$3$1(this.$biometricPrompt, this.$pausePromptInfo, this.$pauseViewModel, this.$enrollmentViewModel, this.$context, this.$decryptionState$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        HatchPauseEnrollmentViewModel.DecryptionState value = this.$decryptionState$delegate.getValue();
        if (value instanceof HatchPauseEnrollmentViewModel.DecryptionState.AwaitingBiometric) {
            this.$biometricPrompt.A01(new EX8(((HatchPauseEnrollmentViewModel.DecryptionState.AwaitingBiometric) value).cipher), this.$pausePromptInfo);
        } else if (value instanceof HatchPauseEnrollmentViewModel.DecryptionState.AwaitingBiometricAuthOnly) {
            this.$biometricPrompt.A02(this.$pausePromptInfo);
        } else if (value instanceof HatchPauseEnrollmentViewModel.DecryptionState.Ready) {
            this.$pauseViewModel.lock(((HatchPauseEnrollmentViewModel.DecryptionState.Ready) value).derivedBytes);
            this.$enrollmentViewModel.resetDecryptionState();
        } else if (value instanceof HatchPauseEnrollmentViewModel.DecryptionState.Failed) {
            Context context = this.$context;
            Toast.makeText(context, context.getString(R.string._name_removed__res_0x7f120db6, ((HatchPauseEnrollmentViewModel.DecryptionState.Failed) value).message), 1).show();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
