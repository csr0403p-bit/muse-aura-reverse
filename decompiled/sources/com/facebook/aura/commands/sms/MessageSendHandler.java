package com.facebook.aura.commands.sms;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.C60O;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import android.content.Context;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.commands.sms.intf.MessageSendContributor;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class MessageSendHandler implements HatchNodeCommandHandler {
    public static final MessageSendHandler INSTANCE = new MessageSendHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.sms.MessageSendHandler$execute$2", f = "MessageSendHandler.kt", l = {91, 100, 105, 107, 120, 132, 154, 172, 174, 191}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.MessageSendHandler$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NodeCommandResponse>, Object> {
        public final /* synthetic */ HatchNodeCommandContext $commandContext;
        public final /* synthetic */ NodeExecutionContext $ctx;
        public final /* synthetic */ String $paramsJson;
        public int I$0;
        public /* synthetic */ Object L$0;
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
        public AnonymousClass2(HatchNodeCommandContext hatchNodeCommandContext, NodeExecutionContext nodeExecutionContext, String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$commandContext = hatchNodeCommandContext;
            this.$ctx = nodeExecutionContext;
            this.$paramsJson = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$commandContext, this.$ctx, this.$paramsJson, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:105:0x00e9, code lost:
        
            if (r6 != null) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
        
            if (X.C60Q.A0Y(r2, r3, "not_default_assistant", null, r22) == r4) goto L10;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01b4  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0245  */
        /* JADX WARN: Type inference failed for: r9v1, types: [int] */
        /* JADX WARN: Type inference failed for: r9v4, types: [int] */
        /* JADX WARN: Type inference failed for: r9v5, types: [boolean] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 782
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.MessageSendHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCommandResponse> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final List<MessageSendContributor> contributors() {
        return C60O.A11(0);
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandSpec getSpec() {
        ArrayList<MessageSendContributor> arrayListA11 = C60O.A11(0);
        NodeCommandSpec message_send = SmsCommandSpecs.INSTANCE.getMESSAGE_SEND();
        for (MessageSendContributor messageSendContributor : arrayListA11) {
            message_send = message_send.copy(FGI.A0U(message_send.description, InviteCodeScratcherKt.CODE_SEPARATOR, messageSendContributor.getDescriptionNote()), message_send.required, AGH.A02(message_send.optional, messageSendContributor.getOptionalArgs()), message_send.permissionRequired, message_send.datatype, FGI.A0U(message_send.resultDescription, InviteCodeScratcherKt.CODE_SEPARATOR, messageSendContributor.getResultDescriptionNote()), message_send.timeoutMs);
        }
        return message_send;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public String validateParams(String str) {
        Iterator it = C60O.A11(0).iterator();
        while (it.hasNext()) {
            String strValidateParams = ((MessageSendContributor) it.next()).validateParams(str);
            if (strValidateParams != null) {
                return strValidateParams;
            }
        }
        return null;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.MESSAGE_SEND;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public HatchNodeCommandHandler getHandler() {
        return this;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean getOnlySendsCard() {
        return false;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public Object execute(AbstractC3358CGz abstractC3358CGz, HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super NodeCommandResponse> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(hatchNodeCommandContext, nodeExecutionContext, str, null));
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ Object optionalDevicePermissions(String str, Context context, HtJ<? super List<String>> htJ) {
        return null;
    }
}
