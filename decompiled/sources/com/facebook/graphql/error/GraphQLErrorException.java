package com.facebook.graphql.error;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.CPP;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class GraphQLErrorException extends Exception {

    public final class GraphQLResponseError extends GraphQLErrorException {
        public final String additionalInfoFromRESTDoNotUseExceptForMigration;
        public final List<GraphQLResponseError> allErrors;
        public final int backoff;
        public final int code;
        public final String description;
        public final boolean isRetryable;
        public final boolean isSummary;
        public final boolean isTransient;
        public final List<String> path;
        public final CPP severity;
        public final String summary;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Throwable;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List<Ljava/lang/String;>;LX/CPP;ILjava/util/List<Lcom/facebook/graphql/error/GraphQLErrorException$GraphQLResponseError;>;)V */
        public GraphQLResponseError(CPP cpp, String str, String str2, String str3, String str4, Throwable th, List list, List list2, int i, int i2, boolean z, boolean z2, boolean z3) {
            super(str, th);
            AnonymousClass002.A1F(str, 0, list);
            this.code = i;
            this.isTransient = z;
            this.summary = str2;
            this.description = str3;
            this.additionalInfoFromRESTDoNotUseExceptForMigration = str4;
            this.isRetryable = z2;
            this.isSummary = z3;
            this.path = list;
            this.severity = cpp;
            this.backoff = i2;
            this.allErrors = list2;
        }
    }

    public final class TigonError extends GraphQLErrorException {
        public final short errorCode;
        public final String errorCodeDescription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TigonError(String str, String str2, Throwable th, short s) {
            super(str, th);
            AnonymousClass003.A0v(str, str2);
            this.errorCodeDescription = str2;
            this.errorCode = s;
        }
    }
}
