package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.Ej8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7239Ej8 implements Ej6 {
    public final List<Ej6> A00 = C60O.A11(2);

    @Override // X.Ej6
    public final void onFailure(long j, Drawable drawable, Throwable th) {
        List<Ej6> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.get(i).onFailure(j, drawable, th);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // X.Ej6
    public final void onFinalImageSet(long j, int i, C2eL c2eL, Drawable drawable) {
        List<Ej6> list = this.A00;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                list.get(i2).onFinalImageSet(j, i, c2eL, drawable);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // X.Ej6
    public final void onIntermediateImageFailed(long j, Throwable th) {
        List<Ej6> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.get(i).onIntermediateImageFailed(j, th);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // X.Ej6
    public final void onIntermediateImageSet(long j, C2eL c2eL) {
        List<Ej6> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.get(i).onIntermediateImageSet(j, c2eL);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // X.Ej6
    public final void onPlaceholderSet(long j, Drawable drawable) {
        List<Ej6> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.get(i).onPlaceholderSet(j, drawable);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // X.Ej6
    public final void onRelease(long j) {
        List<Ej6> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.get(i).onRelease(j);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // X.Ej6
    public final void onSubmit(long j, Object obj) {
        List<Ej6> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.get(i).onSubmit(j, obj);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // X.InterfaceC7256Ejf
    public final /* bridge */ /* synthetic */ void onImageDrawn(String str, C2eL c2eL, F0N f0n) {
        AnonymousClass005.A0x(str, c2eL, f0n);
        List<Ej6> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.get(i).onImageDrawn(str, c2eL, f0n);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }
}
