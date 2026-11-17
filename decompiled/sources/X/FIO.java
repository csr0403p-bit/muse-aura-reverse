package X;

import com.facebook.flexlayout.layoutoutput.LayoutOutput;

/* loaded from: classes6.dex */
public final class FIO<MountContent> implements InterfaceC7823FGe {
    public final Integer[] A00;
    public final LayoutOutput<InterfaceC7823FGe> A01;
    public final FGT<MountContent> A02;

    @Override // X.InterfaceC7823FGe
    public final InterfaceC7823FGe ADY(int i) {
        LayoutOutput<InterfaceC7823FGe> layoutOutput = this.A01;
        Integer[] numArr = this.A00;
        if (numArr != null && numArr.length > i) {
            i = numArr[i].intValue();
        }
        Object obj = layoutOutput.measureResults[i];
        C7384Etj.A0U(obj);
        return (InterfaceC7823FGe) obj;
    }

    @Override // X.InterfaceC7823FGe
    public final int ADd() {
        return this.A01.measureResults.length;
    }

    @Override // X.InterfaceC7823FGe
    public final Object AGy() {
        return null;
    }

    @Override // X.InterfaceC7823FGe
    public final int AIO() {
        return 0;
    }

    @Override // X.InterfaceC7823FGe
    public final int AIP() {
        return 0;
    }

    @Override // X.InterfaceC7823FGe
    public final int AIQ() {
        return 0;
    }

    @Override // X.InterfaceC7823FGe
    public final int AIR() {
        return 0;
    }

    @Override // X.InterfaceC7823FGe
    public final FGT<MountContent> AJY() {
        return this.A02;
    }

    @Override // X.InterfaceC7823FGe
    public final int AMu(int i) {
        LayoutOutput<InterfaceC7823FGe> layoutOutput = this.A01;
        Integer[] numArr = this.A00;
        if (numArr != null && numArr.length > i) {
            i = numArr[i].intValue();
        }
        return (int) layoutOutput.arr[AbstractC7611F5y.A05(i)];
    }

    @Override // X.InterfaceC7823FGe
    public final int AMv(int i) {
        LayoutOutput<InterfaceC7823FGe> layoutOutput = this.A01;
        Integer[] numArr = this.A00;
        if (numArr != null && numArr.length > i) {
            i = numArr[i].intValue();
        }
        return (int) layoutOutput.arr[AbstractC7611F5y.A05(i) + 1];
    }

    @Override // X.InterfaceC7823FGe
    public final int getHeight() {
        return (int) this.A01.arr[1];
    }

    @Override // X.InterfaceC7823FGe
    public final int getWidth() {
        return (int) this.A01.arr[0];
    }

    public FIO(LayoutOutput<InterfaceC7823FGe> layoutOutput, FGT<MountContent> fgt, Integer[] numArr) {
        this.A01 = layoutOutput;
        this.A02 = fgt;
        this.A00 = numArr;
    }
}
