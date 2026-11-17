package com.facebook.aura.skills.repo;

import X.AGH;
import X.AbstractC06907md;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.HxE;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.repo.TaskPermissionsRepository$fetchPermissions$2", f = "TaskPermissionsRepository.kt", l = {143}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class TaskPermissionsRepository$fetchPermissions$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends TaskPermissions>>, Object> {
    public final /* synthetic */ List<String> $connectorIds;
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
    public int label;
    public final /* synthetic */ TaskPermissionsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskPermissionsRepository$fetchPermissions$2(TaskPermissionsRepository taskPermissionsRepository, List<String> list, HtJ<? super TaskPermissionsRepository$fetchPermissions$2> htJ) {
        super(2, htJ);
        this.this$0 = taskPermissionsRepository;
        this.$connectorIds = list;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new TaskPermissionsRepository$fetchPermissions$2(this.this$0, this.$connectorIds, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            HatchHttpApi hatchHttpApiA06 = C60O.A06(obj);
            JarvisPath.TaskPermissions taskPermissions = new JarvisPath.TaskPermissions(this.this$0.taskId);
            RequestType requestType = RequestType.GET;
            AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
            HxE<String, ? extends Object>[] hxEArr = {C3cG.A0r("connectors", AbstractC06907md.A01(",", AbstractC0878AGe.A0W(AbstractC0878AGe.A0T(this.$connectorIds)), null))};
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jHA0E = AGH.A0E();
            TaskPermissionsRepository$fetchPermissions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 taskPermissionsRepository$fetchPermissions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = TaskPermissionsRepository$fetchPermissions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.I$0 = 1;
            this.I$1 = 1;
            this.I$2 = 0;
            this.label = 1;
            objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApiA06.m1595executeBodylessJarvisRequestWithp3iPjrY(taskPermissionsRepository$fetchPermissions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, taskPermissions, requestType, abstractC3358CGz, null, hxEArr, null, setA18, true, c9jHA0E, true, null, false, this);
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
        }
        TaskPermissionsRepository taskPermissionsRepository = this.this$0;
        if (!(objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud)) {
            try {
                objM1595executeBodylessJarvisRequestWithp3iPjrY = ((TaskPermissionsResponseJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).toDomain(taskPermissionsRepository.taskId);
            } catch (Throwable th) {
                objM1595executeBodylessJarvisRequestWithp3iPjrY = C3cG.A0s(th);
            }
        }
        return C3cG.A0t(objM1595executeBodylessJarvisRequestWithp3iPjrY);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<TaskPermissions>> htJ) {
        return ((TaskPermissionsRepository$fetchPermissions$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends TaskPermissions>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<TaskPermissions>>) htJ);
    }
}
