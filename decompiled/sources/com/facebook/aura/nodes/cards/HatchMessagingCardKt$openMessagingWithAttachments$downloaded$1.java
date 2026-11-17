package com.facebook.aura.nodes.cards;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.HxE;
import android.content.Context;
import android.net.Uri;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.cards.HatchMessagingCardKt$openMessagingWithAttachments$downloaded$1", f = "HatchMessagingCard.kt", l = {201}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchMessagingCardKt$openMessagingWithAttachments$downloaded$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends HxE<? extends Uri, ? extends String>>>, Object> {
    public final /* synthetic */ List<MessagingCardAttachment> $attachments;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessagingCardKt$openMessagingWithAttachments$downloaded$1(List<MessagingCardAttachment> list, Context context, AbstractC3358CGz abstractC3358CGz, HtJ<? super HatchMessagingCardKt$openMessagingWithAttachments$downloaded$1> htJ) {
        super(2, htJ);
        this.$attachments = list;
        this.$context = context;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessagingCardKt$openMessagingWithAttachments$downloaded$1(this.$attachments, this.$context, this.$userSession, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends HxE<? extends Uri, ? extends String>>> htJ) {
        return invoke2(c3ux, (HtJ<? super List<? extends HxE<? extends Uri, String>>>) htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009a -> B:6:0x0022). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r6 = r16
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r15.label
            r3 = 1
            if (r0 == 0) goto L3d
            if (r0 != r3) goto L9d
            java.lang.Object r0 = r15.L$9
            com.facebook.aura.nodes.cards.MessagingCardAttachment r0 = (com.facebook.aura.nodes.cards.MessagingCardAttachment) r0
            java.lang.Object r2 = r15.L$6
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r1 = r15.L$4
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r11 = r15.L$2
            X.CGz r11 = (X.AbstractC3358CGz) r11
            java.lang.Object r8 = r15.L$1
            android.content.Context r8 = (android.content.Context) r8
            X.Hwg.A00(r6)
        L22:
            com.facebook.aura.gateway.HatchFileOperations$DownloadResult r6 = (com.facebook.aura.gateway.HatchFileOperations.DownloadResult) r6
            boolean r5 = r6 instanceof com.facebook.aura.gateway.HatchFileOperations.DownloadResult.Success
            if (r5 == 0) goto L4f
            com.facebook.aura.gateway.HatchFileOperations$DownloadResult$Success r6 = (com.facebook.aura.gateway.HatchFileOperations.DownloadResult.Success) r6
            java.lang.String r0 = r6.localPath
            r5 = 0
            android.net.Uri r5 = X.C7Je.A01(r0)     // Catch: java.lang.Throwable -> L31
        L31:
            if (r5 == 0) goto L66
            java.lang.String r0 = r6.mimeType
            X.HxE r0 = X.C3cG.A0r(r5, r0)
            r1.add(r0)
            goto L66
        L3d:
            X.Hwg.A00(r6)
            java.util.List<com.facebook.aura.nodes.cards.MessagingCardAttachment> r0 = r15.$attachments
            android.content.Context r8 = r15.$context
            X.CGz r11 = r15.$userSession
            java.util.ArrayList r1 = X.C3cG.A0h()
            java.util.Iterator r2 = r0.iterator()
            goto L66
        L4f:
            boolean r5 = r6 instanceof com.facebook.aura.gateway.HatchFileOperations.DownloadResult.Failed
            if (r5 == 0) goto La3
            java.lang.String r7 = r0.path
            com.facebook.aura.gateway.HatchFileOperations$DownloadResult$Failed r6 = (com.facebook.aura.gateway.HatchFileOperations.DownloadResult.Failed) r6
            java.lang.String r6 = r6.message
            java.lang.String r5 = "Failed to download attachment "
            java.lang.String r0 = ": "
            java.lang.String r5 = X.FGI.A0d(r5, r7, r0, r6)
            java.lang.String r0 = "HatchMessagingCard"
            X.CFK.A06(r0, r5)
        L66:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La2
            java.lang.Object r0 = r2.next()
            com.facebook.aura.nodes.cards.MessagingCardAttachment r0 = (com.facebook.aura.nodes.cards.MessagingCardAttachment) r0
            com.facebook.aura.gateway.HatchFileOperations r7 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            java.lang.String r9 = r0.path
            java.lang.String r10 = com.facebook.aura.nodes.cards.HatchMessagingCardKt.displayName(r0)
            r12 = 0
            r15.L$0 = r12
            r15.L$1 = r8
            r15.L$2 = r11
            r15.L$3 = r12
            r15.L$4 = r1
            r15.L$5 = r12
            r15.L$6 = r2
            r15.L$7 = r12
            r15.L$8 = r12
            r15.L$9 = r0
            r15.label = r3
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r6 = r7.downloadFileToCache(r8, r9, r10, r11, r12, r13, r15)
            if (r6 != r4) goto L22
            return r4
        L9d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        La2:
            return r1
        La3:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.cards.HatchMessagingCardKt$openMessagingWithAttachments$downloaded$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super List<? extends HxE<? extends Uri, String>>> htJ) {
        return ((HatchMessagingCardKt$openMessagingWithAttachments$downloaded$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
