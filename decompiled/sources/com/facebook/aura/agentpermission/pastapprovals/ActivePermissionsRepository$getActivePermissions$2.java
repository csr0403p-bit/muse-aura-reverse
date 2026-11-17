package com.facebook.aura.agentpermission.pastapprovals;

import X.AGH;
import X.AII;
import X.AIM;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7BY;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository$getActivePermissions$2", f = "ActivePermissionsRepository.kt", l = {150}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class ActivePermissionsRepository$getActivePermissions$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends ActivePermissionsPage>>, Object> {
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
    public final /* synthetic */ ActivePermissionsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivePermissionsRepository$getActivePermissions$2(ActivePermissionsRepository activePermissionsRepository, int i, String str, HtJ<? super ActivePermissionsRepository$getActivePermissions$2> htJ) {
        super(2, htJ);
        this.this$0 = activePermissionsRepository;
        this.$limit = i;
        this.$cursor = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ActivePermissionsRepository$getActivePermissions$2(this.this$0, this.$limit, this.$cursor, htJ);
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
            AnonymousClass002.A1J("lifetime", ActivePermissionsRepositoryKt.ACTIVE_PERMISSIONS_LIFETIMES, aiiA17);
            AnonymousClass002.A1J("target_type", "network", aiiA17);
            AnonymousClass002.A1J("kind", ActivePermissionsRepositoryKt.ACTIVE_PERMISSIONS_NETWORK_KINDS, aiiA17);
            if (str != null && !C7BY.A0j(str)) {
                AnonymousClass002.A1J("cursor", str, aiiA17);
            }
            HxE[] hxEArr = (HxE[]) AIM.A18(aiiA17).toArray(new HxE[0]);
            HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
            JarvisPath.PermissionsActive permissionsActive = JarvisPath.PermissionsActive.INSTANCE;
            RequestType requestType = RequestType.GET;
            AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
            HxE<String, ? extends Object>[] hxEArrA1a = C60O.A1a(hxEArr);
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jHA0E = AGH.A0E();
            ActivePermissionsRepository$getActivePermissions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 activePermissionsRepository$getActivePermissions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = ActivePermissionsRepository$getActivePermissions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
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
            objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(activePermissionsRepository$getActivePermissions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, permissionsActive, requestType, abstractC3358CGz, null, hxEArrA1a, null, setA18, true, c9jHA0E, true, null, false, this);
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
        }
        if (!(objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud)) {
            objM1595executeBodylessJarvisRequestWithp3iPjrY = ((ActivePermissionsPageJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).toApprovalsDomain();
        }
        return C3cG.A0t(objM1595executeBodylessJarvisRequestWithp3iPjrY);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<ActivePermissionsPage>> htJ) {
        return ((ActivePermissionsRepository$getActivePermissions$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends ActivePermissionsPage>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<ActivePermissionsPage>>) htJ);
    }
}
