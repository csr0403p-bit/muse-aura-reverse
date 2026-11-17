package com.facebook.aura.deeplink;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1BO;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.navigation3.runtime.NavBackStack;
import com.facebook.aura.deeplink.HatchIntentViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ActivationScreenKey;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.deeplink.HatchIntentViewModelKt$DeeplinkNavigation$2$1", f = "HatchIntentViewModel.kt", l = {437}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchIntentViewModelKt$DeeplinkNavigation$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ NavBackStack<AuraNavKey> $backStack;
    public final /* synthetic */ C1BO<Boolean> $isOnboarding$delegate;
    public final /* synthetic */ C1BO<Boolean> $isReadyForNavigation$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<AuraNavKey, Unit> $onBeforeNavigate;
    public final /* synthetic */ C1BO<HatchIntentViewModel.PendingDeeplink> $pendingDeeplink$delegate;
    public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $requestConnectorAccountLink;
    public final /* synthetic */ HatchIntentViewModel $viewModel;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchIntentViewModelKt$DeeplinkNavigation$2$1(G0U<? super HtJ<? super Unit>, ? extends Object> g0u, NavBackStack<AuraNavKey> navBackStack, G0U<? super AuraNavKey, Unit> g0u2, AuraNavigator auraNavigator, HatchIntentViewModel hatchIntentViewModel, C1BO<? extends HatchIntentViewModel.PendingDeeplink> c1bo, C1BO<Boolean> c1bo2, C1BO<Boolean> c1bo3, HtJ<? super HatchIntentViewModelKt$DeeplinkNavigation$2$1> htJ) {
        super(2, htJ);
        this.$requestConnectorAccountLink = g0u;
        this.$backStack = navBackStack;
        this.$onBeforeNavigate = g0u2;
        this.$navigator = auraNavigator;
        this.$viewModel = hatchIntentViewModel;
        this.$pendingDeeplink$delegate = c1bo;
        this.$isOnboarding$delegate = c1bo2;
        this.$isReadyForNavigation$delegate = c1bo3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchIntentViewModelKt$DeeplinkNavigation$2$1(this.$requestConnectorAccountLink, this.$backStack, this.$onBeforeNavigate, this.$navigator, this.$viewModel, this.$pendingDeeplink$delegate, this.$isOnboarding$delegate, this.$isReadyForNavigation$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HatchIntentViewModel.PendingDeeplink value;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            value = this.$pendingDeeplink$delegate.getValue();
            if (value != null && !C1BO.A0F(this.$isOnboarding$delegate)) {
                if (value instanceof HatchIntentViewModel.PendingDeeplink.ConnectorAccountLink) {
                    if (C1BO.A0F(this.$isReadyForNavigation$delegate)) {
                        G0U<HtJ<? super Unit>, Object> g0u = this.$requestConnectorAccountLink;
                        this.L$0 = value;
                        this.label = 1;
                        if (g0u.invoke(this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                } else {
                    if (!(value instanceof HatchIntentViewModel.PendingDeeplink.Navigation)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (C1BO.A0F(this.$isReadyForNavigation$delegate) || (((HatchIntentViewModel.PendingDeeplink.Navigation) value).key instanceof ActivationScreenKey)) {
                        NavBackStack<AuraNavKey> navBackStack = this.$backStack;
                        ListIterator listIterator = navBackStack.listIterator(navBackStack.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                break;
                            }
                            HatchIntentViewModel.PendingDeeplink.Navigation navigation = (HatchIntentViewModel.PendingDeeplink.Navigation) value;
                            if (HatchIntentViewModelKt.isSameChatAs((AuraNavKey) listIterator.previous(), navigation.key)) {
                                int iNextIndex = listIterator.nextIndex();
                                if (iNextIndex >= 0) {
                                    if (iNextIndex < AnonymousClass002.A0E(this.$backStack)) {
                                        G0U<AuraNavKey, Unit> g0u2 = this.$onBeforeNavigate;
                                        if (g0u2 != null) {
                                            g0u2.invoke(navigation.key);
                                        }
                                        this.$navigator.popLast(AnonymousClass002.A0E(this.$backStack) - iNextIndex);
                                    }
                                }
                            }
                        }
                        G0U<AuraNavKey, Unit> g0u3 = this.$onBeforeNavigate;
                        if (g0u3 != null) {
                            g0u3.invoke(((HatchIntentViewModel.PendingDeeplink.Navigation) value).key);
                        }
                        HatchIntentViewModelKt.navigateToDeeplink(this.$navigator, (HatchIntentViewModel.PendingDeeplink.Navigation) value, this.$backStack);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        value = (HatchIntentViewModel.PendingDeeplink) this.L$0;
        Hwg.A00(obj);
        this.$viewModel.onDeeplinkHandled(value);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchIntentViewModelKt$DeeplinkNavigation$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
