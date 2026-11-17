package com.facebook.aura.network.acs;

import X.A7u;
import X.A8B;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C78W;
import X.C9be;
import X.C9bf;
import X.C9bh;
import X.C9hr;
import X.C9jH;
import X.EnumC10460Hji;
import X.F0C;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.InterfaceC07659bc;
import android.util.Base64;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.google.common.collect.ImmutableList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class HatchAcsTokenFetcher extends C9bf<AcsEvaluationJson, AcsProofJson> {
    public final boolean requestProof;
    public final C3UX scope = C78W.A03();

    @DebugMetadata(c = "com.facebook.aura.network.acs.HatchAcsTokenFetcher$fetchACSTokensFromServer$1", f = "HatchAcsTokenFetcher.kt", l = {72}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.network.acs.HatchAcsTokenFetcher$fetchACSTokensFromServer$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ InterfaceC07659bc<AcsEvaluationJson, AcsProofJson> $callback;
        public final /* synthetic */ A7u $config;
        public final /* synthetic */ ImmutableList<String> $issueDataList;
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public final /* synthetic */ HatchAcsTokenFetcher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ImmutableList<String> immutableList, A7u a7u, HatchAcsTokenFetcher hatchAcsTokenFetcher, InterfaceC07659bc<AcsEvaluationJson, AcsProofJson> interfaceC07659bc, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$issueDataList = immutableList;
            this.$config = a7u;
            this.this$0 = hatchAcsTokenFetcher;
            this.$callback = interfaceC07659bc;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$issueDataList, this.$config, this.this$0, this.$callback, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objM1604executeStefiRequestWithjLovISM;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(obj);
                StefiHatchPath.IssueAcsToken issueAcsToken = StefiHatchPath.IssueAcsToken.INSTANCE;
                F0C<C9hr<Object>>[] f0cArr = IssueAcsTokenRequestJson.$childSerializers;
                List listA0X = AbstractC0878AGe.A0X(this.$issueDataList);
                String str = this.$config.A05;
                C7384Etj.A0U(str);
                IssueAcsTokenRequestJson issueAcsTokenRequestJson = new IssueAcsTokenRequestJson(listA0X, str, this.this$0.requestProof);
                RequestType requestType = RequestType.POST;
                C9jH c9jH = C9jH.A00;
                HatchAcsTokenFetcher$fetchACSTokensFromServer$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 hatchAcsTokenFetcher$fetchACSTokensFromServer$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 = HatchAcsTokenFetcher$fetchACSTokensFromServer$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE;
                HatchAcsTokenFetcher$fetchACSTokensFromServer$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 hatchAcsTokenFetcher$fetchACSTokensFromServer$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 = HatchAcsTokenFetcher$fetchACSTokensFromServer$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = 1;
                this.I$1 = 0;
                this.label = 1;
                objM1604executeStefiRequestWithjLovISM = hatchHttpApiA06.m1604executeStefiRequestWithjLovISM(hatchAcsTokenFetcher$fetchACSTokensFromServer$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1, hatchAcsTokenFetcher$fetchACSTokensFromServer$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2, false, issueAcsToken, issueAcsTokenRequestJson, requestType, c9jH, true, null, false, null, this);
                if (objM1604executeStefiRequestWithjLovISM == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1604executeStefiRequestWithjLovISM = AnonymousClass001.A0q(obj);
            }
            InterfaceC07659bc<AcsEvaluationJson, AcsProofJson> interfaceC07659bc = this.$callback;
            Throwable thA00 = HsJ.A00(objM1604executeStefiRequestWithjLovISM);
            if (thA00 == null) {
                IssueAcsTokenResponseJson issueAcsTokenResponseJson = (IssueAcsTokenResponseJson) objM1604executeStefiRequestWithjLovISM;
                List<AcsEvaluationJson> list = issueAcsTokenResponseJson.evaluation;
                List<AcsProofJson> list2 = issueAcsTokenResponseJson.proof;
                C9be c9be = (C9be) interfaceC07659bc;
                C7384Etj.A0Y(list, 0);
                C7384Etj.A0Y(list2, 1);
                byte[][] bArr = new byte[list.size()][];
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AcsEvaluationJson acsEvaluationJson = list.get(i2);
                    C7384Etj.A0Y(acsEvaluationJson, 0);
                    String str2 = acsEvaluationJson.data;
                    if (str2 != null) {
                        try {
                            String string = new JSONObject(str2).getString("evaluation_data");
                            C7384Etj.A0U(string);
                            bArr[i2] = Base64.decode(C3cG.A1S(string), 8);
                        } catch (JSONException unused) {
                            bArr[i2] = Base64.decode(C3cG.A1S(str2), 8);
                        }
                    }
                }
                if (c9be.A03 && c9be.A02) {
                    c9be.A01.handleBatchedProofCredentials(list2, bArr, c9be.A00);
                } else if (c9be.A02) {
                    c9be.A01.handlePerTokenProofCredentials(list2, bArr, c9be.A00);
                } else {
                    c9be.A00.AWO(new C9bh[0], bArr);
                }
            } else {
                ((A8B) ((C9be) interfaceC07659bc).A00).A00.A02.onFailure(thA00);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // X.C9bf
    public void fetchACSTokensFromServer(A7u a7u, ImmutableList<String> immutableList, InterfaceC07659bc<AcsEvaluationJson, AcsProofJson> interfaceC07659bc) {
        AnonymousClass005.A0x(a7u, immutableList, interfaceC07659bc);
        AnonymousClass001.A1J(new AnonymousClass1(immutableList, a7u, this, interfaceC07659bc, null), this.scope);
    }

    @Override // X.C9bf
    public String getCFromProof(AcsProofJson acsProofJson) {
        C7384Etj.A0Y(acsProofJson, 0);
        String str = acsProofJson.c;
        if (HatchAcsTokenFetcherKt.isBase64Url(str)) {
            return str;
        }
        return null;
    }

    @Override // X.C9bf
    public String getSFromProof(AcsProofJson acsProofJson) {
        C7384Etj.A0Y(acsProofJson, 0);
        String str = acsProofJson.s;
        if (HatchAcsTokenFetcherKt.isBase64Url(str)) {
            return str;
        }
        return null;
    }

    @Override // X.C9bf
    public /* bridge */ /* synthetic */ String getDataFromEvaluation(Object obj) {
        AcsEvaluationJson acsEvaluationJson = (AcsEvaluationJson) obj;
        C7384Etj.A0Y(acsEvaluationJson, 0);
        return acsEvaluationJson.data;
    }

    public HatchAcsTokenFetcher(boolean z) {
        this.requestProof = z;
    }

    public String getDataFromEvaluation(AcsEvaluationJson acsEvaluationJson) {
        C7384Etj.A0Y(acsEvaluationJson, 0);
        return acsEvaluationJson.data;
    }
}
