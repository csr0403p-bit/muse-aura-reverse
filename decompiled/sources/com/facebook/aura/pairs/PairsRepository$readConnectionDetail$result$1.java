package com.facebook.aura.pairs;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C9jH;
import X.C9sU;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import android.net.Uri;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.Arrays;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

@DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository$readConnectionDetail$result$1", f = "PairsRepository.kt", l = {1904}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PairsRepository$readConnectionDetail$result$1 extends AbstractC07127nr implements G0U<HtJ<? super ConnectionDetailJson>, Object> {
    public final /* synthetic */ String $connectionId;
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
    public Object L$12;
    public Object L$13;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public final /* synthetic */ PairsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsRepository$readConnectionDetail$result$1(PairsRepository pairsRepository, String str, HtJ<? super PairsRepository$readConnectionDetail$result$1> htJ) {
        super(1, htJ);
        this.this$0 = pairsRepository;
        this.$connectionId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new PairsRepository$readConnectionDetail$result$1(this.this$0, this.$connectionId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
        JsonElement jsonElementA12;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PairsRepository pairsRepository = this.this$0;
            PeersPath peersPath = new PeersPath(FGI.A0M("api/peers/connections/", Uri.encode(this.$connectionId)));
            RequestType requestType = RequestType.GET;
            HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = pairsRepository.userSession;
            HxE<String, ? extends Object>[] hxEArr = (HxE[]) Arrays.copyOf(new HxE[0], 0);
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jHA0E = AGH.A0E();
            PairsRepository$request$$inlined$executeJarvisRequest1iavgos$default$1 pairsRepository$request$$inlined$executeJarvisRequest1iavgos$default$1 = PairsRepository$request$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = pairsRepository;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.L$9 = null;
            this.L$10 = null;
            this.L$11 = null;
            this.L$12 = null;
            this.L$13 = null;
            this.I$0 = 0;
            this.I$1 = 1;
            this.I$2 = 0;
            this.label = 1;
            objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(pairsRepository$request$$inlined$executeJarvisRequest1iavgos$default$1, false, peersPath, requestType, abstractC3358CGz, null, hxEArr, null, setA18, false, c9jHA0E, true, null, false, this);
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
        }
        Throwable thA00 = HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
        if (thA00 != null) {
            throw C60Q.A0p(thA00);
        }
        JsonObject jsonObject = (JsonObject) objM1595executeBodylessJarvisRequestWithp3iPjrY;
        if (!C60P.A1Z(jsonObject) || (jsonElementA12 = C60Q.A12(jsonObject)) == null) {
            jsonElementA12 = jsonObject;
        }
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            int i2 = ConnectionDetailJson.$stable;
            return c9sU.A01(ConnectionDetailJson$$serializer.INSTANCE, jsonElementA12);
        } catch (IllegalArgumentException unused) {
            throw C60R.A0T();
        }
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super ConnectionDetailJson> htJ) {
        return ((PairsRepository$readConnectionDetail$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
