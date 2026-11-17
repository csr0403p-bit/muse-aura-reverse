package com.facebook.aura.assist;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.assist.AssistVoicePhotoSender$sendPhoto$sendJob$1", f = "AssistVoicePhotoSender.kt", l = {61, 63}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AssistVoicePhotoSender$sendPhoto$sendJob$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ long $callAttemptGeneration;
    public final /* synthetic */ File $photo;
    public final /* synthetic */ String $text;
    public final /* synthetic */ String $threadId;
    public Object L$0;
    public int label;
    public final /* synthetic */ AssistVoicePhotoSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistVoicePhotoSender$sendPhoto$sendJob$1(AssistVoicePhotoSender assistVoicePhotoSender, File file, String str, long j, String str2, HtJ<? super AssistVoicePhotoSender$sendPhoto$sendJob$1> htJ) {
        super(2, htJ);
        this.this$0 = assistVoicePhotoSender;
        this.$photo = file;
        this.$threadId = str;
        this.$callAttemptGeneration = j;
        this.$text = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AssistVoicePhotoSender$sendPhoto$sendJob$1(this.this$0, this.$photo, this.$threadId, this.$callAttemptGeneration, this.$text, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Exception {
        /*
            r7 = this;
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r7.label
            java.lang.String r5 = "AssistVoicePhotoSender"
            r3 = 2
            r6 = 1
            if (r0 == 0) goto Lf
            if (r0 == r6) goto L1f
            if (r0 != r3) goto L77
            goto L39
        Lf:
            X.Hwg.A00(r8)
            com.facebook.aura.assist.AssistVoicePhotoSender r1 = r7.this$0     // Catch: java.lang.Exception -> L5e
            java.io.File r0 = r7.$photo     // Catch: java.lang.Exception -> L5e
            r7.label = r6     // Catch: java.lang.Exception -> L5e
            java.lang.Object r8 = com.facebook.aura.assist.AssistVoicePhotoSender.access$uploadPhoto(r1, r0, r7)     // Catch: java.lang.Exception -> L5e
            if (r8 != r4) goto L22
            return r4
        L1f:
            X.Hwg.A00(r8)     // Catch: java.lang.Exception -> L5e
        L22:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L5e
            java.io.File r0 = r7.$photo     // Catch: java.lang.Exception -> L5e
            r0.delete()     // Catch: java.lang.Exception -> L5e
            com.facebook.aura.assist.AssistVoicePhotoSender r2 = r7.this$0     // Catch: java.lang.Exception -> L5e
            java.lang.String r1 = r7.$threadId     // Catch: java.lang.Exception -> L5e
            r0 = 0
            r7.L$0 = r0     // Catch: java.lang.Exception -> L5e
            r7.label = r3     // Catch: java.lang.Exception -> L5e
            java.lang.Object r0 = com.facebook.aura.assist.AssistVoicePhotoSender.access$sendUploadedPhoto(r2, r8, r1, r7)     // Catch: java.lang.Exception -> L5e
            if (r0 != r4) goto L3c
            return r4
        L39:
            X.Hwg.A00(r8)     // Catch: java.lang.Exception -> L5e
        L3c:
            com.facebook.aura.partners.voice.intf.Voice r0 = com.facebook.aura.partners.voice.intf.Voice.INSTANCE     // Catch: java.lang.Exception -> L5e
            com.facebook.aura.partners.voice.intf.VoiceIntegration r4 = r0.getIntegration()     // Catch: java.lang.Exception -> L5e
            if (r4 == 0) goto L5c
            com.facebook.aura.assist.AssistVoicePhotoSender r0 = r7.this$0     // Catch: java.lang.Exception -> L5e
            X.CGz r3 = r0.session     // Catch: java.lang.Exception -> L5e
            long r1 = r7.$callAttemptGeneration     // Catch: java.lang.Exception -> L5e
            java.lang.String r0 = r7.$text     // Catch: java.lang.Exception -> L5e
            boolean r0 = r4.sendInput(r3, r1, r0)     // Catch: java.lang.Exception -> L5e
            if (r0 != r6) goto L5c
        L52:
            java.lang.String r1 = "Photo delivered; voice SDK input accepted=%s"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Exception -> L5e
            X.CFK.A03(r0, r5, r1)     // Catch: java.lang.Exception -> L5e
            goto L74
        L5c:
            r6 = 0
            goto L52
        L5e:
            r1 = move-exception
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L67
            boolean r0 = r1 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r0 == 0) goto L7b
        L67:
            java.lang.String r0 = "Could not send camera photo"
            X.CFK.A08(r5, r0, r1)
            com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
            r0 = 2131888824(0x7f120ab8, float:1.9412294E38)
            r1.showToast(r0)
        L74:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L77:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        L7b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.AssistVoicePhotoSender$sendPhoto$sendJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AssistVoicePhotoSender$sendPhoto$sendJob$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
