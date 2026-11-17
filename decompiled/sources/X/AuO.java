package X;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.input.ImeAction;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* loaded from: classes4.dex */
public final class AuO implements InputConnection {
    public int A00;
    public int A01;
    public C1805ArO A02;
    public boolean A03;
    public final C1897AtH A05;
    public final InterfaceC2155Azj A06;
    public final TextFieldSelectionManager A07;
    public final InterfaceC1079AXi A08;
    public final boolean A0A;
    public final List<AzK> A09 = C3cG.A0h();
    public boolean A04 = true;

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.A03 = z;
        if (z) {
            this.A01 = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        C1805ArO c1805ArO = this.A02;
        ExtractedText extractedText = new ExtractedText();
        String str = c1805ArO.A01.A00;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        C9tI.A0t(extractedText, str, c1805ArO.A00);
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    public static final void A00(AuO auO, AzK azK) {
        auO.A00++;
        try {
            auO.A09.add(azK);
        } finally {
            auO.A01();
        }
    }

    private final boolean A01() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            List<AzK> list = this.A09;
            if (!list.isEmpty()) {
                ((C2112Ayc) this.A06).A00.A07.invoke(new ArrayList(list));
                list.clear();
            }
        }
        return AnonymousClass002.A1N(this.A00);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        this.A00++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.A04;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.A09.clear();
        this.A00 = 0;
        this.A04 = false;
        List<WeakReference<AuO>> list = ((C2112Ayc) this.A06).A00.A06;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (C7384Etj.areEqual(list.get(i).get(), this)) {
                list.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.A04;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.A04;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.A04;
        return z ? this.A0A : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.A04;
        if (z) {
            A00(this, new C1916Atd(AnonymousClass005.A0X(String.valueOf(charSequence)), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        A00(this, new C1937Au0(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        A00(this, new C1936Atz(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        A00(this, new C2027Awg());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        C1805ArO c1805ArO = this.A02;
        return TextUtils.getCapsMode(c1805ArO.A01.A00, Au3.A02(c1805ArO.A00), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        C1805ArO c1805ArO = this.A02;
        long j = c1805ArO.A00;
        if (Au3.A04(j)) {
            return null;
        }
        return c1805ArO.A01.subSequence(Au3.A02(j), Au3.A01(j)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return AbstractC1862Asb.A00(this.A02, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return AbstractC1862Asb.A01(this.A02, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        int i2;
        boolean z = this.A04;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    A00(this, new AuH(0, C8j3.A0I(this.A02.A01)));
                    return false;
                case R.id.cut:
                    i2 = 277;
                    break;
                case R.id.copy:
                    i2 = 278;
                    break;
                case R.id.paste:
                    i2 = 279;
                    break;
            }
            sendKeyEvent(new KeyEvent(0, i2));
            sendKeyEvent(new KeyEvent(1, i2));
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        if (i != 0) {
            switch (i) {
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 5;
                    break;
                default:
                    Log.w("RecordingIC", FGI.A0H("IME sends unsupported Editor Action: ", i));
                    i2 = 1;
                    break;
            }
        } else {
            i2 = 1;
        }
        ((C2112Ayc) this.A06).A00.A08.invoke(new ImeAction(i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC1932Atv.A00(handwritingGesture, this.A05, this.A07, this.A08, executor, intConsumer, C2294BSu.A00(this, 26));
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.A04;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC1932Atv.A02(cancellationSignal, previewableHandwritingGesture, this.A05, this.A07);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean zA1L;
        boolean zA1L2;
        boolean zA1L3;
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        boolean z2 = false;
        boolean zA1L4 = AnonymousClass002.A1L(i & 1);
        boolean zA1L5 = AnonymousClass002.A1L(i & 2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            zA1L = AnonymousClass002.A1L(i & 16);
            zA1L2 = AnonymousClass002.A1L(i & 8);
            zA1L3 = AnonymousClass002.A1L(i & 4);
            if (i2 >= 34 && (i & 32) != 0) {
                z2 = true;
            }
            if (!zA1L && !zA1L2 && !zA1L3 && !z2) {
                z2 = false;
                zA1L = true;
                zA1L2 = true;
                zA1L3 = true;
                if (i2 >= 34) {
                    z2 = true;
                }
            }
        } else {
            zA1L = true;
            zA1L2 = true;
            zA1L3 = false;
        }
        AuR auR = ((C2112Ayc) this.A06).A00.A0B;
        synchronized (auR.A0B) {
            auR.A08 = zA1L;
            auR.A06 = zA1L2;
            auR.A07 = zA1L3;
            auR.A09 = z2;
            if (zA1L4) {
                auR.A05 = true;
                if (auR.A04 != null) {
                    AuR.A00(auR);
                }
            }
            auR.A0A = zA1L5;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((C2112Ayc) this.A06).A00.A0C.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.A04;
        if (z) {
            A00(this, new AuF(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.A04;
        if (z) {
            A00(this, new C1920Ath(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        A00(this, new AuH(i, i2));
        return true;
    }

    public AuO(C1897AtH c1897AtH, InterfaceC2155Azj interfaceC2155Azj, TextFieldSelectionManager textFieldSelectionManager, InterfaceC1079AXi interfaceC1079AXi, C1805ArO c1805ArO, boolean z) {
        this.A06 = interfaceC2155Azj;
        this.A0A = z;
        this.A05 = c1897AtH;
        this.A07 = textFieldSelectionManager;
        this.A08 = interfaceC1079AXi;
        this.A02 = c1805ArO;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return A01();
    }
}
