package com.facebook.aura.agentpermission.pastapprovals;

import X.AGH;
import X.AbstractC07127nr;
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
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$revokePermission$2", f = "ActivePermissionsRepository.kt", l = {171}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class ActivePermissionsRepository$revokePermission$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends ActivePermissionsPage>>, Object> {
    public final /* synthetic */ ActivePermission $permission;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public int label;
    public final /* synthetic */ ActivePermissionsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivePermissionsRepository$revokePermission$2(ActivePermission activePermission, ActivePermissionsRepository activePermissionsRepository, HtJ<? super ActivePermissionsRepository$revokePermission$2> htJ) {
        super(2, htJ);
        this.$permission = activePermission;
        this.this$0 = activePermissionsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ActivePermissionsRepository$revokePermission$2(this.$permission, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1599executeJarvisRequestWithFof5HsY;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            HatchHttpApi hatchHttpApiA06 = C60O.A06(obj);
            JarvisPath.PermissionsRevoke permissionsRevoke = JarvisPath.PermissionsRevoke.INSTANCE;
            ActivePermission activePermission = this.$permission;
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jHA0E = AGH.A0E();
            ActivePermissionsRepository$revokePermission$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 activePermissionsRepository$revokePermission$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = ActivePermissionsRepository$revokePermission$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
            ActivePermissionsRepository$revokePermission$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 activePermissionsRepository$revokePermission$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = ActivePermissionsRepository$revokePermission$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
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
            this.I$3 = 1;
            this.I$4 = 0;
            this.I$5 = 0;
            this.I$6 = 0;
            this.label = 1;
            objM1599executeJarvisRequestWithFof5HsY = hatchHttpApiA06.m1599executeJarvisRequestWithFof5HsY(activePermissionsRepository$revokePermission$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, activePermissionsRepository$revokePermission$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, permissionsRevoke, new RevokeActivePermissionRequestJson(activePermission.permissionId, activePermission.kind.getWireValue(), "settings_permissions_revoke"), RequestType.POST, this.this$0.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
            if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
        }
        if (!(objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud)) {
            objM1599executeJarvisRequestWithFof5HsY = ((ActivePermissionsEnvelopeJson) objM1599executeJarvisRequestWithFof5HsY).activePermissions.toApprovalsDomain();
        }
        return C3cG.A0t(objM1599executeJarvisRequestWithFof5HsY);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<ActivePermissionsPage>> htJ) {
        return ((ActivePermissionsRepository$revokePermission$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends ActivePermissionsPage>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<ActivePermissionsPage>>) htJ);
    }
}
