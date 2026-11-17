package X;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class An0 implements ViewTranslationCallback {
    public static final An0 A00 = new An0();

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onClearTranslation(View view) {
        C0864A6l c0864A6lA00;
        Function0 function0;
        C7384Etj.A0Z(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        AndroidContentCaptureManager androidContentCaptureManager = ((AndroidComposeView) view).A06;
        androidContentCaptureManager.A04 = C79.A00;
        Ab0<C1629An1> ab0A06 = androidContentCaptureManager.A06();
        Object[] objArr = ab0A06.A04;
        long[] jArr = ab0A06.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((C8j5.A0A(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                int iA0E = 8 - C8j3.A0E(i, length);
                for (int i2 = 0; i2 < iA0E; i2++) {
                    if ((255 & j) < 128) {
                        C0919AHv c0919AHv = ((C1629An1) C8j3.A11(objArr, i, i2)).A00.A04;
                        if (AlP.A01(c0919AHv, AbstractC1671Anw.A0N) != null && (c0864A6lA00 = AlP.A00(c0919AHv, AbstractC1578Alt.A00)) != null && (function0 = (Function0) c0864A6lA00.A01) != null) {
                            function0.invoke();
                        }
                    }
                    j >>= 8;
                }
                if (iA0E != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onHideTranslation(View view) {
        C0864A6l c0864A6lA00;
        G0U g0u;
        C7384Etj.A0Z(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        AndroidContentCaptureManager androidContentCaptureManager = ((AndroidComposeView) view).A06;
        androidContentCaptureManager.A04 = C79.A00;
        Ab0<C1629An1> ab0A06 = androidContentCaptureManager.A06();
        Object[] objArr = ab0A06.A04;
        long[] jArr = ab0A06.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((C8j5.A0A(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                int iA0E = 8 - C8j3.A0E(i, length);
                for (int i2 = 0; i2 < iA0E; i2++) {
                    if ((255 & j) < 128) {
                        C0919AHv c0919AHv = ((C1629An1) C8j3.A11(objArr, i, i2)).A00.A04;
                        if (C3cG.A1P(AlP.A01(c0919AHv, AbstractC1671Anw.A0N), true) && (c0864A6lA00 = AlP.A00(c0919AHv, AbstractC1578Alt.A0S)) != null && (g0u = (G0U) c0864A6lA00.A01) != null) {
                            AnonymousClass001.A1K(false, g0u);
                        }
                    }
                    j >>= 8;
                }
                if (iA0E != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onShowTranslation(View view) {
        C0864A6l c0864A6lA00;
        G0U g0u;
        C7384Etj.A0Z(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        AndroidContentCaptureManager androidContentCaptureManager = ((AndroidComposeView) view).A06;
        androidContentCaptureManager.A04 = C79.A01;
        Ab0<C1629An1> ab0A06 = androidContentCaptureManager.A06();
        Object[] objArr = ab0A06.A04;
        long[] jArr = ab0A06.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((C8j5.A0A(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                int iA0E = 8 - C8j3.A0E(i, length);
                for (int i2 = 0; i2 < iA0E; i2++) {
                    if ((255 & j) < 128) {
                        C0919AHv c0919AHv = ((C1629An1) C8j3.A11(objArr, i, i2)).A00.A04;
                        if (C3cG.A1P(AlP.A01(c0919AHv, AbstractC1671Anw.A0N), false) && (c0864A6lA00 = AlP.A00(c0919AHv, AbstractC1578Alt.A0S)) != null && (g0u = (G0U) c0864A6lA00.A01) != null) {
                            AnonymousClass001.A1K(true, g0u);
                        }
                    }
                    j >>= 8;
                }
                if (iA0E != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
