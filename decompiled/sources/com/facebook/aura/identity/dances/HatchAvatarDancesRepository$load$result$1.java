package com.facebook.aura.identity.dances;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C10571Hud;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.sharesheet.HatchShareLoggingKt;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.identity.dances.HatchAvatarDancesRepository$load$result$1", f = "HatchAvatarDancesRepository.kt", l = {74}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchAvatarDancesRepository$load$result$1 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
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
    public final /* synthetic */ HatchAvatarDancesRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarDancesRepository$load$result$1(HatchAvatarDancesRepository hatchAvatarDancesRepository, HtJ<? super HatchAvatarDancesRepository$load$result$1> htJ) {
        super(1, htJ);
        this.this$0 = hatchAvatarDancesRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchAvatarDancesRepository$load$result$1(this.this$0, htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Boolean> htJ) {
        return new HatchAvatarDancesRepository$load$result$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
            JarvisPath.AvatarVideos avatarVideos = JarvisPath.AvatarVideos.INSTANCE;
            RequestType requestType = RequestType.GET;
            AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
            HxE<String, ? extends Object>[] hxEArr = {new HxE("kind", HatchShareLoggingKt.AVATAR_DANCE_CONTENT_TYPE)};
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jHA0E = AGH.A0E();
            HatchAvatarDancesRepository$load$result$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchAvatarDancesRepository$load$result$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchAvatarDancesRepository$load$result$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
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
            objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(hatchAvatarDancesRepository$load$result$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, avatarVideos, requestType, abstractC3358CGz, null, hxEArr, null, setA18, true, c9jHA0E, true, null, false, this);
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
        }
        HatchAvatarDancesRepository hatchAvatarDancesRepository = this.this$0;
        boolean z = !(objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud);
        if (z) {
            hatchAvatarDancesRepository._dances.Af8(HatchAvatarDancesRepositoryJsonKt.toAvatarDances((List) objM1595executeBodylessJarvisRequestWithp3iPjrY));
        }
        Throwable thA00 = HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
        if (thA00 != null) {
            CFK.A06(HatchAvatarDancesRepositoryKt.TAG, FGI.A0M("Failed to load avatar dances: ", thA00.getMessage()));
        }
        return Boolean.valueOf(z);
    }
}
