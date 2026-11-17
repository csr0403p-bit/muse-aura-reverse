package com.facebook.aura.partners.wearables.linking;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepositoryJsonKt;
import com.facebook.aura.partners.wearables.linking.WearablesLinkingViewEffect;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.wearables.linking.WearablesLinkingSharedKt$WearablesLinkingViewEffects$1$1", f = "WearablesLinkingShared.kt", l = {VoiceSelectionRepositoryJsonKt.MAX_VOICE_ID_LENGTH}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class WearablesLinkingSharedKt$WearablesLinkingViewEffects$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnLinked$delegate;
    public final /* synthetic */ WearablesLinkingViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WearablesLinkingSharedKt$WearablesLinkingViewEffects$1$1(WearablesLinkingViewModel wearablesLinkingViewModel, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super WearablesLinkingSharedKt$WearablesLinkingViewEffects$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = wearablesLinkingViewModel;
        this.$currentOnLinked$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new WearablesLinkingSharedKt$WearablesLinkingViewEffects$1$1(this.$viewModel, this.$currentOnLinked$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<WearablesLinkingViewEffect> c22i = this.$viewModel.viewEffects;
            final C1BO<Function0<Unit>> c1bo = this.$currentOnLinked$delegate;
            C20Z<? super WearablesLinkingViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.partners.wearables.linking.WearablesLinkingSharedKt$WearablesLinkingViewEffects$1$1.1
                public final Object emit(WearablesLinkingViewEffect wearablesLinkingViewEffect, HtJ<? super Unit> htJ) {
                    if (!C7384Etj.areEqual(wearablesLinkingViewEffect, WearablesLinkingViewEffect.Linked.INSTANCE)) {
                        throw C3cG.A0q();
                    }
                    C1BO.A0D(c1bo);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((WearablesLinkingViewEffect) obj2, (HtJ<? super Unit>) htJ);
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
        return ((WearablesLinkingSharedKt$WearablesLinkingViewEffects$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
