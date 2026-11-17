package com.facebook.aura.applock;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C8328Fbu;
import X.G0U;
import androidx.fragment.app.FragmentActivity;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.concurrent.Executor;
import javax.crypto.NoSuchPaddingException;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AppBiometricLockScreenKt$AppBiometricLockScreen$launchPrompt$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ Executor $executor;
    public final /* synthetic */ C8328Fbu $promptInfo;
    public final /* synthetic */ AppBiometricLockViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBiometricLockScreenKt$AppBiometricLockScreen$launchPrompt$1$1(AppBiometricLockViewModel appBiometricLockViewModel, FragmentActivity fragmentActivity, Executor executor, C8328Fbu c8328Fbu) {
        super(1);
        this.$viewModel = appBiometricLockViewModel;
        this.$activity = fragmentActivity;
        this.$executor = executor;
        this.$promptInfo = c8328Fbu;
    }

    public final void invoke(boolean z) throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        this.$viewModel.requestUnlock(this.$activity, this.$executor, this.$promptInfo, z);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
