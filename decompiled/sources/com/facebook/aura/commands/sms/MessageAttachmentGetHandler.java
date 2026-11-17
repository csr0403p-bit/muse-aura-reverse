package com.facebook.aura.commands.sms;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C2nw;
import X.C3UX;
import X.C60O;
import X.C7qW;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class MessageAttachmentGetHandler implements HatchNodeCommandHandler {
    public static final MessageAttachmentGetHandler INSTANCE = new MessageAttachmentGetHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.sms.MessageAttachmentGetHandler$execute$2", f = "MessageAttachmentGetHandler.kt", l = {82, 96, 100, 110, 119, 125, 132, 143}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.MessageAttachmentGetHandler$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NodeCommandResponse>, Object> {
        public final /* synthetic */ HatchNodeCommandContext $commandContext;
        public final /* synthetic */ NodeExecutionContext $ctx;
        public final /* synthetic */ String $paramsJson;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$commandContext = hatchNodeCommandContext;
            this.$paramsJson = str;
            this.$ctx = nodeExecutionContext;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$commandContext, this.$paramsJson, this.$ctx, this.$userSession, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0139 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x017b A[Catch: Exception -> 0x01cf, LOOP:2: B:60:0x0175->B:62:0x017b, LOOP_END, TryCatch #0 {Exception -> 0x01cf, blocks: (B:48:0x0123, B:59:0x0165, B:60:0x0175, B:62:0x017b, B:63:0x0185, B:68:0x01aa, B:71:0x01b2, B:58:0x0162, B:67:0x01a7), top: B:81:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01a2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01b0  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01cb  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 538
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.MessageAttachmentGetHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCommandResponse> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.sms.MessageAttachmentGetHandler", f = "MessageAttachmentGetHandler.kt", l = {156, 161}, m = "fetchOne", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.MessageAttachmentGetHandler$fetchOne$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageAttachmentGetHandler.this.fetchOne(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchOne(android.content.Context r14, java.lang.String r15, X.AbstractC3358CGz r16, X.HtJ<? super kotlinx.serialization.json.JsonObject> r17) throws java.lang.Throwable {
        /*
            r13 = this;
            r3 = r17
            r9 = r16
            r7 = r14
            boolean r0 = r3 instanceof com.facebook.aura.commands.sms.MessageAttachmentGetHandler.AnonymousClass1
            if (r0 == 0) goto L8a
            r12 = r3
            com.facebook.aura.commands.sms.MessageAttachmentGetHandler$fetchOne$1 r12 = (com.facebook.aura.commands.sms.MessageAttachmentGetHandler.AnonymousClass1) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8a
            int r2 = r2 - r1
            r12.label = r2
        L17:
            java.lang.Object r8 = r12.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L3a
            if (r0 == r4) goto L5a
            if (r0 != r5) goto L90
            java.lang.Object r0 = r12.L$1
            java.lang.String r15 = X.C3cG.A0d(r0, r8)
        L2b:
            com.facebook.aura.commands.sms.SmsMediaUploader$UploadOutcome r8 = (com.facebook.aura.commands.sms.SmsMediaUploader.UploadOutcome) r8
            boolean r0 = r8 instanceof com.facebook.aura.commands.sms.SmsMediaUploader.UploadOutcome.Uploaded
            if (r0 == 0) goto L98
            com.facebook.aura.commands.sms.SmsMediaUploader$UploadOutcome$Uploaded r8 = (com.facebook.aura.commands.sms.SmsMediaUploader.UploadOutcome.Uploaded) r8
            com.facebook.aura.commands.sms.SmsAttachment r0 = r8.attachment
            kotlinx.serialization.json.JsonObject r3 = r0.toJson()
            return r3
        L3a:
            X.Hwg.A00(r8)
            java.lang.Long r0 = com.facebook.aura.commands.sms.DeviceSmsReaderKt.partIdForAttachmentId(r15)
            if (r0 == 0) goto L95
            long r0 = r0.longValue()
            com.facebook.aura.commands.sms.DeviceSmsReader r2 = com.facebook.aura.commands.sms.DeviceSmsReader.INSTANCE
            r12.L$0 = r14
            r12.L$1 = r15
            r12.L$2 = r9
            r12.J$0 = r0
            r12.label = r4
            java.lang.Object r8 = r2.readAttachmentByPartId(r14, r0, r12)
            if (r8 != r3) goto L6a
            return r3
        L5a:
            long r0 = r12.J$0
            java.lang.Object r9 = r12.L$2
            X.CGz r9 = (X.AbstractC3358CGz) r9
            java.lang.Object r15 = r12.L$1
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r2 = r12.L$0
            android.content.Context r7 = X.C60P.A02(r2, r8)
        L6a:
            com.facebook.aura.commands.sms.SmsAttachment r8 = (com.facebook.aura.commands.sms.SmsAttachment) r8
            if (r8 != 0) goto L71
            java.lang.String r0 = "not_found"
            goto La0
        L71:
            com.facebook.aura.commands.sms.SmsMediaUploader r6 = com.facebook.aura.commands.sms.SmsMediaUploader.INSTANCE
            r2 = 0
            r12.L$0 = r2
            r12.L$1 = r15
            r12.L$2 = r2
            r12.L$3 = r2
            r12.J$0 = r0
            r12.label = r5
            r10 = 26214400(0x1900000, double:1.29516345E-316)
            java.lang.Object r8 = r6.upload(r7, r8, r9, r10, r12)
            if (r8 != r3) goto L2b
            return r3
        L8a:
            com.facebook.aura.commands.sms.MessageAttachmentGetHandler$fetchOne$1 r12 = new com.facebook.aura.commands.sms.MessageAttachmentGetHandler$fetchOne$1
            r12.<init>(r3)
            goto L17
        L90:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L95:
            java.lang.String r0 = "invalid_attachment_id"
            goto La0
        L98:
            boolean r0 = r8 instanceof com.facebook.aura.commands.sms.SmsMediaUploader.UploadOutcome.Skipped
            if (r0 == 0) goto La5
            com.facebook.aura.commands.sms.SmsMediaUploader$UploadOutcome$Skipped r8 = (com.facebook.aura.commands.sms.SmsMediaUploader.UploadOutcome.Skipped) r8
            java.lang.String r0 = r8.reason
        La0:
            kotlinx.serialization.json.JsonObject r3 = r13.failure(r15, r0)
            return r3
        La5:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.MessageAttachmentGetHandler.fetchOne(android.content.Context, java.lang.String, X.CGz, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.MESSAGE_ATTACHMENT_GET;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public HatchNodeCommandHandler getHandler() {
        return this;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean getOnlySendsCard() {
        return false;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandSpec getSpec() {
        return SmsCommandSpecs.MESSAGE_ATTACHMENT_GET;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ String validateParams(String str) {
        return null;
    }

    private final JsonObject failure(String str, String str2) {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("attachmentId", str, c2nwA1K);
        return C7qW.A01("error", str2, c2nwA1K);
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public Object execute(AbstractC3358CGz abstractC3358CGz, HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super NodeCommandResponse> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(hatchNodeCommandContext, str, nodeExecutionContext, abstractC3358CGz, null));
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ Object optionalDevicePermissions(String str, Context context, HtJ<? super List<String>> htJ) {
        return null;
    }
}
