package com.facebook.aura.applock;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC3358CGz;
import X.AbstractC8390Fd5;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.C06G;
import X.C1BN;
import X.C20Z;
import X.C2qU;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C8328Fbu;
import X.C8391Fd6;
import X.C9286GCn;
import X.C9uG;
import X.CFK;
import X.EXE;
import X.EnumC10460Hji;
import X.Ey9;
import X.FQL;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.InterfaceC08439ui;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.applock.AppBiometricLockViewModel;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.logout.AuraLogoutHelper;
import com.facebook.aura.navigation.key.AppLockOverlayScreenKey;
import com.facebook.aura.overlay.api.OverlayApi;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
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
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class AppBiometricLockViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<UiState> _uiState;
    public final EXE biometricManager;
    public final OverlayApi overlayApi;
    public final AppLockRepository repository;
    public final C1BN<UiState> uiState;

    public final class Factory implements InterfaceC08439ui {
        public static final int $stable = 8;
        public final Context appContext;
        public final AbstractC3358CGz userSession;

        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            return new AppBiometricLockViewModel(AppLockRepository.Companion.getInstance(this.userSession), new EXE(new C2qU(this.appContext)), OverlayApi.Companion.getInstance(this.userSession));
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, Context context) {
            AnonymousClass003.A0u(abstractC3358CGz, context);
            this.userSession = abstractC3358CGz;
            this.appContext = context;
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
            return (T) AbstractC08429uh.A00(this, a6j, c9uG);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(Class<T> cls, A6J a6j) {
            return (T) AbstractC08429uh.A01(this, cls);
        }
    }

    public interface UiState {

        public final class Authenticating implements UiState {
            public static final int $stable = 0;
            public static final Authenticating INSTANCE = new Authenticating();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Authenticating);
            }

            public String toString() {
                return "Authenticating";
            }

            public int hashCode() {
                return -667938175;
            }
        }

        public final class Error extends C06G implements UiState {
            public static final int $stable = 0;
            public final String message;

            public Error(String str) {
                C7384Etj.A0Y(str, 0);
                this.message = str;
            }

            public final Error copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Error(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Error) && C7384Etj.areEqual(this.message, ((Error) obj).message));
            }

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                C7384Etj.A0Y(str, 0);
                return new Error(str);
            }

            public final String component1() {
                return this.message;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Ready implements UiState {
            public static final int $stable = 0;
            public static final Ready INSTANCE = new Ready();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Ready);
            }

            public String toString() {
                return "Ready";
            }

            public int hashCode() {
                return 631302292;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Reason {
            public static final /* synthetic */ Ey9 $ENTRIES;
            public static final /* synthetic */ Reason[] $VALUES;
            public static final Reason HARDWARE_UNAVAILABLE;
            public static final Reason NONE_ENROLLED;
            public static final Reason NO_DEVICE_CREDENTIAL;
            public static final Reason NO_HARDWARE;
            public static final Reason SECURITY_UPDATE_REQUIRED;
            public static final Reason UNKNOWN;

            static {
                Reason reason = new Reason("NO_HARDWARE", 0);
                NO_HARDWARE = reason;
                Reason reason2 = new Reason("HARDWARE_UNAVAILABLE", 1);
                HARDWARE_UNAVAILABLE = reason2;
                Reason reason3 = new Reason("NONE_ENROLLED", 2);
                NONE_ENROLLED = reason3;
                Reason reason4 = new Reason("NO_DEVICE_CREDENTIAL", 3);
                NO_DEVICE_CREDENTIAL = reason4;
                Reason reason5 = new Reason("SECURITY_UPDATE_REQUIRED", 4);
                SECURITY_UPDATE_REQUIRED = reason5;
                Reason reason6 = new Reason("UNKNOWN", 5);
                UNKNOWN = reason6;
                Reason[] reasonArr = {reason, reason2, reason3, reason4, reason5, reason6};
                $VALUES = reasonArr;
                $ENTRIES = C3cG.A0w(reasonArr);
            }

            public static Ey9<Reason> getEntries() {
                return $ENTRIES;
            }

            public static Reason valueOf(String str) {
                return (Reason) Enum.valueOf(Reason.class, str);
            }

            public static Reason[] values() {
                return (Reason[]) $VALUES.clone();
            }

            public Reason(String str, int i) {
            }
        }

        public final class Unavailable extends C06G implements UiState {
            public static final int $stable = 0;
            public final Reason reason;

            public Unavailable(Reason reason) {
                C7384Etj.A0Y(reason, 0);
                this.reason = reason;
            }

            public final Unavailable copy(Reason reason) {
                C7384Etj.A0Y(reason, 0);
                return new Unavailable(reason);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Unavailable) && this.reason == ((Unavailable) obj).reason);
            }

            public static /* synthetic */ Unavailable copy$default(Unavailable unavailable, Reason reason, int i, Object obj) {
                if ((i & 1) != 0) {
                    reason = unavailable.reason;
                }
                C7384Etj.A0Y(reason, 0);
                return new Unavailable(reason);
            }

            public final Reason component1() {
                return this.reason;
            }

            public final Reason getReason() {
                return this.reason;
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.applock.AppBiometricLockViewModel$observeShouldLock$1", f = "AppBiometricLockViewModel.kt", l = {79}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.applock.AppBiometricLockViewModel$observeShouldLock$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AppBiometricLockViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final AppBiometricLockViewModel appBiometricLockViewModel = AppBiometricLockViewModel.this;
                C1BN<Boolean> c1bn = appBiometricLockViewModel.repository.shouldLock;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.applock.AppBiometricLockViewModel.observeShouldLock.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        CFK.A03(Boolean.valueOf(z), AppBiometricLockViewModelKt.TAG, "shouldLock=%b, updating overlay");
                        OverlayApi overlayApi = appBiometricLockViewModel.overlayApi;
                        AppLockOverlayScreenKey appLockOverlayScreenKey = AppLockOverlayScreenKey.INSTANCE;
                        if (z) {
                            overlayApi.showOverlay(appLockOverlayScreenKey);
                        } else {
                            overlayApi.hideOverlay(appLockOverlayScreenKey);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AppBiometricLockViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UiState uiStateForAuthenticationError(int i, CharSequence charSequence) {
        UiState.Reason reason;
        UiState unavailable;
        if (i == 1) {
            reason = UiState.Reason.HARDWARE_UNAVAILABLE;
        } else if (i == 11) {
            reason = UiState.Reason.NONE_ENROLLED;
        } else if (i == 12) {
            reason = UiState.Reason.NO_HARDWARE;
        } else if (i == 14) {
            reason = UiState.Reason.NO_DEVICE_CREDENTIAL;
        } else {
            if (i != 15) {
                unavailable = new UiState.Error(charSequence.toString());
                return unavailable;
            }
            reason = UiState.Reason.SECURITY_UPDATE_REQUIRED;
        }
        unavailable = new UiState.Unavailable(reason);
        return unavailable;
    }

    private final UiState initialUiState() throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, IllegalArgumentException, InvocationTargetException {
        UiState unavailable;
        try {
            int iA00 = this.biometricManager.A00(AppLockBiometricSettingsKt.appLockAllowedAuthenticators);
            if (iA00 != 0) {
                unavailable = new UiState.Unavailable(iA00 != 1 ? iA00 != 11 ? iA00 != 12 ? iA00 != 15 ? UiState.Reason.UNKNOWN : UiState.Reason.SECURITY_UPDATE_REQUIRED : UiState.Reason.NO_HARDWARE : UiState.Reason.NONE_ENROLLED : UiState.Reason.HARDWARE_UNAVAILABLE);
            } else {
                unavailable = UiState.Ready.INSTANCE;
            }
            return unavailable;
        } catch (SecurityException e) {
            CFK.A0A(AppBiometricLockViewModelKt.TAG, "canAuthenticate refused", e);
            return new UiState.Unavailable(UiState.Reason.UNKNOWN);
        }
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final void logOut() {
        AuraLogoutHelper auraLogoutHelper = AuraLogoutHelper.INSTANCE;
        if (C3cH.A1R(AuraLogoutHelper.isLoggingOut)) {
            return;
        }
        HatchClientCvmEventLogger.INSTANCE.logLogoutClick();
        auraLogoutHelper.performLogout();
    }

    public final void refreshAvailability() {
        if ((this._uiState.getValue() instanceof UiState.Error) || (this._uiState.getValue() instanceof UiState.Authenticating)) {
            return;
        }
        this._uiState.Af8(initialUiState());
    }

    public AppBiometricLockViewModel(AppLockRepository appLockRepository, EXE exe, OverlayApi overlayApi) {
        AnonymousClass005.A0x(appLockRepository, exe, overlayApi);
        this.repository = appLockRepository;
        this.biometricManager = exe;
        this.overlayApi = overlayApi;
        observeShouldLock();
        C9286GCn c9286GCnA01 = HnJ.A01(initialUiState());
        this._uiState = c9286GCnA01;
        this.uiState = C3Pi.A00(c9286GCnA01);
    }

    private final void observeShouldLock() {
        AnonymousClass001.A1I(AuraDispatchers.mainImmediate, new AnonymousClass1(null), AEu.A00(this));
    }

    public final void requestUnlock(FragmentActivity fragmentActivity, Executor executor, C8328Fbu c8328Fbu, boolean z) throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        AnonymousClass005.A0x(fragmentActivity, executor, c8328Fbu);
        if ((this._uiState.getValue() instanceof UiState.Ready) || (z && (this._uiState.getValue() instanceof UiState.Error))) {
            this._uiState.Af8(UiState.Authenticating.INSTANCE);
            try {
                new FQL(new AbstractC8390Fd5() { // from class: com.facebook.aura.applock.AppBiometricLockViewModel$requestUnlock$prompt$1
                    @Override // X.AbstractC8390Fd5
                    public void onAuthenticationError(int i, CharSequence charSequence) {
                        C7384Etj.A0Y(charSequence, 1);
                        CFK.A0H(AppBiometricLockViewModelKt.TAG, "biometric auth error %d: %s", Integer.valueOf(i), charSequence.toString());
                        AppBiometricLockViewModel appBiometricLockViewModel = this.this$0;
                        appBiometricLockViewModel._uiState.Af8(appBiometricLockViewModel.uiStateForAuthenticationError(i, charSequence));
                    }

                    @Override // X.AbstractC8390Fd5
                    public void onAuthenticationFailed() {
                    }

                    @Override // X.AbstractC8390Fd5
                    public void onAuthenticationSucceeded(C8391Fd6 c8391Fd6) {
                        this.this$0._uiState.Af8(AppBiometricLockViewModel.UiState.Ready.INSTANCE);
                        this.this$0.repository.markUnlocked();
                    }
                }, fragmentActivity, executor).A02(c8328Fbu);
            } catch (IllegalStateException e) {
                BLG<UiState> blg = this._uiState;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                AnonymousClass002.A1I(blg, new UiState.Error(message));
            } catch (SecurityException e2) {
                CFK.A0A(AppBiometricLockViewModelKt.TAG, "biometric prompt refused", e2);
                AnonymousClass002.A1I(this._uiState, new UiState.Unavailable(UiState.Reason.UNKNOWN));
            }
        }
    }
}
