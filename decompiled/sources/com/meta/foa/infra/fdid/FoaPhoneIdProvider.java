package com.meta.foa.infra.fdid;

import X.AbstractC6574EHs;
import X.BV5;
import X.C06977mk;
import X.C3cG;
import X.C6572EHo;
import X.C8j3;
import X.EHg;
import X.EHj;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class FoaPhoneIdProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    public FoaPhoneIdProvider(int i) {
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw C8j3.A17();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw C8j3.A17();
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw C8j3.A17();
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C6572EHo c6572EHoA00;
        try {
            getCallingPackage();
            Context context = getContext();
            if (!EHj.A01.A01(context) && !EHj.A00.A01(context)) {
                C06977mk.A00(context, null, EHj.A03);
                C06977mk.A00(context, null, EHj.A02);
            }
            ArrayList arrayListA0h = C3cG.A0h();
            ArrayList arrayListA0h2 = C3cG.A0h();
            getContext();
            EHg eHg = AbstractC6574EHs.A00;
            if (eHg != null && (c6572EHoA00 = eHg.A00()) != null) {
                getContext();
                arrayListA0h.add("COL_PHONE_ID");
                arrayListA0h.add("COL_TIMESTAMP");
                arrayListA0h.add("COL_ORIGIN");
                arrayListA0h2.add(c6572EHoA00.A01);
                arrayListA0h2.add(Long.toString(c6572EHoA00.A00));
                arrayListA0h2.add(c6572EHoA00.A02);
            }
            getContext();
            if (arrayListA0h.isEmpty()) {
                return null;
            }
            MatrixCursor matrixCursor = new MatrixCursor(BV5.A1b(arrayListA0h, arrayListA0h.size()));
            matrixCursor.addRow(arrayListA0h2.toArray(new String[arrayListA0h2.size()]));
            return matrixCursor;
        } catch (Exception e) {
            Log.e("AbstractPhoneIdProvider", "Failed to call queryForIds", e);
            e.getMessage();
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw C8j3.A17();
    }

    public FoaPhoneIdProvider() {
    }
}
