package X;

import android.app.Activity;
import android.os.Handler;
import com.facebook.aura.graphql.AuraGraphQLService;
import com.facebook.aura.iap.iac.AuraIacBottomSheetLauncher;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.graphql.calls.GraphQlCallInput;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EXP implements HuC {
    public final AuraIacBottomSheetLauncher A00;
    public final Hon A01;
    public final C6725EXj A02;
    public final Hwq A03;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ EXP(AuraIacBottomSheetLauncher auraIacBottomSheetLauncher, Hon hon, Hwq hwq) {
        C6725EXj c6725EXj = new C6725EXj(null, 1, 0 == true ? 1 : 0);
        C7384Etj.A0Y(hon, 2);
        this.A03 = hwq;
        this.A00 = auraIacBottomSheetLauncher;
        this.A01 = hon;
        this.A02 = c6725EXj;
    }

    public static final void A04(EXZ exz, EXP exp, String str, String str2) {
        if (str2 != null) {
            BQG.A17(str2, 8);
        }
        Hz9 hz9 = new Hz9(C79.A01, exz.A02, exz.A03, str, str2, 32);
        C6725EXj c6725EXj = exp.A02;
        C6729EXn c6729EXnA0y = C6729EXn.A0y(A00(exz, null, null), null, null, str);
        C8ee c8eeA00 = C6725EXj.A00(c6725EXj);
        if (c8eeA00 != null) {
            Eu1 eu1AcquireEvent = c8eeA00.acquireEvent("client_create_dcpiac_success");
            if (eu1AcquireEvent.isSampled()) {
                Eu1.A00(eu1AcquireEvent);
                Eu1.A01(eu1AcquireEvent, C6725EXj.A01(c6729EXnA0y));
                EVX.A00(eu1AcquireEvent);
            }
        }
        exp.A03.AVA(C9732Gel.A03, Collections.singletonList(hz9));
    }

    @Override // X.HuC
    public final void AAa() {
    }

    public static final C6729EXn A00(EXZ exz, Integer num, String str) {
        return new C6729EXn(num, null, exz.A02, exz.A03, exz.A01, str, null);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/F1F;Landroid/os/Handler;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    public static final void A02(Handler handler, Function0 function0, F1F f1f) {
        if (f1f.element) {
            return;
        }
        f1f.element = true;
        handler.removeCallbacksAndMessages(null);
        function0.invoke();
    }

    public static final void A03(EXZ exz, EXP exp, C6729EXn c6729EXn, C6718EXb c6718EXb, String str) {
        A06(C6729EXn.A0y(c6729EXn, null, Long.valueOf(c6718EXb.A00()), null), exp.A02, str);
        EXc eXc = new EXc(EnumC9706GeK.A0A, str);
        exp.A05(exz, eXc);
        exp.A03.AVA(eXc, null);
    }

    private final void A05(EXZ exz, InterfaceC10512HoG interfaceC10512HoG) {
        C6725EXj c6725EXj = this.A02;
        C6729EXn c6729EXnA00 = A00(exz, null, null);
        String strName = interfaceC10512HoG.AJk().name();
        String strAEf = interfaceC10512HoG.AEf();
        C8ee c8eeA00 = C6725EXj.A00(c6725EXj);
        if (c8eeA00 != null) {
            Eu1 eu1AcquireEvent = c8eeA00.acquireEvent("client_create_dcpiac_fail");
            if (eu1AcquireEvent.isSampled()) {
                Eu1.A00(eu1AcquireEvent);
                Eu1.A01(eu1AcquireEvent, C6725EXj.A01(c6729EXnA00));
                eu1AcquireEvent.A3y("error_code", strName);
                if (strAEf != null) {
                    eu1AcquireEvent.A3y(HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, strAEf);
                }
                EVX.A00(eu1AcquireEvent);
            }
        }
    }

    @Override // X.HuC
    public final InterfaceC9726Gee A7h() {
        return new C6717EXa();
    }

    @Override // X.HuC
    public final String ACn() {
        return "iac";
    }

    @Override // X.HuC
    public final void ACo(HyF hyF, String str) {
        if (hyF != null) {
            hyF.ARy(C6723EXh.A00, C9732Gel.A03);
        }
    }

    @Override // X.HuC
    public final Integer AIk() {
        return C79.A0W;
    }

    @Override // X.HuC
    public final Hy6 AIm() {
        return null;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Hkg;ZLX/HtJ<-LX/Hkf;>;)Ljava/lang/Object; */
    @Override // X.HuC
    public final Object AYx(Hkg hkg, HtJ htJ, boolean z) throws Exception {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GBL.A04;
        GBL gbl = new GBL(1, C7Bm.A02(htJ));
        gbl.A0I();
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(hkg.A03, hkg.A02);
        String strA01 = AbstractC06907md.A01(",", AbstractC0878AGe.A0W(arrayListA0P), null);
        Integer num = C79.A00;
        String str = hkg.A01;
        C6729EXn c6729EXn = new C6729EXn(num, null, strA01, str, null, "iac_product_info_query", null);
        C8ee c8eeA00 = C6725EXj.A00(this.A02);
        if (c8eeA00 != null) {
            Eu1 eu1AcquireEvent = c8eeA00.acquireEvent("client_fetch_dcpiacproductinfo_init");
            if (eu1AcquireEvent.isSampled()) {
                Eu1.A00(eu1AcquireEvent);
                Eu1.A01(eu1AcquireEvent, AbstractC6727EXl.A00(c6729EXn));
                EVX.A00(eu1AcquireEvent);
            }
        }
        C6718EXb c6718EXb = new C6718EXb(0L, 1, null);
        EDJ edj = new EDJ(c6729EXn, arrayListA0P, gbl, this, c6718EXb, 4);
        try {
            try {
                Object objA0d = BV5.A0d("create", C5191Dbr.class);
                C7384Etj.A0Z(objA0d, "null cannot be cast to non-null type com.facebook.payments.dcp.xapp.billingclient.impl.iac.gql.IACQueryProductInfoQuery.BuilderForInput");
                C5188Dbo c5188Dbo = (C5188Dbo) objA0d;
                c5188Dbo.A01.A01(new Hzd(str, (List<String>) arrayListA0P, (String) 10), "input");
                c5188Dbo.A00 = true;
                DYI dyiBuild = c5188Dbo.build();
                InterfaceC5107DYf interfaceC5107DYfIapInstance = AuraGraphQLService.INSTANCE.iapInstance();
                EnumC3451CNw enumC3451CNw = EnumC3451CNw.A01;
                CQD.A01(new EXO(this, c6729EXn, c6718EXb, edj, gbl), interfaceC5107DYfIapInstance.asFuture(dyiBuild, enumC3451CNw), enumC3451CNw);
            } catch (Exception e) {
                if ((e instanceof ClassNotFoundException) || (e instanceof IllegalAccessException) || (e instanceof InstantiationException) || (e instanceof InvocationTargetException) || (e instanceof NoSuchMethodException)) {
                    throw BV4.A0e(e);
                }
                throw e;
            }
        } catch (Exception e2) {
            edj.invoke(FGI.A0M("Product info query threw: ", e2.getMessage()));
        }
        return gbl.A0F();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GOz;ZLX/HtJ<-LX/HzU;>;)Ljava/lang/Object; */
    @Override // X.HuC
    public final Object AYy(GOz gOz, HtJ htJ, boolean z) {
        return new HzU(C9732Gel.A03, C0881AGi.A00);
    }

    @Override // X.HuC
    public final boolean isReady() {
        return true;
    }

    public static final void A01(Activity activity, EXZ exz, EXP exp, C6729EXn c6729EXn, EnumC7495EyA enumC7495EyA, G0U g0u, int i, int i2) throws Exception {
        F0C f0c;
        Eu1 eu1AcquireEvent;
        EnumC9706GeK enumC9706GeK;
        String str;
        C6725EXj c6725EXj;
        String str2;
        String str3;
        int iOrdinal = enumC7495EyA.ordinal();
        if (iOrdinal == 0) {
            C6725EXj c6725EXj2 = exp.A02;
            F0C f0c2 = c6725EXj2.A00;
            C8ee c8ee = (C8ee) f0c2.getValue();
            if (c8ee != null) {
                Eu1 eu1AcquireEvent2 = c8ee.acquireEvent("client_load_dcpiacbottomsheet_success");
                if (eu1AcquireEvent2.isSampled()) {
                    Eu1.A00(eu1AcquireEvent2);
                    Eu1.A01(eu1AcquireEvent2, AbstractC6728EXm.A00(c6729EXn));
                    EVX.A00(eu1AcquireEvent2);
                }
            }
            g0u.invoke(C9732Gel.A03);
            String str4 = exz.A01;
            String str5 = exz.A03;
            if (str4 == null || str5 == null) {
                A06(A00(exz, C79.A0T, null), c6725EXj2, "Missing billableId/quoteId; delivering a purchase with no sandbox session");
                A04(exz, exp, null, null);
                return;
            }
            C3341CFl c3341CFlA03 = GraphQlCallInput.A02.A03();
            C3341CFl.A00(c3341CFlA03, str4, "billable_id");
            C3341CFl.A00(c3341CFlA03, str5, "quote_id");
            C3341CFl.A00(c3341CFlA03, null, "max_renewals");
            C3341CFl.A00(c3341CFlA03, null, "product_type");
            C3341CFl.A00(c3341CFlA03, null, "renewal_interval_seconds");
            C3341CFl.A00(c3341CFlA03, null, "supported_app");
            C3341CFl.A00(c3341CFlA03, Integer.valueOf(i), "renewal_interval_seconds");
            C3341CFl.A00(c3341CFlA03, Integer.valueOf(i2), "max_renewals");
            C6729EXn c6729EXnA00 = A00(exz, C79.A0P, "dcp_internal_sandbox_create_session");
            C8ee c8ee2 = (C8ee) f0c2.getValue();
            if (c8ee2 != null) {
                Eu1 eu1AcquireEvent3 = c8ee2.acquireEvent("client_create_dcpiacsession_init");
                if (eu1AcquireEvent3.isSampled()) {
                    Eu1.A00(eu1AcquireEvent3);
                    Eu1.A01(eu1AcquireEvent3, AbstractC6726EXk.A00(c6729EXnA00));
                    eu1AcquireEvent3.A3y("session_id", EVX.A00);
                    String str6 = EVW.A00.mValue;
                    C7384Etj.A0U(str6);
                    eu1AcquireEvent3.A3y("product_type", str6);
                    eu1AcquireEvent3.APu();
                }
            }
            C6718EXb c6718EXb = new C6718EXb(0L, 1, null);
            Handler handlerA09 = BV4.A09(activity.getMainLooper());
            F1F f1f = new F1F();
            handlerA09.postDelayed(new EXY(handlerA09, exz, exp, c6729EXnA00, c6718EXb, f1f), 15000L);
            try {
                InterfaceC5107DYf interfaceC5107DYfIapInstance = AuraGraphQLService.INSTANCE.iapInstance();
                try {
                    Object objA0d = BV5.A0d("create", C5190Dbq.class);
                    C7384Etj.A0Z(objA0d, "null cannot be cast to non-null type com.facebook.payments.dcp.xapp.billingclient.impl.iac.gql.DCPInternalSandboxCreateSessionMutation.BuilderForInput");
                    C5187Dbn c5187Dbn = (C5187Dbn) objA0d;
                    c5187Dbn.A01.A00.A04().A0E(c3341CFlA03, "input");
                    c5187Dbn.A00 = true;
                    interfaceC5107DYfIapInstance.execute(c5187Dbn.build(), new C5236Ddu(handlerA09, exz, exp, c6729EXnA00, c6718EXb, f1f), new EXV(handlerA09, exz, exp, c6729EXnA00, c6718EXb, f1f), EnumC3451CNw.A01);
                    return;
                } catch (Exception e) {
                    if (!(e instanceof ClassNotFoundException) && !(e instanceof IllegalAccessException) && !(e instanceof InstantiationException) && !(e instanceof InvocationTargetException) && !(e instanceof NoSuchMethodException)) {
                        throw e;
                    }
                    throw BV4.A0e(e);
                }
            } catch (Exception e2) {
                A02(handlerA09, new E86(e2, c6729EXnA00, exp, exz, c6718EXb, 2), f1f);
                return;
            }
        }
        if (iOrdinal == 2) {
            F0C f0c3 = exp.A02.A00;
            C8ee c8ee3 = (C8ee) f0c3.getValue();
            if (c8ee3 != null) {
                Eu1 eu1AcquireEvent4 = c8ee3.acquireEvent("client_load_dcpiacbottomsheet_pending");
                if (eu1AcquireEvent4.isSampled()) {
                    Eu1.A00(eu1AcquireEvent4);
                    Eu1.A01(eu1AcquireEvent4, AbstractC6728EXm.A00(c6729EXn));
                    EVX.A00(eu1AcquireEvent4);
                }
            }
            InterfaceC10512HoG interfaceC10512HoG = C9732Gel.A03;
            g0u.invoke(interfaceC10512HoG);
            String str7 = null;
            Hz9 hz9 = new Hz9(C79.A00, exz.A02, exz.A03, str7, str7, 44);
            C6729EXn c6729EXnA002 = A00(exz, null, null);
            C8ee c8ee4 = (C8ee) f0c3.getValue();
            if (c8ee4 != null) {
                Eu1 eu1AcquireEvent5 = c8ee4.acquireEvent("client_create_dcpiac_pending");
                if (eu1AcquireEvent5.isSampled()) {
                    Eu1.A00(eu1AcquireEvent5);
                    Eu1.A01(eu1AcquireEvent5, C6725EXj.A01(c6729EXnA002));
                    EVX.A00(eu1AcquireEvent5);
                }
            }
            exp.A03.AVA(interfaceC10512HoG, Collections.singletonList(hz9));
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 3) {
                c6725EXj = exp.A02;
                str2 = "ERROR";
                str3 = "IAC: tester chose the simulated failure option";
            } else {
                if (iOrdinal != 4) {
                    throw C3cG.A0q();
                }
                c6725EXj = exp.A02;
                str2 = "NETWORK_ERROR";
                str3 = "IAC: tester chose the simulated network-error option";
            }
            f0c = c6725EXj.A00;
            C8ee c8ee5 = (C8ee) f0c.getValue();
            if (c8ee5 != null) {
                eu1AcquireEvent = c8ee5.acquireEvent("client_load_dcpiacbottomsheet_fail");
                if (eu1AcquireEvent.isSampled()) {
                    Eu1.A00(eu1AcquireEvent);
                    Eu1.A01(eu1AcquireEvent, AbstractC6728EXm.A00(c6729EXn));
                    eu1AcquireEvent.A3y("error_code", str2);
                    eu1AcquireEvent.A3y(HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, str3);
                    EVX.A00(eu1AcquireEvent);
                }
            }
        } else {
            f0c = exp.A02.A00;
            C8ee c8ee6 = (C8ee) f0c.getValue();
            if (c8ee6 != null) {
                eu1AcquireEvent = c8ee6.acquireEvent("client_load_dcpiacbottomsheet_cancel");
                if (eu1AcquireEvent.isSampled()) {
                    Eu1.A00(eu1AcquireEvent);
                    Eu1.A01(eu1AcquireEvent, AbstractC6728EXm.A00(c6729EXn));
                    EVX.A00(eu1AcquireEvent);
                }
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 3) {
                enumC9706GeK = EnumC9706GeK.A0A;
                str = "IAC: Simulated failure";
            } else {
                if (iOrdinal != 4) {
                    throw C3cG.A0q();
                }
                enumC9706GeK = EnumC9706GeK.A0G;
                str = "IAC: Simulated network error";
            }
            EXc eXc = new EXc(enumC9706GeK, str);
            g0u.invoke(eXc);
            exp.A05(exz, eXc);
            exp.A03.AVA(eXc, null);
            return;
        }
        EXc eXc2 = new EXc(EnumC9706GeK.A0M, "IAC: User cancelled");
        g0u.invoke(eXc2);
        C6729EXn c6729EXnA003 = A00(exz, null, null);
        C8ee c8ee7 = (C8ee) f0c.getValue();
        if (c8ee7 != null) {
            Eu1 eu1AcquireEvent6 = c8ee7.acquireEvent("client_create_dcpiac_cancel");
            if (eu1AcquireEvent6.isSampled()) {
                Eu1.A00(eu1AcquireEvent6);
                Eu1.A01(eu1AcquireEvent6, C6725EXj.A01(c6729EXnA003));
                EVX.A00(eu1AcquireEvent6);
            }
        }
        exp.A03.AVA(eXc2, null);
    }

    public static final void A06(C6729EXn c6729EXn, C6725EXj c6725EXj, String str) {
        C8ee c8eeA00 = C6725EXj.A00(c6725EXj);
        if (c8eeA00 != null) {
            Eu1 eu1AcquireEvent = c8eeA00.acquireEvent("client_create_dcpiacsession_fail");
            if (eu1AcquireEvent.isSampled()) {
                Eu1.A00(eu1AcquireEvent);
                Eu1.A01(eu1AcquireEvent, AbstractC6726EXk.A00(c6729EXn));
                if (str != null) {
                    eu1AcquireEvent.A3y(HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, str);
                }
                EVX.A00(eu1AcquireEvent);
            }
        }
    }

    @Override // X.HuC
    public final Object APU(Activity activity, C79e c79e, HtJ<? super InterfaceC10512HoG> htJ) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        EXZ exz;
        GBL gblA03 = C7Bm.A03(htJ);
        EQe eQe = new EQe(gblA03, 11);
        if (!(c79e instanceof EXZ) || (exz = (EXZ) c79e) == null) {
            eQe.invoke(new EXc(EnumC9706GeK.A09, FGI.A0U("IAC: launch params were ", C3cI.A0Y(c79e), ", not DcpBillingFlowParamsIac")));
        } else {
            C6725EXj c6725EXj = this.A02;
            C6729EXn c6729EXnA00 = A00(exz, null, null);
            C8ee c8eeA00 = C6725EXj.A00(c6725EXj);
            if (c8eeA00 != null) {
                Eu1 eu1AcquireEvent = c8eeA00.acquireEvent("client_create_dcpiac_init");
                if (eu1AcquireEvent.isSampled()) {
                    Eu1.A00(eu1AcquireEvent);
                    Eu1.A01(eu1AcquireEvent, C6725EXj.A01(c6729EXnA00));
                    EVX.A00(eu1AcquireEvent);
                }
            }
            activity.runOnUiThread(new EXQ(activity, exz, this, eQe));
        }
        return gblA03.A0F();
    }

    @Override // X.HuC
    public final Object A2s(Hz2 hz2, HtJ<? super InterfaceC10512HoG> htJ) {
        return C9732Gel.A03;
    }

    @Override // X.HuC
    public final Object A6z(Hz2 hz2, HtJ<? super InterfaceC10512HoG> htJ) {
        return C9732Gel.A03;
    }
}
