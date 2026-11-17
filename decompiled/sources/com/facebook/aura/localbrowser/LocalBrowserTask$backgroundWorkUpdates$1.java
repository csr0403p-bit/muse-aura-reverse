package com.facebook.aura.localbrowser;

import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass603;
import X.C20Z;
import X.C3UX;
import X.C3cH;
import X.C3cI;
import X.C3pS;
import X.C3rb;
import X.EnumC10460Hji;
import X.F2X;
import X.G0V;
import X.G0W;
import X.G2j;
import X.Ht9;
import X.HtJ;
import X.HwB;
import X.Hwg;
import X.InterfaceC2349BUy;
import android.graphics.Bitmap;
import com.facebook.aura.backgroundwork.api.BackgroundWorkContent;
import com.facebook.aura.backgroundwork.api.BackgroundWorkContentClaim;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.model.BrowserTaskPresentation;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTask$backgroundWorkUpdates$1", f = "LocalBrowserEndpoint.kt", l = {835}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserTask$backgroundWorkUpdates$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ LocalBrowserTask this$0;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTask$backgroundWorkUpdates$1$1", f = "LocalBrowserEndpoint.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTask$backgroundWorkUpdates$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0W<BrowserTaskPresentation, BrowserTaskPresentation, HtJ<? super BrowserTaskPresentation>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(3, htJ);
        }

        @Override // X.G0W
        public final Object invoke(BrowserTaskPresentation browserTaskPresentation, BrowserTaskPresentation browserTaskPresentation2, HtJ<? super BrowserTaskPresentation> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = browserTaskPresentation;
            anonymousClass1.L$1 = browserTaskPresentation2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            Object obj3 = this.L$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return obj3 == null ? obj2 : obj3;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTask$backgroundWorkUpdates$1$3", f = "LocalBrowserEndpoint.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTask$backgroundWorkUpdates$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G2j<BrowserTaskPresentation, LocalBrowserFacts, Bitmap, HtJ<? super BackgroundWorkContent>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public /* synthetic */ Object L$2;
        public int label;
        public final /* synthetic */ LocalBrowserTask this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LocalBrowserTask localBrowserTask, HtJ<? super AnonymousClass3> htJ) {
            super(4, htJ);
            this.this$0 = localBrowserTask;
        }

        @Override // X.G2j
        public final Object invoke(BrowserTaskPresentation browserTaskPresentation, LocalBrowserFacts localBrowserFacts, Bitmap bitmap, HtJ<? super BackgroundWorkContent> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, htJ);
            anonymousClass3.L$0 = browserTaskPresentation;
            anonymousClass3.L$1 = localBrowserFacts;
            anonymousClass3.L$2 = bitmap;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BrowserTaskPresentation browserTaskPresentation = (BrowserTaskPresentation) this.L$0;
            LocalBrowserFacts localBrowserFacts = (LocalBrowserFacts) this.L$1;
            Bitmap bitmap = (Bitmap) this.L$2;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return LocalBrowserBackgroundWorkKt.localBrowserBackgroundWorkContent(C3cH.A0b(this.this$0), browserTaskPresentation, localBrowserFacts, bitmap, this.this$0.stopFromNotification, true, false);
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTask$backgroundWorkUpdates$1$4, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass4 implements C20Z, InterfaceC2349BUy {
        public final /* synthetic */ BackgroundWorkContentClaim $tmp0;

        public AnonymousClass4(BackgroundWorkContentClaim backgroundWorkContentClaim) {
            this.$tmp0 = backgroundWorkContentClaim;
        }

        public final Object emit(BackgroundWorkContent backgroundWorkContent, HtJ<? super Unit> htJ) {
            this.$tmp0.update(backgroundWorkContent);
            return Unit.INSTANCE;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof C20Z) && (obj instanceof InterfaceC2349BUy)) {
                return C3cI.A1V(obj, getFunctionDelegate());
            }
            return false;
        }

        @Override // X.InterfaceC2349BUy
        public final Ht9<?> getFunctionDelegate() {
            return new F2X(2, this.$tmp0, BackgroundWorkContentClaim.class, "update", "update(Lcom/facebook/aura/backgroundwork/api/BackgroundWorkContent;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // X.C20Z
        public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
            this.$tmp0.update((BackgroundWorkContent) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserTask$backgroundWorkUpdates$1(LocalBrowserTask localBrowserTask, HtJ<? super LocalBrowserTask$backgroundWorkUpdates$1> htJ) {
        super(2, htJ);
        this.this$0 = localBrowserTask;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserTask$backgroundWorkUpdates$1(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HwB hwB = new HwB(null, new AnonymousClass1(null), BrowserTaskRepository.Companion.getInstance(this.this$0.userSession).presentationUpdates(C3cH.A0b(this.this$0)));
            C3pS c3pSA00 = AbstractC05633ui.A00(new LocalBrowserTask$backgroundWorkUpdates$1$invokeSuspend$$inlined$flatMapLatest$1(null), this.this$0.lastSessionState);
            LocalBrowserTask localBrowserTask = this.this$0;
            AnonymousClass603 anonymousClass603A00 = C3rb.A00(new AnonymousClass3(localBrowserTask, null), hwB, c3pSA00, localBrowserTask.notificationPreview);
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0.backgroundWork);
            this.label = 1;
            if (anonymousClass603A00.collect(anonymousClass4, this) == enumC10460Hji) {
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
        return new LocalBrowserTask$backgroundWorkUpdates$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
