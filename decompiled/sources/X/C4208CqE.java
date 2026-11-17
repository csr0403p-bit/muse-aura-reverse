package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.CqE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4208CqE {
    public int A00;
    public final float A01;
    public final float A02;
    public final Rect A03;
    public final SparseArray A04 = BV4.A0B();
    public final SparseArray A05 = BV4.A0B();
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;

    public static boolean A00(int i) {
        return i == 0 || i == 1 || i == 7 || i == 3 || i == 9 || i == 4 || i == 10 || i == 5 || i == 11 || i == 6;
    }

    public final String toString() {
        C4388Cuo c4388Cuo = new C4388Cuo();
        Rect rect = this.A03;
        C4388Cuo c4388Cuo2 = new C4388Cuo();
        c4388Cuo.A00 = c4388Cuo2;
        c4388Cuo2.A01 = rect;
        c4388Cuo2.A02 = "boundingBox";
        C4442Cw9 c4442Cw9A00 = C4442Cw9.A00(C4442Cw9.A00(C4442Cw9.A00(C4442Cw9.A00(C4442Cw9.A00(C4442Cw9.A00(C4442Cw9.A00(c4388Cuo2, String.valueOf(this.A00), "trackingId"), String.valueOf(this.A06), "rightEyeOpenProbability"), String.valueOf(this.A07), "leftEyeOpenProbability"), String.valueOf(this.A08), "smileProbability"), String.valueOf(this.A01), "eulerX"), String.valueOf(this.A02), "eulerY"), String.valueOf(this.A09), "eulerZ");
        C4388Cuo c4388Cuo3 = new C4388Cuo();
        C4388Cuo c4388Cuo4 = c4388Cuo3;
        int i = 0;
        do {
            if (A00(i)) {
                String strA0H = FGI.A0H("landmark_", i);
                Object obj = this.A04.get(i);
                C4388Cuo c4388Cuo5 = new C4388Cuo();
                c4388Cuo4.A00 = c4388Cuo5;
                c4388Cuo4 = c4388Cuo5;
                c4388Cuo5.A01 = obj;
                c4388Cuo5.A02 = strA0H;
            }
            i++;
        } while (i <= 11);
        String strA00 = AbstractC4210CqI.A00(c4388Cuo3, "Landmarks");
        C4388Cuo c4388Cuo6 = new C4388Cuo();
        c4442Cw9A00.A00 = c4388Cuo6;
        c4388Cuo6.A01 = strA00;
        c4388Cuo6.A02 = "landmarks";
        C4388Cuo c4388Cuo7 = new C4388Cuo();
        C4388Cuo c4388Cuo8 = c4388Cuo7;
        int i2 = 1;
        do {
            String strA0H2 = FGI.A0H("Contour_", i2);
            Object obj2 = this.A05.get(i2);
            C4388Cuo c4388Cuo9 = new C4388Cuo();
            c4388Cuo8.A00 = c4388Cuo9;
            c4388Cuo8 = c4388Cuo9;
            c4388Cuo9.A01 = obj2;
            c4388Cuo9.A02 = strA0H2;
            i2++;
        } while (i2 <= 15);
        String strA002 = AbstractC4210CqI.A00(c4388Cuo7, "Contours");
        C4388Cuo c4388Cuo10 = new C4388Cuo();
        c4388Cuo6.A00 = c4388Cuo10;
        c4388Cuo10.A01 = strA002;
        c4388Cuo10.A02 = "contours";
        return AbstractC4210CqI.A00(c4388Cuo, "Face");
    }

    public C4208CqE(zzf zzfVar) {
        float f = zzfVar.A00;
        float f2 = zzfVar.A02 / 2.0f;
        float f3 = zzfVar.A01;
        float f4 = zzfVar.A03 / 2.0f;
        this.A03 = new Rect((int) (f - f2), (int) (f3 - f4), (int) (f + f2), (int) (f3 + f4));
        this.A00 = zzfVar.A0C;
        for (zzn zznVar : zzfVar.A0E) {
            if (A00(zznVar.A03)) {
                PointF pointF = new PointF(zznVar.A00, zznVar.A01);
                SparseArray sparseArray = this.A04;
                int i = zznVar.A03;
                sparseArray.put(i, new C4254CrR(pointF, i));
            }
        }
        for (zzd zzdVar : zzfVar.A0D) {
            int i2 = zzdVar.A00;
            if (i2 <= 15 && i2 > 0) {
                PointF[] pointFArr = zzdVar.A01;
                pointFArr.getClass();
                long length = pointFArr.length + 5 + (r8 / 10);
                ArrayList arrayListA11 = C60O.A11(length > 2147483647L ? Integer.MAX_VALUE : (int) length);
                Collections.addAll(arrayListA11, pointFArr);
                this.A05.put(i2, new C4235Cqw(i2, arrayListA11));
            }
        }
        this.A01 = zzfVar.A06;
        this.A02 = zzfVar.A04;
        this.A09 = zzfVar.A05;
        this.A08 = zzfVar.A09;
        this.A07 = zzfVar.A07;
        this.A06 = zzfVar.A08;
    }

    public C4208CqE(zzow zzowVar) {
        this.A03 = zzowVar.A07;
        this.A00 = zzowVar.A06;
        for (zzpc zzpcVar : zzowVar.A08) {
            int i = zzpcVar.A00;
            if (A00(i)) {
                this.A04.put(i, new C4254CrR(zzpcVar.A01, i));
            }
        }
        for (zzos zzosVar : zzowVar.A09) {
            int i2 = zzosVar.A00;
            if (i2 <= 15 && i2 > 0) {
                List list = zzosVar.A01;
                list.getClass();
                this.A05.put(i2, new C4235Cqw(i2, BV4.A0t(list)));
            }
        }
        this.A01 = zzowVar.A02;
        this.A02 = zzowVar.A01;
        this.A09 = -zzowVar.A00;
        this.A08 = zzowVar.A05;
        this.A07 = zzowVar.A03;
        this.A06 = zzowVar.A04;
    }
}
