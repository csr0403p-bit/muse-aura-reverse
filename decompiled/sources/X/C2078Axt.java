package X;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* renamed from: X.Axt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2078Axt extends InputConnectionWrapper {
    public final /* synthetic */ InterfaceC2124Ayq A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2078Axt(InputConnection inputConnection, InterfaceC2124Ayq interfaceC2124Ayq) {
        super(inputConnection, false);
        this.A00 = interfaceC2124Ayq;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (this.A00.ASI(bundle, inputContentInfo != null ? new C2129Ayx(new C2109AyZ(inputContentInfo)) : null, i)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
