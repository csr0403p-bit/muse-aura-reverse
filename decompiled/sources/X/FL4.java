package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class FL4 extends EditText implements FLN {
    public FLW A00;
    public InterfaceC7922FKu A01;
    public String[] A02;

    public FL4(Context context) {
        super(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArr;
        C7384Etj.A0Y(editorInfo, 0);
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        Hpi hpi = new Hpi(inputConnectionOnCreateInputConnection, false);
        if (this.A00 == null || ((strArr = this.A02) != null && strArr.length == 0)) {
            return hpi;
        }
        WeakReference weakReferenceA0q = BV4.A0q(this);
        editorInfo.contentMimeTypes = this.A02;
        C2078Axt c2078Axt = new C2078Axt(hpi, new HuU(this));
        AbstractC8060FRo.A07(this, new FLH(weakReferenceA0q), this.A02);
        return c2078Axt;
    }

    public final InterfaceC7922FKu getSelectionChangedListener$fbandroid_libraries_rendercore_rendercore_primitive_components_textinput_textinput() {
        return null;
    }

    @Override // X.FLN
    public void setAllowedContentTypes(String[] strArr) {
        this.A02 = strArr;
        if (strArr == null) {
            AbstractC8060FRo.A07(this, null, null);
        }
    }

    @Override // X.FLN
    public void setContentCommittedListener(FLW flw) {
        this.A00 = flw;
        if (flw == null) {
            AbstractC8060FRo.A07(this, null, null);
        }
    }

    public final void setSelectionChangedListener$fbandroid_libraries_rendercore_rendercore_primitive_components_textinput_textinput(InterfaceC7922FKu interfaceC7922FKu) {
        this.A01 = interfaceC7922FKu;
    }

    @Override // android.widget.EditText
    public void setSelection(int i) {
        int length = length();
        if (i > length) {
            i = length;
        }
        super.setSelection(i);
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
    }

    public /* synthetic */ FL4(Context context, C06H c06h) {
        super(context, null);
    }

    @Override // android.widget.EditText
    public final void setSelection(int i, int i2) {
        int length = length();
        if (i > length) {
            i = length;
        }
        int length2 = length();
        if (i2 > length2) {
            i2 = length2;
        }
        super.setSelection(i, i2);
    }

    public FL4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
