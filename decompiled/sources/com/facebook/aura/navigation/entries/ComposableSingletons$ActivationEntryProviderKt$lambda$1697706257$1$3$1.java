package com.facebook.aura.navigation.entries;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import com.facebook.aura.activation.model.AuraDisclosureViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.navigation.entries.ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$3$1", f = "ActivationEntryProvider.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $acceptFailedMessage;
    public final /* synthetic */ AuraDisclosureViewModel $disclosureViewModel;
    public final /* synthetic */ View $view;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$3$1(AuraDisclosureViewModel auraDisclosureViewModel, View view, String str, HtJ<? super ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$3$1> htJ) {
        super(2, htJ);
        this.$disclosureViewModel = auraDisclosureViewModel;
        this.$view = view;
        this.$acceptFailedMessage = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$3$1(this.$disclosureViewModel, this.$view, this.$acceptFailedMessage, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<AuraDisclosureViewModel.ViewEffect> c22i = this.$disclosureViewModel.viewEffect;
            final View view = this.$view;
            final String str = this.$acceptFailedMessage;
            C20Z<? super AuraDisclosureViewModel.ViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.navigation.entries.ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$3$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((AuraDisclosureViewModel.ViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(AuraDisclosureViewModel.ViewEffect viewEffect, HtJ<? super Unit> htJ) {
                    if (!(viewEffect instanceof AuraDisclosureViewModel.ViewEffect.DisclosureAccepted)) {
                        if (viewEffect instanceof AuraDisclosureViewModel.ViewEffect.AcceptFailed) {
                            AnonymousClass007.A0n(view, AuraToast.Companion, str);
                        } else {
                            throw new NoWhenBranchMatchedException();
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
        throw new KotlinNothingValueException();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
