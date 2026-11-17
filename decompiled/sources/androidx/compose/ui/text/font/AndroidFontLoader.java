package androidx.compose.ui.text.font;

import X.B06;
import X.B09;
import X.B0C;
import X.B98;
import X.B9B;
import X.C7384Etj;
import X.CMG;
import android.content.Context;
import android.graphics.Typeface;

/* loaded from: classes4.dex */
public final class AndroidFontLoader implements B98 {
    public final Context A00;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    @Override // X.B98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A4y(X.B9B r8, X.HtJ<? super android.graphics.Typeface> r9) throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalAccessException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r7 = this;
            r3 = 17
            boolean r0 = r9 instanceof X.C2312BTm
            if (r0 == 0) goto L74
            r6 = r9
            X.BTm r6 = (X.C2312BTm) r6
            int r0 = r6.$t
            if (r0 != r3) goto L74
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r6.A00 = r2
        L18:
            java.lang.Object r3 = r6.A02
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L7f
            if (r0 != r1) goto L7a
            java.lang.Object r8 = r6.A01
            X.B9B r8 = (X.B9B) r8
            X.Hwg.A00(r3)
        L2d:
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
            X.B09 r8 = (X.B09) r8
            X.B08 r1 = r8.A01
            android.content.Context r0 = r7.A00
            android.graphics.Typeface r0 = X.B0C.A00(r0, r3, r1)
        L39:
            return r0
        L3a:
            X.Hwg.A00(r3)
            boolean r0 = r8 instanceof X.B06
            if (r0 == 0) goto L52
            X.B06 r8 = (X.B06) r8
            X.B0H r1 = r8.typefaceLoader
            android.content.Context r0 = r7.A00
            r6.A00 = r2
            com.facebook.aura.vds.compose.font.OptimisticAiFont$Loader r1 = (com.facebook.aura.vds.compose.font.OptimisticAiFont.Loader) r1
            android.graphics.Typeface r0 = r1.loadBlocking(r0, r8)
            if (r0 != r5) goto L39
            return r5
        L52:
            boolean r0 = r8 instanceof X.B09
            if (r0 == 0) goto L83
            r4 = r8
            X.B09 r4 = (X.B09) r4
            android.content.Context r3 = r7.A00
            r6.A01 = r8
            r6.A00 = r1
            X.GBL r2 = X.C7Bm.A04(r6)
            int r1 = r4.A00
            X.B0E r0 = new X.B0E
            r0.<init>(r4, r2)
            X.CMG.A02(r3, r0, r1)
            java.lang.Object r3 = r2.A0F()
            if (r3 != r5) goto L2d
            return r5
        L74:
            X.BTm r6 = new X.BTm
            r6.<init>(r7, r9, r3)
            goto L18
        L7a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L7f:
            X.Hwg.A00(r3)
            return r3
        L83:
            java.lang.String r0 = "Unknown font type: "
            java.lang.String r0 = X.AnonymousClass007.A0a(r0, r8)
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AndroidFontLoader.A4y(X.B9B, X.HtJ):java.lang.Object");
    }

    @Override // X.B98
    public final /* bridge */ /* synthetic */ Typeface APi(B9B b9b) {
        if (b9b instanceof B06) {
            B06 b06 = (B06) b9b;
            return b06.typefaceLoader.loadBlocking(this.A00, b06);
        }
        if (!(b9b instanceof B09)) {
            return null;
        }
        B09 b09 = (B09) b9b;
        Context context = this.A00;
        Typeface typefaceA00 = CMG.A00(context, b09.A00);
        C7384Etj.A0X(typefaceA00);
        return B0C.A00(context, typefaceA00, b09.A01);
    }

    public AndroidFontLoader(Context context) {
        this.A00 = context.getApplicationContext();
    }
}
