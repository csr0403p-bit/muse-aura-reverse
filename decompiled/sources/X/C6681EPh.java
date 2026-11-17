package X;

import android.database.Cursor;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import libraries.access.src.main.base.contentprovider.transformers.TransformerException;

/* renamed from: X.EPh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6681EPh implements EQ5 {
    public final EPM A00;

    @Override // X.EQ5
    public final EPY AhF(Cursor cursor, EPM epm, EPi ePi) {
        throw new TransformerException("LiteProvider not used in Frl.");
    }

    @Override // X.EQ5
    public final C6683EPv AhH(Cursor cursor, EnumC7407Eul enumC7407Eul) {
        throw C8j3.A18("Not implemented");
    }

    public C6681EPh(EPM epm) {
        this.A00 = epm;
    }

    @Override // X.EQ5
    public final EPY AhG(Cursor cursor, EPi ePi) {
        AnonymousClass003.A0u(cursor, ePi);
        int columnIndex = cursor.getColumnIndex(ErrorReportingConstants.USER_ID_KEY);
        int columnIndex2 = cursor.getColumnIndex(NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM);
        if (columnIndex == -1 || columnIndex2 == -1) {
            throw new TransformerException("Column not found.");
        }
        String string = cursor.getString(columnIndex);
        String string2 = cursor.getString(columnIndex2);
        if (string == null || string2 == null) {
            return null;
        }
        return new EPY(string, string2, "FRL", new C7144EhA(9), this.A00, ePi);
    }
}
