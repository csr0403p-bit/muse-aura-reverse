package X;

import android.content.Intent;
import android.content.res.Resources;
import android.os.ResultReceiver;
import androidx.wear.remote.interactions.RemoteActivityHelper$RemoteIntentResultReceiver;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoGraphQLServiceJNI;
import com.facebook.payments.dcp.iap.internal.mutator.IapMutator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.wearable.internal.zzhg;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EDJ extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EDJ(Object obj, InterfaceC4453CwV interfaceC4453CwV, C3010Brs<Void> c3010Brs, AbstractC4099CmT abstractC4099CmT, C4443CwA c4443CwA, Intent intent) {
        super(1);
        this.$t = intent;
        this.A00 = c3010Brs;
        this.A01 = interfaceC4453CwV;
        this.A03 = c4443CwA;
        this.A04 = abstractC4099CmT;
        this.A02 = obj;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    str = "com.google.android.wearable.app";
                }
                ((C4445CwC) ((InterfaceC4453CwV) this.A00)).A01.A02.sendBroadcast(C4443CwA.A00((Intent) this.A01, (ResultReceiver) this.A03, ((zzhg) ((InterfaceC3641Caw) this.A02)).A00, str));
                break;
            case 1:
                List<InterfaceC3641Caw> list = (List) obj;
                if (list.size() == 0) {
                    ((C4445CwC) ((InterfaceC4453CwV) this.A00)).A00.A04(new Resources.NotFoundException("No devices connected"));
                    break;
                } else {
                    RemoteActivityHelper$RemoteIntentResultReceiver remoteActivityHelper$RemoteIntentResultReceiver = new RemoteActivityHelper$RemoteIntentResultReceiver((C3010Brs) this.A01, list.size());
                    for (InterfaceC3641Caw interfaceC3641Caw : list) {
                        AbstractC4099CmT abstractC4099CmT = (AbstractC4099CmT) this.A03;
                        String str2 = ((zzhg) interfaceC3641Caw).A00;
                        C4179Cop c4179Cop = (C4179Cop) abstractC4099CmT;
                        C4231Cqf c4231CqfA00 = C4232Cqg.A00();
                        c4231CqfA00.A01 = new C4124CnQ(c4179Cop, str2);
                        c4231CqfA00.A03 = new Feature[]{AbstractC4136Cnd.A02};
                        CSC cscA01 = AbstractC4178Com.A01(c4179Cop, c4231CqfA00, 24023, 0);
                        C4443CwA c4443CwA = (C4443CwA) this.A04;
                        Executor executor = c4443CwA.A03;
                        Object obj2 = this.A00;
                        cscA01.A06(new C4954DHn(new EDJ(interfaceC3641Caw, this.A02, obj2, c4443CwA, remoteActivityHelper$RemoteIntentResultReceiver, 0), 7), executor).A0A(new F5G(obj2, 2), executor);
                    }
                    break;
                }
            case 2:
                PandoGraphQLServiceJNI pandoGraphQLServiceJNI = (PandoGraphQLServiceJNI) obj;
                try {
                    if (pandoGraphQLServiceJNI == null) {
                        throw C3cG.A0Q("Attempted to execute a query with a null service. Most likely you either used executeAndSubscribe with a query executor that has not setup a consistency service, or you called executeAndSubscribe with a query executor that was intended to be for logged out calls.");
                    }
                    DYI dyi = (DYI) this.A03;
                    if (!(dyi instanceof PandoGraphQLRequest) || dyi == null) {
                        throw BV5.A0U("Pando Query Executor can only be used with Pando GraphQL Request, actual type is ", C60Q.A0e(dyi));
                    }
                    String str3 = ((DYp) this.A04).A00.A04;
                    PandoGraphQLRequest pandoGraphQLRequest = (PandoGraphQLRequest) dyi;
                    String str4 = pandoGraphQLRequest.buildConfigName;
                    if (!str3.equals(str4)) {
                        CFK.A07("com.facebook.pando.PandoQueryExecutor.executeInner", FGI.A0k("Executing query ", pandoGraphQLRequest.queryName, " for build config ", str4, " with a flatbuffer for build config ", str3, ". This makes it impossible to look up the correct client_doc_id and ReaderFragment!"));
                    }
                    if (pandoGraphQLRequest.isMutation()) {
                        pandoGraphQLRequest.m3183setFreshCacheAgeMs(0L);
                        pandoGraphQLRequest.m3186setMaxToleratedCacheAgeMs(0L);
                    }
                    boolean zA00 = pandoGraphQLRequest.shouldInjectClientMutationId() ? A00(pandoGraphQLRequest.rootCallVariable, AbstractC7606F5t.A00(39), pandoGraphQLRequest.params, CallableC2961Bpz.A00) : false;
                    boolean zA002 = pandoGraphQLRequest.shouldInjectClientSubscriptionId() ? A00(pandoGraphQLRequest.rootCallVariable, "client_subscription_id", pandoGraphQLRequest.params, CallableC2960Bpy.A00) : false;
                    if (zA00 || zA002) {
                        pandoGraphQLRequest.setQueryVariables(pandoGraphQLRequest.params, pandoGraphQLRequest.transientParams);
                    }
                    boolean zRequireAcsToken = pandoGraphQLRequest.requireAcsToken();
                    boolean zRequireOhaiConfig = pandoGraphQLRequest.requireOhaiConfig();
                    boolean z = pandoGraphQLRequest._hasAcsToken;
                    boolean z2 = pandoGraphQLRequest._hasOhaiConfig;
                    boolean zA1Q = AnonymousClass002.A1Q(zRequireAcsToken ? 1 : 0, z ? 1 : 0);
                    boolean z3 = zRequireOhaiConfig == z2;
                    if (!zA1Q || !z3) {
                        ArrayList arrayListA0h = C3cG.A0h();
                        ArrayList arrayListA0h2 = C3cG.A0h();
                        if (!zA1Q) {
                            if (z) {
                                arrayListA0h2.add("ACS token");
                            } else {
                                arrayListA0h.add("ACS token");
                            }
                        }
                        if (!z3) {
                            if (z2) {
                                arrayListA0h2.add("OHAI config");
                            } else {
                                arrayListA0h.add("OHAI config");
                            }
                        }
                        if (!arrayListA0h.isEmpty()) {
                            throw BV5.A0V("Request was marked with @deidentified, but no ", AbstractC06907md.A01(" or ", arrayListA0h, null), " was provided.");
                        }
                        if (!arrayListA0h2.isEmpty()) {
                            throw BV5.A0V("Unexpected ", AbstractC06907md.A01(" and ", arrayListA0h2, null), " was provided to the request.");
                        }
                    }
                    return pandoGraphQLServiceJNI.initiate(null, pandoGraphQLRequest, new CPO((CPS) this.A01, (F0T) this.A02), (Executor) this.A00).cancelToken;
                } catch (IllegalStateException e) {
                    ((Executor) this.A00).execute(new CQL((CPS) this.A01, e));
                    return new DY8();
                }
            case 3:
                G0U g0u = (G0U) obj;
                C7384Etj.A0Y(g0u, 0);
                DcR dcR = new DcR();
                ((AtomicReference) this.A01).set(dcR);
                if (!((AtomicBoolean) this.A00).get()) {
                    InterfaceC5106DYe interfaceC5106DYeExecute = ((IapMutator) this.A04).A01.execute((DYI) this.A03, new E8e(1, this.A02, dcR), new DcP(dcR, g0u), EnumC3451CNw.A01);
                    C7384Etj.A0Y(interfaceC5106DYeExecute, 0);
                    dcR.A03 = interfaceC5106DYeExecute;
                    DcR.A00(dcR);
                    break;
                }
                break;
            default:
                String strA13 = C8j3.A13(obj);
                C6725EXj c6725EXj = ((EXP) this.A04).A02;
                C6729EXn c6729EXnA0y = C6729EXn.A0y((C6729EXn) this.A02, C79.A01, Long.valueOf(((C6718EXb) this.A03).A00()), null);
                C8ee c8eeA00 = C6725EXj.A00(c6725EXj);
                if (c8eeA00 != null) {
                    Eu1 eu1AcquireEvent = c8eeA00.acquireEvent("client_fetch_dcpiacproductinfo_fail");
                    if (eu1AcquireEvent.isSampled()) {
                        Eu1.A00(eu1AcquireEvent);
                        Eu1.A01(eu1AcquireEvent, AbstractC6727EXl.A00(c6729EXnA0y));
                        eu1AcquireEvent.A3y(HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, strA13);
                        EVX.A00(eu1AcquireEvent);
                    }
                }
                HtJ htJ = (HtJ) this.A00;
                InterfaceC10512HoG interfaceC10512HoG = C9732Gel.A03;
                List list2 = (List) this.A01;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayListA0i.add(new HyC((String) it.next(), "$0.99", 990000L, "USD"));
                }
                htJ.resumeWith(new Hkf(interfaceC10512HoG, arrayListA0i, C0881AGi.A00));
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/String;Ljava/lang/String;Ljava/util/concurrent/Callable<Ljava/lang/String;>;)Z */
    public static boolean A00(String str, String str2, Map map, Callable callable) {
        map.getClass();
        if (str != null) {
            Iterator itA11 = BV5.A11(map);
            while (true) {
                if (!itA11.hasNext()) {
                    break;
                }
                String strA0j = AnonymousClass005.A0j(itA11);
                if (strA0j.equals(str)) {
                    Object obj = map.get(strA0j);
                    if (obj instanceof TreeMap) {
                        AbstractMap abstractMap = (AbstractMap) obj;
                        Iterator itA0i = C3cG.A0i(abstractMap);
                        while (true) {
                            if (!itA0i.hasNext()) {
                                try {
                                    String str3 = (String) callable.call();
                                    if (str3 != null) {
                                        abstractMap.put(str2, str3);
                                        return true;
                                    }
                                } catch (Exception e) {
                                    BzX.A00("GraphQLCallInputHelper", "Failed to call function for added value in Pando", e);
                                    return false;
                                }
                            } else if (C60O.A0t(C3cH.A0l(itA0i)).equals(str2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
