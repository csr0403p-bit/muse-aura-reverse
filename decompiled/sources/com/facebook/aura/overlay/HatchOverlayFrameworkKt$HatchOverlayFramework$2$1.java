package com.facebook.aura.overlay;

import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C05663ul;
import X.C1BO;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.C7384Etj;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.overlay.viewmodel.HatchOverlayViewModel;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.overlay.HatchOverlayFrameworkKt$HatchOverlayFramework$2$1", f = "HatchOverlayFramework.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchOverlayFrameworkKt$HatchOverlayFramework$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<AHD<AuraNavKey>> $activeOverlays$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchOverlayViewModel $viewModel;
    public int label;

    /* renamed from: com.facebook.aura.overlay.HatchOverlayFrameworkKt$HatchOverlayFramework$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ C1BO<AHD<AuraNavKey>> $activeOverlays$delegate;
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C1BO<? extends AHD<? extends AuraNavKey>> c1bo, AuraNavigator auraNavigator) {
            super(0);
            this.$activeOverlays$delegate = c1bo;
            this.$navigator = auraNavigator;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            AHD<AuraNavKey> value = this.$activeOverlays$delegate.getValue();
            AuraNavigator auraNavigator = this.$navigator;
            boolean z = false;
            if (!(value instanceof Collection) || !value.isEmpty()) {
                Iterator it = value.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!auraNavigator.isInBackStack((AuraNavKey) it.next())) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchOverlayFrameworkKt$HatchOverlayFramework$2$1(C1BO<? extends AHD<? extends AuraNavKey>> c1bo, AuraNavigator auraNavigator, HatchOverlayViewModel hatchOverlayViewModel, HtJ<? super HatchOverlayFrameworkKt$HatchOverlayFramework$2$1> htJ) {
        super(2, htJ);
        this.$activeOverlays$delegate = c1bo;
        this.$navigator = auraNavigator;
        this.$viewModel = hatchOverlayViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchOverlayFrameworkKt$HatchOverlayFramework$2$1(this.$activeOverlays$delegate, this.$navigator, this.$viewModel, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$activeOverlays$delegate, this.$navigator));
            final HatchOverlayViewModel hatchOverlayViewModel = this.$viewModel;
            final AuraNavigator auraNavigator = this.$navigator;
            final C1BO<AHD<AuraNavKey>> c1bo = this.$activeOverlays$delegate;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.overlay.HatchOverlayFrameworkKt$HatchOverlayFramework$2$1.2
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                }

                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    if (z || !C7384Etj.areEqual(hatchOverlayViewModel.navigatedOverlayKeys, c1bo.getValue())) {
                        CFK.A01(c1bo.getValue().toString(), hatchOverlayViewModel.navigatedOverlayKeys.toString(), Boolean.valueOf(z), HatchOverlayFrameworkKt.TAG, "reconciling overlays: active=%s navigated=%s missingEntry=%b");
                        auraNavigator.popAll(AbstractC0878AGe.A0P(c1bo.getValue(), hatchOverlayViewModel.navigatedOverlayKeys));
                        Iterator itA09 = C1BO.A09(c1bo);
                        while (itA09.hasNext()) {
                            auraNavigator.navigate((AuraNavKey) itA09.next(), LaunchFlag.NAVIGATE);
                        }
                        hatchOverlayViewModel.setNavigatedOverlayKeys(C1BO.A0C(c1bo));
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c05663ulA01.collect(c20z, this) == enumC10460Hji) {
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
        return ((HatchOverlayFrameworkKt$HatchOverlayFramework$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
