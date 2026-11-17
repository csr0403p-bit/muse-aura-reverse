package com.facebook.aura.commands.phone;

import X.AGH;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C2nw;
import X.C60O;
import X.C7384Etj;
import X.C7qW;
import X.G0U;
import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.commands.phone.api.HatchCallCard;
import com.facebook.aura.commands.phone.api.HatchCallCards;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.nodes.core.NodeCardEnvelopeKt;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeErrorsKt;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class PhoneCallHandler implements HatchNodeCommandHandler {
    public static final PhoneCallHandler INSTANCE = new PhoneCallHandler();

    /* renamed from: com.facebook.aura.commands.phone.PhoneCallHandler$dialerCardEnvelope$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
        public final /* synthetic */ String $contactName;
        public final /* synthetic */ String $phoneNumber;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2nw c2nw) {
            C7384Etj.A0Y(c2nw, 0);
            C7qW.A06("phone_number", this.$phoneNumber, c2nw);
            String str = this.$contactName;
            if (str != null) {
                C7qW.A06("contact_name", str, c2nw);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2) {
            super(1);
            this.$phoneNumber = str;
            this.$contactName = str2;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
            invoke2(c2nw);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.phone.PhoneCallHandler", f = "PhoneCallHandler.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE, 117, 122, 137, VoiceCallForegroundService.AVATAR_TARGET_PX}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.commands.phone.PhoneCallHandler$execute$1, reason: invalid class name and case insensitive filesystem */
    public final class C111301 extends HzP {
        public int I$0;
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
        public /* synthetic */ Object result;

        public C111301(HtJ<? super C111301> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PhoneCallHandler.this.execute(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.phone.PhoneCallHandler", f = "PhoneCallHandler.kt", l = {217}, m = "postCallNotification", v = 2)
    /* renamed from: com.facebook.aura.commands.phone.PhoneCallHandler$postCallNotification$1, reason: invalid class name and case insensitive filesystem */
    public final class C111311 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C111311(HtJ<? super C111311> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PhoneCallHandler.this.postCallNotification(null, null, null, null, this);
        }
    }

    private final JsonObject buildErrorWire(String str, String str2) {
        return NodeErrorsKt.nodeError(str, str2, AGH.A0E(), null);
    }

    private final String dialerCardEnvelope(String str, String str2, String str3) {
        return NodeCardEnvelopeKt.nodeCardEnvelope(HatchNodeCardJsonKt.TYPE_CALLING, NodeCardEnvelopeKt.NODE_CARD_CLIENTS_ANDROID_ONLY, NodeCardEnvelopeKt.nodeCardDeviceActionFallback(str3, "place this call"), null, new AnonymousClass1(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object postCallNotification(android.content.Context r13, java.lang.String r14, java.lang.String r15, com.facebook.aura.nodes.core.NodeExecutionContext r16, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.phone.PhoneCallHandler.postCallNotification(android.content.Context, java.lang.String, java.lang.String, com.facebook.aura.nodes.core.NodeExecutionContext, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x012e, code lost:
    
        if (com.facebook.aura.nodes.core.NodeExecutionKt.sendCard(r14, r4, r1, r15) == r2) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r11, com.facebook.aura.nodes.registry.HatchNodeCommandContext r12, java.lang.String r13, com.facebook.aura.nodes.core.NodeExecutionContext r14, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r15) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.phone.PhoneCallHandler.execute(X.CGz, com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, com.facebook.aura.nodes.core.NodeExecutionContext, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.PHONE_CALL;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public HatchNodeCommandHandler getHandler() {
        return this;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public boolean getOnlySendsCard() {
        return AnonymousClass002.A1X(HatchCallCards.bound$delegate.getValue());
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandSpec getSpec() {
        HatchCallCard hatchCallCard = (HatchCallCard) HatchCallCards.bound$delegate.getValue();
        if (hatchCallCard != null) {
            NodeCommandSpec nodeCommandSpec = PhoneCommandSpecs.PHONE_CALL;
            NodeCommandSpec nodeCommandSpecCopy = nodeCommandSpec.copy(hatchCallCard.getCommandDescription(), nodeCommandSpec.required, nodeCommandSpec.optional, nodeCommandSpec.permissionRequired, nodeCommandSpec.datatype, nodeCommandSpec.resultDescription, nodeCommandSpec.timeoutMs);
            if (nodeCommandSpecCopy != null) {
                return nodeCommandSpecCopy;
            }
        }
        return PhoneCommandSpecs.PHONE_CALL;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ String validateParams(String str) {
        return null;
    }

    private final JsonObject buildOkWire(String str) {
        C2nw c2nwA1K = C60O.A1K();
        Boolean boolA0i = AnonymousClass001.A0i();
        C7qW.A04(boolA0i, PairsInviteMailboxKt.OUTCOME_OK, c2nwA1K);
        JsonObject jsonObjectA01 = C7qW.A01(ReplyAttributionSerializer.TYPE_MESSAGE, str, c2nwA1K);
        C2nw c2nwA1K2 = C60O.A1K();
        C7qW.A04(boolA0i, PairsInviteMailboxKt.OUTCOME_OK, c2nwA1K2);
        return C7qW.A01("payload_json", jsonObjectA01.toString(), c2nwA1K2);
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ Object optionalDevicePermissions(String str, Context context, HtJ<? super List<String>> htJ) {
        return null;
    }
}
