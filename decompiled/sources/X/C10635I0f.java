package X;

import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import java.util.Comparator;
import java.util.Map;

/* renamed from: X.I0f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10635I0f implements Comparator {
    public final int $t;
    public final Object A00;

    public C10635I0f(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Object objInvoke;
        G0V g0v;
        switch (this.$t) {
            case 0:
                throw new NullPointerException("id");
            case 1:
            case 2:
            case 4:
            default:
                g0v = (G0V) this.A00;
                Map<Integer, String> map = C9048FxW.A0D;
                break;
            case 3:
                g0v = (G0V) this.A00;
                Map<Integer, String> map2 = C9003Fwg.A09;
                break;
            case 5:
                Number number = (Number) obj;
                Number number2 = (Number) obj2;
                int[] iArr = (int[]) this.A00;
                C7384Etj.A0X(number);
                int i = iArr[number.intValue()];
                C7384Etj.A0X(number2);
                return C7384Etj.A00(i, iArr[number2.intValue()]);
            case 6:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                ViewGroup viewGroup = (ViewGroup) this.A00;
                return Integer.valueOf(viewGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(viewGroup.indexOfChild(materialButton2)));
            case 7:
                objInvoke = ((G0V) this.A00).invoke(obj, obj2);
                return AnonymousClass001.A0F(objInvoke);
        }
        objInvoke = ((C8630Fhh) g0v).invoke(obj, obj2);
        return AnonymousClass001.A0F(objInvoke);
    }
}
