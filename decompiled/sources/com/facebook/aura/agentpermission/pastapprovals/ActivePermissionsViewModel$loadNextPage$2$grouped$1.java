package com.facebook.aura.agentpermission.pastapprovals;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10571Hud;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$loadNextPage$2$grouped$1", f = "ActivePermissionsViewModel.kt", l = {159}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class ActivePermissionsViewModel$loadNextPage$2$grouped$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ActivePermissionsGroupedPage>, Object> {
    public final /* synthetic */ String $groupCursor;
    public Object L$0;
    public int label;
    public final /* synthetic */ ActivePermissionsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivePermissionsViewModel$loadNextPage$2$grouped$1(String str, ActivePermissionsViewModel activePermissionsViewModel, HtJ<? super ActivePermissionsViewModel$loadNextPage$2$grouped$1> htJ) {
        super(2, htJ);
        this.$groupCursor = str;
        this.this$0 = activePermissionsViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ActivePermissionsViewModel$loadNextPage$2$grouped$1(this.$groupCursor, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM197getGroupedActivePermissions0E7RQCE;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            String str = this.$groupCursor;
            if (str != null) {
                ActivePermissionsRepository activePermissionsRepository = this.this$0.repository;
                this.L$0 = null;
                this.label = 1;
                objM197getGroupedActivePermissions0E7RQCE = activePermissionsRepository.m197getGroupedActivePermissions0E7RQCE(str, 20, this);
                if (objM197getGroupedActivePermissions0E7RQCE == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return null;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        objM197getGroupedActivePermissions0E7RQCE = AnonymousClass001.A0q(obj);
        if (objM197getGroupedActivePermissions0E7RQCE instanceof C10571Hud) {
            return null;
        }
        return objM197getGroupedActivePermissions0E7RQCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super ActivePermissionsGroupedPage> htJ) {
        return ((ActivePermissionsViewModel$loadNextPage$2$grouped$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
