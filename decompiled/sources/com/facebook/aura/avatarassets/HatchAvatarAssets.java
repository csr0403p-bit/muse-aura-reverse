package com.facebook.aura.avatarassets;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C10571Hud;
import X.C3UX;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.avatarassets.AvatarAssetsJarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public final class HatchAvatarAssets {
    public static final HatchAvatarAssets INSTANCE = new HatchAvatarAssets();

    @DebugMetadata(c = "com.facebook.aura.avatarassets.HatchAvatarAssets$fetch$2", f = "HatchAvatarAssets.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.avatarassets.HatchAvatarAssets$fetch$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AvatarAssetsJson>, Object> {
        public final /* synthetic */ String $gatewayUrl;
        public final /* synthetic */ AbstractC3358CGz $userSession;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC3358CGz abstractC3358CGz, String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$gatewayUrl = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$userSession, this.$gatewayUrl, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                String str = this.$gatewayUrl;
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchAvatarAssets$fetch$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchAvatarAssets$fetch$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchAvatarAssets$fetch$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
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
                objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(hatchAvatarAssets$fetch$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, AvatarAssetsJarvisPath.AvatarAssets.INSTANCE, RequestType.GET, this.$userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, str, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            Object obj2 = objM1595executeBodylessJarvisRequestWithp3iPjrY;
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud) {
                return null;
            }
            return obj2;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super AvatarAssetsJson> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object fetch(AbstractC3358CGz abstractC3358CGz, String str, HtJ<? super AvatarAssetsJson> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(abstractC3358CGz, str, null));
    }
}
