package com.facebook.aura.ageverification;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1BO;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.ageverification.SelfieAgeStepScreenKt$SelfieAgeStep$1$1", f = "SelfieAgeStepScreen.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SelfieAgeStepScreenKt$SelfieAgeStep$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnBack$delegate;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnOtherMethods$delegate;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnResolved$delegate;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnSelfieUnavailable$delegate;
    public final /* synthetic */ SelfieAgeStepViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelfieAgeStepScreenKt$SelfieAgeStep$1$1(SelfieAgeStepViewModel selfieAgeStepViewModel, C1BO<? extends Function0<Unit>> c1bo, C1BO<? extends Function0<Unit>> c1bo2, C1BO<? extends Function0<Unit>> c1bo3, C1BO<? extends Function0<Unit>> c1bo4, HtJ<? super SelfieAgeStepScreenKt$SelfieAgeStep$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = selfieAgeStepViewModel;
        this.$currentOnOtherMethods$delegate = c1bo;
        this.$currentOnSelfieUnavailable$delegate = c1bo2;
        this.$currentOnResolved$delegate = c1bo3;
        this.$currentOnBack$delegate = c1bo4;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SelfieAgeStepScreenKt$SelfieAgeStep$1$1(this.$viewModel, this.$currentOnOtherMethods$delegate, this.$currentOnSelfieUnavailable$delegate, this.$currentOnResolved$delegate, this.$currentOnBack$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final SelfieAgeStepViewModel selfieAgeStepViewModel = this.$viewModel;
            C20Q<SelfieAgeStepEffect> c20q = selfieAgeStepViewModel.effects;
            final C1BO<Function0<Unit>> c1bo = this.$currentOnOtherMethods$delegate;
            final C1BO<Function0<Unit>> c1bo2 = this.$currentOnSelfieUnavailable$delegate;
            final C1BO<Function0<Unit>> c1bo3 = this.$currentOnResolved$delegate;
            final C1BO<Function0<Unit>> c1bo4 = this.$currentOnBack$delegate;
            C20Z<? super SelfieAgeStepEffect> c20z = new C20Z() { // from class: com.facebook.aura.ageverification.SelfieAgeStepScreenKt$SelfieAgeStep$1$1.1

                /* renamed from: com.facebook.aura.ageverification.SelfieAgeStepScreenKt$SelfieAgeStep$1$1$1$WhenMappings */
                public abstract /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[SelfieAgeStepEffect.values().length];
                        try {
                            AnonymousClass002.A13(SelfieAgeStepEffect.OTHER_METHODS, iArr);
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            AnonymousClass002.A14(SelfieAgeStepEffect.SELFIE_UNAVAILABLE, iArr);
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            AnonymousClass002.A15(SelfieAgeStepEffect.RESOLVED, iArr);
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            AnonymousClass002.A16(SelfieAgeStepEffect.BACK, iArr);
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public final Object emit(SelfieAgeStepEffect selfieAgeStepEffect, HtJ<? super Unit> htJ) {
                    C1BO<Function0<Unit>> c1bo5;
                    int iOrdinal = selfieAgeStepEffect.ordinal();
                    if (iOrdinal == 0) {
                        c1bo5 = c1bo;
                    } else if (iOrdinal == 1) {
                        c1bo5 = c1bo2;
                    } else {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw C3cG.A0q();
                            }
                            C1BO.A0D(c1bo4);
                            selfieAgeStepViewModel.onShown();
                            return Unit.INSTANCE;
                        }
                        c1bo5 = c1bo3;
                    }
                    C1BO.A0D(c1bo5);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((SelfieAgeStepEffect) obj2, (HtJ<? super Unit>) htJ);
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
        return ((SelfieAgeStepScreenKt$SelfieAgeStep$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
