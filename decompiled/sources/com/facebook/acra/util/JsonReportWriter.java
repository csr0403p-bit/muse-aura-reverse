package com.facebook.acra.util;

import X.AnonymousClass002;
import X.BV4;
import X.C3cH;
import X.C60O;
import X.CFK;
import android.util.JsonWriter;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes5.dex */
public class JsonReportWriter {
    public static String LOG_TAG = "JsonReportWriter";

    public static void writeJsonReport(Map<String, String> map, Map<String, InputStreamField> map2, OutputStream outputStream) throws IOException {
        JsonWriter jsonWriter = new JsonWriter(new OutputStreamWriter(outputStream, HatchWebPageParserKt.UTF_8));
        jsonWriter.setIndent("  ");
        jsonWriter.beginObject();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (entryA0l.getValue() == null) {
                CFK.A0F(LOG_TAG, "Ignoring NULL Field %s", entryA0l.getKey());
            } else {
                jsonWriter.name(C60O.A0t(entryA0l)).value((String) entryA0l.getValue());
            }
        }
        Iterator itA0n2 = AnonymousClass002.A0n(map2);
        while (itA0n2.hasNext()) {
            Map.Entry entryA0l2 = C3cH.A0l(itA0n2);
            entryA0l2.getKey();
            entryA0l2.getValue();
            InputStreamField inputStreamField = (InputStreamField) entryA0l2.getValue();
            InputStream inputStream = inputStreamField.mInputStream;
            if (inputStream instanceof FileInputStream) {
                ((FileInputStream) inputStream).getChannel().position(0L);
            }
            try {
                jsonWriter.name(C60O.A0t(entryA0l2)).value(AttachmentUtil.loadAttachment(inputStream, (int) inputStreamField.mLength));
            } catch (Throwable th) {
                jsonWriter.name(C60O.A0t(entryA0l2)).value("");
                CFK.A0D(LOG_TAG, "Attachment skipped len %d ", th, BV4.A1X(inputStreamField.mLength));
            }
        }
        jsonWriter.endObject();
        jsonWriter.close();
    }

    public static boolean writeGzipJsonReport(Map<String, String> map, Map<String, InputStreamField> map2, File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        System.currentTimeMillis();
        try {
            FileOutputStream fileOutputStreamA0I = BV4.A0I(file);
            try {
                writeGzipJsonReport(map, map2, fileOutputStreamA0I);
                fileOutputStreamA0I.close();
                System.currentTimeMillis();
                file.length();
                return true;
            } finally {
            }
        } catch (IOException e) {
            CFK.A0C(LOG_TAG, "Could not write report %s", e, file.getPath());
            return false;
        }
    }

    public static void writeGzipJsonReport(Map<String, String> map, Map<String, InputStreamField> map2, OutputStream outputStream) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            writeJsonReport(map, map2, gZIPOutputStream);
            gZIPOutputStream.close();
        } catch (Throwable th) {
            try {
                gZIPOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }
}
