package X;

import android.os.Handler;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: X.E9g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6499E9g {
    public void A00() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A01() {
        EBh eBh;
        Handler handler;
        if (this instanceof EBf) {
            EBf eBf = (EBf) this;
            EditText editText = eBf.A00.get();
            if (editText == null) {
                return;
            }
            Handler handler2 = editText.getHandler();
            handler = handler2;
            eBh = eBf;
            if (handler2 == null) {
                return;
            }
        } else {
            EBh eBh2 = (EBh) this;
            TextView textView = eBh2.A00.get();
            if (textView == null) {
                return;
            }
            Handler handler3 = textView.getHandler();
            handler = handler3;
            eBh = eBh2;
            if (handler3 == null) {
                return;
            }
        }
        handler.post(eBh);
    }
}
