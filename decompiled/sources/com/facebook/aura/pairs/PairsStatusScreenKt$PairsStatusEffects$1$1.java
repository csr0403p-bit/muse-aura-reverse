package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.pairs.PairsStatusEffect;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.PairsStatusScreenKt$PairsStatusEffects$1$1", f = "PairsStatusScreen.kt", l = {154}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PairsStatusScreenKt$PairsStatusEffects$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $fromHub;
    public final /* synthetic */ MutableState<PairsStatusEffect.Leave> $leaveToast$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ PairsStatusViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsStatusScreenKt$PairsStatusEffects$1$1(PairsStatusViewModel pairsStatusViewModel, boolean z, AuraNavigator auraNavigator, MutableState<PairsStatusEffect.Leave> mutableState, HtJ<? super PairsStatusScreenKt$PairsStatusEffects$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = pairsStatusViewModel;
        this.$fromHub = z;
        this.$navigator = auraNavigator;
        this.$leaveToast$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PairsStatusScreenKt$PairsStatusEffects$1$1(this.$viewModel, this.$fromHub, this.$navigator, this.$leaveToast$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<PairsStatusEffect> c22i = this.$viewModel.effects;
            final boolean z = this.$fromHub;
            final AuraNavigator auraNavigator = this.$navigator;
            final MutableState<PairsStatusEffect.Leave> mutableState = this.$leaveToast$delegate;
            C20Z<? super PairsStatusEffect> c20z = new C20Z() { // from class: com.facebook.aura.pairs.PairsStatusScreenKt$PairsStatusEffects$1$1.1

                /* renamed from: com.facebook.aura.pairs.PairsStatusScreenKt$PairsStatusEffects$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public final class C02741 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
                    public static final C02741 INSTANCE = new C02741();

                    public C02741() {
                        super(1);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
                    @Override // X.G0U
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Boolean invoke(com.facebook.aura.navigation.AuraNavKey r1) {
                        /*
                            r0 = this;
                            r0 = 0
                            X.C7384Etj.A0Y(r1, r0)
                            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.PairsStatusSheetKey
                            if (r0 != 0) goto L11
                            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.PairsAcceptLinkSheetKey
                            if (r0 != 0) goto L11
                            boolean r1 = r1 instanceof com.facebook.aura.navigation.key.PairsAcceptPreferencesSheetKey
                            r0 = 0
                            if (r1 == 0) goto L12
                        L11:
                            r0 = 1
                        L12:
                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsStatusScreenKt$PairsStatusEffects$1$1.AnonymousClass1.C02741.invoke(com.facebook.aura.navigation.AuraNavKey):java.lang.Boolean");
                    }
                }

                public final Object emit(PairsStatusEffect pairsStatusEffect, HtJ<? super Unit> htJ) {
                    if (pairsStatusEffect instanceof PairsStatusEffect.Message) {
                        ToastApi.INSTANCE.showToast(((PairsStatusEffect.Message) pairsStatusEffect).res);
                    } else {
                        if (!(pairsStatusEffect instanceof PairsStatusEffect.Leave)) {
                            throw C3cG.A0q();
                        }
                        mutableState.Af8(pairsStatusEffect);
                        boolean z2 = z;
                        AuraNavigator auraNavigator2 = auraNavigator;
                        if (z2) {
                            auraNavigator2.popAll(C02741.INSTANCE);
                        } else {
                            auraNavigator2.dismissBottomSheetStack(Integer.MAX_VALUE);
                        }
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((PairsStatusEffect) obj2, (HtJ<? super Unit>) htJ);
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
        return ((PairsStatusScreenKt$PairsStatusEffects$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
