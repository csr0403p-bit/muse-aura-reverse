package com.facebook.aura.devices.link.ordering;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$HatchLinkOrderSheet$1$1", f = "HatchLinkOrderSheet.kt", l = {97}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchLinkOrderSheetKt$HatchLinkOrderSheet$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchLinkOrderViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkOrderSheetKt$HatchLinkOrderSheet$1$1(HatchLinkOrderViewModel hatchLinkOrderViewModel, AuraNavigator auraNavigator, HtJ<? super HatchLinkOrderSheetKt$HatchLinkOrderSheet$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchLinkOrderViewModel;
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchLinkOrderSheetKt$HatchLinkOrderSheet$1$1(this.$viewModel, this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<Unit> c22i = this.$viewModel.dismiss;
            final AuraNavigator auraNavigator = this.$navigator;
            C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$HatchLinkOrderSheet$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    auraNavigator.back();
                    return Unit.INSTANCE;
                }

                public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                    auraNavigator.back();
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
        return ((HatchLinkOrderSheetKt$HatchLinkOrderSheet$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
