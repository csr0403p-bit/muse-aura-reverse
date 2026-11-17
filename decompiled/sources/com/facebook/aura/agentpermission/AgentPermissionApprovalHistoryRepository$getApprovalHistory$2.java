package com.facebook.aura.agentpermission;

import X.AGH;
import X.AII;
import X.AIM;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C3UX;
import X.C3cG;
import X.C7BY;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.agentpermission.AgentPermissionJarvisPath;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.Arrays;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionApprovalHistoryRepository$getApprovalHistory$2", f = "AgentPermissionApprovalHistoryRepository.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AgentPermissionApprovalHistoryRepository$getApprovalHistory$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends ApprovalHistoryPage>>, Object> {
    public final /* synthetic */ String $cursor;
    public final /* synthetic */ int $limit;
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public int label;
    public final /* synthetic */ AgentPermissionApprovalHistoryRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionApprovalHistoryRepository$getApprovalHistory$2(AgentPermissionApprovalHistoryRepository agentPermissionApprovalHistoryRepository, int i, String str, HtJ<? super AgentPermissionApprovalHistoryRepository$getApprovalHistory$2> htJ) {
        super(2, htJ);
        this.this$0 = agentPermissionApprovalHistoryRepository;
        this.$limit = i;
        this.$cursor = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AgentPermissionApprovalHistoryRepository$getApprovalHistory$2(this.this$0, this.$limit, this.$cursor, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends ApprovalHistoryPage>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<ApprovalHistoryPage>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            int i2 = this.$limit;
            String str = this.$cursor;
            AII aiiA17 = AIM.A17();
            AnonymousClass002.A1J(PhotosSearchHandlerKt.PARAM_LIMIT, C3cG.A0R(i2), aiiA17);
            AnonymousClass002.A1J("record_schema", AgentPermissionApprovalHistoryRepositoryKt.SNAPSHOT_HISTORY_SCHEMA, aiiA17);
            if (str != null && !C7BY.A0j(str)) {
                AnonymousClass002.A1J("cursor", str, aiiA17);
            }
            HxE[] hxEArr = (HxE[]) AIM.A18(aiiA17).toArray(new HxE[0]);
            HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
            AgentPermissionJarvisPath.ApprovalsHistory approvalsHistory = AgentPermissionJarvisPath.ApprovalsHistory.INSTANCE;
            RequestType requestType = RequestType.GET;
            AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
            HxE<String, ? extends Object>[] hxEArr2 = (HxE[]) Arrays.copyOf(hxEArr, hxEArr.length);
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jHA0E = AGH.A0E();
            AgentPermissionApprovalHistoryRepository$getApprovalHistory$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 agentPermissionApprovalHistoryRepository$getApprovalHistory$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = AgentPermissionApprovalHistoryRepository$getApprovalHistory$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.I$0 = 1;
            this.I$1 = 1;
            this.I$2 = 0;
            this.label = 1;
            objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(agentPermissionApprovalHistoryRepository$getApprovalHistory$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, approvalsHistory, requestType, abstractC3358CGz, null, hxEArr2, null, setA18, true, c9jHA0E, true, null, false, this);
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
        }
        return C3cG.A0t(objM1595executeBodylessJarvisRequestWithp3iPjrY);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<ApprovalHistoryPage>> htJ) {
        return ((AgentPermissionApprovalHistoryRepository$getApprovalHistory$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
