package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
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
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$3$1", f = "HatchSecureStorageScreen.kt", l = {803}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnDismiss$delegate;
    public final /* synthetic */ HatchCredentialsViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$3$1(HatchCredentialsViewModel hatchCredentialsViewModel, Context context, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$3$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchCredentialsViewModel;
        this.$context = context;
        this.$currentOnDismiss$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$3$1(this.$viewModel, this.$context, this.$currentOnDismiss$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<Unit> c22i = this.$viewModel.captureCompleted;
            final Context context = this.$context;
            final C1BO<Function0<Unit>> c1bo = this.$currentOnDismiss$delegate;
            C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$3$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                    HatchSecureStorageScreenKt.cancelAutofill(context);
                    C1BO.A0D(c1bo);
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
        return ((HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
