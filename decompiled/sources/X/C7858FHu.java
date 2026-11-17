package X;

import android.content.Context;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import com.instagram.common.bloks.lexer.ParsingException;

/* renamed from: X.FHu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7858FHu implements F6U {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FDW A01;
    public final /* synthetic */ FDW A02;
    public final /* synthetic */ HsM A03;
    public final /* synthetic */ InterfaceC10557Hsn A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    public C7858FHu(Context context, FDW fdw, FDW fdw2, HsM hsM, InterfaceC10557Hsn interfaceC10557Hsn, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.A04 = interfaceC10557Hsn;
        this.A02 = fdw;
        this.A06 = str;
        this.A00 = context;
        this.A07 = str2;
        this.A08 = str3;
        this.A05 = str4;
        this.A09 = str5;
        this.A0A = z;
        this.A0B = z2;
        this.A03 = hsM;
        this.A01 = fdw2;
    }

    @Override // X.F6U
    public final void A4a(Layout layout, Spannable spannable, FJF fjf, int i, int i2) {
        boolean zA1b = AnonymousClass004.A1b(fjf, spannable);
        InterfaceC10557Hsn interfaceC10557Hsn = this.A04;
        FDW fdw = this.A02;
        String str = this.A06;
        int i3 = fjf.A01;
        int i4 = fjf.A00;
        FHm.A0E(spannable, fdw, interfaceC10557Hsn, str, i3, i4);
        Context context = this.A00;
        String str2 = this.A07;
        String str3 = this.A08;
        if (str2 == null || str3 == null) {
            FHm.A0B(context, spannable, str2, i3, i4);
        } else {
            String strA03 = FHm.A01.A03(str2, "");
            if (strA03.length() != str2.length()) {
                FFI.A01(null, "Only specify a size value for text_size if also specifying the text_size_unit property.", null);
            }
            try {
                spannable.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(HiY.A07(str3), Float.parseFloat(strA03), C60Q.A0B(context))), i3, i4, zA1b ? 1 : 0);
            } catch (ParsingException | NumberFormatException e) {
                FFI.A04(e);
            }
        }
        FHm.A0C(context, spannable, this.A05, this.A09, i3, i4);
        if (this.A0A) {
            spannable.setSpan(new StrikethroughSpan(), i3, i4, zA1b ? 1 : 0);
        }
        if (this.A0B) {
            spannable.setSpan(new UnderlineSpan(), i3, i4, zA1b ? 1 : 0);
        }
        HsM hsM = this.A03;
        if (hsM != null) {
            FDW fdw2 = this.A01;
            spannable.setSpan(new C7886FJe(fdw2, fdw2, hsM, null, null, zA1b), i3, i4, 33);
        }
    }
}
