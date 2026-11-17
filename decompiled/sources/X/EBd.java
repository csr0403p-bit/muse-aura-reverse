package X;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;

/* loaded from: classes5.dex */
public final class EBd {
    public final EditText A00;
    public final EBc A01;

    public final KeyListener A00(KeyListener keyListener) {
        boolean z = keyListener instanceof NumberKeyListener;
        if (!(!z) || (keyListener instanceof EBi)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return !z ? new EBi(keyListener) : keyListener;
    }

    public final InputConnection A01(EditorInfo editorInfo, InputConnection inputConnection) {
        EBc eBc = this.A01;
        if (inputConnection == null) {
            return null;
        }
        return !(inputConnection instanceof EBb) ? new EBb(editorInfo, inputConnection, eBc.A00) : inputConnection;
    }

    public final void A02(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.A00.getContext().obtainStyledAttributes(attributeSet, FYT.A08, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            A03(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void A03(boolean z) {
        EBe eBe = this.A01.A01;
        if (eBe.A01 != z) {
            if (eBe.A00 != null) {
                E9X e9xA00 = E9X.A00();
                AbstractC6499E9g abstractC6499E9g = eBe.A00;
                BeS.A03(abstractC6499E9g, "initCallback cannot be null");
                ReadWriteLock readWriteLock = e9xA00.A05;
                readWriteLock.writeLock().lock();
                try {
                    ArrayList arrayListA0h = C3cG.A0h();
                    Set<C6498E9f> set = e9xA00.A04;
                    for (C6498E9f c6498E9f : set) {
                        if (c6498E9f.A00 == abstractC6499E9g) {
                            arrayListA0h.add(c6498E9f);
                        }
                    }
                    Iterator it = arrayListA0h.iterator();
                    while (it.hasNext()) {
                        set.remove((C6498E9f) it.next());
                    }
                } finally {
                    BV4.A1P(readWriteLock);
                }
            }
            eBe.A01 = z;
            if (z) {
                EBe.A00(eBe.A04, E9X.A00().A01());
            }
        }
    }

    public EBd(EditText editText) {
        this.A00 = editText;
        this.A01 = new EBc(editText);
    }
}
