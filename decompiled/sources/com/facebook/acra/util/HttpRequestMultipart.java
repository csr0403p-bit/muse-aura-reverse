package com.facebook.acra.util;

import X.AnonymousClass002;
import X.BV8;
import X.C3cH;
import X.FGI;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes5.dex */
public class HttpRequestMultipart {
    public static final String CONTENT_DISPOSITION = "Content-Disposition";
    public static final String CONTENT_DISPOSITION_FILE = "form-data; filename=\"file\"; name=";
    public static final String CONTENT_DISPOSITION_FORM_DATA = "form-data; name=";
    public static final String CONTENT_TRANSFER_ENCODING = "Content-Transfer-Encoding";
    public static final String CONTENT_TRANSFER_ENCODING_BINARY = "binary";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CONTENT_TYPE_APP_BINARY = "application/binary";
    public static final String CONTENT_TYPE_FORM_MULTIPART_PREFIX = "multipart/form-data;boundary=";
    public static final String LINE_FEED = "\r\n";
    public static final int STREAM_BLOCK_SIZE = 8192;
    public static final String USER_AGENT = "User-Agent";
    public HttpConnectionProvider mConnectionProvider;
    public Map<String, String> mHeaders;

    public static void copyStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static byte[] generateMultipartEndFooter(String str) {
        return FGI.A0U("--", str, "--\r\n").getBytes();
    }

    public static byte[] generateMultipartHeader(String str, String str2, String str3) {
        return FGI.A0k("--", str, "\r\nContent-Disposition: ", str2, "\"", str3, "\"\r\nContent-Type: application/binary\r\nContent-Transfer-Encoding: binary\r\n\r\n").getBytes();
    }

    public static void writeAcraData(String str, OutputStream outputStream, String str2, Map<?, ?> map) throws IOException {
        outputStream.write(generateMultipartHeader(str2, CONTENT_DISPOSITION_FORM_DATA, str));
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        HttpRequest.encodeParameters(map, gZIPOutputStream);
        gZIPOutputStream.finish();
        outputStream.write(LINE_FEED.getBytes());
    }

    public void sendPost(URL url, Map<?, ?> map, Map<?, InputStreamField> map2, ACRAResponse aCRAResponse, String str, OutputStreamFactory outputStreamFactory) throws ProtocolException {
        HttpURLConnection connection = this.mConnectionProvider.getConnection(url);
        String strA0k = AnonymousClass002.A0k();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("User-Agent", str);
        connection.setRequestProperty("Content-Type", FGI.A0M(CONTENT_TYPE_FORM_MULTIPART_PREFIX, strA0k));
        Map<String, String> map3 = this.mHeaders;
        if (map3 != null && !map3.isEmpty()) {
            Iterator itA0n = AnonymousClass002.A0n(this.mHeaders);
            while (itA0n.hasNext()) {
                BV8.A1S(connection, itA0n);
            }
        }
        connection.setDoOutput(true);
        connection.setChunkedStreamingMode(0);
        try {
            OutputStream outputStream = connection.getOutputStream();
            try {
                OutputStream outputStreamCreateOutputDecorator = AcraRadioMonitorBridge.createOutputDecorator(outputStream);
                writeAcraData("acra_data", outputStreamCreateOutputDecorator, strA0k, map);
                Iterator itA0n2 = AnonymousClass002.A0n(map2);
                while (itA0n2.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n2);
                    InputStreamField inputStreamField = (InputStreamField) entryA0l.getValue();
                    boolean z = inputStreamField.mSendCompressed;
                    outputStreamCreateOutputDecorator.write(generateMultipartHeader(strA0k, inputStreamField.mSendAsAFile ? CONTENT_DISPOSITION_FILE : CONTENT_DISPOSITION_FORM_DATA, entryA0l.getKey().toString()));
                    OutputStream outputStreamCreate = outputStreamFactory.create(outputStreamCreateOutputDecorator);
                    copyStream(inputStreamField.mInputStream, outputStreamCreate);
                    if (z) {
                        outputStreamFactory.finish(outputStreamCreate);
                    }
                    outputStreamCreateOutputDecorator.write(LINE_FEED.getBytes());
                }
                outputStreamCreateOutputDecorator.write(generateMultipartEndFooter(strA0k));
                outputStreamCreateOutputDecorator.flush();
                aCRAResponse.mStatus = connection.getResponseCode();
                connection.getInputStream().close();
                if (outputStream != null) {
                    outputStream.close();
                }
            } finally {
            }
        } finally {
            connection.disconnect();
        }
    }

    public HttpRequestMultipart(HttpConnectionProvider httpConnectionProvider) {
        this.mConnectionProvider = httpConnectionProvider;
    }

    public static String generateBoundary() {
        return AnonymousClass002.A0k();
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }
}
