package com.facebook.aura.status.view;

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
import com.facebook.aura.browsertask.navigation.BrowserTaskNavigation;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.status.viewmodel.DesktopViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.status.view.DesktopScreenKt$DesktopScreen$2$1", f = "DesktopScreen.kt", l = {100}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class DesktopScreenKt$DesktopScreen$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ BrowserTaskNavigation $browserActions;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ DesktopViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DesktopScreenKt$DesktopScreen$2$1(DesktopViewModel desktopViewModel, BrowserTaskNavigation browserTaskNavigation, AuraNavigator auraNavigator, HtJ<? super DesktopScreenKt$DesktopScreen$2$1> htJ) {
        super(2, htJ);
        this.$viewModel = desktopViewModel;
        this.$browserActions = browserTaskNavigation;
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new DesktopScreenKt$DesktopScreen$2$1(this.$viewModel, this.$browserActions, this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<BrowserTaskPresentation> c22i = this.$viewModel.openBrowser;
            final BrowserTaskNavigation browserTaskNavigation = this.$browserActions;
            final AuraNavigator auraNavigator = this.$navigator;
            C20Z<? super BrowserTaskPresentation> c20z = new C20Z() { // from class: com.facebook.aura.status.view.DesktopScreenKt$DesktopScreen$2$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((BrowserTaskPresentation) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(BrowserTaskPresentation browserTaskPresentation, HtJ<? super Unit> htJ) {
                    browserTaskNavigation.showFocusedTask(browserTaskPresentation.browserTaskId, auraNavigator, browserTaskPresentation.isControlledByUser());
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
        return ((DesktopScreenKt$DesktopScreen$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
