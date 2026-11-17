package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes5.dex */
public final class DDL implements Runnable {
    public static final String __redex_internal_original_name = "CacheMetadataLookup$batchExecutionRunnable$1";
    public final /* synthetic */ DDK A00;

    public DDL(DDK ddk) {
        this.A00 = ddk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue<DDN> concurrentLinkedQueue;
        String str;
        String[] strArr;
        String str2;
        DDK ddk = this.A00;
        ArrayList arrayListA0h = C3cG.A0h();
        while (true) {
            concurrentLinkedQueue = ddk.A09;
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
            DDN ddnPoll = concurrentLinkedQueue.poll();
            if (ddnPoll != null) {
                arrayListA0h.add(ddnPoll);
            }
        }
        if (!arrayListA0h.isEmpty()) {
            try {
                DDW ddw = (DDW) ddk.A05;
                if (!arrayListA0h.isEmpty()) {
                    try {
                        try {
                            SQLiteDatabase writableDatabase = ddw.getWritableDatabase();
                            try {
                                writableDatabase.beginTransaction();
                                Iterator it = arrayListA0h.iterator();
                                while (it.hasNext()) {
                                    DDN ddn = (DDN) it.next();
                                    int iOrdinal = ddn.A00.ordinal();
                                    if (iOrdinal == 0) {
                                        DDM ddm = ddn.A01;
                                        if (ddm != null) {
                                            ContentValues contentValues = new ContentValues();
                                            contentValues.put("videoId", ddm.A02);
                                            contentValues.put("cacheKey", ddm.A00);
                                            contentValues.put("filePath", ddm.A01);
                                            writableDatabase.insertWithOnConflict("video_cache_entries", null, contentValues, 4);
                                        }
                                    } else {
                                        if (iOrdinal != 1) {
                                            throw C3cG.A0q();
                                        }
                                        DDM ddm2 = ddn.A01;
                                        if (ddm2 == null || (str2 = ddm2.A01) == null || str2.length() <= 0) {
                                            str = "videoId = ? AND cacheKey = ?";
                                            strArr = new String[]{ddn.A03, ddn.A02};
                                        } else {
                                            str = "videoId = ? AND cacheKey = ? AND filePath = ?";
                                            strArr = new String[]{ddn.A03, ddn.A02, str2};
                                        }
                                        writableDatabase.delete("video_cache_entries", str, strArr);
                                    }
                                }
                                writableDatabase.setTransactionSuccessful();
                            } catch (Exception e) {
                                BzX.A00("VideoCacheDatabaseHelper", "Failed to process batch update operations", e);
                                if (writableDatabase.inTransaction()) {
                                }
                            }
                            if (writableDatabase.inTransaction()) {
                                writableDatabase.endTransaction();
                            }
                        } finally {
                        }
                    } catch (Exception e2) {
                        BzX.A00("VideoCacheDatabaseHelper", "Failed to end transaction", e2);
                    }
                }
                ddk.A00 = 0;
            } catch (Exception e3) {
                int i = ddk.A00 + 1;
                ddk.A00 = i;
                CFK.A0A("CacheMetadataLookup", FGI.A0I("Batch update failed (attempt ", i, "/3)"), e3);
                if (ddk.A00 < 3) {
                    concurrentLinkedQueue.addAll(arrayListA0h);
                } else {
                    CFK.A04("CacheMetadataLookup", FGI.A0I("Batch update failed 3 times \u2014 dropping ", arrayListA0h.size(), " operations"));
                    ddk.A00 = 0;
                }
            }
        }
        Handler handler = ddk.A0G;
        if (handler != null) {
            Runnable runnable = ddk.A07;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, ddk.A01);
        }
    }
}
