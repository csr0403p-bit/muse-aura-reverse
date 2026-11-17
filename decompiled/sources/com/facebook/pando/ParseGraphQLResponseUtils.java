package com.facebook.pando;

import X.BV4;
import X.BV5;
import X.BV7;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.CFK;
import X.DZB;
import X.ETi;
import X.InterfaceC2619Bfl;
import com.facebook.nativeutil.NativeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ParseGraphQLResponseUtils {
    public static final native TreeJNI createTree(PandoDataJNI pandoDataJNI, PandoGraphQLRequest<TreeJNI> pandoGraphQLRequest, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI);

    public static final native <T> PandoDataJNI parseGraphQLResponse(String str, PandoGraphQLRequest<T> pandoGraphQLRequest, PandoParseConfig pandoParseConfig);

    public static final native TreeJNI parseGraphQLResponseWithOSS(String str, NativeMap nativeMap, String str2, Class<? extends TreeJNI> cls, PandoBuildConfigFlatbufferAssetReaderJNI pandoBuildConfigFlatbufferAssetReaderJNI);

    static {
        ETi.loadLibrary("pando-graphql-jni");
    }

    public static final String graphQLModelToOSSJSONStr(InterfaceC2619Bfl interfaceC2619Bfl) {
        Object[] objArrA1b;
        String str;
        JSONObject jSONObjectA18;
        C7384Etj.A0Y(interfaceC2619Bfl, 0);
        try {
            TreeWithGraphQL treeWithGraphQLA00 = DZB.A00(interfaceC2619Bfl);
            if (treeWithGraphQLA00 == null) {
                throw BV5.A0U("Unsupported model type: ", C60Q.A0e(interfaceC2619Bfl));
            }
            try {
                jSONObjectA18 = BV4.A19(treeWithGraphQLA00.asJSONNative(false, true));
            } catch (JSONException unused) {
                jSONObjectA18 = BV4.A18();
            }
            return C60O.A0o(jSONObjectA18);
        } catch (JSONException e) {
            e = e;
            objArrA1b = BV7.A1b(e);
            str = "Encountered JSONException when converting GraphQL model to an OSS json string. Error: %s";
            CFK.A0E("graphQLModelToOSSJSONStr", str, e, objArrA1b);
            return "";
        } catch (Exception e2) {
            e = e2;
            objArrA1b = BV7.A1b(e);
            str = "Encountered exception when converting GraphQL model to an OSS json string. Error: %s";
            CFK.A0E("graphQLModelToOSSJSONStr", str, e, objArrA1b);
            return "";
        }
    }
}
