package X;

import android.content.ContentResolver;
import android.content.Context;

/* loaded from: classes5.dex */
public final class CNH {
    public final Context A00;
    public final CNJ A01;
    public final CNQ A02;
    public final CNO A03;
    public final CNS A04;

    public CNH(Context context, CNQ cnq, CNO cno) {
        ContentResolver contentResolver = context.getContentResolver();
        CNN cnn = new CNN(cno);
        CNP cnp = new CNP();
        cnp.A00 = cnn;
        CNJ cnj = new CNJ(contentResolver, cnp);
        CNS cns = new CNS(cno);
        this.A02 = cnq;
        this.A00 = context;
        this.A04 = cns;
        this.A01 = cnj;
        this.A03 = cno;
    }
}
