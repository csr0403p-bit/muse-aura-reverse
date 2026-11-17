package com.facebook.pando;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7384Etj;
import X.CGM;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class PandoGraphQLConnectionConfig {
    public final String connectionQueryName;
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybridData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2);

    private final native void setGeneratedPaginationQueryClientDocId(String str);

    public final void setGeneratedPaginationQueryClientDocId(CGM cgm) {
        C7384Etj.A0Y(cgm, 0);
        String strClientDocIdForQuery = cgm.clientDocIdForQuery(this.connectionQueryName);
        if (strClientDocIdForQuery == null) {
            strClientDocIdForQuery = "";
        }
        setGeneratedPaginationQueryClientDocId(strClientDocIdForQuery);
    }

    static {
        ETi.loadLibrary("pando-graphql-jni");
    }

    public PandoGraphQLConnectionConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2) {
        AnonymousClass005.A14(str, str2, str3, str4);
        AnonymousClass003.A0z(str6, str7);
        AnonymousClass002.A1F(str9, 8, str10);
        this.connectionQueryName = str4;
        this.mHybridData = initHybridData(str, str2, str3, str4, str5 == null ? "" : str5, str6, str7, str8 == null ? "" : str8, str9, str10, z, z2);
    }
}
