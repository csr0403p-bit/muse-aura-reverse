package X;

/* renamed from: X.CcP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC3668CcP implements InterfaceC4521Cxx {
    UNKNOWN_FORMAT(0),
    /* JADX INFO: Fake field, exist only in values array */
    NV16(1),
    NV21(2),
    /* JADX INFO: Fake field, exist only in values array */
    YV12(3),
    YUV_420_888(7),
    /* JADX INFO: Fake field, exist only in values array */
    JPEG(8),
    BITMAP(4),
    /* JADX INFO: Fake field, exist only in values array */
    CM_SAMPLE_BUFFER_REF(5),
    /* JADX INFO: Fake field, exist only in values array */
    UI_IMAGE(6),
    /* JADX INFO: Fake field, exist only in values array */
    CV_PIXEL_BUFFER_REF(9);

    public final int zzl;

    @Override // X.InterfaceC4521Cxx
    public final int AjA() {
        return this.zzl;
    }

    EnumC3668CcP(int i) {
        this.zzl = i;
    }
}
