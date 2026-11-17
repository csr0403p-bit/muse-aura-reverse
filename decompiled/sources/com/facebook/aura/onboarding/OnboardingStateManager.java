package com.facebook.aura.onboarding;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BLG;
import X.BzK;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C4oT;
import X.C7384Etj;
import X.C9286GCn;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.prefs.AuraVMPrefStore;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes.dex */
public final class OnboardingStateManager implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<Boolean> _hasCompletedOnboarding;
    public final C1BN<Boolean> hasCompletedOnboarding;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingStateManager$resetOnboardingWithServer$2", f = "OnboardingStateManager.kt", l = {191}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingStateManager$resetOnboardingWithServer$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return OnboardingStateManager.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z = false;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                    JarvisPath.OnboardingReset onboardingReset = JarvisPath.OnboardingReset.INSTANCE;
                    C9jH c9jHA0E = AGH.A0E();
                    Set<Integer> setA18 = AnonymousClass004.A18();
                    OnboardingStateManager$resetOnboardingWithServer$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 onboardingStateManager$resetOnboardingWithServer$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = OnboardingStateManager$resetOnboardingWithServer$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                    OnboardingStateManager$resetOnboardingWithServer$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 onboardingStateManager$resetOnboardingWithServer$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = OnboardingStateManager$resetOnboardingWithServer$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.I$0 = 1;
                    this.I$1 = 1;
                    this.I$2 = 0;
                    this.I$3 = 1;
                    this.I$4 = 0;
                    this.I$5 = 0;
                    this.I$6 = 0;
                    this.label = 1;
                    objM1599executeJarvisRequestWithFof5HsY = hatchHttpApi.m1599executeJarvisRequestWithFof5HsY(onboardingStateManager$resetOnboardingWithServer$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, onboardingStateManager$resetOnboardingWithServer$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, true, onboardingReset, new JsonObject(c9jHA0E), RequestType.POST, OnboardingStateManager.this.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                    if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
                }
                z = !(objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud);
            } catch (Exception e) {
                CFK.A08(OnboardingStateManagerKt.TAG, FGI.A0M("POST api/onboarding/reset failed: ", e.getMessage()), e);
            }
            OnboardingStateManager.this.resetOnboarding();
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return OnboardingStateManager.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        updateCompletionState(false);
    }

    public final String getSelectedVariant() {
        try {
            String string = getVariantPrefs().getString(OnboardingStateManagerKt.PREF_VARIANT, null);
            if (string != null) {
                if (string.length() > 0) {
                    return string;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final void markCompleted() {
        updateCompletionState(true);
    }

    public final void resetOnboarding() {
        updateCompletionState(false);
        try {
            BzK bzKA9q = getPrefs().A9q();
            bzKA9q.A08();
            bzKA9q.commit();
        } catch (Exception e) {
            CFK.A0A(OnboardingStateManagerKt.TAG, "Failed to clear onboarding prefs", e);
        }
    }

    private final C4oT getPrefs() {
        return AuraVMPrefs.INSTANCE.get(HatchGatewayPrefsStore.Companion.getInstance(this.userSession).getHatcheryVMId(), AuraVMPrefStore.ONBOARDING);
    }

    private final C4oT getVariantPrefs() {
        return AuraVMPrefs.INSTANCE.get(HatchGatewayPrefsStore.Companion.getInstance(this.userSession).getHatcheryVMId(), AuraVMPrefStore.ONBOARDING_VARIANT);
    }

    private final void updateCompletionState(boolean z) {
        AnonymousClass004.A1D(z, this._hasCompletedOnboarding);
        saveBoolean("completed", z);
        OnboardingStartupGate.Companion.getInstance(this.userSession).setCompleted(z);
        OnboardingAssetPrefetchRepo.Companion.getInstance().setPrefetched(z);
    }

    public final C1BN<Boolean> getHasCompletedOnboarding() {
        return this.hasCompletedOnboarding;
    }

    public final void setSelectedVariant(String str) {
        C7384Etj.A0Y(str, 0);
        try {
            BzK bzKA9q = getVariantPrefs().A9q();
            bzKA9q.AYr(OnboardingStateManagerKt.PREF_VARIANT, str);
            bzKA9q.apply();
        } catch (Exception e) {
            CFK.A0A(OnboardingStateManagerKt.TAG, "Failed to persist onboarding variant", e);
        }
    }

    public final class Companion {
        public final OnboardingStateManager getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (OnboardingStateManager) abstractC3358CGz.A03(OnboardingStateManager.class, new OnboardingStateManager$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ OnboardingStateManager(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean loadBoolean(String str, boolean z) {
        try {
            return getPrefs().getBoolean(str, z);
        } catch (Exception unused) {
            return false;
        }
    }

    private final void saveBoolean(String str, boolean z) {
        try {
            BzK bzKA9q = getPrefs().A9q();
            bzKA9q.A0A(str, z);
            bzKA9q.apply();
        } catch (Exception e) {
            CFK.A0A(OnboardingStateManagerKt.TAG, FGI.A0M("Failed to persist ", str), e);
        }
    }

    public final void clearSelectedVariant() {
        try {
            BzK bzKA9q = getVariantPrefs().A9q();
            bzKA9q.Aae(OnboardingStateManagerKt.PREF_VARIANT);
            bzKA9q.apply();
        } catch (Exception e) {
            CFK.A0A(OnboardingStateManagerKt.TAG, "Failed to clear onboarding variant", e);
        }
    }

    public final Object resetOnboardingWithServer(HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(null));
    }

    public OnboardingStateManager(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(loadBoolean("completed", false));
        this._hasCompletedOnboarding = c9286GCnA0v;
        this.hasCompletedOnboarding = C3Pi.A00(c9286GCnA0v);
    }
}
