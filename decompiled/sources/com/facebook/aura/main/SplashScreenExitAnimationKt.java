package com.facebook.aura.main;

import X.AnonymousClass003;
import X.C7384Etj;
import X.C8364Fcd;
import X.HsB;
import X.InterfaceC8368Fci;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public abstract class SplashScreenExitAnimationKt {
    public static final void animateSplashScreen(HsB hsB, final Function0<Unit> function0) {
        AnonymousClass003.A0u(hsB, function0);
        int i = Build.VERSION.SDK_INT;
        if (31 > i || i >= 34) {
            hsB.A00.A04(new InterfaceC8368Fci() { // from class: com.facebook.aura.main.SplashScreenExitAnimationKt.animateSplashScreen.1
                @Override // X.InterfaceC8368Fci
                public final void onSplashScreenExit(final C8364Fcd c8364Fcd) {
                    C7384Etj.A0Y(c8364Fcd, 0);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c8364Fcd.A00.A00(), (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
                    final Function0<Unit> function02 = function0;
                    objectAnimatorOfFloat.setDuration(300L);
                    objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                    objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.facebook.aura.main.SplashScreenExitAnimationKt$animateSplashScreen$1$1$1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            c8364Fcd.A00.A02();
                            function02.invoke();
                        }
                    });
                    objectAnimatorOfFloat.start();
                }
            });
        }
    }
}
