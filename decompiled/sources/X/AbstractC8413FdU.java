package X;

/* renamed from: X.FdU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8413FdU extends AbstractC8417FdZ {
    public int A00;
    public int A01;
    public String A02;
    public C8411FdS[] A03;

    public AbstractC8413FdU() {
        this.A03 = null;
        this.A01 = 0;
    }

    public C8411FdS[] getPathData() {
        return this.A03;
    }

    public String getPathName() {
        return this.A02;
    }

    public void setPathData(C8411FdS[] c8411FdSArr) {
        int length;
        int length2;
        C8411FdS[] c8411FdSArr2 = this.A03;
        if (c8411FdSArr2 != null && c8411FdSArr != null && (length = c8411FdSArr2.length) == (length2 = c8411FdSArr.length)) {
            for (int i = 0; i < length; i++) {
                if (c8411FdSArr2[i].A00 == c8411FdSArr[i].A00 && c8411FdSArr2[i].A01.length == c8411FdSArr[i].A01.length) {
                }
            }
            for (int i2 = 0; i2 < length2; i2++) {
                c8411FdSArr2[i2].A00 = c8411FdSArr[i2].A00;
                for (int i3 = 0; i3 < c8411FdSArr[i2].A01.length; i3++) {
                    c8411FdSArr2[i2].A01[i3] = c8411FdSArr[i2].A01[i3];
                }
            }
            return;
        }
        int length3 = c8411FdSArr.length;
        C8411FdS[] c8411FdSArr3 = new C8411FdS[length3];
        for (int i4 = 0; i4 < length3; i4++) {
            c8411FdSArr3[i4] = new C8411FdS(c8411FdSArr[i4]);
        }
        this.A03 = c8411FdSArr3;
    }

    public AbstractC8413FdU(AbstractC8413FdU abstractC8413FdU) {
        this.A03 = null;
        this.A01 = 0;
        this.A02 = abstractC8413FdU.A02;
        this.A00 = abstractC8413FdU.A00;
        C8411FdS[] c8411FdSArr = abstractC8413FdU.A03;
        int length = c8411FdSArr.length;
        C8411FdS[] c8411FdSArr2 = new C8411FdS[length];
        for (int i = 0; i < length; i++) {
            c8411FdSArr2[i] = new C8411FdS(c8411FdSArr[i]);
        }
        this.A03 = c8411FdSArr2;
    }
}
