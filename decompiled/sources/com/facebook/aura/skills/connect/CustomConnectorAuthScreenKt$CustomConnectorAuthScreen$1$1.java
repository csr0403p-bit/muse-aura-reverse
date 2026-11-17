package com.facebook.aura.skills.connect;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.connect.CustomConnectorAuthEffect;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.connect.CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$1$1", f = "CustomConnectorAuthScreen.kt", l = {87}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ CustomConnectorAuthViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$1$1(CustomConnectorAuthViewModel customConnectorAuthViewModel, Context context, AuraNavigator auraNavigator, HtJ<? super CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = customConnectorAuthViewModel;
        this.$context = context;
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$1$1(this.$viewModel, this.$context, this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<CustomConnectorAuthEffect> c22i = this.$viewModel.effects;
            final Context context = this.$context;
            final AuraNavigator auraNavigator = this.$navigator;
            C20Z<? super CustomConnectorAuthEffect> c20z = new C20Z() { // from class: com.facebook.aura.skills.connect.CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$1$1.1
                public final Object emit(CustomConnectorAuthEffect customConnectorAuthEffect, HtJ<? super Unit> htJ) {
                    if (!(customConnectorAuthEffect instanceof CustomConnectorAuthEffect.OpenAuthorizeUrl)) {
                        if (!C7384Etj.areEqual(customConnectorAuthEffect, CustomConnectorAuthEffect.DismissSuccess.INSTANCE) && !C7384Etj.areEqual(customConnectorAuthEffect, CustomConnectorAuthEffect.DismissCancel.INSTANCE)) {
                            if (!C7384Etj.areEqual(customConnectorAuthEffect, CustomConnectorAuthEffect.ShowRetryableError.INSTANCE)) {
                                throw C3cG.A0q();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    AuraBrowserLauncherKt.openBrowser(((CustomConnectorAuthEffect.OpenAuthorizeUrl) customConnectorAuthEffect).url, context);
                    auraNavigator.dismissBottomSheetStack(Integer.MAX_VALUE);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((CustomConnectorAuthEffect) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((CustomConnectorAuthScreenKt$CustomConnectorAuthScreen$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
