package com.facebook.aura.pairs;

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
import android.content.Context;
import com.facebook.aura.file.actions.HatchShare;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.pairs.SpacePickerEffect;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerEffects$1$1", f = "SpaceCollaboratorPickerScreen.kt", l = {110}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SpaceCollaboratorPickerScreenKt$SpacePickerEffects$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ SpaceCollaboratorPickerViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceCollaboratorPickerScreenKt$SpacePickerEffects$1$1(SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel, Context context, AuraNavigator auraNavigator, HtJ<? super SpaceCollaboratorPickerScreenKt$SpacePickerEffects$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = spaceCollaboratorPickerViewModel;
        this.$context = context;
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SpaceCollaboratorPickerScreenKt$SpacePickerEffects$1$1(this.$viewModel, this.$context, this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<SpacePickerEffect> c20q = this.$viewModel.effects;
            final Context context = this.$context;
            final AuraNavigator auraNavigator = this.$navigator;
            C20Z<? super SpacePickerEffect> c20z = new C20Z() { // from class: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerEffects$1$1.1
                public final Object emit(SpacePickerEffect spacePickerEffect, HtJ<? super Unit> htJ) {
                    if (spacePickerEffect instanceof SpacePickerEffect.Share) {
                        HatchShare.INSTANCE.shareUrl(context, ((SpacePickerEffect.Share) spacePickerEffect).text, null, null);
                    } else {
                        if (!C7384Etj.areEqual(spacePickerEffect, SpacePickerEffect.Close.INSTANCE)) {
                            throw C3cG.A0q();
                        }
                        auraNavigator.back();
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((SpacePickerEffect) obj2, (HtJ<? super Unit>) htJ);
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
        return ((SpaceCollaboratorPickerScreenKt$SpacePickerEffects$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
