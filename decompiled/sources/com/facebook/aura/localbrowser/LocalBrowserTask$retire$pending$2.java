package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.HwK;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTask$retire$pending$2", f = "LocalBrowserEndpoint.kt", l = {1021}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserTask$retire$pending$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ LocalBrowserTaskOutcome $outcome;
    public Object L$0;
    public int label;
    public final /* synthetic */ LocalBrowserTask this$0;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTask$retire$pending$2$1", f = "LocalBrowserEndpoint.kt", l = {1028, 1031, 1033, 1033, 1031, 1033, 1033}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTask$retire$pending$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ LocalBrowserSession $owned;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public final /* synthetic */ LocalBrowserTask this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LocalBrowserSession localBrowserSession, LocalBrowserTask localBrowserTask, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$owned = localBrowserSession;
            this.this$0 = localBrowserTask;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$owned, this.this$0, htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x014b, code lost:
        
            if (r0 == r11) goto L68;
         */
        /* JADX WARN: Removed duplicated region for block: B:101:0x01e9  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x0241  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x025a  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x028b  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x02a4  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x02a8  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x02b9  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0097 A[Catch: all -> 0x0133, TryCatch #1 {all -> 0x0133, blocks: (B:30:0x00ad, B:31:0x00b0, B:25:0x0091, B:27:0x0097), top: B:156:0x0015 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01d8  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 728
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTask$retire$pending$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserTask$retire$pending$2(LocalBrowserTask localBrowserTask, LocalBrowserTaskOutcome localBrowserTaskOutcome, HtJ<? super LocalBrowserTask$retire$pending$2> htJ) {
        super(2, htJ);
        this.this$0 = localBrowserTask;
        this.$outcome = localBrowserTaskOutcome;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserTask$retire$pending$2(this.this$0, this.$outcome, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            this.this$0.retired = true;
            this.this$0.cpuHold.A5w(null);
            this.this$0.notificationPreviewCapture.A5w(null);
            this.this$0.backgroundWorkUpdates.A5w(null);
            this.this$0.backgroundWork.release();
            LocalBrowserTask localBrowserTask = this.this$0;
            localBrowserTask.registry.finish(localBrowserTask.id, localBrowserTask.bindingId, this.$outcome, false);
            this.this$0.viewer.close();
            LocalBrowserSession session = this.this$0.getSession();
            if (session == null) {
                session = this.this$0.getLastSession();
            }
            HwK hwK = HwK.A00;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(session, this.this$0, null);
            this.L$0 = null;
            this.label = 1;
            if (GAo.A00(this, hwK, anonymousClass1) == enumC10460Hji) {
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
        return ((LocalBrowserTask$retire$pending$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
