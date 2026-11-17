package X;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.CSb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3522CSb implements Runnable {
    public static final String __redex_internal_original_name = "zzo";
    public final /* synthetic */ CSA A00;
    public final /* synthetic */ CST A01;

    public RunnableC3522CSb(CSA csa, CST cst) {
        this.A01 = cst;
        this.A00 = csa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            CST cst = this.A01;
            InterfaceC3521CSa interfaceC3521CSa = cst.A00;
            Object objA08 = this.A00.A08();
            C3523CSc c3523CSc = (C3523CSc) interfaceC3521CSa;
            FirebaseInstanceId firebaseInstanceId = c3523CSc.A00;
            String str = c3523CSc.A01;
            String str2 = (String) objA08;
            C3536CSs c3536CSs = FirebaseInstanceId.A08;
            String strA05 = firebaseInstanceId.A04.A05();
            synchronized (c3536CSs) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    JSONObject jSONObjectA18 = BV4.A18();
                    jSONObjectA18.put("token", str2);
                    jSONObjectA18.put("appVersion", strA05);
                    jSONObjectA18.put("timestamp", jCurrentTimeMillis);
                    String string = jSONObjectA18.toString();
                    if (string != null) {
                        SharedPreferences.Editor editorEdit = c3536CSs.A01.edit();
                        StringBuilder sbA0r = BV5.A0r("*", BV5.A04("") + 4 + BV5.A04(str));
                        sbA0r.append("");
                        sbA0r.append("|T|");
                        sbA0r.append(str);
                        editorEdit.putString(C60P.A1M("|", "*", sbA0r), string);
                        editorEdit.commit();
                    }
                } catch (JSONException e) {
                    String strValueOf = String.valueOf(e);
                    Log.w("FirebaseInstanceId", C60P.A1M("Failed to encode token: ", strValueOf, BV4.A0p(BV5.A04(strValueOf) + 24)));
                }
            }
            CSC cscA02 = CSC.A02(new C3526CSf(str2));
            Executor executor = AbstractC3097ByB.A01;
            cscA02.A06(cst, executor);
            cscA02.A0A(cst, executor);
            CSA.A00(new CSN(cst, executor), cscA02);
        } catch (RuntimeExecutionException e2) {
            e = e2;
            boolean z = e.getCause() instanceof Exception;
            CST cst2 = this.A01;
            if (z) {
                e = (Exception) e.getCause();
            }
            cst2.onFailure(e);
        } catch (CancellationException unused) {
            this.A01.AS6();
        } catch (Exception e3) {
            this.A01.onFailure(e3);
        }
    }
}
