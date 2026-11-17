package com.facebook.aura.uicontrol;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.Bs8;
import X.C06H;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9290GCr;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.model.WidgetStateMutationHost;
import com.facebook.aura.uicontrol.UiAction;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class UiControlActionSink {
    public static final Companion Companion = new Companion();
    public final C3Em<String> _pendingChatThemeId;
    public final C3Em<UiSuggestion> _pendingSuggestion;
    public final C3Em<UiAction> _pendingTabLightup;
    public final C3Em<String> _pendingUri;
    public final C3Em<PendingWidgetMessage> _pendingWidgetMessage;
    public final AtomicReference<Function0<BackNavigationResult>> backNavigation;
    public final CopyOnWriteArraySet<G0U<UiAction.Navigation, Boolean>> localNavigation;
    public final AtomicReference<UiControlNavigationHost> navigationHost;
    public final AtomicReference<Function0<Boolean>> navigationVisibility;
    public final C22I<String> pendingChatThemeId;
    public final C22I<UiSuggestion> pendingSuggestion;
    public final C22I<UiAction> pendingTabLightup;
    public final C22I<String> pendingUri;
    public final C22I<PendingWidgetMessage> pendingWidgetMessage;

    @DebugMetadata(c = "com.facebook.aura.uicontrol.UiControlActionSink$navigateBack$2", f = "UiControlActionSink.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.uicontrol.UiControlActionSink$navigateBack$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super BackNavigationResult>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return UiControlActionSink.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super BackNavigationResult> htJ) {
            return UiControlActionSink.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BackNavigationResult backNavigationResultInvoke;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            Function0<BackNavigationResult> function0 = UiControlActionSink.this.backNavigation.get();
            return (function0 == null || !UiControlActionSink.this.isNavigationVisible() || (backNavigationResultInvoke = function0.invoke()) == null) ? BackNavigationResult.NOT_ON_SCREEN : backNavigationResultInvoke;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.uicontrol.UiControlActionSink$publishWidgetMessage$1", f = "UiControlActionSink.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.uicontrol.UiControlActionSink$publishWidgetMessage$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<WidgetStateMutationHost, HtJ<? super Boolean>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(WidgetStateMutationHost widgetStateMutationHost, HtJ<? super Boolean> htJ) {
            return new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return AnonymousClass001.A0i();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.facebook.aura.uicontrol.UiControlActionSink$withVisibleNavigationHost$2", f = "UiControlActionSink.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.uicontrol.UiControlActionSink$withVisibleNavigationHost$2, reason: invalid class name and case insensitive filesystem */
    public final class C142572<T> extends AbstractC07127nr implements G0V<C3UX, HtJ<? super T>, Object> {
        public final /* synthetic */ G0U<UiControlNavigationHost, T> $block;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142572(G0U<? super UiControlNavigationHost, ? extends T> g0u, HtJ<? super C142572> htJ) {
            super(2, htJ);
            this.$block = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return UiControlActionSink.this.new C142572(this.$block, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            UiControlNavigationHost uiControlNavigationHostVisibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol = UiControlActionSink.this.visibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol();
            if (uiControlNavigationHostVisibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol != null) {
                return this.$block.invoke(uiControlNavigationHostVisibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol);
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super T> htJ) {
            return ((C142572) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void clearBackNavigation(Function0<? extends BackNavigationResult> function0) {
        C7384Etj.A0Y(function0, 0);
        Bs8.A00(function0, null, this.backNavigation);
    }

    public final void clearLocalNavigation(G0U<? super UiAction.Navigation, Boolean> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.localNavigation.remove(g0u);
    }

    public final void clearNavigationHost(UiControlNavigationHost uiControlNavigationHost) {
        C7384Etj.A0Y(uiControlNavigationHost, 0);
        uiControlNavigationHost.unregister$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol();
        Bs8.A00(uiControlNavigationHost, null, this.navigationHost);
    }

    public final void clearNavigationVisibility(Function0<Boolean> function0) {
        C7384Etj.A0Y(function0, 0);
        Bs8.A00(function0, null, this.navigationVisibility);
    }

    public final void publishChatTheme(String str) {
        C7384Etj.A0Y(str, 0);
        this._pendingChatThemeId.AhV(str);
    }

    public final void publishNavigation(String str) {
        C7384Etj.A0Y(str, 0);
        this._pendingUri.AhV(str);
    }

    public final boolean publishSuggestion(UiSuggestion uiSuggestion) {
        C7384Etj.A0Y(uiSuggestion, 0);
        if (UiActionKt.isPerformOnly(uiSuggestion.action)) {
            return false;
        }
        this._pendingSuggestion.AhV(uiSuggestion);
        return true;
    }

    public final void publishTabLightup(UiAction uiAction) {
        C7384Etj.A0Y(uiAction, 0);
        this._pendingTabLightup.AhV(uiAction);
    }

    public final void registerBackNavigation(Function0<? extends BackNavigationResult> function0) {
        C7384Etj.A0Y(function0, 0);
        this.backNavigation.set(function0);
    }

    public final void registerLocalNavigation(G0U<? super UiAction.Navigation, Boolean> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.localNavigation.add(g0u);
    }

    public final void registerNavigationHost(UiControlNavigationHost uiControlNavigationHost) {
        C7384Etj.A0Y(uiControlNavigationHost, 0);
        UiControlNavigationHost andSet = this.navigationHost.getAndSet(uiControlNavigationHost);
        if (andSet == null || andSet == uiControlNavigationHost) {
            return;
        }
        andSet.unregister$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol();
    }

    public final void registerNavigationVisibility(Function0<Boolean> function0) {
        C7384Etj.A0Y(function0, 0);
        this.navigationVisibility.set(function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void publishWidgetMessage$default(UiControlActionSink uiControlActionSink, String str, String str2, String str3, boolean z, G0V g0v, int i, Object obj) {
        boolean zA1K = C3cG.A1K(i & 8, z);
        if ((i & 16) != 0) {
            g0v = new AnonymousClass1(null);
        }
        uiControlActionSink.publishWidgetMessage(str, str2, str3, zA1K, g0v);
    }

    public final C22I<String> getPendingChatThemeId() {
        return this.pendingChatThemeId;
    }

    public final C22I<UiSuggestion> getPendingSuggestion() {
        return this.pendingSuggestion;
    }

    public final C22I<UiAction> getPendingTabLightup() {
        return this.pendingTabLightup;
    }

    public final C22I<String> getPendingUri() {
        return this.pendingUri;
    }

    public final C22I<PendingWidgetMessage> getPendingWidgetMessage() {
        return this.pendingWidgetMessage;
    }

    public final boolean isNavigationVisible() {
        Function0<Boolean> function0 = this.navigationVisibility.get();
        return function0 != null && AnonymousClass003.A1Y(function0);
    }

    public final Object navigateBack(HtJ<? super BackNavigationResult> htJ) {
        return GAo.A00(htJ, AuraDispatchers.mainImmediate, new AnonymousClass2(null));
    }

    public final Object showHere$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol(UiAction.Navigation navigation, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AuraDispatchers.mainImmediate, new UiControlActionSink$showHere$2(this, navigation, null));
    }

    public final UiControlNavigationHost visibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol() {
        UiControlNavigationHost uiControlNavigationHost = this.navigationHost.get();
        if (uiControlNavigationHost == null || !isNavigationVisible()) {
            return null;
        }
        return uiControlNavigationHost;
    }

    public final <T> Object withVisibleNavigationHost(G0U<? super UiControlNavigationHost, ? extends T> g0u, HtJ<? super T> htJ) {
        return GAo.A00(htJ, AuraDispatchers.mainImmediate, new C142572(g0u, null));
    }

    public final class Companion {
        public final UiControlActionSink getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (UiControlActionSink) abstractC3358CGz.A03(UiControlActionSink.class, UiControlActionSink$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public UiControlActionSink() {
        Integer num = C79.A01;
        C9290GCr c9290GCrA12 = C3cG.A12(num, 0, 8);
        this._pendingUri = c9290GCrA12;
        this.pendingUri = C3pd.A00(c9290GCrA12);
        C9290GCr c9290GCrA122 = C3cG.A12(num, 0, 8);
        this._pendingChatThemeId = c9290GCrA122;
        this.pendingChatThemeId = C3pd.A00(c9290GCrA122);
        C9290GCr c9290GCrA123 = C3cG.A12(num, 0, 8);
        this._pendingSuggestion = c9290GCrA123;
        this.pendingSuggestion = C3pd.A00(c9290GCrA123);
        C9290GCr c9290GCrA124 = C3cG.A12(num, 0, 4);
        this._pendingTabLightup = c9290GCrA124;
        this.pendingTabLightup = C3pd.A00(c9290GCrA124);
        C9290GCr c9290GCrA125 = C3cG.A12(num, 0, 8);
        this._pendingWidgetMessage = c9290GCrA125;
        this.pendingWidgetMessage = C3pd.A00(c9290GCrA125);
        this.navigationVisibility = new AtomicReference<>(null);
        this.backNavigation = new AtomicReference<>(null);
        this.localNavigation = new CopyOnWriteArraySet<>();
        this.navigationHost = new AtomicReference<>(null);
    }

    public final void publishWidgetMessage(String str, String str2, String str3, boolean z, G0V<? super WidgetStateMutationHost, ? super HtJ<? super Boolean>, ? extends Object> g0v) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(g0v, 4);
        this._pendingWidgetMessage.AhV(new PendingWidgetMessage(str, str2, str3, z, g0v));
    }
}
