package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.Fhw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8644Fhw implements InterfaceC8647Fhz {
    public static void A00(Matrix matrix, float f, float f2) {
        matrix.postTranslate((int) (f + 0.5f), (int) (f2 + 0.5f));
    }

    @Override // X.InterfaceC8647Fhz
    public final void ALy(Matrix matrix, Rect rect, float f, float f2, int i, int i2) {
        float fWidth;
        float fHeight;
        float fMax;
        float fMax2;
        float f3 = i;
        float fWidth2 = rect.width() / f3;
        float f4 = i2;
        float fHeight2 = rect.height() / f4;
        if (this instanceof C8648Fi0) {
            float fMin = Math.min(fWidth2, fHeight2);
            matrix.setScale(fMin, fMin);
            A00(matrix, rect.left + ((rect.width() - (f3 * fMin)) * 0.5f), rect.top + ((rect.height() - (f4 * fMin)) * 0.5f));
            return;
        }
        if (this instanceof C8645Fhx) {
            if (fHeight2 > fWidth2) {
                float f5 = f3 * fHeight2;
                fMax = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f * f5), 0.0f), rect.width() - f5);
                fMax2 = rect.top;
                fWidth2 = fHeight2;
            } else {
                fMax = rect.left;
                float f6 = f4 * fWidth2;
                fMax2 = Math.max(Math.min((rect.height() * 0.5f) - (f2 * f6), 0.0f), rect.height() - f6) + rect.top;
            }
            matrix.setScale(fWidth2, fWidth2);
            A00(matrix, fMax, fMax2);
            return;
        }
        if (this instanceof C8653Fi6) {
            float f7 = rect.top;
            matrix.setScale(fHeight2, fHeight2);
            A00(matrix, rect.left + ((rect.width() - (f3 * fHeight2)) * 0.5f), f7);
            return;
        }
        if (this instanceof C8654Fi7) {
            float f8 = rect.left;
            float f9 = rect.top;
            matrix.setScale(fWidth2, fHeight2);
            A00(matrix, f8, f9);
            return;
        }
        if (this instanceof Fi5) {
            matrix.setScale(fWidth2, fWidth2);
            A00(matrix, rect.left, rect.top + ((rect.height() - (f4 * fWidth2)) * 0.5f));
            return;
        }
        if (this instanceof C8652Fi4) {
            float fMin2 = Math.min(fWidth2, fHeight2);
            float f10 = rect.left;
            float f11 = rect.top;
            matrix.setScale(fMin2, fMin2);
            A00(matrix, f10, f11);
            return;
        }
        if (this instanceof C8649Fi1) {
            float fMin3 = Math.min(fWidth2, fHeight2);
            matrix.setScale(fMin3, fMin3);
            A00(matrix, rect.left + (rect.width() - (f3 * fMin3)), rect.top + (rect.height() - (f4 * fMin3)));
            return;
        }
        if (this instanceof C8650Fi2) {
            float fMin4 = Math.min(fWidth2, fHeight2);
            matrix.setScale(fMin4, fMin4);
            A00(matrix, rect.left, rect.top + (rect.height() - (f4 * fMin4)));
            return;
        }
        if (this instanceof C8646Fhy) {
            float fMin5 = Math.min(Math.min(fWidth2, fHeight2), 1.0f);
            matrix.setScale(fMin5, fMin5);
            A00(matrix, rect.left + ((rect.width() - (f3 * fMin5)) * 0.5f), rect.top + ((rect.height() - (f4 * fMin5)) * 0.5f));
            return;
        }
        if (!(this instanceof C8651Fi3)) {
            matrix.setTranslate((int) (rect.left + ((rect.width() - i) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i2) * 0.5f) + 0.5f));
            return;
        }
        int i3 = rect.left;
        if (fHeight2 > fWidth2) {
            fWidth = i3 + ((rect.width() - (f3 * fHeight2)) * 0.5f);
            fHeight = rect.top;
            fWidth2 = fHeight2;
        } else {
            fWidth = i3;
            fHeight = ((rect.height() - (f4 * fWidth2)) * 0.5f) + rect.top;
        }
        matrix.setScale(fWidth2, fWidth2);
        A00(matrix, fWidth, fHeight);
    }
}
