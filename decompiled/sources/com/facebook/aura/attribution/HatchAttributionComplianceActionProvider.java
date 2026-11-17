package com.facebook.aura.attribution;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C06H;
import X.C3UX;
import X.C7384Etj;
import X.C78T;
import X.C9jH;
import X.CFK;
import X.CZ9;
import X.CZF;
import X.CZI;
import X.CZN;
import X.CZP;
import X.CZW;
import X.EnumC10460Hji;
import X.EnumC2376BWl;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.attribution.AttributionStefiPath;
import com.facebook.aura.localbrowser.LocalBrowserNodeHandler;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class HatchAttributionComplianceActionProvider {
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchAttributionCompliance";
    public final G0U<Boolean, Unit> onSettled;
    public final C3UX scope;

    @DebugMetadata(c = "com.facebook.aura.attribution.HatchAttributionComplianceActionProvider$getEventComplianceAction$1", f = "HatchAttributionComplianceActionProvider.kt", l = {73}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.attribution.HatchAttributionComplianceActionProvider$getEventComplianceAction$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ CZW $callback;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CZW czw, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$callback = czw;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAttributionComplianceActionProvider.this.new AnonymousClass1(this.$callback, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objM1596executeBodylessStefiRequestWithtZkwj4A;
            CZI czi;
            String strA00;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                AttributionStefiPath.AttributionComplianceAction attributionComplianceAction = AttributionStefiPath.AttributionComplianceAction.INSTANCE;
                RequestType requestType = RequestType.GET;
                C9jH c9jHA0E = AGH.A0E();
                HatchAttributionComplianceActionProvider$getEventComplianceAction$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 hatchAttributionComplianceActionProvider$getEventComplianceAction$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 = HatchAttributionComplianceActionProvider$getEventComplianceAction$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                objM1596executeBodylessStefiRequestWithtZkwj4A = hatchHttpApi.m1596executeBodylessStefiRequestWithtZkwj4A(hatchAttributionComplianceActionProvider$getEventComplianceAction$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1, false, attributionComplianceAction, requestType, null, null, c9jHA0E, c9jHA0E, this);
                if (objM1596executeBodylessStefiRequestWithtZkwj4A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1596executeBodylessStefiRequestWithtZkwj4A = AnonymousClass001.A0q(obj);
            }
            HatchAttributionComplianceActionProvider hatchAttributionComplianceActionProvider = HatchAttributionComplianceActionProvider.this;
            CZW czw = this.$callback;
            Throwable thA00 = HsJ.A00(objM1596executeBodylessStefiRequestWithtZkwj4A);
            if (thA00 == null) {
                AttributionComplianceActionResponseJson attributionComplianceActionResponseJson = (AttributionComplianceActionResponseJson) objM1596executeBodylessStefiRequestWithtZkwj4A;
                String str = attributionComplianceActionResponseJson.action;
                EnumC2376BWl complianceAction = hatchAttributionComplianceActionProvider.toComplianceAction(str);
                if (complianceAction == null) {
                    CFK.A0F(HatchAttributionComplianceActionProvider.TAG, "Unsupported compliance action: %s", str);
                    AnonymousClass001.A1K(false, hatchAttributionComplianceActionProvider.onSettled);
                    String strA0M = FGI.A0M("Unsupported compliance action: ", attributionComplianceActionResponseJson.action);
                    CZP czp = (CZP) czw;
                    czi = czp.A01.A04;
                    if (czi != null) {
                        strA00 = CZI.A00("get_compliance_action_failure", strA0M, null, czp.A00);
                        CZI.A01(strA00, "error", czi);
                    }
                } else {
                    CFK.A03(complianceAction.name(), HatchAttributionComplianceActionProvider.TAG, "Compliance action: %s");
                    if (complianceAction == EnumC2376BWl.A03) {
                        AnonymousClass001.A1K(false, hatchAttributionComplianceActionProvider.onSettled);
                    }
                    CZP czp2 = (CZP) czw;
                    CZF czf = czp2.A01;
                    CZI czi2 = czf.A04;
                    if (czi2 != null) {
                        String string = complianceAction.toString();
                        List<CZ9> list = czp2.A00;
                        C7384Etj.A0Y(string, 1);
                        CZI.A01(CZI.A00("get_compliance_action_success", string, null, list), "info", czi2);
                    }
                    if (complianceAction == EnumC2376BWl.A04) {
                        List<CZ9> list2 = czp2.A00;
                        czf.A02.send(list2, czf.A01.adid, false, null, null, new CZN(list2, czf));
                    } else if (complianceAction == EnumC2376BWl.A02) {
                        List<CZ9> list3 = czp2.A00;
                        if (czi2 != null) {
                            CZI.A01(CZI.A00("buffer_events", "server_side", null, list3), "info", czi2);
                        }
                        czf.A02.send(list3, null, true, null, null, new CZN(list3, czf));
                    }
                }
            } else {
                AnonymousClass001.A1K(false, hatchAttributionComplianceActionProvider.onSettled);
                HatchAttributionEventsClientKt.logAttributionFailure(AttributionStefiPath.AttributionComplianceAction.INSTANCE.getValue(), thA00);
                String strAttributionFailureMessage = HatchAttributionEventsClientKt.attributionFailureMessage(thA00);
                CZP czp3 = (CZP) czw;
                C7384Etj.A0Y(strAttributionFailureMessage, 0);
                czi = czp3.A01.A04;
                if (czi != null) {
                    strA00 = CZI.A00("get_compliance_action_failure", strAttributionFailureMessage, thA00, czp3.A00);
                    CZI.A01(strA00, "error", czi);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchAttributionComplianceActionProvider(G0U<? super Boolean, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.onSettled = g0u;
        this.scope = C78T.A00();
    }

    public void getEventComplianceAction(CZW czw) {
        C7384Etj.A0Y(czw, 0);
        AnonymousClass001.A1J(new AnonymousClass1(czw, null), this.scope);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnumC2376BWl toComplianceAction(String str) {
        String strA0u = AnonymousClass001.A0u(str);
        int iHashCode = strA0u.hashCode();
        if (iHashCode == -1378118592) {
            if (strA0u.equals("buffer")) {
                return EnumC2376BWl.A02;
            }
            return null;
        }
        if (iHashCode == -1190396462) {
            if (strA0u.equals("ignore")) {
                return EnumC2376BWl.A03;
            }
            return null;
        }
        if (iHashCode == -934521548 && strA0u.equals(LocalBrowserNodeHandler.REPORT)) {
            return EnumC2376BWl.A04;
        }
        return null;
    }
}
