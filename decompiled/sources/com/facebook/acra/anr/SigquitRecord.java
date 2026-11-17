package com.facebook.acra.anr;

import X.BV4;
import X.C3cG;
import X.C8j3;
import X.CFK;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class SigquitRecord {
    public static final long ERROR_READING_TIME_INFO = -1;
    public static final String TAG = "SigquitRecord";
    public static final ArrayList<SigquitRecord> sRecords = C3cG.A0h();
    public final long callbackUptimeMs;
    public final long sigquitUptimeMs;

    public static long convertRawBytesToLong(byte[] bArr) {
        long j = 0;
        int i = 0;
        int i2 = 0;
        do {
            j += (bArr[i] & 255) << i2;
            i2 += 8;
            i++;
        } while (i < 8);
        return j;
    }

    public static synchronized String getRecordsJson(Long l) {
        String string;
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<SigquitRecord> it = sRecords.iterator();
            while (it.hasNext()) {
                SigquitRecord next = it.next();
                if (l != null && next.callbackUptimeMs > l.longValue()) {
                    break;
                }
                JSONObject jSONObjectA18 = BV4.A18();
                jSONObjectA18.put("callback_uptime_ms", next.callbackUptimeMs);
                jSONObjectA18.put("sigquit_uptime_ms", next.sigquitUptimeMs);
                jSONArray.put(jSONObjectA18);
            }
            string = jSONArray.toString();
            if (string == null) {
                string = "";
            }
        } catch (JSONException unused) {
            string = "\"json error\"";
        }
        return string;
    }

    public static long readSigquitUptimeMs(String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                byte[] bArr = new byte[8];
                if (fileInputStream.read(bArr) != 8) {
                    CFK.A0H(TAG, "Corrupted file %s", str);
                    fileInputStream.close();
                    return -1L;
                }
                long jA05 = BV4.A05(convertRawBytesToLong(bArr));
                fileInputStream.close();
                return jA05;
            } finally {
            }
        } catch (IOException e) {
            CFK.A0H(TAG, "Could not read from file %s", str, e);
            return -1L;
        }
    }

    public static void updateRecords(long j, String str) {
        if (str != null) {
            synchronized (SigquitRecord.class) {
                ArrayList<SigquitRecord> arrayList = sRecords;
                if (arrayList.size() <= 0 || arrayList.get(C8j3.A0K(arrayList)).callbackUptimeMs != j) {
                    arrayList.add(new SigquitRecord(j, readSigquitUptimeMs(str)));
                }
            }
        }
    }

    public SigquitRecord(long j, long j2) {
        this.callbackUptimeMs = j;
        this.sigquitUptimeMs = j2;
    }
}
