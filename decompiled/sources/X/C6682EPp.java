package X;

import android.database.Cursor;
import libraries.access.src.main.base.contentprovider.transformers.TransformerException;

/* renamed from: X.EPp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6682EPp implements EQ5 {
    @Override // X.EQ5
    public final EPY AhF(Cursor cursor, EPM epm, EPi ePi) {
        throw C8j3.A18("Not implemented");
    }

    @Override // X.EQ5
    public final EPY AhG(Cursor cursor, EPi ePi) {
        throw C8j3.A18("Not implemented");
    }

    @Override // X.EQ5
    public final C6683EPv AhH(Cursor cursor, EnumC7407Eul enumC7407Eul) {
        AnonymousClass003.A0v(cursor, enumC7407Eul);
        int columnIndex = cursor.getColumnIndex("id");
        if (columnIndex == -1) {
            throw new TransformerException("Column not found.");
        }
        String string = cursor.getString(columnIndex);
        if (string == null || string.length() == 0) {
            return null;
        }
        return new C6683EPv(string, EPM.A0Q, enumC7407Eul);
    }
}
