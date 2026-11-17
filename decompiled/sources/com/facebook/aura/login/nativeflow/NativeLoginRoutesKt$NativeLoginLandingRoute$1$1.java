package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.NativeLoginLandingScreenKey;
import com.facebook.aura.navigation.key.NativeLoginPhoneEntryScreenKey;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginLandingRoute$1$1", f = "NativeLoginRoutes.kt", l = {81}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginLandingRoute$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ NativeLoginViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRoutesKt$NativeLoginLandingRoute$1$1(NativeLoginViewModel nativeLoginViewModel, AuraNavigator auraNavigator, HtJ<? super NativeLoginRoutesKt$NativeLoginLandingRoute$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = nativeLoginViewModel;
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NativeLoginRoutesKt$NativeLoginLandingRoute$1$1(this.$viewModel, this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            NativeLoginRoutesKt$NativeLoginLandingRoute$1$1$invokeSuspend$$inlined$filter$1 nativeLoginRoutesKt$NativeLoginLandingRoute$1$1$invokeSuspend$$inlined$filter$1 = new NativeLoginRoutesKt$NativeLoginLandingRoute$1$1$invokeSuspend$$inlined$filter$1(this.$viewModel.initialDestination);
            final AuraNavigator auraNavigator = this.$navigator;
            C20Z<? super NativeLoginInitialDestination> c20z = new C20Z() { // from class: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginLandingRoute$1$1.2
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((NativeLoginInitialDestination) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(NativeLoginInitialDestination nativeLoginInitialDestination, HtJ<? super Unit> htJ) {
                    if (C7384Etj.areEqual(auraNavigator.currentKey(true), NativeLoginLandingScreenKey.INSTANCE)) {
                        auraNavigator.navigate((AuraNavKey) NativeLoginPhoneEntryScreenKey.INSTANCE, true);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (nativeLoginRoutesKt$NativeLoginLandingRoute$1$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
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
        return ((NativeLoginRoutesKt$NativeLoginLandingRoute$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
