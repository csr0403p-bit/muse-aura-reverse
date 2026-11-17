package X;

import android.content.Context;
import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import com.facebook.aura.mobileconfig.AuraSessionlessMobileConfigFetcher;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.graphlite.ApiRequestFailedException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLProtocolException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class C9Y implements C4U {
    public static final String BUG_REPORT_ATTACHMENTS_ENDPOINT = "attachments";
    public static final String BUG_REPORT_ENDPOINT = "bugs";
    public static final long DELAY_MULTIPLIER = 3000;
    public static final String TAG = "lacrima";
    public String mAppId;
    public C9N<C3286C9d> mCallback;
    public String mClientToken;
    public String mDeviceId;
    public Integer mTimeoutMilliSecond;
    public String mUserAgent;
    public AbstractC3287C9e mUserSessionManager;

    public static void A01(Writer writer, String str, String str2, String str3) throws IOException {
        writer.append("--").append((CharSequence) str).append(HttpRequestMultipart.LINE_FEED);
        writer.append("Content-Disposition: form-data; name=\"").append((CharSequence) str2).append("\"").append(HttpRequestMultipart.LINE_FEED);
        writer.append("Content-Type: text/plain; charset=").append(HatchWebPageParserKt.UTF_8).append(HttpRequestMultipart.LINE_FEED);
        writer.append(HttpRequestMultipart.LINE_FEED);
        writer.append((CharSequence) str3).append(HttpRequestMultipart.LINE_FEED);
        writer.flush();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Object] */
    public static <T> T executeWithRetry(Class<? extends Exception> cls, Integer num, Callable<T> callable, C9N<C3286C9d> c9n, String str, File file, boolean z) throws Exception {
        File file2;
        String str2;
        C9N<C3286C9d> c9n2;
        InterfaceC3234C4r interfaceC3234C4rA00;
        String str3;
        int i = 0;
        while (true) {
            T tCall = (T) "attempts: ";
            try {
                c9n2 = c9n;
                str2 = str;
                file2 = file;
                tCall = callable.call();
                return tCall;
            } catch (SocketException | SocketTimeoutException | UnknownHostException | SSLProtocolException e) {
                e = e;
                if (c9n != null) {
                    c9n2.onFlytrapRequestException(e, i, str2, file2, Boolean.valueOf(z));
                }
                i++;
                CFK.A0J(TAG, e, AnonymousClass006.A0y(num, " retries: ", C60O.A0y(tCall, i)));
                if (i > num.intValue()) {
                    interfaceC3234C4rA00 = C2Q.A00();
                    str3 = "BugReportRetriesFailedRetriable";
                    break;
                }
                Thread.sleep(i * 3000);
            } catch (Exception e2) {
                e = e2;
                if (c9n != null) {
                    c9n2.onFlytrapRequestException(e, i, str2, file2, Boolean.valueOf(z));
                }
                i++;
                CFK.A0J(TAG, e, AnonymousClass006.A0y(num, " retries: ", C60O.A0y(tCall, i)));
                if (!BV6.A1Y(cls, e) || i > num.intValue()) {
                    interfaceC3234C4rA00 = C2Q.A00();
                    str3 = "BugReportRetriesFailed";
                }
            }
        }
        interfaceC3234C4rA00.AT9(str3, e, null);
        throw e;
    }

    public abstract String getAttachmentEndpoint();

    /* renamed from: lambda$sendAttachment$0$com-facebook-errorreporting-lacrima-sender-post-bugreport-BugReportPostSender, reason: not valid java name */
    public /* synthetic */ String m23xb88d2233(Map map, File file, String str, String str2, String str3, boolean z) throws NumberFormatException {
        Map mapA0u = map;
        String strA0U = str2;
        String str4 = str3;
        List listSingletonList = Collections.singletonList(new C7472ExF(file, file.getName()));
        long j = Long.parseLong(str);
        String str5 = this.mClientToken;
        String str6 = this.mAppId;
        String str7 = this.mUserAgent;
        Integer num = this.mTimeoutMilliSecond;
        if (mapA0u == null) {
            mapA0u = BV4.A0u();
        }
        String strA0J = FGI.A0J("===", System.currentTimeMillis(), "===");
        BV4.A0u().putAll(BV4.A0u());
        HttpURLConnection httpURLConnection = null;
        try {
            if (strA0U == null) {
                string = z ? null : str6;
                strA0U = FGI.A0U(str6, "|", str5);
            } else if (!z) {
                string = Long.toString(j);
            }
            if (str4 == null) {
                str4 = AuraSessionlessMobileConfigFetcher.BASE_URL;
            }
            StringBuilder sbA0w = C60O.A0w();
            if (string == null) {
                sbA0w.append(str4);
            } else {
                sbA0w.append(str4);
                sbA0w.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
                sbA0w.append(string);
            }
            URL url = new URL(C60P.A1M(CustomConnectorRegisterRepositoryKt.ROOT_PATH, "bug_attachments", sbA0w));
            mapA0u.put(NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM, strA0U);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            httpURLConnection2.setConnectTimeout(num != null ? num.intValue() : 10000);
            httpURLConnection2.setReadTimeout(num != null ? num.intValue() : 10000);
            httpURLConnection2.setRequestProperty("User-Agent", str7);
            httpURLConnection2.setDoInput(true);
            httpURLConnection2.setRequestProperty("Content-Type", FGI.A0M("multipart/form-data; boundary=", strA0J));
            httpURLConnection2.setDoOutput(true);
            httpURLConnection2.setChunkedStreamingMode(0);
            httpURLConnection2.setRequestProperty("Transfer-Encoding", "chunked");
            OutputStream outputStream = httpURLConnection2.getOutputStream();
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(outputStream, HatchWebPageParserKt.UTF_8));
            Iterator itA0n = AnonymousClass002.A0n(mapA0u);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                A01(printWriter, strA0J, C60O.A0t(entryA0l), (String) entryA0l.getValue());
            }
            Iterator it = listSingletonList.iterator();
            while (it.hasNext()) {
                A00((C7472ExF) it.next(), outputStream, printWriter, strA0J);
            }
            printWriter.append((CharSequence) "--").append((CharSequence) strA0J).append((CharSequence) "--").append((CharSequence) HttpRequestMultipart.LINE_FEED);
            printWriter.close();
            httpURLConnection2.connect();
            if (httpURLConnection2.getResponseCode() != 200) {
                throw new ApiRequestFailedException(httpURLConnection2.getResponseCode(), httpURLConnection2.getResponseMessage(), httpURLConnection2.getHeaderFields());
            }
            BufferedReader bufferedReaderA0J = BV5.A0J(httpURLConnection2.getInputStream());
            StringBuilder sbA0w2 = C60O.A0w();
            while (true) {
                String line = bufferedReaderA0J.readLine();
                if (line == null) {
                    String string = sbA0w2.toString();
                    httpURLConnection2.disconnect();
                    return string;
                }
                sbA0w2.append(line);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    public abstract void processParamsForAttachment(Map<String, String> map);

    @Override // X.C4U
    public abstract boolean send(String str, File file, C4S c4s, Map<String, File> map, int i, C4T c4t);

    public static void A00(C7472ExF c7472ExF, OutputStream outputStream, Writer writer, String str) throws IOException {
        writer.append("--").append((CharSequence) str).append(HttpRequestMultipart.LINE_FEED);
        Writer writerAppend = writer.append("Content-Disposition: form-data; name=\"").append((CharSequence) c7472ExF.A02).append("\"; filename=\"");
        File file = c7472ExF.A00;
        writerAppend.append((CharSequence) file.getName()).append("\"").append(HttpRequestMultipart.LINE_FEED);
        writer.append("Content-Type: ").append((CharSequence) c7472ExF.A01).append(HttpRequestMultipart.LINE_FEED);
        writer.append("Content-Transfer-Encoding: binary").append(HttpRequestMultipart.LINE_FEED);
        writer.append(HttpRequestMultipart.LINE_FEED);
        writer.flush();
        FileInputStream fileInputStreamA0H = BV4.A0H(file);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = fileInputStreamA0H.read(bArr);
                if (i <= 0) {
                    outputStream.flush();
                    fileInputStreamA0H.close();
                    writer.append(HttpRequestMultipart.LINE_FEED);
                    writer.flush();
                    return;
                }
                outputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            fileInputStreamA0H.close();
            throw th;
        }
    }

    public static void A02(Throwable th, List list, Properties properties) {
        properties.getProperty("client_id");
        C3286C9d c3286C9d = new C3286C9d();
        c3286C9d.A00 = th;
        c3286C9d.A01 = list;
    }

    private Map<String, File> excludeReportsFromAttachments(String str, Map<String, File> map) throws JSONException {
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                if (!string.isEmpty()) {
                    map.remove(string);
                }
            }
            return map;
        } catch (JSONException e) {
            CFK.A0L(TAG, e, "Exception reading excludedReports");
            C2Q.A00().AT9("BugReportExcludeReport", e, null);
            return map;
        }
    }

    public static boolean isBugReportAttachmentField(String str) {
        return str.equals("config_id") || str.equals("id");
    }

    private Map<String, String> parseBugReportParams(Properties properties) throws JSONException {
        String property = properties.getProperty("metadata");
        JSONObject jSONObjectA18 = BV4.A18();
        JSONObject jSONObjectA182 = BV4.A18();
        if (property != null) {
            try {
                jSONObjectA18 = BV4.A19(property);
            } catch (JSONException e) {
                CFK.A0C(TAG, "Exception while parsing metadata JSON: %s", e, BV7.A1b(e));
            }
            try {
                jSONObjectA182 = jSONObjectA18.getJSONObject("misc_info");
            } catch (JSONException e2) {
                CFK.A0C(TAG, "Exception while parsing misc_info JSON: %s", e2, BV7.A1b(e2));
            }
        }
        HashMap mapA0u = BV4.A0u();
        Set<String> setStringPropertyNames = properties.stringPropertyNames();
        if (setStringPropertyNames == null) {
            throw BV4.A0a("Property names are null, cannot parse any params when generating bug report");
        }
        try {
            Iterator<String> it = setStringPropertyNames.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                String property2 = properties.getProperty(strA0j);
                property2.getClass();
                if (strA0j.equals("user_identifier") && processUserIdentifier(property2) == null) {
                    property2 = this.mDeviceId;
                } else if (!isPrimaryBugReportField(strA0j)) {
                    jSONObjectA182.put(strA0j, property2);
                }
                mapA0u.put(strA0j, property2);
            }
            if (property != null) {
                jSONObjectA18.put("misc_info", jSONObjectA182.toString());
                mapA0u.put("metadata", jSONObjectA18.toString());
                return mapA0u;
            }
        } catch (JSONException e3) {
            CFK.A0C(TAG, "Exception while parsing JSON to add misc_info: %s", e3, BV7.A1b(e3));
            C2Q.A00().AT9("BugReportJson", e3, null);
        }
        return mapA0u;
    }

    public static String processUserIdentifier(String str) {
        if (str == null || str.equals("unknown")) {
            return null;
        }
        return str;
    }

    private boolean sendAttachment(Properties properties, String str, boolean z, boolean z2) {
        Map<String, String> bugReportAttachmentsParams = parseBugReportAttachmentsParams(properties);
        String property = properties.getProperty("id");
        property.getClass();
        String property2 = properties.getProperty("attachment_paths");
        property2.getClass();
        properties.getProperty("include_logs_and_diagnostics", "");
        boolean zEquals = properties.getProperty("is_device_attachment", "").equals("true");
        LinkedList linkedListA0y = BV4.A0y();
        try {
            JSONArray jSONArray = new JSONArray(property2);
            for (int i = 0; i < jSONArray.length(); i++) {
                linkedListA0y.add(jSONArray.getString(i));
            }
            try {
                Iterator it = linkedListA0y.iterator();
                while (it.hasNext()) {
                    try {
                        File fileA0G = BV4.A0G(AnonymousClass005.A0j(it));
                        executeWithRetry(SocketTimeoutException.class, BV4.A0Y(), new CallableC7570F4j(this, fileA0G, bugReportAttachmentsParams, property, this.mUserSessionManager.provideAccessToken(), str, 0, z), this.mCallback, properties.getProperty("client_id"), fileA0G, zEquals);
                    } catch (Exception e) {
                        e = e;
                        CFK.A0J(TAG, e, "Exception while sending bug report attachments.");
                        C2Q.A00().AT9("BugReportAttachmentSend", e, null);
                        if (this.mCallback != null) {
                            A02(e, linkedListA0y, properties);
                        }
                        return false;
                    }
                }
                if (this.mCallback == null || !z2) {
                    return true;
                }
                try {
                    A02(null, linkedListA0y, properties);
                    return true;
                } catch (Exception e2) {
                    e = e2;
                    CFK.A0J(TAG, e, "Exception while sending bug report attachments.");
                    C2Q.A00().AT9("BugReportAttachmentSend", e, null);
                    if (this.mCallback != null && z2) {
                        A02(e, linkedListA0y, properties);
                    }
                    return false;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (JSONException e4) {
            CFK.A0J(TAG, e4, "Exception while parsing attachment paths JSON.");
            C2Q.A00().AT9("BugReportAttachmentParse", e4, null);
            if (this.mCallback != null && z2) {
                A02(e4, null, properties);
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b5, code lost:
    
        if (r6.equals(r9) != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0188  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean doSend(java.util.Properties r23, java.util.Map<java.lang.String, java.io.File> r24, int r25, X.C4T r26, java.lang.String r27, boolean r28) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9Y.doSend(java.util.Properties, java.util.Map, int, X.C4T, java.lang.String, boolean):boolean");
    }

    /* renamed from: lambda$doSend$0$com-facebook-errorreporting-lacrima-sender-post-bugreport-BugReportPostSender, reason: not valid java name */
    public /* synthetic */ String m22x7584b71b(String str, Map map, List list, String str2, String str3, boolean z) {
        Map mapA0u = map;
        String strA0U = str2;
        String str4 = str3;
        long j = str != null ? Long.parseLong(str) : 0L;
        String str5 = this.mClientToken;
        String str6 = this.mAppId;
        String str7 = this.mUserAgent;
        Integer num = this.mTimeoutMilliSecond;
        if (mapA0u == null) {
            mapA0u = BV4.A0u();
        }
        String strA0J = FGI.A0J("===", System.currentTimeMillis(), "===");
        BV4.A0u().putAll(BV4.A0u());
        HttpURLConnection httpURLConnection = null;
        try {
            if (str2 == null) {
                string = z ? null : str6;
                strA0U = FGI.A0U(str6, "|", str5);
            } else if (!z) {
                string = Long.toString(j);
            }
            if (str3 == null) {
                str4 = AuraSessionlessMobileConfigFetcher.BASE_URL;
            }
            StringBuilder sbA0w = C60O.A0w();
            if (string == null) {
                sbA0w.append(str4);
            } else {
                sbA0w.append(str4);
                sbA0w.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
                sbA0w.append(string);
            }
            URL url = new URL(C60P.A1M(CustomConnectorRegisterRepositoryKt.ROOT_PATH, BUG_REPORT_ENDPOINT, sbA0w));
            mapA0u.put(NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM, strA0U);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            httpURLConnection2.setConnectTimeout(num != null ? num.intValue() : 10000);
            httpURLConnection2.setReadTimeout(num != null ? num.intValue() : 10000);
            httpURLConnection2.setRequestProperty("User-Agent", str7);
            httpURLConnection2.setDoInput(true);
            httpURLConnection2.setRequestProperty("Content-Type", FGI.A0M("multipart/form-data; boundary=", strA0J));
            httpURLConnection2.setDoOutput(true);
            httpURLConnection2.setChunkedStreamingMode(0);
            httpURLConnection2.setRequestProperty("Transfer-Encoding", "chunked");
            OutputStream outputStream = httpURLConnection2.getOutputStream();
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(outputStream, HatchWebPageParserKt.UTF_8));
            Iterator itA0n = AnonymousClass002.A0n(mapA0u);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                A01(printWriter, strA0J, C60O.A0t(entryA0l), (String) entryA0l.getValue());
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A00((C7472ExF) it.next(), outputStream, printWriter, strA0J);
                }
            }
            printWriter.append((CharSequence) "--").append((CharSequence) strA0J).append((CharSequence) "--").append((CharSequence) HttpRequestMultipart.LINE_FEED);
            printWriter.close();
            httpURLConnection2.connect();
            if (httpURLConnection2.getResponseCode() != 200) {
                throw new ApiRequestFailedException(httpURLConnection2.getResponseCode(), httpURLConnection2.getResponseMessage(), httpURLConnection2.getHeaderFields());
            }
            BufferedReader bufferedReaderA0J = BV5.A0J(httpURLConnection2.getInputStream());
            StringBuilder sbA0w2 = C60O.A0w();
            while (true) {
                String line = bufferedReaderA0J.readLine();
                if (line == null) {
                    String string = sbA0w2.toString();
                    httpURLConnection2.disconnect();
                    return string;
                }
                sbA0w2.append(line);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    public C9Y(AbstractC3287C9e abstractC3287C9e, String str, String str2, String str3, String str4, Integer num, C9N<C3286C9d> c9n) {
        this.mUserSessionManager = abstractC3287C9e;
        this.mClientToken = str;
        this.mAppId = str2;
        this.mUserAgent = str3;
        this.mDeviceId = str4;
        this.mTimeoutMilliSecond = num;
        this.mCallback = c9n;
    }

    private String collectLoggingParams(Properties properties, Map<String, File> map) {
        try {
            Map<String, String> bugReportParams = parseBugReportParams(properties);
            HashMap mapA0u = BV4.A0u();
            mapA0u.put("attachmentsLength", Integer.toString(map.size()));
            Iterator itA10 = BV5.A10(map);
            long length = 0;
            while (itA10.hasNext()) {
                File file = (File) itA10.next();
                mapA0u.put(FGI.A0M("File attachment: ", file.getAbsolutePath()), Long.toString(file.length()));
                length += file.length();
            }
            mapA0u.put("attachmentsSize", Long.toString(length));
            Iterator itA0n = AnonymousClass002.A0n(bugReportParams);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                mapA0u.put(C60O.A0t(entryA0l), Integer.toString(((String) entryA0l.getValue()).length()));
            }
            return new JSONObject(mapA0u).toString();
        } catch (Exception e) {
            C2Q.A00().AT9("CollectingLoggingDetailsForSendingReport", e, null);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isPrimaryBugReportField(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r2 = 1
            r1 = 0
            switch(r0) {
                case -804450504: goto La;
                case -450004177: goto Ld;
                case -283289187: goto L10;
                case -173687103: goto L14;
                default: goto L9;
            }
        L9:
            return r1
        La:
            java.lang.String r0 = "config_id"
            goto L16
        Ld:
            java.lang.String r0 = "metadata"
            goto L16
        L10:
            java.lang.String r0 = "user_identifier"
            goto L16
        L14:
            java.lang.String r0 = "client_time"
        L16:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9Y.isPrimaryBugReportField(java.lang.String):boolean");
    }

    private Map<String, String> parseBugReportAttachmentsParams(Properties properties) {
        HashMap mapA0u = BV4.A0u();
        Set<String> setStringPropertyNames = properties.stringPropertyNames();
        if (setStringPropertyNames == null) {
            throw BV4.A0a("Property names are null, cannot parse any params when generating bug report");
        }
        Iterator<String> it = setStringPropertyNames.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            if (isBugReportAttachmentField(strA0j)) {
                String property = properties.getProperty(strA0j);
                property.getClass();
                mapA0u.put(strA0j, property);
            }
        }
        processParamsForAttachment(mapA0u);
        return mapA0u;
    }

    public boolean canSend(Context context, C4T c4t) {
        return C9h.A00(context);
    }
}
