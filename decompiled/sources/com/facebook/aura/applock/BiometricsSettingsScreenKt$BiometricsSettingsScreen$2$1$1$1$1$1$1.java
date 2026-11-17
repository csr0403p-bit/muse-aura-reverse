package com.facebook.aura.applock;

import X.AbstractC7559F3s;
import X.AbstractC8390Fd5;
import X.AnonymousClass001;
import X.C3UX;
import X.C8328Fbu;
import X.C8391Fd6;
import X.FQL;
import X.G0U;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
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
public final class BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$1$1$1$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ Executor $executor;
    public final /* synthetic */ C8328Fbu $promptInfo;
    public final /* synthetic */ AppLockRepository $repository;
    public final /* synthetic */ boolean $shouldOfferEnrollment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$1$1$1$1$1(boolean z, Context context, FragmentActivity fragmentActivity, Executor executor, C8328Fbu c8328Fbu, C3UX c3ux, AppLockRepository appLockRepository) {
        super(1);
        this.$shouldOfferEnrollment = z;
        this.$context = context;
        this.$activity = fragmentActivity;
        this.$executor = executor;
        this.$promptInfo = c8328Fbu;
        this.$coroutineScope = c3ux;
        this.$repository = appLockRepository;
    }

    public final void invoke(final boolean z) throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.SETTINGS, HatchSubsurface.BIOMETRICS, HatchScreen.BIOMETRICS, HatchComponent.BIOMETRICS_TOGGLE, null, null);
        if (z && this.$shouldOfferEnrollment) {
            AppLockBiometricSettingsKt.launchBiometricEnrollment(this.$context);
            return;
        }
        FragmentActivity fragmentActivity = this.$activity;
        Executor executor = this.$executor;
        final C3UX c3ux = this.$coroutineScope;
        final AppLockRepository appLockRepository = this.$repository;
        new FQL(new AbstractC8390Fd5() { // from class: com.facebook.aura.applock.BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$1$1$1$1$1$prompt$1
            @Override // X.AbstractC8390Fd5
            public void onAuthenticationSucceeded(C8391Fd6 c8391Fd6) {
                AnonymousClass001.A1J(new BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$1$1$1$1$1$prompt$1$onAuthenticationSucceeded$1(appLockRepository, z, null), c3ux);
            }
        }, fragmentActivity, executor).A02(this.$promptInfo);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
