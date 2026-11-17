package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C07C;
import X.G0V;
import X.G0W;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class ApprovalCardScaffoldKt {

    /* renamed from: com.facebook.aura.agentpermission.ApprovalCardScaffoldKt$ApprovalCardScaffold$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ApprovalCardActionsStyle $actionsStyle;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $body;
        public final /* synthetic */ List<AgentPermissionDecisionOption> $decisionOptions;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $header;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $legal;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RichApprovalSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<AgentPermissionDecisionOption> list, RichApprovalSurface richApprovalSurface, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, BRg bRg, ApprovalCardActionsStyle approvalCardActionsStyle, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w2, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w3, int i, int i2) {
            super(2);
            this.$decisionOptions = list;
            this.$surface = richApprovalSurface;
            this.$header = g0w;
            this.$modifier = bRg;
            this.$actionsStyle = approvalCardActionsStyle;
            this.$legal = g0w2;
            this.$body = g0w3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ApprovalCardScaffoldKt.ApprovalCardScaffold(this.$decisionOptions, this.$surface, this.$header, this.$modifier, this.$actionsStyle, this.$legal, this.$body, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApprovalCardActionsStyle.values().length];
            try {
                AnonymousClass002.A13(ApprovalCardActionsStyle.CHECKOUT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ApprovalCardActionsStyle.PERMISSION, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ApprovalCardScaffold(java.util.List<com.facebook.aura.gateway.AgentPermissionDecisionOption> r23, com.facebook.aura.agentpermission.RichApprovalSurface r24, X.G0W<? super X.C07C, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r25, X.BRg r26, com.facebook.aura.agentpermission.ApprovalCardActionsStyle r27, X.G0W<? super X.C07C, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r28, X.G0W<? super X.C07C, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r29, X.BFM r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.ApprovalCardScaffoldKt.ApprovalCardScaffold(java.util.List, com.facebook.aura.agentpermission.RichApprovalSurface, X.G0W, X.BRg, com.facebook.aura.agentpermission.ApprovalCardActionsStyle, X.G0W, X.G0W, X.BFM, int, int):void");
    }
}
