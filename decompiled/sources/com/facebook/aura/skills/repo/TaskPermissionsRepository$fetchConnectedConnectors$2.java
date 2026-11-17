package com.facebook.aura.skills.repo;

import X.AHD;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.skills.model.Skill;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.repo.TaskPermissionsRepository$fetchConnectedConnectors$2", f = "TaskPermissionsRepository.kt", l = {64, 68}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class TaskPermissionsRepository$fetchConnectedConnectors$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends AHD<? extends Skill>>>, Object> {
    public int label;
    public final /* synthetic */ TaskPermissionsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskPermissionsRepository$fetchConnectedConnectors$2(TaskPermissionsRepository taskPermissionsRepository, HtJ<? super TaskPermissionsRepository$fetchConnectedConnectors$2> htJ) {
        super(2, htJ);
        this.this$0 = taskPermissionsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new TaskPermissionsRepository$fetchConnectedConnectors$2(this.this$0, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<? extends AHD<Skill>>> htJ) {
        return new TaskPermissionsRepository$fetchConnectedConnectors$2(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM2118fetchConnectedConnectorsIoAF18A;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchGatewayConnection companion = HatchGatewayConnection.Companion.getInstance(this.this$0.userSession);
            this.label = 1;
            obj = companion.awaitConnected(15000L, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                objM2118fetchConnectedConnectorsIoAF18A = AnonymousClass001.A0q(obj);
                return C3cG.A0t(objM2118fetchConnectedConnectorsIoAF18A);
            }
            Hwg.A00(obj);
        }
        if (AnonymousClass001.A1X(obj)) {
            HatchConnectorCatalogRepository companion2 = HatchConnectorCatalogRepository.Companion.getInstance(this.this$0.userSession);
            this.label = 2;
            objM2118fetchConnectedConnectorsIoAF18A = companion2.m2118fetchConnectedConnectorsIoAF18A(this);
            if (objM2118fetchConnectedConnectorsIoAF18A == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            objM2118fetchConnectedConnectorsIoAF18A = C3cG.A0s(C3cG.A0Q("Gateway unavailable"));
        }
        return C3cG.A0t(objM2118fetchConnectedConnectorsIoAF18A);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends AHD<? extends Skill>>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<? extends AHD<Skill>>>) htJ);
    }
}
