package X;

import android.provider.Settings;
import androidx.compose.runtime.MutableState;
import com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3;

/* loaded from: classes4.dex */
public abstract class B2y {
    public static final C18j A00(BFM bfm, C6837Eap c6837Eap, int i, int i2, boolean z) {
        bfm.AgF(-180607681);
        boolean zA1Q = C60Q.A1Q(i2 & 2, z);
        boolean zA1L = AnonymousClass002.A1L(i2 & 4);
        EnumC1100AYl enumC1100AYl = EnumC1100AYl.Immediately;
        if (Float.isInfinite(1.0f) || Float.isNaN(1.0f)) {
            throw C60O.A0i(FGI.A0F("Speed must be a finite number. It is ", '.', 1.0f));
        }
        C18j c18jA01 = B36.A01(bfm);
        bfm.AgF(-3687241);
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = AbstractC1798ArH.A07(Boolean.valueOf(zA1Q), bfm);
        }
        BBI bbiA07 = C3cG.A07(bfm);
        bfm.AgF(-180606834);
        float f = 1.0f / Settings.Global.getFloat(AKO.A01(bbiA07).getContentResolver(), "animator_duration_scale", 1.0f);
        BBI.A0R(bbiA07, false);
        C78e.A08(bfm, new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3((MutableState) objAaT, c6837Eap, c18jA01, enumC1100AYl, null, null, f, i, zA1Q, zA1L, false, false), new Object[]{c6837Eap, Boolean.valueOf(zA1Q), null, Float.valueOf(f), Integer.valueOf(i)});
        BBI.A0R(bbiA07, false);
        return c18jA01;
    }
}
