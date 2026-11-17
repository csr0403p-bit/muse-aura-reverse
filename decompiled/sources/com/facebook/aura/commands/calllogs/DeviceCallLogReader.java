package com.facebook.aura.commands.calllogs;

import X.AbstractC0878AGe;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C60R;
import X.C7BY;
import X.FGI;
import X.HtJ;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CallLog;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class DeviceCallLogReader {
    public static final DeviceCallLogReader INSTANCE = new DeviceCallLogReader();

    public static /* synthetic */ Object readCallLog$default(DeviceCallLogReader deviceCallLogReader, Context context, int i, String str, Integer num, Long l, Long l2, HtJ htJ, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            num = null;
        }
        if ((i2 & 16) != 0) {
            l = null;
        }
        if ((i2 & 32) != 0) {
            l2 = null;
        }
        return deviceCallLogReader.readCallLog(context, i, str, num, l, l2, htJ);
    }

    public final Object readCallLog(Context context, int i, String str, Integer num, Long l, Long l2, HtJ<? super CanonicalCallLogPayload> htJ) {
        long jCurrentTimeMillis;
        List list;
        if (context.checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            list = C0881AGi.A00;
        } else {
            ArrayList arrayListA0h = C3cG.A0h();
            String[] strArr = {"_id", "number", "name", "type", "date", "duration"};
            ArrayList arrayListA0h2 = C3cG.A0h();
            ArrayList arrayListA0h3 = C3cG.A0h();
            if (str != null && !C7BY.A0j(str)) {
                arrayListA0h2.add("(number LIKE ? OR name LIKE ?)");
                arrayListA0h3.add(FGI.A0U("%", str, "%"));
                arrayListA0h3.add(FGI.A0U("%", str, "%"));
            }
            if (num != null) {
                arrayListA0h2.add("type = ?");
                arrayListA0h3.add(String.valueOf(num.intValue()));
            }
            if (l != null) {
                C60R.A1F(l, "date > ?", arrayListA0h2, arrayListA0h3);
            }
            if (l2 != null) {
                C60R.A1F(l2, "date <= ?", arrayListA0h2, arrayListA0h3);
            }
            String strA0L = AbstractC0878AGe.A0L(" AND ", "", "", arrayListA0h2, null);
            if (strA0L.length() == 0) {
                strA0L = null;
            }
            String[] strArr2 = arrayListA0h3.isEmpty() ? null : (String[]) arrayListA0h3.toArray(new String[0]);
            Uri.Builder builderBuildUpon = CallLog.Calls.CONTENT_URI.buildUpon();
            if (i != Integer.MAX_VALUE) {
                builderBuildUpon.appendQueryParameter(PhotosSearchHandlerKt.PARAM_LIMIT, String.valueOf(i));
            }
            try {
                Cursor cursorQuery = context.getContentResolver().query(builderBuildUpon.build(), strArr, strA0L, strArr2, "date DESC");
                if (cursorQuery != null) {
                    try {
                        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                        int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("number");
                        int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("name");
                        int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("type");
                        int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("date");
                        int columnIndexOrThrow6 = cursorQuery.getColumnIndexOrThrow("duration");
                        while (cursorQuery.moveToNext()) {
                            long j = cursorQuery.getLong(columnIndexOrThrow);
                            String string = cursorQuery.getString(columnIndexOrThrow2);
                            if (string == null) {
                                string = "";
                            }
                            arrayListA0h.add(new CanonicalCallLogEntry(j, string, cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getLong(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6)));
                        }
                        cursorQuery.close();
                    } finally {
                    }
                }
            } catch (Exception e) {
                C3cH.A1B("Failed to read call log: ", e.getMessage(), DeviceCallLogReaderKt.TAG, e);
            }
            arrayListA0h.size();
            jCurrentTimeMillis = System.currentTimeMillis();
            list = arrayListA0h;
        }
        return new CanonicalCallLogPayload("android", jCurrentTimeMillis, list);
    }
}
