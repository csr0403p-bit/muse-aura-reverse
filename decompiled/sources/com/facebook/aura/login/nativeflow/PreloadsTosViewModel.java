package com.facebook.aura.login.nativeflow;

import X.AEs;
import X.AbstractC10623Hzj;
import X.C20Q;
import X.C7384Etj;
import X.C79;
import X.GCV;
import X.Hu1;
import X.HzR;
import android.app.Application;
import android.content.pm.PackageManager;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.login.nativeflow.PreloadsTosViewEffect;
import com.facebook.aura.preloads.HatchPreloadsTosRepository;
import com.facebook.oxygen.preloads.sdk.firstparty.settings.AppmanagerRemoteException;

/* loaded from: classes2.dex */
public final class PreloadsTosViewModel extends AEs {
    public static final int $stable = 8;
    public final HzR<PreloadsTosViewEffect> _viewEffect;
    public final Application application;
    public boolean isAccepted;
    public final C20Q<PreloadsTosViewEffect> viewEffect;

    public final class Factory extends AuraViewModelFactory<PreloadsTosViewModel> {
        public static final int $stable = 8;
        public final Application application;

        public Factory(Application application) {
            C7384Etj.A0Y(application, 0);
            this.application = application;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new PreloadsTosViewModel(this.application);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public PreloadsTosViewModel create() {
            return new PreloadsTosViewModel(this.application);
        }
    }

    public PreloadsTosViewModel(Application application) {
        C7384Etj.A0Y(application, 0);
        this.application = application;
        GCV gcvA00 = AbstractC10623Hzj.A00(C79.A00, -2);
        this._viewEffect = gcvA00;
        this.viewEffect = Hu1.A01(gcvA00);
    }

    public final C20Q<PreloadsTosViewEffect> getViewEffect() {
        return this.viewEffect;
    }

    public final void onContinueClicked() {
        if (this.isAccepted) {
            return;
        }
        this.isAccepted = true;
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, null, HatchScreen.PRELOADS_TOS, HatchComponent.CONTINUE_BUTTON, null, null, null);
        AuraExecutors.INSTANCE.getIoExecutor().execute(new Runnable() { // from class: com.facebook.aura.login.nativeflow.PreloadsTosViewModel.onContinueClicked.1
            @Override // java.lang.Runnable
            public final void run() throws AppmanagerRemoteException, PackageManager.NameNotFoundException {
                HatchPreloadsTosRepository.INSTANCE.recordAccepted(PreloadsTosViewModel.this.application);
            }
        });
        this._viewEffect.AhZ(PreloadsTosViewEffect.Accepted.INSTANCE);
    }
}
