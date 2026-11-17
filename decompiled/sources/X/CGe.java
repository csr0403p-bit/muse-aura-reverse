package X;

import com.facebook.crudolib.netfb.FbApiException;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.http.protocol.ApiException;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes5.dex */
public final class CGe implements InterfaceC3618CYn {
    public final /* synthetic */ CGg A00;
    public final /* synthetic */ C4023CkC A01;

    @Override // X.InterfaceC3618CYn
    public final void ATK(IOException iOException) {
        C7384Etj.A0Y(iOException, 1);
        CGg cGg = this.A00;
        boolean z = iOException instanceof FbApiException;
        IOException iOException2 = iOException;
        if (z) {
            FbApiException fbApiException = (FbApiException) iOException;
            ApiErrorResult apiErrorResult = new ApiErrorResult(fbApiException.errorDomain == EnumC2377BWn.API_EC_DOMAIN ? BWo.API_EC_DOMAIN : BWo.GRAPHQL_KERROR_DOMAIN, fbApiException.errorMessage, fbApiException.errorData, fbApiException.errorUserTitle, fbApiException.errorUserMsg, fbApiException.fbTraceId, null, fbApiException.apiErrorCode, true);
            StringBuilder sbA0x = C60O.A0x("[code] ");
            sbA0x.append(apiErrorResult.mErrorCode);
            sbA0x.append(" [message]: ");
            sbA0x.append(apiErrorResult.mErrorMessage);
            sbA0x.append(" [extra]: ");
            ApiException apiException = new ApiException(AnonymousClass001.A0v(apiErrorResult.mErrorData, sbA0x));
            apiException.statusCode = 0;
            apiException.A00 = Collections.EMPTY_MAP;
            apiException.result = apiErrorResult;
            iOException2 = apiException;
        }
        cGg.onFailure(iOException2);
    }

    public CGe(CGg cGg, C4023CkC c4023CkC) {
        this.A00 = cGg;
        this.A01 = c4023CkC;
    }

    @Override // X.InterfaceC3618CYn
    public final void AVX(C7416EvJ c7416EvJ) {
        this.A00.onSuccess(new C3351CGh(c7416EvJ));
    }
}
