package com.facebook.aura.network.sandbox;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C9X;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class AuraSandbox$httpHost$1 extends AbstractC7559F3s implements Function0<String> {
    public static final AuraSandbox$httpHost$1 INSTANCE = new AuraSandbox$httpHost$1();

    public AuraSandbox$httpHost$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        JSONObject jSONObjectA02 = C9X.A02("/settings/sandbox/web/sandbox");
        String strOptString = jSONObjectA02 != null ? jSONObjectA02.optString(BrowserOperationCatalogKt.VALUE, "") : "";
        C7384Etj.A0U(strOptString);
        return strOptString;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        JSONObject jSONObjectA02 = C9X.A02("/settings/sandbox/web/sandbox");
        String strOptString = "";
        if (jSONObjectA02 != null) {
            strOptString = jSONObjectA02.optString(BrowserOperationCatalogKt.VALUE, "");
        }
        C7384Etj.A0U(strOptString);
        return strOptString;
    }
}
