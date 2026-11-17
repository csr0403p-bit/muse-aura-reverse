package X;

import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.graphql.error.GraphQLErrorException;
import com.facebook.payments.dcp.xapp.model.IapNativeErrorAsThrowable;
import com.facebook.payments.dcp.xapp.model.IapSdkException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLException;

/* loaded from: classes6.dex */
public final class HiU {
    public static final HiU A00 = new HiU();

    public static final Hzd A00(InterfaceC10512HoG interfaceC10512HoG, String str) {
        C7384Etj.A0Y(interfaceC10512HoG, 0);
        String strAEf = interfaceC10512HoG.AEf();
        C9581GPs c9581GPsAJJ = interfaceC10512HoG.AJJ();
        return new Hzd("BILLINGCLIENT", strAEf, str, (c9581GPsAJJ != null ? c9581GPsAJJ.A01 : null) == C79.A01 ? "PAYMENT_DECLINED_DUE_TO_INSUFFICIENT_FUNDS" : interfaceC10512HoG.AJk().name(), "IAP_BILLING_ERROR_DOMAIN");
    }

    public final Hzd A04(InterfaceC9729Gei interfaceC9729Gei, String str, Throwable th) {
        String str2;
        String str3;
        String str4;
        C7384Etj.A0Y(interfaceC9729Gei, 2);
        if (th instanceof IapNativeErrorAsThrowable) {
            return ((IapNativeErrorAsThrowable) th).iapNativeError;
        }
        String message = th.getMessage();
        if (message == null) {
            message = C3cI.A0Y(th);
        }
        if (th instanceof IapSdkException) {
            GPM gpm = ((IapSdkException) th).reason;
            C7384Etj.A0Y(gpm, 0);
            str2 = gpm.value;
            str4 = "IAP_ERROR_DOMAIN";
            str3 = "CLIENT";
        } else {
            String strValueOf = th instanceof GraphQLErrorException.GraphQLResponseError ? String.valueOf(((GraphQLErrorException.GraphQLResponseError) th).code) : null;
            boolean zA03 = A03(th);
            if (strValueOf == null || strValueOf.length() == 0) {
                str2 = zA03 ? "2603215" : HatchPriceImpressionEventDataKt.NO_DISCOUNT;
                if (strValueOf == null) {
                    str3 = "CLIENT";
                    str4 = zA03 ? "IAP_ERROR_DOMAIN" : "";
                }
            } else {
                str2 = strValueOf;
            }
            str3 = "GRAPHQL";
            str4 = "IAP_GRAPHQL_ERROR_DOMAIN";
        }
        return new Hzd(str3, message, str, str2, str4);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/Gec;>;Ljava/lang/String;)LX/Hzd; */
    public static final Hzd A01(String str, List list) {
        C9724Gec c9724Gec = (C9724Gec) AbstractC0878AGe.A0G(list);
        String str2 = c9724Gec != null ? c9724Gec.A07 : null;
        if (str2 == null) {
            str2 = "";
        }
        return new Hzd("GRAPHQL", str2, str, c9724Gec != null ? String.valueOf(c9724Gec.A02) : "", "IAP_GRAPHQL_ERROR_DOMAIN");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<+LX/Hqr;>;Ljava/lang/String;)LX/Hzd; */
    public static final Hzd A02(String str, List list) {
        String string;
        Number number;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(((Hqr) it.next()).type);
        }
        String string2 = arrayListA0i.toString();
        Hqr hqr = (Hqr) AbstractC0878AGe.A0G(list);
        if (hqr == null || (number = hqr.type) == null || (string = number.toString()) == null) {
            string = "";
        }
        return new Hzd("CLIENT", string2, str, string, "IAP_USER_ELIGIBILITY_ERROR_DOMAIN");
    }

    public static final boolean A03(Throwable th) {
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        for (int i = 0; th != null && i <= 5 && linkedHashSetA0k.add(th) && !(th instanceof CancellationException); i++) {
            String message = th.getMessage();
            if ((message != null && C7BY.A0q(message, "domain: MNS", false)) || (th instanceof SocketTimeoutException) || (th instanceof UnknownHostException) || (th instanceof SocketException) || (th instanceof SSLException)) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }
}
