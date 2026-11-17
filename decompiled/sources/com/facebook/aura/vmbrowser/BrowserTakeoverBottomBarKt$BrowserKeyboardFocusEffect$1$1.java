package com.facebook.aura.vmbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.Awn;
import X.C05663ul;
import X.C0Hi;
import X.C1518AkS;
import X.C1BO;
import X.C1C3;
import X.C1HY;
import X.C3UX;
import X.C3pU;
import X.C5303Dfm;
import X.C6v3;
import X.C7Bq;
import X.EnumC10460Hji;
import X.EnumC10573Huf;
import X.F2N;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AgentComputerScreenKey;
import com.facebook.aura.navigation.key.AgentComputerTakeOverScreenKey;
import com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$BrowserKeyboardFocusEffect$1$1;
import com.facebook.aura.vmbrowser.runtime.AgentBrowserTakeoverControls;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$BrowserKeyboardFocusEffect$1$1", f = "BrowserTakeoverBottomBar.kt", l = {344}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class BrowserTakeoverBottomBarKt$BrowserKeyboardFocusEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Boolean> $captureFocused;
    public final /* synthetic */ AgentBrowserTakeoverControls $controls;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ C1518AkS $focusRequester;
    public final /* synthetic */ boolean $isTakeoverEntry;
    public final /* synthetic */ C1C3 $keyboardController;
    public final /* synthetic */ C1HY $lifecycleOwner;
    public final /* synthetic */ AuraNavigator $navigator;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$BrowserKeyboardFocusEffect$1$1$1", f = "BrowserTakeoverBottomBar.kt", l = {350}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$BrowserKeyboardFocusEffect$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C1BO<Boolean> $captureFocused;
        public final /* synthetic */ AgentBrowserTakeoverControls $controls;
        public final /* synthetic */ C0Hi $focusManager;
        public final /* synthetic */ C1518AkS $focusRequester;
        public final /* synthetic */ boolean $isTakeoverEntry;
        public final /* synthetic */ C1C3 $keyboardController;
        public final /* synthetic */ C1HY $lifecycleOwner;
        public final /* synthetic */ AuraNavigator $navigator;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$BrowserKeyboardFocusEffect$1$1$1$2", f = "BrowserTakeoverBottomBar.kt", l = {371}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$BrowserKeyboardFocusEffect$1$1$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Unit>, Object> {
            public final /* synthetic */ C1BO<Boolean> $captureFocused;
            public final /* synthetic */ AgentBrowserTakeoverControls $controls;
            public final /* synthetic */ C0Hi $focusManager;
            public final /* synthetic */ C1518AkS $focusRequester;
            public final /* synthetic */ boolean $isTakeoverEntry;
            public final /* synthetic */ C1C3 $keyboardController;
            public final /* synthetic */ C1HY $lifecycleOwner;
            public final /* synthetic */ AuraNavigator $navigator;
            public Object L$0;
            public /* synthetic */ boolean Z$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AgentBrowserTakeoverControls agentBrowserTakeoverControls, C1BO<Boolean> c1bo, C0Hi c0Hi, C1C3 c1c3, AuraNavigator auraNavigator, boolean z, C1HY c1hy, C1518AkS c1518AkS, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.$controls = agentBrowserTakeoverControls;
                this.$captureFocused = c1bo;
                this.$focusManager = c0Hi;
                this.$keyboardController = c1c3;
                this.$navigator = auraNavigator;
                this.$isTakeoverEntry = z;
                this.$lifecycleOwner = c1hy;
                this.$focusRequester = c1518AkS;
            }

            public static final Unit invokeSuspend$lambda$0(AuraNavigator auraNavigator, boolean z, C1HY c1hy, C1518AkS c1518AkS, C1C3 c1c3, C1BO c1bo, C0Hi c0Hi, boolean z2) {
                if (z2) {
                    AuraNavKey auraNavKeyCurrentKey = auraNavigator.currentKey(true);
                    if ((z ? auraNavKeyCurrentKey instanceof AgentComputerTakeOverScreenKey : auraNavKeyCurrentKey instanceof AgentComputerScreenKey) && ((C5303Dfm) c1hy.getLifecycle()).A01.A00(EnumC10573Huf.A05)) {
                        C1518AkS.A00(c1518AkS);
                        if (c1c3 != null) {
                            c1c3.Afd();
                        }
                    }
                } else if (C1BO.A0F(c1bo)) {
                    c0Hi.A6G(false);
                    if (c1c3 != null) {
                        c1c3.hide();
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$controls, this.$captureFocused, this.$focusManager, this.$keyboardController, this.$navigator, this.$isTakeoverEntry, this.$lifecycleOwner, this.$focusRequester, htJ);
                anonymousClass2.Z$0 = AnonymousClass001.A1X(obj);
                return anonymousClass2;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) throws Exception {
                AutoCloseable autoCloseableRegisterKeyboard;
                boolean z = this.Z$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        if (!z) {
                            return Unit.INSTANCE;
                        }
                        AgentBrowserTakeoverControls agentBrowserTakeoverControls = this.$controls;
                        final AuraNavigator auraNavigator = this.$navigator;
                        final boolean z2 = this.$isTakeoverEntry;
                        final C1HY c1hy = this.$lifecycleOwner;
                        final C1518AkS c1518AkS = this.$focusRequester;
                        final C1C3 c1c3 = this.$keyboardController;
                        final C1BO<Boolean> c1bo = this.$captureFocused;
                        final C0Hi c0Hi = this.$focusManager;
                        autoCloseableRegisterKeyboard = agentBrowserTakeoverControls.registerKeyboard(new G0U() { // from class: com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$BrowserKeyboardFocusEffect$1$1$1$2$$ExternalSyntheticLambda0
                            @Override // X.G0U
                            public final Object invoke(Object obj2) {
                                return BrowserTakeoverBottomBarKt$BrowserKeyboardFocusEffect$1$1.AnonymousClass1.AnonymousClass2.invokeSuspend$lambda$0(auraNavigator, z2, c1hy, c1518AkS, c1c3, c1bo, c0Hi, AnonymousClass001.A1X(obj2));
                            }
                        });
                        this.L$0 = autoCloseableRegisterKeyboard;
                        this.Z$0 = z;
                        this.label = 1;
                        if (C7Bq.A02(this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        autoCloseableRegisterKeyboard = (AutoCloseable) this.L$0;
                        Hwg.A00(obj);
                    }
                    throw new KotlinNothingValueException();
                } finally {
                }
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Unit> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public static final boolean invokeSuspend$lambda$0(AuraNavigator auraNavigator, boolean z) {
            AuraNavKey auraNavKeyCurrentKey = auraNavigator.currentKey(true);
            return z ? auraNavKeyCurrentKey instanceof AgentComputerTakeOverScreenKey : auraNavKeyCurrentKey instanceof AgentComputerScreenKey;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraNavigator auraNavigator, boolean z, AgentBrowserTakeoverControls agentBrowserTakeoverControls, C1BO<Boolean> c1bo, C0Hi c0Hi, C1C3 c1c3, C1HY c1hy, C1518AkS c1518AkS, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$navigator = auraNavigator;
            this.$isTakeoverEntry = z;
            this.$controls = agentBrowserTakeoverControls;
            this.$captureFocused = c1bo;
            this.$focusManager = c0Hi;
            this.$keyboardController = c1c3;
            this.$lifecycleOwner = c1hy;
            this.$focusRequester = c1518AkS;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$navigator, this.$isTakeoverEntry, this.$controls, this.$captureFocused, this.$focusManager, this.$keyboardController, this.$lifecycleOwner, this.$focusRequester, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final AuraNavigator auraNavigator = this.$navigator;
                final boolean z = this.$isTakeoverEntry;
                C05663ul c05663ulA01 = C6v3.A01(new Function0() { // from class: com.facebook.aura.vmbrowser.BrowserTakeoverBottomBarKt$BrowserKeyboardFocusEffect$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(BrowserTakeoverBottomBarKt$BrowserKeyboardFocusEffect$1$1.AnonymousClass1.invokeSuspend$lambda$0(auraNavigator, z));
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$controls, this.$captureFocused, this.$focusManager, this.$keyboardController, this.$navigator, this.$isTakeoverEntry, this.$lifecycleOwner, this.$focusRequester, null);
                this.label = 1;
                if (C3pU.A00(this, anonymousClass2, c05663ulA01) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserTakeoverBottomBarKt$BrowserKeyboardFocusEffect$1$1(boolean z, C1HY c1hy, AuraNavigator auraNavigator, boolean z2, AgentBrowserTakeoverControls agentBrowserTakeoverControls, C1BO<Boolean> c1bo, C0Hi c0Hi, C1C3 c1c3, C1518AkS c1518AkS, HtJ<? super BrowserTakeoverBottomBarKt$BrowserKeyboardFocusEffect$1$1> htJ) {
        super(2, htJ);
        this.$enabled = z;
        this.$lifecycleOwner = c1hy;
        this.$navigator = auraNavigator;
        this.$isTakeoverEntry = z2;
        this.$controls = agentBrowserTakeoverControls;
        this.$captureFocused = c1bo;
        this.$focusManager = c0Hi;
        this.$keyboardController = c1c3;
        this.$focusRequester = c1518AkS;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new BrowserTakeoverBottomBarKt$BrowserKeyboardFocusEffect$1$1(this.$enabled, this.$lifecycleOwner, this.$navigator, this.$isTakeoverEntry, this.$controls, this.$captureFocused, this.$focusManager, this.$keyboardController, this.$focusRequester, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$enabled) {
                F2N lifecycle = this.$lifecycleOwner.getLifecycle();
                EnumC10573Huf enumC10573Huf = EnumC10573Huf.A05;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$navigator, this.$isTakeoverEntry, this.$controls, this.$captureFocused, this.$focusManager, this.$keyboardController, this.$lifecycleOwner, this.$focusRequester, null);
                this.label = 1;
                if (Awn.A00(enumC10573Huf, lifecycle, this, anonymousClass1) == enumC10460Hji) {
                    return enumC10460Hji;
                }
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
        return ((BrowserTakeoverBottomBarKt$BrowserKeyboardFocusEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
