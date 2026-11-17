package X;

import android.graphics.Rect;
import android.media.Image;

/* renamed from: X.Bno, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2881Bno implements InterfaceC2873Bng {
    public final Image A00;
    public final InterfaceC2886Bnt A01;
    public final C2887Bnv[] A02;

    @Override // X.InterfaceC2873Bng
    public final Rect AEC() {
        return this.A00.getCropRect();
    }

    @Override // X.InterfaceC2873Bng
    public final int AFp() {
        return this.A00.getFormat();
    }

    @Override // X.InterfaceC2873Bng
    public final Image AGI() {
        return this.A00;
    }

    @Override // X.InterfaceC2873Bng
    public final InterfaceC2886Bnt AGK() {
        return this.A01;
    }

    @Override // X.InterfaceC2873Bng
    public final Bo0[] AIj() {
        return this.A02;
    }

    @Override // X.InterfaceC2873Bng, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    @Override // X.InterfaceC2873Bng
    public final int getHeight() {
        return this.A00.getHeight();
    }

    @Override // X.InterfaceC2873Bng
    public final int getWidth() {
        return this.A00.getWidth();
    }

    public C2881Bno(Image image) {
        this.A00 = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            int length = planes.length;
            C2887Bnv[] c2887BnvArr = new C2887Bnv[length];
            this.A02 = c2887BnvArr;
            for (int i = 0; i < length; i++) {
                c2887BnvArr[i] = new C2887Bnv(planes[i]);
            }
        } else {
            this.A02 = new C2887Bnv[0];
        }
        this.A01 = new C2871Bne(BV4.A08(), BhZ.A01, 0, image.getTimestamp());
    }
}
