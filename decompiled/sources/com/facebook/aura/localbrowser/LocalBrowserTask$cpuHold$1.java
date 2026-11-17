package com.facebook.aura.localbrowser;

import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C20Q;
import X.C3UX;
import X.C3cH;
import X.C3pU;
import X.C3rb;
import X.EnumC10460Hji;
import X.G0V;
import X.G2j;
import X.GDB;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.model.BrowserTaskPresentation;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTask$cpuHold$1", f = "LocalBrowserEndpoint.kt", l = {846}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserTask$cpuHold$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ LocalBrowserTask this$0;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTask$cpuHold$1$3", f = "LocalBrowserEndpoint.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTask$cpuHold$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G2j<BrowserTaskPresentation, Boolean, Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ boolean Z$0;
        public /* synthetic */ boolean Z$1;
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(4, htJ);
        }

        public final Object invoke(BrowserTaskPresentation browserTaskPresentation, boolean z, boolean z2, HtJ<? super Boolean> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(htJ);
            anonymousClass3.L$0 = browserTaskPresentation;
            anonymousClass3.Z$0 = z;
            anonymousClass3.Z$1 = z2;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BrowserTaskPresentation browserTaskPresentation = (BrowserTaskPresentation) this.L$0;
            boolean z = this.Z$0;
            boolean z2 = this.Z$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            boolean z3 = true;
            if ((browserTaskPresentation == null || !browserTaskPresentation.isRunning() || z) && !z2) {
                z3 = false;
            }
            return Boolean.valueOf(z3);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Object invoke(BrowserTaskPresentation browserTaskPresentation, Boolean bool, Boolean bool2, HtJ<? super Boolean> htJ) {
            return invoke(browserTaskPresentation, AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTask$cpuHold$1$4", f = "LocalBrowserEndpoint.kt", l = {846}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTask$cpuHold$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Unit>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;
        public final /* synthetic */ LocalBrowserTask this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(LocalBrowserTask localBrowserTask, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.this$0 = localBrowserTask;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, htJ);
            anonymousClass4.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass4;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (z) {
                    LocalBrowserUsageMeter localBrowserUsageMeter = this.this$0.runtime.resourceUsage.cpuHold;
                    this.Z$0 = z;
                    this.label = 1;
                    if (LocalBrowserCpuHoldKt.holdCpuAwake(localBrowserUsageMeter, this) == enumC10460Hji) {
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
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Unit> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Unit> htJ) {
            return ((AnonymousClass4) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserTask$cpuHold$1(LocalBrowserTask localBrowserTask, HtJ<? super LocalBrowserTask$cpuHold$1> htJ) {
        super(2, htJ);
        this.this$0 = localBrowserTask;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserTask$cpuHold$1(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q c20qA01 = GDB.A01(C3rb.A00(new AnonymousClass3(null), BrowserTaskRepository.Companion.getInstance(this.this$0.userSession).presentationUpdates(C3cH.A0b(this.this$0)), AbstractC05633ui.A00(new LocalBrowserTask$cpuHold$1$invokeSuspend$$inlined$flatMapLatest$1(null), this.this$0.lastSessionState), AbstractC05633ui.A00(new LocalBrowserTask$cpuHold$1$invokeSuspend$$inlined$flatMapLatest$2(null), this.this$0.lastSessionState)));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
            this.label = 1;
            if (C3pU.A00(this, anonymousClass4, c20qA01) == enumC10460Hji) {
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
        return new LocalBrowserTask$cpuHold$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
