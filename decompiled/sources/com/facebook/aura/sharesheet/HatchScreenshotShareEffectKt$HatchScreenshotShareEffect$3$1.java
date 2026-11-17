package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06787bB;
import X.C3UX;
import X.C7384Etj;
import X.C9hr;
import X.CFK;
import X.EnumC10460Hji;
import X.F0C;
import X.F1F;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC06807bD;
import android.app.Activity;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchShareDownloadTarget;
import com.facebook.aura.navigation.key.HatchShareSheetKey;
import com.facebook.aura.navigation.key.ShareType;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchScreenshotShareEffectKt$HatchScreenshotShareEffect$3$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ AuraNavigator $navigator;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        final boolean z;
        C7384Etj.A0Y(c06787bB, 0);
        final F1F f1f = new F1F();
        final AuraNavigator auraNavigator = this.$navigator;
        final C3UX c3ux = this.$coroutineScope;
        final Activity activity = this.$activity;
        final Activity.ScreenCaptureCallback screenCaptureCallback = new Activity.ScreenCaptureCallback() { // from class: com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$HatchScreenshotShareEffect$3$1$callback$1

            @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$HatchScreenshotShareEffect$3$1$callback$1$1", f = "HatchScreenshotShareEffect.kt", l = {56}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$HatchScreenshotShareEffect$3$1$callback$1$1, reason: invalid class name */
            public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                public final /* synthetic */ Activity $activity;
                public final /* synthetic */ F1F $captureInFlight;
                public final /* synthetic */ AuraNavigator $navigator;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Activity activity, AuraNavigator auraNavigator, F1F f1f, HtJ<? super AnonymousClass1> htJ) {
                    super(2, htJ);
                    this.$activity = activity;
                    this.$navigator = auraNavigator;
                    this.$captureInFlight = f1f;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    return new AnonymousClass1(this.$activity, this.$navigator, this.$captureInFlight, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    Object objCaptureScreenshot = obj;
                    EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                    int i = this.label;
                    try {
                        if (i == 0) {
                            Hwg.A00(objCaptureScreenshot);
                            Activity activity = this.$activity;
                            this.label = 1;
                            objCaptureScreenshot = HatchScreenshotShareEffectKt.captureScreenshot(activity, this);
                            if (objCaptureScreenshot == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                        } else {
                            if (i != 1) {
                                throw AnonymousClass001.A0n();
                            }
                            Hwg.A00(objCaptureScreenshot);
                        }
                        String str = (String) objCaptureScreenshot;
                        if (str == null) {
                            return Unit.INSTANCE;
                        }
                        AuraNavigator auraNavigator = this.$navigator;
                        F0C<C9hr<Object>>[] f0cArr = HatchShareSheetKey.$childSerializers;
                        auraNavigator.navigate((AuraNavKey) new HatchShareSheetKey(ShareType.SCREENSHOT, str, null, str, null, new HatchShareDownloadTarget.Media(str), null, null, null, null, null), false);
                        this.$captureInFlight.element = false;
                        return Unit.INSTANCE;
                    } finally {
                        this.$captureInFlight.element = false;
                    }
                }

                @Override // X.G0V
                public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                    return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                if (f1f.element || !HatchScreenshotShareEffectKt.supportsScreenshotSharing(auraNavigator.currentKey(true))) {
                    return;
                }
                F1F f1f2 = f1f;
                f1f2.element = true;
                AnonymousClass001.A1J(new AnonymousClass1(activity, auraNavigator, f1f2, null), c3ux);
            }
        };
        try {
            activity.registerScreenCaptureCallback(activity.getMainExecutor(), screenCaptureCallback);
            z = true;
        } catch (RuntimeException e) {
            CFK.A0K(HatchScreenshotShareEffectKt.TAG, e, "Failed to register screenshot callback");
            z = false;
        }
        final Activity activity2 = this.$activity;
        return new InterfaceC06807bD() { // from class: com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt$HatchScreenshotShareEffect$3$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
                if (z) {
                    try {
                        activity2.unregisterScreenCaptureCallback(screenCaptureCallback);
                    } catch (RuntimeException e2) {
                        CFK.A0K(HatchScreenshotShareEffectKt.TAG, e2, "Failed to unregister screenshot callback");
                    }
                }
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchScreenshotShareEffectKt$HatchScreenshotShareEffect$3$1(Activity activity, AuraNavigator auraNavigator, C3UX c3ux) {
        super(1);
        this.$activity = activity;
        this.$navigator = auraNavigator;
        this.$coroutineScope = c3ux;
    }
}
