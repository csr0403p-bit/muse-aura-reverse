package com.facebook.graphql.query;

import X.BV4;
import X.CGM;
import X.FGI;
import android.content.Context;
import android.util.Log;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class JSONPersistedQueryProvider implements CGM {
    public final JSONObject A00;
    public final String A01;

    @Override // X.CGM
    public final String buildConfigName() {
        return this.A01;
    }

    @Override // X.CGM
    public final String clientDocIdForQuery(String str) throws JSONException {
        String string = null;
        try {
            JSONObject jSONObject = this.A00.getJSONObject(str);
            if (jSONObject != null) {
                string = jSONObject.getString("client_doc_id");
                return string;
            }
        } catch (JSONException e) {
            Log.w("com.facebook.graphql.query.JSONPersistedQueryProvider", e);
        }
        return string;
    }

    @Override // X.CGM
    public final String schemaForQuery(String str) throws JSONException {
        String string = null;
        try {
            JSONObject jSONObject = this.A00.getJSONObject(str);
            if (jSONObject != null) {
                string = jSONObject.getString("schema");
                return string;
            }
        } catch (JSONException e) {
            Log.w("com.facebook.graphql.query.JSONPersistedQueryProvider", e);
        }
        return string;
    }

    public JSONPersistedQueryProvider(Context context, String str) throws IOException {
        JSONObject jSONObjectA18;
        this.A01 = str;
        try {
            InputStream inputStreamOpen = context.getAssets().open(FGI.A0M(str, "_client_persist_ids.json"));
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            jSONObjectA18 = BV4.A19(new String(bArr, HatchWebPageParserKt.UTF_8));
        } catch (IOException e) {
            Log.w("com.facebook.graphql.query.JSONPersistedQueryProvider", e);
            jSONObjectA18 = BV4.A18();
        }
        this.A00 = jSONObjectA18;
    }

    @Override // X.CGM
    public final String persistIdForQuery(String str) {
        return null;
    }
}
