package com.facebook.acra.util;

import X.AnonymousClass002;
import X.BV8;
import X.C3cH;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes5.dex */
public class HttpRequest {
    public static final int CHAR_ARRAY_BUFFER_SIZE = 256;
    public static final String POST_CONTENT_TYPE_FORM_URLENCODED = "application/x-www-form-urlencoded";
    public HttpConnectionProvider mConnectionProvider;
    public Map<String, String> mHeaders;

    public static void encodeParameters(Map<?, ?> map, OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        UrlEncodingWriter urlEncodingWriter = new UrlEncodingWriter(bufferedWriter);
        Iterator itA0n = AnonymousClass002.A0n(map);
        boolean z = true;
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            if (!z) {
                bufferedWriter.append('&');
            }
            Object value = entryA0l.getValue();
            if (value == null) {
                value = "";
            }
            urlEncodingWriter.write(key.toString());
            bufferedWriter.write(61);
            if (value instanceof InputStream) {
                transferData((InputStream) value, urlEncodingWriter);
            } else {
                urlEncodingWriter.write(value.toString());
            }
            z = false;
        }
        bufferedWriter.flush();
    }

    public static boolean transferData(InputStream inputStream, Writer writer) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[256];
        while (true) {
            try {
                int i = inputStreamReader.read(cArr);
                if (i == -1) {
                    return true;
                }
                writer.write(cArr, 0, i);
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public void sendPost(URL url, Map<?, ?> map, ACRAResponse aCRAResponse, String str) throws ProtocolException {
        HttpURLConnection connection = this.mConnectionProvider.getConnection(url);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("User-Agent", str);
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setRequestProperty("Content-Encoding", "gzip");
        Map<String, String> map2 = this.mHeaders;
        if (map2 != null && !map2.isEmpty()) {
            Iterator itA0n = AnonymousClass002.A0n(this.mHeaders);
            while (itA0n.hasNext()) {
                BV8.A1S(connection, itA0n);
            }
        }
        connection.setDoOutput(true);
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(AcraRadioMonitorBridge.createOutputDecorator(connection.getOutputStream()));
            encodeParameters(map, gZIPOutputStream);
            gZIPOutputStream.close();
            aCRAResponse.mStatus = connection.getResponseCode();
            connection.getInputStream().close();
        } finally {
            connection.disconnect();
        }
    }

    public HttpRequest(HttpConnectionProvider httpConnectionProvider) {
        this.mConnectionProvider = httpConnectionProvider;
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }
}
