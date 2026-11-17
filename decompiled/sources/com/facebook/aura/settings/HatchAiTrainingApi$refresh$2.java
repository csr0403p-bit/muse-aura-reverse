package com.facebook.aura.settings;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C10571Hud;
import X.C3UX;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchAiTrainingApi$refresh$2", f = "HatchAiTrainingApi.kt", l = {99}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchAiTrainingApi$refresh$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchAiTrainingSetting>>, Object> {
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
    public final /* synthetic */ HatchAiTrainingApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAiTrainingApi$refresh$2(HatchAiTrainingApi hatchAiTrainingApi, HtJ<? super HatchAiTrainingApi$refresh$2> htJ) {
        super(2, htJ);
        this.this$0 = hatchAiTrainingApi;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAiTrainingApi$refresh$2(this.this$0, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends HatchAiTrainingSetting>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<HatchAiTrainingSetting>>) htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jHA0E = AGH.A0E();
            HatchAiTrainingApi$refresh$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchAiTrainingApi$refresh$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchAiTrainingApi$refresh$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
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
            objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(hatchAiTrainingApi$refresh$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, JarvisPath.ProductImprovements.INSTANCE, RequestType.GET, this.this$0.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
        }
        HatchAiTrainingApi hatchAiTrainingApi = this.this$0;
        if (!(objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud)) {
            objM1595executeBodylessJarvisRequestWithp3iPjrY = ((ProductImprovementsResponseJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).toDomain();
            hatchAiTrainingApi._setting.Af8(objM1595executeBodylessJarvisRequestWithp3iPjrY);
        }
        HatchAiTrainingApi hatchAiTrainingApi2 = this.this$0;
        if (HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY) != null) {
            hatchAiTrainingApi2._setting.A6e(null, HatchAiTrainingApi.DEFAULT_SETTING);
        }
        return new HsJ(objM1595executeBodylessJarvisRequestWithp3iPjrY);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchAiTrainingSetting>> htJ) {
        return new HatchAiTrainingApi$refresh$2(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
