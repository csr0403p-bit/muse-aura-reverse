package com.facebook.aura.settings.importmemory;

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
import android.widget.Toast;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.settings.importmemory.ImportMemoryEffect;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$1$1", f = "HatchImportMemoryToHatchScreen.kt", l = {125}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchImportMemoryToHatchViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$1$1(HatchImportMemoryToHatchViewModel hatchImportMemoryToHatchViewModel, Context context, AuraNavigator auraNavigator, HtJ<? super HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchImportMemoryToHatchViewModel;
        this.$context = context;
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$1$1(this.$viewModel, this.$context, this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<ImportMemoryEffect> c22i = this.$viewModel.effect;
            final Context context = this.$context;
            final AuraNavigator auraNavigator = this.$navigator;
            C20Z<? super ImportMemoryEffect> c20z = new C20Z() { // from class: com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((ImportMemoryEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(ImportMemoryEffect importMemoryEffect, HtJ<? super Unit> htJ) {
                    if (importMemoryEffect instanceof ImportMemoryEffect.ShowToast) {
                        Toast.makeText(context, ((ImportMemoryEffect.ShowToast) importMemoryEffect).messageResId, 0).show();
                    } else if (C7384Etj.areEqual(importMemoryEffect, ImportMemoryEffect.NavigateToConversation.INSTANCE)) {
                        AuraNavigator auraNavigator2 = auraNavigator;
                        ConversationTabScreenKey conversationTabScreenKey = ConversationTabScreenKey.INSTANCE;
                        auraNavigator2.popToTabRoot(conversationTabScreenKey);
                        if (!C7384Etj.areEqual(C3cG.A0H(auraNavigator), conversationTabScreenKey)) {
                            auraNavigator.navigate(conversationTabScreenKey, LaunchFlag.REPLACE_BACKSTACK);
                        }
                    } else {
                        throw C3cG.A0q();
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
        return ((HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
