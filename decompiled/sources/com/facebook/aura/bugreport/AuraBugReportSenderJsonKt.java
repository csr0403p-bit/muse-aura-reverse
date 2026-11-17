package com.facebook.aura.bugreport;

import X.AbstractC07749im;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C07779iq;
import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import X.C9sU;
import X.CEV;
import X.DCl;
import X.F0H;
import X.FGI;
import android.util.Base64OutputStream;
import android.webkit.MimeTypeMap;
import com.facebook.aura.json.HatchJsonKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public abstract class AuraBugReportSenderJsonKt {
    public static final String buildStefiMiscInfoString(StefiMiscInfoJson stefiMiscInfoJson) {
        C7384Etj.A0Y(stefiMiscInfoJson, 0);
        return HatchJsonKt.HatchJson.A02(stefiMiscInfoJson, StefiMiscInfoJson$$serializer.INSTANCE);
    }

    public static final String parseSelectedModelName(JsonElement jsonElement) {
        Object objA0s;
        if (jsonElement != null) {
            try {
                objA0s = (BugReportModelGetResponseJson) HatchJsonKt.HatchJson.A01(BugReportModelGetResponseJson$$serializer.INSTANCE, jsonElement);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            BugReportModelGetResponseJson bugReportModelGetResponseJson = (BugReportModelGetResponseJson) objA0s;
            if (bugReportModelGetResponseJson != null) {
                BugReportModelGetPayloadJson bugReportModelGetPayloadJson = bugReportModelGetResponseJson.payload;
                if (bugReportModelGetPayloadJson != null) {
                    String str = bugReportModelGetPayloadJson.selected_model;
                    if (str.length() == 0) {
                        str = bugReportModelGetPayloadJson.display_name;
                    }
                    if (str.length() > 0) {
                        return str;
                    }
                } else {
                    String str2 = bugReportModelGetResponseJson.selected_model;
                    if (str2.length() == 0) {
                        str2 = bugReportModelGetResponseJson.display_name;
                    }
                    if (str2.length() > 0) {
                        return str2;
                    }
                }
            }
        }
        return null;
    }

    public static final StefiBugReportAttachmentResponseJson parseStefiAttachmentResponse(String str) {
        Object objA0s;
        C7384Etj.A0Y(str, 0);
        try {
            objA0s = (StefiBugReportAttachmentResponseJson) HatchJsonKt.HatchJson.A00(str, StefiBugReportAttachmentResponseJson$$serializer.INSTANCE);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        return (StefiBugReportAttachmentResponseJson) objA0s;
    }

    public static final String parseStefiBugId(String str) {
        Object objA0s;
        C7384Etj.A0Y(str, 0);
        try {
            objA0s = ((StefiBugResponseJson) HatchJsonKt.HatchJson.A00(str, StefiBugResponseJson$$serializer.INSTANCE)).bug_id;
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        String str2 = (String) objA0s;
        if (str2 == null || str2.length() <= 0) {
            return null;
        }
        return str2;
    }

    public static final void writeStefiAttachments(OutputStream outputStream, List<? extends File> list) throws IOException {
        AnonymousClass003.A0u(outputStream, list);
        outputStream.write(91);
        int i = 0;
        for (File file : list) {
            int i2 = i + 1;
            if (i > 0) {
                outputStream.write(44);
            }
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(AnonymousClass001.A0u(CEV.A01(file)));
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = "application/octet-stream";
            }
            C9sU c9sU = HatchJsonKt.HatchJson;
            String name = file.getName();
            C07779iq c07779iq = C07779iq.A01;
            String strA0h = FGI.A0h("{\"filename\":", c9sU.A02(name, AbstractC07749im.A00(c07779iq)), ",\"mime_type\":", c9sU.A02(mimeTypeFromExtension, c07779iq), ",\"data_base64\":\"");
            Charset charset = DCl.A05;
            outputStream.write(strA0h.getBytes(charset));
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Base64OutputStream base64OutputStream = new Base64OutputStream(outputStream, 18);
                try {
                    F0H.A00(fileInputStream, base64OutputStream);
                    base64OutputStream.close();
                    fileInputStream.close();
                    outputStream.write("\"}".getBytes(charset));
                    i = i2;
                } finally {
                }
            } finally {
            }
        }
        outputStream.write(93);
    }
}
