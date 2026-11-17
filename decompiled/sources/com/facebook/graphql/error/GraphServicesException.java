package com.facebook.graphql.error;

import X.AnonymousClass001;
import X.BV4;
import X.C60O;
import com.facebook.graphservice.interfaces.Summary;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonErrorException;
import java.io.IOException;

/* loaded from: classes5.dex */
public class GraphServicesException extends IOException {
    public final GraphQLError mError;
    public String mErrorMsg;
    public final Summary mSummary;
    public final TigonError mTigonError;

    public GraphServicesException(TigonError tigonError, Summary summary) {
        super("GraphServicesError ( empty )");
        this.mTigonError = tigonError;
        this.mSummary = summary;
        this.mError = toGraphQLError();
        this.mErrorMsg = toMessageString();
    }

    private GraphQLError toGraphQLError() {
        String str;
        Summary summary = this.mSummary;
        if (summary == null || (str = summary.A0S) == null || str.isEmpty()) {
            return null;
        }
        int i = summary.A00;
        int i2 = summary.A02;
        String str2 = summary.A0N;
        return new GraphQLError(str, summary.A0O, summary.A0P, str2, i2, i, 0L, summary.A0Z, summary.A0a, summary.A0c);
    }

    private String toMessageString() {
        String string;
        StringBuilder sbA0x;
        String str;
        TigonError tigonError = this.mTigonError;
        if (tigonError != null) {
            sbA0x = C60O.A0x("TigonError(error=");
            BV4.A1O(sbA0x, tigonError.category);
            sbA0x.append(", errorDomain=");
            TigonError tigonError2 = this.mTigonError;
            sbA0x.append(tigonError2.A02);
            sbA0x.append(", domainErrorCode=");
            sbA0x.append(tigonError2.A00);
            String str2 = tigonError2.A01;
            if (!str2.isEmpty()) {
                sbA0x.append(", analyticsDetail=\"");
                sbA0x.append(str2);
                sbA0x.append("\"");
            }
            str = ")";
        } else {
            GraphQLError graphQLError = this.mError;
            if (graphQLError == null) {
                Summary summary = this.mSummary;
                return (summary == null || (string = summary.toString()) == null) ? "GraphServicesError (empty)" : string;
            }
            sbA0x = C60O.A0x("[code] ");
            int i = graphQLError.code;
            if (i == -1) {
                i = graphQLError.mErrorCode;
            }
            sbA0x.append(i);
            sbA0x.append(" [message]: ");
            String str3 = graphQLError.description;
            if (str3 == null) {
                str3 = graphQLError.mErrorMessage;
            }
            sbA0x.append(str3);
            sbA0x.append(" [extra]: ");
            str = graphQLError.debugInfo;
            if (str == null) {
                str = graphQLError.mErrorData;
            }
        }
        return AnonymousClass001.A0v(str, sbA0x);
    }

    public GraphQLError getGraphQLError() {
        return this.mError;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.mErrorMsg;
    }

    public Summary getSummary() {
        return this.mSummary;
    }

    public TigonError getTigonError() {
        return this.mTigonError;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GraphServicesException(TigonErrorException tigonErrorException, Summary summary) {
        TigonError tigonError;
        if (tigonErrorException == null) {
            tigonError = null;
        } else {
            tigonError = tigonErrorException.tigonError;
        }
        this(tigonError, summary);
    }
}
