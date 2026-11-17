package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: X.EYc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6742EYc<T extends Date> extends AbstractC6735EXt<T> {
    public static final EYY A02 = new F4J(1);
    public final AbstractC6745EYf<T> A00;
    public final List<DateFormat> A01;

    public C6742EYc(AbstractC6745EYf abstractC6745EYf) {
        ArrayList arrayListA0h = C3cG.A0h();
        this.A01 = arrayListA0h;
        this.A00 = abstractC6745EYf;
        Locale locale = Locale.US;
        arrayListA0h.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayListA0h.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (AbstractC7405Euj.A00 >= 9) {
            arrayListA0h.add(new SimpleDateFormat(FGI.A0U("MMM d, yyyy", InviteCodeScratcherKt.CODE_SEPARATOR, "h:mm:ss a"), locale));
        }
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) C8j4.A0p(this.A01);
        boolean z = dateFormat instanceof SimpleDateFormat;
        StringBuilder sbA0x = C60O.A0x("DefaultDateTypeAdapter(");
        sbA0x.append(z ? ((SimpleDateFormat) dateFormat).toPattern() : C3cI.A0Y(dateFormat));
        return C8j3.A16(sbA0x, ')');
    }

    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ void write(C6733EXr c6733EXr, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c6733EXr.A0B();
            return;
        }
        List<DateFormat> list = this.A01;
        DateFormat dateFormat = (DateFormat) C8j4.A0p(list);
        synchronized (list) {
            str = dateFormat.format(date);
        }
        c6733EXr.A0H(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0122 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x01d7, ParseException -> 0x020f, TryCatch #3 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01d7, blocks: (B:22:0x004a, B:24:0x005c, B:25:0x005e, B:27:0x006a, B:28:0x006c, B:30:0x007c, B:32:0x0082, B:36:0x009e, B:38:0x00ae, B:39:0x00b0, B:41:0x00bc, B:42:0x00be, B:44:0x00c4, B:48:0x00ce, B:53:0x00de, B:55:0x00e6, B:57:0x00ec, B:61:0x00f8, B:63:0x00fc, B:67:0x010e, B:73:0x011c, B:75:0x0122, B:77:0x0128, B:78:0x012c, B:82:0x0166, B:96:0x01d2, B:84:0x017a, B:86:0x0185, B:87:0x018b, B:89:0x0198, B:91:0x01a0, B:93:0x01b4, B:95:0x01c2, B:97:0x01d3, B:83:0x0173, B:68:0x0111), top: B:116:0x004a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x01d7, ParseException -> 0x020f, TryCatch #3 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01d7, blocks: (B:22:0x004a, B:24:0x005c, B:25:0x005e, B:27:0x006a, B:28:0x006c, B:30:0x007c, B:32:0x0082, B:36:0x009e, B:38:0x00ae, B:39:0x00b0, B:41:0x00bc, B:42:0x00be, B:44:0x00c4, B:48:0x00ce, B:53:0x00de, B:55:0x00e6, B:57:0x00ec, B:61:0x00f8, B:63:0x00fc, B:67:0x010e, B:73:0x011c, B:75:0x0122, B:77:0x0128, B:78:0x012c, B:82:0x0166, B:96:0x01d2, B:84:0x017a, B:86:0x0185, B:87:0x018b, B:89:0x0198, B:91:0x01a0, B:93:0x01b4, B:95:0x01c2, B:97:0x01d3, B:83:0x0173, B:68:0x0111), top: B:116:0x004a, outer: #0 }] */
    @Override // X.AbstractC6735EXt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object read(X.EY1 r22) throws com.google.gson.stream.MalformedJsonException, java.text.ParseException {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6742EYc.read(X.EY1):java.lang.Object");
    }
}
