package com.facebook.aura.email.repo;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import com.facebook.aura.email.model.EmailSender;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$verifySender$2$storedSender$1", f = "EmailRepository.kt", l = {733, 735}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class EmailRepository$verifySender$2$storedSender$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super EmailSender>, Object> {
    public final /* synthetic */ String $address;
    public final /* synthetic */ String $id;
    public int label;
    public final /* synthetic */ EmailRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailRepository$verifySender$2$storedSender$1(EmailRepository emailRepository, String str, String str2, HtJ<? super EmailRepository$verifySender$2$storedSender$1> htJ) {
        super(2, htJ);
        this.this$0 = emailRepository;
        this.$id = str;
        this.$address = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new EmailRepository$verifySender$2$storedSender$1(this.this$0, this.$id, this.$address, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: Exception -> 0x0070, CancellationException -> 0x0071, TryCatch #2 {CancellationException -> 0x0071, Exception -> 0x0070, blocks: (B:16:0x0033, B:17:0x0036, B:18:0x0040, B:20:0x0046, B:22:0x0055, B:24:0x006b, B:13:0x0025), top: B:30:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e A[SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r8.label
            r7 = 0
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L17
            if (r1 == r0) goto L13
            if (r1 != r3) goto Le
            goto L33
        Le:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L13:
            X.Hwg.A00(r9)
            goto L25
        L17:
            X.Hwg.A00(r9)
            r8.label = r0
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r0 = X.C7Bq.A01(r0, r8)
            if (r0 != r4) goto L25
            return r4
        L25:
            com.facebook.aura.email.repo.EmailRepository r2 = r8.this$0     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
            java.lang.String r1 = r8.$id     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
            r8.label = r3     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
            r0 = 0
            java.lang.Object r9 = r2.senders(r1, r0, r8)     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
            if (r9 != r4) goto L36
            return r4
        L33:
            X.Hwg.A00(r9)     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
        L36:
            com.facebook.aura.email.model.EmailPage r9 = (com.facebook.aura.email.model.EmailPage) r9     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
            X.AHD<T> r0 = r9.data     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
            java.lang.String r6 = r8.$address     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
        L40:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
            if (r0 == 0) goto L6e
            java.lang.Object r4 = r5.next()     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
            r3 = r4
            com.facebook.aura.email.model.EmailSender r3 = (com.facebook.aura.email.model.EmailSender) r3     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
            java.lang.String r0 = r3.emailAddress     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
            boolean r0 = X.C7384Etj.areEqual(r0, r6)     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
            if (r0 == 0) goto L40
            java.lang.String r2 = "ACTIVE"
            java.lang.String r1 = "PENDING"
            java.lang.String r0 = "PROVISIONAL"
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
            java.util.Set r1 = X.BFI.A0H(r0)     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
            java.lang.String r0 = r3.status     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
            if (r0 == 0) goto L40
        L6b:
            com.facebook.aura.email.model.EmailSender r4 = (com.facebook.aura.email.model.EmailSender) r4     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L71
            return r4
        L6e:
            r4 = r7
            goto L6b
        L70:
            return r7
        L71:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository$verifySender$2$storedSender$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super EmailSender> htJ) {
        return ((EmailRepository$verifySender$2$storedSender$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
