package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C10649I0t;
import X.C10650I0u;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3rb;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.backgroundwork.api.BackgroundWorkContentClaim;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.model.BrowserTaskPresentation;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$hold$2$pending$1", f = "LocalBrowserPendingTaskHold.kt", l = {AuraWaitlistConfettiKt.StandardParticleCount}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserPendingTaskHold$hold$2$pending$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ BackgroundWorkContentClaim $claim;
    public final /* synthetic */ LocalBrowserTaskRegistry $registry;
    public final /* synthetic */ BrowserTaskRepository $repository;
    public final /* synthetic */ String $taskId;
    public int label;
    public final /* synthetic */ LocalBrowserPendingTaskHold this$0;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$hold$2$pending$1$1", f = "LocalBrowserPendingTaskHold.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$hold$2$pending$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0W<BrowserTaskPresentation, List<? extends LocalBrowserTaskRecordJson>, HtJ<? super BrowserTaskPresentation>, Object> {
        public final /* synthetic */ LocalBrowserTaskRegistry $registry;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ LocalBrowserPendingTaskHold this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LocalBrowserPendingTaskHold localBrowserPendingTaskHold, LocalBrowserTaskRegistry localBrowserTaskRegistry, HtJ<? super AnonymousClass1> htJ) {
            super(3, htJ);
            this.this$0 = localBrowserPendingTaskHold;
            this.$registry = localBrowserTaskRegistry;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(BrowserTaskPresentation browserTaskPresentation, List<LocalBrowserTaskRecordJson> list, HtJ<? super BrowserTaskPresentation> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$registry, htJ);
            anonymousClass1.L$0 = browserTaskPresentation;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BrowserTaskPresentation browserTaskPresentation = (BrowserTaskPresentation) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (browserTaskPresentation == null || !this.this$0.isPending(browserTaskPresentation, this.$registry)) {
                return null;
            }
            return browserTaskPresentation;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(BrowserTaskPresentation browserTaskPresentation, List<? extends LocalBrowserTaskRecordJson> list, HtJ<? super BrowserTaskPresentation> htJ) {
            return invoke2(browserTaskPresentation, (List<LocalBrowserTaskRecordJson>) list, htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$hold$2$pending$1$2", f = "LocalBrowserPendingTaskHold.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$hold$2$pending$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<BrowserTaskPresentation, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(AnonymousClass002.A1X(obj2));
        }

        @Override // X.G0V
        public final Object invoke(BrowserTaskPresentation browserTaskPresentation, HtJ<? super Boolean> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = browserTaskPresentation;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserPendingTaskHold$hold$2$pending$1(BrowserTaskRepository browserTaskRepository, String str, LocalBrowserTaskRegistry localBrowserTaskRegistry, LocalBrowserPendingTaskHold localBrowserPendingTaskHold, BackgroundWorkContentClaim backgroundWorkContentClaim, HtJ<? super LocalBrowserPendingTaskHold$hold$2$pending$1> htJ) {
        super(2, htJ);
        this.$repository = browserTaskRepository;
        this.$taskId = str;
        this.$registry = localBrowserTaskRegistry;
        this.this$0 = localBrowserPendingTaskHold;
        this.$claim = backgroundWorkContentClaim;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserPendingTaskHold$hold$2$pending$1(this.$repository, this.$taskId, this.$registry, this.this$0, this.$claim, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<BrowserTaskPresentation> c20qPresentationUpdates = this.$repository.presentationUpdates(this.$taskId);
            LocalBrowserTaskRegistry localBrowserTaskRegistry = this.$registry;
            C10649I0t c10649I0t = new C10649I0t(new C10650I0u(new AnonymousClass2(null), C3rb.A03(new AnonymousClass1(this.this$0, localBrowserTaskRegistry, null), c20qPresentationUpdates, localBrowserTaskRegistry.records), 4), 2);
            final BackgroundWorkContentClaim backgroundWorkContentClaim = this.$claim;
            final String str = this.$taskId;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold$hold$2$pending$1.3
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((BrowserTaskPresentation) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(BrowserTaskPresentation browserTaskPresentation, HtJ<? super Unit> htJ) {
                    backgroundWorkContentClaim.update(LocalBrowserBackgroundWorkKt.localBrowserBackgroundWorkContent(str, browserTaskPresentation, null, null, null, false, false));
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c10649I0t.collect(c20z, this) == enumC10460Hji) {
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
        return ((LocalBrowserPendingTaskHold$hold$2$pending$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
