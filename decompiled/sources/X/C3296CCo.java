package X;

import com.facebook.aura.ageverification.FaceDetectionModuleKt;
import java.io.File;

/* renamed from: X.CCo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3296CCo extends AbstractC3297CCr {
    public final File A00;
    public final String A01;

    public C3296CCo(File file, String str, String str2) {
        super(str, str2);
        this.A00 = file;
        String str3 = File.separator;
        this.A01 = FGI.A0h("assets", str3, FaceDetectionModuleKt.FACE_DETECTION_MODULE, str3, str);
    }
}
