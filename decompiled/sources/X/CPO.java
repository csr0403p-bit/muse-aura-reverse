package X;

import com.facebook.graphql.error.GraphQLErrorException;
import com.facebook.pando.PandoError;
import com.facebook.pando.Summary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class CPO<T> implements CPW<T> {
    public final CPS A00;
    public final F0T<T> A01;
    public final Throwable A02;

    @Override // X.CPW
    public final void onError(PandoError pandoError) {
        C7384Etj.A0Y(pandoError, 0);
        Throwable thA00 = pandoError.platformInfraError;
        if (thA00 == null) {
            short s = pandoError.tigonErrorCode;
            if (s != 0) {
                thA00 = new GraphQLErrorException.TigonError(pandoError.message, pandoError.tigonErrorCodeDescription, this.A02, s);
            } else {
                thA00 = A00(pandoError);
            }
        }
        CPS cps = this.A00;
        if (cps != null) {
            cps.invoke(thA00);
        }
    }

    @Override // X.CPW
    public final void onUpdate(T t, Summary summary) {
        C7384Etj.A0Y(summary, 1);
        this.A01.invoke(new CPX(t, summary));
    }

    public /* synthetic */ CPO(CPS cps, F0T f0t) {
        Throwable th = new Throwable();
        C7384Etj.A0Y(f0t, 0);
        this.A01 = f0t;
        this.A00 = cps;
        this.A02 = th;
    }

    private final GraphQLErrorException.GraphQLResponseError A00(PandoError pandoError) {
        String str = pandoError.message;
        Throwable th = this.A02;
        int i = pandoError.apiErrorCode;
        boolean z = pandoError.apiErrorIsTransient;
        String str2 = pandoError.apiErrorSummary;
        String str3 = null;
        if (i != 0) {
            str3 = str2;
        }
        String str4 = i != 0 ? pandoError.apiErrorDescription : null;
        String str5 = pandoError.apiAdditionalInfoFromRESTDoNotUseExceptForMigration;
        boolean z2 = pandoError.apiErrorIsRetryable;
        boolean z3 = pandoError.apiErrorIsSummary;
        List<String> list = pandoError.apiErrorPath;
        int i2 = pandoError.apiErrorSeverityValue;
        CPP cpp = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? CPP.A05 : CPP.A06 : CPP.A02 : CPP.A03 : CPP.A07 : CPP.A04;
        int i3 = pandoError.apiErrorBackoff;
        List<PandoError> list2 = pandoError.allErrors;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
        Iterator<PandoError> it = list2.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(A00(it.next()));
        }
        return new GraphQLErrorException.GraphQLResponseError(cpp, str, str3, str4, str5, th, list, arrayListA0i, i, i3, z, z2, z3);
    }
}
