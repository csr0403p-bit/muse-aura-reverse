package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C3UX;
import X.C3cH;
import X.C3rb;
import X.C60I;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.model.BrowserTaskPresentation;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTask$heldPopupRelease$1", f = "LocalBrowserEndpoint.kt", l = {855}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserTask$heldPopupRelease$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ LocalBrowserTask this$0;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTask$heldPopupRelease$1$1", f = "LocalBrowserEndpoint.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTask$heldPopupRelease$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0W<BrowserTaskPresentation, LocalBrowserSession, HtJ<? super LocalBrowserSession>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(3, htJ);
        }

        @Override // X.G0W
        public final Object invoke(BrowserTaskPresentation browserTaskPresentation, LocalBrowserSession localBrowserSession, HtJ<? super LocalBrowserSession> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = browserTaskPresentation;
            anonymousClass1.L$1 = localBrowserSession;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BrowserTaskPresentation browserTaskPresentation = (BrowserTaskPresentation) this.L$0;
            Object obj2 = this.L$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (obj2 == null || browserTaskPresentation == null || !browserTaskPresentation.isTerminal()) {
                return null;
            }
            return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserTask$heldPopupRelease$1(LocalBrowserTask localBrowserTask, HtJ<? super LocalBrowserTask$heldPopupRelease$1> htJ) {
        super(2, htJ);
        this.this$0 = localBrowserTask;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserTask$heldPopupRelease$1(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C60I c60iA03 = C3rb.A03(new AnonymousClass1(null), BrowserTaskRepository.Companion.getInstance(this.this$0.userSession).presentationUpdates(C3cH.A0b(this.this$0)), this.this$0.lastSessionState);
            Object obj2 = new C20Z() { // from class: com.facebook.aura.localbrowser.LocalBrowserTask$heldPopupRelease$1.2
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj3, HtJ htJ) {
                    return emit((LocalBrowserSession) obj3, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(LocalBrowserSession localBrowserSession, HtJ<? super Unit> htJ) {
                    LocalBrowserTarget localBrowserTarget;
                    if (localBrowserSession != null && (localBrowserTarget = localBrowserSession.target) != null) {
                        localBrowserTarget.releaseHeldPopup();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c60iA03.collect(obj2, this) == enumC10460Hji) {
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
        return new LocalBrowserTask$heldPopupRelease$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
