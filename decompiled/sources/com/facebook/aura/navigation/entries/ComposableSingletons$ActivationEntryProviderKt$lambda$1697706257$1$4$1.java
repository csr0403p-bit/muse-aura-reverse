package com.facebook.aura.navigation.entries;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import com.facebook.aura.activation.model.AuraNdaViewModel;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.navigation.entries.ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$4$1", f = "ActivationEntryProvider.kt", l = {136}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $ndaAcceptFailedMessage;
    public final /* synthetic */ AuraNdaViewModel $ndaViewModel;
    public final /* synthetic */ View $view;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$4$1(AuraNdaViewModel auraNdaViewModel, View view, String str, HtJ<? super ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$4$1> htJ) {
        super(2, htJ);
        this.$ndaViewModel = auraNdaViewModel;
        this.$view = view;
        this.$ndaAcceptFailedMessage = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$4$1(this.$ndaViewModel, this.$view, this.$ndaAcceptFailedMessage, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<AuraNdaViewModel.ViewEffect> c22i = this.$ndaViewModel.viewEffect;
            final View view = this.$view;
            final String str = this.$ndaAcceptFailedMessage;
            C20Z<? super AuraNdaViewModel.ViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.navigation.entries.ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$4$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((AuraNdaViewModel.ViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(AuraNdaViewModel.ViewEffect viewEffect, HtJ<? super Unit> htJ) {
                    if (!(viewEffect instanceof AuraNdaViewModel.ViewEffect.Accepted)) {
                        if (viewEffect instanceof AuraNdaViewModel.ViewEffect.AcceptFailed) {
                            AnonymousClass007.A0n(view, AuraToast.Companion, str);
                        } else {
                            throw C3cG.A0q();
                        }
                    }
                    return Unit.INSTANCE;
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
        throw C3cG.A0p();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
