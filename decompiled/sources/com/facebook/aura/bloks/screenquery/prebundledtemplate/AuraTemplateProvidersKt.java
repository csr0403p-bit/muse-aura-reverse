package com.facebook.aura.bloks.screenquery.prebundledtemplate;

import X.C60O;
import X.C7384Etj;
import X.DCl;
import X.FFI;
import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public abstract class AuraTemplateProvidersKt {
    public static final String TAG = "AuraTemplateProvider";

    public static final String readTemplateJSON(Context context, String str) throws IOException {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            C7384Etj.A0U(inputStreamOpen);
            Reader inputStreamReader = new InputStreamReader(inputStreamOpen, DCl.A05);
            if (!(inputStreamReader instanceof BufferedReader)) {
                inputStreamReader = new BufferedReader(inputStreamReader, 8192);
            }
            try {
                StringWriter stringWriter = new StringWriter();
                char[] cArr = new char[8192];
                while (true) {
                    int i = inputStreamReader.read(cArr);
                    if (i < 0) {
                        String strA0o = C60O.A0o(stringWriter);
                        inputStreamReader.close();
                        return strA0o;
                    }
                    stringWriter.write(cArr, 0, i);
                }
            } finally {
            }
        } catch (IOException e) {
            FFI.A04(e);
            return null;
        }
    }
}
