package com.facebook.aura.bloks.screenquery.prebundledtemplate;

import X.C7384Etj;
import android.content.Context;

/* loaded from: classes5.dex */
public final class AuraTemplateProvider {
    public static final AuraTemplateProvider INSTANCE = new AuraTemplateProvider();
    public static final String PATH = "json/bloks_screen_template.json";

    public static final String getTemplateJSON(Context context) {
        C7384Etj.A0Y(context, 0);
        return AuraTemplateProvidersKt.readTemplateJSON(context, PATH);
    }
}
