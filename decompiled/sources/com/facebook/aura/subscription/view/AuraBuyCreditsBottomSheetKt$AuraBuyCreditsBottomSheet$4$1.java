package com.facebook.aura.subscription.view;

import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C8j4;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel;
import com.facebook.aura.status.viewmodel.CreditProduct;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$4$1", f = "AuraBuyCreditsBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<String> $selectedProductId$delegate;
    public final /* synthetic */ C1BO<AuraBuyCreditsViewModel.UiState> $uiState$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$4$1(C1BO<AuraBuyCreditsViewModel.UiState> c1bo, MutableState<String> mutableState, HtJ<? super AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$4$1> htJ) {
        super(2, htJ);
        this.$uiState$delegate = c1bo;
        this.$selectedProductId$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$4$1(this.$uiState$delegate, this.$selectedProductId$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String value;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        MutableState<String> mutableState = this.$selectedProductId$delegate;
        if (C8j4.A1D(this.$uiState$delegate).isEmpty()) {
            value = null;
        } else {
            AHD ahdA1D = C8j4.A1D(this.$uiState$delegate);
            MutableState<String> mutableState2 = this.$selectedProductId$delegate;
            if ((ahdA1D instanceof Collection) && ahdA1D.isEmpty()) {
                value = ((CreditProduct) AbstractC0878AGe.A0F(C8j4.A1D(this.$uiState$delegate))).id;
            } else {
                Iterator it = ahdA1D.iterator();
                while (it.hasNext()) {
                    if (MutableState.A0B(mutableState2, ((CreditProduct) it.next()).id)) {
                        value = this.$selectedProductId$delegate.getValue();
                        break;
                    }
                }
                value = ((CreditProduct) AbstractC0878AGe.A0F(C8j4.A1D(this.$uiState$delegate))).id;
            }
        }
        mutableState.Af8(value);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
