package X;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes5.dex */
public final class EFS extends AbstractC10584Hwp {
    public boolean A00 = true;
    public final TextView A01;
    public final EBg A02;

    private final void A00() {
        TransformationMethod eBj;
        TextView textView = this.A01;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.A00) {
            if (!(transformationMethod instanceof EBj) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                eBj = new EBj(transformationMethod);
            }
            textView.setTransformationMethod(transformationMethod);
        }
        eBj = transformationMethod;
        if (transformationMethod instanceof EBj) {
            eBj = ((EBj) eBj).A00;
        }
        transformationMethod = eBj;
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // X.AbstractC10584Hwp
    public final void A01(boolean z) {
        if (z) {
            A00();
        }
    }

    @Override // X.AbstractC10584Hwp
    public final void A02(boolean z) {
        this.A00 = z;
        A00();
        TextView textView = this.A01;
        textView.setFilters(A03(textView.getFilters()));
    }

    @Override // X.AbstractC10584Hwp
    public final InputFilter[] A03(InputFilter[] inputFilterArr) {
        int length;
        if (this.A00) {
            int length2 = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter != this.A02) {
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[length2 + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length2);
            inputFilterArr2[length2] = this.A02;
            return inputFilterArr2;
        }
        SparseArray sparseArray = new SparseArray(1);
        int i = 0;
        while (true) {
            length = inputFilterArr.length;
            if (i >= length) {
                break;
            }
            InputFilter inputFilter2 = inputFilterArr[i];
            if (inputFilter2 instanceof EBg) {
                sparseArray.put(i, inputFilter2);
            }
            i++;
        }
        if (sparseArray.size() != 0) {
            InputFilter[] inputFilterArr3 = new InputFilter[length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr3[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr3;
        }
        return inputFilterArr;
    }

    public EFS(TextView textView) {
        this.A01 = textView;
        this.A02 = new EBg(textView);
    }
}
