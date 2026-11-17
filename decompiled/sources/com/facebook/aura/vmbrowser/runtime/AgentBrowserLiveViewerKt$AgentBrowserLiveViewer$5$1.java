package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.Awn;
import X.C05663ul;
import X.C1HY;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C6v3;
import X.EnumC10460Hji;
import X.EnumC10573Huf;
import X.F2N;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AgentComputerScreenKey;
import com.facebook.aura.navigation.key.AgentComputerTakeOverScreenKey;
import com.facebook.aura.vmbrowser.runtime.BrowserViewerSession;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$5$1", f = "AgentBrowserLiveViewer.kt", l = {118}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$5$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ BrowserViewerSession.Host $host;
    public final /* synthetic */ boolean $isTakeoverEntry;
    public final /* synthetic */ C1HY $lifecycleOwner;
    public final /* synthetic */ AuraNavigator $navigator;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$5$1$1", f = "AgentBrowserLiveViewer.kt", l = {121}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$5$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ BrowserViewerSession.Host $host;
        public final /* synthetic */ boolean $isTakeoverEntry;
        public final /* synthetic */ AuraNavigator $navigator;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BrowserViewerSession.Host host, AuraNavigator auraNavigator, boolean z, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$host = host;
            this.$navigator = auraNavigator;
            this.$isTakeoverEntry = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$host, this.$navigator, this.$isTakeoverEntry, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    final AuraNavigator auraNavigator = this.$navigator;
                    C05663ul c05663ulA01 = C6v3.A01(new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$5$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C3cG.A0H(auraNavigator);
                        }
                    });
                    final boolean z = this.$isTakeoverEntry;
                    final BrowserViewerSession.Host host = this.$host;
                    C20Z c20z = new C20Z() { // from class: com.facebook.aura.vmbrowser.runtime.AgentBrowserLiveViewerKt.AgentBrowserLiveViewer.5.1.1.2
                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit((AuraNavKey) obj2, (HtJ<? super Unit>) htJ);
                        }

                        public final Object emit(AuraNavKey auraNavKey, HtJ<? super Unit> htJ) {
                            boolean z2;
                            if (z) {
                                z2 = auraNavKey instanceof AgentComputerTakeOverScreenKey;
                            } else {
                                z2 = auraNavKey instanceof AgentComputerScreenKey;
                            }
                            host.setForeground(z2);
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
                this.$host.setForeground(false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.$host.setForeground(false);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$5$1(C1HY c1hy, BrowserViewerSession.Host host, AuraNavigator auraNavigator, boolean z, HtJ<? super AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$5$1> htJ) {
        super(2, htJ);
        this.$lifecycleOwner = c1hy;
        this.$host = host;
        this.$navigator = auraNavigator;
        this.$isTakeoverEntry = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$5$1(this.$lifecycleOwner, this.$host, this.$navigator, this.$isTakeoverEntry, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            F2N lifecycle = this.$lifecycleOwner.getLifecycle();
            EnumC10573Huf enumC10573Huf = EnumC10573Huf.A05;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$host, this.$navigator, this.$isTakeoverEntry, null);
            this.label = 1;
            if (Awn.A00(enumC10573Huf, lifecycle, this, anonymousClass1) == enumC10460Hji) {
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
        return ((AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$5$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
