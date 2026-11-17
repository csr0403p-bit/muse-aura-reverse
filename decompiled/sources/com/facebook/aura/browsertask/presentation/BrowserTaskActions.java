package com.facebook.aura.browsertask.presentation;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.InterfaceC7549F2g;
import com.facebook.aura.browsertask.control.BrowserTaskControlTransport;
import com.facebook.aura.browsertask.control.BrowserTaskStopKt;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.browsertask.data.BrowserTaskStateKt;
import com.facebook.aura.model.BrowserTaskPresentation;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class BrowserTaskActions implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BrowserTaskPresentationStore presentation;
    public final BrowserTaskRepository repository;
    public final C3UX scope;
    public final BrowserTaskControlTransport transport;
    public final AbstractC3358CGz userSession;

    public final class Companion {
        public final BrowserTaskActions getInstance(final AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (BrowserTaskActions) abstractC3358CGz.A03(BrowserTaskActions.class, new Function0() { // from class: com.facebook.aura.browsertask.presentation.BrowserTaskActions$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new BrowserTaskActions(abstractC3358CGz);
                }
            });
        }

        public static final BrowserTaskActions getInstance$lambda$0(AbstractC3358CGz abstractC3358CGz) {
            return new BrowserTaskActions(abstractC3358CGz);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.browsertask.presentation.BrowserTaskActions$stopTask$1", f = "BrowserTaskActions.kt", l = {58}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.browsertask.presentation.BrowserTaskActions$stopTask$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $taskId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$taskId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserTaskActions.this.new AnonymousClass1(this.$taskId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    BrowserTaskControlTransport browserTaskControlTransport = BrowserTaskActions.this.transport;
                    String str = this.$taskId;
                    this.label = 1;
                    if (BrowserTaskStopKt.stopWithRetry(browserTaskControlTransport, str, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A("BrowserTaskActions", "control op 'stopTask' failed", e2);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void focusTask(BrowserTaskPresentation browserTaskPresentation) {
        C7384Etj.A0Y(browserTaskPresentation, 0);
        if (!browserTaskPresentation.isLiveViewable() || C7BY.A0j(browserTaskPresentation.browserTaskId)) {
            return;
        }
        this.repository.focusTask(browserTaskPresentation);
    }

    public final void stopTask(BrowserTaskPresentation browserTaskPresentation) {
        C7384Etj.A0Y(browserTaskPresentation, 0);
        if (BrowserTaskStateKt.canStopBrowserTask(browserTaskPresentation)) {
            AnonymousClass001.A1J(new AnonymousClass1(browserTaskPresentation.browserTaskId, null), this.scope);
        }
        BrowserTaskPresentation browserTaskPresentationA0G = C3cG.A0G(this.presentation.currentTask);
        if (C7384Etj.areEqual(browserTaskPresentationA0G != null ? browserTaskPresentationA0G.browserTaskId : null, browserTaskPresentation.browserTaskId)) {
            this.presentation.resetPreview();
        }
        this.repository.dismiss(browserTaskPresentation.browserTaskId);
    }

    public final void acknowledgeTerminalOutcome() {
        this.repository.clearTerminalTask();
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        AnonymousClass002.A1K((HoC) C3cH.A0t(this.scope));
    }

    public final void stopSession() {
        BrowserTaskPresentation browserTaskPresentationA0G = C3cG.A0G(this.presentation.currentTask);
        if (browserTaskPresentationA0G != null) {
            stopTask(browserTaskPresentationA0G);
        } else {
            this.presentation.resetPreview();
            this.repository.dismiss();
        }
    }

    public BrowserTaskActions(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.repository = BrowserTaskRepository.Companion.getInstance(abstractC3358CGz);
        this.presentation = BrowserTaskPresentationStore.Companion.getInstance(abstractC3358CGz);
        this.transport = new BrowserTaskControlTransport(abstractC3358CGz);
        this.scope = C3cH.A0x(C3cG.A0v());
    }

    public /* synthetic */ BrowserTaskActions(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public final void focusTask(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() > 0) {
            this.repository.focusTask(strA0l);
        }
    }
}
