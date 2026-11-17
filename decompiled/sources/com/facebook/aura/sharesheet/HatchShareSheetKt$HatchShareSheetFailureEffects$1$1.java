package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareSheetFailureEffects$1$1", f = "HatchShareSheet.kt", l = {492}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetKt$HatchShareSheetFailureEffects$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $checkFailed;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchShareSheetViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetKt$HatchShareSheetFailureEffects$1$1(HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str, HtJ<? super HatchShareSheetKt$HatchShareSheetFailureEffects$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchShareSheetViewModel;
        this.$context = context;
        this.$checkFailed = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchShareSheetKt$HatchShareSheetFailureEffects$1$1(this.$viewModel, this.$context, this.$checkFailed, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<Unit> c22i = this.$viewModel.eligibilityCheckFailures;
            final Context context = this.$context;
            final String str = this.$checkFailed;
            C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareSheetFailureEffects$1$1.1
                public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                    HatchShareSheetKt.showSendFailureToast(context, str);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    HatchShareSheetKt.showSendFailureToast(context, str);
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
        return ((HatchShareSheetKt$HatchShareSheetFailureEffects$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
