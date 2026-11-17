package X;

import android.R;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuL implements InputConnection {
    public final InterfaceC2061AxY A00;
    public final InputConnection A01;
    public final C2077Axs A02;
    public final C0910AHm<G0U<InterfaceC2036Awq, Unit>> A03 = C0910AHm.A01(new G0U[16]);

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, final int i) {
        if (charSequence != null) {
            InterfaceC2061AxY interfaceC2061AxY = this.A00;
            final String string = charSequence.toString();
            interfaceC2061AxY.A9r(new G0U() { // from class: X.Au1
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    int iA02;
                    int iA01;
                    String str = string;
                    int i2 = i;
                    C1891AtA c1891AtA = (C1891AtA) obj;
                    Au3 au3 = c1891AtA.A02;
                    if (au3 != null) {
                        long j = au3.A00;
                        iA02 = C8j3.A0G(j);
                        iA01 = AnonymousClass002.A09(j);
                    } else {
                        long j2 = c1891AtA.A00;
                        iA02 = Au3.A02(j2);
                        iA01 = Au3.A01(j2);
                    }
                    AbstractC1921Ati.A01(c1891AtA, str, iA02, iA01);
                    int iA022 = Au3.A02(c1891AtA.A00) + i2;
                    int iA04 = ATD.A04(i2 > 0 ? iA022 - 1 : iA022 - str.length(), 0, c1891AtA.A05.length());
                    c1891AtA.A04(AbstractC1815ArZ.A00(iA04, iA04));
                    return Unit.INSTANCE;
                }
            });
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        int i2;
        switch (i) {
            case R.id.selectAll:
                InterfaceC2061AxY interfaceC2061AxY = this.A00;
                interfaceC2061AxY.A9r(new BT6(interfaceC2061AxY, 0, At0.A00(((C1923Atk) interfaceC2061AxY).A05), 2));
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
            default:
                return false;
        }
        sendKeyEvent(new KeyEvent(0, i2));
        sendKeyEvent(new KeyEvent(1, i2));
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        return this.A00.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.A03.A09();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        if (completionInfo == null) {
            return false;
        }
        completionInfo.getText();
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return this.A01.commitContent(inputContentInfo, i, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        InterfaceC2061AxY interfaceC2061AxY = this.A00;
        interfaceC2061AxY.A9r(new BT6(interfaceC2061AxY, i, i2, 3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(final int i, final int i2) {
        this.A00.A9r(new G0U() { // from class: X.Aty
            /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
            @Override // X.G0U
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r11) {
                /*
                    r10 = this;
                    int r5 = r1
                    int r4 = r2
                    X.AtA r11 = (X.C1891AtA) r11
                    r6 = 0
                    r10 = 1
                    if (r5 < 0) goto La1
                    if (r4 < 0) goto La1
                    r8 = 0
                    r9 = 0
                Le:
                    if (r8 >= r5) goto L40
                    int r7 = r9 + 1
                    long r0 = r11.A00
                    int r0 = X.Au3.A02(r0)
                    if (r0 <= r7) goto L3f
                    X.Atg r3 = r11.A05
                    int r0 = r0 - r7
                    int r0 = r0 - r10
                    char r2 = r3.charAt(r0)
                    long r0 = r11.A00
                    int r0 = X.Au3.A02(r0)
                    int r0 = r0 - r7
                    char r1 = r3.charAt(r0)
                    boolean r0 = java.lang.Character.isHighSurrogate(r2)
                    if (r0 == 0) goto L3b
                    boolean r0 = java.lang.Character.isLowSurrogate(r1)
                    int r9 = r9 + 2
                    if (r0 != 0) goto L3c
                L3b:
                    r9 = r7
                L3c:
                    int r8 = r8 + 1
                    goto Le
                L3f:
                    r9 = r0
                L40:
                    r2 = 0
                L41:
                    if (r6 >= r4) goto L88
                    int r7 = r2 + 1
                    long r0 = r11.A00
                    int r1 = X.Au3.A01(r0)
                    int r1 = r1 + r7
                    X.Atg r5 = r11.A05
                    int r0 = r5.length()
                    if (r1 >= r0) goto L7d
                    long r0 = r11.A00
                    int r0 = X.Au3.A01(r0)
                    int r0 = r0 + r7
                    int r0 = r0 - r10
                    char r3 = r5.charAt(r0)
                    long r0 = r11.A00
                    int r0 = X.Au3.A01(r0)
                    int r0 = r0 + r7
                    char r1 = r5.charAt(r0)
                    boolean r0 = java.lang.Character.isHighSurrogate(r3)
                    if (r0 == 0) goto L79
                    boolean r0 = java.lang.Character.isLowSurrogate(r1)
                    int r2 = r2 + 2
                    if (r0 != 0) goto L7a
                L79:
                    r2 = r7
                L7a:
                    int r6 = r6 + 1
                    goto L41
                L7d:
                    int r2 = r5.length()
                    long r0 = r11.A00
                    int r0 = X.Au3.A01(r0)
                    int r2 = r2 - r0
                L88:
                    long r0 = r11.A00
                    int r1 = X.Au3.A01(r0)
                    int r0 = r1 + r2
                    X.AbstractC1921Ati.A00(r11, r1, r0)
                    long r0 = r11.A00
                    int r1 = X.Au3.A02(r0)
                    int r0 = r1 - r9
                    X.AbstractC1921Ati.A00(r11, r0, r1)
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                La1:
                    java.lang.String r2 = "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were "
                    java.lang.String r1 = " and "
                    java.lang.String r0 = " respectively."
                    java.lang.String r0 = X.FGI.A0Y(r2, r1, r0, r5, r4)
                    X.AbstractC1061ATk.A00(r0)
                    X.F60 r0 = X.F60.createAndThrow()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1935Aty.invoke(java.lang.Object):java.lang.Object");
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return this.A00.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        this.A00.A9r(new C2279BSf(23));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        TransformedTextFieldState transformedTextFieldState = ((C1923Atk) this.A00).A05;
        return TextUtils.getCapsMode(transformedTextFieldState.A07(), Au3.A02(At0.A01(transformedTextFieldState)), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        At0 at0A07 = ((C1923Atk) this.A00).A05.A07();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = at0A07;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = at0A07.length();
        extractedText.partialStartOffset = -1;
        C9tI.A0t(extractedText, at0A07, at0A07.A00);
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        TransformedTextFieldState transformedTextFieldState = ((C1923Atk) this.A00).A05;
        if (At0.A03(transformedTextFieldState)) {
            return null;
        }
        At0 at0A07 = transformedTextFieldState.A07();
        return At0.A02(at0A07, at0A07.A00);
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        At0 at0A07 = ((C1923Atk) this.A00).A05.A07();
        int iA01 = Au3.A01(at0A07.A00);
        int length = iA01 + i;
        if (((i ^ length) & (iA01 ^ length)) < 0) {
            length = at0A07.length();
        }
        return at0A07.subSequence(iA01, Math.min(length, at0A07.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        At0 at0A07 = ((C1923Atk) this.A00).A05.A07();
        int iA02 = Au3.A02(at0A07.A00);
        int i3 = iA02 - i;
        if (((i ^ iA02) & (iA02 ^ i3)) < 0) {
            i3 = 0;
        }
        return at0A07.subSequence(Math.max(0, i3), iA02).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performEditorAction(int r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L5
            switch(r2) {
                case 2: goto L22;
                case 3: goto L20;
                case 4: goto L1e;
                case 5: goto L1c;
                case 6: goto L1a;
                case 7: goto L18;
                default: goto L5;
            }
        L5:
            r2 = 1
        L6:
            X.AxY r0 = r1.A00
            X.Atk r0 = (X.C1923Atk) r0
            X.G0U<androidx.compose.ui.text.input.ImeAction, kotlin.Unit> r1 = r0.A08
            if (r1 == 0) goto L16
            androidx.compose.ui.text.input.ImeAction r0 = new androidx.compose.ui.text.input.ImeAction
            r0.<init>(r2)
            r1.invoke(r0)
        L16:
            r0 = 1
            return r0
        L18:
            r2 = 5
            goto L6
        L1a:
            r2 = 7
            goto L6
        L1c:
            r2 = 6
            goto L6
        L1e:
            r2 = 4
            goto L6
        L20:
            r2 = 3
            goto L6
        L22:
            r2 = 2
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AuL.performEditorAction(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC1997Aw6.A00(handwritingGesture, this.A00, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        return this.A01.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return AbstractC1997Aw6.A02(cancellationSignal, previewableHandwritingGesture, this.A00);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        ((C1923Atk) this.A00).A02.A01(i);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        AbstractC2034Awo abstractC2034Awo = (AbstractC2034Awo) ((C1923Atk) this.A00).A01;
        abstractC2034Awo.A00().dispatchKeyEventFromInputMethod(abstractC2034Awo.A01, keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        InterfaceC2061AxY interfaceC2061AxY = this.A00;
        interfaceC2061AxY.A9r(new BT6(interfaceC2061AxY, i, i2, 4));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        Spanned spanned;
        BG3 bg3;
        C1824Aro c1824Aro;
        if (charSequence != null) {
            InterfaceC2061AxY interfaceC2061AxY = this.A00;
            String string = charSequence.toString();
            ArrayList arrayList = null;
            if ((charSequence instanceof Spanned) && (spanned = (Spanned) charSequence) != null) {
                ArrayList arrayListA0h = null;
                for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
                    if (obj instanceof BackgroundColorSpan) {
                        long j = B6A.A07;
                        long j2 = C1809ArT.A01;
                        c1824Aro = new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j, j2, j2, ((BackgroundColorSpan) obj).getBackgroundColor() << 32);
                    } else if (obj instanceof ForegroundColorSpan) {
                        long jA0U = C8j3.A0U(((ForegroundColorSpan) obj).getForegroundColor());
                        long j3 = C1809ArT.A01;
                        c1824Aro = new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, jA0U, j3, j3, B6A.A07);
                    } else {
                        if (obj instanceof StrikethroughSpan) {
                            bg3 = BG3.A01;
                        } else {
                            if (obj instanceof StyleSpan) {
                                int style = ((StyleSpan) obj).getStyle();
                                if (style == 1) {
                                    C1736ApY c1736ApY = C1736ApY.A01;
                                    long j4 = B6A.A07;
                                    long j5 = C1809ArT.A01;
                                    c1824Aro = new C1824Aro(null, null, null, null, null, c1736ApY, null, null, null, null, null, j4, j5, j5, j4);
                                } else if (style == 2) {
                                    B0A b0a = new B0A(1);
                                    long j6 = B6A.A07;
                                    long j7 = C1809ArT.A01;
                                    c1824Aro = new C1824Aro(null, null, null, b0a, null, null, null, null, null, null, null, j6, j7, j7, j6);
                                } else if (style == 3) {
                                    C1736ApY c1736ApY2 = C1736ApY.A01;
                                    B0A b0a2 = new B0A(1);
                                    long j8 = B6A.A07;
                                    long j9 = C1809ArT.A01;
                                    c1824Aro = new C1824Aro(null, null, null, b0a2, null, c1736ApY2, null, null, null, null, null, j8, j9, j9, j8);
                                }
                            } else if (obj instanceof TypefaceSpan) {
                                TypefaceSpan typefaceSpan = (TypefaceSpan) obj;
                                String family = typefaceSpan.getFamily();
                                AbstractC1996Aw5 c2005AwE = AbstractC1996Aw5.A00;
                                if (!"cursive".equals(family)) {
                                    c2005AwE = AbstractC1996Aw5.A01;
                                    if (!"monospace".equals(family)) {
                                        c2005AwE = AbstractC1996Aw5.A02;
                                        if (!"sans-serif".equals(family)) {
                                            c2005AwE = AbstractC1996Aw5.A03;
                                            if (!"serif".equals(family)) {
                                                String family2 = typefaceSpan.getFamily();
                                                c2005AwE = null;
                                                if (family2 != null && family2.length() != 0) {
                                                    Typeface typefaceCreate = Typeface.create(family2, 0);
                                                    Typeface typeface = Typeface.DEFAULT;
                                                    if (!C7384Etj.areEqual(typefaceCreate, typeface) && !C7384Etj.areEqual(typefaceCreate, Typeface.create(typeface, 0)) && typefaceCreate != null) {
                                                        c2005AwE = new C2005AwE(new AzI(typefaceCreate));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                long j10 = B6A.A07;
                                long j11 = C1809ArT.A01;
                                c1824Aro = new C1824Aro(null, null, c2005AwE, null, null, null, null, null, null, null, null, j10, j11, j11, j10);
                            } else if (obj instanceof UnderlineSpan) {
                                bg3 = BG3.A03;
                            }
                        }
                        long j12 = B6A.A07;
                        long j13 = C1809ArT.A01;
                        c1824Aro = new C1824Aro(null, null, null, null, null, null, null, null, bg3, null, null, j12, j13, j13, j12);
                    }
                    if (arrayListA0h == null) {
                        arrayListA0h = C3cG.A0h();
                    }
                    C1733ApU.A00(c1824Aro, arrayListA0h, spanned.getSpanStart(obj), spanned.getSpanEnd(obj));
                }
                arrayList = arrayListA0h;
            }
            interfaceC2061AxY.A9r(new C2304BTe(arrayList, string, i, 0));
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        InterfaceC2061AxY interfaceC2061AxY = this.A00;
        interfaceC2061AxY.A9r(new BT6(interfaceC2061AxY, i, i2, 2));
        AnonymousClass001.A1K(false, ((C1923Atk) interfaceC2061AxY).A09);
        return true;
    }

    public AuL(EditorInfo editorInfo, InterfaceC2061AxY interfaceC2061AxY) {
        this.A00 = interfaceC2061AxY;
        C2077Axs c2077Axs = new C2077Axs(this);
        this.A02 = c2077Axs;
        AuU auU = new AuU(this);
        if (editorInfo == null) {
            throw new NullPointerException("editorInfo must be non-null");
        }
        this.A01 = new C2078Axt(c2077Axs, auU);
    }
}
