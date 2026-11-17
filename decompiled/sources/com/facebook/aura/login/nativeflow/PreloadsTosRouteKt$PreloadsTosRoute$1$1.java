package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.login.nativeflow.PreloadsTosViewEffect;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.NativeLoginLandingScreenKey;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.PreloadsTosRouteKt$PreloadsTosRoute$1$1", f = "PreloadsTosRoute.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class PreloadsTosRouteKt$PreloadsTosRoute$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ PreloadsTosViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreloadsTosRouteKt$PreloadsTosRoute$1$1(PreloadsTosViewModel preloadsTosViewModel, AuraNavigator auraNavigator, HtJ<? super PreloadsTosRouteKt$PreloadsTosRoute$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = preloadsTosViewModel;
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PreloadsTosRouteKt$PreloadsTosRoute$1$1(this.$viewModel, this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<PreloadsTosViewEffect> c20q = this.$viewModel.viewEffect;
            final AuraNavigator auraNavigator = this.$navigator;
            C20Z<? super PreloadsTosViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.login.nativeflow.PreloadsTosRouteKt$PreloadsTosRoute$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((PreloadsTosViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(PreloadsTosViewEffect preloadsTosViewEffect, HtJ<? super Unit> htJ) {
                    if (C7384Etj.areEqual(preloadsTosViewEffect, PreloadsTosViewEffect.Accepted.INSTANCE)) {
                        auraNavigator.navigate(NativeLoginLandingScreenKey.INSTANCE, LaunchFlag.REPLACE_BACKSTACK);
                        return Unit.INSTANCE;
                    }
                    throw C3cG.A0q();
                }
            };
            this.label = 1;
            if (c20q.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((PreloadsTosRouteKt$PreloadsTosRoute$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
