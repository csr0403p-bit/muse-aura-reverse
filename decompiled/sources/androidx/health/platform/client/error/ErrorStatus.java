package androidx.health.platform.client.error;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3cG;
import X.C5322DgG;
import X.C60Q;
import X.C7384Etj;
import X.C7580F4t;
import X.C9185Fzs;
import X.EWq;
import X.F0C;
import X.GF5;
import X.GF8;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class ErrorStatus extends ProtoParcelable<C9185Fzs> {
    public static final Parcelable.Creator<ErrorStatus> CREATOR = new C7580F4t(1);
    public final int A00;
    public final String A01;
    public final F0C A02 = C5322DgG.A01((Function0) new EWq(this, 1));

    public static final ErrorStatus A00(String str, int i) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object obj;
        Field[] declaredFields = ErrorCode.class.getDeclaredFields();
        C7384Etj.A0U(declaredFields);
        ArrayList arrayListA0h = C3cG.A0h();
        for (Field field : declaredFields) {
            if (field.getType().isAssignableFrom(Integer.TYPE)) {
                arrayListA0h.add(field);
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            iIntValue = ErrorCode.INTERNAL_ERROR;
            obj = null;
            if (!zHasNext) {
                break;
            }
            try {
                Object obj2 = ((Field) it.next()).get(null);
                C7384Etj.A0Z(obj2, AnonymousClass000.A00(0));
                iIntValue = ((Number) obj2).intValue();
            } catch (IllegalAccessException unused) {
            }
            C60Q.A1P(arrayListA0i, iIntValue);
        }
        Iterator it2 = arrayListA0i.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (AnonymousClass001.A0F(next) == i) {
                obj = next;
                break;
            }
        }
        Number number = (Number) obj;
        if (number != null) {
            iIntValue = number.intValue();
        }
        return new ErrorStatus(iIntValue, str);
    }

    @Override // X.HoU
    public final /* bridge */ /* synthetic */ GF8 A01() {
        return (GF5) C7384Etj.A0G(this.A02);
    }

    public ErrorStatus(@ErrorCode int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
