package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C9hr;
import X.EnumC10460Hji;
import X.F0C;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PairsRole;
import com.facebook.aura.navigation.key.PairsStatusSheetKey;
import com.facebook.aura.pairs.PairsAcceptPreferencesEffect;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesEffects$1$1", f = "PairsAcceptPreferencesScreen.kt", l = {161}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesEffects$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $conflictMessage;
    public final /* synthetic */ boolean $fromHub;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<PairsContact, Unit> $onAlreadyPaired;
    public final /* synthetic */ G0U<PairsContact, Unit> $onRemovalOffered;
    public final /* synthetic */ PairsAcceptPreferencesViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesEffects$1$1(PairsAcceptPreferencesViewModel pairsAcceptPreferencesViewModel, String str, G0U<? super PairsContact, Unit> g0u, G0U<? super PairsContact, Unit> g0u2, AuraNavigator auraNavigator, boolean z, HtJ<? super PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesEffects$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = pairsAcceptPreferencesViewModel;
        this.$conflictMessage = str;
        this.$onAlreadyPaired = g0u;
        this.$onRemovalOffered = g0u2;
        this.$navigator = auraNavigator;
        this.$fromHub = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesEffects$1$1(this.$viewModel, this.$conflictMessage, this.$onAlreadyPaired, this.$onRemovalOffered, this.$navigator, this.$fromHub, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<PairsAcceptPreferencesEffect> c22i = this.$viewModel.effects;
            final String str = this.$conflictMessage;
            final G0U<PairsContact, Unit> g0u = this.$onAlreadyPaired;
            final G0U<PairsContact, Unit> g0u2 = this.$onRemovalOffered;
            final AuraNavigator auraNavigator = this.$navigator;
            final boolean z = this.$fromHub;
            C20Z<? super PairsAcceptPreferencesEffect> c20z = new C20Z() { // from class: com.facebook.aura.pairs.PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesEffects$1$1.1
                public final Object emit(PairsAcceptPreferencesEffect pairsAcceptPreferencesEffect, HtJ<? super Unit> htJ) {
                    if (pairsAcceptPreferencesEffect instanceof PairsAcceptPreferencesEffect.Message) {
                        ToastApi.INSTANCE.showToast(((PairsAcceptPreferencesEffect.Message) pairsAcceptPreferencesEffect).res);
                    } else if (pairsAcceptPreferencesEffect instanceof PairsAcceptPreferencesEffect.Conflict) {
                        PairsContact pairsContact = ((PairsAcceptPreferencesEffect.Conflict) pairsAcceptPreferencesEffect).earlierRequest;
                        if (pairsContact == null) {
                            ToastApi.INSTANCE.showToast(str);
                        } else {
                            (pairsContact.isVerified() ? g0u : g0u2).invoke(pairsContact);
                        }
                    } else {
                        if (!(pairsAcceptPreferencesEffect instanceof PairsAcceptPreferencesEffect.Accepted)) {
                            throw C3cG.A0q();
                        }
                        AuraNavigator auraNavigator2 = auraNavigator;
                        F0C<C9hr<Object>>[] f0cArr = PairsStatusSheetKey.$childSerializers;
                        auraNavigator2.navigate((AuraNavKey) new PairsStatusSheetKey(((PairsAcceptPreferencesEffect.Accepted) pairsAcceptPreferencesEffect).generationId, PairsRole.RECEIVER, z), false);
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((PairsAcceptPreferencesEffect) obj2, (HtJ<? super Unit>) htJ);
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
        return ((PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesEffects$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
