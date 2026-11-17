package X;

import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BWS {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BWS[] A01;
    public static final BWS A02;
    public final int code;
    public final String suffix;

    static {
        BWS bws = new BWS(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0, 0, "");
        A02 = bws;
        BWS[] bwsArr = {bws, new BWS("GLFRAMEBUFFER_COPY", 1, 1, ",glframebuffer_copy"), new BWS("GLFRAMEBUFFER_LANCZOS3", 2, 2, ",glframebuffer_lanczos3"), new BWS("GLFRAMEBUFFER_SEPARABLE_LANCZOS3", 3, 3, ",glframebuffer_separable_lanczos3"), new BWS("GLFRAMEBUFFER_UNSHARP_MASK", 4, 4, ",glframebuffer_unsharp_mask"), new BWS("GLSURFACEVIEW_COPY", 5, 5, ",glsurfaceview_copy"), new BWS("GLSURFACEVIEW_LANCZOS", 6, 6, ",glsurfaceview_lanczos"), new BWS("GLFRAMEBUFFER_DALTONIZE", 7, 7, ",glframebuffer_daltonize"), new BWS("GLFRAMEBUFFER_BILINEAR_LANCZOS3", 8, 8, ",glframebuffer_bilinear_lanczos3"), new BWS("GLFRAMEBUFFER_CATMULL_ROM", 9, 9, ",glframebuffer_catmull_rom"), new BWS("GLFRAMEBUFFER_INVERSE_TONEMAP", 10, 10, ",glframebuffer_inverse_tonemap"), new BWS("GLFRAMEBUFFER_NPU_SR", 11, 11, ",glframebuffer_npu_sr"), new BWS("DIRECT_SURFACEVIEW_COPY", 12, 12, ",direct_surfaceview_copy"), new BWS("DIRECT_SURFACEVIEW_LANCZOS3", 13, 13, ",direct_surfaceview_lanczos3"), new BWS("DIRECT_SURFACEVIEW_INVERSE_TONEMAP", 14, 14, ",direct_surfaceview_inverse_tonemap"), new BWS("DIRECT_SURFACEVIEW_NPU_SR", 15, 15, ",direct_surfaceview_npu_sr")};
        A01 = bwsArr;
        A00 = C3cG.A0w(bwsArr);
    }

    public static BWS valueOf(String str) {
        return (BWS) Enum.valueOf(BWS.class, str);
    }

    public static BWS[] values() {
        return (BWS[]) A01.clone();
    }

    public BWS(String str, int i, int i2, String str2) {
        this.code = i2;
        this.suffix = str2;
    }
}
