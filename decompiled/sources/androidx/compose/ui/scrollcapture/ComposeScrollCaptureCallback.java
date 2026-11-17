package androidx.compose.ui.scrollcapture;

import X.AbstractC07127nr;
import X.AbstractC1709Aos;
import X.AnonymousClass001;
import X.BKh;
import X.BLU;
import X.C10533Hqc;
import X.C1562Alc;
import X.C1576Alr;
import X.C3UX;
import X.C8j3;
import X.EQe;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.HwK;
import X.Hwg;
import X.HzC;
import X.InterfaceC1708Aor;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import androidx.compose.runtime.MutableState;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {
    public final View A00;
    public final RelativeScroller A01;
    public final BLU A02;
    public final InterfaceC1708Aor A03;
    public final C1562Alc A04;
    public final C3UX A05;

    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {188}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Runnable $onReady;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Runnable runnable, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$onReady = runnable;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ComposeScrollCaptureCallback.this.new AnonymousClass1(this.$onReady, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                RelativeScroller relativeScroller = ComposeScrollCaptureCallback.this.A01;
                this.label = 1;
                if (RelativeScroller.A00(relativeScroller, this, 0.0f - relativeScroller.A00) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            ComposeScrollCaptureCallback.this.A03.AVn();
            this.$onReady.run();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {120}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1, reason: invalid class name and case insensitive filesystem */
    public final class C106561 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Rect $captureArea;
        public final /* synthetic */ Consumer<Rect> $onComplete;
        public final /* synthetic */ ScrollCaptureSession $session;
        public int label;
        public final /* synthetic */ ComposeScrollCaptureCallback this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback;Landroid/view/ScrollCaptureSession;Landroid/graphics/Rect;Ljava/util/function/Consumer<Landroid/graphics/Rect;>;LX/HtJ<-Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1;>;)V */
        public C106561(Rect rect, ScrollCaptureSession scrollCaptureSession, ComposeScrollCaptureCallback composeScrollCaptureCallback, Consumer consumer, HtJ htJ) {
            super(2, htJ);
            this.this$0 = composeScrollCaptureCallback;
            this.$session = scrollCaptureSession;
            this.$captureArea = rect;
            this.$onComplete = consumer;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            ComposeScrollCaptureCallback composeScrollCaptureCallback = this.this$0;
            return new C106561(this.$captureArea, this.$session, composeScrollCaptureCallback, this.$onComplete, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ComposeScrollCaptureCallback composeScrollCaptureCallback = this.this$0;
                ScrollCaptureSession scrollCaptureSession = this.$session;
                Rect rect = this.$captureArea;
                BLU blu = new BLU(rect.left, rect.top, rect.right, rect.bottom);
                this.label = 1;
                obj = ComposeScrollCaptureCallback.A03(scrollCaptureSession, composeScrollCaptureCallback, blu, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            this.$onComplete.accept(AbstractC1709Aos.A00((BLU) obj));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C106561) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer<Rect> consumer) {
        final C10533Hqc c10533HqcA11 = AnonymousClass001.A11(new C106561(rect, scrollCaptureSession, this, consumer, null), this.A05);
        c10533HqcA11.AO5(new EQe(cancellationSignal, 2));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: X.Aoq
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                c10533HqcA11.A5w(null);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object A03(android.view.ScrollCaptureSession r11, androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback r12, X.BLU r13, X.HtJ r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.A03(android.view.ScrollCaptureSession, androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback, X.BLU, X.HtJ):java.lang.Object");
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureEnd(Runnable runnable) {
        AnonymousClass001.A1I(HwK.A00, new AnonymousClass1(runnable, null), this.A05);
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer<Rect> consumer) {
        consumer.accept(AbstractC1709Aos.A00(this.A02));
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.A01.A00 = 0.0f;
        MutableState.A09(true, ((C1576Alr) this.A03).A00);
        runnable.run();
    }

    public ComposeScrollCaptureCallback(View view, InterfaceC1708Aor interfaceC1708Aor, C1562Alc c1562Alc, BLU blu, C3UX c3ux) {
        this.A04 = c1562Alc;
        this.A02 = blu;
        this.A03 = interfaceC1708Aor;
        this.A00 = view;
        this.A05 = new HzC(c3ux.AEA().plus(BKh.A00));
        this.A01 = new RelativeScroller(blu.A00 - blu.A03, new ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }
}
