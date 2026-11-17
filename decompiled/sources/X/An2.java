package X;

import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.List;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public final class An2 {
    public static final An2 A00 = new An2();

    public static final void A02(AndroidContentCaptureManager androidContentCaptureManager, Consumer consumer, long[] jArr) {
        String strA00;
        for (long j : jArr) {
            C1629An1 c1629An1A04 = androidContentCaptureManager.A06().A04((int) j);
            if (c1629An1A04 != null) {
                C1562Alc c1562Alc = c1629An1A04.A00;
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(androidContentCaptureManager.A0A.getAutofillId(), c1562Alc.A01);
                List list = (List) AlP.A01(c1562Alc.A04, AbstractC1671Anw.A0b);
                if (list != null && (strA00 = C1Vi.A00(PairsDiscretionDocument.TERMINATOR, "", "", list, null)) != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(AnonymousClass005.A0X(strA00)));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;Landroid/util/LongSparseArray<Landroid/view/translation/ViewTranslationResponse;>;)V */
    public final void A03(final LongSparseArray longSparseArray, final AndroidContentCaptureManager androidContentCaptureManager) {
        if (Build.VERSION.SDK_INT >= 31) {
            if (C7384Etj.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                A01(longSparseArray, androidContentCaptureManager);
            } else {
                androidContentCaptureManager.A0A.post(new Runnable() { // from class: X.An3
                    public static final String __redex_internal_original_name = "AndroidContentCaptureManager$ViewTranslationHelperMethods$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        An2.A00(longSparseArray, androidContentCaptureManager);
                    }
                });
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;Landroid/util/LongSparseArray<Landroid/view/translation/ViewTranslationResponse;>;)V */
    public static final void A01(LongSparseArray longSparseArray, AndroidContentCaptureManager androidContentCaptureManager) {
        TranslationResponseValue value;
        CharSequence text;
        C1629An1 c1629An1A04;
        C0864A6l c0864A6lA00;
        G0U g0u;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (c1629An1A04 = androidContentCaptureManager.A06().A04((int) jKeyAt)) != null && (c0864A6lA00 = AlP.A00(c1629An1A04.A00.A04, AbstractC1578Alt.A0R)) != null && (g0u = (G0U) c0864A6lA00.A01) != null) {
                g0u.invoke(AnonymousClass005.A0X(text.toString()));
            }
        }
    }

    public static final void A00(LongSparseArray longSparseArray, AndroidContentCaptureManager androidContentCaptureManager) {
        A01(longSparseArray, androidContentCaptureManager);
    }
}
