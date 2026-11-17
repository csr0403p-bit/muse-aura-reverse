package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C20Q;
import X.C3UX;
import X.C3pU;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTask$notificationPreviewCapture$1", f = "LocalBrowserEndpoint.kt", l = {859}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserTask$notificationPreviewCapture$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public Object L$0;
    public int label;
    public final /* synthetic */ LocalBrowserTask this$0;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTask$notificationPreviewCapture$1$1", f = "LocalBrowserEndpoint.kt", l = {862, 868}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTask$notificationPreviewCapture$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Unit>, Object> {
        public final /* synthetic */ BrowserTaskRepository $repository;
        public Object L$0;
        public /* synthetic */ boolean Z$0;
        public int label;
        public final /* synthetic */ LocalBrowserTask this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LocalBrowserTask localBrowserTask, BrowserTaskRepository browserTaskRepository, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.this$0 = localBrowserTask;
            this.$repository = browserTaskRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$repository, htJ);
            anonymousClass1.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0056 -> B:9:0x0016). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws kotlinx.coroutines.DispatchException {
            /*
                r9 = this;
                boolean r6 = r9.Z$0
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r9.label
                r4 = 2
                r3 = 1
                if (r0 == 0) goto L13
                if (r0 == r3) goto L3f
                if (r0 == r4) goto L13
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L13:
                X.Hwg.A00(r10)
            L16:
                if (r6 != 0) goto L59
                com.facebook.aura.localbrowser.LocalBrowserTask r0 = r9.this$0
                X.BLG<android.graphics.Bitmap> r8 = r0.notificationPreview
                java.lang.String r7 = X.C3cH.A0b(r0)
                com.facebook.aura.localbrowser.LocalBrowserTask r0 = r9.this$0
                com.facebook.aura.localbrowser.LocalBrowserSession r2 = r0.getSession()
                com.facebook.aura.browsertask.data.BrowserTaskRepository r1 = r9.$repository
                com.facebook.aura.localbrowser.LocalBrowserTask r0 = r9.this$0
                X.BLG<android.graphics.Bitmap> r0 = r0.notificationPreview
                java.lang.Object r0 = r0.getValue()
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                r9.L$0 = r8
                r9.Z$0 = r6
                r9.label = r3
                java.lang.Object r10 = com.facebook.aura.localbrowser.LocalBrowserBackgroundWorkKt.captureLocalBrowserNotificationPreview(r7, r2, r1, r0, r9)
                if (r10 != r5) goto L46
                return r5
            L3f:
                java.lang.Object r8 = r9.L$0
                X.BLG r8 = (X.BLG) r8
                X.Hwg.A00(r10)
            L46:
                r8.Af8(r10)
                r0 = 0
                r9.L$0 = r0
                r9.Z$0 = r6
                r9.label = r4
                r0 = 3000(0xbb8, double:1.482E-320)
                java.lang.Object r0 = X.C7Bq.A01(r0, r9)
                if (r0 != r5) goto L16
                return r5
            L59:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTask$notificationPreviewCapture$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Unit> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserTask$notificationPreviewCapture$1(LocalBrowserTask localBrowserTask, HtJ<? super LocalBrowserTask$notificationPreviewCapture$1> htJ) {
        super(2, htJ);
        this.this$0 = localBrowserTask;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserTask$notificationPreviewCapture$1(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            BrowserTaskRepository companion = BrowserTaskRepository.Companion.getInstance(this.this$0.userSession);
            C20Q<Boolean> c20q = AuraAppLifecycleManager.isAppInForegroundImmediateFlow;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, companion, null);
            this.L$0 = null;
            this.label = 1;
            if (C3pU.A00(this, anonymousClass1, c20q) == enumC10460Hji) {
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
        return new LocalBrowserTask$notificationPreviewCapture$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
