package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.conversation.api.ConversationCardRequest;
import com.facebook.aura.conversation.widget.api.ConversationCardControls;
import com.facebook.aura.conversation.widget.api.ConversationCardRenderer;
import com.facebook.aura.navigation.key.DevicePermissionRowId;
import com.facebook.aura.nodes.core.NodePermissionCardRequest;
import com.facebook.aura.nudge.ConversationCardKt;
import com.facebook.aura.nudge.NudgeContent;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class NodePermissionCardRenderer implements ConversationCardRenderer {
    public static final NodePermissionCardRenderer INSTANCE = new NodePermissionCardRenderer();

    /* renamed from: com.facebook.aura.nodes.cards.NodePermissionCardRenderer$Render$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ConversationCardControls $controls;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConversationCardRequest $request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConversationCardRequest conversationCardRequest, ConversationCardControls conversationCardControls, BRg bRg, int i) {
            super(2);
            this.$request = conversationCardRequest;
            this.$controls = conversationCardControls;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NodePermissionCardRenderer.this.Render(this.$request, this.$controls, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationCardRenderer
    public void Render(ConversationCardRequest conversationCardRequest, ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass1;
        G0V<? super BFM, ? super Integer, Unit> nodePermissionCardRenderer$Render$permissionRequest$1;
        NodePermissionCardRequest nodePermissionCardRequest;
        NudgeContent nudgeContentNodePermissionCardContent;
        AnonymousClass005.A10(conversationCardRequest, conversationCardControls, bRg);
        bfm.AgG(-759416438);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(conversationCardRequest, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(conversationCardControls, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            bfm.Afo();
        } else {
            if (!(conversationCardRequest instanceof NodePermissionCardRequest) || (nodePermissionCardRequest = (NodePermissionCardRequest) conversationCardRequest) == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    nodePermissionCardRenderer$Render$permissionRequest$1 = new NodePermissionCardRenderer$Render$permissionRequest$1(this, conversationCardRequest, conversationCardControls, bRg, i);
                    bBbAAc.A06 = nodePermissionCardRenderer$Render$permissionRequest$1;
                }
                return;
            }
            DevicePermissionRowId devicePermissionRowIdFromWire = DevicePermissionRowId.Companion.fromWire(nodePermissionCardRequest.rowId);
            if (devicePermissionRowIdFromWire == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass1 = new NodePermissionCardRenderer$Render$rowId$1(this, conversationCardRequest, conversationCardControls, bRg, i);
                    nodePermissionCardRenderer$Render$permissionRequest$1 = anonymousClass1;
                    bBbAAc.A06 = nodePermissionCardRenderer$Render$permissionRequest$1;
                }
                return;
            }
            if (nodePermissionCardRequest.tokens.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                bfm.AgE(2113025435);
                nudgeContentNodePermissionCardContent = NodePermissionCardRendererKt.backgroundLocationCardContent(bfm, 0);
            } else {
                bfm.AgE(2113091930);
                nudgeContentNodePermissionCardContent = NodePermissionCardRendererKt.nodePermissionCardContent(devicePermissionRowIdFromWire, bfm, 0);
            }
            AnonymousClass001.A1D(bfm);
            ConversationCardKt.ConversationCard(nudgeContentNodePermissionCardContent, conversationCardControls, bRg, bfm, AnonymousClass002.A07(iA05, NudgeContent.$stable | (ConversationCardControls.$stable << 3)), 0);
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass1 = new AnonymousClass1(conversationCardRequest, conversationCardControls, bRg, i);
            nodePermissionCardRenderer$Render$permissionRequest$1 = anonymousClass1;
            bBbAAc.A06 = nodePermissionCardRenderer$Render$permissionRequest$1;
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationCardRenderer
    public boolean canRender(ConversationCardRequest conversationCardRequest) {
        C7384Etj.A0Y(conversationCardRequest, 0);
        return (conversationCardRequest instanceof NodePermissionCardRequest) && DevicePermissionRowId.Companion.fromWire(((NodePermissionCardRequest) conversationCardRequest).rowId) != null;
    }
}
