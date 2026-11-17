package X;

import android.os.Bundle;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* renamed from: X.Axs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2077Axs extends InputConnectionWrapper {
    public C2077Axs(AuL auL) {
        super(auL, false);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }
}
