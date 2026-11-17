package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class C6I {
    public String A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final ApplicationExitInfo A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public static C6I A00(Context context, int i, boolean z) {
        ApplicationExitInfo applicationExitInfo;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
        if (activityManager != null) {
            String packageName = context.getPackageName();
            if (i == -1) {
                i = 0;
            }
            Trace.beginSection("AppExitInfo.getHistoricalProcessExitReasons");
            try {
                List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(packageName, i, 1);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty() && (applicationExitInfo = historicalProcessExitReasons.get(0)) != null) {
                    return new C6I(applicationExitInfo, ActivityManager.isLowMemoryKillReportSupported(), z);
                }
            } finally {
                Trace.endSection();
            }
        }
        return null;
    }

    public final int A01() {
        return this.A01;
    }

    public final int A02() {
        return this.A02;
    }

    public final int A03() {
        return this.A03;
    }

    public final int A04() {
        return this.A04;
    }

    public final long A05() {
        return this.A05;
    }

    public final long A06() {
        return this.A06;
    }

    public final long A07() {
        return this.A07;
    }

    public final ApplicationExitInfo A08() {
        return this.A08;
    }

    public final String A09() {
        return this.A09;
    }

    public final String A0A() {
        return this.A0A;
    }

    public final String A0B() {
        return this.A00;
    }

    public final boolean A0C() {
        return this.A0B;
    }

    public C6I(ApplicationExitInfo applicationExitInfo, boolean z, boolean z2) {
        String strSubstring;
        String string;
        int iIndexOf;
        int iIndexOf2;
        this.A08 = applicationExitInfo;
        this.A02 = applicationExitInfo.getPid();
        this.A09 = applicationExitInfo.getDescription();
        int reason = applicationExitInfo.getReason();
        this.A03 = reason;
        this.A04 = applicationExitInfo.getStatus();
        this.A01 = applicationExitInfo.getImportance();
        this.A07 = applicationExitInfo.getTimestamp();
        this.A0B = z;
        this.A05 = applicationExitInfo.getPss();
        this.A06 = applicationExitInfo.getRss();
        if (Build.VERSION.SDK_INT == 30 || (iIndexOf = (string = applicationExitInfo.toString()).indexOf("subreason=")) == -1) {
            strSubstring = null;
        } else {
            int iIndexOf3 = string.indexOf(" status=", iIndexOf);
            int i = iIndexOf + 10;
            strSubstring = iIndexOf3 == -1 ? string.substring(i) : string.substring(i, iIndexOf3);
            int iIndexOf4 = strSubstring.indexOf(40);
            if (iIndexOf4 != -1 && (iIndexOf2 = strSubstring.indexOf(41, iIndexOf4)) != -1) {
                strSubstring = strSubstring.substring(iIndexOf4 + 1, iIndexOf2);
            }
        }
        this.A0A = strSubstring;
        byte[] processStateSummary = applicationExitInfo.getProcessStateSummary();
        if (processStateSummary != null && processStateSummary.length == 24) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(processStateSummary);
            byteBufferWrap.getLong();
            new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong()).toString();
        }
        if (z2) {
            Trace.beginSection("AppExitInfo.readExitInfoTrace");
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                if (traceInputStream != null) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream(131072);
                        try {
                            byte[] bArr = new byte[16384];
                            while (true) {
                                int i2 = traceInputStream.read(bArr);
                                if (i2 <= 0) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, i2);
                                }
                            }
                            traceInputStream.close();
                        } catch (Throwable th) {
                            th = th;
                            try {
                                traceInputStream.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                    }
                }
            } finally {
                try {
                    if (byteArrayOutputStream != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                }
            }
            if (byteArrayOutputStream != null || byteArrayOutputStream.size() == 0) {
                return;
            }
            if (reason == 5) {
                this.A00 = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                return;
            }
            try {
                this.A00 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e) {
                CFK.A08("AppExitInfo", "Error encoding trace", e);
            }
        }
    }
}
