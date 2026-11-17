package com.facebook.aura.conversation.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.ApprovalConversationIdentity;
import com.facebook.aura.gateway.ApprovalPresentation;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.HatchAgentPermissionsRepositoryKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$awaitingApproval$1", f = "HatchConversationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationViewModel$awaitingApproval$1 extends AbstractC07127nr implements G0W<List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval>, String, HtJ<? super Boolean>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ HatchConversationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationViewModel$awaitingApproval$1(HatchConversationViewModel hatchConversationViewModel, HtJ<? super HatchConversationViewModel$awaitingApproval$1> htJ) {
        super(3, htJ);
        this.this$0 = hatchConversationViewModel;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval> list, String str, HtJ<? super Boolean> htJ) {
        return invoke2((List<HatchAgentPermissionsRepository.AgentPermissionApproval>) list, str, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        String str = (String) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        String strResolveThreadId = ApprovalConversationIdentity.INSTANCE.resolveThreadId(this.this$0.sessionId, str);
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (HatchAgentPermissionsRepositoryKt.classifyApprovalPresentation((HatchAgentPermissionsRepository.AgentPermissionApproval) it.next(), strResolveThreadId) == ApprovalPresentation.BLOCKING) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, String str, HtJ<? super Boolean> htJ) {
        HatchConversationViewModel$awaitingApproval$1 hatchConversationViewModel$awaitingApproval$1 = new HatchConversationViewModel$awaitingApproval$1(this.this$0, htJ);
        hatchConversationViewModel$awaitingApproval$1.L$0 = list;
        hatchConversationViewModel$awaitingApproval$1.L$1 = str;
        return hatchConversationViewModel$awaitingApproval$1.invokeSuspend(Unit.INSTANCE);
    }
}
