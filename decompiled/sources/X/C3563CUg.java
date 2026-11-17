package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;

/* renamed from: X.CUg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3563CUg {
    public static C3563CUg A02;
    public static final SimpleDateFormat A03 = new SimpleDateFormat("dd/MM/yyyy z");
    public final SharedPreferences A00;
    public final SharedPreferences A01;

    public C3563CUg(Context context) {
        this.A01 = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.A00 = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }
}
